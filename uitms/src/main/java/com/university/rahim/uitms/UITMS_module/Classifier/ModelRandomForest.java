

package com.university.rahim.uitms.UITMS_module.Classifier;

import java.util.List;

public class ModelRandomForest extends RandomForest {

public double Y28;
public double Y29;
public double X29;
public double X28;
public double X25;
public double Y21;
public double Y22;
public double Y23;
public double Y24;
public double Y25;
public double Y26;
public double X22;
public double Z9;
public double X32;
public double X30;
public double X31;
public double Y19;
public double Y18;
public double Y15;
public double Y14;
public double Y17;
public double Y16;
public double Y11;
public double Y10;
public double Y13;
public double Y12;
public double Z7;
public double Y20;
public double X24;
public double X27;
public double X26;
public double X21;
public double X20;
public double Z8;
public double X23;
public double Z4;
public double Z5;
public double Z6;
public double Y27;
public double Z1;
public double Z2;
public double Z3;
public double Z27;
public double Z26;
public double Z25;
public double Z24;
public double Z23;
public double Z22;
public double Z21;
public double Z20;
public double Z29;
public double Z28;
public double Y32;
public double Y31;
public double X13;
public double X8;
public double X9;
public double X2;
public double X3;
public double X1;
public double X6;
public double X7;
public double X4;
public double X5;
public double Z30;
public double Z31;
public double Z32;
public double Z18;
public double Z19;
public double Z16;
public double Z17;
public double Z14;
public double Z15;
public double Z12;
public double Z13;
public double Z10;
public double Z11;
public double X18;
public double X19;
public double X10;
public double X11;
public double X12;
public double Y30;
public double X14;
public double X15;
public double X16;
public double X17;
public double Y9;
public double Y8;
public double Y1;
public double Y3;
public double Y2;
public double Y5;
public double Y4;
public double Y7;
public double Y6;

public String toString() {
StringBuilder b = new StringBuilder();
b.append("MyClass: ");
b.append(MyClass);
b.append(", Y28: ");
b.append(Y28);
b.append(", Y29: ");
b.append(Y29);
b.append(", X29: ");
b.append(X29);
b.append(", X28: ");
b.append(X28);
b.append(", X25: ");
b.append(X25);
b.append(", Y21: ");
b.append(Y21);
b.append(", Y22: ");
b.append(Y22);
b.append(", Y23: ");
b.append(Y23);
b.append(", Y24: ");
b.append(Y24);
b.append(", Y25: ");
b.append(Y25);
b.append(", Y26: ");
b.append(Y26);
b.append(", X22: ");
b.append(X22);
b.append(", Z9: ");
b.append(Z9);
b.append(", X32: ");
b.append(X32);
b.append(", X30: ");
b.append(X30);
b.append(", X31: ");
b.append(X31);
b.append(", Y19: ");
b.append(Y19);
b.append(", Y18: ");
b.append(Y18);
b.append(", Y15: ");
b.append(Y15);
b.append(", Y14: ");
b.append(Y14);
b.append(", Y17: ");
b.append(Y17);
b.append(", Y16: ");
b.append(Y16);
b.append(", Y11: ");
b.append(Y11);
b.append(", Y10: ");
b.append(Y10);
b.append(", Y13: ");
b.append(Y13);
b.append(", Y12: ");
b.append(Y12);
b.append(", Z7: ");
b.append(Z7);
b.append(", Y20: ");
b.append(Y20);
b.append(", X24: ");
b.append(X24);
b.append(", X27: ");
b.append(X27);
b.append(", X26: ");
b.append(X26);
b.append(", X21: ");
b.append(X21);
b.append(", X20: ");
b.append(X20);
b.append(", Z8: ");
b.append(Z8);
b.append(", X23: ");
b.append(X23);
b.append(", Z4: ");
b.append(Z4);
b.append(", Z5: ");
b.append(Z5);
b.append(", Z6: ");
b.append(Z6);
b.append(", Y27: ");
b.append(Y27);
b.append(", Z1: ");
b.append(Z1);
b.append(", Z2: ");
b.append(Z2);
b.append(", Z3: ");
b.append(Z3);
b.append(", Z27: ");
b.append(Z27);
b.append(", Z26: ");
b.append(Z26);
b.append(", Z25: ");
b.append(Z25);
b.append(", Z24: ");
b.append(Z24);
b.append(", Z23: ");
b.append(Z23);
b.append(", Z22: ");
b.append(Z22);
b.append(", Z21: ");
b.append(Z21);
b.append(", Z20: ");
b.append(Z20);
b.append(", Z29: ");
b.append(Z29);
b.append(", Z28: ");
b.append(Z28);
b.append(", Y32: ");
b.append(Y32);
b.append(", Y31: ");
b.append(Y31);
b.append(", X13: ");
b.append(X13);
b.append(", X8: ");
b.append(X8);
b.append(", X9: ");
b.append(X9);
b.append(", X2: ");
b.append(X2);
b.append(", X3: ");
b.append(X3);
b.append(", X1: ");
b.append(X1);
b.append(", X6: ");
b.append(X6);
b.append(", X7: ");
b.append(X7);
b.append(", X4: ");
b.append(X4);
b.append(", X5: ");
b.append(X5);
b.append(", Z30: ");
b.append(Z30);
b.append(", Z31: ");
b.append(Z31);
b.append(", Z32: ");
b.append(Z32);
b.append(", Z18: ");
b.append(Z18);
b.append(", Z19: ");
b.append(Z19);
b.append(", Z16: ");
b.append(Z16);
b.append(", Z17: ");
b.append(Z17);
b.append(", Z14: ");
b.append(Z14);
b.append(", Z15: ");
b.append(Z15);
b.append(", Z12: ");
b.append(Z12);
b.append(", Z13: ");
b.append(Z13);
b.append(", Z10: ");
b.append(Z10);
b.append(", Z11: ");
b.append(Z11);
b.append(", X18: ");
b.append(X18);
b.append(", X19: ");
b.append(X19);
b.append(", X10: ");
b.append(X10);
b.append(", X11: ");
b.append(X11);
b.append(", X12: ");
b.append(X12);
b.append(", Y30: ");
b.append(Y30);
b.append(", X14: ");
b.append(X14);
b.append(", X15: ");
b.append(X15);
b.append(", X16: ");
b.append(X16);
b.append(", X17: ");
b.append(X17);
b.append(", Y9: ");
b.append(Y9);
b.append(", Y8: ");
b.append(Y8);
b.append(", Y1: ");
b.append(Y1);
b.append(", Y3: ");
b.append(Y3);
b.append(", Y2: ");
b.append(Y2);
b.append(", Y5: ");
b.append(Y5);
b.append(", Y4: ");
b.append(Y4);
b.append(", Y7: ");
b.append(Y7);
b.append(", Y6: ");
b.append(Y6);
return b.toString();
}

protected void runClassifiers(List<Prediction> predictions) {
	predictions.add(runTree0());
	predictions.add(runTree1());
	predictions.add(runTree2());
	predictions.add(runTree3());
	predictions.add(runTree4());
	predictions.add(runTree5());
	predictions.add(runTree6());
	predictions.add(runTree7());
	predictions.add(runTree8());
	predictions.add(runTree9());
	predictions.add(runTree10());
	predictions.add(runTree11());
	predictions.add(runTree12());
	predictions.add(runTree13());
	predictions.add(runTree14());
	predictions.add(runTree15());
	predictions.add(runTree16());
	predictions.add(runTree17());
	predictions.add(runTree18());
	predictions.add(runTree19());
	predictions.add(runTree20());
	predictions.add(runTree21());
	predictions.add(runTree22());
	predictions.add(runTree23());
	predictions.add(runTree24());
	predictions.add(runTree25());
	predictions.add(runTree26());
	predictions.add(runTree27());
	predictions.add(runTree28());
	predictions.add(runTree29());
	predictions.add(runTree30());
	predictions.add(runTree31());
	predictions.add(runTree32());
	predictions.add(runTree33());
	predictions.add(runTree34());
	predictions.add(runTree35());
	predictions.add(runTree36());
	predictions.add(runTree37());
	predictions.add(runTree38());
	predictions.add(runTree39());
	predictions.add(runTree40());
	predictions.add(runTree41());
	predictions.add(runTree42());
	predictions.add(runTree43());
	predictions.add(runTree44());
	predictions.add(runTree45());
	predictions.add(runTree46());
	predictions.add(runTree47());
	predictions.add(runTree48());
	predictions.add(runTree49());
	predictions.add(runTree50());
	predictions.add(runTree51());
	predictions.add(runTree52());
	predictions.add(runTree53());
	predictions.add(runTree54());
	predictions.add(runTree55());
	predictions.add(runTree56());
	predictions.add(runTree57());
	predictions.add(runTree58());
	predictions.add(runTree59());
	predictions.add(runTree60());
	predictions.add(runTree61());
	predictions.add(runTree62());
	predictions.add(runTree63());
	predictions.add(runTree64());
	predictions.add(runTree65());
	predictions.add(runTree66());
	predictions.add(runTree67());
	predictions.add(runTree68());
	predictions.add(runTree69());
	predictions.add(runTree70());
	predictions.add(runTree71());
	predictions.add(runTree72());
	predictions.add(runTree73());
	predictions.add(runTree74());
	predictions.add(runTree75());
	predictions.add(runTree76());
	predictions.add(runTree77());
	predictions.add(runTree78());
	predictions.add(runTree79());
	predictions.add(runTree80());
	predictions.add(runTree81());
	predictions.add(runTree82());
	predictions.add(runTree83());
	predictions.add(runTree84());
	predictions.add(runTree85());
	predictions.add(runTree86());
	predictions.add(runTree87());
	predictions.add(runTree88());
	predictions.add(runTree89());
	predictions.add(runTree90());
	predictions.add(runTree91());
	predictions.add(runTree92());
	predictions.add(runTree93());
	predictions.add(runTree94());
	predictions.add(runTree95());
	predictions.add(runTree96());
	predictions.add(runTree97());
	predictions.add(runTree98());
	predictions.add(runTree99());
}

private Prediction runTree0() {
	if( Z19 >= 9.81 ) { 
	if( X15 >= 0.09 ) { 
		if( X29 < 0.12 ) { return new Prediction("Left", 96, 0); }
	if( X29 >= 0.12 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X5 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( X15 < 0.09 ) { 
		if( X6 >= 0.06 ) { return new Prediction("Right", 1, 0); }
		if( X6 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z19 < 9.81 ) { 
	if( Z31 >= 9.78 ) { 
	if( Z14 < 9.88 ) { 
	if( Y19 < -0.12 ) { 
	if( Y27 < -0.11 ) { 
		if( Y18 < -0.09 ) { return new Prediction("Right", 21, 0); }
	if( Y18 >= -0.09 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y27 >= -0.11 ) { 
		if( Y17 < -0.1 ) { return new Prediction("Left", 6, 0); }
		if( Y17 >= -0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( Y19 >= -0.12 ) { return new Prediction("Right", 36, 0); }
	}
		if( Z14 >= 9.88 ) { return new Prediction("Right", 86, 0); }
	}
	if( Z31 < 9.78 ) { 
		if( Z24 < 9.59 ) { return new Prediction("Right", 11, 0); }
	if( Z24 >= 9.59 ) { 
	if( Z6 < 9.82 ) { 
	if( X20 < 0.12 ) { 
	if( Z2 < 9.86 ) { 
	if( Z19 >= 9.76 ) { 
	if( X6 < 0.09 ) { 
		if( X15 < 0.11 ) { return new Prediction("Left", 19, 0); }
	if( X15 >= 0.11 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y5 < -0.1 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( X6 >= 0.09 ) { 
	if( Z25 < 9.71 ) { 
	if( Z31 < 9.63 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X10 < 0.11 ) { return new Prediction("Left", 7, 0); }
	}
		if( Z31 >= 9.63 ) { return new Prediction("Right", 18, 0); }
	}
		if( Z25 >= 9.71 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( Z19 < 9.76 ) { 
	if( Z14 >= 9.77 ) { 
	if( Z21 < 9.75 ) { 
		if( Y25 >= -0.11 ) { return new Prediction("Right", 9, 0); }
	if( Y25 < -0.11 ) { 
	if( Y32 < -0.12 ) { 
		if( Y12 < -0.11 ) { return new Prediction("Right", 6, 0); }
		if( Y12 >= -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y32 >= -0.12 ) { return new Prediction("Left", 5, 0); }
	}
	}
		if( Z21 >= 9.75 ) { return new Prediction("Left", 34, 0); }
	}
	if( Z14 < 9.77 ) { 
	if( Y21 < -0.14 ) { 
		if( X14 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X14 < 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y21 >= -0.14 ) { return new Prediction("Left", 66, 0); }
	}
	}
	}
		if( Z2 >= 9.86 ) { return new Prediction("Right", 18, 0); }
	}
	if( X20 >= 0.12 ) { 
	if( Y19 < -0.1 ) { 
	if( X31 >= 0.1 ) { 
	if( Y10 >= -0.13 ) { 
		if( Y3 >= -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y3 < -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y10 < -0.13 ) { return new Prediction("Right", 1, 0); }
	}
		if( X31 < 0.1 ) { return new Prediction("Right", 16, 0); }
	}
	if( Y19 >= -0.1 ) { 
		if( X6 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	if( Z6 >= 9.82 ) { 
	if( X5 >= 0.08 ) { 
		if( Z4 >= 9.76 ) { return new Prediction("Right", 30, 0); }
	if( Z4 < 9.76 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X30 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( X5 < 0.08 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree1() {
	if( Z23 < 9.76 ) { 
	if( Z28 < 9.79 ) { 
	if( X4 >= 0.09 ) { 
	if( Y22 < -0.11 ) { 
	if( Z18 >= 9.73 ) { 
		if( Z12 >= 9.81 ) { return new Prediction("Left", 8, 0); }
	if( Z12 < 9.81 ) { 
	if( X20 < 0.11 ) { 
	if( Z12 < 9.74 ) { 
		if( Y8 >= -0.12 ) { return new Prediction("Left", 5, 0); }
	if( Y8 < -0.12 ) { 
		if( Y9 < -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y9 >= -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z12 >= 9.74 ) { return new Prediction("Right", 4, 0); }
	}
		if( X20 >= 0.11 ) { return new Prediction("Right", 8, 0); }
	}
	}
	if( Z18 < 9.73 ) { 
	if( Y32 < -0.12 ) { 
	if( X11 >= 0.1 ) { 
		if( Y20 >= -0.11 ) { return new Prediction("Right", 4, 0); }
	if( Y20 < -0.11 ) { 
		if( X13 >= 0.11 ) { return new Prediction("Left", 3, 0); }
		if( X13 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( X11 < 0.1 ) { return new Prediction("Left", 10, 0); }
	}
	if( Y32 >= -0.12 ) { 
	if( Y19 >= -0.14 ) { 
	if( Z31 >= 9.78 ) { 
		if( X7 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X7 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z31 < 9.78 ) { return new Prediction("Left", 60, 0); }
	}
		if( Y19 < -0.14 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Y22 >= -0.11 ) { 
	if( Y5 >= -0.1 ) { 
		if( Z13 >= 9.7 ) { return new Prediction("Right", 26, 0); }
	if( Z13 < 9.7 ) { 
		if( Z5 < 9.67 ) { return new Prediction("Left", 4, 0); }
	if( Z5 >= 9.67 ) { 
		if( X10 < 0.12 ) { return new Prediction("Right", 7, 0); }
		if( X10 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Y5 < -0.1 ) { 
		if( Z7 >= 9.65 ) { return new Prediction("Left", 13, 0); }
	if( Z7 < 9.65 ) { 
		if( Z30 < 9.62 ) { return new Prediction("Left", 15, 0); }
	if( Z30 >= 9.62 ) { 
	if( Z4 < 9.91 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 12, 0); }
	if( Z13 < 9.78 ) { 
	if( Z13 < 9.68 ) { 
		if( Y28 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y28 < -0.1 ) { return new Prediction("Left", 10, 0); }
	}
	if( Z13 >= 9.68 ) { 
	if( X3 >= 0.09 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Right", 14, 0); }
	if( X30 < 0.1 ) { 
		if( X30 < 0.09 ) { return new Prediction("Right", 3, 0); }
	if( X30 >= 0.09 ) { 
		if( Y23 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y23 < -0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
		if( X3 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Z4 >= 9.91 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	}
	}
	if( X4 < 0.09 ) { 
	if( Z2 >= 9.58 ) { 
	if( Y7 < -0.12 ) { 
		if( X2 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y7 >= -0.12 ) { return new Prediction("Left", 58, 0); }
	}
		if( Z2 < 9.58 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( Z28 >= 9.79 ) { return new Prediction("Right", 8, 0); }
	}
	if( Z23 >= 9.76 ) { 
	if( Z14 >= 9.85 ) { 
	if( Y5 >= -0.13 ) { 
	if( X13 >= 0.12 ) { 
		if( X5 < 0.13 ) { return new Prediction("Right", 20, 0); }
	if( X5 >= 0.13 ) { 
		if( X9 < 0.15 ) { return new Prediction("Left", 5, 0); }
		if( X9 >= 0.15 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( X13 < 0.12 ) { return new Prediction("Right", 124, 0); }
	}
	if( Y5 < -0.13 ) { 
		if( Z8 < 10.05 ) { return new Prediction("Left", 4, 0); }
		if( Z8 >= 10.05 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z14 < 9.85 ) { 
	if( Z9 >= 9.59 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Right", 20, 0); }
	if( Y4 >= -0.11 ) { 
		if( X31 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	if( X31 < 0.1 ) { 
		if( Z18 < 9.63 ) { return new Prediction("Right", 13, 0); }
	if( Z18 >= 9.63 ) { 
		if( X14 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X14 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z9 < 9.59 ) { 
		if( Z8 < 9.74 ) { return new Prediction("Right", 6, 0); }
		if( Z8 >= 9.74 ) { return new Prediction("Left", 16, 0); }
	}
	}
	}
return null;
}
private Prediction runTree2() {
	if( Z22 < 9.7 ) { 
	if( Z19 >= 9.81 ) { 
		if( Z13 >= 9.73 ) { return new Prediction("Left", 96, 0); }
	if( Z13 < 9.73 ) { 
	if( X23 >= 0.09 ) { 
		if( X24 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X24 < 0.12 ) { return new Prediction("Left", 20, 0); }
	}
		if( X23 < 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z19 < 9.81 ) { 
	if( Y6 >= -0.1 ) { 
		if( Z11 < 9.73 ) { return new Prediction("Left", 7, 0); }
	if( Z11 >= 9.73 ) { 
		if( Z29 >= 9.68 ) { return new Prediction("Right", 22, 0); }
		if( Z29 < 9.68 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y6 < -0.1 ) { 
	if( Z20 >= 9.76 ) { 
		if( X28 < 0.09 ) { return new Prediction("Right", 6, 0); }
	if( X28 >= 0.09 ) { 
	if( X16 >= 0.1 ) { 
		if( Z3 < 9.85 ) { return new Prediction("Left", 13, 0); }
		if( Z3 >= 9.85 ) { return new Prediction("Right", 3, 0); }
	}
	if( X16 < 0.1 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Right", 12, 0); }
	if( X12 < 0.1 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Left", 6, 0); }
	if( Y8 < -0.11 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	if( Z20 < 9.76 ) { 
		if( Z3 < 9.54 ) { return new Prediction("Right", 2, 0); }
	if( Z3 >= 9.54 ) { 
		if( Y22 >= -0.14 ) { return new Prediction("Left", 43, 0); }
		if( Y22 < -0.14 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
	if( Z22 >= 9.7 ) { 
	if( Z12 < 9.54 ) { 
		if( X10 < 0.1 ) { return new Prediction("Left", 15, 0); }
	if( X10 >= 0.1 ) { 
		if( Y12 < -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y12 >= -0.12 ) { return new Prediction("Left", 3, 0); }
	}
	}
	if( Z12 >= 9.54 ) { 
	if( Z31 >= 9.78 ) { 
		if( Y25 < -0.1 ) { return new Prediction("Right", 124, 0); }
	if( Y25 >= -0.1 ) { 
	if( X9 >= 0.12 ) { 
		if( X15 < 0.12 ) { return new Prediction("Right", 4, 0); }
		if( X15 >= 0.12 ) { return new Prediction("Left", 6, 0); }
	}
		if( X9 < 0.12 ) { return new Prediction("Right", 25, 0); }
	}
	}
	if( Z31 < 9.78 ) { 
	if( Z14 >= 9.73 ) { 
		if( Z25 >= 9.76 ) { return new Prediction("Right", 22, 0); }
	if( Z25 < 9.76 ) { 
		if( X28 < 0.08 ) { return new Prediction("Right", 2, 0); }
	if( X28 >= 0.08 ) { 
		if( X23 < 0.11 ) { return new Prediction("Left", 42, 0); }
	if( X23 >= 0.11 ) { 
		if( X1 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
		if( Z14 < 9.73 ) { return new Prediction("Right", 37, 0); }
	}
	}
	}
return null;
}
private Prediction runTree3() {
	if( X27 >= 0.11 ) { 
	if( Z26 >= 9.58 ) { 
		if( Z31 >= 9.79 ) { return new Prediction("Right", 36, 0); }
	if( Z31 < 9.79 ) { 
		if( X15 < 0.08 ) { return new Prediction("Left", 15, 0); }
	if( X15 >= 0.08 ) { 
		if( Z7 >= 9.87 ) { return new Prediction("Right", 16, 0); }
	if( Z7 < 9.87 ) { 
		if( Z31 >= 9.78 ) { return new Prediction("Right", 6, 0); }
	if( Z31 < 9.78 ) { 
	if( X30 >= 0.1 ) { 
	if( Z28 >= 9.74 ) { 
		if( Y7 >= -0.14 ) { return new Prediction("Right", 5, 0); }
		if( Y7 < -0.14 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z28 < 9.74 ) { 
	if( Z4 < 9.91 ) { 
		if( Y5 >= -0.13 ) { return new Prediction("Left", 35, 0); }
		if( Y5 < -0.13 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z4 >= 9.91 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X30 < 0.1 ) { 
		if( X28 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X28 >= 0.1 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	}
	}
	}
	if( Z26 < 9.58 ) { 
		if( Z24 >= 9.79 ) { return new Prediction("Right", 71, 0); }
	if( Z24 < 9.79 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X27 < 0.11 ) { 
	if( Z23 >= 9.79 ) { 
	if( X18 < 0.09 ) { 
		if( Y3 < -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y3 >= -0.12 ) { return new Prediction("Left", 5, 0); }
	}
	if( X18 >= 0.09 ) { 
		if( Z25 >= 9.77 ) { return new Prediction("Right", 41, 0); }
	if( Z25 < 9.77 ) { 
		if( Y1 < -0.12 ) { return new Prediction("Left", 4, 0); }
	if( Y1 >= -0.12 ) { 
		if( Y24 < -0.1 ) { return new Prediction("Right", 8, 0); }
		if( Y24 >= -0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	if( Z23 < 9.79 ) { 
	if( Z17 >= 9.59 ) { 
	if( Z11 < 9.78 ) { 
	if( Y5 < -0.09 ) { 
	if( Z9 < 9.61 ) { 
		if( Z22 < 9.77 ) { return new Prediction("Left", 26, 0); }
	if( Z22 >= 9.77 ) { 
		if( Z15 < 9.88 ) { return new Prediction("Left", 9, 0); }
		if( Z15 >= 9.88 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z9 >= 9.61 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 8, 0); }
	if( Y5 < -0.1 ) { 
	if( Z28 >= 9.66 ) { 
	if( Y22 < -0.1 ) { 
		if( X29 < 0.08 ) { return new Prediction("Right", 1, 0); }
	if( X29 >= 0.08 ) { 
	if( X31 >= 0.11 ) { 
		if( Z14 >= 9.61 ) { return new Prediction("Right", 2, 0); }
		if( Z14 < 9.61 ) { return new Prediction("Left", 5, 0); }
	}
		if( X31 < 0.11 ) { return new Prediction("Left", 34, 0); }
	}
	}
	if( Y22 >= -0.1 ) { 
		if( Y30 >= -0.1 ) { return new Prediction("Right", 8, 0); }
	if( Y30 < -0.1 ) { 
		if( X16 < 0.11 ) { return new Prediction("Left", 5, 0); }
		if( X16 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Z28 < 9.66 ) { 
	if( X3 < 0.11 ) { 
	if( Z4 >= 9.6 ) { 
		if( X17 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X17 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z4 < 9.6 ) { return new Prediction("Right", 13, 0); }
	}
		if( X3 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
		if( Y5 >= -0.09 ) { return new Prediction("Right", 14, 0); }
	}
	if( Z11 >= 9.78 ) { 
	if( X25 < 0.1 ) { 
		if( Z19 >= 9.82 ) { return new Prediction("Left", 30, 0); }
	if( Z19 < 9.82 ) { 
		if( Z27 >= 9.77 ) { return new Prediction("Right", 5, 0); }
	if( Z27 < 9.77 ) { 
	if( X27 < 0.09 ) { 
		if( X6 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X6 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( X27 >= 0.09 ) { 
		if( X32 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X32 >= 0.09 ) { return new Prediction("Left", 19, 0); }
	}
	}
	}
	}
		if( X25 >= 0.1 ) { return new Prediction("Left", 53, 0); }
	}
	}
		if( Z17 < 9.59 ) { return new Prediction("Right", 12, 0); }
	}
	}
return null;
}
private Prediction runTree4() {
	if( Z12 >= 9.81 ) { 
	if( Z10 < 9.67 ) { 
		if( X21 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X21 >= 0.08 ) { return new Prediction("Right", 9, 0); }
	}
		if( Z10 >= 9.67 ) { return new Prediction("Left", 92, 0); }
	}
	if( Z12 < 9.81 ) { 
	if( Z7 >= 9.86 ) { 
	if( Y2 < -0.12 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	if( X21 < 0.11 ) { 
	if( Y32 < -0.13 ) { 
		if( X3 < 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y32 >= -0.13 ) { return new Prediction("Right", 22, 0); }
	}
	}
		if( Y2 >= -0.12 ) { return new Prediction("Right", 90, 0); }
	}
	if( Z7 < 9.86 ) { 
	if( Z15 < 9.9 ) { 
	if( Z29 >= 9.72 ) { 
	if( X12 >= 0.12 ) { 
		if( X21 < 0.12 ) { return new Prediction("Left", 6, 0); }
		if( X21 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	}
	if( X12 < 0.12 ) { 
		if( Z20 >= 9.83 ) { return new Prediction("Left", 3, 0); }
	if( Z20 < 9.83 ) { 
	if( Y21 < -0.12 ) { 
		if( Z1 < 9.56 ) { return new Prediction("Left", 3, 0); }
	if( Z1 >= 9.56 ) { 
	if( Y14 < -0.12 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X2 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y14 >= -0.12 ) { return new Prediction("Right", 8, 0); }
	}
	}
		if( Y21 >= -0.12 ) { return new Prediction("Right", 55, 0); }
	}
	}
	}
	if( Z29 < 9.72 ) { 
		if( X9 < 0.08 ) { return new Prediction("Left", 42, 0); }
	if( X9 >= 0.08 ) { 
	if( Y6 < -0.09 ) { 
	if( Z3 >= 9.88 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.08 ) { return new Prediction("Right", 9, 0); }
	}
	if( Z3 < 9.88 ) { 
	if( Z25 >= 9.77 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 7, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Right", 19, 0); }
	}
	if( Z25 < 9.77 ) { 
	if( Y28 >= -0.1 ) { 
		if( Z12 >= 9.67 ) { return new Prediction("Right", 7, 0); }
		if( Z12 < 9.67 ) { return new Prediction("Left", 5, 0); }
	}
	if( Y28 < -0.1 ) { 
		if( Y21 < -0.12 ) { return new Prediction("Left", 36, 0); }
	if( Y21 >= -0.12 ) { 
		if( Z8 >= 9.78 ) { return new Prediction("Left", 22, 0); }
	if( Z8 < 9.78 ) { 
		if( Y12 < -0.12 ) { return new Prediction("Right", 5, 0); }
	if( Y12 >= -0.12 ) { 
	if( Y32 < -0.12 ) { 
	if( Y32 < -0.12 ) { 
	if( X22 < 0.1 ) { 
		if( X5 < 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X5 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X22 >= 0.1 ) { return new Prediction("Left", 13, 0); }
	}
	if( Y32 >= -0.12 ) { 
		if( X4 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X4 >= 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( Y32 >= -0.12 ) { return new Prediction("Left", 20, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( Y6 >= -0.09 ) { 
	if( Y5 < -0.09 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X27 >= 0.09 ) { return new Prediction("Right", 12, 0); }
	}
		if( Y5 >= -0.09 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
		if( Z15 >= 9.9 ) { return new Prediction("Right", 17, 0); }
	}
	}
return null;
}
private Prediction runTree5() {
	if( Z7 >= 9.84 ) { 
		if( Z12 < 9.47 ) { return new Prediction("Left", 5, 0); }
	if( Z12 >= 9.47 ) { 
	if( Y23 >= -0.09 ) { 
		if( X1 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	if( Y23 < -0.09 ) { 
		if( Z19 < 9.56 ) { return new Prediction("Right", 122, 0); }
	if( Z19 >= 9.56 ) { 
		if( Z32 >= 9.77 ) { return new Prediction("Right", 8, 0); }
	if( Z32 < 9.77 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X10 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
	if( Z7 < 9.84 ) { 
	if( Z22 >= 9.71 ) { 
	if( Z19 < 9.68 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Left", 33, 0); }
	if( X11 < 0.12 ) { 
	if( Z17 < 9.72 ) { 
		if( Z2 >= 9.61 ) { return new Prediction("Right", 3, 0); }
	if( Z2 < 9.61 ) { 
	if( Z27 < 9.58 ) { 
	if( Y23 >= -0.11 ) { 
		if( Y31 < -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y31 >= -0.12 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y23 < -0.11 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z27 >= 9.58 ) { return new Prediction("Left", 27, 0); }
	}
	}
	if( Z17 >= 9.72 ) { 
	if( Z1 >= 9.59 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X24 < 0.1 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z1 < 9.59 ) { return new Prediction("Right", 34, 0); }
	}
	}
	}
	if( Z19 >= 9.68 ) { 
	if( Y1 >= -0.14 ) { 
	if( X30 < 0.09 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X12 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( X30 >= 0.09 ) { return new Prediction("Right", 45, 0); }
	}
		if( Y1 < -0.14 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z22 < 9.71 ) { 
		if( Z30 < 9.62 ) { return new Prediction("Left", 37, 0); }
	if( Z30 >= 9.62 ) { 
	if( Z5 < 9.73 ) { 
	if( Z27 < 9.8 ) { 
	if( Y21 < -0.12 ) { 
	if( Z5 < 9.72 ) { 
		if( Y4 < -0.09 ) { return new Prediction("Left", 42, 0); }
		if( Y4 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z5 >= 9.72 ) { return new Prediction("Right", 1, 0); }
	}
	if( Y21 >= -0.12 ) { 
	if( Z12 >= 9.71 ) { 
	if( X3 >= 0.09 ) { 
	if( Y26 >= -0.11 ) { 
		if( Z5 < 9.66 ) { return new Prediction("Right", 6, 0); }
		if( Z5 >= 9.66 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y26 < -0.11 ) { return new Prediction("Right", 23, 0); }
	}
	if( X3 < 0.09 ) { 
		if( Y11 < -0.12 ) { return new Prediction("Right", 3, 0); }
	if( Y11 >= -0.12 ) { 
		if( X21 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X21 >= 0.1 ) { return new Prediction("Left", 23, 0); }
	}
	}
	}
		if( Z12 < 9.71 ) { return new Prediction("Left", 22, 0); }
	}
	}
		if( Z27 >= 9.8 ) { return new Prediction("Right", 6, 0); }
	}
	if( Z5 >= 9.73 ) { 
		if( Z31 < 9.69 ) { return new Prediction("Left", 52, 0); }
		if( Z31 >= 9.69 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree6() {
	if( Y12 < -0.12 ) { 
	if( Z26 < 9.71 ) { 
	if( X4 < 0.11 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Right", 86, 0); }
	if( Y8 < -0.11 ) { 
	if( Z23 < 9.75 ) { 
	if( Z11 < 9.68 ) { 
		if( Y15 < -0.14 ) { return new Prediction("Right", 1, 0); }
		if( Y15 >= -0.14 ) { return new Prediction("Left", 16, 0); }
	}
		if( Z11 >= 9.68 ) { return new Prediction("Right", 4, 0); }
	}
	if( Z23 >= 9.75 ) { 
	if( X9 >= 0.07 ) { 
		if( Z14 >= 9.8 ) { return new Prediction("Right", 29, 0); }
	if( Z14 < 9.8 ) { 
		if( Y17 < -0.12 ) { return new Prediction("Left", 1, 0); }
		if( Y17 >= -0.12 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( X9 < 0.07 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X4 >= 0.11 ) { 
	if( Y14 < -0.13 ) { 
		if( X5 >= 0.17 ) { return new Prediction("Left", 1, 0); }
		if( X5 < 0.17 ) { return new Prediction("Right", 17, 0); }
	}
	if( Y14 >= -0.13 ) { 
	if( Z8 >= 9.71 ) { 
		if( Z8 < 9.9 ) { return new Prediction("Left", 30, 0); }
		if( Z8 >= 9.9 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z8 < 9.71 ) { return new Prediction("Right", 10, 0); }
	}
	}
	}
	if( Z26 >= 9.71 ) { 
	if( Z32 >= 9.64 ) { 
	if( X8 >= 0.11 ) { 
		if( Y26 < -0.09 ) { return new Prediction("Left", 8, 0); }
		if( Y26 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
	if( X8 < 0.11 ) { 
		if( X4 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X4 >= 0.1 ) { return new Prediction("Right", 5, 0); }
	}
	}
		if( Z32 < 9.64 ) { return new Prediction("Left", 26, 0); }
	}
	}
	if( Y12 >= -0.12 ) { 
	if( Z21 < 9.75 ) { 
	if( X1 < 0.1 ) { 
	if( Z4 >= 9.57 ) { 
	if( Y9 < -0.13 ) { 
	if( Z9 < 9.8 ) { 
		if( Y15 >= -0.1 ) { return new Prediction("Right", 5, 0); }
		if( Y15 < -0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z9 >= 9.8 ) { return new Prediction("Left", 14, 0); }
	}
	if( Y9 >= -0.13 ) { 
	if( Y28 >= -0.1 ) { 
	if( Z32 >= 9.64 ) { 
	if( X25 < 0.1 ) { 
		if( X6 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X6 >= 0.08 ) { return new Prediction("Right", 3, 0); }
	}
		if( X25 >= 0.1 ) { return new Prediction("Left", 9, 0); }
	}
		if( Z32 < 9.64 ) { return new Prediction("Left", 22, 0); }
	}
		if( Y28 < -0.1 ) { return new Prediction("Left", 70, 0); }
	}
	}
	if( Z4 < 9.57 ) { 
		if( X12 < 0.09 ) { return new Prediction("Left", 9, 0); }
	if( X12 >= 0.09 ) { 
		if( X8 >= 0.08 ) { return new Prediction("Right", 6, 0); }
		if( X8 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X1 >= 0.1 ) { 
	if( Z14 < 9.58 ) { 
		if( Z31 < 9.61 ) { return new Prediction("Left", 3, 0); }
		if( Z31 >= 9.61 ) { return new Prediction("Right", 15, 0); }
	}
	if( Z14 >= 9.58 ) { 
	if( Z25 < 9.66 ) { 
		if( X7 >= 0.11 ) { return new Prediction("Left", 7, 0); }
	if( X7 < 0.11 ) { 
		if( Z5 >= 9.74 ) { return new Prediction("Left", 3, 0); }
		if( Z5 < 9.74 ) { return new Prediction("Right", 16, 0); }
	}
	}
	if( Z25 >= 9.66 ) { 
	if( X22 < 0.09 ) { 
		if( Z26 >= 9.63 ) { return new Prediction("Left", 4, 0); }
		if( Z26 < 9.63 ) { return new Prediction("Right", 5, 0); }
	}
	if( X22 >= 0.09 ) { 
	if( Z32 < 9.66 ) { 
		if( Z30 >= 9.66 ) { return new Prediction("Right", 1, 0); }
		if( Z30 < 9.66 ) { return new Prediction("Left", 6, 0); }
	}
		if( Z32 >= 9.66 ) { return new Prediction("Left", 22, 0); }
	}
	}
	}
	}
	}
	if( Z21 >= 9.75 ) { 
	if( X4 < 0.12 ) { 
		if( Z20 >= 9.8 ) { return new Prediction("Left", 3, 0); }
	if( Z20 < 9.8 ) { 
		if( X8 < 0.14 ) { return new Prediction("Right", 46, 0); }
		if( X8 >= 0.14 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( X4 >= 0.12 ) { 
		if( X17 >= 0.14 ) { return new Prediction("Right", 1, 0); }
		if( X17 < 0.14 ) { return new Prediction("Left", 6, 0); }
	}
	}
	}
return null;
}
private Prediction runTree7() {
	if( Z31 >= 9.78 ) { 
	if( Y26 >= -0.13 ) { 
	if( X8 >= 0.1 ) { 
	if( Z5 >= 9.61 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 2, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 61, 0); }
	}
		if( Z5 < 9.61 ) { return new Prediction("Left", 2, 0); }
	}
		if( X8 < 0.1 ) { return new Prediction("Right", 78, 0); }
	}
		if( Y26 < -0.13 ) { return new Prediction("Left", 5, 0); }
	}
	if( Z31 < 9.78 ) { 
	if( Z6 >= 9.87 ) { 
		if( X10 < 0.16 ) { return new Prediction("Right", 37, 0); }
		if( X10 >= 0.16 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z6 < 9.87 ) { 
	if( X13 < 0.09 ) { 
	if( Y15 >= -0.09 ) { 
	if( Z3 >= 9.82 ) { 
		if( Y11 >= -0.09 ) { return new Prediction("Left", 1, 0); }
		if( Y11 < -0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z3 < 9.82 ) { return new Prediction("Left", 7, 0); }
	}
		if( Y15 < -0.09 ) { return new Prediction("Left", 38, 0); }
	}
	if( X13 >= 0.09 ) { 
	if( Z9 < 9.75 ) { 
	if( Z9 >= 9.58 ) { 
		if( Z32 >= 9.77 ) { return new Prediction("Right", 11, 0); }
	if( Z32 < 9.77 ) { 
	if( Z8 < 9.61 ) { 
	if( Y14 >= -0.1 ) { 
		if( Z15 >= 9.56 ) { return new Prediction("Right", 22, 0); }
		if( Z15 < 9.56 ) { return new Prediction("Left", 1, 0); }
	}
	if( Y14 < -0.1 ) { 
	if( X23 >= 0.1 ) { 
	if( X23 < 0.12 ) { 
	if( X8 >= 0.11 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Right", 3, 0); }
		if( X21 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X8 < 0.11 ) { return new Prediction("Right", 11, 0); }
	}
		if( X23 >= 0.12 ) { return new Prediction("Left", 3, 0); }
	}
		if( X23 < 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
	if( Z8 >= 9.61 ) { 
	if( X2 < 0.09 ) { 
	if( X8 < 0.17 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Right", 9, 0); }
		if( X7 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( X8 >= 0.17 ) { return new Prediction("Left", 3, 0); }
	}
	if( X2 >= 0.09 ) { 
	if( X26 >= 0.11 ) { 
		if( X15 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X15 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	if( X26 < 0.11 ) { 
		if( X18 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X18 >= 0.08 ) { return new Prediction("Left", 29, 0); }
	}
	}
	}
	}
	}
	if( Z9 < 9.58 ) { 
		if( Z6 >= 9.54 ) { return new Prediction("Left", 29, 0); }
		if( Z6 < 9.54 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z9 >= 9.75 ) { 
		if( Z19 >= 9.82 ) { return new Prediction("Left", 76, 0); }
	if( Z19 < 9.82 ) { 
		if( X32 < 0.09 ) { return new Prediction("Left", 15, 0); }
	if( X32 >= 0.09 ) { 
	if( Z3 < 9.87 ) { 
	if( X28 < 0.11 ) { 
	if( X13 < 0.09 ) { 
		if( X24 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X24 < 0.11 ) { return new Prediction("Right", 7, 0); }
	}
	if( X13 >= 0.09 ) { 
	if( X22 < 0.1 ) { 
	if( Y14 < -0.11 ) { 
		if( Y18 >= -0.13 ) { return new Prediction("Right", 6, 0); }
	if( Y18 < -0.13 ) { 
		if( X6 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( Y14 >= -0.11 ) { return new Prediction("Left", 8, 0); }
	}
	if( X22 >= 0.1 ) { 
	if( Y25 >= -0.11 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Left", 4, 0); }
		if( X1 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y25 < -0.11 ) { return new Prediction("Left", 13, 0); }
	}
	}
	}
		if( X28 >= 0.11 ) { return new Prediction("Left", 15, 0); }
	}
		if( Z3 >= 9.87 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree8() {
	if( Z31 >= 9.79 ) { 
	if( Z14 < 9.79 ) { 
		if( X4 < 0.11 ) { return new Prediction("Right", 8, 0); }
		if( X4 >= 0.11 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z14 >= 9.79 ) { 
		if( X13 < 0.14 ) { return new Prediction("Right", 150, 0); }
	if( X13 >= 0.14 ) { 
		if( Y15 >= -0.13 ) { return new Prediction("Left", 2, 0); }
		if( Y15 < -0.13 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	if( Z31 < 9.79 ) { 
	if( Z6 >= 9.85 ) { 
		if( X29 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X29 >= 0.09 ) { return new Prediction("Right", 32, 0); }
	}
	if( Z6 < 9.85 ) { 
	if( X5 >= 0.08 ) { 
	if( Y5 < -0.09 ) { 
	if( X8 >= 0.1 ) { 
	if( Z16 < 9.72 ) { 
		if( X25 < 0.1 ) { return new Prediction("Left", 52, 0); }
	if( X25 >= 0.1 ) { 
	if( Y15 >= -0.13 ) { 
		if( Y21 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	if( Y21 < -0.09 ) { 
	if( X22 < 0.11 ) { 
		if( X10 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X10 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
		if( X22 >= 0.11 ) { return new Prediction("Left", 21, 0); }
	}
	}
		if( Y15 < -0.13 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z16 >= 9.72 ) { 
		if( Z29 < 9.63 ) { return new Prediction("Right", 5, 0); }
	if( Z29 >= 9.63 ) { 
		if( Z16 >= 9.77 ) { return new Prediction("Left", 22, 0); }
	if( Z16 < 9.77 ) { 
		if( Y30 >= -0.13 ) { return new Prediction("Right", 9, 0); }
		if( Y30 < -0.13 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	if( X8 < 0.1 ) { 
	if( X2 < 0.1 ) { 
	if( X18 < 0.12 ) { 
		if( Z16 >= 9.75 ) { return new Prediction("Right", 4, 0); }
	if( Z16 < 9.75 ) { 
	if( Y27 < -0.12 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Left", 9, 0); }
	if( X7 < 0.09 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y5 < -0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( Y27 >= -0.12 ) { return new Prediction("Left", 44, 0); }
	}
	}
		if( X18 >= 0.12 ) { return new Prediction("Right", 4, 0); }
	}
	if( X2 >= 0.1 ) { 
	if( Z27 < 9.73 ) { 
		if( Y27 < -0.12 ) { return new Prediction("Right", 2, 0); }
	if( Y27 >= -0.12 ) { 
	if( Y12 < -0.12 ) { 
		if( Y1 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y1 < -0.1 ) { return new Prediction("Left", 5, 0); }
	}
		if( Y12 >= -0.12 ) { return new Prediction("Left", 17, 0); }
	}
	}
	if( Z27 >= 9.73 ) { 
		if( Z13 >= 9.71 ) { return new Prediction("Right", 22, 0); }
	if( Z13 < 9.71 ) { 
		if( X20 < 0.1 ) { return new Prediction("Right", 4, 0); }
		if( X20 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	}
	}
	}
	}
	}
	if( Y5 >= -0.09 ) { 
		if( Y5 >= -0.07 ) { return new Prediction("Left", 1, 0); }
		if( Y5 < -0.07 ) { return new Prediction("Right", 16, 0); }
	}
	}
	if( X5 < 0.08 ) { 
		if( Z20 >= 9.65 ) { return new Prediction("Left", 42, 0); }
	if( Z20 < 9.65 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 13, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree9() {
	if( Z32 >= 9.77 ) { 
		if( Z31 >= 9.82 ) { return new Prediction("Right", 77, 0); }
	if( Z31 < 9.82 ) { 
		if( X26 < 0.09 ) { return new Prediction("Left", 6, 0); }
	if( X26 >= 0.09 ) { 
	if( Z16 < 9.66 ) { 
		if( Z23 >= 9.7 ) { return new Prediction("Left", 8, 0); }
		if( Z23 < 9.7 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z16 >= 9.66 ) { 
	if( X11 >= 0.08 ) { 
	if( Z11 >= 9.57 ) { 
		if( Y31 >= -0.14 ) { return new Prediction("Right", 67, 0); }
	if( Y31 < -0.14 ) { 
		if( Y1 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y1 < -0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z11 < 9.57 ) { 
		if( Y10 >= -0.11 ) { return new Prediction("Right", 8, 0); }
	if( Y10 < -0.11 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X3 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( X11 < 0.08 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	}
	if( Z32 < 9.77 ) { 
	if( Z18 < 9.6 ) { 
		if( Z11 < 9.54 ) { return new Prediction("Left", 7, 0); }
	if( Z11 >= 9.54 ) { 
	if( Y20 >= -0.12 ) { 
	if( Z11 < 9.64 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Right", 11, 0); }
	}
		if( Z11 >= 9.64 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y20 < -0.12 ) { return new Prediction("Right", 18, 0); }
	}
	}
	if( Z18 >= 9.6 ) { 
	if( Z31 < 9.62 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Left", 72, 0); }
	if( X17 < 0.08 ) { 
		if( Z10 >= 9.72 ) { return new Prediction("Left", 4, 0); }
		if( Z10 < 9.72 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z31 >= 9.62 ) { 
	if( Z12 < 9.68 ) { 
	if( Z6 < 9.75 ) { 
	if( Y14 >= -0.1 ) { 
	if( X28 < 0.1 ) { 
		if( X25 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X25 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( X28 >= 0.1 ) { return new Prediction("Left", 15, 0); }
	}
		if( Y14 < -0.1 ) { return new Prediction("Left", 51, 0); }
	}
	if( Z6 >= 9.75 ) { 
		if( Z16 < 9.79 ) { return new Prediction("Right", 5, 0); }
		if( Z16 >= 9.79 ) { return new Prediction("Left", 7, 0); }
	}
	}
	if( Z12 >= 9.68 ) { 
	if( Y15 >= -0.09 ) { 
		if( Z3 < 9.8 ) { return new Prediction("Left", 3, 0); }
	if( Z3 >= 9.8 ) { 
		if( Z22 < 9.69 ) { return new Prediction("Left", 1, 0); }
		if( Z22 >= 9.69 ) { return new Prediction("Right", 14, 0); }
	}
	}
	if( Y15 < -0.09 ) { 
	if( Z20 >= 9.81 ) { 
		if( Z27 < 9.79 ) { return new Prediction("Left", 33, 0); }
	if( Z27 >= 9.79 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 5, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z20 < 9.81 ) { 
	if( Z2 >= 9.8 ) { 
	if( Y22 < -0.12 ) { 
		if( X27 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X27 < 0.11 ) { return new Prediction("Left", 8, 0); }
	}
	if( Y22 >= -0.12 ) { 
	if( X1 < 0.09 ) { 
		if( X7 >= 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X7 < 0.1 ) { return new Prediction("Left", 7, 0); }
	}
	if( X1 >= 0.09 ) { 
		if( Z8 < 9.64 ) { return new Prediction("Right", 37, 0); }
	if( Z8 >= 9.64 ) { 
		if( X18 < 0.09 ) { return new Prediction("Right", 3, 0); }
		if( X18 >= 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	}
		if( Z2 < 9.8 ) { return new Prediction("Left", 22, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree10() {
	if( Z15 >= 9.86 ) { 
	if( Z25 < 9.75 ) { 
	if( Z9 < 9.63 ) { 
		if( Z7 < 9.81 ) { return new Prediction("Left", 1, 0); }
		if( Z7 >= 9.81 ) { return new Prediction("Right", 27, 0); }
	}
		if( Z9 >= 9.63 ) { return new Prediction("Left", 8, 0); }
	}
		if( Z25 >= 9.75 ) { return new Prediction("Right", 89, 0); }
	}
	if( Z15 < 9.86 ) { 
	if( X13 >= 0.12 ) { 
	if( Y13 < -0.09 ) { 
		if( Y30 >= -0.1 ) { return new Prediction("Right", 3, 0); }
	if( Y30 < -0.1 ) { 
		if( Z29 >= 9.64 ) { return new Prediction("Left", 48, 0); }
		if( Z29 < 9.64 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y13 >= -0.09 ) { return new Prediction("Right", 3, 0); }
	}
	if( X13 < 0.12 ) { 
	if( Z31 < 9.61 ) { 
		if( X1 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X1 < 0.12 ) { return new Prediction("Left", 49, 0); }
	}
	if( Z31 >= 9.61 ) { 
	if( Z20 >= 9.81 ) { 
	if( X14 < 0.1 ) { 
	if( X8 >= 0.09 ) { 
		if( Y20 >= -0.12 ) { return new Prediction("Left", 4, 0); }
		if( Y20 < -0.12 ) { return new Prediction("Right", 1, 0); }
	}
		if( X8 < 0.09 ) { return new Prediction("Right", 5, 0); }
	}
	if( X14 >= 0.1 ) { 
	if( Y16 < -0.14 ) { 
		if( X14 >= 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X14 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y16 >= -0.14 ) { return new Prediction("Left", 34, 0); }
	}
	}
	if( Z20 < 9.81 ) { 
	if( X14 >= 0.07 ) { 
		if( Z1 >= 9.86 ) { return new Prediction("Right", 42, 0); }
	if( Z1 < 9.86 ) { 
		if( Z6 >= 9.85 ) { return new Prediction("Right", 21, 0); }
	if( Z6 < 9.85 ) { 
	if( X20 < 0.11 ) { 
	if( Y8 >= -0.11 ) { 
	if( Z32 < 9.79 ) { 
		if( Z9 >= 9.78 ) { return new Prediction("Left", 8, 0); }
	if( Z9 < 9.78 ) { 
	if( Y10 < -0.1 ) { 
		if( Z1 >= 9.82 ) { return new Prediction("Right", 10, 0); }
	if( Z1 < 9.82 ) { 
		if( Z14 >= 9.64 ) { return new Prediction("Right", 6, 0); }
		if( Z14 < 9.64 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( Y10 >= -0.1 ) { 
		if( X6 < 0.09 ) { return new Prediction("Left", 9, 0); }
	if( X6 >= 0.09 ) { 
	if( X15 >= 0.09 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( X15 < 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
		if( Z32 >= 9.79 ) { return new Prediction("Right", 12, 0); }
	}
	if( Y8 < -0.11 ) { 
	if( Y5 >= -0.13 ) { 
		if( X27 >= 0.1 ) { return new Prediction("Left", 29, 0); }
	if( X27 < 0.1 ) { 
	if( Z20 >= 9.76 ) { 
	if( Z6 < 9.67 ) { 
	if( Z25 < 9.74 ) { 
		if( Z17 < 9.73 ) { return new Prediction("Right", 7, 0); }
	if( Z17 >= 9.73 ) { 
		if( X8 >= 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X8 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z25 >= 9.74 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z6 >= 9.67 ) { return new Prediction("Left", 7, 0); }
	}
	if( Z20 < 9.76 ) { 
		if( Z19 >= 9.53 ) { return new Prediction("Left", 20, 0); }
		if( Z19 < 9.53 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
		if( Y5 < -0.13 ) { return new Prediction("Right", 6, 0); }
	}
	}
	if( X20 >= 0.11 ) { 
		if( Z26 < 9.65 ) { return new Prediction("Right", 20, 0); }
	if( Z26 >= 9.65 ) { 
		if( Y18 >= -0.11 ) { return new Prediction("Left", 5, 0); }
		if( Y18 < -0.11 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	}
	}
		if( X14 < 0.07 ) { return new Prediction("Left", 21, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree11() {
	if( Z22 >= 9.71 ) { 
	if( X3 < 0.13 ) { 
	if( Z25 < 9.78 ) { 
		if( Z27 >= 9.68 ) { return new Prediction("Right", 21, 0); }
	if( Z27 < 9.68 ) { 
		if( Z32 >= 9.82 ) { return new Prediction("Right", 25, 0); }
	if( Z32 < 9.82 ) { 
	if( Z4 >= 9.77 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 29, 0); }
	}
	if( Z4 < 9.77 ) { 
		if( Z7 >= 9.87 ) { return new Prediction("Right", 5, 0); }
	if( Z7 < 9.87 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 40, 0); }
	if( Z24 >= 9.77 ) { 
		if( Y27 < -0.12 ) { return new Prediction("Right", 4, 0); }
	if( Y27 >= -0.12 ) { 
		if( Z18 >= 9.69 ) { return new Prediction("Right", 1, 0); }
		if( Z18 < 9.69 ) { return new Prediction("Left", 11, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
		if( Z13 < 9.75 ) { return new Prediction("Right", 137, 0); }
	if( Z13 >= 9.75 ) { 
		if( X13 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X13 >= 0.08 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	if( X3 >= 0.13 ) { 
		if( Y1 < -0.13 ) { return new Prediction("Right", 3, 0); }
		if( Y1 >= -0.13 ) { return new Prediction("Left", 15, 0); }
	}
	}
	if( Z22 < 9.71 ) { 
	if( X3 < 0.1 ) { 
		if( Z32 < 9.63 ) { return new Prediction("Left", 66, 0); }
	if( Z32 >= 9.63 ) { 
		if( Y1 >= -0.09 ) { return new Prediction("Right", 4, 0); }
	if( Y1 < -0.09 ) { 
		if( Z26 < 9.62 ) { return new Prediction("Right", 3, 0); }
	if( Z26 >= 9.62 ) { 
	if( Y6 >= -0.1 ) { 
	if( Y15 >= -0.1 ) { 
		if( Z24 >= 9.62 ) { return new Prediction("Left", 5, 0); }
		if( Z24 < 9.62 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y15 < -0.1 ) { return new Prediction("Right", 3, 0); }
	}
	if( Y6 < -0.1 ) { 
	if( Z5 < 9.6 ) { 
		if( Y2 < -0.1 ) { return new Prediction("Left", 7, 0); }
		if( Y2 >= -0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z5 >= 9.6 ) { return new Prediction("Left", 32, 0); }
	}
	}
	}
	}
	}
	if( X3 >= 0.1 ) { 
	if( Y26 >= -0.13 ) { 
		if( Z23 >= 9.72 ) { return new Prediction("Left", 9, 0); }
	if( Z23 < 9.72 ) { 
	if( Z19 >= 9.81 ) { 
	if( X23 < 0.13 ) { 
		if( X24 >= 0.09 ) { return new Prediction("Left", 17, 0); }
		if( X24 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( X23 >= 0.13 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z19 < 9.81 ) { 
	if( X9 >= 0.11 ) { 
		if( X19 >= 0.08 ) { return new Prediction("Left", 7, 0); }
		if( X19 < 0.08 ) { return new Prediction("Right", 2, 0); }
	}
	if( X9 < 0.11 ) { 
		if( Y8 < -0.14 ) { return new Prediction("Left", 5, 0); }
	if( Y8 >= -0.14 ) { 
	if( X32 < 0.1 ) { 
	if( X7 >= 0.09 ) { 
		if( X25 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X25 < 0.11 ) { return new Prediction("Left", 5, 0); }
	}
		if( X7 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	if( X32 >= 0.1 ) { 
	if( Y30 >= -0.1 ) { 
		if( Z14 < 9.58 ) { return new Prediction("Right", 4, 0); }
		if( Z14 >= 9.58 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y30 < -0.1 ) { return new Prediction("Right", 23, 0); }
	}
	}
	}
	}
	}
	}
		if( Y26 < -0.13 ) { return new Prediction("Left", 17, 0); }
	}
	}
return null;
}
private Prediction runTree12() {
	if( Z10 < 9.74 ) { 
	if( Z13 >= 9.55 ) { 
		if( Z31 >= 9.81 ) { return new Prediction("Right", 89, 0); }
	if( Z31 < 9.81 ) { 
	if( X2 >= 0.12 ) { 
		if( Y2 < -0.13 ) { return new Prediction("Right", 2, 0); }
		if( Y2 >= -0.13 ) { return new Prediction("Left", 11, 0); }
	}
	if( X2 < 0.12 ) { 
		if( Z6 >= 9.85 ) { return new Prediction("Right", 44, 0); }
	if( Z6 < 9.85 ) { 
		if( X29 >= 0.11 ) { return new Prediction("Right", 14, 0); }
	if( X29 < 0.11 ) { 
		if( Y2 < -0.13 ) { return new Prediction("Right", 19, 0); }
	if( Y2 >= -0.13 ) { 
	if( Y14 < -0.12 ) { 
		if( Z31 < 9.76 ) { return new Prediction("Left", 4, 0); }
		if( Z31 >= 9.76 ) { return new Prediction("Right", 29, 0); }
	}
	if( Y14 >= -0.12 ) { 
	if( Z16 < 9.83 ) { 
	if( Z24 >= 9.78 ) { 
		if( X20 >= 0.09 ) { return new Prediction("Right", 19, 0); }
		if( X20 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z24 < 9.78 ) { 
	if( Z3 >= 9.82 ) { 
		if( Y12 < -0.09 ) { return new Prediction("Right", 14, 0); }
	if( Y12 >= -0.09 ) { 
		if( X11 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X11 < 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z3 < 9.82 ) { 
	if( Y27 < -0.12 ) { 
		if( X12 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X12 >= 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( Y27 >= -0.12 ) { return new Prediction("Left", 27, 0); }
	}
	}
	}
		if( Z16 >= 9.83 ) { return new Prediction("Left", 8, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( Z13 < 9.55 ) { 
		if( Y27 < -0.11 ) { return new Prediction("Left", 17, 0); }
	if( Y27 >= -0.11 ) { 
		if( Z13 < 9.49 ) { return new Prediction("Left", 10, 0); }
	if( Z13 >= 9.49 ) { 
		if( X22 < 0.09 ) { return new Prediction("Right", 5, 0); }
	if( X22 >= 0.09 ) { 
		if( X2 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	}
	if( Z10 >= 9.74 ) { 
		if( Z18 < 9.67 ) { return new Prediction("Left", 31, 0); }
	if( Z18 >= 9.67 ) { 
		if( Z12 >= 9.78 ) { return new Prediction("Left", 63, 0); }
	if( Z12 < 9.78 ) { 
	if( Z1 >= 9.87 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.08 ) { return new Prediction("Right", 13, 0); }
	}
	if( Z1 < 9.87 ) { 
	if( X17 < 0.11 ) { 
		if( Z22 < 9.57 ) { return new Prediction("Right", 2, 0); }
	if( Z22 >= 9.57 ) { 
	if( X32 < 0.12 ) { 
	if( Y1 >= -0.1 ) { 
	if( X28 < 0.1 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X19 < 0.09 ) { return new Prediction("Right", 2, 0); }
	}
		if( X28 >= 0.1 ) { return new Prediction("Left", 9, 0); }
	}
		if( Y1 < -0.1 ) { return new Prediction("Left", 58, 0); }
	}
	if( X32 >= 0.12 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( X17 >= 0.11 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 5, 0); }
	if( Y5 < -0.1 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Left", 3, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree13() {
	if( Z12 < 9.83 ) { 
	if( Z27 < 9.72 ) { 
	if( Z14 >= 9.85 ) { 
	if( X1 >= 0.11 ) { 
		if( Z26 < 9.57 ) { return new Prediction("Right", 10, 0); }
	if( Z26 >= 9.57 ) { 
	if( Z4 < 9.72 ) { 
	if( Z31 >= 9.78 ) { 
		if( X20 < 0.12 ) { return new Prediction("Right", 4, 0); }
		if( X20 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z31 < 9.78 ) { return new Prediction("Left", 7, 0); }
	}
		if( Z4 >= 9.72 ) { return new Prediction("Right", 15, 0); }
	}
	}
	if( X1 < 0.11 ) { 
	if( Y7 < -0.13 ) { 
		if( X25 < 0.1 ) { return new Prediction("Right", 3, 0); }
	if( X25 >= 0.1 ) { 
		if( Y5 >= -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y5 < -0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( Y7 >= -0.13 ) { return new Prediction("Right", 114, 0); }
	}
	}
	if( Z14 < 9.85 ) { 
	if( Z8 >= 9.67 ) { 
	if( Z32 < 9.79 ) { 
		if( Z14 < 9.75 ) { return new Prediction("Left", 19, 0); }
	if( Z14 >= 9.75 ) { 
		if( Y14 < -0.13 ) { return new Prediction("Right", 9, 0); }
	if( Y14 >= -0.13 ) { 
	if( Z22 < 9.74 ) { 
		if( Z10 < 9.67 ) { return new Prediction("Left", 15, 0); }
		if( Z10 >= 9.67 ) { return new Prediction("Right", 6, 0); }
	}
		if( Z22 >= 9.74 ) { return new Prediction("Left", 25, 0); }
	}
	}
	}
	if( Z32 >= 9.79 ) { 
	if( Z22 >= 9.78 ) { 
		if( X21 < 0.09 ) { return new Prediction("Left", 4, 0); }
		if( X21 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z22 < 9.78 ) { 
		if( X14 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X14 >= 0.08 ) { return new Prediction("Right", 19, 0); }
	}
	}
	}
	if( Z8 < 9.67 ) { 
	if( Z14 >= 9.76 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X11 < 0.12 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z14 < 9.76 ) { return new Prediction("Right", 33, 0); }
	}
	}
	}
	if( Z27 >= 9.72 ) { 
	if( X2 < 0.09 ) { 
		if( X28 < 0.08 ) { return new Prediction("Right", 1, 0); }
	if( X28 >= 0.08 ) { 
		if( Z25 < 9.59 ) { return new Prediction("Right", 1, 0); }
	if( Z25 >= 9.59 ) { 
		if( Y30 >= -0.12 ) { return new Prediction("Left", 58, 0); }
	if( Y30 < -0.12 ) { 
		if( X31 >= 0.1 ) { return new Prediction("Left", 5, 0); }
		if( X31 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( X2 >= 0.09 ) { 
	if( Z29 >= 9.68 ) { 
		if( Z16 >= 9.74 ) { return new Prediction("Left", 3, 0); }
	if( Z16 < 9.74 ) { 
		if( Z20 >= 9.81 ) { return new Prediction("Left", 5, 0); }
	if( Z20 < 9.81 ) { 
		if( Z6 >= 9.7 ) { return new Prediction("Left", 4, 0); }
		if( Z6 < 9.7 ) { return new Prediction("Right", 34, 0); }
	}
	}
	}
	if( Z29 < 9.68 ) { 
	if( Z20 < 9.78 ) { 
		if( X28 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X28 >= 0.08 ) { return new Prediction("Left", 39, 0); }
	}
		if( Z20 >= 9.78 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
	}
	if( Z12 >= 9.83 ) { 
		if( Z15 < 9.68 ) { return new Prediction("Left", 69, 0); }
	if( Z15 >= 9.68 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 3, 0); }
		if( X4 >= 0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
return null;
}
private Prediction runTree14() {
	if( Z14 < 9.83 ) { 
	if( Z9 < 9.74 ) { 
		if( Z6 >= 9.85 ) { return new Prediction("Right", 26, 0); }
	if( Z6 < 9.85 ) { 
	if( Z4 < 9.59 ) { 
		if( Z20 < 9.57 ) { return new Prediction("Left", 18, 0); }
	if( Z20 >= 9.57 ) { 
	if( X14 < 0.09 ) { 
		if( X7 < 0.07 ) { return new Prediction("Left", 3, 0); }
		if( X7 >= 0.07 ) { return new Prediction("Right", 4, 0); }
	}
		if( X14 >= 0.09 ) { return new Prediction("Left", 10, 0); }
	}
	}
	if( Z4 >= 9.59 ) { 
	if( Z9 < 9.62 ) { 
	if( Z29 < 9.74 ) { 
	if( X23 >= 0.1 ) { 
		if( Z4 < 9.83 ) { return new Prediction("Left", 4, 0); }
	if( Z4 >= 9.83 ) { 
		if( Y7 < -0.12 ) { return new Prediction("Right", 3, 0); }
	if( Y7 >= -0.12 ) { 
		if( Z10 < 9.79 ) { return new Prediction("Right", 1, 0); }
		if( Z10 >= 9.79 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
		if( X23 < 0.1 ) { return new Prediction("Left", 26, 0); }
	}
	if( Z29 >= 9.74 ) { 
		if( Z14 < 9.62 ) { return new Prediction("Left", 3, 0); }
	if( Z14 >= 9.62 ) { 
		if( Z3 >= 9.59 ) { return new Prediction("Right", 9, 0); }
		if( Z3 < 9.59 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z9 >= 9.62 ) { 
		if( Z22 < 9.66 ) { return new Prediction("Left", 13, 0); }
	if( Z22 >= 9.66 ) { 
	if( Y14 < -0.11 ) { 
	if( Z17 < 9.72 ) { 
		if( X1 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Left", 5, 0); }
	}
	if( Z17 >= 9.72 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Right", 10, 0); }
	if( Y4 >= -0.11 ) { 
		if( X9 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
		if( Y14 >= -0.11 ) { return new Prediction("Right", 24, 0); }
	}
	}
	}
	}
	}
	if( Z9 >= 9.74 ) { 
	if( Z7 >= 9.8 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 5, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 12, 0); }
	}
	if( Z7 < 9.8 ) { 
	if( Z1 >= 9.87 ) { 
		if( Z20 >= 9.81 ) { return new Prediction("Left", 47, 0); }
		if( Z20 < 9.81 ) { return new Prediction("Right", 15, 0); }
	}
	if( Z1 < 9.87 ) { 
	if( X7 >= 0.1 ) { 
	if( X7 >= 0.11 ) { 
		if( Y22 < -0.09 ) { return new Prediction("Left", 42, 0); }
	if( Y22 >= -0.09 ) { 
		if( X28 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X28 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( X7 < 0.11 ) { 
	if( Z27 < 9.78 ) { 
	if( Y14 < -0.11 ) { 
		if( Z3 >= 9.83 ) { return new Prediction("Left", 3, 0); }
	if( Z3 < 9.83 ) { 
		if( X13 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X13 < 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( Y14 >= -0.11 ) { return new Prediction("Left", 11, 0); }
	}
		if( Z27 >= 9.78 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( X7 < 0.1 ) { return new Prediction("Left", 43, 0); }
	}
	}
	}
	}
	if( Z14 >= 9.83 ) { 
	if( Z17 < 9.67 ) { 
		if( Y19 < -0.11 ) { return new Prediction("Left", 13, 0); }
	if( Y19 >= -0.11 ) { 
		if( X18 < 0.13 ) { return new Prediction("Right", 2, 0); }
		if( X18 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z17 >= 9.67 ) { 
		if( Y1 >= -0.14 ) { return new Prediction("Right", 145, 0); }
	if( Y1 < -0.14 ) { 
		if( X1 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.08 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
return null;
}
private Prediction runTree15() {
	if( Z8 < 9.85 ) { 
	if( Z19 >= 9.81 ) { 
	if( X23 >= 0.09 ) { 
		if( Z24 >= 9.56 ) { return new Prediction("Left", 101, 0); }
		if( Z24 < 9.56 ) { return new Prediction("Right", 2, 0); }
	}
		if( X23 < 0.09 ) { return new Prediction("Right", 3, 0); }
	}
	if( Z19 < 9.81 ) { 
	if( Z17 >= 9.59 ) { 
	if( Z24 < 9.77 ) { 
	if( Y22 < -0.12 ) { 
	if( Y5 >= -0.1 ) { 
		if( Y9 >= -0.1 ) { return new Prediction("Left", 7, 0); }
		if( Y9 < -0.1 ) { return new Prediction("Right", 6, 0); }
	}
	if( Y5 < -0.1 ) { 
		if( Z19 >= 9.8 ) { return new Prediction("Right", 2, 0); }
		if( Z19 < 9.8 ) { return new Prediction("Left", 65, 0); }
	}
	}
	if( Y22 >= -0.12 ) { 
	if( Y5 >= -0.1 ) { 
	if( Z31 < 9.62 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Left", 4, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z31 >= 9.62 ) { 
		if( Z11 < 9.79 ) { return new Prediction("Right", 26, 0); }
		if( Z11 >= 9.79 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Y5 < -0.1 ) { 
	if( Z2 < 9.87 ) { 
	if( X31 >= 0.11 ) { 
	if( Y30 >= -0.12 ) { 
	if( X6 < 0.11 ) { 
		if( Y30 >= -0.09 ) { return new Prediction("Left", 1, 0); }
		if( Y30 < -0.09 ) { return new Prediction("Right", 14, 0); }
	}
		if( X6 >= 0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( Y30 < -0.12 ) { return new Prediction("Left", 6, 0); }
	}
	if( X31 < 0.11 ) { 
	if( X24 >= 0.11 ) { 
		if( X21 < 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X21 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	if( X24 < 0.11 ) { 
		if( Y32 < -0.13 ) { return new Prediction("Right", 2, 0); }
	if( Y32 >= -0.13 ) { 
		if( X22 < 0.12 ) { return new Prediction("Left", 50, 0); }
		if( X22 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
		if( Z2 >= 9.87 ) { return new Prediction("Right", 12, 0); }
	}
	}
	}
	if( Z24 >= 9.77 ) { 
	if( X17 >= 0.08 ) { 
	if( X6 < 0.13 ) { 
	if( Y20 >= -0.1 ) { 
		if( X4 < 0.07 ) { return new Prediction("Left", 1, 0); }
		if( X4 >= 0.07 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y20 < -0.1 ) { return new Prediction("Right", 56, 0); }
	}
		if( X6 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	if( X17 < 0.08 ) { 
		if( Y23 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y23 < -0.1 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
		if( Z17 < 9.59 ) { return new Prediction("Right", 20, 0); }
	}
	}
	if( Z8 >= 9.85 ) { 
	if( Z26 >= 9.63 ) { 
		if( X28 < 0.12 ) { return new Prediction("Right", 6, 0); }
		if( X28 >= 0.12 ) { return new Prediction("Left", 5, 0); }
	}
	if( Z26 < 9.63 ) { 
	if( Z20 >= 9.58 ) { 
		if( Y30 >= -0.12 ) { return new Prediction("Left", 3, 0); }
		if( Y30 < -0.12 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z20 < 9.58 ) { return new Prediction("Right", 103, 0); }
	}
	}
return null;
}
private Prediction runTree16() {
	if( Y16 >= -0.12 ) { 
	if( X19 >= 0.11 ) { 
	if( Z16 >= 9.62 ) { 
		if( Z25 >= 9.73 ) { return new Prediction("Right", 65, 0); }
	if( Z25 < 9.73 ) { 
	if( Z26 >= 9.58 ) { 
		if( Y28 >= -0.11 ) { return new Prediction("Right", 2, 0); }
	if( Y28 < -0.11 ) { 
		if( X29 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X29 >= 0.1 ) { return new Prediction("Left", 4, 0); }
	}
	}
		if( Z26 < 9.58 ) { return new Prediction("Right", 8, 0); }
	}
	}
		if( Z16 < 9.62 ) { return new Prediction("Left", 5, 0); }
	}
	if( X19 < 0.11 ) { 
	if( Z26 >= 9.74 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 42, 0); }
	if( X2 >= 0.09 ) { 
	if( Y4 < -0.1 ) { 
	if( Y24 < -0.12 ) { 
	if( X4 < 0.11 ) { 
		if( X3 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Left", 4, 0); }
	}
		if( X4 >= 0.11 ) { return new Prediction("Right", 4, 0); }
	}
	if( Y24 >= -0.12 ) { 
		if( X25 < 0.09 ) { return new Prediction("Right", 1, 0); }
	if( X25 >= 0.09 ) { 
		if( Z16 < 9.58 ) { return new Prediction("Right", 1, 0); }
		if( Z16 >= 9.58 ) { return new Prediction("Left", 25, 0); }
	}
	}
	}
	if( Y4 >= -0.1 ) { 
		if( X16 >= 0.09 ) { return new Prediction("Right", 6, 0); }
		if( X16 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z26 < 9.74 ) { 
	if( Y7 >= -0.11 ) { 
	if( Z4 < 9.64 ) { 
	if( Z32 < 9.79 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 16, 0); }
	if( X9 >= 0.09 ) { 
		if( X17 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X17 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z32 >= 9.79 ) { return new Prediction("Right", 14, 0); }
	}
		if( Z4 >= 9.64 ) { return new Prediction("Right", 78, 0); }
	}
	if( Y7 < -0.11 ) { 
	if( Y4 < -0.13 ) { 
		if( Z7 < 9.79 ) { return new Prediction("Right", 10, 0); }
	if( Z7 >= 9.79 ) { 
		if( Z16 < 9.67 ) { return new Prediction("Left", 7, 0); }
		if( Z16 >= 9.67 ) { return new Prediction("Right", 5, 0); }
	}
	}
	if( Y4 >= -0.13 ) { 
	if( X16 < 0.11 ) { 
		if( X10 < 0.12 ) { return new Prediction("Left", 27, 0); }
		if( X10 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	if( X16 >= 0.11 ) { 
	if( Y21 < -0.12 ) { 
		if( X7 >= 0.13 ) { return new Prediction("Left", 1, 0); }
		if( X7 < 0.13 ) { return new Prediction("Right", 6, 0); }
	}
	if( Y21 >= -0.12 ) { 
	if( Y2 < -0.12 ) { 
		if( X26 >= 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X26 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y2 >= -0.12 ) { return new Prediction("Left", 8, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( Y16 < -0.12 ) { 
	if( Z27 < 9.58 ) { 
		if( X32 < 0.1 ) { return new Prediction("Right", 22, 0); }
		if( X32 >= 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z27 >= 9.58 ) { 
	if( Y19 >= -0.14 ) { 
	if( Y22 < -0.09 ) { 
	if( Z24 >= 9.78 ) { 
		if( Y3 < -0.1 ) { return new Prediction("Right", 9, 0); }
		if( Y3 >= -0.1 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z24 < 9.78 ) { 
	if( Y19 >= -0.14 ) { 
	if( X1 < 0.1 ) { 
		if( Y6 >= -0.14 ) { return new Prediction("Left", 52, 0); }
		if( Y6 < -0.14 ) { return new Prediction("Right", 1, 0); }
	}
	if( X1 >= 0.1 ) { 
	if( X9 < 0.1 ) { 
	if( Y4 < -0.11 ) { 
		if( X21 < 0.12 ) { return new Prediction("Left", 11, 0); }
	if( X21 >= 0.12 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X2 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Y4 >= -0.11 ) { 
		if( Z6 < 9.75 ) { return new Prediction("Right", 9, 0); }
		if( Z6 >= 9.75 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( X9 >= 0.1 ) { 
		if( Z16 < 9.58 ) { return new Prediction("Right", 1, 0); }
	if( Z16 >= 9.58 ) { 
		if( Y28 >= -0.09 ) { return new Prediction("Right", 1, 0); }
		if( Y28 < -0.09 ) { return new Prediction("Left", 25, 0); }
	}
	}
	}
	}
		if( Y19 < -0.14 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Y22 >= -0.09 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Right", 9, 0); }
		if( X7 < 0.09 ) { return new Prediction("Left", 3, 0); }
	}
	}
		if( Y19 < -0.14 ) { return new Prediction("Left", 19, 0); }
	}
	}
return null;
}
private Prediction runTree17() {
	if( Z26 < 9.64 ) { 
	if( Y12 < -0.1 ) { 
	if( Z8 < 9.9 ) { 
	if( Y9 < -0.12 ) { 
		if( Z3 >= 9.71 ) { return new Prediction("Right", 1, 0); }
	if( Z3 < 9.71 ) { 
	if( X4 < 0.1 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( X4 >= 0.1 ) { return new Prediction("Left", 10, 0); }
	}
	}
	if( Y9 >= -0.12 ) { 
	if( Y7 >= -0.11 ) { 
	if( Z19 >= 9.45 ) { 
	if( X4 >= 0.09 ) { 
		if( Z18 >= 9.68 ) { return new Prediction("Right", 25, 0); }
	if( Z18 < 9.68 ) { 
		if( Z6 >= 9.79 ) { return new Prediction("Right", 12, 0); }
	if( Z6 < 9.79 ) { 
		if( Z26 < 9.57 ) { return new Prediction("Right", 1, 0); }
		if( Z26 >= 9.57 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
		if( X4 < 0.09 ) { return new Prediction("Right", 40, 0); }
	}
		if( Z19 < 9.45 ) { return new Prediction("Left", 3, 0); }
	}
	if( Y7 < -0.11 ) { 
	if( Y27 < -0.11 ) { 
		if( X5 < 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X5 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y27 >= -0.11 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
		if( Z8 >= 9.9 ) { return new Prediction("Right", 97, 0); }
	}
	if( Y12 >= -0.1 ) { 
		if( Z31 >= 9.79 ) { return new Prediction("Right", 13, 0); }
	if( Z31 < 9.79 ) { 
		if( Z10 < 9.57 ) { return new Prediction("Left", 17, 0); }
	if( Z10 >= 9.57 ) { 
		if( X5 < 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X5 >= 0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	if( Z26 >= 9.64 ) { 
	if( X1 < 0.09 ) { 
	if( Z21 >= 9.69 ) { 
	if( Z23 < 9.75 ) { 
		if( X30 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X30 >= 0.09 ) { return new Prediction("Left", 12, 0); }
	}
	if( Z23 >= 9.75 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X11 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z21 < 9.69 ) { return new Prediction("Left", 76, 0); }
	}
	if( X1 >= 0.09 ) { 
	if( Z5 < 9.73 ) { 
	if( Z20 >= 9.76 ) { 
	if( Z14 < 9.59 ) { 
		if( Z2 >= 9.88 ) { return new Prediction("Right", 16, 0); }
	if( Z2 < 9.88 ) { 
		if( X7 >= 0.1 ) { return new Prediction("Right", 6, 0); }
	if( X7 < 0.1 ) { 
		if( X6 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
		if( Z14 >= 9.59 ) { return new Prediction("Right", 36, 0); }
	}
	if( Z20 < 9.76 ) { 
	if( Z29 < 9.71 ) { 
	if( Z18 < 9.63 ) { 
		if( X9 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.08 ) { return new Prediction("Right", 4, 0); }
	}
		if( Z18 >= 9.63 ) { return new Prediction("Left", 37, 0); }
	}
	if( Z29 >= 9.71 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	if( Z5 >= 9.73 ) { 
		if( Z19 >= 9.77 ) { return new Prediction("Left", 55, 0); }
	if( Z19 < 9.77 ) { 
	if( Z2 < 9.6 ) { 
		if( X1 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z2 >= 9.6 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree18() {
	if( Z23 < 9.77 ) { 
	if( Z4 < 9.91 ) { 
	if( Z19 >= 9.81 ) { 
		if( Y1 >= -0.09 ) { return new Prediction("Right", 2, 0); }
		if( Y1 < -0.09 ) { return new Prediction("Left", 105, 0); }
	}
	if( Z19 < 9.81 ) { 
	if( Z25 < 9.78 ) { 
	if( Z29 >= 9.72 ) { 
	if( Y21 >= -0.1 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Right", 19, 0); }
	if( X30 < 0.1 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y21 < -0.1 ) { 
	if( Z3 < 9.8 ) { 
		if( X19 >= 0.08 ) { return new Prediction("Left", 22, 0); }
		if( X19 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z3 >= 9.8 ) { 
	if( Z10 >= 9.73 ) { 
		if( Z1 >= 9.85 ) { return new Prediction("Right", 2, 0); }
		if( Z1 < 9.85 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z10 < 9.73 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	if( Z29 < 9.72 ) { 
	if( X26 < 0.09 ) { 
		if( X2 < 0.1 ) { return new Prediction("Left", 8, 0); }
	if( X2 >= 0.1 ) { 
		if( Z28 < 9.63 ) { return new Prediction("Left", 1, 0); }
		if( Z28 >= 9.63 ) { return new Prediction("Right", 10, 0); }
	}
	}
	if( X26 >= 0.09 ) { 
		if( Z1 >= 9.87 ) { return new Prediction("Right", 3, 0); }
	if( Z1 < 9.87 ) { 
	if( X32 < 0.12 ) { 
	if( Y16 >= -0.13 ) { 
		if( Y5 >= -0.13 ) { return new Prediction("Left", 79, 0); }
	if( Y5 < -0.13 ) { 
		if( X25 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X25 < 0.11 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Y16 < -0.13 ) { 
		if( X13 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	if( X13 < 0.1 ) { 
		if( X27 >= 0.1 ) { return new Prediction("Right", 4, 0); }
		if( X27 < 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
		if( X32 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
		if( Z22 >= 9.72 ) { return new Prediction("Right", 16, 0); }
	if( Z22 < 9.72 ) { 
		if( Z12 < 9.47 ) { return new Prediction("Left", 4, 0); }
	if( Z12 >= 9.47 ) { 
		if( Z15 >= 9.69 ) { return new Prediction("Right", 8, 0); }
		if( Z15 < 9.69 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	if( Z4 >= 9.91 ) { 
		if( X9 < 0.08 ) { return new Prediction("Left", 4, 0); }
		if( X9 >= 0.08 ) { return new Prediction("Right", 19, 0); }
	}
	}
	if( Z23 >= 9.77 ) { 
		if( Z13 < 9.52 ) { return new Prediction("Left", 10, 0); }
	if( Z13 >= 9.52 ) { 
		if( Z32 >= 9.81 ) { return new Prediction("Right", 77, 0); }
	if( Z32 < 9.81 ) { 
	if( Z10 < 9.57 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 10, 0); }
	if( Y6 < -0.1 ) { 
		if( Z18 < 9.57 ) { return new Prediction("Right", 6, 0); }
	if( Z18 >= 9.57 ) { 
	if( Z6 >= 9.72 ) { 
		if( Z16 < 9.67 ) { return new Prediction("Left", 1, 0); }
		if( Z16 >= 9.67 ) { return new Prediction("Right", 5, 0); }
	}
	if( Z6 < 9.72 ) { 
		if( X29 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X29 >= 0.09 ) { return new Prediction("Left", 7, 0); }
	}
	}
	}
	}
	if( Z10 >= 9.57 ) { 
		if( X3 < 0.11 ) { return new Prediction("Right", 62, 0); }
	if( X3 >= 0.11 ) { 
		if( X20 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X20 >= 0.1 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree19() {
	if( Z10 >= 9.73 ) { 
	if( Z24 < 9.65 ) { 
		if( Y16 < -0.14 ) { return new Prediction("Right", 2, 0); }
	if( Y16 >= -0.14 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 82, 0); }
	if( Y4 >= -0.11 ) { 
		if( Z20 < 9.78 ) { return new Prediction("Right", 4, 0); }
		if( Z20 >= 9.78 ) { return new Prediction("Left", 24, 0); }
	}
	}
	}
	if( Z24 >= 9.65 ) { 
	if( X26 < 0.09 ) { 
	if( Z13 < 9.66 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X23 < 0.1 ) { return new Prediction("Left", 8, 0); }
	}
	if( Z13 >= 9.66 ) { 
	if( X9 < 0.09 ) { 
		if( X8 >= 0.1 ) { return new Prediction("Right", 3, 0); }
		if( X8 < 0.1 ) { return new Prediction("Left", 4, 0); }
	}
		if( X9 >= 0.09 ) { return new Prediction("Right", 16, 0); }
	}
	}
	if( X26 >= 0.09 ) { 
	if( Z2 < 9.84 ) { 
		if( Z20 >= 9.62 ) { return new Prediction("Left", 39, 0); }
		if( Z20 < 9.62 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z2 >= 9.84 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	if( Z10 < 9.73 ) { 
	if( Z26 >= 9.58 ) { 
		if( X15 < 0.07 ) { return new Prediction("Left", 18, 0); }
	if( X15 >= 0.07 ) { 
	if( Z3 >= 9.81 ) { 
		if( Y6 >= -0.04 ) { return new Prediction("Left", 1, 0); }
		if( Y6 < -0.04 ) { return new Prediction("Right", 49, 0); }
	}
	if( Z3 < 9.81 ) { 
	if( Z25 < 9.78 ) { 
	if( X19 >= 0.11 ) { 
	if( Z30 < 9.75 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 6, 0); }
		if( X12 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z30 >= 9.75 ) { return new Prediction("Right", 9, 0); }
	}
	if( X19 < 0.11 ) { 
		if( Z24 >= 9.78 ) { return new Prediction("Right", 6, 0); }
	if( Z24 < 9.78 ) { 
		if( Z27 < 9.67 ) { return new Prediction("Left", 55, 0); }
	if( Z27 >= 9.67 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X12 < 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
		if( X18 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X18 >= 0.08 ) { return new Prediction("Right", 70, 0); }
	}
	}
	}
	}
	if( Z26 < 9.58 ) { 
	if( Y7 < -0.12 ) { 
		if( Z8 < 9.87 ) { return new Prediction("Left", 3, 0); }
		if( Z8 >= 9.87 ) { return new Prediction("Right", 16, 0); }
	}
		if( Y7 >= -0.12 ) { return new Prediction("Right", 93, 0); }
	}
	}
return null;
}
private Prediction runTree20() {
	if( Z15 < 9.82 ) { 
	if( X2 < 0.09 ) { 
	if( Z24 >= 9.78 ) { 
		if( Z9 >= 9.64 ) { return new Prediction("Right", 15, 0); }
		if( Z9 < 9.64 ) { return new Prediction("Left", 12, 0); }
	}
	if( Z24 < 9.78 ) { 
	if( X28 < 0.11 ) { 
	if( Z10 < 9.71 ) { 
		if( Z15 < 9.66 ) { return new Prediction("Right", 1, 0); }
		if( Z15 >= 9.66 ) { return new Prediction("Left", 12, 0); }
	}
		if( Z10 >= 9.71 ) { return new Prediction("Left", 65, 0); }
	}
	if( X28 >= 0.11 ) { 
	if( Z17 < 9.65 ) { 
		if( Y15 >= -0.09 ) { return new Prediction("Right", 3, 0); }
		if( Y15 < -0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z17 >= 9.65 ) { return new Prediction("Left", 23, 0); }
	}
	}
	}
	if( X2 >= 0.09 ) { 
	if( Z21 < 9.79 ) { 
	if( Z5 < 9.94 ) { 
		if( Z11 < 9.56 ) { return new Prediction("Left", 21, 0); }
	if( Z11 >= 9.56 ) { 
		if( Z23 >= 9.78 ) { return new Prediction("Right", 9, 0); }
	if( Z23 < 9.78 ) { 
	if( X32 < 0.12 ) { 
		if( Y21 < -0.13 ) { return new Prediction("Left", 21, 0); }
	if( Y21 >= -0.13 ) { 
	if( Z15 >= 9.57 ) { 
	if( Z9 < 9.77 ) { 
	if( X6 < 0.11 ) { 
	if( Y9 >= -0.1 ) { 
		if( X8 >= 0.09 ) { return new Prediction("Left", 6, 0); }
		if( X8 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	if( Y9 < -0.1 ) { 
		if( X9 < 0.1 ) { return new Prediction("Right", 23, 0); }
		if( X9 >= 0.1 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( X6 >= 0.11 ) { 
	if( X14 < 0.12 ) { 
		if( Y12 < -0.1 ) { return new Prediction("Left", 20, 0); }
	if( Y12 >= -0.1 ) { 
		if( X11 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X11 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( X14 >= 0.12 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z9 >= 9.77 ) { 
	if( Z7 < 9.83 ) { 
	if( Y10 >= -0.12 ) { 
		if( Z6 >= 9.65 ) { return new Prediction("Left", 19, 0); }
	if( Z6 < 9.65 ) { 
	if( Z20 >= 9.76 ) { 
		if( X22 < 0.11 ) { return new Prediction("Right", 5, 0); }
		if( X22 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z20 < 9.76 ) { return new Prediction("Left", 8, 0); }
	}
	}
		if( Y10 < -0.12 ) { return new Prediction("Left", 31, 0); }
	}
		if( Z7 >= 9.83 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z15 < 9.57 ) { 
		if( Y29 >= -0.1 ) { return new Prediction("Right", 9, 0); }
		if( Y29 < -0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( X32 >= 0.12 ) { return new Prediction("Right", 10, 0); }
	}
	}
	}
		if( Z5 >= 9.94 ) { return new Prediction("Right", 13, 0); }
	}
		if( Z21 >= 9.79 ) { return new Prediction("Right", 15, 0); }
	}
	}
	if( Z15 >= 9.82 ) { 
	if( Z31 < 9.77 ) { 
		if( Y9 >= -0.1 ) { return new Prediction("Right", 2, 0); }
	if( Y9 < -0.1 ) { 
		if( X11 >= 0.11 ) { return new Prediction("Left", 11, 0); }
		if( X11 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z31 >= 9.77 ) { 
	if( Y2 < -0.12 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 2, 0); }
	if( X27 >= 0.09 ) { 
	if( Z28 < 9.61 ) { 
		if( Y31 < -0.11 ) { return new Prediction("Left", 3, 0); }
		if( Y31 >= -0.11 ) { return new Prediction("Right", 6, 0); }
	}
		if( Z28 >= 9.61 ) { return new Prediction("Right", 42, 0); }
	}
	}
		if( Y2 >= -0.12 ) { return new Prediction("Right", 95, 0); }
	}
	}
return null;
}
private Prediction runTree21() {
	if( Z25 < 9.78 ) { 
	if( Z7 >= 9.87 ) { 
		if( Y23 < -0.14 ) { return new Prediction("Left", 1, 0); }
	if( Y23 >= -0.14 ) { 
		if( Y24 >= -0.09 ) { return new Prediction("Left", 1, 0); }
		if( Y24 < -0.09 ) { return new Prediction("Right", 27, 0); }
	}
	}
	if( Z7 < 9.87 ) { 
		if( Z17 < 9.57 ) { return new Prediction("Right", 18, 0); }
	if( Z17 >= 9.57 ) { 
	if( Z11 < 9.79 ) { 
		if( Z31 >= 9.82 ) { return new Prediction("Right", 9, 0); }
	if( Z31 < 9.82 ) { 
	if( Y17 < -0.13 ) { 
	if( Z22 >= 9.67 ) { 
		if( Y13 >= -0.11 ) { return new Prediction("Right", 15, 0); }
		if( Y13 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z22 < 9.67 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Right", 3, 0); }
	if( X11 < 0.12 ) { 
		if( Z30 >= 9.65 ) { return new Prediction("Left", 11, 0); }
	if( Z30 < 9.65 ) { 
		if( X30 >= 0.11 ) { return new Prediction("Left", 4, 0); }
		if( X30 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Y17 >= -0.13 ) { 
	if( Y3 < -0.13 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 8, 0); }
	}
	if( Y3 >= -0.13 ) { 
	if( Z8 < 9.8 ) { 
	if( Y14 < -0.13 ) { 
		if( Z3 < 9.57 ) { return new Prediction("Right", 8, 0); }
	if( Z3 >= 9.57 ) { 
		if( Y3 < -0.12 ) { return new Prediction("Left", 3, 0); }
	if( Y3 >= -0.12 ) { 
		if( X26 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X26 >= 0.09 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
	if( Y14 >= -0.13 ) { 
	if( Z12 >= 9.72 ) { 
	if( X4 < 0.1 ) { 
	if( Z1 < 9.88 ) { 
		if( X24 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X24 < 0.12 ) { return new Prediction("Left", 27, 0); }
	}
		if( Z1 >= 9.88 ) { return new Prediction("Right", 1, 0); }
	}
	if( X4 >= 0.1 ) { 
	if( X20 >= 0.09 ) { 
	if( Z1 >= 9.82 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Right", 8, 0); }
		if( X19 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z1 < 9.82 ) { return new Prediction("Left", 7, 0); }
	}
		if( X20 < 0.09 ) { return new Prediction("Right", 6, 0); }
	}
	}
	if( Z12 < 9.72 ) { 
	if( Z23 < 9.82 ) { 
		if( Y6 >= -0.13 ) { return new Prediction("Left", 69, 0); }
	if( Y6 < -0.13 ) { 
		if( X9 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X9 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z23 >= 9.82 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
		if( Z8 >= 9.8 ) { return new Prediction("Left", 31, 0); }
	}
	}
	}
	}
	if( Z11 >= 9.79 ) { 
	if( Z15 >= 9.57 ) { 
	if( Z9 < 9.68 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X1 < 0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z9 >= 9.68 ) { return new Prediction("Left", 64, 0); }
	}
	if( Z15 < 9.57 ) { 
	if( Y24 < -0.11 ) { 
		if( Z12 < 9.74 ) { return new Prediction("Right", 2, 0); }
		if( Z12 >= 9.74 ) { return new Prediction("Left", 18, 0); }
	}
		if( Y24 >= -0.11 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
	if( Z16 >= 9.74 ) { 
	if( Z23 < 9.74 ) { 
		if( Z1 >= 9.71 ) { return new Prediction("Left", 2, 0); }
	if( Z1 < 9.71 ) { 
		if( X18 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X18 >= 0.08 ) { return new Prediction("Right", 9, 0); }
	}
	}
		if( Z23 >= 9.74 ) { return new Prediction("Right", 91, 0); }
	}
	if( Z16 < 9.74 ) { 
	if( Y13 < -0.1 ) { 
		if( X29 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X29 < 0.11 ) { return new Prediction("Right", 33, 0); }
	}
	if( Y13 >= -0.1 ) { 
	if( X15 < 0.1 ) { 
		if( Z31 >= 9.81 ) { return new Prediction("Right", 1, 0); }
		if( Z31 < 9.81 ) { return new Prediction("Left", 13, 0); }
	}
		if( X15 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree22() {
	if( Z23 >= 9.78 ) { 
	if( Y26 >= -0.13 ) { 
		if( Z13 < 9.52 ) { return new Prediction("Left", 4, 0); }
	if( Z13 >= 9.52 ) { 
	if( Z31 < 9.77 ) { 
		if( Z8 < 9.68 ) { return new Prediction("Right", 4, 0); }
		if( Z8 >= 9.68 ) { return new Prediction("Left", 7, 0); }
	}
	if( Z31 >= 9.77 ) { 
		if( Z19 < 9.57 ) { return new Prediction("Right", 132, 0); }
	if( Z19 >= 9.57 ) { 
		if( X14 < 0.12 ) { return new Prediction("Right", 18, 0); }
		if( X14 >= 0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
		if( Y26 < -0.13 ) { return new Prediction("Left", 4, 0); }
	}
	if( Z23 < 9.78 ) { 
	if( Z11 < 9.84 ) { 
	if( Z7 >= 9.85 ) { 
		if( Y10 >= -0.12 ) { return new Prediction("Right", 16, 0); }
		if( Y10 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z7 < 9.85 ) { 
		if( Z1 >= 9.91 ) { return new Prediction("Right", 18, 0); }
	if( Z1 < 9.91 ) { 
	if( Y22 < -0.1 ) { 
		if( Z20 >= 9.81 ) { return new Prediction("Left", 42, 0); }
	if( Z20 < 9.81 ) { 
	if( Z11 < 9.64 ) { 
		if( Z23 >= 9.64 ) { return new Prediction("Left", 54, 0); }
		if( Z23 < 9.64 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z11 >= 9.64 ) { 
	if( Y5 >= -0.1 ) { 
	if( X1 < 0.09 ) { 
		if( X6 < 0.08 ) { return new Prediction("Left", 4, 0); }
		if( X6 >= 0.08 ) { return new Prediction("Right", 2, 0); }
	}
		if( X1 >= 0.09 ) { return new Prediction("Right", 17, 0); }
	}
	if( Y5 < -0.1 ) { 
	if( Z22 < 9.69 ) { 
	if( X18 < 0.1 ) { 
		if( X14 < 0.09 ) { return new Prediction("Left", 17, 0); }
	if( X14 >= 0.09 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 7, 0); }
	if( X24 < 0.1 ) { 
		if( Z3 < 9.8 ) { return new Prediction("Left", 4, 0); }
	if( Z3 >= 9.8 ) { 
		if( X6 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X6 >= 0.09 ) { return new Prediction("Right", 8, 0); }
	}
	}
	}
	}
		if( X18 >= 0.1 ) { return new Prediction("Left", 29, 0); }
	}
	if( Z22 >= 9.69 ) { 
		if( Y1 < -0.12 ) { return new Prediction("Right", 9, 0); }
	if( Y1 >= -0.12 ) { 
	if( Z24 < 9.76 ) { 
		if( Z3 >= 9.82 ) { return new Prediction("Right", 3, 0); }
		if( Z3 < 9.82 ) { return new Prediction("Left", 19, 0); }
	}
		if( Z24 >= 9.76 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( Y22 >= -0.1 ) { 
	if( X3 >= 0.09 ) { 
	if( Z2 >= 9.82 ) { 
		if( Y27 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y27 >= -0.13 ) { return new Prediction("Right", 25, 0); }
	}
	if( Z2 < 9.82 ) { 
		if( X8 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X8 < 0.12 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( X3 < 0.09 ) { 
		if( Y1 >= -0.09 ) { return new Prediction("Right", 1, 0); }
		if( Y1 < -0.09 ) { return new Prediction("Left", 7, 0); }
	}
	}
	}
	}
	}
	if( Z11 >= 9.84 ) { 
		if( Z27 < 9.8 ) { return new Prediction("Left", 52, 0); }
		if( Z27 >= 9.8 ) { return new Prediction("Right", 2, 0); }
	}
	}
return null;
}
private Prediction runTree23() {
	if( Z21 >= 9.73 ) { 
	if( Z15 >= 9.85 ) { 
		if( Z20 < 9.56 ) { return new Prediction("Right", 101, 0); }
	if( Z20 >= 9.56 ) { 
	if( X5 < 0.11 ) { 
	if( Y4 < -0.13 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X3 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y4 >= -0.13 ) { return new Prediction("Right", 30, 0); }
	}
		if( X5 >= 0.11 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( Z15 < 9.85 ) { 
	if( Z29 >= 9.72 ) { 
	if( Z14 >= 9.61 ) { 
		if( X1 < 0.14 ) { return new Prediction("Right", 42, 0); }
		if( X1 >= 0.14 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z14 < 9.61 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z29 < 9.72 ) { 
	if( X17 < 0.1 ) { 
		if( X21 < 0.1 ) { return new Prediction("Left", 20, 0); }
		if( X21 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	if( X17 >= 0.1 ) { 
		if( Z27 >= 9.61 ) { return new Prediction("Right", 11, 0); }
	if( Z27 < 9.61 ) { 
		if( Z5 >= 9.61 ) { return new Prediction("Left", 3, 0); }
		if( Z5 < 9.61 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
	if( Z21 < 9.73 ) { 
	if( Z21 < 9.57 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Right", 28, 0); }
		if( X17 < 0.08 ) { return new Prediction("Left", 5, 0); }
	}
	if( Z21 >= 9.57 ) { 
	if( Z13 >= 9.79 ) { 
		if( Y14 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y14 >= -0.13 ) { return new Prediction("Left", 70, 0); }
	}
	if( Z13 < 9.79 ) { 
		if( X15 < 0.08 ) { return new Prediction("Left", 37, 0); }
	if( X15 >= 0.08 ) { 
	if( X10 >= 0.11 ) { 
	if( Y20 >= -0.12 ) { 
	if( Z14 < 9.75 ) { 
	if( Z12 < 9.68 ) { 
		if( X8 < 0.17 ) { return new Prediction("Left", 9, 0); }
		if( X8 >= 0.17 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z12 >= 9.68 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Right", 12, 0); }
	if( X5 < 0.1 ) { 
		if( Y1 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y1 < -0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
		if( Z14 >= 9.75 ) { return new Prediction("Right", 16, 0); }
	}
		if( Y20 < -0.12 ) { return new Prediction("Left", 7, 0); }
	}
	if( X10 < 0.11 ) { 
	if( Z2 >= 9.88 ) { 
		if( Z11 < 9.78 ) { return new Prediction("Right", 10, 0); }
		if( Z11 >= 9.78 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z2 < 9.88 ) { 
	if( Y1 >= -0.1 ) { 
	if( X4 >= 0.08 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 2, 0); }
	if( X3 >= 0.08 ) { 
	if( Y26 >= -0.11 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y26 < -0.11 ) { return new Prediction("Right", 8, 0); }
	}
	}
		if( X4 < 0.08 ) { return new Prediction("Left", 6, 0); }
	}
	if( Y1 < -0.1 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Left", 37, 0); }
	if( X30 < 0.1 ) { 
		if( Z25 < 9.62 ) { return new Prediction("Right", 3, 0); }
	if( Z25 >= 9.62 ) { 
		if( Z17 < 9.73 ) { return new Prediction("Left", 24, 0); }
	if( Z17 >= 9.73 ) { 
	if( X32 < 0.1 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X21 < 0.11 ) { return new Prediction("Left", 11, 0); }
	}
		if( X32 >= 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree24() {
	if( Z22 < 9.7 ) { 
	if( Z19 >= 9.82 ) { 
		if( X23 >= 0.09 ) { return new Prediction("Left", 94, 0); }
	if( X23 < 0.09 ) { 
		if( X10 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X10 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z19 < 9.82 ) { 
		if( Z17 < 9.62 ) { return new Prediction("Right", 8, 0); }
	if( Z17 >= 9.62 ) { 
	if( Z32 >= 9.68 ) { 
	if( Z26 >= 9.63 ) { 
		if( Z8 < 9.91 ) { return new Prediction("Left", 49, 0); }
		if( Z8 >= 9.91 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z26 < 9.63 ) { 
		if( Z4 < 9.59 ) { return new Prediction("Left", 1, 0); }
		if( Z4 >= 9.59 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z32 < 9.68 ) { 
	if( Z2 < 9.87 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 25, 0); }
	if( X9 >= 0.09 ) { 
		if( Z5 >= 9.69 ) { return new Prediction("Left", 14, 0); }
	if( Z5 < 9.69 ) { 
	if( Z12 >= 9.71 ) { 
	if( X32 < 0.1 ) { 
		if( Y8 >= -0.1 ) { return new Prediction("Left", 4, 0); }
	if( Y8 < -0.1 ) { 
		if( X32 < 0.1 ) { return new Prediction("Right", 5, 0); }
		if( X32 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( X32 >= 0.1 ) { return new Prediction("Right", 10, 0); }
	}
	if( Z12 < 9.71 ) { 
		if( Z16 < 9.79 ) { return new Prediction("Left", 11, 0); }
		if( Z16 >= 9.79 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
		if( Z2 >= 9.87 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
	}
	if( Z22 >= 9.7 ) { 
	if( Z23 >= 9.78 ) { 
	if( X13 >= 0.12 ) { 
		if( Z8 >= 9.93 ) { return new Prediction("Right", 14, 0); }
	if( Z8 < 9.93 ) { 
		if( Z7 < 9.94 ) { return new Prediction("Left", 6, 0); }
		if( Z7 >= 9.94 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( X13 < 0.12 ) { 
		if( Y30 < -0.15 ) { return new Prediction("Left", 1, 0); }
	if( Y30 >= -0.15 ) { 
		if( X12 >= 0.06 ) { return new Prediction("Right", 126, 0); }
		if( X12 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z23 < 9.78 ) { 
	if( Z29 < 9.74 ) { 
	if( Z2 < 9.71 ) { 
	if( Z24 < 9.77 ) { 
		if( X17 >= 0.14 ) { return new Prediction("Right", 1, 0); }
		if( X17 < 0.14 ) { return new Prediction("Left", 51, 0); }
	}
	if( Z24 >= 9.77 ) { 
		if( X13 < 0.08 ) { return new Prediction("Left", 5, 0); }
	if( X13 >= 0.08 ) { 
		if( Y19 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y19 >= -0.13 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
		if( Z2 >= 9.71 ) { return new Prediction("Right", 8, 0); }
	}
	if( Z29 >= 9.74 ) { 
	if( Z17 < 9.66 ) { 
		if( Z13 < 9.84 ) { return new Prediction("Right", 31, 0); }
	if( Z13 >= 9.84 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z17 >= 9.66 ) { 
		if( Y1 < -0.11 ) { return new Prediction("Left", 3, 0); }
		if( Y1 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree25() {
	if( Z19 >= 9.81 ) { 
		if( Z18 < 9.75 ) { return new Prediction("Left", 76, 0); }
	if( Z18 >= 9.75 ) { 
		if( Z18 >= 9.83 ) { return new Prediction("Left", 19, 0); }
	if( Z18 < 9.83 ) { 
		if( Y23 >= -0.11 ) { return new Prediction("Left", 4, 0); }
		if( Y23 < -0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Z19 < 9.81 ) { 
	if( Z8 < 9.87 ) { 
	if( Z8 < 9.65 ) { 
	if( Z3 < 9.85 ) { 
	if( Z31 < 9.66 ) { 
		if( X31 >= 0.12 ) { return new Prediction("Right", 7, 0); }
	if( X31 < 0.12 ) { 
		if( Z22 >= 9.71 ) { return new Prediction("Right", 9, 0); }
	if( Z22 < 9.71 ) { 
	if( X20 < 0.11 ) { 
		if( X17 < 0.1 ) { return new Prediction("Left", 23, 0); }
	if( X17 >= 0.1 ) { 
		if( X16 >= 0.1 ) { return new Prediction("Left", 12, 0); }
		if( X16 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X20 >= 0.11 ) { 
	if( Z29 >= 9.68 ) { 
	if( X10 >= 0.11 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X1 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X10 < 0.11 ) { return new Prediction("Left", 10, 0); }
	}
	if( Z29 < 9.68 ) { 
		if( Y27 < -0.12 ) { return new Prediction("Left", 1, 0); }
		if( Y27 >= -0.12 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	}
	}
	if( Z31 >= 9.66 ) { 
	if( Y32 < -0.11 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X24 < 0.1 ) { return new Prediction("Right", 4, 0); }
	}
		if( Y32 >= -0.11 ) { return new Prediction("Right", 22, 0); }
	}
	}
		if( Z3 >= 9.85 ) { return new Prediction("Right", 43, 0); }
	}
	if( Z8 >= 9.65 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Left", 42, 0); }
	if( X2 < 0.11 ) { 
	if( Z31 < 9.77 ) { 
	if( X3 < 0.08 ) { 
		if( Y18 >= -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y18 < -0.11 ) { return new Prediction("Left", 3, 0); }
	}
		if( X3 >= 0.08 ) { return new Prediction("Left", 36, 0); }
	}
	if( Z31 >= 9.77 ) { 
	if( X3 >= 0.09 ) { 
		if( Z12 < 9.54 ) { return new Prediction("Left", 12, 0); }
	if( Z12 >= 9.54 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 9, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 24, 0); }
	}
	}
		if( X3 < 0.09 ) { return new Prediction("Right", 32, 0); }
	}
	}
	}
	}
	if( Z8 >= 9.87 ) { 
		if( X15 < 0.07 ) { return new Prediction("Left", 3, 0); }
	if( X15 >= 0.07 ) { 
		if( Z2 >= 9.77 ) { return new Prediction("Left", 3, 0); }
		if( Z2 < 9.77 ) { return new Prediction("Right", 114, 0); }
	}
	}
	}
return null;
}
private Prediction runTree26() {
	if( Z15 < 9.82 ) { 
	if( Z6 >= 9.87 ) { 
		if( X16 >= 0.15 ) { return new Prediction("Left", 1, 0); }
		if( X16 < 0.15 ) { return new Prediction("Right", 25, 0); }
	}
	if( Z6 < 9.87 ) { 
	if( Z24 >= 9.78 ) { 
		if( Z11 < 9.54 ) { return new Prediction("Left", 9, 0); }
		if( Z11 >= 9.54 ) { return new Prediction("Right", 30, 0); }
	}
	if( Z24 < 9.78 ) { 
	if( X30 < 0.09 ) { 
		if( Z15 < 9.51 ) { return new Prediction("Right", 1, 0); }
	if( Z15 >= 9.51 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 58, 0); }
	if( X12 < 0.1 ) { 
	if( X15 < 0.11 ) { 
	if( Z25 >= 9.69 ) { 
		if( X20 >= 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X20 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z25 < 9.69 ) { return new Prediction("Left", 23, 0); }
	}
		if( X15 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( X30 >= 0.09 ) { 
	if( Z32 < 9.62 ) { 
		if( X1 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X1 < 0.12 ) { return new Prediction("Left", 42, 0); }
	}
	if( Z32 >= 9.62 ) { 
	if( Z20 >= 9.58 ) { 
	if( X12 < 0.09 ) { 
		if( X16 >= 0.08 ) { return new Prediction("Left", 35, 0); }
		if( X16 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	if( X12 >= 0.09 ) { 
	if( Y28 >= -0.1 ) { 
		if( Y25 < -0.1 ) { return new Prediction("Right", 15, 0); }
	if( Y25 >= -0.1 ) { 
		if( Y10 >= -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y10 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y28 < -0.1 ) { 
	if( Z28 < 9.78 ) { 
	if( Z16 >= 9.57 ) { 
		if( Z11 >= 9.81 ) { return new Prediction("Left", 24, 0); }
	if( Z11 < 9.81 ) { 
	if( Y7 >= -0.11 ) { 
		if( X13 >= 0.1 ) { return new Prediction("Right", 8, 0); }
	if( X13 < 0.1 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X19 < 0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Y7 < -0.11 ) { 
	if( X4 < 0.11 ) { 
	if( X1 < 0.1 ) { 
		if( X17 < 0.11 ) { return new Prediction("Left", 12, 0); }
		if( X17 >= 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	if( X1 >= 0.1 ) { 
		if( X20 < 0.1 ) { return new Prediction("Right", 7, 0); }
		if( X20 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
		if( X4 >= 0.11 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
		if( Z16 < 9.57 ) { return new Prediction("Right", 6, 0); }
	}
		if( Z28 >= 9.78 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
		if( Z20 < 9.58 ) { return new Prediction("Left", 16, 0); }
	}
	}
	}
	}
	}
	if( Z15 >= 9.82 ) { 
	if( Z7 >= 9.85 ) { 
		if( X29 < 0.13 ) { return new Prediction("Right", 124, 0); }
		if( X29 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z7 < 9.85 ) { 
	if( Y7 < -0.1 ) { 
		if( X4 < 0.1 ) { return new Prediction("Right", 7, 0); }
	if( X4 >= 0.1 ) { 
		if( Z14 >= 9.84 ) { return new Prediction("Left", 11, 0); }
	if( Z14 < 9.84 ) { 
		if( X6 < 0.13 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Y7 >= -0.1 ) { return new Prediction("Right", 25, 0); }
	}
	}
return null;
}
private Prediction runTree27() {
	if( Z7 >= 9.87 ) { 
	if( Y3 < -0.12 ) { 
	if( Z1 >= 9.59 ) { 
		if( Z27 < 9.66 ) { return new Prediction("Left", 3, 0); }
		if( Z27 >= 9.66 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z1 < 9.59 ) { return new Prediction("Right", 16, 0); }
	}
		if( Y3 >= -0.12 ) { return new Prediction("Right", 98, 0); }
	}
	if( Z7 < 9.87 ) { 
	if( Y24 >= -0.09 ) { 
		if( Y12 < -0.12 ) { return new Prediction("Right", 19, 0); }
	if( Y12 >= -0.12 ) { 
		if( X25 < 0.1 ) { return new Prediction("Left", 3, 0); }
	if( X25 >= 0.1 ) { 
		if( X29 < 0.1 ) { return new Prediction("Right", 6, 0); }
		if( X29 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Y24 < -0.09 ) { 
	if( X26 >= 0.11 ) { 
	if( Z6 < 9.67 ) { 
	if( X16 >= 0.09 ) { 
	if( Z1 < 9.8 ) { 
		if( X4 >= 0.08 ) { return new Prediction("Left", 6, 0); }
		if( X4 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z1 >= 9.8 ) { return new Prediction("Right", 2, 0); }
	}
		if( X16 < 0.09 ) { return new Prediction("Left", 6, 0); }
	}
	if( Z6 >= 9.67 ) { 
		if( X11 >= 0.13 ) { return new Prediction("Left", 2, 0); }
	if( X11 < 0.13 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Right", 25, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X26 < 0.11 ) { 
		if( X22 < 0.07 ) { return new Prediction("Right", 5, 0); }
	if( X22 >= 0.07 ) { 
	if( Z22 >= 9.71 ) { 
	if( Z18 < 9.75 ) { 
	if( Z3 >= 9.61 ) { 
	if( Z13 < 9.85 ) { 
		if( X24 >= 0.09 ) { return new Prediction("Right", 21, 0); }
		if( X24 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z13 >= 9.85 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z3 < 9.61 ) { 
	if( Z24 >= 9.79 ) { 
		if( X14 < 0.13 ) { return new Prediction("Right", 7, 0); }
		if( X14 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z24 < 9.79 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	if( X21 < 0.11 ) { 
		if( Y1 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y1 >= -0.13 ) { return new Prediction("Left", 43, 0); }
	}
	}
	}
	}
		if( Z18 >= 9.75 ) { return new Prediction("Right", 25, 0); }
	}
	if( Z22 < 9.71 ) { 
	if( Z31 < 9.62 ) { 
	if( X30 >= 0.11 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 11, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( X30 < 0.11 ) { return new Prediction("Left", 69, 0); }
	}
	if( Z31 >= 9.62 ) { 
	if( Z15 < 9.58 ) { 
	if( Z12 >= 9.7 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.08 ) { return new Prediction("Right", 20, 0); }
	}
	if( Z12 < 9.7 ) { 
		if( Y31 < -0.1 ) { return new Prediction("Left", 13, 0); }
		if( Y31 >= -0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z15 >= 9.58 ) { 
		if( X32 < 0.09 ) { return new Prediction("Left", 20, 0); }
	if( X32 >= 0.09 ) { 
		if( Z19 >= 9.8 ) { return new Prediction("Left", 23, 0); }
	if( Z19 < 9.8 ) { 
		if( X12 >= 0.12 ) { return new Prediction("Left", 13, 0); }
	if( X12 < 0.12 ) { 
	if( Z27 >= 9.74 ) { 
	if( Z20 >= 9.75 ) { 
		if( Z24 < 9.68 ) { return new Prediction("Right", 12, 0); }
	if( Z24 >= 9.68 ) { 
		if( Y4 >= -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y4 < -0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( Z20 < 9.75 ) { return new Prediction("Left", 7, 0); }
	}
	if( Z27 < 9.74 ) { 
	if( Y26 < -0.1 ) { 
	if( Z1 >= 9.82 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z1 < 9.82 ) { return new Prediction("Left", 20, 0); }
	}
		if( Y26 >= -0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree28() {
	if( Z20 >= 9.8 ) { 
		if( Z13 >= 9.8 ) { return new Prediction("Left", 68, 0); }
	if( Z13 < 9.8 ) { 
	if( X1 < 0.09 ) { 
		if( Z2 >= 9.64 ) { return new Prediction("Left", 36, 0); }
		if( Z2 < 9.64 ) { return new Prediction("Right", 2, 0); }
	}
	if( X1 >= 0.09 ) { 
	if( Y27 < -0.11 ) { 
		if( Z12 >= 9.85 ) { return new Prediction("Left", 1, 0); }
		if( Z12 < 9.85 ) { return new Prediction("Right", 9, 0); }
	}
	if( Y27 >= -0.11 ) { 
		if( X12 >= 0.13 ) { return new Prediction("Right", 1, 0); }
		if( X12 < 0.13 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	}
	if( Z20 < 9.8 ) { 
	if( Z19 < 9.59 ) { 
		if( Y20 >= -0.09 ) { return new Prediction("Left", 7, 0); }
	if( Y20 < -0.09 ) { 
	if( Z16 >= 9.68 ) { 
		if( Z14 >= 9.86 ) { return new Prediction("Right", 106, 0); }
	if( Z14 < 9.86 ) { 
		if( X29 < 0.1 ) { return new Prediction("Right", 24, 0); }
	if( X29 >= 0.1 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 9, 0); }
	if( X17 >= 0.09 ) { 
		if( Z24 < 9.75 ) { return new Prediction("Left", 8, 0); }
	if( Z24 >= 9.75 ) { 
	if( Y30 >= -0.11 ) { 
		if( X16 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X16 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y30 < -0.11 ) { return new Prediction("Right", 28, 0); }
	}
	}
	}
	}
	}
	if( Z16 < 9.68 ) { 
		if( Y8 < -0.14 ) { return new Prediction("Right", 4, 0); }
		if( Y8 >= -0.14 ) { return new Prediction("Left", 21, 0); }
	}
	}
	}
	if( Z19 >= 9.59 ) { 
	if( X11 >= 0.12 ) { 
		if( Z1 < 9.83 ) { return new Prediction("Left", 23, 0); }
	if( Z1 >= 9.83 ) { 
		if( X6 < 0.13 ) { return new Prediction("Left", 2, 0); }
		if( X6 >= 0.13 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X11 < 0.12 ) { 
	if( Z30 >= 9.72 ) { 
	if( Z22 < 9.74 ) { 
	if( Z1 < 9.83 ) { 
		if( Y16 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y16 < -0.1 ) { return new Prediction("Left", 8, 0); }
	}
		if( Z1 >= 9.83 ) { return new Prediction("Right", 16, 0); }
	}
		if( Z22 >= 9.74 ) { return new Prediction("Right", 27, 0); }
	}
	if( Z30 < 9.72 ) { 
	if( X14 < 0.09 ) { 
	if( Y24 >= -0.14 ) { 
		if( X2 >= 0.07 ) { return new Prediction("Left", 20, 0); }
		if( X2 < 0.07 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y24 < -0.14 ) { return new Prediction("Right", 2, 0); }
	}
	if( X14 >= 0.09 ) { 
	if( Y8 >= -0.11 ) { 
		if( Z4 < 9.61 ) { return new Prediction("Left", 8, 0); }
	if( Z4 >= 9.61 ) { 
		if( Z25 < 9.63 ) { return new Prediction("Right", 12, 0); }
	if( Z25 >= 9.63 ) { 
	if( X20 >= 0.09 ) { 
	if( Z17 >= 9.69 ) { 
	if( Y3 >= -0.11 ) { 
		if( X4 < 0.11 ) { return new Prediction("Left", 3, 0); }
		if( X4 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y3 < -0.11 ) { return new Prediction("Right", 8, 0); }
	}
		if( Z17 < 9.69 ) { return new Prediction("Left", 6, 0); }
	}
		if( X20 < 0.09 ) { return new Prediction("Right", 10, 0); }
	}
	}
	}
	if( Y8 < -0.11 ) { 
	if( Y10 >= -0.12 ) { 
		if( X30 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X30 >= 0.09 ) { return new Prediction("Left", 21, 0); }
	}
	if( Y10 < -0.12 ) { 
		if( X11 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	if( X11 < 0.1 ) { 
		if( X6 < 0.12 ) { return new Prediction("Right", 8, 0); }
		if( X6 >= 0.12 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree29() {
	if( Z5 < 9.85 ) { 
	if( Z12 >= 9.78 ) { 
	if( Z17 < 9.62 ) { 
		if( Z2 >= 9.8 ) { return new Prediction("Right", 6, 0); }
		if( Z2 < 9.8 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z17 >= 9.62 ) { return new Prediction("Left", 92, 0); }
	}
	if( Z12 < 9.78 ) { 
	if( X19 >= 0.12 ) { 
		if( X28 < 0.12 ) { return new Prediction("Right", 41, 0); }
	if( X28 >= 0.12 ) { 
		if( X23 < 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X23 >= 0.12 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( X19 < 0.12 ) { 
	if( Z22 < 9.7 ) { 
	if( X13 < 0.09 ) { 
	if( Y12 < -0.12 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 4, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y12 >= -0.12 ) { return new Prediction("Left", 38, 0); }
	}
	if( X13 >= 0.09 ) { 
	if( Z19 >= 9.75 ) { 
	if( Z28 < 9.72 ) { 
	if( X6 < 0.09 ) { 
		if( X10 < 0.1 ) { return new Prediction("Left", 12, 0); }
		if( X10 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	if( X6 >= 0.09 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Right", 8, 0); }
	if( X12 < 0.1 ) { 
		if( Y4 < -0.1 ) { return new Prediction("Left", 4, 0); }
		if( Y4 >= -0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( Z28 >= 9.72 ) { 
		if( Z16 < 9.55 ) { return new Prediction("Left", 3, 0); }
		if( Z16 >= 9.55 ) { return new Prediction("Right", 18, 0); }
	}
	}
	if( Z19 < 9.75 ) { 
		if( Z3 < 9.7 ) { return new Prediction("Right", 2, 0); }
		if( Z3 >= 9.7 ) { return new Prediction("Left", 31, 0); }
	}
	}
	}
	if( Z22 >= 9.7 ) { 
	if( Z26 >= 9.58 ) { 
	if( X11 >= 0.08 ) { 
		if( Z7 >= 9.87 ) { return new Prediction("Right", 33, 0); }
	if( Z7 < 9.87 ) { 
	if( Y22 < -0.12 ) { 
	if( Z31 >= 9.78 ) { 
		if( X3 < 0.1 ) { return new Prediction("Right", 7, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z31 < 9.78 ) { 
		if( Z30 >= 9.67 ) { return new Prediction("Left", 26, 0); }
	if( Z30 < 9.67 ) { 
		if( X21 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X21 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Y22 >= -0.12 ) { 
	if( X2 >= 0.11 ) { 
		if( X5 < 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X5 >= 0.12 ) { return new Prediction("Left", 6, 0); }
	}
		if( X2 < 0.11 ) { return new Prediction("Right", 38, 0); }
	}
	}
	}
		if( X11 < 0.08 ) { return new Prediction("Left", 12, 0); }
	}
		if( Z26 < 9.58 ) { return new Prediction("Right", 70, 0); }
	}
	}
	}
	}
	if( Z5 >= 9.85 ) { 
	if( Y3 < -0.12 ) { 
	if( X23 >= 0.1 ) { 
		if( Y12 < -0.13 ) { return new Prediction("Right", 6, 0); }
		if( Y12 >= -0.13 ) { return new Prediction("Left", 5, 0); }
	}
		if( X23 < 0.1 ) { return new Prediction("Right", 8, 0); }
	}
		if( Y3 >= -0.12 ) { return new Prediction("Right", 34, 0); }
	}
return null;
}
private Prediction runTree30() {
	if( Z12 >= 9.79 ) { 
	if( Y1 >= -0.1 ) { 
		if( Y22 < -0.1 ) { return new Prediction("Right", 7, 0); }
		if( Y22 >= -0.1 ) { return new Prediction("Left", 3, 0); }
	}
	if( Y1 < -0.1 ) { 
	if( Z31 < 9.66 ) { 
	if( Y30 >= -0.1 ) { 
		if( Y25 >= -0.13 ) { return new Prediction("Left", 12, 0); }
		if( Y25 < -0.13 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y30 < -0.1 ) { return new Prediction("Left", 82, 0); }
	}
	if( Z31 >= 9.66 ) { 
		if( X18 < 0.1 ) { return new Prediction("Right", 5, 0); }
	if( X18 >= 0.1 ) { 
		if( Y21 < -0.11 ) { return new Prediction("Left", 6, 0); }
		if( Y21 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z12 < 9.79 ) { 
	if( Z31 >= 9.78 ) { 
	if( Z17 < 9.67 ) { 
		if( Y7 < -0.1 ) { return new Prediction("Left", 5, 0); }
		if( Y7 >= -0.1 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z17 >= 9.67 ) { 
	if( Y14 < -0.12 ) { 
	if( X16 >= 0.08 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 1, 0); }
	if( X10 >= 0.08 ) { 
		if( X15 < 0.13 ) { return new Prediction("Right", 75, 0); }
	if( X15 >= 0.13 ) { 
		if( X10 < 0.13 ) { return new Prediction("Left", 1, 0); }
		if( X10 >= 0.13 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
		if( X16 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y14 >= -0.12 ) { return new Prediction("Right", 68, 0); }
	}
	}
	if( Z31 < 9.78 ) { 
		if( Z6 >= 9.87 ) { return new Prediction("Right", 21, 0); }
	if( Z6 < 9.87 ) { 
		if( X13 < 0.08 ) { return new Prediction("Left", 27, 0); }
	if( X13 >= 0.08 ) { 
	if( Y5 < -0.09 ) { 
	if( Z13 >= 9.54 ) { 
	if( Z31 < 9.76 ) { 
	if( Y21 < -0.12 ) { 
		if( Y2 >= -0.14 ) { return new Prediction("Left", 42, 0); }
		if( Y2 < -0.14 ) { return new Prediction("Right", 1, 0); }
	}
	if( Y21 >= -0.12 ) { 
	if( Y3 < -0.12 ) { 
	if( Z16 >= 9.7 ) { 
		if( Y12 < -0.1 ) { return new Prediction("Left", 3, 0); }
		if( Y12 >= -0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z16 < 9.7 ) { return new Prediction("Right", 16, 0); }
	}
	if( Y3 >= -0.12 ) { 
	if( Z11 < 9.72 ) { 
		if( X4 >= 0.08 ) { return new Prediction("Left", 21, 0); }
	if( X4 < 0.08 ) { 
		if( X18 < 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X18 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z11 >= 9.72 ) { 
		if( X1 < 0.1 ) { return new Prediction("Left", 13, 0); }
	if( X1 >= 0.1 ) { 
	if( Y9 < -0.11 ) { 
		if( X31 < 0.09 ) { return new Prediction("Left", 3, 0); }
	if( X31 >= 0.09 ) { 
	if( Y11 < -0.13 ) { 
		if( X15 < 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X15 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y11 >= -0.13 ) { return new Prediction("Right", 11, 0); }
	}
	}
		if( Y9 >= -0.11 ) { return new Prediction("Left", 6, 0); }
	}
	}
	}
	}
	}
	if( Z31 >= 9.76 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Left", 4, 0); }
	if( X1 < 0.11 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 21, 0); }
	if( X4 >= 0.12 ) { 
		if( X7 >= 0.13 ) { return new Prediction("Right", 1, 0); }
		if( X7 < 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
		if( Z13 < 9.54 ) { return new Prediction("Left", 12, 0); }
	}
	if( Y5 >= -0.09 ) { 
		if( Y6 < -0.09 ) { return new Prediction("Right", 18, 0); }
	if( Y6 >= -0.09 ) { 
		if( Y25 >= -0.11 ) { return new Prediction("Left", 3, 0); }
	if( Y25 < -0.11 ) { 
		if( X14 >= 0.07 ) { return new Prediction("Right", 9, 0); }
		if( X14 < 0.07 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree31() {
	if( Z19 >= 9.81 ) { 
		if( Z4 < 9.95 ) { return new Prediction("Left", 98, 0); }
	if( Z4 >= 9.95 ) { 
		if( X9 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X9 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z19 < 9.81 ) { 
	if( Z32 < 9.78 ) { 
	if( Z8 >= 9.66 ) { 
	if( Z25 >= 9.77 ) { 
		if( X18 >= 0.11 ) { return new Prediction("Right", 20, 0); }
	if( X18 < 0.11 ) { 
		if( X14 < 0.08 ) { return new Prediction("Left", 13, 0); }
	if( X14 >= 0.08 ) { 
		if( X4 < 0.11 ) { return new Prediction("Right", 6, 0); }
		if( X4 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z25 < 9.77 ) { 
		if( Y32 >= -0.09 ) { return new Prediction("Right", 2, 0); }
	if( Y32 < -0.09 ) { 
		if( Z16 >= 9.77 ) { return new Prediction("Left", 28, 0); }
	if( Z16 < 9.77 ) { 
		if( Z25 < 9.59 ) { return new Prediction("Right", 4, 0); }
	if( Z25 >= 9.59 ) { 
	if( Z6 < 9.88 ) { 
		if( X29 < 0.08 ) { return new Prediction("Right", 1, 0); }
	if( X29 >= 0.08 ) { 
	if( X24 >= 0.11 ) { 
		if( X31 >= 0.11 ) { return new Prediction("Left", 3, 0); }
		if( X31 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( X24 < 0.11 ) { return new Prediction("Left", 38, 0); }
	}
	}
	if( Z6 >= 9.88 ) { 
		if( X18 >= 0.14 ) { return new Prediction("Left", 2, 0); }
		if( X18 < 0.14 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	}
	}
	if( Z8 < 9.66 ) { 
	if( Z31 < 9.66 ) { 
	if( Z12 >= 9.7 ) { 
	if( Z5 < 9.73 ) { 
	if( X11 >= 0.09 ) { 
		if( Y21 < -0.12 ) { return new Prediction("Left", 5, 0); }
	if( Y21 >= -0.12 ) { 
	if( X15 >= 0.09 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 32, 0); }
	}
	if( X15 < 0.09 ) { 
		if( Z23 < 9.63 ) { return new Prediction("Right", 5, 0); }
		if( Z23 >= 9.63 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	if( X11 < 0.09 ) { 
		if( Z24 >= 9.61 ) { return new Prediction("Left", 9, 0); }
		if( Z24 < 9.61 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z5 >= 9.73 ) { 
		if( X19 >= 0.08 ) { return new Prediction("Left", 15, 0); }
		if( X19 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z12 < 9.7 ) { return new Prediction("Left", 12, 0); }
	}
	if( Z31 >= 9.66 ) { 
		if( Y11 < -0.12 ) { return new Prediction("Right", 35, 0); }
	if( Y11 >= -0.12 ) { 
	if( Y13 >= -0.11 ) { 
		if( Y15 >= -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y15 < -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y13 < -0.11 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	}
	if( Z32 >= 9.78 ) { 
	if( Z6 < 9.75 ) { 
		if( X7 >= 0.12 ) { return new Prediction("Left", 3, 0); }
	if( X7 < 0.12 ) { 
	if( Y26 >= -0.13 ) { 
		if( Z22 >= 9.79 ) { return new Prediction("Right", 75, 0); }
	if( Z22 < 9.79 ) { 
	if( X13 >= 0.07 ) { 
		if( Z13 >= 9.47 ) { return new Prediction("Right", 22, 0); }
		if( Z13 < 9.47 ) { return new Prediction("Left", 1, 0); }
	}
		if( X13 < 0.07 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Y26 < -0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z6 >= 9.75 ) { return new Prediction("Right", 61, 0); }
	}
	}
return null;
}
private Prediction runTree32() {
	if( Z20 < 9.6 ) { 
	if( Z32 < 9.78 ) { 
		if( X13 < 0.09 ) { return new Prediction("Left", 19, 0); }
	if( X13 >= 0.09 ) { 
		if( Z16 < 9.64 ) { return new Prediction("Left", 12, 0); }
	if( Z16 >= 9.64 ) { 
	if( X3 < 0.12 ) { 
	if( X26 >= 0.1 ) { 
		if( Z16 < 9.8 ) { return new Prediction("Right", 33, 0); }
	if( Z16 >= 9.8 ) { 
		if( Y7 < -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y7 >= -0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( X26 < 0.1 ) { 
		if( Y26 >= -0.11 ) { return new Prediction("Left", 4, 0); }
		if( Y26 < -0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( X3 >= 0.12 ) { 
		if( X18 < 0.12 ) { return new Prediction("Left", 7, 0); }
		if( X18 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z32 >= 9.78 ) { 
	if( Z15 < 9.88 ) { 
	if( X11 >= 0.13 ) { 
		if( Y7 < -0.13 ) { return new Prediction("Left", 4, 0); }
		if( Y7 >= -0.13 ) { return new Prediction("Right", 1, 0); }
	}
	if( X11 < 0.13 ) { 
		if( Z17 < 9.64 ) { return new Prediction("Left", 1, 0); }
	if( Z17 >= 9.64 ) { 
	if( Y30 >= -0.11 ) { 
		if( X12 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X12 >= 0.08 ) { return new Prediction("Right", 5, 0); }
	}
		if( Y30 < -0.11 ) { return new Prediction("Right", 39, 0); }
	}
	}
	}
		if( Z15 >= 9.88 ) { return new Prediction("Right", 82, 0); }
	}
	}
	if( Z20 >= 9.6 ) { 
	if( Z12 >= 9.81 ) { 
		if( Z17 >= 9.59 ) { return new Prediction("Left", 91, 0); }
		if( Z17 < 9.59 ) { return new Prediction("Right", 10, 0); }
	}
	if( Z12 < 9.81 ) { 
	if( Z9 >= 9.73 ) { 
	if( Z2 >= 9.88 ) { 
	if( Y25 < -0.09 ) { 
		if( X15 < 0.11 ) { return new Prediction("Right", 10, 0); }
		if( X15 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y25 >= -0.09 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z2 < 9.88 ) { 
	if( X3 >= 0.09 ) { 
		if( Z19 < 9.73 ) { return new Prediction("Left", 19, 0); }
	if( Z19 >= 9.73 ) { 
	if( Z5 < 9.71 ) { 
	if( Z31 >= 9.64 ) { 
		if( Z19 >= 9.76 ) { return new Prediction("Right", 12, 0); }
	if( Z19 < 9.76 ) { 
		if( X8 >= 0.08 ) { return new Prediction("Left", 5, 0); }
		if( X8 < 0.08 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z31 < 9.64 ) { 
		if( Z10 >= 9.81 ) { return new Prediction("Right", 2, 0); }
		if( Z10 < 9.81 ) { return new Prediction("Left", 12, 0); }
	}
	}
		if( Z5 >= 9.71 ) { return new Prediction("Left", 8, 0); }
	}
	}
		if( X3 < 0.09 ) { return new Prediction("Left", 30, 0); }
	}
	}
	if( Z9 < 9.73 ) { 
	if( Z5 < 9.79 ) { 
	if( Z20 >= 9.75 ) { 
	if( X1 < 0.08 ) { 
		if( Y22 < -0.11 ) { return new Prediction("Right", 4, 0); }
		if( Y22 >= -0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( X1 >= 0.08 ) { return new Prediction("Right", 22, 0); }
	}
	if( Z20 < 9.75 ) { 
		if( X8 >= 0.11 ) { return new Prediction("Left", 21, 0); }
	if( X8 < 0.11 ) { 
	if( Z24 < 9.77 ) { 
	if( Z5 >= 9.68 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Right", 4, 0); }
		if( X21 < 0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z5 < 9.68 ) { return new Prediction("Left", 9, 0); }
	}
		if( Z24 >= 9.77 ) { return new Prediction("Right", 12, 0); }
	}
	}
	}
		if( Z5 >= 9.79 ) { return new Prediction("Right", 23, 0); }
	}
	}
	}
return null;
}
private Prediction runTree33() {
	if( Z11 >= 9.76 ) { 
	if( Z10 >= 9.73 ) { 
	if( Z12 < 9.8 ) { 
	if( Z23 < 9.69 ) { 
	if( X11 >= 0.09 ) { 
	if( Z27 >= 9.75 ) { 
		if( X21 < 0.1 ) { return new Prediction("Right", 5, 0); }
	if( X21 >= 0.1 ) { 
	if( X5 >= 0.09 ) { 
	if( Z4 < 9.82 ) { 
		if( Z15 >= 9.62 ) { return new Prediction("Left", 4, 0); }
		if( Z15 < 9.62 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z4 >= 9.82 ) { return new Prediction("Right", 4, 0); }
	}
		if( X5 < 0.09 ) { return new Prediction("Left", 5, 0); }
	}
	}
		if( Z27 < 9.75 ) { return new Prediction("Left", 20, 0); }
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 26, 0); }
	}
		if( Z23 >= 9.69 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z12 >= 9.8 ) { return new Prediction("Left", 79, 0); }
	}
	if( Z10 < 9.73 ) { 
	if( Z20 < 9.71 ) { 
		if( X20 >= 0.09 ) { return new Prediction("Left", 8, 0); }
		if( X20 < 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z20 >= 9.71 ) { return new Prediction("Right", 22, 0); }
	}
	}
	if( Z11 < 9.76 ) { 
	if( X11 < 0.07 ) { 
		if( X25 < 0.12 ) { return new Prediction("Left", 15, 0); }
		if( X25 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	if( X11 >= 0.07 ) { 
	if( X25 < 0.09 ) { 
		if( Z5 >= 9.77 ) { return new Prediction("Right", 4, 0); }
	if( Z5 < 9.77 ) { 
		if( Z17 < 9.73 ) { return new Prediction("Left", 19, 0); }
	if( Z17 >= 9.73 ) { 
	if( X27 < 0.09 ) { 
		if( Y23 >= -0.13 ) { return new Prediction("Left", 6, 0); }
		if( Y23 < -0.13 ) { return new Prediction("Right", 2, 0); }
	}
	if( X27 >= 0.09 ) { 
	if( X21 < 0.09 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.08 ) { return new Prediction("Right", 1, 0); }
	}
		if( X21 >= 0.09 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	}
	if( X25 >= 0.09 ) { 
	if( Z11 < 9.63 ) { 
	if( X19 >= 0.09 ) { 
	if( Z7 >= 9.8 ) { 
	if( X9 < 0.14 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 97, 0); }
	if( X11 < 0.08 ) { 
		if( X17 < 0.1 ) { return new Prediction("Right", 5, 0); }
		if( X17 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( X9 >= 0.14 ) { 
	if( Y8 >= -0.13 ) { 
		if( X31 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X31 < 0.11 ) { return new Prediction("Right", 14, 0); }
	}
		if( Y8 < -0.13 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z7 < 9.8 ) { 
	if( X10 < 0.1 ) { 
		if( X25 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X25 >= 0.1 ) { return new Prediction("Right", 8, 0); }
	}
	if( X10 >= 0.1 ) { 
		if( X5 < 0.13 ) { return new Prediction("Left", 7, 0); }
		if( X5 >= 0.13 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( X19 < 0.09 ) { 
		if( Y27 < -0.12 ) { return new Prediction("Right", 10, 0); }
	if( Y27 >= -0.12 ) { 
		if( Z22 >= 9.79 ) { return new Prediction("Right", 10, 0); }
	if( Z22 < 9.79 ) { 
	if( Y8 >= -0.12 ) { 
		if( Z14 < 9.83 ) { return new Prediction("Left", 14, 0); }
		if( Z14 >= 9.83 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y8 < -0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z11 >= 9.63 ) { 
	if( Z14 < 9.6 ) { 
	if( Y20 >= -0.13 ) { 
		if( X16 < 0.11 ) { return new Prediction("Left", 26, 0); }
	if( X16 >= 0.11 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y20 < -0.13 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z14 >= 9.6 ) { 
	if( Z31 >= 9.78 ) { 
	if( Y2 < -0.12 ) { 
		if( X15 < 0.12 ) { return new Prediction("Right", 3, 0); }
		if( X15 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y2 >= -0.12 ) { return new Prediction("Right", 34, 0); }
	}
	if( Z31 < 9.78 ) { 
	if( X5 < 0.11 ) { 
	if( X22 < 0.11 ) { 
		if( Z2 >= 9.8 ) { return new Prediction("Right", 6, 0); }
	if( Z2 < 9.8 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 5, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( X22 >= 0.11 ) { return new Prediction("Right", 13, 0); }
	}
	if( X5 >= 0.11 ) { 
		if( Y25 >= -0.12 ) { return new Prediction("Left", 10, 0); }
	if( Y25 < -0.12 ) { 
		if( Z9 < 9.81 ) { return new Prediction("Right", 4, 0); }
		if( Z9 >= 9.81 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree34() {
	if( Z9 >= 9.73 ) { 
	if( Z19 < 9.61 ) { 
		if( Z17 < 9.65 ) { return new Prediction("Left", 4, 0); }
		if( Z17 >= 9.65 ) { return new Prediction("Right", 38, 0); }
	}
	if( Z19 >= 9.61 ) { 
	if( Z5 < 9.73 ) { 
	if( X7 >= 0.08 ) { 
		if( Z13 < 9.69 ) { return new Prediction("Left", 36, 0); }
	if( Z13 >= 9.69 ) { 
	if( X2 < 0.09 ) { 
		if( Z18 < 9.66 ) { return new Prediction("Right", 2, 0); }
		if( Z18 >= 9.66 ) { return new Prediction("Left", 15, 0); }
	}
	if( X2 >= 0.09 ) { 
		if( Y21 < -0.13 ) { return new Prediction("Left", 5, 0); }
	if( Y21 >= -0.13 ) { 
	if( Z18 >= 9.68 ) { 
		if( Z28 >= 9.67 ) { return new Prediction("Right", 25, 0); }
	if( Z28 < 9.67 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Left", 1, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z18 < 9.68 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X5 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
		if( X7 < 0.08 ) { return new Prediction("Left", 19, 0); }
	}
		if( Z5 >= 9.73 ) { return new Prediction("Left", 73, 0); }
	}
	}
	if( Z9 < 9.73 ) { 
	if( Z31 >= 9.78 ) { 
		if( Z12 < 9.47 ) { return new Prediction("Left", 3, 0); }
	if( Z12 >= 9.47 ) { 
	if( X13 >= 0.13 ) { 
		if( Y25 < -0.1 ) { return new Prediction("Right", 19, 0); }
		if( Y25 >= -0.1 ) { return new Prediction("Left", 4, 0); }
	}
		if( X13 < 0.13 ) { return new Prediction("Right", 114, 0); }
	}
	}
	if( Z31 < 9.78 ) { 
	if( Z6 < 9.88 ) { 
	if( X22 < 0.11 ) { 
		if( Y28 >= -0.1 ) { return new Prediction("Right", 7, 0); }
	if( Y28 < -0.1 ) { 
	if( Z24 >= 9.78 ) { 
		if( Y13 >= -0.11 ) { return new Prediction("Left", 7, 0); }
		if( Y13 < -0.11 ) { return new Prediction("Right", 11, 0); }
	}
	if( Z24 < 9.78 ) { 
		if( Z1 < 9.81 ) { return new Prediction("Left", 51, 0); }
	if( Z1 >= 9.81 ) { 
	if( Y25 >= -0.12 ) { 
		if( X23 < 0.11 ) { return new Prediction("Left", 16, 0); }
		if( X23 >= 0.11 ) { return new Prediction("Right", 4, 0); }
	}
		if( Y25 < -0.12 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	if( X22 >= 0.11 ) { 
	if( Z10 < 9.78 ) { 
		if( Z3 >= 9.81 ) { return new Prediction("Right", 17, 0); }
	if( Z3 < 9.81 ) { 
		if( Y18 >= -0.11 ) { return new Prediction("Right", 4, 0); }
		if( Y18 < -0.11 ) { return new Prediction("Left", 4, 0); }
	}
	}
		if( Z10 >= 9.78 ) { return new Prediction("Left", 3, 0); }
	}
	}
		if( Z6 >= 9.88 ) { return new Prediction("Right", 30, 0); }
	}
	}
return null;
}
private Prediction runTree35() {
	if( Z10 < 9.74 ) { 
	if( Y12 < -0.11 ) { 
	if( Z5 >= 9.75 ) { 
	if( X21 < 0.1 ) { 
		if( X8 >= 0.09 ) { return new Prediction("Right", 75, 0); }
	if( X8 < 0.09 ) { 
		if( X8 >= 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X8 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( X21 >= 0.1 ) { 
	if( Z28 >= 9.74 ) { 
		if( Z19 >= 9.77 ) { return new Prediction("Left", 3, 0); }
		if( Z19 < 9.77 ) { return new Prediction("Right", 4, 0); }
	}
		if( Z28 < 9.74 ) { return new Prediction("Right", 7, 0); }
	}
	}
	if( Z5 < 9.75 ) { 
	if( Z24 >= 9.78 ) { 
		if( X15 >= 0.06 ) { return new Prediction("Right", 112, 0); }
		if( X15 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z24 < 9.78 ) { 
		if( Z10 < 9.63 ) { return new Prediction("Left", 33, 0); }
	if( Z10 >= 9.63 ) { 
	if( Z20 < 9.72 ) { 
		if( Z9 >= 9.66 ) { return new Prediction("Left", 4, 0); }
	if( Z9 < 9.66 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X3 < 0.09 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( Z20 >= 9.72 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	}
	if( Y12 >= -0.11 ) { 
	if( X14 < 0.08 ) { 
		if( Z20 >= 9.75 ) { return new Prediction("Right", 1, 0); }
		if( Z20 < 9.75 ) { return new Prediction("Left", 20, 0); }
	}
	if( X14 >= 0.08 ) { 
	if( Y30 >= -0.11 ) { 
	if( Z15 >= 9.71 ) { 
		if( Z26 >= 9.6 ) { return new Prediction("Left", 3, 0); }
		if( Z26 < 9.6 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z15 < 9.71 ) { return new Prediction("Right", 16, 0); }
	}
	if( Y30 < -0.11 ) { 
		if( Z7 >= 9.86 ) { return new Prediction("Right", 7, 0); }
	if( Z7 < 9.86 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Left", 11, 0); }
	if( X10 < 0.11 ) { 
		if( Y19 < -0.12 ) { return new Prediction("Right", 7, 0); }
	if( Y19 >= -0.12 ) { 
		if( Z28 < 9.71 ) { return new Prediction("Left", 5, 0); }
	if( Z28 >= 9.71 ) { 
		if( X10 >= 0.06 ) { return new Prediction("Right", 2, 0); }
		if( X10 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( Z10 >= 9.74 ) { 
		if( Z32 < 9.62 ) { return new Prediction("Left", 88, 0); }
	if( Z32 >= 9.62 ) { 
	if( Z20 >= 9.76 ) { 
	if( Z7 < 9.58 ) { 
	if( Z23 < 9.62 ) { 
		if( Z13 < 9.76 ) { return new Prediction("Right", 2, 0); }
		if( Z13 >= 9.76 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z23 >= 9.62 ) { return new Prediction("Left", 24, 0); }
	}
	if( Z7 >= 9.58 ) { 
	if( Z15 >= 9.6 ) { 
		if( Z4 < 9.69 ) { return new Prediction("Right", 3, 0); }
	if( Z4 >= 9.69 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y6 < -0.1 ) { return new Prediction("Left", 17, 0); }
	}
	}
	if( Z15 < 9.6 ) { 
	if( Y31 < -0.13 ) { 
		if( Y5 >= -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y5 < -0.12 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y31 >= -0.13 ) { return new Prediction("Right", 22, 0); }
	}
	}
	}
		if( Z20 < 9.76 ) { return new Prediction("Left", 27, 0); }
	}
	}
return null;
}
private Prediction runTree36() {
	if( Z24 >= 9.78 ) { 
	if( X9 >= 0.06 ) { 
	if( Z21 < 9.71 ) { 
	if( X22 < 0.09 ) { 
		if( X18 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X18 >= 0.09 ) { return new Prediction("Right", 13, 0); }
	}
	if( X22 >= 0.09 ) { 
		if( X21 < 0.1 ) { return new Prediction("Left", 5, 0); }
	if( X21 >= 0.1 ) { 
		if( X12 < 0.14 ) { return new Prediction("Right", 5, 0); }
		if( X12 >= 0.14 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z21 >= 9.71 ) { 
		if( X20 >= 0.09 ) { return new Prediction("Right", 128, 0); }
	if( X20 < 0.09 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X2 < 0.11 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	if( X9 < 0.06 ) { 
		if( X14 < 0.09 ) { return new Prediction("Left", 5, 0); }
		if( X14 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z24 < 9.78 ) { 
	if( Z6 < 9.88 ) { 
	if( Z11 >= 9.8 ) { 
		if( X26 < 0.09 ) { return new Prediction("Left", 47, 0); }
	if( X26 >= 0.09 ) { 
	if( X28 < 0.09 ) { 
		if( X6 < 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X6 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	if( X28 >= 0.09 ) { 
	if( X25 < 0.1 ) { 
		if( X9 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X9 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( X25 >= 0.1 ) { return new Prediction("Left", 43, 0); }
	}
	}
	}
	if( Z11 < 9.8 ) { 
	if( Z2 >= 9.8 ) { 
	if( X19 >= 0.09 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 33, 0); }
	if( X2 >= 0.09 ) { 
	if( Z25 < 9.67 ) { 
	if( Z18 >= 9.68 ) { 
		if( Z19 < 9.79 ) { return new Prediction("Right", 17, 0); }
	if( Z19 >= 9.79 ) { 
		if( Z1 < 9.84 ) { return new Prediction("Left", 3, 0); }
		if( Z1 >= 9.84 ) { return new Prediction("Right", 5, 0); }
	}
	}
	if( Z18 < 9.68 ) { 
		if( Z23 >= 9.7 ) { return new Prediction("Right", 5, 0); }
		if( Z23 < 9.7 ) { return new Prediction("Left", 12, 0); }
	}
	}
	if( Z25 >= 9.67 ) { 
		if( Z1 >= 9.86 ) { return new Prediction("Right", 2, 0); }
	if( Z1 < 9.86 ) { 
		if( Z29 < 9.63 ) { return new Prediction("Right", 1, 0); }
		if( Z29 >= 9.63 ) { return new Prediction("Left", 21, 0); }
	}
	}
	}
	}
	if( X19 < 0.09 ) { 
	if( Z20 >= 9.76 ) { 
		if( Y1 >= -0.09 ) { return new Prediction("Left", 1, 0); }
		if( Y1 < -0.09 ) { return new Prediction("Right", 29, 0); }
	}
	if( Z20 < 9.76 ) { 
		if( Y22 < -0.12 ) { return new Prediction("Left", 4, 0); }
	if( Y22 >= -0.12 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X1 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Z2 < 9.8 ) { 
	if( X19 >= 0.11 ) { 
	if( Z14 < 9.78 ) { 
		if( X6 < 0.1 ) { return new Prediction("Right", 4, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z14 >= 9.78 ) { return new Prediction("Left", 12, 0); }
	}
	if( X19 < 0.11 ) { 
	if( Z17 >= 9.75 ) { 
		if( X20 < 0.1 ) { return new Prediction("Left", 4, 0); }
		if( X20 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z17 < 9.75 ) { return new Prediction("Left", 67, 0); }
	}
	}
	}
	}
	if( Z6 >= 9.88 ) { 
		if( Y22 >= -0.14 ) { return new Prediction("Right", 26, 0); }
		if( Y22 < -0.14 ) { return new Prediction("Left", 1, 0); }
	}
	}
return null;
}
private Prediction runTree37() {
	if( Z32 < 9.78 ) { 
	if( Z18 < 9.56 ) { 
		if( X13 < 0.08 ) { return new Prediction("Left", 6, 0); }
	if( X13 >= 0.08 ) { 
		if( Z12 < 9.5 ) { return new Prediction("Left", 1, 0); }
		if( Z12 >= 9.5 ) { return new Prediction("Right", 34, 0); }
	}
	}
	if( Z18 >= 9.56 ) { 
	if( Z21 < 9.7 ) { 
	if( Z19 < 9.79 ) { 
	if( Y4 < -0.09 ) { 
	if( X17 < 0.11 ) { 
		if( Z7 >= 9.66 ) { return new Prediction("Left", 19, 0); }
	if( Z7 < 9.66 ) { 
		if( Z10 >= 9.81 ) { return new Prediction("Right", 6, 0); }
	if( Z10 < 9.81 ) { 
		if( Z23 < 9.62 ) { return new Prediction("Right", 3, 0); }
	if( Z23 >= 9.62 ) { 
		if( Z2 < 9.86 ) { return new Prediction("Left", 32, 0); }
		if( Z2 >= 9.86 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( X17 >= 0.11 ) { 
	if( Z30 >= 9.72 ) { 
		if( Y2 < -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y2 >= -0.12 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z30 < 9.72 ) { return new Prediction("Right", 7, 0); }
	}
	}
	if( Y4 >= -0.09 ) { 
	if( Y29 < -0.11 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Right", 4, 0); }
	if( X1 < 0.11 ) { 
		if( Z21 >= 9.68 ) { return new Prediction("Right", 1, 0); }
		if( Z21 < 9.68 ) { return new Prediction("Left", 4, 0); }
	}
	}
		if( Y29 >= -0.11 ) { return new Prediction("Right", 7, 0); }
	}
	}
	if( Z19 >= 9.79 ) { 
		if( Z22 < 9.62 ) { return new Prediction("Right", 3, 0); }
	if( Z22 >= 9.62 ) { 
	if( X22 < 0.13 ) { 
	if( Z10 < 9.78 ) { 
		if( Z14 < 9.6 ) { return new Prediction("Left", 24, 0); }
	if( Z14 >= 9.6 ) { 
		if( Z14 >= 9.61 ) { return new Prediction("Left", 8, 0); }
	if( Z14 < 9.61 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X2 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Z10 >= 9.78 ) { return new Prediction("Left", 75, 0); }
	}
		if( X22 >= 0.13 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Z21 >= 9.7 ) { 
	if( Y28 >= -0.13 ) { 
	if( X23 < 0.11 ) { 
	if( Z18 >= 9.72 ) { 
		if( Y1 < -0.07 ) { return new Prediction("Right", 13, 0); }
		if( Y1 >= -0.07 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z18 < 9.72 ) { 
	if( X4 < 0.11 ) { 
	if( Z5 < 9.79 ) { 
	if( Z16 >= 9.69 ) { 
	if( Y17 < -0.09 ) { 
		if( Y14 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y14 >= -0.13 ) { return new Prediction("Right", 8, 0); }
	}
		if( Y17 >= -0.09 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z16 < 9.69 ) { 
		if( X4 < 0.1 ) { return new Prediction("Left", 16, 0); }
		if( X4 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z5 >= 9.79 ) { return new Prediction("Right", 6, 0); }
	}
		if( X4 >= 0.11 ) { return new Prediction("Left", 17, 0); }
	}
	}
	if( X23 >= 0.11 ) { 
		if( Z2 < 9.56 ) { return new Prediction("Left", 2, 0); }
	if( Z2 >= 9.56 ) { 
		if( Z22 >= 9.71 ) { return new Prediction("Right", 36, 0); }
	if( Z22 < 9.71 ) { 
		if( X9 < 0.1 ) { return new Prediction("Right", 4, 0); }
	if( X9 >= 0.1 ) { 
		if( Y1 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y1 >= -0.13 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	}
		if( Y28 < -0.13 ) { return new Prediction("Left", 15, 0); }
	}
	}
	}
	if( Z32 >= 9.78 ) { 
	if( Y29 < -0.14 ) { 
		if( Y17 < -0.1 ) { return new Prediction("Right", 10, 0); }
		if( Y17 >= -0.1 ) { return new Prediction("Left", 4, 0); }
	}
	if( Y29 >= -0.14 ) { 
	if( Y7 < -0.13 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Right", 2, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y7 >= -0.13 ) { return new Prediction("Right", 133, 0); }
	}
	}
return null;
}
private Prediction runTree38() {
	if( Z24 < 9.77 ) { 
	if( Z28 >= 9.76 ) { 
	if( Z9 < 9.81 ) { 
		if( X12 < 0.09 ) { return new Prediction("Left", 6, 0); }
	if( X12 >= 0.09 ) { 
	if( Y14 < -0.11 ) { 
		if( X4 < 0.11 ) { return new Prediction("Left", 5, 0); }
	if( X4 >= 0.11 ) { 
		if( X3 < 0.13 ) { return new Prediction("Right", 4, 0); }
		if( X3 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y14 >= -0.11 ) { 
	if( X9 >= 0.11 ) { 
		if( Y4 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y4 >= -0.13 ) { return new Prediction("Left", 1, 0); }
	}
		if( X9 < 0.11 ) { return new Prediction("Right", 28, 0); }
	}
	}
	}
		if( Z9 >= 9.81 ) { return new Prediction("Left", 9, 0); }
	}
	if( Z28 < 9.76 ) { 
	if( Z4 < 9.88 ) { 
	if( Z1 < 9.8 ) { 
	if( X26 >= 0.11 ) { 
	if( Y6 >= -0.13 ) { 
		if( X5 >= 0.09 ) { return new Prediction("Left", 31, 0); }
		if( X5 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y6 < -0.13 ) { return new Prediction("Right", 1, 0); }
	}
		if( X26 < 0.11 ) { return new Prediction("Left", 59, 0); }
	}
	if( Z1 >= 9.8 ) { 
	if( Y5 < -0.09 ) { 
	if( X3 >= 0.09 ) { 
	if( Z16 >= 9.68 ) { 
		if( X6 < 0.1 ) { return new Prediction("Right", 9, 0); }
	if( X6 >= 0.1 ) { 
	if( Y7 < -0.1 ) { 
		if( Z13 < 9.74 ) { return new Prediction("Left", 15, 0); }
	if( Z13 >= 9.74 ) { 
		if( Y7 >= -0.11 ) { return new Prediction("Right", 2, 0); }
		if( Y7 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Y7 >= -0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z16 < 9.68 ) { 
		if( Y13 < -0.09 ) { return new Prediction("Left", 22, 0); }
		if( Y13 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X3 < 0.09 ) { return new Prediction("Left", 58, 0); }
	}
	if( Y5 >= -0.09 ) { 
	if( Y10 < -0.1 ) { 
	if( X21 < 0.12 ) { 
		if( Y15 >= -0.11 ) { return new Prediction("Right", 16, 0); }
		if( Y15 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X21 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y10 >= -0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	if( Z4 >= 9.88 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 8, 0); }
	if( X27 >= 0.09 ) { 
		if( Z32 >= 9.61 ) { return new Prediction("Right", 20, 0); }
		if( Z32 < 9.61 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	}
	if( Z24 >= 9.77 ) { 
	if( X20 < 0.1 ) { 
	if( Z14 < 9.81 ) { 
	if( X23 < 0.11 ) { 
	if( X16 >= 0.09 ) { 
		if( X26 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X26 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( X16 < 0.09 ) { return new Prediction("Left", 12, 0); }
	}
		if( X23 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z14 >= 9.81 ) { return new Prediction("Right", 16, 0); }
	}
	if( X20 >= 0.1 ) { 
		if( X29 < 0.1 ) { return new Prediction("Right", 136, 0); }
	if( X29 >= 0.1 ) { 
	if( Y10 >= -0.13 ) { 
	if( Y24 < -0.12 ) { 
		if( X17 < 0.1 ) { return new Prediction("Left", 4, 0); }
		if( X17 >= 0.1 ) { return new Prediction("Right", 4, 0); }
	}
		if( Y24 >= -0.12 ) { return new Prediction("Right", 31, 0); }
	}
		if( Y10 < -0.13 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree39() {
	if( Z23 >= 9.78 ) { 
	if( Y29 >= -0.15 ) { 
	if( Z15 < 9.83 ) { 
	if( X6 >= 0.07 ) { 
		if( X13 < 0.08 ) { return new Prediction("Left", 2, 0); }
	if( X13 >= 0.08 ) { 
		if( X3 < 0.12 ) { return new Prediction("Right", 21, 0); }
	if( X3 >= 0.12 ) { 
		if( X26 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X26 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X6 < 0.07 ) { 
		if( X16 < 0.11 ) { return new Prediction("Left", 6, 0); }
		if( X16 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z15 >= 9.83 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 3, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 110, 0); }
	}
	}
	if( Y29 < -0.15 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 7, 0); }
		if( Y4 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z23 < 9.78 ) { 
	if( Y24 < -0.1 ) { 
	if( Z32 < 9.62 ) { 
	if( Y30 >= -0.09 ) { 
		if( X22 < 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X22 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y30 < -0.09 ) { return new Prediction("Left", 69, 0); }
	}
	if( Z32 >= 9.62 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 41, 0); }
	if( Z13 < 9.78 ) { 
	if( Z32 < 9.67 ) { 
	if( Z21 < 9.67 ) { 
	if( X24 >= 0.1 ) { 
	if( Z17 < 9.71 ) { 
	if( X4 >= 0.09 ) { 
	if( X8 >= 0.1 ) { 
		if( X31 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X31 < 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( X8 < 0.1 ) { return new Prediction("Right", 3, 0); }
	}
		if( X4 < 0.09 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z17 >= 9.71 ) { return new Prediction("Left", 20, 0); }
	}
	if( X24 < 0.1 ) { 
	if( X5 < 0.11 ) { 
	if( Z18 >= 9.72 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 15, 0); }
	}
		if( Z18 < 9.72 ) { return new Prediction("Left", 2, 0); }
	}
	if( X5 >= 0.11 ) { 
		if( X24 >= 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X24 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Z21 >= 9.67 ) { 
	if( Z1 < 9.8 ) { 
		if( X23 < 0.11 ) { return new Prediction("Left", 4, 0); }
		if( X23 >= 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	if( Z1 >= 9.8 ) { 
	if( Z22 < 9.66 ) { 
		if( Y9 < -0.12 ) { return new Prediction("Right", 4, 0); }
		if( Y9 >= -0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z22 >= 9.66 ) { return new Prediction("Right", 32, 0); }
	}
	}
	}
	if( Z32 >= 9.67 ) { 
	if( X13 >= 0.1 ) { 
	if( Z1 < 9.69 ) { 
		if( Y17 < -0.11 ) { return new Prediction("Left", 5, 0); }
	if( Y17 >= -0.11 ) { 
		if( X29 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X29 >= 0.09 ) { return new Prediction("Right", 11, 0); }
	}
	}
		if( Z1 >= 9.69 ) { return new Prediction("Left", 20, 0); }
	}
	if( X13 < 0.1 ) { 
	if( Y3 < -0.12 ) { 
		if( X5 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X5 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y3 >= -0.12 ) { return new Prediction("Left", 34, 0); }
	}
	}
	}
	}
	}
	if( Y24 >= -0.1 ) { 
		if( Z19 >= 9.8 ) { return new Prediction("Left", 17, 0); }
	if( Z19 < 9.8 ) { 
		if( Z11 < 9.56 ) { return new Prediction("Left", 13, 0); }
	if( Z11 >= 9.56 ) { 
	if( X16 >= 0.1 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 7, 0); }
	if( X27 >= 0.09 ) { 
		if( Y7 >= -0.11 ) { return new Prediction("Right", 23, 0); }
	if( Y7 < -0.11 ) { 
		if( X6 < 0.13 ) { return new Prediction("Left", 6, 0); }
		if( X6 >= 0.13 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( X16 < 0.1 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree40() {
	if( Z19 >= 9.8 ) { 
	if( Z10 >= 9.72 ) { 
		if( Z21 < 9.62 ) { return new Prediction("Right", 1, 0); }
	if( Z21 >= 9.62 ) { 
	if( Y23 >= -0.09 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X19 < 0.1 ) { return new Prediction("Left", 6, 0); }
	}
		if( Y23 < -0.09 ) { return new Prediction("Left", 106, 0); }
	}
	}
		if( Z10 < 9.72 ) { return new Prediction("Right", 4, 0); }
	}
	if( Z19 < 9.8 ) { 
	if( Z31 >= 9.8 ) { 
	if( Y12 < -0.13 ) { 
		if( Z10 < 9.43 ) { return new Prediction("Left", 1, 0); }
	if( Z10 >= 9.43 ) { 
		if( Y5 >= -0.13 ) { return new Prediction("Right", 31, 0); }
	if( Y5 < -0.13 ) { 
		if( Z3 < 9.55 ) { return new Prediction("Right", 5, 0); }
		if( Z3 >= 9.55 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Y12 >= -0.13 ) { return new Prediction("Right", 73, 0); }
	}
	if( Z31 < 9.8 ) { 
	if( Z17 >= 9.59 ) { 
	if( Y27 < -0.09 ) { 
	if( Z5 >= 9.61 ) { 
	if( X1 >= 0.11 ) { 
		if( Z20 < 9.54 ) { return new Prediction("Right", 3, 0); }
	if( Z20 >= 9.54 ) { 
	if( Y15 >= -0.1 ) { 
	if( X20 >= 0.09 ) { 
		if( Y7 < -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y7 >= -0.12 ) { return new Prediction("Left", 4, 0); }
	}
		if( X20 < 0.09 ) { return new Prediction("Right", 5, 0); }
	}
	if( Y15 < -0.1 ) { 
	if( Z17 >= 9.68 ) { 
		if( X4 < 0.12 ) { return new Prediction("Left", 6, 0); }
	if( X4 >= 0.12 ) { 
		if( X12 < 0.09 ) { return new Prediction("Left", 2, 0); }
	if( X12 >= 0.09 ) { 
		if( X4 < 0.13 ) { return new Prediction("Right", 3, 0); }
		if( X4 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Z17 < 9.68 ) { return new Prediction("Left", 26, 0); }
	}
	}
	}
	if( X1 < 0.11 ) { 
	if( Z3 >= 9.83 ) { 
		if( Y16 < -0.14 ) { return new Prediction("Left", 2, 0); }
		if( Y16 >= -0.14 ) { return new Prediction("Right", 24, 0); }
	}
	if( Z3 < 9.83 ) { 
	if( Y7 < -0.09 ) { 
	if( Z9 >= 9.73 ) { 
	if( X19 >= 0.09 ) { 
		if( X32 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X32 >= 0.09 ) { return new Prediction("Left", 19, 0); }
	}
	if( X19 < 0.09 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Right", 2, 0); }
		if( X7 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z9 < 9.73 ) { 
	if( X16 >= 0.1 ) { 
	if( Z27 < 9.73 ) { 
		if( Y13 < -0.14 ) { return new Prediction("Left", 4, 0); }
	if( Y13 >= -0.14 ) { 
	if( X32 < 0.1 ) { 
	if( Z2 >= 9.59 ) { 
		if( Z25 >= 9.76 ) { return new Prediction("Right", 7, 0); }
	if( Z25 < 9.76 ) { 
		if( X28 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X28 >= 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z2 < 9.59 ) { 
		if( Y13 >= -0.12 ) { return new Prediction("Left", 7, 0); }
		if( Y13 < -0.12 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( X32 >= 0.1 ) { return new Prediction("Right", 16, 0); }
	}
	}
		if( Z27 >= 9.73 ) { return new Prediction("Left", 3, 0); }
	}
	if( X16 < 0.1 ) { 
	if( Y12 < -0.1 ) { 
		if( Z10 < 9.67 ) { return new Prediction("Left", 15, 0); }
	if( Z10 >= 9.67 ) { 
		if( Z28 >= 9.75 ) { return new Prediction("Left", 2, 0); }
		if( Z28 < 9.75 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( Y12 >= -0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( Y7 >= -0.09 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	if( X1 < 0.11 ) { 
		if( Z19 < 9.79 ) { return new Prediction("Right", 20, 0); }
		if( Z19 >= 9.79 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	if( Z5 < 9.61 ) { 
	if( Z26 < 9.81 ) { 
	if( Z14 < 9.81 ) { 
		if( Z28 >= 9.77 ) { return new Prediction("Right", 1, 0); }
		if( Z28 < 9.77 ) { return new Prediction("Left", 42, 0); }
	}
		if( Z14 >= 9.81 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z26 >= 9.81 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Y27 >= -0.09 ) { 
	if( X30 >= 0.11 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 4, 0); }
		if( X10 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( X30 < 0.11 ) { return new Prediction("Right", 24, 0); }
	}
	}
	if( Z17 < 9.59 ) { 
		if( Y26 < -0.1 ) { return new Prediction("Right", 29, 0); }
		if( Y26 >= -0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree41() {
	if( Z24 >= 9.78 ) { 
	if( X14 >= 0.07 ) { 
	if( Z3 >= 9.59 ) { 
	if( X24 >= 0.09 ) { 
		if( X9 < 0.15 ) { return new Prediction("Right", 18, 0); }
		if( X9 >= 0.15 ) { return new Prediction("Left", 1, 0); }
	}
	if( X24 < 0.09 ) { 
		if( X3 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X3 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z3 < 9.59 ) { return new Prediction("Right", 140, 0); }
	}
	if( X14 < 0.07 ) { 
		if( Z1 < 9.5 ) { return new Prediction("Right", 1, 0); }
		if( Z1 >= 9.5 ) { return new Prediction("Left", 15, 0); }
	}
	}
	if( Z24 < 9.78 ) { 
	if( Z5 < 9.88 ) { 
	if( Z12 < 9.8 ) { 
	if( Z32 < 9.67 ) { 
	if( Z21 >= 9.69 ) { 
	if( Y16 >= -0.12 ) { 
	if( X28 < 0.11 ) { 
		if( X18 < 0.1 ) { return new Prediction("Left", 4, 0); }
		if( X18 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( X28 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y16 < -0.12 ) { return new Prediction("Right", 16, 0); }
	}
	if( Z21 < 9.69 ) { 
	if( Z2 >= 9.88 ) { 
		if( Z12 < 9.76 ) { return new Prediction("Right", 14, 0); }
		if( Z12 >= 9.76 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z2 < 9.88 ) { 
	if( Z22 < 9.62 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Right", 10, 0); }
		if( X17 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z22 >= 9.62 ) { 
	if( X29 < 0.13 ) { 
		if( Y22 < -0.09 ) { return new Prediction("Left", 40, 0); }
	if( Y22 >= -0.09 ) { 
		if( Y17 < -0.11 ) { return new Prediction("Left", 3, 0); }
		if( Y17 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X29 >= 0.13 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Z32 >= 9.67 ) { 
	if( Z24 < 9.76 ) { 
		if( Z7 >= 9.55 ) { return new Prediction("Left", 90, 0); }
	if( Z7 < 9.55 ) { 
		if( X21 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X21 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	}
	}
	if( Z24 >= 9.76 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Left", 18, 0); }
		if( Y5 < -0.11 ) { return new Prediction("Right", 8, 0); }
	}
	}
	}
		if( Z12 >= 9.8 ) { return new Prediction("Left", 91, 0); }
	}
	if( Z5 >= 9.88 ) { 
		if( Z12 < 9.91 ) { return new Prediction("Right", 30, 0); }
		if( Z12 >= 9.91 ) { return new Prediction("Left", 4, 0); }
	}
	}
return null;
}
private Prediction runTree42() {
	if( Z24 < 9.77 ) { 
	if( X19 >= 0.09 ) { 
	if( Y29 >= -0.1 ) { 
		if( Z10 < 9.75 ) { return new Prediction("Right", 14, 0); }
	if( Z10 >= 9.75 ) { 
	if( Z8 >= 9.56 ) { 
		if( Y24 < -0.12 ) { return new Prediction("Left", 6, 0); }
		if( Y24 >= -0.12 ) { return new Prediction("Right", 7, 0); }
	}
		if( Z8 < 9.56 ) { return new Prediction("Left", 10, 0); }
	}
	}
	if( Y29 < -0.1 ) { 
	if( Z17 >= 9.59 ) { 
	if( X23 < 0.11 ) { 
		if( Y19 < -0.12 ) { return new Prediction("Left", 72, 0); }
	if( Y19 >= -0.12 ) { 
		if( Z11 < 9.68 ) { return new Prediction("Left", 27, 0); }
	if( Z11 >= 9.68 ) { 
	if( Y21 >= -0.09 ) { 
		if( Z18 < 9.78 ) { return new Prediction("Right", 4, 0); }
		if( Z18 >= 9.78 ) { return new Prediction("Left", 2, 0); }
	}
	if( Y21 < -0.09 ) { 
	if( Y4 < -0.09 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Left", 23, 0); }
	if( X23 < 0.1 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Left", 10, 0); }
	if( X19 < 0.1 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Right", 2, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
		if( Y4 >= -0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( X23 >= 0.11 ) { 
		if( Z32 < 9.62 ) { return new Prediction("Left", 21, 0); }
	if( Z32 >= 9.62 ) { 
	if( Y19 < -0.1 ) { 
		if( Y21 < -0.12 ) { return new Prediction("Left", 4, 0); }
	if( Y21 >= -0.12 ) { 
		if( Z5 >= 9.76 ) { return new Prediction("Left", 1, 0); }
		if( Z5 < 9.76 ) { return new Prediction("Right", 11, 0); }
	}
	}
		if( Y19 >= -0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
		if( Z17 < 9.59 ) { return new Prediction("Right", 6, 0); }
	}
	}
	if( X19 < 0.09 ) { 
	if( X10 < 0.09 ) { 
	if( Z22 < 9.74 ) { 
	if( Y31 < -0.12 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X5 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y31 >= -0.12 ) { return new Prediction("Left", 28, 0); }
	}
		if( Z22 >= 9.74 ) { return new Prediction("Right", 6, 0); }
	}
	if( X10 >= 0.09 ) { 
	if( Y14 < -0.11 ) { 
		if( Y4 < -0.1 ) { return new Prediction("Left", 11, 0); }
	if( Y4 >= -0.1 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y14 >= -0.11 ) { 
		if( Z7 < 9.52 ) { return new Prediction("Left", 3, 0); }
	if( Z7 >= 9.52 ) { 
	if( Z26 < 9.8 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X21 < 0.11 ) { return new Prediction("Right", 41, 0); }
	}
		if( Z26 >= 9.8 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	if( Z24 >= 9.77 ) { 
		if( Y12 < -0.11 ) { return new Prediction("Right", 157, 0); }
	if( Y12 >= -0.11 ) { 
	if( Z22 >= 9.72 ) { 
		if( X23 >= 0.09 ) { return new Prediction("Right", 24, 0); }
	if( X23 < 0.09 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z22 < 9.72 ) { return new Prediction("Left", 12, 0); }
	}
	}
return null;
}
private Prediction runTree43() {
	if( Z32 < 9.78 ) { 
	if( Z8 >= 9.92 ) { 
		if( X11 < 0.15 ) { return new Prediction("Right", 30, 0); }
		if( X11 >= 0.15 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z8 < 9.92 ) { 
	if( Y6 < -0.09 ) { 
	if( Y8 >= -0.09 ) { 
	if( X7 >= 0.11 ) { 
		if( Z4 < 9.71 ) { return new Prediction("Left", 4, 0); }
		if( Z4 >= 9.71 ) { return new Prediction("Right", 7, 0); }
	}
		if( X7 < 0.11 ) { return new Prediction("Right", 13, 0); }
	}
	if( Y8 < -0.09 ) { 
	if( Z19 >= 9.81 ) { 
		if( Z25 < 9.67 ) { return new Prediction("Left", 77, 0); }
	if( Z25 >= 9.67 ) { 
		if( Z21 < 9.62 ) { return new Prediction("Right", 2, 0); }
	if( Z21 >= 9.62 ) { 
		if( X16 >= 0.08 ) { return new Prediction("Left", 17, 0); }
	if( X16 < 0.08 ) { 
		if( Y20 >= -0.11 ) { return new Prediction("Left", 1, 0); }
		if( Y20 < -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z19 < 9.81 ) { 
	if( X2 < 0.09 ) { 
	if( Y20 >= -0.12 ) { 
		if( Y24 >= -0.09 ) { return new Prediction("Right", 1, 0); }
		if( Y24 < -0.09 ) { return new Prediction("Left", 37, 0); }
	}
	if( Y20 < -0.12 ) { 
		if( Y22 < -0.12 ) { return new Prediction("Left", 2, 0); }
		if( Y22 >= -0.12 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X2 >= 0.09 ) { 
	if( Z19 >= 9.76 ) { 
	if( X18 < 0.1 ) { 
		if( Z6 < 9.77 ) { return new Prediction("Right", 30, 0); }
		if( Z6 >= 9.77 ) { return new Prediction("Left", 1, 0); }
	}
	if( X18 >= 0.1 ) { 
		if( Y16 >= -0.11 ) { return new Prediction("Right", 8, 0); }
	if( Y16 < -0.11 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y6 < -0.1 ) { return new Prediction("Left", 17, 0); }
	}
	}
	}
	if( Z19 < 9.76 ) { 
	if( Z21 >= 9.68 ) { 
	if( Z18 >= 9.59 ) { 
		if( Z25 < 9.78 ) { return new Prediction("Left", 34, 0); }
	if( Z25 >= 9.78 ) { 
		if( X17 < 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X17 >= 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z18 < 9.59 ) { 
		if( Y12 < -0.12 ) { return new Prediction("Right", 8, 0); }
		if( Y12 >= -0.12 ) { return new Prediction("Left", 3, 0); }
	}
	}
		if( Z21 < 9.68 ) { return new Prediction("Left", 32, 0); }
	}
	}
	}
	}
	}
	if( Y6 >= -0.09 ) { 
	if( X10 < 0.09 ) { 
		if( Y15 >= -0.09 ) { return new Prediction("Right", 5, 0); }
	if( Y15 < -0.09 ) { 
		if( Y9 < -0.13 ) { return new Prediction("Right", 2, 0); }
	if( Y9 >= -0.13 ) { 
		if( X1 < 0.1 ) { return new Prediction("Left", 18, 0); }
	if( X1 >= 0.1 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Left", 5, 0); }
		if( X5 < 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
		if( X10 >= 0.09 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
	if( Z32 >= 9.78 ) { 
	if( Y18 >= -0.11 ) { 
	if( Y21 < -0.14 ) { 
	if( X14 < 0.1 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	if( X12 < 0.1 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X11 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( X14 >= 0.1 ) { return new Prediction("Right", 3, 0); }
	}
	if( Y21 >= -0.14 ) { 
	if( Y6 < -0.12 ) { 
	if( X13 >= 0.13 ) { 
		if( X20 < 0.12 ) { return new Prediction("Left", 3, 0); }
		if( X20 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
		if( X13 < 0.13 ) { return new Prediction("Right", 11, 0); }
	}
		if( Y6 >= -0.12 ) { return new Prediction("Right", 58, 0); }
	}
	}
		if( Y18 < -0.11 ) { return new Prediction("Right", 50, 0); }
	}
return null;
}
private Prediction runTree44() {
	if( Z25 < 9.79 ) { 
	if( X26 >= 0.11 ) { 
	if( Z21 >= 9.69 ) { 
		if( Z1 >= 9.7 ) { return new Prediction("Right", 27, 0); }
	if( Z1 < 9.7 ) { 
	if( X3 < 0.1 ) { 
		if( Z2 < 9.37 ) { return new Prediction("Left", 1, 0); }
	if( Z2 >= 9.37 ) { 
		if( Y29 < -0.11 ) { return new Prediction("Right", 27, 0); }
	if( Y29 >= -0.11 ) { 
		if( Y10 >= -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y10 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X3 >= 0.1 ) { 
		if( Z32 >= 9.8 ) { return new Prediction("Right", 5, 0); }
	if( Z32 < 9.8 ) { 
	if( Z4 >= 9.62 ) { 
		if( Z17 < 9.66 ) { return new Prediction("Left", 3, 0); }
		if( Z17 >= 9.66 ) { return new Prediction("Right", 9, 0); }
	}
		if( Z4 < 9.62 ) { return new Prediction("Left", 18, 0); }
	}
	}
	}
	}
	if( Z21 < 9.69 ) { 
		if( Z16 < 9.58 ) { return new Prediction("Right", 5, 0); }
	if( Z16 >= 9.58 ) { 
		if( Z28 < 9.7 ) { return new Prediction("Left", 37, 0); }
	if( Z28 >= 9.7 ) { 
	if( Z19 < 9.79 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y5 < -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z19 >= 9.79 ) { return new Prediction("Left", 11, 0); }
	}
	}
	}
	}
	if( X26 < 0.11 ) { 
	if( Z17 >= 9.59 ) { 
	if( Z32 >= 9.61 ) { 
	if( X5 < 0.13 ) { 
	if( X3 >= 0.09 ) { 
	if( Z17 >= 9.68 ) { 
	if( X24 >= 0.1 ) { 
		if( Z25 >= 9.68 ) { return new Prediction("Left", 10, 0); }
	if( Z25 < 9.68 ) { 
		if( X17 < 0.09 ) { return new Prediction("Right", 4, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( X24 < 0.1 ) { 
	if( Z10 < 9.86 ) { 
		if( X17 < 0.09 ) { return new Prediction("Right", 15, 0); }
	if( X17 >= 0.09 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 5, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 4, 0); }
	}
	}
		if( Z10 >= 9.86 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z17 < 9.68 ) { 
	if( X24 >= 0.1 ) { 
		if( Z12 >= 9.79 ) { return new Prediction("Left", 9, 0); }
		if( Z12 < 9.79 ) { return new Prediction("Right", 6, 0); }
	}
	if( X24 < 0.1 ) { 
		if( Y25 < -0.09 ) { return new Prediction("Left", 22, 0); }
		if( Y25 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( X3 < 0.09 ) { 
	if( Z31 < 9.77 ) { 
	if( Z2 < 9.92 ) { 
		if( X14 < 0.12 ) { return new Prediction("Left", 48, 0); }
	if( X14 >= 0.12 ) { 
		if( X15 < 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X15 >= 0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( Z2 >= 9.92 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z31 >= 9.77 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( X5 >= 0.13 ) { return new Prediction("Left", 30, 0); }
	}
		if( Z32 < 9.61 ) { return new Prediction("Left", 53, 0); }
	}
		if( Z17 < 9.59 ) { return new Prediction("Right", 14, 0); }
	}
	}
	if( Z25 >= 9.79 ) { 
	if( Z32 < 9.79 ) { 
	if( Z12 >= 9.48 ) { 
		if( Z22 < 9.7 ) { return new Prediction("Left", 5, 0); }
		if( Z22 >= 9.7 ) { return new Prediction("Right", 21, 0); }
	}
		if( Z12 < 9.48 ) { return new Prediction("Left", 15, 0); }
	}
		if( Z32 >= 9.79 ) { return new Prediction("Right", 97, 0); }
	}
return null;
}
private Prediction runTree45() {
	if( Z14 < 9.82 ) { 
	if( Z10 < 9.75 ) { 
	if( Z29 >= 9.72 ) { 
	if( X23 < 0.11 ) { 
	if( Z1 < 9.8 ) { 
	if( Y15 >= -0.11 ) { 
		if( X7 < 0.07 ) { return new Prediction("Left", 1, 0); }
		if( X7 >= 0.07 ) { return new Prediction("Right", 3, 0); }
	}
		if( Y15 < -0.11 ) { return new Prediction("Left", 8, 0); }
	}
		if( Z1 >= 9.8 ) { return new Prediction("Right", 27, 0); }
	}
		if( X23 >= 0.11 ) { return new Prediction("Right", 32, 0); }
	}
	if( Z29 < 9.72 ) { 
		if( Z30 >= 9.79 ) { return new Prediction("Right", 8, 0); }
	if( Z30 < 9.79 ) { 
		if( Z7 >= 9.92 ) { return new Prediction("Right", 6, 0); }
	if( Z7 < 9.92 ) { 
	if( X11 >= 0.09 ) { 
		if( X11 >= 0.11 ) { return new Prediction("Left", 17, 0); }
	if( X11 < 0.11 ) { 
		if( Z25 >= 9.76 ) { return new Prediction("Right", 11, 0); }
	if( Z25 < 9.76 ) { 
	if( Z9 >= 9.67 ) { 
		if( Y1 < -0.11 ) { return new Prediction("Left", 5, 0); }
		if( Y1 >= -0.11 ) { return new Prediction("Right", 4, 0); }
	}
		if( Z9 < 9.67 ) { return new Prediction("Left", 18, 0); }
	}
	}
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 35, 0); }
	}
	}
	}
	}
	if( Z10 >= 9.75 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 52, 0); }
	if( X1 >= 0.09 ) { 
	if( Z11 < 9.84 ) { 
	if( Z19 >= 9.76 ) { 
	if( Z24 < 9.66 ) { 
	if( Z3 < 9.9 ) { 
	if( Y32 < -0.12 ) { 
	if( X15 < 0.11 ) { 
	if( Y4 < -0.11 ) { 
		if( X18 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X18 >= 0.09 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y4 >= -0.11 ) { return new Prediction("Right", 3, 0); }
	}
		if( X15 >= 0.11 ) { return new Prediction("Left", 9, 0); }
	}
		if( Y32 >= -0.12 ) { return new Prediction("Left", 21, 0); }
	}
		if( Z3 >= 9.9 ) { return new Prediction("Right", 5, 0); }
	}
		if( Z24 >= 9.66 ) { return new Prediction("Right", 20, 0); }
	}
		if( Z19 < 9.76 ) { return new Prediction("Left", 32, 0); }
	}
		if( Z11 >= 9.84 ) { return new Prediction("Left", 34, 0); }
	}
	}
	}
	if( Z14 >= 9.82 ) { 
	if( Z17 < 9.67 ) { 
		if( X4 >= 0.09 ) { return new Prediction("Left", 15, 0); }
		if( X4 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z17 >= 9.67 ) { 
	if( Z12 >= 9.48 ) { 
	if( X6 < 0.19 ) { 
	if( Z10 >= 9.64 ) { 
		if( X32 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X32 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z10 < 9.64 ) { return new Prediction("Right", 147, 0); }
	}
		if( X6 >= 0.19 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z12 < 9.48 ) { return new Prediction("Left", 2, 0); }
	}
	}
return null;
}
private Prediction runTree46() {
	if( Z23 < 9.76 ) { 
		if( Z6 >= 9.87 ) { return new Prediction("Right", 22, 0); }
	if( Z6 < 9.87 ) { 
	if( Z27 >= 9.75 ) { 
	if( Z20 >= 9.81 ) { 
		if( Y25 >= -0.13 ) { return new Prediction("Left", 76, 0); }
	if( Y25 < -0.13 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z20 < 9.81 ) { 
		if( X6 < 0.09 ) { return new Prediction("Left", 22, 0); }
	if( X6 >= 0.09 ) { 
	if( Z13 < 9.68 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Left", 18, 0); }
		if( X17 < 0.08 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z13 >= 9.68 ) { 
	if( X13 >= 0.12 ) { 
		if( X26 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X26 >= 0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( X13 < 0.12 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	}
	if( Z27 < 9.75 ) { 
		if( Z17 < 9.57 ) { return new Prediction("Right", 9, 0); }
	if( Z17 >= 9.57 ) { 
	if( X20 < 0.12 ) { 
	if( X21 >= 0.11 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Right", 8, 0); }
	if( Y5 < -0.11 ) { 
		if( Z19 < 9.79 ) { return new Prediction("Right", 4, 0); }
		if( Z19 >= 9.79 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( X21 < 0.11 ) { 
	if( X6 < 0.12 ) { 
	if( Y22 < -0.1 ) { 
	if( Z16 < 9.79 ) { 
		if( Z10 >= 9.73 ) { return new Prediction("Left", 32, 0); }
	if( Z10 < 9.73 ) { 
	if( Z29 >= 9.72 ) { 
		if( Z11 < 9.71 ) { return new Prediction("Left", 2, 0); }
		if( Z11 >= 9.71 ) { return new Prediction("Right", 8, 0); }
	}
	if( Z29 < 9.72 ) { 
		if( X23 < 0.11 ) { return new Prediction("Left", 30, 0); }
		if( X23 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Z16 >= 9.79 ) { 
		if( Z9 >= 9.85 ) { return new Prediction("Right", 5, 0); }
		if( Z9 < 9.85 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y22 >= -0.1 ) { 
		if( X7 >= 0.11 ) { return new Prediction("Left", 4, 0); }
		if( X7 < 0.11 ) { return new Prediction("Right", 13, 0); }
	}
	}
		if( X6 >= 0.12 ) { return new Prediction("Left", 21, 0); }
	}
	}
		if( X20 >= 0.12 ) { return new Prediction("Right", 14, 0); }
	}
	}
	}
	}
	if( Z23 >= 9.76 ) { 
		if( Z7 >= 9.91 ) { return new Prediction("Right", 91, 0); }
	if( Z7 < 9.91 ) { 
	if( Z25 < 9.79 ) { 
		if( Z11 < 9.54 ) { return new Prediction("Left", 16, 0); }
	if( Z11 >= 9.54 ) { 
	if( Y21 < -0.13 ) { 
		if( Z30 < 9.76 ) { return new Prediction("Left", 9, 0); }
		if( Z30 >= 9.76 ) { return new Prediction("Right", 7, 0); }
	}
	if( Y21 >= -0.13 ) { 
	if( Y17 < -0.11 ) { 
		if( X21 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X21 >= 0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y17 >= -0.11 ) { return new Prediction("Right", 27, 0); }
	}
	}
	}
	if( Z25 >= 9.79 ) { 
		if( Z31 >= 9.8 ) { return new Prediction("Right", 45, 0); }
	if( Z31 < 9.8 ) { 
		if( X16 < 0.11 ) { return new Prediction("Left", 4, 0); }
		if( X16 >= 0.11 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree47() {
	if( Z22 < 9.7 ) { 
	if( Z6 >= 9.73 ) { 
		if( Y23 < -0.14 ) { return new Prediction("Right", 2, 0); }
		if( Y23 >= -0.14 ) { return new Prediction("Left", 65, 0); }
	}
	if( Z6 < 9.73 ) { 
	if( Z19 >= 9.81 ) { 
	if( Z28 < 9.68 ) { 
		if( X13 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X13 >= 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z28 >= 9.68 ) { return new Prediction("Left", 46, 0); }
	}
	if( Z19 < 9.81 ) { 
	if( Z11 < 9.69 ) { 
		if( X17 < 0.11 ) { return new Prediction("Left", 29, 0); }
		if( X17 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z11 >= 9.69 ) { 
	if( Z24 >= 9.63 ) { 
	if( Z7 < 9.59 ) { 
	if( X18 >= 0.11 ) { 
		if( X14 < 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X14 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( X18 < 0.11 ) { return new Prediction("Left", 21, 0); }
	}
	if( Z7 >= 9.59 ) { 
	if( Z13 < 9.68 ) { 
		if( Z13 >= 9.59 ) { return new Prediction("Left", 11, 0); }
		if( Z13 < 9.59 ) { return new Prediction("Right", 4, 0); }
	}
	if( Z13 >= 9.68 ) { 
	if( Y11 < -0.12 ) { 
	if( Y24 < -0.11 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 6, 0); }
		if( X4 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y24 >= -0.11 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y11 >= -0.12 ) { return new Prediction("Right", 16, 0); }
	}
	}
	}
		if( Z24 < 9.63 ) { return new Prediction("Right", 15, 0); }
	}
	}
	}
	}
	if( Z22 >= 9.7 ) { 
	if( X2 >= 0.11 ) { 
		if( Z14 >= 9.93 ) { return new Prediction("Right", 8, 0); }
	if( Z14 < 9.93 ) { 
	if( X12 >= 0.12 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y5 < -0.1 ) { return new Prediction("Left", 25, 0); }
	}
	if( X12 < 0.12 ) { 
		if( Y15 >= -0.12 ) { return new Prediction("Right", 11, 0); }
	if( Y15 < -0.12 ) { 
		if( X7 >= 0.12 ) { return new Prediction("Right", 6, 0); }
	if( X7 < 0.12 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 11, 0); }
		if( Y4 >= -0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	}
	if( X2 < 0.11 ) { 
	if( Z24 >= 9.78 ) { 
	if( Y12 < -0.1 ) { 
	if( X15 < 0.07 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X3 >= 0.08 ) { return new Prediction("Right", 1, 0); }
	}
		if( X15 >= 0.07 ) { return new Prediction("Right", 126, 0); }
	}
	if( Y12 >= -0.1 ) { 
		if( Z31 >= 9.79 ) { return new Prediction("Right", 7, 0); }
		if( Z31 < 9.79 ) { return new Prediction("Left", 7, 0); }
	}
	}
	if( Z24 < 9.78 ) { 
	if( Z7 >= 9.66 ) { 
	if( X7 >= 0.1 ) { 
	if( Z18 >= 9.5 ) { 
		if( Z26 < 9.64 ) { return new Prediction("Left", 23, 0); }
	if( Z26 >= 9.64 ) { 
		if( Y13 >= -0.12 ) { return new Prediction("Left", 5, 0); }
		if( Y13 < -0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z18 < 9.5 ) { return new Prediction("Right", 1, 0); }
	}
	if( X7 < 0.1 ) { 
		if( X26 >= 0.11 ) { return new Prediction("Right", 7, 0); }
	if( X26 < 0.11 ) { 
	if( X18 >= 0.11 ) { 
		if( X6 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( X18 < 0.11 ) { return new Prediction("Left", 8, 0); }
	}
	}
	}
	if( Z7 < 9.66 ) { 
	if( Z14 < 9.62 ) { 
		if( X14 < 0.1 ) { return new Prediction("Right", 5, 0); }
		if( X14 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z14 >= 9.62 ) { return new Prediction("Right", 32, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree48() {
	if( Z10 >= 9.73 ) { 
		if( Z8 < 9.54 ) { return new Prediction("Left", 45, 0); }
	if( Z8 >= 9.54 ) { 
	if( X28 < 0.13 ) { 
	if( Z12 < 9.77 ) { 
	if( Z20 >= 9.76 ) { 
	if( Y26 >= -0.11 ) { 
		if( X9 < 0.1 ) { return new Prediction("Left", 8, 0); }
		if( X9 >= 0.1 ) { return new Prediction("Right", 3, 0); }
	}
	if( Y26 < -0.11 ) { 
		if( Y6 >= -0.11 ) { return new Prediction("Right", 19, 0); }
	if( Y6 < -0.11 ) { 
	if( Z28 < 9.72 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X23 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z28 >= 9.72 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Z20 < 9.76 ) { 
		if( Z20 < 9.63 ) { return new Prediction("Right", 3, 0); }
		if( Z20 >= 9.63 ) { return new Prediction("Left", 32, 0); }
	}
	}
		if( Z12 >= 9.77 ) { return new Prediction("Left", 75, 0); }
	}
		if( X28 >= 0.13 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z10 < 9.73 ) { 
	if( Z14 >= 9.85 ) { 
	if( Z13 < 9.68 ) { 
	if( Z22 >= 9.73 ) { 
		if( X15 < 0.11 ) { return new Prediction("Right", 99, 0); }
	if( X15 >= 0.11 ) { 
		if( X18 >= 0.11 ) { return new Prediction("Right", 31, 0); }
	if( X18 < 0.11 ) { 
		if( Y14 < -0.13 ) { return new Prediction("Right", 4, 0); }
		if( Y14 >= -0.13 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
		if( Z22 < 9.73 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z13 >= 9.68 ) { 
	if( X5 < 0.13 ) { 
		if( X28 < 0.12 ) { return new Prediction("Right", 25, 0); }
		if( X28 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	if( X5 >= 0.13 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y5 < -0.1 ) { return new Prediction("Left", 6, 0); }
	}
	}
	}
	if( Z14 < 9.85 ) { 
	if( Y7 < -0.1 ) { 
	if( X23 < 0.11 ) { 
		if( Z7 >= 9.92 ) { return new Prediction("Right", 3, 0); }
	if( Z7 < 9.92 ) { 
	if( Z3 < 9.8 ) { 
	if( X20 < 0.12 ) { 
		if( Y5 < -0.14 ) { return new Prediction("Right", 3, 0); }
	if( Y5 >= -0.14 ) { 
		if( Z17 < 9.72 ) { return new Prediction("Left", 44, 0); }
	if( Z17 >= 9.72 ) { 
		if( X18 < 0.1 ) { return new Prediction("Left", 6, 0); }
		if( X18 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
		if( X20 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z3 >= 9.8 ) { return new Prediction("Right", 6, 0); }
	}
	}
		if( X23 >= 0.11 ) { return new Prediction("Right", 11, 0); }
	}
	if( Y7 >= -0.1 ) { 
	if( X19 >= 0.08 ) { 
		if( X15 < 0.07 ) { return new Prediction("Left", 6, 0); }
	if( X15 >= 0.07 ) { 
		if( Z3 >= 9.6 ) { return new Prediction("Right", 19, 0); }
	if( Z3 < 9.6 ) { 
		if( X9 >= 0.12 ) { return new Prediction("Left", 4, 0); }
	if( X9 < 0.12 ) { 
	if( Y30 >= -0.11 ) { 
		if( X7 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	if( X7 < 0.1 ) { 
		if( X24 >= 0.09 ) { return new Prediction("Right", 8, 0); }
		if( X24 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Y30 < -0.11 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	}
		if( X19 < 0.08 ) { return new Prediction("Right", 26, 0); }
	}
	}
	}
return null;
}
private Prediction runTree49() {
	if( Z15 >= 9.85 ) { 
	if( Z23 >= 9.73 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 7, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 124, 0); }
	}
		if( Z23 < 9.73 ) { return new Prediction("Left", 10, 0); }
	}
	if( Z15 < 9.85 ) { 
	if( Z12 < 9.82 ) { 
	if( X10 < 0.08 ) { 
		if( Y3 < -0.13 ) { return new Prediction("Right", 5, 0); }
	if( Y3 >= -0.13 ) { 
	if( Z8 < 9.74 ) { 
		if( X17 < 0.1 ) { return new Prediction("Left", 18, 0); }
	if( X17 >= 0.1 ) { 
	if( X25 < 0.1 ) { 
		if( Z1 >= 9.85 ) { return new Prediction("Right", 1, 0); }
		if( Z1 < 9.85 ) { return new Prediction("Left", 5, 0); }
	}
		if( X25 >= 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( Z8 >= 9.74 ) { return new Prediction("Left", 26, 0); }
	}
	}
	if( X10 >= 0.08 ) { 
	if( Y23 >= -0.1 ) { 
		if( X25 < 0.09 ) { return new Prediction("Left", 7, 0); }
	if( X25 >= 0.09 ) { 
	if( Z22 < 9.66 ) { 
		if( X2 < 0.1 ) { return new Prediction("Left", 8, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Right", 9, 0); }
	}
	if( Z22 >= 9.66 ) { 
	if( Z3 < 9.57 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X5 < 0.1 ) { return new Prediction("Right", 4, 0); }
	}
		if( Z3 >= 9.57 ) { return new Prediction("Right", 49, 0); }
	}
	}
	}
	if( Y23 < -0.1 ) { 
	if( Z6 < 9.83 ) { 
	if( Z24 < 9.77 ) { 
	if( X1 < 0.09 ) { 
	if( Z26 < 9.71 ) { 
		if( X8 >= 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X8 < 0.08 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z26 >= 9.71 ) { return new Prediction("Left", 24, 0); }
	}
	if( X1 >= 0.09 ) { 
		if( Z7 >= 9.65 ) { return new Prediction("Left", 34, 0); }
	if( Z7 < 9.65 ) { 
		if( Y21 < -0.13 ) { return new Prediction("Left", 5, 0); }
	if( Y21 >= -0.13 ) { 
		if( Z18 >= 9.76 ) { return new Prediction("Right", 27, 0); }
	if( Z18 < 9.76 ) { 
		if( X24 >= 0.11 ) { return new Prediction("Right", 9, 0); }
	if( X24 < 0.11 ) { 
	if( Z18 < 9.74 ) { 
		if( Z22 >= 9.67 ) { return new Prediction("Right", 5, 0); }
	if( Z22 < 9.67 ) { 
		if( Z17 < 9.73 ) { return new Prediction("Left", 5, 0); }
		if( Z17 >= 9.73 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( Z18 >= 9.74 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	}
	}
		if( Z24 >= 9.77 ) { return new Prediction("Right", 29, 0); }
	}
		if( Z6 >= 9.83 ) { return new Prediction("Right", 15, 0); }
	}
	}
	}
	if( Z12 >= 9.82 ) { 
		if( Z27 < 9.72 ) { return new Prediction("Right", 5, 0); }
		if( Z27 >= 9.72 ) { return new Prediction("Left", 75, 0); }
	}
	}
return null;
}
private Prediction runTree50() {
	if( Z7 >= 9.86 ) { 
		if( X7 < 0.04 ) { return new Prediction("Left", 3, 0); }
	if( X7 >= 0.04 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 1, 0); }
	if( X10 >= 0.08 ) { 
		if( Y7 >= -0.15 ) { return new Prediction("Right", 113, 0); }
		if( Y7 < -0.15 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z7 < 9.86 ) { 
	if( Z12 >= 9.78 ) { 
	if( Y25 < -0.09 ) { 
	if( Z19 < 9.78 ) { 
		if( X15 < 0.13 ) { return new Prediction("Right", 11, 0); }
		if( X15 >= 0.13 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z19 >= 9.78 ) { 
		if( Z8 >= 9.71 ) { return new Prediction("Right", 2, 0); }
		if( Z8 < 9.71 ) { return new Prediction("Left", 93, 0); }
	}
	}
		if( Y25 >= -0.09 ) { return new Prediction("Right", 9, 0); }
	}
	if( Z12 < 9.78 ) { 
		if( Z31 >= 9.82 ) { return new Prediction("Right", 26, 0); }
	if( Z31 < 9.82 ) { 
	if( Z1 < 9.88 ) { 
	if( Z25 < 9.78 ) { 
	if( Z27 >= 9.77 ) { 
		if( Z21 < 9.62 ) { return new Prediction("Right", 15, 0); }
	if( Z21 >= 9.62 ) { 
		if( X22 < 0.11 ) { return new Prediction("Left", 5, 0); }
		if( X22 >= 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z27 < 9.77 ) { 
	if( Z15 >= 9.57 ) { 
		if( Z21 < 9.66 ) { return new Prediction("Left", 37, 0); }
	if( Z21 >= 9.66 ) { 
	if( Z15 >= 9.72 ) { 
		if( Z17 >= 9.75 ) { return new Prediction("Right", 7, 0); }
	if( Z17 < 9.75 ) { 
	if( Z11 >= 9.67 ) { 
		if( Z6 < 9.67 ) { return new Prediction("Right", 2, 0); }
	if( Z6 >= 9.67 ) { 
	if( Z8 < 9.76 ) { 
		if( X8 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X8 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z8 >= 9.76 ) { return new Prediction("Left", 8, 0); }
	}
	}
		if( Z11 < 9.67 ) { return new Prediction("Left", 51, 0); }
	}
	}
	if( Z15 < 9.72 ) { 
	if( Y26 >= -0.11 ) { 
		if( X32 < 0.1 ) { return new Prediction("Left", 6, 0); }
	if( X32 >= 0.1 ) { 
		if( Z14 >= 9.65 ) { return new Prediction("Right", 2, 0); }
		if( Z14 < 9.65 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Y26 < -0.11 ) { 
	if( X6 < 0.1 ) { 
	if( Z3 >= 9.82 ) { 
		if( X8 >= 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X8 < 0.08 ) { return new Prediction("Right", 5, 0); }
	}
		if( Z3 < 9.82 ) { return new Prediction("Left", 5, 0); }
	}
		if( X6 >= 0.1 ) { return new Prediction("Right", 24, 0); }
	}
	}
	}
	}
		if( Z15 < 9.57 ) { return new Prediction("Left", 25, 0); }
	}
	}
	if( Z25 >= 9.78 ) { 
		if( X11 < 0.07 ) { return new Prediction("Left", 7, 0); }
		if( X11 >= 0.07 ) { return new Prediction("Right", 25, 0); }
	}
	}
		if( Z1 >= 9.88 ) { return new Prediction("Right", 28, 0); }
	}
	}
	}
return null;
}
private Prediction runTree51() {
	if( Z3 >= 9.61 ) { 
	if( Z17 < 9.62 ) { 
	if( X10 >= 0.06 ) { 
		if( Z3 < 9.8 ) { return new Prediction("Left", 1, 0); }
		if( Z3 >= 9.8 ) { return new Prediction("Right", 22, 0); }
	}
		if( X10 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z17 >= 9.62 ) { 
	if( Y5 < -0.08 ) { 
		if( Z20 >= 9.83 ) { return new Prediction("Left", 67, 0); }
	if( Z20 < 9.83 ) { 
		if( Z7 >= 9.65 ) { return new Prediction("Left", 30, 0); }
	if( Z7 < 9.65 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 37, 0); }
	if( Z13 < 9.78 ) { 
		if( X19 >= 0.12 ) { return new Prediction("Right", 7, 0); }
	if( X19 < 0.12 ) { 
		if( Z32 < 9.62 ) { return new Prediction("Left", 10, 0); }
	if( Z32 >= 9.62 ) { 
	if( X12 >= 0.11 ) { 
	if( X11 >= 0.09 ) { 
		if( Z10 >= 9.77 ) { return new Prediction("Right", 16, 0); }
	if( Z10 < 9.77 ) { 
	if( Z24 >= 9.62 ) { 
		if( X20 < 0.11 ) { return new Prediction("Left", 3, 0); }
		if( X20 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z24 < 9.62 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	if( X12 < 0.11 ) { 
		if( Z23 >= 9.7 ) { return new Prediction("Right", 5, 0); }
	if( Z23 < 9.7 ) { 
	if( X32 < 0.12 ) { 
	if( Z3 < 9.87 ) { 
		if( Z21 < 9.7 ) { return new Prediction("Left", 38, 0); }
	if( Z21 >= 9.7 ) { 
		if( Y12 < -0.11 ) { return new Prediction("Left", 5, 0); }
		if( Y12 >= -0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( Z3 >= 9.87 ) { return new Prediction("Right", 4, 0); }
	}
		if( X32 >= 0.12 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
		if( Y5 >= -0.08 ) { return new Prediction("Right", 8, 0); }
	}
	}
	if( Z3 < 9.61 ) { 
	if( Z12 >= 9.52 ) { 
	if( Z30 < 9.77 ) { 
	if( Y24 < -0.11 ) { 
		if( Z15 < 9.76 ) { return new Prediction("Left", 8, 0); }
	if( Z15 >= 9.76 ) { 
	if( Z8 < 9.86 ) { 
	if( X13 >= 0.1 ) { 
		if( Z18 >= 9.72 ) { return new Prediction("Right", 1, 0); }
		if( Z18 < 9.72 ) { return new Prediction("Left", 9, 0); }
	}
	if( X13 < 0.1 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X1 < 0.11 ) { return new Prediction("Right", 18, 0); }
	}
	}
		if( Z8 >= 9.86 ) { return new Prediction("Right", 62, 0); }
	}
	}
	if( Y24 >= -0.11 ) { 
	if( Z18 < 9.71 ) { 
		if( Z32 >= 9.82 ) { return new Prediction("Right", 3, 0); }
	if( Z32 < 9.82 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Left", 25, 0); }
	if( X3 < 0.09 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X11 < 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( Z18 >= 9.71 ) { return new Prediction("Right", 17, 0); }
	}
	}
	if( Z30 >= 9.77 ) { 
	if( Y29 < -0.14 ) { 
		if( X11 < 0.14 ) { return new Prediction("Right", 1, 0); }
		if( X11 >= 0.14 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y29 >= -0.14 ) { return new Prediction("Right", 75, 0); }
	}
	}
		if( Z12 < 9.52 ) { return new Prediction("Left", 30, 0); }
	}
return null;
}
private Prediction runTree52() {
	if( Z27 < 9.71 ) { 
	if( X17 < 0.09 ) { 
		if( Z18 < 9.57 ) { return new Prediction("Left", 10, 0); }
	if( Z18 >= 9.57 ) { 
		if( Z2 >= 9.59 ) { return new Prediction("Right", 10, 0); }
		if( Z2 < 9.59 ) { return new Prediction("Left", 12, 0); }
	}
	}
	if( X17 >= 0.09 ) { 
		if( Z4 >= 9.77 ) { return new Prediction("Right", 55, 0); }
	if( Z4 < 9.77 ) { 
	if( Z20 < 9.59 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 13, 0); }
	if( Z24 >= 9.77 ) { 
	if( Z3 < 9.43 ) { 
		if( Y22 >= -0.14 ) { return new Prediction("Right", 15, 0); }
	if( Y22 < -0.14 ) { 
		if( X25 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X25 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z3 >= 9.43 ) { return new Prediction("Right", 128, 0); }
	}
	}
	if( Z20 >= 9.59 ) { 
		if( X1 < 0.08 ) { return new Prediction("Right", 12, 0); }
	if( X1 >= 0.08 ) { 
	if( X15 < 0.11 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Right", 7, 0); }
	if( X19 < 0.1 ) { 
		if( X14 < 0.09 ) { return new Prediction("Left", 6, 0); }
		if( X14 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X15 >= 0.11 ) { return new Prediction("Left", 21, 0); }
	}
	}
	}
	}
	}
	if( Z27 >= 9.71 ) { 
	if( Z31 < 9.63 ) { 
		if( Y22 < -0.1 ) { return new Prediction("Left", 64, 0); }
	if( Y22 >= -0.1 ) { 
	if( X30 >= 0.11 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Right", 6, 0); }
		if( X7 < 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	if( X30 < 0.11 ) { 
		if( X22 < 0.09 ) { return new Prediction("Right", 2, 0); }
		if( X22 >= 0.09 ) { return new Prediction("Left", 32, 0); }
	}
	}
	}
	if( Z31 >= 9.63 ) { 
	if( Z21 < 9.71 ) { 
	if( Z5 < 9.73 ) { 
		if( Z29 >= 9.72 ) { return new Prediction("Right", 10, 0); }
	if( Z29 < 9.72 ) { 
		if( Z32 >= 9.68 ) { return new Prediction("Left", 26, 0); }
	if( Z32 < 9.68 ) { 
	if( Z1 < 9.84 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Right", 4, 0); }
	if( X11 < 0.12 ) { 
		if( Z7 < 9.61 ) { return new Prediction("Left", 14, 0); }
	if( Z7 >= 9.61 ) { 
		if( Z7 >= 9.65 ) { return new Prediction("Left", 5, 0); }
	if( Z7 < 9.65 ) { 
		if( Y4 >= -0.12 ) { return new Prediction("Right", 6, 0); }
		if( Y4 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
		if( Z1 >= 9.84 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
		if( Z5 >= 9.73 ) { return new Prediction("Left", 28, 0); }
	}
	if( Z21 >= 9.71 ) { 
		if( X13 < 0.09 ) { return new Prediction("Left", 2, 0); }
	if( X13 >= 0.09 ) { 
	if( Z21 >= 9.76 ) { 
		if( X24 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X24 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z21 < 9.76 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree53() {
	if( Z25 < 9.79 ) { 
	if( Z27 < 9.73 ) { 
	if( X14 < 0.09 ) { 
		if( Z30 >= 9.78 ) { return new Prediction("Right", 7, 0); }
	if( Z30 < 9.78 ) { 
		if( Y24 >= -0.09 ) { return new Prediction("Right", 3, 0); }
	if( Y24 < -0.09 ) { 
	if( Z6 >= 9.79 ) { 
		if( X6 < 0.11 ) { return new Prediction("Left", 4, 0); }
		if( X6 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z6 < 9.79 ) { return new Prediction("Left", 21, 0); }
	}
	}
	}
	if( X14 >= 0.09 ) { 
		if( Z29 < 9.66 ) { return new Prediction("Right", 19, 0); }
	if( Z29 >= 9.66 ) { 
	if( Z7 >= 9.67 ) { 
	if( Y15 >= -0.13 ) { 
	if( Z24 < 9.83 ) { 
		if( X32 < 0.1 ) { return new Prediction("Left", 33, 0); }
	if( X32 >= 0.1 ) { 
		if( Y5 >= -0.13 ) { return new Prediction("Left", 11, 0); }
		if( Y5 < -0.13 ) { return new Prediction("Right", 5, 0); }
	}
	}
		if( Z24 >= 9.83 ) { return new Prediction("Right", 12, 0); }
	}
		if( Y15 < -0.13 ) { return new Prediction("Right", 7, 0); }
	}
	if( Z7 < 9.67 ) { 
		if( Y13 >= -0.11 ) { return new Prediction("Right", 32, 0); }
	if( Y13 < -0.11 ) { 
		if( Y13 >= -0.12 ) { return new Prediction("Left", 5, 0); }
		if( Y13 < -0.12 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	}
	}
	if( Z27 >= 9.73 ) { 
	if( Z12 < 9.8 ) { 
		if( Z32 < 9.62 ) { return new Prediction("Left", 33, 0); }
	if( Z32 >= 9.62 ) { 
		if( Z31 >= 9.68 ) { return new Prediction("Left", 14, 0); }
	if( Z31 < 9.68 ) { 
	if( Z24 >= 9.63 ) { 
	if( Y20 >= -0.1 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 12, 0); }
	if( X1 >= 0.09 ) { 
		if( Z3 < 9.84 ) { return new Prediction("Left", 12, 0); }
		if( Z3 >= 9.84 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Y20 < -0.1 ) { 
		if( Y2 < -0.13 ) { return new Prediction("Left", 6, 0); }
	if( Y2 >= -0.13 ) { 
		if( Z1 < 9.8 ) { return new Prediction("Left", 4, 0); }
	if( Z1 >= 9.8 ) { 
	if( Y7 >= -0.14 ) { 
		if( X8 >= 0.08 ) { return new Prediction("Right", 24, 0); }
		if( X8 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y7 < -0.14 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	if( Z24 < 9.63 ) { 
		if( Z18 >= 9.82 ) { return new Prediction("Left", 1, 0); }
		if( Z18 < 9.82 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	}
		if( Z12 >= 9.8 ) { return new Prediction("Left", 85, 0); }
	}
	}
	if( Z25 >= 9.79 ) { 
	if( Y13 < -0.08 ) { 
	if( Z14 < 9.7 ) { 
		if( Y17 < -0.11 ) { return new Prediction("Left", 5, 0); }
		if( Y17 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z14 >= 9.7 ) { 
		if( Z23 < 9.86 ) { return new Prediction("Right", 114, 0); }
	if( Z23 >= 9.86 ) { 
		if( Z12 >= 9.49 ) { return new Prediction("Right", 13, 0); }
		if( Z12 < 9.49 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
		if( Y13 >= -0.08 ) { return new Prediction("Left", 6, 0); }
	}
return null;
}
private Prediction runTree54() {
	if( Z24 < 9.77 ) { 
	if( Z8 >= 9.66 ) { 
	if( Z4 >= 9.7 ) { 
		if( Z6 < 9.77 ) { return new Prediction("Left", 22, 0); }
	if( Z6 >= 9.77 ) { 
	if( Y13 >= -0.13 ) { 
		if( X13 >= 0.13 ) { return new Prediction("Right", 1, 0); }
		if( X13 < 0.13 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y13 < -0.13 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( Z4 < 9.7 ) { return new Prediction("Left", 66, 0); }
	}
	if( Z8 < 9.66 ) { 
	if( Y25 < -0.1 ) { 
	if( X20 >= 0.09 ) { 
	if( Z12 >= 9.78 ) { 
	if( Y32 >= -0.1 ) { 
		if( X18 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X18 >= 0.09 ) { return new Prediction("Left", 13, 0); }
	}
		if( Y32 < -0.1 ) { return new Prediction("Left", 69, 0); }
	}
	if( Z12 < 9.78 ) { 
		if( Z8 < 9.51 ) { return new Prediction("Left", 20, 0); }
	if( Z8 >= 9.51 ) { 
	if( Z29 < 9.71 ) { 
		if( X25 < 0.09 ) { return new Prediction("Right", 7, 0); }
	if( X25 >= 0.09 ) { 
		if( Z6 >= 9.65 ) { return new Prediction("Left", 15, 0); }
	if( Z6 < 9.65 ) { 
		if( Z13 >= 9.71 ) { return new Prediction("Right", 8, 0); }
		if( Z13 < 9.71 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
		if( Z29 >= 9.71 ) { return new Prediction("Right", 19, 0); }
	}
	}
	}
	if( X20 < 0.09 ) { 
	if( Z16 >= 9.62 ) { 
		if( Z20 >= 9.82 ) { return new Prediction("Left", 9, 0); }
	if( Z20 < 9.82 ) { 
	if( X10 < 0.09 ) { 
		if( Y28 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y28 < -0.1 ) { return new Prediction("Left", 8, 0); }
	}
		if( X10 >= 0.09 ) { return new Prediction("Right", 9, 0); }
	}
	}
	if( Z16 < 9.62 ) { 
		if( Z9 < 9.76 ) { return new Prediction("Right", 12, 0); }
	if( Z9 >= 9.76 ) { 
		if( X17 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X17 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Y25 >= -0.1 ) { 
		if( X27 >= 0.1 ) { return new Prediction("Right", 26, 0); }
	if( X27 < 0.1 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Right", 3, 0); }
	if( Y5 < -0.11 ) { 
		if( Z5 >= 9.61 ) { return new Prediction("Left", 4, 0); }
		if( Z5 < 9.61 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
	if( Z24 >= 9.77 ) { 
	if( X6 >= 0.06 ) { 
	if( Z15 < 9.75 ) { 
		if( X6 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z15 >= 9.75 ) { 
		if( Z11 < 9.43 ) { return new Prediction("Left", 1, 0); }
		if( Z11 >= 9.43 ) { return new Prediction("Right", 165, 0); }
	}
	}
	if( X6 < 0.06 ) { 
		if( Z26 >= 9.6 ) { return new Prediction("Left", 8, 0); }
		if( Z26 < 9.6 ) { return new Prediction("Right", 10, 0); }
	}
	}
return null;
}
private Prediction runTree55() {
	if( Y14 < -0.13 ) { 
	if( Y26 >= -0.11 ) { 
	if( Y2 >= -0.09 ) { 
		if( X20 < 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X20 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y2 < -0.09 ) { return new Prediction("Right", 43, 0); }
	}
	if( Y26 < -0.11 ) { 
	if( Z24 < 9.76 ) { 
		if( Y31 < -0.11 ) { return new Prediction("Left", 11, 0); }
	if( Y31 >= -0.11 ) { 
		if( X29 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X29 >= 0.09 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z24 >= 9.76 ) { 
		if( Y27 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y27 >= -0.13 ) { return new Prediction("Right", 17, 0); }
	}
	}
	}
	if( Y14 >= -0.13 ) { 
	if( X19 >= 0.11 ) { 
	if( Y25 >= -0.13 ) { 
		if( Z8 < 9.55 ) { return new Prediction("Left", 5, 0); }
	if( Z8 >= 9.55 ) { 
	if( Z23 < 9.74 ) { 
		if( Z11 >= 9.81 ) { return new Prediction("Left", 2, 0); }
	if( Z11 < 9.81 ) { 
		if( Y29 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y29 >= -0.13 ) { return new Prediction("Right", 8, 0); }
	}
	}
		if( Z23 >= 9.74 ) { return new Prediction("Right", 37, 0); }
	}
	}
		if( Y25 < -0.13 ) { return new Prediction("Left", 3, 0); }
	}
	if( X19 < 0.11 ) { 
	if( Z10 < 9.75 ) { 
	if( Z17 < 9.71 ) { 
	if( X19 >= 0.08 ) { 
	if( X22 < 0.1 ) { 
	if( Z5 < 9.78 ) { 
	if( Z31 >= 9.81 ) { 
		if( X22 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X22 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z31 < 9.81 ) { return new Prediction("Left", 56, 0); }
	}
	if( Z5 >= 9.78 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Right", 6, 0); }
		if( X10 < 0.11 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( X22 >= 0.1 ) { 
	if( Y14 < -0.11 ) { 
	if( X26 >= 0.11 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X21 < 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( X26 < 0.11 ) { return new Prediction("Left", 11, 0); }
	}
	if( Y14 >= -0.11 ) { 
		if( Z30 >= 9.71 ) { return new Prediction("Right", 18, 0); }
	if( Z30 < 9.71 ) { 
	if( Y9 < -0.11 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Right", 11, 0); }
	if( X3 < 0.09 ) { 
		if( Y25 >= -0.12 ) { return new Prediction("Left", 4, 0); }
		if( Y25 < -0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y9 >= -0.11 ) { return new Prediction("Left", 6, 0); }
	}
	}
	}
	}
	if( X19 < 0.08 ) { 
		if( Z5 >= 9.68 ) { return new Prediction("Right", 18, 0); }
		if( Z5 < 9.68 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z17 >= 9.71 ) { 
		if( X6 >= 0.07 ) { return new Prediction("Right", 56, 0); }
	if( X6 < 0.07 ) { 
		if( Z9 < 9.53 ) { return new Prediction("Right", 2, 0); }
	if( Z9 >= 9.53 ) { 
		if( X29 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X29 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	}
	if( Z10 >= 9.75 ) { 
	if( Z25 < 9.63 ) { 
		if( Z12 >= 9.73 ) { return new Prediction("Left", 54, 0); }
		if( Z12 < 9.73 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z25 >= 9.63 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 37, 0); }
	if( Z13 < 9.78 ) { 
	if( X11 >= 0.09 ) { 
	if( Z19 >= 9.76 ) { 
	if( Z25 >= 9.73 ) { 
		if( Y16 < -0.14 ) { return new Prediction("Right", 1, 0); }
		if( Y16 >= -0.14 ) { return new Prediction("Left", 15, 0); }
	}
	if( Z25 < 9.73 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 6, 0); }
	if( X10 >= 0.09 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 24, 0); }
	}
	}
	}
		if( Z19 < 9.76 ) { return new Prediction("Left", 21, 0); }
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 21, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree56() {
	if( Z25 < 9.79 ) { 
	if( Z31 < 9.62 ) { 
	if( Z4 < 9.91 ) { 
	if( Z26 < 9.73 ) { 
		if( X16 >= 0.09 ) { return new Prediction("Left", 5, 0); }
		if( X16 < 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z26 >= 9.73 ) { return new Prediction("Left", 82, 0); }
	}
	if( Z4 >= 9.91 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z31 >= 9.62 ) { 
	if( Z30 >= 9.79 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 1, 0); }
	if( X27 >= 0.09 ) { 
		if( Z10 >= 9.45 ) { return new Prediction("Right", 39, 0); }
		if( Z10 < 9.45 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z30 < 9.79 ) { 
	if( X24 >= 0.11 ) { 
	if( Z17 >= 9.6 ) { 
	if( X23 < 0.12 ) { 
	if( Y7 < -0.1 ) { 
		if( Z10 >= 9.76 ) { return new Prediction("Left", 11, 0); }
	if( Z10 < 9.76 ) { 
	if( X11 >= 0.1 ) { 
		if( X32 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X32 >= 0.08 ) { return new Prediction("Left", 6, 0); }
	}
	if( X11 < 0.1 ) { 
		if( Z4 >= 9.62 ) { return new Prediction("Right", 5, 0); }
		if( Z4 < 9.62 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Y7 >= -0.1 ) { return new Prediction("Right", 5, 0); }
	}
		if( X23 >= 0.12 ) { return new Prediction("Right", 6, 0); }
	}
		if( Z17 < 9.6 ) { return new Prediction("Right", 20, 0); }
	}
	if( X24 < 0.11 ) { 
	if( Z13 >= 9.7 ) { 
	if( Z30 < 9.74 ) { 
		if( Z1 < 9.8 ) { return new Prediction("Left", 15, 0); }
	if( Z1 >= 9.8 ) { 
	if( Z13 >= 9.78 ) { 
		if( X23 >= 0.08 ) { return new Prediction("Left", 9, 0); }
		if( X23 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z13 < 9.78 ) { 
		if( X2 < 0.08 ) { return new Prediction("Left", 1, 0); }
	if( X2 >= 0.08 ) { 
		if( Y21 < -0.13 ) { return new Prediction("Left", 2, 0); }
		if( Y21 >= -0.13 ) { return new Prediction("Right", 46, 0); }
	}
	}
	}
	}
	if( Z30 >= 9.74 ) { 
		if( Z5 >= 9.91 ) { return new Prediction("Right", 2, 0); }
		if( Z5 < 9.91 ) { return new Prediction("Left", 22, 0); }
	}
	}
	if( Z13 < 9.7 ) { 
	if( Z16 >= 9.74 ) { 
	if( X30 >= 0.11 ) { 
	if( X29 < 0.12 ) { 
		if( X9 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Right", 10, 0); }
	}
		if( X29 >= 0.12 ) { return new Prediction("Left", 3, 0); }
	}
	if( X30 < 0.11 ) { 
	if( Z30 < 9.75 ) { 
		if( Z11 >= 9.76 ) { return new Prediction("Right", 2, 0); }
		if( Z11 < 9.76 ) { return new Prediction("Left", 31, 0); }
	}
		if( Z30 >= 9.75 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z16 < 9.74 ) { 
	if( Y3 < -0.13 ) { 
		if( X20 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X20 >= 0.08 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y3 >= -0.13 ) { return new Prediction("Left", 40, 0); }
	}
	}
	}
	}
	}
	}
	if( Z25 >= 9.79 ) { 
		if( Z26 < 9.64 ) { return new Prediction("Right", 124, 0); }
	if( Z26 >= 9.64 ) { 
	if( X11 >= 0.1 ) { 
		if( Y18 >= -0.12 ) { return new Prediction("Right", 9, 0); }
		if( Y18 < -0.12 ) { return new Prediction("Left", 3, 0); }
	}
		if( X11 < 0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
return null;
}
private Prediction runTree57() {
	if( Z12 >= 9.81 ) { 
	if( Z4 < 9.91 ) { 
		if( Z21 < 9.75 ) { return new Prediction("Left", 83, 0); }
	if( Z21 >= 9.75 ) { 
		if( Y27 < -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y27 >= -0.12 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( Z4 >= 9.91 ) { 
		if( X6 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Right", 7, 0); }
	}
	}
	if( Z12 < 9.81 ) { 
	if( Z14 >= 9.85 ) { 
	if( X6 < 0.11 ) { 
		if( Y5 >= -0.13 ) { return new Prediction("Right", 112, 0); }
	if( Y5 < -0.13 ) { 
		if( Y11 < -0.12 ) { return new Prediction("Right", 9, 0); }
		if( Y11 >= -0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( X6 >= 0.11 ) { 
		if( Z1 >= 9.59 ) { return new Prediction("Left", 5, 0); }
	if( Z1 < 9.59 ) { 
		if( Z29 < 9.7 ) { return new Prediction("Right", 19, 0); }
	if( Z29 >= 9.7 ) { 
		if( X31 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X31 < 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	if( Z14 < 9.85 ) { 
	if( Z8 >= 9.52 ) { 
	if( X3 < 0.12 ) { 
	if( Z8 >= 9.67 ) { 
	if( X18 < 0.1 ) { 
	if( Z18 >= 9.76 ) { 
		if( Y15 >= -0.11 ) { return new Prediction("Right", 4, 0); }
		if( Y15 < -0.11 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z18 < 9.76 ) { 
		if( Z25 < 9.78 ) { return new Prediction("Left", 33, 0); }
	if( Z25 >= 9.78 ) { 
		if( X5 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X5 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X18 >= 0.1 ) { 
	if( Y8 >= -0.1 ) { 
		if( X14 >= 0.07 ) { return new Prediction("Right", 29, 0); }
		if( X14 < 0.07 ) { return new Prediction("Left", 1, 0); }
	}
	if( Y8 < -0.1 ) { 
	if( Z13 < 9.63 ) { 
		if( Y29 < -0.13 ) { return new Prediction("Left", 4, 0); }
	if( Y29 >= -0.13 ) { 
		if( Z21 >= 9.76 ) { return new Prediction("Left", 2, 0); }
		if( Z21 < 9.76 ) { return new Prediction("Right", 13, 0); }
	}
	}
	if( Z13 >= 9.63 ) { 
	if( X22 < 0.11 ) { 
	if( X20 < 0.1 ) { 
		if( X32 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X32 < 0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( X20 >= 0.1 ) { return new Prediction("Left", 19, 0); }
	}
		if( X22 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Z8 < 9.67 ) { 
		if( Z30 >= 9.72 ) { return new Prediction("Right", 40, 0); }
	if( Z30 < 9.72 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 14, 0); }
	if( X2 >= 0.09 ) { 
	if( Y16 >= -0.12 ) { 
		if( Y22 < -0.11 ) { return new Prediction("Left", 7, 0); }
	if( Y22 >= -0.11 ) { 
	if( Y8 >= -0.11 ) { 
		if( X24 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X24 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y8 < -0.11 ) { return new Prediction("Right", 10, 0); }
	}
	}
	if( Y16 < -0.12 ) { 
		if( Z19 >= 9.81 ) { return new Prediction("Left", 1, 0); }
		if( Z19 < 9.81 ) { return new Prediction("Right", 25, 0); }
	}
	}
	}
	}
	}
	if( X3 >= 0.12 ) { 
		if( Y4 < -0.14 ) { return new Prediction("Right", 1, 0); }
		if( Y4 >= -0.14 ) { return new Prediction("Left", 18, 0); }
	}
	}
	if( Z8 < 9.52 ) { 
	if( Z7 < 9.61 ) { 
		if( X1 < 0.1 ) { return new Prediction("Left", 31, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z7 >= 9.61 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree58() {
	if( Z30 >= 9.79 ) { 
	if( Z16 < 9.67 ) { 
		if( X6 < 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z16 >= 9.67 ) { return new Prediction("Right", 56, 0); }
	}
	if( Z30 < 9.79 ) { 
	if( Z10 < 9.74 ) { 
	if( Z27 < 9.58 ) { 
		if( Z14 >= 9.85 ) { return new Prediction("Right", 49, 0); }
		if( Z14 < 9.85 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z27 >= 9.58 ) { 
	if( Z3 >= 9.82 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 3, 0); }
	if( X3 >= 0.08 ) { 
		if( Y17 < -0.08 ) { return new Prediction("Right", 45, 0); }
		if( Y17 >= -0.08 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z3 < 9.82 ) { 
	if( Z7 < 9.81 ) { 
	if( Z18 >= 9.72 ) { 
		if( Z19 < 9.62 ) { return new Prediction("Right", 12, 0); }
	if( Z19 >= 9.62 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Right", 3, 0); }
		if( X3 < 0.09 ) { return new Prediction("Left", 6, 0); }
	}
	}
	if( Z18 < 9.72 ) { 
	if( X29 < 0.08 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Right", 3, 0); }
		if( X19 < 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	if( X29 >= 0.08 ) { 
	if( X22 < 0.11 ) { 
		if( Y6 < -0.09 ) { return new Prediction("Left", 49, 0); }
	if( Y6 >= -0.09 ) { 
		if( X10 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X10 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( X22 >= 0.11 ) { 
		if( X6 >= 0.06 ) { return new Prediction("Right", 2, 0); }
		if( X6 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	if( Z7 >= 9.81 ) { 
		if( X8 < 0.07 ) { return new Prediction("Left", 9, 0); }
	if( X8 >= 0.07 ) { 
	if( Z13 < 9.68 ) { 
	if( Z9 >= 9.58 ) { 
		if( X15 < 0.08 ) { return new Prediction("Left", 3, 0); }
	if( X15 >= 0.08 ) { 
		if( Y26 >= -0.11 ) { return new Prediction("Right", 35, 0); }
	if( Y26 < -0.11 ) { 
		if( Y10 < -0.08 ) { return new Prediction("Right", 12, 0); }
		if( Y10 >= -0.08 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z9 < 9.58 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	}
	}
		if( Z13 >= 9.68 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	}
	}
	if( Z10 >= 9.74 ) { 
	if( Z6 < 9.66 ) { 
	if( Z6 >= 9.65 ) { 
	if( X3 >= 0.09 ) { 
		if( Z1 < 9.83 ) { return new Prediction("Left", 3, 0); }
		if( Z1 >= 9.83 ) { return new Prediction("Right", 14, 0); }
	}
		if( X3 < 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	if( Z6 < 9.65 ) { 
		if( Z29 >= 9.69 ) { return new Prediction("Left", 47, 0); }
	if( Z29 < 9.69 ) { 
		if( Z13 < 9.68 ) { return new Prediction("Left", 15, 0); }
	if( Z13 >= 9.68 ) { 
		if( Z8 < 9.59 ) { return new Prediction("Left", 19, 0); }
	if( Z8 >= 9.59 ) { 
		if( Y14 >= -0.1 ) { return new Prediction("Left", 1, 0); }
		if( Y14 < -0.1 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	}
	}
	if( Z6 >= 9.66 ) { 
		if( Y26 >= -0.13 ) { return new Prediction("Left", 81, 0); }
	if( Y26 < -0.13 ) { 
	if( Y32 < -0.12 ) { 
		if( X6 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y32 >= -0.12 ) { return new Prediction("Left", 7, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree59() {
	if( Z25 < 9.79 ) { 
	if( Z24 >= 9.78 ) { 
	if( Z4 < 9.61 ) { 
		if( X26 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X26 < 0.11 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z4 >= 9.61 ) { return new Prediction("Right", 31, 0); }
	}
	if( Z24 < 9.78 ) { 
	if( Z4 >= 9.92 ) { 
	if( Y24 < -0.11 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 7, 0); }
		if( X12 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y24 >= -0.11 ) { return new Prediction("Right", 22, 0); }
	}
	if( Z4 < 9.92 ) { 
	if( Y4 < -0.1 ) { 
	if( Y15 >= -0.1 ) { 
	if( Y18 >= -0.12 ) { 
	if( Z29 >= 9.69 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 20, 0); }
	if( X2 >= 0.09 ) { 
		if( Y8 >= -0.09 ) { return new Prediction("Right", 2, 0); }
	if( Y8 < -0.09 ) { 
	if( Z7 >= 9.56 ) { 
	if( X19 >= 0.12 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X7 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( X19 < 0.12 ) { return new Prediction("Left", 19, 0); }
	}
		if( Z7 < 9.56 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Z29 < 9.69 ) { 
		if( X28 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X28 >= 0.11 ) { return new Prediction("Right", 6, 0); }
	}
	}
	if( Y18 < -0.12 ) { 
		if( Z10 >= 9.8 ) { return new Prediction("Left", 4, 0); }
	if( Z10 < 9.8 ) { 
		if( X1 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	if( X1 < 0.12 ) { 
		if( Y23 >= -0.13 ) { return new Prediction("Right", 9, 0); }
		if( Y23 < -0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	if( Y15 < -0.1 ) { 
	if( Y1 >= -0.14 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Left", 61, 0); }
	if( X2 < 0.11 ) { 
	if( Y14 < -0.12 ) { 
		if( X21 < 0.1 ) { return new Prediction("Left", 10, 0); }
	if( X21 >= 0.1 ) { 
	if( Y29 >= -0.12 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Right", 6, 0); }
	if( X10 < 0.11 ) { 
		if( X32 < 0.1 ) { return new Prediction("Left", 4, 0); }
	if( X32 >= 0.1 ) { 
		if( X7 >= 0.11 ) { return new Prediction("Left", 3, 0); }
		if( X7 < 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( Y29 < -0.12 ) { 
		if( Y3 >= -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y3 < -0.11 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
	if( Y14 >= -0.12 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 52, 0); }
	if( X3 >= 0.1 ) { 
		if( X6 < 0.1 ) { return new Prediction("Right", 2, 0); }
	if( X6 >= 0.1 ) { 
		if( X26 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X26 < 0.12 ) { return new Prediction("Left", 15, 0); }
	}
	}
	}
	}
	}
		if( Y1 < -0.14 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Y4 >= -0.1 ) { 
	if( Z31 < 9.62 ) { 
		if( Z23 < 9.55 ) { return new Prediction("Right", 1, 0); }
		if( Z23 >= 9.55 ) { return new Prediction("Left", 22, 0); }
	}
	if( Z31 >= 9.62 ) { 
	if( Z1 >= 9.59 ) { 
		if( Z17 < 9.66 ) { return new Prediction("Right", 17, 0); }
	if( Z17 >= 9.66 ) { 
	if( Y17 < -0.12 ) { 
		if( X29 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X29 >= 0.08 ) { return new Prediction("Right", 13, 0); }
	}
	if( Y17 >= -0.12 ) { 
		if( X26 >= 0.1 ) { return new Prediction("Left", 11, 0); }
	if( X26 < 0.1 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 4, 0); }
	if( X3 >= 0.1 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 4, 0); }
		if( X4 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
		if( Z1 < 9.59 ) { return new Prediction("Left", 15, 0); }
	}
	}
	}
	}
	}
	if( Z25 >= 9.79 ) { 
	if( X6 >= 0.07 ) { 
		if( Z1 >= 9.71 ) { return new Prediction("Left", 5, 0); }
		if( Z1 < 9.71 ) { return new Prediction("Right", 105, 0); }
	}
	if( X6 < 0.07 ) { 
	if( Z17 >= 9.74 ) { 
		if( X5 < 0.04 ) { return new Prediction("Left", 1, 0); }
		if( X5 >= 0.04 ) { return new Prediction("Right", 9, 0); }
	}
		if( Z17 < 9.74 ) { return new Prediction("Left", 7, 0); }
	}
	}
return null;
}
private Prediction runTree60() {
	if( Z25 < 9.78 ) { 
	if( Z26 < 9.73 ) { 
	if( Z19 < 9.68 ) { 
	if( X29 < 0.12 ) { 
	if( Z27 >= 9.56 ) { 
	if( Z31 >= 9.8 ) { 
		if( X5 < 0.11 ) { return new Prediction("Right", 13, 0); }
	if( X5 >= 0.11 ) { 
		if( Y25 < -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y25 >= -0.1 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( Z31 < 9.8 ) { 
	if( Z17 < 9.72 ) { 
	if( Z29 < 9.74 ) { 
	if( X3 < 0.08 ) { 
		if( X22 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X22 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( X3 >= 0.08 ) { return new Prediction("Left", 46, 0); }
	}
		if( Z29 >= 9.74 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z17 >= 9.72 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 2, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
		if( Z27 < 9.56 ) { return new Prediction("Right", 18, 0); }
	}
		if( X29 >= 0.12 ) { return new Prediction("Right", 5, 0); }
	}
	if( Z19 >= 9.68 ) { 
		if( Z10 < 9.71 ) { return new Prediction("Right", 44, 0); }
	if( Z10 >= 9.71 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 3, 0); }
	if( Y5 < -0.1 ) { 
		if( X32 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X32 >= 0.09 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
	}
	if( Z26 >= 9.73 ) { 
		if( Z3 < 9.8 ) { return new Prediction("Left", 26, 0); }
	if( Z3 >= 9.8 ) { 
		if( Z20 >= 9.83 ) { return new Prediction("Left", 66, 0); }
	if( Z20 < 9.83 ) { 
		if( X1 < 0.08 ) { return new Prediction("Left", 22, 0); }
	if( X1 >= 0.08 ) { 
	if( Z5 < 9.72 ) { 
	if( Z20 >= 9.76 ) { 
		if( Y9 >= -0.09 ) { return new Prediction("Left", 3, 0); }
	if( Y9 < -0.09 ) { 
		if( Z31 < 9.62 ) { return new Prediction("Left", 4, 0); }
	if( Z31 >= 9.62 ) { 
		if( X31 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X31 >= 0.09 ) { return new Prediction("Right", 40, 0); }
	}
	}
	}
	if( Z20 < 9.76 ) { 
	if( Y13 >= -0.11 ) { 
		if( Z11 < 9.71 ) { return new Prediction("Left", 3, 0); }
	if( Z11 >= 9.71 ) { 
		if( X9 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X9 < 0.11 ) { return new Prediction("Right", 7, 0); }
	}
	}
		if( Y13 < -0.11 ) { return new Prediction("Left", 21, 0); }
	}
	}
		if( Z5 >= 9.72 ) { return new Prediction("Left", 25, 0); }
	}
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
	if( Z22 >= 9.72 ) { 
		if( Z15 < 9.74 ) { return new Prediction("Left", 1, 0); }
		if( Z15 >= 9.74 ) { return new Prediction("Right", 116, 0); }
	}
	if( Z22 < 9.72 ) { 
		if( X15 < 0.08 ) { return new Prediction("Left", 9, 0); }
	if( X15 >= 0.08 ) { 
		if( Z1 >= 9.71 ) { return new Prediction("Left", 7, 0); }
		if( Z1 < 9.71 ) { return new Prediction("Right", 16, 0); }
	}
	}
	}
return null;
}
private Prediction runTree61() {
	if( Z6 >= 9.85 ) { 
		if( Y8 < -0.15 ) { return new Prediction("Left", 3, 0); }
	if( Y8 >= -0.15 ) { 
		if( Z9 < 9.63 ) { return new Prediction("Right", 63, 0); }
	if( Z9 >= 9.63 ) { 
		if( X22 < 0.09 ) { return new Prediction("Right", 5, 0); }
		if( X22 >= 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z6 < 9.85 ) { 
	if( Z21 < 9.7 ) { 
		if( Z5 >= 9.76 ) { return new Prediction("Left", 57, 0); }
	if( Z5 < 9.76 ) { 
	if( X6 < 0.09 ) { 
	if( Y14 < -0.12 ) { 
		if( X20 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X20 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y14 >= -0.12 ) { return new Prediction("Left", 52, 0); }
	}
	if( X6 >= 0.09 ) { 
	if( Z3 < 9.85 ) { 
	if( Z26 >= 9.61 ) { 
	if( Z20 >= 9.75 ) { 
		if( Z31 >= 9.65 ) { return new Prediction("Right", 5, 0); }
	if( Z31 < 9.65 ) { 
	if( X28 < 0.09 ) { 
		if( Y10 >= -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y10 < -0.12 ) { return new Prediction("Left", 2, 0); }
	}
		if( X28 >= 0.09 ) { return new Prediction("Left", 27, 0); }
	}
	}
		if( Z20 < 9.75 ) { return new Prediction("Left", 29, 0); }
	}
		if( Z26 < 9.61 ) { return new Prediction("Right", 6, 0); }
	}
	if( Z3 >= 9.85 ) { 
	if( Z8 >= 9.53 ) { 
		if( Y21 >= -0.1 ) { return new Prediction("Right", 18, 0); }
	if( Y21 < -0.1 ) { 
		if( Z8 >= 9.57 ) { return new Prediction("Right", 6, 0); }
	if( Z8 < 9.57 ) { 
		if( Z5 >= 9.69 ) { return new Prediction("Left", 8, 0); }
		if( Z5 < 9.69 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
		if( Z8 < 9.53 ) { return new Prediction("Left", 11, 0); }
	}
	}
	}
	}
	if( Z21 >= 9.7 ) { 
	if( Z11 >= 9.45 ) { 
	if( X13 >= 0.13 ) { 
		if( Z19 >= 9.47 ) { return new Prediction("Left", 14, 0); }
		if( Z19 < 9.47 ) { return new Prediction("Right", 1, 0); }
	}
	if( X13 < 0.13 ) { 
	if( Z32 < 9.79 ) { 
	if( Z7 >= 9.57 ) { 
	if( Z23 >= 9.78 ) { 
		if( X2 < 0.08 ) { return new Prediction("Left", 2, 0); }
	if( X2 >= 0.08 ) { 
		if( Z4 >= 9.57 ) { return new Prediction("Right", 18, 0); }
		if( Z4 < 9.57 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z23 < 9.78 ) { 
	if( Z2 < 9.84 ) { 
	if( Z25 < 9.75 ) { 
		if( Z13 < 9.69 ) { return new Prediction("Left", 23, 0); }
	if( Z13 >= 9.69 ) { 
		if( Y14 < -0.11 ) { return new Prediction("Left", 9, 0); }
	if( Y14 >= -0.11 ) { 
		if( Y13 >= -0.11 ) { return new Prediction("Right", 5, 0); }
		if( Y13 < -0.11 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z25 >= 9.75 ) { 
	if( Z7 < 9.77 ) { 
		if( X1 >= 0.07 ) { return new Prediction("Left", 2, 0); }
		if( X1 < 0.07 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z7 >= 9.77 ) { return new Prediction("Right", 8, 0); }
	}
	}
	if( Z2 >= 9.84 ) { 
		if( X1 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.08 ) { return new Prediction("Right", 14, 0); }
	}
	}
	}
		if( Z7 < 9.57 ) { return new Prediction("Right", 14, 0); }
	}
		if( Z32 >= 9.79 ) { return new Prediction("Right", 97, 0); }
	}
	}
		if( Z11 < 9.45 ) { return new Prediction("Left", 8, 0); }
	}
	}
return null;
}
private Prediction runTree62() {
	if( Z32 < 9.78 ) { 
	if( Z22 < 9.7 ) { 
		if( Z19 >= 9.82 ) { return new Prediction("Left", 89, 0); }
	if( Z19 < 9.82 ) { 
	if( Z3 < 9.87 ) { 
	if( X19 >= 0.12 ) { 
	if( X3 >= 0.09 ) { 
		if( Y14 < -0.11 ) { return new Prediction("Right", 5, 0); }
		if( Y14 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X3 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	if( X19 < 0.12 ) { 
	if( Z20 >= 9.76 ) { 
	if( Z15 >= 9.57 ) { 
	if( X28 < 0.1 ) { 
	if( X10 < 0.1 ) { 
		if( X7 >= 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X7 < 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( X10 >= 0.1 ) { return new Prediction("Right", 8, 0); }
	}
	if( X28 >= 0.1 ) { 
		if( Z26 >= 9.76 ) { return new Prediction("Right", 3, 0); }
		if( Z26 < 9.76 ) { return new Prediction("Left", 16, 0); }
	}
	}
		if( Z15 < 9.57 ) { return new Prediction("Left", 25, 0); }
	}
		if( Z20 < 9.76 ) { return new Prediction("Left", 54, 0); }
	}
	}
		if( Z3 >= 9.87 ) { return new Prediction("Right", 10, 0); }
	}
	}
	if( Z22 >= 9.7 ) { 
	if( Y15 >= -0.1 ) { 
	if( X25 < 0.1 ) { 
		if( Z19 >= 9.67 ) { return new Prediction("Right", 12, 0); }
	if( Z19 < 9.67 ) { 
		if( Z17 < 9.57 ) { return new Prediction("Right", 1, 0); }
	if( Z17 >= 9.57 ) { 
		if( Z14 < 9.78 ) { return new Prediction("Left", 7, 0); }
	if( Z14 >= 9.78 ) { 
		if( X18 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X18 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	if( X25 >= 0.1 ) { 
		if( Z21 < 9.66 ) { return new Prediction("Left", 1, 0); }
		if( Z21 >= 9.66 ) { return new Prediction("Right", 42, 0); }
	}
	}
	if( Y15 < -0.1 ) { 
	if( X3 < 0.12 ) { 
	if( Z7 < 9.88 ) { 
	if( Y18 >= -0.13 ) { 
		if( Y1 < -0.13 ) { return new Prediction("Right", 6, 0); }
	if( Y1 >= -0.13 ) { 
		if( Z2 >= 9.8 ) { return new Prediction("Right", 5, 0); }
	if( Z2 < 9.8 ) { 
		if( Y16 >= -0.11 ) { return new Prediction("Left", 26, 0); }
	if( Y16 < -0.11 ) { 
	if( Y18 >= -0.12 ) { 
	if( X15 < 0.1 ) { 
		if( X9 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.08 ) { return new Prediction("Right", 6, 0); }
	}
	if( X15 >= 0.1 ) { 
		if( X32 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X32 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
		if( Y18 < -0.12 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
	}
		if( Y18 < -0.13 ) { return new Prediction("Right", 8, 0); }
	}
		if( Z7 >= 9.88 ) { return new Prediction("Right", 18, 0); }
	}
	if( X3 >= 0.12 ) { 
		if( X17 < 0.13 ) { return new Prediction("Left", 18, 0); }
		if( X17 >= 0.13 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z32 >= 9.78 ) { 
	if( X5 < 0.11 ) { 
		if( Y17 < -0.09 ) { return new Prediction("Right", 93, 0); }
	if( Y17 >= -0.09 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Right", 22, 0); }
		if( X24 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( X5 >= 0.11 ) { 
		if( Z23 < 9.76 ) { return new Prediction("Left", 4, 0); }
	if( Z23 >= 9.76 ) { 
		if( X11 >= 0.11 ) { return new Prediction("Right", 15, 0); }
		if( X11 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree63() {
	if( Z19 < 9.79 ) { 
	if( Z26 >= 9.58 ) { 
	if( Z31 >= 9.78 ) { 
	if( Y28 >= -0.1 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 2, 0); }
		if( Y4 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( Y28 < -0.1 ) { 
		if( X6 >= 0.07 ) { return new Prediction("Right", 41, 0); }
	if( X6 < 0.07 ) { 
		if( X5 < 0.06 ) { return new Prediction("Right", 1, 0); }
		if( X5 >= 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z31 < 9.78 ) { 
	if( Z13 >= 9.71 ) { 
	if( Y21 < -0.13 ) { 
		if( X23 < 0.11 ) { return new Prediction("Left", 7, 0); }
		if( X23 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( Y21 >= -0.13 ) { 
		if( Z3 < 9.8 ) { return new Prediction("Left", 8, 0); }
	if( Z3 >= 9.8 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 5, 0); }
	if( X10 >= 0.08 ) { 
	if( Z13 >= 9.79 ) { 
		if( Y19 < -0.12 ) { return new Prediction("Right", 8, 0); }
	if( Y19 >= -0.12 ) { 
		if( X7 < 0.14 ) { return new Prediction("Left", 3, 0); }
		if( X7 >= 0.14 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z13 < 9.79 ) { 
	if( X2 < 0.09 ) { 
		if( X30 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X30 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( X2 >= 0.09 ) { return new Prediction("Right", 42, 0); }
	}
	}
	}
	}
	}
	if( Z13 < 9.71 ) { 
	if( X10 < 0.08 ) { 
		if( Z5 < 9.79 ) { return new Prediction("Left", 35, 0); }
		if( Z5 >= 9.79 ) { return new Prediction("Right", 1, 0); }
	}
	if( X10 >= 0.08 ) { 
		if( Z4 >= 9.84 ) { return new Prediction("Right", 12, 0); }
	if( Z4 < 9.84 ) { 
	if( Z25 >= 9.77 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X27 >= 0.09 ) { return new Prediction("Right", 22, 0); }
	}
	if( Z25 < 9.77 ) { 
	if( Z24 >= 9.62 ) { 
	if( Z26 < 9.78 ) { 
		if( X29 < 0.08 ) { return new Prediction("Right", 2, 0); }
	if( X29 >= 0.08 ) { 
		if( Z23 >= 9.81 ) { return new Prediction("Right", 1, 0); }
		if( Z23 < 9.81 ) { return new Prediction("Left", 75, 0); }
	}
	}
	if( Z26 >= 9.78 ) { 
		if( Y1 < -0.13 ) { return new Prediction("Left", 2, 0); }
		if( Y1 >= -0.13 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z24 < 9.62 ) { 
	if( X11 >= 0.1 ) { 
		if( X6 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X6 >= 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( X11 < 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( Z26 < 9.58 ) { 
		if( Y29 >= -0.15 ) { return new Prediction("Right", 89, 0); }
	if( Y29 < -0.15 ) { 
		if( X12 >= 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X12 < 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z19 >= 9.79 ) { 
	if( Y26 >= -0.12 ) { 
		if( Y2 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	if( Y2 < -0.09 ) { 
		if( Y23 >= -0.13 ) { return new Prediction("Left", 77, 0); }
		if( Y23 < -0.13 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Y26 < -0.12 ) { 
		if( Y16 >= -0.09 ) { return new Prediction("Right", 5, 0); }
	if( Y16 < -0.09 ) { 
	if( Z10 < 9.79 ) { 
		if( Z21 < 9.67 ) { return new Prediction("Left", 6, 0); }
	if( Z21 >= 9.67 ) { 
		if( Y2 < -0.13 ) { return new Prediction("Left", 2, 0); }
		if( Y2 >= -0.13 ) { return new Prediction("Right", 6, 0); }
	}
	}
		if( Z10 >= 9.79 ) { return new Prediction("Left", 47, 0); }
	}
	}
	}
return null;
}
private Prediction runTree64() {
	if( Z2 < 9.7 ) { 
	if( Z26 >= 9.58 ) { 
	if( Z16 >= 9.68 ) { 
		if( Z22 < 9.69 ) { return new Prediction("Left", 9, 0); }
	if( Z22 >= 9.69 ) { 
	if( Z25 < 9.78 ) { 
	if( X5 >= 0.1 ) { 
	if( Z32 >= 9.72 ) { 
	if( Z30 < 9.76 ) { 
	if( Y23 >= -0.11 ) { 
		if( X20 < 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X20 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y23 < -0.11 ) { return new Prediction("Left", 21, 0); }
	}
	if( Z30 >= 9.76 ) { 
		if( Y23 >= -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y23 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Z32 < 9.72 ) { return new Prediction("Right", 6, 0); }
	}
	if( X5 < 0.1 ) { 
		if( Z24 >= 9.72 ) { return new Prediction("Right", 11, 0); }
		if( Z24 < 9.72 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Z25 >= 9.78 ) { 
		if( X15 < 0.07 ) { return new Prediction("Left", 3, 0); }
		if( X15 >= 0.07 ) { return new Prediction("Right", 67, 0); }
	}
	}
	}
		if( Z16 < 9.68 ) { return new Prediction("Left", 38, 0); }
	}
	if( Z26 < 9.58 ) { 
		if( X5 < 0.12 ) { return new Prediction("Right", 79, 0); }
	if( X5 >= 0.12 ) { 
		if( Z5 >= 9.77 ) { return new Prediction("Right", 14, 0); }
		if( Z5 < 9.77 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	if( Z2 >= 9.7 ) { 
	if( Z4 >= 9.96 ) { 
		if( Y8 >= -0.02 ) { return new Prediction("Left", 1, 0); }
		if( Y8 < -0.02 ) { return new Prediction("Right", 21, 0); }
	}
	if( Z4 < 9.96 ) { 
	if( Y5 < -0.09 ) { 
	if( Z26 < 9.71 ) { 
		if( X5 >= 0.08 ) { return new Prediction("Right", 16, 0); }
		if( X5 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z26 >= 9.71 ) { 
	if( Z16 < 9.73 ) { 
		if( Z7 < 9.53 ) { return new Prediction("Left", 47, 0); }
	if( Z7 >= 9.53 ) { 
	if( X26 < 0.09 ) { 
		if( X20 < 0.08 ) { return new Prediction("Right", 1, 0); }
	if( X20 >= 0.08 ) { 
		if( Z19 >= 9.77 ) { return new Prediction("Left", 51, 0); }
	if( Z19 < 9.77 ) { 
		if( X16 < 0.11 ) { return new Prediction("Left", 8, 0); }
		if( X16 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( X26 >= 0.09 ) { 
	if( X7 >= 0.09 ) { 
	if( X19 >= 0.09 ) { 
	if( Y13 >= -0.12 ) { 
		if( Y32 >= -0.1 ) { return new Prediction("Right", 1, 0); }
	if( Y32 < -0.1 ) { 
	if( X17 < 0.09 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X4 >= 0.12 ) { return new Prediction("Left", 2, 0); }
	}
		if( X17 >= 0.09 ) { return new Prediction("Left", 27, 0); }
	}
	}
	if( Y13 < -0.12 ) { 
		if( Z23 < 9.63 ) { return new Prediction("Left", 2, 0); }
		if( Z23 >= 9.63 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X19 < 0.09 ) { 
	if( Z16 < 9.66 ) { 
	if( Y7 < -0.12 ) { 
		if( X19 < 0.07 ) { return new Prediction("Right", 1, 0); }
		if( X19 >= 0.07 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y7 >= -0.12 ) { return new Prediction("Right", 4, 0); }
	}
		if( Z16 >= 9.66 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( X7 < 0.09 ) { 
		if( Y25 >= -0.13 ) { return new Prediction("Right", 6, 0); }
		if( Y25 < -0.13 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	if( Z16 >= 9.73 ) { 
		if( Z6 >= 9.65 ) { return new Prediction("Left", 9, 0); }
	if( Z6 < 9.65 ) { 
		if( Z13 >= 9.7 ) { return new Prediction("Right", 10, 0); }
	if( Z13 < 9.7 ) { 
	if( Z13 >= 9.59 ) { 
		if( Y26 < -0.1 ) { return new Prediction("Left", 11, 0); }
	if( Y26 >= -0.1 ) { 
		if( X16 >= 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X16 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z13 < 9.59 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	}
	if( Y5 >= -0.09 ) { 
	if( Z22 >= 9.64 ) { 
		if( Y7 < -0.09 ) { return new Prediction("Right", 23, 0); }
		if( Y7 >= -0.09 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z22 < 9.64 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X24 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree65() {
	if( Z26 < 9.73 ) { 
	if( Z31 >= 9.78 ) { 
	if( Z19 < 9.64 ) { 
		if( Z7 >= 9.9 ) { return new Prediction("Right", 69, 0); }
	if( Z7 < 9.9 ) { 
		if( Z31 >= 9.8 ) { return new Prediction("Right", 48, 0); }
	if( Z31 < 9.8 ) { 
		if( Z24 < 9.75 ) { return new Prediction("Left", 4, 0); }
	if( Z24 >= 9.75 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X10 >= 0.08 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	}
		if( Z19 >= 9.64 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z31 < 9.78 ) { 
	if( Z1 < 9.81 ) { 
	if( Z24 < 9.77 ) { 
	if( Y32 >= -0.1 ) { 
	if( Z6 >= 9.72 ) { 
		if( X5 < 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X5 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z6 < 9.72 ) { return new Prediction("Left", 6, 0); }
	}
		if( Y32 < -0.1 ) { return new Prediction("Left", 62, 0); }
	}
	if( Z24 >= 9.77 ) { 
	if( X5 >= 0.08 ) { 
	if( Z17 >= 9.68 ) { 
		if( X7 >= 0.08 ) { return new Prediction("Right", 36, 0); }
		if( X7 < 0.08 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z17 < 9.68 ) { return new Prediction("Left", 3, 0); }
	}
		if( X5 < 0.08 ) { return new Prediction("Left", 12, 0); }
	}
	}
	if( Z1 >= 9.81 ) { 
	if( Z10 < 9.74 ) { 
		if( X7 >= 0.05 ) { return new Prediction("Right", 35, 0); }
		if( X7 < 0.05 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z10 >= 9.74 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	if( Z26 >= 9.73 ) { 
		if( X30 >= 0.13 ) { return new Prediction("Right", 5, 0); }
	if( X30 < 0.13 ) { 
	if( Z31 >= 9.64 ) { 
	if( Z1 >= 9.82 ) { 
		if( Z12 >= 9.78 ) { return new Prediction("Left", 15, 0); }
	if( Z12 < 9.78 ) { 
		if( Z11 < 9.7 ) { return new Prediction("Left", 4, 0); }
	if( Z11 >= 9.7 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Right", 22, 0); }
	if( Y5 < -0.11 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X24 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z1 < 9.82 ) { 
	if( Y5 < -0.09 ) { 
	if( Z26 < 9.78 ) { 
		if( X28 < 0.11 ) { return new Prediction("Left", 38, 0); }
	if( X28 >= 0.11 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Left", 4, 0); }
		if( X19 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z26 >= 9.78 ) { 
		if( X30 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X30 >= 0.09 ) { return new Prediction("Right", 5, 0); }
	}
	}
	if( Y5 >= -0.09 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X23 < 0.1 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	if( Z31 < 9.64 ) { 
	if( X30 >= 0.11 ) { 
	if( Z20 < 9.79 ) { 
		if( X7 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X7 < 0.08 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z20 >= 9.79 ) { 
		if( Y10 < -0.15 ) { return new Prediction("Right", 1, 0); }
		if( Y10 >= -0.15 ) { return new Prediction("Left", 38, 0); }
	}
	}
		if( X30 < 0.11 ) { return new Prediction("Left", 74, 0); }
	}
	}
	}
return null;
}
private Prediction runTree66() {
	if( Z22 < 9.7 ) { 
	if( Z19 >= 9.8 ) { 
	if( X23 >= 0.09 ) { 
	if( X11 >= 0.12 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y6 < -0.1 ) { return new Prediction("Left", 8, 0); }
	}
		if( X11 < 0.12 ) { return new Prediction("Left", 95, 0); }
	}
	if( X23 < 0.09 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Right", 2, 0); }
		if( X19 < 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( Z19 < 9.8 ) { 
	if( X10 < 0.09 ) { 
		if( X31 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	if( X31 < 0.12 ) { 
		if( Z23 < 9.61 ) { return new Prediction("Right", 2, 0); }
		if( Z23 >= 9.61 ) { return new Prediction("Left", 32, 0); }
	}
	}
	if( X10 >= 0.09 ) { 
	if( X6 < 0.12 ) { 
	if( Y9 < -0.12 ) { 
		if( Z11 < 9.7 ) { return new Prediction("Left", 2, 0); }
		if( Z11 >= 9.7 ) { return new Prediction("Right", 17, 0); }
	}
	if( Y9 >= -0.12 ) { 
	if( X9 >= 0.11 ) { 
		if( Y16 >= -0.13 ) { return new Prediction("Right", 8, 0); }
		if( Y16 < -0.13 ) { return new Prediction("Left", 1, 0); }
	}
	if( X9 < 0.11 ) { 
	if( Z1 >= 9.82 ) { 
	if( Z14 < 9.62 ) { 
		if( X4 >= 0.09 ) { return new Prediction("Right", 7, 0); }
		if( X4 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z14 >= 9.62 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z1 < 9.82 ) { return new Prediction("Left", 15, 0); }
	}
	}
	}
		if( X6 >= 0.12 ) { return new Prediction("Left", 11, 0); }
	}
	}
	}
	if( Z22 >= 9.7 ) { 
	if( Z17 < 9.71 ) { 
	if( Z25 < 9.78 ) { 
	if( Z24 < 9.66 ) { 
	if( Y11 < -0.13 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
		if( Y11 >= -0.13 ) { return new Prediction("Right", 30, 0); }
	}
	if( Z24 >= 9.66 ) { 
		if( Z14 < 9.7 ) { return new Prediction("Right", 5, 0); }
	if( Z14 >= 9.7 ) { 
		if( X19 >= 0.12 ) { return new Prediction("Right", 5, 0); }
	if( X19 < 0.12 ) { 
	if( Z24 < 9.83 ) { 
		if( Z27 >= 9.7 ) { return new Prediction("Right", 1, 0); }
	if( Z27 < 9.7 ) { 
		if( Z7 >= 9.67 ) { return new Prediction("Left", 61, 0); }
		if( Z7 < 9.67 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z24 >= 9.83 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 22, 0); }
		if( X11 < 0.08 ) { return new Prediction("Left", 3, 0); }
	}
	}
	if( Z17 >= 9.71 ) { 
	if( Y4 < -0.14 ) { 
		if( X18 < 0.12 ) { return new Prediction("Left", 2, 0); }
		if( X18 >= 0.12 ) { return new Prediction("Right", 3, 0); }
	}
		if( Y4 >= -0.14 ) { return new Prediction("Right", 170, 0); }
	}
	}
return null;
}
private Prediction runTree67() {
	if( Z24 >= 9.78 ) { 
	if( X19 >= 0.1 ) { 
		if( Y18 < -0.1 ) { return new Prediction("Right", 97, 0); }
	if( Y18 >= -0.1 ) { 
	if( X10 < 0.16 ) { 
		if( Z13 < 9.48 ) { return new Prediction("Left", 2, 0); }
		if( Z13 >= 9.48 ) { return new Prediction("Right", 60, 0); }
	}
		if( X10 >= 0.16 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( X19 < 0.1 ) { 
	if( Z15 < 9.81 ) { 
		if( Y6 < -0.09 ) { return new Prediction("Left", 10, 0); }
		if( Y6 >= -0.09 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z15 >= 9.81 ) { return new Prediction("Right", 15, 0); }
	}
	}
	if( Z24 < 9.78 ) { 
	if( Z20 >= 9.82 ) { 
	if( X14 < 0.09 ) { 
		if( X11 >= 0.09 ) { return new Prediction("Right", 2, 0); }
		if( X11 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( X14 >= 0.09 ) { return new Prediction("Left", 88, 0); }
	}
	if( Z20 < 9.82 ) { 
	if( Z8 >= 9.66 ) { 
	if( Y14 < -0.13 ) { 
	if( Y7 >= -0.11 ) { 
		if( X14 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X14 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	if( Y7 < -0.11 ) { 
	if( Y32 < -0.12 ) { 
		if( X13 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X13 < 0.12 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y32 >= -0.12 ) { return new Prediction("Left", 12, 0); }
	}
	}
		if( Y14 >= -0.13 ) { return new Prediction("Left", 66, 0); }
	}
	if( Z8 < 9.66 ) { 
	if( X4 >= 0.09 ) { 
		if( Z4 >= 9.85 ) { return new Prediction("Right", 27, 0); }
	if( Z4 < 9.85 ) { 
	if( Y8 >= -0.11 ) { 
		if( Z25 < 9.63 ) { return new Prediction("Right", 20, 0); }
	if( Z25 >= 9.63 ) { 
	if( X5 >= 0.1 ) { 
		if( Z16 >= 9.68 ) { return new Prediction("Right", 12, 0); }
	if( Z16 < 9.68 ) { 
		if( X2 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X2 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	}
	if( X5 < 0.1 ) { 
		if( Y25 >= -0.11 ) { return new Prediction("Left", 9, 0); }
		if( Y25 < -0.11 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	if( Y8 < -0.11 ) { 
		if( Z22 >= 9.72 ) { return new Prediction("Right", 6, 0); }
	if( Z22 < 9.72 ) { 
		if( Z27 >= 9.77 ) { return new Prediction("Right", 7, 0); }
	if( Z27 < 9.77 ) { 
	if( X11 >= 0.09 ) { 
	if( X20 < 0.1 ) { 
	if( X18 < 0.1 ) { 
		if( Z32 >= 9.64 ) { return new Prediction("Right", 6, 0); }
	if( Z32 < 9.64 ) { 
		if( X18 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X18 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X18 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
		if( X20 >= 0.1 ) { return new Prediction("Left", 15, 0); }
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 19, 0); }
	}
	}
	}
	}
	}
	if( X4 < 0.09 ) { 
		if( Y19 >= -0.14 ) { return new Prediction("Left", 19, 0); }
		if( Y19 < -0.14 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree68() {
	if( Z10 < 9.74 ) { 
	if( Z25 < 9.78 ) { 
	if( Z2 >= 9.81 ) { 
		if( X4 < 0.06 ) { return new Prediction("Left", 1, 0); }
	if( X4 >= 0.06 ) { 
		if( X8 >= 0.04 ) { return new Prediction("Right", 55, 0); }
		if( X8 < 0.04 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z2 < 9.81 ) { 
	if( X26 >= 0.11 ) { 
	if( Z9 < 9.74 ) { 
	if( Z17 < 9.71 ) { 
		if( Y1 < -0.13 ) { return new Prediction("Right", 2, 0); }
	if( Y1 >= -0.13 ) { 
		if( Z7 < 9.95 ) { return new Prediction("Left", 15, 0); }
		if( Z7 >= 9.95 ) { return new Prediction("Right", 4, 0); }
	}
	}
	if( Z17 >= 9.71 ) { 
		if( X5 < 0.06 ) { return new Prediction("Left", 1, 0); }
		if( X5 >= 0.06 ) { return new Prediction("Right", 26, 0); }
	}
	}
		if( Z9 >= 9.74 ) { return new Prediction("Left", 7, 0); }
	}
	if( X26 < 0.11 ) { 
	if( Z17 < 9.73 ) { 
		if( X23 < 0.11 ) { return new Prediction("Left", 46, 0); }
		if( X23 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z17 >= 9.73 ) { 
		if( X4 >= 0.08 ) { return new Prediction("Right", 12, 0); }
		if( X4 < 0.08 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z25 >= 9.78 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 115, 0); }
	if( X11 < 0.08 ) { 
	if( Z7 < 9.81 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Right", 9, 0); }
		if( X24 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z7 >= 9.81 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
	if( Z10 >= 9.74 ) { 
	if( Z4 < 9.65 ) { 
	if( Y5 >= -0.1 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 5, 0); }
	if( X1 >= 0.09 ) { 
		if( Y16 >= -0.12 ) { return new Prediction("Left", 1, 0); }
		if( Y16 < -0.12 ) { return new Prediction("Right", 12, 0); }
	}
	}
	if( Y5 < -0.1 ) { 
		if( Z11 < 9.72 ) { return new Prediction("Left", 21, 0); }
	if( Z11 >= 9.72 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 11, 0); }
	if( X10 >= 0.09 ) { 
	if( Y22 < -0.1 ) { 
		if( Y7 < -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y7 >= -0.12 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y22 >= -0.1 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	}
	if( Z4 >= 9.65 ) { 
	if( Z9 < 9.76 ) { 
	if( Y12 < -0.09 ) { 
	if( Z25 >= 9.69 ) { 
		if( X30 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X30 >= 0.09 ) { return new Prediction("Right", 4, 0); }
	}
	if( Z25 < 9.69 ) { 
	if( Y32 < -0.12 ) { 
		if( X4 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X4 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	}
		if( Y32 >= -0.12 ) { return new Prediction("Left", 32, 0); }
	}
	}
		if( Y12 >= -0.09 ) { return new Prediction("Right", 4, 0); }
	}
	if( Z9 >= 9.76 ) { 
	if( Y4 < -0.13 ) { 
		if( Y4 < -0.13 ) { return new Prediction("Left", 15, 0); }
	if( Y4 >= -0.13 ) { 
		if( Y6 < -0.12 ) { return new Prediction("Left", 3, 0); }
		if( Y6 >= -0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y4 >= -0.13 ) { return new Prediction("Left", 87, 0); }
	}
	}
	}
return null;
}
private Prediction runTree69() {
	if( Z11 >= 9.76 ) { 
	if( Z32 < 9.63 ) { 
	if( Y10 < -0.15 ) { 
		if( X1 < 0.14 ) { return new Prediction("Right", 1, 0); }
		if( X1 >= 0.14 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y10 >= -0.15 ) { return new Prediction("Left", 65, 0); }
	}
	if( Z32 >= 9.63 ) { 
		if( Z1 < 9.8 ) { return new Prediction("Left", 12, 0); }
	if( Z1 >= 9.8 ) { 
	if( Z17 >= 9.63 ) { 
		if( Z13 >= 9.79 ) { return new Prediction("Left", 26, 0); }
	if( Z13 < 9.79 ) { 
		if( X1 < 0.1 ) { return new Prediction("Left", 8, 0); }
	if( X1 >= 0.1 ) { 
	if( X7 >= 0.11 ) { 
		if( X5 < 0.12 ) { return new Prediction("Left", 3, 0); }
		if( X5 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	}
		if( X7 < 0.11 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	if( Z17 < 9.63 ) { 
		if( X19 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X19 < 0.11 ) { return new Prediction("Right", 10, 0); }
	}
	}
	}
	}
	if( Z11 < 9.76 ) { 
	if( X26 >= 0.1 ) { 
	if( Z6 < 9.8 ) { 
	if( Z8 >= 9.83 ) { 
	if( X12 >= 0.07 ) { 
	if( X11 >= 0.12 ) { 
		if( Z17 < 9.71 ) { return new Prediction("Left", 3, 0); }
		if( Z17 >= 9.71 ) { return new Prediction("Right", 8, 0); }
	}
		if( X11 < 0.12 ) { return new Prediction("Right", 72, 0); }
	}
		if( X12 < 0.07 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z8 < 9.83 ) { 
	if( Y23 >= -0.13 ) { 
	if( Z13 >= 9.56 ) { 
	if( Z14 >= 9.57 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Left", 4, 0); }
	if( X11 < 0.12 ) { 
	if( Z10 < 9.75 ) { 
	if( X8 >= 0.12 ) { 
		if( X4 < 0.13 ) { return new Prediction("Right", 1, 0); }
		if( X4 >= 0.13 ) { return new Prediction("Left", 2, 0); }
	}
	if( X8 < 0.12 ) { 
		if( Z4 >= 9.6 ) { return new Prediction("Right", 35, 0); }
	if( Z4 < 9.6 ) { 
		if( Z24 < 9.76 ) { return new Prediction("Left", 2, 0); }
		if( Z24 >= 9.76 ) { return new Prediction("Right", 15, 0); }
	}
	}
	}
		if( Z10 >= 9.75 ) { return new Prediction("Left", 3, 0); }
	}
	}
		if( Z14 < 9.57 ) { return new Prediction("Left", 12, 0); }
	}
		if( Z13 < 9.56 ) { return new Prediction("Left", 12, 0); }
	}
		if( Y23 < -0.13 ) { return new Prediction("Left", 25, 0); }
	}
	}
		if( Z6 >= 9.8 ) { return new Prediction("Right", 83, 0); }
	}
	if( X26 < 0.1 ) { 
	if( Z5 < 9.86 ) { 
	if( Z24 >= 9.78 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Right", 14, 0); }
		if( X17 < 0.08 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z24 < 9.78 ) { 
		if( Y21 >= -0.09 ) { return new Prediction("Right", 7, 0); }
	if( Y21 < -0.09 ) { 
	if( X14 >= 0.11 ) { 
		if( X12 >= 0.12 ) { return new Prediction("Left", 5, 0); }
		if( X12 < 0.12 ) { return new Prediction("Right", 7, 0); }
	}
	if( X14 < 0.11 ) { 
	if( Y4 < -0.1 ) { 
		if( Z25 >= 9.69 ) { return new Prediction("Left", 32, 0); }
	if( Z25 < 9.69 ) { 
		if( Z1 >= 9.85 ) { return new Prediction("Right", 2, 0); }
		if( Z1 < 9.85 ) { return new Prediction("Left", 21, 0); }
	}
	}
	if( Y4 >= -0.1 ) { 
		if( Y10 >= -0.11 ) { return new Prediction("Left", 8, 0); }
		if( Y10 < -0.11 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
	}
	}
		if( Z5 >= 9.86 ) { return new Prediction("Right", 5, 0); }
	}
	}
return null;
}
private Prediction runTree70() {
	if( Z23 < 9.76 ) { 
	if( X27 < 0.09 ) { 
	if( Y6 < -0.09 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 49, 0); }
	if( X3 >= 0.1 ) { 
		if( Z16 < 9.59 ) { return new Prediction("Right", 5, 0); }
	if( Z16 >= 9.59 ) { 
	if( X32 >= 0.11 ) { 
		if( X26 < 0.09 ) { return new Prediction("Right", 5, 0); }
		if( X26 >= 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	if( X32 < 0.11 ) { 
	if( Y13 >= -0.11 ) { 
		if( Z17 < 9.67 ) { return new Prediction("Right", 1, 0); }
	if( Z17 >= 9.67 ) { 
		if( Z22 < 9.59 ) { return new Prediction("Right", 1, 0); }
	if( Z22 >= 9.59 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 16, 0); }
		if( Y4 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( Y13 < -0.11 ) { return new Prediction("Left", 38, 0); }
	}
	}
	}
	}
	if( Y6 >= -0.09 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 8, 0); }
		if( X11 < 0.08 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( X27 >= 0.09 ) { 
	if( Z7 < 9.83 ) { 
	if( Y12 < -0.11 ) { 
		if( Z13 >= 9.83 ) { return new Prediction("Left", 10, 0); }
	if( Z13 < 9.83 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Right", 16, 0); }
	if( X10 < 0.11 ) { 
		if( Y13 >= -0.12 ) { return new Prediction("Right", 12, 0); }
	if( Y13 < -0.12 ) { 
		if( Y8 >= -0.1 ) { return new Prediction("Right", 6, 0); }
	if( Y8 < -0.1 ) { 
		if( Y16 >= -0.13 ) { return new Prediction("Left", 12, 0); }
	if( Y16 < -0.13 ) { 
	if( X32 < 0.1 ) { 
		if( Y13 >= -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y13 < -0.12 ) { return new Prediction("Left", 2, 0); }
	}
		if( X32 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( Y12 >= -0.11 ) { 
		if( Z5 < 9.64 ) { return new Prediction("Left", 36, 0); }
	if( Z5 >= 9.64 ) { 
	if( Z6 >= 9.54 ) { 
		if( Z12 >= 9.78 ) { return new Prediction("Left", 32, 0); }
	if( Z12 < 9.78 ) { 
		if( Z1 >= 9.86 ) { return new Prediction("Right", 11, 0); }
	if( Z1 < 9.86 ) { 
	if( Z1 >= 9.82 ) { 
	if( Z5 < 9.71 ) { 
	if( X19 >= 0.09 ) { 
		if( Z9 >= 9.59 ) { return new Prediction("Left", 13, 0); }
		if( Z9 < 9.59 ) { return new Prediction("Right", 1, 0); }
	}
		if( X19 < 0.09 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z5 >= 9.71 ) { return new Prediction("Right", 4, 0); }
	}
		if( Z1 < 9.82 ) { return new Prediction("Left", 13, 0); }
	}
	}
	}
		if( Z6 < 9.54 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	if( Z7 >= 9.83 ) { 
		if( Z21 >= 9.77 ) { return new Prediction("Left", 1, 0); }
		if( Z21 < 9.77 ) { return new Prediction("Right", 23, 0); }
	}
	}
	}
	if( Z23 >= 9.76 ) { 
	if( Z4 < 9.68 ) { 
	if( X1 >= 0.11 ) { 
	if( Y12 >= -0.14 ) { 
		if( X23 >= 0.09 ) { return new Prediction("Left", 13, 0); }
	if( X23 < 0.09 ) { 
		if( X2 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X2 < 0.12 ) { return new Prediction("Left", 3, 0); }
	}
	}
		if( Y12 < -0.14 ) { return new Prediction("Right", 4, 0); }
	}
	if( X1 < 0.11 ) { 
	if( X9 < 0.08 ) { 
	if( Z15 < 9.83 ) { 
		if( Z11 < 9.56 ) { return new Prediction("Left", 13, 0); }
		if( Z11 >= 9.56 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z15 >= 9.83 ) { return new Prediction("Right", 5, 0); }
	}
	if( X9 >= 0.08 ) { 
		if( Z7 >= 9.86 ) { return new Prediction("Right", 49, 0); }
	if( Z7 < 9.86 ) { 
	if( Y18 >= -0.11 ) { 
	if( X4 >= 0.09 ) { 
	if( Y17 < -0.09 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X23 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y17 >= -0.09 ) { return new Prediction("Left", 4, 0); }
	}
		if( X4 < 0.09 ) { return new Prediction("Right", 4, 0); }
	}
		if( Y18 < -0.11 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
	}
		if( Z4 >= 9.68 ) { return new Prediction("Right", 69, 0); }
	}
return null;
}
private Prediction runTree71() {
	if( Z14 < 9.83 ) { 
	if( Z23 < 9.76 ) { 
		if( Z20 >= 9.83 ) { return new Prediction("Left", 62, 0); }
	if( Z20 < 9.83 ) { 
	if( Z4 < 9.88 ) { 
	if( Z32 < 9.67 ) { 
	if( Z21 < 9.7 ) { 
	if( Z7 >= 9.54 ) { 
	if( Z30 < 9.74 ) { 
	if( Z14 < 9.58 ) { 
	if( X26 < 0.09 ) { 
		if( Y26 < -0.1 ) { return new Prediction("Right", 12, 0); }
		if( Y26 >= -0.1 ) { return new Prediction("Left", 1, 0); }
	}
	if( X26 >= 0.09 ) { 
		if( Y16 >= -0.11 ) { return new Prediction("Right", 2, 0); }
		if( Y16 < -0.11 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( Z14 >= 9.58 ) { 
	if( Y27 < -0.12 ) { 
		if( Z27 < 9.73 ) { return new Prediction("Left", 5, 0); }
	if( Z27 >= 9.73 ) { 
		if( Z11 >= 9.81 ) { return new Prediction("Left", 4, 0); }
	if( Z11 < 9.81 ) { 
		if( X6 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	if( Y27 >= -0.12 ) { 
	if( Z25 < 9.67 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y5 < -0.1 ) { return new Prediction("Left", 11, 0); }
	}
		if( Z25 >= 9.67 ) { return new Prediction("Left", 15, 0); }
	}
	}
	}
		if( Z30 >= 9.74 ) { return new Prediction("Left", 14, 0); }
	}
		if( Z7 < 9.54 ) { return new Prediction("Left", 29, 0); }
	}
	if( Z21 >= 9.7 ) { 
	if( Z12 < 9.83 ) { 
		if( Z22 >= 9.65 ) { return new Prediction("Right", 32, 0); }
	if( Z22 < 9.65 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z12 >= 9.83 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( Z32 >= 9.67 ) { 
	if( X2 < 0.09 ) { 
		if( X17 < 0.1 ) { return new Prediction("Left", 11, 0); }
	if( X17 >= 0.1 ) { 
	if( X15 < 0.1 ) { 
	if( Y8 >= -0.11 ) { 
		if( Y18 >= -0.12 ) { return new Prediction("Right", 11, 0); }
		if( Y18 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y8 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X15 >= 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( X2 >= 0.09 ) { 
	if( Z7 >= 9.84 ) { 
	if( Y15 >= -0.12 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Left", 2, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y15 < -0.12 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z7 < 9.84 ) { return new Prediction("Left", 69, 0); }
	}
	}
	}
	if( Z4 >= 9.88 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X10 >= 0.09 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
	if( Z23 >= 9.76 ) { 
	if( Z12 >= 9.53 ) { 
	if( Y23 >= -0.12 ) { 
		if( X1 >= 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X1 < 0.12 ) { return new Prediction("Right", 25, 0); }
	}
	if( Y23 < -0.12 ) { 
		if( X10 < 0.1 ) { return new Prediction("Right", 3, 0); }
	if( X10 >= 0.1 ) { 
		if( X4 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X4 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
		if( Z12 < 9.53 ) { return new Prediction("Left", 7, 0); }
	}
	}
	if( Z14 >= 9.83 ) { 
		if( Y23 < -0.15 ) { return new Prediction("Left", 5, 0); }
	if( Y23 >= -0.15 ) { 
	if( X12 >= 0.13 ) { 
	if( Z20 >= 9.52 ) { 
		if( X22 < 0.11 ) { return new Prediction("Left", 9, 0); }
		if( X22 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z20 < 9.52 ) { return new Prediction("Right", 9, 0); }
	}
	if( X12 < 0.13 ) { 
	if( X13 >= 0.06 ) { 
		if( X20 >= 0.09 ) { return new Prediction("Right", 111, 0); }
	if( X20 < 0.09 ) { 
		if( Z15 >= 9.85 ) { return new Prediction("Right", 6, 0); }
		if( Z15 < 9.85 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( X13 < 0.06 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree72() {
	if( Z15 >= 9.85 ) { 
	if( Z23 >= 9.73 ) { 
		if( Z7 >= 9.86 ) { return new Prediction("Right", 110, 0); }
	if( Z7 < 9.86 ) { 
		if( X9 >= 0.12 ) { return new Prediction("Left", 6, 0); }
		if( X9 < 0.12 ) { return new Prediction("Right", 31, 0); }
	}
	}
		if( Z23 < 9.73 ) { return new Prediction("Left", 7, 0); }
	}
	if( Z15 < 9.85 ) { 
	if( Z27 < 9.73 ) { 
	if( Z5 >= 9.77 ) { 
		if( Z13 < 9.84 ) { return new Prediction("Right", 33, 0); }
	if( Z13 >= 9.84 ) { 
		if( X4 < 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X4 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z5 < 9.77 ) { 
	if( Z19 >= 9.77 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X10 >= 0.08 ) { return new Prediction("Right", 16, 0); }
	}
	if( Z19 < 9.77 ) { 
	if( Z17 < 9.73 ) { 
	if( X31 >= 0.07 ) { 
		if( X4 >= 0.08 ) { return new Prediction("Left", 60, 0); }
	if( X4 < 0.08 ) { 
		if( X17 < 0.11 ) { return new Prediction("Left", 6, 0); }
		if( X17 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X31 < 0.07 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z17 >= 9.73 ) { 
		if( X11 >= 0.09 ) { return new Prediction("Right", 28, 0); }
	if( X11 < 0.09 ) { 
		if( X19 >= 0.11 ) { return new Prediction("Right", 3, 0); }
		if( X19 < 0.11 ) { return new Prediction("Left", 17, 0); }
	}
	}
	}
	}
	}
	if( Z27 >= 9.73 ) { 
	if( X11 >= 0.09 ) { 
	if( Z5 < 9.73 ) { 
	if( Y32 < -0.11 ) { 
		if( Z22 >= 9.68 ) { return new Prediction("Right", 7, 0); }
	if( Z22 < 9.68 ) { 
	if( Z20 >= 9.75 ) { 
		if( Z21 < 9.62 ) { return new Prediction("Right", 10, 0); }
	if( Z21 >= 9.62 ) { 
	if( X20 < 0.1 ) { 
		if( Z14 >= 9.57 ) { return new Prediction("Right", 9, 0); }
		if( Z14 < 9.57 ) { return new Prediction("Left", 5, 0); }
	}
		if( X20 >= 0.1 ) { return new Prediction("Left", 16, 0); }
	}
	}
		if( Z20 < 9.75 ) { return new Prediction("Left", 26, 0); }
	}
	}
	if( Y32 >= -0.11 ) { 
	if( Z28 < 9.72 ) { 
	if( Z18 < 9.74 ) { 
		if( X6 < 0.1 ) { return new Prediction("Left", 4, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z18 >= 9.74 ) { return new Prediction("Right", 5, 0); }
	}
		if( Z28 >= 9.72 ) { return new Prediction("Right", 10, 0); }
	}
	}
		if( Z5 >= 9.73 ) { return new Prediction("Left", 54, 0); }
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 53, 0); }
	}
	}
return null;
}
private Prediction runTree73() {
	if( Z22 < 9.7 ) { 
		if( Z19 >= 9.83 ) { return new Prediction("Left", 71, 0); }
	if( Z19 < 9.83 ) { 
	if( X3 < 0.1 ) { 
		if( Z3 >= 9.89 ) { return new Prediction("Right", 3, 0); }
	if( Z3 < 9.89 ) { 
		if( Z31 >= 9.79 ) { return new Prediction("Right", 4, 0); }
	if( Z31 < 9.79 ) { 
	if( Z17 >= 9.76 ) { 
		if( X29 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X29 >= 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z17 < 9.76 ) { 
	if( X29 < 0.08 ) { 
		if( X20 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X20 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	if( X29 >= 0.08 ) { 
		if( X20 >= 0.09 ) { return new Prediction("Left", 57, 0); }
	if( X20 < 0.09 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X5 < 0.1 ) { return new Prediction("Left", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( X3 >= 0.1 ) { 
	if( Z8 >= 9.56 ) { 
	if( Z29 < 9.74 ) { 
	if( Z2 < 9.85 ) { 
		if( Z7 >= 9.86 ) { return new Prediction("Right", 3, 0); }
	if( Z7 < 9.86 ) { 
		if( Z24 >= 9.71 ) { return new Prediction("Left", 20, 0); }
	if( Z24 < 9.71 ) { 
	if( X5 >= 0.1 ) { 
		if( X29 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X29 >= 0.09 ) { return new Prediction("Left", 12, 0); }
	}
		if( X5 < 0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( Z2 >= 9.85 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 14, 0); }
	if( X4 >= 0.12 ) { 
		if( X2 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X2 < 0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
		if( Z29 >= 9.74 ) { return new Prediction("Left", 13, 0); }
	}
		if( Z8 < 9.56 ) { return new Prediction("Right", 11, 0); }
	}
	}
	}
	if( Z22 >= 9.7 ) { 
	if( Z27 >= 9.56 ) { 
	if( Y4 < -0.08 ) { 
	if( X3 < 0.1 ) { 
		if( Y15 >= -0.1 ) { return new Prediction("Right", 29, 0); }
	if( Y15 < -0.1 ) { 
	if( X26 >= 0.11 ) { 
	if( X5 < 0.07 ) { 
		if( X2 < 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Left", 1, 0); }
	}
		if( X5 >= 0.07 ) { return new Prediction("Right", 41, 0); }
	}
	if( X26 < 0.11 ) { 
		if( Z25 >= 9.77 ) { return new Prediction("Right", 25, 0); }
	if( Z25 < 9.77 ) { 
		if( Z19 >= 9.74 ) { return new Prediction("Right", 2, 0); }
	if( Z19 < 9.74 ) { 
		if( Z1 >= 9.55 ) { return new Prediction("Left", 9, 0); }
	if( Z1 < 9.55 ) { 
		if( X4 >= 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X4 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( X3 >= 0.1 ) { 
		if( Z7 >= 9.86 ) { return new Prediction("Right", 36, 0); }
	if( Z7 < 9.86 ) { 
	if( X25 < 0.1 ) { 
		if( X31 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	if( X31 < 0.11 ) { 
		if( Z18 >= 9.72 ) { return new Prediction("Right", 3, 0); }
		if( Z18 < 9.72 ) { return new Prediction("Left", 28, 0); }
	}
	}
	if( X25 >= 0.1 ) { 
	if( Z3 < 9.8 ) { 
		if( Z17 >= 9.68 ) { return new Prediction("Right", 5, 0); }
		if( Z17 < 9.68 ) { return new Prediction("Left", 16, 0); }
	}
		if( Z3 >= 9.8 ) { return new Prediction("Right", 29, 0); }
	}
	}
	}
	}
		if( Y4 >= -0.08 ) { return new Prediction("Left", 9, 0); }
	}
		if( Z27 < 9.56 ) { return new Prediction("Right", 54, 0); }
	}
return null;
}
private Prediction runTree74() {
	if( Z14 >= 9.85 ) { 
	if( X14 >= 0.11 ) { 
	if( Y20 >= -0.12 ) { 
	if( Z1 >= 9.59 ) { 
		if( X8 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X8 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z1 < 9.59 ) { return new Prediction("Right", 26, 0); }
	}
		if( Y20 < -0.12 ) { return new Prediction("Left", 12, 0); }
	}
	if( X14 < 0.11 ) { 
	if( Z26 >= 9.6 ) { 
	if( X16 >= 0.09 ) { 
		if( X19 >= 0.13 ) { return new Prediction("Left", 1, 0); }
		if( X19 < 0.13 ) { return new Prediction("Right", 25, 0); }
	}
		if( X16 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z26 < 9.6 ) { return new Prediction("Right", 84, 0); }
	}
	}
	if( Z14 < 9.85 ) { 
	if( Z20 >= 9.82 ) { 
		if( Z22 < 9.61 ) { return new Prediction("Right", 3, 0); }
		if( Z22 >= 9.61 ) { return new Prediction("Left", 83, 0); }
	}
	if( Z20 < 9.82 ) { 
	if( Z8 >= 9.66 ) { 
		if( X18 < 0.09 ) { return new Prediction("Left", 44, 0); }
	if( X18 >= 0.09 ) { 
	if( Z17 >= 9.69 ) { 
	if( X18 >= 0.11 ) { 
	if( Y29 < -0.13 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X12 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y29 >= -0.13 ) { return new Prediction("Right", 14, 0); }
	}
	if( X18 < 0.11 ) { 
	if( Z32 >= 9.77 ) { 
		if( X15 < 0.07 ) { return new Prediction("Left", 2, 0); }
		if( X15 >= 0.07 ) { return new Prediction("Right", 12, 0); }
	}
	if( Z32 < 9.77 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 17, 0); }
	if( X12 < 0.1 ) { 
		if( Z2 >= 9.58 ) { return new Prediction("Right", 2, 0); }
		if( Z2 < 9.58 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z17 < 9.69 ) { 
		if( Y15 < -0.14 ) { return new Prediction("Right", 1, 0); }
		if( Y15 >= -0.14 ) { return new Prediction("Left", 34, 0); }
	}
	}
	}
	if( Z8 < 9.66 ) { 
	if( Z5 < 9.85 ) { 
		if( Z7 < 9.52 ) { return new Prediction("Left", 25, 0); }
	if( Z7 >= 9.52 ) { 
	if( Z1 < 9.8 ) { 
		if( X27 >= 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X27 < 0.12 ) { return new Prediction("Left", 17, 0); }
	}
	if( Z1 >= 9.8 ) { 
		if( Z1 >= 9.86 ) { return new Prediction("Right", 15, 0); }
	if( Z1 < 9.86 ) { 
	if( X1 < 0.1 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Right", 3, 0); }
	if( Y8 < -0.11 ) { 
		if( Y25 >= -0.12 ) { return new Prediction("Left", 11, 0); }
	if( Y25 < -0.12 ) { 
		if( Y1 >= -0.1 ) { return new Prediction("Left", 1, 0); }
		if( Y1 < -0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( X1 >= 0.1 ) { 
	if( Z12 < 9.77 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Right", 27, 0); }
	if( X23 < 0.1 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	if( X24 < 0.1 ) { 
		if( Z11 >= 9.77 ) { return new Prediction("Right", 4, 0); }
	if( Z11 < 9.77 ) { 
		if( X9 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X9 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z12 >= 9.77 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Left", 9, 0); }
		if( X19 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
	}
		if( Z5 >= 9.85 ) { return new Prediction("Right", 29, 0); }
	}
	}
	}
return null;
}
private Prediction runTree75() {
	if( Z24 >= 9.78 ) { 
	if( X12 < 0.08 ) { 
		if( Z20 >= 9.52 ) { return new Prediction("Right", 9, 0); }
	if( Z20 < 9.52 ) { 
		if( Z15 < 9.9 ) { return new Prediction("Left", 19, 0); }
		if( Z15 >= 9.9 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X12 >= 0.08 ) { 
		if( Z14 >= 9.8 ) { return new Prediction("Right", 153, 0); }
	if( Z14 < 9.8 ) { 
		if( Z13 >= 9.64 ) { return new Prediction("Left", 4, 0); }
	if( Z13 < 9.64 ) { 
		if( X4 < 0.12 ) { return new Prediction("Right", 7, 0); }
		if( X4 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	if( Z24 < 9.78 ) { 
	if( Z31 < 9.62 ) { 
		if( Z29 < 9.79 ) { return new Prediction("Left", 74, 0); }
		if( Z29 >= 9.79 ) { return new Prediction("Right", 1, 0); }
	}
	if( Z31 >= 9.62 ) { 
	if( Z28 >= 9.74 ) { 
	if( Z6 >= 9.72 ) { 
	if( Z27 < 9.67 ) { 
		if( Z8 < 9.68 ) { return new Prediction("Right", 9, 0); }
		if( Z8 >= 9.68 ) { return new Prediction("Left", 6, 0); }
	}
		if( Z27 >= 9.67 ) { return new Prediction("Left", 23, 0); }
	}
	if( Z6 < 9.72 ) { 
	if( Z9 < 9.76 ) { 
	if( Y32 < -0.13 ) { 
		if( X8 >= 0.09 ) { return new Prediction("Left", 4, 0); }
		if( X8 < 0.09 ) { return new Prediction("Right", 6, 0); }
	}
		if( Y32 >= -0.13 ) { return new Prediction("Right", 31, 0); }
	}
	if( Z9 >= 9.76 ) { 
		if( Z11 >= 9.81 ) { return new Prediction("Left", 4, 0); }
		if( Z11 < 9.81 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Z28 < 9.74 ) { 
		if( Z2 >= 9.91 ) { return new Prediction("Right", 8, 0); }
	if( Z2 < 9.91 ) { 
	if( Z23 < 9.59 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X2 < 0.11 ) { return new Prediction("Right", 5, 0); }
	}
	if( Z23 >= 9.59 ) { 
	if( Y27 < -0.11 ) { 
	if( Z4 >= 9.85 ) { 
		if( X10 >= 0.06 ) { return new Prediction("Right", 6, 0); }
		if( X10 < 0.06 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z4 < 9.85 ) { 
	if( Y29 < -0.11 ) { 
	if( Z14 >= 9.77 ) { 
	if( Z26 >= 9.63 ) { 
		if( X4 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X4 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z26 < 9.63 ) { return new Prediction("Left", 24, 0); }
	}
		if( Z14 < 9.77 ) { return new Prediction("Left", 43, 0); }
	}
	if( Y29 >= -0.11 ) { 
	if( Y6 < -0.09 ) { 
		if( Y16 >= -0.11 ) { return new Prediction("Right", 3, 0); }
	if( Y16 < -0.11 ) { 
	if( X16 < 0.11 ) { 
		if( Y25 < -0.14 ) { return new Prediction("Right", 1, 0); }
		if( Y25 >= -0.14 ) { return new Prediction("Left", 23, 0); }
	}
		if( X16 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( Y6 >= -0.09 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
		if( Y27 >= -0.11 ) { return new Prediction("Left", 43, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree76() {
	if( Z15 < 9.82 ) { 
	if( Z11 < 9.78 ) { 
	if( Z3 < 9.87 ) { 
	if( Z27 >= 9.75 ) { 
	if( Z32 >= 9.64 ) { 
		if( Z21 < 9.6 ) { return new Prediction("Right", 3, 0); }
	if( Z21 >= 9.6 ) { 
	if( Z18 < 9.79 ) { 
		if( Z29 < 9.7 ) { return new Prediction("Left", 18, 0); }
	if( Z29 >= 9.7 ) { 
		if( Z20 < 9.79 ) { return new Prediction("Right", 3, 0); }
		if( Z20 >= 9.79 ) { return new Prediction("Left", 8, 0); }
	}
	}
		if( Z18 >= 9.79 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( Z32 < 9.64 ) { return new Prediction("Left", 22, 0); }
	}
	if( Z27 < 9.75 ) { 
	if( X2 >= 0.11 ) { 
		if( Y2 >= -0.09 ) { return new Prediction("Right", 2, 0); }
	if( Y2 < -0.09 ) { 
		if( Y4 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y4 >= -0.13 ) { return new Prediction("Left", 25, 0); }
	}
	}
	if( X2 < 0.11 ) { 
	if( X17 < 0.1 ) { 
	if( X23 >= 0.09 ) { 
		if( X21 < 0.09 ) { return new Prediction("Right", 7, 0); }
	if( X21 >= 0.09 ) { 
	if( Z4 < 9.64 ) { 
		if( X2 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Left", 10, 0); }
	}
	if( Z4 >= 9.64 ) { 
		if( Y6 < -0.12 ) { return new Prediction("Left", 2, 0); }
	if( Y6 >= -0.12 ) { 
		if( Z15 < 9.58 ) { return new Prediction("Left", 1, 0); }
		if( Z15 >= 9.58 ) { return new Prediction("Right", 10, 0); }
	}
	}
	}
	}
		if( X23 < 0.09 ) { return new Prediction("Left", 24, 0); }
	}
	if( X17 >= 0.1 ) { 
	if( Y12 < -0.13 ) { 
		if( Z11 < 9.48 ) { return new Prediction("Left", 1, 0); }
		if( Z11 >= 9.48 ) { return new Prediction("Right", 20, 0); }
	}
	if( Y12 >= -0.13 ) { 
		if( Z22 < 9.66 ) { return new Prediction("Left", 4, 0); }
	if( Z22 >= 9.66 ) { 
	if( Z17 < 9.72 ) { 
		if( Z13 >= 9.73 ) { return new Prediction("Right", 8, 0); }
		if( Z13 < 9.73 ) { return new Prediction("Left", 12, 0); }
	}
		if( Z17 >= 9.72 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	}
	}
	}
	if( Z3 >= 9.87 ) { 
		if( Z26 < 9.79 ) { return new Prediction("Right", 31, 0); }
		if( Z26 >= 9.79 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z11 >= 9.78 ) { 
		if( Z27 < 9.72 ) { return new Prediction("Right", 5, 0); }
	if( Z27 >= 9.72 ) { 
		if( X2 < 0.1 ) { return new Prediction("Left", 67, 0); }
	if( X2 >= 0.1 ) { 
	if( Z23 < 9.69 ) { 
		if( Y30 >= -0.1 ) { return new Prediction("Right", 2, 0); }
	if( Y30 < -0.1 ) { 
	if( Y27 < -0.12 ) { 
		if( Y15 >= -0.1 ) { return new Prediction("Left", 7, 0); }
	if( Y15 < -0.1 ) { 
		if( X17 < 0.09 ) { return new Prediction("Right", 3, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	}
		if( Y27 >= -0.12 ) { return new Prediction("Left", 21, 0); }
	}
	}
		if( Z23 >= 9.69 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	}
	if( Z15 >= 9.82 ) { 
	if( Z13 >= 9.65 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Left", 10, 0); }
	if( X21 < 0.11 ) { 
		if( Z16 < 9.67 ) { return new Prediction("Left", 8, 0); }
	if( Z16 >= 9.67 ) { 
		if( Z14 < 9.83 ) { return new Prediction("Left", 5, 0); }
	if( Z14 >= 9.83 ) { 
	if( Y21 >= -0.15 ) { 
		if( Z23 >= 9.79 ) { return new Prediction("Right", 38, 0); }
		if( Z23 < 9.79 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y21 < -0.15 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	if( Z13 < 9.65 ) { 
	if( Z32 >= 9.76 ) { 
		if( Z17 < 9.62 ) { return new Prediction("Left", 1, 0); }
		if( Z17 >= 9.62 ) { return new Prediction("Right", 111, 0); }
	}
	if( Z32 < 9.76 ) { 
	if( Y6 >= -0.13 ) { 
		if( Y14 < -0.11 ) { return new Prediction("Right", 4, 0); }
		if( Y14 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y6 < -0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree77() {
	if( X26 >= 0.11 ) { 
	if( Z20 < 9.59 ) { 
	if( Z23 >= 9.79 ) { 
	if( Z26 < 9.64 ) { 
	if( X13 >= 0.12 ) { 
		if( X14 < 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X14 >= 0.12 ) { return new Prediction("Right", 4, 0); }
	}
		if( X13 < 0.12 ) { return new Prediction("Right", 89, 0); }
	}
	if( Z26 >= 9.64 ) { 
		if( X1 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z23 < 9.79 ) { 
	if( Z10 >= 9.58 ) { 
		if( Z25 < 9.75 ) { return new Prediction("Left", 1, 0); }
		if( Z25 >= 9.75 ) { return new Prediction("Right", 15, 0); }
	}
	if( Z10 < 9.58 ) { 
		if( X9 >= 0.12 ) { return new Prediction("Right", 3, 0); }
		if( X9 < 0.12 ) { return new Prediction("Left", 15, 0); }
	}
	}
	}
	if( Z20 >= 9.59 ) { 
	if( Z16 < 9.73 ) { 
	if( Y13 < -0.09 ) { 
	if( X10 < 0.09 ) { 
		if( Y2 < -0.13 ) { return new Prediction("Right", 4, 0); }
	if( Y2 >= -0.13 ) { 
		if( Y16 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y16 < -0.1 ) { return new Prediction("Left", 14, 0); }
	}
	}
	if( X10 >= 0.09 ) { 
		if( Y29 < -0.11 ) { return new Prediction("Right", 17, 0); }
	if( Y29 >= -0.11 ) { 
		if( Y13 >= -0.11 ) { return new Prediction("Right", 4, 0); }
	if( Y13 < -0.11 ) { 
		if( Z21 < 9.62 ) { return new Prediction("Right", 1, 0); }
		if( Z21 >= 9.62 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	}
		if( Y13 >= -0.09 ) { return new Prediction("Left", 6, 0); }
	}
		if( Z16 >= 9.73 ) { return new Prediction("Left", 15, 0); }
	}
	}
	if( X26 < 0.11 ) { 
	if( Z19 >= 9.81 ) { 
		if( X4 < 0.1 ) { return new Prediction("Left", 76, 0); }
	if( X4 >= 0.1 ) { 
	if( Y2 < -0.1 ) { 
	if( Z11 < 9.79 ) { 
		if( Y3 < -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y3 >= -0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z11 >= 9.79 ) { return new Prediction("Left", 26, 0); }
	}
		if( Y2 >= -0.1 ) { return new Prediction("Right", 5, 0); }
	}
	}
	if( Z19 < 9.81 ) { 
	if( Z14 >= 9.85 ) { 
	if( Z20 < 9.59 ) { 
	if( Y7 < -0.13 ) { 
		if( X18 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X18 < 0.11 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y7 >= -0.13 ) { return new Prediction("Right", 34, 0); }
	}
	if( Z20 >= 9.59 ) { 
		if( Z17 >= 9.69 ) { return new Prediction("Right", 2, 0); }
		if( Z17 < 9.69 ) { return new Prediction("Left", 7, 0); }
	}
	}
	if( Z14 < 9.85 ) { 
	if( Z3 < 9.8 ) { 
	if( Y15 >= -0.13 ) { 
	if( Z24 >= 9.78 ) { 
		if( X14 < 0.08 ) { return new Prediction("Left", 8, 0); }
		if( X14 >= 0.08 ) { return new Prediction("Right", 9, 0); }
	}
		if( Z24 < 9.78 ) { return new Prediction("Left", 53, 0); }
	}
	if( Y15 < -0.13 ) { 
		if( Z12 < 9.62 ) { return new Prediction("Right", 9, 0); }
	if( Z12 >= 9.62 ) { 
		if( Y13 < -0.14 ) { return new Prediction("Left", 2, 0); }
	if( Y13 >= -0.14 ) { 
		if( X2 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
	if( Z3 >= 9.8 ) { 
		if( Y18 < -0.14 ) { return new Prediction("Left", 4, 0); }
	if( Y18 >= -0.14 ) { 
	if( Y23 >= -0.11 ) { 
		if( Z25 < 9.63 ) { return new Prediction("Right", 24, 0); }
	if( Z25 >= 9.63 ) { 
	if( Z18 < 9.79 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Right", 14, 0); }
	}
		if( Z18 >= 9.79 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( Y23 < -0.11 ) { 
	if( Z27 < 9.78 ) { 
		if( Y31 < -0.13 ) { return new Prediction("Left", 6, 0); }
	if( Y31 >= -0.13 ) { 
	if( X1 < 0.1 ) { 
		if( Y2 < -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y2 >= -0.12 ) { return new Prediction("Left", 9, 0); }
	}
	if( X1 >= 0.1 ) { 
	if( X9 < 0.09 ) { 
		if( Y3 >= -0.11 ) { return new Prediction("Right", 2, 0); }
		if( Y3 < -0.11 ) { return new Prediction("Left", 4, 0); }
	}
		if( X9 >= 0.09 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
		if( Z27 >= 9.78 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree78() {
	if( Z11 >= 9.76 ) { 
	if( Z22 >= 9.72 ) { 
		if( X20 < 0.1 ) { return new Prediction("Right", 12, 0); }
	if( X20 >= 0.1 ) { 
		if( X11 >= 0.11 ) { return new Prediction("Left", 7, 0); }
		if( X11 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z22 < 9.72 ) { 
	if( Z12 < 9.77 ) { 
	if( Z26 >= 9.77 ) { 
		if( X7 >= 0.08 ) { return new Prediction("Right", 8, 0); }
		if( X7 < 0.08 ) { return new Prediction("Left", 4, 0); }
	}
	if( Z26 < 9.77 ) { 
	if( X11 >= 0.11 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Right", 4, 0); }
		if( X17 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	if( X11 < 0.11 ) { 
		if( X10 >= 0.07 ) { return new Prediction("Left", 20, 0); }
		if( X10 < 0.07 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( Z12 >= 9.77 ) { return new Prediction("Left", 89, 0); }
	}
	}
	if( Z11 < 9.76 ) { 
	if( X27 >= 0.1 ) { 
	if( Z11 >= 9.46 ) { 
	if( X26 >= 0.11 ) { 
	if( Z17 < 9.71 ) { 
		if( Z5 >= 9.81 ) { return new Prediction("Right", 12, 0); }
	if( Z5 < 9.81 ) { 
	if( Z2 < 9.6 ) { 
		if( Z25 < 9.79 ) { return new Prediction("Left", 8, 0); }
		if( Z25 >= 9.79 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z2 >= 9.6 ) { return new Prediction("Right", 5, 0); }
	}
	}
		if( Z17 >= 9.71 ) { return new Prediction("Right", 84, 0); }
	}
	if( X26 < 0.11 ) { 
	if( Z10 < 9.74 ) { 
	if( Z22 >= 9.67 ) { 
	if( Z17 >= 9.68 ) { 
	if( X13 < 0.08 ) { 
		if( Z2 < 9.52 ) { return new Prediction("Right", 6, 0); }
	if( Z2 >= 9.52 ) { 
		if( X13 >= 0.06 ) { return new Prediction("Left", 3, 0); }
		if( X13 < 0.06 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X13 >= 0.08 ) { return new Prediction("Right", 68, 0); }
	}
	if( Z17 < 9.68 ) { 
	if( Z2 < 9.71 ) { 
		if( Y20 >= -0.1 ) { return new Prediction("Right", 2, 0); }
		if( Y20 < -0.1 ) { return new Prediction("Left", 11, 0); }
	}
		if( Z2 >= 9.71 ) { return new Prediction("Right", 19, 0); }
	}
	}
		if( Z22 < 9.67 ) { return new Prediction("Left", 3, 0); }
	}
		if( Z10 >= 9.74 ) { return new Prediction("Left", 15, 0); }
	}
	}
		if( Z11 < 9.46 ) { return new Prediction("Left", 13, 0); }
	}
	if( X27 < 0.1 ) { 
	if( Z2 < 9.85 ) { 
	if( Z24 < 9.81 ) { 
	if( Y17 < -0.13 ) { 
		if( Z14 >= 9.61 ) { return new Prediction("Right", 9, 0); }
	if( Z14 < 9.61 ) { 
		if( X14 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X14 < 0.11 ) { return new Prediction("Left", 7, 0); }
	}
	}
	if( Y17 >= -0.13 ) { 
	if( Y14 < -0.13 ) { 
	if( Z24 < 9.77 ) { 
		if( Y18 < -0.1 ) { return new Prediction("Left", 10, 0); }
		if( Y18 >= -0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z24 >= 9.77 ) { return new Prediction("Right", 7, 0); }
	}
	if( Y14 >= -0.13 ) { 
		if( Z7 >= 9.66 ) { return new Prediction("Left", 38, 0); }
	if( Z7 < 9.66 ) { 
	if( Z2 >= 9.81 ) { 
		if( Z7 >= 9.54 ) { return new Prediction("Right", 6, 0); }
		if( Z7 < 9.54 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z2 < 9.81 ) { return new Prediction("Left", 14, 0); }
	}
	}
	}
	}
		if( Z24 >= 9.81 ) { return new Prediction("Right", 10, 0); }
	}
		if( Z2 >= 9.85 ) { return new Prediction("Right", 15, 0); }
	}
	}
return null;
}
private Prediction runTree79() {
	if( Z32 < 9.78 ) { 
	if( Z18 < 9.56 ) { 
		if( Z19 >= 9.53 ) { return new Prediction("Right", 20, 0); }
	if( Z19 < 9.53 ) { 
		if( Z5 >= 9.68 ) { return new Prediction("Right", 9, 0); }
		if( Z5 < 9.68 ) { return new Prediction("Left", 7, 0); }
	}
	}
	if( Z18 >= 9.56 ) { 
	if( Z17 >= 9.59 ) { 
	if( X4 < 0.13 ) { 
	if( Z8 < 9.87 ) { 
	if( Z11 >= 9.8 ) { 
		if( Z21 >= 9.64 ) { return new Prediction("Left", 81, 0); }
	if( Z21 < 9.64 ) { 
	if( Y23 >= -0.11 ) { 
		if( X6 < 0.12 ) { return new Prediction("Right", 9, 0); }
		if( X6 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y23 < -0.11 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( Z11 < 9.8 ) { 
	if( Z8 < 9.65 ) { 
	if( Z22 < 9.66 ) { 
	if( Z7 < 9.61 ) { 
	if( X4 >= 0.09 ) { 
	if( Z2 < 9.87 ) { 
		if( X9 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X9 < 0.11 ) { return new Prediction("Left", 14, 0); }
	}
		if( Z2 >= 9.87 ) { return new Prediction("Right", 4, 0); }
	}
		if( X4 < 0.09 ) { return new Prediction("Left", 30, 0); }
	}
	if( Z7 >= 9.61 ) { 
	if( X1 < 0.1 ) { 
		if( X31 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X31 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( X1 >= 0.1 ) { return new Prediction("Right", 10, 0); }
	}
	}
	if( Z22 >= 9.66 ) { 
	if( Y22 < -0.11 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 4, 0); }
	if( Y5 < -0.1 ) { 
		if( X22 >= 0.08 ) { return new Prediction("Left", 6, 0); }
		if( X22 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Y22 >= -0.11 ) { 
	if( X9 < 0.1 ) { 
	if( X2 < 0.09 ) { 
		if( X4 >= 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X4 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( X2 >= 0.09 ) { return new Prediction("Right", 26, 0); }
	}
	if( X9 >= 0.1 ) { 
		if( X28 < 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X28 >= 0.1 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
	}
	if( Z8 >= 9.65 ) { 
	if( Z24 < 9.76 ) { 
		if( Z16 >= 9.7 ) { return new Prediction("Left", 46, 0); }
	if( Z16 < 9.7 ) { 
		if( Z9 >= 9.65 ) { return new Prediction("Right", 3, 0); }
		if( Z9 < 9.65 ) { return new Prediction("Left", 14, 0); }
	}
	}
	if( Z24 >= 9.76 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Left", 4, 0); }
	if( X2 < 0.11 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Right", 11, 0); }
		if( X19 < 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	}
	if( Z8 >= 9.87 ) { 
		if( Y2 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y2 >= -0.13 ) { return new Prediction("Right", 16, 0); }
	}
	}
		if( X4 >= 0.13 ) { return new Prediction("Left", 35, 0); }
	}
	if( Z17 < 9.59 ) { 
		if( Y12 < -0.1 ) { return new Prediction("Right", 18, 0); }
		if( Y12 >= -0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z32 >= 9.78 ) { 
		if( X26 < 0.09 ) { return new Prediction("Left", 2, 0); }
	if( X26 >= 0.09 ) { 
		if( Z11 < 9.43 ) { return new Prediction("Left", 2, 0); }
	if( Z11 >= 9.43 ) { 
	if( X13 >= 0.07 ) { 
		if( Z16 < 9.66 ) { return new Prediction("Left", 1, 0); }
		if( Z16 >= 9.66 ) { return new Prediction("Right", 124, 0); }
	}
	if( X13 < 0.07 ) { 
		if( X16 < 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X16 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree80() {
	if( Z21 >= 9.73 ) { 
	if( Z15 >= 9.85 ) { 
	if( Z6 < 9.76 ) { 
	if( Y27 < -0.12 ) { 
		if( X4 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X4 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
	if( Y27 >= -0.12 ) { 
	if( Z12 >= 9.67 ) { 
		if( X23 < 0.13 ) { return new Prediction("Left", 3, 0); }
		if( X23 >= 0.13 ) { return new Prediction("Right", 3, 0); }
	}
		if( Z12 < 9.67 ) { return new Prediction("Right", 62, 0); }
	}
	}
		if( Z6 >= 9.76 ) { return new Prediction("Right", 70, 0); }
	}
	if( Z15 < 9.85 ) { 
	if( Z20 < 9.68 ) { 
		if( X2 >= 0.12 ) { return new Prediction("Left", 14, 0); }
	if( X2 < 0.12 ) { 
	if( X25 < 0.1 ) { 
		if( Z3 >= 9.6 ) { return new Prediction("Right", 3, 0); }
		if( Z3 < 9.6 ) { return new Prediction("Left", 11, 0); }
	}
	if( X25 >= 0.1 ) { 
	if( Y16 >= -0.12 ) { 
		if( Y27 < -0.13 ) { return new Prediction("Left", 2, 0); }
	if( Y27 >= -0.13 ) { 
		if( Y18 < -0.09 ) { return new Prediction("Right", 18, 0); }
		if( Y18 >= -0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Y16 < -0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z20 >= 9.68 ) { 
		if( X4 >= 0.09 ) { return new Prediction("Right", 35, 0); }
	if( X4 < 0.09 ) { 
		if( Z11 < 9.79 ) { return new Prediction("Right", 3, 0); }
		if( Z11 >= 9.79 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z21 < 9.73 ) { 
	if( Z17 < 9.73 ) { 
		if( Z19 >= 9.81 ) { return new Prediction("Left", 90, 0); }
	if( Z19 < 9.81 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 33, 0); }
	if( X10 >= 0.09 ) { 
		if( X17 < 0.09 ) { return new Prediction("Right", 10, 0); }
	if( X17 >= 0.09 ) { 
	if( X6 < 0.1 ) { 
	if( X19 >= 0.09 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Right", 4, 0); }
	if( X10 < 0.11 ) { 
		if( Y3 < -0.09 ) { return new Prediction("Left", 26, 0); }
		if( Y3 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( X19 < 0.09 ) { return new Prediction("Right", 4, 0); }
	}
	if( X6 >= 0.1 ) { 
		if( Z1 >= 9.82 ) { return new Prediction("Right", 9, 0); }
	if( Z1 < 9.82 ) { 
	if( X25 >= 0.11 ) { 
		if( Y10 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	if( Y10 < -0.11 ) { 
		if( X5 < 0.13 ) { return new Prediction("Right", 6, 0); }
		if( X5 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( X25 < 0.11 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( Z17 >= 9.73 ) { 
	if( Y26 >= -0.12 ) { 
	if( X21 < 0.1 ) { 
	if( Z2 < 9.6 ) { 
		if( X7 < 0.07 ) { return new Prediction("Left", 5, 0); }
		if( X7 >= 0.07 ) { return new Prediction("Right", 16, 0); }
	}
	if( Z2 >= 9.6 ) { 
	if( Y11 < -0.1 ) { 
		if( Z25 < 9.81 ) { return new Prediction("Left", 18, 0); }
	if( Z25 >= 9.81 ) { 
		if( X9 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.08 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y11 >= -0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X21 >= 0.1 ) { 
	if( Z16 >= 9.74 ) { 
	if( Y23 >= -0.1 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y23 < -0.1 ) { return new Prediction("Right", 26, 0); }
	}
	if( Z16 < 9.74 ) { 
	if( X31 < 0.09 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Right", 8, 0); }
		if( X2 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	if( X31 >= 0.09 ) { 
		if( Y11 < -0.1 ) { return new Prediction("Left", 5, 0); }
		if( Y11 >= -0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
		if( Y26 < -0.12 ) { return new Prediction("Left", 10, 0); }
	}
	}
return null;
}
private Prediction runTree81() {
	if( Z25 < 9.79 ) { 
	if( Z10 < 9.75 ) { 
	if( Z31 >= 9.79 ) { 
		if( Y10 >= -0.11 ) { return new Prediction("Right", 27, 0); }
	if( Y10 < -0.11 ) { 
		if( Z4 < 9.59 ) { return new Prediction("Left", 3, 0); }
	if( Z4 >= 9.59 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Right", 11, 0); }
		if( X19 < 0.1 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z31 < 9.79 ) { 
	if( Z4 < 9.79 ) { 
		if( Z2 >= 9.82 ) { return new Prediction("Right", 15, 0); }
	if( Z2 < 9.82 ) { 
	if( Y3 < -0.12 ) { 
		if( X26 >= 0.11 ) { return new Prediction("Right", 2, 0); }
	if( X26 < 0.11 ) { 
		if( Z23 < 9.77 ) { return new Prediction("Left", 9, 0); }
	if( Z23 >= 9.77 ) { 
		if( X13 >= 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X13 < 0.12 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Y3 >= -0.12 ) { 
		if( Z7 >= 9.91 ) { return new Prediction("Right", 1, 0); }
	if( Z7 < 9.91 ) { 
	if( Y15 >= -0.13 ) { 
	if( Z28 >= 9.75 ) { 
		if( X5 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X5 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z28 < 9.75 ) { return new Prediction("Left", 55, 0); }
	}
	if( Y15 < -0.13 ) { 
		if( X20 < 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X20 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
	if( Z4 >= 9.79 ) { 
		if( X16 >= 0.1 ) { return new Prediction("Right", 29, 0); }
	if( X16 < 0.1 ) { 
	if( X19 >= 0.09 ) { 
		if( X13 >= 0.1 ) { return new Prediction("Left", 3, 0); }
		if( X13 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( X19 < 0.09 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
	}
	if( Z10 >= 9.75 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 107, 0); }
	if( Z13 < 9.78 ) { 
	if( Z1 >= 9.87 ) { 
	if( X5 >= 0.08 ) { 
		if( Z9 < 9.83 ) { return new Prediction("Right", 15, 0); }
		if( Z9 >= 9.83 ) { return new Prediction("Left", 2, 0); }
	}
		if( X5 < 0.08 ) { return new Prediction("Left", 4, 0); }
	}
	if( Z1 < 9.87 ) { 
	if( X26 < 0.09 ) { 
		if( Z27 >= 9.77 ) { return new Prediction("Right", 5, 0); }
	if( Z27 < 9.77 ) { 
		if( X15 < 0.1 ) { return new Prediction("Left", 14, 0); }
	if( X15 >= 0.1 ) { 
		if( X11 >= 0.08 ) { return new Prediction("Right", 3, 0); }
		if( X11 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( X26 >= 0.09 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Left", 43, 0); }
	if( X19 < 0.09 ) { 
		if( Z24 < 9.65 ) { return new Prediction("Left", 13, 0); }
	if( Z24 >= 9.65 ) { 
		if( X11 >= 0.09 ) { return new Prediction("Right", 2, 0); }
		if( X11 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( Z25 >= 9.79 ) { 
	if( Z12 >= 9.48 ) { 
		if( Z18 < 9.85 ) { return new Prediction("Right", 123, 0); }
		if( Z18 >= 9.85 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z12 < 9.48 ) { return new Prediction("Left", 8, 0); }
	}
return null;
}
private Prediction runTree82() {
	if( Z24 < 9.77 ) { 
	if( Z2 >= 9.8 ) { 
	if( Z20 >= 9.81 ) { 
		if( Z27 < 9.72 ) { return new Prediction("Right", 3, 0); }
	if( Z27 >= 9.72 ) { 
		if( Z24 < 9.67 ) { return new Prediction("Left", 113, 0); }
		if( Z24 >= 9.67 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z20 < 9.81 ) { 
	if( Z21 < 9.66 ) { 
		if( Z15 >= 9.62 ) { return new Prediction("Left", 18, 0); }
	if( Z15 < 9.62 ) { 
		if( Z6 >= 9.65 ) { return new Prediction("Left", 9, 0); }
	if( Z6 < 9.65 ) { 
		if( Z1 >= 9.82 ) { return new Prediction("Right", 8, 0); }
	if( Z1 < 9.82 ) { 
		if( X10 < 0.1 ) { return new Prediction("Left", 6, 0); }
		if( X10 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	if( Z21 >= 9.66 ) { 
	if( Z6 < 10.17 ) { 
	if( Z22 < 9.69 ) { 
	if( X16 < 0.11 ) { 
		if( X24 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	if( X24 < 0.1 ) { 
		if( X2 >= 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X2 < 0.12 ) { return new Prediction("Right", 5, 0); }
	}
	}
		if( X16 >= 0.11 ) { return new Prediction("Right", 13, 0); }
	}
		if( Z22 >= 9.69 ) { return new Prediction("Right", 42, 0); }
	}
		if( Z6 >= 10.17 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z2 < 9.8 ) { 
	if( Z4 < 9.88 ) { 
	if( X6 < 0.08 ) { 
		if( Z5 >= 9.69 ) { return new Prediction("Right", 1, 0); }
		if( Z5 < 9.69 ) { return new Prediction("Left", 6, 0); }
	}
		if( X6 >= 0.08 ) { return new Prediction("Left", 97, 0); }
	}
		if( Z4 >= 9.88 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z24 >= 9.77 ) { 
	if( X11 >= 0.09 ) { 
		if( Z17 < 9.62 ) { return new Prediction("Left", 1, 0); }
		if( Z17 >= 9.62 ) { return new Prediction("Right", 145, 0); }
	}
	if( X11 < 0.09 ) { 
		if( Z32 < 9.79 ) { return new Prediction("Left", 15, 0); }
		if( Z32 >= 9.79 ) { return new Prediction("Right", 26, 0); }
	}
	}
return null;
}
private Prediction runTree83() {
	if( Z1 < 9.61 ) { 
	if( Z12 >= 9.48 ) { 
	if( Z5 < 9.79 ) { 
	if( Z18 < 9.71 ) { 
	if( Z23 >= 9.78 ) { 
	if( X5 < 0.12 ) { 
		if( Y22 >= -0.14 ) { return new Prediction("Right", 63, 0); }
		if( Y22 < -0.14 ) { return new Prediction("Left", 3, 0); }
	}
		if( X5 >= 0.12 ) { return new Prediction("Left", 12, 0); }
	}
	if( Z23 < 9.78 ) { 
	if( Z17 < 9.72 ) { 
		if( X5 >= 0.08 ) { return new Prediction("Left", 37, 0); }
		if( X5 < 0.08 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z17 >= 9.72 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z18 >= 9.71 ) { 
		if( Z16 < 9.71 ) { return new Prediction("Left", 2, 0); }
		if( Z16 >= 9.71 ) { return new Prediction("Right", 87, 0); }
	}
	}
		if( Z5 >= 9.79 ) { return new Prediction("Right", 38, 0); }
	}
		if( Z12 < 9.48 ) { return new Prediction("Left", 17, 0); }
	}
	if( Z1 >= 9.61 ) { 
	if( Z20 >= 9.82 ) { 
		if( Y17 >= -0.14 ) { return new Prediction("Left", 77, 0); }
	if( Y17 < -0.14 ) { 
		if( Z19 < 9.84 ) { return new Prediction("Right", 3, 0); }
		if( Z19 >= 9.84 ) { return new Prediction("Left", 4, 0); }
	}
	}
	if( Z20 < 9.82 ) { 
	if( Z4 < 9.94 ) { 
	if( Z13 >= 9.7 ) { 
	if( Y19 < -0.1 ) { 
	if( X5 < 0.13 ) { 
	if( Z19 < 9.79 ) { 
	if( X32 < 0.1 ) { 
	if( Z9 < 9.77 ) { 
		if( Z1 >= 9.82 ) { return new Prediction("Right", 11, 0); }
	if( Z1 < 9.82 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 3, 0); }
	if( X17 >= 0.09 ) { 
		if( X27 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X27 < 0.11 ) { return new Prediction("Right", 4, 0); }
	}
	}
	}
		if( Z9 >= 9.77 ) { return new Prediction("Left", 3, 0); }
	}
		if( X32 >= 0.1 ) { return new Prediction("Right", 33, 0); }
	}
	if( Z19 >= 9.79 ) { 
	if( Z12 < 9.77 ) { 
	if( Y3 < -0.1 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Right", 9, 0); }
		if( X3 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y3 >= -0.1 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z12 >= 9.77 ) { return new Prediction("Left", 11, 0); }
	}
	}
		if( X5 >= 0.13 ) { return new Prediction("Left", 7, 0); }
	}
	if( Y19 >= -0.1 ) { 
		if( Y26 >= -0.12 ) { return new Prediction("Left", 12, 0); }
	if( Y26 < -0.12 ) { 
		if( Z29 < 9.71 ) { return new Prediction("Left", 3, 0); }
		if( Z29 >= 9.71 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( Z13 < 9.7 ) { 
		if( Y8 >= -0.09 ) { return new Prediction("Right", 4, 0); }
	if( Y8 < -0.09 ) { 
	if( Z21 >= 9.59 ) { 
		if( Z22 >= 9.71 ) { return new Prediction("Right", 2, 0); }
		if( Z22 < 9.71 ) { return new Prediction("Left", 49, 0); }
	}
	if( Z21 < 9.59 ) { 
		if( Y11 < -0.12 ) { return new Prediction("Right", 4, 0); }
		if( Y11 >= -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
		if( Z4 >= 9.94 ) { return new Prediction("Right", 13, 0); }
	}
	}
return null;
}
private Prediction runTree84() {
	if( Z7 >= 9.87 ) { 
		if( X14 >= 0.07 ) { return new Prediction("Right", 116, 0); }
	if( X14 < 0.07 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 3, 0); }
		if( X10 >= 0.08 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z7 < 9.87 ) { 
	if( Z31 >= 9.78 ) { 
		if( X27 < 0.09 ) { return new Prediction("Left", 2, 0); }
	if( X27 >= 0.09 ) { 
		if( X11 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	if( X11 < 0.13 ) { 
		if( Z12 >= 9.48 ) { return new Prediction("Right", 53, 0); }
		if( Z12 < 9.48 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z31 < 9.78 ) { 
	if( Z9 < 9.75 ) { 
	if( Z2 >= 9.81 ) { 
	if( Z22 < 9.7 ) { 
	if( Z20 < 9.79 ) { 
	if( X20 < 0.1 ) { 
		if( Y31 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y31 >= -0.13 ) { return new Prediction("Right", 11, 0); }
	}
		if( X20 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z20 >= 9.79 ) { 
	if( X26 >= 0.11 ) { 
		if( X1 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Right", 3, 0); }
	}
		if( X26 < 0.11 ) { return new Prediction("Left", 15, 0); }
	}
	}
	if( Z22 >= 9.7 ) { 
		if( Y10 >= -0.06 ) { return new Prediction("Left", 2, 0); }
		if( Y10 < -0.06 ) { return new Prediction("Right", 55, 0); }
	}
	}
	if( Z2 < 9.81 ) { 
	if( X23 < 0.11 ) { 
	if( Z17 >= 9.75 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Left", 3, 0); }
	if( Y5 < -0.1 ) { 
		if( Y32 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y32 >= -0.13 ) { return new Prediction("Right", 7, 0); }
	}
	}
	if( Z17 < 9.75 ) { 
	if( Z17 >= 9.6 ) { 
		if( Z14 < 9.83 ) { return new Prediction("Left", 61, 0); }
	if( Z14 >= 9.83 ) { 
		if( Y11 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y11 >= -0.13 ) { return new Prediction("Left", 8, 0); }
	}
	}
	if( Z17 < 9.6 ) { 
		if( X25 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X25 < 0.11 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( X23 >= 0.11 ) { 
		if( X5 < 0.11 ) { return new Prediction("Right", 8, 0); }
		if( X5 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z9 >= 9.75 ) { 
	if( Z5 >= 9.63 ) { 
	if( X21 < 0.09 ) { 
		if( Y18 >= -0.13 ) { return new Prediction("Left", 5, 0); }
		if( Y18 < -0.13 ) { return new Prediction("Right", 3, 0); }
	}
	if( X21 >= 0.09 ) { 
		if( Z12 >= 9.78 ) { return new Prediction("Left", 73, 0); }
	if( Z12 < 9.78 ) { 
	if( Z24 < 9.65 ) { 
	if( Z17 >= 9.68 ) { 
	if( X27 >= 0.1 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X3 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
		if( X27 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z17 < 9.68 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z24 >= 9.65 ) { return new Prediction("Left", 26, 0); }
	}
	}
	}
	if( Z5 < 9.63 ) { 
	if( X25 < 0.09 ) { 
		if( Y16 >= -0.12 ) { return new Prediction("Right", 8, 0); }
	if( Y16 < -0.12 ) { 
		if( Z25 < 9.71 ) { return new Prediction("Right", 3, 0); }
		if( Z25 >= 9.71 ) { return new Prediction("Left", 3, 0); }
	}
	}
	if( X25 >= 0.09 ) { 
		if( X14 >= 0.11 ) { return new Prediction("Right", 4, 0); }
	if( X14 < 0.11 ) { 
		if( Y24 >= -0.09 ) { return new Prediction("Right", 2, 0); }
		if( Y24 < -0.09 ) { return new Prediction("Left", 24, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree85() {
	if( X18 >= 0.11 ) { 
	if( Z8 < 9.87 ) { 
	if( Z19 < 9.79 ) { 
	if( Y15 >= -0.1 ) { 
		if( X10 < 0.13 ) { return new Prediction("Right", 25, 0); }
		if( X10 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	if( Y15 < -0.1 ) { 
		if( X11 >= 0.12 ) { return new Prediction("Left", 21, 0); }
	if( X11 < 0.12 ) { 
	if( X24 >= 0.09 ) { 
	if( Y7 >= -0.11 ) { 
		if( Y18 >= -0.13 ) { return new Prediction("Right", 29, 0); }
	if( Y18 < -0.13 ) { 
		if( X7 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X7 < 0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Y7 < -0.11 ) { 
		if( X6 < 0.11 ) { return new Prediction("Right", 3, 0); }
		if( X6 >= 0.11 ) { return new Prediction("Left", 5, 0); }
	}
	}
		if( X24 < 0.09 ) { return new Prediction("Left", 6, 0); }
	}
	}
	}
	if( Z19 >= 9.79 ) { 
		if( Y4 >= -0.12 ) { return new Prediction("Left", 18, 0); }
	if( Y4 < -0.12 ) { 
		if( X32 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X32 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z8 >= 9.87 ) { 
	if( Y7 >= -0.15 ) { 
		if( X25 < 0.12 ) { return new Prediction("Right", 70, 0); }
	if( X25 >= 0.12 ) { 
		if( Z1 >= 9.58 ) { return new Prediction("Left", 1, 0); }
		if( Z1 < 9.58 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( Y7 < -0.15 ) { return new Prediction("Left", 2, 0); }
	}
	}
	if( X18 < 0.11 ) { 
	if( Z27 < 9.72 ) { 
	if( Z14 >= 9.86 ) { 
		if( Z16 < 9.67 ) { return new Prediction("Left", 2, 0); }
		if( Z16 >= 9.67 ) { return new Prediction("Right", 45, 0); }
	}
	if( Z14 < 9.86 ) { 
	if( Z14 >= 9.69 ) { 
	if( Z8 >= 9.67 ) { 
	if( Z25 >= 9.77 ) { 
	if( Y16 >= -0.1 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 5, 0); }
	if( X17 >= 0.09 ) { 
		if( X22 >= 0.08 ) { return new Prediction("Right", 2, 0); }
		if( X22 < 0.08 ) { return new Prediction("Left", 2, 0); }
	}
	}
		if( Y16 < -0.1 ) { return new Prediction("Right", 10, 0); }
	}
	if( Z25 < 9.77 ) { 
	if( Z10 >= 9.68 ) { 
		if( X2 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z10 < 9.68 ) { return new Prediction("Left", 37, 0); }
	}
	}
		if( Z8 < 9.67 ) { return new Prediction("Right", 9, 0); }
	}
	if( Z14 < 9.69 ) { 
		if( Z13 < 9.63 ) { return new Prediction("Left", 3, 0); }
	if( Z13 >= 9.63 ) { 
		if( X22 >= 0.08 ) { return new Prediction("Right", 28, 0); }
		if( X22 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	if( Z27 >= 9.72 ) { 
	if( Z32 >= 9.61 ) { 
	if( X3 >= 0.09 ) { 
		if( Z10 >= 9.83 ) { return new Prediction("Left", 28, 0); }
	if( Z10 < 9.83 ) { 
	if( X18 < 0.1 ) { 
	if( Z12 >= 9.7 ) { 
	if( Z20 < 9.85 ) { 
	if( X11 >= 0.09 ) { 
	if( Y19 < -0.13 ) { 
		if( X17 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Left", 2, 0); }
	}
	if( Y19 >= -0.13 ) { 
	if( X12 < 0.09 ) { 
		if( Y24 < -0.11 ) { return new Prediction("Right", 2, 0); }
		if( Y24 >= -0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( X12 >= 0.09 ) { return new Prediction("Right", 24, 0); }
	}
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z20 >= 9.85 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z12 < 9.7 ) { return new Prediction("Left", 9, 0); }
	}
	if( X18 >= 0.1 ) { 
		if( Z20 < 9.72 ) { return new Prediction("Right", 2, 0); }
	if( Z20 >= 9.72 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y6 < -0.1 ) { return new Prediction("Left", 19, 0); }
	}
	}
	}
	}
	if( X3 < 0.09 ) { 
		if( Z24 >= 9.61 ) { return new Prediction("Left", 43, 0); }
		if( Z24 < 9.61 ) { return new Prediction("Right", 2, 0); }
	}
	}
		if( Z32 < 9.61 ) { return new Prediction("Left", 43, 0); }
	}
	}
return null;
}
private Prediction runTree86() {
	if( Z3 < 9.55 ) { 
	if( Z8 < 9.84 ) { 
	if( X21 < 0.1 ) { 
	if( Z31 >= 9.79 ) { 
		if( X25 >= 0.11 ) { return new Prediction("Right", 7, 0); }
		if( X25 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z31 < 9.79 ) { return new Prediction("Left", 10, 0); }
	}
		if( X21 >= 0.1 ) { return new Prediction("Right", 13, 0); }
	}
		if( Z8 >= 9.84 ) { return new Prediction("Right", 72, 0); }
	}
	if( Z3 >= 9.55 ) { 
	if( Z10 < 9.74 ) { 
		if( Z13 < 9.49 ) { return new Prediction("Left", 10, 0); }
	if( Z13 >= 9.49 ) { 
	if( Z8 < 9.9 ) { 
	if( Z31 >= 9.79 ) { 
		if( Z17 >= 9.7 ) { return new Prediction("Right", 37, 0); }
		if( Z17 < 9.7 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z31 < 9.79 ) { 
	if( Z14 >= 9.73 ) { 
	if( X3 < 0.08 ) { 
		if( X15 < 0.12 ) { return new Prediction("Right", 4, 0); }
		if( X15 >= 0.12 ) { return new Prediction("Left", 1, 0); }
	}
	if( X3 >= 0.08 ) { 
		if( Y5 < -0.14 ) { return new Prediction("Right", 2, 0); }
	if( Y5 >= -0.14 ) { 
		if( Z16 < 9.72 ) { return new Prediction("Left", 31, 0); }
	if( Z16 >= 9.72 ) { 
		if( Z1 < 9.56 ) { return new Prediction("Right", 2, 0); }
	if( Z1 >= 9.56 ) { 
	if( Z32 >= 9.77 ) { 
		if( X18 < 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X18 >= 0.12 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z32 < 9.77 ) { return new Prediction("Left", 13, 0); }
	}
	}
	}
	}
	}
	if( Z14 < 9.73 ) { 
		if( X25 >= 0.11 ) { return new Prediction("Right", 43, 0); }
	if( X25 < 0.11 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 6, 0); }
	if( X3 >= 0.08 ) { 
		if( Z2 < 9.79 ) { return new Prediction("Left", 9, 0); }
		if( Z2 >= 9.79 ) { return new Prediction("Right", 23, 0); }
	}
	}
	}
	}
	}
		if( Z8 >= 9.9 ) { return new Prediction("Right", 44, 0); }
	}
	}
	if( Z10 >= 9.74 ) { 
		if( X6 < 0.09 ) { return new Prediction("Left", 60, 0); }
	if( X6 >= 0.09 ) { 
		if( Z6 >= 9.69 ) { return new Prediction("Left", 45, 0); }
	if( Z6 < 9.69 ) { 
	if( Z1 >= 9.82 ) { 
	if( Z31 < 9.62 ) { 
	if( Y16 >= -0.11 ) { 
		if( X22 < 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X22 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y16 < -0.11 ) { return new Prediction("Left", 19, 0); }
	}
	if( Z31 >= 9.62 ) { 
	if( Z12 < 9.69 ) { 
		if( X1 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Left", 6, 0); }
	}
	if( Z12 >= 9.69 ) { 
		if( Z5 < 9.66 ) { return new Prediction("Right", 26, 0); }
	if( Z5 >= 9.66 ) { 
		if( Z7 < 9.63 ) { return new Prediction("Right", 5, 0); }
		if( Z7 >= 9.63 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z1 < 9.82 ) { 
		if( X17 < 0.11 ) { return new Prediction("Left", 18, 0); }
		if( X17 >= 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree87() {
	if( Z23 >= 9.78 ) { 
	if( Z24 < 9.77 ) { 
		if( Y16 >= -0.1 ) { return new Prediction("Right", 8, 0); }
		if( Y16 < -0.1 ) { return new Prediction("Left", 8, 0); }
	}
	if( Z24 >= 9.77 ) { 
		if( Z31 >= 9.79 ) { return new Prediction("Right", 120, 0); }
	if( Z31 < 9.79 ) { 
		if( X13 < 0.08 ) { return new Prediction("Left", 9, 0); }
		if( X13 >= 0.08 ) { return new Prediction("Right", 24, 0); }
	}
	}
	}
	if( Z23 < 9.78 ) { 
	if( Z31 < 9.62 ) { 
	if( Z27 < 9.73 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 1, 0); }
		if( Y4 >= -0.11 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z27 >= 9.73 ) { 
	if( Y16 >= -0.1 ) { 
		if( X18 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X18 >= 0.09 ) { return new Prediction("Left", 10, 0); }
	}
		if( Y16 < -0.1 ) { return new Prediction("Left", 56, 0); }
	}
	}
	if( Z31 >= 9.62 ) { 
	if( Z24 < 9.8 ) { 
	if( Z19 >= 9.81 ) { 
		if( X29 < 0.12 ) { return new Prediction("Left", 35, 0); }
		if( X29 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	}
	if( Z19 < 9.81 ) { 
	if( Z1 < 9.84 ) { 
	if( Z12 >= 9.73 ) { 
	if( Y7 < -0.1 ) { 
	if( Z21 < 9.71 ) { 
	if( Y14 < -0.12 ) { 
		if( X1 >= 0.11 ) { return new Prediction("Left", 1, 0); }
		if( X1 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y14 >= -0.12 ) { return new Prediction("Left", 15, 0); }
	}
	if( Z21 >= 9.71 ) { 
		if( Y12 < -0.13 ) { return new Prediction("Left", 6, 0); }
		if( Y12 >= -0.13 ) { return new Prediction("Right", 12, 0); }
	}
	}
	if( Y7 >= -0.1 ) { 
		if( Z14 < 9.78 ) { return new Prediction("Right", 26, 0); }
		if( Z14 >= 9.78 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z12 < 9.73 ) { 
	if( Z24 < 9.76 ) { 
		if( Z11 < 9.69 ) { return new Prediction("Left", 59, 0); }
	if( Z11 >= 9.69 ) { 
	if( Y5 >= -0.13 ) { 
	if( Y13 >= -0.12 ) { 
		if( Z20 >= 9.8 ) { return new Prediction("Right", 1, 0); }
		if( Z20 < 9.8 ) { return new Prediction("Left", 23, 0); }
	}
	if( Y13 < -0.12 ) { 
		if( Z14 < 9.6 ) { return new Prediction("Right", 3, 0); }
		if( Z14 >= 9.6 ) { return new Prediction("Left", 4, 0); }
	}
	}
		if( Y5 < -0.13 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z24 >= 9.76 ) { 
		if( X25 < 0.1 ) { return new Prediction("Left", 10, 0); }
		if( X25 >= 0.1 ) { return new Prediction("Right", 17, 0); }
	}
	}
	}
	if( Z1 >= 9.84 ) { 
	if( X9 < 0.08 ) { 
		if( X21 < 0.1 ) { return new Prediction("Right", 3, 0); }
		if( X21 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
		if( X9 >= 0.08 ) { return new Prediction("Right", 42, 0); }
	}
	}
	}
		if( Z24 >= 9.8 ) { return new Prediction("Right", 17, 0); }
	}
	}
return null;
}
private Prediction runTree88() {
	if( X22 < 0.1 ) { 
	if( Z22 < 9.76 ) { 
		if( X15 < 0.08 ) { return new Prediction("Left", 24, 0); }
	if( X15 >= 0.08 ) { 
	if( Z15 >= 9.78 ) { 
		if( X24 >= 0.08 ) { return new Prediction("Right", 25, 0); }
		if( X24 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z15 < 9.78 ) { 
	if( Y31 < -0.12 ) { 
	if( Y3 < -0.12 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y5 < -0.1 ) { return new Prediction("Left", 8, 0); }
	}
	if( Y3 >= -0.12 ) { 
		if( Z21 >= 9.65 ) { return new Prediction("Right", 14, 0); }
	if( Z21 < 9.65 ) { 
		if( X22 < 0.09 ) { return new Prediction("Right", 3, 0); }
		if( X22 >= 0.09 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	if( Y31 >= -0.12 ) { 
	if( Y17 < -0.09 ) { 
	if( Y26 >= -0.12 ) { 
	if( Z26 < 9.79 ) { 
	if( X26 >= 0.11 ) { 
		if( X10 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X10 < 0.11 ) { return new Prediction("Left", 3, 0); }
	}
		if( X26 < 0.11 ) { return new Prediction("Left", 39, 0); }
	}
	if( Z26 >= 9.79 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X10 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Y26 < -0.12 ) { 
		if( X25 < 0.09 ) { return new Prediction("Left", 2, 0); }
	if( X25 >= 0.09 ) { 
		if( X14 < 0.1 ) { return new Prediction("Right", 6, 0); }
		if( X14 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
		if( Y17 >= -0.09 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	}
	if( Z22 >= 9.76 ) { 
	if( Z31 >= 9.8 ) { 
	if( X3 < 0.13 ) { 
		if( X19 >= 0.09 ) { return new Prediction("Right", 108, 0); }
	if( X19 < 0.09 ) { 
		if( X13 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X13 < 0.1 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( X3 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z31 < 9.8 ) { 
		if( Z2 >= 9.59 ) { return new Prediction("Right", 27, 0); }
	if( Z2 < 9.59 ) { 
	if( Z4 < 9.79 ) { 
		if( Y32 < -0.13 ) { return new Prediction("Right", 2, 0); }
		if( Y32 >= -0.13 ) { return new Prediction("Left", 20, 0); }
	}
		if( Z4 >= 9.79 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
	}
	if( X22 >= 0.1 ) { 
	if( Z32 < 9.62 ) { 
	if( Z21 < 9.7 ) { 
		if( X27 >= 0.12 ) { return new Prediction("Right", 1, 0); }
		if( X27 < 0.12 ) { return new Prediction("Left", 60, 0); }
	}
		if( Z21 >= 9.7 ) { return new Prediction("Right", 3, 0); }
	}
	if( Z32 >= 9.62 ) { 
	if( Z30 < 9.76 ) { 
	if( Y31 < -0.11 ) { 
	if( X30 >= 0.1 ) { 
	if( Z28 >= 9.76 ) { 
	if( Y11 < -0.12 ) { 
		if( X3 < 0.11 ) { return new Prediction("Right", 2, 0); }
	if( X3 >= 0.11 ) { 
		if( X14 < 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X14 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y11 >= -0.12 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z28 < 9.76 ) { return new Prediction("Left", 40, 0); }
	}
	if( X30 < 0.1 ) { 
		if( X18 >= 0.11 ) { return new Prediction("Left", 5, 0); }
	if( X18 < 0.11 ) { 
	if( Z5 >= 9.69 ) { 
		if( X13 >= 0.11 ) { return new Prediction("Right", 3, 0); }
		if( X13 < 0.11 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z5 < 9.69 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	if( Y31 >= -0.11 ) { 
		if( X10 < 0.08 ) { return new Prediction("Left", 6, 0); }
	if( X10 >= 0.08 ) { 
	if( Z12 >= 9.78 ) { 
		if( Y14 >= -0.09 ) { return new Prediction("Right", 1, 0); }
		if( Y14 < -0.09 ) { return new Prediction("Left", 12, 0); }
	}
	if( Z12 < 9.78 ) { 
	if( X22 < 0.11 ) { 
	if( X12 >= 0.11 ) { 
		if( X20 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X20 >= 0.1 ) { return new Prediction("Left", 7, 0); }
	}
		if( X12 < 0.11 ) { return new Prediction("Right", 4, 0); }
	}
	if( X22 >= 0.11 ) { 
		if( Z6 >= 9.5 ) { return new Prediction("Right", 32, 0); }
		if( Z6 < 9.5 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
	}
	if( Z30 >= 9.76 ) { 
		if( Y16 >= -0.12 ) { return new Prediction("Right", 15, 0); }
		if( Y16 < -0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree89() {
	if( Z10 < 9.74 ) { 
	if( X14 >= 0.07 ) { 
	if( X3 < 0.11 ) { 
	if( Z31 >= 9.78 ) { 
		if( Z24 < 9.75 ) { return new Prediction("Left", 2, 0); }
		if( Z24 >= 9.75 ) { return new Prediction("Right", 146, 0); }
	}
	if( Z31 < 9.78 ) { 
	if( X9 < 0.08 ) { 
		if( Z2 < 9.71 ) { return new Prediction("Left", 11, 0); }
		if( Z2 >= 9.71 ) { return new Prediction("Right", 1, 0); }
	}
	if( X9 >= 0.08 ) { 
	if( Z3 >= 9.81 ) { 
		if( X4 >= 0.08 ) { return new Prediction("Right", 33, 0); }
		if( X4 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z3 < 9.81 ) { 
	if( Z17 < 9.72 ) { 
		if( Y7 < -0.13 ) { return new Prediction("Right", 3, 0); }
	if( Y7 >= -0.13 ) { 
		if( X31 >= 0.12 ) { return new Prediction("Right", 2, 0); }
	if( X31 < 0.12 ) { 
		if( Y27 < -0.13 ) { return new Prediction("Right", 2, 0); }
	if( Y27 >= -0.13 ) { 
	if( Z5 >= 9.76 ) { 
		if( X26 >= 0.1 ) { return new Prediction("Right", 3, 0); }
	if( X26 < 0.1 ) { 
		if( Y12 < -0.11 ) { return new Prediction("Left", 7, 0); }
		if( Y12 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z5 < 9.76 ) { return new Prediction("Left", 23, 0); }
	}
	}
	}
	}
	if( Z17 >= 9.72 ) { 
		if( X6 >= 0.17 ) { return new Prediction("Left", 3, 0); }
		if( X6 < 0.17 ) { return new Prediction("Right", 18, 0); }
	}
	}
	}
	}
	}
	if( X3 >= 0.11 ) { 
	if( Z8 < 9.86 ) { 
	if( X11 >= 0.11 ) { 
		if( Y13 < -0.09 ) { return new Prediction("Left", 25, 0); }
		if( Y13 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
	if( X11 < 0.11 ) { 
		if( X1 >= 0.12 ) { return new Prediction("Right", 6, 0); }
	if( X1 < 0.12 ) { 
		if( Z19 >= 9.67 ) { return new Prediction("Right", 3, 0); }
		if( Z19 < 9.67 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
		if( Z8 >= 9.86 ) { return new Prediction("Right", 18, 0); }
	}
	}
	if( X14 < 0.07 ) { 
		if( Z12 < 9.58 ) { return new Prediction("Left", 18, 0); }
		if( Z12 >= 9.58 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z10 >= 9.74 ) { 
		if( Z8 < 9.54 ) { return new Prediction("Left", 53, 0); }
	if( Z8 >= 9.54 ) { 
	if( X11 >= 0.09 ) { 
		if( Z24 >= 9.72 ) { return new Prediction("Left", 17, 0); }
	if( Z24 < 9.72 ) { 
		if( Z14 < 9.58 ) { return new Prediction("Right", 13, 0); }
	if( Z14 >= 9.58 ) { 
		if( Z29 >= 9.73 ) { return new Prediction("Left", 29, 0); }
	if( Z29 < 9.73 ) { 
	if( Z27 >= 9.74 ) { 
	if( Y16 >= -0.13 ) { 
	if( X15 < 0.12 ) { 
	if( X17 < 0.1 ) { 
		if( X25 < 0.09 ) { return new Prediction("Left", 4, 0); }
	if( X25 >= 0.09 ) { 
		if( X6 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X6 >= 0.09 ) { return new Prediction("Right", 6, 0); }
	}
	}
		if( X17 >= 0.1 ) { return new Prediction("Left", 13, 0); }
	}
	if( X15 >= 0.12 ) { 
		if( Y11 < -0.11 ) { return new Prediction("Left", 1, 0); }
		if( Y11 >= -0.11 ) { return new Prediction("Right", 4, 0); }
	}
	}
		if( Y16 < -0.13 ) { return new Prediction("Right", 9, 0); }
	}
		if( Z27 < 9.74 ) { return new Prediction("Left", 16, 0); }
	}
	}
	}
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 24, 0); }
	}
	}
return null;
}
private Prediction runTree90() {
	if( Z25 < 9.79 ) { 
	if( Z21 < 9.7 ) { 
	if( X10 < 0.09 ) { 
		if( Z12 >= 9.73 ) { return new Prediction("Left", 58, 0); }
	if( Z12 < 9.73 ) { 
		if( Z17 >= 9.7 ) { return new Prediction("Left", 18, 0); }
	if( Z17 < 9.7 ) { 
		if( Z4 < 9.61 ) { return new Prediction("Left", 2, 0); }
	if( Z4 >= 9.61 ) { 
		if( X2 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X2 >= 0.08 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	}
	if( X10 >= 0.09 ) { 
	if( X4 < 0.12 ) { 
	if( Z11 >= 9.82 ) { 
		if( X10 < 0.12 ) { return new Prediction("Left", 39, 0); }
		if( X10 >= 0.12 ) { return new Prediction("Right", 3, 0); }
	}
	if( Z11 < 9.82 ) { 
	if( Y29 >= -0.12 ) { 
	if( Z30 >= 9.64 ) { 
	if( Z19 >= 9.81 ) { 
	if( Y7 < -0.12 ) { 
		if( Y13 >= -0.12 ) { return new Prediction("Right", 2, 0); }
		if( Y13 < -0.12 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y7 >= -0.12 ) { return new Prediction("Left", 13, 0); }
	}
	if( Z19 < 9.81 ) { 
	if( Z2 < 9.85 ) { 
		if( X13 < 0.09 ) { return new Prediction("Right", 4, 0); }
	if( X13 >= 0.09 ) { 
	if( Y6 >= -0.1 ) { 
		if( Y29 >= -0.1 ) { return new Prediction("Left", 1, 0); }
		if( Y29 < -0.1 ) { return new Prediction("Right", 8, 0); }
	}
	if( Y6 < -0.1 ) { 
		if( Z11 >= 9.8 ) { return new Prediction("Right", 2, 0); }
	if( Z11 < 9.8 ) { 
	if( Z12 >= 9.6 ) { 
		if( Z5 < 9.57 ) { return new Prediction("Right", 1, 0); }
		if( Z5 >= 9.57 ) { return new Prediction("Left", 16, 0); }
	}
		if( Z12 < 9.6 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	}
		if( Z2 >= 9.85 ) { return new Prediction("Right", 24, 0); }
	}
	}
		if( Z30 < 9.64 ) { return new Prediction("Left", 7, 0); }
	}
	if( Y29 < -0.12 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y6 < -0.1 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
		if( X4 >= 0.12 ) { return new Prediction("Left", 22, 0); }
	}
	}
	if( Z21 >= 9.7 ) { 
	if( Z23 >= 9.65 ) { 
		if( Z31 >= 9.81 ) { return new Prediction("Right", 21, 0); }
	if( Z31 < 9.81 ) { 
	if( Z6 < 9.88 ) { 
	if( Y5 < -0.09 ) { 
	if( Y4 < -0.13 ) { 
		if( Y3 < -0.12 ) { return new Prediction("Right", 3, 0); }
		if( Y3 >= -0.12 ) { return new Prediction("Left", 1, 0); }
	}
	if( Y4 >= -0.13 ) { 
	if( Z9 >= 9.67 ) { 
		if( Z4 >= 9.62 ) { return new Prediction("Right", 2, 0); }
		if( Z4 < 9.62 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z9 < 9.67 ) { return new Prediction("Left", 47, 0); }
	}
	}
		if( Y5 >= -0.09 ) { return new Prediction("Right", 5, 0); }
	}
	if( Z6 >= 9.88 ) { 
		if( X7 < 0.15 ) { return new Prediction("Right", 24, 0); }
		if( X7 >= 0.15 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z23 < 9.65 ) { 
	if( X31 < 0.09 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X2 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( X31 >= 0.09 ) { return new Prediction("Right", 30, 0); }
	}
	}
	}
	if( Z25 >= 9.79 ) { 
		if( Z15 >= 9.79 ) { return new Prediction("Right", 116, 0); }
	if( Z15 < 9.79 ) { 
		if( X13 < 0.09 ) { return new Prediction("Left", 12, 0); }
	if( X13 >= 0.09 ) { 
		if( Z10 < 9.75 ) { return new Prediction("Right", 11, 0); }
		if( Z10 >= 9.75 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
return null;
}
private Prediction runTree91() {
	if( Z20 < 9.59 ) { 
	if( Z8 < 9.87 ) { 
	if( Z22 >= 9.79 ) { 
		if( Z31 >= 9.8 ) { return new Prediction("Right", 33, 0); }
	if( Z31 < 9.8 ) { 
		if( X1 < 0.1 ) { return new Prediction("Right", 3, 0); }
		if( X1 >= 0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
	if( Z22 < 9.79 ) { 
	if( X20 < 0.11 ) { 
	if( X10 >= 0.11 ) { 
	if( X19 >= 0.1 ) { 
		if( Y16 >= -0.1 ) { return new Prediction("Left", 2, 0); }
		if( Y16 < -0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( X19 < 0.1 ) { return new Prediction("Left", 8, 0); }
	}
		if( X10 < 0.11 ) { return new Prediction("Left", 22, 0); }
	}
	if( X20 >= 0.11 ) { 
		if( X22 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X22 >= 0.09 ) { return new Prediction("Right", 14, 0); }
	}
	}
	}
	if( Z8 >= 9.87 ) { 
	if( X4 < 0.06 ) { 
		if( Z9 < 9.56 ) { return new Prediction("Right", 1, 0); }
		if( Z9 >= 9.56 ) { return new Prediction("Left", 3, 0); }
	}
		if( X4 >= 0.06 ) { return new Prediction("Right", 115, 0); }
	}
	}
	if( Z20 >= 9.59 ) { 
	if( Z31 < 9.62 ) { 
	if( Z27 < 9.73 ) { 
		if( Z5 < 9.73 ) { return new Prediction("Right", 2, 0); }
		if( Z5 >= 9.73 ) { return new Prediction("Left", 8, 0); }
	}
		if( Z27 >= 9.73 ) { return new Prediction("Left", 80, 0); }
	}
	if( Z31 >= 9.62 ) { 
	if( Y24 < -0.1 ) { 
	if( Y22 < -0.12 ) { 
	if( Z10 < 9.6 ) { 
	if( Y10 >= -0.12 ) { 
		if( X12 >= 0.11 ) { return new Prediction("Left", 2, 0); }
		if( X12 < 0.11 ) { return new Prediction("Right", 3, 0); }
	}
		if( Y10 < -0.12 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z10 >= 9.6 ) { return new Prediction("Left", 26, 0); }
	}
	if( Y22 >= -0.12 ) { 
	if( Z5 < 9.73 ) { 
	if( Z29 >= 9.72 ) { 
		if( X2 >= 0.13 ) { return new Prediction("Left", 2, 0); }
		if( X2 < 0.13 ) { return new Prediction("Right", 26, 0); }
	}
	if( Z29 < 9.72 ) { 
	if( X16 < 0.11 ) { 
	if( Y17 < -0.13 ) { 
		if( Z12 >= 9.71 ) { return new Prediction("Right", 6, 0); }
		if( Z12 < 9.71 ) { return new Prediction("Left", 2, 0); }
	}
	if( Y17 >= -0.13 ) { 
	if( Z6 < 9.75 ) { 
		if( Z1 >= 9.87 ) { return new Prediction("Right", 2, 0); }
	if( Z1 < 9.87 ) { 
		if( Z27 < 9.78 ) { return new Prediction("Left", 42, 0); }
	if( Z27 >= 9.78 ) { 
		if( X12 >= 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X12 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( Z6 >= 9.75 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( X16 >= 0.11 ) { 
		if( Z23 < 9.74 ) { return new Prediction("Right", 7, 0); }
		if( Z23 >= 9.74 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z5 >= 9.73 ) { 
	if( Y3 < -0.1 ) { 
		if( Z4 < 9.9 ) { return new Prediction("Left", 34, 0); }
		if( Z4 >= 9.9 ) { return new Prediction("Right", 1, 0); }
	}
		if( Y3 >= -0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Y24 >= -0.1 ) { 
	if( Z6 < 9.83 ) { 
	if( X31 < 0.09 ) { 
		if( X15 >= 0.09 ) { return new Prediction("Left", 10, 0); }
		if( X15 < 0.09 ) { return new Prediction("Right", 1, 0); }
	}
	if( X31 >= 0.09 ) { 
	if( Y16 >= -0.12 ) { 
	if( Z8 >= 9.62 ) { 
	if( X4 < 0.12 ) { 
		if( X3 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.08 ) { return new Prediction("Right", 4, 0); }
	}
		if( X4 >= 0.12 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z8 < 9.62 ) { return new Prediction("Right", 13, 0); }
	}
		if( Y16 < -0.12 ) { return new Prediction("Left", 5, 0); }
	}
	}
		if( Z6 >= 9.83 ) { return new Prediction("Right", 21, 0); }
	}
	}
	}
return null;
}
private Prediction runTree92() {
	if( Z7 >= 9.91 ) { 
		if( X11 < 0.06 ) { return new Prediction("Left", 1, 0); }
		if( X11 >= 0.06 ) { return new Prediction("Right", 98, 0); }
	}
	if( Z7 < 9.91 ) { 
	if( Z32 < 9.79 ) { 
	if( X10 < 0.09 ) { 
	if( Y32 < -0.11 ) { 
	if( Z28 >= 9.75 ) { 
		if( X17 < 0.1 ) { return new Prediction("Left", 8, 0); }
		if( X17 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z28 < 9.75 ) { return new Prediction("Left", 43, 0); }
	}
	if( Y32 >= -0.11 ) { 
	if( Z22 >= 9.73 ) { 
		if( Y19 < -0.11 ) { return new Prediction("Right", 7, 0); }
		if( Y19 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z22 < 9.73 ) { 
		if( Z23 < 9.61 ) { return new Prediction("Right", 2, 0); }
		if( Z23 >= 9.61 ) { return new Prediction("Left", 37, 0); }
	}
	}
	}
	if( X10 >= 0.09 ) { 
	if( Z21 >= 9.69 ) { 
	if( Z32 < 9.74 ) { 
	if( Z18 < 9.84 ) { 
	if( Y29 < -0.11 ) { 
		if( Z8 < 9.75 ) { return new Prediction("Right", 42, 0); }
	if( Z8 >= 9.75 ) { 
		if( X10 < 0.13 ) { return new Prediction("Right", 7, 0); }
		if( X10 >= 0.13 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y29 >= -0.11 ) { 
		if( Y32 >= -0.1 ) { return new Prediction("Right", 10, 0); }
	if( Y32 < -0.1 ) { 
	if( Z5 < 9.73 ) { 
		if( X23 >= 0.1 ) { return new Prediction("Right", 6, 0); }
		if( X23 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z5 >= 9.73 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
		if( Z18 >= 9.84 ) { return new Prediction("Left", 3, 0); }
	}
	if( Z32 >= 9.74 ) { 
	if( Z32 >= 9.77 ) { 
		if( Y9 < -0.12 ) { return new Prediction("Left", 6, 0); }
	if( Y9 >= -0.12 ) { 
		if( Z24 < 9.77 ) { return new Prediction("Left", 3, 0); }
		if( Z24 >= 9.77 ) { return new Prediction("Right", 19, 0); }
	}
	}
	if( Z32 < 9.77 ) { 
		if( X17 < 0.11 ) { return new Prediction("Left", 20, 0); }
	if( X17 >= 0.11 ) { 
	if( X15 < 0.11 ) { 
		if( Y13 >= -0.11 ) { return new Prediction("Left", 1, 0); }
		if( Y13 < -0.11 ) { return new Prediction("Right", 3, 0); }
	}
		if( X15 >= 0.11 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
	}
	if( Z21 < 9.69 ) { 
	if( Z13 < 9.75 ) { 
	if( Z1 >= 9.86 ) { 
		if( Z23 < 9.61 ) { return new Prediction("Left", 2, 0); }
		if( Z23 >= 9.61 ) { return new Prediction("Right", 19, 0); }
	}
	if( Z1 < 9.86 ) { 
	if( Z32 < 9.78 ) { 
	if( Z20 >= 9.75 ) { 
		if( Y12 < -0.12 ) { return new Prediction("Left", 7, 0); }
	if( Y12 >= -0.12 ) { 
	if( Z7 < 9.59 ) { 
		if( Y4 < -0.13 ) { return new Prediction("Right", 1, 0); }
		if( Y4 >= -0.13 ) { return new Prediction("Left", 6, 0); }
	}
		if( Z7 >= 9.59 ) { return new Prediction("Right", 8, 0); }
	}
	}
		if( Z20 < 9.75 ) { return new Prediction("Left", 26, 0); }
	}
		if( Z32 >= 9.78 ) { return new Prediction("Right", 3, 0); }
	}
	}
		if( Z13 >= 9.75 ) { return new Prediction("Left", 53, 0); }
	}
	}
	}
	if( Z32 >= 9.79 ) { 
		if( Y13 >= -0.13 ) { return new Prediction("Right", 48, 0); }
	if( Y13 < -0.13 ) { 
		if( Z16 < 9.67 ) { return new Prediction("Left", 5, 0); }
		if( Z16 >= 9.67 ) { return new Prediction("Right", 13, 0); }
	}
	}
	}
return null;
}
private Prediction runTree93() {
	if( Z32 < 9.79 ) { 
	if( Z22 >= 9.71 ) { 
	if( Z8 >= 9.67 ) { 
		if( X12 < 0.09 ) { return new Prediction("Left", 26, 0); }
	if( X12 >= 0.09 ) { 
		if( Z19 < 9.54 ) { return new Prediction("Right", 22, 0); }
	if( Z19 >= 9.54 ) { 
	if( X6 < 0.12 ) { 
		if( Y22 < -0.13 ) { return new Prediction("Left", 7, 0); }
	if( Y22 >= -0.13 ) { 
		if( Z32 < 9.67 ) { return new Prediction("Right", 6, 0); }
	if( Z32 >= 9.67 ) { 
	if( Y31 < -0.11 ) { 
	if( Z10 < 9.67 ) { 
		if( Z24 >= 9.78 ) { return new Prediction("Right", 1, 0); }
		if( Z24 < 9.78 ) { return new Prediction("Left", 12, 0); }
	}
		if( Z10 >= 9.67 ) { return new Prediction("Right", 5, 0); }
	}
	if( Y31 >= -0.11 ) { 
		if( Y11 < -0.13 ) { return new Prediction("Left", 1, 0); }
		if( Y11 >= -0.13 ) { return new Prediction("Right", 9, 0); }
	}
	}
	}
	}
		if( X6 >= 0.12 ) { return new Prediction("Left", 17, 0); }
	}
	}
	}
	if( Z8 < 9.67 ) { 
		if( Z17 < 9.67 ) { return new Prediction("Right", 51, 0); }
	if( Z17 >= 9.67 ) { 
		if( X6 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X6 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
	if( Z22 < 9.71 ) { 
	if( X9 < 0.09 ) { 
	if( Z15 >= 9.57 ) { 
	if( Y9 < -0.13 ) { 
	if( Y27 < -0.12 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y5 < -0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y27 >= -0.12 ) { return new Prediction("Left", 10, 0); }
	}
		if( Y9 >= -0.13 ) { return new Prediction("Left", 21, 0); }
	}
		if( Z15 < 9.57 ) { return new Prediction("Left", 55, 0); }
	}
	if( X9 >= 0.09 ) { 
	if( X16 >= 0.1 ) { 
	if( Z5 < 9.73 ) { 
		if( Y3 < -0.12 ) { return new Prediction("Right", 5, 0); }
	if( Y3 >= -0.12 ) { 
	if( Y29 >= -0.1 ) { 
		if( X5 < 0.11 ) { return new Prediction("Right", 2, 0); }
		if( X5 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	if( Y29 < -0.1 ) { 
		if( X27 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X27 >= 0.08 ) { return new Prediction("Left", 16, 0); }
	}
	}
	}
		if( Z5 >= 9.73 ) { return new Prediction("Left", 39, 0); }
	}
	if( X16 < 0.1 ) { 
	if( Z9 >= 9.7 ) { 
	if( Z13 < 9.77 ) { 
		if( Z11 < 9.7 ) { return new Prediction("Left", 11, 0); }
	if( Z11 >= 9.7 ) { 
	if( Z13 >= 9.67 ) { 
	if( Y10 < -0.09 ) { 
	if( Y22 < -0.11 ) { 
		if( X3 >= 0.09 ) { return new Prediction("Right", 7, 0); }
		if( X3 < 0.09 ) { return new Prediction("Left", 2, 0); }
	}
		if( Y22 >= -0.11 ) { return new Prediction("Right", 25, 0); }
	}
		if( Y10 >= -0.09 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z13 < 9.67 ) { 
		if( Y6 >= -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y6 < -0.11 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
		if( Z13 >= 9.77 ) { return new Prediction("Left", 12, 0); }
	}
		if( Z9 < 9.7 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
	}
	if( Z32 >= 9.79 ) { 
	if( Z4 < 9.59 ) { 
	if( X24 >= 0.12 ) { 
		if( X3 < 0.1 ) { return new Prediction("Right", 2, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Left", 3, 0); }
	}
	if( X24 < 0.12 ) { 
		if( Y29 < -0.14 ) { return new Prediction("Left", 2, 0); }
	if( Y29 >= -0.14 ) { 
		if( Z30 < 9.61 ) { return new Prediction("Left", 1, 0); }
	if( Z30 >= 9.61 ) { 
	if( Z4 >= 9.57 ) { 
		if( X6 < 0.11 ) { return new Prediction("Right", 8, 0); }
		if( X6 >= 0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z4 < 9.57 ) { return new Prediction("Right", 31, 0); }
	}
	}
	}
	}
		if( Z4 >= 9.59 ) { return new Prediction("Right", 86, 0); }
	}
return null;
}
private Prediction runTree94() {
	if( Z25 < 9.79 ) { 
	if( Z22 >= 9.71 ) { 
	if( X25 < 0.1 ) { 
	if( Z1 >= 9.72 ) { 
		if( X1 < 0.14 ) { return new Prediction("Right", 3, 0); }
		if( X1 >= 0.14 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z1 < 9.72 ) { 
		if( Y18 >= -0.13 ) { return new Prediction("Left", 48, 0); }
		if( Y18 < -0.13 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( X25 >= 0.1 ) { 
	if( Z16 >= 9.77 ) { 
	if( X4 < 0.11 ) { 
		if( Y18 < -0.1 ) { return new Prediction("Right", 8, 0); }
		if( Y18 >= -0.1 ) { return new Prediction("Left", 2, 0); }
	}
		if( X4 >= 0.11 ) { return new Prediction("Left", 12, 0); }
	}
	if( Z16 < 9.77 ) { 
		if( Y6 >= -0.1 ) { return new Prediction("Right", 35, 0); }
	if( Y6 < -0.1 ) { 
	if( Z16 >= 9.57 ) { 
	if( Z4 < 9.72 ) { 
		if( X3 < 0.1 ) { return new Prediction("Right", 4, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Left", 11, 0); }
	}
	if( Z4 >= 9.72 ) { 
		if( Y6 < -0.15 ) { return new Prediction("Left", 2, 0); }
	if( Y6 >= -0.15 ) { 
		if( Z26 < 9.64 ) { return new Prediction("Right", 19, 0); }
	if( Z26 >= 9.64 ) { 
		if( Z12 >= 9.85 ) { return new Prediction("Left", 2, 0); }
	if( Z12 < 9.85 ) { 
		if( X22 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X22 >= 0.1 ) { return new Prediction("Right", 7, 0); }
	}
	}
	}
	}
	}
		if( Z16 < 9.57 ) { return new Prediction("Right", 17, 0); }
	}
	}
	}
	}
	if( Z22 < 9.71 ) { 
	if( Y6 >= -0.1 ) { 
	if( Z18 >= 9.69 ) { 
	if( X16 >= 0.1 ) { 
		if( Y23 >= -0.1 ) { return new Prediction("Left", 1, 0); }
		if( Y23 < -0.1 ) { return new Prediction("Right", 5, 0); }
	}
	if( X16 < 0.1 ) { 
		if( Y20 >= -0.11 ) { return new Prediction("Left", 17, 0); }
	if( Y20 < -0.11 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 6, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 3, 0); }
	}
	}
	}
	if( Z18 < 9.69 ) { 
		if( X4 >= 0.09 ) { return new Prediction("Right", 9, 0); }
		if( X4 < 0.09 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Y6 < -0.1 ) { 
		if( Z22 < 9.6 ) { return new Prediction("Right", 6, 0); }
	if( Z22 >= 9.6 ) { 
	if( Z6 < 9.67 ) { 
		if( X14 >= 0.11 ) { return new Prediction("Left", 18, 0); }
	if( X14 < 0.11 ) { 
	if( X11 >= 0.09 ) { 
		if( Z21 >= 9.69 ) { return new Prediction("Right", 4, 0); }
	if( Z21 < 9.69 ) { 
	if( Z12 >= 9.71 ) { 
	if( Z20 >= 9.8 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Left", 9, 0); }
	if( X21 < 0.11 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 2, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	}
	if( Z20 < 9.8 ) { 
		if( Z8 >= 9.7 ) { return new Prediction("Left", 1, 0); }
		if( Z8 < 9.7 ) { return new Prediction("Right", 7, 0); }
	}
	}
		if( Z12 < 9.71 ) { return new Prediction("Left", 25, 0); }
	}
	}
		if( X11 < 0.09 ) { return new Prediction("Left", 19, 0); }
	}
	}
		if( Z6 >= 9.67 ) { return new Prediction("Left", 69, 0); }
	}
	}
	}
	}
	if( Z25 >= 9.79 ) { 
	if( Z10 < 9.78 ) { 
	if( X10 < 0.08 ) { 
	if( Z13 >= 9.54 ) { 
	if( Z15 < 9.83 ) { 
		if( X1 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X1 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( Z15 >= 9.83 ) { return new Prediction("Right", 15, 0); }
	}
		if( Z13 < 9.54 ) { return new Prediction("Left", 7, 0); }
	}
		if( X10 >= 0.08 ) { return new Prediction("Right", 114, 0); }
	}
		if( Z10 >= 9.78 ) { return new Prediction("Left", 9, 0); }
	}
return null;
}
private Prediction runTree95() {
	if( Z31 >= 9.79 ) { 
		if( Y25 < -0.14 ) { return new Prediction("Left", 1, 0); }
	if( Y25 >= -0.14 ) { 
		if( Y25 < -0.1 ) { return new Prediction("Right", 123, 0); }
	if( Y25 >= -0.1 ) { 
		if( Y28 >= -0.12 ) { return new Prediction("Right", 23, 0); }
	if( Y28 < -0.12 ) { 
		if( X9 < 0.09 ) { return new Prediction("Right", 2, 0); }
		if( X9 >= 0.09 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z31 < 9.79 ) { 
	if( Z8 >= 9.52 ) { 
	if( Z16 < 9.58 ) { 
		if( X1 < 0.08 ) { return new Prediction("Left", 2, 0); }
		if( X1 >= 0.08 ) { return new Prediction("Right", 27, 0); }
	}
	if( Z16 >= 9.58 ) { 
	if( Y16 < -0.14 ) { 
	if( X7 < 0.15 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Right", 13, 0); }
	}
		if( X7 >= 0.15 ) { return new Prediction("Left", 4, 0); }
	}
	if( Y16 >= -0.14 ) { 
	if( X3 < 0.12 ) { 
	if( X8 >= 0.08 ) { 
	if( Z27 < 9.72 ) { 
	if( Z29 < 9.66 ) { 
	if( Z6 >= 9.59 ) { 
		if( X19 >= 0.1 ) { return new Prediction("Right", 26, 0); }
		if( X19 < 0.1 ) { return new Prediction("Left", 1, 0); }
	}
		if( Z6 < 9.59 ) { return new Prediction("Left", 2, 0); }
	}
	if( Z29 >= 9.66 ) { 
	if( Z15 >= 9.72 ) { 
	if( Y17 < -0.1 ) { 
		if( Z29 >= 9.69 ) { return new Prediction("Left", 14, 0); }
	if( Z29 < 9.69 ) { 
	if( Z31 < 9.77 ) { 
		if( Z13 >= 9.64 ) { return new Prediction("Right", 3, 0); }
		if( Z13 < 9.64 ) { return new Prediction("Left", 4, 0); }
	}
		if( Z31 >= 9.77 ) { return new Prediction("Right", 7, 0); }
	}
	}
		if( Y17 >= -0.1 ) { return new Prediction("Left", 13, 0); }
	}
	if( Z15 < 9.72 ) { 
		if( Z25 < 9.7 ) { return new Prediction("Right", 17, 0); }
		if( Z25 >= 9.7 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	if( Z27 >= 9.72 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 54, 0); }
	if( Z13 < 9.78 ) { 
	if( Y27 < -0.11 ) { 
	if( Y24 < -0.11 ) { 
	if( Z20 >= 9.76 ) { 
	if( Z31 < 9.63 ) { 
		if( X26 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X26 < 0.11 ) { return new Prediction("Left", 7, 0); }
	}
	if( Z31 >= 9.63 ) { 
		if( X9 < 0.08 ) { return new Prediction("Left", 1, 0); }
		if( X9 >= 0.08 ) { return new Prediction("Right", 15, 0); }
	}
	}
	if( Z20 < 9.76 ) { 
		if( Y5 < -0.09 ) { return new Prediction("Left", 14, 0); }
		if( Y5 >= -0.09 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Y24 >= -0.11 ) { return new Prediction("Right", 12, 0); }
	}
	if( Y27 >= -0.11 ) { 
	if( Z9 >= 9.79 ) { 
		if( X3 < 0.11 ) { return new Prediction("Right", 4, 0); }
		if( X3 >= 0.11 ) { return new Prediction("Left", 2, 0); }
	}
		if( Z9 < 9.79 ) { return new Prediction("Left", 19, 0); }
	}
	}
	}
	}
		if( X8 < 0.08 ) { return new Prediction("Left", 21, 0); }
	}
		if( X3 >= 0.12 ) { return new Prediction("Left", 39, 0); }
	}
	}
	}
		if( Z8 < 9.52 ) { return new Prediction("Left", 46, 0); }
	}
return null;
}
private Prediction runTree96() {
	if( X17 < 0.11 ) { 
	if( Z10 >= 9.73 ) { 
	if( Z7 < 9.59 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 79, 0); }
	if( X10 >= 0.09 ) { 
		if( Y18 >= -0.13 ) { return new Prediction("Left", 10, 0); }
	if( Y18 < -0.13 ) { 
		if( Z29 < 9.74 ) { return new Prediction("Right", 4, 0); }
		if( Z29 >= 9.74 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	if( Z7 >= 9.59 ) { 
	if( Z5 < 9.73 ) { 
	if( Z16 < 9.8 ) { 
	if( Y27 < -0.12 ) { 
		if( X17 >= 0.08 ) { return new Prediction("Right", 20, 0); }
		if( X17 < 0.08 ) { return new Prediction("Left", 3, 0); }
	}
	if( Y27 >= -0.12 ) { 
		if( Z1 >= 9.82 ) { return new Prediction("Right", 8, 0); }
	if( Z1 < 9.82 ) { 
		if( X22 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X22 >= 0.09 ) { return new Prediction("Left", 12, 0); }
	}
	}
	}
	if( Z16 >= 9.8 ) { 
		if( X12 < 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X12 >= 0.09 ) { return new Prediction("Left", 16, 0); }
	}
	}
		if( Z5 >= 9.73 ) { return new Prediction("Left", 33, 0); }
	}
	}
	if( Z10 < 9.73 ) { 
	if( Z15 >= 9.87 ) { 
	if( X7 >= 0.12 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Left", 1, 0); }
		if( Y4 >= -0.11 ) { return new Prediction("Right", 1, 0); }
	}
		if( X7 < 0.12 ) { return new Prediction("Right", 47, 0); }
	}
	if( Z15 < 9.87 ) { 
		if( X15 < 0.07 ) { return new Prediction("Left", 14, 0); }
	if( X15 >= 0.07 ) { 
	if( Z7 >= 9.67 ) { 
	if( Z10 < 9.67 ) { 
	if( X11 >= 0.11 ) { 
		if( X16 >= 0.1 ) { return new Prediction("Left", 15, 0); }
		if( X16 < 0.1 ) { return new Prediction("Right", 1, 0); }
	}
	if( X11 < 0.11 ) { 
	if( Z23 >= 9.79 ) { 
		if( X4 >= 0.08 ) { return new Prediction("Right", 15, 0); }
		if( X4 < 0.08 ) { return new Prediction("Left", 1, 0); }
	}
	if( Z23 < 9.79 ) { 
		if( Z7 >= 9.84 ) { return new Prediction("Right", 7, 0); }
	if( Z7 < 9.84 ) { 
		if( Y4 < -0.14 ) { return new Prediction("Right", 1, 0); }
		if( Y4 >= -0.14 ) { return new Prediction("Left", 24, 0); }
	}
	}
	}
	}
	if( Z10 >= 9.67 ) { 
		if( X8 < 0.06 ) { return new Prediction("Left", 1, 0); }
		if( X8 >= 0.06 ) { return new Prediction("Right", 15, 0); }
	}
	}
	if( Z7 < 9.67 ) { 
		if( Z21 < 9.66 ) { return new Prediction("Left", 2, 0); }
	if( Z21 >= 9.66 ) { 
		if( Z13 < 9.86 ) { return new Prediction("Right", 40, 0); }
	if( Z13 >= 9.86 ) { 
		if( X8 >= 0.12 ) { return new Prediction("Right", 2, 0); }
		if( X8 < 0.12 ) { return new Prediction("Left", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( X17 >= 0.11 ) { 
	if( Z23 >= 9.72 ) { 
		if( X14 < 0.12 ) { return new Prediction("Right", 69, 0); }
	if( X14 >= 0.12 ) { 
	if( Y20 >= -0.12 ) { 
	if( Y28 >= -0.1 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X30 < 0.1 ) { return new Prediction("Right", 3, 0); }
	}
		if( Y28 < -0.1 ) { return new Prediction("Right", 27, 0); }
	}
	if( Y20 < -0.12 ) { 
		if( Y32 >= -0.1 ) { return new Prediction("Right", 1, 0); }
		if( Y32 < -0.1 ) { return new Prediction("Left", 5, 0); }
	}
	}
	}
	if( Z23 < 9.72 ) { 
	if( Y10 >= -0.11 ) { 
		if( X10 < 0.1 ) { return new Prediction("Left", 1, 0); }
	if( X10 >= 0.1 ) { 
		if( X22 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X22 >= 0.09 ) { return new Prediction("Right", 9, 0); }
	}
	}
	if( Y10 < -0.11 ) { 
		if( Y5 >= -0.11 ) { return new Prediction("Left", 12, 0); }
	if( Y5 < -0.11 ) { 
		if( Y30 >= -0.1 ) { return new Prediction("Right", 4, 0); }
	if( Y30 < -0.1 ) { 
	if( Y10 >= -0.12 ) { 
		if( Y29 < -0.11 ) { return new Prediction("Right", 3, 0); }
		if( Y29 >= -0.11 ) { return new Prediction("Left", 1, 0); }
	}
		if( Y10 < -0.12 ) { return new Prediction("Left", 8, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree97() {
	if( Z22 < 9.7 ) { 
		if( Z13 >= 9.78 ) { return new Prediction("Left", 84, 0); }
	if( Z13 < 9.78 ) { 
	if( Z1 < 9.88 ) { 
	if( X4 >= 0.09 ) { 
	if( Z27 < 9.8 ) { 
	if( Z25 < 9.67 ) { 
	if( Y12 < -0.1 ) { 
		if( Z15 < 9.59 ) { return new Prediction("Left", 8, 0); }
	if( Z15 >= 9.59 ) { 
		if( Y5 >= -0.1 ) { return new Prediction("Right", 5, 0); }
	if( Y5 < -0.1 ) { 
	if( Z14 < 9.63 ) { 
		if( Y7 < -0.12 ) { return new Prediction("Right", 1, 0); }
		if( Y7 >= -0.12 ) { return new Prediction("Left", 8, 0); }
	}
		if( Z14 >= 9.63 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
		if( Y12 >= -0.1 ) { return new Prediction("Right", 6, 0); }
	}
	if( Z25 >= 9.67 ) { 
		if( Z5 >= 9.77 ) { return new Prediction("Right", 3, 0); }
	if( Z5 < 9.77 ) { 
	if( Y3 >= -0.14 ) { 
	if( Y22 >= -0.14 ) { 
	if( X12 < 0.09 ) { 
		if( X13 < 0.09 ) { return new Prediction("Left", 5, 0); }
		if( X13 >= 0.09 ) { return new Prediction("Right", 1, 0); }
	}
		if( X12 >= 0.09 ) { return new Prediction("Left", 52, 0); }
	}
	if( Y22 < -0.14 ) { 
		if( X2 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X2 < 0.11 ) { return new Prediction("Left", 1, 0); }
	}
	}
		if( Y3 < -0.14 ) { return new Prediction("Right", 1, 0); }
	}
	}
	}
		if( Z27 >= 9.8 ) { return new Prediction("Right", 6, 0); }
	}
		if( X4 < 0.09 ) { return new Prediction("Left", 34, 0); }
	}
	if( Z1 >= 9.88 ) { 
		if( Y23 >= -0.12 ) { return new Prediction("Right", 15, 0); }
	if( Y23 < -0.12 ) { 
		if( X10 < 0.08 ) { return new Prediction("Right", 1, 0); }
		if( X10 >= 0.08 ) { return new Prediction("Left", 4, 0); }
	}
	}
	}
	}
	if( Z22 >= 9.7 ) { 
		if( X21 >= 0.11 ) { return new Prediction("Right", 31, 0); }
	if( X21 < 0.11 ) { 
	if( Y15 >= -0.13 ) { 
	if( Z13 >= 9.54 ) { 
	if( Z32 >= 9.8 ) { 
		if( Y6 >= -0.13 ) { return new Prediction("Right", 59, 0); }
	if( Y6 < -0.13 ) { 
		if( X2 >= 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X2 < 0.12 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Z32 < 9.8 ) { 
	if( X13 >= 0.12 ) { 
		if( X7 >= 0.11 ) { return new Prediction("Left", 22, 0); }
		if( X7 < 0.11 ) { return new Prediction("Right", 1, 0); }
	}
	if( X13 < 0.12 ) { 
	if( Z4 < 9.79 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 9, 0); }
	if( X10 >= 0.09 ) { 
	if( Y7 >= -0.11 ) { 
		if( X26 >= 0.1 ) { return new Prediction("Right", 15, 0); }
	if( X26 < 0.1 ) { 
		if( X7 >= 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X7 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	if( Y7 < -0.11 ) { 
	if( Z14 < 9.83 ) { 
		if( Z26 < 9.64 ) { return new Prediction("Left", 10, 0); }
	if( Z26 >= 9.64 ) { 
		if( X13 >= 0.11 ) { return new Prediction("Left", 3, 0); }
	if( X13 < 0.11 ) { 
		if( X12 < 0.09 ) { return new Prediction("Left", 1, 0); }
	if( X12 >= 0.09 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 12, 0); }
	}
	}
	}
	}
		if( Z14 >= 9.83 ) { return new Prediction("Right", 6, 0); }
	}
	}
	}
	if( Z4 >= 9.79 ) { 
		if( X26 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X26 >= 0.09 ) { return new Prediction("Right", 31, 0); }
	}
	}
	}
	}
		if( Z13 < 9.54 ) { return new Prediction("Left", 17, 0); }
	}
	if( Y15 < -0.13 ) { 
	if( Z17 < 9.67 ) { 
		if( X2 < 0.09 ) { return new Prediction("Left", 3, 0); }
		if( X2 >= 0.09 ) { return new Prediction("Right", 2, 0); }
	}
		if( Z17 >= 9.67 ) { return new Prediction("Right", 55, 0); }
	}
	}
	}
return null;
}
private Prediction runTree98() {
	if( Z17 < 9.72 ) { 
	if( Z9 < 9.74 ) { 
	if( Z1 >= 9.6 ) { 
	if( Z15 < 9.64 ) { 
		if( X1 < 0.08 ) { return new Prediction("Left", 7, 0); }
	if( X1 >= 0.08 ) { 
	if( Z7 >= 9.56 ) { 
		if( Y29 >= -0.12 ) { return new Prediction("Left", 13, 0); }
		if( Y29 < -0.12 ) { return new Prediction("Right", 5, 0); }
	}
		if( Z7 < 9.56 ) { return new Prediction("Right", 13, 0); }
	}
	}
	if( Z15 >= 9.64 ) { 
	if( Y10 < -0.07 ) { 
		if( Z5 < 9.66 ) { return new Prediction("Left", 1, 0); }
		if( Z5 >= 9.66 ) { return new Prediction("Right", 41, 0); }
	}
		if( Y10 >= -0.07 ) { return new Prediction("Left", 1, 0); }
	}
	}
	if( Z1 < 9.6 ) { 
		if( Z31 < 9.77 ) { return new Prediction("Left", 33, 0); }
	if( Z31 >= 9.77 ) { 
		if( Z14 < 9.82 ) { return new Prediction("Left", 17, 0); }
	if( Z14 >= 9.82 ) { 
		if( Y32 < -0.12 ) { return new Prediction("Right", 21, 0); }
	if( Y32 >= -0.12 ) { 
	if( Z25 < 9.78 ) { 
		if( Y3 >= -0.11 ) { return new Prediction("Right", 1, 0); }
		if( Y3 < -0.11 ) { return new Prediction("Left", 5, 0); }
	}
		if( Z25 >= 9.78 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
	}
	}
	if( Z9 >= 9.74 ) { 
	if( Z32 < 9.78 ) { 
		if( X6 < 0.1 ) { return new Prediction("Left", 72, 0); }
	if( X6 >= 0.1 ) { 
	if( Z18 >= 9.68 ) { 
		if( Z20 < 9.78 ) { return new Prediction("Right", 8, 0); }
	if( Z20 >= 9.78 ) { 
	if( Y3 >= -0.11 ) { 
		if( X3 < 0.1 ) { return new Prediction("Left", 1, 0); }
		if( X3 >= 0.1 ) { return new Prediction("Right", 2, 0); }
	}
		if( Y3 < -0.11 ) { return new Prediction("Left", 21, 0); }
	}
	}
		if( Z18 < 9.68 ) { return new Prediction("Left", 38, 0); }
	}
	}
		if( Z32 >= 9.78 ) { return new Prediction("Right", 5, 0); }
	}
	}
	if( Z17 >= 9.72 ) { 
	if( Z23 < 9.69 ) { 
	if( Z24 < 9.68 ) { 
		if( Z21 < 9.66 ) { return new Prediction("Left", 24, 0); }
	if( Z21 >= 9.66 ) { 
		if( Y8 >= -0.11 ) { return new Prediction("Left", 4, 0); }
		if( Y8 < -0.11 ) { return new Prediction("Right", 3, 0); }
	}
	}
	if( Z24 >= 9.68 ) { 
		if( Y30 >= -0.1 ) { return new Prediction("Right", 8, 0); }
	if( Y30 < -0.1 ) { 
		if( X18 < 0.09 ) { return new Prediction("Left", 8, 0); }
	if( X18 >= 0.09 ) { 
		if( Y26 >= -0.11 ) { return new Prediction("Right", 5, 0); }
		if( Y26 < -0.11 ) { return new Prediction("Left", 3, 0); }
	}
	}
	}
	}
	if( Z23 >= 9.69 ) { 
	if( Z17 < 9.78 ) { 
	if( X10 < 0.08 ) { 
	if( Z26 >= 9.6 ) { 
		if( X5 >= 0.09 ) { return new Prediction("Right", 1, 0); }
		if( X5 < 0.09 ) { return new Prediction("Left", 9, 0); }
	}
		if( Z26 < 9.6 ) { return new Prediction("Right", 12, 0); }
	}
		if( X10 >= 0.08 ) { return new Prediction("Right", 107, 0); }
	}
	if( Z17 >= 9.78 ) { 
		if( Z6 < 9.57 ) { return new Prediction("Right", 8, 0); }
	if( Z6 >= 9.57 ) { 
	if( Y10 >= -0.11 ) { 
		if( Y4 < -0.11 ) { return new Prediction("Right", 5, 0); }
	if( Y4 >= -0.11 ) { 
		if( X14 >= 0.11 ) { return new Prediction("Right", 1, 0); }
		if( X14 < 0.11 ) { return new Prediction("Left", 6, 0); }
	}
	}
		if( Y10 < -0.11 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree99() {
	if( Z24 >= 9.78 ) { 
	if( Z22 >= 9.72 ) { 
	if( Z7 < 9.78 ) { 
		if( X16 < 0.12 ) { return new Prediction("Right", 16, 0); }
	if( X16 >= 0.12 ) { 
		if( X25 < 0.12 ) { return new Prediction("Left", 1, 0); }
		if( X25 >= 0.12 ) { return new Prediction("Right", 1, 0); }
	}
	}
		if( Z7 >= 9.78 ) { return new Prediction("Right", 146, 0); }
	}
	if( Z22 < 9.72 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 14, 0); }
	if( X10 >= 0.09 ) { 
		if( X17 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X17 >= 0.09 ) { return new Prediction("Right", 16, 0); }
	}
	}
	}
	if( Z24 < 9.78 ) { 
	if( Z29 >= 9.76 ) { 
		if( Z21 < 9.71 ) { return new Prediction("Left", 14, 0); }
	if( Z21 >= 9.71 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Right", 20, 0); }
	if( X30 < 0.1 ) { 
		if( Z20 < 9.72 ) { return new Prediction("Left", 3, 0); }
	if( Z20 >= 9.72 ) { 
		if( X32 < 0.09 ) { return new Prediction("Left", 1, 0); }
		if( X32 >= 0.09 ) { return new Prediction("Right", 14, 0); }
	}
	}
	}
	}
	if( Z29 < 9.76 ) { 
	if( Z12 < 9.8 ) { 
	if( Z8 >= 9.66 ) { 
		if( Y2 >= -0.09 ) { return new Prediction("Right", 2, 0); }
	if( Y2 < -0.09 ) { 
	if( X23 < 0.11 ) { 
		if( Y6 >= -0.13 ) { return new Prediction("Left", 76, 0); }
		if( Y6 < -0.13 ) { return new Prediction("Right", 1, 0); }
	}
	if( X23 >= 0.11 ) { 
		if( X30 >= 0.1 ) { return new Prediction("Left", 4, 0); }
		if( X30 < 0.1 ) { return new Prediction("Right", 2, 0); }
	}
	}
	}
	if( Z8 < 9.66 ) { 
		if( Z7 < 9.53 ) { return new Prediction("Left", 33, 0); }
	if( Z7 >= 9.53 ) { 
	if( Z2 >= 9.8 ) { 
	if( Z23 < 9.69 ) { 
		if( Z4 >= 9.87 ) { return new Prediction("Right", 9, 0); }
	if( Z4 < 9.87 ) { 
	if( X3 >= 0.09 ) { 
	if( Z3 < 9.85 ) { 
		if( X10 < 0.09 ) { return new Prediction("Left", 7, 0); }
	if( X10 >= 0.09 ) { 
		if( X32 < 0.1 ) { return new Prediction("Right", 9, 0); }
	if( X32 >= 0.1 ) { 
		if( X5 >= 0.1 ) { return new Prediction("Left", 5, 0); }
		if( X5 < 0.1 ) { return new Prediction("Right", 5, 0); }
	}
	}
	}
		if( Z3 >= 9.85 ) { return new Prediction("Right", 11, 0); }
	}
	if( X3 < 0.09 ) { 
		if( Z4 >= 9.74 ) { return new Prediction("Left", 8, 0); }
	if( Z4 < 9.74 ) { 
		if( X14 < 0.1 ) { return new Prediction("Right", 1, 0); }
		if( X14 >= 0.1 ) { return new Prediction("Left", 1, 0); }
	}
	}
	}
	}
		if( Z23 >= 9.69 ) { return new Prediction("Right", 22, 0); }
	}
		if( Z2 < 9.8 ) { return new Prediction("Left", 9, 0); }
	}
	}
	}
		if( Z12 >= 9.8 ) { return new Prediction("Left", 71, 0); }
	}
	}
return null;
}
}

