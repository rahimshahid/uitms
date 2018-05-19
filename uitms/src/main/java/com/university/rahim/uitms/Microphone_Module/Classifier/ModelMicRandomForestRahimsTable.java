package com.university.rahim.uitms.Microphone_Module.Classifier;

import com.university.rahim.uitms.Microphone_Module.Classifier.RandomForest;
import java.util.List;

public class ModelMicRandomForestRahimsTable extends RandomForest {

public double MAX_AMP_LEFT;
public double DX2_DELTA;
public double MAX_AMP_RIGHT;
public double AVG_AMP_LEFT;
public double MAX_DX2_RIGHT;
public double AVG_AMP_RIGHT;
public double DETECTION_DELTA;
public double FIRST_RIGHT_DETECTION;
public double MAX_DX2_LEFT;
public double AMP_DELTA;
public double AVG_DX2_LEFT;
public double AVG_DX2_RIGHT;
public double FIRST_LEFT_DETECTION;

public String toString() {
StringBuilder b = new StringBuilder();
b.append("MyClass: ");
b.append(MyClass);
b.append(", MAX_AMP_LEFT: ");
b.append(MAX_AMP_LEFT);
b.append(", DX2_DELTA: ");
b.append(DX2_DELTA);
b.append(", MAX_AMP_RIGHT: ");
b.append(MAX_AMP_RIGHT);
b.append(", AVG_AMP_LEFT: ");
b.append(AVG_AMP_LEFT);
b.append(", MAX_DX2_RIGHT: ");
b.append(MAX_DX2_RIGHT);
b.append(", AVG_AMP_RIGHT: ");
b.append(AVG_AMP_RIGHT);
b.append(", DETECTION_DELTA: ");
b.append(DETECTION_DELTA);
b.append(", FIRST_RIGHT_DETECTION: ");
b.append(FIRST_RIGHT_DETECTION);
b.append(", MAX_DX2_LEFT: ");
b.append(MAX_DX2_LEFT);
b.append(", AMP_DELTA: ");
b.append(AMP_DELTA);
b.append(", AVG_DX2_LEFT: ");
b.append(AVG_DX2_LEFT);
b.append(", AVG_DX2_RIGHT: ");
b.append(AVG_DX2_RIGHT);
b.append(", FIRST_LEFT_DETECTION: ");
b.append(FIRST_LEFT_DETECTION);
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
	if( MAX_DX2_LEFT < 3577 ) { 
	if( AVG_AMP_RIGHT < 22.5 ) { 
	if( FIRST_RIGHT_DETECTION < 305 ) { 
	if( AMP_DELTA >= 5842.5 ) { 
		if( FIRST_RIGHT_DETECTION < 115.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( FIRST_RIGHT_DETECTION >= 115.5 ) { 
	if( AVG_AMP_LEFT < 12 ) { 
		if( FIRST_LEFT_DETECTION >= 230 ) { return new Prediction("BOTTOM", 104, 0); }
	if( FIRST_LEFT_DETECTION < 230 ) { 
	if( FIRST_RIGHT_DETECTION < 220.5 ) { 
		if( MAX_AMP_LEFT < 5213.5 ) { return new Prediction("BOTTOM", 65, 0); }
		if( MAX_AMP_LEFT >= 5213.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 220.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 12 ) { 
		if( MAX_AMP_RIGHT >= 405 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < 405 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AMP_DELTA < 5842.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( AVG_AMP_RIGHT >= 17.5 ) { 
	if( DX2_DELTA >= 2701 ) { 
		if( AVG_DX2_RIGHT < -6.68 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= -6.68 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DX2_DELTA < 2701 ) { return new Prediction("LEFT", 12, 0); }
	}
	if( AVG_AMP_RIGHT < 17.5 ) { 
		if( FIRST_RIGHT_DETECTION < 285 ) { return new Prediction("LEFT", 63, 0); }
	if( FIRST_RIGHT_DETECTION >= 285 ) { 
		if( MAX_DX2_RIGHT >= 2199 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 2199 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
	if( AVG_DX2_LEFT < 0.78 ) { 
		if( MAX_AMP_RIGHT < -7141 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_AMP_RIGHT >= -7141 ) { 
		if( AVG_DX2_LEFT >= -0.15 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < -0.15 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 0.78 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 305 ) { 
		if( MAX_DX2_RIGHT >= 1371.5 ) { return new Prediction("LEFT", 5, 0); }
	if( MAX_DX2_RIGHT < 1371.5 ) { 
		if( AMP_DELTA >= 1954.5 ) { return new Prediction("TOP", 3, 0); }
	if( AMP_DELTA < 1954.5 ) { 
		if( DETECTION_DELTA >= 201 ) { return new Prediction("LEFT", 1, 0); }
		if( DETECTION_DELTA < 201 ) { return new Prediction("TOP", 18, 8); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 22.5 ) { 
		if( DX2_DELTA < 4043 ) { return new Prediction("LEFT", 80, 0); }
		if( DX2_DELTA >= 4043 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( MAX_AMP_LEFT < 10666.5 ) { 
	if( AMP_DELTA < 6394.5 ) { 
	if( MAX_AMP_LEFT >= 6092.5 ) { 
		if( AVG_AMP_LEFT < 30.5 ) { return new Prediction("TOP", 44, 0); }
	if( AVG_AMP_LEFT >= 30.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 150.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 150.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < 6092.5 ) { 
	if( AVG_AMP_LEFT < 11 ) { 
	if( AMP_DELTA < 3397 ) { 
		if( MAX_AMP_RIGHT < 6166 ) { return new Prediction("TOP", 13, 0); }
		if( MAX_AMP_RIGHT >= 6166 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AMP_DELTA >= 3397 ) { 
		if( MAX_AMP_LEFT >= -5464.5 ) { return new Prediction("LEFT", 12, 0); }
	if( MAX_AMP_LEFT < -5464.5 ) { 
		if( MAX_DX2_LEFT < 4862.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 4862.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 11 ) { 
	if( MAX_DX2_RIGHT >= 7149 ) { 
		if( MAX_DX2_LEFT < 6707.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( MAX_DX2_LEFT >= 6707.5 ) { 
		if( FIRST_LEFT_DETECTION < 135.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 135.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 7149 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6394.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( DETECTION_DELTA < 24.5 ) { 
		if( AVG_AMP_RIGHT < 9.5 ) { return new Prediction("BOTTOM", 23, 0); }
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( AVG_DX2_LEFT < -0.14 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= -0.14 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 24.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( DX2_DELTA >= 20107.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( DX2_DELTA < 20107.5 ) { 
		if( AVG_DX2_RIGHT >= 9.01 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 9.01 ) { return new Prediction("RIGHT", 140, 0); }
	}
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_AMP_RIGHT < 9766 ) { 
		if( MAX_AMP_LEFT < -10920 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_LEFT >= -10920 ) { 
	if( DX2_DELTA >= 7863.5 ) { 
		if( MAX_DX2_RIGHT < 25544.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( MAX_DX2_RIGHT >= 25544.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DX2_DELTA < 7863.5 ) { 
		if( MAX_DX2_LEFT < 14400 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_LEFT >= 14400 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= 9766 ) { 
		if( MAX_DX2_LEFT >= 25655 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 25655 ) { return new Prediction("RIGHT", 42, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 10666.5 ) { 
		if( MAX_AMP_RIGHT < 22309 ) { return new Prediction("TOP", 106, 0); }
		if( MAX_AMP_RIGHT >= 22309 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
return null;
}
private Prediction runTree1() {
	if( AMP_DELTA < 6118.5 ) { 
	if( MAX_AMP_LEFT < 5250.5 ) { 
	if( DX2_DELTA >= 3538.5 ) { 
	if( MAX_AMP_RIGHT >= -519.5 ) { 
	if( AVG_DX2_LEFT >= -1.03 ) { 
	if( AVG_DX2_RIGHT >= 1.23 ) { 
		if( FIRST_RIGHT_DETECTION < 197.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 197.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_DX2_RIGHT < 1.23 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( AVG_DX2_LEFT < -1.03 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_DX2_LEFT < -1.99 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.99 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -519.5 ) { return new Prediction("TOP", 9, 0); }
	}
	if( DX2_DELTA < 3538.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 247.5 ) { 
	if( MAX_AMP_LEFT >= -726.5 ) { 
	if( FIRST_LEFT_DETECTION >= 301.5 ) { 
		if( FIRST_LEFT_DETECTION < 314.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 314.5 ) { 
	if( AMP_DELTA >= 2115.5 ) { 
		if( DX2_DELTA < 2347 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA >= 2347 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AMP_DELTA < 2115.5 ) { 
		if( MAX_AMP_RIGHT < -655 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= -655 ) { return new Prediction("LEFT", 10, 5); }
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 301.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( MAX_AMP_LEFT < -726.5 ) { 
		if( MAX_DX2_RIGHT >= 3687 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_DX2_RIGHT < 3687 ) { 
	if( MAX_DX2_LEFT >= 2124.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( FIRST_LEFT_DETECTION < 261.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 261.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 11, 0); }
	}
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 247.5 ) { 
	if( AVG_AMP_LEFT >= -26.5 ) { 
	if( MAX_DX2_LEFT < 5300.5 ) { 
	if( MAX_AMP_LEFT >= 4373.5 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_LEFT < 4373.5 ) { return new Prediction("LEFT", 153, 0); }
	}
	if( MAX_DX2_LEFT >= 5300.5 ) { 
		if( AVG_DX2_LEFT >= -0.1 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -0.1 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT < -26.5 ) { 
		if( FIRST_RIGHT_DETECTION < 176 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 176 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5250.5 ) { 
		if( DX2_DELTA < 4627.5 ) { return new Prediction("TOP", 70, 0); }
	if( DX2_DELTA >= 4627.5 ) { 
	if( MAX_AMP_RIGHT >= 9542.5 ) { 
		if( AVG_DX2_LEFT >= -1.76 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < -1.76 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 9542.5 ) { 
		if( AVG_DX2_LEFT < -4.54 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -4.54 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6118.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT < 5507.5 ) { 
		if( MAX_DX2_RIGHT < 3308.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_RIGHT >= 3308.5 ) { return new Prediction("BOTTOM", 184, 0); }
	}
	if( MAX_AMP_LEFT >= 5507.5 ) { 
		if( DETECTION_DELTA < 7.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_AMP_LEFT >= 13968.5 ) { return new Prediction("TOP", 32, 0); }
	if( MAX_AMP_LEFT < 13968.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
	if( AVG_DX2_RIGHT >= 9.15 ) { 
		if( AVG_DX2_RIGHT < 9.43 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 9.43 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_DX2_RIGHT < 9.15 ) { return new Prediction("RIGHT", 147, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
		if( MAX_AMP_LEFT < -9452.5 ) { return new Prediction("TOP", 9, 0); }
	if( MAX_AMP_LEFT >= -9452.5 ) { 
	if( DX2_DELTA >= 9688.5 ) { 
		if( AVG_DX2_LEFT < 0.41 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AVG_DX2_LEFT >= 0.41 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( DX2_DELTA < 9688.5 ) { 
		if( AVG_DX2_RIGHT < -0.91 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.91 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= -5.5 ) { 
	if( AVG_DX2_LEFT < -5.5 ) { 
		if( AVG_DX2_LEFT < -8.11 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -8.11 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_DX2_LEFT >= -5.5 ) { return new Prediction("RIGHT", 64, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree2() {
	if( AMP_DELTA < 5768 ) { 
	if( MAX_AMP_LEFT < 5134 ) { 
		if( MAX_AMP_LEFT < -6914 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_LEFT >= -6914 ) { 
	if( MAX_DX2_RIGHT < 6543 ) { 
	if( AVG_DX2_RIGHT < -0.03 ) { 
	if( DX2_DELTA < 4086.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( MAX_DX2_RIGHT >= 3342.5 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_DX2_RIGHT < 3342.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("LEFT", 104, 0); }
	}
		if( DX2_DELTA >= 4086.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= -0.03 ) { 
	if( MAX_AMP_LEFT < 4121.5 ) { 
	if( AVG_AMP_LEFT >= -26.5 ) { 
		if( FIRST_RIGHT_DETECTION < 245 ) { return new Prediction("LEFT", 56, 0); }
	if( FIRST_RIGHT_DETECTION >= 245 ) { 
	if( FIRST_LEFT_DETECTION >= 272.5 ) { 
	if( DETECTION_DELTA < 369 ) { 
		if( MAX_DX2_RIGHT < 1009.5 ) { return new Prediction("LEFT", 20, 3); }
		if( MAX_DX2_RIGHT >= 1009.5 ) { return new Prediction("LEFT", 10, 0); }
	}
	if( DETECTION_DELTA >= 369 ) { 
		if( AVG_AMP_RIGHT < -1 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_RIGHT >= -1 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 272.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( AVG_AMP_LEFT < -26.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_AMP_LEFT >= 4121.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 175 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 175 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6543 ) { 
	if( MAX_AMP_RIGHT < 9595 ) { 
		if( AMP_DELTA < 3796.5 ) { return new Prediction("LEFT", 4, 0); }
	if( AMP_DELTA >= 3796.5 ) { 
		if( AVG_DX2_RIGHT < 6.27 ) { return new Prediction("RIGHT", 6, 0); }
		if( AVG_DX2_RIGHT >= 6.27 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 9595 ) { 
		if( FIRST_LEFT_DETECTION >= 183.5 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_LEFT_DETECTION < 183.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5134 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("TOP", 65, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
		if( MAX_DX2_RIGHT < 10293.5 ) { return new Prediction("TOP", 25, 0); }
	if( MAX_DX2_RIGHT >= 10293.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 108.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 108.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 5768 ) { 
	if( MAX_AMP_LEFT < 4435.5 ) { 
	if( MAX_AMP_LEFT < -7166.5 ) { 
		if( MAX_DX2_RIGHT < 16160 ) { return new Prediction("TOP", 18, 0); }
	if( MAX_DX2_RIGHT >= 16160 ) { 
		if( AVG_DX2_RIGHT >= 3.01 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 3.01 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	if( MAX_AMP_LEFT >= -7166.5 ) { 
	if( FIRST_LEFT_DETECTION >= 119.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 179, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_LEFT < 11.5 ) { 
	if( AVG_DX2_LEFT >= -0.23 ) { 
	if( MAX_DX2_RIGHT < 6429.5 ) { 
		if( MAX_DX2_RIGHT < 5825.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_RIGHT >= 5825.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 6429.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
		if( AVG_DX2_LEFT < -0.23 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_LEFT >= 11.5 ) { 
		if( AVG_DX2_LEFT < 0.48 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.48 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION < 119.5 ) { 
		if( MAX_AMP_RIGHT < -1014.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_RIGHT >= -1014.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4435.5 ) { 
	if( AVG_AMP_RIGHT >= 4.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT < 7088 ) { 
		if( MAX_DX2_RIGHT < 6279 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 6279 ) { return new Prediction("RIGHT", 16, 0); }
	}
	if( MAX_DX2_LEFT >= 7088 ) { 
		if( MAX_AMP_RIGHT >= -14492 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_RIGHT < -14492 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_DX2_RIGHT < -6.27 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT >= -6.27 ) { 
	if( DX2_DELTA >= 17864 ) { 
		if( MAX_DX2_RIGHT >= 32714.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_DX2_RIGHT < 32714.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DX2_DELTA < 17864 ) { 
		if( MAX_DX2_LEFT < 15573 ) { return new Prediction("RIGHT", 117, 0); }
	if( MAX_DX2_LEFT >= 15573 ) { 
		if( MAX_DX2_RIGHT < 26556 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 26556 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < 4.5 ) { 
		if( MAX_AMP_LEFT >= 13729 ) { return new Prediction("TOP", 45, 0); }
	if( MAX_AMP_LEFT < 13729 ) { 
		if( MAX_DX2_LEFT < 3682 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_LEFT >= 3682 ) { 
	if( MAX_AMP_RIGHT < 6274.5 ) { 
		if( AVG_DX2_RIGHT < -1.6 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT >= -1.6 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= 6274.5 ) { return new Prediction("RIGHT", 29, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree3() {
	if( MAX_AMP_LEFT >= 5164.5 ) { 
	if( DX2_DELTA < 4273.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231 ) { return new Prediction("RIGHT", 1, 0); }
	if( FIRST_LEFT_DETECTION < 231 ) { 
		if( FIRST_LEFT_DETECTION >= 133.5 ) { return new Prediction("TOP", 67, 0); }
	if( FIRST_LEFT_DETECTION < 133.5 ) { 
	if( FIRST_LEFT_DETECTION >= 123.5 ) { 
		if( MAX_AMP_LEFT >= 7666 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT < 7666 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 123.5 ) { return new Prediction("TOP", 24, 0); }
	}
	}
	}
	if( DX2_DELTA >= 4273.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 7418.5 ) { 
		if( MAX_DX2_RIGHT >= 15438 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT < 15438 ) { return new Prediction("RIGHT", 13, 0); }
	}
		if( MAX_AMP_LEFT >= 7418.5 ) { return new Prediction("TOP", 56, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_DX2_RIGHT < 31111 ) { return new Prediction("RIGHT", 125, 0); }
	if( MAX_DX2_RIGHT >= 31111 ) { 
		if( MAX_DX2_RIGHT < 31441 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT >= 31441 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 5164.5 ) { 
	if( MAX_DX2_RIGHT < 6323 ) { 
	if( AMP_DELTA < 5646.5 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( MAX_DX2_LEFT < 2420 ) { 
		if( FIRST_LEFT_DETECTION < 220 ) { return new Prediction("LEFT", 23, 0); }
	if( FIRST_LEFT_DETECTION >= 220 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
	if( MAX_DX2_RIGHT < 1009.5 ) { 
		if( DX2_DELTA >= 2160.5 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA < 2160.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 20, 8); }
	}
	}
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
		if( MAX_DX2_RIGHT < 3279 ) { return new Prediction("LEFT", 20, 0); }
		if( MAX_DX2_RIGHT >= 3279 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( FIRST_RIGHT_DETECTION >= 254 ) { return new Prediction("BOTTOM", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 254 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 2420 ) { 
		if( DETECTION_DELTA >= 26.5 ) { return new Prediction("TOP", 6, 0); }
	if( DETECTION_DELTA < 26.5 ) { 
	if( MAX_DX2_LEFT >= 3123.5 ) { 
	if( AVG_AMP_RIGHT >= -0.5 ) { 
		if( AVG_DX2_LEFT >= -0.9 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -0.9 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_RIGHT < -0.5 ) { return new Prediction("TOP", 9, 0); }
	}
		if( MAX_DX2_LEFT < 3123.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
	if( DX2_DELTA < 2844.5 ) { 
		if( MAX_DX2_LEFT >= 4448.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 4448.5 ) { return new Prediction("LEFT", 97, 0); }
	}
	if( DX2_DELTA >= 2844.5 ) { 
		if( AVG_AMP_RIGHT >= 26 ) { return new Prediction("LEFT", 11, 0); }
	if( AVG_AMP_RIGHT < 26 ) { 
		if( AVG_DX2_LEFT < -0.22 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.22 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 5646.5 ) { 
	if( MAX_DX2_LEFT >= 2907.5 ) { 
		if( FIRST_LEFT_DETECTION < 83 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 83 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_DX2_LEFT < 2907.5 ) { 
	if( MAX_AMP_LEFT >= 3022.5 ) { 
		if( MAX_DX2_RIGHT < 5591.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT >= 5591.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT < 3022.5 ) { return new Prediction("BOTTOM", 52, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6323 ) { 
	if( MAX_AMP_LEFT < -10754 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 25, 0); }
	}
	if( MAX_AMP_LEFT >= -10754 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( DETECTION_DELTA < 19.5 ) { return new Prediction("BOTTOM", 94, 0); }
	if( DETECTION_DELTA >= 19.5 ) { 
		if( MAX_AMP_LEFT >= -4551.5 ) { return new Prediction("BOTTOM", 9, 0); }
		if( MAX_AMP_LEFT < -4551.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 118 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
		if( MAX_DX2_RIGHT >= 20876.5 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_DX2_RIGHT < 20876.5 ) { 
	if( MAX_DX2_LEFT < 2911.5 ) { 
		if( MAX_DX2_LEFT < 2768 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2768 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2911.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 118 ) { 
		if( AVG_DX2_LEFT >= -3.67 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < -3.67 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( FIRST_LEFT_DETECTION >= 162.5 ) { 
		if( MAX_DX2_LEFT < 3335.5 ) { return new Prediction("BOTTOM", 27, 0); }
	if( MAX_DX2_LEFT >= 3335.5 ) { 
	if( DX2_DELTA >= 5150 ) { 
		if( AVG_DX2_LEFT < -0.65 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_DX2_LEFT >= -0.65 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("RIGHT", 8, 0); }
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DX2_DELTA < 5150 ) { 
		if( MAX_DX2_RIGHT >= 9316.5 ) { return new Prediction("LEFT", 12, 0); }
		if( MAX_DX2_RIGHT < 9316.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 162.5 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree4() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_RIGHT < 8455 ) { 
		if( MAX_AMP_LEFT >= 6288 ) { return new Prediction("TOP", 115, 0); }
	if( MAX_AMP_LEFT < 6288 ) { 
	if( AVG_AMP_LEFT >= 4 ) { 
		if( FIRST_LEFT_DETECTION >= 209 ) { return new Prediction("BOTTOM", 4, 0); }
	if( FIRST_LEFT_DETECTION < 209 ) { 
	if( AVG_AMP_LEFT < 21 ) { 
		if( MAX_AMP_RIGHT < 1913 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= 1913 ) { return new Prediction("RIGHT", 9, 0); }
	}
	if( AVG_AMP_LEFT >= 21 ) { 
		if( FIRST_RIGHT_DETECTION >= 160 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 160 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 4 ) { 
		if( MAX_AMP_LEFT < -7947 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_AMP_LEFT >= -7947 ) { 
	if( AVG_DX2_RIGHT < 3.3 ) { 
	if( FIRST_RIGHT_DETECTION < 208.5 ) { 
		if( DETECTION_DELTA < 8 ) { return new Prediction("LEFT", 33, 0); }
		if( DETECTION_DELTA >= 8 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 208.5 ) { 
	if( MAX_AMP_RIGHT >= -3053.5 ) { 
		if( DX2_DELTA < 163.5 ) { return new Prediction("LEFT", 14, 5); }
		if( DX2_DELTA >= 163.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( MAX_AMP_RIGHT < -3053.5 ) { 
		if( AVG_DX2_LEFT < -1.11 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -1.11 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 3.3 ) { 
		if( DX2_DELTA >= 3338 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DX2_DELTA < 3338 ) { 
		if( MAX_AMP_RIGHT < 6287 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_RIGHT >= 6287 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 8455 ) { 
	if( MAX_DX2_RIGHT < 15004.5 ) { 
		if( MAX_AMP_LEFT >= 9110 ) { return new Prediction("TOP", 19, 0); }
	if( MAX_AMP_LEFT < 9110 ) { 
	if( MAX_AMP_LEFT < 4404.5 ) { 
	if( MAX_DX2_LEFT < 9585 ) { 
		if( FIRST_RIGHT_DETECTION < 152 ) { return new Prediction("RIGHT", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 152 ) { 
		if( AVG_DX2_LEFT < 0.37 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.37 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 9585 ) { return new Prediction("TOP", 8, 0); }
	}
		if( MAX_AMP_LEFT >= 4404.5 ) { return new Prediction("RIGHT", 76, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 15004.5 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
		if( AMP_DELTA < 12166.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( AMP_DELTA >= 12166.5 ) { 
	if( DX2_DELTA < 17783.5 ) { 
	if( AVG_AMP_LEFT >= -23.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DETECTION_DELTA < 4.5 ) { return new Prediction("RIGHT", 26, 0); }
	}
		if( AVG_AMP_LEFT < -23.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DX2_DELTA >= 17783.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -5.5 ) { 
		if( AVG_AMP_LEFT < 18 ) { return new Prediction("RIGHT", 56, 0); }
	if( AVG_AMP_LEFT >= 18 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 19, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_AMP_RIGHT < 12870.5 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_AMP_RIGHT >= 12870.5 ) { 
		if( FIRST_LEFT_DETECTION >= 88 ) { return new Prediction("RIGHT", 8, 0); }
		if( FIRST_LEFT_DETECTION < 88 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_AMP_RIGHT >= 9847.5 ) { return new Prediction("BOTTOM", 99, 0); }
	if( MAX_AMP_RIGHT < 9847.5 ) { 
	if( DX2_DELTA < 3494 ) { 
	if( MAX_AMP_RIGHT < -9249.5 ) { 
		if( MAX_AMP_LEFT >= -4771 ) { return new Prediction("BOTTOM", 16, 0); }
		if( MAX_AMP_LEFT < -4771 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_AMP_RIGHT >= -9249.5 ) { 
	if( MAX_DX2_LEFT < 3634 ) { 
	if( MAX_DX2_RIGHT < 2036 ) { 
		if( FIRST_RIGHT_DETECTION >= 256 ) { return new Prediction("TOP", 8, 0); }
		if( FIRST_RIGHT_DETECTION < 256 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 2036 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( AVG_AMP_RIGHT < 2.5 ) { 
	if( DX2_DELTA >= 2533 ) { 
		if( FIRST_LEFT_DETECTION < 473.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( FIRST_LEFT_DETECTION >= 473.5 ) { 
		if( MAX_DX2_RIGHT < 2636 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_RIGHT >= 2636 ) { 
		if( DX2_DELTA < 3303.5 ) { return new Prediction("LEFT", 6, 0); }
	if( DX2_DELTA >= 3303.5 ) { 
		if( AMP_DELTA >= 4148.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 4148.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
		if( DX2_DELTA < 2533 ) { return new Prediction("LEFT", 29, 0); }
	}
	if( AVG_AMP_RIGHT >= 2.5 ) { 
	if( DX2_DELTA < 2691 ) { 
		if( FIRST_LEFT_DETECTION >= 227 ) { return new Prediction("BOTTOM", 4, 0); }
		if( FIRST_LEFT_DETECTION < 227 ) { return new Prediction("TOP", 3, 0); }
	}
		if( DX2_DELTA >= 2691 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 11.5 ) { return new Prediction("LEFT", 97, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3634 ) { return new Prediction("TOP", 12, 0); }
	}
	}
	if( DX2_DELTA >= 3494 ) { 
	if( MAX_AMP_RIGHT < -7214 ) { 
		if( AVG_AMP_RIGHT >= -17.5 ) { return new Prediction("BOTTOM", 53, 0); }
		if( AVG_AMP_RIGHT < -17.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_RIGHT >= -7214 ) { 
		if( MAX_AMP_LEFT >= 4789.5 ) { return new Prediction("TOP", 11, 0); }
	if( MAX_AMP_LEFT < 4789.5 ) { 
	if( MAX_AMP_RIGHT < 5936 ) { 
		if( FIRST_RIGHT_DETECTION >= 129.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 129.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_AMP_RIGHT >= 5936 ) { 
		if( AVG_DX2_LEFT < -0.74 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.74 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree5() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( AMP_DELTA < 7582.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
	if( AMP_DELTA < 4293.5 ) { 
	if( FIRST_LEFT_DETECTION < 481.5 ) { 
		if( AVG_AMP_LEFT < 13.5 ) { return new Prediction("LEFT", 29, 0); }
		if( AVG_AMP_LEFT >= 13.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 12, 5); }
	}
	if( AMP_DELTA >= 4293.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( FIRST_LEFT_DETECTION < 83.5 ) { return new Prediction("TOP", 4, 0); }
	if( FIRST_LEFT_DETECTION >= 83.5 ) { 
		if( FIRST_LEFT_DETECTION >= 208 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION < 208 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( MAX_DX2_RIGHT >= 6298.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_RIGHT < 6298.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_DX2_RIGHT >= 11651.5 ) { return new Prediction("LEFT", 8, 0); }
	if( MAX_DX2_RIGHT < 11651.5 ) { 
		if( MAX_AMP_LEFT >= 7164 ) { return new Prediction("TOP", 104, 0); }
	if( MAX_AMP_LEFT < 7164 ) { 
		if( MAX_AMP_LEFT < -6943.5 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_AMP_LEFT >= -6943.5 ) { 
	if( MAX_AMP_LEFT < 4423 ) { 
	if( MAX_AMP_LEFT < -4030.5 ) { 
		if( DX2_DELTA < 1676.5 ) { return new Prediction("TOP", 2, 0); }
		if( DX2_DELTA >= 1676.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( MAX_AMP_LEFT >= -4030.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( AVG_AMP_RIGHT >= 19 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT < 19 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( AVG_DX2_LEFT >= 1.02 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT < 1.02 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4423 ) { 
	if( AVG_DX2_RIGHT >= -0.2 ) { 
		if( MAX_AMP_LEFT < 6791.5 ) { return new Prediction("TOP", 9, 0); }
		if( MAX_AMP_LEFT >= 6791.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < -0.2 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 7582.5 ) { 
	if( MAX_DX2_LEFT < 16889 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_RIGHT < 1631.5 ) { 
		if( MAX_DX2_RIGHT < 9980.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_DX2_RIGHT >= 9980.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
	if( MAX_AMP_RIGHT >= 1631.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( DETECTION_DELTA < 6.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT < -18 ) { 
		if( MAX_DX2_RIGHT < 26124 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT >= 26124 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_LEFT >= -18 ) { 
	if( DX2_DELTA >= 18366 ) { 
		if( AVG_DX2_LEFT < -0.05 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= -0.05 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA < 18366 ) { return new Prediction("RIGHT", 166, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 16889 ) { 
		if( DX2_DELTA < 7666.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( DX2_DELTA >= 7666.5 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("RIGHT", 1, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_AMP_RIGHT >= 9107.5 ) { 
		if( AVG_AMP_LEFT < 11 ) { return new Prediction("BOTTOM", 83, 0); }
		if( AVG_AMP_LEFT >= 11 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 9107.5 ) { 
	if( MAX_DX2_LEFT >= 4059.5 ) { 
		if( MAX_DX2_RIGHT < 6687 ) { return new Prediction("TOP", 23, 0); }
		if( MAX_DX2_RIGHT >= 6687 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	if( MAX_DX2_LEFT < 4059.5 ) { 
	if( AVG_DX2_RIGHT < 1.18 ) { 
	if( DX2_DELTA >= 3328 ) { 
	if( MAX_AMP_RIGHT >= -1327.5 ) { 
		if( AVG_DX2_RIGHT >= -3.8 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT < -3.8 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_RIGHT < -1327.5 ) { return new Prediction("BOTTOM", 30, 0); }
	}
	if( DX2_DELTA < 3328 ) { 
	if( FIRST_RIGHT_DETECTION < 491.5 ) { 
		if( AVG_AMP_RIGHT >= 11 ) { return new Prediction("LEFT", 90, 0); }
	if( AVG_AMP_RIGHT < 11 ) { 
	if( FIRST_RIGHT_DETECTION >= 206 ) { 
	if( MAX_DX2_LEFT < 2089 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 16, 0); }
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( FIRST_RIGHT_DETECTION < 263 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 263 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2089 ) { 
		if( FIRST_LEFT_DETECTION >= 227 ) { return new Prediction("BOTTOM", 5, 0); }
		if( FIRST_LEFT_DETECTION < 227 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 206 ) { return new Prediction("LEFT", 25, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 491.5 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= 1.18 ) { 
	if( AVG_AMP_RIGHT < 20.5 ) { 
	if( DX2_DELTA < 1584 ) { 
		if( FIRST_RIGHT_DETECTION >= 191.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 191.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DX2_DELTA >= 1584 ) { 
		if( AVG_DX2_LEFT >= -1.66 ) { return new Prediction("BOTTOM", 51, 0); }
		if( AVG_DX2_LEFT < -1.66 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 20.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree6() {
	if( AMP_DELTA < 6400 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( MAX_DX2_LEFT >= 2124.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 202 ) { 
	if( MAX_DX2_RIGHT < 3140 ) { 
		if( FIRST_LEFT_DETECTION >= 298 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 298 ) { return new Prediction("TOP", 13, 0); }
	}
	if( MAX_DX2_RIGHT >= 3140 ) { 
		if( AVG_AMP_RIGHT < 5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_AMP_RIGHT >= 5 ) { 
		if( FIRST_LEFT_DETECTION < 189.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 189.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 202 ) { 
		if( AVG_AMP_RIGHT < -6.5 ) { return new Prediction("LEFT", 9, 0); }
	if( AVG_AMP_RIGHT >= -6.5 ) { 
		if( MAX_DX2_RIGHT >= 3505.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 3505.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2124.5 ) { 
	if( DX2_DELTA < 3303.5 ) { 
		if( FIRST_RIGHT_DETECTION < 285 ) { return new Prediction("LEFT", 24, 0); }
	if( FIRST_RIGHT_DETECTION >= 285 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( DX2_DELTA >= 3303.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
		if( DETECTION_DELTA >= 524 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA < 524 ) { return new Prediction("LEFT", 80, 0); }
	}
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( AVG_DX2_RIGHT >= 0.53 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( MAX_AMP_RIGHT < 9093 ) { 
	if( AVG_AMP_RIGHT < 22.5 ) { 
		if( FIRST_LEFT_DETECTION < 174.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 174.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( AVG_AMP_RIGHT >= 22.5 ) { 
		if( MAX_AMP_LEFT < 204.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_LEFT >= 204.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 9093 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( MAX_AMP_LEFT < 4206 ) { 
	if( DX2_DELTA >= 3001.5 ) { 
		if( MAX_AMP_RIGHT < 911.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_RIGHT >= 911.5 ) { 
		if( AVG_DX2_RIGHT >= 3.91 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.91 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DX2_DELTA < 3001.5 ) { 
		if( AVG_AMP_RIGHT < 0.5 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_AMP_RIGHT >= 0.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4206 ) { 
		if( AVG_AMP_LEFT < 32 ) { return new Prediction("TOP", 67, 0); }
	if( AVG_AMP_LEFT >= 32 ) { 
		if( DX2_DELTA < 6207 ) { return new Prediction("TOP", 8, 0); }
		if( DX2_DELTA >= 6207 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT < 0.53 ) { 
	if( MAX_AMP_LEFT < 5250.5 ) { 
	if( MAX_AMP_LEFT < -6527.5 ) { 
		if( MAX_DX2_LEFT < 17712 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_DX2_LEFT >= 17712 ) { 
		if( AVG_DX2_LEFT < -1.99 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.99 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT >= -6527.5 ) { 
	if( AMP_DELTA >= 5367.5 ) { 
	if( MAX_DX2_RIGHT < 10137 ) { 
		if( AVG_DX2_RIGHT >= -0.42 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < -0.42 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 10137 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AMP_DELTA < 5367.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 480.5 ) { return new Prediction("LEFT", 18, 6); }
		if( FIRST_RIGHT_DETECTION < 480.5 ) { return new Prediction("LEFT", 50, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 5250.5 ) { 
	if( MAX_AMP_LEFT < 6561 ) { 
		if( AVG_DX2_RIGHT < -1.84 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.84 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 6561 ) { return new Prediction("TOP", 36, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( MAX_DX2_LEFT >= 3552 ) { 
	if( MAX_DX2_RIGHT < 8923 ) { 
		if( MAX_DX2_LEFT < 4880 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 4880 ) { return new Prediction("TOP", 54, 0); }
	}
	if( MAX_DX2_RIGHT >= 8923 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 29, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_LEFT >= -19 ) { 
	if( MAX_DX2_LEFT >= 13393 ) { 
	if( MAX_DX2_RIGHT >= 16625.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 231.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
		if( MAX_DX2_RIGHT < 16625.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_DX2_LEFT < 13393 ) { 
		if( FIRST_RIGHT_DETECTION < 241.5 ) { return new Prediction("RIGHT", 148, 0); }
	if( FIRST_RIGHT_DETECTION >= 241.5 ) { 
		if( MAX_AMP_RIGHT < -2199.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_RIGHT >= -2199.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -19 ) { 
		if( MAX_DX2_RIGHT >= 27965.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_RIGHT < 27965.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3552 ) { 
	if( MAX_DX2_LEFT >= 3165.5 ) { 
		if( DETECTION_DELTA < 11.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( DETECTION_DELTA >= 11.5 ) { return new Prediction("BOTTOM", 12, 0); }
	}
		if( MAX_DX2_LEFT < 3165.5 ) { return new Prediction("BOTTOM", 140, 0); }
	}
	}
return null;
}
private Prediction runTree7() {
	if( MAX_AMP_LEFT < 5037.5 ) { 
	if( MAX_AMP_RIGHT >= 9313 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( AVG_DX2_LEFT < 4.98 ) { 
	if( AMP_DELTA < 5917.5 ) { 
		if( MAX_AMP_LEFT >= -496 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_AMP_LEFT < -496 ) { 
		if( AVG_DX2_RIGHT < 2.83 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT >= 2.83 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AMP_DELTA >= 5917.5 ) { 
	if( MAX_AMP_LEFT >= -21417 ) { 
	if( AVG_AMP_LEFT < -8.5 ) { 
	if( AVG_DX2_LEFT >= -2.8 ) { 
		if( FIRST_LEFT_DETECTION < 153.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 153.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_LEFT < -2.8 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 32, 0); }
	}
		if( MAX_AMP_LEFT < -21417 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 4.98 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( AMP_DELTA < 6159.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 127 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 127 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA >= 6159.5 ) { return new Prediction("BOTTOM", 109, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 9313 ) { 
	if( DX2_DELTA >= 3178 ) { 
	if( MAX_AMP_LEFT >= -7664.5 ) { 
	if( MAX_AMP_RIGHT >= -6333 ) { 
		if( MAX_AMP_LEFT < -1667 ) { return new Prediction("LEFT", 10, 0); }
	if( MAX_AMP_LEFT >= -1667 ) { 
		if( MAX_DX2_RIGHT < 3432.5 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_DX2_RIGHT >= 3432.5 ) { 
		if( AVG_DX2_RIGHT < 0.87 ) { return new Prediction("RIGHT", 6, 0); }
	if( AVG_DX2_RIGHT >= 0.87 ) { 
		if( FIRST_RIGHT_DETECTION >= 178.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 178.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -6333 ) { 
		if( MAX_AMP_LEFT < -5048 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_AMP_LEFT >= -5048 ) { 
		if( FIRST_LEFT_DETECTION >= 188 ) { return new Prediction("BOTTOM", 72, 0); }
	if( FIRST_LEFT_DETECTION < 188 ) { 
		if( AVG_DX2_LEFT < 0.62 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT >= 0.62 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT < -7664.5 ) { return new Prediction("TOP", 21, 0); }
	}
	if( DX2_DELTA < 3178 ) { 
		if( AVG_AMP_RIGHT >= 17.5 ) { return new Prediction("LEFT", 86, 0); }
	if( AVG_AMP_RIGHT < 17.5 ) { 
	if( AMP_DELTA < 5030.5 ) { 
	if( MAX_DX2_RIGHT >= 2017.5 ) { 
	if( AVG_DX2_RIGHT < -4.26 ) { 
		if( DETECTION_DELTA < 22.5 ) { return new Prediction("LEFT", 6, 0); }
		if( DETECTION_DELTA >= 22.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_DX2_RIGHT >= -4.26 ) { 
	if( MAX_AMP_LEFT < -5843.5 ) { 
		if( MAX_AMP_RIGHT < -10700 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= -10700 ) { return new Prediction("TOP", 6, 0); }
	}
	if( MAX_AMP_LEFT >= -5843.5 ) { 
		if( AVG_AMP_LEFT >= -35.5 ) { return new Prediction("LEFT", 61, 0); }
		if( AVG_AMP_LEFT < -35.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 2017.5 ) { 
	if( DX2_DELTA < 2126.5 ) { 
		if( FIRST_RIGHT_DETECTION < 468.5 ) { return new Prediction("TOP", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 468.5 ) { 
		if( FIRST_LEFT_DETECTION >= 461 ) { return new Prediction("LEFT", 16, 5); }
		if( FIRST_LEFT_DETECTION < 461 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( DX2_DELTA >= 2126.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( AMP_DELTA >= 5030.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("TOP", 3, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( AVG_AMP_LEFT >= -19 ) { return new Prediction("BOTTOM", 18, 0); }
		if( AVG_AMP_LEFT < -19 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5037.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_AMP_LEFT >= 7260.5 ) { return new Prediction("TOP", 121, 0); }
	if( MAX_AMP_LEFT < 7260.5 ) { 
	if( MAX_AMP_RIGHT < 10335 ) { 
		if( MAX_AMP_LEFT >= 6072 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_LEFT < 6072 ) { 
		if( AVG_DX2_LEFT >= -0.62 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < -0.62 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 10335 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AMP_DELTA < 4450.5 ) { return new Prediction("TOP", 20, 0); }
	if( AMP_DELTA >= 4450.5 ) { 
		if( MAX_DX2_RIGHT < 7049.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_RIGHT >= 7049.5 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 129, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 229.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 229.5 ) { return new Prediction("RIGHT", 18, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree8() {
	if( AMP_DELTA >= 6150.5 ) { 
	if( MAX_AMP_LEFT < 4678.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT >= -7675 ) { 
		if( AVG_DX2_LEFT >= -2.07 ) { return new Prediction("BOTTOM", 174, 0); }
		if( AVG_DX2_LEFT < -2.07 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT < -7675 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_RIGHT >= 15826.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_AMP_LEFT >= -9 ) { return new Prediction("RIGHT", 16, 0); }
		if( AVG_AMP_LEFT < -9 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
		if( AVG_DX2_RIGHT >= 4.38 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_DX2_RIGHT < 4.38 ) { 
		if( AVG_DX2_LEFT >= -3.37 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < -3.37 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 15826.5 ) { 
	if( MAX_AMP_LEFT >= -10145.5 ) { 
		if( FIRST_RIGHT_DETECTION < 156.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( FIRST_RIGHT_DETECTION >= 156.5 ) { 
		if( MAX_AMP_RIGHT >= 10769 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT < 10769 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
		if( MAX_AMP_LEFT < -10145.5 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4678.5 ) { 
	if( AVG_AMP_RIGHT >= 4.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( MAX_DX2_LEFT < 6883 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_LEFT >= 6883 ) { return new Prediction("TOP", 13, 0); }
	}
	if( DETECTION_DELTA < 4.5 ) { 
	if( DX2_DELTA >= 17864 ) { 
		if( MAX_AMP_RIGHT >= -4498 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < -4498 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( DX2_DELTA < 17864 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( FIRST_LEFT_DETECTION < 205 ) { return new Prediction("RIGHT", 7, 0); }
		if( FIRST_LEFT_DETECTION >= 205 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 229 ) { 
		if( DX2_DELTA < 6542.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 6542.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 229 ) { return new Prediction("RIGHT", 122, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < 4.5 ) { 
		if( AVG_DX2_LEFT >= 2.3 ) { return new Prediction("TOP", 21, 0); }
	if( AVG_DX2_LEFT < 2.3 ) { 
	if( AVG_AMP_LEFT < 41.5 ) { 
	if( MAX_AMP_LEFT < 14536.5 ) { 
		if( FIRST_RIGHT_DETECTION < 447 ) { return new Prediction("RIGHT", 34, 0); }
		if( FIRST_RIGHT_DETECTION >= 447 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 14536.5 ) { return new Prediction("TOP", 18, 0); }
	}
		if( AVG_AMP_LEFT >= 41.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6150.5 ) { 
	if( AVG_AMP_LEFT >= 5 ) { 
	if( FIRST_LEFT_DETECTION >= 222 ) { 
	if( MAX_DX2_LEFT >= 3152 ) { 
	if( AVG_DX2_RIGHT >= -4.6 ) { 
		if( AVG_DX2_RIGHT >= 0.89 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 0.89 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( AVG_DX2_RIGHT < -4.6 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_LEFT < 3152 ) { 
		if( FIRST_RIGHT_DETECTION < 209.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 209.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 222 ) { 
	if( MAX_AMP_LEFT < 5081 ) { 
		if( FIRST_RIGHT_DETECTION >= 191 ) { return new Prediction("TOP", 5, 0); }
	if( FIRST_RIGHT_DETECTION < 191 ) { 
	if( AMP_DELTA < 4282 ) { 
		if( MAX_AMP_LEFT < -8800 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -8800 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( AMP_DELTA >= 4282 ) { 
		if( FIRST_RIGHT_DETECTION < 154.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( FIRST_RIGHT_DETECTION >= 154.5 ) { 
		if( AVG_DX2_RIGHT < 0.06 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.06 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5081 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 56, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 5 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( DETECTION_DELTA < 399 ) { return new Prediction("TOP", 1, 0); }
		if( DETECTION_DELTA >= 399 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( DX2_DELTA < 2536 ) { 
		if( MAX_DX2_LEFT < 4052 ) { return new Prediction("LEFT", 93, 0); }
		if( MAX_DX2_LEFT >= 4052 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DX2_DELTA >= 2536 ) { 
		if( FIRST_RIGHT_DETECTION >= 243 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_RIGHT_DETECTION < 243 ) { 
	if( AMP_DELTA >= 4324 ) { 
		if( MAX_DX2_RIGHT < 3024.5 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_DX2_RIGHT >= 3024.5 ) { 
		if( DX2_DELTA < 3460 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA >= 3460 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AMP_DELTA < 4324 ) { return new Prediction("LEFT", 31, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA < 10.5 ) { 
	if( AVG_DX2_RIGHT < -0.54 ) { 
	if( MAX_AMP_LEFT < 6176 ) { 
		if( AVG_DX2_RIGHT >= -0.63 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_DX2_RIGHT < -0.63 ) { 
	if( DX2_DELTA >= 5222.5 ) { 
		if( AVG_DX2_LEFT >= -0.78 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < -0.78 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( DX2_DELTA < 5222.5 ) { return new Prediction("LEFT", 24, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 6176 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AVG_DX2_RIGHT >= -0.54 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( AVG_AMP_LEFT < -22 ) { 
		if( DX2_DELTA < 2260.5 ) { return new Prediction("LEFT", 3, 0); }
	if( DX2_DELTA >= 2260.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 257 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 257 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -22 ) { 
		if( MAX_DX2_LEFT >= 3861 ) { return new Prediction("TOP", 30, 0); }
	if( MAX_DX2_LEFT < 3861 ) { 
		if( AVG_DX2_LEFT < 1.31 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_LEFT >= 1.31 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( FIRST_LEFT_DETECTION >= 169 ) { 
	if( AVG_AMP_RIGHT < 14 ) { 
	if( MAX_DX2_LEFT < 2335.5 ) { 
		if( MAX_DX2_LEFT >= 1038 ) { return new Prediction("LEFT", 6, 0); }
		if( MAX_DX2_LEFT < 1038 ) { return new Prediction("LEFT", 15, 5); }
	}
		if( MAX_DX2_LEFT >= 2335.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 14 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( FIRST_LEFT_DETECTION < 169 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree9() {
	if( MAX_DX2_LEFT >= 3578.5 ) { 
	if( AVG_DX2_LEFT < 1.48 ) { 
	if( AMP_DELTA < 6391.5 ) { 
		if( MAX_DX2_RIGHT < 6115.5 ) { return new Prediction("TOP", 50, 0); }
	if( MAX_DX2_RIGHT >= 6115.5 ) { 
	if( MAX_AMP_LEFT < 5710 ) { 
	if( MAX_AMP_LEFT >= -7228 ) { 
		if( AVG_AMP_RIGHT < -5.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT >= -5.5 ) { return new Prediction("LEFT", 11, 0); }
	}
		if( MAX_AMP_LEFT < -7228 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_LEFT >= 5710 ) { 
	if( MAX_DX2_LEFT < 6706.5 ) { 
		if( AVG_DX2_RIGHT >= 2.29 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < 2.29 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 6706.5 ) { return new Prediction("TOP", 19, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6391.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_RIGHT < 8844 ) { 
		if( DETECTION_DELTA < 22.5 ) { return new Prediction("TOP", 25, 0); }
		if( DETECTION_DELTA >= 22.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 8844 ) { 
	if( MAX_AMP_LEFT < 3761.5 ) { 
	if( AVG_AMP_LEFT >= -26.5 ) { 
		if( MAX_DX2_LEFT < 23283.5 ) { return new Prediction("BOTTOM", 22, 0); }
		if( MAX_DX2_LEFT >= 23283.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_LEFT < -26.5 ) { 
		if( MAX_DX2_RIGHT >= 14260 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 14260 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3761.5 ) { 
		if( MAX_AMP_LEFT >= 12819.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT < 12819.5 ) { 
		if( MAX_AMP_RIGHT >= -2508.5 ) { return new Prediction("RIGHT", 16, 0); }
	if( MAX_AMP_RIGHT < -2508.5 ) { 
		if( AVG_DX2_RIGHT >= -0.53 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < -0.53 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_DX2_LEFT < 10477.5 ) { return new Prediction("RIGHT", 114, 0); }
	if( MAX_DX2_LEFT >= 10477.5 ) { 
	if( AVG_AMP_LEFT >= -8 ) { 
	if( FIRST_LEFT_DETECTION < 225 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 26, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( FIRST_LEFT_DETECTION >= 159.5 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_LEFT_DETECTION < 159.5 ) { 
		if( MAX_DX2_LEFT >= 26152 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 26152 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( FIRST_LEFT_DETECTION >= 225 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_LEFT < -8 ) { 
	if( DX2_DELTA < 16419 ) { 
		if( MAX_AMP_LEFT >= -2786.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_LEFT < -2786.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( DX2_DELTA >= 16419 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	}
	if( AVG_DX2_LEFT >= 1.48 ) { 
	if( AMP_DELTA >= 9280 ) { 
		if( DETECTION_DELTA < 3 ) { return new Prediction("RIGHT", 11, 0); }
	if( DETECTION_DELTA >= 3 ) { 
		if( AVG_AMP_LEFT < -17 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_AMP_LEFT >= -17 ) { 
		if( AVG_AMP_LEFT < 11 ) { return new Prediction("BOTTOM", 16, 0); }
		if( AVG_AMP_LEFT >= 11 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AMP_DELTA < 9280 ) { 
	if( MAX_DX2_LEFT >= 4561 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AVG_DX2_RIGHT >= 8.17 ) { 
		if( AVG_DX2_LEFT < 2.78 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 2.78 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_DX2_RIGHT < 8.17 ) { return new Prediction("TOP", 66, 0); }
	}
	}
	if( MAX_DX2_LEFT < 4561 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_DX2_RIGHT >= 6907.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( MAX_DX2_RIGHT < 6907.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3578.5 ) { 
	if( MAX_AMP_RIGHT < 9847 ) { 
	if( AVG_DX2_RIGHT < 1.2 ) { 
	if( MAX_AMP_RIGHT >= -10088.5 ) { 
	if( FIRST_LEFT_DETECTION < 211.5 ) { 
		if( FIRST_RIGHT_DETECTION < 433 ) { return new Prediction("LEFT", 88, 0); }
		if( FIRST_RIGHT_DETECTION >= 433 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 211.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
	if( FIRST_LEFT_DETECTION < 285 ) { 
		if( FIRST_RIGHT_DETECTION < 219.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 219.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 285 ) { 
		if( FIRST_LEFT_DETECTION < 481.5 ) { return new Prediction("LEFT", 3, 0); }
	if( FIRST_LEFT_DETECTION >= 481.5 ) { 
		if( MAX_DX2_RIGHT >= 3543.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_RIGHT < 3543.5 ) { 
		if( DX2_DELTA < 1001 ) { return new Prediction("LEFT", 16, 8); }
		if( DX2_DELTA >= 1001 ) { return new Prediction("LEFT", 21, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( MAX_AMP_LEFT < -2307 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -2307 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( AVG_DX2_LEFT < 0.71 ) { return new Prediction("LEFT", 37, 0); }
	if( AVG_DX2_LEFT >= 0.71 ) { 
		if( FIRST_LEFT_DETECTION < 241 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 241 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -10088.5 ) { 
		if( MAX_AMP_LEFT < -5586 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -5586 ) { return new Prediction("BOTTOM", 32, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= 1.2 ) { 
	if( AVG_AMP_RIGHT < 21 ) { 
	if( MAX_DX2_RIGHT >= 4203.5 ) { 
		if( FIRST_LEFT_DETECTION < 108.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 108.5 ) { return new Prediction("BOTTOM", 47, 0); }
	}
	if( MAX_DX2_RIGHT < 4203.5 ) { 
		if( DETECTION_DELTA < 198.5 ) { return new Prediction("LEFT", 5, 0); }
		if( DETECTION_DELTA >= 198.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 21 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 9847 ) { 
	if( MAX_AMP_LEFT < 3226 ) { 
		if( AVG_DX2_RIGHT >= -6.59 ) { return new Prediction("BOTTOM", 61, 0); }
		if( AVG_DX2_RIGHT < -6.59 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_AMP_LEFT >= 3226 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( MAX_DX2_RIGHT < 6848.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( MAX_DX2_RIGHT >= 6848.5 ) { 
		if( MAX_DX2_RIGHT < 8270 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 8270 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( AMP_DELTA < 8993 ) { 
		if( AVG_DX2_RIGHT < 4.51 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 4.51 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA >= 8993 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree10() {
	if( MAX_DX2_RIGHT < 7309 ) { 
	if( AMP_DELTA >= 5237.5 ) { 
	if( MAX_DX2_LEFT >= 3370 ) { 
	if( DX2_DELTA < 645 ) { 
		if( FIRST_LEFT_DETECTION < 187 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 187 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 645 ) { return new Prediction("TOP", 62, 0); }
	}
	if( MAX_DX2_LEFT < 3370 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_DX2_RIGHT >= 5458 ) { return new Prediction("RIGHT", 5, 0); }
	if( MAX_DX2_RIGHT < 5458 ) { 
		if( AVG_DX2_RIGHT < 0.28 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_DX2_RIGHT >= 0.28 ) { 
		if( FIRST_LEFT_DETECTION >= 229.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION < 229.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_RIGHT >= 3388 ) { return new Prediction("BOTTOM", 80, 0); }
		if( MAX_DX2_RIGHT < 3388 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AMP_DELTA < 5237.5 ) { 
	if( AVG_DX2_RIGHT >= 0.02 ) { 
	if( MAX_DX2_LEFT < 3220.5 ) { 
	if( DETECTION_DELTA >= 26.5 ) { 
		if( FIRST_RIGHT_DETECTION < 269 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 269 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA < 26.5 ) { return new Prediction("LEFT", 38, 0); }
	}
	if( MAX_DX2_LEFT >= 3220.5 ) { 
	if( AMP_DELTA >= 3417 ) { 
		if( MAX_DX2_LEFT >= 4655 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 4655 ) { 
		if( AVG_DX2_LEFT >= 1.51 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 1.51 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( AMP_DELTA < 3417 ) { return new Prediction("TOP", 64, 0); }
	}
	}
	if( AVG_DX2_RIGHT < 0.02 ) { 
	if( DX2_DELTA >= 4233 ) { 
		if( AVG_DX2_RIGHT >= -2.12 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_DX2_RIGHT < -2.12 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( DX2_DELTA < 4233 ) { 
	if( AVG_DX2_RIGHT >= -2.26 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
	if( FIRST_RIGHT_DETECTION < 491.5 ) { 
	if( AMP_DELTA < 5009 ) { 
		if( MAX_AMP_LEFT < -6258 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -6258 ) { return new Prediction("LEFT", 70, 0); }
	}
		if( AMP_DELTA >= 5009 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 491.5 ) { 
	if( MAX_AMP_LEFT >= -1954.5 ) { 
	if( FIRST_LEFT_DETECTION >= 245.5 ) { 
		if( MAX_AMP_LEFT < -873.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT >= -873.5 ) { return new Prediction("LEFT", 18, 6); }
	}
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT < -1954.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4800.5 ) { return new Prediction("TOP", 11, 0); }
	}
	if( AVG_DX2_RIGHT < -2.26 ) { 
		if( MAX_DX2_LEFT >= 6583.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_LEFT < 6583.5 ) { 
		if( MAX_DX2_RIGHT >= 3342.5 ) { return new Prediction("LEFT", 76, 0); }
	if( MAX_DX2_RIGHT < 3342.5 ) { 
		if( DETECTION_DELTA < 22.5 ) { return new Prediction("LEFT", 7, 0); }
		if( DETECTION_DELTA >= 22.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7309 ) { 
	if( DETECTION_DELTA < 8 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_RIGHT >= 14747.5 ) { 
	if( MAX_AMP_RIGHT >= -2077 ) { 
	if( MAX_AMP_RIGHT < 21150.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 123.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 123.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 21150.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_AMP_RIGHT < -2077 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	if( MAX_DX2_RIGHT < 14747.5 ) { 
	if( FIRST_RIGHT_DETECTION < 136.5 ) { 
		if( MAX_DX2_LEFT < 10987.5 ) { return new Prediction("RIGHT", 12, 0); }
		if( MAX_DX2_LEFT >= 10987.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 136.5 ) { 
	if( AVG_AMP_LEFT < 9 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("TOP", 18, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
		if( AVG_DX2_RIGHT >= 0.63 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 0.63 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 9 ) { 
	if( MAX_AMP_LEFT < 10142.5 ) { 
		if( AVG_DX2_LEFT < 1.74 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_LEFT >= 1.74 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 10142.5 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AMP_DELTA >= 7504.5 ) { 
	if( MAX_DX2_LEFT < 33001.5 ) { 
	if( DX2_DELTA >= 18366 ) { 
		if( AVG_DX2_LEFT < 0.24 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.24 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DX2_DELTA < 18366 ) { return new Prediction("RIGHT", 152, 0); }
	}
		if( MAX_DX2_LEFT >= 33001.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AMP_DELTA < 7504.5 ) { 
	if( MAX_DX2_RIGHT >= 9347 ) { 
	if( FIRST_RIGHT_DETECTION < 224 ) { 
		if( AVG_DX2_RIGHT < 7.42 ) { return new Prediction("RIGHT", 10, 0); }
	if( AVG_DX2_RIGHT >= 7.42 ) { 
		if( FIRST_RIGHT_DETECTION >= 185 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 185 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 224 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_RIGHT < 9347 ) { 
		if( AVG_DX2_RIGHT < -2.28 ) { return new Prediction("RIGHT", 1, 0); }
	if( AVG_DX2_RIGHT >= -2.28 ) { 
		if( AVG_DX2_RIGHT >= 2.53 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 2.53 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 93, 0); }
	}
return null;
}
private Prediction runTree11() {
	if( MAX_DX2_LEFT >= 3769 ) { 
	if( MAX_DX2_RIGHT < 8455 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("TOP", 143, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_DX2_LEFT < 5643.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT >= 5643.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 8455 ) { 
	if( MAX_AMP_LEFT < 4575 ) { 
	if( AVG_AMP_LEFT < 3 ) { 
	if( FIRST_RIGHT_DETECTION < 280.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
		if( MAX_AMP_LEFT < -9210.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT >= -9210.5 ) { 
		if( MAX_DX2_RIGHT >= 8909.5 ) { return new Prediction("BOTTOM", 30, 0); }
		if( MAX_DX2_RIGHT < 8909.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( FIRST_RIGHT_DETECTION >= 280.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_AMP_LEFT >= 3 ) { 
	if( MAX_AMP_LEFT >= -6460.5 ) { 
		if( AMP_DELTA < 7609 ) { return new Prediction("LEFT", 10, 0); }
	if( AMP_DELTA >= 7609 ) { 
		if( MAX_DX2_RIGHT < 12590 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_RIGHT >= 12590 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < -6460.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 3, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4575 ) { 
	if( MAX_DX2_LEFT < 13261 ) { 
	if( DX2_DELTA >= 2703.5 ) { 
	if( AVG_DX2_LEFT < -5.08 ) { 
		if( MAX_AMP_LEFT < 7272.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT >= 7272.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	if( AVG_DX2_LEFT >= -5.08 ) { 
		if( FIRST_RIGHT_DETECTION < 248.5 ) { return new Prediction("RIGHT", 161, 0); }
	if( FIRST_RIGHT_DETECTION >= 248.5 ) { 
		if( AVG_DX2_LEFT < -1.35 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.35 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 2703.5 ) { 
		if( MAX_DX2_RIGHT < 12115 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_RIGHT >= 12115 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 13261 ) { 
	if( AMP_DELTA >= 14059.5 ) { 
		if( AVG_AMP_LEFT >= -13 ) { return new Prediction("RIGHT", 11, 0); }
		if( AVG_AMP_LEFT < -13 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AMP_DELTA < 14059.5 ) { 
		if( MAX_AMP_LEFT >= 11439.5 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_AMP_LEFT < 11439.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3769 ) { 
	if( MAX_DX2_RIGHT >= 5366 ) { 
	if( FIRST_LEFT_DETECTION < 163.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( DX2_DELTA < 2732.5 ) { 
		if( FIRST_LEFT_DETECTION >= 119 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 119 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 2732.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( DX2_DELTA >= 3957.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( DX2_DELTA < 3957.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 163.5 ) { 
	if( DX2_DELTA < 2913 ) { 
		if( AVG_AMP_RIGHT < 11.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_RIGHT >= 11.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( DX2_DELTA >= 2913 ) { 
	if( AVG_DX2_RIGHT >= -1.75 ) { 
		if( MAX_AMP_LEFT >= 4662 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < 4662 ) { return new Prediction("BOTTOM", 104, 0); }
	}
	if( AVG_DX2_RIGHT < -1.75 ) { 
	if( DETECTION_DELTA < 8 ) { 
		if( FIRST_LEFT_DETECTION < 181.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 181.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 26, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 5366 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( MAX_DX2_RIGHT >= 2422 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
		if( AMP_DELTA < 5030.5 ) { return new Prediction("LEFT", 157, 0); }
	if( AMP_DELTA >= 5030.5 ) { 
	if( MAX_AMP_RIGHT >= -40 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -40 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( MAX_AMP_LEFT < 4129.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_LEFT >= 4129.5 ) { 
		if( AVG_DX2_RIGHT >= 0.51 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 0.51 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 2422 ) { 
		if( MAX_AMP_RIGHT < -655 ) { return new Prediction("LEFT", 6, 0); }
	if( MAX_AMP_RIGHT >= -655 ) { 
	if( AMP_DELTA < 1831.5 ) { 
		if( MAX_AMP_RIGHT >= 622.5 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_AMP_RIGHT < 622.5 ) { 
		if( AMP_DELTA < 873.5 ) { return new Prediction("LEFT", 10, 2); }
		if( AMP_DELTA >= 873.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AMP_DELTA >= 1831.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
		if( AMP_DELTA >= 6183.5 ) { return new Prediction("BOTTOM", 23, 0); }
	}
	}
return null;
}
private Prediction runTree12() {
	if( AMP_DELTA < 6340.5 ) { 
	if( MAX_DX2_LEFT < 4900 ) { 
	if( MAX_DX2_RIGHT < 6543 ) { 
	if( DETECTION_DELTA < 536 ) { 
		if( AVG_DX2_RIGHT < -0.56 ) { return new Prediction("LEFT", 90, 0); }
	if( AVG_DX2_RIGHT >= -0.56 ) { 
	if( MAX_DX2_LEFT < 3160 ) { 
		if( AVG_AMP_RIGHT >= 13.5 ) { return new Prediction("LEFT", 30, 0); }
	if( AVG_AMP_RIGHT < 13.5 ) { 
	if( FIRST_RIGHT_DETECTION < 244 ) { 
		if( AMP_DELTA < 4389 ) { return new Prediction("LEFT", 31, 0); }
	if( AMP_DELTA >= 4389 ) { 
		if( FIRST_RIGHT_DETECTION < 153.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 153.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 244 ) { 
	if( DX2_DELTA >= 2428.5 ) { 
		if( MAX_AMP_RIGHT >= -1120.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < -1120.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( DX2_DELTA < 2428.5 ) { 
		if( MAX_DX2_LEFT >= 2126.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 2126.5 ) { 
		if( DETECTION_DELTA >= 180.5 ) { return new Prediction("LEFT", 9, 0); }
		if( DETECTION_DELTA < 180.5 ) { return new Prediction("LEFT", 11, 4); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3160 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
		if( MAX_DX2_RIGHT < 5901.5 ) { return new Prediction("TOP", 12, 0); }
		if( MAX_DX2_RIGHT >= 5901.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
		if( MAX_AMP_RIGHT < 8426 ) { return new Prediction("LEFT", 6, 0); }
		if( MAX_AMP_RIGHT >= 8426 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_DX2_RIGHT >= 6543 ) { 
	if( AVG_DX2_LEFT >= -1.14 ) { 
		if( FIRST_LEFT_DETECTION < 171.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( FIRST_LEFT_DETECTION >= 171.5 ) { 
		if( AVG_DX2_RIGHT >= 0.79 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 0.79 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( AVG_DX2_LEFT < -1.14 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 4900 ) { 
	if( MAX_DX2_RIGHT >= 10369 ) { 
	if( AVG_AMP_LEFT >= -3 ) { 
		if( FIRST_LEFT_DETECTION >= 170.5 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_LEFT_DETECTION < 170.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_RIGHT < 10369 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("LEFT", 1, 0); }
	if( DETECTION_DELTA >= 1 ) { 
	if( MAX_AMP_LEFT < 733.5 ) { 
		if( AMP_DELTA >= 5527.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA < 5527.5 ) { return new Prediction("TOP", 13, 0); }
	}
		if( MAX_AMP_LEFT >= 733.5 ) { return new Prediction("TOP", 96, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6340.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_DX2_LEFT < 4523 ) { return new Prediction("BOTTOM", 157, 0); }
	if( MAX_DX2_LEFT >= 4523 ) { 
	if( AVG_AMP_LEFT < 1 ) { 
		if( FIRST_RIGHT_DETECTION < 133.5 ) { return new Prediction("TOP", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 133.5 ) { 
		if( AVG_DX2_LEFT >= 2.8 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 2.8 ) { return new Prediction("BOTTOM", 27, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 1 ) { 
		if( AVG_AMP_RIGHT < 15.5 ) { return new Prediction("TOP", 8, 0); }
		if( AVG_AMP_RIGHT >= 15.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_RIGHT >= 11032 ) { 
	if( MAX_DX2_LEFT < 18248.5 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 126, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( MAX_DX2_LEFT < 10718 ) { return new Prediction("RIGHT", 35, 0); }
	if( MAX_DX2_LEFT >= 10718 ) { 
	if( AVG_AMP_LEFT >= -3 ) { 
		if( FIRST_LEFT_DETECTION >= 204.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 204.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 18248.5 ) { 
	if( MAX_DX2_RIGHT >= 26729.5 ) { 
		if( AVG_DX2_RIGHT >= -3.91 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -3.91 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 26729.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 11032 ) { 
	if( MAX_DX2_LEFT < 8145.5 ) { 
	if( MAX_DX2_LEFT < 2787.5 ) { 
		if( MAX_DX2_RIGHT >= 6318.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_RIGHT < 6318.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 2787.5 ) { 
	if( MAX_AMP_RIGHT < 2826 ) { 
		if( AVG_DX2_RIGHT < 1.36 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 1.36 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 2826 ) { return new Prediction("RIGHT", 32, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 8145.5 ) { return new Prediction("TOP", 51, 0); }
	}
	}
	}
return null;
}
private Prediction runTree13() {
	if( MAX_DX2_RIGHT < 6496.5 ) { 
	if( MAX_DX2_LEFT >= 3650.5 ) { 
	if( MAX_DX2_RIGHT >= 6119.5 ) { 
		if( MAX_DX2_RIGHT >= 6235.5 ) { return new Prediction("TOP", 13, 0); }
	if( MAX_DX2_RIGHT < 6235.5 ) { 
		if( FIRST_LEFT_DETECTION >= 165.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION < 165.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 6119.5 ) { return new Prediction("TOP", 111, 0); }
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( DX2_DELTA >= 2914.5 ) { 
	if( MAX_AMP_RIGHT >= -8835.5 ) { 
	if( FIRST_RIGHT_DETECTION < 230.5 ) { 
	if( AVG_DX2_LEFT >= -0.51 ) { 
	if( DETECTION_DELTA < 536 ) { 
	if( MAX_DX2_LEFT < 1030.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 185 ) { return new Prediction("LEFT", 6, 0); }
	if( FIRST_RIGHT_DETECTION < 185 ) { 
		if( FIRST_RIGHT_DETECTION < 163.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION >= 163.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 1030.5 ) { 
		if( DETECTION_DELTA < 9.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_DX2_LEFT < -0.51 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 230.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
		if( MAX_AMP_RIGHT < -8835.5 ) { return new Prediction("BOTTOM", 25, 0); }
	}
	if( DX2_DELTA < 2914.5 ) { 
	if( AMP_DELTA < 5488.5 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
		if( MAX_DX2_LEFT >= 2126.5 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_DX2_LEFT < 2126.5 ) { 
		if( DETECTION_DELTA >= 201 ) { return new Prediction("LEFT", 3, 0); }
		if( DETECTION_DELTA < 201 ) { return new Prediction("LEFT", 21, 5); }
	}
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( AVG_AMP_LEFT >= -35.5 ) { 
	if( AMP_DELTA < 4293.5 ) { 
		if( DX2_DELTA < 2536 ) { return new Prediction("LEFT", 119, 0); }
	if( DX2_DELTA >= 2536 ) { 
		if( FIRST_RIGHT_DETECTION >= 243 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 243 ) { return new Prediction("LEFT", 25, 0); }
	}
	}
	if( AMP_DELTA >= 4293.5 ) { 
		if( AVG_AMP_LEFT >= -3 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < -35.5 ) { 
		if( AVG_DX2_RIGHT < -3.82 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= -3.82 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
		if( AVG_DX2_LEFT < 0.71 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.71 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 19.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5488.5 ) { 
	if( AVG_AMP_RIGHT < -13.5 ) { 
		if( FIRST_LEFT_DETECTION < 184.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 184.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= -13.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6496.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= -23.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT >= 6015 ) { 
	if( MAX_AMP_RIGHT >= -14866 ) { 
	if( MAX_AMP_RIGHT >= 9332 ) { 
		if( MAX_AMP_RIGHT < 11656 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= 11656 ) { return new Prediction("TOP", 7, 0); }
	}
		if( MAX_AMP_RIGHT < 9332 ) { return new Prediction("TOP", 30, 0); }
	}
		if( MAX_AMP_RIGHT < -14866 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	if( MAX_DX2_LEFT < 6015 ) { 
	if( FIRST_RIGHT_DETECTION < 186.5 ) { 
	if( MAX_AMP_RIGHT < 11382 ) { 
		if( AVG_DX2_LEFT >= -2.8 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < -2.8 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 11382 ) { return new Prediction("RIGHT", 18, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 186.5 ) { 
		if( AVG_DX2_RIGHT >= -0.06 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < -0.06 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_DX2_LEFT < -3.3 ) { 
		if( MAX_DX2_LEFT >= 25663.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_DX2_LEFT < 25663.5 ) { 
		if( AVG_DX2_LEFT < -6.17 ) { return new Prediction("TOP", 1, 0); }
	if( AVG_DX2_LEFT >= -6.17 ) { 
	if( AVG_DX2_RIGHT >= 1.45 ) { 
		if( FIRST_LEFT_DETECTION >= 168 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 168 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 1.45 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	if( AVG_DX2_LEFT >= -3.3 ) { 
	if( FIRST_LEFT_DETECTION >= 157 ) { 
	if( DX2_DELTA < 5806 ) { 
		if( AMP_DELTA >= 8615.5 ) { return new Prediction("RIGHT", 15, 0); }
	if( AMP_DELTA < 8615.5 ) { 
	if( MAX_DX2_RIGHT >= 7798 ) { 
		if( MAX_AMP_LEFT < -10149.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= -10149.5 ) { return new Prediction("LEFT", 9, 0); }
	}
		if( MAX_DX2_RIGHT < 7798 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( DX2_DELTA >= 5806 ) { 
		if( AVG_DX2_RIGHT < -6.27 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -6.27 ) { return new Prediction("RIGHT", 72, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 157 ) { 
		if( AVG_AMP_LEFT < -18.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT >= -18.5 ) { return new Prediction("RIGHT", 79, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < -23.5 ) { 
	if( FIRST_RIGHT_DETECTION < 245 ) { 
		if( MAX_AMP_RIGHT < 2701.5 ) { return new Prediction("TOP", 24, 0); }
	if( MAX_AMP_RIGHT >= 2701.5 ) { 
		if( MAX_DX2_LEFT >= 14724.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT < 14724.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 245 ) { 
		if( FIRST_LEFT_DETECTION >= 274 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 274 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 109, 0); }
	}
return null;
}
private Prediction runTree14() {
	if( MAX_AMP_LEFT < 5035 ) { 
	if( MAX_DX2_RIGHT >= 5420.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
		if( MAX_AMP_RIGHT < -13500.5 ) { return new Prediction("BOTTOM", 8, 0); }
	if( MAX_AMP_RIGHT >= -13500.5 ) { 
	if( FIRST_LEFT_DETECTION >= 200.5 ) { 
		if( MAX_DX2_RIGHT < 6611 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_RIGHT >= 6611 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION < 200.5 ) { 
	if( MAX_AMP_RIGHT < 16856 ) { 
		if( MAX_AMP_RIGHT < -11823.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= -11823.5 ) { return new Prediction("TOP", 15, 0); }
	}
		if( MAX_AMP_RIGHT >= 16856 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= -5.5 ) { 
	if( AMP_DELTA < 5972.5 ) { 
	if( MAX_AMP_LEFT >= -7228 ) { 
	if( MAX_DX2_LEFT < 3692.5 ) { 
		if( AMP_DELTA >= 3845 ) { return new Prediction("RIGHT", 4, 0); }
		if( AMP_DELTA < 3845 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 3692.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( MAX_AMP_LEFT < -7228 ) { 
		if( MAX_DX2_RIGHT >= 16240 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT < 16240 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( AMP_DELTA >= 5972.5 ) { 
	if( DX2_DELTA < 12244.5 ) { 
	if( AVG_DX2_RIGHT < 7.88 ) { 
	if( FIRST_LEFT_DETECTION >= 236.5 ) { 
		if( AVG_DX2_LEFT >= -0.27 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < -0.27 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 236.5 ) { return new Prediction("RIGHT", 25, 0); }
	}
		if( AVG_DX2_RIGHT >= 7.88 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 12244.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( MAX_DX2_RIGHT >= 6323.5 ) { return new Prediction("BOTTOM", 120, 0); }
	if( MAX_DX2_RIGHT < 6323.5 ) { 
	if( FIRST_LEFT_DETECTION >= 172 ) { 
		if( AVG_AMP_RIGHT < 25.5 ) { return new Prediction("BOTTOM", 29, 0); }
		if( AVG_AMP_RIGHT >= 25.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( FIRST_LEFT_DETECTION < 172 ) { 
		if( AVG_DX2_LEFT < 1.13 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_LEFT >= 1.13 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 5420.5 ) { 
	if( AMP_DELTA < 5030.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 193.5 ) { 
	if( MAX_AMP_LEFT < -5711.5 ) { 
	if( FIRST_LEFT_DETECTION >= 212.5 ) { 
		if( AVG_DX2_RIGHT < 0.55 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.55 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 212.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_LEFT >= -5711.5 ) { 
	if( AVG_AMP_RIGHT >= 13 ) { 
		if( MAX_DX2_LEFT >= 4140 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 4140 ) { return new Prediction("LEFT", 36, 0); }
	}
	if( AVG_AMP_RIGHT < 13 ) { 
		if( MAX_AMP_LEFT < -2413.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_AMP_LEFT >= -2413.5 ) { 
	if( MAX_AMP_RIGHT < -655 ) { 
	if( AVG_AMP_RIGHT >= -3.5 ) { 
	if( MAX_AMP_LEFT >= 3119 ) { 
		if( AVG_DX2_RIGHT < -3.82 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT >= -3.82 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 3119 ) { 
		if( DETECTION_DELTA < 396.5 ) { return new Prediction("LEFT", 6, 0); }
		if( DETECTION_DELTA >= 396.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT < -3.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( MAX_AMP_RIGHT >= -655 ) { 
	if( DX2_DELTA >= 1639.5 ) { 
		if( AMP_DELTA < 2196.5 ) { return new Prediction("LEFT", 6, 0); }
		if( AMP_DELTA >= 2196.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DX2_DELTA < 1639.5 ) { 
		if( MAX_DX2_LEFT >= 1722 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 1722 ) { return new Prediction("TOP", 13, 7); }
	}
	}
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 193.5 ) { 
		if( DX2_DELTA >= 3637.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DX2_DELTA < 3637.5 ) { return new Prediction("LEFT", 93, 0); }
	}
	}
	if( AMP_DELTA >= 5030.5 ) { 
	if( MAX_DX2_LEFT < 3073 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( MAX_AMP_RIGHT < 6065 ) { 
		if( AVG_AMP_RIGHT >= 18 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_RIGHT < 18 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( MAX_AMP_RIGHT >= 6065 ) { 
	if( DETECTION_DELTA < 3 ) { 
		if( FIRST_LEFT_DETECTION < 225 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 225 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DETECTION_DELTA >= 3 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
		if( AMP_DELTA >= 6183.5 ) { return new Prediction("BOTTOM", 32, 0); }
	}
		if( MAX_DX2_LEFT >= 3073 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 5035 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_AMP_LEFT >= 7164 ) { return new Prediction("TOP", 112, 0); }
	if( MAX_AMP_LEFT < 7164 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( DX2_DELTA >= 3302 ) { 
		if( FIRST_LEFT_DETECTION >= 223.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 223.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
		if( DX2_DELTA < 3302 ) { return new Prediction("TOP", 3, 0); }
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( AVG_DX2_RIGHT >= -2.69 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_DX2_RIGHT < -2.69 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT >= 8642.5 ) { 
	if( AVG_AMP_LEFT < -8.5 ) { 
	if( DX2_DELTA < 16843.5 ) { 
		if( FIRST_RIGHT_DETECTION < 66 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 66 ) { return new Prediction("RIGHT", 18, 0); }
	}
		if( DX2_DELTA >= 16843.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 157, 0); }
	}
		if( MAX_DX2_RIGHT < 8642.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
return null;
}
private Prediction runTree15() {
	if( AMP_DELTA >= 6215.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_RIGHT < 7622.5 ) { 
		if( MAX_DX2_LEFT < 4361 ) { return new Prediction("BOTTOM", 78, 0); }
	if( MAX_DX2_LEFT >= 4361 ) { 
	if( FIRST_LEFT_DETECTION >= 190.5 ) { 
		if( DX2_DELTA >= 15585.5 ) { return new Prediction("TOP", 6, 0); }
		if( DX2_DELTA < 15585.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
		if( FIRST_LEFT_DETECTION < 190.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 7622.5 ) { 
		if( MAX_AMP_LEFT < 5493 ) { return new Prediction("BOTTOM", 115, 0); }
		if( MAX_AMP_LEFT >= 5493 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT >= 7220 ) { 
		if( MAX_AMP_RIGHT >= -15498.5 ) { return new Prediction("TOP", 48, 0); }
		if( MAX_AMP_RIGHT < -15498.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_LEFT < 7220 ) { 
	if( AMP_DELTA < 7649 ) { 
		if( FIRST_LEFT_DETECTION < 197.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 197.5 ) { 
		if( AVG_DX2_RIGHT < 0.36 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.36 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AMP_DELTA >= 7649 ) { return new Prediction("RIGHT", 19, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 7749.5 ) { 
		if( FIRST_LEFT_DETECTION >= 189 ) { return new Prediction("BOTTOM", 4, 0); }
		if( FIRST_LEFT_DETECTION < 189 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 7749.5 ) { 
	if( MAX_AMP_LEFT >= -20863.5 ) { 
	if( DX2_DELTA >= 17864 ) { 
		if( AVG_AMP_LEFT < -8.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( DX2_DELTA < 17864 ) { 
	if( FIRST_LEFT_DETECTION >= 231 ) { 
		if( AMP_DELTA < 7701 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA >= 7701 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( FIRST_LEFT_DETECTION < 231 ) { return new Prediction("RIGHT", 166, 0); }
	}
	}
		if( MAX_AMP_LEFT < -20863.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6215.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AVG_DX2_RIGHT < -0.03 ) { 
	if( MAX_DX2_LEFT < 3858 ) { 
	if( DX2_DELTA >= 3487.5 ) { 
		if( AVG_DX2_LEFT < -0.74 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.74 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( DX2_DELTA < 3487.5 ) { return new Prediction("LEFT", 104, 0); }
	}
	if( MAX_DX2_LEFT >= 3858 ) { 
		if( AVG_DX2_LEFT >= -4.48 ) { return new Prediction("TOP", 13, 0); }
		if( AVG_DX2_LEFT < -4.48 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -0.03 ) { 
	if( FIRST_LEFT_DETECTION < 272 ) { 
		if( DX2_DELTA >= 2807 ) { return new Prediction("TOP", 15, 0); }
	if( DX2_DELTA < 2807 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("LEFT", 4, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( AVG_DX2_LEFT < -0.14 ) { return new Prediction("TOP", 11, 0); }
	if( AVG_DX2_LEFT >= -0.14 ) { 
	if( MAX_AMP_LEFT < 2247.5 ) { 
		if( MAX_DX2_LEFT >= 3861 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_DX2_LEFT < 3861 ) { 
	if( DETECTION_DELTA >= 20 ) { 
		if( AMP_DELTA < 1831.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA >= 1831.5 ) { return new Prediction("TOP", 6, 0); }
	}
		if( DETECTION_DELTA < 20 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 2247.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
	if( FIRST_LEFT_DETECTION < 153 ) { 
		if( AVG_AMP_LEFT >= -11 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_AMP_LEFT < -11 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 153 ) { 
		if( AMP_DELTA >= 974.5 ) { return new Prediction("LEFT", 23, 0); }
	if( AMP_DELTA < 974.5 ) { 
		if( AVG_DX2_RIGHT >= 1.19 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 1.19 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 272 ) { 
	if( DETECTION_DELTA < 17 ) { 
	if( MAX_AMP_LEFT < 1691.5 ) { 
		if( MAX_DX2_LEFT < 1069 ) { return new Prediction("LEFT", 11, 3); }
		if( MAX_DX2_LEFT >= 1069 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 1691.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( DETECTION_DELTA >= 17 ) { 
	if( AVG_AMP_RIGHT < -11.5 ) { 
		if( MAX_AMP_RIGHT >= -4230.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT < -4230.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= -11.5 ) { return new Prediction("LEFT", 25, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AMP_DELTA >= 4086 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( MAX_DX2_LEFT < 6247.5 ) { 
		if( AVG_DX2_RIGHT >= -4.02 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < -4.02 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 6247.5 ) { return new Prediction("TOP", 9, 0); }
	}
	if( DETECTION_DELTA < 4.5 ) { 
		if( AVG_DX2_LEFT >= 0.89 ) { return new Prediction("LEFT", 6, 0); }
		if( AVG_DX2_LEFT < 0.89 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	if( AMP_DELTA < 4086 ) { 
		if( MAX_DX2_LEFT < 2815 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_DX2_LEFT >= 2815 ) { return new Prediction("TOP", 45, 0); }
	}
	}
	}
return null;
}
private Prediction runTree16() {
	if( DX2_DELTA < 3494 ) { 
	if( AVG_DX2_RIGHT >= 1.19 ) { 
	if( MAX_DX2_LEFT < 3587 ) { 
	if( AMP_DELTA >= 4399.5 ) { 
		if( AVG_DX2_RIGHT >= 1.3 ) { return new Prediction("BOTTOM", 25, 0); }
		if( AVG_DX2_RIGHT < 1.3 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA < 4399.5 ) { 
		if( AMP_DELTA >= 4112 ) { return new Prediction("RIGHT", 1, 0); }
		if( AMP_DELTA < 4112 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3587 ) { 
		if( MAX_DX2_RIGHT < 9073.5 ) { return new Prediction("TOP", 41, 0); }
	if( MAX_DX2_RIGHT >= 9073.5 ) { 
	if( DETECTION_DELTA >= 2 ) { 
		if( AVG_DX2_RIGHT >= 6.18 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT < 6.18 ) { return new Prediction("TOP", 3, 0); }
	}
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < 1.19 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AMP_DELTA < 6271 ) { 
	if( MAX_DX2_RIGHT >= 5367.5 ) { 
		if( DX2_DELTA < 2122.5 ) { return new Prediction("TOP", 10, 0); }
	if( DX2_DELTA >= 2122.5 ) { 
		if( AVG_DX2_RIGHT < 0.22 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.22 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5367.5 ) { 
		if( MAX_DX2_LEFT >= 3138 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_DX2_LEFT < 3138 ) { 
	if( FIRST_RIGHT_DETECTION >= 484 ) { 
	if( DX2_DELTA < 2126.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 14, 7); }
	}
		if( DX2_DELTA >= 2126.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 484 ) { 
	if( MAX_DX2_LEFT >= 2127 ) { 
		if( FIRST_LEFT_DETECTION < 227.5 ) { return new Prediction("LEFT", 16, 0); }
	if( FIRST_LEFT_DETECTION >= 227.5 ) { 
		if( AMP_DELTA < 2492.5 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA >= 2492.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT < 2127 ) { return new Prediction("LEFT", 41, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6271 ) { 
		if( MAX_DX2_LEFT < 4131 ) { return new Prediction("BOTTOM", 13, 0); }
	if( MAX_DX2_LEFT >= 4131 ) { 
		if( AVG_DX2_RIGHT < -1.53 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.53 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( MAX_DX2_LEFT < 5238.5 ) { 
	if( MAX_DX2_RIGHT < 6543 ) { 
	if( AVG_DX2_RIGHT >= -0.33 ) { 
		if( MAX_AMP_RIGHT < -9645.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_AMP_RIGHT >= -9645.5 ) { 
		if( MAX_AMP_LEFT < -1647 ) { return new Prediction("LEFT", 21, 0); }
	if( MAX_AMP_LEFT >= -1647 ) { 
		if( DX2_DELTA < 2074.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA >= 2074.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( AVG_DX2_RIGHT < -0.33 ) { return new Prediction("LEFT", 95, 0); }
	}
	if( MAX_DX2_RIGHT >= 6543 ) { 
		if( AVG_DX2_LEFT >= 0.23 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.23 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 5238.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 175 ) { 
		if( FIRST_RIGHT_DETECTION >= 212.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 212.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 175 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 3494 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( MAX_DX2_LEFT >= 9056 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_DX2_RIGHT < 12750 ) { return new Prediction("TOP", 42, 0); }
		if( MAX_DX2_RIGHT >= 12750 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 17496 ) { 
		if( AVG_AMP_LEFT >= 24 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_AMP_LEFT < 24 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 17496 ) { return new Prediction("RIGHT", 29, 0); }
	}
	}
	if( MAX_DX2_LEFT < 9056 ) { 
	if( MAX_DX2_LEFT >= 3096.5 ) { 
	if( DETECTION_DELTA >= 10 ) { 
		if( AMP_DELTA < 8739 ) { return new Prediction("TOP", 2, 0); }
		if( AMP_DELTA >= 8739 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( DETECTION_DELTA < 10 ) { 
		if( AVG_DX2_RIGHT < 7.12 ) { return new Prediction("RIGHT", 102, 0); }
	if( AVG_DX2_RIGHT >= 7.12 ) { 
		if( AVG_DX2_LEFT >= -0.97 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_LEFT < -0.97 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3096.5 ) { 
		if( MAX_DX2_LEFT >= 2319.5 ) { return new Prediction("BOTTOM", 11, 0); }
		if( MAX_DX2_LEFT < 2319.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AMP_DELTA >= 10506.5 ) { 
		if( MAX_AMP_RIGHT < -13440.5 ) { return new Prediction("BOTTOM", 13, 0); }
		if( MAX_AMP_RIGHT >= -13440.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AMP_DELTA < 10506.5 ) { 
		if( MAX_DX2_RIGHT < 14994.5 ) { return new Prediction("TOP", 46, 0); }
		if( MAX_DX2_RIGHT >= 14994.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_LEFT >= -9630 ) { 
	if( MAX_DX2_LEFT >= 17621 ) { 
		if( MAX_AMP_LEFT < 2331 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_LEFT >= 2331 ) { 
		if( FIRST_LEFT_DETECTION < 142 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 142 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 17621 ) { 
	if( DX2_DELTA < 4992 ) { 
		if( AVG_DX2_RIGHT < 3.46 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 3.46 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( DX2_DELTA >= 4992 ) { 
		if( DX2_DELTA < 17783.5 ) { return new Prediction("RIGHT", 51, 0); }
	if( DX2_DELTA >= 17783.5 ) { 
		if( AVG_DX2_RIGHT >= -0.48 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -0.48 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT < -9630 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( FIRST_RIGHT_DETECTION < 133.5 ) { 
	if( AVG_DX2_LEFT < 0.98 ) { 
		if( AVG_DX2_LEFT < -0.69 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.69 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_DX2_LEFT >= 0.98 ) { 
		if( AVG_DX2_RIGHT >= -0.52 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < -0.52 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 133.5 ) { 
	if( MAX_AMP_LEFT >= -7056.5 ) { 
		if( MAX_AMP_LEFT < 9140 ) { return new Prediction("BOTTOM", 133, 0); }
		if( MAX_AMP_LEFT >= 9140 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_LEFT < -7056.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree17() {
	if( AMP_DELTA < 5768 ) { 
	if( MAX_AMP_LEFT < 5178 ) { 
	if( MAX_DX2_RIGHT >= 1001 ) { 
	if( MAX_AMP_LEFT >= -5571.5 ) { 
	if( AVG_DX2_RIGHT < 3.26 ) { 
	if( DETECTION_DELTA < 535.5 ) { 
	if( DX2_DELTA >= 4311.5 ) { 
		if( AVG_DX2_LEFT < 1.74 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 1.74 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( DX2_DELTA < 4311.5 ) { 
	if( FIRST_RIGHT_DETECTION < 258 ) { 
		if( MAX_AMP_LEFT < 3859 ) { return new Prediction("LEFT", 156, 0); }
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( MAX_DX2_RIGHT >= 3541.5 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_DX2_RIGHT < 3541.5 ) { 
		if( AVG_DX2_LEFT < -0.21 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -0.21 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 258 ) { 
		if( DX2_DELTA >= 2428.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( DX2_DELTA < 2428.5 ) { 
		if( FIRST_LEFT_DETECTION < 279.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 279.5 ) { return new Prediction("LEFT", 16, 0); }
	}
	}
	}
	}
		if( DETECTION_DELTA >= 535.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= 3.26 ) { 
	if( AMP_DELTA >= 4232 ) { 
		if( FIRST_RIGHT_DETECTION < 166.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 166.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AMP_DELTA < 4232 ) { 
		if( FIRST_LEFT_DETECTION >= 198.5 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_LEFT_DETECTION < 198.5 ) { 
		if( AVG_DX2_LEFT < 1.08 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 1.08 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < -5571.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_AMP_RIGHT < 7.5 ) { 
		if( MAX_DX2_LEFT >= 3861 ) { return new Prediction("TOP", 18, 0); }
		if( MAX_DX2_LEFT < 3861 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AVG_AMP_RIGHT >= 7.5 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 1001 ) { 
		if( FIRST_LEFT_DETECTION < 465.5 ) { return new Prediction("TOP", 7, 0); }
		if( FIRST_LEFT_DETECTION >= 465.5 ) { return new Prediction("TOP", 21, 12); }
	}
	}
	if( MAX_AMP_LEFT >= 5178 ) { 
	if( AMP_DELTA >= 4457 ) { 
	if( AVG_AMP_RIGHT >= -23 ) { 
		if( MAX_DX2_RIGHT >= 10269 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_RIGHT < 10269 ) { return new Prediction("TOP", 7, 0); }
	}
		if( AVG_AMP_RIGHT < -23 ) { return new Prediction("TOP", 9, 0); }
	}
		if( AMP_DELTA < 4457 ) { return new Prediction("TOP", 71, 0); }
	}
	}
	if( AMP_DELTA >= 5768 ) { 
	if( MAX_DX2_RIGHT >= 8535.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( AMP_DELTA >= 9375 ) { return new Prediction("BOTTOM", 54, 0); }
	if( AMP_DELTA < 9375 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AVG_AMP_RIGHT >= 34.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT < 34.5 ) { return new Prediction("TOP", 11, 0); }
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( DX2_DELTA >= 17864 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 17864 ) { return new Prediction("RIGHT", 51, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 1.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( MAX_DX2_LEFT >= 12258.5 ) { 
		if( AMP_DELTA >= 14059.5 ) { return new Prediction("RIGHT", 11, 0); }
	if( AMP_DELTA < 14059.5 ) { 
		if( MAX_AMP_RIGHT < -17594 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT >= -17594 ) { return new Prediction("TOP", 8, 0); }
	}
	}
		if( MAX_DX2_LEFT < 12258.5 ) { return new Prediction("RIGHT", 117, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 8535.5 ) { 
		if( MAX_DX2_LEFT >= 4377 ) { return new Prediction("TOP", 60, 0); }
	if( MAX_DX2_LEFT < 4377 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT < 3824 ) { 
		if( FIRST_LEFT_DETECTION >= 199 ) { return new Prediction("BOTTOM", 7, 0); }
		if( FIRST_LEFT_DETECTION < 199 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 3824 ) { 
		if( AMP_DELTA >= 6133.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( AMP_DELTA < 6133.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 120, 0); }
	}
	}
	}
return null;
}
private Prediction runTree18() {
	if( AMP_DELTA >= 5123.5 ) { 
	if( MAX_AMP_LEFT >= 4804.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( MAX_DX2_RIGHT < 8059.5 ) { return new Prediction("TOP", 54, 0); }
	if( MAX_DX2_RIGHT >= 8059.5 ) { 
		if( MAX_DX2_LEFT < 8525.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_LEFT >= 8525.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
		if( MAX_AMP_LEFT >= 17606 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_AMP_LEFT < 17606 ) { 
	if( DX2_DELTA >= 18366 ) { 
		if( FIRST_LEFT_DETECTION >= 167.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 167.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( DX2_DELTA < 18366 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 114, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
	if( FIRST_LEFT_DETECTION >= 217.5 ) { 
		if( MAX_AMP_RIGHT < 1193 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= 1193 ) { return new Prediction("RIGHT", 8, 0); }
	}
		if( FIRST_LEFT_DETECTION < 217.5 ) { return new Prediction("RIGHT", 34, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 4804.5 ) { 
	if( MAX_AMP_LEFT < -7344.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 19, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 11, 0); }
	}
	if( MAX_AMP_LEFT >= -7344.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AMP_DELTA >= 6196.5 ) { 
	if( MAX_DX2_RIGHT < 15992.5 ) { 
	if( AMP_DELTA < 7765 ) { 
	if( MAX_DX2_LEFT < 2761 ) { 
		if( FIRST_RIGHT_DETECTION < 136.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 136.5 ) { return new Prediction("BOTTOM", 33, 0); }
	}
	if( MAX_DX2_LEFT >= 2761 ) { 
		if( AVG_DX2_RIGHT < 2.23 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT >= 2.23 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AMP_DELTA >= 7765 ) { return new Prediction("BOTTOM", 121, 0); }
	}
	if( MAX_DX2_RIGHT >= 15992.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
	}
	if( AMP_DELTA < 6196.5 ) { 
		if( AVG_DX2_RIGHT < 0.8 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT >= 0.8 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( FIRST_LEFT_DETECTION >= 146 ) { 
		if( AVG_DX2_LEFT >= 0.09 ) { return new Prediction("LEFT", 4, 0); }
	if( AVG_DX2_LEFT < 0.09 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( MAX_DX2_RIGHT < 4296.5 ) { 
		if( AVG_DX2_RIGHT < -0.46 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT >= -0.46 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 4296.5 ) { 
	if( MAX_AMP_RIGHT < 11846 ) { 
	if( MAX_DX2_RIGHT < 14325 ) { 
		if( MAX_DX2_LEFT < 2285 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_DX2_LEFT >= 2285 ) { 
		if( MAX_AMP_LEFT < 4574 ) { return new Prediction("BOTTOM", 12, 0); }
		if( MAX_AMP_LEFT >= 4574 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 14325 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 11846 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( AVG_AMP_RIGHT < 16.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 146 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5123.5 ) { 
	if( MAX_DX2_LEFT >= 4656.5 ) { 
		if( MAX_AMP_LEFT >= 6092.5 ) { return new Prediction("TOP", 88, 0); }
	if( MAX_AMP_LEFT < 6092.5 ) { 
	if( AVG_AMP_RIGHT >= -0.5 ) { 
	if( AVG_DX2_LEFT >= -0.67 ) { 
		if( FIRST_RIGHT_DETECTION >= 179.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 179.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_LEFT < -0.67 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_AMP_RIGHT < -0.5 ) { return new Prediction("TOP", 12, 0); }
	}
	}
	if( MAX_DX2_LEFT < 4656.5 ) { 
	if( AVG_AMP_RIGHT < 10.5 ) { 
	if( MAX_DX2_LEFT >= 2126.5 ) { 
	if( AVG_AMP_RIGHT >= 3.5 ) { 
	if( FIRST_LEFT_DETECTION < 228 ) { 
		if( MAX_DX2_LEFT < 2991 ) { return new Prediction("LEFT", 5, 0); }
	if( MAX_DX2_LEFT >= 2991 ) { 
		if( AVG_DX2_RIGHT < 4.35 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= 4.35 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 228 ) { 
		if( FIRST_LEFT_DETECTION >= 245.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 3.5 ) { 
	if( FIRST_RIGHT_DETECTION < 215 ) { 
	if( AVG_DX2_LEFT >= 1.01 ) { 
		if( AVG_AMP_LEFT < -29 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT >= -29 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AVG_DX2_LEFT < 1.01 ) { 
		if( AVG_DX2_RIGHT >= 3.99 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.99 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 215 ) { 
		if( DX2_DELTA >= 786 ) { return new Prediction("TOP", 13, 0); }
	if( DX2_DELTA < 786 ) { 
		if( FIRST_LEFT_DETECTION < 274.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 274.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2126.5 ) { 
	if( AMP_DELTA >= 202.5 ) { 
		if( MAX_DX2_RIGHT >= 3245 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_DX2_RIGHT < 3245 ) { 
	if( MAX_DX2_LEFT < 1000 ) { 
		if( MAX_AMP_RIGHT < -3783.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_AMP_RIGHT >= -3783.5 ) { 
	if( AMP_DELTA < 2405 ) { 
		if( AVG_AMP_RIGHT < -1 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_RIGHT >= -1 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( AMP_DELTA >= 2405 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 1000 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
		if( AMP_DELTA < 202.5 ) { return new Prediction("LEFT", 10, 4); }
	}
	}
	if( AVG_AMP_RIGHT >= 10.5 ) { 
		if( DX2_DELTA < 2843.5 ) { return new Prediction("LEFT", 115, 0); }
	if( DX2_DELTA >= 2843.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 170.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 229 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 229 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 170.5 ) { 
		if( AVG_DX2_LEFT < -0.22 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.22 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree19() {
	if( MAX_DX2_LEFT >= 3573 ) { 
	if( AMP_DELTA < 7083 ) { 
	if( MAX_DX2_RIGHT < 7310.5 ) { 
	if( AMP_DELTA >= 3417 ) { 
		if( MAX_DX2_LEFT >= 4655 ) { return new Prediction("TOP", 41, 0); }
	if( MAX_DX2_LEFT < 4655 ) { 
		if( FIRST_RIGHT_DETECTION >= 435 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 435 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
		if( AMP_DELTA < 3417 ) { return new Prediction("TOP", 69, 0); }
	}
	if( MAX_DX2_RIGHT >= 7310.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_AMP_LEFT >= 2.5 ) { 
		if( AVG_AMP_RIGHT >= 24 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT < 24 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AVG_DX2_RIGHT >= -1.45 ) { 
	if( MAX_DX2_LEFT < 6476 ) { 
		if( MAX_AMP_RIGHT < 8007.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= 8007.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_DX2_LEFT >= 6476 ) { return new Prediction("TOP", 7, 0); }
	}
		if( AVG_DX2_RIGHT < -1.45 ) { return new Prediction("TOP", 19, 0); }
	}
	}
	}
	if( AMP_DELTA >= 7083 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 10818.5 ) { 
	if( AMP_DELTA >= 9801 ) { 
		if( MAX_AMP_LEFT < -13607 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT >= -13607 ) { 
	if( MAX_AMP_RIGHT >= 16931 ) { 
		if( AVG_AMP_LEFT < 9.5 ) { return new Prediction("BOTTOM", 12, 0); }
		if( AVG_AMP_LEFT >= 9.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_RIGHT < 16931 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	}
	if( AMP_DELTA < 9801 ) { 
	if( DX2_DELTA < 7519 ) { 
		if( MAX_AMP_LEFT < 1113.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_AMP_LEFT >= 1113.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
		if( DX2_DELTA >= 7519 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 10818.5 ) { return new Prediction("TOP", 43, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT >= -19 ) { 
	if( AVG_AMP_LEFT >= 15.5 ) { 
		if( MAX_DX2_LEFT < 10429.5 ) { return new Prediction("RIGHT", 56, 0); }
	if( MAX_DX2_LEFT >= 10429.5 ) { 
	if( MAX_DX2_RIGHT < 22616.5 ) { 
		if( AVG_DX2_RIGHT >= 0.82 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT < 0.82 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 22616.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
		if( AVG_AMP_LEFT < 15.5 ) { return new Prediction("RIGHT", 105, 0); }
	}
	if( AVG_AMP_LEFT < -19 ) { 
	if( DX2_DELTA >= 11905.5 ) { 
		if( MAX_DX2_LEFT >= 16285.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 16285.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA < 11905.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3573 ) { 
	if( MAX_DX2_RIGHT >= 4936 ) { 
	if( DX2_DELTA < 3864.5 ) { 
	if( AVG_AMP_RIGHT < 24.5 ) { 
	if( FIRST_RIGHT_DETECTION < 166 ) { 
		if( AVG_DX2_RIGHT >= 1.76 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_DX2_RIGHT < 1.76 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 166 ) { 
		if( AMP_DELTA < 5449 ) { return new Prediction("LEFT", 2, 0); }
	if( AMP_DELTA >= 5449 ) { 
		if( MAX_AMP_LEFT < 2959 ) { return new Prediction("BOTTOM", 33, 0); }
		if( MAX_AMP_LEFT >= 2959 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( AVG_AMP_RIGHT >= 24.5 ) { return new Prediction("LEFT", 28, 0); }
	}
	if( DX2_DELTA >= 3864.5 ) { 
	if( AMP_DELTA < 6801 ) { 
		if( FIRST_LEFT_DETECTION < 178 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 178 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AMP_DELTA >= 6801 ) { 
		if( MAX_AMP_LEFT < 5213.5 ) { return new Prediction("BOTTOM", 105, 0); }
		if( MAX_AMP_LEFT >= 5213.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 4936 ) { 
		if( AMP_DELTA >= 6120.5 ) { return new Prediction("BOTTOM", 19, 0); }
	if( AMP_DELTA < 6120.5 ) { 
	if( MAX_DX2_RIGHT >= 1001 ) { 
	if( MAX_DX2_LEFT >= 3377.5 ) { 
		if( MAX_DX2_LEFT >= 3478 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 3478 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_LEFT < 3377.5 ) { 
	if( FIRST_RIGHT_DETECTION < 249.5 ) { 
		if( DETECTION_DELTA >= 541 ) { return new Prediction("RIGHT", 1, 0); }
	if( DETECTION_DELTA < 541 ) { 
		if( AVG_AMP_RIGHT >= -10.5 ) { return new Prediction("LEFT", 103, 0); }
	if( AVG_AMP_RIGHT < -10.5 ) { 
		if( DETECTION_DELTA < 325 ) { return new Prediction("LEFT", 13, 0); }
		if( DETECTION_DELTA >= 325 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 249.5 ) { 
	if( MAX_AMP_LEFT >= -4526 ) { 
	if( DX2_DELTA < 2347 ) { 
		if( MAX_AMP_RIGHT >= 7162 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_RIGHT < 7162 ) { return new Prediction("LEFT", 25, 0); }
	}
	if( DX2_DELTA >= 2347 ) { 
		if( MAX_DX2_RIGHT < 3675 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT >= 3675 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT < -4526 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 1001 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( FIRST_LEFT_DETECTION >= 461 ) { return new Prediction("TOP", 13, 6); }
		if( FIRST_LEFT_DETECTION < 461 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree20() {
	if( MAX_AMP_LEFT < 4435.5 ) { 
	if( DX2_DELTA >= 3282 ) { 
	if( AMP_DELTA < 6526.5 ) { 
	if( MAX_AMP_RIGHT >= -5013.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 155 ) { 
	if( DETECTION_DELTA >= 21 ) { 
		if( FIRST_LEFT_DETECTION < 197 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 197 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( DETECTION_DELTA < 21 ) { return new Prediction("LEFT", 15, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 155 ) { 
		if( AMP_DELTA >= 4067 ) { return new Prediction("RIGHT", 12, 0); }
		if( AMP_DELTA < 4067 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -5013.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( AMP_DELTA >= 6526.5 ) { 
	if( MAX_AMP_LEFT < -7367 ) { 
		if( MAX_DX2_RIGHT >= 16551.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( MAX_DX2_RIGHT < 16551.5 ) { return new Prediction("TOP", 14, 0); }
	}
	if( MAX_AMP_LEFT >= -7367 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( MAX_AMP_RIGHT >= 12366 ) { return new Prediction("RIGHT", 5, 0); }
	if( MAX_AMP_RIGHT < 12366 ) { 
		if( DX2_DELTA < 4689 ) { return new Prediction("RIGHT", 1, 0); }
		if( DX2_DELTA >= 4689 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( DX2_DELTA >= 3557 ) { 
		if( MAX_DX2_RIGHT < 15966.5 ) { return new Prediction("BOTTOM", 127, 0); }
	if( MAX_DX2_RIGHT >= 15966.5 ) { 
		if( AVG_AMP_LEFT < -5 ) { return new Prediction("BOTTOM", 8, 0); }
		if( AVG_AMP_LEFT >= -5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DX2_DELTA < 3557 ) { 
		if( MAX_DX2_LEFT >= 2666.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 2666.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA < 3282 ) { 
	if( MAX_AMP_RIGHT < -8973.5 ) { 
		if( FIRST_LEFT_DETECTION >= 219 ) { return new Prediction("BOTTOM", 15, 0); }
	if( FIRST_LEFT_DETECTION < 219 ) { 
	if( MAX_DX2_LEFT < 7203 ) { 
		if( MAX_AMP_LEFT >= -137.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < -137.5 ) { return new Prediction("LEFT", 9, 0); }
	}
		if( MAX_DX2_LEFT >= 7203 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -8973.5 ) { 
	if( MAX_AMP_RIGHT >= 9480 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
		if( FIRST_LEFT_DETECTION >= 173 ) { return new Prediction("BOTTOM", 5, 0); }
		if( FIRST_LEFT_DETECTION < 173 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_AMP_RIGHT < -12.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_AMP_RIGHT < 9480 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( MAX_AMP_LEFT < -5642.5 ) { 
		if( FIRST_LEFT_DETECTION >= 182.5 ) { return new Prediction("TOP", 7, 0); }
		if( FIRST_LEFT_DETECTION < 182.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( MAX_AMP_LEFT >= -5642.5 ) { 
	if( AMP_DELTA >= 590 ) { 
	if( MAX_DX2_LEFT >= 2336.5 ) { 
	if( MAX_AMP_RIGHT < 1365 ) { 
		if( AVG_DX2_RIGHT >= -3.8 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_DX2_RIGHT < -3.8 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_AMP_RIGHT >= 1365 ) { 
		if( MAX_AMP_RIGHT < 7694 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_RIGHT >= 7694 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 2336.5 ) { 
		if( AMP_DELTA < 3803.5 ) { return new Prediction("LEFT", 35, 0); }
	if( AMP_DELTA >= 3803.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 255 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 255 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	if( AMP_DELTA < 590 ) { 
	if( AVG_DX2_LEFT < 0.49 ) { 
		if( AVG_AMP_LEFT < 1 ) { return new Prediction("LEFT", 18, 10); }
		if( AVG_AMP_LEFT >= 1 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= 0.49 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
		if( AMP_DELTA < 4228.5 ) { return new Prediction("LEFT", 107, 0); }
	if( AMP_DELTA >= 4228.5 ) { 
		if( MAX_AMP_LEFT >= -1227.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_LEFT < -1227.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4435.5 ) { 
	if( MAX_AMP_LEFT >= 10395 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("TOP", 129, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
	if( FIRST_RIGHT_DETECTION < 132.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 93 ) { return new Prediction("TOP", 5, 0); }
	if( FIRST_RIGHT_DETECTION < 93 ) { 
		if( AVG_DX2_LEFT >= -2.03 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < -2.03 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 132.5 ) { 
		if( AVG_DX2_LEFT < -1.48 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -1.48 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 10395 ) { 
	if( MAX_DX2_RIGHT >= 7783 ) { 
	if( MAX_DX2_LEFT < 10718 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( AMP_DELTA >= 2470 ) { return new Prediction("RIGHT", 143, 0); }
		if( AMP_DELTA < 2470 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
		if( FIRST_LEFT_DETECTION >= 162.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 162.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 10718 ) { 
	if( FIRST_LEFT_DETECTION < 240 ) { 
		if( FIRST_RIGHT_DETECTION >= 116.5 ) { return new Prediction("RIGHT", 19, 0); }
	if( FIRST_RIGHT_DETECTION < 116.5 ) { 
		if( AVG_AMP_LEFT < -18.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT >= -18.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 240 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 7783 ) { 
		if( AVG_DX2_RIGHT < -3.44 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= -3.44 ) { return new Prediction("TOP", 36, 0); }
	}
	}
	}
return null;
}
private Prediction runTree21() {
	if( AMP_DELTA >= 6433.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT >= 5691 ) { 
		if( MAX_DX2_LEFT < 5760.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 5760.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_AMP_LEFT < 5691 ) { 
	if( AMP_DELTA < 20357 ) { 
	if( AVG_DX2_LEFT >= 1.01 ) { 
		if( MAX_DX2_LEFT < 16190.5 ) { return new Prediction("BOTTOM", 12, 0); }
		if( MAX_DX2_LEFT >= 16190.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < 1.01 ) { return new Prediction("BOTTOM", 179, 0); }
	}
		if( AMP_DELTA >= 20357 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < 13096.5 ) { 
	if( MAX_DX2_LEFT < 17668.5 ) { 
	if( MAX_DX2_LEFT >= 10984 ) { 
		if( AVG_AMP_LEFT >= -12 ) { return new Prediction("RIGHT", 31, 0); }
	if( AVG_AMP_LEFT < -12 ) { 
	if( AVG_DX2_LEFT >= -1.28 ) { 
		if( AVG_DX2_RIGHT >= -2.65 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT < -2.65 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < -1.28 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT < 10984 ) { return new Prediction("RIGHT", 156, 0); }
	}
	if( MAX_DX2_LEFT >= 17668.5 ) { 
	if( MAX_DX2_RIGHT >= 29963 ) { 
		if( AVG_AMP_RIGHT >= -12 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_RIGHT < -12 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 29963 ) { return new Prediction("TOP", 12, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 13096.5 ) { return new Prediction("TOP", 44, 0); }
	}
	}
	if( AMP_DELTA < 6433.5 ) { 
	if( DX2_DELTA < 3511.5 ) { 
	if( MAX_DX2_RIGHT < 5467.5 ) { 
	if( MAX_DX2_LEFT < 3609 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
	if( MAX_DX2_LEFT < 1063 ) { 
		if( FIRST_RIGHT_DETECTION >= 449.5 ) { return new Prediction("LEFT", 16, 8); }
		if( FIRST_RIGHT_DETECTION < 449.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 1063 ) { return new Prediction("TOP", 11, 0); }
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( AVG_DX2_LEFT < 0.98 ) { 
	if( AVG_DX2_RIGHT >= 1.74 ) { 
		if( AVG_AMP_LEFT >= -1.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_AMP_LEFT < -1.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AVG_DX2_RIGHT < 1.74 ) { 
	if( FIRST_RIGHT_DETECTION < 285 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("LEFT", 134, 0); }
	if( AVG_AMP_LEFT >= 8.5 ) { 
		if( AVG_DX2_RIGHT >= -1.75 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -1.75 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 285 ) { 
	if( FIRST_LEFT_DETECTION >= 322 ) { 
		if( DX2_DELTA >= 2199 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 2199 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 322 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_DX2_LEFT >= 0.98 ) { 
	if( DX2_DELTA >= 567 ) { 
		if( AVG_DX2_RIGHT >= 2.05 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 2.05 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( DX2_DELTA < 567 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 3609 ) { return new Prediction("TOP", 16, 0); }
	}
	if( MAX_DX2_RIGHT >= 5467.5 ) { 
		if( AMP_DELTA < 1965.5 ) { return new Prediction("TOP", 23, 0); }
	if( AMP_DELTA >= 1965.5 ) { 
	if( DX2_DELTA >= 2339.5 ) { 
		if( MAX_DX2_RIGHT < 5476.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_DX2_RIGHT >= 5476.5 ) { 
		if( MAX_AMP_LEFT >= 7929 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT < 7929 ) { return new Prediction("LEFT", 26, 0); }
	}
	}
	if( DX2_DELTA < 2339.5 ) { 
		if( MAX_DX2_LEFT >= 4707.5 ) { return new Prediction("TOP", 12, 0); }
		if( MAX_DX2_LEFT < 4707.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 3511.5 ) { 
	if( AVG_AMP_RIGHT >= 12 ) { 
		if( AVG_DX2_RIGHT < -5.54 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT >= -5.54 ) { 
		if( MAX_DX2_LEFT < 7313.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_LEFT >= 7313.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 12 ) { 
	if( FIRST_LEFT_DETECTION < 227.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AMP_DELTA < 6314.5 ) { 
	if( MAX_AMP_LEFT < 7220.5 ) { 
		if( AVG_DX2_RIGHT < 3.17 ) { return new Prediction("TOP", 13, 0); }
		if( AVG_DX2_RIGHT >= 3.17 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 7220.5 ) { return new Prediction("TOP", 55, 0); }
	}
		if( AMP_DELTA >= 6314.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 227.5 ) { 
		if( AVG_DX2_RIGHT < -0.55 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.55 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree22() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_RIGHT >= 11623.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
		if( MAX_DX2_LEFT >= 21589.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 21589.5 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	if( AVG_AMP_LEFT >= 2.5 ) { 
		if( AVG_DX2_RIGHT >= 0.82 ) { return new Prediction("RIGHT", 9, 0); }
	if( AVG_DX2_RIGHT < 0.82 ) { 
		if( FIRST_RIGHT_DETECTION >= 123.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION < 123.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_DX2_RIGHT < 8.92 ) { 
	if( MAX_DX2_LEFT >= 28035.5 ) { 
		if( AVG_DX2_LEFT >= -2.79 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT < -2.79 ) { return new Prediction("TOP", 6, 0); }
	}
	if( MAX_DX2_LEFT < 28035.5 ) { 
		if( DX2_DELTA < 17783.5 ) { return new Prediction("RIGHT", 143, 0); }
	if( DX2_DELTA >= 17783.5 ) { 
		if( MAX_DX2_LEFT >= 12902.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT < 12902.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 8.92 ) { 
		if( AVG_DX2_RIGHT < 9.43 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT >= 9.43 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 11623.5 ) { 
	if( MAX_DX2_LEFT < 4847 ) { 
	if( MAX_DX2_RIGHT >= 6330 ) { 
	if( AMP_DELTA >= 3654 ) { 
	if( MAX_AMP_LEFT >= 266.5 ) { 
	if( MAX_DX2_RIGHT < 8421 ) { 
		if( AVG_DX2_LEFT >= 0.9 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_LEFT < 0.9 ) { 
		if( FIRST_LEFT_DETECTION >= 244.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 244.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 8421 ) { return new Prediction("RIGHT", 27, 0); }
	}
		if( MAX_AMP_LEFT < 266.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( AMP_DELTA < 3654 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_RIGHT < 6330 ) { 
	if( MAX_AMP_LEFT >= -2762.5 ) { 
		if( AVG_AMP_RIGHT >= 27 ) { return new Prediction("LEFT", 7, 0); }
	if( AVG_AMP_RIGHT < 27 ) { 
	if( DX2_DELTA < 2178.5 ) { 
	if( MAX_DX2_RIGHT >= 3598.5 ) { 
		if( MAX_DX2_LEFT < 2840.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2840.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_DX2_RIGHT < 3598.5 ) { 
		if( MAX_AMP_RIGHT >= 7451.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_RIGHT < 7451.5 ) { 
	if( AVG_DX2_RIGHT < 1.18 ) { 
		if( MAX_DX2_LEFT >= 1038 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 1038 ) { return new Prediction("LEFT", 11, 5); }
	}
		if( AVG_DX2_RIGHT >= 1.18 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( DX2_DELTA >= 2178.5 ) { 
		if( MAX_AMP_LEFT >= 4187.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_LEFT < 4187.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < -2762.5 ) { return new Prediction("LEFT", 27, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 4847 ) { 
	if( MAX_AMP_LEFT < 6225 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("TOP", 23, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_RIGHT < 8792.5 ) { 
		if( MAX_DX2_LEFT >= 9701 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 9701 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= 8792.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 6225 ) { return new Prediction("TOP", 140, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( AMP_DELTA < 5646.5 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
	if( MAX_DX2_LEFT < 4302 ) { 
	if( FIRST_RIGHT_DETECTION < 249.5 ) { 
		if( DETECTION_DELTA < 535.5 ) { return new Prediction("LEFT", 102, 0); }
		if( DETECTION_DELTA >= 535.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 249.5 ) { 
	if( FIRST_LEFT_DETECTION < 277 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( FIRST_LEFT_DETECTION < 264.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 264.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 4, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 277 ) { 
		if( DX2_DELTA < 2347 ) { return new Prediction("LEFT", 13, 0); }
		if( DX2_DELTA >= 2347 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 4302 ) { return new Prediction("TOP", 5, 0); }
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_AMP_LEFT < 4575.5 ) { 
	if( AVG_DX2_LEFT >= 1.24 ) { 
		if( AVG_DX2_RIGHT >= -2.71 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT < -2.71 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_DX2_LEFT < 1.24 ) { 
		if( MAX_DX2_RIGHT < 2950.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_RIGHT >= 2950.5 ) { 
		if( AVG_DX2_RIGHT < 2.02 ) { return new Prediction("LEFT", 22, 0); }
		if( AVG_DX2_RIGHT >= 2.02 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 4575.5 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	if( AMP_DELTA >= 5646.5 ) { 
	if( MAX_DX2_RIGHT >= 3386.5 ) { 
	if( DX2_DELTA >= 8743.5 ) { 
		if( FIRST_LEFT_DETECTION >= 182.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( FIRST_LEFT_DETECTION < 182.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DX2_DELTA < 8743.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 91 ) { return new Prediction("BOTTOM", 155, 0); }
		if( FIRST_RIGHT_DETECTION < 91 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 3386.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
return null;
}
private Prediction runTree23() {
	if( MAX_DX2_LEFT < 3574.5 ) { 
	if( MAX_DX2_RIGHT >= 6301.5 ) { 
	if( AVG_AMP_LEFT >= -24.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 233 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 233 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("BOTTOM", 103, 0); }
	}
		if( AVG_AMP_LEFT < -24.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT < 6301.5 ) { 
	if( AVG_AMP_RIGHT < 15.5 ) { 
	if( FIRST_RIGHT_DETECTION < 165 ) { 
		if( MAX_AMP_LEFT >= 3809.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT < 3809.5 ) { return new Prediction("LEFT", 33, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 165 ) { 
	if( MAX_DX2_RIGHT < 4625 ) { 
	if( AVG_AMP_RIGHT >= -0.5 ) { 
	if( AVG_AMP_RIGHT >= 3.5 ) { 
	if( DETECTION_DELTA >= 22 ) { 
	if( AVG_DX2_RIGHT >= -2.21 ) { 
		if( DX2_DELTA >= 3014.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 3014.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < -2.21 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 22 ) { 
		if( MAX_AMP_RIGHT >= 5986.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < 5986.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 3.5 ) { 
		if( AVG_DX2_LEFT < -0.33 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT >= -0.33 ) { 
	if( MAX_AMP_LEFT >= -1954.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
	if( AVG_AMP_LEFT >= -1.5 ) { 
		if( MAX_AMP_RIGHT < -655 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_AMP_RIGHT >= -655 ) { 
		if( FIRST_RIGHT_DETECTION < 472 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 472 ) { return new Prediction("LEFT", 7, 3); }
	}
	}
		if( AVG_AMP_LEFT < -1.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_LEFT < -1954.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < -0.5 ) { 
		if( DX2_DELTA < 2328.5 ) { return new Prediction("LEFT", 25, 0); }
		if( DX2_DELTA >= 2328.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 4625 ) { 
		if( AMP_DELTA < 5134 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA >= 5134 ) { return new Prediction("BOTTOM", 44, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 15.5 ) { 
	if( AMP_DELTA >= 4261 ) { 
	if( MAX_AMP_RIGHT >= -454 ) { 
		if( MAX_DX2_LEFT < 2630.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( MAX_DX2_LEFT >= 2630.5 ) { 
		if( AVG_DX2_RIGHT < -0.54 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.54 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -454 ) { 
		if( MAX_DX2_RIGHT >= 5330.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT < 5330.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
		if( AMP_DELTA < 4261 ) { return new Prediction("LEFT", 110, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3574.5 ) { 
	if( AMP_DELTA < 8204 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_DX2_RIGHT >= -2.86 ) { 
		if( MAX_AMP_LEFT >= 5236 ) { return new Prediction("TOP", 101, 0); }
	if( MAX_AMP_LEFT < 5236 ) { 
		if( MAX_AMP_LEFT < -6774 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_AMP_LEFT >= -6774 ) { 
	if( MAX_AMP_RIGHT < 10900 ) { 
		if( MAX_DX2_RIGHT >= 7440 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 7440 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_AMP_RIGHT >= 10900 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < -2.86 ) { 
	if( MAX_DX2_LEFT < 9490 ) { 
		if( MAX_DX2_RIGHT >= 7800 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_RIGHT < 7800 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 9490 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_LEFT < 7423.5 ) { 
	if( AVG_DX2_RIGHT >= -0.27 ) { 
		if( MAX_AMP_RIGHT >= 11604.5 ) { return new Prediction("RIGHT", 11, 0); }
	if( MAX_AMP_RIGHT < 11604.5 ) { 
		if( AMP_DELTA < 1606.5 ) { return new Prediction("TOP", 1, 0); }
	if( AMP_DELTA >= 1606.5 ) { 
		if( MAX_DX2_LEFT < 4100 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 4100 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < -0.27 ) { 
		if( MAX_AMP_LEFT < -3126.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_LEFT >= -3126.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 7423.5 ) { return new Prediction("TOP", 18, 0); }
	}
	}
	if( AMP_DELTA >= 8204 ) { 
	if( MAX_DX2_LEFT < 12906.5 ) { 
	if( MAX_DX2_RIGHT >= 6836 ) { 
	if( MAX_AMP_LEFT < 4575 ) { 
	if( AVG_AMP_LEFT < 2 ) { 
		if( MAX_DX2_LEFT < 10298.5 ) { return new Prediction("BOTTOM", 21, 0); }
	if( MAX_DX2_LEFT >= 10298.5 ) { 
		if( MAX_DX2_LEFT < 11129.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 11129.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 2 ) { 
		if( AVG_DX2_RIGHT < 1.43 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT >= 1.43 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4575 ) { 
		if( FIRST_RIGHT_DETECTION < 241.5 ) { return new Prediction("RIGHT", 137, 0); }
	if( FIRST_RIGHT_DETECTION >= 241.5 ) { 
		if( MAX_DX2_RIGHT >= 23085.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 23085.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT < 6836 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 12906.5 ) { 
		if( MAX_AMP_RIGHT < -17763.5 ) { return new Prediction("RIGHT", 23, 0); }
	if( MAX_AMP_RIGHT >= -17763.5 ) { 
	if( AVG_DX2_LEFT < -0.64 ) { 
		if( DETECTION_DELTA < 9 ) { return new Prediction("TOP", 15, 0); }
		if( DETECTION_DELTA >= 9 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_DX2_LEFT >= -0.64 ) { 
		if( MAX_AMP_RIGHT >= 18985.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_AMP_RIGHT < 18985.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree24() {
	if( MAX_AMP_LEFT >= 5158.5 ) { 
	if( MAX_AMP_LEFT < 9890 ) { 
	if( AMP_DELTA < 6100 ) { 
		if( DX2_DELTA < 10016 ) { return new Prediction("TOP", 42, 0); }
		if( DX2_DELTA >= 10016 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA >= 6100 ) { 
	if( MAX_DX2_RIGHT < 33156 ) { 
		if( MAX_DX2_LEFT < 15573 ) { return new Prediction("RIGHT", 128, 0); }
		if( MAX_DX2_LEFT >= 15573 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 33156 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 9890 ) { 
		if( MAX_DX2_RIGHT >= 17813 ) { return new Prediction("RIGHT", 19, 0); }
		if( MAX_DX2_RIGHT < 17813 ) { return new Prediction("TOP", 119, 0); }
	}
	}
	if( MAX_AMP_LEFT < 5158.5 ) { 
	if( MAX_DX2_RIGHT >= 6331.5 ) { 
	if( MAX_AMP_LEFT < -10598.5 ) { 
		if( DX2_DELTA >= 4019 ) { return new Prediction("TOP", 17, 0); }
		if( DX2_DELTA < 4019 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_AMP_LEFT >= -10598.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( FIRST_LEFT_DETECTION >= 162.5 ) { 
	if( AVG_AMP_LEFT < -5 ) { 
		if( AVG_DX2_LEFT >= -0.67 ) { return new Prediction("BOTTOM", 11, 0); }
		if( AVG_DX2_LEFT < -0.67 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_LEFT >= -5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_DX2_RIGHT < 8254 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_RIGHT >= 8254 ) { 
		if( MAX_DX2_LEFT < 4288 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_DX2_LEFT >= 4288 ) { 
	if( FIRST_RIGHT_DETECTION >= 246.5 ) { 
		if( FIRST_LEFT_DETECTION < 251 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 251 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 246.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
	}
	}
	if( FIRST_LEFT_DETECTION < 162.5 ) { 
	if( MAX_AMP_RIGHT < -6486.5 ) { 
		if( AVG_DX2_RIGHT < -2.77 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -2.77 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -6486.5 ) { return new Prediction("RIGHT", 25, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AMP_DELTA >= 4449.5 ) { return new Prediction("BOTTOM", 127, 0); }
		if( AMP_DELTA < 4449.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6331.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AVG_DX2_RIGHT >= 3.29 ) { 
		if( AVG_AMP_LEFT < 5.5 ) { return new Prediction("BOTTOM", 31, 0); }
	if( AVG_AMP_LEFT >= 5.5 ) { 
		if( AVG_DX2_RIGHT >= 5.37 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < 5.37 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT < 3.29 ) { 
	if( AMP_DELTA < 5030.5 ) { 
	if( MAX_AMP_LEFT < -2462 ) { 
		if( MAX_DX2_LEFT >= 3861 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 3861 ) { 
		if( FIRST_RIGHT_DETECTION >= 215.5 ) { return new Prediction("TOP", 7, 0); }
		if( FIRST_RIGHT_DETECTION < 215.5 ) { return new Prediction("LEFT", 19, 0); }
	}
	}
	if( MAX_AMP_LEFT >= -2462 ) { 
		if( FIRST_LEFT_DETECTION < 227.5 ) { return new Prediction("LEFT", 18, 0); }
	if( FIRST_LEFT_DETECTION >= 227.5 ) { 
	if( MAX_DX2_RIGHT < 3132.5 ) { 
	if( FIRST_LEFT_DETECTION >= 245.5 ) { 
		if( FIRST_RIGHT_DETECTION < 285 ) { return new Prediction("LEFT", 11, 0); }
	if( FIRST_RIGHT_DETECTION >= 285 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
	if( FIRST_LEFT_DETECTION >= 494.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 480 ) { return new Prediction("LEFT", 11, 3); }
		if( FIRST_RIGHT_DETECTION < 480 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 494.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 3132.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5030.5 ) { 
	if( AVG_DX2_LEFT < 0.19 ) { 
	if( AVG_DX2_LEFT >= -1.32 ) { 
		if( DX2_DELTA >= 1090.5 ) { return new Prediction("BOTTOM", 28, 0); }
		if( DX2_DELTA < 1090.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < -1.32 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= 0.19 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( MAX_AMP_RIGHT < -10001.5 ) { 
		if( AVG_DX2_LEFT < 0.72 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_DX2_LEFT >= 0.72 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_RIGHT >= -10001.5 ) { 
		if( DX2_DELTA >= 3538.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( DX2_DELTA < 3538.5 ) { 
		if( MAX_AMP_RIGHT >= 10856.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 10856.5 ) { return new Prediction("LEFT", 120, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree25() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( AMP_DELTA < 6118.5 ) { 
	if( AVG_DX2_RIGHT >= -0.52 ) { 
	if( MAX_DX2_RIGHT < 1009.5 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( FIRST_LEFT_DETECTION >= 461 ) { return new Prediction("TOP", 20, 11); }
		if( FIRST_LEFT_DETECTION < 461 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
	if( DX2_DELTA < 2303 ) { 
	if( MAX_DX2_LEFT >= 2430 ) { 
	if( MAX_DX2_RIGHT >= 3687 ) { 
		if( MAX_AMP_RIGHT >= 6975 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < 6975 ) { return new Prediction("LEFT", 15, 0); }
	}
	if( MAX_DX2_RIGHT < 3687 ) { 
		if( AVG_AMP_LEFT >= -2 ) { return new Prediction("TOP", 7, 0); }
		if( AVG_AMP_LEFT < -2 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT < 2430 ) { return new Prediction("LEFT", 39, 0); }
	}
	if( DX2_DELTA >= 2303 ) { 
	if( AMP_DELTA < 5646.5 ) { 
	if( FIRST_RIGHT_DETECTION < 241 ) { 
	if( MAX_DX2_RIGHT < 6347.5 ) { 
		if( DX2_DELTA < 2844.5 ) { return new Prediction("LEFT", 17, 0); }
	if( DX2_DELTA >= 2844.5 ) { 
		if( AVG_DX2_RIGHT < 1.93 ) { return new Prediction("LEFT", 9, 0); }
		if( AVG_DX2_RIGHT >= 1.93 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 6347.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 241 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( AMP_DELTA >= 5646.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < -0.52 ) { 
		if( DETECTION_DELTA >= 523 ) { return new Prediction("RIGHT", 4, 0); }
	if( DETECTION_DELTA < 523 ) { 
	if( AVG_AMP_RIGHT < 6 ) { 
		if( AVG_DX2_RIGHT >= -3.91 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_DX2_RIGHT < -3.91 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AVG_AMP_RIGHT >= 6 ) { 
	if( DETECTION_DELTA < 8 ) { 
		if( MAX_DX2_RIGHT >= 6305 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT < 6305 ) { return new Prediction("LEFT", 19, 0); }
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("LEFT", 60, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6118.5 ) { 
		if( MAX_AMP_LEFT < -5521 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_AMP_LEFT >= -5521 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( MAX_DX2_RIGHT >= 6843 ) { return new Prediction("BOTTOM", 21, 0); }
	if( MAX_DX2_RIGHT < 6843 ) { 
		if( AVG_AMP_RIGHT >= 1 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_RIGHT < 1 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 124, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
		if( MAX_DX2_LEFT >= 4186.5 ) { return new Prediction("TOP", 161, 0); }
	if( MAX_DX2_LEFT < 4186.5 ) { 
		if( DX2_DELTA < 1952 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA >= 1952 ) { 
		if( MAX_DX2_RIGHT < 6839.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_RIGHT >= 6839.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( MAX_AMP_LEFT < 4401.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 154 ) { 
	if( MAX_AMP_LEFT < -5584 ) { 
	if( MAX_DX2_LEFT >= 9677.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
		if( MAX_DX2_RIGHT < 14795 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_RIGHT >= 14795 ) { 
		if( MAX_DX2_RIGHT >= 15424 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 15424 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT < 9677.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_AMP_LEFT >= -5584 ) { 
		if( AMP_DELTA < 6698.5 ) { return new Prediction("LEFT", 18, 0); }
		if( AMP_DELTA >= 6698.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 154 ) { 
	if( FIRST_LEFT_DETECTION >= 133.5 ) { 
		if( AVG_AMP_LEFT >= -1.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( AVG_AMP_LEFT < -1.5 ) { 
		if( MAX_DX2_LEFT >= 28492.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 28492.5 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 133.5 ) { 
		if( MAX_AMP_RIGHT < 4744 ) { return new Prediction("TOP", 9, 0); }
		if( MAX_AMP_RIGHT >= 4744 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4401.5 ) { 
	if( MAX_DX2_RIGHT >= 11623.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AMP_DELTA >= 12496.5 ) { 
		if( FIRST_RIGHT_DETECTION < 161.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 161.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AMP_DELTA < 12496.5 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 139, 0); }
	}
	if( MAX_DX2_RIGHT < 11623.5 ) { 
		if( MAX_DX2_LEFT >= 6538.5 ) { return new Prediction("TOP", 23, 0); }
		if( MAX_DX2_LEFT < 6538.5 ) { return new Prediction("RIGHT", 30, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree26() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( MAX_DX2_RIGHT < 6295 ) { 
	if( DX2_DELTA < 2801 ) { 
	if( DX2_DELTA >= 255 ) { 
		if( AMP_DELTA >= 5588 ) { return new Prediction("BOTTOM", 13, 0); }
	if( AMP_DELTA < 5588 ) { 
		if( AVG_DX2_RIGHT >= 4.42 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_RIGHT < 4.42 ) { 
	if( FIRST_RIGHT_DETECTION < 491.5 ) { 
		if( AVG_DX2_RIGHT < 0.74 ) { return new Prediction("LEFT", 129, 0); }
	if( AVG_DX2_RIGHT >= 0.74 ) { 
		if( AVG_DX2_RIGHT >= 0.79 ) { return new Prediction("LEFT", 24, 0); }
		if( AVG_DX2_RIGHT < 0.79 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 491.5 ) { 
		if( DX2_DELTA >= 2124.5 ) { return new Prediction("TOP", 2, 0); }
		if( DX2_DELTA < 2124.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( DX2_DELTA < 255 ) { 
	if( MAX_AMP_RIGHT >= 1349 ) { 
		if( DX2_DELTA < 177 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 177 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_RIGHT < 1349 ) { 
		if( AMP_DELTA >= 1050.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AMP_DELTA < 1050.5 ) { return new Prediction("LEFT", 17, 4); }
	}
	}
	}
	if( DX2_DELTA >= 2801 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
		if( AVG_AMP_RIGHT >= 25 ) { return new Prediction("LEFT", 12, 0); }
	if( AVG_AMP_RIGHT < 25 ) { 
		if( FIRST_LEFT_DETECTION < 135.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 135.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( FIRST_LEFT_DETECTION >= 165.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 165.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AMP_DELTA < 4872 ) { return new Prediction("LEFT", 2, 0); }
		if( AMP_DELTA >= 4872 ) { return new Prediction("BOTTOM", 40, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6295 ) { 
	if( AVG_AMP_LEFT < 20.5 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 112, 0); }
	if( DETECTION_DELTA < 6 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_DX2_LEFT >= 2787.5 ) { 
		if( FIRST_LEFT_DETECTION < 217 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 217 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
		if( AVG_AMP_LEFT >= 20.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
	if( MAX_DX2_LEFT >= 4518 ) { 
	if( MAX_AMP_LEFT < 450 ) { 
		if( AVG_DX2_RIGHT < -3.37 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT >= -3.37 ) { return new Prediction("TOP", 20, 0); }
	}
		if( MAX_AMP_LEFT >= 450 ) { return new Prediction("TOP", 99, 0); }
	}
	if( MAX_DX2_LEFT < 4518 ) { 
	if( MAX_AMP_LEFT >= -639.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 7, 0); }
	}
	if( MAX_AMP_LEFT < -639.5 ) { 
		if( FIRST_LEFT_DETECTION >= 88.5 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_LEFT_DETECTION < 88.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 39, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_AMP_RIGHT >= -13602.5 ) { return new Prediction("TOP", 11, 0); }
	if( MAX_AMP_RIGHT < -13602.5 ) { 
		if( AVG_DX2_RIGHT >= -1.61 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT < -1.61 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
	if( AMP_DELTA >= 9054.5 ) { 
	if( MAX_DX2_RIGHT >= 16042 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( MAX_DX2_LEFT >= 27278.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 27278.5 ) { return new Prediction("RIGHT", 33, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
		if( MAX_AMP_LEFT >= 7543.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT < 7543.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 16042 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( AMP_DELTA < 9054.5 ) { 
		if( AVG_DX2_LEFT < -1.24 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_DX2_LEFT >= -1.24 ) { 
		if( FIRST_LEFT_DETECTION >= 221.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 221.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
		if( AVG_AMP_LEFT >= 42.5 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_AMP_LEFT < 42.5 ) { 
	if( MAX_AMP_LEFT >= 4571.5 ) { 
	if( MAX_AMP_LEFT < 10483 ) { 
		if( FIRST_LEFT_DETECTION < 232 ) { return new Prediction("RIGHT", 134, 0); }
	if( FIRST_LEFT_DETECTION >= 232 ) { 
		if( MAX_DX2_RIGHT < 20893.5 ) { return new Prediction("RIGHT", 13, 0); }
		if( MAX_DX2_RIGHT >= 20893.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 10483 ) { 
		if( MAX_AMP_RIGHT >= 20774 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_AMP_RIGHT < 20774 ) { 
		if( MAX_DX2_LEFT < 17134 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT >= 17134 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 4571.5 ) { 
	if( DX2_DELTA < 6575.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( AVG_AMP_LEFT < 13.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( AVG_AMP_LEFT >= 13.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( AVG_DX2_RIGHT >= 4.66 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 4.66 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DETECTION_DELTA >= 2.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
		if( AVG_AMP_RIGHT >= -26.5 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_AMP_RIGHT < -26.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DX2_DELTA >= 6575.5 ) { 
		if( DX2_DELTA < 7705 ) { return new Prediction("RIGHT", 5, 0); }
	if( DX2_DELTA >= 7705 ) { 
		if( AVG_DX2_RIGHT < 0.85 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.85 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree27() {
	if( MAX_DX2_LEFT < 3574.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( MAX_DX2_RIGHT < 6001 ) { 
	if( DX2_DELTA < 3844.5 ) { 
		if( MAX_DX2_RIGHT < 5000.5 ) { return new Prediction("LEFT", 82, 0); }
	if( MAX_DX2_RIGHT >= 5000.5 ) { 
		if( AMP_DELTA < 5178 ) { return new Prediction("LEFT", 31, 0); }
		if( AMP_DELTA >= 5178 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
		if( DX2_DELTA >= 3844.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 6001 ) { 
	if( AVG_AMP_RIGHT >= 29.5 ) { 
		if( AVG_AMP_LEFT < 5.5 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_AMP_RIGHT < 29.5 ) { 
	if( MAX_AMP_LEFT >= 3171 ) { 
		if( MAX_DX2_LEFT >= 2334.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 2334.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT < 3171 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( DX2_DELTA < 2986.5 ) { 
	if( FIRST_RIGHT_DETECTION < 200.5 ) { 
		if( MAX_AMP_RIGHT < 5420.5 ) { return new Prediction("LEFT", 46, 0); }
	if( MAX_AMP_RIGHT >= 5420.5 ) { 
		if( AVG_DX2_LEFT < 0.71 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.71 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 200.5 ) { 
	if( MAX_DX2_RIGHT < 4511 ) { 
	if( FIRST_LEFT_DETECTION < 277 ) { 
	if( FIRST_RIGHT_DETECTION < 209.5 ) { 
		if( AVG_DX2_LEFT >= 0.52 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 0.52 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 209.5 ) { 
		if( AVG_DX2_RIGHT < -1.87 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT >= -1.87 ) { 
		if( FIRST_RIGHT_DETECTION < 468.5 ) { return new Prediction("TOP", 5, 0); }
	if( FIRST_RIGHT_DETECTION >= 468.5 ) { 
		if( DX2_DELTA < 2126.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 2126.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 277 ) { 
		if( AMP_DELTA < 315.5 ) { return new Prediction("LEFT", 23, 10); }
	if( AMP_DELTA >= 315.5 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
		if( AVG_AMP_RIGHT < -5.5 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_AMP_RIGHT >= -5.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AVG_AMP_RIGHT >= -1.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT >= 4511 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	if( DX2_DELTA >= 2986.5 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( DETECTION_DELTA < 8 ) { return new Prediction("RIGHT", 5, 0); }
	if( DETECTION_DELTA >= 8 ) { 
		if( MAX_AMP_LEFT < 3775 ) { return new Prediction("BOTTOM", 12, 0); }
	if( MAX_AMP_LEFT >= 3775 ) { 
		if( MAX_AMP_LEFT >= 3813 ) { return new Prediction("BOTTOM", 8, 0); }
		if( MAX_AMP_LEFT < 3813 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 3076.5 ) { 
	if( DETECTION_DELTA < 429.5 ) { 
		if( AVG_DX2_RIGHT < -6.62 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -6.62 ) { return new Prediction("BOTTOM", 94, 0); }
	}
	if( DETECTION_DELTA >= 429.5 ) { 
		if( MAX_DX2_RIGHT >= 3303.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_RIGHT < 3303.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3574.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 7230 ) { 
	if( MAX_AMP_LEFT >= -7974.5 ) { 
	if( AMP_DELTA >= 6402.5 ) { 
		if( AVG_AMP_LEFT < 5.5 ) { return new Prediction("BOTTOM", 34, 0); }
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("RIGHT", 16, 0); }
	}
	if( AMP_DELTA < 6402.5 ) { 
		if( MAX_AMP_LEFT >= 6898 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_AMP_LEFT < 6898 ) { 
		if( MAX_AMP_RIGHT < 10945 ) { return new Prediction("TOP", 12, 0); }
		if( MAX_AMP_RIGHT >= 10945 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < -7974.5 ) { return new Prediction("TOP", 28, 0); }
	}
		if( MAX_AMP_LEFT >= 7230 ) { return new Prediction("TOP", 111, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( DX2_DELTA >= 6645.5 ) { 
	if( MAX_DX2_LEFT >= 17261 ) { 
	if( AVG_DX2_RIGHT >= -0.27 ) { 
	if( AVG_AMP_LEFT < -8.5 ) { 
		if( AVG_DX2_LEFT < -1.11 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.11 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_RIGHT < -0.27 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_DX2_LEFT < 17261 ) { return new Prediction("RIGHT", 149, 0); }
	}
	if( DX2_DELTA < 6645.5 ) { 
	if( MAX_AMP_RIGHT < 11908 ) { 
	if( AMP_DELTA >= 2448.5 ) { 
	if( AVG_DX2_RIGHT < 2.52 ) { 
		if( FIRST_LEFT_DETECTION < 149.5 ) { return new Prediction("TOP", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 149.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( AVG_DX2_RIGHT >= 2.52 ) { 
		if( MAX_AMP_LEFT < 4698 ) { return new Prediction("LEFT", 14, 0); }
		if( MAX_AMP_LEFT >= 4698 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AMP_DELTA < 2448.5 ) { return new Prediction("TOP", 15, 0); }
	}
	if( MAX_AMP_RIGHT >= 11908 ) { 
		if( AVG_DX2_LEFT < -4.01 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_DX2_LEFT >= -4.01 ) { 
		if( MAX_DX2_RIGHT < 6785 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 6785 ) { return new Prediction("RIGHT", 27, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree28() {
	if( AMP_DELTA >= 6215.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AVG_AMP_RIGHT >= -17.5 ) { 
		if( AVG_DX2_LEFT >= 3.34 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT < 3.34 ) { 
	if( AVG_DX2_LEFT >= -2.86 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( MAX_DX2_LEFT < 6539.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 6539.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("BOTTOM", 175, 0); }
	}
		if( AVG_DX2_LEFT < -2.86 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -17.5 ) { 
		if( MAX_DX2_RIGHT < 4771 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_RIGHT >= 4771 ) { 
	if( MAX_AMP_RIGHT < -1291 ) { 
		if( AVG_DX2_LEFT >= -0.95 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < -0.95 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -1291 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_RIGHT >= 3.5 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( AVG_AMP_LEFT >= 38 ) { 
		if( MAX_DX2_LEFT < 7318 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 7318 ) { return new Prediction("TOP", 7, 0); }
	}
	if( AVG_AMP_LEFT < 38 ) { 
	if( MAX_AMP_LEFT < 15474 ) { 
		if( AMP_DELTA >= 7500 ) { return new Prediction("RIGHT", 115, 0); }
	if( AMP_DELTA < 7500 ) { 
		if( AMP_DELTA < 7349 ) { return new Prediction("RIGHT", 7, 0); }
		if( AMP_DELTA >= 7349 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 15474 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( MAX_DX2_LEFT >= 26901 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 26901 ) { return new Prediction("RIGHT", 17, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( AVG_DX2_LEFT < 0.19 ) { 
		if( AVG_DX2_LEFT >= -3.45 ) { return new Prediction("BOTTOM", 11, 0); }
		if( AVG_DX2_LEFT < -3.45 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_LEFT >= 0.19 ) { 
		if( AVG_DX2_LEFT >= 0.9 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.9 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < 3.5 ) { 
	if( MAX_AMP_LEFT < 14219 ) { 
		if( MAX_AMP_LEFT < -10882.5 ) { return new Prediction("TOP", 14, 0); }
	if( MAX_AMP_LEFT >= -10882.5 ) { 
	if( MAX_AMP_LEFT < 910.5 ) { 
		if( MAX_AMP_LEFT < -7166.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_AMP_LEFT >= -7166.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( MAX_AMP_LEFT >= 910.5 ) { 
		if( MAX_DX2_RIGHT < 5800.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 5800.5 ) { return new Prediction("RIGHT", 40, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 14219 ) { return new Prediction("TOP", 36, 0); }
	}
	}
	}
	if( AMP_DELTA < 6215.5 ) { 
	if( MAX_DX2_LEFT >= 3675.5 ) { 
	if( MAX_AMP_LEFT < 5910 ) { 
	if( MAX_AMP_RIGHT >= 5844.5 ) { 
		if( AVG_DX2_RIGHT < -0.91 ) { return new Prediction("RIGHT", 5, 0); }
	if( AVG_DX2_RIGHT >= -0.91 ) { 
	if( MAX_AMP_LEFT < -5279 ) { 
		if( AVG_DX2_RIGHT >= 1.64 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 1.64 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= -5279 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 5844.5 ) { 
		if( MAX_AMP_RIGHT >= -11677.5 ) { return new Prediction("TOP", 15, 0); }
		if( MAX_AMP_RIGHT < -11677.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 5910 ) { 
	if( FIRST_LEFT_DETECTION >= 56 ) { 
	if( AMP_DELTA >= 5572.5 ) { 
		if( MAX_AMP_LEFT >= 10784 ) { return new Prediction("TOP", 10, 0); }
		if( MAX_AMP_LEFT < 10784 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 5572.5 ) { return new Prediction("TOP", 87, 0); }
	}
		if( FIRST_LEFT_DETECTION < 56 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 3675.5 ) { 
	if( MAX_DX2_RIGHT < 1009.5 ) { 
		if( DX2_DELTA < 1099 ) { return new Prediction("LEFT", 12, 5); }
		if( DX2_DELTA >= 1099 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
	if( MAX_DX2_RIGHT < 7892 ) { 
	if( DETECTION_DELTA < 535.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( MAX_DX2_LEFT < 1000.5 ) { 
		if( DX2_DELTA < 3303.5 ) { return new Prediction("LEFT", 25, 0); }
		if( DX2_DELTA >= 3303.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 1000.5 ) { return new Prediction("LEFT", 143, 0); }
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AVG_DX2_LEFT < 0.78 ) { 
		if( MAX_AMP_RIGHT >= -6752 ) { return new Prediction("LEFT", 14, 0); }
	if( MAX_AMP_RIGHT < -6752 ) { 
		if( AVG_AMP_LEFT >= 15 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT < 15 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 0.78 ) { return new Prediction("TOP", 3, 0); }
	}
	}
		if( DETECTION_DELTA >= 535.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 7892 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree29() {
	if( MAX_AMP_LEFT >= 4999 ) { 
	if( MAX_DX2_RIGHT >= 9869.5 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 123, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_DX2_LEFT >= 10154.5 ) { 
		if( AVG_AMP_LEFT < -6 ) { return new Prediction("BOTTOM", 6, 0); }
	if( AVG_AMP_LEFT >= -6 ) { 
	if( FIRST_LEFT_DETECTION < 211.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("TOP", 2, 0); }
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 211.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT < 10154.5 ) { return new Prediction("RIGHT", 30, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 9869.5 ) { 
	if( MAX_AMP_LEFT < 6668.5 ) { 
		if( AMP_DELTA < 6401 ) { return new Prediction("TOP", 9, 0); }
		if( AMP_DELTA >= 6401 ) { return new Prediction("RIGHT", 13, 0); }
	}
		if( MAX_AMP_LEFT >= 6668.5 ) { return new Prediction("TOP", 119, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4999 ) { 
	if( MAX_DX2_RIGHT >= 6187.5 ) { 
	if( AMP_DELTA < 6801 ) { 
	if( AVG_AMP_RIGHT < 6 ) { 
		if( DX2_DELTA < 1633 ) { return new Prediction("TOP", 4, 0); }
	if( DX2_DELTA >= 1633 ) { 
		if( MAX_AMP_LEFT < -10754 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT >= -10754 ) { 
		if( FIRST_LEFT_DETECTION < 153 ) { return new Prediction("RIGHT", 4, 0); }
	if( FIRST_LEFT_DETECTION >= 153 ) { 
	if( AVG_DX2_LEFT < 0.62 ) { 
		if( FIRST_LEFT_DETECTION < 272 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 272 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= 0.62 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 6 ) { 
		if( DX2_DELTA < 4429 ) { return new Prediction("LEFT", 12, 0); }
	if( DX2_DELTA >= 4429 ) { 
	if( AVG_DX2_RIGHT < -0.08 ) { 
		if( MAX_AMP_LEFT < 4942.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT >= 4942.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -0.08 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6801 ) { 
	if( FIRST_LEFT_DETECTION >= 195.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AVG_AMP_RIGHT >= 13 ) { 
		if( MAX_DX2_RIGHT < 8807 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT >= 8807 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( AVG_AMP_RIGHT < 13 ) { return new Prediction("BOTTOM", 8, 0); }
	}
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("BOTTOM", 104, 0); }
	}
	if( FIRST_LEFT_DETECTION < 195.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 38, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_LEFT < 17668.5 ) { 
		if( AMP_DELTA >= 7500 ) { return new Prediction("RIGHT", 25, 0); }
	if( AMP_DELTA < 7500 ) { 
		if( AVG_DX2_LEFT < -0.32 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.32 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 17668.5 ) { 
	if( MAX_DX2_RIGHT >= 26729.5 ) { 
		if( AVG_DX2_LEFT < -0.55 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.55 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 26729.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 6187.5 ) { 
	if( DX2_DELTA < 3494 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AVG_DX2_RIGHT < 1.71 ) { 
	if( FIRST_RIGHT_DETECTION < 211.5 ) { 
		if( MAX_DX2_LEFT >= 3861 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 3861 ) { 
		if( DX2_DELTA < 2884 ) { return new Prediction("LEFT", 36, 0); }
	if( DX2_DELTA >= 2884 ) { 
		if( FIRST_LEFT_DETECTION < 435 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 435 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 211.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
	if( MAX_DX2_LEFT < 2177.5 ) { 
		if( AMP_DELTA < 315.5 ) { return new Prediction("LEFT", 17, 8); }
	if( AMP_DELTA >= 315.5 ) { 
		if( DX2_DELTA < 2347 ) { return new Prediction("LEFT", 11, 0); }
	if( DX2_DELTA >= 2347 ) { 
		if( MAX_AMP_RIGHT < -4679 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_RIGHT >= -4679 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 2177.5 ) { 
		if( FIRST_LEFT_DETECTION < 272 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 272 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 255 ) { 
	if( AVG_AMP_LEFT < 1 ) { 
		if( AVG_DX2_RIGHT < -0.45 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.45 ) { return new Prediction("TOP", 12, 0); }
	}
		if( AVG_AMP_LEFT >= 1 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 1.71 ) { 
		if( MAX_AMP_RIGHT < 11355 ) { return new Prediction("BOTTOM", 12, 0); }
		if( MAX_AMP_RIGHT >= 11355 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( AVG_DX2_RIGHT >= -0.31 ) { 
	if( DETECTION_DELTA < 17 ) { 
	if( MAX_DX2_RIGHT < 4723.5 ) { 
		if( AVG_DX2_LEFT < -0.29 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -0.29 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 4723.5 ) { 
		if( MAX_AMP_LEFT >= -2031 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_AMP_LEFT < -2031 ) { 
		if( FIRST_LEFT_DETECTION < 164.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 164.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 17 ) { return new Prediction("LEFT", 20, 0); }
	}
		if( AVG_DX2_RIGHT < -0.31 ) { return new Prediction("LEFT", 93, 0); }
	}
	}
	if( DX2_DELTA >= 3494 ) { 
	if( MAX_DX2_LEFT < 3584.5 ) { 
	if( MAX_AMP_RIGHT >= -1327.5 ) { 
		if( MAX_AMP_LEFT >= 1623.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( MAX_AMP_LEFT < 1623.5 ) { 
		if( MAX_AMP_RIGHT < 6564.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT >= 6564.5 ) { return new Prediction("BOTTOM", 11, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -1327.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
		if( MAX_DX2_LEFT >= 3584.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
return null;
}
private Prediction runTree30() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
	if( AVG_AMP_RIGHT >= -3.5 ) { 
	if( MAX_DX2_LEFT < 4757 ) { 
	if( AMP_DELTA < 4899 ) { 
		if( FIRST_RIGHT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 19, 10); }
	if( FIRST_RIGHT_DETECTION < 481.5 ) { 
	if( MAX_AMP_RIGHT < 6463 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("LEFT", 27, 0); }
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT >= 6463 ) { 
		if( AVG_AMP_RIGHT >= 18 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_RIGHT < 18 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( AMP_DELTA >= 4899 ) { 
	if( AVG_DX2_RIGHT >= -1.69 ) { 
		if( DX2_DELTA >= 1090.5 ) { return new Prediction("BOTTOM", 7, 0); }
		if( DX2_DELTA < 1090.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_DX2_RIGHT < -1.69 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 4757 ) { return new Prediction("TOP", 35, 0); }
	}
	if( AVG_AMP_RIGHT < -3.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("LEFT", 3, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_DX2_LEFT >= 3485 ) { return new Prediction("TOP", 68, 0); }
	if( MAX_DX2_LEFT < 3485 ) { 
		if( FIRST_LEFT_DETECTION >= 191.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 191.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( MAX_DX2_LEFT < 9686 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( FIRST_RIGHT_DETECTION < 122 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 122 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( MAX_DX2_LEFT >= 9686 ) { 
		if( MAX_DX2_RIGHT < 16125 ) { return new Prediction("TOP", 21, 0); }
		if( MAX_DX2_RIGHT >= 16125 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
	if( MAX_AMP_LEFT < 4401.5 ) { 
	if( FIRST_LEFT_DETECTION >= 155 ) { 
	if( MAX_AMP_RIGHT >= -1491.5 ) { 
		if( MAX_AMP_LEFT < -6762 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT >= -6762 ) { return new Prediction("LEFT", 8, 0); }
	}
	if( MAX_AMP_RIGHT < -1491.5 ) { 
		if( MAX_AMP_LEFT >= -6578.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_AMP_LEFT < -6578.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 155 ) { 
		if( MAX_AMP_RIGHT < -22267.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_RIGHT >= -22267.5 ) { 
		if( AVG_AMP_LEFT < -12.5 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_AMP_LEFT >= -12.5 ) { 
		if( MAX_AMP_LEFT < -19934 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_LEFT >= -19934 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4401.5 ) { 
	if( FIRST_LEFT_DETECTION < 252 ) { 
	if( AMP_DELTA >= 7238 ) { 
		if( AMP_DELTA < 18672 ) { return new Prediction("RIGHT", 157, 0); }
	if( AMP_DELTA >= 18672 ) { 
	if( MAX_DX2_RIGHT < 31441 ) { 
		if( MAX_AMP_RIGHT >= -28533 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_RIGHT < -28533 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 31441 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	if( AMP_DELTA < 7238 ) { 
	if( MAX_AMP_RIGHT >= -13710 ) { 
		if( AVG_AMP_LEFT >= -11 ) { return new Prediction("RIGHT", 18, 0); }
		if( AVG_AMP_LEFT < -11 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -13710 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 252 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( AMP_DELTA >= 5286 ) { 
		if( MAX_DX2_RIGHT < 3308.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_RIGHT >= 3308.5 ) { 
		if( MAX_DX2_RIGHT >= 6011.5 ) { return new Prediction("BOTTOM", 142, 0); }
	if( MAX_DX2_RIGHT < 6011.5 ) { 
		if( MAX_DX2_LEFT < 2905 ) { return new Prediction("BOTTOM", 53, 0); }
	if( MAX_DX2_LEFT >= 2905 ) { 
		if( FIRST_LEFT_DETECTION < 104 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 104 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5286 ) { 
	if( AVG_DX2_RIGHT < -0.36 ) { 
	if( DX2_DELTA >= 4047 ) { 
		if( AVG_DX2_LEFT >= 2.98 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 2.98 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( DX2_DELTA < 4047 ) { 
	if( DX2_DELTA < 925.5 ) { 
		if( MAX_AMP_LEFT < 3685.5 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_AMP_LEFT >= 3685.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 925.5 ) { return new Prediction("LEFT", 79, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -0.36 ) { 
		if( MAX_DX2_LEFT >= 3415.5 ) { return new Prediction("TOP", 16, 0); }
	if( MAX_DX2_LEFT < 3415.5 ) { 
	if( MAX_DX2_RIGHT < 1013.5 ) { 
	if( FIRST_LEFT_DETECTION >= 245.5 ) { 
		if( DX2_DELTA < 2478 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA >= 2478 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_RIGHT >= 1013.5 ) { 
	if( DX2_DELTA < 2347 ) { 
		if( AVG_AMP_LEFT < -28 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_LEFT >= -28 ) { return new Prediction("LEFT", 38, 0); }
	}
	if( DX2_DELTA >= 2347 ) { 
	if( AVG_DX2_LEFT >= -0.08 ) { 
		if( FIRST_RIGHT_DETECTION >= 257 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_RIGHT_DETECTION < 257 ) { 
		if( AVG_DX2_RIGHT >= 0.97 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 0.97 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
		if( AVG_DX2_LEFT < -0.08 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree31() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT < 7821 ) { 
	if( MAX_DX2_RIGHT < 6524.5 ) { 
		if( MAX_AMP_LEFT < -6943.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_AMP_LEFT >= -6943.5 ) { 
	if( MAX_AMP_RIGHT >= 6516.5 ) { 
	if( AVG_DX2_RIGHT < 1.2 ) { 
		if( MAX_DX2_LEFT >= 2443 ) { return new Prediction("LEFT", 10, 0); }
		if( MAX_DX2_LEFT < 2443 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= 1.2 ) { 
		if( DX2_DELTA >= 1924 ) { return new Prediction("RIGHT", 4, 0); }
		if( DX2_DELTA < 1924 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 6516.5 ) { 
	if( MAX_AMP_LEFT < 5702.5 ) { 
	if( FIRST_LEFT_DETECTION >= 218 ) { 
	if( MAX_AMP_LEFT >= -3981.5 ) { 
		if( DX2_DELTA < 163.5 ) { return new Prediction("LEFT", 13, 8); }
		if( DX2_DELTA >= 163.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_LEFT < -3981.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION < 218 ) { 
		if( MAX_DX2_RIGHT >= 5330.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 5330.5 ) { return new Prediction("LEFT", 39, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 5702.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6524.5 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
	if( MAX_AMP_LEFT >= -8426 ) { 
	if( AMP_DELTA < 18241 ) { 
		if( MAX_AMP_LEFT >= 5415 ) { return new Prediction("RIGHT", 6, 0); }
	if( MAX_AMP_LEFT < 5415 ) { 
		if( FIRST_LEFT_DETECTION >= 246 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 246 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
		if( AMP_DELTA >= 18241 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_AMP_LEFT < -8426 ) { 
		if( FIRST_RIGHT_DETECTION >= 255 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 255 ) { return new Prediction("TOP", 15, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -7.5 ) { 
	if( MAX_AMP_LEFT < 4610 ) { 
	if( FIRST_LEFT_DETECTION >= 155 ) { 
	if( AVG_DX2_LEFT >= -1.28 ) { 
		if( MAX_AMP_LEFT < -6278 ) { return new Prediction("RIGHT", 7, 0); }
	if( MAX_AMP_LEFT >= -6278 ) { 
	if( MAX_DX2_LEFT < 9640 ) { 
	if( MAX_DX2_RIGHT < 8174.5 ) { 
		if( DX2_DELTA < 4403 ) { return new Prediction("RIGHT", 3, 0); }
		if( DX2_DELTA >= 4403 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 8174.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( MAX_DX2_LEFT >= 9640 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_DX2_LEFT < -1.28 ) { 
		if( FIRST_RIGHT_DETECTION < 182.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 182.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 155 ) { 
		if( MAX_AMP_LEFT < -17708 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT >= -17708 ) { return new Prediction("RIGHT", 20, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4610 ) { 
	if( MAX_AMP_LEFT >= 6886.5 ) { 
		if( DX2_DELTA >= 6572.5 ) { return new Prediction("RIGHT", 30, 0); }
	if( DX2_DELTA < 6572.5 ) { 
		if( AVG_DX2_RIGHT < 0.72 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.72 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 6886.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 247.5 ) { 
		if( FIRST_LEFT_DETECTION < 261 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 261 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 247.5 ) { return new Prediction("RIGHT", 77, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 7821 ) { 
	if( MAX_DX2_RIGHT >= 14255.5 ) { 
		if( DX2_DELTA >= 19563 ) { return new Prediction("TOP", 2, 0); }
		if( DX2_DELTA < 19563 ) { return new Prediction("RIGHT", 46, 0); }
	}
		if( MAX_DX2_RIGHT < 14255.5 ) { return new Prediction("TOP", 129, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_RIGHT < 5237.5 ) { 
	if( AMP_DELTA < 5646.5 ) { 
	if( MAX_AMP_LEFT < 4906.5 ) { 
	if( MAX_DX2_RIGHT < 3335 ) { 
	if( MAX_AMP_LEFT >= -2063 ) { 
	if( MAX_DX2_RIGHT < 3279 ) { 
	if( DX2_DELTA >= 2180.5 ) { 
	if( DETECTION_DELTA >= 377.5 ) { 
		if( MAX_DX2_LEFT >= 1099 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 1099 ) { return new Prediction("LEFT", 13, 0); }
	}
		if( DETECTION_DELTA < 377.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DX2_DELTA < 2180.5 ) { return new Prediction("LEFT", 24, 0); }
	}
		if( MAX_DX2_RIGHT >= 3279 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_AMP_LEFT < -2063 ) { 
		if( DX2_DELTA >= 1036 ) { return new Prediction("TOP", 10, 0); }
		if( DX2_DELTA < 1036 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 3335 ) { 
		if( MAX_DX2_LEFT >= 1007 ) { return new Prediction("LEFT", 86, 0); }
		if( MAX_DX2_LEFT < 1007 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4906.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( AMP_DELTA >= 5646.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
		if( AVG_DX2_LEFT < 0.98 ) { return new Prediction("BOTTOM", 23, 0); }
		if( AVG_DX2_LEFT >= 0.98 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5237.5 ) { 
	if( AMP_DELTA < 4882.5 ) { 
		if( DX2_DELTA < 1387.5 ) { return new Prediction("TOP", 1, 0); }
		if( DX2_DELTA >= 1387.5 ) { return new Prediction("LEFT", 22, 0); }
	}
		if( AMP_DELTA >= 4882.5 ) { return new Prediction("BOTTOM", 144, 0); }
	}
	}
return null;
}
private Prediction runTree32() {
	if( MAX_AMP_LEFT < 5035 ) { 
	if( DX2_DELTA >= 3034 ) { 
	if( AMP_DELTA < 7406 ) { 
	if( MAX_AMP_RIGHT < 5011 ) { 
	if( MAX_DX2_RIGHT >= 3590 ) { 
		if( AVG_AMP_RIGHT >= 11 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_AMP_RIGHT < 11 ) { return new Prediction("TOP", 11, 0); }
	}
	if( MAX_DX2_RIGHT < 3590 ) { 
	if( MAX_AMP_RIGHT < -4148.5 ) { 
		if( AVG_DX2_RIGHT < 0.04 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.04 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -4148.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 5011 ) { 
	if( FIRST_LEFT_DETECTION < 163 ) { 
		if( AVG_AMP_LEFT < -4 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_AMP_LEFT >= -4 ) { 
	if( FIRST_LEFT_DETECTION >= 151.5 ) { 
		if( FIRST_LEFT_DETECTION >= 158.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 158.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 151.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 163 ) { 
		if( AVG_DX2_RIGHT >= 7.87 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT < 7.87 ) { 
	if( AMP_DELTA < 5970 ) { 
	if( MAX_DX2_LEFT >= 1100.5 ) { 
	if( MAX_AMP_LEFT >= 37 ) { 
		if( MAX_AMP_LEFT < 3604 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= 3604 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_AMP_LEFT < 37 ) { return new Prediction("LEFT", 12, 0); }
	}
		if( MAX_DX2_LEFT < 1100.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AMP_DELTA >= 5970 ) { 
		if( FIRST_LEFT_DETECTION < 259 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 259 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 7406 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( DETECTION_DELTA >= 492.5 ) { 
		if( AVG_DX2_LEFT >= 2.01 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 2.01 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 492.5 ) { 
		if( AVG_DX2_LEFT >= -3.93 ) { return new Prediction("BOTTOM", 152, 0); }
		if( AVG_DX2_LEFT < -3.93 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_DX2_LEFT >= 19700.5 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_DX2_LEFT < 19700.5 ) { 
	if( MAX_AMP_LEFT >= -10775.5 ) { 
	if( AVG_DX2_RIGHT < 3.52 ) { 
		if( FIRST_RIGHT_DETECTION >= 233 ) { return new Prediction("BOTTOM", 4, 0); }
	if( FIRST_RIGHT_DETECTION < 233 ) { 
		if( MAX_DX2_RIGHT >= 22491.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_RIGHT < 22491.5 ) { 
	if( MAX_DX2_RIGHT < 11328.5 ) { 
		if( MAX_AMP_LEFT >= 266.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT < 266.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_DX2_RIGHT >= 11328.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
		if( AVG_DX2_RIGHT >= 3.52 ) { return new Prediction("RIGHT", 7, 0); }
	}
		if( MAX_AMP_LEFT < -10775.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( DX2_DELTA < 3034 ) { 
	if( AMP_DELTA >= 5588 ) { 
		if( AVG_AMP_RIGHT < -22 ) { return new Prediction("RIGHT", 1, 0); }
	if( AVG_AMP_RIGHT >= -22 ) { 
	if( MAX_DX2_LEFT < 2278 ) { 
		if( FIRST_RIGHT_DETECTION >= 243.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 243.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2278 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	}
	if( AMP_DELTA < 5588 ) { 
	if( AVG_DX2_RIGHT < -0.03 ) { 
	if( AMP_DELTA < 4955.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( FIRST_RIGHT_DETECTION < 209.5 ) { 
		if( AVG_DX2_RIGHT >= -4.08 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < -4.08 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 209.5 ) { return new Prediction("LEFT", 9, 0); }
	}
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("LEFT", 98, 0); }
	}
	if( AMP_DELTA >= 4955.5 ) { 
		if( AVG_DX2_LEFT >= 0.31 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.31 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -0.03 ) { 
	if( FIRST_RIGHT_DETECTION < 235.5 ) { 
	if( AVG_DX2_RIGHT >= 1.19 ) { 
	if( DX2_DELTA < 2838.5 ) { 
		if( MAX_AMP_LEFT < 4121.5 ) { return new Prediction("LEFT", 14, 0); }
		if( MAX_AMP_LEFT >= 4121.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DX2_DELTA >= 2838.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 1.19 ) { return new Prediction("LEFT", 32, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 235.5 ) { 
		if( FIRST_LEFT_DETECTION < 272 ) { return new Prediction("TOP", 11, 0); }
	if( FIRST_LEFT_DETECTION >= 272 ) { 
	if( MAX_AMP_LEFT >= -1075.5 ) { 
		if( MAX_DX2_RIGHT >= 2503.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_RIGHT < 2503.5 ) { 
		if( AMP_DELTA < 315.5 ) { return new Prediction("LEFT", 16, 9); }
	if( AMP_DELTA >= 315.5 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < -1075.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5035 ) { 
	if( DX2_DELTA < 5210.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 139.5 ) { 
		if( AMP_DELTA < 8929.5 ) { return new Prediction("TOP", 68, 0); }
		if( AMP_DELTA >= 8929.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 139.5 ) { 
	if( MAX_DX2_RIGHT >= 7096 ) { 
		if( MAX_AMP_LEFT >= 10815 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_AMP_LEFT < 10815 ) { return new Prediction("RIGHT", 11, 0); }
	}
		if( MAX_DX2_RIGHT < 7096 ) { return new Prediction("TOP", 20, 0); }
	}
	}
	if( DX2_DELTA >= 5210.5 ) { 
		if( MAX_DX2_RIGHT < 9126.5 ) { return new Prediction("TOP", 45, 0); }
	if( MAX_DX2_RIGHT >= 9126.5 ) { 
	if( MAX_DX2_LEFT < 17134.5 ) { 
	if( DX2_DELTA >= 17864 ) { 
		if( MAX_AMP_RIGHT < -2121.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_RIGHT >= -2121.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( DX2_DELTA < 17864 ) { 
		if( AMP_DELTA >= 7238 ) { return new Prediction("RIGHT", 161, 0); }
	if( AMP_DELTA < 7238 ) { 
		if( AVG_DX2_RIGHT < 3.52 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= 3.52 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 17134.5 ) { 
		if( MAX_AMP_RIGHT < -21330 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT >= -21330 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree33() {
	if( MAX_AMP_LEFT >= 5158.5 ) { 
	if( MAX_DX2_RIGHT < 10081.5 ) { 
	if( MAX_DX2_RIGHT >= 7737.5 ) { 
	if( DX2_DELTA >= 4203 ) { 
		if( MAX_DX2_LEFT < 10223 ) { return new Prediction("RIGHT", 16, 0); }
		if( MAX_DX2_LEFT >= 10223 ) { return new Prediction("TOP", 8, 0); }
	}
		if( DX2_DELTA < 4203 ) { return new Prediction("TOP", 16, 0); }
	}
		if( MAX_DX2_RIGHT < 7737.5 ) { return new Prediction("TOP", 117, 0); }
	}
	if( MAX_DX2_RIGHT >= 10081.5 ) { 
	if( MAX_AMP_LEFT < 16991.5 ) { 
		if( DX2_DELTA >= 5863.5 ) { return new Prediction("RIGHT", 151, 0); }
	if( DX2_DELTA < 5863.5 ) { 
		if( MAX_DX2_RIGHT < 14266 ) { return new Prediction("RIGHT", 8, 0); }
	if( MAX_DX2_RIGHT >= 14266 ) { 
		if( MAX_DX2_LEFT >= 13345.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 13345.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 16991.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT < 5158.5 ) { 
	if( DX2_DELTA < 2913 ) { 
	if( MAX_DX2_LEFT >= 4442.5 ) { 
		if( AMP_DELTA < 6211.5 ) { return new Prediction("TOP", 10, 0); }
		if( AMP_DELTA >= 6211.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_DX2_LEFT < 4442.5 ) { 
		if( AVG_AMP_RIGHT >= 17.5 ) { return new Prediction("LEFT", 93, 0); }
	if( AVG_AMP_RIGHT < 17.5 ) { 
	if( DX2_DELTA >= 2533 ) { 
		if( DX2_DELTA < 2581 ) { return new Prediction("BOTTOM", 6, 0); }
	if( DX2_DELTA >= 2581 ) { 
		if( MAX_AMP_LEFT >= 1032.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < 1032.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( DX2_DELTA < 2533 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( MAX_AMP_LEFT < -1589 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_AMP_LEFT >= -1589 ) { 
	if( FIRST_LEFT_DETECTION >= 208 ) { 
		if( MAX_DX2_LEFT >= 2391.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_LEFT < 2391.5 ) { 
		if( MAX_DX2_LEFT >= 1169.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 1169.5 ) { return new Prediction("LEFT", 16, 9); }
	}
	}
		if( FIRST_LEFT_DETECTION < 208 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 5.5 ) { 
	if( AVG_DX2_RIGHT < 3.52 ) { 
	if( FIRST_RIGHT_DETECTION >= 484 ) { 
		if( DETECTION_DELTA < 399 ) { return new Prediction("TOP", 2, 0); }
	if( DETECTION_DELTA >= 399 ) { 
		if( DETECTION_DELTA >= 444.5 ) { return new Prediction("TOP", 2, 0); }
		if( DETECTION_DELTA < 444.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 484 ) { 
	if( AVG_AMP_RIGHT >= -7 ) { 
	if( MAX_DX2_RIGHT < 2408 ) { 
		if( DX2_DELTA < 2347 ) { return new Prediction("LEFT", 11, 0); }
		if( DX2_DELTA >= 2347 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 2408 ) { return new Prediction("LEFT", 27, 0); }
	}
	if( AVG_AMP_RIGHT < -7 ) { 
		if( MAX_DX2_LEFT >= 3123.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 3123.5 ) { return new Prediction("LEFT", 16, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 3.52 ) { 
		if( FIRST_RIGHT_DETECTION >= 198 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 198 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( DX2_DELTA >= 2913 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_DX2_RIGHT < 3651 ) { 
		if( AMP_DELTA < 4630 ) { return new Prediction("LEFT", 4, 0); }
	if( AMP_DELTA >= 4630 ) { 
		if( AVG_DX2_LEFT >= 2.01 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT < 2.01 ) { 
		if( MAX_DX2_RIGHT >= 3544.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT < 3544.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 3651 ) { 
		if( AMP_DELTA < 4699 ) { return new Prediction("LEFT", 8, 0); }
	if( AMP_DELTA >= 4699 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( FIRST_LEFT_DETECTION >= 175.5 ) { return new Prediction("BOTTOM", 7, 0); }
		if( FIRST_LEFT_DETECTION < 175.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 177, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < -10194.5 ) { 
		if( DX2_DELTA >= 4019 ) { return new Prediction("TOP", 26, 0); }
		if( DX2_DELTA < 4019 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT >= -10194.5 ) { 
	if( AVG_DX2_LEFT >= 0.89 ) { 
		if( FIRST_LEFT_DETECTION < 207.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 207.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( AVG_DX2_LEFT < 0.89 ) { 
	if( AVG_AMP_LEFT >= -1 ) { 
	if( AVG_DX2_LEFT >= -1.28 ) { 
		if( AVG_DX2_RIGHT >= 7.48 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 7.48 ) { return new Prediction("RIGHT", 32, 0); }
	}
	if( AVG_DX2_LEFT < -1.28 ) { 
		if( FIRST_RIGHT_DETECTION < 132 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 132 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT < -1 ) { 
	if( AVG_AMP_RIGHT < 28 ) { 
		if( MAX_DX2_LEFT >= 19973.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 19973.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( AVG_AMP_RIGHT >= 28 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree34() {
	if( AMP_DELTA >= 5930.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_DX2_LEFT >= 3145 ) { 
		if( MAX_AMP_LEFT >= 11725 ) { return new Prediction("TOP", 23, 0); }
	if( MAX_AMP_LEFT < 11725 ) { 
	if( MAX_AMP_LEFT >= -12465.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( DX2_DELTA >= 6537.5 ) { return new Prediction("RIGHT", 99, 0); }
	if( DX2_DELTA < 6537.5 ) { 
		if( AVG_DX2_RIGHT < 3.37 ) { return new Prediction("RIGHT", 39, 0); }
	if( AVG_DX2_RIGHT >= 3.37 ) { 
		if( AMP_DELTA < 7588.5 ) { return new Prediction("LEFT", 4, 0); }
		if( AMP_DELTA >= 7588.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_DX2_LEFT >= 0.67 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 0.67 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT < -12465.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( MAX_DX2_LEFT < 3145 ) { 
		if( FIRST_LEFT_DETECTION < 134 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 134 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_DX2_RIGHT < 6009 ) { 
	if( MAX_DX2_LEFT >= 2854 ) { 
		if( MAX_AMP_LEFT < -656.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT >= -656.5 ) { return new Prediction("TOP", 10, 0); }
	}
		if( MAX_DX2_LEFT < 2854 ) { return new Prediction("BOTTOM", 44, 0); }
	}
		if( MAX_DX2_RIGHT >= 6009 ) { return new Prediction("BOTTOM", 109, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_DX2_RIGHT >= 15260.5 ) { return new Prediction("BOTTOM", 7, 0); }
	if( MAX_DX2_RIGHT < 15260.5 ) { 
		if( MAX_DX2_RIGHT < 10754 ) { return new Prediction("TOP", 28, 0); }
	if( MAX_DX2_RIGHT >= 10754 ) { 
	if( MAX_DX2_LEFT < 10929 ) { 
		if( FIRST_LEFT_DETECTION < 149.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 149.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 10929 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 8241 ) { 
		if( AVG_DX2_LEFT >= 1.37 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 1.37 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 8241 ) { 
		if( DX2_DELTA >= 17864 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DX2_DELTA < 17864 ) { return new Prediction("RIGHT", 50, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5930.5 ) { 
	if( MAX_AMP_LEFT < 5178 ) { 
	if( AVG_DX2_RIGHT >= -0.06 ) { 
	if( MAX_DX2_LEFT >= 2435.5 ) { 
	if( AVG_AMP_RIGHT < 10.5 ) { 
	if( MAX_AMP_RIGHT < -8955 ) { 
		if( AVG_DX2_LEFT >= 1.01 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 1.01 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( MAX_AMP_RIGHT >= -8955 ) { 
		if( MAX_DX2_RIGHT >= 7622.5 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_DX2_RIGHT < 7622.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 18, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 10.5 ) { 
		if( MAX_AMP_LEFT < -2669 ) { return new Prediction("LEFT", 13, 0); }
	if( MAX_AMP_LEFT >= -2669 ) { 
		if( AMP_DELTA >= 4232 ) { return new Prediction("RIGHT", 3, 0); }
	if( AMP_DELTA < 4232 ) { 
		if( FIRST_LEFT_DETECTION >= 201.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 201.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2435.5 ) { 
		if( FIRST_RIGHT_DETECTION < 258 ) { return new Prediction("LEFT", 26, 0); }
	if( FIRST_RIGHT_DETECTION >= 258 ) { 
	if( MAX_DX2_LEFT >= 2124.5 ) { 
		if( AVG_DX2_RIGHT < 0.07 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.07 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_LEFT < 2124.5 ) { 
	if( DETECTION_DELTA >= 180.5 ) { 
		if( FIRST_RIGHT_DETECTION < 270.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 270.5 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( DETECTION_DELTA < 180.5 ) { return new Prediction("LEFT", 12, 4); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT < -0.06 ) { 
	if( DX2_DELTA >= 4047 ) { 
		if( MAX_DX2_LEFT >= 5955 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_LEFT < 5955 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( DX2_DELTA < 4047 ) { 
	if( AVG_AMP_LEFT >= 7 ) { 
		if( MAX_AMP_LEFT >= 3852 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT < 3852 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( AVG_AMP_LEFT < 7 ) { 
		if( AMP_DELTA < 5009 ) { return new Prediction("LEFT", 122, 0); }
	if( AMP_DELTA >= 5009 ) { 
		if( AVG_DX2_RIGHT < -2.76 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT >= -2.76 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5178 ) { 
	if( MAX_AMP_LEFT >= 7164 ) { 
		if( FIRST_LEFT_DETECTION >= 56 ) { return new Prediction("TOP", 95, 0); }
		if( FIRST_LEFT_DETECTION < 56 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 7164 ) { 
		if( DX2_DELTA >= 3454.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( DX2_DELTA < 3454.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
return null;
}
private Prediction runTree35() {
	if( MAX_DX2_RIGHT < 9184 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
		if( MAX_AMP_RIGHT >= 9847.5 ) { return new Prediction("BOTTOM", 66, 0); }
	if( MAX_AMP_RIGHT < 9847.5 ) { 
	if( AMP_DELTA < 5646.5 ) { 
		if( MAX_AMP_LEFT >= 4590.5 ) { return new Prediction("TOP", 17, 0); }
	if( MAX_AMP_LEFT < 4590.5 ) { 
	if( FIRST_RIGHT_DETECTION < 204.5 ) { 
		if( DETECTION_DELTA < 536 ) { return new Prediction("LEFT", 119, 0); }
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 204.5 ) { 
		if( FIRST_LEFT_DETECTION < 222.5 ) { return new Prediction("TOP", 8, 0); }
	if( FIRST_LEFT_DETECTION >= 222.5 ) { 
	if( FIRST_RIGHT_DETECTION < 491.5 ) { 
	if( MAX_DX2_LEFT < 4096 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( MAX_DX2_RIGHT < 2489.5 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_DX2_RIGHT >= 2489.5 ) { 
		if( DETECTION_DELTA >= 419 ) { return new Prediction("LEFT", 3, 0); }
		if( DETECTION_DELTA < 419 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 5.5 ) { return new Prediction("LEFT", 28, 0); }
	}
		if( MAX_DX2_LEFT >= 4096 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 491.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 5646.5 ) { 
		if( MAX_DX2_RIGHT < 3308.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_DX2_RIGHT >= 3308.5 ) { 
		if( MAX_DX2_LEFT < 12041.5 ) { return new Prediction("BOTTOM", 64, 0); }
		if( MAX_DX2_LEFT >= 12041.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA < 10.5 ) { 
	if( MAX_DX2_LEFT < 5048.5 ) { 
	if( MAX_AMP_LEFT >= 3884 ) { 
		if( MAX_DX2_RIGHT >= 6758.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( MAX_DX2_RIGHT < 6758.5 ) { 
		if( DX2_DELTA < 1884.5 ) { return new Prediction("TOP", 15, 0); }
		if( DX2_DELTA >= 1884.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < 3884 ) { 
	if( FIRST_LEFT_DETECTION >= 210 ) { 
	if( DETECTION_DELTA >= 2 ) { 
		if( AVG_DX2_RIGHT < -1.87 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.87 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	if( DETECTION_DELTA < 2 ) { 
	if( AMP_DELTA < 4530.5 ) { 
		if( FIRST_LEFT_DETECTION < 453.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 453.5 ) { return new Prediction("LEFT", 16, 8); }
	}
		if( AMP_DELTA >= 4530.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 210 ) { 
	if( MAX_DX2_LEFT < 2604.5 ) { 
		if( MAX_DX2_RIGHT < 5181.5 ) { return new Prediction("LEFT", 10, 0); }
		if( MAX_DX2_RIGHT >= 5181.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 2604.5 ) { return new Prediction("LEFT", 30, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 5048.5 ) { return new Prediction("TOP", 115, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 9184 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( FIRST_LEFT_DETECTION >= 223.5 ) { 
	if( MAX_DX2_LEFT < 22087.5 ) { 
		if( MAX_AMP_LEFT >= 7112 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_AMP_LEFT < 7112 ) { 
	if( MAX_AMP_LEFT >= 4828 ) { 
		if( MAX_DX2_RIGHT >= 22434.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_RIGHT < 22434.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT < 4828 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 22087.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION < 223.5 ) { 
	if( AMP_DELTA < 11560 ) { 
	if( FIRST_LEFT_DETECTION < 152.5 ) { 
		if( MAX_AMP_RIGHT < 3453.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_RIGHT >= 3453.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 152.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 14, 0); }
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AMP_DELTA >= 11560 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
	if( MAX_DX2_RIGHT < 36698 ) { 
		if( MAX_DX2_LEFT >= 28343 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 28343 ) { return new Prediction("RIGHT", 29, 0); }
	}
		if( MAX_DX2_RIGHT >= 36698 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 3921 ) { 
	if( DX2_DELTA < 5254.5 ) { 
		if( FIRST_LEFT_DETECTION >= 182 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_LEFT_DETECTION < 182 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DX2_DELTA >= 5254.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( MAX_AMP_LEFT >= 3921 ) { 
	if( AVG_AMP_LEFT >= 6.5 ) { 
		if( MAX_DX2_LEFT >= 8614.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_DX2_LEFT < 8614.5 ) { return new Prediction("RIGHT", 17, 0); }
	}
		if( AVG_AMP_LEFT < 6.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AMP_DELTA >= 7452 ) { return new Prediction("RIGHT", 128, 0); }
	if( AMP_DELTA < 7452 ) { 
		if( FIRST_RIGHT_DETECTION < 158 ) { return new Prediction("RIGHT", 11, 0); }
	if( FIRST_RIGHT_DETECTION >= 158 ) { 
		if( AVG_AMP_RIGHT < 8.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_AMP_RIGHT >= 8.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree36() {
	if( MAX_DX2_LEFT < 3574.5 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( FIRST_RIGHT_DETECTION < 244.5 ) { 
		if( AVG_DX2_RIGHT < 2.77 ) { return new Prediction("LEFT", 41, 0); }
		if( AVG_DX2_RIGHT >= 2.77 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 244.5 ) { 
		if( MAX_DX2_LEFT >= 2391.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_DX2_LEFT < 2391.5 ) { 
	if( AVG_DX2_RIGHT < 0.07 ) { 
	if( AMP_DELTA >= 2115.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 461 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 461 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AMP_DELTA < 2115.5 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
		if( DX2_DELTA < 163.5 ) { return new Prediction("LEFT", 8, 3); }
		if( DX2_DELTA >= 163.5 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 0.07 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
		if( AMP_DELTA < 3881.5 ) { return new Prediction("LEFT", 96, 0); }
	if( AMP_DELTA >= 3881.5 ) { 
	if( MAX_AMP_LEFT < 4214.5 ) { 
		if( MAX_AMP_RIGHT < 4323 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_AMP_RIGHT >= 4323 ) { 
	if( FIRST_LEFT_DETECTION < 476.5 ) { 
		if( AVG_AMP_LEFT >= 6 ) { return new Prediction("RIGHT", 3, 0); }
	if( AVG_AMP_LEFT < 6 ) { 
		if( FIRST_LEFT_DETECTION < 164.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 164.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 476.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4214.5 ) { 
		if( MAX_DX2_LEFT < 2500 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_LEFT >= 2500 ) { 
		if( AVG_DX2_RIGHT >= -0.96 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < -0.96 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6183.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( MAX_DX2_RIGHT < 7459 ) { 
		if( FIRST_LEFT_DETECTION < 206 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 206 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 7459 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("BOTTOM", 146, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3574.5 ) { 
	if( MAX_AMP_LEFT < 11646 ) { 
	if( MAX_AMP_RIGHT >= -13480.5 ) { 
	if( MAX_AMP_RIGHT < 11297 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( AVG_DX2_RIGHT < -3.37 ) { 
		if( FIRST_LEFT_DETECTION >= 173 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 173 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= -3.37 ) { 
	if( MAX_AMP_RIGHT >= 10141.5 ) { 
		if( AVG_DX2_LEFT < 0.79 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= 0.79 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT < 10141.5 ) { return new Prediction("TOP", 44, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
	if( MAX_AMP_RIGHT >= 6467.5 ) { 
	if( AVG_DX2_LEFT >= -1.23 ) { 
		if( FIRST_RIGHT_DETECTION < 132 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 132 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( AVG_DX2_LEFT < -1.23 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 6467.5 ) { 
		if( MAX_DX2_LEFT >= 4655 ) { return new Prediction("TOP", 16, 0); }
	if( MAX_DX2_LEFT < 4655 ) { 
		if( FIRST_RIGHT_DETECTION < 215 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 215 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= 11297 ) { 
	if( DX2_DELTA < 3175 ) { 
		if( FIRST_LEFT_DETECTION < 135 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 135 ) { return new Prediction("TOP", 11, 0); }
	}
	if( DX2_DELTA >= 3175 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_AMP_LEFT < 1422 ) { return new Prediction("BOTTOM", 15, 0); }
		if( MAX_AMP_LEFT >= 1422 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_DX2_LEFT >= 5.87 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT < 5.87 ) { 
		if( MAX_DX2_LEFT >= 27785.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 27785.5 ) { return new Prediction("RIGHT", 128, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -13480.5 ) { 
	if( MAX_AMP_LEFT >= 5238.5 ) { 
		if( FIRST_LEFT_DETECTION >= 244.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_LEFT_DETECTION < 244.5 ) { 
		if( DX2_DELTA < 17783.5 ) { return new Prediction("RIGHT", 63, 0); }
	if( DX2_DELTA >= 17783.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 158.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 158.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 5238.5 ) { 
		if( MAX_AMP_LEFT < -7280 ) { return new Prediction("RIGHT", 9, 0); }
	if( MAX_AMP_LEFT >= -7280 ) { 
	if( FIRST_LEFT_DETECTION < 153.5 ) { 
		if( AVG_DX2_LEFT >= -0.23 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < -0.23 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 153.5 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 11646 ) { return new Prediction("TOP", 122, 0); }
	}
return null;
}
private Prediction runTree37() {
	if( MAX_DX2_RIGHT < 7280 ) { 
	if( MAX_AMP_LEFT < 5324.5 ) { 
	if( MAX_DX2_LEFT < 5304 ) { 
	if( DX2_DELTA >= 2861.5 ) { 
		if( FIRST_RIGHT_DETECTION < 117.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( FIRST_RIGHT_DETECTION >= 117.5 ) { 
	if( MAX_AMP_LEFT < -4524 ) { 
		if( AVG_DX2_RIGHT >= -1.01 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -1.01 ) { return new Prediction("LEFT", 10, 0); }
	}
	if( MAX_AMP_LEFT >= -4524 ) { 
	if( AMP_DELTA < 5961.5 ) { 
	if( MAX_DX2_LEFT >= 2390 ) { 
		if( AVG_AMP_RIGHT >= 36.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_RIGHT < 36.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_LEFT < 2390 ) { 
	if( MAX_AMP_RIGHT < -4148.5 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
		if( FIRST_RIGHT_DETECTION < 198.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 198.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT < -12.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -4148.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	if( AMP_DELTA >= 5961.5 ) { 
		if( AVG_DX2_RIGHT >= 0.27 ) { return new Prediction("BOTTOM", 39, 0); }
	if( AVG_DX2_RIGHT < 0.27 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 22, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA < 2861.5 ) { 
	if( FIRST_RIGHT_DETECTION < 249.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( AMP_DELTA >= 5849 ) { 
		if( FIRST_RIGHT_DETECTION >= 101 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 101 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AMP_DELTA < 5849 ) { return new Prediction("LEFT", 139, 0); }
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
	if( DX2_DELTA < 1263.5 ) { 
		if( AVG_DX2_LEFT < 0.7 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.7 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DX2_DELTA >= 1263.5 ) { 
	if( DETECTION_DELTA < 11.5 ) { 
		if( MAX_AMP_RIGHT < -10001.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_AMP_RIGHT >= -10001.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DETECTION_DELTA >= 11.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 249.5 ) { 
	if( FIRST_LEFT_DETECTION < 272 ) { 
		if( AMP_DELTA >= 1882.5 ) { return new Prediction("TOP", 9, 0); }
	if( AMP_DELTA < 1882.5 ) { 
		if( MAX_DX2_LEFT < 2664 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 2664 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 272 ) { 
	if( FIRST_RIGHT_DETECTION < 293.5 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( MAX_AMP_LEFT >= -1832 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_AMP_LEFT < -1832 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( FIRST_LEFT_DETECTION < 287 ) { return new Prediction("BOTTOM", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 287 ) { 
		if( FIRST_RIGHT_DETECTION < 278.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 278.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 293.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("LEFT", 19, 7); }
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 5304 ) { 
		if( MAX_AMP_LEFT >= -4742.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < -4742.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 5324.5 ) { return new Prediction("TOP", 117, 0); }
	}
	if( MAX_DX2_RIGHT >= 7280 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT >= 5691 ) { 
		if( FIRST_LEFT_DETECTION >= 175.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 175.5 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_AMP_LEFT < 5691 ) { return new Prediction("BOTTOM", 93, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < 11829 ) { 
	if( AMP_DELTA < 5972.5 ) { 
	if( AVG_AMP_RIGHT >= -13 ) { 
	if( AVG_AMP_LEFT >= -30 ) { 
		if( MAX_DX2_RIGHT < 9048 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_DX2_RIGHT >= 9048 ) { 
		if( AVG_DX2_LEFT >= -3.88 ) { return new Prediction("LEFT", 10, 0); }
		if( AVG_DX2_LEFT < -3.88 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT < -30 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_RIGHT < -13 ) { return new Prediction("TOP", 5, 0); }
	}
	if( AMP_DELTA >= 5972.5 ) { 
	if( MAX_AMP_LEFT < -13077.5 ) { 
		if( AVG_DX2_RIGHT < -6.57 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -6.57 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_AMP_LEFT >= -13077.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
	if( MAX_DX2_RIGHT < 37682 ) { 
		if( MAX_AMP_LEFT >= 4571.5 ) { return new Prediction("RIGHT", 133, 0); }
	if( MAX_AMP_LEFT < 4571.5 ) { 
		if( AMP_DELTA >= 7726 ) { return new Prediction("RIGHT", 17, 0); }
	if( AMP_DELTA < 7726 ) { 
		if( FIRST_RIGHT_DETECTION < 137 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 137 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT >= 37682 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_AMP_LEFT >= 3529 ) { 
	if( MAX_DX2_RIGHT < 27273.5 ) { 
		if( MAX_DX2_LEFT < 10718 ) { return new Prediction("RIGHT", 52, 0); }
	if( MAX_DX2_LEFT >= 10718 ) { 
		if( MAX_DX2_LEFT >= 11883 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT < 11883 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 27273.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_AMP_LEFT < 3529 ) { 
		if( FIRST_LEFT_DETECTION >= 121.5 ) { return new Prediction("BOTTOM", 10, 0); }
		if( FIRST_LEFT_DETECTION < 121.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 11829 ) { 
		if( MAX_DX2_RIGHT < 22713.5 ) { return new Prediction("TOP", 20, 0); }
		if( MAX_DX2_RIGHT >= 22713.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree38() {
	if( AMP_DELTA < 4914.5 ) { 
	if( MAX_DX2_LEFT >= 3650.5 ) { 
		if( MAX_AMP_LEFT >= 3912.5 ) { return new Prediction("TOP", 88, 0); }
	if( MAX_AMP_LEFT < 3912.5 ) { 
	if( MAX_AMP_LEFT >= -5139.5 ) { 
		if( FIRST_LEFT_DETECTION >= 159.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION < 159.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_AMP_LEFT < -5139.5 ) { 
	if( MAX_AMP_LEFT < -7258 ) { 
		if( MAX_DX2_RIGHT >= 6052.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT < 6052.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_LEFT >= -7258 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( FIRST_RIGHT_DETECTION < 491.5 ) { 
	if( DX2_DELTA >= 2868 ) { 
		if( AVG_DX2_RIGHT < -3.79 ) { return new Prediction("LEFT", 7, 0); }
	if( AVG_DX2_RIGHT >= -3.79 ) { 
		if( AVG_AMP_RIGHT >= 17.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_RIGHT < 17.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( DX2_DELTA < 2868 ) { 
	if( MAX_AMP_LEFT < 5324.5 ) { 
	if( MAX_DX2_RIGHT < 2397.5 ) { 
		if( MAX_DX2_RIGHT >= 2347 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT < 2347 ) { return new Prediction("LEFT", 9, 0); }
	}
	if( MAX_DX2_RIGHT >= 2397.5 ) { 
		if( MAX_AMP_LEFT < 3859 ) { return new Prediction("LEFT", 149, 0); }
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( MAX_AMP_LEFT < 4129.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT >= 4129.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5324.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 491.5 ) { 
		if( MAX_AMP_LEFT >= -1081 ) { return new Prediction("LEFT", 14, 5); }
		if( MAX_AMP_LEFT < -1081 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 4914.5 ) { 
	if( MAX_AMP_LEFT < 4737.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AMP_DELTA < 6473 ) { 
		if( DETECTION_DELTA >= 524 ) { return new Prediction("RIGHT", 4, 0); }
	if( DETECTION_DELTA < 524 ) { 
		if( MAX_DX2_LEFT < 2328 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_DX2_LEFT >= 2328 ) { 
		if( AVG_DX2_LEFT >= -1.32 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < -1.32 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6473 ) { 
		if( MAX_DX2_LEFT < 12627 ) { return new Prediction("BOTTOM", 177, 0); }
		if( MAX_DX2_LEFT >= 12627 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_RIGHT < 8984 ) { 
	if( AVG_AMP_LEFT < -5 ) { 
		if( MAX_AMP_RIGHT >= -9806.5 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_AMP_RIGHT < -9806.5 ) { 
		if( MAX_AMP_LEFT < -17378 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_LEFT >= -17378 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -5 ) { 
	if( MAX_AMP_RIGHT >= -13903 ) { 
	if( AVG_DX2_RIGHT < 5 ) { 
		if( AVG_DX2_LEFT >= 0.09 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 0.09 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AVG_DX2_RIGHT >= 5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_RIGHT < -13903 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 8984 ) { 
	if( MAX_DX2_LEFT < 2787.5 ) { 
		if( FIRST_LEFT_DETECTION < 221 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 221 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2787.5 ) { return new Prediction("RIGHT", 23, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4737.5 ) { 
	if( MAX_DX2_RIGHT >= 7737.5 ) { 
		if( MAX_DX2_LEFT < 11115 ) { return new Prediction("RIGHT", 139, 0); }
	if( MAX_DX2_LEFT >= 11115 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( FIRST_LEFT_DETECTION < 232.5 ) { return new Prediction("TOP", 21, 0); }
		if( FIRST_LEFT_DETECTION >= 232.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_AMP_LEFT < 7349 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_LEFT >= 7349 ) { return new Prediction("RIGHT", 32, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT < 7737.5 ) { return new Prediction("TOP", 63, 0); }
	}
	}
return null;
}
private Prediction runTree39() {
	if( MAX_AMP_LEFT >= 5182.5 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 24, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
	if( MAX_AMP_LEFT < 7423.5 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("TOP", 8, 0); }
	if( DETECTION_DELTA < 7 ) { 
		if( MAX_AMP_RIGHT >= 10285 ) { return new Prediction("RIGHT", 10, 0); }
		if( MAX_AMP_RIGHT < 10285 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 7423.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 51.5 ) { 
		if( MAX_DX2_RIGHT >= 23237.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 23237.5 ) { return new Prediction("TOP", 120, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 51.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 5.5 ) { 
	if( DX2_DELTA < 4271.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 23, 0); }
	if( DETECTION_DELTA < 2 ) { 
		if( AVG_DX2_RIGHT < 2.61 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= 2.61 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DX2_DELTA >= 4271.5 ) { 
		if( MAX_AMP_LEFT < 12300 ) { return new Prediction("RIGHT", 117, 0); }
		if( MAX_AMP_LEFT >= 12300 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 5182.5 ) { 
	if( DX2_DELTA < 2986.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( MAX_DX2_RIGHT < 5122.5 ) { 
	if( MAX_AMP_RIGHT < -3840.5 ) { 
	if( AVG_DX2_RIGHT < 3.63 ) { 
		if( AVG_DX2_RIGHT >= -3.91 ) { return new Prediction("LEFT", 33, 0); }
		if( AVG_DX2_RIGHT < -3.91 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= 3.63 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( MAX_AMP_RIGHT >= -3840.5 ) { 
	if( MAX_DX2_LEFT < 2436.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 481.5 ) { 
		if( AVG_AMP_LEFT >= -1 ) { return new Prediction("LEFT", 10, 5); }
		if( AVG_AMP_LEFT < -1 ) { return new Prediction("TOP", 4, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 481.5 ) { 
	if( DX2_DELTA >= 2533 ) { 
		if( DX2_DELTA < 2567.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( DX2_DELTA >= 2567.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( DX2_DELTA < 2533 ) { 
		if( AVG_DX2_RIGHT >= 2.1 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 2.1 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 2436.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5122.5 ) { 
	if( DX2_DELTA < 2381.5 ) { 
		if( MAX_AMP_RIGHT < 11861 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_AMP_RIGHT >= 11861 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA >= 2381.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( AMP_DELTA >= 5672.5 ) { 
		if( AVG_DX2_RIGHT < 2.01 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT >= 2.01 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA < 5672.5 ) { return new Prediction("LEFT", 120, 0); }
	}
	}
	if( DX2_DELTA >= 2986.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( MAX_AMP_LEFT >= -6324 ) { 
	if( DX2_DELTA < 4831.5 ) { 
		if( MAX_AMP_RIGHT < 7059 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_AMP_RIGHT >= 7059 ) { return new Prediction("RIGHT", 12, 0); }
	}
	if( DX2_DELTA >= 4831.5 ) { 
	if( AMP_DELTA < 7472.5 ) { 
		if( AVG_AMP_LEFT >= 12.5 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_AMP_LEFT < 12.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AMP_DELTA >= 7472.5 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("BOTTOM", 7, 0); }
	if( DETECTION_DELTA < 7 ) { 
		if( MAX_DX2_RIGHT < 9664 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 9664 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < -6324 ) { 
		if( MAX_AMP_RIGHT >= -13962.5 ) { return new Prediction("TOP", 10, 0); }
		if( MAX_AMP_RIGHT < -13962.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( AVG_DX2_LEFT < -2.98 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_LEFT >= -2.98 ) { 
		if( AMP_DELTA >= 5842.5 ) { return new Prediction("BOTTOM", 166, 0); }
	if( AMP_DELTA < 5842.5 ) { 
		if( AVG_DX2_LEFT >= 2.98 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 2.98 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( MAX_AMP_LEFT < -8756 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_AMP_LEFT >= -8756 ) { 
		if( AVG_DX2_LEFT < -3.19 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -3.19 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
	if( AMP_DELTA < 5189 ) { 
		if( AVG_DX2_LEFT >= 1.73 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 1.73 ) { return new Prediction("LEFT", 8, 0); }
	}
	if( AMP_DELTA >= 5189 ) { 
		if( AVG_DX2_LEFT < -2.02 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_LEFT >= -2.02 ) { 
	if( MAX_AMP_LEFT >= -4921 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
		if( MAX_AMP_LEFT < -4921 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree40() {
	if( MAX_DX2_RIGHT < 7303 ) { 
	if( DX2_DELTA >= 3164 ) { 
		if( MAX_DX2_LEFT >= 3877 ) { return new Prediction("TOP", 76, 0); }
	if( MAX_DX2_LEFT < 3877 ) { 
	if( AMP_DELTA < 5335.5 ) { 
		if( AVG_DX2_LEFT < -0.5 ) { return new Prediction("LEFT", 7, 0); }
	if( AVG_DX2_LEFT >= -0.5 ) { 
		if( AVG_DX2_RIGHT >= -3.8 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT < -3.8 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA >= 5335.5 ) { 
	if( DETECTION_DELTA < 8 ) { 
		if( MAX_AMP_LEFT >= -444.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_LEFT < -444.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 8 ) { 
		if( MAX_DX2_RIGHT >= 3495 ) { return new Prediction("BOTTOM", 61, 0); }
		if( MAX_DX2_RIGHT < 3495 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( DX2_DELTA < 3164 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( MAX_DX2_RIGHT < 3129 ) { 
	if( MAX_DX2_LEFT < 2504 ) { 
	if( MAX_DX2_RIGHT < 1009.5 ) { 
		if( AMP_DELTA >= 1954.5 ) { return new Prediction("TOP", 3, 0); }
	if( AMP_DELTA < 1954.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 20, 9); }
	}
	}
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
		if( MAX_DX2_LEFT >= 1013 ) { return new Prediction("LEFT", 16, 0); }
	if( MAX_DX2_LEFT < 1013 ) { 
		if( FIRST_RIGHT_DETECTION < 285 ) { return new Prediction("LEFT", 16, 0); }
	if( FIRST_RIGHT_DETECTION >= 285 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
		if( MAX_DX2_LEFT >= 2504 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_DX2_RIGHT >= 3129 ) { 
		if( MAX_DX2_LEFT >= 3940.5 ) { return new Prediction("TOP", 56, 0); }
	if( MAX_DX2_LEFT < 3940.5 ) { 
	if( FIRST_LEFT_DETECTION < 228 ) { 
		if( MAX_AMP_LEFT >= 4891.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 4891.5 ) { 
		if( DX2_DELTA >= 2835 ) { return new Prediction("BOTTOM", 2, 0); }
	if( DX2_DELTA < 2835 ) { 
	if( MAX_AMP_LEFT >= 1421 ) { 
		if( MAX_AMP_RIGHT >= 1459.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 1459.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_AMP_LEFT < 1421 ) { return new Prediction("LEFT", 13, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 228 ) { 
		if( MAX_DX2_LEFT < 2401.5 ) { return new Prediction("BOTTOM", 8, 0); }
	if( MAX_DX2_LEFT >= 2401.5 ) { 
		if( MAX_DX2_RIGHT < 4445.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4445.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( MAX_AMP_LEFT >= 4373.5 ) { 
	if( AVG_DX2_LEFT >= -0.44 ) { 
		if( DX2_DELTA < 2504 ) { return new Prediction("TOP", 7, 0); }
		if( DX2_DELTA >= 2504 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_DX2_LEFT < -0.44 ) { 
		if( MAX_DX2_LEFT < 4855.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_LEFT >= 4855.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4373.5 ) { 
	if( DX2_DELTA < 2838.5 ) { 
		if( MAX_AMP_RIGHT < -10248 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_RIGHT >= -10248 ) { 
		if( MAX_AMP_RIGHT < 10233.5 ) { return new Prediction("LEFT", 99, 0); }
		if( MAX_AMP_RIGHT >= 10233.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DX2_DELTA >= 2838.5 ) { 
		if( DX2_DELTA < 2901.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( DX2_DELTA >= 2901.5 ) { 
		if( AMP_DELTA >= 6609 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 6609 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7303 ) { 
	if( MAX_AMP_LEFT < 4415 ) { 
	if( AMP_DELTA < 6186.5 ) { 
	if( MAX_AMP_RIGHT >= -605 ) { 
		if( FIRST_RIGHT_DETECTION >= 145 ) { return new Prediction("LEFT", 15, 0); }
		if( FIRST_RIGHT_DETECTION < 145 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( MAX_AMP_RIGHT < -605 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AMP_DELTA >= 6186.5 ) { 
	if( AVG_DX2_LEFT >= -1.58 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 89, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_AMP_LEFT < -15110.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT >= -15110.5 ) { 
	if( FIRST_LEFT_DETECTION >= 133 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( FIRST_LEFT_DETECTION >= 146 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_LEFT_DETECTION < 146 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA >= 2.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 133 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	if( AVG_DX2_LEFT < -1.58 ) { 
	if( AMP_DELTA >= 8133.5 ) { 
		if( AVG_DX2_RIGHT < -1.17 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.17 ) { return new Prediction("TOP", 7, 0); }
	}
		if( AMP_DELTA < 8133.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4415 ) { 
	if( AMP_DELTA < 7324 ) { 
		if( MAX_DX2_LEFT < 6643.5 ) { return new Prediction("RIGHT", 18, 0); }
		if( MAX_DX2_LEFT >= 6643.5 ) { return new Prediction("TOP", 26, 0); }
	}
	if( AMP_DELTA >= 7324 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT < 12194.5 ) { 
		if( AVG_DX2_RIGHT < -0.66 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_DX2_RIGHT >= -0.66 ) { 
		if( MAX_DX2_LEFT < 8295 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_LEFT >= 8295 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 12194.5 ) { return new Prediction("TOP", 12, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( FIRST_LEFT_DETECTION < 242.5 ) { 
		if( FIRST_LEFT_DETECTION >= 119 ) { return new Prediction("RIGHT", 138, 0); }
	if( FIRST_LEFT_DETECTION < 119 ) { 
		if( FIRST_RIGHT_DETECTION < 112.5 ) { return new Prediction("RIGHT", 23, 0); }
		if( FIRST_RIGHT_DETECTION >= 112.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 242.5 ) { 
		if( AVG_DX2_RIGHT >= -3.74 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT < -3.74 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree41() {
	if( MAX_AMP_LEFT >= 4579.5 ) { 
	if( AMP_DELTA >= 7589 ) { 
	if( MAX_AMP_LEFT < 13590 ) { 
	if( FIRST_RIGHT_DETECTION < 248.5 ) { 
		if( DX2_DELTA >= 17864 ) { return new Prediction("BOTTOM", 2, 0); }
	if( DX2_DELTA < 17864 ) { 
		if( DETECTION_DELTA < 11.5 ) { return new Prediction("RIGHT", 119, 0); }
		if( DETECTION_DELTA >= 11.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 248.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
		if( MAX_AMP_LEFT >= 13590 ) { return new Prediction("TOP", 23, 0); }
	}
	if( AMP_DELTA < 7589 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_AMP_LEFT >= 7164 ) { return new Prediction("TOP", 117, 0); }
	if( MAX_AMP_LEFT < 7164 ) { 
		if( MAX_DX2_RIGHT < 5426 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_RIGHT >= 5426 ) { 
		if( FIRST_RIGHT_DETECTION < 200 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_RIGHT_DETECTION >= 200 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 4579.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( DX2_DELTA < 2986.5 ) { 
	if( MAX_DX2_LEFT < 3778.5 ) { 
	if( AVG_AMP_RIGHT < 15.5 ) { 
	if( MAX_DX2_LEFT >= 2124.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 484 ) { return new Prediction("TOP", 7, 0); }
	if( FIRST_RIGHT_DETECTION < 484 ) { 
	if( FIRST_LEFT_DETECTION < 225.5 ) { 
	if( MAX_DX2_RIGHT < 5255.5 ) { 
		if( AVG_DX2_RIGHT < 0.19 ) { return new Prediction("LEFT", 10, 0); }
	if( AVG_DX2_RIGHT >= 0.19 ) { 
		if( FIRST_LEFT_DETECTION < 153 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 153 ) { return new Prediction("TOP", 3, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 5255.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 225.5 ) { 
		if( AMP_DELTA >= 2960.5 ) { return new Prediction("BOTTOM", 14, 0); }
		if( AMP_DELTA < 2960.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( DX2_DELTA < 2347 ) { return new Prediction("LEFT", 18, 0); }
	if( DX2_DELTA >= 2347 ) { 
	if( MAX_AMP_RIGHT < -1906 ) { 
		if( FIRST_RIGHT_DETECTION >= 243 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 243 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_AMP_RIGHT >= -1906 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 15.5 ) { 
		if( DX2_DELTA < 197 ) { return new Prediction("TOP", 1, 0); }
	if( DX2_DELTA >= 197 ) { 
		if( AMP_DELTA < 7246.5 ) { return new Prediction("LEFT", 110, 0); }
		if( AMP_DELTA >= 7246.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3778.5 ) { 
		if( MAX_DX2_RIGHT >= 6342 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 6342 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( DX2_DELTA >= 2986.5 ) { 
	if( AVG_AMP_RIGHT < 28.5 ) { 
		if( DX2_DELTA >= 16980.5 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA < 16980.5 ) { 
	if( MAX_DX2_RIGHT < 3696.5 ) { 
	if( MAX_AMP_RIGHT >= -6333 ) { 
		if( AVG_AMP_RIGHT < -3 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT >= -3 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_RIGHT < -6333 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_DX2_RIGHT >= 3696.5 ) { 
		if( AVG_DX2_RIGHT < -8.35 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -8.35 ) { return new Prediction("BOTTOM", 187, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 28.5 ) { 
		if( MAX_AMP_LEFT < 3625.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_AMP_LEFT >= 3625.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( MAX_AMP_LEFT >= -9414.5 ) { 
	if( MAX_AMP_RIGHT >= -9729.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 191.5 ) { 
		if( FIRST_LEFT_DETECTION < 203.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 203.5 ) { 
		if( MAX_AMP_LEFT < -1589 ) { return new Prediction("LEFT", 6, 0); }
	if( MAX_AMP_LEFT >= -1589 ) { 
		if( FIRST_LEFT_DETECTION < 277 ) { return new Prediction("TOP", 2, 0); }
	if( FIRST_LEFT_DETECTION >= 277 ) { 
		if( MAX_DX2_RIGHT < 1232.5 ) { return new Prediction("LEFT", 17, 5); }
		if( MAX_DX2_RIGHT >= 1232.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 191.5 ) { 
	if( AVG_DX2_LEFT >= 0.88 ) { 
		if( AVG_DX2_LEFT >= 2.09 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 2.09 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_DX2_LEFT < 0.88 ) { 
		if( AVG_DX2_RIGHT >= 3.29 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.29 ) { return new Prediction("LEFT", 14, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -9729.5 ) { 
		if( AVG_AMP_LEFT < -5.5 ) { return new Prediction("BOTTOM", 8, 0); }
		if( AVG_AMP_LEFT >= -5.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT < -9414.5 ) { return new Prediction("TOP", 20, 0); }
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( MAX_AMP_LEFT < -5999 ) { 
		if( AMP_DELTA < 5516.5 ) { return new Prediction("TOP", 3, 0); }
		if( AMP_DELTA >= 5516.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
	if( MAX_AMP_LEFT >= -5999 ) { 
	if( MAX_DX2_LEFT < 6602.5 ) { 
		if( AVG_DX2_RIGHT < -0.91 ) { return new Prediction("RIGHT", 14, 0); }
	if( AVG_DX2_RIGHT >= -0.91 ) { 
		if( MAX_AMP_RIGHT >= 9119.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( MAX_AMP_RIGHT < 9119.5 ) { 
		if( AVG_AMP_LEFT < 3 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_AMP_LEFT >= 3 ) { 
		if( FIRST_RIGHT_DETECTION >= 141 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 141 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
		if( MAX_DX2_LEFT >= 6602.5 ) { return new Prediction("LEFT", 13, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree42() {
	if( MAX_AMP_LEFT < 4782.5 ) { 
	if( MAX_DX2_RIGHT >= 6323.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( DX2_DELTA >= 3871.5 ) { 
		if( AMP_DELTA >= 5776.5 ) { return new Prediction("BOTTOM", 123, 0); }
	if( AMP_DELTA < 5776.5 ) { 
		if( FIRST_LEFT_DETECTION >= 161 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 161 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DX2_DELTA < 3871.5 ) { 
		if( AVG_AMP_RIGHT < 43 ) { return new Prediction("BOTTOM", 7, 0); }
		if( AVG_AMP_RIGHT >= 43 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < -7699.5 ) { 
	if( AMP_DELTA < 10381.5 ) { 
		if( MAX_DX2_RIGHT >= 19491.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 19491.5 ) { return new Prediction("TOP", 17, 0); }
	}
	if( AMP_DELTA >= 10381.5 ) { 
		if( DX2_DELTA >= 12699.5 ) { return new Prediction("TOP", 2, 0); }
		if( DX2_DELTA < 12699.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( MAX_AMP_LEFT >= -7699.5 ) { 
	if( AMP_DELTA >= 7530.5 ) { 
		if( AVG_AMP_RIGHT >= 4.5 ) { return new Prediction("RIGHT", 9, 0); }
	if( AVG_AMP_RIGHT < 4.5 ) { 
		if( AVG_AMP_LEFT >= -3 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AMP_DELTA < 7530.5 ) { 
	if( FIRST_RIGHT_DETECTION < 152 ) { 
		if( MAX_DX2_RIGHT < 7470.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 7470.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 152 ) { 
	if( MAX_AMP_LEFT >= 3315.5 ) { 
		if( FIRST_LEFT_DETECTION >= 198 ) { return new Prediction("RIGHT", 5, 0); }
		if( FIRST_LEFT_DETECTION < 198 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT < 3315.5 ) { return new Prediction("LEFT", 16, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 6323.5 ) { 
	if( DX2_DELTA >= 2861.5 ) { 
	if( MAX_AMP_LEFT >= -6646 ) { 
	if( MAX_AMP_RIGHT >= -8835.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
		if( AVG_DX2_LEFT < -0.22 ) { return new Prediction("LEFT", 6, 0); }
	if( AVG_DX2_LEFT >= -0.22 ) { 
		if( MAX_AMP_RIGHT >= 4216 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT < 4216 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( AMP_DELTA < 6437 ) { 
	if( MAX_DX2_RIGHT < 4590.5 ) { 
	if( MAX_DX2_RIGHT >= 3303.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 185 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 185 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 3303.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_DX2_RIGHT >= 4590.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA >= 6437 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -8835.5 ) { return new Prediction("BOTTOM", 17, 0); }
	}
		if( MAX_AMP_LEFT < -6646 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DX2_DELTA < 2861.5 ) { 
	if( AVG_AMP_RIGHT < 5 ) { 
	if( FIRST_LEFT_DETECTION < 220 ) { 
		if( MAX_DX2_LEFT < 4485 ) { return new Prediction("LEFT", 23, 0); }
		if( MAX_DX2_LEFT >= 4485 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 220 ) { 
		if( MAX_AMP_RIGHT < -6125.5 ) { return new Prediction("BOTTOM", 11, 0); }
	if( MAX_AMP_RIGHT >= -6125.5 ) { 
	if( MAX_AMP_LEFT < -2232.5 ) { 
		if( MAX_DX2_LEFT < 2466 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 2466 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_LEFT >= -2232.5 ) { 
	if( MAX_AMP_RIGHT >= -785.5 ) { 
	if( DX2_DELTA < 1676 ) { 
		if( AVG_DX2_RIGHT < 0.38 ) { return new Prediction("TOP", 15, 9); }
		if( AVG_DX2_RIGHT >= 0.38 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DX2_DELTA >= 1676 ) { 
		if( AMP_DELTA < 1853.5 ) { return new Prediction("LEFT", 5, 0); }
		if( AMP_DELTA >= 1853.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -785.5 ) { 
		if( FIRST_RIGHT_DETECTION < 263 ) { return new Prediction("LEFT", 9, 0); }
	if( FIRST_RIGHT_DETECTION >= 263 ) { 
		if( MAX_DX2_RIGHT >= 2199 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 2199 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 5 ) { 
		if( AVG_DX2_RIGHT < -0.34 ) { return new Prediction("LEFT", 105, 0); }
	if( AVG_DX2_RIGHT >= -0.34 ) { 
	if( MAX_AMP_RIGHT < 9478.5 ) { 
		if( AMP_DELTA < 4638 ) { return new Prediction("LEFT", 28, 0); }
	if( AMP_DELTA >= 4638 ) { 
		if( MAX_DX2_RIGHT < 4392 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4392 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 9478.5 ) { 
		if( FIRST_LEFT_DETECTION >= 151.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION < 151.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4782.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_AMP_LEFT < 11.5 ) { 
	if( AMP_DELTA < 11726 ) { 
		if( MAX_AMP_LEFT < 5178 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT >= 5178 ) { return new Prediction("TOP", 81, 0); }
	}
		if( AMP_DELTA >= 11726 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_LEFT >= 11.5 ) { 
		if( MAX_DX2_RIGHT < 7976 ) { return new Prediction("TOP", 43, 0); }
	if( MAX_DX2_RIGHT >= 7976 ) { 
		if( AVG_AMP_LEFT < 38.5 ) { return new Prediction("RIGHT", 14, 0); }
		if( AVG_AMP_LEFT >= 38.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT >= 7783 ) { 
		if( FIRST_LEFT_DETECTION < 219.5 ) { return new Prediction("RIGHT", 148, 0); }
	if( FIRST_LEFT_DETECTION >= 219.5 ) { 
	if( AVG_DX2_LEFT < 1.86 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 21, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( MAX_DX2_LEFT < 12508 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 12508 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 1.86 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 7783 ) { return new Prediction("TOP", 16, 0); }
	}
	}
return null;
}
private Prediction runTree43() {
	if( MAX_AMP_LEFT < 5154 ) { 
	if( AMP_DELTA < 6340.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( MAX_DX2_LEFT >= 5009 ) { 
		if( FIRST_LEFT_DETECTION >= 252.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 252.5 ) { return new Prediction("TOP", 14, 0); }
	}
	if( MAX_DX2_LEFT < 5009 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
	if( MAX_DX2_LEFT < 1063 ) { 
		if( MAX_DX2_RIGHT >= 1001 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 1001 ) { return new Prediction("LEFT", 12, 6); }
	}
		if( MAX_DX2_LEFT >= 1063 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 24, 0); }
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( DX2_DELTA < 2567.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DX2_DELTA >= 2567.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 255 ) { 
		if( FIRST_RIGHT_DETECTION >= 229 ) { return new Prediction("TOP", 4, 0); }
	if( FIRST_RIGHT_DETECTION < 229 ) { 
		if( MAX_AMP_LEFT < -6948 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -6948 ) { return new Prediction("LEFT", 25, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( AVG_DX2_RIGHT >= 3.13 ) { 
	if( AMP_DELTA >= 4232 ) { 
		if( DX2_DELTA >= 2530 ) { return new Prediction("RIGHT", 2, 0); }
	if( DX2_DELTA < 2530 ) { 
		if( AVG_DX2_LEFT < 1.42 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= 1.42 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AMP_DELTA < 4232 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( AVG_DX2_RIGHT < 3.13 ) { return new Prediction("LEFT", 125, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( MAX_DX2_RIGHT < 6233.5 ) { 
		if( FIRST_LEFT_DETECTION >= 187.5 ) { return new Prediction("LEFT", 4, 0); }
	if( FIRST_LEFT_DETECTION < 187.5 ) { 
		if( MAX_DX2_LEFT >= 2947 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT < 2947 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 6233.5 ) { 
	if( AVG_DX2_RIGHT < 0.38 ) { 
		if( MAX_DX2_LEFT < 6407.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( MAX_DX2_LEFT >= 6407.5 ) { 
		if( MAX_AMP_LEFT < -2789 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_LEFT >= -2789 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= 0.38 ) { 
		if( MAX_DX2_RIGHT >= 10308 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT < 10308 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6340.5 ) { 
	if( MAX_DX2_LEFT >= 10356 ) { 
		if( MAX_DX2_RIGHT < 15662.5 ) { return new Prediction("TOP", 17, 0); }
	if( MAX_DX2_RIGHT >= 15662.5 ) { 
	if( MAX_DX2_RIGHT < 17064 ) { 
		if( MAX_DX2_RIGHT < 16601.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 16601.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 17064 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 12, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( DETECTION_DELTA < 4.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 10356 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 198, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( FIRST_LEFT_DETECTION < 197.5 ) { return new Prediction("RIGHT", 15, 0); }
	if( FIRST_LEFT_DETECTION >= 197.5 ) { 
	if( AVG_AMP_LEFT < -4 ) { 
		if( AVG_DX2_RIGHT < 0.43 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.43 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_LEFT >= -4 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5154 ) { 
	if( MAX_DX2_RIGHT >= 9820.5 ) { 
	if( MAX_AMP_LEFT >= 10785 ) { 
		if( MAX_DX2_RIGHT < 21248.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_RIGHT >= 21248.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( MAX_AMP_LEFT < 10785 ) { 
		if( FIRST_LEFT_DETECTION >= 247 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_LEFT_DETECTION < 247 ) { 
		if( MAX_DX2_LEFT < 15573 ) { return new Prediction("RIGHT", 138, 0); }
	if( MAX_DX2_LEFT >= 15573 ) { 
		if( MAX_DX2_RIGHT < 26556 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 26556 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 9820.5 ) { 
	if( MAX_AMP_RIGHT >= 11816.5 ) { 
		if( AMP_DELTA < 6100 ) { return new Prediction("TOP", 21, 0); }
	if( AMP_DELTA >= 6100 ) { 
		if( MAX_DX2_LEFT < 9443 ) { return new Prediction("RIGHT", 10, 0); }
		if( MAX_DX2_LEFT >= 9443 ) { return new Prediction("TOP", 3, 0); }
	}
	}
		if( MAX_AMP_RIGHT < 11816.5 ) { return new Prediction("TOP", 121, 0); }
	}
	}
return null;
}
private Prediction runTree44() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( DX2_DELTA < 3511.5 ) { 
	if( FIRST_RIGHT_DETECTION < 200.5 ) { 
	if( AVG_DX2_RIGHT >= 3.18 ) { 
	if( AVG_AMP_RIGHT < 7.5 ) { 
		if( FIRST_LEFT_DETECTION >= 172 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 172 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 7.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_RIGHT < 3.18 ) { 
		if( DX2_DELTA < 2405 ) { return new Prediction("LEFT", 81, 0); }
	if( DX2_DELTA >= 2405 ) { 
		if( AMP_DELTA < 5372 ) { return new Prediction("LEFT", 28, 0); }
		if( AMP_DELTA >= 5372 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 200.5 ) { 
	if( MAX_AMP_RIGHT < 9448.5 ) { 
	if( AVG_DX2_LEFT < 0.69 ) { 
	if( AMP_DELTA < 5646.5 ) { 
		if( AVG_DX2_RIGHT < -0.19 ) { return new Prediction("LEFT", 40, 0); }
	if( AVG_DX2_RIGHT >= -0.19 ) { 
	if( MAX_DX2_RIGHT >= 1001 ) { 
	if( MAX_AMP_RIGHT < 7984 ) { 
		if( FIRST_RIGHT_DETECTION < 249 ) { return new Prediction("LEFT", 17, 0); }
	if( FIRST_RIGHT_DETECTION >= 249 ) { 
		if( FIRST_RIGHT_DETECTION < 261.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 261.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 7984 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 1001 ) { 
	if( FIRST_LEFT_DETECTION >= 245.5 ) { 
		if( FIRST_LEFT_DETECTION >= 461 ) { return new Prediction("LEFT", 16, 5); }
		if( FIRST_LEFT_DETECTION < 461 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( AMP_DELTA >= 5646.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
	if( AVG_DX2_LEFT >= 0.69 ) { 
	if( DX2_DELTA >= 1502 ) { 
		if( FIRST_RIGHT_DETECTION < 231 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 231 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA < 1502 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 9448.5 ) { return new Prediction("BOTTOM", 17, 0); }
	}
	}
	if( DX2_DELTA >= 3511.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 118 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( DX2_DELTA < 3898.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( DX2_DELTA >= 3898.5 ) { return new Prediction("BOTTOM", 25, 0); }
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 91, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 118 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( MAX_DX2_RIGHT < 8455 ) { 
	if( AVG_AMP_RIGHT < 24.5 ) { 
	if( MAX_AMP_LEFT < 4534.5 ) { 
	if( MAX_AMP_RIGHT >= 5865 ) { 
	if( MAX_AMP_LEFT >= -6909.5 ) { 
		if( AVG_AMP_RIGHT < -5.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_AMP_RIGHT >= -5.5 ) { 
		if( AVG_AMP_LEFT >= 4 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT < 4 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT < -6909.5 ) { return new Prediction("TOP", 6, 0); }
	}
		if( MAX_AMP_RIGHT < 5865 ) { return new Prediction("TOP", 21, 0); }
	}
		if( MAX_AMP_LEFT >= 4534.5 ) { return new Prediction("TOP", 143, 0); }
	}
	if( AVG_AMP_RIGHT >= 24.5 ) { 
	if( MAX_DX2_LEFT >= 3694.5 ) { 
		if( MAX_DX2_LEFT >= 5615 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 5615 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_LEFT < 3694.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 8455 ) { 
	if( MAX_DX2_LEFT >= 10248 ) { 
	if( AVG_AMP_LEFT < 14.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_DX2_RIGHT < 15370 ) { return new Prediction("TOP", 15, 0); }
		if( MAX_DX2_RIGHT >= 15370 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_DX2_LEFT < -3.07 ) { 
		if( AVG_DX2_LEFT >= -4.75 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT < -4.75 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_DX2_LEFT >= -3.07 ) { 
		if( AVG_AMP_LEFT >= -11.5 ) { return new Prediction("RIGHT", 35, 0); }
	if( AVG_AMP_LEFT < -11.5 ) { 
	if( FIRST_RIGHT_DETECTION < 153.5 ) { 
		if( DX2_DELTA >= 15534 ) { return new Prediction("BOTTOM", 4, 0); }
		if( DX2_DELTA < 15534 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 153.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 14.5 ) { 
		if( MAX_DX2_LEFT >= 16594.5 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_DX2_LEFT < 16594.5 ) { 
	if( DX2_DELTA < 7740.5 ) { 
		if( MAX_DX2_RIGHT < 12384 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_RIGHT >= 12384 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( DX2_DELTA >= 7740.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 10248 ) { 
	if( MAX_AMP_LEFT >= 4613.5 ) { 
		if( FIRST_LEFT_DETECTION >= 102 ) { return new Prediction("RIGHT", 118, 0); }
	if( FIRST_LEFT_DETECTION < 102 ) { 
		if( MAX_DX2_LEFT < 4933.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT >= 4933.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4613.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
		if( MAX_DX2_RIGHT >= 9008 ) { return new Prediction("BOTTOM", 27, 0); }
		if( MAX_DX2_RIGHT < 9008 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( DETECTION_DELTA < 8 ) { 
	if( FIRST_LEFT_DETECTION >= 155 ) { 
		if( MAX_AMP_LEFT < 3839.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_LEFT >= 3839.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 155 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree45() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( AMP_DELTA < 5972.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( MAX_DX2_LEFT >= 4744.5 ) { 
		if( MAX_AMP_LEFT >= 8341 ) { return new Prediction("TOP", 60, 0); }
	if( MAX_AMP_LEFT < 8341 ) { 
		if( AVG_AMP_RIGHT >= 3.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( AVG_AMP_RIGHT < 3.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("TOP", 10, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
	if( MAX_AMP_RIGHT < 16791.5 ) { 
		if( MAX_DX2_RIGHT < 8636.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_RIGHT >= 8636.5 ) { 
		if( FIRST_LEFT_DETECTION < 127 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 127 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 16791.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 4744.5 ) { 
	if( DX2_DELTA < 2017 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("TOP", 9, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_AMP_RIGHT < -6552.5 ) { return new Prediction("LEFT", 6, 0); }
	if( MAX_AMP_RIGHT >= -6552.5 ) { 
	if( AVG_DX2_RIGHT < 0.67 ) { 
		if( FIRST_RIGHT_DETECTION >= 459.5 ) { return new Prediction("LEFT", 25, 12); }
		if( FIRST_RIGHT_DETECTION < 459.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.67 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( DX2_DELTA >= 2017 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( DX2_DELTA < 2555.5 ) { 
		if( MAX_DX2_RIGHT < 7332 ) { return new Prediction("LEFT", 22, 0); }
		if( MAX_DX2_RIGHT >= 7332 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DX2_DELTA >= 2555.5 ) { 
		if( MAX_DX2_LEFT >= 3511 ) { return new Prediction("LEFT", 11, 0); }
	if( MAX_DX2_LEFT < 3511 ) { 
		if( MAX_AMP_LEFT < -3695 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_AMP_LEFT >= -3695 ) { 
		if( MAX_AMP_LEFT >= 4335.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < 4335.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 5972.5 ) { 
	if( MAX_DX2_LEFT < 10695 ) { 
		if( MAX_AMP_LEFT >= 10736 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_AMP_LEFT < 10736 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("RIGHT", 109, 0); }
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( MAX_AMP_LEFT < 4367.5 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("BOTTOM", 6, 0); }
	if( DETECTION_DELTA < 7 ) { 
	if( FIRST_LEFT_DETECTION >= 208.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 251.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 251.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 208.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4367.5 ) { 
		if( AVG_DX2_LEFT < -4.73 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -4.73 ) { return new Prediction("RIGHT", 30, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 10695 ) { 
	if( MAX_DX2_RIGHT < 15370 ) { 
		if( MAX_AMP_RIGHT >= 16571 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT < 16571 ) { return new Prediction("TOP", 45, 0); }
	}
	if( MAX_DX2_RIGHT >= 15370 ) { 
	if( AVG_AMP_LEFT < -6 ) { 
	if( MAX_AMP_RIGHT >= -14667.5 ) { 
		if( FIRST_LEFT_DETECTION >= 154 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_LEFT_DETECTION < 154 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT < -14667.5 ) { 
	if( MAX_DX2_RIGHT >= 28158 ) { 
		if( MAX_AMP_RIGHT < -28150.5 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_AMP_RIGHT >= -28150.5 ) { 
		if( AVG_AMP_LEFT >= -9.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT < -9.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 28158 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -6 ) { 
		if( AVG_AMP_LEFT >= 34 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_AMP_LEFT < 34 ) { return new Prediction("RIGHT", 31, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_RIGHT < 5237.5 ) { 
		if( MAX_DX2_LEFT >= 3359.5 ) { return new Prediction("TOP", 28, 0); }
	if( MAX_DX2_LEFT < 3359.5 ) { 
		if( AMP_DELTA >= 5588 ) { return new Prediction("BOTTOM", 33, 0); }
	if( AMP_DELTA < 5588 ) { 
	if( FIRST_RIGHT_DETECTION < 491.5 ) { 
	if( DETECTION_DELTA < 536 ) { 
	if( MAX_DX2_LEFT < 3104 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
		if( FIRST_RIGHT_DETECTION < 285 ) { return new Prediction("LEFT", 107, 0); }
	if( FIRST_RIGHT_DETECTION >= 285 ) { 
		if( DX2_DELTA < 2271 ) { return new Prediction("LEFT", 5, 0); }
		if( DX2_DELTA >= 2271 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( AVG_DX2_LEFT < -0.54 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_LEFT >= -0.54 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3104 ) { 
		if( FIRST_RIGHT_DETECTION < 211.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 211.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 491.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5237.5 ) { 
		if( MAX_AMP_RIGHT >= 9494 ) { return new Prediction("BOTTOM", 97, 0); }
	if( MAX_AMP_RIGHT < 9494 ) { 
	if( MAX_AMP_RIGHT < -9484.5 ) { 
		if( AVG_AMP_LEFT >= -21.5 ) { return new Prediction("BOTTOM", 63, 0); }
		if( AVG_AMP_LEFT < -21.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_RIGHT >= -9484.5 ) { 
		if( MAX_AMP_LEFT < 7649.5 ) { return new Prediction("LEFT", 17, 0); }
		if( MAX_AMP_LEFT >= 7649.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree46() {
	if( MAX_DX2_LEFT < 3851.5 ) { 
	if( AMP_DELTA >= 5271.5 ) { 
	if( MAX_AMP_LEFT >= 3867 ) { 
		if( MAX_DX2_LEFT < 2838 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_DX2_LEFT >= 2838 ) { 
		if( DETECTION_DELTA < 8 ) { return new Prediction("RIGHT", 14, 0); }
	if( DETECTION_DELTA >= 8 ) { 
		if( DX2_DELTA >= 2745 ) { return new Prediction("BOTTOM", 3, 0); }
		if( DX2_DELTA < 2745 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 3867 ) { 
	if( AMP_DELTA >= 6680.5 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( MAX_DX2_RIGHT < 6621 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 6621 ) { return new Prediction("BOTTOM", 24, 0); }
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 109, 0); }
	}
	if( AMP_DELTA < 6680.5 ) { 
		if( AVG_AMP_RIGHT >= 18 ) { return new Prediction("RIGHT", 5, 0); }
	if( AVG_AMP_RIGHT < 18 ) { 
		if( MAX_AMP_RIGHT >= 575 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_AMP_RIGHT < 575 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5271.5 ) { 
	if( AVG_AMP_RIGHT < 10.5 ) { 
	if( MAX_DX2_RIGHT >= 2017.5 ) { 
	if( MAX_AMP_LEFT >= 2521.5 ) { 
	if( MAX_DX2_RIGHT < 3589.5 ) { 
		if( AVG_DX2_LEFT < 0.58 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT >= 0.58 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 3589.5 ) { 
		if( AVG_DX2_RIGHT < 1.5 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT >= 1.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 2521.5 ) { 
		if( MAX_DX2_RIGHT >= 2567.5 ) { return new Prediction("LEFT", 36, 0); }
	if( MAX_DX2_RIGHT < 2567.5 ) { 
	if( AVG_AMP_RIGHT < -1 ) { 
	if( DETECTION_DELTA < 416 ) { 
		if( FIRST_LEFT_DETECTION >= 511.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 511.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( DETECTION_DELTA >= 416 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( AVG_AMP_RIGHT >= -1 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 2017.5 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 11, 0); }
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( DX2_DELTA < 1001 ) { return new Prediction("LEFT", 13, 7); }
		if( DX2_DELTA >= 1001 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 10.5 ) { 
	if( MAX_DX2_RIGHT < 6543 ) { 
	if( FIRST_LEFT_DETECTION < 100.5 ) { 
		if( AVG_DX2_LEFT >= -1.42 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < -1.42 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 100.5 ) { return new Prediction("LEFT", 115, 0); }
	}
	if( MAX_DX2_RIGHT >= 6543 ) { 
		if( AVG_DX2_RIGHT >= -2.4 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < -2.4 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3851.5 ) { 
	if( MAX_DX2_RIGHT < 9708 ) { 
	if( MAX_DX2_LEFT < 5048.5 ) { 
	if( DETECTION_DELTA >= 6 ) { 
		if( FIRST_LEFT_DETECTION < 255.5 ) { return new Prediction("TOP", 7, 0); }
		if( FIRST_LEFT_DETECTION >= 255.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 6 ) { 
		if( MAX_AMP_LEFT >= -53.5 ) { return new Prediction("RIGHT", 16, 0); }
		if( MAX_AMP_LEFT < -53.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 5048.5 ) { return new Prediction("TOP", 149, 0); }
	}
	if( MAX_DX2_RIGHT >= 9708 ) { 
	if( MAX_AMP_LEFT >= 5158.5 ) { 
	if( AMP_DELTA >= 4187 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 127, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_DX2_LEFT >= 13266.5 ) { 
	if( MAX_AMP_LEFT >= 9442.5 ) { 
		if( FIRST_LEFT_DETECTION >= 177 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 177 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT < 9442.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_DX2_LEFT < 13266.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 231.5 ) { return new Prediction("RIGHT", 43, 0); }
	}
	}
	}
		if( AMP_DELTA < 4187 ) { return new Prediction("TOP", 6, 0); }
	}
	if( MAX_AMP_LEFT < 5158.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 29, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_LEFT < 16917 ) { 
	if( MAX_DX2_RIGHT < 24980.5 ) { 
	if( MAX_DX2_RIGHT < 17496 ) { 
		if( MAX_AMP_RIGHT >= 12144.5 ) { return new Prediction("RIGHT", 12, 0); }
		if( MAX_AMP_RIGHT < 12144.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( MAX_DX2_RIGHT >= 17496 ) { 
		if( AVG_AMP_LEFT < -7 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT >= -7 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 24980.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( MAX_DX2_LEFT >= 16917 ) { 
		if( DX2_DELTA >= 3791 ) { return new Prediction("TOP", 6, 0); }
		if( DX2_DELTA < 3791 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree47() {
	if( AMP_DELTA >= 6433.5 ) { 
	if( DX2_DELTA >= 6425 ) { 
	if( MAX_DX2_LEFT < 15344 ) { 
	if( MAX_DX2_RIGHT < 11385 ) { 
		if( MAX_DX2_LEFT >= 8441.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_DX2_LEFT < 8441.5 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	if( MAX_DX2_RIGHT >= 11385 ) { 
	if( FIRST_LEFT_DETECTION < 269 ) { 
	if( MAX_DX2_RIGHT < 13385.5 ) { 
		if( DETECTION_DELTA >= 10.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( DETECTION_DELTA < 10.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	if( MAX_DX2_RIGHT >= 13385.5 ) { 
	if( MAX_AMP_LEFT < 5345 ) { 
	if( AMP_DELTA < 14426 ) { 
		if( DETECTION_DELTA >= 5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DETECTION_DELTA < 5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	if( AMP_DELTA >= 14426 ) { 
		if( MAX_DX2_LEFT >= 14138.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 14138.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 5345 ) { 
		if( FIRST_LEFT_DETECTION >= 120 ) { return new Prediction("RIGHT", 92, 0); }
	if( FIRST_LEFT_DETECTION < 120 ) { 
		if( FIRST_LEFT_DETECTION < 117.5 ) { return new Prediction("RIGHT", 20, 0); }
		if( FIRST_LEFT_DETECTION >= 117.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
		if( FIRST_LEFT_DETECTION >= 269 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 15344 ) { 
		if( DX2_DELTA >= 20463.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( DX2_DELTA < 20463.5 ) { 
		if( MAX_DX2_RIGHT < 28764 ) { return new Prediction("TOP", 40, 0); }
		if( MAX_DX2_RIGHT >= 28764 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( DX2_DELTA < 6425 ) { 
	if( DETECTION_DELTA >= 10 ) { 
		if( AVG_DX2_LEFT < 2.53 ) { return new Prediction("BOTTOM", 158, 0); }
	if( AVG_DX2_LEFT >= 2.53 ) { 
		if( MAX_DX2_RIGHT >= 6071 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 6071 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( DETECTION_DELTA < 10 ) { 
	if( MAX_DX2_LEFT < 8771 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
		if( AVG_DX2_LEFT >= 1.72 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 1.72 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_LEFT >= -5.5 ) { return new Prediction("RIGHT", 24, 0); }
	}
	if( MAX_DX2_LEFT >= 8771 ) { 
	if( AMP_DELTA < 8666.5 ) { 
		if( MAX_DX2_LEFT < 15103.5 ) { return new Prediction("TOP", 21, 0); }
		if( MAX_DX2_LEFT >= 15103.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AMP_DELTA >= 8666.5 ) { 
	if( AVG_AMP_LEFT < -6 ) { 
		if( MAX_DX2_RIGHT >= 16676.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 16676.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_LEFT >= -6 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6433.5 ) { 
	if( MAX_AMP_LEFT < 5134 ) { 
	if( AMP_DELTA < 4082 ) { 
	if( MAX_DX2_LEFT >= 3342.5 ) { 
	if( AVG_AMP_RIGHT >= 25 ) { 
		if( AVG_DX2_RIGHT < -1.59 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.59 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 25 ) { 
	if( AVG_DX2_LEFT < 0.87 ) { 
	if( AVG_AMP_RIGHT < 23 ) { 
		if( AVG_AMP_RIGHT < -5.5 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_AMP_RIGHT >= -5.5 ) { 
	if( MAX_DX2_LEFT >= 5872.5 ) { 
		if( MAX_AMP_LEFT >= -9133 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < -9133 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_LEFT < 5872.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 23 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_DX2_LEFT >= 0.87 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	if( MAX_DX2_LEFT < 3342.5 ) { 
		if( FIRST_RIGHT_DETECTION < 249.5 ) { return new Prediction("LEFT", 133, 0); }
	if( FIRST_RIGHT_DETECTION >= 249.5 ) { 
	if( DETECTION_DELTA >= 23 ) { 
	if( AMP_DELTA < 1831.5 ) { 
		if( AVG_DX2_LEFT < 0.49 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.49 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA >= 1831.5 ) { 
		if( FIRST_LEFT_DETECTION < 465.5 ) { return new Prediction("TOP", 10, 0); }
		if( FIRST_LEFT_DETECTION >= 465.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 23 ) { 
		if( FIRST_RIGHT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 17, 6); }
		if( FIRST_RIGHT_DETECTION < 481.5 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 4082 ) { 
	if( MAX_DX2_RIGHT < 6343.5 ) { 
	if( AMP_DELTA < 5030.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( DETECTION_DELTA < 508.5 ) { 
		if( AVG_AMP_RIGHT < 25.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT >= 25.5 ) { return new Prediction("LEFT", 9, 0); }
	}
		if( DETECTION_DELTA >= 508.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
		if( AVG_DX2_RIGHT < 1.54 ) { return new Prediction("LEFT", 11, 0); }
	if( AVG_DX2_RIGHT >= 1.54 ) { 
		if( FIRST_RIGHT_DETECTION >= 134 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 134 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5030.5 ) { 
	if( DX2_DELTA < 1880 ) { 
	if( MAX_DX2_LEFT < 2436.5 ) { 
		if( MAX_DX2_LEFT < 2283 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2283 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( MAX_DX2_LEFT >= 2436.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DX2_DELTA >= 1880 ) { 
		if( AMP_DELTA < 5646.5 ) { return new Prediction("LEFT", 9, 0); }
	if( AMP_DELTA >= 5646.5 ) { 
		if( AVG_DX2_RIGHT >= 0.82 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT < 0.82 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6343.5 ) { 
	if( AVG_AMP_LEFT >= -3.5 ) { 
	if( DX2_DELTA < 5167.5 ) { 
		if( MAX_AMP_RIGHT >= 10355.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < 10355.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA >= 5167.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( AVG_AMP_LEFT < -3.5 ) { 
		if( AVG_DX2_RIGHT >= 0.94 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT < 0.94 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5134 ) { 
		if( FIRST_RIGHT_DETECTION < 69.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( FIRST_RIGHT_DETECTION >= 69.5 ) { 
	if( MAX_DX2_LEFT < 4397.5 ) { 
		if( MAX_AMP_RIGHT >= 12223.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT < 12223.5 ) { return new Prediction("TOP", 9, 0); }
	}
		if( MAX_DX2_LEFT >= 4397.5 ) { return new Prediction("TOP", 82, 0); }
	}
	}
	}
return null;
}
private Prediction runTree48() {
	if( AMP_DELTA < 5917.5 ) { 
	if( MAX_DX2_RIGHT < 6344.5 ) { 
	if( AVG_DX2_RIGHT < -1.05 ) { 
	if( DX2_DELTA < 4086.5 ) { 
		if( MAX_DX2_LEFT < 4559 ) { return new Prediction("LEFT", 106, 0); }
		if( MAX_DX2_LEFT >= 4559 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DX2_DELTA >= 4086.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= -1.05 ) { 
	if( MAX_AMP_LEFT < 5280.5 ) { 
	if( AVG_AMP_LEFT >= -35.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 237.5 ) { 
	if( AMP_DELTA < 1853.5 ) { 
		if( MAX_DX2_LEFT >= 3004 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_LEFT < 3004 ) { 
		if( AMP_DELTA < 315.5 ) { return new Prediction("LEFT", 16, 3); }
		if( AMP_DELTA >= 315.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	if( AMP_DELTA >= 1853.5 ) { 
		if( MAX_DX2_RIGHT < 1009.5 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
		if( AVG_DX2_LEFT < -0.38 ) { return new Prediction("TOP", 1, 0); }
	if( AVG_DX2_LEFT >= -0.38 ) { 
	if( DX2_DELTA < 2389.5 ) { 
		if( MAX_AMP_LEFT < 2276 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_AMP_LEFT >= 2276 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 2389.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 237.5 ) { 
		if( DX2_DELTA >= 5145 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA < 5145 ) { 
	if( MAX_DX2_LEFT >= 3415.5 ) { 
		if( FIRST_LEFT_DETECTION >= 136.5 ) { return new Prediction("TOP", 4, 0); }
		if( FIRST_LEFT_DETECTION < 136.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_LEFT < 3415.5 ) { 
		if( DX2_DELTA < 2864 ) { return new Prediction("LEFT", 68, 0); }
	if( DX2_DELTA >= 2864 ) { 
		if( AVG_DX2_RIGHT < 1.93 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_DX2_RIGHT >= 1.93 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
		if( AVG_AMP_LEFT < -35.5 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_AMP_LEFT >= 5280.5 ) { return new Prediction("TOP", 51, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 6344.5 ) { 
	if( MAX_AMP_LEFT < 5695.5 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
	if( AVG_DX2_RIGHT >= 1.09 ) { 
	if( MAX_DX2_LEFT < 4598.5 ) { 
		if( FIRST_LEFT_DETECTION >= 146.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 146.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4598.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AVG_DX2_RIGHT < 1.09 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( AVG_AMP_LEFT < -4.5 ) { 
		if( MAX_AMP_LEFT >= -8373 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_LEFT < -8373 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 5695.5 ) { 
		if( FIRST_LEFT_DETECTION >= 56 ) { return new Prediction("TOP", 34, 0); }
		if( FIRST_LEFT_DETECTION < 56 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5917.5 ) { 
	if( MAX_DX2_LEFT >= 3578.5 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
	if( DETECTION_DELTA >= 30 ) { 
		if( DX2_DELTA < 2368 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA >= 2368 ) { return new Prediction("TOP", 3, 0); }
	}
		if( DETECTION_DELTA < 30 ) { return new Prediction("TOP", 57, 0); }
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
	if( AVG_AMP_LEFT >= 18.5 ) { 
	if( AVG_DX2_RIGHT >= 9.01 ) { 
		if( FIRST_LEFT_DETECTION >= 98.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION < 98.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 9.01 ) { return new Prediction("RIGHT", 37, 0); }
	}
	if( AVG_AMP_LEFT < 18.5 ) { 
	if( MAX_DX2_LEFT >= 17621 ) { 
		if( FIRST_LEFT_DETECTION >= 156 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 156 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_LEFT < 17621 ) { return new Prediction("RIGHT", 97, 0); }
	}
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_AMP_LEFT >= 4687.5 ) { 
		if( MAX_DX2_LEFT < 10344 ) { return new Prediction("RIGHT", 38, 0); }
	if( MAX_DX2_LEFT >= 10344 ) { 
	if( MAX_DX2_RIGHT >= 16920 ) { 
		if( FIRST_LEFT_DETECTION >= 223.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION < 223.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_DX2_RIGHT < 16920 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4687.5 ) { 
	if( FIRST_LEFT_DETECTION < 140 ) { 
		if( MAX_DX2_LEFT < 12211 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 12211 ) { return new Prediction("TOP", 7, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 140 ) { 
	if( AVG_DX2_LEFT < 4.07 ) { 
	if( AMP_DELTA < 10097.5 ) { 
		if( FIRST_LEFT_DETECTION < 196.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 196.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AMP_DELTA >= 10097.5 ) { return new Prediction("BOTTOM", 27, 0); }
	}
	if( AVG_DX2_LEFT >= 4.07 ) { 
		if( MAX_AMP_RIGHT < 14974.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_RIGHT >= 14974.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3578.5 ) { 
	if( FIRST_RIGHT_DETECTION < 120 ) { 
		if( AVG_DX2_LEFT < -2.18 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -2.18 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 120 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("BOTTOM", 148, 0); }
	if( DETECTION_DELTA < 7 ) { 
		if( AVG_AMP_LEFT < -5.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_AMP_LEFT >= -5.5 ) { 
	if( AVG_DX2_LEFT < 0.63 ) { 
		if( MAX_DX2_LEFT < 2472 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 2472 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_DX2_LEFT >= 0.63 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree49() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_LEFT < 3147 ) { 
	if( FIRST_RIGHT_DETECTION < 197.5 ) { 
	if( MAX_AMP_RIGHT >= 6516.5 ) { 
		if( DX2_DELTA < 2764.5 ) { return new Prediction("LEFT", 4, 0); }
	if( DX2_DELTA >= 2764.5 ) { 
	if( AVG_DX2_RIGHT < -2.03 ) { 
		if( FIRST_RIGHT_DETECTION >= 156 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 156 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -2.03 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( MAX_AMP_RIGHT < 6516.5 ) { return new Prediction("LEFT", 23, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 197.5 ) { 
	if( AMP_DELTA < 6237.5 ) { 
		if( AVG_AMP_LEFT >= 4 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_AMP_LEFT < 4 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("LEFT", 4, 0); }
	if( DETECTION_DELTA < 2 ) { 
	if( AMP_DELTA < 4385.5 ) { 
		if( AVG_DX2_RIGHT >= -0.15 ) { return new Prediction("LEFT", 14, 7); }
		if( AVG_DX2_RIGHT < -0.15 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AMP_DELTA >= 4385.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( AMP_DELTA >= 6237.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3147 ) { 
	if( AMP_DELTA < 7615.5 ) { 
	if( MAX_AMP_LEFT >= 7164 ) { 
	if( DX2_DELTA >= 10257.5 ) { 
		if( FIRST_RIGHT_DETECTION < 142.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 142.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DX2_DELTA < 10257.5 ) { return new Prediction("TOP", 99, 0); }
	}
	if( MAX_AMP_LEFT < 7164 ) { 
	if( MAX_AMP_RIGHT >= 7162.5 ) { 
	if( MAX_AMP_RIGHT < 11422 ) { 
	if( MAX_DX2_RIGHT >= 9458.5 ) { 
		if( FIRST_LEFT_DETECTION >= 156 ) { return new Prediction("LEFT", 7, 0); }
	if( FIRST_LEFT_DETECTION < 156 ) { 
		if( MAX_DX2_LEFT < 5601 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 5601 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 9458.5 ) { 
		if( FIRST_LEFT_DETECTION < 97 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 97 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 11422 ) { return new Prediction("RIGHT", 21, 0); }
	}
	if( MAX_AMP_RIGHT < 7162.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( AVG_DX2_LEFT >= -1.96 ) { return new Prediction("TOP", 14, 0); }
	if( AVG_DX2_LEFT < -1.96 ) { 
		if( AVG_DX2_LEFT >= -2.95 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -2.95 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( MAX_AMP_RIGHT >= -9366 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_AMP_RIGHT < -9366 ) { 
		if( MAX_DX2_LEFT >= 7231 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 7231 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 7615.5 ) { 
	if( MAX_AMP_LEFT < 14486.5 ) { 
	if( AVG_AMP_LEFT >= -3.5 ) { 
	if( MAX_DX2_RIGHT >= 26009 ) { 
		if( AVG_DX2_LEFT < -4.21 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -4.21 ) { return new Prediction("RIGHT", 13, 0); }
	}
		if( MAX_DX2_RIGHT < 26009 ) { return new Prediction("RIGHT", 135, 0); }
	}
	if( AVG_AMP_LEFT < -3.5 ) { 
		if( MAX_AMP_LEFT < -14504 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_AMP_LEFT >= -14504 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 10, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT < -8.5 ) { 
		if( MAX_DX2_LEFT >= 13134 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_LEFT < 13134 ) { 
		if( MAX_DX2_RIGHT < 29016 ) { return new Prediction("RIGHT", 16, 0); }
		if( MAX_DX2_RIGHT >= 29016 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 14486.5 ) { return new Prediction("TOP", 23, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( DX2_DELTA < 3303.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( MAX_DX2_LEFT < 3575 ) { 
		if( MAX_AMP_RIGHT >= 10118 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 10118 ) { return new Prediction("LEFT", 99, 0); }
	}
		if( MAX_DX2_LEFT >= 3575 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( MAX_DX2_RIGHT < 4379.5 ) { 
	if( MAX_AMP_RIGHT < -655 ) { 
	if( AMP_DELTA < 780 ) { 
		if( AVG_DX2_RIGHT < 0.11 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.11 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AMP_DELTA >= 780 ) { 
		if( AVG_DX2_RIGHT >= 0.17 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_RIGHT < 0.17 ) { 
	if( FIRST_RIGHT_DETECTION >= 202.5 ) { 
		if( DETECTION_DELTA >= 377.5 ) { return new Prediction("LEFT", 9, 0); }
	if( DETECTION_DELTA < 377.5 ) { 
	if( AVG_DX2_LEFT < 0.26 ) { 
		if( AMP_DELTA < 2492.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA >= 2492.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 202.5 ) { return new Prediction("LEFT", 17, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -655 ) { 
	if( AMP_DELTA < 1831.5 ) { 
		if( MAX_AMP_LEFT < 2772 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_AMP_LEFT >= 2772 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AMP_DELTA >= 1831.5 ) { 
		if( MAX_AMP_LEFT < -980 ) { return new Prediction("TOP", 10, 0); }
		if( MAX_AMP_LEFT >= -980 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 4379.5 ) { 
	if( AMP_DELTA < 5679.5 ) { 
		if( AVG_DX2_RIGHT >= 1.95 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_RIGHT < 1.95 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( AMP_DELTA >= 5679.5 ) { return new Prediction("BOTTOM", 25, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3303.5 ) { 
		if( AVG_AMP_RIGHT >= 44 ) { return new Prediction("LEFT", 4, 0); }
	if( AVG_AMP_RIGHT < 44 ) { 
	if( MAX_DX2_LEFT >= 4059.5 ) { 
		if( MAX_DX2_RIGHT < 7486 ) { return new Prediction("TOP", 22, 0); }
		if( MAX_DX2_RIGHT >= 7486 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	if( MAX_DX2_LEFT < 4059.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 113.5 ) { 
	if( AVG_DX2_RIGHT < -0.66 ) { 
		if( FIRST_RIGHT_DETECTION >= 221 ) { return new Prediction("BOTTOM", 23, 0); }
	if( FIRST_RIGHT_DETECTION < 221 ) { 
		if( AMP_DELTA >= 5615 ) { return new Prediction("BOTTOM", 15, 0); }
		if( AMP_DELTA < 5615 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= -0.66 ) { return new Prediction("BOTTOM", 86, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 113.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree50() {
	if( AMP_DELTA < 6400 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( MAX_AMP_RIGHT < -10396.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_RIGHT >= -10396.5 ) { 
	if( AVG_AMP_LEFT < 9.5 ) { 
		if( AVG_DX2_RIGHT >= -3.32 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT < -3.32 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_LEFT >= 9.5 ) { 
		if( MAX_DX2_LEFT < 2500 ) { return new Prediction("BOTTOM", 4, 0); }
	if( MAX_DX2_LEFT >= 2500 ) { 
		if( AVG_AMP_RIGHT >= 19 ) { return new Prediction("LEFT", 9, 0); }
		if( AVG_AMP_RIGHT < 19 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( MAX_AMP_LEFT < 4135.5 ) { 
	if( DX2_DELTA < 4086.5 ) { 
		if( DX2_DELTA < 2843.5 ) { return new Prediction("LEFT", 109, 0); }
	if( DX2_DELTA >= 2843.5 ) { 
	if( FIRST_LEFT_DETECTION < 167 ) { 
		if( AVG_AMP_LEFT >= -9 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT < -9 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 167 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	if( DX2_DELTA >= 4086.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 163 ) { 
		if( MAX_DX2_LEFT < 3827.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 3827.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 163 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4135.5 ) { 
		if( MAX_DX2_LEFT < 3385 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 3385 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( MAX_DX2_LEFT < 3082 ) { 
	if( MAX_AMP_RIGHT < -2247.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("LEFT", 22, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( DX2_DELTA < 3303.5 ) { 
		if( FIRST_RIGHT_DETECTION < 204 ) { return new Prediction("LEFT", 12, 0); }
	if( FIRST_RIGHT_DETECTION >= 204 ) { 
	if( AVG_DX2_RIGHT >= -2.21 ) { 
		if( FIRST_RIGHT_DETECTION < 263 ) { return new Prediction("LEFT", 9, 0); }
	if( FIRST_RIGHT_DETECTION >= 263 ) { 
		if( AVG_AMP_RIGHT < -8 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT >= -8 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT < -2.21 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DX2_DELTA >= 3303.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 185 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 185 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -2247.5 ) { 
	if( MAX_DX2_RIGHT >= 2460.5 ) { 
	if( FIRST_RIGHT_DETECTION < 214 ) { 
	if( FIRST_RIGHT_DETECTION >= 113 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( FIRST_LEFT_DETECTION < 193.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 193.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 1.5 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 113 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 214 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( MAX_DX2_RIGHT < 2460.5 ) { 
	if( AMP_DELTA < 1743.5 ) { 
		if( MAX_DX2_RIGHT < 1081.5 ) { return new Prediction("LEFT", 14, 5); }
		if( MAX_DX2_RIGHT >= 1081.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AMP_DELTA >= 1743.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3082 ) { 
	if( MAX_DX2_RIGHT >= 10355 ) { 
	if( MAX_DX2_LEFT < 15222.5 ) { 
		if( FIRST_LEFT_DETECTION < 196.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 196.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 15222.5 ) { 
		if( MAX_DX2_RIGHT < 13936 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 13936 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 10355 ) { 
	if( MAX_AMP_LEFT < -3614 ) { 
	if( MAX_DX2_LEFT >= 4656.5 ) { 
		if( AVG_DX2_RIGHT >= 6.69 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 6.69 ) { return new Prediction("TOP", 27, 0); }
	}
	if( MAX_DX2_LEFT < 4656.5 ) { 
		if( AVG_AMP_RIGHT >= -11 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_AMP_RIGHT < -11 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= -3614 ) { return new Prediction("TOP", 102, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AVG_DX2_LEFT < 2.87 ) { 
		if( MAX_DX2_LEFT < 10206.5 ) { return new Prediction("BOTTOM", 151, 0); }
	if( MAX_DX2_LEFT >= 10206.5 ) { 
		if( AVG_DX2_RIGHT < 0.83 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT >= 0.83 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 2.87 ) { return new Prediction("TOP", 9, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < 11815.5 ) { 
	if( MAX_AMP_LEFT >= -11307.5 ) { 
	if( MAX_DX2_RIGHT < 26241.5 ) { 
	if( FIRST_RIGHT_DETECTION < 248.5 ) { 
	if( MAX_DX2_RIGHT >= 7174 ) { 
	if( MAX_DX2_LEFT >= 15713.5 ) { 
		if( FIRST_RIGHT_DETECTION < 194 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 194 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_LEFT < 15713.5 ) { 
	if( AMP_DELTA < 7478 ) { 
		if( AMP_DELTA < 7403 ) { return new Prediction("RIGHT", 14, 0); }
		if( AMP_DELTA >= 7403 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AMP_DELTA >= 7478 ) { return new Prediction("RIGHT", 154, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 7174 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 248.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 26241.5 ) { 
		if( AVG_AMP_LEFT >= -8 ) { return new Prediction("RIGHT", 14, 0); }
		if( AVG_AMP_LEFT < -8 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	if( MAX_AMP_LEFT < -11307.5 ) { 
		if( AVG_DX2_RIGHT < -6.57 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -6.57 ) { return new Prediction("TOP", 15, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 11815.5 ) { return new Prediction("TOP", 40, 0); }
	}
	}
return null;
}
private Prediction runTree51() {
	if( AMP_DELTA >= 6150.5 ) { 
	if( MAX_AMP_RIGHT >= 13031.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( DETECTION_DELTA < 8 ) { 
		if( FIRST_RIGHT_DETECTION >= 179.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 179.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 28, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 81, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( MAX_DX2_LEFT < 13848 ) { return new Prediction("RIGHT", 45, 0); }
		if( MAX_DX2_LEFT >= 13848 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < 13031.5 ) { 
	if( MAX_AMP_RIGHT >= -15816 ) { 
	if( MAX_DX2_LEFT < 3992.5 ) { 
	if( AMP_DELTA >= 6652 ) { 
		if( AVG_AMP_RIGHT < -22 ) { return new Prediction("RIGHT", 1, 0); }
	if( AVG_AMP_RIGHT >= -22 ) { 
		if( FIRST_LEFT_DETECTION >= 230 ) { return new Prediction("BOTTOM", 88, 0); }
	if( FIRST_LEFT_DETECTION < 230 ) { 
		if( FIRST_RIGHT_DETECTION < 215 ) { return new Prediction("BOTTOM", 60, 0); }
		if( FIRST_RIGHT_DETECTION >= 215 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 6652 ) { 
		if( FIRST_LEFT_DETECTION >= 208.5 ) { return new Prediction("BOTTOM", 9, 0); }
	if( FIRST_LEFT_DETECTION < 208.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 57 ) { return new Prediction("RIGHT", 8, 0); }
		if( FIRST_RIGHT_DETECTION < 57 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3992.5 ) { 
		if( MAX_AMP_LEFT >= 9300 ) { return new Prediction("TOP", 63, 0); }
	if( MAX_AMP_LEFT < 9300 ) { 
		if( MAX_AMP_LEFT < -5919 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_AMP_LEFT >= -5919 ) { 
	if( DX2_DELTA < 7761 ) { 
	if( DETECTION_DELTA < 9 ) { 
		if( MAX_DX2_RIGHT < 16759.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( MAX_DX2_RIGHT >= 16759.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DETECTION_DELTA >= 9 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( DX2_DELTA >= 7761 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -15816 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( AVG_AMP_RIGHT >= -12 ) { return new Prediction("RIGHT", 49, 0); }
		if( AVG_AMP_RIGHT < -12 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
		if( DX2_DELTA >= 13373.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DX2_DELTA < 13373.5 ) { 
		if( FIRST_LEFT_DETECTION >= 211 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_LEFT_DETECTION < 211 ) { 
		if( MAX_DX2_RIGHT < 12889 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 12889 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6150.5 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 256 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( DETECTION_DELTA < 399 ) { return new Prediction("TOP", 2, 0); }
		if( DETECTION_DELTA >= 399 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 4, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 256 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( MAX_AMP_LEFT >= -5899 ) { 
	if( DETECTION_DELTA < 541.5 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 70, 0); }
	if( AVG_DX2_RIGHT >= 0.03 ) { 
	if( MAX_DX2_LEFT < 1000 ) { 
		if( AMP_DELTA >= 3663 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AMP_DELTA < 3663 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 1000 ) { return new Prediction("LEFT", 25, 0); }
	}
	}
		if( DETECTION_DELTA >= 541.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT < -5899 ) { 
		if( FIRST_RIGHT_DETECTION < 176 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 176 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
	if( AMP_DELTA >= 4228 ) { 
		if( DX2_DELTA >= 2332 ) { return new Prediction("RIGHT", 4, 0); }
		if( DX2_DELTA < 2332 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AMP_DELTA < 4228 ) { 
	if( MAX_AMP_LEFT >= -1358 ) { 
	if( FIRST_RIGHT_DETECTION >= 111 ) { 
		if( MAX_DX2_LEFT < 1069 ) { return new Prediction("LEFT", 9, 3); }
		if( MAX_DX2_LEFT >= 1069 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 111 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT < -1358 ) { return new Prediction("LEFT", 19, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( MAX_AMP_LEFT < 5095.5 ) { 
	if( MAX_AMP_LEFT < 4366.5 ) { 
	if( AVG_DX2_LEFT >= -3.01 ) { 
	if( MAX_AMP_LEFT < -6774 ) { 
		if( AVG_DX2_LEFT < 1.32 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_LEFT >= 1.32 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_LEFT >= -6774 ) { return new Prediction("LEFT", 48, 0); }
	}
		if( AVG_DX2_LEFT < -3.01 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_AMP_LEFT >= 4366.5 ) { 
	if( MAX_DX2_LEFT >= 3126.5 ) { 
	if( AVG_AMP_LEFT < 9.5 ) { 
		if( FIRST_LEFT_DETECTION >= 128 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_LEFT_DETECTION < 128 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 9.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_DX2_LEFT < 3126.5 ) { 
		if( AVG_DX2_RIGHT >= -1.75 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < -1.75 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 5095.5 ) { 
	if( MAX_AMP_LEFT < 7220.5 ) { 
		if( MAX_DX2_RIGHT < 8586.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_DX2_RIGHT >= 8586.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 7220.5 ) { return new Prediction("TOP", 102, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree52() {
	if( AMP_DELTA >= 6433.5 ) { 
	if( MAX_AMP_LEFT < 4782.5 ) { 
	if( MAX_AMP_LEFT < -7344.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( FIRST_LEFT_DETECTION >= 34 ) { return new Prediction("RIGHT", 13, 0); }
		if( FIRST_LEFT_DETECTION < 34 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_AMP_RIGHT >= 20124 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 20124 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( MAX_AMP_LEFT >= -7344.5 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 111, 0); }
	if( MAX_DX2_LEFT >= 2787.5 ) { 
		if( DETECTION_DELTA >= 5 ) { return new Prediction("BOTTOM", 75, 0); }
	if( DETECTION_DELTA < 5 ) { 
		if( AVG_DX2_RIGHT < 7.88 ) { return new Prediction("RIGHT", 19, 0); }
		if( AVG_DX2_RIGHT >= 7.88 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4782.5 ) { 
		if( MAX_AMP_RIGHT >= 12289.5 ) { return new Prediction("RIGHT", 101, 0); }
	if( MAX_AMP_RIGHT < 12289.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("TOP", 42, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
	if( MAX_DX2_LEFT < 18889 ) { 
		if( FIRST_LEFT_DETECTION < 237.5 ) { return new Prediction("RIGHT", 61, 0); }
		if( FIRST_LEFT_DETECTION >= 237.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 18889 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6433.5 ) { 
	if( MAX_DX2_LEFT >= 3650.5 ) { 
	if( MAX_DX2_RIGHT >= 10416 ) { 
		if( AVG_AMP_RIGHT >= 14.5 ) { return new Prediction("LEFT", 6, 0); }
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( AVG_DX2_LEFT >= 2.3 ) { 
		if( MAX_DX2_LEFT < 13510 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 13510 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < 2.3 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 10416 ) { 
	if( MAX_DX2_LEFT < 5048.5 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 236 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 236 ) { return new Prediction("TOP", 14, 0); }
	}
	if( AVG_AMP_LEFT < -4.5 ) { 
		if( AVG_DX2_RIGHT < 7.3 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT >= 7.3 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 5048.5 ) { 
		if( AVG_DX2_RIGHT < 8.18 ) { return new Prediction("TOP", 93, 0); }
	if( AVG_DX2_RIGHT >= 8.18 ) { 
		if( AVG_DX2_RIGHT < 9.04 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 9.04 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( MAX_DX2_RIGHT >= 2567.5 ) { 
	if( AMP_DELTA >= 3871.5 ) { 
	if( MAX_DX2_RIGHT < 5467.5 ) { 
		if( DETECTION_DELTA >= 523 ) { return new Prediction("RIGHT", 1, 0); }
	if( DETECTION_DELTA < 523 ) { 
	if( DX2_DELTA < 3303.5 ) { 
		if( AMP_DELTA < 5729.5 ) { return new Prediction("LEFT", 30, 0); }
	if( AMP_DELTA >= 5729.5 ) { 
	if( MAX_AMP_RIGHT >= -11247.5 ) { 
		if( MAX_DX2_LEFT < 2328 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2328 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_AMP_RIGHT < -11247.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( DX2_DELTA >= 3303.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5467.5 ) { 
		if( MAX_AMP_LEFT < -2894.5 ) { return new Prediction("LEFT", 6, 0); }
	if( MAX_AMP_LEFT >= -2894.5 ) { 
		if( AVG_DX2_LEFT < -0.86 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_LEFT >= -0.86 ) { 
	if( MAX_DX2_RIGHT >= 6699.5 ) { 
		if( AVG_DX2_RIGHT < 0.23 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.23 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 6699.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 3871.5 ) { 
		if( MAX_AMP_LEFT >= 5038 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 5038 ) { return new Prediction("LEFT", 139, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 2567.5 ) { 
	if( AVG_AMP_RIGHT < -1 ) { 
		if( AVG_AMP_RIGHT < -5.5 ) { return new Prediction("LEFT", 7, 0); }
	if( AVG_AMP_RIGHT >= -5.5 ) { 
		if( DX2_DELTA < 2246.5 ) { return new Prediction("LEFT", 4, 0); }
	if( DX2_DELTA >= 2246.5 ) { 
		if( AMP_DELTA < 3863 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AMP_DELTA >= 3863 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -1 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( DETECTION_DELTA >= 180.5 ) { return new Prediction("LEFT", 6, 0); }
		if( DETECTION_DELTA < 180.5 ) { return new Prediction("LEFT", 11, 5); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree53() {
	if( AMP_DELTA >= 6215.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( MAX_DX2_LEFT < 10695 ) { 
	if( MAX_DX2_RIGHT >= 7329.5 ) { 
	if( MAX_AMP_LEFT < 4367.5 ) { 
		if( AVG_DX2_LEFT >= 1.58 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_LEFT < 1.58 ) { 
		if( FIRST_RIGHT_DETECTION >= 175.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 175.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4367.5 ) { return new Prediction("RIGHT", 113, 0); }
	}
	if( MAX_DX2_RIGHT < 7329.5 ) { 
		if( AVG_DX2_LEFT >= 1.72 ) { return new Prediction("TOP", 5, 0); }
	if( AVG_DX2_LEFT < 1.72 ) { 
		if( AVG_DX2_RIGHT >= 4.55 ) { return new Prediction("RIGHT", 6, 0); }
	if( AVG_DX2_RIGHT < 4.55 ) { 
		if( FIRST_LEFT_DETECTION < 188.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 188.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 10695 ) { 
	if( MAX_AMP_RIGHT < -16222.5 ) { 
	if( AVG_AMP_RIGHT >= -12 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
		if( AVG_DX2_LEFT >= -0.45 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < -0.45 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AVG_AMP_LEFT >= -5.5 ) { return new Prediction("RIGHT", 36, 0); }
	}
		if( AVG_AMP_RIGHT < -12 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( MAX_AMP_RIGHT >= -16222.5 ) { 
		if( MAX_AMP_RIGHT < 16595.5 ) { return new Prediction("TOP", 46, 0); }
	if( MAX_AMP_RIGHT >= 16595.5 ) { 
		if( MAX_AMP_LEFT < 23132.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_AMP_LEFT >= 23132.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( FIRST_LEFT_DETECTION >= 157 ) { 
	if( MAX_DX2_RIGHT >= 3386.5 ) { 
		if( MAX_DX2_LEFT < 17177.5 ) { return new Prediction("BOTTOM", 176, 0); }
		if( MAX_DX2_LEFT >= 17177.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 3386.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( FIRST_LEFT_DETECTION < 157 ) { 
	if( MAX_DX2_LEFT < 5351.5 ) { 
		if( AVG_DX2_RIGHT >= 1.29 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 1.29 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( MAX_DX2_LEFT >= 5351.5 ) { 
		if( AVG_DX2_RIGHT < 4.79 ) { return new Prediction("TOP", 13, 0); }
		if( AVG_DX2_RIGHT >= 4.79 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6215.5 ) { 
	if( MAX_DX2_LEFT >= 4878 ) { 
	if( MAX_DX2_RIGHT >= 7617 ) { 
	if( AVG_DX2_RIGHT < 1.66 ) { 
	if( MAX_AMP_RIGHT >= -605 ) { 
		if( MAX_AMP_RIGHT >= 12061 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < 12061 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_AMP_RIGHT < -605 ) { return new Prediction("TOP", 14, 0); }
	}
	if( AVG_DX2_RIGHT >= 1.66 ) { 
		if( FIRST_LEFT_DETECTION < 105 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 105 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 7617 ) { return new Prediction("TOP", 90, 0); }
	}
	if( MAX_DX2_LEFT < 4878 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( AVG_AMP_RIGHT >= 10 ) { 
	if( AMP_DELTA >= 4355.5 ) { 
		if( DX2_DELTA < 3756.5 ) { return new Prediction("LEFT", 7, 0); }
		if( DX2_DELTA >= 3756.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 4355.5 ) { return new Prediction("LEFT", 128, 0); }
	}
	if( AVG_AMP_RIGHT < 10 ) { 
	if( MAX_DX2_RIGHT < 1009.5 ) { 
	if( DETECTION_DELTA < 416.5 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
		if( DX2_DELTA < 1061.5 ) { return new Prediction("LEFT", 21, 5); }
		if( DX2_DELTA >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DETECTION_DELTA >= 416.5 ) { return new Prediction("TOP", 8, 0); }
	}
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
		if( AVG_DX2_RIGHT >= 4.22 ) { return new Prediction("RIGHT", 1, 0); }
	if( AVG_DX2_RIGHT < 4.22 ) { 
	if( AVG_AMP_LEFT < -14 ) { 
		if( AVG_DX2_RIGHT < -3.73 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_DX2_RIGHT >= -3.73 ) { 
		if( AVG_DX2_LEFT < 0.41 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= 0.41 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -14 ) { 
		if( FIRST_RIGHT_DETECTION < 284.5 ) { return new Prediction("LEFT", 45, 0); }
	if( FIRST_RIGHT_DETECTION >= 284.5 ) { 
		if( AVG_DX2_RIGHT < 0.03 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
	if( AVG_AMP_RIGHT >= 26.5 ) { 
		if( FIRST_LEFT_DETECTION >= 75.5 ) { return new Prediction("LEFT", 10, 0); }
		if( FIRST_LEFT_DETECTION < 75.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < 26.5 ) { 
	if( AVG_AMP_LEFT >= 7 ) { 
		if( DX2_DELTA >= 3566.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( DX2_DELTA < 3566.5 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_DX2_LEFT >= 0.26 ) { 
		if( AVG_DX2_RIGHT < -0.22 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.22 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( AVG_AMP_LEFT < 7 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree54() {
	if( MAX_DX2_RIGHT < 6617.5 ) { 
	if( MAX_DX2_LEFT < 3601 ) { 
		if( AMP_DELTA >= 6433.5 ) { return new Prediction("BOTTOM", 68, 0); }
	if( AMP_DELTA < 6433.5 ) { 
	if( MAX_DX2_RIGHT >= 2422 ) { 
	if( MAX_DX2_LEFT < 3220.5 ) { 
	if( AMP_DELTA < 4293.5 ) { 
	if( DETECTION_DELTA >= 23 ) { 
	if( AVG_DX2_RIGHT >= -3.49 ) { 
		if( MAX_AMP_RIGHT < -2405 ) { return new Prediction("LEFT", 20, 0); }
	if( MAX_AMP_RIGHT >= -2405 ) { 
		if( MAX_AMP_RIGHT < -1906 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT >= -1906 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( AVG_DX2_RIGHT < -3.49 ) { 
		if( AVG_DX2_RIGHT >= -6.3 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -6.3 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( DETECTION_DELTA < 23 ) { return new Prediction("LEFT", 121, 0); }
	}
	if( AMP_DELTA >= 4293.5 ) { 
		if( MAX_AMP_RIGHT < -4681.5 ) { return new Prediction("LEFT", 13, 0); }
	if( MAX_AMP_RIGHT >= -4681.5 ) { 
	if( FIRST_LEFT_DETECTION >= 172 ) { 
	if( FIRST_RIGHT_DETECTION >= 138 ) { 
		if( AVG_AMP_RIGHT >= 26 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_RIGHT < 26 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 138 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 172 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3220.5 ) { 
		if( AVG_DX2_LEFT < 0.69 ) { return new Prediction("LEFT", 10, 0); }
	if( AVG_DX2_LEFT >= 0.69 ) { 
		if( FIRST_RIGHT_DETECTION < 161.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 161.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 2422 ) { 
	if( FIRST_LEFT_DETECTION < 465.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( MAX_DX2_LEFT < 2478 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2478 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 11, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 465.5 ) { 
		if( DX2_DELTA < 1001 ) { return new Prediction("LEFT", 13, 3); }
		if( DX2_DELTA >= 1001 ) { return new Prediction("LEFT", 17, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3601 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("TOP", 97, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
		if( FIRST_RIGHT_DETECTION < 93.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 93.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6617.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_DX2_LEFT >= 10841.5 ) { 
		if( FIRST_RIGHT_DETECTION < 158 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 158 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_LEFT < 10841.5 ) { 
	if( MAX_DX2_LEFT >= 4474.5 ) { 
	if( AMP_DELTA < 11095 ) { 
		if( FIRST_LEFT_DETECTION < 195 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 195 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( AMP_DELTA >= 11095 ) { return new Prediction("BOTTOM", 22, 0); }
	}
		if( MAX_DX2_LEFT < 4474.5 ) { return new Prediction("BOTTOM", 102, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_AMP_LEFT >= 42.5 ) { return new Prediction("TOP", 18, 0); }
	if( AVG_AMP_LEFT < 42.5 ) { 
	if( MAX_DX2_RIGHT < 10156.5 ) { 
		if( MAX_DX2_LEFT >= 6046.5 ) { return new Prediction("TOP", 32, 0); }
	if( MAX_DX2_LEFT < 6046.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
		if( FIRST_LEFT_DETECTION >= 244.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 244.5 ) { return new Prediction("RIGHT", 27, 0); }
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
		if( AVG_DX2_RIGHT >= 5.12 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < 5.12 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 10156.5 ) { 
	if( AMP_DELTA >= 7238 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT < 7354 ) { 
		if( AVG_DX2_RIGHT < 2.02 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.02 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( MAX_DX2_LEFT >= 7354 ) { 
		if( MAX_DX2_RIGHT >= 15260.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_DX2_RIGHT < 15260.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_LEFT < 33001.5 ) { 
	if( DX2_DELTA >= 18021.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 222 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 222 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA < 18021.5 ) { return new Prediction("RIGHT", 139, 0); }
	}
		if( MAX_DX2_LEFT >= 33001.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AMP_DELTA < 7238 ) { 
	if( AVG_AMP_RIGHT < 17 ) { 
	if( AVG_DX2_LEFT < -1.56 ) { 
		if( FIRST_RIGHT_DETECTION < 169.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 169.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_LEFT >= -1.56 ) { return new Prediction("RIGHT", 8, 0); }
	}
		if( AVG_AMP_RIGHT >= 17 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree55() {
	if( MAX_AMP_LEFT < 4782.5 ) { 
	if( AMP_DELTA < 6400 ) { 
	if( FIRST_LEFT_DETECTION >= 231 ) { 
	if( MAX_AMP_LEFT < 2896 ) { 
	if( DETECTION_DELTA < 536 ) { 
	if( FIRST_RIGHT_DETECTION < 250.5 ) { 
		if( AVG_AMP_RIGHT >= -10.5 ) { return new Prediction("LEFT", 28, 0); }
	if( AVG_AMP_RIGHT < -10.5 ) { 
		if( AVG_DX2_RIGHT >= 1.03 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 1.03 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 250.5 ) { 
	if( AVG_DX2_LEFT < 0.78 ) { 
	if( DETECTION_DELTA < 17 ) { 
		if( MAX_AMP_RIGHT >= 7439 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_RIGHT < 7439 ) { 
		if( FIRST_LEFT_DETECTION < 269 ) { return new Prediction("TOP", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 269 ) { 
		if( MAX_DX2_LEFT >= 14327.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 14327.5 ) { return new Prediction("LEFT", 17, 7); }
	}
	}
	}
	if( DETECTION_DELTA >= 17 ) { 
		if( DX2_DELTA >= 2428.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DX2_DELTA < 2428.5 ) { return new Prediction("LEFT", 14, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 0.78 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_AMP_LEFT >= 2896 ) { 
	if( AVG_AMP_RIGHT >= 12 ) { 
		if( FIRST_RIGHT_DETECTION >= 242 ) { return new Prediction("LEFT", 3, 0); }
	if( FIRST_RIGHT_DETECTION < 242 ) { 
		if( MAX_DX2_LEFT < 2850.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2850.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 12 ) { 
		if( AVG_DX2_LEFT < -0.32 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.32 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION < 231 ) { 
	if( AMP_DELTA >= 4315 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( FIRST_LEFT_DETECTION < 135 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 135 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_DX2_LEFT < 3352 ) { 
		if( DX2_DELTA < 3403 ) { return new Prediction("LEFT", 10, 0); }
	if( DX2_DELTA >= 3403 ) { 
		if( FIRST_RIGHT_DETECTION >= 169 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 169 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3352 ) { 
		if( MAX_DX2_LEFT < 7019.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_LEFT >= 7019.5 ) { 
		if( AVG_DX2_LEFT >= 4.72 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 4.72 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 4315 ) { 
		if( MAX_AMP_LEFT < -6692 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_AMP_LEFT >= -6692 ) { 
	if( FIRST_RIGHT_DETECTION < 235 ) { 
		if( MAX_AMP_LEFT >= 4590.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_AMP_LEFT < 4590.5 ) { 
	if( MAX_DX2_LEFT >= 5147 ) { 
		if( MAX_AMP_LEFT >= -5063 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT < -5063 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_LEFT < 5147 ) { return new Prediction("LEFT", 125, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 235 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_DX2_RIGHT < 3308.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_RIGHT >= 3308.5 ) { 
	if( AVG_AMP_RIGHT < -17 ) { 
		if( MAX_DX2_RIGHT < 4771 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4771 ) { return new Prediction("BOTTOM", 13, 0); }
	}
		if( AVG_AMP_RIGHT >= -17 ) { return new Prediction("BOTTOM", 171, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DX2_DELTA >= 4952 ) { 
	if( MAX_DX2_LEFT < 11597.5 ) { 
		if( AVG_AMP_LEFT < -4 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AVG_AMP_LEFT >= -4 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( MAX_DX2_LEFT >= 11597.5 ) { 
		if( MAX_AMP_LEFT < -10602 ) { return new Prediction("TOP", 24, 0); }
		if( MAX_AMP_LEFT >= -10602 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DX2_DELTA < 4952 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( FIRST_LEFT_DETECTION >= 202 ) { return new Prediction("BOTTOM", 6, 0); }
	if( FIRST_LEFT_DETECTION < 202 ) { 
		if( DX2_DELTA >= 2966 ) { return new Prediction("RIGHT", 4, 0); }
		if( DX2_DELTA < 2966 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4782.5 ) { 
	if( MAX_DX2_RIGHT >= 9820.5 ) { 
		if( MAX_AMP_LEFT >= 17888 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT < 17888 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( MAX_DX2_LEFT >= 15431.5 ) { 
		if( AVG_AMP_LEFT < 13.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_LEFT >= 13.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 15431.5 ) { return new Prediction("RIGHT", 124, 0); }
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( DX2_DELTA < 17783.5 ) { 
		if( MAX_DX2_RIGHT >= 16701 ) { return new Prediction("RIGHT", 17, 0); }
	if( MAX_DX2_RIGHT < 16701 ) { 
	if( MAX_AMP_RIGHT < 14868 ) { 
		if( AVG_DX2_RIGHT >= 1.28 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 1.28 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 14868 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( DX2_DELTA >= 17783.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 9820.5 ) { 
	if( DX2_DELTA >= 4255.5 ) { 
		if( MAX_DX2_LEFT >= 5883 ) { return new Prediction("TOP", 52, 0); }
		if( MAX_DX2_LEFT < 5883 ) { return new Prediction("RIGHT", 13, 0); }
	}
	if( DX2_DELTA < 4255.5 ) { 
		if( FIRST_LEFT_DETECTION >= 53.5 ) { return new Prediction("TOP", 94, 0); }
		if( FIRST_LEFT_DETECTION < 53.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree56() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( DX2_DELTA < 3494 ) { 
	if( AMP_DELTA < 5729.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 246.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
	if( FIRST_RIGHT_DETECTION >= 484 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
		if( FIRST_LEFT_DETECTION >= 461 ) { return new Prediction("LEFT", 19, 7); }
		if( FIRST_LEFT_DETECTION < 461 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 484 ) { 
		if( DX2_DELTA < 2473 ) { return new Prediction("LEFT", 17, 0); }
	if( DX2_DELTA >= 2473 ) { 
		if( MAX_DX2_LEFT >= 1164.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1164.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 6, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 246.5 ) { 
	if( AVG_DX2_RIGHT < 1.9 ) { 
	if( DX2_DELTA < 925.5 ) { 
		if( MAX_AMP_LEFT >= 3364.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < 3364.5 ) { return new Prediction("LEFT", 28, 0); }
	}
		if( DX2_DELTA >= 925.5 ) { return new Prediction("LEFT", 120, 0); }
	}
	if( AVG_DX2_RIGHT >= 1.9 ) { 
	if( AVG_DX2_RIGHT >= 2.1 ) { 
		if( AVG_AMP_LEFT >= 17 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_LEFT < 17 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AVG_DX2_RIGHT < 2.1 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5729.5 ) { 
	if( AVG_DX2_LEFT < 0.7 ) { 
	if( MAX_DX2_LEFT >= 3062.5 ) { 
		if( FIRST_LEFT_DETECTION >= 222 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 222 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 3062.5 ) { return new Prediction("BOTTOM", 34, 0); }
	}
		if( AVG_DX2_LEFT >= 0.7 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( DX2_DELTA >= 3494 ) { 
		if( DETECTION_DELTA >= 524 ) { return new Prediction("RIGHT", 4, 0); }
	if( DETECTION_DELTA < 524 ) { 
	if( AVG_DX2_LEFT >= -0.89 ) { 
	if( AVG_DX2_RIGHT >= 5.48 ) { 
		if( FIRST_RIGHT_DETECTION >= 180.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 180.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_DX2_RIGHT < 5.48 ) { return new Prediction("BOTTOM", 101, 0); }
	}
	if( AVG_DX2_LEFT < -0.89 ) { 
		if( DX2_DELTA < 4367.5 ) { return new Prediction("LEFT", 5, 0); }
		if( DX2_DELTA >= 4367.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
		if( MAX_DX2_RIGHT < 6303.5 ) { return new Prediction("TOP", 101, 0); }
	if( MAX_DX2_RIGHT >= 6303.5 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("LEFT", 1, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( MAX_DX2_RIGHT >= 6317.5 ) { return new Prediction("TOP", 48, 0); }
		if( MAX_DX2_RIGHT < 6317.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( MAX_AMP_LEFT < 13089 ) { 
	if( FIRST_LEFT_DETECTION < 251.5 ) { 
	if( MAX_DX2_LEFT < 14038.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AVG_DX2_RIGHT < -6.27 ) { 
	if( AVG_DX2_LEFT >= 0.3 ) { 
		if( AVG_DX2_LEFT >= 2.09 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 2.09 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_LEFT < 0.3 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_DX2_RIGHT >= -6.27 ) { 
	if( AMP_DELTA < 5972.5 ) { 
		if( MAX_AMP_LEFT < 4475 ) { return new Prediction("LEFT", 5, 0); }
	if( MAX_AMP_LEFT >= 4475 ) { 
		if( AVG_DX2_RIGHT >= -3.13 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT < -3.13 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AMP_DELTA >= 5972.5 ) { 
	if( MAX_DX2_LEFT < 3972.5 ) { 
		if( MAX_DX2_RIGHT >= 10470 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 10470 ) { return new Prediction("RIGHT", 13, 0); }
	}
		if( MAX_DX2_LEFT >= 3972.5 ) { return new Prediction("RIGHT", 169, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 5.5 ) { 
	if( MAX_DX2_RIGHT < 8825.5 ) { 
		if( AVG_DX2_LEFT < -0.18 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -0.18 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 8825.5 ) { 
		if( MAX_AMP_LEFT < 3761.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( MAX_AMP_LEFT >= 3761.5 ) { 
		if( MAX_DX2_LEFT < 6048.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 6048.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 14038.5 ) { 
	if( MAX_DX2_RIGHT >= 26729.5 ) { 
		if( FIRST_LEFT_DETECTION >= 142.5 ) { return new Prediction("RIGHT", 20, 0); }
	if( FIRST_LEFT_DETECTION < 142.5 ) { 
		if( FIRST_LEFT_DETECTION < 140.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 140.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 26729.5 ) { 
	if( MAX_AMP_LEFT >= -10079 ) { 
	if( AVG_DX2_RIGHT >= 1.39 ) { 
		if( AVG_DX2_LEFT < 1.08 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT >= 1.08 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 1.39 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_AMP_LEFT < -10079 ) { 
	if( FIRST_LEFT_DETECTION >= 160 ) { 
		if( AVG_DX2_LEFT >= 0.97 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 0.97 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 160 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 251.5 ) { 
		if( AMP_DELTA >= 7408.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( AMP_DELTA < 7408.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 273.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 273.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 13089 ) { return new Prediction("TOP", 21, 0); }
	}
	}
return null;
}
private Prediction runTree57() {
	if( DX2_DELTA >= 3004.5 ) { 
	if( MAX_DX2_LEFT < 3576 ) { 
		if( AVG_DX2_LEFT < -1.34 ) { return new Prediction("LEFT", 8, 0); }
	if( AVG_DX2_LEFT >= -1.34 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( AMP_DELTA < 7094 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( AMP_DELTA >= 7094 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT >= 2787.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( FIRST_LEFT_DETECTION >= 493 ) { 
		if( DETECTION_DELTA >= 524 ) { return new Prediction("RIGHT", 6, 0); }
	if( DETECTION_DELTA < 524 ) { 
		if( DX2_DELTA < 3388 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 3388 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 493 ) { 
		if( FIRST_LEFT_DETECTION >= 126.5 ) { return new Prediction("BOTTOM", 108, 0); }
		if( FIRST_LEFT_DETECTION < 126.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3576 ) { 
	if( AMP_DELTA < 7641 ) { 
	if( MAX_AMP_RIGHT < 5832.5 ) { 
		if( MAX_DX2_RIGHT < 13372.5 ) { return new Prediction("TOP", 58, 0); }
		if( MAX_DX2_RIGHT >= 13372.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_AMP_RIGHT >= 5832.5 ) { 
		if( AVG_AMP_RIGHT < -31 ) { return new Prediction("TOP", 7, 0); }
	if( AVG_AMP_RIGHT >= -31 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_AMP_RIGHT < 11441.5 ) { 
		if( MAX_DX2_LEFT >= 5525.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_LEFT < 5525.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_AMP_RIGHT >= 11441.5 ) { 
		if( AVG_DX2_LEFT >= -1.17 ) { return new Prediction("RIGHT", 12, 0); }
		if( AVG_DX2_LEFT < -1.17 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
		if( AVG_DX2_RIGHT < 3.24 ) { return new Prediction("LEFT", 4, 0); }
	if( AVG_DX2_RIGHT >= 3.24 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_AMP_LEFT >= -0.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 7641 ) { 
	if( MAX_DX2_LEFT < 15602 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT >= 6165 ) { 
		if( AMP_DELTA >= 11228 ) { return new Prediction("BOTTOM", 26, 0); }
	if( AMP_DELTA < 11228 ) { 
	if( MAX_AMP_LEFT < 6045 ) { 
		if( MAX_DX2_LEFT < 10361.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 10361.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 6045 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	if( MAX_DX2_LEFT < 6165 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("RIGHT", 13, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("BOTTOM", 11, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT < -20 ) { 
		if( AVG_DX2_RIGHT >= -3.21 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < -3.21 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_LEFT >= -20 ) { 
	if( DX2_DELTA >= 18366 ) { 
		if( AVG_DX2_RIGHT < -5.08 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -5.08 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DX2_DELTA < 18366 ) { return new Prediction("RIGHT", 174, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 15602 ) { 
	if( MAX_AMP_RIGHT >= -17560.5 ) { 
	if( AVG_DX2_RIGHT < -1.52 ) { 
		if( AVG_DX2_RIGHT < -2.3 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_DX2_RIGHT >= -2.3 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -1.52 ) { return new Prediction("TOP", 26, 0); }
	}
	if( MAX_AMP_RIGHT < -17560.5 ) { 
		if( AVG_AMP_LEFT < -8.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA < 3004.5 ) { 
	if( AMP_DELTA >= 5663 ) { 
		if( MAX_AMP_RIGHT >= 14899 ) { return new Prediction("RIGHT", 6, 0); }
	if( MAX_AMP_RIGHT < 14899 ) { 
	if( MAX_DX2_LEFT >= 2907.5 ) { 
	if( MAX_AMP_LEFT >= -3889.5 ) { 
		if( MAX_AMP_LEFT < 382 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT >= 382 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_AMP_LEFT < -3889.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_LEFT < 2907.5 ) { 
	if( AVG_AMP_RIGHT < -13.5 ) { 
		if( FIRST_LEFT_DETECTION >= 245.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= -13.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	}
	if( AMP_DELTA < 5663 ) { 
	if( MAX_DX2_LEFT >= 3650.5 ) { 
		if( AMP_DELTA < 3397 ) { return new Prediction("TOP", 44, 0); }
	if( AMP_DELTA >= 3397 ) { 
		if( MAX_DX2_RIGHT < 5938.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_RIGHT >= 5938.5 ) { 
		if( MAX_AMP_LEFT < 2382 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_AMP_LEFT >= 2382 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( AVG_AMP_RIGHT < 8 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
	if( FIRST_LEFT_DETECTION < 465.5 ) { 
		if( AMP_DELTA >= 1954.5 ) { return new Prediction("TOP", 8, 0); }
	if( AMP_DELTA < 1954.5 ) { 
		if( FIRST_LEFT_DETECTION >= 255 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 465.5 ) { 
		if( MAX_DX2_RIGHT >= 1001 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_RIGHT < 1001 ) { return new Prediction("LEFT", 11, 3); }
	}
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( AMP_DELTA >= 354 ) { 
	if( MAX_AMP_RIGHT < 6060.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( MAX_DX2_RIGHT < 2403.5 ) { 
		if( AMP_DELTA < 3783.5 ) { return new Prediction("LEFT", 4, 0); }
	if( AMP_DELTA >= 3783.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 293 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 293 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 2403.5 ) { return new Prediction("LEFT", 28, 0); }
	}
		if( MAX_AMP_LEFT >= 3859 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 6060.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AMP_DELTA < 354 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 8 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("LEFT", 107, 0); }
	if( DETECTION_DELTA < 2 ) { 
		if( DX2_DELTA < 2764.5 ) { return new Prediction("LEFT", 16, 0); }
		if( DX2_DELTA >= 2764.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree58() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( AMP_DELTA >= 7547.5 ) { 
	if( MAX_AMP_LEFT < 14486.5 ) { 
	if( MAX_AMP_RIGHT >= 12284.5 ) { 
		if( MAX_AMP_LEFT < -17514.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT >= -17514.5 ) { return new Prediction("RIGHT", 110, 0); }
	}
	if( MAX_AMP_RIGHT < 12284.5 ) { 
	if( MAX_AMP_LEFT < 5710.5 ) { 
		if( MAX_AMP_LEFT < -10602 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_AMP_LEFT >= -10602 ) { 
		if( AVG_AMP_LEFT < -5.5 ) { return new Prediction("BOTTOM", 12, 0); }
	if( AVG_AMP_LEFT >= -5.5 ) { 
		if( MAX_DX2_RIGHT >= 13038.5 ) { return new Prediction("RIGHT", 11, 0); }
		if( MAX_DX2_RIGHT < 13038.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5710.5 ) { return new Prediction("RIGHT", 52, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 14486.5 ) { return new Prediction("TOP", 16, 0); }
	}
	if( AMP_DELTA < 7547.5 ) { 
	if( MAX_AMP_LEFT < 6180 ) { 
	if( MAX_AMP_RIGHT < 6287 ) { 
	if( MAX_DX2_LEFT < 7203 ) { 
	if( MAX_DX2_RIGHT < 5230.5 ) { 
		if( FIRST_LEFT_DETECTION < 447 ) { return new Prediction("LEFT", 23, 0); }
		if( FIRST_LEFT_DETECTION >= 447 ) { return new Prediction("LEFT", 11, 3); }
	}
	if( MAX_DX2_RIGHT >= 5230.5 ) { 
		if( AVG_DX2_LEFT < 0.72 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_LEFT >= 0.72 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 7203 ) { return new Prediction("TOP", 13, 0); }
	}
	if( MAX_AMP_RIGHT >= 6287 ) { 
		if( FIRST_LEFT_DETECTION >= 267 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_LEFT_DETECTION < 267 ) { 
	if( DX2_DELTA < 2681.5 ) { 
		if( AVG_DX2_RIGHT < 1.2 ) { return new Prediction("LEFT", 6, 0); }
		if( AVG_DX2_RIGHT >= 1.2 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DX2_DELTA >= 2681.5 ) { 
	if( MAX_AMP_LEFT >= -3324 ) { 
		if( AVG_DX2_LEFT < 2.97 ) { return new Prediction("RIGHT", 19, 0); }
	if( AVG_DX2_LEFT >= 2.97 ) { 
		if( AVG_DX2_RIGHT >= 0.96 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < 0.96 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < -3324 ) { 
		if( AVG_AMP_RIGHT >= -10.5 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_AMP_RIGHT < -10.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6180 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( MAX_AMP_LEFT >= 10179.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 10179.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 109, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( AMP_DELTA < 5646.5 ) { 
	if( AVG_DX2_RIGHT >= -0.52 ) { 
	if( MAX_AMP_LEFT < 4121.5 ) { 
	if( FIRST_LEFT_DETECTION >= 272.5 ) { 
	if( DX2_DELTA >= 2308 ) { 
	if( AMP_DELTA < 4681.5 ) { 
	if( MAX_DX2_LEFT < 1202 ) { 
		if( FIRST_RIGHT_DETECTION >= 243 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_RIGHT_DETECTION < 243 ) { 
		if( AVG_DX2_RIGHT >= 0.97 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 0.97 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 1202 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AMP_DELTA >= 4681.5 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( DX2_DELTA < 2308 ) { return new Prediction("LEFT", 17, 0); }
	}
	if( FIRST_LEFT_DETECTION < 272.5 ) { 
	if( MAX_AMP_LEFT >= -6597 ) { 
	if( MAX_DX2_RIGHT < 2673 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_DX2_RIGHT >= 2673 ) { return new Prediction("LEFT", 24, 0); }
	}
		if( MAX_AMP_LEFT < -6597 ) { return new Prediction("TOP", 6, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4121.5 ) { return new Prediction("TOP", 18, 0); }
	}
	if( AVG_DX2_RIGHT < -0.52 ) { 
		if( MAX_DX2_LEFT >= 1055.5 ) { return new Prediction("LEFT", 69, 0); }
	if( MAX_DX2_LEFT < 1055.5 ) { 
		if( MAX_AMP_RIGHT < 4323 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_RIGHT >= 4323 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5646.5 ) { 
	if( FIRST_LEFT_DETECTION >= 128 ) { 
	if( MAX_DX2_LEFT >= 4059.5 ) { 
	if( MAX_AMP_LEFT < 5435 ) { 
		if( MAX_DX2_RIGHT < 5784 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_RIGHT >= 5784 ) { return new Prediction("BOTTOM", 18, 0); }
	}
		if( MAX_AMP_LEFT >= 5435 ) { return new Prediction("TOP", 9, 0); }
	}
		if( MAX_DX2_LEFT < 4059.5 ) { return new Prediction("BOTTOM", 181, 0); }
	}
	if( FIRST_LEFT_DETECTION < 128 ) { 
		if( FIRST_LEFT_DETECTION < 83 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 83 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
return null;
}
private Prediction runTree59() {
	if( MAX_AMP_LEFT >= 5158.5 ) { 
	if( AMP_DELTA >= 7589 ) { 
	if( MAX_AMP_LEFT < 14486.5 ) { 
		if( FIRST_LEFT_DETECTION >= 245 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 245 ) { return new Prediction("RIGHT", 152, 0); }
	}
		if( MAX_AMP_LEFT >= 14486.5 ) { return new Prediction("TOP", 35, 0); }
	}
	if( AMP_DELTA < 7589 ) { 
	if( MAX_DX2_RIGHT >= 10416 ) { 
	if( AVG_AMP_LEFT >= -9 ) { 
		if( FIRST_RIGHT_DETECTION < 224 ) { return new Prediction("RIGHT", 7, 0); }
		if( FIRST_RIGHT_DETECTION >= 224 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT < -9 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 10416 ) { 
		if( MAX_DX2_LEFT >= 4224 ) { return new Prediction("TOP", 125, 0); }
	if( MAX_DX2_LEFT < 4224 ) { 
		if( MAX_DX2_RIGHT >= 7137.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 7137.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 5158.5 ) { 
	if( DX2_DELTA >= 2913.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AMP_DELTA < 5621.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 218.5 ) { return new Prediction("TOP", 6, 0); }
	if( FIRST_RIGHT_DETECTION < 218.5 ) { 
	if( AMP_DELTA >= 4271.5 ) { 
		if( DETECTION_DELTA < 508.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DETECTION_DELTA >= 508.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA < 4271.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	if( AMP_DELTA >= 5621.5 ) { 
	if( MAX_DX2_LEFT < 13423 ) { 
		if( MAX_AMP_LEFT >= -7675 ) { return new Prediction("BOTTOM", 178, 0); }
		if( MAX_AMP_LEFT < -7675 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 13423 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( FIRST_LEFT_DETECTION >= 194.5 ) { 
	if( AMP_DELTA >= 5895.5 ) { 
	if( AVG_AMP_LEFT < -4 ) { 
		if( AVG_AMP_LEFT >= -12 ) { return new Prediction("BOTTOM", 7, 0); }
	if( AVG_AMP_LEFT < -12 ) { 
		if( AVG_DX2_RIGHT >= -2.8 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < -2.8 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -4 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2787.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	if( AMP_DELTA < 5895.5 ) { 
		if( MAX_AMP_RIGHT >= -915.5 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_AMP_RIGHT < -915.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 194.5 ) { 
	if( AVG_AMP_RIGHT < 2.5 ) { 
		if( AVG_DX2_RIGHT < 0.04 ) { return new Prediction("TOP", 10, 0); }
	if( AVG_DX2_RIGHT >= 0.04 ) { 
		if( MAX_AMP_RIGHT < 3903 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_RIGHT >= 3903 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 2.5 ) { 
		if( AVG_DX2_RIGHT >= 6.5 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_DX2_RIGHT < 6.5 ) { 
		if( AVG_DX2_LEFT < -3.06 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -3.06 ) { return new Prediction("RIGHT", 23, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA < 2913.5 ) { 
	if( FIRST_RIGHT_DETECTION < 249.5 ) { 
	if( MAX_DX2_RIGHT >= 4556.5 ) { 
	if( AMP_DELTA >= 5914.5 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( AMP_DELTA < 5914.5 ) { 
	if( MAX_DX2_LEFT < 3778.5 ) { 
		if( MAX_DX2_RIGHT >= 4614 ) { return new Prediction("LEFT", 40, 0); }
		if( MAX_DX2_RIGHT < 4614 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 3778.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 4556.5 ) { return new Prediction("LEFT", 103, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 249.5 ) { 
	if( AVG_AMP_RIGHT < 17 ) { 
	if( MAX_DX2_RIGHT < 3482 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
	if( AVG_AMP_RIGHT < -1 ) { 
		if( FIRST_RIGHT_DETECTION >= 293 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 293 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AVG_AMP_RIGHT >= -1 ) { 
	if( FIRST_LEFT_DETECTION >= 256.5 ) { 
		if( DETECTION_DELTA < 195.5 ) { return new Prediction("LEFT", 13, 7); }
		if( DETECTION_DELTA >= 195.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 256.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 7, 0); }
	}
		if( MAX_DX2_RIGHT >= 3482 ) { return new Prediction("BOTTOM", 14, 0); }
	}
		if( AVG_AMP_RIGHT >= 17 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	}
return null;
}
private Prediction runTree60() {
	if( MAX_AMP_LEFT >= 4579.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_DX2_RIGHT < 8455 ) { return new Prediction("TOP", 101, 0); }
	if( MAX_DX2_RIGHT >= 8455 ) { 
	if( MAX_DX2_LEFT < 6828 ) { 
		if( MAX_AMP_LEFT < 4782.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_LEFT >= 4782.5 ) { return new Prediction("RIGHT", 17, 0); }
	}
	if( MAX_DX2_LEFT >= 6828 ) { 
		if( FIRST_RIGHT_DETECTION < 231 ) { return new Prediction("TOP", 15, 0); }
		if( FIRST_RIGHT_DETECTION >= 231 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( DX2_DELTA >= 1712 ) { 
	if( DX2_DELTA < 17783.5 ) { 
	if( MAX_DX2_RIGHT >= 6867.5 ) { 
		if( AMP_DELTA >= 7238 ) { return new Prediction("RIGHT", 161, 0); }
	if( AMP_DELTA < 7238 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("LEFT", 2, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 6867.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DX2_DELTA >= 17783.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( DX2_DELTA < 1712 ) { return new Prediction("TOP", 19, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4579.5 ) { 
	if( AMP_DELTA < 5768 ) { 
	if( MAX_AMP_LEFT < -6778.5 ) { 
		if( FIRST_LEFT_DETECTION >= 254 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 254 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_AMP_LEFT >= -6778.5 ) { 
	if( FIRST_RIGHT_DETECTION < 248 ) { 
	if( DX2_DELTA >= 2868 ) { 
	if( AMP_DELTA >= 3805 ) { 
		if( MAX_AMP_LEFT < -2894.5 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_AMP_LEFT >= -2894.5 ) { 
	if( FIRST_LEFT_DETECTION >= 247 ) { 
		if( FIRST_RIGHT_DETECTION >= 126 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION < 126 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( FIRST_LEFT_DETECTION < 247 ) { 
		if( MAX_AMP_LEFT >= 3949.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < 3949.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
		if( AMP_DELTA < 3805 ) { return new Prediction("LEFT", 14, 0); }
	}
	if( DX2_DELTA < 2868 ) { 
		if( MAX_DX2_LEFT < 5304 ) { return new Prediction("LEFT", 133, 0); }
		if( MAX_DX2_LEFT >= 5304 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 248 ) { 
	if( MAX_DX2_RIGHT >= 2460.5 ) { 
		if( AVG_AMP_RIGHT >= 6.5 ) { return new Prediction("LEFT", 11, 0); }
	if( AVG_AMP_RIGHT < 6.5 ) { 
		if( AVG_DX2_RIGHT >= -0.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < -0.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 2460.5 ) { 
	if( FIRST_LEFT_DETECTION < 465.5 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 465.5 ) { 
	if( DX2_DELTA < 2303 ) { 
		if( MAX_DX2_RIGHT < 1009.5 ) { return new Prediction("LEFT", 23, 7); }
		if( MAX_DX2_RIGHT >= 1009.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( DX2_DELTA >= 2303 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 5768 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT >= -7675 ) { 
		if( DX2_DELTA >= 1727.5 ) { return new Prediction("BOTTOM", 192, 0); }
	if( DX2_DELTA < 1727.5 ) { 
		if( AVG_DX2_LEFT < 0.7 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.7 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT < -7675 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_LEFT < 11189 ) { 
		if( MAX_DX2_LEFT >= 10444 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_DX2_LEFT < 10444 ) { 
	if( FIRST_LEFT_DETECTION < 197.5 ) { 
		if( AVG_DX2_RIGHT < 6.86 ) { return new Prediction("RIGHT", 17, 0); }
		if( AVG_DX2_RIGHT >= 6.86 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 197.5 ) { 
	if( MAX_AMP_RIGHT >= 10677 ) { 
		if( AVG_AMP_LEFT >= 7 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT < 7 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT < 10677 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 11189 ) { 
	if( DX2_DELTA < 4191.5 ) { 
		if( FIRST_RIGHT_DETECTION < 165 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 165 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( DX2_DELTA >= 4191.5 ) { 
		if( MAX_AMP_LEFT >= -11322 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < -11322 ) { return new Prediction("TOP", 21, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree61() {
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_DX2_RIGHT >= 6029.5 ) { 
	if( AMP_DELTA >= 5014.5 ) { 
	if( MAX_AMP_LEFT >= 5691 ) { 
		if( AVG_DX2_RIGHT < -0.34 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.34 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT < 5691 ) { return new Prediction("BOTTOM", 142, 0); }
	}
	if( AMP_DELTA < 5014.5 ) { 
		if( AVG_DX2_RIGHT >= 0.53 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT < 0.53 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6029.5 ) { 
	if( AMP_DELTA < 5544.5 ) { 
	if( MAX_DX2_LEFT >= 3415.5 ) { 
	if( AMP_DELTA >= 3772.5 ) { 
		if( AVG_DX2_RIGHT >= -1.55 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT < -1.55 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA < 3772.5 ) { return new Prediction("TOP", 22, 0); }
	}
	if( MAX_DX2_LEFT < 3415.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 273 ) { 
	if( FIRST_LEFT_DETECTION >= 305.5 ) { 
		if( AVG_AMP_RIGHT < -2 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_RIGHT >= -2 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( FIRST_LEFT_DETECTION < 305.5 ) { 
		if( AVG_DX2_LEFT < -0.33 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT >= -0.33 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 273 ) { 
	if( DETECTION_DELTA < 478.5 ) { 
	if( MAX_AMP_RIGHT < -6857.5 ) { 
		if( DX2_DELTA >= 1103.5 ) { return new Prediction("LEFT", 18, 0); }
		if( DX2_DELTA < 1103.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -6857.5 ) { return new Prediction("LEFT", 99, 0); }
	}
	if( DETECTION_DELTA >= 478.5 ) { 
		if( AVG_DX2_RIGHT >= 1.4 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_DX2_RIGHT < 1.4 ) { 
		if( DX2_DELTA < 3612.5 ) { return new Prediction("LEFT", 6, 0); }
		if( DX2_DELTA >= 3612.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 5544.5 ) { 
	if( MAX_AMP_LEFT < 7324 ) { 
	if( AVG_DX2_LEFT >= -1.32 ) { 
		if( FIRST_LEFT_DETECTION < 174.5 ) { return new Prediction("TOP", 2, 0); }
	if( FIRST_LEFT_DETECTION >= 174.5 ) { 
		if( DX2_DELTA < 1592.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 1592.5 ) { return new Prediction("BOTTOM", 43, 0); }
	}
	}
	if( AVG_DX2_LEFT < -1.32 ) { 
		if( AVG_DX2_LEFT >= -3.83 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -3.83 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 7324 ) { return new Prediction("TOP", 15, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AMP_DELTA >= 5807.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_RIGHT >= 9500 ) { 
	if( MAX_DX2_LEFT < 9677 ) { 
		if( MAX_DX2_LEFT < 4815 ) { return new Prediction("RIGHT", 22, 0); }
	if( MAX_DX2_LEFT >= 4815 ) { 
		if( AVG_DX2_LEFT < -3.06 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -3.06 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 9677 ) { return new Prediction("TOP", 8, 0); }
	}
	if( MAX_AMP_RIGHT < 9500 ) { 
	if( AVG_DX2_RIGHT >= 1.94 ) { 
		if( FIRST_RIGHT_DETECTION < 186.5 ) { return new Prediction("TOP", 8, 0); }
	if( FIRST_RIGHT_DETECTION >= 186.5 ) { 
		if( MAX_AMP_LEFT >= 11771 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 11771 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
		if( AVG_DX2_RIGHT < 1.94 ) { return new Prediction("TOP", 48, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 7819 ) { 
		if( FIRST_LEFT_DETECTION < 125.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 125.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_DX2_RIGHT >= 7819 ) { 
	if( AMP_DELTA >= 7445 ) { 
	if( AVG_AMP_LEFT >= -19 ) { 
		if( AVG_AMP_LEFT >= 38 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_LEFT < 38 ) { return new Prediction("RIGHT", 162, 0); }
	}
	if( AVG_AMP_LEFT < -19 ) { 
		if( FIRST_LEFT_DETECTION >= 120 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION < 120 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AMP_DELTA < 7445 ) { 
		if( AVG_DX2_RIGHT >= 6.26 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT < 6.26 ) { return new Prediction("RIGHT", 14, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5807.5 ) { 
	if( MAX_AMP_LEFT < 6095 ) { 
	if( MAX_DX2_LEFT >= 3342.5 ) { 
		if( DX2_DELTA < 1892.5 ) { return new Prediction("TOP", 7, 0); }
	if( DX2_DELTA >= 1892.5 ) { 
	if( MAX_DX2_LEFT < 11513.5 ) { 
	if( MAX_AMP_LEFT >= -53.5 ) { 
		if( MAX_DX2_LEFT < 4598.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( MAX_DX2_LEFT >= 4598.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 185.5 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_RIGHT_DETECTION < 185.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT < -53.5 ) { return new Prediction("LEFT", 13, 0); }
	}
	if( MAX_DX2_LEFT >= 11513.5 ) { 
		if( FIRST_LEFT_DETECTION >= 241.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 241.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3342.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 228 ) { 
		if( MAX_AMP_RIGHT >= 6470 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_AMP_RIGHT < 6470 ) { 
		if( FIRST_LEFT_DETECTION < 481.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 14, 4); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 228 ) { return new Prediction("LEFT", 34, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 6095 ) { 
		if( MAX_DX2_RIGHT >= 14841 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 14841 ) { return new Prediction("TOP", 48, 0); }
	}
	}
	}
return null;
}
private Prediction runTree62() {
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AMP_DELTA >= 6141.5 ) { 
	if( FIRST_LEFT_DETECTION >= 231 ) { 
	if( AVG_DX2_RIGHT >= 6.03 ) { 
		if( FIRST_RIGHT_DETECTION < 263 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 263 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AVG_DX2_RIGHT < 6.03 ) { 
		if( AVG_AMP_RIGHT < 30.5 ) { return new Prediction("BOTTOM", 106, 0); }
		if( AVG_AMP_RIGHT >= 30.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 231 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_AMP_LEFT >= 9005.5 ) { return new Prediction("TOP", 21, 0); }
	if( MAX_AMP_LEFT < 9005.5 ) { 
	if( MAX_DX2_LEFT < 14141 ) { 
		if( FIRST_RIGHT_DETECTION >= 439 ) { return new Prediction("TOP", 2, 0); }
	if( FIRST_RIGHT_DETECTION < 439 ) { 
		if( AMP_DELTA >= 6761 ) { return new Prediction("BOTTOM", 87, 0); }
	if( AMP_DELTA < 6761 ) { 
	if( AVG_DX2_LEFT >= -1.32 ) { 
		if( MAX_AMP_LEFT >= 18 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < 18 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_LEFT < -1.32 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 14141 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_LEFT >= -11307.5 ) { 
	if( MAX_DX2_RIGHT < 8363.5 ) { 
		if( FIRST_LEFT_DETECTION >= 147.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( FIRST_LEFT_DETECTION < 147.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 8363.5 ) { 
		if( MAX_DX2_RIGHT < 30715 ) { return new Prediction("RIGHT", 51, 0); }
	if( MAX_DX2_RIGHT >= 30715 ) { 
		if( AVG_DX2_LEFT >= -0.09 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT < -0.09 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < -11307.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AMP_DELTA < 6141.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( MAX_DX2_LEFT < 3410.5 ) { 
		if( DETECTION_DELTA >= 523 ) { return new Prediction("RIGHT", 2, 0); }
	if( DETECTION_DELTA < 523 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( FIRST_RIGHT_DETECTION < 165 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 165 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( DETECTION_DELTA >= 2.5 ) { return new Prediction("LEFT", 91, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3410.5 ) { 
	if( DX2_DELTA < 2504 ) { 
		if( AVG_DX2_LEFT < 1.55 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT >= 1.55 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 2504 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
		if( MAX_AMP_LEFT >= 2568.5 ) { return new Prediction("TOP", 42, 0); }
	if( MAX_AMP_LEFT < 2568.5 ) { 
	if( DX2_DELTA >= 4474 ) { 
		if( FIRST_LEFT_DETECTION >= 224.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 224.5 ) { return new Prediction("TOP", 8, 0); }
	}
	if( DX2_DELTA < 4474 ) { 
	if( AMP_DELTA >= 2535 ) { 
		if( FIRST_RIGHT_DETECTION < 227 ) { return new Prediction("LEFT", 33, 0); }
	if( FIRST_RIGHT_DETECTION >= 227 ) { 
	if( MAX_DX2_LEFT >= 2334.5 ) { 
		if( MAX_DX2_RIGHT >= 3829 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 3829 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_DX2_LEFT < 2334.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( AMP_DELTA < 2535 ) { 
	if( DETECTION_DELTA < 27.5 ) { 
		if( FIRST_RIGHT_DETECTION < 201.5 ) { return new Prediction("LEFT", 10, 0); }
	if( FIRST_RIGHT_DETECTION >= 201.5 ) { 
		if( MAX_DX2_LEFT >= 2732.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 2732.5 ) { 
		if( MAX_DX2_RIGHT >= 1371.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 1371.5 ) { return new Prediction("LEFT", 15, 6); }
	}
	}
	}
	if( DETECTION_DELTA >= 27.5 ) { 
		if( MAX_DX2_LEFT < 1063 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 1063 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( MAX_AMP_LEFT < 10386.5 ) { 
	if( MAX_DX2_LEFT >= 3088 ) { 
	if( MAX_DX2_RIGHT < 6871.5 ) { 
	if( AMP_DELTA >= 7524 ) { 
		if( MAX_DX2_LEFT < 13670.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_LEFT >= 13670.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AMP_DELTA < 7524 ) { return new Prediction("TOP", 21, 0); }
	}
	if( MAX_DX2_RIGHT >= 6871.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AMP_DELTA < 5972.5 ) { 
		if( DX2_DELTA >= 5759 ) { return new Prediction("RIGHT", 7, 0); }
	if( DX2_DELTA < 5759 ) { 
	if( DETECTION_DELTA >= 2 ) { 
		if( AVG_AMP_LEFT >= 10.5 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_AMP_LEFT < 10.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( AMP_DELTA >= 5972.5 ) { 
	if( MAX_DX2_LEFT >= 15431.5 ) { 
		if( AVG_DX2_RIGHT >= 0.82 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 0.82 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_DX2_LEFT < 15431.5 ) { return new Prediction("RIGHT", 134, 0); }
	}
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( MAX_DX2_LEFT < 3088 ) { 
		if( MAX_DX2_LEFT >= 2482.5 ) { return new Prediction("BOTTOM", 9, 0); }
	if( MAX_DX2_LEFT < 2482.5 ) { 
		if( AVG_DX2_RIGHT < -3.82 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -3.82 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 10386.5 ) { 
		if( MAX_AMP_RIGHT < 18933.5 ) { return new Prediction("TOP", 71, 0); }
		if( MAX_AMP_RIGHT >= 18933.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
return null;
}
private Prediction runTree63() {
	if( AMP_DELTA >= 5807.5 ) { 
	if( MAX_AMP_LEFT >= 4804.5 ) { 
		if( MAX_AMP_LEFT >= 13729 ) { return new Prediction("TOP", 57, 0); }
	if( MAX_AMP_LEFT < 13729 ) { 
	if( MAX_DX2_LEFT < 10718 ) { 
	if( MAX_DX2_RIGHT >= 5477 ) { 
		if( AMP_DELTA < 6261.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA >= 6261.5 ) { return new Prediction("RIGHT", 131, 0); }
	}
		if( MAX_DX2_RIGHT < 5477 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 10718 ) { 
	if( MAX_AMP_LEFT < 7243 ) { 
		if( FIRST_LEFT_DETECTION >= 239 ) { return new Prediction("BOTTOM", 4, 0); }
	if( FIRST_LEFT_DETECTION < 239 ) { 
		if( FIRST_RIGHT_DETECTION >= 181.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 181.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 7243 ) { return new Prediction("RIGHT", 29, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 4804.5 ) { 
	if( MAX_DX2_LEFT < 10253.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("BOTTOM", 9, 0); }
	if( DETECTION_DELTA < 7 ) { 
		if( AVG_DX2_LEFT >= 1.72 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_LEFT < 1.72 ) { 
	if( DX2_DELTA < 2940.5 ) { 
		if( AVG_DX2_RIGHT >= 2.95 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 2.95 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 2940.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 82.5 ) { 
		if( DX2_DELTA < 1002 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA >= 1002 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( MAX_DX2_LEFT < 2560 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2560 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 1.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 493 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 493 ) { return new Prediction("BOTTOM", 189, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 82.5 ) { 
		if( MAX_DX2_RIGHT >= 7003.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 7003.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 10253.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 15, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
	if( MAX_DX2_RIGHT >= 15260.5 ) { 
		if( AVG_DX2_RIGHT < 2.12 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT >= 2.12 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_DX2_RIGHT < 15260.5 ) { return new Prediction("TOP", 21, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5807.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AVG_DX2_RIGHT >= 1.19 ) { 
	if( MAX_AMP_LEFT < 2301 ) { 
	if( FIRST_LEFT_DETECTION < 163.5 ) { 
		if( AVG_DX2_LEFT < -1.04 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_LEFT >= -1.04 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 163.5 ) { 
	if( MAX_DX2_RIGHT < 3553 ) { 
		if( AVG_DX2_RIGHT >= 1.58 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 1.58 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 3553 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 2301 ) { return new Prediction("TOP", 30, 0); }
	}
	if( AVG_DX2_RIGHT < 1.19 ) { 
	if( MAX_AMP_LEFT < 5333 ) { 
	if( MAX_AMP_LEFT < -6778.5 ) { 
		if( FIRST_LEFT_DETECTION >= 254 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_LEFT_DETECTION < 254 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_AMP_LEFT >= -6778.5 ) { 
	if( MAX_DX2_RIGHT < 2403.5 ) { 
		if( MAX_AMP_LEFT < -980 ) { return new Prediction("TOP", 9, 0); }
	if( MAX_AMP_LEFT >= -980 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( AMP_DELTA >= 655 ) { return new Prediction("LEFT", 7, 0); }
		if( AMP_DELTA < 655 ) { return new Prediction("LEFT", 21, 7); }
	}
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 2403.5 ) { 
	if( DETECTION_DELTA < 536 ) { 
		if( AVG_AMP_LEFT >= -26.5 ) { return new Prediction("LEFT", 149, 0); }
	if( AVG_AMP_LEFT < -26.5 ) { 
		if( MAX_AMP_LEFT >= -6288.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_LEFT < -6288.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5333 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AMP_DELTA >= 4508.5 ) { 
		if( FIRST_RIGHT_DETECTION < 164.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 164.5 ) { 
		if( FIRST_RIGHT_DETECTION < 176.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 176.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AMP_DELTA < 4508.5 ) { 
	if( DETECTION_DELTA >= 10 ) { 
		if( MAX_DX2_LEFT >= 3148.5 ) { return new Prediction("TOP", 9, 0); }
	if( MAX_DX2_LEFT < 3148.5 ) { 
		if( DETECTION_DELTA < 22.5 ) { return new Prediction("LEFT", 6, 0); }
	if( DETECTION_DELTA >= 22.5 ) { 
		if( MAX_AMP_RIGHT >= -6182 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT < -6182 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 10 ) { 
		if( FIRST_RIGHT_DETECTION < 231 ) { return new Prediction("TOP", 36, 0); }
		if( FIRST_RIGHT_DETECTION >= 231 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree64() {
	if( AMP_DELTA < 5917.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_LEFT < 4722.5 ) { 
	if( MAX_DX2_RIGHT < 7304.5 ) { 
		if( DX2_DELTA >= 652 ) { return new Prediction("LEFT", 40, 0); }
	if( DX2_DELTA < 652 ) { 
		if( AVG_DX2_RIGHT >= 4.41 ) { return new Prediction("TOP", 1, 0); }
	if( AVG_DX2_RIGHT < 4.41 ) { 
		if( FIRST_LEFT_DETECTION < 481.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 13, 3); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7304.5 ) { 
		if( MAX_AMP_LEFT < -802.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT >= -802.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 4722.5 ) { 
	if( MAX_DX2_RIGHT >= 10369 ) { 
		if( FIRST_LEFT_DETECTION >= 162.5 ) { return new Prediction("LEFT", 10, 0); }
		if( FIRST_LEFT_DETECTION < 162.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 10369 ) { 
	if( AMP_DELTA >= 3564 ) { 
		if( AMP_DELTA >= 3776.5 ) { return new Prediction("TOP", 38, 0); }
		if( AMP_DELTA < 3776.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA < 3564 ) { return new Prediction("TOP", 58, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( FIRST_RIGHT_DETECTION >= 237.5 ) { 
		if( AVG_AMP_LEFT < -16 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_AMP_LEFT >= -16 ) { 
	if( DETECTION_DELTA < 392 ) { 
	if( FIRST_RIGHT_DETECTION >= 273 ) { 
		if( AVG_DX2_LEFT >= 0.64 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT < 0.64 ) { 
		if( MAX_DX2_RIGHT >= 4525 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 4525 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 273 ) { return new Prediction("LEFT", 17, 0); }
	}
	if( DETECTION_DELTA >= 392 ) { 
		if( MAX_DX2_LEFT >= 2160.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_LEFT < 2160.5 ) { 
		if( FIRST_LEFT_DETECTION >= 461 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 461 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 237.5 ) { 
	if( DETECTION_DELTA < 536 ) { 
		if( MAX_DX2_LEFT >= 8051 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 8051 ) { return new Prediction("LEFT", 106, 0); }
	}
		if( DETECTION_DELTA >= 536 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( AMP_DELTA < 2554.5 ) { return new Prediction("TOP", 10, 0); }
	if( AMP_DELTA >= 2554.5 ) { 
		if( MAX_DX2_LEFT >= 3390 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 3390 ) { 
		if( FIRST_LEFT_DETECTION >= 233.5 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_LEFT_DETECTION < 233.5 ) { 
		if( FIRST_RIGHT_DETECTION < 209.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 209.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 5917.5 ) { 
	if( MAX_DX2_LEFT < 3576 ) { 
	if( MAX_AMP_LEFT >= 3059.5 ) { 
		if( MAX_AMP_LEFT >= 5055 ) { return new Prediction("RIGHT", 4, 0); }
	if( MAX_AMP_LEFT < 5055 ) { 
	if( MAX_DX2_RIGHT < 6621 ) { 
		if( MAX_AMP_LEFT >= 3804 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_AMP_LEFT < 3804 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( MAX_DX2_RIGHT >= 6621 ) { return new Prediction("BOTTOM", 31, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3059.5 ) { return new Prediction("BOTTOM", 139, 0); }
	}
	if( MAX_DX2_LEFT >= 3576 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
		if( AVG_AMP_RIGHT >= 27 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_RIGHT < 27 ) { return new Prediction("TOP", 47, 0); }
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT < 11612 ) { 
	if( AVG_AMP_RIGHT < 20.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 20, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( FIRST_LEFT_DETECTION < 195 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 195 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 20.5 ) { 
		if( FIRST_LEFT_DETECTION < 114 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 114 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 11612 ) { 
		if( AMP_DELTA < 10097.5 ) { return new Prediction("TOP", 10, 0); }
	if( AMP_DELTA >= 10097.5 ) { 
		if( FIRST_RIGHT_DETECTION < 114 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 114 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT < -20 ) { 
		if( MAX_DX2_LEFT < 12888.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 12888.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( AVG_AMP_LEFT >= -20 ) { 
	if( AVG_DX2_LEFT < -5.5 ) { 
		if( AVG_DX2_RIGHT >= 1.52 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 1.52 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_LEFT >= -5.5 ) { 
		if( MAX_AMP_RIGHT >= -630 ) { return new Prediction("RIGHT", 116, 0); }
	if( MAX_AMP_RIGHT < -630 ) { 
		if( DX2_DELTA >= 19411.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( DX2_DELTA < 19411.5 ) { 
		if( AMP_DELTA >= 7937 ) { return new Prediction("RIGHT", 57, 0); }
		if( AMP_DELTA < 7937 ) { return new Prediction("LEFT", 2, 0); }
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
private Prediction runTree65() {
	if( AMP_DELTA >= 6869 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( DX2_DELTA >= 13021 ) { return new Prediction("TOP", 5, 0); }
	if( DX2_DELTA < 13021 ) { 
		if( MAX_DX2_LEFT < 4312.5 ) { return new Prediction("BOTTOM", 166, 0); }
	if( MAX_DX2_LEFT >= 4312.5 ) { 
	if( MAX_AMP_LEFT < 5610.5 ) { 
		if( MAX_AMP_LEFT < -7158 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -7158 ) { return new Prediction("BOTTOM", 32, 0); }
	}
	if( MAX_AMP_LEFT >= 5610.5 ) { 
		if( MAX_AMP_LEFT >= 10937.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT < 10937.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 10246.5 ) { 
		if( AVG_AMP_LEFT >= -3.5 ) { return new Prediction("RIGHT", 18, 0); }
	if( AVG_AMP_LEFT < -3.5 ) { 
	if( MAX_DX2_RIGHT < 14795 ) { 
		if( MAX_DX2_LEFT >= 7924 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_LEFT < 7924 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 14795 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 10246.5 ) { return new Prediction("TOP", 32, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 7749.5 ) { 
		if( MAX_DX2_LEFT >= 10221.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 10221.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_DX2_RIGHT >= 7749.5 ) { 
	if( MAX_AMP_LEFT < -11134 ) { 
		if( AVG_DX2_RIGHT < -4.16 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -4.16 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_LEFT >= -11134 ) { 
	if( DX2_DELTA < 17783.5 ) { 
	if( AVG_DX2_RIGHT >= 3.34 ) { 
		if( MAX_DX2_LEFT < 10456 ) { return new Prediction("RIGHT", 34, 0); }
	if( MAX_DX2_LEFT >= 10456 ) { 
		if( FIRST_LEFT_DETECTION >= 136.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 136.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
		if( AVG_DX2_RIGHT < 3.34 ) { return new Prediction("RIGHT", 125, 0); }
	}
	if( DX2_DELTA >= 17783.5 ) { 
		if( AVG_AMP_LEFT >= 6.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_LEFT < 6.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6869 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( DX2_DELTA >= 4067 ) { 
		if( MAX_DX2_RIGHT >= 12046.5 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_DX2_RIGHT < 12046.5 ) { 
	if( MAX_DX2_LEFT < 2755 ) { 
		if( FIRST_RIGHT_DETECTION >= 139.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 139.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2755 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( DX2_DELTA < 4067 ) { 
	if( MAX_AMP_LEFT < 5333 ) { 
	if( MAX_AMP_RIGHT >= 5304.5 ) { 
	if( FIRST_LEFT_DETECTION < 481 ) { 
	if( MAX_AMP_LEFT >= -2478.5 ) { 
	if( AVG_AMP_LEFT >= -3.5 ) { 
		if( MAX_DX2_RIGHT < 6452.5 ) { return new Prediction("LEFT", 8, 0); }
	if( MAX_DX2_RIGHT >= 6452.5 ) { 
		if( MAX_DX2_LEFT >= 6139 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 6139 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT < -3.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT < -2478.5 ) { return new Prediction("LEFT", 33, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 481 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT < 5304.5 ) { return new Prediction("LEFT", 63, 0); }
	}
		if( MAX_AMP_LEFT >= 5333 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( MAX_AMP_LEFT < 6013.5 ) { 
	if( FIRST_RIGHT_DETECTION < 211.5 ) { 
	if( MAX_DX2_LEFT < 3163.5 ) { 
	if( MAX_AMP_RIGHT >= 7270.5 ) { 
		if( FIRST_LEFT_DETECTION < 197 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 197 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 7270.5 ) { 
		if( AVG_DX2_RIGHT < 1.71 ) { return new Prediction("LEFT", 42, 0); }
	if( AVG_DX2_RIGHT >= 1.71 ) { 
		if( FIRST_LEFT_DETECTION >= 414.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 414.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3163.5 ) { 
	if( DX2_DELTA >= 2884.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 7, 0); }
	}
	if( DX2_DELTA < 2884.5 ) { 
		if( AVG_DX2_RIGHT >= 3 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_DX2_RIGHT < 3 ) { 
		if( DX2_DELTA >= 1756.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA < 1756.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 211.5 ) { 
	if( AVG_AMP_LEFT >= -1 ) { 
	if( MAX_AMP_LEFT >= 2106.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 475 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 475 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_AMP_LEFT < 2106.5 ) { 
	if( AVG_AMP_RIGHT < -1 ) { 
		if( AVG_AMP_LEFT < 1 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_AMP_LEFT >= 1 ) { 
		if( MAX_AMP_RIGHT < 11089 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_RIGHT >= 11089 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -1 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
		if( FIRST_LEFT_DETECTION >= 459.5 ) { return new Prediction("LEFT", 5, 2); }
		if( FIRST_LEFT_DETECTION < 459.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -1 ) { 
	if( AVG_DX2_RIGHT < 1.37 ) { 
		if( MAX_AMP_LEFT >= -1853.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 18, 0); }
	}
		if( AVG_DX2_RIGHT >= 1.37 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 6013.5 ) { 
	if( MAX_DX2_LEFT < 4678 ) { 
		if( MAX_DX2_RIGHT < 7055 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_RIGHT >= 7055 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4678 ) { return new Prediction("TOP", 111, 0); }
	}
	}
	}
return null;
}
private Prediction runTree66() {
	if( MAX_DX2_RIGHT < 7295.5 ) { 
	if( MAX_DX2_LEFT < 3421.5 ) { 
	if( DX2_DELTA >= 2914.5 ) { 
	if( FIRST_RIGHT_DETECTION < 133.5 ) { 
	if( DX2_DELTA >= 3427.5 ) { 
		if( MAX_AMP_LEFT < -2499 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -2499 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( DX2_DELTA < 3427.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 133.5 ) { 
	if( AVG_AMP_RIGHT >= 26.5 ) { 
		if( AVG_DX2_RIGHT < -2.2 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_DX2_RIGHT >= -2.2 ) { 
		if( MAX_DX2_RIGHT < 6151.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 6151.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 26.5 ) { 
	if( DETECTION_DELTA < 433 ) { 
		if( AVG_AMP_LEFT < 9.5 ) { return new Prediction("BOTTOM", 80, 0); }
		if( AVG_AMP_LEFT >= 9.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DETECTION_DELTA >= 433 ) { 
		if( FIRST_RIGHT_DETECTION >= 218.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION < 218.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	}
	if( DX2_DELTA < 2914.5 ) { 
	if( AMP_DELTA < 5046 ) { 
	if( FIRST_RIGHT_DETECTION >= 272.5 ) { 
	if( MAX_DX2_LEFT >= 2124.5 ) { 
	if( AVG_DX2_RIGHT < 0.36 ) { 
		if( AVG_DX2_RIGHT >= -0.5 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT < -0.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.36 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( AMP_DELTA < 622.5 ) { return new Prediction("LEFT", 14, 7); }
		if( AMP_DELTA >= 622.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 272.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( FIRST_LEFT_DETECTION < 163.5 ) { 
		if( AVG_DX2_RIGHT < 3.25 ) { return new Prediction("LEFT", 46, 0); }
		if( AVG_DX2_RIGHT >= 3.25 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 163.5 ) { return new Prediction("LEFT", 105, 0); }
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( AVG_AMP_RIGHT >= 16.5 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_AMP_RIGHT < 16.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5046 ) { 
	if( AVG_DX2_LEFT >= -1.32 ) { 
		if( MAX_DX2_LEFT >= 3062.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_DX2_LEFT < 3062.5 ) { 
		if( AVG_AMP_RIGHT >= 34.5 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_AMP_RIGHT < 34.5 ) { 
	if( FIRST_RIGHT_DETECTION < 200 ) { 
		if( FIRST_LEFT_DETECTION < 181.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( FIRST_LEFT_DETECTION >= 181.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 200 ) { return new Prediction("BOTTOM", 14, 0); }
	}
	}
	}
		if( AVG_DX2_LEFT < -1.32 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3421.5 ) { 
		if( DX2_DELTA >= 3289.5 ) { return new Prediction("TOP", 91, 0); }
	if( DX2_DELTA < 3289.5 ) { 
	if( MAX_DX2_LEFT < 4424.5 ) { 
	if( AMP_DELTA < 5161.5 ) { 
	if( MAX_DX2_RIGHT < 5642 ) { 
		if( MAX_AMP_LEFT < -190 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -190 ) { return new Prediction("TOP", 6, 0); }
	}
		if( MAX_DX2_RIGHT >= 5642 ) { return new Prediction("LEFT", 8, 0); }
	}
	if( AMP_DELTA >= 5161.5 ) { 
		if( MAX_DX2_LEFT >= 3472 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 3472 ) { return new Prediction("TOP", 4, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 4424.5 ) { return new Prediction("TOP", 29, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7295.5 ) { 
	if( MAX_AMP_LEFT < 4752 ) { 
	if( MAX_AMP_LEFT < -7736.5 ) { 
	if( MAX_AMP_LEFT >= -17757 ) { 
		if( FIRST_LEFT_DETECTION < 173.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( FIRST_LEFT_DETECTION >= 173.5 ) { 
		if( MAX_DX2_LEFT >= 21531.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 21531.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT < -17757 ) { return new Prediction("TOP", 7, 0); }
	}
	if( MAX_AMP_LEFT >= -7736.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 102, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_AMP_LEFT < -7.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( AVG_AMP_LEFT >= -7.5 ) { 
		if( MAX_DX2_LEFT < 4406 ) { return new Prediction("RIGHT", 11, 0); }
	if( MAX_DX2_LEFT >= 4406 ) { 
	if( FIRST_LEFT_DETECTION >= 155 ) { 
		if( MAX_DX2_RIGHT < 18219.5 ) { return new Prediction("LEFT", 10, 0); }
		if( MAX_DX2_RIGHT >= 18219.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 155 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4752 ) { 
	if( MAX_AMP_LEFT < 12019 ) { 
	if( FIRST_RIGHT_DETECTION < 241.5 ) { 
	if( DX2_DELTA < 17783.5 ) { 
	if( AMP_DELTA < 6271 ) { 
		if( AVG_DX2_RIGHT < -2.39 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -2.39 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA >= 6271 ) { return new Prediction("RIGHT", 159, 0); }
	}
	if( DX2_DELTA >= 17783.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 158.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 158.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 241.5 ) { 
	if( DX2_DELTA >= 6208.5 ) { 
		if( AVG_DX2_RIGHT >= -3.74 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT < -3.74 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA < 6208.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 12019 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 28, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree67() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( FIRST_LEFT_DETECTION < 179.5 ) { 
	if( MAX_AMP_RIGHT < 9080 ) { 
		if( DX2_DELTA < 3864.5 ) { return new Prediction("LEFT", 72, 0); }
		if( DX2_DELTA >= 3864.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( MAX_AMP_RIGHT >= 9080 ) { 
	if( MAX_DX2_RIGHT >= 5285.5 ) { 
		if( AVG_AMP_LEFT >= 5 ) { return new Prediction("RIGHT", 7, 0); }
	if( AVG_AMP_LEFT < 5 ) { 
		if( FIRST_LEFT_DETECTION < 99.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 99.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5285.5 ) { 
		if( AVG_DX2_LEFT < 0.69 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.69 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 179.5 ) { 
	if( MAX_DX2_RIGHT >= 5366 ) { 
	if( AMP_DELTA < 5813.5 ) { 
		if( AVG_DX2_LEFT < 0.48 ) { return new Prediction("LEFT", 15, 0); }
		if( AVG_DX2_LEFT >= 0.48 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA >= 5813.5 ) { 
	if( MAX_DX2_RIGHT < 6371 ) { 
		if( MAX_AMP_LEFT < 2959 ) { return new Prediction("BOTTOM", 24, 0); }
	if( MAX_AMP_LEFT >= 2959 ) { 
		if( MAX_AMP_LEFT >= 3834 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT < 3834 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 6371 ) { return new Prediction("BOTTOM", 102, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5366 ) { 
	if( AVG_DX2_RIGHT >= 1.32 ) { 
	if( FIRST_LEFT_DETECTION < 232 ) { 
		if( FIRST_LEFT_DETECTION >= 198.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION < 198.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 232 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	if( AVG_DX2_RIGHT < 1.32 ) { 
	if( AVG_AMP_RIGHT >= 13.5 ) { 
		if( DX2_DELTA >= 3574.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DX2_DELTA < 3574.5 ) { return new Prediction("LEFT", 57, 0); }
	}
	if( AVG_AMP_RIGHT < 13.5 ) { 
	if( FIRST_RIGHT_DETECTION < 228.5 ) { 
		if( AVG_DX2_RIGHT >= -3.91 ) { return new Prediction("LEFT", 26, 0); }
		if( AVG_DX2_RIGHT < -3.91 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 228.5 ) { 
	if( AVG_DX2_LEFT < 0.49 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
	if( FIRST_LEFT_DETECTION >= 494.5 ) { 
		if( AVG_AMP_RIGHT >= -7.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_AMP_RIGHT < -7.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 494.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
	if( AVG_DX2_RIGHT >= 0.15 ) { 
		if( MAX_DX2_LEFT < 2311 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2311 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_DX2_RIGHT < 0.15 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 481.5 ) { 
		if( AVG_AMP_LEFT >= -1.5 ) { return new Prediction("LEFT", 15, 3); }
		if( AVG_AMP_LEFT < -1.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 481.5 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
		if( AVG_DX2_LEFT >= 0.49 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 5226 ) { 
	if( MAX_DX2_RIGHT < 8577.5 ) { 
		if( MAX_AMP_RIGHT < 10945 ) { return new Prediction("TOP", 29, 0); }
		if( MAX_AMP_RIGHT >= 10945 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 8577.5 ) { 
		if( MAX_DX2_LEFT < 14929.5 ) { return new Prediction("BOTTOM", 29, 0); }
		if( MAX_DX2_LEFT >= 14929.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 5226 ) { 
		if( MAX_DX2_RIGHT < 9708 ) { return new Prediction("TOP", 118, 0); }
	if( MAX_DX2_RIGHT >= 9708 ) { 
		if( AVG_DX2_RIGHT < 3.38 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_RIGHT >= 3.38 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 11737 ) { 
	if( MAX_AMP_LEFT < 6271 ) { 
	if( MAX_AMP_LEFT < -430 ) { 
		if( FIRST_LEFT_DETECTION < 127 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 127 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( MAX_AMP_LEFT >= -430 ) { return new Prediction("RIGHT", 11, 0); }
	}
		if( MAX_AMP_LEFT >= 6271 ) { return new Prediction("TOP", 18, 0); }
	}
	if( MAX_DX2_RIGHT >= 11737 ) { 
	if( DX2_DELTA < 17941 ) { 
		if( FIRST_RIGHT_DETECTION >= 265.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 265.5 ) { return new Prediction("RIGHT", 59, 0); }
	}
	if( DX2_DELTA >= 17941 ) { 
		if( MAX_AMP_LEFT >= 7699 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < 7699 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( FIRST_LEFT_DETECTION < 196.5 ) { 
	if( MAX_AMP_RIGHT >= 11411 ) { 
		if( FIRST_RIGHT_DETECTION < 169.5 ) { return new Prediction("RIGHT", 16, 0); }
		if( FIRST_RIGHT_DETECTION >= 169.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_RIGHT < 11411 ) { 
		if( FIRST_LEFT_DETECTION < 106 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 106 ) { return new Prediction("TOP", 12, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 196.5 ) { 
		if( AVG_DX2_LEFT < 1.74 ) { return new Prediction("BOTTOM", 10, 0); }
		if( AVG_DX2_LEFT >= 1.74 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_LEFT < 3836.5 ) { 
		if( MAX_AMP_LEFT >= -7360.5 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_AMP_LEFT < -7360.5 ) { 
		if( AVG_DX2_RIGHT >= 1.96 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 1.96 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3836.5 ) { 
	if( MAX_DX2_LEFT < 15155 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 65, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
		if( AVG_DX2_LEFT >= -5.37 ) { return new Prediction("RIGHT", 13, 0); }
		if( AVG_DX2_LEFT < -5.37 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 15155 ) { 
		if( MAX_DX2_RIGHT < 26556 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 26556 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree68() {
	if( AMP_DELTA < 6118.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AVG_DX2_RIGHT < 0.36 ) { 
		if( MAX_AMP_LEFT >= 5776.5 ) { return new Prediction("TOP", 19, 0); }
	if( MAX_AMP_LEFT < 5776.5 ) { 
	if( MAX_AMP_LEFT < -6778.5 ) { 
		if( MAX_AMP_RIGHT < 5243 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_AMP_RIGHT >= 5243 ) { 
		if( MAX_AMP_LEFT < -12482 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= -12482 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= -6778.5 ) { 
		if( FIRST_RIGHT_DETECTION < 205.5 ) { return new Prediction("LEFT", 33, 0); }
	if( FIRST_RIGHT_DETECTION >= 205.5 ) { 
	if( AVG_AMP_LEFT < 20.5 ) { 
		if( DX2_DELTA >= 2428.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( DX2_DELTA < 2428.5 ) { 
		if( AVG_DX2_RIGHT < -3.82 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT >= -3.82 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( DX2_DELTA < 163.5 ) { return new Prediction("LEFT", 19, 12); }
	if( DX2_DELTA >= 163.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 484 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 484 ) { return new Prediction("LEFT", 14, 0); }
	}
	}
	}
	}
	}
		if( AVG_AMP_LEFT >= 20.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT >= 0.36 ) { 
	if( AMP_DELTA >= 3417 ) { 
	if( MAX_AMP_LEFT < 2533 ) { 
		if( AVG_AMP_RIGHT >= -0.5 ) { return new Prediction("TOP", 5, 0); }
	if( AVG_AMP_RIGHT < -0.5 ) { 
		if( AMP_DELTA < 4494 ) { return new Prediction("LEFT", 6, 0); }
	if( AMP_DELTA >= 4494 ) { 
		if( MAX_DX2_LEFT >= 1113.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1113.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 2533 ) { 
		if( MAX_AMP_LEFT >= 8416.5 ) { return new Prediction("TOP", 14, 0); }
	if( MAX_AMP_LEFT < 8416.5 ) { 
		if( AVG_DX2_LEFT < 1.84 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_LEFT >= 1.84 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 3417 ) { 
		if( AVG_DX2_RIGHT < 0.56 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.56 ) { return new Prediction("TOP", 49, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( AMP_DELTA >= 4261 ) { 
		if( MAX_AMP_LEFT >= 8653.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT < 8653.5 ) { 
	if( DX2_DELTA >= 2807 ) { 
		if( MAX_DX2_LEFT >= 3924.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 3924.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( DX2_DELTA < 2807 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	if( AMP_DELTA < 4261 ) { 
	if( MAX_DX2_LEFT < 3634 ) { 
		if( MAX_DX2_RIGHT < 6443 ) { return new Prediction("LEFT", 110, 0); }
		if( MAX_DX2_RIGHT >= 6443 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 3634 ) { 
		if( MAX_AMP_LEFT >= 639 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT < 639 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6118.5 ) { 
	if( DX2_DELTA >= 6571 ) { 
	if( MAX_DX2_RIGHT >= 9833 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 23, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( FIRST_LEFT_DETECTION < 196.5 ) { 
	if( MAX_AMP_LEFT >= -4873 ) { 
		if( AVG_DX2_RIGHT < 2.52 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT >= 2.52 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_AMP_LEFT < -4873 ) { return new Prediction("TOP", 6, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 196.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_AMP_LEFT < -17990.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT >= -17990.5 ) { 
		if( FIRST_LEFT_DETECTION < 242.5 ) { return new Prediction("RIGHT", 143, 0); }
	if( FIRST_LEFT_DETECTION >= 242.5 ) { 
		if( AVG_DX2_RIGHT >= -6.36 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT < -6.36 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
		if( MAX_DX2_RIGHT < 9833 ) { return new Prediction("TOP", 37, 0); }
	}
	if( DX2_DELTA < 6571 ) { 
	if( AVG_AMP_LEFT < 11.5 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
	if( MAX_DX2_LEFT >= 5652 ) { 
	if( AVG_AMP_RIGHT >= -17.5 ) { 
		if( AVG_DX2_LEFT < -4.3 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -4.3 ) { return new Prediction("TOP", 11, 0); }
	}
	if( AVG_AMP_RIGHT < -17.5 ) { 
		if( MAX_DX2_RIGHT < 10593.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_DX2_RIGHT >= 10593.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( MAX_DX2_LEFT < 5652 ) { 
	if( AVG_AMP_LEFT >= -21.5 ) { 
		if( FIRST_RIGHT_DETECTION < 472 ) { return new Prediction("BOTTOM", 20, 0); }
		if( FIRST_RIGHT_DETECTION >= 472 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_LEFT < -21.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -7.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( FIRST_RIGHT_DETECTION < 201.5 ) { 
		if( MAX_DX2_LEFT >= 3167.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( MAX_DX2_LEFT < 3167.5 ) { 
		if( MAX_DX2_LEFT < 2336 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 2336 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 201.5 ) { return new Prediction("BOTTOM", 12, 0); }
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( MAX_DX2_RIGHT >= 11741 ) { 
		if( FIRST_LEFT_DETECTION >= 234.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 234.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_DX2_RIGHT < 11741 ) { return new Prediction("BOTTOM", 126, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 11.5 ) { 
	if( MAX_DX2_RIGHT < 7574.5 ) { 
		if( MAX_AMP_LEFT < 5199 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= 5199 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_DX2_RIGHT >= 7574.5 ) { 
		if( MAX_DX2_LEFT < 11187.5 ) { return new Prediction("RIGHT", 30, 0); }
	if( MAX_DX2_LEFT >= 11187.5 ) { 
		if( AMP_DELTA >= 9498.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( AMP_DELTA < 9498.5 ) { 
		if( AVG_DX2_RIGHT < 3.73 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 3.73 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree69() {
	if( AMP_DELTA < 6400 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( FIRST_LEFT_DETECTION >= 275.5 ) { 
	if( AVG_AMP_LEFT < 2 ) { 
		if( FIRST_RIGHT_DETECTION < 249 ) { return new Prediction("LEFT", 20, 0); }
	if( FIRST_RIGHT_DETECTION >= 249 ) { 
		if( AVG_AMP_RIGHT < -1.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_AMP_RIGHT >= -1.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 17, 4); }
		if( FIRST_RIGHT_DETECTION < 481.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
		if( AVG_AMP_LEFT >= 2 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( FIRST_LEFT_DETECTION < 275.5 ) { 
	if( MAX_DX2_LEFT >= 4656.5 ) { 
	if( MAX_DX2_RIGHT < 12498.5 ) { 
		if( AVG_AMP_LEFT < 14.5 ) { return new Prediction("TOP", 76, 0); }
	if( AVG_AMP_LEFT >= 14.5 ) { 
		if( AVG_AMP_LEFT >= 15.5 ) { return new Prediction("TOP", 22, 0); }
		if( AVG_AMP_LEFT < 15.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 12498.5 ) { 
		if( FIRST_LEFT_DETECTION < 171.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 171.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT < 4656.5 ) { 
	if( AVG_DX2_LEFT < 0.93 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( DETECTION_DELTA < 9 ) { return new Prediction("RIGHT", 7, 0); }
	if( DETECTION_DELTA >= 9 ) { 
		if( FIRST_LEFT_DETECTION < 227.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 227.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( MAX_DX2_RIGHT >= 1208 ) { 
	if( FIRST_LEFT_DETECTION >= 213.5 ) { 
		if( AVG_DX2_RIGHT >= 0.46 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 0.46 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 213.5 ) { return new Prediction("LEFT", 25, 0); }
	}
	if( MAX_DX2_RIGHT < 1208 ) { 
		if( DETECTION_DELTA < 399 ) { return new Prediction("TOP", 2, 0); }
	if( DETECTION_DELTA >= 399 ) { 
		if( MAX_AMP_LEFT >= -1954.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < -1954.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( AVG_DX2_LEFT >= 0.93 ) { 
	if( AVG_DX2_RIGHT >= -4.19 ) { 
		if( MAX_DX2_RIGHT < 5901.5 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 5901.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < -4.19 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( MAX_AMP_LEFT < 5333 ) { 
	if( AMP_DELTA >= 4232 ) { 
		if( FIRST_LEFT_DETECTION < 138.5 ) { return new Prediction("LEFT", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 138.5 ) { 
		if( FIRST_RIGHT_DETECTION < 154.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( FIRST_RIGHT_DETECTION >= 154.5 ) { 
	if( DETECTION_DELTA >= 2 ) { 
		if( AVG_DX2_RIGHT >= 2.97 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 2.97 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( AMP_DELTA < 4232 ) { 
		if( AMP_DELTA < 3881.5 ) { return new Prediction("LEFT", 102, 0); }
	if( AMP_DELTA >= 3881.5 ) { 
		if( AVG_AMP_LEFT >= 7 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT < 7 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5333 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( MAX_DX2_RIGHT >= 9797.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( FIRST_RIGHT_DETECTION < 143.5 ) { 
		if( DX2_DELTA < 7883 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA >= 7883 ) { return new Prediction("TOP", 4, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 143.5 ) { return new Prediction("BOTTOM", 42, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_LEFT < 33001.5 ) { 
		if( MAX_DX2_RIGHT < 29016 ) { return new Prediction("RIGHT", 35, 0); }
	if( MAX_DX2_RIGHT >= 29016 ) { 
	if( MAX_AMP_RIGHT >= -28533 ) { 
		if( AVG_AMP_LEFT >= -8 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_LEFT < -8 ) { return new Prediction("BOTTOM", 7, 0); }
	}
		if( MAX_AMP_RIGHT < -28533 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 33001.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
		if( MAX_DX2_LEFT >= 30887 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_DX2_LEFT < 30887 ) { 
	if( MAX_AMP_LEFT < 4717.5 ) { 
	if( MAX_AMP_RIGHT < 1271 ) { 
		if( MAX_AMP_LEFT >= -1333.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < -1333.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_AMP_RIGHT >= 1271 ) { 
		if( FIRST_LEFT_DETECTION >= 124 ) { return new Prediction("BOTTOM", 7, 0); }
		if( FIRST_LEFT_DETECTION < 124 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4717.5 ) { 
	if( AMP_DELTA < 7270 ) { 
		if( AVG_DX2_LEFT >= 0.88 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_LEFT < 0.88 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA >= 7270 ) { return new Prediction("RIGHT", 109, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 9797.5 ) { 
	if( MAX_AMP_LEFT < 4438.5 ) { 
	if( DX2_DELTA < 7477.5 ) { 
	if( FIRST_RIGHT_DETECTION < 158 ) { 
		if( MAX_DX2_LEFT >= 7545.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT < 7545.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 158 ) { 
	if( FIRST_RIGHT_DETECTION < 483 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 138, 0); }
	if( DETECTION_DELTA < 6 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT >= 2787.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 483 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( DX2_DELTA >= 7477.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_AMP_LEFT >= 4438.5 ) { 
	if( AVG_AMP_RIGHT < 8 ) { 
		if( MAX_DX2_RIGHT < 8688.5 ) { return new Prediction("TOP", 37, 0); }
	if( MAX_DX2_RIGHT >= 8688.5 ) { 
		if( MAX_AMP_LEFT >= 10388 ) { return new Prediction("TOP", 9, 0); }
	if( MAX_AMP_LEFT < 10388 ) { 
		if( AVG_DX2_RIGHT < -1.64 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.64 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8 ) { 
		if( MAX_AMP_LEFT < 12279 ) { return new Prediction("RIGHT", 16, 0); }
		if( MAX_AMP_LEFT >= 12279 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree70() {
	if( MAX_AMP_LEFT >= 4728.5 ) { 
	if( MAX_AMP_RIGHT < 14626.5 ) { 
	if( MAX_DX2_RIGHT >= 7783 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( MAX_AMP_LEFT >= 9260.5 ) { return new Prediction("TOP", 14, 0); }
		if( MAX_AMP_LEFT < 9260.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( DETECTION_DELTA < 4.5 ) { 
		if( AVG_AMP_LEFT >= -6.5 ) { return new Prediction("RIGHT", 71, 0); }
	if( AVG_AMP_LEFT < -6.5 ) { 
		if( AVG_AMP_LEFT < -20 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_AMP_LEFT >= -20 ) { 
		if( FIRST_LEFT_DETECTION < 237 ) { return new Prediction("RIGHT", 11, 0); }
		if( FIRST_LEFT_DETECTION >= 237 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 7783 ) { 
		if( AVG_DX2_RIGHT >= -4.66 ) { return new Prediction("TOP", 114, 0); }
		if( AVG_DX2_RIGHT < -4.66 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 14626.5 ) { 
	if( MAX_DX2_RIGHT >= 8688 ) { 
		if( MAX_DX2_LEFT >= 26844.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 26844.5 ) { return new Prediction("RIGHT", 83, 0); }
	}
		if( MAX_DX2_RIGHT < 8688 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4728.5 ) { 
	if( MAX_AMP_RIGHT < 10977 ) { 
	if( MAX_AMP_RIGHT >= -9869.5 ) { 
	if( DX2_DELTA < 3046.5 ) { 
	if( AVG_DX2_RIGHT >= -0.06 ) { 
	if( FIRST_RIGHT_DETECTION < 200 ) { 
	if( MAX_AMP_RIGHT >= 6677 ) { 
		if( MAX_DX2_RIGHT < 4062.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_RIGHT >= 4062.5 ) { 
		if( AVG_DX2_LEFT >= -0.34 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < -0.34 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 6677 ) { 
		if( MAX_AMP_LEFT >= -6787.5 ) { return new Prediction("LEFT", 34, 0); }
		if( MAX_AMP_LEFT < -6787.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 200 ) { 
	if( MAX_AMP_LEFT >= 874 ) { 
		if( MAX_AMP_LEFT < 2396.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_AMP_LEFT >= 2396.5 ) { 
		if( AVG_DX2_LEFT < 0.6 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_DX2_LEFT >= 0.6 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < 874 ) { 
	if( AMP_DELTA < 3946 ) { 
		if( AMP_DELTA >= 2535 ) { return new Prediction("LEFT", 5, 0); }
	if( AMP_DELTA < 2535 ) { 
	if( FIRST_LEFT_DETECTION >= 217.5 ) { 
	if( DETECTION_DELTA >= 397.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 461 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 461 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( DETECTION_DELTA < 397.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 273 ) { 
	if( MAX_DX2_LEFT < 1416.5 ) { 
		if( DX2_DELTA < 1113.5 ) { return new Prediction("LEFT", 19, 7); }
		if( DX2_DELTA >= 1113.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 1416.5 ) { return new Prediction("TOP", 4, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 273 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 217.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( AMP_DELTA >= 3946 ) { 
		if( FIRST_LEFT_DETECTION < 269 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 269 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT < -0.06 ) { 
		if( MAX_DX2_LEFT >= 5981.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 5981.5 ) { return new Prediction("LEFT", 102, 0); }
	}
	}
	if( DX2_DELTA >= 3046.5 ) { 
	if( MAX_AMP_LEFT >= -3518.5 ) { 
	if( AMP_DELTA >= 6114.5 ) { 
	if( MAX_AMP_RIGHT >= 10769 ) { 
		if( AVG_DX2_RIGHT >= -0.01 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT < -0.01 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT < 10769 ) { return new Prediction("BOTTOM", 40, 0); }
	}
	if( AMP_DELTA < 6114.5 ) { 
	if( AVG_AMP_RIGHT < 0 ) { 
		if( MAX_DX2_RIGHT >= 3303.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 3303.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_RIGHT >= 0 ) { 
	if( AVG_DX2_LEFT >= -1.23 ) { 
		if( AMP_DELTA < 3455 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA >= 3455 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( AVG_DX2_LEFT < -1.23 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -3518.5 ) { 
		if( MAX_DX2_RIGHT < 5881.5 ) { return new Prediction("TOP", 13, 0); }
	if( MAX_DX2_RIGHT >= 5881.5 ) { 
		if( DX2_DELTA < 4653 ) { return new Prediction("LEFT", 10, 0); }
	if( DX2_DELTA >= 4653 ) { 
		if( MAX_DX2_LEFT < 10956 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_DX2_LEFT >= 10956 ) { 
		if( FIRST_LEFT_DETECTION < 252 ) { return new Prediction("TOP", 8, 0); }
		if( FIRST_LEFT_DETECTION >= 252 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -9869.5 ) { 
	if( MAX_DX2_LEFT < 10539.5 ) { 
		if( AVG_DX2_LEFT < -1.8 ) { return new Prediction("LEFT", 4, 0); }
	if( AVG_DX2_LEFT >= -1.8 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 71, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 10539.5 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
		if( FIRST_LEFT_DETECTION < 137.5 ) { return new Prediction("TOP", 5, 0); }
		if( FIRST_LEFT_DETECTION >= 137.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= -1.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= 10977 ) { 
	if( MAX_DX2_LEFT >= 3171.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 39, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_DX2_LEFT < 23129 ) { return new Prediction("RIGHT", 20, 0); }
		if( MAX_DX2_LEFT >= 23129 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT < 3171.5 ) { return new Prediction("BOTTOM", 61, 0); }
	}
	}
return null;
}
private Prediction runTree71() {
	if( AMP_DELTA < 6400 ) { 
	if( MAX_DX2_RIGHT >= 6016.5 ) { 
	if( FIRST_LEFT_DETECTION < 225 ) { 
	if( AMP_DELTA < 4332.5 ) { 
	if( AVG_AMP_RIGHT < 25.5 ) { 
	if( DETECTION_DELTA < 3 ) { 
		if( MAX_DX2_LEFT < 4757 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 4757 ) { return new Prediction("TOP", 9, 0); }
	}
		if( DETECTION_DELTA >= 3 ) { return new Prediction("TOP", 34, 0); }
	}
	if( AVG_AMP_RIGHT >= 25.5 ) { 
		if( MAX_DX2_LEFT < 6881.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 6881.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AMP_DELTA >= 4332.5 ) { 
	if( MAX_AMP_LEFT < 8825 ) { 
	if( AVG_AMP_LEFT >= -3.5 ) { 
	if( DX2_DELTA >= 3286 ) { 
		if( MAX_DX2_LEFT < 2673.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2673.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( DX2_DELTA < 3286 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_AMP_LEFT < -3.5 ) { 
		if( AVG_DX2_RIGHT >= 0.94 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 0.94 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 8825 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 225 ) { 
		if( MAX_AMP_LEFT >= 4434.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_AMP_LEFT < 4434.5 ) { 
		if( MAX_AMP_RIGHT < 11177 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_AMP_RIGHT >= 11177 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6016.5 ) { 
		if( DX2_DELTA >= 3466.5 ) { return new Prediction("TOP", 31, 0); }
	if( DX2_DELTA < 3466.5 ) { 
	if( MAX_AMP_LEFT < 5178 ) { 
	if( MAX_AMP_LEFT >= -554 ) { 
	if( AMP_DELTA < 1005.5 ) { 
		if( MAX_AMP_LEFT >= 3225.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_AMP_LEFT < 3225.5 ) { 
		if( DX2_DELTA < 163.5 ) { return new Prediction("LEFT", 21, 10); }
		if( DX2_DELTA >= 163.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AMP_DELTA >= 1005.5 ) { 
	if( MAX_AMP_RIGHT >= 7215 ) { 
	if( MAX_AMP_LEFT >= 3710.5 ) { 
		if( FIRST_LEFT_DETECTION < 179.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 179.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_AMP_LEFT < 3710.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( MAX_AMP_RIGHT < 7215 ) { 
	if( MAX_AMP_RIGHT < -1906 ) { 
		if( AVG_AMP_RIGHT >= 17.5 ) { return new Prediction("LEFT", 12, 0); }
	if( AVG_AMP_RIGHT < 17.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
	if( FIRST_RIGHT_DETECTION >= 246.5 ) { 
		if( FIRST_RIGHT_DETECTION < 270.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 270.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 246.5 ) { return new Prediction("LEFT", 10, 0); }
	}
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( MAX_AMP_RIGHT < -4929.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_RIGHT >= -4929.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 3859 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= -1906 ) { return new Prediction("LEFT", 28, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -554 ) { 
		if( AVG_DX2_RIGHT < -0.03 ) { return new Prediction("LEFT", 73, 0); }
	if( AVG_DX2_RIGHT >= -0.03 ) { 
	if( MAX_DX2_RIGHT < 3695 ) { 
		if( FIRST_RIGHT_DETECTION < 204.5 ) { return new Prediction("LEFT", 8, 0); }
	if( FIRST_RIGHT_DETECTION >= 204.5 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 14, 0); }
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 3695 ) { 
		if( MAX_DX2_LEFT < 3565 ) { return new Prediction("LEFT", 33, 0); }
		if( MAX_DX2_LEFT >= 3565 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 5178 ) { return new Prediction("TOP", 40, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( MAX_DX2_LEFT >= 3578.5 ) { 
	if( MAX_DX2_RIGHT >= 9246.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( MAX_DX2_RIGHT < 15978 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 24, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_DX2_RIGHT < 0.99 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT >= 0.99 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 15978 ) { 
	if( MAX_AMP_LEFT < 7151.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( MAX_DX2_LEFT < 16947 ) { return new Prediction("RIGHT", 9, 0); }
	if( MAX_DX2_LEFT >= 16947 ) { 
		if( FIRST_LEFT_DETECTION >= 146 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION < 146 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( DETECTION_DELTA >= 2.5 ) { return new Prediction("BOTTOM", 17, 0); }
	}
		if( MAX_AMP_LEFT >= 7151.5 ) { return new Prediction("RIGHT", 18, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
		if( DETECTION_DELTA < 2.5 ) { return new Prediction("RIGHT", 88, 0); }
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_DX2_LEFT >= 13392.5 ) { 
	if( AVG_DX2_RIGHT >= 2.1 ) { 
		if( MAX_DX2_RIGHT < 15665.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 15665.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 2.1 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_LEFT < 13392.5 ) { 
		if( AVG_AMP_LEFT < 65 ) { return new Prediction("RIGHT", 40, 0); }
		if( AVG_AMP_LEFT >= 65 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 9246.5 ) { 
	if( MAX_DX2_LEFT < 4590.5 ) { 
		if( FIRST_LEFT_DETECTION < 163 ) { return new Prediction("RIGHT", 9, 0); }
		if( FIRST_LEFT_DETECTION >= 163 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 4590.5 ) { 
		if( AVG_AMP_RIGHT < 27.5 ) { return new Prediction("TOP", 51, 0); }
	if( AVG_AMP_RIGHT >= 27.5 ) { 
		if( AVG_DX2_RIGHT < -4.43 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= -4.43 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3578.5 ) { 
	if( FIRST_LEFT_DETECTION >= 118 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
	if( FIRST_LEFT_DETECTION < 163.5 ) { 
		if( MAX_AMP_RIGHT >= 134.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < 134.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 163.5 ) { 
		if( AMP_DELTA >= 8044 ) { return new Prediction("BOTTOM", 14, 0); }
	if( AMP_DELTA < 8044 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 124, 0); }
	}
		if( FIRST_LEFT_DETECTION < 118 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
return null;
}
private Prediction runTree72() {
	if( AMP_DELTA >= 6141.5 ) { 
	if( MAX_AMP_LEFT < 4737.5 ) { 
	if( MAX_DX2_LEFT < 11779 ) { 
	if( FIRST_RIGHT_DETECTION >= 168.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( AVG_DX2_RIGHT >= 1 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_DX2_RIGHT < 1 ) { 
		if( AVG_DX2_RIGHT >= -0.69 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT < -0.69 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( MAX_AMP_LEFT >= -7465 ) { return new Prediction("BOTTOM", 165, 0); }
		if( MAX_AMP_LEFT < -7465 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 168.5 ) { 
	if( MAX_DX2_LEFT < 3257.5 ) { 
		if( FIRST_LEFT_DETECTION >= 124 ) { return new Prediction("BOTTOM", 23, 0); }
		if( FIRST_LEFT_DETECTION < 124 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 3257.5 ) { 
	if( AMP_DELTA >= 9332.5 ) { 
		if( AVG_AMP_RIGHT >= -0.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_RIGHT < -0.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	if( AMP_DELTA < 9332.5 ) { 
		if( MAX_DX2_LEFT < 8949 ) { return new Prediction("RIGHT", 7, 0); }
		if( MAX_DX2_LEFT >= 8949 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 11779 ) { 
	if( AVG_AMP_RIGHT < 2.5 ) { 
		if( DETECTION_DELTA < 9 ) { return new Prediction("TOP", 17, 0); }
	if( DETECTION_DELTA >= 9 ) { 
		if( AVG_DX2_RIGHT < 0.83 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.83 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 2.5 ) { 
		if( FIRST_LEFT_DETECTION < 217 ) { return new Prediction("RIGHT", 7, 0); }
		if( FIRST_LEFT_DETECTION >= 217 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4737.5 ) { 
		if( MAX_DX2_RIGHT < 7624.5 ) { return new Prediction("TOP", 36, 0); }
	if( MAX_DX2_RIGHT >= 7624.5 ) { 
	if( MAX_DX2_LEFT >= 15367.5 ) { 
		if( MAX_AMP_RIGHT >= -18160.5 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_RIGHT < -18160.5 ) { 
		if( MAX_DX2_RIGHT < 34685 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_RIGHT >= 34685 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 15367.5 ) { 
		if( DX2_DELTA >= 4952.5 ) { return new Prediction("RIGHT", 153, 0); }
	if( DX2_DELTA < 4952.5 ) { 
	if( MAX_DX2_LEFT >= 8570 ) { 
		if( FIRST_RIGHT_DETECTION < 217 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 217 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT < 8570 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6141.5 ) { 
	if( MAX_AMP_LEFT < 5178 ) { 
	if( DX2_DELTA < 4409 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 206 ) { 
	if( MAX_AMP_LEFT >= -726.5 ) { 
	if( DETECTION_DELTA < 413.5 ) { 
	if( MAX_DX2_RIGHT >= 2303 ) { 
		if( FIRST_RIGHT_DETECTION < 297 ) { return new Prediction("BOTTOM", 6, 0); }
		if( FIRST_RIGHT_DETECTION >= 297 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT < 2303 ) { 
		if( FIRST_RIGHT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 11, 5); }
		if( FIRST_RIGHT_DETECTION < 481.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( DETECTION_DELTA >= 413.5 ) { 
		if( MAX_DX2_RIGHT >= 1001 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_DX2_RIGHT < 1001 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < -726.5 ) { 
	if( AVG_DX2_LEFT < 0.43 ) { 
	if( AMP_DELTA < 1831.5 ) { 
		if( AVG_DX2_LEFT < -1.11 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -1.11 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA >= 1831.5 ) { return new Prediction("TOP", 13, 0); }
	}
		if( AVG_DX2_LEFT >= 0.43 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 206 ) { 
	if( MAX_DX2_LEFT >= 3861 ) { 
	if( AVG_DX2_RIGHT >= 3.91 ) { 
		if( AVG_DX2_LEFT < 0.94 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.94 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 3.91 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_DX2_LEFT < 3861 ) { 
		if( FIRST_RIGHT_DETECTION < 190.5 ) { return new Prediction("LEFT", 34, 0); }
	if( FIRST_RIGHT_DETECTION >= 190.5 ) { 
		if( AVG_DX2_LEFT < 0.71 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_DX2_LEFT >= 0.71 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( AVG_AMP_LEFT < 9 ) { 
	if( AMP_DELTA >= 3863.5 ) { 
		if( MAX_AMP_RIGHT < 4630 ) { return new Prediction("LEFT", 15, 0); }
	if( MAX_AMP_RIGHT >= 4630 ) { 
		if( DX2_DELTA >= 2763.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DX2_DELTA < 2763.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
		if( AMP_DELTA < 3863.5 ) { return new Prediction("LEFT", 103, 0); }
	}
	if( AVG_AMP_LEFT >= 9 ) { 
		if( AVG_DX2_RIGHT >= -2.71 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < -2.71 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( DX2_DELTA >= 4409 ) { 
	if( MAX_AMP_RIGHT < 8092.5 ) { 
	if( FIRST_LEFT_DETECTION >= 208.5 ) { 
		if( MAX_DX2_RIGHT < 6552.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 6552.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 208.5 ) { return new Prediction("TOP", 10, 0); }
	}
		if( MAX_AMP_RIGHT >= 8092.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 5178 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_DX2_RIGHT < 0.83 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.83 ) { return new Prediction("TOP", 3, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 91, 0); }
	}
	}
return null;
}
private Prediction runTree73() {
	if( AMP_DELTA < 6311.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( AMP_DELTA >= 4235.5 ) { 
	if( AVG_DX2_LEFT >= -3.29 ) { 
	if( MAX_AMP_RIGHT >= -454 ) { 
		if( FIRST_RIGHT_DETECTION < 173.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( FIRST_RIGHT_DETECTION >= 173.5 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( MAX_AMP_RIGHT < -454 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( AVG_DX2_LEFT < -3.29 ) { 
		if( FIRST_LEFT_DETECTION < 122.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 122.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( AMP_DELTA < 4235.5 ) { 
		if( MAX_AMP_LEFT >= 5607.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT < 5607.5 ) { return new Prediction("LEFT", 117, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( MAX_DX2_LEFT < 3163.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 243.5 ) { 
	if( MAX_DX2_RIGHT < 3482 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( DX2_DELTA < 214.5 ) { return new Prediction("LEFT", 15, 5); }
		if( DX2_DELTA >= 214.5 ) { return new Prediction("LEFT", 13, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 5, 0); }
	}
		if( MAX_DX2_RIGHT >= 3482 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 243.5 ) { 
		if( AVG_DX2_RIGHT < 1.9 ) { return new Prediction("LEFT", 40, 0); }
	if( AVG_DX2_RIGHT >= 1.9 ) { 
		if( MAX_AMP_RIGHT >= -6400 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_RIGHT < -6400 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3163.5 ) { 
	if( MAX_AMP_LEFT >= 5227.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 58.5 ) { 
		if( MAX_AMP_RIGHT < 12476.5 ) { return new Prediction("TOP", 72, 0); }
	if( MAX_AMP_RIGHT >= 12476.5 ) { 
		if( MAX_DX2_LEFT < 4650 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 4650 ) { return new Prediction("TOP", 13, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 58.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 5227.5 ) { 
	if( MAX_AMP_RIGHT < 7492 ) { 
		if( MAX_DX2_LEFT >= 4589 ) { return new Prediction("TOP", 13, 0); }
	if( MAX_DX2_LEFT < 4589 ) { 
		if( MAX_AMP_RIGHT >= -280.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < -280.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 7492 ) { 
	if( DX2_DELTA >= 2599 ) { 
	if( FIRST_LEFT_DETECTION >= 200 ) { 
		if( MAX_AMP_RIGHT >= 9778 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT < 9778 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 200 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( DX2_DELTA < 2599 ) { 
		if( AVG_DX2_LEFT < -0.43 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT >= -0.43 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6311.5 ) { 
	if( MAX_DX2_RIGHT < 9401.5 ) { 
	if( MAX_AMP_LEFT < 4438.5 ) { 
		if( MAX_AMP_LEFT < -6512 ) { return new Prediction("TOP", 13, 0); }
	if( MAX_AMP_LEFT >= -6512 ) { 
	if( FIRST_LEFT_DETECTION >= 124 ) { 
		if( MAX_DX2_LEFT < 2804.5 ) { return new Prediction("BOTTOM", 111, 0); }
	if( MAX_DX2_LEFT >= 2804.5 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 30, 0); }
		if( DETECTION_DELTA < 6 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 124 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4438.5 ) { 
	if( AVG_AMP_RIGHT < 8 ) { 
	if( MAX_DX2_RIGHT >= 9011 ) { 
		if( AVG_DX2_LEFT >= -0.68 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < -0.68 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_DX2_RIGHT < 9011 ) { return new Prediction("TOP", 52, 0); }
	}
	if( AVG_AMP_RIGHT >= 8 ) { 
		if( MAX_DX2_RIGHT < 7644 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_RIGHT >= 7644 ) { 
		if( FIRST_RIGHT_DETECTION >= 199 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 199 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 9401.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( MAX_DX2_RIGHT < 15978 ) { 
		if( AVG_AMP_LEFT >= -26.5 ) { return new Prediction("BOTTOM", 38, 0); }
	if( AVG_AMP_LEFT < -26.5 ) { 
		if( DETECTION_DELTA < 9 ) { return new Prediction("TOP", 5, 0); }
		if( DETECTION_DELTA >= 9 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 15978 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( MAX_DX2_RIGHT >= 35800 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT < 35800 ) { return new Prediction("RIGHT", 23, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
		if( FIRST_LEFT_DETECTION < 105 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 105 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( MAX_DX2_LEFT >= 3217.5 ) { 
	if( AVG_AMP_LEFT < 64 ) { 
		if( AVG_DX2_RIGHT >= 9.15 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT < 9.15 ) { 
		if( FIRST_LEFT_DETECTION < 273.5 ) { return new Prediction("RIGHT", 150, 0); }
		if( FIRST_LEFT_DETECTION >= 273.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 64 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT < 3217.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	}
return null;
}
private Prediction runTree74() {
	if( MAX_DX2_LEFT < 3644.5 ) { 
	if( MAX_AMP_RIGHT < 9327 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( AVG_DX2_RIGHT < -0.29 ) { 
		if( DETECTION_DELTA >= 524 ) { return new Prediction("RIGHT", 2, 0); }
	if( DETECTION_DELTA < 524 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( AVG_DX2_LEFT < 0.42 ) { 
		if( MAX_DX2_LEFT < 2434.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2434.5 ) { return new Prediction("LEFT", 10, 0); }
	}
		if( AVG_DX2_LEFT >= 0.42 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("LEFT", 101, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -0.29 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( AVG_DX2_LEFT >= 0.52 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.52 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
		if( FIRST_LEFT_DETECTION < 220 ) { return new Prediction("LEFT", 41, 0); }
	if( FIRST_LEFT_DETECTION >= 220 ) { 
	if( MAX_AMP_RIGHT < -2298 ) { 
		if( AVG_DX2_RIGHT >= 1.33 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 1.33 ) { return new Prediction("LEFT", 14, 0); }
	}
	if( MAX_AMP_RIGHT >= -2298 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( AVG_AMP_RIGHT < -1 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_AMP_RIGHT >= -1 ) { 
		if( FIRST_LEFT_DETECTION < 225 ) { return new Prediction("TOP", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 225 ) { 
		if( MAX_AMP_RIGHT >= 622.5 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_AMP_RIGHT < 622.5 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
		if( AVG_AMP_LEFT >= -1.5 ) { return new Prediction("LEFT", 24, 7); }
		if( AVG_AMP_LEFT < -1.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT < -4.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( MAX_AMP_RIGHT >= 3957 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 3957 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	}
	}
		if( AMP_DELTA >= 6183.5 ) { return new Prediction("BOTTOM", 83, 0); }
	}
	if( MAX_AMP_RIGHT >= 9327 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_DX2_RIGHT >= -4.89 ) { 
	if( AVG_AMP_RIGHT >= 26.5 ) { 
		if( AVG_DX2_LEFT < -0.38 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.38 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( AVG_AMP_RIGHT < 26.5 ) { 
		if( MAX_DX2_RIGHT >= 4703.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_RIGHT < 4703.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( AVG_DX2_RIGHT < -4.89 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_DX2_RIGHT < -8.8 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -8.8 ) { return new Prediction("BOTTOM", 84, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3644.5 ) { 
	if( MAX_DX2_RIGHT >= 9931 ) { 
	if( MAX_AMP_LEFT < 4656 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 22, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( FIRST_RIGHT_DETECTION < 143 ) { 
		if( DX2_DELTA < 7385.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DX2_DELTA >= 7385.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 143 ) { 
		if( AVG_AMP_LEFT < -7 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_AMP_LEFT >= -7 ) { 
		if( MAX_AMP_LEFT < -5661 ) { return new Prediction("RIGHT", 8, 0); }
		if( MAX_AMP_LEFT >= -5661 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4656 ) { 
		if( MAX_DX2_LEFT < 10718 ) { return new Prediction("RIGHT", 122, 0); }
	if( MAX_DX2_LEFT >= 10718 ) { 
		if( MAX_DX2_RIGHT < 13602.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_DX2_RIGHT >= 13602.5 ) { 
	if( MAX_AMP_RIGHT >= -25908.5 ) { 
	if( AVG_AMP_LEFT < -6 ) { 
		if( AVG_DX2_RIGHT >= 5.2 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_DX2_RIGHT < 5.2 ) { 
		if( MAX_AMP_RIGHT >= 2148 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < 2148 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
		if( AVG_AMP_LEFT >= -6 ) { return new Prediction("RIGHT", 15, 0); }
	}
		if( MAX_AMP_RIGHT < -25908.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 9931 ) { 
	if( MAX_DX2_RIGHT >= 7333.5 ) { 
		if( MAX_AMP_RIGHT < 554.5 ) { return new Prediction("TOP", 30, 0); }
	if( MAX_AMP_RIGHT >= 554.5 ) { 
	if( MAX_DX2_LEFT < 6512.5 ) { 
		if( MAX_AMP_LEFT < -637 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_AMP_LEFT >= -637 ) { 
		if( MAX_DX2_LEFT < 4821.5 ) { return new Prediction("RIGHT", 13, 0); }
	if( MAX_DX2_LEFT >= 4821.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 131 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 131 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 6512.5 ) { 
		if( MAX_DX2_RIGHT < 9457 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_RIGHT >= 9457 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 7333.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_DX2_RIGHT < -3.44 ) { 
		if( DETECTION_DELTA < 20.5 ) { return new Prediction("TOP", 5, 0); }
		if( DETECTION_DELTA >= 20.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -3.44 ) { return new Prediction("TOP", 132, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AMP_DELTA >= 3413.5 ) { return new Prediction("LEFT", 4, 0); }
		if( AMP_DELTA < 3413.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree75() {
	if( MAX_AMP_LEFT >= 4996.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 247 ) { 
		if( MAX_DX2_RIGHT >= 10312.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT < 10312.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 247 ) { 
	if( MAX_AMP_LEFT < 7673 ) { 
		if( DX2_DELTA >= 3039.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( DX2_DELTA < 3039.5 ) { return new Prediction("TOP", 6, 0); }
	}
		if( MAX_AMP_LEFT >= 7673 ) { return new Prediction("TOP", 137, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_DX2_RIGHT < 8395.5 ) { return new Prediction("TOP", 20, 0); }
	if( MAX_DX2_RIGHT >= 8395.5 ) { 
	if( FIRST_LEFT_DETECTION < 232 ) { 
		if( AMP_DELTA < 18672 ) { return new Prediction("RIGHT", 118, 0); }
	if( AMP_DELTA >= 18672 ) { 
		if( AVG_DX2_RIGHT < 1.1 ) { return new Prediction("RIGHT", 12, 0); }
	if( AVG_DX2_RIGHT >= 1.1 ) { 
		if( AVG_DX2_RIGHT < 2.33 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.33 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 232 ) { 
		if( MAX_DX2_LEFT < 10112 ) { return new Prediction("RIGHT", 8, 0); }
	if( MAX_DX2_LEFT >= 10112 ) { 
		if( AVG_DX2_RIGHT >= -1.46 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < -1.46 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 4996.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_AMP_LEFT < -10350 ) { return new Prediction("TOP", 22, 0); }
	if( MAX_AMP_LEFT >= -10350 ) { 
	if( DX2_DELTA < 2864 ) { 
	if( DX2_DELTA < 1294 ) { 
	if( MAX_AMP_RIGHT < 5191.5 ) { 
	if( AMP_DELTA < 1700 ) { 
	if( FIRST_RIGHT_DETECTION >= 257 ) { 
		if( FIRST_LEFT_DETECTION < 481.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 12, 4); }
	}
		if( FIRST_RIGHT_DETECTION < 257 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA >= 1700 ) { return new Prediction("LEFT", 15, 0); }
	}
	if( MAX_AMP_RIGHT >= 5191.5 ) { 
		if( AVG_DX2_RIGHT < 0.99 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.99 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( DX2_DELTA >= 1294 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("LEFT", 27, 0); }
	if( AVG_AMP_LEFT >= 8.5 ) { 
		if( FIRST_LEFT_DETECTION < 157.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 157.5 ) { 
		if( MAX_DX2_LEFT < 5193.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 5193.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 2864 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
		if( MAX_AMP_RIGHT >= 11196.5 ) { return new Prediction("RIGHT", 21, 0); }
	if( MAX_AMP_RIGHT < 11196.5 ) { 
		if( AMP_DELTA < 3796.5 ) { return new Prediction("LEFT", 4, 0); }
	if( AMP_DELTA >= 3796.5 ) { 
	if( FIRST_RIGHT_DETECTION < 182 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("RIGHT", 14, 0); }
	if( AVG_DX2_LEFT >= 0.26 ) { 
		if( AVG_DX2_LEFT < 0.58 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.58 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 182 ) { 
	if( MAX_DX2_LEFT < 4354.5 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2787.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_DX2_LEFT >= 4354.5 ) { 
		if( MAX_DX2_LEFT < 12342.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_LEFT >= 12342.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_LEFT < -4.5 ) { 
	if( AMP_DELTA >= 6222.5 ) { 
		if( AVG_DX2_RIGHT < -3.52 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT >= -3.52 ) { return new Prediction("BOTTOM", 16, 0); }
	}
		if( AMP_DELTA < 6222.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( AMP_DELTA < 4868 ) { 
		if( AMP_DELTA >= 811 ) { return new Prediction("LEFT", 83, 0); }
	if( AMP_DELTA < 811 ) { 
		if( AVG_DX2_LEFT < -0.21 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -0.21 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AMP_DELTA >= 4868 ) { 
		if( AMP_DELTA < 5335.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AMP_DELTA >= 5335.5 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( AMP_DELTA < 6475.5 ) { 
	if( MAX_AMP_LEFT >= -1912 ) { 
	if( AMP_DELTA >= 4369 ) { 
		if( MAX_DX2_RIGHT >= 3303.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_RIGHT < 3303.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AMP_DELTA < 4369 ) { 
	if( MAX_AMP_RIGHT < -655 ) { 
		if( AVG_DX2_RIGHT < -3.82 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_RIGHT >= -3.82 ) { 
	if( DX2_DELTA >= 2533 ) { 
		if( MAX_AMP_RIGHT < -2405 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= -2405 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA < 2533 ) { return new Prediction("LEFT", 19, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -655 ) { 
	if( MAX_DX2_LEFT >= 2160.5 ) { 
		if( AVG_AMP_LEFT >= 10.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_LEFT < 10.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT < 2160.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -1912 ) { 
	if( FIRST_RIGHT_DETECTION >= 202 ) { 
		if( FIRST_LEFT_DETECTION >= 280.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 280.5 ) { return new Prediction("TOP", 14, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 202 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
		if( AMP_DELTA >= 6475.5 ) { return new Prediction("BOTTOM", 161, 0); }
	}
	}
	}
return null;
}
private Prediction runTree76() {
	if( AMP_DELTA >= 5123.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
		if( MAX_AMP_LEFT >= 14030.5 ) { return new Prediction("TOP", 37, 0); }
	if( MAX_AMP_LEFT < 14030.5 ) { 
	if( MAX_AMP_LEFT < 4610 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( MAX_DX2_RIGHT < 4681.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( MAX_DX2_RIGHT >= 4681.5 ) { 
	if( DX2_DELTA >= 5560.5 ) { 
		if( AVG_DX2_RIGHT < 1.68 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT >= 1.68 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( DX2_DELTA < 5560.5 ) { return new Prediction("RIGHT", 19, 0); }
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 165.5 ) { return new Prediction("BOTTOM", 15, 0); }
	if( FIRST_RIGHT_DETECTION < 165.5 ) { 
	if( AVG_DX2_LEFT >= 0.02 ) { 
		if( FIRST_RIGHT_DETECTION < 147.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 147.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_LEFT < 0.02 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4610 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( MAX_DX2_RIGHT < 8037 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 8037 ) { return new Prediction("RIGHT", 8, 0); }
	}
		if( DETECTION_DELTA < 4.5 ) { return new Prediction("RIGHT", 125, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( MAX_DX2_RIGHT >= 12841.5 ) { 
	if( MAX_DX2_LEFT < 20715.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( MAX_DX2_LEFT < 18248.5 ) { return new Prediction("RIGHT", 48, 0); }
		if( MAX_DX2_LEFT >= 18248.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( AVG_DX2_LEFT >= 0.51 ) { 
		if( FIRST_LEFT_DETECTION >= 248.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 248.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_DX2_LEFT < 0.51 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 20715.5 ) { 
		if( DX2_DELTA < 7810 ) { return new Prediction("RIGHT", 1, 0); }
		if( DX2_DELTA >= 7810 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 12841.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_RIGHT >= 13 ) { 
	if( AVG_DX2_LEFT < -0.38 ) { 
		if( AVG_DX2_RIGHT < -0.65 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.65 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -0.38 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_RIGHT < 13 ) { 
	if( MAX_DX2_LEFT < 4161 ) { 
	if( AVG_DX2_RIGHT < 2.31 ) { 
		if( MAX_AMP_RIGHT < -555 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= -555 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= 2.31 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4161 ) { return new Prediction("TOP", 38, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_RIGHT < 3622.5 ) { 
	if( AVG_DX2_RIGHT < -0.46 ) { 
		if( AVG_DX2_LEFT < 0.98 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.98 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_RIGHT >= -0.46 ) { 
		if( FIRST_RIGHT_DETECTION >= 272.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 272.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 3622.5 ) { 
		if( MAX_AMP_LEFT < -5458.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -5458.5 ) { return new Prediction("BOTTOM", 162, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 5123.5 ) { 
	if( MAX_DX2_LEFT < 3568.5 ) { 
	if( MAX_DX2_RIGHT >= 2567.5 ) { 
		if( MAX_AMP_LEFT < 4392 ) { return new Prediction("LEFT", 156, 0); }
	if( MAX_AMP_LEFT >= 4392 ) { 
		if( FIRST_LEFT_DETECTION < 224 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 224 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 2567.5 ) { 
		if( FIRST_RIGHT_DETECTION < 241.5 ) { return new Prediction("LEFT", 9, 0); }
	if( FIRST_RIGHT_DETECTION >= 241.5 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
	if( DX2_DELTA < 2347 ) { 
		if( MAX_DX2_RIGHT >= 1032 ) { return new Prediction("LEFT", 5, 0); }
	if( MAX_DX2_RIGHT < 1032 ) { 
	if( DETECTION_DELTA < 416.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 13, 8); }
	}
		if( DETECTION_DELTA >= 416.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( DX2_DELTA >= 2347 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3568.5 ) { 
	if( MAX_AMP_LEFT < 6049 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("TOP", 19, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
	if( AVG_DX2_RIGHT >= -0.61 ) { 
		if( FIRST_RIGHT_DETECTION < 132 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 132 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( AVG_DX2_RIGHT < -0.61 ) { 
		if( AVG_DX2_LEFT < 1.77 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 1.77 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 6049 ) { return new Prediction("TOP", 71, 0); }
	}
	}
return null;
}
private Prediction runTree77() {
	if( AMP_DELTA >= 6433.5 ) { 
	if( MAX_DX2_LEFT < 3576 ) { 
		if( FIRST_LEFT_DETECTION >= 230 ) { return new Prediction("BOTTOM", 83, 0); }
	if( FIRST_LEFT_DETECTION < 230 ) { 
		if( MAX_AMP_LEFT < 3045 ) { return new Prediction("BOTTOM", 61, 0); }
	if( MAX_AMP_LEFT >= 3045 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("BOTTOM", 20, 0); }
		if( DETECTION_DELTA < 7 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3576 ) { 
	if( MAX_DX2_RIGHT < 7793.5 ) { 
	if( DETECTION_DELTA >= 33 ) { 
		if( AVG_DX2_RIGHT >= -1.8 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT < -1.8 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DETECTION_DELTA < 33 ) { return new Prediction("TOP", 57, 0); }
	}
	if( MAX_DX2_RIGHT >= 7793.5 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
	if( MAX_DX2_RIGHT >= 12878.5 ) { 
	if( DX2_DELTA >= 6195.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_AMP_LEFT < -15812 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -15812 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_LEFT < 33001.5 ) { 
		if( DX2_DELTA >= 18021.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 18021.5 ) { return new Prediction("RIGHT", 45, 0); }
	}
		if( MAX_DX2_LEFT >= 33001.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DX2_DELTA < 6195.5 ) { 
		if( MAX_DX2_LEFT >= 14182.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_LEFT < 14182.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 12878.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 144.5 ) { return new Prediction("BOTTOM", 12, 0); }
	if( FIRST_RIGHT_DETECTION < 144.5 ) { 
		if( MAX_DX2_LEFT >= 9811 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_DX2_LEFT < 9811 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 2.5 ) { 
	if( MAX_DX2_LEFT < 10477.5 ) { 
		if( AVG_AMP_RIGHT >= -4 ) { return new Prediction("RIGHT", 86, 0); }
	if( AVG_AMP_RIGHT < -4 ) { 
	if( MAX_DX2_RIGHT >= 16791.5 ) { 
		if( MAX_DX2_LEFT >= 7134.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 7134.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 16791.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 10477.5 ) { 
	if( AMP_DELTA < 9659.5 ) { 
		if( FIRST_LEFT_DETECTION < 141 ) { return new Prediction("TOP", 3, 0); }
	if( FIRST_LEFT_DETECTION >= 141 ) { 
		if( AVG_DX2_RIGHT < -1.71 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.71 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AMP_DELTA >= 9659.5 ) { 
		if( MAX_AMP_LEFT >= -20863.5 ) { return new Prediction("RIGHT", 28, 0); }
		if( MAX_AMP_LEFT < -20863.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6433.5 ) { 
	if( MAX_DX2_LEFT >= 3145.5 ) { 
	if( AMP_DELTA < 3662.5 ) { 
		if( MAX_AMP_LEFT >= 3916 ) { return new Prediction("TOP", 85, 0); }
	if( MAX_AMP_LEFT < 3916 ) { 
	if( MAX_DX2_LEFT >= 4656.5 ) { 
		if( FIRST_LEFT_DETECTION >= 254 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 254 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_DX2_LEFT < 4656.5 ) { 
		if( AVG_AMP_RIGHT < -5.5 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_AMP_RIGHT >= -5.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	}
	if( AMP_DELTA >= 3662.5 ) { 
	if( MAX_AMP_RIGHT >= 5865 ) { 
	if( AVG_DX2_RIGHT < 0.38 ) { 
	if( AVG_DX2_LEFT < -0.22 ) { 
		if( MAX_AMP_LEFT >= 6740.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_AMP_LEFT < 6740.5 ) { 
	if( MAX_DX2_LEFT < 4561.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 231 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4561.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AVG_DX2_LEFT >= -0.22 ) { 
		if( AVG_AMP_LEFT >= 3.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_AMP_LEFT < 3.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= 0.38 ) { 
		if( MAX_AMP_LEFT < 3844.5 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_AMP_LEFT >= 3844.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 5865 ) { 
		if( FIRST_RIGHT_DETECTION >= 58.5 ) { return new Prediction("TOP", 21, 0); }
		if( FIRST_RIGHT_DETECTION < 58.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3145.5 ) { 
		if( AVG_AMP_RIGHT >= 21.5 ) { return new Prediction("LEFT", 68, 0); }
	if( AVG_AMP_RIGHT < 21.5 ) { 
	if( FIRST_RIGHT_DETECTION < 258.5 ) { 
	if( AVG_AMP_LEFT < 9 ) { 
		if( AMP_DELTA < 4293.5 ) { return new Prediction("LEFT", 61, 0); }
	if( AMP_DELTA >= 4293.5 ) { 
	if( AMP_DELTA < 4506.5 ) { 
	if( MAX_AMP_RIGHT < -1 ) { 
		if( AVG_DX2_RIGHT < -0.73 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.73 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -1 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( AMP_DELTA >= 4506.5 ) { 
		if( MAX_DX2_RIGHT < 6606 ) { return new Prediction("LEFT", 13, 0); }
		if( MAX_DX2_RIGHT >= 6606 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 9 ) { 
		if( FIRST_RIGHT_DETECTION < 183 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 183 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 258.5 ) { 
	if( DX2_DELTA >= 2498.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 475 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 475 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	if( DX2_DELTA < 2498.5 ) { 
	if( AMP_DELTA < 3678.5 ) { 
		if( MAX_DX2_RIGHT >= 1032 ) { return new Prediction("LEFT", 5, 0); }
	if( MAX_DX2_RIGHT < 1032 ) { 
		if( MAX_DX2_LEFT >= 2126.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 2126.5 ) { 
		if( DX2_DELTA < 1061.5 ) { return new Prediction("LEFT", 23, 6); }
		if( DX2_DELTA >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 3678.5 ) { 
		if( MAX_DX2_LEFT < 2397 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2397 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree78() {
	if( AMP_DELTA < 5917.5 ) { 
	if( MAX_DX2_LEFT < 4662.5 ) { 
	if( DX2_DELTA >= 3251 ) { 
	if( AVG_DX2_LEFT >= -0.81 ) { 
	if( AVG_DX2_RIGHT >= 0.97 ) { 
	if( AVG_DX2_LEFT < 0.37 ) { 
		if( AVG_DX2_RIGHT >= 4.29 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 4.29 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( AVG_DX2_LEFT >= 0.37 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_DX2_RIGHT < 0.97 ) { 
	if( AMP_DELTA >= 3845 ) { 
		if( AVG_DX2_RIGHT < -0.29 ) { return new Prediction("RIGHT", 6, 0); }
		if( AVG_DX2_RIGHT >= -0.29 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA < 3845 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( AVG_DX2_LEFT < -0.81 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( DX2_DELTA < 3251 ) { 
	if( FIRST_RIGHT_DETECTION < 249.5 ) { 
	if( MAX_AMP_LEFT >= 3852 ) { 
	if( MAX_AMP_LEFT < 5178 ) { 
		if( AVG_DX2_LEFT >= -0.23 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < -0.23 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 5178 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_LEFT < 3852 ) { 
	if( MAX_DX2_LEFT >= 3861 ) { 
		if( AVG_DX2_LEFT < 1.32 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= 1.32 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 3861 ) { return new Prediction("LEFT", 159, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 249.5 ) { 
	if( AVG_AMP_RIGHT < 15 ) { 
	if( AMP_DELTA >= 2076 ) { 
		if( FIRST_LEFT_DETECTION < 272 ) { return new Prediction("TOP", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 272 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AMP_DELTA < 2076 ) { 
	if( FIRST_LEFT_DETECTION >= 253.5 ) { 
		if( AMP_DELTA < 315.5 ) { return new Prediction("LEFT", 18, 7); }
		if( AMP_DELTA >= 315.5 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( FIRST_LEFT_DETECTION < 253.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 15 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 4662.5 ) { 
	if( MAX_DX2_RIGHT >= 10369 ) { 
		if( FIRST_RIGHT_DETECTION >= 163 ) { return new Prediction("LEFT", 12, 0); }
		if( FIRST_RIGHT_DETECTION < 163 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 10369 ) { 
	if( FIRST_RIGHT_DETECTION < 238.5 ) { 
		if( MAX_DX2_LEFT >= 5198.5 ) { return new Prediction("TOP", 93, 0); }
	if( MAX_DX2_LEFT < 5198.5 ) { 
		if( AVG_DX2_LEFT < -0.86 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.86 ) { return new Prediction("TOP", 6, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 238.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5917.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT >= 5588 ) { 
		if( MAX_DX2_LEFT < 5760.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 5760.5 ) { return new Prediction("TOP", 16, 0); }
	}
	if( MAX_AMP_LEFT < 5588 ) { 
	if( MAX_DX2_RIGHT >= 4683 ) { 
		if( FIRST_RIGHT_DETECTION >= 82 ) { return new Prediction("BOTTOM", 168, 0); }
		if( FIRST_RIGHT_DETECTION < 82 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 4683 ) { 
	if( MAX_DX2_LEFT < 2931.5 ) { 
		if( DX2_DELTA < 1592.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 1592.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( MAX_DX2_LEFT >= 2931.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_RIGHT >= 9268.5 ) { 
	if( DX2_DELTA < 12268.5 ) { 
	if( AVG_DX2_LEFT >= -4.77 ) { 
		if( FIRST_LEFT_DETECTION < 197 ) { return new Prediction("RIGHT", 19, 0); }
	if( FIRST_LEFT_DETECTION >= 197 ) { 
		if( FIRST_RIGHT_DETECTION >= 215.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 215.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_DX2_LEFT < -4.77 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 12268.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_RIGHT < 9268.5 ) { 
	if( MAX_AMP_RIGHT < -16167.5 ) { 
		if( MAX_AMP_LEFT < 5838.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT >= 5838.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_RIGHT >= -16167.5 ) { 
	if( AVG_AMP_RIGHT >= 10 ) { 
		if( FIRST_RIGHT_DETECTION >= 193 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 193 ) { return new Prediction("TOP", 6, 0); }
	}
		if( AVG_AMP_RIGHT < 10 ) { return new Prediction("TOP", 31, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 19.5 ) { return new Prediction("RIGHT", 125, 0); }
		if( FIRST_RIGHT_DETECTION < 19.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AVG_DX2_LEFT >= -0.02 ) { 
	if( AVG_AMP_LEFT >= -24 ) { 
	if( AMP_DELTA < 8002.5 ) { 
		if( MAX_DX2_RIGHT < 8001 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_DX2_RIGHT >= 8001 ) { 
		if( FIRST_LEFT_DETECTION >= 114.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 114.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AMP_DELTA >= 8002.5 ) { 
	if( AMP_DELTA >= 18630 ) { 
		if( AVG_DX2_LEFT >= 0.76 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.76 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AMP_DELTA < 18630 ) { return new Prediction("RIGHT", 19, 0); }
	}
	}
		if( AVG_AMP_LEFT < -24 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AVG_DX2_LEFT < -0.02 ) { 
		if( MAX_DX2_LEFT < 14544 ) { return new Prediction("RIGHT", 26, 0); }
	if( MAX_DX2_LEFT >= 14544 ) { 
		if( AVG_DX2_LEFT >= -2.03 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -2.03 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree79() {
	if( MAX_AMP_LEFT < 4575 ) { 
	if( AMP_DELTA < 5686.5 ) { 
	if( MAX_AMP_LEFT >= -6909.5 ) { 
	if( DX2_DELTA >= 3286 ) { 
		if( AVG_AMP_LEFT >= 7 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_AMP_LEFT < 7 ) { 
	if( DETECTION_DELTA < 477 ) { 
		if( MAX_AMP_LEFT < 1608.5 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_AMP_LEFT >= 1608.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DETECTION_DELTA >= 477 ) { 
		if( AVG_DX2_RIGHT >= 0.68 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 0.68 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	if( DX2_DELTA < 3286 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AVG_AMP_LEFT >= -26 ) { 
	if( AMP_DELTA >= 5003.5 ) { 
		if( AVG_DX2_RIGHT < 0.99 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.99 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA < 5003.5 ) { 
	if( AVG_DX2_LEFT < 1.33 ) { 
	if( FIRST_RIGHT_DETECTION >= 246.5 ) { 
	if( FIRST_LEFT_DETECTION >= 255 ) { 
	if( AVG_AMP_RIGHT < -1 ) { 
		if( MAX_AMP_RIGHT < -3152.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= -3152.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -1 ) { 
		if( DX2_DELTA >= 1032 ) { return new Prediction("LEFT", 5, 0); }
		if( DX2_DELTA < 1032 ) { return new Prediction("LEFT", 12, 3); }
	}
	}
		if( FIRST_LEFT_DETECTION < 255 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 246.5 ) { return new Prediction("LEFT", 38, 0); }
	}
		if( AVG_DX2_LEFT >= 1.33 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT < -26 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_AMP_RIGHT >= 12.5 ) { return new Prediction("LEFT", 128, 0); }
	}
	}
	if( MAX_AMP_LEFT < -6909.5 ) { 
		if( AVG_AMP_RIGHT < 12.5 ) { return new Prediction("TOP", 15, 0); }
		if( AVG_AMP_RIGHT >= 12.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AMP_DELTA >= 5686.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( FIRST_LEFT_DETECTION < 156.5 ) { 
		if( MAX_AMP_RIGHT >= 12449.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_RIGHT < 12449.5 ) { 
		if( AVG_DX2_LEFT >= -0.62 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT < -0.62 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 156.5 ) { 
	if( DETECTION_DELTA >= 492.5 ) { 
		if( MAX_DX2_LEFT < 2307 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 2307 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA < 492.5 ) { 
		if( MAX_AMP_LEFT < -13397 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT >= -13397 ) { return new Prediction("BOTTOM", 175, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
	if( MAX_AMP_RIGHT >= -9806.5 ) { 
	if( MAX_AMP_RIGHT >= 9173.5 ) { 
		if( FIRST_LEFT_DETECTION >= 198 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 198 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_AMP_RIGHT < 9173.5 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_AMP_RIGHT < -9806.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 110 ) { return new Prediction("BOTTOM", 8, 0); }
		if( FIRST_RIGHT_DETECTION < 110 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -5.5 ) { 
		if( MAX_DX2_LEFT >= 29624.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_LEFT < 29624.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 233 ) { 
		if( AVG_DX2_LEFT < 0.48 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.48 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 233 ) { 
		if( MAX_AMP_LEFT >= 4515 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT < 4515 ) { return new Prediction("RIGHT", 24, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4575 ) { 
	if( MAX_AMP_LEFT < 9996.5 ) { 
	if( MAX_AMP_RIGHT >= 12871 ) { 
		if( DETECTION_DELTA >= 11 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DETECTION_DELTA < 11 ) { return new Prediction("RIGHT", 105, 0); }
	}
	if( MAX_AMP_RIGHT < 12871 ) { 
	if( MAX_DX2_RIGHT >= 7246 ) { 
	if( AMP_DELTA < 7373 ) { 
		if( FIRST_LEFT_DETECTION < 221 ) { return new Prediction("RIGHT", 9, 0); }
		if( FIRST_LEFT_DETECTION >= 221 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AMP_DELTA >= 7373 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( FIRST_LEFT_DETECTION < 189.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 189.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 55, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 7246 ) { 
		if( AVG_AMP_RIGHT >= 33 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_AMP_RIGHT < 33 ) { return new Prediction("TOP", 28, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 9996.5 ) { 
		if( MAX_DX2_RIGHT < 20955 ) { return new Prediction("TOP", 125, 0); }
		if( MAX_DX2_RIGHT >= 20955 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
return null;
}
private Prediction runTree80() {
	if( AMP_DELTA >= 6141.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_DX2_LEFT >= 8356.5 ) { 
	if( MAX_AMP_RIGHT < 6637 ) { 
		if( MAX_DX2_RIGHT >= 13536 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 13536 ) { return new Prediction("TOP", 12, 0); }
	}
		if( MAX_AMP_RIGHT >= 6637 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	if( MAX_DX2_LEFT < 8356.5 ) { 
	if( FIRST_LEFT_DETECTION >= 103.5 ) { 
		if( MAX_DX2_RIGHT < 1750 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 1750 ) { return new Prediction("BOTTOM", 174, 0); }
	}
		if( FIRST_LEFT_DETECTION < 103.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_RIGHT >= -15303.5 ) { 
	if( DX2_DELTA < 8860 ) { 
		if( MAX_DX2_LEFT < 5425 ) { return new Prediction("RIGHT", 11, 0); }
	if( MAX_DX2_LEFT >= 5425 ) { 
		if( AVG_DX2_RIGHT < 3.63 ) { return new Prediction("TOP", 28, 0); }
	if( AVG_DX2_RIGHT >= 3.63 ) { 
		if( AVG_DX2_RIGHT < 4.59 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 4.59 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( DX2_DELTA >= 8860 ) { return new Prediction("TOP", 16, 0); }
	}
	if( MAX_AMP_RIGHT < -15303.5 ) { 
		if( MAX_DX2_RIGHT >= 14918 ) { return new Prediction("BOTTOM", 8, 0); }
		if( MAX_DX2_RIGHT < 14918 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( DX2_DELTA >= 20107.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( DX2_DELTA < 20107.5 ) { 
	if( MAX_DX2_RIGHT < 10018.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 65.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( FIRST_RIGHT_DETECTION < 65.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 10018.5 ) { return new Prediction("RIGHT", 107, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AVG_AMP_LEFT < -18.5 ) { 
		if( MAX_DX2_RIGHT >= 27965.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 27965.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( AVG_AMP_LEFT >= -18.5 ) { 
		if( MAX_DX2_LEFT < 3035.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_LEFT >= 3035.5 ) { 
	if( AMP_DELTA >= 7452 ) { 
	if( DX2_DELTA >= 13119.5 ) { 
		if( AMP_DELTA >= 16874 ) { return new Prediction("RIGHT", 2, 0); }
	if( AMP_DELTA < 16874 ) { 
		if( FIRST_RIGHT_DETECTION < 172 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 172 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( DX2_DELTA < 13119.5 ) { return new Prediction("RIGHT", 53, 0); }
	}
	if( AMP_DELTA < 7452 ) { 
		if( AVG_DX2_RIGHT < 3.7 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 3.7 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6141.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( MAX_DX2_LEFT >= 4656.5 ) { 
		if( MAX_DX2_RIGHT < 7494 ) { return new Prediction("TOP", 46, 0); }
	if( MAX_DX2_RIGHT >= 7494 ) { 
	if( AMP_DELTA >= 2521 ) { 
	if( AVG_DX2_LEFT < 1.66 ) { 
		if( AVG_DX2_LEFT >= -2.95 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_DX2_LEFT < -2.95 ) { 
		if( AVG_DX2_RIGHT < 1.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= 1.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 1.66 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA < 2521 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	if( MAX_DX2_LEFT < 4656.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
	if( MAX_AMP_RIGHT < -2247.5 ) { 
	if( MAX_DX2_LEFT >= 3036.5 ) { 
		if( AVG_AMP_LEFT < -29 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT >= -29 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_LEFT < 3036.5 ) { 
		if( MAX_AMP_RIGHT < -3863 ) { return new Prediction("LEFT", 32, 0); }
	if( MAX_AMP_RIGHT >= -3863 ) { 
		if( MAX_AMP_RIGHT >= -3821 ) { return new Prediction("LEFT", 12, 0); }
		if( MAX_AMP_RIGHT < -3821 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -2247.5 ) { 
		if( MAX_AMP_LEFT >= 1622.5 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_AMP_LEFT < 1622.5 ) { 
		if( AVG_AMP_RIGHT < -1.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_AMP_RIGHT >= -1.5 ) { 
		if( MAX_DX2_RIGHT >= 1032 ) { return new Prediction("LEFT", 11, 0); }
	if( MAX_DX2_RIGHT < 1032 ) { 
		if( MAX_DX2_LEFT < 1063 ) { return new Prediction("LEFT", 22, 10); }
		if( MAX_DX2_LEFT >= 1063 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( DX2_DELTA >= 3857 ) { return new Prediction("RIGHT", 1, 0); }
	if( DX2_DELTA < 3857 ) { 
		if( AMP_DELTA >= 5672.5 ) { return new Prediction("TOP", 1, 0); }
		if( AMP_DELTA < 5672.5 ) { return new Prediction("LEFT", 134, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( MAX_AMP_LEFT < 5208.5 ) { 
	if( DX2_DELTA < 4430.5 ) { 
	if( DETECTION_DELTA < 11.5 ) { 
	if( MAX_AMP_LEFT < 4092.5 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( AVG_DX2_RIGHT < 6.27 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 6.27 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( MAX_AMP_LEFT >= 4092.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( DETECTION_DELTA >= 11.5 ) { 
		if( AVG_DX2_LEFT >= 0.97 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.97 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
		if( DX2_DELTA >= 4430.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	if( MAX_AMP_LEFT >= 5208.5 ) { 
		if( MAX_DX2_RIGHT >= 10416 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT < 10416 ) { return new Prediction("TOP", 48, 0); }
	}
	}
	}
return null;
}
private Prediction runTree81() {
	if( MAX_DX2_LEFT < 3220.5 ) { 
	if( MAX_DX2_RIGHT < 4921.5 ) { 
	if( DX2_DELTA < 3388 ) { 
	if( FIRST_RIGHT_DETECTION >= 247.5 ) { 
	if( AMP_DELTA < 5046 ) { 
		if( AVG_AMP_RIGHT >= 2 ) { return new Prediction("LEFT", 18, 0); }
	if( AVG_AMP_RIGHT < 2 ) { 
	if( AMP_DELTA >= 1994 ) { 
		if( MAX_DX2_RIGHT >= 2199 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_RIGHT < 2199 ) { 
		if( FIRST_LEFT_DETECTION < 404.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 404.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA < 1994 ) { 
		if( DX2_DELTA < 1061.5 ) { return new Prediction("LEFT", 11, 5); }
		if( DX2_DELTA >= 1061.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5046 ) { 
		if( FIRST_RIGHT_DETECTION >= 253.5 ) { return new Prediction("BOTTOM", 9, 0); }
		if( FIRST_RIGHT_DETECTION < 253.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 247.5 ) { 
	if( DX2_DELTA >= 155.5 ) { 
		if( MAX_AMP_RIGHT >= 8002 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_AMP_RIGHT < 8002 ) { 
	if( MAX_AMP_RIGHT < -6857.5 ) { 
	if( MAX_AMP_LEFT >= 3852 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_LEFT < 3852 ) { return new Prediction("LEFT", 22, 0); }
	}
		if( MAX_AMP_RIGHT >= -6857.5 ) { return new Prediction("LEFT", 91, 0); }
	}
	}
		if( DX2_DELTA < 155.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DX2_DELTA >= 3388 ) { 
		if( AVG_AMP_RIGHT >= 12 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_RIGHT < 12 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 4921.5 ) { 
	if( AMP_DELTA >= 5286 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_AMP_LEFT < 12.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_AMP_LEFT >= 12.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AVG_AMP_RIGHT >= -23 ) { return new Prediction("BOTTOM", 129, 0); }
		if( AVG_AMP_RIGHT < -23 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AMP_DELTA < 5286 ) { return new Prediction("LEFT", 34, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3220.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
		if( MAX_DX2_LEFT >= 10324 ) { return new Prediction("TOP", 83, 0); }
	if( MAX_DX2_LEFT < 10324 ) { 
	if( AVG_AMP_LEFT >= 4 ) { 
	if( MAX_DX2_RIGHT >= 9820.5 ) { 
	if( AVG_AMP_LEFT < 10 ) { 
		if( MAX_DX2_LEFT >= 8572 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 8572 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 10 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_DX2_RIGHT < 9820.5 ) { return new Prediction("TOP", 31, 0); }
	}
	if( AVG_AMP_LEFT < 4 ) { 
	if( AMP_DELTA >= 8699.5 ) { 
		if( FIRST_LEFT_DETECTION >= 128 ) { return new Prediction("BOTTOM", 37, 0); }
		if( FIRST_LEFT_DETECTION < 128 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA < 8699.5 ) { 
		if( MAX_DX2_RIGHT < 6092.5 ) { return new Prediction("TOP", 37, 0); }
	if( MAX_DX2_RIGHT >= 6092.5 ) { 
		if( AVG_DX2_LEFT < -1.04 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT >= -1.04 ) { 
		if( AVG_DX2_RIGHT >= 2.72 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 2.72 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 175 ) { 
	if( AVG_AMP_LEFT < 1 ) { 
	if( FIRST_LEFT_DETECTION >= 188 ) { 
		if( MAX_DX2_RIGHT < 5352 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 5352 ) { return new Prediction("BOTTOM", 13, 0); }
	}
		if( FIRST_LEFT_DETECTION < 188 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_LEFT >= 1 ) { 
	if( AMP_DELTA < 6871.5 ) { 
		if( MAX_DX2_LEFT < 3410.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 3410.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AMP_DELTA >= 6871.5 ) { 
	if( AVG_DX2_LEFT >= -0.71 ) { 
		if( AVG_DX2_RIGHT < 3.07 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 3.07 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT < -0.71 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 175 ) { 
	if( DX2_DELTA < 4256 ) { 
	if( AVG_AMP_RIGHT < 22 ) { 
		if( MAX_DX2_LEFT < 4505 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT >= 4505 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 22 ) { return new Prediction("TOP", 10, 0); }
	}
	if( DX2_DELTA >= 4256 ) { 
		if( MAX_AMP_LEFT >= 13192 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 13192 ) { 
		if( MAX_DX2_LEFT < 15969 ) { return new Prediction("RIGHT", 18, 0); }
		if( MAX_DX2_LEFT >= 15969 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 7079.5 ) { 
		if( FIRST_RIGHT_DETECTION < 94 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 94 ) { 
	if( MAX_AMP_RIGHT >= 12811.5 ) { 
		if( AVG_DX2_RIGHT >= 3.98 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.98 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_RIGHT < 12811.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 7079.5 ) { 
	if( DX2_DELTA >= 6537.5 ) { 
		if( MAX_AMP_LEFT < -18710.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_AMP_LEFT >= -18710.5 ) { 
		if( DX2_DELTA < 17783.5 ) { return new Prediction("RIGHT", 128, 0); }
	if( DX2_DELTA >= 17783.5 ) { 
		if( AVG_DX2_RIGHT < 2.24 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT >= 2.24 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 6537.5 ) { 
	if( MAX_AMP_RIGHT < 10670 ) { 
		if( MAX_AMP_RIGHT < -14733 ) { return new Prediction("RIGHT", 5, 0); }
	if( MAX_AMP_RIGHT >= -14733 ) { 
		if( MAX_DX2_LEFT < 4598.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_DX2_LEFT >= 4598.5 ) { 
		if( MAX_DX2_LEFT < 10891.5 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_DX2_LEFT >= 10891.5 ) { 
		if( MAX_DX2_LEFT >= 15532.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 15532.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
		if( MAX_AMP_RIGHT >= 10670 ) { return new Prediction("RIGHT", 23, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree82() {
	if( DX2_DELTA < 3494 ) { 
	if( MAX_AMP_LEFT < 5324.5 ) { 
	if( AVG_AMP_LEFT >= 5 ) { 
	if( MAX_DX2_LEFT >= 3031 ) { 
		if( FIRST_RIGHT_DETECTION >= 242 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_RIGHT_DETECTION < 242 ) { 
		if( AVG_DX2_RIGHT >= 7.27 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT < 7.27 ) { 
		if( AVG_AMP_RIGHT >= -34.5 ) { return new Prediction("RIGHT", 10, 0); }
		if( AVG_AMP_RIGHT < -34.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT < 3031 ) { return new Prediction("LEFT", 14, 0); }
	}
	if( AVG_AMP_LEFT < 5 ) { 
	if( FIRST_RIGHT_DETECTION >= 237.5 ) { 
	if( AMP_DELTA < 5565.5 ) { 
	if( MAX_AMP_LEFT < -2156.5 ) { 
		if( MAX_AMP_RIGHT >= 3935.5 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_AMP_RIGHT < 3935.5 ) { 
		if( AVG_DX2_RIGHT < -0.45 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT >= -0.45 ) { 
		if( FIRST_LEFT_DETECTION >= 272.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 272.5 ) { return new Prediction("TOP", 15, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= -2156.5 ) { 
		if( MAX_AMP_LEFT >= 622 ) { return new Prediction("LEFT", 10, 0); }
	if( MAX_AMP_LEFT < 622 ) { 
		if( FIRST_LEFT_DETECTION < 272 ) { return new Prediction("TOP", 2, 0); }
	if( FIRST_LEFT_DETECTION >= 272 ) { 
	if( AVG_AMP_RIGHT < 0.5 ) { 
	if( DETECTION_DELTA < 369 ) { 
		if( MAX_DX2_RIGHT < 1009.5 ) { return new Prediction("LEFT", 19, 10); }
		if( MAX_DX2_RIGHT >= 1009.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DETECTION_DELTA >= 369 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 0.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	}
		if( AMP_DELTA >= 5565.5 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 237.5 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( AVG_DX2_LEFT < 1.05 ) { 
	if( AMP_DELTA < 4494 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("LEFT", 78, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < -5642.5 ) { 
		if( AVG_DX2_LEFT < -1.24 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -1.24 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= -5642.5 ) { return new Prediction("LEFT", 18, 0); }
	}
	}
	if( AMP_DELTA >= 4494 ) { 
		if( DX2_DELTA >= 3157 ) { return new Prediction("BOTTOM", 2, 0); }
	if( DX2_DELTA < 3157 ) { 
	if( FIRST_RIGHT_DETECTION >= 189 ) { 
		if( AVG_DX2_LEFT >= 0.31 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.31 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 189 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	}
	if( AVG_DX2_LEFT >= 1.05 ) { 
		if( AVG_DX2_LEFT < 1.42 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT >= 1.42 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( AMP_DELTA >= 6183.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 5324.5 ) { 
		if( DX2_DELTA < 1717 ) { return new Prediction("TOP", 42, 0); }
	if( DX2_DELTA >= 1717 ) { 
		if( AMP_DELTA >= 8540.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AMP_DELTA < 8540.5 ) { return new Prediction("TOP", 20, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3494 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_DX2_RIGHT < 6144.5 ) { 
	if( DX2_DELTA >= 4164.5 ) { 
		if( DETECTION_DELTA < 208.5 ) { return new Prediction("TOP", 20, 0); }
	if( DETECTION_DELTA >= 208.5 ) { 
		if( FIRST_LEFT_DETECTION >= 442.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( FIRST_LEFT_DETECTION < 442.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( DX2_DELTA < 4164.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 157.5 ) { return new Prediction("BOTTOM", 24, 0); }
	if( FIRST_RIGHT_DETECTION < 157.5 ) { 
		if( AVG_DX2_LEFT < -0.21 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT >= -0.21 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6144.5 ) { 
	if( MAX_AMP_LEFT >= 4852 ) { 
		if( FIRST_LEFT_DETECTION >= 114.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 114.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_LEFT < 4852 ) { 
		if( AVG_AMP_RIGHT >= 44 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_RIGHT < 44 ) { return new Prediction("BOTTOM", 125, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AMP_DELTA >= 7595.5 ) { 
	if( MAX_DX2_RIGHT < 9754 ) { 
	if( MAX_AMP_RIGHT >= 9854 ) { 
		if( AVG_DX2_LEFT >= 1.83 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_DX2_LEFT < 1.83 ) { 
		if( MAX_AMP_LEFT >= 125.5 ) { return new Prediction("RIGHT", 14, 0); }
		if( MAX_AMP_LEFT < 125.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT < 9854 ) { return new Prediction("TOP", 28, 0); }
	}
	if( MAX_DX2_RIGHT >= 9754 ) { 
	if( AVG_AMP_LEFT < -20 ) { 
		if( AVG_DX2_RIGHT >= 4.54 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT < 4.54 ) { 
		if( MAX_AMP_LEFT < -4132.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_LEFT >= -4132.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -20 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
		if( MAX_DX2_LEFT < 32416 ) { return new Prediction("RIGHT", 150, 0); }
		if( MAX_DX2_LEFT >= 32416 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
		if( MAX_AMP_LEFT >= 5662.5 ) { return new Prediction("RIGHT", 17, 0); }
	if( MAX_AMP_LEFT < 5662.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 7595.5 ) { 
	if( MAX_AMP_RIGHT < 156 ) { 
	if( AVG_AMP_RIGHT >= 3 ) { 
	if( AVG_DX2_LEFT < 0.26 ) { 
		if( FIRST_LEFT_DETECTION >= 125 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 125 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_DX2_LEFT >= 0.26 ) { 
		if( FIRST_LEFT_DETECTION >= 170.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION < 170.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT < 3 ) { return new Prediction("TOP", 46, 0); }
	}
	if( MAX_AMP_RIGHT >= 156 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( MAX_DX2_LEFT >= 9393 ) { 
		if( AVG_DX2_RIGHT < 0.55 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.55 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_DX2_LEFT < 9393 ) { return new Prediction("RIGHT", 24, 0); }
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( AVG_AMP_RIGHT >= -12 ) { 
	if( MAX_DX2_LEFT >= 2935 ) { 
		if( MAX_DX2_RIGHT >= 7128 ) { return new Prediction("LEFT", 10, 0); }
		if( MAX_DX2_RIGHT < 7128 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_DX2_LEFT < 2935 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_RIGHT < -12 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree83() {
	if( AMP_DELTA < 6400 ) { 
	if( MAX_DX2_LEFT >= 3650.5 ) { 
	if( MAX_AMP_LEFT >= 5525 ) { 
		if( MAX_DX2_LEFT >= 5742 ) { return new Prediction("TOP", 81, 0); }
	if( MAX_DX2_LEFT < 5742 ) { 
	if( AVG_AMP_LEFT < 25 ) { 
		if( MAX_DX2_LEFT < 5539.5 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_LEFT >= 5539.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 25 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT < 5525 ) { 
	if( MAX_AMP_LEFT >= -5554.5 ) { 
	if( AVG_DX2_RIGHT < -0.91 ) { 
		if( AVG_DX2_LEFT >= 2.82 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < 2.82 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= -0.91 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( MAX_AMP_LEFT < -5554.5 ) { 
		if( FIRST_RIGHT_DETECTION < 262 ) { return new Prediction("TOP", 14, 0); }
		if( FIRST_RIGHT_DETECTION >= 262 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( AMP_DELTA < 5046 ) { 
	if( FIRST_RIGHT_DETECTION < 230.5 ) { 
		if( DX2_DELTA < 2864 ) { return new Prediction("LEFT", 131, 0); }
	if( DX2_DELTA >= 2864 ) { 
		if( DX2_DELTA >= 2900.5 ) { return new Prediction("LEFT", 17, 0); }
		if( DX2_DELTA < 2900.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 230.5 ) { 
	if( AVG_DX2_LEFT < 0.71 ) { 
	if( AVG_AMP_RIGHT < 10.5 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
	if( AVG_AMP_RIGHT >= -2.5 ) { 
		if( DX2_DELTA >= 1032 ) { return new Prediction("LEFT", 5, 0); }
		if( DX2_DELTA < 1032 ) { return new Prediction("LEFT", 15, 5); }
	}
		if( AVG_AMP_RIGHT < -2.5 ) { return new Prediction("LEFT", 10, 0); }
	}
		if( MAX_AMP_LEFT < -1853.5 ) { return new Prediction("TOP", 7, 0); }
	}
		if( AVG_AMP_RIGHT >= 10.5 ) { return new Prediction("LEFT", 26, 0); }
	}
	if( AVG_DX2_LEFT >= 0.71 ) { 
		if( AVG_DX2_LEFT < 0.91 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.91 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5046 ) { 
	if( DX2_DELTA >= 1090.5 ) { 
	if( MAX_AMP_RIGHT < 8032.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 243.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_RIGHT_DETECTION < 243.5 ) { 
		if( MAX_AMP_LEFT >= 3574.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < 3574.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 8032.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
		if( DX2_DELTA < 1090.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_DX2_LEFT < 4590.5 ) { return new Prediction("BOTTOM", 172, 0); }
	if( MAX_DX2_LEFT >= 4590.5 ) { 
	if( MAX_AMP_LEFT < 8703.5 ) { 
		if( AVG_DX2_LEFT < 1 ) { return new Prediction("BOTTOM", 19, 0); }
		if( AVG_DX2_LEFT >= 1 ) { return new Prediction("TOP", 5, 0); }
	}
		if( MAX_AMP_LEFT >= 8703.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < 11815.5 ) { 
	if( MAX_DX2_LEFT < 19793.5 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
		if( MAX_AMP_RIGHT >= 14660.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( MAX_AMP_RIGHT < 14660.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( AVG_DX2_LEFT >= -3.47 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_LEFT < -3.47 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
		if( FIRST_LEFT_DETECTION < 105 ) { return new Prediction("RIGHT", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 105 ) { 
		if( AVG_AMP_RIGHT < -22 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_RIGHT >= -22 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= -7.5 ) { 
		if( FIRST_LEFT_DETECTION < 232.5 ) { return new Prediction("RIGHT", 163, 0); }
	if( FIRST_LEFT_DETECTION >= 232.5 ) { 
	if( AMP_DELTA < 7868.5 ) { 
		if( FIRST_LEFT_DETECTION >= 239 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 239 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA >= 7868.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 19793.5 ) { 
		if( AVG_DX2_RIGHT >= 1.47 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < 1.47 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 11815.5 ) { 
		if( MAX_DX2_RIGHT < 21248.5 ) { return new Prediction("TOP", 27, 0); }
		if( MAX_DX2_RIGHT >= 21248.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree84() {
	if( MAX_AMP_LEFT >= 5164.5 ) { 
	if( MAX_DX2_RIGHT >= 7682 ) { 
	if( MAX_DX2_RIGHT < 11695 ) { 
		if( MAX_AMP_LEFT < 7439.5 ) { return new Prediction("RIGHT", 33, 0); }
		if( MAX_AMP_LEFT >= 7439.5 ) { return new Prediction("TOP", 25, 0); }
	}
	if( MAX_DX2_RIGHT >= 11695 ) { 
	if( MAX_AMP_RIGHT < -17361 ) { 
	if( DX2_DELTA >= 6810 ) { 
		if( FIRST_LEFT_DETECTION >= 119 ) { return new Prediction("RIGHT", 38, 0); }
	if( FIRST_LEFT_DETECTION < 119 ) { 
		if( FIRST_RIGHT_DETECTION < 112.5 ) { return new Prediction("RIGHT", 11, 0); }
		if( FIRST_RIGHT_DETECTION >= 112.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( DX2_DELTA < 6810 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_AMP_RIGHT >= -17361 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( FIRST_RIGHT_DETECTION < 92.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 92.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 90, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT < 7682 ) { return new Prediction("TOP", 122, 0); }
	}
	if( MAX_AMP_LEFT < 5164.5 ) { 
	if( MAX_AMP_LEFT >= -7242 ) { 
	if( MAX_DX2_RIGHT < 5759.5 ) { 
	if( AVG_AMP_RIGHT >= 17.5 ) { 
	if( FIRST_LEFT_DETECTION < 502 ) { 
		if( AMP_DELTA >= 7392.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AMP_DELTA < 7392.5 ) { 
		if( AMP_DELTA >= 910.5 ) { return new Prediction("LEFT", 104, 0); }
		if( AMP_DELTA < 910.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 502 ) { 
		if( AVG_DX2_RIGHT >= -1.19 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT < -1.19 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 17.5 ) { 
	if( AVG_DX2_RIGHT < 1.9 ) { 
	if( FIRST_RIGHT_DETECTION < 205.5 ) { 
	if( MAX_AMP_RIGHT < -7938 ) { 
		if( MAX_AMP_LEFT < -2246.5 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_AMP_LEFT >= -2246.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( MAX_AMP_RIGHT >= -7938 ) { return new Prediction("LEFT", 30, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 205.5 ) { 
		if( MAX_AMP_RIGHT >= 7361.5 ) { return new Prediction("BOTTOM", 7, 0); }
	if( MAX_AMP_RIGHT < 7361.5 ) { 
		if( AMP_DELTA >= 6333 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AMP_DELTA < 6333 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
	if( FIRST_LEFT_DETECTION >= 256.5 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( FIRST_RIGHT_DETECTION < 248.5 ) { return new Prediction("LEFT", 8, 0); }
	if( FIRST_RIGHT_DETECTION >= 248.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 265.5 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 265.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 10.5 ) { 
		if( FIRST_LEFT_DETECTION < 481.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 25, 13); }
	}
	}
	if( FIRST_LEFT_DETECTION < 256.5 ) { 
		if( AVG_DX2_RIGHT >= -0.42 ) { return new Prediction("TOP", 6, 0); }
	if( AVG_DX2_RIGHT < -0.42 ) { 
		if( AVG_AMP_RIGHT < 5.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_RIGHT >= 5.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
		if( AVG_AMP_LEFT < -4.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT >= 1.9 ) { 
		if( MAX_DX2_RIGHT >= 4269.5 ) { return new Prediction("BOTTOM", 20, 0); }
	if( MAX_DX2_RIGHT < 4269.5 ) { 
		if( FIRST_LEFT_DETECTION >= 414.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 414.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5759.5 ) { 
	if( FIRST_RIGHT_DETECTION < 154.5 ) { 
	if( MAX_AMP_LEFT >= 3801.5 ) { 
		if( MAX_DX2_RIGHT < 11205 ) { return new Prediction("RIGHT", 14, 0); }
		if( MAX_DX2_RIGHT >= 11205 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 3801.5 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( MAX_DX2_RIGHT >= 6397 ) { 
		if( AVG_AMP_RIGHT < 43 ) { return new Prediction("BOTTOM", 15, 0); }
		if( AVG_AMP_RIGHT >= 43 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT < 6397 ) { 
		if( AVG_DX2_RIGHT >= 2.05 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 2.05 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( MAX_AMP_LEFT < -1072 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_AMP_LEFT >= -1072 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 154.5 ) { 
	if( AMP_DELTA < 6202.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 229.5 ) { 
		if( MAX_DX2_LEFT < 4630 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_LEFT >= 4630 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 229.5 ) { return new Prediction("LEFT", 12, 0); }
	}
	if( AMP_DELTA >= 6202.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 115, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_LEFT >= -3 ) { 
	if( MAX_AMP_LEFT < 3226 ) { 
		if( AVG_DX2_RIGHT >= -0.69 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < -0.69 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 3226 ) { return new Prediction("RIGHT", 11, 0); }
	}
	if( AVG_AMP_LEFT < -3 ) { 
		if( AVG_AMP_LEFT >= -12 ) { return new Prediction("BOTTOM", 8, 0); }
	if( AVG_AMP_LEFT < -12 ) { 
		if( FIRST_LEFT_DETECTION < 207.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 207.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < -7242 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
	if( MAX_AMP_LEFT >= -7675 ) { 
		if( AVG_DX2_RIGHT < 0.83 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_RIGHT >= 0.83 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT < -7675 ) { return new Prediction("TOP", 30, 0); }
	}
	}
	}
return null;
}
private Prediction runTree85() {
	if( MAX_DX2_LEFT >= 3650.5 ) { 
	if( MAX_AMP_RIGHT >= -15498.5 ) { 
	if( MAX_DX2_RIGHT >= 7831.5 ) { 
	if( MAX_AMP_RIGHT < 11598 ) { 
	if( MAX_DX2_LEFT >= 10153.5 ) { 
		if( MAX_DX2_RIGHT < 15139 ) { return new Prediction("TOP", 24, 0); }
	if( MAX_DX2_RIGHT >= 15139 ) { 
		if( AVG_DX2_LEFT >= -3.13 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -3.13 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 10153.5 ) { 
	if( MAX_DX2_LEFT < 6690.5 ) { 
	if( AMP_DELTA >= 6740 ) { 
		if( FIRST_RIGHT_DETECTION < 118.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 118.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( AMP_DELTA < 6740 ) { 
		if( MAX_AMP_LEFT < 666.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT >= 666.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 6690.5 ) { 
		if( MAX_AMP_LEFT >= 6083.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 6083.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= 11598 ) { 
	if( MAX_AMP_LEFT < 4250.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( MAX_DX2_LEFT < 23740.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_LEFT >= 23740.5 ) { return new Prediction("TOP", 5, 0); }
	}
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	if( MAX_AMP_LEFT >= 4250.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( FIRST_LEFT_DETECTION < 173.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 77 ) { return new Prediction("RIGHT", 12, 0); }
		if( FIRST_RIGHT_DETECTION < 77 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 173.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 95, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 7831.5 ) { 
	if( MAX_DX2_LEFT < 4424.5 ) { 
		if( DETECTION_DELTA >= 5 ) { return new Prediction("TOP", 9, 0); }
	if( DETECTION_DELTA < 5 ) { 
	if( MAX_AMP_LEFT >= -639.5 ) { 
		if( FIRST_LEFT_DETECTION < 166 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 166 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT < -639.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 4424.5 ) { 
	if( FIRST_LEFT_DETECTION >= 212.5 ) { 
		if( AVG_AMP_RIGHT < 21 ) { return new Prediction("TOP", 11, 0); }
		if( AVG_AMP_RIGHT >= 21 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 212.5 ) { return new Prediction("TOP", 130, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -15498.5 ) { 
	if( DX2_DELTA >= 17864 ) { 
		if( AVG_DX2_RIGHT < -1.9 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -1.9 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( DX2_DELTA < 17864 ) { 
	if( FIRST_RIGHT_DETECTION < 241.5 ) { 
	if( MAX_DX2_RIGHT < 15754.5 ) { 
		if( FIRST_LEFT_DETECTION >= 154 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_LEFT_DETECTION < 154 ) { 
		if( MAX_DX2_LEFT < 11286.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 11286.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 15754.5 ) { return new Prediction("RIGHT", 81, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 241.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( DX2_DELTA >= 2858 ) { 
	if( MAX_AMP_LEFT < 3851 ) { 
		if( AMP_DELTA >= 5946.5 ) { return new Prediction("BOTTOM", 153, 0); }
	if( AMP_DELTA < 5946.5 ) { 
	if( AMP_DELTA >= 3845 ) { 
	if( MAX_AMP_RIGHT >= 4216 ) { 
		if( AVG_AMP_LEFT >= -8 ) { return new Prediction("RIGHT", 9, 0); }
		if( AVG_AMP_LEFT < -8 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 4216 ) { 
		if( DX2_DELTA < 3303.5 ) { return new Prediction("LEFT", 3, 0); }
		if( DX2_DELTA >= 3303.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AMP_DELTA < 3845 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3851 ) { 
		if( FIRST_RIGHT_DETECTION < 137 ) { return new Prediction("RIGHT", 10, 0); }
	if( FIRST_RIGHT_DETECTION >= 137 ) { 
		if( MAX_DX2_RIGHT < 6557 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 6557 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( DX2_DELTA < 2858 ) { 
	if( DX2_DELTA >= 255 ) { 
	if( AMP_DELTA < 5571.5 ) { 
	if( MAX_AMP_LEFT >= 3852 ) { 
	if( MAX_DX2_RIGHT < 4885 ) { 
		if( MAX_DX2_RIGHT < 3446.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 3446.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 4885 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_AMP_LEFT < 3852 ) { 
		if( AVG_DX2_RIGHT < -0.03 ) { return new Prediction("LEFT", 86, 0); }
	if( AVG_DX2_RIGHT >= -0.03 ) { 
		if( DX2_DELTA >= 2788 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA < 2788 ) { 
	if( DX2_DELTA >= 2120.5 ) { 
	if( MAX_DX2_RIGHT < 2408 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( MAX_AMP_LEFT >= -1081 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < -1081 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 2408 ) { return new Prediction("LEFT", 12, 0); }
	}
		if( DX2_DELTA < 2120.5 ) { return new Prediction("LEFT", 40, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 5571.5 ) { 
		if( MAX_DX2_RIGHT < 3920.5 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_DX2_RIGHT >= 3920.5 ) { 
		if( AVG_DX2_LEFT >= -1.32 ) { return new Prediction("BOTTOM", 9, 0); }
		if( AVG_DX2_LEFT < -1.32 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 255 ) { 
	if( MAX_AMP_LEFT >= -4069.5 ) { 
	if( AVG_DX2_LEFT < 0.7 ) { 
		if( AVG_AMP_RIGHT >= 3 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_AMP_RIGHT < 3 ) { return new Prediction("LEFT", 12, 6); }
	}
		if( AVG_DX2_LEFT >= 0.7 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_LEFT < -4069.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
return null;
}
private Prediction runTree86() {
	if( MAX_AMP_LEFT < 5035 ) { 
	if( AMP_DELTA < 5768 ) { 
		if( MAX_AMP_LEFT < -6774 ) { return new Prediction("TOP", 19, 0); }
	if( MAX_AMP_LEFT >= -6774 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( FIRST_RIGHT_DETECTION < 245 ) { 
	if( AVG_DX2_RIGHT >= 2.84 ) { 
		if( AVG_AMP_RIGHT < -2 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT >= -2 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_RIGHT < 2.84 ) { 
	if( AVG_DX2_RIGHT >= 0.17 ) { 
		if( AVG_AMP_LEFT < -16 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_LEFT >= -16 ) { return new Prediction("LEFT", 13, 0); }
	}
		if( AVG_DX2_RIGHT < 0.17 ) { return new Prediction("LEFT", 36, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 245 ) { 
	if( AVG_DX2_RIGHT < 0.03 ) { 
		if( MAX_AMP_LEFT < -1842.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_AMP_LEFT >= -1842.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 481.5 ) { return new Prediction("LEFT", 14, 5); }
	if( FIRST_RIGHT_DETECTION < 481.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 265.5 ) { return new Prediction("LEFT", 13, 0); }
	if( FIRST_RIGHT_DETECTION < 265.5 ) { 
		if( AVG_DX2_RIGHT >= -0.15 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -0.15 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT >= 0.03 ) { 
		if( AVG_DX2_RIGHT < 0.99 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT >= 0.99 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( MAX_AMP_LEFT >= -2478.5 ) { 
	if( AVG_AMP_LEFT >= -3.5 ) { 
	if( FIRST_LEFT_DETECTION < 502 ) { 
		if( DX2_DELTA < 4708 ) { return new Prediction("LEFT", 46, 0); }
		if( DX2_DELTA >= 4708 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 502 ) { 
		if( FIRST_LEFT_DETECTION < 662.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 662.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < -3.5 ) { 
		if( AVG_DX2_LEFT < -0.21 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -0.21 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT < -2478.5 ) { return new Prediction("LEFT", 98, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5768 ) { 
	if( MAX_DX2_LEFT < 9519.5 ) { 
	if( FIRST_LEFT_DETECTION >= 176 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( MAX_AMP_LEFT >= 4728.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_AMP_LEFT < 4728.5 ) { 
	if( AMP_DELTA >= 8044 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("BOTTOM", 28, 0); }
	if( AVG_AMP_LEFT >= 8 ) { 
		if( MAX_AMP_LEFT < 4043.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT >= 4043.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AMP_DELTA < 8044 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 136, 0); }
	}
	if( FIRST_LEFT_DETECTION < 176 ) { 
	if( AVG_DX2_RIGHT >= -0.01 ) { 
	if( MAX_DX2_RIGHT >= 5494 ) { 
		if( AVG_AMP_LEFT < 5.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( MAX_DX2_RIGHT < 5494 ) { 
		if( AVG_DX2_LEFT >= -0.62 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_LEFT < -0.62 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AVG_DX2_RIGHT < -0.01 ) { 
		if( AVG_AMP_RIGHT >= 26 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_AMP_RIGHT < 26 ) { 
		if( AVG_AMP_LEFT < 2 ) { return new Prediction("BOTTOM", 16, 0); }
	if( AVG_AMP_LEFT >= 2 ) { 
		if( AVG_DX2_RIGHT < -1.08 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.08 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 9519.5 ) { 
	if( MAX_AMP_LEFT < -11242 ) { 
		if( MAX_AMP_RIGHT < -18905.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT >= -18905.5 ) { return new Prediction("TOP", 14, 0); }
	}
	if( MAX_AMP_LEFT >= -11242 ) { 
		if( AVG_DX2_RIGHT >= 5.99 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT < 5.99 ) { 
		if( AVG_AMP_LEFT < -12.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT >= -12.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5035 ) { 
	if( AMP_DELTA < 8019.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( AVG_AMP_RIGHT < 25.5 ) { return new Prediction("TOP", 82, 0); }
	if( AVG_AMP_RIGHT >= 25.5 ) { 
		if( MAX_DX2_LEFT >= 7594.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 7594.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
		if( AMP_DELTA < 4425 ) { return new Prediction("TOP", 31, 0); }
	if( AMP_DELTA >= 4425 ) { 
		if( MAX_AMP_RIGHT >= -1966 ) { return new Prediction("RIGHT", 22, 0); }
		if( MAX_AMP_RIGHT < -1966 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 8019.5 ) { 
	if( MAX_DX2_RIGHT < 8617 ) { 
		if( MAX_DX2_LEFT < 6362.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 6362.5 ) { return new Prediction("TOP", 18, 0); }
	}
	if( MAX_DX2_RIGHT >= 8617 ) { 
		if( DX2_DELTA >= 17864 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DX2_DELTA < 17864 ) { 
	if( MAX_AMP_LEFT < 18149 ) { 
		if( FIRST_LEFT_DETECTION < 250.5 ) { return new Prediction("RIGHT", 146, 0); }
	if( FIRST_LEFT_DETECTION >= 250.5 ) { 
		if( AVG_DX2_RIGHT < 2.61 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.61 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 18149 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree87() {
	if( MAX_DX2_LEFT < 3644.5 ) { 
	if( MAX_DX2_RIGHT >= 6301.5 ) { 
	if( AMP_DELTA < 6010.5 ) { 
	if( DETECTION_DELTA < 9 ) { 
		if( AVG_AMP_RIGHT < 7 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT >= 7 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( DETECTION_DELTA >= 9 ) { 
		if( FIRST_LEFT_DETECTION >= 204.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 204.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AMP_DELTA >= 6010.5 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( MAX_DX2_LEFT < 2804.5 ) { return new Prediction("BOTTOM", 19, 0); }
	if( MAX_DX2_LEFT >= 2804.5 ) { 
	if( MAX_AMP_RIGHT >= 11885.5 ) { 
		if( MAX_AMP_LEFT < 5213.5 ) { return new Prediction("BOTTOM", 11, 0); }
		if( MAX_AMP_LEFT >= 5213.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_RIGHT < 11885.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 81, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6301.5 ) { 
	if( AMP_DELTA < 5646.5 ) { 
	if( FIRST_RIGHT_DETECTION < 194 ) { 
		if( AVG_DX2_RIGHT < 1.9 ) { return new Prediction("LEFT", 112, 0); }
	if( AVG_DX2_RIGHT >= 1.9 ) { 
		if( FIRST_RIGHT_DETECTION < 158 ) { return new Prediction("LEFT", 8, 0); }
	if( FIRST_RIGHT_DETECTION >= 158 ) { 
		if( MAX_DX2_RIGHT < 4403 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 4403 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 194 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( AVG_DX2_LEFT < 0.49 ) { 
	if( MAX_DX2_LEFT < 2258 ) { 
	if( FIRST_RIGHT_DETECTION >= 481.5 ) { 
		if( MAX_DX2_LEFT >= 2126.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_LEFT < 2126.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 17, 5); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 481.5 ) { return new Prediction("LEFT", 16, 0); }
	}
	if( MAX_DX2_LEFT >= 2258 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
		if( FIRST_RIGHT_DETECTION < 225 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 225 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 0.49 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_AMP_RIGHT >= 12.5 ) { return new Prediction("LEFT", 37, 0); }
	}
	}
	if( AMP_DELTA >= 5646.5 ) { 
	if( DETECTION_DELTA < 9 ) { 
	if( MAX_AMP_RIGHT >= -9120 ) { 
		if( AVG_DX2_RIGHT >= 3.28 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT < 3.28 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_RIGHT < -9120 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( DETECTION_DELTA >= 9 ) { 
		if( FIRST_RIGHT_DETECTION < 107.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 107.5 ) { return new Prediction("BOTTOM", 47, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3644.5 ) { 
	if( AMP_DELTA < 6480 ) { 
	if( MAX_DX2_RIGHT >= 10369 ) { 
		if( FIRST_LEFT_DETECTION >= 170.5 ) { return new Prediction("LEFT", 5, 0); }
	if( FIRST_LEFT_DETECTION < 170.5 ) { 
	if( AMP_DELTA >= 5982.5 ) { 
		if( MAX_AMP_LEFT < -5361.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -5361.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AMP_DELTA < 5982.5 ) { 
		if( MAX_AMP_LEFT < 9620 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_AMP_LEFT >= 9620 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 10369 ) { 
		if( MAX_AMP_LEFT >= 5510.5 ) { return new Prediction("TOP", 91, 0); }
	if( MAX_AMP_LEFT < 5510.5 ) { 
		if( MAX_DX2_RIGHT < 5901.5 ) { return new Prediction("TOP", 11, 0); }
	if( MAX_DX2_RIGHT >= 5901.5 ) { 
	if( MAX_DX2_LEFT < 5300.5 ) { 
	if( AMP_DELTA >= 4395.5 ) { 
		if( AVG_DX2_RIGHT >= 5.18 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 5.18 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AMP_DELTA < 4395.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( MAX_DX2_LEFT >= 5300.5 ) { 
		if( MAX_DX2_RIGHT < 8868 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_DX2_RIGHT >= 8868 ) { 
		if( AVG_DX2_RIGHT < 2.31 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.31 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6480 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( MAX_DX2_LEFT >= 16002.5 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_DX2_LEFT < 16002.5 ) { 
	if( MAX_AMP_LEFT < 9958.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 474.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 474.5 ) { return new Prediction("BOTTOM", 45, 0); }
	}
		if( MAX_AMP_LEFT >= 9958.5 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 8.5 ) { 
	if( AVG_DX2_RIGHT < 3.63 ) { 
	if( MAX_AMP_LEFT < 11351.5 ) { 
		if( AVG_DX2_LEFT < 4.95 ) { return new Prediction("RIGHT", 15, 0); }
		if( AVG_DX2_LEFT >= 4.95 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 11351.5 ) { return new Prediction("TOP", 29, 0); }
	}
		if( AVG_DX2_RIGHT >= 3.63 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT < -20 ) { 
	if( MAX_AMP_RIGHT >= -19137.5 ) { 
	if( FIRST_LEFT_DETECTION < 158 ) { 
		if( AVG_DX2_RIGHT < -6.54 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -6.54 ) { return new Prediction("TOP", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 158 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_RIGHT < -19137.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AVG_AMP_LEFT >= -20 ) { 
	if( MAX_DX2_LEFT >= 15713.5 ) { 
		if( FIRST_LEFT_DETECTION >= 209 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_LEFT_DETECTION < 209 ) { 
		if( AVG_AMP_RIGHT < -9.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_RIGHT >= -9.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
		if( MAX_DX2_LEFT < 15713.5 ) { return new Prediction("RIGHT", 163, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree88() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( AMP_DELTA < 6118.5 ) { 
	if( AVG_DX2_RIGHT < -0.54 ) { 
	if( DX2_DELTA >= 3538.5 ) { 
		if( AVG_DX2_RIGHT < -5.31 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -5.31 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( DX2_DELTA < 3538.5 ) { 
	if( FIRST_RIGHT_DETECTION < 235 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
		if( FIRST_RIGHT_DETECTION < 204 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_RIGHT_DETECTION >= 204 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 5.5 ) { return new Prediction("LEFT", 98, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 235 ) { 
		if( AVG_DX2_LEFT < 0.42 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_DX2_LEFT >= 0.42 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= -0.54 ) { 
	if( FIRST_RIGHT_DETECTION < 244 ) { 
	if( MAX_AMP_LEFT >= 4103 ) { 
		if( MAX_DX2_LEFT < 2999.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 2999.5 ) { return new Prediction("TOP", 5, 0); }
	}
		if( MAX_AMP_LEFT < 4103 ) { return new Prediction("LEFT", 59, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 244 ) { 
	if( AVG_AMP_LEFT >= -1 ) { 
	if( DETECTION_DELTA < 3 ) { 
		if( FIRST_LEFT_DETECTION < 457.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 457.5 ) { return new Prediction("LEFT", 25, 12); }
	}
	if( DETECTION_DELTA >= 3 ) { 
	if( DX2_DELTA < 2347 ) { 
		if( AVG_DX2_RIGHT < 0.38 ) { return new Prediction("LEFT", 6, 0); }
		if( AVG_DX2_RIGHT >= 0.38 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 2347 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT < -1 ) { 
		if( DX2_DELTA >= 2124.5 ) { return new Prediction("TOP", 5, 0); }
	if( DX2_DELTA < 2124.5 ) { 
		if( MAX_AMP_LEFT < -3748.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -3748.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6118.5 ) { 
	if( FIRST_LEFT_DETECTION >= 164 ) { 
		if( MAX_AMP_RIGHT < 9869.5 ) { return new Prediction("BOTTOM", 89, 0); }
	if( MAX_AMP_RIGHT >= 9869.5 ) { 
		if( MAX_AMP_RIGHT >= 10836.5 ) { return new Prediction("BOTTOM", 53, 0); }
	if( MAX_AMP_RIGHT < 10836.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231 ) { return new Prediction("BOTTOM", 8, 0); }
	if( FIRST_LEFT_DETECTION < 231 ) { 
		if( MAX_AMP_LEFT >= 2975 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT < 2975 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( FIRST_LEFT_DETECTION < 164 ) { 
	if( MAX_AMP_LEFT >= 3813 ) { 
		if( MAX_DX2_RIGHT < 10372.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( MAX_DX2_RIGHT >= 10372.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT < 3813 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( MAX_DX2_RIGHT >= 8260.5 ) { 
	if( MAX_AMP_LEFT < 12019 ) { 
	if( MAX_AMP_LEFT >= 4245 ) { 
	if( FIRST_RIGHT_DETECTION >= 229.5 ) { 
	if( MAX_AMP_RIGHT < -15687.5 ) { 
		if( FIRST_LEFT_DETECTION < 240 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 240 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	if( MAX_AMP_RIGHT >= -15687.5 ) { 
		if( MAX_DX2_RIGHT < 19162 ) { return new Prediction("RIGHT", 11, 0); }
		if( MAX_DX2_RIGHT >= 19162 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 229.5 ) { 
	if( MAX_DX2_LEFT >= 13266.5 ) { 
		if( MAX_DX2_LEFT < 13589 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 13589 ) { return new Prediction("RIGHT", 11, 0); }
	}
		if( MAX_DX2_LEFT < 13266.5 ) { return new Prediction("RIGHT", 140, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4245 ) { 
	if( MAX_DX2_LEFT < 13790.5 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
		if( MAX_AMP_RIGHT >= -17815.5 ) { return new Prediction("BOTTOM", 29, 0); }
	if( MAX_AMP_RIGHT < -17815.5 ) { 
		if( AVG_DX2_RIGHT >= 1.7 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT < 1.7 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( FIRST_LEFT_DETECTION >= 155.5 ) { 
		if( AMP_DELTA >= 8562.5 ) { return new Prediction("BOTTOM", 7, 0); }
		if( AMP_DELTA < 8562.5 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( FIRST_LEFT_DETECTION < 155.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 13790.5 ) { 
		if( DX2_DELTA < 4191.5 ) { return new Prediction("RIGHT", 11, 0); }
	if( DX2_DELTA >= 4191.5 ) { 
	if( MAX_DX2_RIGHT >= 15274.5 ) { 
		if( MAX_DX2_RIGHT < 19970 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_DX2_RIGHT >= 19970 ) { 
		if( FIRST_RIGHT_DETECTION < 146.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 146.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 15274.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 12019 ) { return new Prediction("TOP", 19, 0); }
	}
	if( MAX_DX2_RIGHT < 8260.5 ) { 
	if( AVG_AMP_RIGHT < 18.5 ) { 
	if( MAX_AMP_LEFT < 5005.5 ) { 
		if( MAX_AMP_LEFT >= -1193 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT < -1193 ) { return new Prediction("TOP", 15, 0); }
	}
		if( MAX_AMP_LEFT >= 5005.5 ) { return new Prediction("TOP", 122, 0); }
	}
	if( AVG_AMP_RIGHT >= 18.5 ) { 
		if( MAX_AMP_LEFT >= 1384.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_AMP_LEFT < 1384.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
return null;
}
private Prediction runTree89() {
	if( MAX_DX2_LEFT >= 3650.5 ) { 
	if( MAX_DX2_RIGHT >= 9155 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AMP_DELTA < 7371 ) { 
	if( FIRST_RIGHT_DETECTION < 205 ) { 
		if( MAX_AMP_LEFT >= 9088.5 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_AMP_LEFT < 9088.5 ) { 
		if( AVG_DX2_LEFT >= -2.28 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT < -2.28 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 205 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AMP_DELTA >= 7371 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( MAX_DX2_LEFT < 12652.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("BOTTOM", 15, 0); }
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("RIGHT", 15, 0); }
	}
		if( MAX_DX2_LEFT >= 12652.5 ) { return new Prediction("TOP", 8, 0); }
	}
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("BOTTOM", 33, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_LEFT >= 13267 ) { 
	if( MAX_AMP_LEFT < -10350 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("RIGHT", 3, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_AMP_LEFT >= -10350 ) { 
	if( DX2_DELTA >= 17864 ) { 
		if( AVG_DX2_RIGHT < -1.04 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -1.04 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( DX2_DELTA < 17864 ) { return new Prediction("RIGHT", 17, 0); }
	}
	}
	if( MAX_DX2_LEFT < 13267 ) { 
	if( AMP_DELTA >= 7452 ) { 
		if( DX2_DELTA >= 18366 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 18366 ) { return new Prediction("RIGHT", 143, 0); }
	}
	if( AMP_DELTA < 7452 ) { 
		if( MAX_AMP_RIGHT < 12250.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= 12250.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 9155 ) { 
		if( AVG_AMP_RIGHT < 8.5 ) { return new Prediction("TOP", 127, 0); }
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( MAX_AMP_LEFT < 5432 ) { 
	if( MAX_DX2_RIGHT < 7960 ) { 
		if( MAX_DX2_LEFT < 6260.5 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_DX2_LEFT >= 6260.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 191.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 191.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 7960 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( MAX_AMP_LEFT >= 5432 ) { return new Prediction("TOP", 18, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 134.5 ) { 
	if( AMP_DELTA >= 6222.5 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( MAX_DX2_LEFT < 2804.5 ) { return new Prediction("BOTTOM", 18, 0); }
	if( MAX_DX2_LEFT >= 2804.5 ) { 
		if( MAX_DX2_LEFT < 2835.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 2835.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 121, 0); }
	}
	if( AMP_DELTA < 6222.5 ) { 
	if( MAX_DX2_RIGHT < 2013.5 ) { 
		if( DX2_DELTA >= 2124.5 ) { return new Prediction("TOP", 8, 0); }
	if( DX2_DELTA < 2124.5 ) { 
	if( AVG_DX2_LEFT < 0.49 ) { 
		if( DX2_DELTA < 1001 ) { return new Prediction("LEFT", 14, 7); }
		if( DX2_DELTA >= 1001 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_LEFT >= 0.49 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 2013.5 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
	if( DX2_DELTA >= 326.5 ) { 
	if( MAX_DX2_LEFT < 1000 ) { 
	if( AMP_DELTA < 2298 ) { 
		if( MAX_DX2_RIGHT >= 2352.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_RIGHT < 2352.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AMP_DELTA >= 2298 ) { 
		if( AVG_AMP_RIGHT < -11.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_RIGHT >= -11.5 ) { return new Prediction("LEFT", 26, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 1000 ) { 
	if( AVG_AMP_RIGHT < 5 ) { 
		if( MAX_AMP_LEFT < 3859 ) { return new Prediction("LEFT", 13, 0); }
		if( MAX_AMP_LEFT >= 3859 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 5 ) { return new Prediction("LEFT", 66, 0); }
	}
	}
		if( DX2_DELTA < 326.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( AVG_DX2_RIGHT < 1.18 ) { 
		if( MAX_AMP_RIGHT < -9884 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_RIGHT >= -9884 ) { 
		if( FIRST_LEFT_DETECTION < 211.5 ) { return new Prediction("LEFT", 29, 0); }
	if( FIRST_LEFT_DETECTION >= 211.5 ) { 
	if( MAX_DX2_RIGHT < 6189.5 ) { 
		if( FIRST_LEFT_DETECTION < 219.5 ) { return new Prediction("TOP", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 219.5 ) { 
		if( AMP_DELTA >= 4815 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 4815 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 6189.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 1.18 ) { 
	if( DX2_DELTA >= 1193 ) { 
	if( MAX_AMP_RIGHT >= 5853.5 ) { 
		if( MAX_DX2_RIGHT < 6109.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 6109.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT < 5853.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA < 1193 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 134.5 ) { 
		if( DX2_DELTA < 3700.5 ) { return new Prediction("LEFT", 45, 0); }
	if( DX2_DELTA >= 3700.5 ) { 
		if( AVG_DX2_RIGHT < 0.92 ) { return new Prediction("RIGHT", 8, 0); }
		if( AVG_DX2_RIGHT >= 0.92 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree90() {
	if( MAX_AMP_LEFT >= 5158.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_DX2_RIGHT < 8749 ) { return new Prediction("TOP", 119, 0); }
	if( MAX_DX2_RIGHT >= 8749 ) { 
	if( MAX_AMP_LEFT < 9765.5 ) { 
		if( MAX_DX2_LEFT >= 8131 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT < 8131 ) { return new Prediction("RIGHT", 15, 0); }
	}
		if( MAX_AMP_LEFT >= 9765.5 ) { return new Prediction("TOP", 12, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 8248.5 ) { 
		if( MAX_DX2_LEFT >= 3824 ) { return new Prediction("TOP", 16, 0); }
		if( MAX_DX2_LEFT < 3824 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 8248.5 ) { 
	if( AMP_DELTA >= 7238 ) { 
	if( AVG_AMP_LEFT < -20 ) { 
		if( FIRST_RIGHT_DETECTION < 136.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 136.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_AMP_LEFT >= -20 ) { return new Prediction("RIGHT", 149, 0); }
	}
	if( AMP_DELTA < 7238 ) { 
		if( MAX_DX2_LEFT < 8421.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_DX2_LEFT >= 8421.5 ) { 
		if( AVG_DX2_LEFT < -2.19 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -2.19 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 5158.5 ) { 
	if( AMP_DELTA >= 5123.5 ) { 
	if( MAX_DX2_LEFT < 10253.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( AVG_DX2_LEFT < 0.78 ) { 
	if( MAX_DX2_LEFT < 2900 ) { 
	if( FIRST_RIGHT_DETECTION >= 130 ) { 
	if( DX2_DELTA < 4077.5 ) { 
		if( AVG_DX2_RIGHT >= -1.02 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT < -1.02 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DX2_DELTA >= 4077.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 130 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2900 ) { return new Prediction("RIGHT", 16, 0); }
	}
	if( AVG_DX2_LEFT >= 0.78 ) { 
		if( MAX_DX2_LEFT >= 6974 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 6974 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( AMP_DELTA < 6118.5 ) { 
		if( AVG_DX2_LEFT < -0.38 ) { return new Prediction("RIGHT", 1, 0); }
	if( AVG_DX2_LEFT >= -0.38 ) { 
	if( MAX_DX2_LEFT < 2335.5 ) { 
		if( AVG_DX2_RIGHT < 0.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2335.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( AMP_DELTA >= 6118.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( AVG_DX2_RIGHT < 0.12 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_RIGHT >= 0.12 ) { 
		if( FIRST_RIGHT_DETECTION < 214 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 214 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("BOTTOM", 185, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 10253.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( MAX_DX2_LEFT >= 17621 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 17621 ) { return new Prediction("RIGHT", 11, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
		if( AMP_DELTA < 13407.5 ) { return new Prediction("TOP", 12, 0); }
		if( AMP_DELTA >= 13407.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
		if( AVG_DX2_LEFT >= 0.52 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 0.52 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 5123.5 ) { 
	if( MAX_DX2_LEFT >= 3861 ) { 
	if( MAX_AMP_LEFT >= -4988 ) { 
		if( AVG_DX2_RIGHT < 6.27 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 6.27 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT < -4988 ) { 
		if( FIRST_LEFT_DETECTION >= 252.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 252.5 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	if( MAX_DX2_LEFT < 3861 ) { 
	if( MAX_DX2_RIGHT < 2403.5 ) { 
		if( MAX_DX2_LEFT >= 2126.5 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_DX2_LEFT < 2126.5 ) { 
		if( AMP_DELTA >= 655 ) { return new Prediction("LEFT", 9, 0); }
		if( AMP_DELTA < 655 ) { return new Prediction("LEFT", 15, 6); }
	}
	}
	if( MAX_DX2_RIGHT >= 2403.5 ) { 
	if( AMP_DELTA < 3887 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
		if( FIRST_RIGHT_DETECTION < 258 ) { return new Prediction("LEFT", 124, 0); }
	if( FIRST_RIGHT_DETECTION >= 258 ) { 
		if( FIRST_LEFT_DETECTION < 502 ) { return new Prediction("LEFT", 18, 0); }
		if( FIRST_LEFT_DETECTION >= 502 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
	if( FIRST_LEFT_DETECTION >= 191 ) { 
		if( AVG_DX2_LEFT < -0.54 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.54 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 191 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AMP_DELTA >= 3887 ) { 
	if( DETECTION_DELTA < 541.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 162.5 ) { 
	if( DX2_DELTA >= 2763.5 ) { 
		if( MAX_AMP_RIGHT < -171 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_AMP_RIGHT >= -171 ) { 
	if( FIRST_RIGHT_DETECTION >= 181 ) { 
		if( DX2_DELTA < 3088.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA >= 3088.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 181 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( DX2_DELTA < 2763.5 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 162.5 ) { return new Prediction("LEFT", 17, 0); }
	}
		if( DETECTION_DELTA >= 541.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree91() {
	if( MAX_AMP_LEFT < 5038.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
	if( MAX_DX2_RIGHT < 7074.5 ) { 
	if( MAX_AMP_LEFT >= -2032.5 ) { 
		if( AMP_DELTA >= 5671 ) { return new Prediction("BOTTOM", 6, 0); }
	if( AMP_DELTA < 5671 ) { 
		if( FIRST_RIGHT_DETECTION < 122 ) { return new Prediction("RIGHT", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 122 ) { 
		if( MAX_DX2_LEFT < 4161 ) { return new Prediction("LEFT", 30, 0); }
		if( MAX_DX2_LEFT >= 4161 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -2032.5 ) { 
	if( AVG_DX2_RIGHT >= -0.31 ) { 
		if( MAX_DX2_RIGHT < 5920.5 ) { return new Prediction("LEFT", 22, 0); }
	if( MAX_DX2_RIGHT >= 5920.5 ) { 
		if( FIRST_LEFT_DETECTION >= 126.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 126.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
		if( AVG_DX2_RIGHT < -0.31 ) { return new Prediction("LEFT", 80, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 7074.5 ) { 
	if( FIRST_LEFT_DETECTION >= 200 ) { 
	if( AMP_DELTA >= 5895.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( MAX_AMP_LEFT >= 4721 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < 4721 ) { return new Prediction("BOTTOM", 13, 0); }
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AMP_DELTA < 5895.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( FIRST_LEFT_DETECTION < 200 ) { 
		if( AVG_AMP_LEFT < -17 ) { return new Prediction("TOP", 5, 0); }
	if( AVG_AMP_LEFT >= -17 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( MAX_DX2_LEFT >= 11414.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT < 11414.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
	if( AMP_DELTA < 6400 ) { 
	if( MAX_DX2_LEFT >= 3123.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_DX2_LEFT >= 3861 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_DX2_LEFT < 3861 ) { 
		if( MAX_DX2_RIGHT >= 5371.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 5371.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_DX2_LEFT < 0.26 ) { 
		if( AVG_DX2_LEFT < -1.99 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.99 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( MAX_DX2_LEFT < 3123.5 ) { 
	if( MAX_DX2_RIGHT >= 1001 ) { 
	if( AVG_DX2_RIGHT >= 0.62 ) { 
	if( MAX_DX2_LEFT < 2800.5 ) { 
		if( MAX_DX2_RIGHT < 2962 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_DX2_RIGHT >= 2962 ) { 
	if( DX2_DELTA < 1592.5 ) { 
		if( AVG_DX2_RIGHT < 0.8 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.8 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 1592.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 2800.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AVG_DX2_RIGHT < 0.62 ) { return new Prediction("LEFT", 34, 0); }
	}
	if( MAX_DX2_RIGHT < 1001 ) { 
		if( DX2_DELTA < 1099 ) { return new Prediction("LEFT", 20, 8); }
		if( DX2_DELTA >= 1099 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6400 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( FIRST_LEFT_DETECTION >= 121 ) { 
		if( MAX_DX2_RIGHT < 3472 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 3472 ) { return new Prediction("BOTTOM", 181, 0); }
	}
		if( FIRST_LEFT_DETECTION < 121 ) { return new Prediction("TOP", 3, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_AMP_LEFT < -10602 ) { 
		if( AVG_DX2_RIGHT < -6.57 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT >= -6.57 ) { return new Prediction("TOP", 12, 0); }
	}
	if( MAX_AMP_LEFT >= -10602 ) { 
		if( MAX_DX2_LEFT < 2768 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_DX2_LEFT >= 2768 ) { 
		if( MAX_AMP_RIGHT >= 380 ) { return new Prediction("RIGHT", 12, 0); }
	if( MAX_AMP_RIGHT < 380 ) { 
	if( MAX_AMP_RIGHT >= -15816 ) { 
		if( MAX_DX2_LEFT < 9687 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_LEFT >= 9687 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_RIGHT < -15816 ) { 
		if( AVG_AMP_LEFT < -8.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5038.5 ) { 
	if( AMP_DELTA < 6401 ) { 
	if( MAX_DX2_RIGHT >= 10431.5 ) { 
		if( MAX_DX2_LEFT < 8810.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 8810.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 10431.5 ) { return new Prediction("TOP", 97, 0); }
	}
	if( AMP_DELTA >= 6401 ) { 
		if( MAX_AMP_LEFT >= 14413.5 ) { return new Prediction("TOP", 36, 0); }
	if( MAX_AMP_LEFT < 14413.5 ) { 
	if( DX2_DELTA < 17783.5 ) { 
	if( DX2_DELTA >= 2976.5 ) { 
		if( FIRST_LEFT_DETECTION < 232 ) { return new Prediction("RIGHT", 146, 0); }
	if( FIRST_LEFT_DETECTION >= 232 ) { 
		if( FIRST_RIGHT_DETECTION < 231.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 231.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( DX2_DELTA < 2976.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DX2_DELTA >= 17783.5 ) { 
		if( MAX_DX2_LEFT >= 12902.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT < 12902.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree92() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_RIGHT >= 8229 ) { 
	if( MAX_AMP_LEFT < 13089 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
	if( MAX_AMP_LEFT >= -8840 ) { 
	if( MAX_DX2_RIGHT < 37682 ) { 
	if( AVG_DX2_RIGHT >= 9.01 ) { 
		if( FIRST_LEFT_DETECTION >= 98.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 98.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 9.01 ) { return new Prediction("RIGHT", 140, 0); }
	}
		if( MAX_DX2_RIGHT >= 37682 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_AMP_LEFT < -8840 ) { 
		if( DX2_DELTA < 4078.5 ) { return new Prediction("RIGHT", 2, 0); }
	if( DX2_DELTA >= 4078.5 ) { 
	if( AVG_DX2_LEFT >= -2.79 ) { 
		if( FIRST_RIGHT_DETECTION >= 192 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 192 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < -2.79 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 2.5 ) { 
	if( MAX_DX2_LEFT < 16460.5 ) { 
	if( FIRST_LEFT_DETECTION < 185.5 ) { 
		if( AVG_AMP_LEFT < -17 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_AMP_LEFT >= -17 ) { 
	if( AMP_DELTA < 6271 ) { 
		if( MAX_AMP_LEFT < 425.5 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_AMP_LEFT >= 425.5 ) { 
		if( AVG_DX2_LEFT < -1.55 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.55 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AMP_DELTA >= 6271 ) { return new Prediction("RIGHT", 42, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 185.5 ) { 
	if( AVG_AMP_LEFT >= -3 ) { 
	if( AVG_AMP_RIGHT < 38.5 ) { 
	if( DX2_DELTA < 5919 ) { 
		if( MAX_AMP_RIGHT >= 11678 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 11678 ) { return new Prediction("LEFT", 14, 0); }
	}
		if( DX2_DELTA >= 5919 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_AMP_RIGHT >= 38.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	if( AVG_AMP_LEFT < -3 ) { 
		if( AVG_AMP_RIGHT < 28.5 ) { return new Prediction("BOTTOM", 10, 0); }
		if( AVG_AMP_RIGHT >= 28.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 16460.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 13089 ) { return new Prediction("TOP", 15, 0); }
	}
	if( MAX_DX2_RIGHT < 8229 ) { 
	if( MAX_DX2_LEFT < 4075 ) { 
	if( MAX_DX2_RIGHT >= 5368.5 ) { 
	if( DX2_DELTA >= 3078 ) { 
		if( FIRST_RIGHT_DETECTION < 197.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( FIRST_RIGHT_DETECTION >= 197.5 ) { 
		if( MAX_DX2_LEFT < 2787.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_LEFT >= 2787.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DX2_DELTA < 3078 ) { 
		if( MAX_AMP_RIGHT < 11930 ) { return new Prediction("LEFT", 6, 0); }
		if( MAX_AMP_RIGHT >= 11930 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5368.5 ) { 
		if( MAX_DX2_RIGHT >= 3674.5 ) { return new Prediction("LEFT", 14, 0); }
	if( MAX_DX2_RIGHT < 3674.5 ) { 
	if( MAX_AMP_RIGHT >= 4399 ) { 
		if( FIRST_RIGHT_DETECTION < 261 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 261 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 4399 ) { 
		if( MAX_DX2_LEFT < 1062 ) { return new Prediction("LEFT", 17, 8); }
		if( MAX_DX2_LEFT >= 1062 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 4075 ) { 
	if( MAX_AMP_LEFT < 1523.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("TOP", 12, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_DX2_RIGHT < -0.55 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.55 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 1523.5 ) { return new Prediction("TOP", 106, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( DX2_DELTA < 3461 ) { 
		if( AMP_DELTA >= 5588 ) { return new Prediction("BOTTOM", 27, 0); }
	if( AMP_DELTA < 5588 ) { 
	if( AMP_DELTA >= 940 ) { 
	if( AVG_AMP_RIGHT < 5 ) { 
	if( AVG_AMP_LEFT >= -1.5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
		if( MAX_AMP_RIGHT < -2298 ) { return new Prediction("LEFT", 32, 0); }
	if( MAX_AMP_RIGHT >= -2298 ) { 
		if( AMP_DELTA < 1906 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA >= 1906 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3859 ) { 
		if( AVG_DX2_LEFT < -0.32 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -0.32 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < -1.5 ) { 
	if( MAX_AMP_LEFT >= -4553.5 ) { 
	if( DETECTION_DELTA >= 210 ) { 
	if( FIRST_LEFT_DETECTION >= 217.5 ) { 
		if( DX2_DELTA < 2126.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA >= 2126.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 217.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DETECTION_DELTA < 210 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( MAX_AMP_LEFT < -4553.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 5 ) { return new Prediction("LEFT", 107, 0); }
	}
	if( AMP_DELTA < 940 ) { 
		if( MAX_DX2_LEFT < 2777.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2777.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3461 ) { 
	if( MAX_DX2_RIGHT >= 4922.5 ) { 
		if( AVG_AMP_RIGHT >= 44 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_AMP_RIGHT < 44 ) { 
		if( MAX_DX2_LEFT < 13569.5 ) { return new Prediction("BOTTOM", 133, 0); }
		if( MAX_DX2_LEFT >= 13569.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 4922.5 ) { 
	if( MAX_DX2_LEFT < 2307 ) { 
		if( AMP_DELTA < 5522 ) { return new Prediction("RIGHT", 2, 0); }
		if( AMP_DELTA >= 5522 ) { return new Prediction("BOTTOM", 9, 0); }
	}
		if( MAX_DX2_LEFT >= 2307 ) { return new Prediction("TOP", 24, 0); }
	}
	}
	}
return null;
}
private Prediction runTree93() {
	if( AMP_DELTA >= 6215.5 ) { 
	if( MAX_AMP_LEFT >= 4728.5 ) { 
	if( MAX_DX2_RIGHT >= 7682 ) { 
		if( MAX_AMP_LEFT >= 14019 ) { return new Prediction("TOP", 16, 0); }
	if( MAX_AMP_LEFT < 14019 ) { 
	if( FIRST_LEFT_DETECTION >= 231 ) { 
	if( DX2_DELTA < 5916.5 ) { 
		if( AVG_DX2_LEFT >= -0.8 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -0.8 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 5916.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( FIRST_LEFT_DETECTION < 231 ) { 
	if( MAX_DX2_LEFT >= 13266.5 ) { 
		if( MAX_DX2_LEFT >= 13878 ) { return new Prediction("RIGHT", 11, 0); }
		if( MAX_DX2_LEFT < 13878 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT < 13266.5 ) { return new Prediction("RIGHT", 129, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT < 7682 ) { return new Prediction("TOP", 41, 0); }
	}
	if( MAX_AMP_LEFT < 4728.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_AMP_LEFT >= -7675 ) { return new Prediction("BOTTOM", 193, 0); }
		if( MAX_AMP_LEFT < -7675 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_AMP_LEFT >= -11.5 ) { 
	if( FIRST_RIGHT_DETECTION < 192.5 ) { 
	if( AVG_AMP_RIGHT < -3 ) { 
		if( MAX_DX2_RIGHT < 12178 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT >= 12178 ) { return new Prediction("TOP", 4, 0); }
	}
		if( AVG_AMP_RIGHT >= -3 ) { return new Prediction("RIGHT", 23, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 192.5 ) { 
	if( AVG_DX2_RIGHT < 5.4 ) { 
		if( DX2_DELTA >= 4359.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( DX2_DELTA < 4359.5 ) { 
		if( AVG_DX2_RIGHT >= 1.82 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 1.82 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 5.4 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT < -11.5 ) { 
		if( MAX_DX2_RIGHT < 14795 ) { return new Prediction("TOP", 16, 0); }
	if( MAX_DX2_RIGHT >= 14795 ) { 
		if( MAX_DX2_LEFT >= 28492.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 28492.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6215.5 ) { 
	if( MAX_DX2_LEFT < 3560.5 ) { 
	if( AVG_AMP_RIGHT < 12.5 ) { 
	if( MAX_AMP_RIGHT < -655 ) { 
	if( FIRST_LEFT_DETECTION >= 511.5 ) { 
	if( DETECTION_DELTA >= 377.5 ) { 
	if( DX2_DELTA < 3303.5 ) { 
	if( AMP_DELTA < 2562 ) { 
		if( MAX_DX2_RIGHT < 2533 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_RIGHT >= 2533 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AMP_DELTA >= 2562 ) { return new Prediction("LEFT", 11, 0); }
	}
		if( DX2_DELTA >= 3303.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DETECTION_DELTA < 377.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 511.5 ) { return new Prediction("LEFT", 29, 0); }
	}
	if( MAX_AMP_RIGHT >= -655 ) { 
	if( AMP_DELTA >= 1882.5 ) { 
		if( DX2_DELTA >= 2836.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA < 2836.5 ) { return new Prediction("TOP", 11, 0); }
	}
	if( AMP_DELTA < 1882.5 ) { 
		if( DX2_DELTA >= 459.5 ) { return new Prediction("LEFT", 8, 0); }
		if( DX2_DELTA < 459.5 ) { return new Prediction("LEFT", 14, 5); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 12.5 ) { 
	if( DETECTION_DELTA < 11.5 ) { 
	if( AVG_DX2_RIGHT < -0.34 ) { 
		if( DX2_DELTA >= 3858.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( DX2_DELTA < 3858.5 ) { return new Prediction("LEFT", 22, 0); }
	}
	if( AVG_DX2_RIGHT >= -0.34 ) { 
		if( MAX_AMP_LEFT < 647.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_AMP_LEFT >= 647.5 ) { 
		if( MAX_DX2_RIGHT < 5230.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 5230.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 11.5 ) { return new Prediction("LEFT", 112, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3560.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
	if( AVG_DX2_RIGHT < 0.18 ) { 
		if( AVG_DX2_RIGHT < -1.23 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.23 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.18 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( MAX_AMP_LEFT >= 5649.5 ) { 
		if( MAX_AMP_RIGHT < 12476.5 ) { return new Prediction("TOP", 80, 0); }
	if( MAX_AMP_RIGHT >= 12476.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("TOP", 9, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
		if( MAX_DX2_LEFT < 6057.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 6057.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 5649.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AMP_DELTA >= 5403 ) { 
		if( FIRST_LEFT_DETECTION < 174.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 174.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA < 5403 ) { return new Prediction("TOP", 18, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_DX2_RIGHT >= 0.81 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT < 0.81 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree94() {
	if( MAX_DX2_LEFT < 3574.5 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( MAX_DX2_RIGHT >= 2436 ) { 
	if( AVG_DX2_LEFT >= 1.11 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("LEFT", 3, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_DX2_LEFT < 1.11 ) { 
	if( AVG_AMP_RIGHT < 5 ) { 
	if( MAX_AMP_LEFT < 3859 ) { 
		if( FIRST_RIGHT_DETECTION < 249 ) { return new Prediction("LEFT", 33, 0); }
	if( FIRST_RIGHT_DETECTION >= 249 ) { 
		if( FIRST_LEFT_DETECTION >= 494.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 494.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 3859 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AVG_AMP_RIGHT >= 5 ) { 
		if( FIRST_RIGHT_DETECTION < 250.5 ) { return new Prediction("LEFT", 101, 0); }
	if( FIRST_RIGHT_DETECTION >= 250.5 ) { 
		if( AMP_DELTA < 4638 ) { return new Prediction("LEFT", 10, 0); }
		if( AMP_DELTA >= 4638 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 2436 ) { 
	if( AMP_DELTA < 3016.5 ) { 
	if( FIRST_LEFT_DETECTION >= 245.5 ) { 
	if( DETECTION_DELTA < 399 ) { 
	if( FIRST_LEFT_DETECTION >= 464 ) { 
		if( FIRST_RIGHT_DETECTION < 472 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 472 ) { return new Prediction("LEFT", 16, 8); }
	}
		if( FIRST_LEFT_DETECTION < 464 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DETECTION_DELTA >= 399 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("TOP", 4, 0); }
	}
		if( AMP_DELTA >= 3016.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AMP_DELTA >= 6183.5 ) { 
	if( FIRST_RIGHT_DETECTION < 120.5 ) { 
		if( FIRST_LEFT_DETECTION >= 65 ) { return new Prediction("RIGHT", 5, 0); }
		if( FIRST_LEFT_DETECTION < 65 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 120.5 ) { 
		if( FIRST_LEFT_DETECTION >= 230 ) { return new Prediction("BOTTOM", 99, 0); }
	if( FIRST_LEFT_DETECTION < 230 ) { 
	if( FIRST_LEFT_DETECTION < 227.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( AMP_DELTA >= 6933.5 ) { return new Prediction("BOTTOM", 7, 0); }
		if( AMP_DELTA < 6933.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("BOTTOM", 47, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 227.5 ) { 
		if( MAX_AMP_LEFT < 2182.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_AMP_LEFT >= 2182.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3574.5 ) { 
	if( MAX_DX2_RIGHT >= 8260.5 ) { 
	if( MAX_AMP_RIGHT >= 12248.5 ) { 
	if( FIRST_LEFT_DETECTION < 149.5 ) { 
		if( AVG_AMP_LEFT < 36 ) { return new Prediction("RIGHT", 66, 0); }
		if( AVG_AMP_LEFT >= 36 ) { return new Prediction("TOP", 5, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 149.5 ) { 
	if( AVG_AMP_LEFT < 3 ) { 
		if( AVG_AMP_RIGHT < -4.5 ) { return new Prediction("BOTTOM", 11, 0); }
	if( AVG_AMP_RIGHT >= -4.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 5, 0); }
		if( DETECTION_DELTA < 6 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 3 ) { return new Prediction("RIGHT", 53, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 12248.5 ) { 
	if( MAX_AMP_RIGHT >= -15278 ) { 
	if( MAX_AMP_LEFT < 9620 ) { 
	if( MAX_AMP_LEFT < -6573.5 ) { 
		if( MAX_AMP_RIGHT >= -40 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_RIGHT < -40 ) { return new Prediction("TOP", 12, 0); }
	}
	if( MAX_AMP_LEFT >= -6573.5 ) { 
	if( MAX_AMP_LEFT >= 977 ) { 
		if( MAX_DX2_RIGHT < 11392.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( MAX_DX2_RIGHT >= 11392.5 ) { 
		if( AVG_AMP_RIGHT < 9.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_RIGHT >= 9.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT < 977 ) { 
		if( MAX_DX2_LEFT >= 6176 ) { return new Prediction("LEFT", 10, 0); }
	if( MAX_DX2_LEFT < 6176 ) { 
		if( MAX_AMP_LEFT < -4292 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -4292 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 9620 ) { return new Prediction("TOP", 22, 0); }
	}
	if( MAX_AMP_RIGHT < -15278 ) { 
		if( MAX_AMP_LEFT >= 7150.5 ) { return new Prediction("RIGHT", 49, 0); }
	if( MAX_AMP_LEFT < 7150.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( MAX_DX2_LEFT >= 17621 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 17621 ) { return new Prediction("RIGHT", 18, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
		if( AVG_AMP_LEFT >= 6.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_LEFT < 6.5 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 8260.5 ) { 
	if( MAX_DX2_LEFT < 5048.5 ) { 
		if( AMP_DELTA < 3397 ) { return new Prediction("TOP", 13, 0); }
	if( AMP_DELTA >= 3397 ) { 
		if( AVG_DX2_LEFT >= 1.51 ) { return new Prediction("TOP", 5, 0); }
	if( AVG_DX2_LEFT < 1.51 ) { 
		if( DX2_DELTA < 3117.5 ) { return new Prediction("LEFT", 8, 0); }
		if( DX2_DELTA >= 3117.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 5048.5 ) { 
		if( AVG_AMP_RIGHT < 27.5 ) { return new Prediction("TOP", 119, 0); }
	if( AVG_AMP_RIGHT >= 27.5 ) { 
		if( AVG_DX2_LEFT < -0.11 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT >= -0.11 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree95() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_DX2_RIGHT >= 7748.5 ) { 
	if( MAX_DX2_LEFT >= 10248 ) { 
	if( MAX_DX2_RIGHT >= 17988 ) { 
		if( FIRST_RIGHT_DETECTION >= 237.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_RIGHT_DETECTION < 237.5 ) { 
	if( MAX_AMP_LEFT >= -20863.5 ) { 
		if( AVG_AMP_LEFT >= -11 ) { return new Prediction("RIGHT", 53, 0); }
	if( AVG_AMP_LEFT < -11 ) { 
	if( AVG_DX2_RIGHT >= -0.76 ) { 
		if( AVG_DX2_RIGHT >= 4.12 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 4.12 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_DX2_RIGHT < -0.76 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( MAX_AMP_LEFT < -20863.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 17988 ) { 
		if( MAX_DX2_RIGHT < 12544 ) { return new Prediction("TOP", 25, 0); }
	if( MAX_DX2_RIGHT >= 12544 ) { 
	if( AVG_DX2_LEFT >= -1 ) { 
		if( FIRST_LEFT_DETECTION >= 121 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION < 121 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_DX2_LEFT < -1 ) { 
		if( AVG_DX2_RIGHT >= -0.25 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT < -0.25 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 10248 ) { 
	if( FIRST_LEFT_DETECTION < 269 ) { 
	if( MAX_AMP_LEFT >= 4434.5 ) { 
	if( MAX_AMP_RIGHT < 11156.5 ) { 
		if( AVG_DX2_LEFT >= -5.07 ) { return new Prediction("RIGHT", 33, 0); }
		if( AVG_DX2_LEFT < -5.07 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= 11156.5 ) { return new Prediction("RIGHT", 119, 0); }
	}
	if( MAX_AMP_LEFT < 4434.5 ) { 
	if( FIRST_LEFT_DETECTION >= 155.5 ) { 
		if( AMP_DELTA < 6698.5 ) { return new Prediction("LEFT", 9, 0); }
		if( AMP_DELTA >= 6698.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( FIRST_LEFT_DETECTION < 155.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 269 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 7748.5 ) { 
	if( MAX_DX2_LEFT >= 3650.5 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("RIGHT", 1, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 126, 0); }
	}
	if( MAX_DX2_LEFT < 3650.5 ) { 
	if( MAX_DX2_RIGHT < 5302.5 ) { 
		if( DX2_DELTA >= 1229.5 ) { return new Prediction("LEFT", 19, 0); }
	if( DX2_DELTA < 1229.5 ) { 
	if( AMP_DELTA < 4093 ) { 
		if( MAX_DX2_LEFT < 1088.5 ) { return new Prediction("LEFT", 15, 5); }
		if( MAX_DX2_LEFT >= 1088.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AMP_DELTA >= 4093 ) { 
		if( AVG_DX2_RIGHT < 0.99 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT >= 0.99 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5302.5 ) { 
		if( AVG_AMP_RIGHT >= 31.5 ) { return new Prediction("LEFT", 6, 0); }
	if( AVG_AMP_RIGHT < 31.5 ) { 
	if( AVG_DX2_LEFT < -0.5 ) { 
		if( MAX_DX2_RIGHT >= 7294.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 7294.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_DX2_LEFT >= -0.5 ) { 
	if( AVG_DX2_RIGHT < 3.41 ) { 
		if( FIRST_RIGHT_DETECTION < 220.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 220.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 3.41 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( DX2_DELTA < 2986.5 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( AMP_DELTA < 5364 ) { 
	if( MAX_DX2_LEFT >= 2126.5 ) { 
	if( AVG_AMP_LEFT >= 7 ) { 
		if( AVG_DX2_LEFT >= -2.53 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT < -2.53 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_LEFT < 7 ) { 
		if( MAX_DX2_LEFT >= 3138 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 3138 ) { 
		if( DETECTION_DELTA < 27.5 ) { return new Prediction("LEFT", 7, 0); }
		if( DETECTION_DELTA >= 27.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2126.5 ) { 
		if( FIRST_RIGHT_DETECTION < 249 ) { return new Prediction("LEFT", 21, 0); }
	if( FIRST_RIGHT_DETECTION >= 249 ) { 
		if( FIRST_RIGHT_DETECTION < 270.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 270.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
		if( AMP_DELTA >= 5364 ) { return new Prediction("BOTTOM", 17, 0); }
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
	if( MAX_DX2_LEFT < 3634 ) { 
		if( AVG_DX2_RIGHT < 2.68 ) { return new Prediction("LEFT", 90, 0); }
	if( AVG_DX2_RIGHT >= 2.68 ) { 
		if( MAX_AMP_LEFT >= 1135 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT < 1135 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3634 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( DX2_DELTA >= 2986.5 ) { 
	if( MAX_AMP_LEFT < 5538 ) { 
	if( MAX_AMP_LEFT >= -6799.5 ) { 
	if( MAX_DX2_RIGHT >= 3443 ) { 
	if( AVG_DX2_RIGHT >= -7.44 ) { 
		if( FIRST_RIGHT_DETECTION >= 123.5 ) { return new Prediction("BOTTOM", 153, 0); }
	if( FIRST_RIGHT_DETECTION < 123.5 ) { 
		if( AVG_DX2_LEFT >= 1.14 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 1.14 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT < -7.44 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_DX2_RIGHT < 3443 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( MAX_AMP_LEFT < -6799.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 5538 ) { return new Prediction("TOP", 14, 0); }
	}
	}
return null;
}
private Prediction runTree96() {
	if( MAX_DX2_LEFT < 3577 ) { 
	if( MAX_DX2_RIGHT >= 6005 ) { 
	if( FIRST_RIGHT_DETECTION >= 134.5 ) { 
		if( AVG_AMP_RIGHT >= 38 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_AMP_RIGHT < 38 ) { 
	if( AVG_AMP_RIGHT >= 30 ) { 
		if( FIRST_LEFT_DETECTION < 229 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 229 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < 30 ) { 
	if( MAX_AMP_LEFT >= 3076.5 ) { 
		if( DETECTION_DELTA >= 7 ) { return new Prediction("BOTTOM", 22, 0); }
	if( DETECTION_DELTA < 7 ) { 
		if( AVG_DX2_RIGHT >= -0.69 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < -0.69 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3076.5 ) { return new Prediction("BOTTOM", 66, 0); }
	}
	}
	}
	if( FIRST_RIGHT_DETECTION < 134.5 ) { 
		if( AVG_AMP_LEFT < -15 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT >= -15 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6005 ) { 
	if( AMP_DELTA < 6237.5 ) { 
	if( AMP_DELTA >= 354 ) { 
	if( DX2_DELTA < 3844.5 ) { 
	if( DX2_DELTA < 2126.5 ) { 
	if( DETECTION_DELTA >= 23 ) { 
		if( AVG_DX2_RIGHT >= -4.02 ) { return new Prediction("LEFT", 30, 0); }
		if( AVG_DX2_RIGHT < -4.02 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA < 23 ) { return new Prediction("LEFT", 114, 0); }
	}
	if( DX2_DELTA >= 2126.5 ) { 
		if( MAX_DX2_RIGHT < 1081.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_RIGHT >= 1081.5 ) { 
	if( AVG_AMP_RIGHT < -1 ) { 
		if( MAX_AMP_RIGHT < -4681.5 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_AMP_RIGHT >= -4681.5 ) { 
	if( MAX_AMP_RIGHT < -3863 ) { 
		if( MAX_DX2_RIGHT < 2884 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 2884 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -3863 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -1 ) { 
	if( AVG_DX2_RIGHT >= 2.85 ) { 
		if( AVG_DX2_RIGHT >= 3.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 3.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_RIGHT < 2.85 ) { 
		if( AMP_DELTA >= 5671 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 5671 ) { return new Prediction("LEFT", 48, 0); }
	}
	}
	}
	}
	}
		if( DX2_DELTA >= 3844.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( AMP_DELTA < 354 ) { 
		if( MAX_DX2_LEFT >= 2917.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_DX2_LEFT < 2917.5 ) { 
		if( AVG_DX2_RIGHT >= 0.59 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 0.59 ) { return new Prediction("LEFT", 12, 4); }
	}
	}
	}
		if( AMP_DELTA >= 6237.5 ) { return new Prediction("BOTTOM", 52, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3577 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( DX2_DELTA < 18264.5 ) { return new Prediction("RIGHT", 41, 0); }
		if( DX2_DELTA >= 18264.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( MAX_DX2_RIGHT < 8526 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
		if( AMP_DELTA < 3274 ) { return new Prediction("TOP", 6, 0); }
	if( AMP_DELTA >= 3274 ) { 
		if( AVG_DX2_LEFT >= 1.63 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 1.63 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 2.5 ) { return new Prediction("TOP", 129, 0); }
	}
	if( MAX_DX2_RIGHT >= 8526 ) { 
	if( AMP_DELTA < 9856.5 ) { 
	if( AVG_DX2_RIGHT >= 1.44 ) { 
		if( AVG_AMP_LEFT >= 7 ) { return new Prediction("RIGHT", 14, 0); }
	if( AVG_AMP_LEFT < 7 ) { 
		if( AMP_DELTA < 5952 ) { return new Prediction("LEFT", 5, 0); }
	if( AMP_DELTA >= 5952 ) { 
		if( AVG_DX2_LEFT >= 2.01 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 2.01 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < 1.44 ) { 
		if( FIRST_LEFT_DETECTION >= 193 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_LEFT_DETECTION < 193 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( AMP_DELTA >= 9856.5 ) { 
	if( MAX_AMP_LEFT < 5897 ) { 
		if( FIRST_LEFT_DETECTION < 134 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 134 ) { return new Prediction("BOTTOM", 32, 0); }
	}
		if( MAX_AMP_LEFT >= 5897 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
	if( MAX_DX2_RIGHT >= 7623 ) { 
	if( DX2_DELTA >= 2636 ) { 
	if( AMP_DELTA >= 7417 ) { 
	if( DX2_DELTA >= 14076.5 ) { 
	if( MAX_DX2_RIGHT < 24784.5 ) { 
		if( MAX_DX2_LEFT < 17922.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 17922.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_DX2_RIGHT >= 24784.5 ) { 
		if( AVG_AMP_LEFT >= -16.5 ) { return new Prediction("RIGHT", 15, 0); }
		if( AVG_AMP_LEFT < -16.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( DX2_DELTA < 14076.5 ) { 
	if( FIRST_RIGHT_DETECTION < 248.5 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
		if( MAX_AMP_LEFT >= 1239.5 ) { return new Prediction("RIGHT", 10, 0); }
		if( MAX_AMP_LEFT < 1239.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT >= -7.5 ) { return new Prediction("RIGHT", 102, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 248.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AMP_DELTA < 7417 ) { 
	if( AVG_DX2_LEFT < -0.19 ) { 
		if( MAX_DX2_RIGHT >= 9316.5 ) { return new Prediction("LEFT", 6, 0); }
	if( MAX_DX2_RIGHT < 9316.5 ) { 
		if( AVG_DX2_RIGHT < -1.23 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.23 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_DX2_LEFT >= -0.19 ) { 
	if( AVG_AMP_LEFT < 19.5 ) { 
		if( DX2_DELTA >= 5019.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA < 5019.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 19.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	if( DX2_DELTA < 2636 ) { 
		if( MAX_AMP_RIGHT < 13174 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_AMP_RIGHT >= 13174 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 7623 ) { 
		if( DX2_DELTA >= 913 ) { return new Prediction("TOP", 12, 0); }
	if( DX2_DELTA < 913 ) { 
		if( AVG_DX2_RIGHT < 0.11 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT >= 0.11 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree97() {
	if( MAX_AMP_RIGHT >= 11286 ) { 
	if( MAX_AMP_LEFT >= 4728.5 ) { 
		if( AMP_DELTA < 6090.5 ) { return new Prediction("TOP", 18, 0); }
	if( AMP_DELTA >= 6090.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( AVG_AMP_LEFT < 20.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( AVG_AMP_LEFT >= 20.5 ) { 
	if( AVG_DX2_RIGHT < 1.37 ) { 
		if( DX2_DELTA < 4734 ) { return new Prediction("RIGHT", 1, 0); }
		if( DX2_DELTA >= 4734 ) { return new Prediction("TOP", 4, 0); }
	}
		if( AVG_DX2_RIGHT >= 1.37 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 94, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4728.5 ) { 
	if( FIRST_LEFT_DETECTION >= 176 ) { 
		if( MAX_DX2_LEFT >= 19667.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 19667.5 ) { return new Prediction("BOTTOM", 51, 0); }
	}
	if( FIRST_LEFT_DETECTION < 176 ) { 
	if( DETECTION_DELTA < 8 ) { 
		if( AVG_DX2_RIGHT >= -0.09 ) { return new Prediction("RIGHT", 11, 0); }
	if( AVG_DX2_RIGHT < -0.09 ) { 
		if( FIRST_RIGHT_DETECTION < 97.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( FIRST_RIGHT_DETECTION >= 97.5 ) { 
		if( MAX_DX2_LEFT >= 15292.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 15292.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 11, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < 11286 ) { 
	if( AMP_DELTA >= 6215.5 ) { 
	if( MAX_DX2_RIGHT < 15680.5 ) { 
	if( MAX_DX2_LEFT < 5453 ) { 
		if( MAX_AMP_LEFT < -6294.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_AMP_LEFT >= -6294.5 ) { 
	if( MAX_AMP_LEFT >= 3910.5 ) { 
		if( FIRST_LEFT_DETECTION < 145.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 145.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( MAX_AMP_LEFT < 3910.5 ) { return new Prediction("BOTTOM", 124, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 5453 ) { 
	if( MAX_AMP_RIGHT >= -15278 ) { 
	if( AVG_AMP_RIGHT >= 24 ) { 
		if( FIRST_LEFT_DETECTION >= 200 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 200 ) { return new Prediction("TOP", 4, 0); }
	}
		if( AVG_AMP_RIGHT < 24 ) { return new Prediction("TOP", 75, 0); }
	}
	if( MAX_AMP_RIGHT < -15278 ) { 
		if( AVG_DX2_LEFT >= -1.14 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < -1.14 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 15680.5 ) { 
	if( MAX_DX2_LEFT < 33001.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_DX2_RIGHT < 8.64 ) { return new Prediction("RIGHT", 75, 0); }
		if( AVG_DX2_RIGHT >= 8.64 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 33001.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AMP_DELTA < 6215.5 ) { 
	if( MAX_AMP_LEFT < 5134 ) { 
	if( AMP_DELTA >= 4077.5 ) { 
	if( MAX_AMP_RIGHT < 125 ) { 
	if( MAX_AMP_RIGHT >= -4948 ) { 
		if( DX2_DELTA >= 2666.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DX2_DELTA < 2666.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_RIGHT < -4948 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("LEFT", 15, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 125 ) { 
	if( MAX_AMP_RIGHT >= 10323 ) { 
		if( DX2_DELTA >= 1569.5 ) { return new Prediction("LEFT", 6, 0); }
		if( DX2_DELTA < 1569.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT < 10323 ) { 
		if( FIRST_RIGHT_DETECTION < 166.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( FIRST_RIGHT_DETECTION >= 166.5 ) { 
		if( AVG_AMP_RIGHT >= 34.5 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_AMP_RIGHT < 34.5 ) { 
		if( MAX_DX2_LEFT >= 3036.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 3036.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 4077.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 287 ) { 
	if( MAX_AMP_LEFT >= -1853.5 ) { 
	if( AMP_DELTA < 2196.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 15, 6); }
	}
	if( AMP_DELTA >= 2196.5 ) { 
		if( FIRST_LEFT_DETECTION >= 446.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 446.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < -1853.5 ) { 
		if( MAX_DX2_RIGHT >= 2073.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 2073.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 287 ) { 
	if( MAX_DX2_LEFT < 3778.5 ) { 
	if( DETECTION_DELTA >= 23 ) { 
	if( FIRST_RIGHT_DETECTION >= 202.5 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
		if( FIRST_LEFT_DETECTION >= 257 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 257 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( MAX_AMP_LEFT >= 1946 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_LEFT < 1946 ) { 
	if( AVG_AMP_RIGHT >= -3.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 265.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 265.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_RIGHT < -3.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
		if( FIRST_RIGHT_DETECTION < 202.5 ) { return new Prediction("LEFT", 20, 0); }
	}
	if( DETECTION_DELTA < 23 ) { 
		if( AVG_DX2_LEFT < 0.73 ) { return new Prediction("LEFT", 104, 0); }
	if( AVG_DX2_LEFT >= 0.73 ) { 
		if( FIRST_LEFT_DETECTION >= 230 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 230 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3778.5 ) { 
		if( AVG_DX2_LEFT >= 0.97 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_LEFT < 0.97 ) { 
		if( MAX_DX2_RIGHT < 7950 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_RIGHT >= 7950 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5134 ) { 
		if( FIRST_LEFT_DETECTION >= 56 ) { return new Prediction("TOP", 83, 0); }
		if( FIRST_LEFT_DETECTION < 56 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree98() {
	if( AMP_DELTA >= 5572.5 ) { 
	if( FIRST_LEFT_DETECTION < 249 ) { 
	if( MAX_DX2_LEFT >= 3276.5 ) { 
	if( MAX_AMP_RIGHT >= 10548.5 ) { 
	if( AVG_DX2_RIGHT < 1.69 ) { 
		if( MAX_AMP_LEFT < -18997.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT >= -18997.5 ) { 
	if( MAX_DX2_RIGHT < 8550 ) { 
		if( AVG_DX2_LEFT < 1.2 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 1.2 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 8550 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( MAX_DX2_RIGHT >= 14851.5 ) { 
		if( MAX_DX2_RIGHT >= 21325 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 21325 ) { return new Prediction("RIGHT", 7, 0); }
	}
		if( MAX_DX2_RIGHT < 14851.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( MAX_DX2_LEFT < 28619 ) { return new Prediction("RIGHT", 63, 0); }
		if( MAX_DX2_LEFT >= 28619 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AVG_DX2_RIGHT >= 1.69 ) { 
	if( AVG_AMP_LEFT < 1 ) { 
		if( AVG_AMP_RIGHT < 6 ) { return new Prediction("BOTTOM", 12, 0); }
	if( AVG_AMP_RIGHT >= 6 ) { 
		if( MAX_AMP_LEFT >= 490 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT < 490 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 1 ) { return new Prediction("RIGHT", 45, 0); }
	}
	}
	if( MAX_AMP_RIGHT < 10548.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_AMP_LEFT < 8218 ) { 
		if( MAX_AMP_RIGHT < -13624.5 ) { return new Prediction("BOTTOM", 8, 0); }
	if( MAX_AMP_RIGHT >= -13624.5 ) { 
		if( FIRST_LEFT_DETECTION < 187 ) { return new Prediction("TOP", 14, 0); }
	if( FIRST_LEFT_DETECTION >= 187 ) { 
		if( AVG_AMP_RIGHT >= 10 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_AMP_RIGHT < 10 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 8218 ) { return new Prediction("TOP", 65, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_RIGHT < -14733 ) { 
		if( AVG_AMP_LEFT < -18 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT >= -18 ) { return new Prediction("RIGHT", 61, 0); }
	}
	if( MAX_AMP_RIGHT >= -14733 ) { 
		if( AVG_AMP_LEFT >= -3 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3276.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 114.5 ) { 
	if( DETECTION_DELTA < 8 ) { 
	if( AVG_DX2_RIGHT >= -1.69 ) { 
	if( MAX_AMP_LEFT < 3150 ) { 
		if( FIRST_LEFT_DETECTION < 224 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 224 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 3150 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( AVG_DX2_RIGHT < -1.69 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 83, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 114.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 249 ) { 
		if( AVG_AMP_RIGHT < 23 ) { return new Prediction("BOTTOM", 73, 0); }
		if( AVG_AMP_RIGHT >= 23 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA < 5572.5 ) { 
	if( MAX_AMP_LEFT < 5324.5 ) { 
	if( AVG_AMP_RIGHT >= 13.5 ) { 
	if( MAX_AMP_LEFT < 4429 ) { 
	if( MAX_DX2_RIGHT >= 6474 ) { 
		if( AMP_DELTA < 3796.5 ) { return new Prediction("LEFT", 3, 0); }
	if( AMP_DELTA >= 3796.5 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6474 ) { 
		if( AMP_DELTA < 4176 ) { return new Prediction("LEFT", 115, 0); }
	if( AMP_DELTA >= 4176 ) { 
		if( MAX_AMP_RIGHT >= -40 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < -40 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4429 ) { 
	if( AVG_DX2_RIGHT < 2.45 ) { 
		if( AVG_DX2_RIGHT >= -1.83 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < -1.83 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= 2.45 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 13.5 ) { 
	if( AVG_AMP_LEFT < 20.5 ) { 
		if( FIRST_RIGHT_DETECTION < 97.5 ) { return new Prediction("TOP", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 97.5 ) { 
	if( FIRST_LEFT_DETECTION >= 173 ) { 
	if( MAX_DX2_LEFT >= 4589 ) { 
		if( FIRST_LEFT_DETECTION >= 254 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 254 ) { return new Prediction("TOP", 7, 0); }
	}
	if( MAX_DX2_LEFT < 4589 ) { 
	if( MAX_DX2_RIGHT < 1009.5 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_LEFT < 2124.5 ) { 
		if( MAX_DX2_LEFT >= 1061.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 1061.5 ) { return new Prediction("LEFT", 21, 9); }
	}
	}
	if( MAX_DX2_RIGHT >= 1009.5 ) { 
	if( MAX_DX2_LEFT < 2401.5 ) { 
	if( MAX_DX2_RIGHT < 3279 ) { 
		if( DX2_DELTA < 2347 ) { return new Prediction("LEFT", 22, 0); }
	if( DX2_DELTA >= 2347 ) { 
		if( DETECTION_DELTA >= 419 ) { return new Prediction("LEFT", 7, 0); }
		if( DETECTION_DELTA < 419 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 3279 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( MAX_DX2_LEFT >= 2401.5 ) { 
		if( DX2_DELTA >= 1187.5 ) { return new Prediction("LEFT", 8, 0); }
	if( DX2_DELTA < 1187.5 ) { 
		if( AVG_DX2_RIGHT >= -0.97 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < -0.97 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 173 ) { return new Prediction("LEFT", 19, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 20.5 ) { 
		if( FIRST_LEFT_DETECTION >= 223.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 223.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5324.5 ) { return new Prediction("TOP", 97, 0); }
	}
return null;
}
private Prediction runTree99() {
	if( DETECTION_DELTA < 9.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_RIGHT < 11732 ) { 
	if( MAX_AMP_LEFT < 6805 ) { 
	if( AMP_DELTA >= 5329.5 ) { 
	if( MAX_DX2_LEFT < 8717 ) { 
	if( AMP_DELTA < 6223 ) { 
		if( MAX_DX2_RIGHT >= 5682 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT < 5682 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA >= 6223 ) { return new Prediction("RIGHT", 16, 0); }
	}
		if( MAX_DX2_LEFT >= 8717 ) { return new Prediction("TOP", 6, 0); }
	}
	if( AMP_DELTA < 5329.5 ) { 
	if( AVG_AMP_RIGHT >= 12 ) { 
		if( AVG_DX2_LEFT < 0.48 ) { return new Prediction("LEFT", 15, 0); }
		if( AVG_DX2_LEFT >= 0.48 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < 12 ) { 
	if( FIRST_LEFT_DETECTION < 179 ) { 
		if( FIRST_RIGHT_DETECTION >= 134.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 134.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 179 ) { 
		if( FIRST_RIGHT_DETECTION < 249 ) { return new Prediction("TOP", 10, 0); }
		if( FIRST_RIGHT_DETECTION >= 249 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 6805 ) { return new Prediction("TOP", 102, 0); }
	}
	if( MAX_DX2_RIGHT >= 11732 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
	if( AVG_DX2_LEFT < 3.13 ) { 
	if( MAX_AMP_RIGHT < -13788 ) { 
		if( FIRST_RIGHT_DETECTION < 142.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 142.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	if( MAX_AMP_RIGHT >= -13788 ) { 
		if( AVG_DX2_RIGHT >= 0.82 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_DX2_RIGHT < 0.82 ) { return new Prediction("TOP", 6, 0); }
	}
	}
		if( AVG_DX2_LEFT >= 3.13 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_LEFT >= 3829 ) { 
		if( AMP_DELTA < 4607 ) { return new Prediction("TOP", 17, 0); }
	if( AMP_DELTA >= 4607 ) { 
	if( AVG_DX2_RIGHT < 8.92 ) { 
		if( AVG_AMP_LEFT >= -8 ) { return new Prediction("RIGHT", 141, 0); }
	if( AVG_AMP_LEFT < -8 ) { 
		if( MAX_DX2_RIGHT < 29016 ) { return new Prediction("RIGHT", 14, 0); }
	if( MAX_DX2_RIGHT >= 29016 ) { 
		if( AVG_DX2_LEFT < -0.76 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.76 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 8.92 ) { 
		if( MAX_DX2_LEFT >= 10376.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 10376.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 3829 ) { 
	if( MAX_DX2_LEFT < 7241.5 ) { 
	if( FIRST_RIGHT_DETECTION < 197.5 ) { 
	if( MAX_AMP_LEFT >= -2863.5 ) { 
		if( AVG_DX2_RIGHT < 1.97 ) { return new Prediction("LEFT", 8, 0); }
		if( AVG_DX2_RIGHT >= 1.97 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT < -2863.5 ) { return new Prediction("LEFT", 23, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 197.5 ) { 
	if( DETECTION_DELTA < 2.5 ) { 
	if( AVG_DX2_RIGHT >= -0.15 ) { 
	if( AVG_DX2_LEFT < 0.26 ) { 
		if( FIRST_LEFT_DETECTION < 457.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 457.5 ) { return new Prediction("LEFT", 10, 4); }
	}
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_RIGHT < -0.15 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( DETECTION_DELTA >= 2.5 ) { 
		if( MAX_DX2_LEFT < 2869.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_LEFT >= 2869.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 7241.5 ) { 
	if( AMP_DELTA >= 3294 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 17, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
		if( FIRST_RIGHT_DETECTION < 146.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 146.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( AMP_DELTA < 3294 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_AMP_RIGHT < 9831.5 ) { 
	if( AMP_DELTA < 6183.5 ) { 
	if( MAX_DX2_LEFT < 3634 ) { 
	if( AVG_AMP_RIGHT < 0.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 484 ) { 
		if( MAX_DX2_LEFT >= 2124.5 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_LEFT < 2124.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 484 ) { 
		if( AMP_DELTA < 780 ) { return new Prediction("TOP", 2, 0); }
		if( AMP_DELTA >= 780 ) { return new Prediction("LEFT", 26, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 0.5 ) { 
	if( AMP_DELTA >= 4355.5 ) { 
		if( MAX_AMP_LEFT < 956 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= 956 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA < 4355.5 ) { return new Prediction("LEFT", 111, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3634 ) { return new Prediction("TOP", 19, 0); }
	}
	if( AMP_DELTA >= 6183.5 ) { 
	if( MAX_DX2_LEFT >= 3971.5 ) { 
	if( MAX_AMP_LEFT < 5435 ) { 
		if( MAX_AMP_RIGHT >= -10121 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_RIGHT < -10121 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 5435 ) { return new Prediction("TOP", 7, 0); }
	}
	if( MAX_DX2_LEFT < 3971.5 ) { 
		if( FIRST_LEFT_DETECTION < 97 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 97 ) { return new Prediction("BOTTOM", 85, 0); }
	}
	}
	}
		if( MAX_AMP_RIGHT >= 9831.5 ) { return new Prediction("BOTTOM", 92, 0); }
	}
return null;
}
}

