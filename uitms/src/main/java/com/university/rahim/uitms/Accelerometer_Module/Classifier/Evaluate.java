package com.university.rahim.uitms.Accelerometer_Module.Classifier;

import java.lang.reflect.Field;

/**
 * This class allows a basic evaluation of a classifier's performance
 * 
 * @author Martin Pielot
 * @version June 30, 2015
 */
public class Evaluate {

	/**
	 * Run an evaluation of the given classifier with the given test-data set. The method uses Java reflection to
	 * populate the fields of the Random Forest implementation with the data from the input CSV file. You have to make
	 * sure that for each entry in the CSV file there is a field in the Random Forest implementation. If the Random
	 * Forest class has been generated from the CSV file, it should work without problem.
	 * 
	 * @param rf the Random Forest classifier to be tested
	 * @param testData the test data set in .csv format
	 * @throws Exception
	 */
	public static String evalClassifier(RandomForest rf, double[] testData) throws Exception {

		//BufferedReader reader = new BufferedReader(new FileReader(testData));

		// Read and store the names of the features
		//String headerLine = reader.readLine();
		String[] featureNames = {"X1","X2","X3","X4","X5","X6","X7","X8","X9","X10","X11","X12","X13","X14","X15","X16","X17","X18","X19","X20","X21","X22","X23","X24","X25","X26","X27","X28","X29","X30","X31","X32"
				,"Y1","Y2","Y3","Y4","Y5","Y6","Y7","Y8","Y9","Y10","Y11","Y12","Y13","Y14","Y15","Y16","Y17","Y18","Y19","Y20","Y21","Y22","Y23","Y24","Y25","Y26","Y27","Y28","Y29","Y30","Y31","Y32"
				,"Z1","Z2","Z3","Z4","Z5","Z6","Z7","Z8","Z9","Z10","Z11","Z12","Z13","Z14","Z15","Z16","Z17","Z18","Z19","Z20","Z21","Z22","Z23","Z24","Z25","Z26","Z27","Z28","Z29","Z30","Z31","Z32"};

		//String line = null;
		int numTotal = 0;
		int numCorrect = 0;
		boolean correct = false;

		String[] featureValues =  new String[96];
		
		for(int i=0; i<96; i++)
			 featureValues[i] = String.valueOf(testData[i]);

		// Populate the fields of the classifier from the CSV data via reflection
		setFields(rf, featureNames, featureValues);

		// Run the classifier
		return classifyInstance(rf);
		

		// Compute TOTAL accuracy (but only keep for digits after comma)
		/*int accInt = 10000 * numCorrect / numTotal;
		double acc = accInt / 10000.0;
		System.out.println("final accuracy: " + acc);*/
	}

	/**
	 * This method uses Java reflection to populate the fields of the Random Forest implementation from the two given
	 * String-Arrays, where one array contains the field names and the other the values.
	 * 
	 * @param rf Random Forest implementation
	 * @param featureNames array with names of the features
	 * @param featureValues array with values of the features - in same order as #featureNames
	 */
	private static void setFields(RandomForest rf, String[] featureNames, String[] featureValues) {

		String featureName = null;
		String featureValue = null;

		// Iterate through all the pairs of feature names and values
		for (int i = 0; i < featureNames.length; i++) {
            featureName = featureNames[i];
			featureValue = featureValues[i];
			
			//featureName = featureName.substring(1, featureName.length()-1);
			//featureValue = featureValue.substring(1, featureValue.length()-1);

			// If value is not missing
			if (featureValue.length() > 0) {
				try {
					try {
						try {

							// try interpret the feature as numeric value
							if (featureValue.length() > 0) {
								
								double featureValueDouble = Double.parseDouble(featureValue);
								setDoubleField(rf, featureName, featureValueDouble);
							}

						} catch (NumberFormatException e) {

							// in case that fails, try to interpret the feature as String
							setStringField(rf, featureName, featureValue);
						}

					} catch (NoSuchFieldException nsfe) {

						// in case the field is not recognized, this is the ground truth
						rf.MyClass = featureValue;
					}

				} catch (Exception e) {
					System.err.println("featureName: " + featureName + "', featureValue: '" + featureValue + "'");
					e.printStackTrace();
					System.exit(1);
				}
			}
		}
	}

	/**
	 * Runs the classification
	 * 
	 * @param rf Random Forest implementation with populated fields
	 * @return whether the classification was correct
	 */
	private static String classifyInstance(RandomForest rf) {
		String actualClass = rf.MyClass;

		// If actual class is NULL, end with error - this should not happen
		/*if (actualClass == null) {
			System.err.println("NO GROUND TRUTH");
			System.exit(1);
			return "";
		}*/

		// run actual classification
		Prediction p = rf.runClassification();
		String predClass = p.label;

		// compare whether actual and predicted labels match and return result
		//boolean correct = actualClass.equals(predClass);
		return predClass;
	}

	/**
	 * Uses reflection to set a double field to the given value
	 * 
	 * @param rf Random Forest implementation
	 * @param fieldName the name of the specified field
	 * @param value the value that this field shall take
	 * @throws NoSuchFieldException if Random Forest implementation does not contain the specified field
	 */
	private static void setDoubleField(RandomForest rf, String fieldName, double value) throws NoSuchFieldException,
			IllegalAccessException {
		Field field = rf.getClass().getDeclaredField(fieldName);
		field.setDouble(rf, value);
	}

	/**
	 * Uses reflection to set a String field to the given value
	 * 
	 * @param rf Random Forest implementation
	 * @param fieldName the name of the specified field
	 * @param value the value that this field shall take
	 * @throws NoSuchFieldException if Random Forest implementation does not contain the specified field
	 */
	private static void setStringField(RandomForest rf, String fieldName, String value) throws NoSuchFieldException,
			IllegalAccessException {
		Field field = rf.getClass().getDeclaredField(fieldName);
		field.set(rf, value);
	}
	/*
	public static void main() throws Exception {
		RandomForest rf = new ModelRandomForest();

		File testData = new File("test.csv");
		boolean exists = testData.exists();
		System.out.println(testData.getAbsolutePath() + ", exists == " + exists);

		evalClassifier(rf, testData);
	}
	*/

}
