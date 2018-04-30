package com.university.rahim.uitms.Microphone_Module.Classifier;

import java.util.List;

public class ModelMicRandomForest extends RandomForest {

public double MAX_DX2_RIGHT;
public double DX2_DELTA;
public double MAX_AMP_LEFT;
public double AVG_AMP_LEFT;
public double MAX_DX2_LEFT;
public double AVG_AMP_RIGHT;
public double DETECTION_DELTA;
public double FIRST_RIGHT_DETECTION;
public double MAX_AMP_RIGHT;
public double AMP_DELTA;
public double AVG_DX2_LEFT;
public double AVG_DX2_RIGHT;
public double FIRST_LEFT_DETECTION;

public String toString() {
StringBuilder b = new StringBuilder();
b.append("MyClass: ");
b.append(MyClass);
b.append(", MAX_DX2_RIGHT: ");
b.append(MAX_DX2_RIGHT);
b.append(", DX2_DELTA: ");
b.append(DX2_DELTA);
b.append(", MAX_AMP_LEFT: ");
b.append(MAX_AMP_LEFT);
b.append(", AVG_AMP_LEFT: ");
b.append(AVG_AMP_LEFT);
b.append(", MAX_DX2_LEFT: ");
b.append(MAX_DX2_LEFT);
b.append(", AVG_AMP_RIGHT: ");
b.append(AVG_AMP_RIGHT);
b.append(", DETECTION_DELTA: ");
b.append(DETECTION_DELTA);
b.append(", FIRST_RIGHT_DETECTION: ");
b.append(FIRST_RIGHT_DETECTION);
b.append(", MAX_AMP_RIGHT: ");
b.append(MAX_AMP_RIGHT);
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
	if( MAX_DX2_LEFT >= 2684 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( MAX_DX2_LEFT < 5329 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( MAX_DX2_RIGHT < 5932 ) { 
		if( FIRST_RIGHT_DETECTION < 122.5 ) { return new Prediction("LEFT", 3, 0); }
	if( FIRST_RIGHT_DETECTION >= 122.5 ) { 
	if( MAX_AMP_RIGHT < -11728.5 ) { 
		if( MAX_DX2_RIGHT < 5299 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 5299 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -11728.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 5932 ) { return new Prediction("BOTTOM", 123, 0); }
	}
	if( DETECTION_DELTA < 4.5 ) { 
		if( MAX_AMP_LEFT >= 6381 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 6381 ) { 
		if( AVG_AMP_LEFT >= 6 ) { return new Prediction("BOTTOM", 8, 0); }
		if( AVG_AMP_LEFT < 6 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 5329 ) { 
	if( AMP_DELTA < 13232 ) { 
		if( DETECTION_DELTA >= 73.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( DETECTION_DELTA < 73.5 ) { 
	if( MAX_DX2_RIGHT >= 10893 ) { 
		if( AVG_DX2_RIGHT < 0.55 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT >= 0.55 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 10893 ) { return new Prediction("TOP", 147, 0); }
	}
	}
	if( AMP_DELTA >= 13232 ) { 
	if( FIRST_RIGHT_DETECTION >= 144 ) { 
		if( AVG_AMP_RIGHT < 16 ) { return new Prediction("BOTTOM", 9, 0); }
		if( AVG_AMP_RIGHT >= 16 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 144 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( AVG_AMP_RIGHT < -13.5 ) { 
	if( DETECTION_DELTA >= 7 ) { 
		if( MAX_DX2_RIGHT < 6083.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_RIGHT >= 6083.5 ) { return new Prediction("BOTTOM", 25, 0); }
	}
	if( DETECTION_DELTA < 7 ) { 
	if( MAX_AMP_LEFT < 2784.5 ) { 
		if( AVG_DX2_LEFT < -1.18 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.18 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 2784.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -13.5 ) { 
	if( MAX_AMP_RIGHT >= -18643 ) { 
		if( AMP_DELTA < 6189 ) { return new Prediction("TOP", 25, 0); }
		if( AMP_DELTA >= 6189 ) { return new Prediction("RIGHT", 71, 0); }
	}
		if( MAX_AMP_RIGHT < -18643 ) { return new Prediction("RIGHT", 45, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2684 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_DX2_LEFT >= 1764 ) { 
	if( AMP_DELTA >= 7940 ) { 
		if( MAX_AMP_LEFT < 2183 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= 2183 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	if( AMP_DELTA < 7940 ) { 
	if( MAX_DX2_RIGHT >= 3169 ) { 
	if( FIRST_LEFT_DETECTION >= 230 ) { 
		if( MAX_DX2_LEFT < 2403.5 ) { return new Prediction("LEFT", 12, 0); }
	if( MAX_DX2_LEFT >= 2403.5 ) { 
	if( MAX_DX2_LEFT >= 2525.5 ) { 
		if( MAX_DX2_LEFT < 2571.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 2571.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 2525.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 230 ) { return new Prediction("LEFT", 38, 0); }
	}
	if( MAX_DX2_RIGHT < 3169 ) { 
		if( MAX_AMP_RIGHT >= -6332.5 ) { return new Prediction("LEFT", 12, 0); }
	if( MAX_AMP_RIGHT < -6332.5 ) { 
	if( MAX_AMP_LEFT < 3737.5 ) { 
		if( MAX_AMP_RIGHT >= -8076.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_RIGHT < -8076.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 3737.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	}
		if( MAX_DX2_LEFT < 1764 ) { return new Prediction("LEFT", 52, 0); }
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( AMP_DELTA >= 5705.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AMP_DELTA >= 6861 ) { return new Prediction("RIGHT", 8, 0); }
		if( AMP_DELTA < 6861 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
		if( DX2_DELTA >= 5406 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 5406 ) { return new Prediction("RIGHT", 65, 0); }
	}
	}
	if( AMP_DELTA < 5705.5 ) { 
	if( MAX_AMP_RIGHT < -7530.5 ) { 
		if( MAX_DX2_LEFT < 1844 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT >= 1844 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_AMP_RIGHT >= -7530.5 ) { return new Prediction("LEFT", 61, 0); }
	}
	}
	}
return null;
}
private Prediction runTree1() {
	if( DX2_DELTA < 3325 ) { 
	if( MAX_AMP_RIGHT < -10882.5 ) { 
	if( MAX_AMP_LEFT < 7131.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( DETECTION_DELTA < 13.5 ) { 
		if( MAX_DX2_LEFT < 5252 ) { return new Prediction("RIGHT", 105, 0); }
	if( MAX_DX2_LEFT >= 5252 ) { 
		if( AVG_DX2_LEFT < 1.42 ) { return new Prediction("RIGHT", 8, 0); }
		if( AVG_DX2_LEFT >= 1.42 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( DETECTION_DELTA >= 13.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( MAX_DX2_RIGHT < 4759.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 4759.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 7131.5 ) { 
		if( FIRST_RIGHT_DETECTION < 250 ) { return new Prediction("TOP", 53, 0); }
	if( FIRST_RIGHT_DETECTION >= 250 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -10882.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 105, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( AMP_DELTA < 6805.5 ) { 
	if( MAX_DX2_LEFT >= 2214.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_AMP_RIGHT < -3 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_AMP_RIGHT >= -3 ) { 
		if( AVG_DX2_RIGHT >= 2.48 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_RIGHT < 2.48 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( FIRST_LEFT_DETECTION < 106 ) { 
		if( FIRST_RIGHT_DETECTION >= 86.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 86.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 106 ) { 
	if( MAX_AMP_LEFT < 4599 ) { 
		if( AMP_DELTA >= 2494 ) { return new Prediction("LEFT", 2, 0); }
		if( AMP_DELTA < 2494 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 4599 ) { return new Prediction("TOP", 36, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2214.5 ) { 
	if( AVG_DX2_RIGHT < -0.35 ) { 
	if( FIRST_LEFT_DETECTION < 206 ) { 
		if( AVG_DX2_RIGHT < -0.79 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT >= -0.79 ) { return new Prediction("TOP", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 206 ) { 
		if( MAX_DX2_LEFT >= 1854 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1854 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -0.35 ) { 
	if( MAX_AMP_LEFT < 4451 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 67, 0); }
	if( AVG_AMP_RIGHT < -25.5 ) { 
		if( FIRST_RIGHT_DETECTION < 190.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 190.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4451 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6805.5 ) { 
		if( AVG_AMP_RIGHT >= -10.5 ) { return new Prediction("RIGHT", 33, 0); }
		if( AVG_AMP_RIGHT < -10.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 3325 ) { 
	if( AVG_AMP_LEFT >= -9.5 ) { 
	if( MAX_DX2_RIGHT >= 8187 ) { 
	if( DX2_DELTA < 6041 ) { 
	if( AMP_DELTA >= 5734 ) { 
		if( MAX_AMP_LEFT < -4311.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_LEFT >= -4311.5 ) { return new Prediction("BOTTOM", 44, 0); }
	}
	if( AMP_DELTA < 5734 ) { 
		if( MAX_DX2_LEFT >= 9779.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT < 9779.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( DX2_DELTA >= 6041 ) { 
		if( MAX_DX2_LEFT >= 14592.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_LEFT < 14592.5 ) { return new Prediction("BOTTOM", 106, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 8187 ) { 
	if( DX2_DELTA < 5474 ) { 
	if( MAX_DX2_LEFT < 5731 ) { 
	if( AMP_DELTA >= 7726 ) { 
	if( MAX_DX2_RIGHT < 6195.5 ) { 
		if( FIRST_LEFT_DETECTION >= 204.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION < 204.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_DX2_RIGHT >= 6195.5 ) { return new Prediction("BOTTOM", 34, 0); }
	}
	if( AMP_DELTA < 7726 ) { 
		if( AVG_DX2_RIGHT < -5.62 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= -5.62 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 5731 ) { return new Prediction("TOP", 19, 0); }
	}
	if( DX2_DELTA >= 5474 ) { 
		if( FIRST_RIGHT_DETECTION >= 90.5 ) { return new Prediction("TOP", 33, 0); }
		if( FIRST_RIGHT_DETECTION < 90.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -9.5 ) { 
		if( AMP_DELTA < 8336.5 ) { return new Prediction("TOP", 22, 0); }
	if( AMP_DELTA >= 8336.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( AVG_DX2_LEFT >= -0.81 ) { return new Prediction("RIGHT", 50, 0); }
	if( AVG_DX2_LEFT < -0.81 ) { 
		if( AVG_DX2_LEFT >= -0.88 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < -0.88 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
return null;
}
private Prediction runTree2() {
	if( MAX_DX2_RIGHT < 5549.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_AMP_RIGHT < -7994 ) { 
	if( AVG_AMP_RIGHT >= -27.5 ) { 
	if( DETECTION_DELTA < 16 ) { 
	if( MAX_AMP_LEFT < 5929.5 ) { 
	if( MAX_DX2_RIGHT >= 3027.5 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("LEFT", 44, 0); }
	if( AVG_AMP_LEFT < 7.5 ) { 
		if( MAX_AMP_RIGHT < -11243.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_RIGHT >= -11243.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 3027.5 ) { 
		if( AVG_DX2_LEFT < -0.38 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.38 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 5929.5 ) { return new Prediction("TOP", 24, 0); }
	}
	if( DETECTION_DELTA >= 16 ) { 
		if( MAX_DX2_LEFT >= 4985 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 4985 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -27.5 ) { 
		if( MAX_AMP_LEFT >= 5565.5 ) { return new Prediction("TOP", 18, 0); }
	if( MAX_AMP_LEFT < 5565.5 ) { 
		if( MAX_AMP_LEFT >= -4368 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_LEFT < -4368 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -7994 ) { 
		if( DETECTION_DELTA >= 12.5 ) { return new Prediction("LEFT", 59, 0); }
	if( DETECTION_DELTA < 12.5 ) { 
	if( MAX_DX2_LEFT >= 2071 ) { 
	if( FIRST_LEFT_DETECTION < 188.5 ) { 
		if( AVG_DX2_LEFT >= -2.22 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < -2.22 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 188.5 ) { return new Prediction("TOP", 8, 0); }
	}
	if( MAX_DX2_LEFT < 2071 ) { 
		if( MAX_AMP_LEFT < 4171 ) { return new Prediction("LEFT", 19, 0); }
		if( MAX_AMP_LEFT >= 4171 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( DETECTION_DELTA < 16 ) { 
	if( MAX_AMP_LEFT >= 5805 ) { 
		if( FIRST_LEFT_DETECTION < 214.5 ) { return new Prediction("TOP", 21, 0); }
		if( FIRST_LEFT_DETECTION >= 214.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 5805 ) { 
	if( AMP_DELTA >= 5964 ) { 
		if( DX2_DELTA >= 14180 ) { return new Prediction("TOP", 3, 0); }
		if( DX2_DELTA < 14180 ) { return new Prediction("RIGHT", 92, 0); }
	}
	if( AMP_DELTA < 5964 ) { 
	if( AMP_DELTA >= 3949 ) { 
		if( AMP_DELTA < 5593 ) { return new Prediction("RIGHT", 2, 0); }
		if( AMP_DELTA >= 5593 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AMP_DELTA < 3949 ) { return new Prediction("LEFT", 10, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 16 ) { 
	if( AVG_AMP_RIGHT < -29 ) { 
		if( FIRST_RIGHT_DETECTION >= 181 ) { return new Prediction("BOTTOM", 4, 0); }
		if( FIRST_RIGHT_DETECTION < 181 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -29 ) { 
		if( MAX_AMP_LEFT >= 4480.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 4480.5 ) { return new Prediction("LEFT", 50, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5549.5 ) { 
	if( MAX_DX2_LEFT < 6767 ) { 
	if( DX2_DELTA >= 3431.5 ) { 
	if( AVG_AMP_RIGHT < -3 ) { 
	if( FIRST_LEFT_DETECTION >= 31 ) { 
		if( AVG_AMP_RIGHT < -8 ) { return new Prediction("BOTTOM", 162, 0); }
	if( AVG_AMP_RIGHT >= -8 ) { 
		if( MAX_DX2_RIGHT >= 7889.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT < 7889.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 31 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_RIGHT >= -3 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
		if( MAX_DX2_LEFT < 2014.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 2014.5 ) { return new Prediction("BOTTOM", 19, 0); }
	}
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( DX2_DELTA >= 7504 ) { return new Prediction("BOTTOM", 2, 0); }
	if( DX2_DELTA < 7504 ) { 
	if( MAX_DX2_RIGHT < 7363 ) { 
		if( MAX_DX2_RIGHT >= 7311.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 7311.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_DX2_RIGHT >= 7363 ) { return new Prediction("RIGHT", 40, 0); }
	}
	}
	}
	}
	if( DX2_DELTA < 3431.5 ) { 
	if( AMP_DELTA >= 6573.5 ) { 
		if( MAX_DX2_LEFT < 5252 ) { return new Prediction("RIGHT", 38, 0); }
	if( MAX_DX2_LEFT >= 5252 ) { 
		if( AVG_DX2_RIGHT >= -0.69 ) { return new Prediction("RIGHT", 6, 0); }
		if( AVG_DX2_RIGHT < -0.69 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AMP_DELTA < 6573.5 ) { 
		if( MAX_AMP_LEFT >= 7145 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_LEFT < 7145 ) { 
		if( AVG_DX2_LEFT < 0.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 6767 ) { 
	if( MAX_DX2_LEFT >= 11109.5 ) { 
		if( AMP_DELTA >= 12763.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AMP_DELTA < 12763.5 ) { return new Prediction("TOP", 65, 0); }
	}
	if( MAX_DX2_LEFT < 11109.5 ) { 
	if( AVG_AMP_RIGHT < 6 ) { 
		if( DX2_DELTA < 3095.5 ) { return new Prediction("TOP", 33, 0); }
	if( DX2_DELTA >= 3095.5 ) { 
		if( AVG_DX2_LEFT < -1.69 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT >= -1.69 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 6 ) { 
		if( MAX_DX2_RIGHT < 8226 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_RIGHT >= 8226 ) { return new Prediction("RIGHT", 12, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree3() {
	if( AMP_DELTA < 7216 ) { 
	if( MAX_AMP_RIGHT < -10296 ) { 
	if( AVG_DX2_RIGHT >= 2.79 ) { 
	if( MAX_DX2_LEFT >= 2860.5 ) { 
	if( AVG_DX2_LEFT < -1.93 ) { 
		if( AVG_DX2_LEFT >= -2.16 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -2.16 ) { return new Prediction("TOP", 4, 0); }
	}
		if( AVG_DX2_LEFT >= -1.93 ) { return new Prediction("TOP", 18, 0); }
	}
		if( MAX_DX2_LEFT < 2860.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( AVG_DX2_RIGHT < 2.79 ) { 
		if( MAX_DX2_LEFT >= 4342.5 ) { return new Prediction("TOP", 148, 0); }
	if( MAX_DX2_LEFT < 4342.5 ) { 
		if( MAX_DX2_LEFT < 2632 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_DX2_LEFT >= 2632 ) { 
		if( FIRST_LEFT_DETECTION >= 133 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION < 133 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= -10296 ) { 
	if( AMP_DELTA < 3753 ) { 
	if( MAX_DX2_LEFT < 2943 ) { 
	if( DETECTION_DELTA < 16.5 ) { 
	if( DX2_DELTA < 460.5 ) { 
		if( AVG_DX2_RIGHT < -0.35 ) { return new Prediction("TOP", 9, 0); }
		if( AVG_DX2_RIGHT >= -0.35 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( DX2_DELTA >= 460.5 ) { 
		if( DX2_DELTA >= 913 ) { return new Prediction("LEFT", 25, 0); }
	if( DX2_DELTA < 913 ) { 
		if( MAX_AMP_LEFT < 3938 ) { return new Prediction("LEFT", 13, 0); }
		if( MAX_AMP_LEFT >= 3938 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 16.5 ) { return new Prediction("LEFT", 95, 0); }
	}
		if( MAX_DX2_LEFT >= 2943 ) { return new Prediction("TOP", 17, 0); }
	}
	if( AMP_DELTA >= 3753 ) { 
	if( AVG_AMP_RIGHT < 7.5 ) { 
	if( MAX_DX2_LEFT < 2364.5 ) { 
	if( MAX_AMP_LEFT < 4574 ) { 
		if( MAX_AMP_LEFT >= 2365 ) { return new Prediction("LEFT", 26, 0); }
	if( MAX_AMP_LEFT < 2365 ) { 
		if( FIRST_LEFT_DETECTION < 135.5 ) { return new Prediction("RIGHT", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 135.5 ) { 
		if( DX2_DELTA >= 2506.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 2506.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 4574 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 2364.5 ) { 
	if( FIRST_LEFT_DETECTION >= 203 ) { 
		if( MAX_DX2_LEFT < 5833.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 5833.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 203 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 7.5 ) { 
	if( DX2_DELTA >= 1274.5 ) { 
		if( AVG_AMP_LEFT >= 3.5 ) { return new Prediction("LEFT", 7, 0); }
	if( AVG_AMP_LEFT < 3.5 ) { 
		if( AVG_AMP_RIGHT < 20 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_AMP_RIGHT >= 20 ) { 
		if( AVG_AMP_RIGHT < 34 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_AMP_RIGHT >= 34 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( DX2_DELTA < 1274.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 7216 ) { 
	if( AVG_AMP_RIGHT >= -13 ) { 
	if( DX2_DELTA < 4393.5 ) { 
	if( AVG_AMP_LEFT < 9.5 ) { 
		if( MAX_DX2_LEFT < 5252 ) { return new Prediction("RIGHT", 127, 0); }
	if( MAX_DX2_LEFT >= 5252 ) { 
		if( AVG_DX2_RIGHT < -4.58 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.58 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 9.5 ) { 
		if( AVG_DX2_LEFT >= 0.09 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_DX2_LEFT < 0.09 ) { 
		if( FIRST_RIGHT_DETECTION >= 206 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 206 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( DX2_DELTA >= 4393.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( DX2_DELTA >= 5778 ) { 
		if( FIRST_LEFT_DETECTION < 166 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 166 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( DX2_DELTA < 5778 ) { return new Prediction("RIGHT", 19, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( AVG_AMP_LEFT < 30.5 ) { return new Prediction("BOTTOM", 25, 0); }
	if( AVG_AMP_LEFT >= 30.5 ) { 
		if( FIRST_RIGHT_DETECTION < 129 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 129 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < -13 ) { 
		if( DX2_DELTA >= 13049 ) { return new Prediction("TOP", 5, 0); }
	if( DX2_DELTA < 13049 ) { 
	if( AMP_DELTA >= 9028 ) { 
	if( MAX_AMP_LEFT < -4460 ) { 
		if( AVG_DX2_LEFT >= -1.03 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_DX2_LEFT < -1.03 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT >= -4460 ) { return new Prediction("BOTTOM", 157, 0); }
	}
	if( AMP_DELTA < 9028 ) { 
	if( MAX_DX2_LEFT < 5462 ) { 
		if( AVG_DX2_RIGHT < 4.09 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_DX2_RIGHT >= 4.09 ) { 
		if( MAX_AMP_LEFT < 1206 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT >= 1206 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 5462 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree4() {
	if( MAX_AMP_LEFT < 6200.5 ) { 
	if( MAX_DX2_LEFT >= 3001.5 ) { 
	if( AVG_AMP_RIGHT < -14.5 ) { 
	if( MAX_DX2_RIGHT < 7204 ) { 
		if( MAX_AMP_RIGHT >= -13584 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_RIGHT < -13584 ) { 
		if( DX2_DELTA < 7024 ) { return new Prediction("BOTTOM", 6, 0); }
		if( DX2_DELTA >= 7024 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 7204 ) { return new Prediction("BOTTOM", 99, 0); }
	}
	if( AVG_AMP_RIGHT >= -14.5 ) { 
	if( MAX_DX2_RIGHT >= 9103 ) { 
		if( AVG_AMP_LEFT < -7.5 ) { return new Prediction("RIGHT", 9, 0); }
	if( AVG_AMP_LEFT >= -7.5 ) { 
		if( MAX_DX2_LEFT < 5654 ) { return new Prediction("BOTTOM", 26, 0); }
	if( MAX_DX2_LEFT >= 5654 ) { 
		if( FIRST_RIGHT_DETECTION >= 189.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 189.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 9103 ) { 
	if( AVG_AMP_RIGHT < 24.5 ) { 
		if( AVG_AMP_LEFT < -15.5 ) { return new Prediction("RIGHT", 19, 0); }
	if( AVG_AMP_LEFT >= -15.5 ) { 
	if( MAX_AMP_LEFT < 3733 ) { 
		if( MAX_DX2_LEFT >= 4088.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT < 4088.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 3733 ) { 
		if( FIRST_RIGHT_DETECTION >= 233 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 233 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
		if( AVG_AMP_RIGHT >= 24.5 ) { return new Prediction("RIGHT", 43, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3001.5 ) { 
	if( AVG_AMP_RIGHT >= 2 ) { 
	if( FIRST_RIGHT_DETECTION >= 111 ) { 
		if( AVG_DX2_RIGHT < -2.78 ) { return new Prediction("RIGHT", 37, 0); }
	if( AVG_DX2_RIGHT >= -2.78 ) { 
	if( MAX_AMP_RIGHT < -11969.5 ) { 
		if( AVG_DX2_LEFT < -1.85 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_LEFT >= -1.85 ) { 
		if( AVG_AMP_LEFT < 5.5 ) { return new Prediction("RIGHT", 28, 0); }
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -11969.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( DX2_DELTA < 612 ) { return new Prediction("LEFT", 4, 0); }
	if( DX2_DELTA >= 612 ) { 
	if( DX2_DELTA >= 2204.5 ) { 
	if( MAX_AMP_RIGHT < -6872.5 ) { 
		if( DX2_DELTA >= 2338.5 ) { return new Prediction("RIGHT", 10, 0); }
		if( DX2_DELTA < 2338.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -6872.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA < 2204.5 ) { return new Prediction("RIGHT", 20, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( MAX_AMP_RIGHT >= -6719.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < -6719.5 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	}
	}
		if( FIRST_RIGHT_DETECTION < 111 ) { return new Prediction("LEFT", 19, 0); }
	}
	if( AVG_AMP_RIGHT < 2 ) { 
	if( AMP_DELTA >= 7940 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( FIRST_LEFT_DETECTION < 242 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 242 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 37, 0); }
	}
	if( AMP_DELTA < 7940 ) { 
	if( MAX_AMP_RIGHT < -8552 ) { 
	if( DX2_DELTA < 1269 ) { 
		if( MAX_AMP_LEFT >= 1782.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT < 1782.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( DX2_DELTA >= 1269 ) { 
		if( FIRST_RIGHT_DETECTION >= 163 ) { return new Prediction("LEFT", 23, 0); }
	if( FIRST_RIGHT_DETECTION < 163 ) { 
		if( FIRST_LEFT_DETECTION >= 147 ) { return new Prediction("RIGHT", 2, 0); }
	if( FIRST_LEFT_DETECTION < 147 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= -8552 ) { 
		if( MAX_AMP_LEFT < 3915 ) { return new Prediction("LEFT", 119, 0); }
	if( MAX_AMP_LEFT >= 3915 ) { 
		if( DX2_DELTA < 1409.5 ) { return new Prediction("TOP", 4, 0); }
		if( DX2_DELTA >= 1409.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6200.5 ) { 
	if( AVG_AMP_LEFT < -12.5 ) { 
	if( MAX_DX2_RIGHT < 8072 ) { 
		if( AMP_DELTA < 10071 ) { return new Prediction("TOP", 28, 0); }
		if( AMP_DELTA >= 10071 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 8072 ) { 
		if( AVG_AMP_RIGHT >= -10.5 ) { return new Prediction("RIGHT", 16, 0); }
		if( AVG_AMP_RIGHT < -10.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -12.5 ) { 
	if( MAX_AMP_LEFT < 11431 ) { 
	if( AMP_DELTA >= 8250.5 ) { 
		if( AVG_AMP_RIGHT < 28.5 ) { return new Prediction("BOTTOM", 22, 0); }
		if( AVG_AMP_RIGHT >= 28.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA < 8250.5 ) { 
		if( AMP_DELTA < 5172.5 ) { return new Prediction("TOP", 60, 0); }
	if( AMP_DELTA >= 5172.5 ) { 
		if( DX2_DELTA >= 2267.5 ) { return new Prediction("LEFT", 3, 0); }
		if( DX2_DELTA < 2267.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 11431 ) { return new Prediction("TOP", 109, 0); }
	}
	}
return null;
}
private Prediction runTree5() {
	if( MAX_AMP_LEFT >= 6144.5 ) { 
	if( MAX_AMP_RIGHT < -19874 ) { 
	if( MAX_AMP_LEFT < 11846.5 ) { 
	if( DX2_DELTA < 7521.5 ) { 
	if( FIRST_LEFT_DETECTION >= 157 ) { 
		if( MAX_AMP_RIGHT < -23792.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT >= -23792.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 157 ) { return new Prediction("RIGHT", 15, 0); }
	}
		if( DX2_DELTA >= 7521.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
		if( MAX_AMP_LEFT >= 11846.5 ) { return new Prediction("TOP", 20, 0); }
	}
	if( MAX_AMP_RIGHT >= -19874 ) { 
	if( MAX_DX2_RIGHT >= 11915 ) { 
		if( AVG_DX2_RIGHT < 1.35 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT >= 1.35 ) { 
		if( AVG_DX2_RIGHT >= 6.21 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 6.21 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 11915 ) { 
	if( MAX_AMP_LEFT >= 7131 ) { 
		if( AVG_AMP_LEFT >= -30 ) { return new Prediction("TOP", 150, 0); }
	if( AVG_AMP_LEFT < -30 ) { 
	if( FIRST_LEFT_DETECTION >= 156 ) { 
		if( AVG_DX2_LEFT < 1.84 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 1.84 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 156 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	if( MAX_AMP_LEFT < 7131 ) { 
	if( MAX_DX2_RIGHT >= 5637 ) { 
		if( AVG_DX2_LEFT < 2.33 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT >= 2.33 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 5637 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 6144.5 ) { 
	if( MAX_DX2_RIGHT < 5711 ) { 
	if( MAX_DX2_LEFT < 2251.5 ) { 
	if( AVG_AMP_RIGHT < 2.5 ) { 
	if( MAX_AMP_LEFT >= 4643 ) { 
		if( FIRST_LEFT_DETECTION < 227.5 ) { return new Prediction("TOP", 5, 0); }
		if( FIRST_LEFT_DETECTION >= 227.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 4643 ) { 
	if( AMP_DELTA >= 6987.5 ) { 
		if( DX2_DELTA < 2008 ) { return new Prediction("RIGHT", 2, 0); }
	if( DX2_DELTA >= 2008 ) { 
		if( AVG_DX2_LEFT >= 0.08 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 0.08 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AMP_DELTA < 6987.5 ) { return new Prediction("LEFT", 133, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 2.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 139 ) { 
	if( MAX_AMP_LEFT < -3186.5 ) { 
		if( AVG_DX2_LEFT >= -1.38 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_LEFT < -1.38 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_AMP_LEFT >= -3186.5 ) { 
		if( AVG_AMP_LEFT >= 6 ) { return new Prediction("LEFT", 9, 0); }
	if( AVG_AMP_LEFT < 6 ) { 
		if( FIRST_LEFT_DETECTION >= 464 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_LEFT_DETECTION < 464 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 36, 0); }
	if( AVG_AMP_LEFT >= 2.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 231 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
		if( FIRST_RIGHT_DETECTION < 139 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2251.5 ) { 
	if( AMP_DELTA < 6974.5 ) { 
	if( AMP_DELTA >= 905 ) { 
	if( MAX_DX2_LEFT < 3050 ) { 
		if( MAX_AMP_LEFT < 5172.5 ) { return new Prediction("LEFT", 21, 0); }
		if( MAX_AMP_LEFT >= 5172.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 3050 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AMP_DELTA < 905 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AMP_DELTA >= 6974.5 ) { 
		if( DX2_DELTA < 2983.5 ) { return new Prediction("RIGHT", 63, 0); }
	if( DX2_DELTA >= 2983.5 ) { 
		if( MAX_AMP_RIGHT >= -11321.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_RIGHT < -11321.5 ) { 
		if( AVG_DX2_LEFT < 1.77 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 1.77 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5711 ) { 
	if( MAX_AMP_LEFT >= -2279 ) { 
	if( AMP_DELTA >= 7839.5 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
	if( DX2_DELTA < 4235 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( AVG_DX2_RIGHT >= -2.68 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < -2.68 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("BOTTOM", 29, 0); }
	}
		if( DX2_DELTA >= 4235 ) { return new Prediction("BOTTOM", 124, 0); }
	}
	if( AVG_AMP_LEFT < -4.5 ) { 
		if( DX2_DELTA >= 5450 ) { return new Prediction("BOTTOM", 20, 0); }
	if( DX2_DELTA < 5450 ) { 
		if( DX2_DELTA < 3418 ) { return new Prediction("RIGHT", 8, 0); }
	if( DX2_DELTA >= 3418 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( DETECTION_DELTA < 6.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 7839.5 ) { 
		if( AVG_AMP_LEFT < 5.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( AVG_AMP_LEFT >= 5.5 ) { 
		if( DX2_DELTA >= 2840.5 ) { return new Prediction("LEFT", 6, 0); }
		if( DX2_DELTA < 2840.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -2279 ) { 
		if( MAX_AMP_LEFT < -12477 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_AMP_LEFT >= -12477 ) { 
		if( DX2_DELTA >= 5593 ) { return new Prediction("BOTTOM", 7, 0); }
	if( DX2_DELTA < 5593 ) { 
	if( AVG_AMP_RIGHT < -4.5 ) { 
		if( MAX_AMP_RIGHT >= -15087.5 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_AMP_RIGHT < -15087.5 ) { 
		if( MAX_DX2_LEFT >= 3319.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT < 3319.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= -4.5 ) { return new Prediction("RIGHT", 64, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree6() {
	if( AMP_DELTA < 7065.5 ) { 
	if( MAX_AMP_RIGHT >= -12033.5 ) { 
	if( MAX_AMP_LEFT >= 5047.5 ) { 
	if( AMP_DELTA < 4726 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_DX2_RIGHT >= 2.48 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 2.48 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 56, 0); }
	}
	if( AMP_DELTA >= 4726 ) { 
		if( AVG_DX2_RIGHT >= -4.34 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT < -4.34 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 5047.5 ) { 
	if( MAX_DX2_LEFT < 3584.5 ) { 
	if( AVG_DX2_RIGHT < -1.52 ) { 
	if( AMP_DELTA >= 4948 ) { 
	if( MAX_AMP_RIGHT < -8922 ) { 
		if( AVG_DX2_RIGHT < -2.14 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT >= -2.14 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -8922 ) { return new Prediction("RIGHT", 10, 0); }
	}
	if( AMP_DELTA < 4948 ) { 
	if( MAX_DX2_LEFT >= 2121.5 ) { 
	if( AVG_DX2_LEFT >= 0.05 ) { 
		if( AVG_DX2_LEFT < 0.55 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= 0.55 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT < 0.05 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 2121.5 ) { return new Prediction("LEFT", 14, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -1.52 ) { 
	if( AMP_DELTA >= 6590.5 ) { 
		if( MAX_DX2_RIGHT < 3954.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT >= 3954.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( AMP_DELTA < 6590.5 ) { 
	if( MAX_AMP_LEFT >= 4536 ) { 
		if( AVG_DX2_LEFT >= -0.17 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT < -0.17 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_AMP_LEFT < 4536 ) { 
	if( MAX_DX2_LEFT < 2874 ) { 
	if( AMP_DELTA >= 6203.5 ) { 
		if( MAX_AMP_RIGHT >= -8737 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < -8737 ) { return new Prediction("LEFT", 12, 0); }
	}
		if( AMP_DELTA < 6203.5 ) { return new Prediction("LEFT", 154, 0); }
	}
	if( MAX_DX2_LEFT >= 2874 ) { 
		if( AVG_DX2_RIGHT >= 1.77 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 1.77 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3584.5 ) { 
		if( AVG_DX2_LEFT >= 0.17 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT < 0.17 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( MAX_AMP_RIGHT < -12033.5 ) { return new Prediction("TOP", 149, 0); }
	}
	if( AMP_DELTA >= 7065.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( MAX_DX2_LEFT < 8683.5 ) { 
	if( MAX_AMP_LEFT >= 5234 ) { 
		if( MAX_AMP_LEFT < 6559.5 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_AMP_LEFT >= 6559.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( MAX_AMP_LEFT < 5234 ) { return new Prediction("BOTTOM", 12, 0); }
	}
	if( MAX_DX2_LEFT >= 8683.5 ) { 
		if( FIRST_RIGHT_DETECTION < 266.5 ) { return new Prediction("TOP", 17, 0); }
		if( FIRST_RIGHT_DETECTION >= 266.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( MAX_DX2_RIGHT < 9627.5 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("RIGHT", 141, 0); }
	if( AVG_AMP_RIGHT < -25.5 ) { 
		if( AVG_DX2_RIGHT < -2.17 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -2.17 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 9627.5 ) { 
		if( FIRST_LEFT_DETECTION >= 217.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_LEFT_DETECTION < 217.5 ) { 
		if( MAX_DX2_LEFT < 4559.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 4559.5 ) { return new Prediction("RIGHT", 24, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AMP_DELTA >= 9223 ) { 
	if( MAX_DX2_LEFT >= 1513 ) { 
	if( AVG_DX2_LEFT >= 2.08 ) { 
		if( FIRST_RIGHT_DETECTION >= 175.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 175.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT < 2.08 ) { return new Prediction("BOTTOM", 154, 0); }
	}
		if( MAX_DX2_LEFT < 1513 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA < 9223 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 11, 0); }
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( AMP_DELTA >= 7978.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AMP_DELTA < 7978.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree7() {
	if( MAX_DX2_RIGHT < 6206.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( MAX_DX2_LEFT < 3721 ) { 
	if( MAX_DX2_LEFT >= 1357 ) { 
		if( MAX_AMP_LEFT >= -3704 ) { return new Prediction("RIGHT", 64, 0); }
	if( MAX_AMP_LEFT < -3704 ) { 
		if( AVG_AMP_RIGHT < 19.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT >= 19.5 ) { return new Prediction("RIGHT", 18, 0); }
	}
	}
	if( MAX_DX2_LEFT < 1357 ) { 
		if( MAX_AMP_RIGHT < -6963.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT >= -6963.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3721 ) { 
		if( FIRST_LEFT_DETECTION < 117 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 117 ) { return new Prediction("TOP", 15, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( DETECTION_DELTA < 20.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( MAX_AMP_RIGHT >= -7263.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 162.5 ) { 
		if( MAX_DX2_RIGHT < 2502.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_RIGHT >= 2502.5 ) { 
		if( AVG_DX2_LEFT >= 1.62 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 1.62 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 162.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	if( MAX_AMP_RIGHT < -7263.5 ) { 
		if( MAX_DX2_LEFT >= 3848 ) { return new Prediction("TOP", 18, 0); }
	if( MAX_DX2_LEFT < 3848 ) { 
		if( DETECTION_DELTA >= 10.5 ) { return new Prediction("TOP", 2, 0); }
	if( DETECTION_DELTA < 10.5 ) { 
	if( MAX_AMP_RIGHT >= -10742 ) { 
		if( AMP_DELTA < 6786 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA >= 6786 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( MAX_AMP_RIGHT < -10742 ) { return new Prediction("RIGHT", 31, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( DX2_DELTA >= 3654 ) { 
	if( AVG_DX2_RIGHT < 0.13 ) { 
		if( MAX_DX2_LEFT >= 5541.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_LEFT < 5541.5 ) { 
		if( AVG_DX2_RIGHT >= -0.04 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < -0.04 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 0.13 ) { return new Prediction("TOP", 22, 0); }
	}
	if( DX2_DELTA < 3654 ) { 
		if( MAX_DX2_LEFT >= 2886.5 ) { return new Prediction("TOP", 48, 0); }
	if( MAX_DX2_LEFT < 2886.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( AVG_DX2_LEFT < -2.34 ) { return new Prediction("TOP", 1, 0); }
	if( AVG_DX2_LEFT >= -2.34 ) { 
		if( AVG_DX2_RIGHT < -1.1 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.1 ) { return new Prediction("LEFT", 49, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( MAX_DX2_RIGHT >= 3532.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_RIGHT < 3532.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_AMP_RIGHT < -23.5 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_AMP_RIGHT >= -23.5 ) { 
	if( MAX_DX2_RIGHT < 2958.5 ) { 
		if( DX2_DELTA < 820.5 ) { return new Prediction("TOP", 6, 0); }
		if( DX2_DELTA >= 820.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_DX2_RIGHT >= 2958.5 ) { return new Prediction("LEFT", 14, 0); }
	}
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 20.5 ) { 
		if( MAX_AMP_RIGHT >= -9808 ) { return new Prediction("LEFT", 104, 0); }
		if( MAX_AMP_RIGHT < -9808 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6206.5 ) { 
	if( AMP_DELTA < 7502 ) { 
	if( MAX_DX2_LEFT >= 4717 ) { 
		if( MAX_AMP_RIGHT < -90 ) { return new Prediction("TOP", 99, 0); }
	if( MAX_AMP_RIGHT >= -90 ) { 
		if( FIRST_RIGHT_DETECTION < 146 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 146 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 4717 ) { 
		if( MAX_DX2_LEFT >= 3386.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_LEFT < 3386.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	if( AMP_DELTA >= 7502 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT < 1 ) { 
		if( DX2_DELTA >= 5918.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DX2_DELTA < 5918.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( AVG_AMP_LEFT >= 1 ) { 
	if( MAX_DX2_LEFT < 8683.5 ) { 
		if( AVG_DX2_LEFT < -2.26 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -2.26 ) { return new Prediction("BOTTOM", 17, 0); }
	}
		if( MAX_DX2_LEFT >= 8683.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 141, 0); }
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( DETECTION_DELTA >= 7 ) { 
		if( AVG_AMP_LEFT >= -30 ) { return new Prediction("BOTTOM", 26, 0); }
		if( AVG_AMP_LEFT < -30 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA < 7 ) { return new Prediction("RIGHT", 70, 0); }
	}
	}
	}
return null;
}
private Prediction runTree8() {
	if( MAX_DX2_RIGHT < 5676.5 ) { 
	if( AVG_AMP_RIGHT >= 4.5 ) { 
	if( MAX_AMP_RIGHT < -7370 ) { 
	if( AVG_DX2_LEFT < -1.19 ) { 
	if( AMP_DELTA >= 3144 ) { 
		if( AVG_DX2_RIGHT >= 1.64 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 1.64 ) { return new Prediction("RIGHT", 10, 0); }
	}
		if( AMP_DELTA < 3144 ) { return new Prediction("TOP", 8, 0); }
	}
	if( AVG_DX2_LEFT >= -1.19 ) { 
	if( AMP_DELTA < 7068.5 ) { 
		if( MAX_AMP_LEFT >= 6528 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_AMP_LEFT < 6528 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("LEFT", 5, 0); }
	if( DETECTION_DELTA >= 0.5 ) { 
		if( MAX_DX2_LEFT >= 1823 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_LEFT < 1823 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
		if( AMP_DELTA >= 7068.5 ) { return new Prediction("RIGHT", 71, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -7370 ) { 
		if( MAX_AMP_LEFT >= 3500 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_AMP_LEFT < 3500 ) { 
	if( AVG_DX2_RIGHT < -2.83 ) { 
		if( FIRST_LEFT_DETECTION >= 101 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_LEFT_DETECTION < 101 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_DX2_RIGHT >= -2.83 ) { return new Prediction("LEFT", 17, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 4.5 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
	if( AMP_DELTA < 6805.5 ) { 
	if( DETECTION_DELTA < 11.5 ) { 
	if( MAX_DX2_LEFT < 2611.5 ) { 
		if( AVG_DX2_LEFT >= -1.15 ) { return new Prediction("LEFT", 47, 0); }
	if( AVG_DX2_LEFT < -1.15 ) { 
		if( AVG_DX2_RIGHT >= 3.65 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.65 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2611.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 162.5 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 162.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( DETECTION_DELTA >= 11.5 ) { 
		if( AMP_DELTA >= 5873 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 5873 ) { return new Prediction("LEFT", 111, 0); }
	}
	}
	if( AMP_DELTA >= 6805.5 ) { 
		if( MAX_AMP_LEFT < -8560 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT >= -8560 ) { 
		if( DETECTION_DELTA >= 13 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DETECTION_DELTA < 13 ) { 
		if( FIRST_LEFT_DETECTION < 251 ) { return new Prediction("RIGHT", 19, 0); }
	if( FIRST_LEFT_DETECTION >= 251 ) { 
		if( MAX_AMP_RIGHT < -13232.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT >= -13232.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4800.5 ) { 
		if( MAX_DX2_RIGHT >= 5538 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 5538 ) { return new Prediction("TOP", 67, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5676.5 ) { 
	if( AMP_DELTA < 7502 ) { 
	if( MAX_DX2_LEFT < 5797 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( FIRST_RIGHT_DETECTION >= 135.5 ) { 
		if( MAX_DX2_LEFT >= 4768 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 4768 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 135.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( FIRST_LEFT_DETECTION < 259 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 259 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 5797 ) { 
	if( AVG_AMP_LEFT >= 33 ) { 
		if( AMP_DELTA < 5180 ) { return new Prediction("TOP", 10, 0); }
		if( AMP_DELTA >= 5180 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_AMP_LEFT < 33 ) { return new Prediction("TOP", 91, 0); }
	}
	}
	if( AMP_DELTA >= 7502 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AMP_DELTA >= 11153 ) { 
		if( MAX_DX2_RIGHT >= 9784 ) { return new Prediction("BOTTOM", 13, 0); }
	if( MAX_DX2_RIGHT < 9784 ) { 
		if( AVG_DX2_LEFT < 0.11 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_LEFT >= 0.11 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AMP_DELTA < 11153 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( AVG_AMP_LEFT >= -30 ) { return new Prediction("BOTTOM", 152, 0); }
		if( AVG_AMP_LEFT < -30 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AMP_DELTA < 20001.5 ) { 
		if( AVG_AMP_LEFT >= 5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_AMP_LEFT < 5 ) { 
	if( AVG_DX2_RIGHT < -4.95 ) { 
		if( AVG_DX2_RIGHT < -5.09 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT >= -5.09 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -4.95 ) { return new Prediction("RIGHT", 88, 0); }
	}
	}
	if( AMP_DELTA >= 20001.5 ) { 
		if( FIRST_LEFT_DETECTION >= 124 ) { return new Prediction("BOTTOM", 7, 0); }
		if( FIRST_LEFT_DETECTION < 124 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	}
	}
return null;
}
private Prediction runTree9() {
	if( AMP_DELTA < 7065.5 ) { 
	if( MAX_AMP_LEFT >= 5007 ) { 
	if( AVG_DX2_RIGHT < -2 ) { 
		if( AMP_DELTA < 4811 ) { return new Prediction("TOP", 26, 0); }
	if( AMP_DELTA >= 4811 ) { 
		if( MAX_AMP_LEFT < 7950 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_AMP_LEFT >= 7950 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= -2 ) { return new Prediction("TOP", 161, 0); }
	}
	if( MAX_AMP_LEFT < 5007 ) { 
	if( DETECTION_DELTA < 16.5 ) { 
	if( MAX_DX2_LEFT < 3925.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
	if( AMP_DELTA >= 356 ) { 
	if( AVG_DX2_RIGHT >= -1.68 ) { 
		if( AVG_DX2_LEFT >= -1.47 ) { return new Prediction("LEFT", 20, 0); }
		if( AVG_DX2_LEFT < -1.47 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_DX2_RIGHT < -1.68 ) { 
		if( AVG_DX2_LEFT < 0.69 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.69 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AMP_DELTA < 356 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 157.5 ) { 
		if( AVG_DX2_RIGHT >= 1.99 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_DX2_RIGHT < 1.99 ) { 
		if( MAX_AMP_LEFT < -2559.5 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_AMP_LEFT >= -2559.5 ) { 
		if( FIRST_LEFT_DETECTION >= 275.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 275.5 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	}
		if( FIRST_RIGHT_DETECTION < 157.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( MAX_DX2_RIGHT < 3017 ) { 
		if( MAX_AMP_LEFT >= 3702 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_AMP_LEFT < 3702 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( MAX_DX2_RIGHT >= 3017 ) { return new Prediction("LEFT", 48, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3925.5 ) { return new Prediction("TOP", 14, 0); }
	}
		if( DETECTION_DELTA >= 16.5 ) { return new Prediction("LEFT", 101, 0); }
	}
	}
	if( AMP_DELTA >= 7065.5 ) { 
	if( DX2_DELTA < 3455 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( AMP_DELTA >= 8364 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AMP_DELTA < 8364 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( MAX_AMP_RIGHT >= 3483 ) { 
		if( AVG_DX2_RIGHT < -0.58 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_DX2_RIGHT >= -0.58 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_AMP_RIGHT < 3483 ) { 
		if( AVG_AMP_RIGHT < -36 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_AMP_RIGHT >= -36 ) { 
		if( FIRST_LEFT_DETECTION < 52.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 52.5 ) { return new Prediction("RIGHT", 128, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 3455 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_AMP_RIGHT < -11715.5 ) { return new Prediction("RIGHT", 43, 0); }
	if( MAX_AMP_RIGHT >= -11715.5 ) { 
	if( DX2_DELTA >= 7062.5 ) { 
		if( AVG_DX2_LEFT < -1.11 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= -1.11 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DX2_DELTA < 7062.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_RIGHT >= 4872.5 ) { return new Prediction("BOTTOM", 45, 0); }
		if( MAX_DX2_RIGHT < 4872.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( MAX_DX2_LEFT >= 9602.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 9602.5 ) { 
		if( MAX_DX2_LEFT >= 3323.5 ) { return new Prediction("BOTTOM", 19, 0); }
	if( MAX_DX2_LEFT < 3323.5 ) { 
		if( AVG_DX2_LEFT >= -1.67 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < -1.67 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("BOTTOM", 132, 0); }
	}
	}
	}
return null;
}
private Prediction runTree10() {
	if( MAX_DX2_LEFT >= 3013 ) { 
	if( AMP_DELTA >= 7283.5 ) { 
	if( MAX_DX2_LEFT < 8020.5 ) { 
	if( AVG_AMP_RIGHT >= -2.5 ) { 
		if( AVG_AMP_LEFT < -2.5 ) { return new Prediction("RIGHT", 78, 0); }
	if( AVG_AMP_LEFT >= -2.5 ) { 
		if( DX2_DELTA >= 5484 ) { return new Prediction("BOTTOM", 9, 0); }
	if( DX2_DELTA < 5484 ) { 
		if( FIRST_LEFT_DETECTION < 141 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_LEFT_DETECTION >= 141 ) { 
		if( MAX_DX2_LEFT >= 3274.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_LEFT < 3274.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < -2.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_DX2_LEFT < 3616 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 3616 ) { return new Prediction("BOTTOM", 13, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 115, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 8020.5 ) { 
	if( MAX_AMP_RIGHT >= -19029.5 ) { 
		if( MAX_AMP_RIGHT < 7998 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_AMP_RIGHT >= 7998 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_RIGHT < -19029.5 ) { 
		if( MAX_DX2_LEFT >= 8850.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT < 8850.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 7283.5 ) { 
		if( MAX_DX2_RIGHT >= 13246.5 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_DX2_RIGHT < 13246.5 ) { 
	if( MAX_DX2_LEFT < 4221 ) { 
	if( AMP_DELTA >= 3893 ) { 
		if( AVG_DX2_RIGHT < -2.95 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_DX2_RIGHT >= -2.95 ) { 
		if( AVG_DX2_LEFT < -1.04 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -1.04 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( AMP_DELTA < 3893 ) { return new Prediction("TOP", 14, 0); }
	}
		if( MAX_DX2_LEFT >= 4221 ) { return new Prediction("TOP", 180, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3013 ) { 
	if( MAX_AMP_RIGHT < -9292 ) { 
	if( AMP_DELTA >= 7955.5 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
		if( DX2_DELTA >= 5239 ) { return new Prediction("BOTTOM", 4, 0); }
		if( DX2_DELTA < 5239 ) { return new Prediction("RIGHT", 52, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 38, 0); }
	}
	}
	if( AMP_DELTA < 7955.5 ) { 
		if( MAX_AMP_LEFT < 3009 ) { return new Prediction("RIGHT", 16, 0); }
	if( MAX_AMP_LEFT >= 3009 ) { 
	if( AVG_DX2_RIGHT < 0.77 ) { 
		if( MAX_DX2_RIGHT < 5511.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 5511.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.77 ) { return new Prediction("LEFT", 27, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -9292 ) { 
	if( MAX_AMP_LEFT < 3915 ) { 
	if( AVG_AMP_RIGHT < 8 ) { 
		if( MAX_AMP_RIGHT >= 7915 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_AMP_RIGHT < 7915 ) { 
		if( MAX_AMP_RIGHT >= -8309 ) { return new Prediction("LEFT", 136, 0); }
	if( MAX_AMP_RIGHT < -8309 ) { 
	if( MAX_DX2_LEFT < 1642.5 ) { 
		if( AVG_DX2_RIGHT < 5.08 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= 5.08 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 1642.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8 ) { 
	if( AVG_DX2_LEFT >= -0 ) { 
	if( AVG_DX2_LEFT < 0.72 ) { 
	if( MAX_AMP_RIGHT < 6325 ) { 
	if( AVG_DX2_RIGHT < 0.65 ) { 
		if( AMP_DELTA >= 5696 ) { return new Prediction("RIGHT", 2, 0); }
		if( AMP_DELTA < 5696 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 18, 0); }
	}
		if( MAX_AMP_RIGHT >= 6325 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= 0.72 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_DX2_LEFT < -0 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3915 ) { 
		if( MAX_AMP_LEFT >= 4954 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_LEFT < 4954 ) { 
	if( DX2_DELTA < 1322.5 ) { 
		if( FIRST_LEFT_DETECTION >= 266 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 266 ) { return new Prediction("TOP", 5, 0); }
	}
		if( DX2_DELTA >= 1322.5 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree11() {
	if( MAX_AMP_LEFT < 6044.5 ) { 
	if( MAX_AMP_LEFT < -3904 ) { 
		if( MAX_AMP_LEFT < -11290 ) { return new Prediction("TOP", 23, 0); }
	if( MAX_AMP_LEFT >= -11290 ) { 
	if( AVG_AMP_RIGHT >= -15.5 ) { 
		if( FIRST_LEFT_DETECTION < 76.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 76.5 ) { return new Prediction("RIGHT", 69, 0); }
	}
	if( AVG_AMP_RIGHT < -15.5 ) { 
	if( MAX_DX2_RIGHT < 6974 ) { 
		if( FIRST_RIGHT_DETECTION >= 114.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 114.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 6974 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= -3904 ) { 
	if( DX2_DELTA >= 3506.5 ) { 
	if( MAX_DX2_RIGHT >= 8187 ) { 
		if( AVG_DX2_LEFT < 2.2 ) { return new Prediction("BOTTOM", 119, 0); }
	if( AVG_DX2_LEFT >= 2.2 ) { 
		if( FIRST_RIGHT_DETECTION < 143 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 143 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 8187 ) { 
	if( MAX_AMP_RIGHT < -9222 ) { 
	if( MAX_AMP_LEFT >= -2245.5 ) { 
	if( AVG_DX2_LEFT < 1.41 ) { 
		if( DETECTION_DELTA < 8 ) { return new Prediction("LEFT", 1, 0); }
		if( DETECTION_DELTA >= 8 ) { return new Prediction("BOTTOM", 42, 0); }
	}
		if( AVG_DX2_LEFT >= 1.41 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_AMP_LEFT < -2245.5 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -9222 ) { 
		if( FIRST_LEFT_DETECTION >= 66 ) { return new Prediction("RIGHT", 5, 0); }
		if( FIRST_LEFT_DETECTION < 66 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 3506.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 251.5 ) { 
		if( FIRST_LEFT_DETECTION < 250 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 250 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 251.5 ) { 
		if( AMP_DELTA >= 6872.5 ) { return new Prediction("RIGHT", 58, 0); }
	if( AMP_DELTA < 6872.5 ) { 
		if( DX2_DELTA < 1956.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( DX2_DELTA >= 1956.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( MAX_DX2_LEFT < 1802 ) { 
		if( FIRST_LEFT_DETECTION < 230.5 ) { return new Prediction("LEFT", 109, 0); }
	if( FIRST_LEFT_DETECTION >= 230.5 ) { 
		if( MAX_AMP_RIGHT >= -7750.5 ) { return new Prediction("LEFT", 16, 0); }
	if( MAX_AMP_RIGHT < -7750.5 ) { 
		if( AVG_DX2_LEFT < 0.03 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 1802 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT >= 3870 ) { 
	if( DX2_DELTA >= 1458.5 ) { 
		if( MAX_DX2_RIGHT >= 6477.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 6477.5 ) { return new Prediction("LEFT", 12, 0); }
	}
		if( DX2_DELTA < 1458.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( MAX_AMP_LEFT < 3870 ) { 
	if( MAX_AMP_RIGHT < -9292 ) { 
		if( MAX_DX2_LEFT < 1861 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_DX2_LEFT >= 1861 ) { 
	if( MAX_AMP_LEFT >= 3538 ) { 
		if( MAX_DX2_LEFT < 2273 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2273 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_AMP_LEFT < 3538 ) { return new Prediction("RIGHT", 28, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -9292 ) { 
	if( AVG_DX2_RIGHT < -1.49 ) { 
		if( MAX_AMP_LEFT >= 3423.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_LEFT < 3423.5 ) { 
		if( AVG_DX2_LEFT < 0.69 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.69 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= -1.49 ) { return new Prediction("LEFT", 16, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_RIGHT >= 3152 ) { 
		if( AVG_AMP_RIGHT >= -36.5 ) { return new Prediction("LEFT", 28, 0); }
		if( AVG_AMP_RIGHT < -36.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_DX2_RIGHT < 3152 ) { 
		if( MAX_AMP_RIGHT < -8316 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_RIGHT >= -8316 ) { 
		if( MAX_AMP_LEFT < 4031.5 ) { return new Prediction("LEFT", 19, 0); }
		if( MAX_AMP_LEFT >= 4031.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6044.5 ) { 
	if( MAX_DX2_RIGHT >= 8593.5 ) { 
	if( DX2_DELTA >= 4509.5 ) { 
	if( MAX_DX2_LEFT < 12514 ) { 
		if( AVG_DX2_LEFT >= 2.28 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_DX2_LEFT < 2.28 ) { 
		if( AVG_AMP_RIGHT < 22.5 ) { return new Prediction("BOTTOM", 11, 0); }
		if( AVG_AMP_RIGHT >= 22.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 12514 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DX2_DELTA < 4509.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( AVG_DX2_RIGHT < -4.97 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -4.97 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_DX2_LEFT < -1.18 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.18 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 8593.5 ) { 
		if( AMP_DELTA < 7815.5 ) { return new Prediction("TOP", 158, 0); }
	if( AMP_DELTA >= 7815.5 ) { 
		if( AMP_DELTA >= 10573 ) { return new Prediction("RIGHT", 3, 0); }
	if( AMP_DELTA < 10573 ) { 
		if( AVG_DX2_LEFT >= -0.9 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < -0.9 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree12() {
	if( MAX_AMP_LEFT < 6044.5 ) { 
	if( AVG_AMP_RIGHT >= -15.5 ) { 
	if( MAX_AMP_RIGHT < -8153.5 ) { 
	if( AVG_AMP_LEFT >= 7 ) { 
	if( MAX_AMP_LEFT < 3292.5 ) { 
		if( AVG_DX2_LEFT >= 1.26 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT < 1.26 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( MAX_AMP_LEFT >= 3292.5 ) { 
		if( AMP_DELTA >= 13075.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AMP_DELTA < 13075.5 ) { return new Prediction("LEFT", 27, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7 ) { 
	if( DX2_DELTA < 4735 ) { 
	if( AMP_DELTA < 6841.5 ) { 
		if( MAX_DX2_LEFT >= 1823 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_LEFT < 1823 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( AMP_DELTA >= 6841.5 ) { return new Prediction("RIGHT", 149, 0); }
	}
	if( DX2_DELTA >= 4735 ) { 
	if( MAX_AMP_LEFT >= -2938 ) { 
		if( FIRST_LEFT_DETECTION < 141 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 141 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( MAX_AMP_LEFT < -2938 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -8153.5 ) { 
	if( DX2_DELTA < 3379 ) { 
	if( MAX_AMP_RIGHT < 6325 ) { 
	if( MAX_AMP_LEFT >= 3538 ) { 
	if( FIRST_RIGHT_DETECTION >= 75.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 265.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 265.5 ) { return new Prediction("TOP", 9, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 75.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( MAX_AMP_LEFT < 3538 ) { 
	if( FIRST_RIGHT_DETECTION >= 223.5 ) { 
		if( AMP_DELTA < 5508.5 ) { return new Prediction("LEFT", 13, 0); }
		if( AMP_DELTA >= 5508.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 223.5 ) { return new Prediction("LEFT", 78, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 6325 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( DX2_DELTA >= 3379 ) { 
		if( AVG_AMP_RIGHT < 27.5 ) { return new Prediction("BOTTOM", 11, 0); }
	if( AVG_AMP_RIGHT >= 27.5 ) { 
	if( MAX_DX2_RIGHT >= 11876 ) { 
		if( AVG_DX2_RIGHT >= 0.34 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < 0.34 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_RIGHT < 11876 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < -15.5 ) { 
	if( MAX_DX2_RIGHT >= 5450 ) { 
		if( MAX_DX2_LEFT >= 11463 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 11463 ) { 
		if( MAX_DX2_LEFT >= 2486 ) { return new Prediction("BOTTOM", 133, 0); }
	if( MAX_DX2_LEFT < 2486 ) { 
		if( FIRST_RIGHT_DETECTION < 136.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION >= 136.5 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 5450 ) { 
	if( MAX_DX2_LEFT < 2859 ) { 
	if( MAX_AMP_LEFT < 4457.5 ) { 
	if( AVG_AMP_RIGHT >= -43.5 ) { 
	if( FIRST_LEFT_DETECTION >= 230 ) { 
		if( FIRST_LEFT_DETECTION >= 236.5 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_LEFT_DETECTION < 236.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 230 ) { return new Prediction("LEFT", 44, 0); }
	}
		if( AVG_AMP_RIGHT < -43.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 4457.5 ) { 
		if( MAX_AMP_RIGHT >= -7188.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT < -7188.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 2859 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 6044.5 ) { 
	if( MAX_DX2_RIGHT >= 11649 ) { 
	if( FIRST_RIGHT_DETECTION >= 130.5 ) { 
		if( AVG_AMP_LEFT < -15 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_LEFT >= -15 ) { return new Prediction("BOTTOM", 13, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 130.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( MAX_DX2_RIGHT < 11649 ) { 
	if( MAX_AMP_LEFT < 8119 ) { 
	if( AVG_AMP_LEFT < -4 ) { 
		if( AVG_DX2_RIGHT >= -0.38 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < -0.38 ) { return new Prediction("RIGHT", 5, 0); }
	}
	if( AVG_AMP_LEFT >= -4 ) { 
		if( MAX_DX2_RIGHT < 5470.5 ) { return new Prediction("TOP", 21, 0); }
	if( MAX_DX2_RIGHT >= 5470.5 ) { 
		if( MAX_DX2_RIGHT >= 7311.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_RIGHT < 7311.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 8119 ) { 
		if( MAX_AMP_RIGHT < -26155 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_AMP_RIGHT >= -26155 ) { 
		if( MAX_AMP_RIGHT < 15975.5 ) { return new Prediction("TOP", 176, 0); }
		if( MAX_AMP_RIGHT >= 15975.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree13() {
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_AMP_LEFT < 5322 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 100, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_DX2_LEFT < 4288 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( DX2_DELTA < 460.5 ) { 
		if( AMP_DELTA >= 2571 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA < 2571 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DX2_DELTA >= 460.5 ) { 
	if( MAX_AMP_LEFT < 4451 ) { 
	if( MAX_AMP_LEFT < 2215 ) { 
		if( AVG_DX2_RIGHT >= 4.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 4.5 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( MAX_AMP_LEFT >= 2215 ) { return new Prediction("LEFT", 58, 0); }
	}
	if( MAX_AMP_LEFT >= 4451 ) { 
		if( AVG_DX2_LEFT < 0.57 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= 0.57 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( AMP_DELTA < 3706.5 ) { 
	if( AVG_AMP_RIGHT < -15 ) { 
		if( MAX_AMP_LEFT >= 1502.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_LEFT < 1502.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AVG_AMP_RIGHT >= -15 ) { return new Prediction("LEFT", 19, 0); }
	}
	if( AMP_DELTA >= 3706.5 ) { 
		if( DX2_DELTA < 1770.5 ) { return new Prediction("RIGHT", 12, 0); }
		if( DX2_DELTA >= 1770.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 4288 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 5322 ) { 
	if( AMP_DELTA < 5180 ) { 
	if( FIRST_LEFT_DETECTION >= 260.5 ) { 
		if( AVG_DX2_LEFT < -3.97 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -3.97 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 260.5 ) { return new Prediction("TOP", 176, 0); }
	}
	if( AMP_DELTA >= 5180 ) { 
		if( MAX_AMP_LEFT >= 9859 ) { return new Prediction("TOP", 16, 0); }
		if( MAX_AMP_LEFT < 9859 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( MAX_AMP_LEFT >= 4405.5 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 38, 0); }
	if( AVG_AMP_LEFT >= 8 ) { 
		if( AMP_DELTA < 8635 ) { return new Prediction("LEFT", 7, 0); }
	if( AMP_DELTA >= 8635 ) { 
		if( MAX_DX2_RIGHT < 8161.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 8161.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < 4405.5 ) { return new Prediction("RIGHT", 139, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_RIGHT < 5436 ) { 
		if( DETECTION_DELTA < 73 ) { return new Prediction("RIGHT", 16, 0); }
		if( DETECTION_DELTA >= 73 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( MAX_DX2_RIGHT >= 5436 ) { return new Prediction("BOTTOM", 31, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -12.5 ) { 
	if( MAX_DX2_LEFT >= 7817.5 ) { 
		if( AMP_DELTA >= 22681.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 22681.5 ) { return new Prediction("TOP", 11, 0); }
	}
	if( MAX_DX2_LEFT < 7817.5 ) { 
	if( AVG_AMP_RIGHT >= -15.5 ) { 
	if( MAX_DX2_LEFT >= 2181 ) { 
		if( FIRST_LEFT_DETECTION >= 151.5 ) { return new Prediction("BOTTOM", 12, 0); }
		if( FIRST_LEFT_DETECTION < 151.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 2181 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_AMP_RIGHT < -15.5 ) { return new Prediction("BOTTOM", 127, 0); }
	}
	}
	}
return null;
}
private Prediction runTree14() {
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_DX2_LEFT < 2943 ) { 
	if( MAX_AMP_LEFT >= 4439.5 ) { 
	if( AVG_AMP_LEFT < 19.5 ) { 
		if( AVG_DX2_RIGHT < -5.99 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -5.99 ) { return new Prediction("TOP", 15, 0); }
	}
		if( AVG_AMP_LEFT >= 19.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( MAX_AMP_LEFT < 4439.5 ) { 
	if( AVG_DX2_RIGHT < -3.15 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( AVG_DX2_RIGHT >= -3.15 ) { 
		if( FIRST_LEFT_DETECTION < 179.5 ) { return new Prediction("LEFT", 99, 0); }
	if( FIRST_LEFT_DETECTION >= 179.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AMP_DELTA >= 5050 ) { 
		if( MAX_AMP_RIGHT < -8658 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_AMP_RIGHT >= -8658 ) { 
		if( FIRST_LEFT_DETECTION < 238.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 238.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AMP_DELTA < 5050 ) { return new Prediction("LEFT", 25, 0); }
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AVG_DX2_LEFT < -0.76 ) { 
		if( MAX_DX2_LEFT >= 1693 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_LEFT < 1693 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -0.76 ) { return new Prediction("LEFT", 32, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 2943 ) { 
	if( AVG_DX2_RIGHT < -2 ) { 
		if( AVG_DX2_LEFT >= 0.09 ) { return new Prediction("TOP", 15, 0); }
	if( AVG_DX2_LEFT < 0.09 ) { 
		if( MAX_DX2_LEFT < 4327.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_LEFT >= 4327.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -2 ) { 
	if( AVG_AMP_RIGHT < 59.5 ) { 
		if( MAX_DX2_RIGHT >= 13246.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 13246.5 ) { return new Prediction("TOP", 149, 0); }
	}
		if( AVG_AMP_RIGHT >= 59.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( AVG_AMP_RIGHT < -4.5 ) { 
	if( MAX_DX2_RIGHT < 5672.5 ) { 
	if( AVG_AMP_LEFT >= 4 ) { 
		if( MAX_AMP_LEFT < -9562.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_AMP_LEFT >= -9562.5 ) { 
		if( AVG_DX2_LEFT < 0.68 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.68 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4 ) { 
		if( FIRST_LEFT_DETECTION >= 247 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 247 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5672.5 ) { 
		if( MAX_DX2_LEFT < 7760 ) { return new Prediction("BOTTOM", 183, 0); }
	if( MAX_DX2_LEFT >= 7760 ) { 
		if( MAX_AMP_RIGHT < 3827.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_AMP_RIGHT >= 3827.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -4.5 ) { 
	if( AMP_DELTA >= 7262 ) { 
	if( AVG_AMP_RIGHT < 24.5 ) { 
	if( DX2_DELTA >= 4116.5 ) { 
	if( AVG_AMP_LEFT < -6 ) { 
		if( MAX_DX2_RIGHT < 8671 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 8671 ) { return new Prediction("RIGHT", 11, 0); }
	}
	if( AVG_AMP_LEFT >= -6 ) { 
		if( MAX_DX2_LEFT < 11258 ) { return new Prediction("BOTTOM", 19, 0); }
		if( MAX_DX2_LEFT >= 11258 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( DX2_DELTA < 4116.5 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_LEFT_DETECTION >= 77.5 ) { 
		if( DX2_DELTA < 3528.5 ) { return new Prediction("RIGHT", 48, 0); }
	if( DX2_DELTA >= 3528.5 ) { 
		if( MAX_AMP_RIGHT < -14495 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_AMP_RIGHT >= -14495 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
		if( AVG_AMP_RIGHT >= 24.5 ) { return new Prediction("RIGHT", 126, 0); }
	}
	if( AMP_DELTA < 7262 ) { 
	if( FIRST_LEFT_DETECTION >= 180 ) { 
		if( MAX_AMP_RIGHT >= -7127.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < -7127.5 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( FIRST_LEFT_DETECTION < 180 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
return null;
}
private Prediction runTree15() {
	if( MAX_AMP_LEFT < 6559.5 ) { 
	if( AMP_DELTA < 6805.5 ) { 
	if( DETECTION_DELTA >= 12.5 ) { 
		if( MAX_AMP_LEFT >= 4954 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 4954 ) { return new Prediction("LEFT", 117, 0); }
	}
	if( DETECTION_DELTA < 12.5 ) { 
	if( AVG_DX2_RIGHT < -0.36 ) { 
	if( MAX_DX2_LEFT >= 2883 ) { 
		if( MAX_AMP_LEFT < 5376 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_LEFT >= 5376 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( MAX_DX2_LEFT < 2883 ) { 
	if( AVG_AMP_RIGHT < 22 ) { 
	if( MAX_AMP_LEFT < 3580.5 ) { 
		if( FIRST_LEFT_DETECTION >= 245.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 245.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( MAX_AMP_LEFT >= 3580.5 ) { 
		if( MAX_DX2_RIGHT >= 4694 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 4694 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 22 ) { 
		if( AVG_DX2_LEFT < -1.56 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -1.56 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= -0.36 ) { 
	if( MAX_AMP_LEFT >= 4706 ) { 
	if( AMP_DELTA >= 3970.5 ) { 
		if( FIRST_LEFT_DETECTION < 173.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 173.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AMP_DELTA < 3970.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_LEFT < 4706 ) { 
		if( MAX_DX2_RIGHT >= 5815 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_RIGHT < 5815 ) { 
	if( MAX_DX2_LEFT < 3887 ) { 
	if( AVG_DX2_LEFT >= -2.14 ) { 
		if( AMP_DELTA < 6463.5 ) { return new Prediction("LEFT", 49, 0); }
	if( AMP_DELTA >= 6463.5 ) { 
		if( MAX_DX2_LEFT >= 1721.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 1721.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_DX2_LEFT < -2.14 ) { 
		if( AVG_DX2_LEFT < -2.62 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -2.62 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3887 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6805.5 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
	if( DX2_DELTA < 5686.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT >= 5392.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("RIGHT", 16, 0); }
	}
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_LEFT < 5392.5 ) { return new Prediction("RIGHT", 151, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( AVG_AMP_RIGHT >= 10 ) { 
		if( AVG_DX2_LEFT < -1.55 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= -1.55 ) { return new Prediction("RIGHT", 11, 0); }
	}
		if( AVG_AMP_RIGHT < 10 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	if( DX2_DELTA >= 5686.5 ) { 
		if( MAX_AMP_LEFT >= -4435.5 ) { return new Prediction("BOTTOM", 25, 0); }
		if( MAX_AMP_LEFT < -4435.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -12.5 ) { 
	if( AVG_DX2_RIGHT < 5.22 ) { 
	if( AVG_DX2_LEFT >= -3.4 ) { 
		if( MAX_DX2_RIGHT < 3605.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 3605.5 ) { return new Prediction("BOTTOM", 151, 0); }
	}
		if( AVG_DX2_LEFT < -3.4 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_RIGHT >= 5.22 ) { 
		if( AVG_DX2_RIGHT < 5.77 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_RIGHT >= 5.77 ) { 
		if( MAX_DX2_RIGHT >= 4707 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_RIGHT < 4707 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6559.5 ) { 
	if( MAX_DX2_RIGHT < 10094 ) { 
	if( AVG_AMP_RIGHT < 60.5 ) { 
		if( AVG_AMP_LEFT < 20.5 ) { return new Prediction("TOP", 119, 0); }
	if( AVG_AMP_LEFT >= 20.5 ) { 
	if( AMP_DELTA >= 6641 ) { 
		if( MAX_AMP_LEFT >= 9872 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 9872 ) { 
		if( AVG_DX2_LEFT >= 0.67 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 0.67 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AMP_DELTA < 6641 ) { return new Prediction("TOP", 41, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 60.5 ) { 
		if( MAX_DX2_RIGHT >= 6276 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT < 6276 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 10094 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AVG_AMP_LEFT >= -9 ) { 
		if( MAX_AMP_RIGHT < -24908 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_AMP_RIGHT >= -24908 ) { 
	if( AVG_DX2_LEFT >= -1.67 ) { 
		if( MAX_DX2_LEFT < 14693 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 14693 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_DX2_LEFT < -1.67 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT < -9 ) { return new Prediction("RIGHT", 17, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 12, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_DX2_RIGHT < 0.28 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.28 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree16() {
	if( AMP_DELTA >= 6814 ) { 
	if( AVG_AMP_RIGHT < -5.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT < -4 ) { 
		if( AVG_DX2_RIGHT < 2.25 ) { return new Prediction("RIGHT", 10, 0); }
		if( AVG_DX2_RIGHT >= 2.25 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_LEFT >= -4 ) { 
		if( MAX_DX2_RIGHT < 9482 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_RIGHT >= 9482 ) { 
		if( MAX_DX2_LEFT >= 18205 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 18205 ) { return new Prediction("BOTTOM", 24, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_LEFT >= 7624.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 7624.5 ) { return new Prediction("BOTTOM", 150, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -5.5 ) { 
	if( DX2_DELTA >= 5450 ) { 
	if( FIRST_RIGHT_DETECTION >= 160.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 19, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_DX2_RIGHT < 0.54 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT >= 0.54 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 160.5 ) { 
	if( AVG_AMP_LEFT >= -12 ) { 
		if( AVG_DX2_LEFT >= 0.81 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.81 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT < -12 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( DX2_DELTA < 5450 ) { 
	if( AVG_AMP_RIGHT < 20.5 ) { 
	if( MAX_AMP_LEFT >= 3870 ) { 
	if( MAX_DX2_RIGHT < 6597 ) { 
		if( MAX_DX2_LEFT >= 3274.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 3274.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( MAX_DX2_RIGHT >= 6597 ) { 
	if( MAX_DX2_LEFT < 5572.5 ) { 
		if( MAX_DX2_RIGHT >= 7174 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 7174 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 5572.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT < 3870 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 77.5 ) { return new Prediction("RIGHT", 44, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 20.5 ) { return new Prediction("RIGHT", 113, 0); }
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_AMP_RIGHT < -10509.5 ) { 
	if( DETECTION_DELTA < 1 ) { 
		if( AVG_DX2_LEFT >= -4.85 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_DX2_LEFT < -4.85 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA >= 1 ) { 
		if( MAX_AMP_LEFT >= 6002.5 ) { return new Prediction("TOP", 145, 0); }
	if( MAX_AMP_LEFT < 6002.5 ) { 
	if( MAX_DX2_LEFT < 7000.5 ) { 
		if( MAX_DX2_LEFT < 3326 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_DX2_LEFT >= 3326 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( MAX_DX2_LEFT >= 7000.5 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -10509.5 ) { 
	if( MAX_DX2_LEFT < 2943 ) { 
	if( MAX_AMP_LEFT < 3968.5 ) { 
	if( AMP_DELTA >= 5846.5 ) { 
	if( MAX_DX2_RIGHT >= 3308 ) { 
		if( AVG_AMP_RIGHT >= -24 ) { return new Prediction("LEFT", 19, 0); }
		if( AVG_AMP_RIGHT < -24 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_DX2_RIGHT < 3308 ) { 
		if( DX2_DELTA >= 2137.5 ) { return new Prediction("LEFT", 3, 0); }
		if( DX2_DELTA < 2137.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
		if( AMP_DELTA < 5846.5 ) { return new Prediction("LEFT", 153, 0); }
	}
	if( MAX_AMP_LEFT >= 3968.5 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
		if( MAX_DX2_RIGHT >= 3203 ) { return new Prediction("LEFT", 18, 0); }
		if( MAX_DX2_RIGHT < 3203 ) { return new Prediction("TOP", 5, 0); }
	}
		if( MAX_AMP_LEFT >= 4800.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2943 ) { 
		if( AMP_DELTA >= 4023.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AMP_DELTA < 4023.5 ) { return new Prediction("TOP", 26, 0); }
	}
	}
	}
return null;
}
private Prediction runTree17() {
	if( MAX_DX2_LEFT < 2691.5 ) { 
	if( MAX_AMP_RIGHT < -8153.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( DX2_DELTA < 4389.5 ) { 
	if( AMP_DELTA >= 6779 ) { 
		if( FIRST_LEFT_DETECTION >= 274 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 274 ) { return new Prediction("RIGHT", 70, 0); }
	}
	if( AMP_DELTA < 6779 ) { 
	if( MAX_AMP_RIGHT >= -8607 ) { 
		if( MAX_DX2_LEFT < 1902 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_LEFT >= 1902 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -8607 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
		if( DX2_DELTA >= 4389.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( AMP_DELTA >= 7955.5 ) { return new Prediction("BOTTOM", 12, 0); }
		if( AMP_DELTA < 7955.5 ) { return new Prediction("LEFT", 40, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -8153.5 ) { 
	if( AMP_DELTA >= 5219 ) { 
		if( MAX_DX2_RIGHT >= 5671.5 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_DX2_RIGHT < 5671.5 ) { 
		if( AVG_DX2_RIGHT >= -0.81 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < -0.81 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( AMP_DELTA < 5219 ) { 
	if( MAX_AMP_LEFT < 3915 ) { 
		if( AMP_DELTA < 4414.5 ) { return new Prediction("LEFT", 145, 0); }
	if( AMP_DELTA >= 4414.5 ) { 
		if( MAX_DX2_LEFT < 2164.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_LEFT >= 2164.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3915 ) { 
		if( DX2_DELTA >= 1374 ) { return new Prediction("LEFT", 9, 0); }
		if( DX2_DELTA < 1374 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 2691.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( DX2_DELTA >= 4640 ) { 
		if( MAX_AMP_LEFT >= 11357 ) { return new Prediction("TOP", 48, 0); }
	if( MAX_AMP_LEFT < 11357 ) { 
	if( DX2_DELTA < 12072 ) { 
	if( MAX_DX2_LEFT < 9264 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( DX2_DELTA >= 9745 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DX2_DELTA < 9745 ) { 
		if( MAX_AMP_RIGHT >= 231 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_RIGHT < 231 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("BOTTOM", 11, 0); }
	}
		if( MAX_DX2_LEFT >= 9264 ) { return new Prediction("TOP", 4, 0); }
	}
		if( DX2_DELTA >= 12072 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( DX2_DELTA < 4640 ) { 
	if( AMP_DELTA >= 6573.5 ) { 
		if( MAX_DX2_LEFT < 5086 ) { return new Prediction("RIGHT", 42, 0); }
	if( MAX_DX2_LEFT >= 5086 ) { 
		if( FIRST_LEFT_DETECTION < 82.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 82.5 ) { 
		if( AVG_DX2_LEFT < 1.48 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 1.48 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 6573.5 ) { 
	if( MAX_AMP_LEFT < 5815 ) { 
		if( AVG_DX2_RIGHT < -0.65 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT >= -0.65 ) { 
		if( AVG_AMP_RIGHT >= -26 ) { return new Prediction("TOP", 7, 0); }
		if( AVG_AMP_RIGHT < -26 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 5815 ) { return new Prediction("TOP", 74, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_AMP_LEFT >= 6566.5 ) { 
	if( MAX_DX2_RIGHT < 8673 ) { 
		if( MAX_AMP_RIGHT >= -17034 ) { return new Prediction("TOP", 21, 0); }
		if( MAX_AMP_RIGHT < -17034 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 8673 ) { 
		if( AVG_DX2_RIGHT < -3.52 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_RIGHT >= -3.52 ) { 
		if( AVG_AMP_RIGHT >= -15.5 ) { return new Prediction("RIGHT", 10, 0); }
		if( AVG_AMP_RIGHT < -15.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 6566.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 57, 0); }
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( AVG_DX2_LEFT >= 0.52 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.52 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AMP_DELTA < 7927 ) { 
	if( MAX_AMP_LEFT < 4447.5 ) { 
		if( FIRST_RIGHT_DETECTION < 197.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 197.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 4447.5 ) { return new Prediction("TOP", 45, 0); }
	}
	if( AMP_DELTA >= 7927 ) { 
		if( AVG_AMP_RIGHT < 30.5 ) { return new Prediction("BOTTOM", 140, 0); }
		if( AVG_AMP_RIGHT >= 30.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree18() {
	if( MAX_DX2_LEFT < 3007 ) { 
	if( MAX_AMP_RIGHT < -10651.5 ) { 
	if( DX2_DELTA >= 3728.5 ) { 
		if( MAX_AMP_LEFT >= -2245.5 ) { return new Prediction("BOTTOM", 39, 0); }
	if( MAX_AMP_LEFT < -2245.5 ) { 
		if( AVG_DX2_LEFT >= 1.24 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < 1.24 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DX2_DELTA < 3728.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 50, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( AVG_AMP_RIGHT < 16 ) { 
		if( DETECTION_DELTA < 14 ) { return new Prediction("LEFT", 9, 0); }
		if( DETECTION_DELTA >= 14 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( AVG_AMP_RIGHT >= 16 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -10651.5 ) { 
	if( AMP_DELTA < 6786 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 95, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_AMP_LEFT >= 4169 ) { 
		if( DX2_DELTA >= 1499 ) { return new Prediction("LEFT", 4, 0); }
		if( DX2_DELTA < 1499 ) { return new Prediction("TOP", 15, 0); }
	}
	if( MAX_AMP_LEFT < 4169 ) { 
	if( AVG_AMP_RIGHT < 8 ) { 
	if( AVG_DX2_LEFT < -1.2 ) { 
		if( AVG_DX2_LEFT < -2.6 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -2.6 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -1.2 ) { return new Prediction("LEFT", 76, 0); }
	}
	if( AVG_AMP_RIGHT >= 8 ) { 
		if( FIRST_LEFT_DETECTION < 171.5 ) { return new Prediction("LEFT", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 171.5 ) { 
		if( DX2_DELTA < 1277.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( DX2_DELTA >= 1277.5 ) { 
		if( MAX_DX2_RIGHT >= 3574.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT < 3574.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
	if( MAX_DX2_RIGHT < 7820 ) { 
	if( MAX_DX2_LEFT < 611 ) { 
		if( DX2_DELTA >= 2762 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA < 2762 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 611 ) { return new Prediction("RIGHT", 28, 0); }
	}
		if( MAX_DX2_RIGHT >= 7820 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3007 ) { 
	if( MAX_DX2_LEFT >= 7272.5 ) { 
	if( MAX_DX2_RIGHT >= 12061.5 ) { 
	if( AMP_DELTA >= 10021 ) { 
		if( AVG_DX2_RIGHT >= 0.68 ) { return new Prediction("RIGHT", 9, 0); }
	if( AVG_DX2_RIGHT < 0.68 ) { 
		if( AVG_DX2_RIGHT < -1.71 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.71 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( AMP_DELTA < 10021 ) { 
		if( AVG_DX2_LEFT >= -2.47 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < -2.47 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 12061.5 ) { 
		if( AMP_DELTA < 7349 ) { return new Prediction("TOP", 132, 0); }
	if( AMP_DELTA >= 7349 ) { 
		if( AVG_DX2_RIGHT < -0.18 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -0.18 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 7272.5 ) { 
	if( AVG_AMP_RIGHT < -2 ) { 
	if( MAX_AMP_LEFT >= 5492.5 ) { 
	if( MAX_DX2_RIGHT < 8567.5 ) { 
		if( DX2_DELTA < 2360 ) { return new Prediction("TOP", 40, 0); }
	if( DX2_DELTA >= 2360 ) { 
		if( MAX_DX2_RIGHT < 5399.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 5399.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 8567.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	if( MAX_AMP_LEFT < 5492.5 ) { 
	if( MAX_DX2_RIGHT >= 5736.5 ) { 
	if( FIRST_LEFT_DETECTION < 135.5 ) { 
		if( MAX_DX2_LEFT < 3568.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 3568.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 135.5 ) { return new Prediction("BOTTOM", 120, 0); }
	}
		if( MAX_DX2_RIGHT < 5736.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -2 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_DX2_RIGHT < 5052 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_DX2_RIGHT >= 5052 ) { 
		if( MAX_AMP_LEFT >= 5248 ) { return new Prediction("BOTTOM", 4, 0); }
	if( MAX_AMP_LEFT < 5248 ) { 
		if( DX2_DELTA < 4780.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( DX2_DELTA >= 4780.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_LEFT >= 4345.5 ) { 
	if( MAX_DX2_RIGHT >= 5986.5 ) { 
	if( AVG_AMP_RIGHT < 10.5 ) { 
		if( MAX_AMP_RIGHT < -17348.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_RIGHT >= -17348.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 10.5 ) { return new Prediction("RIGHT", 25, 0); }
	}
		if( MAX_DX2_RIGHT < 5986.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( MAX_DX2_LEFT < 4345.5 ) { 
		if( DX2_DELTA >= 1789 ) { return new Prediction("RIGHT", 58, 0); }
	if( DX2_DELTA < 1789 ) { 
		if( MAX_DX2_RIGHT >= 5547 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT < 5547 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree19() {
	if( MAX_DX2_RIGHT >= 6401 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( MAX_AMP_LEFT < 10335 ) { 
	if( MAX_AMP_LEFT < -4334.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 179.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 179.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= -4334.5 ) { return new Prediction("BOTTOM", 175, 0); }
	}
		if( MAX_AMP_LEFT >= 10335 ) { return new Prediction("TOP", 28, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_LEFT < 9705 ) { 
	if( AMP_DELTA >= 10519 ) { 
		if( AVG_AMP_LEFT < 3 ) { return new Prediction("RIGHT", 78, 0); }
		if( AVG_AMP_LEFT >= 3 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	if( AMP_DELTA < 10519 ) { 
	if( MAX_AMP_LEFT < 7663 ) { 
	if( MAX_DX2_LEFT < 4076.5 ) { 
		if( AVG_DX2_LEFT < -1.44 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT >= -1.44 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 4076.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( MAX_AMP_LEFT >= 7663 ) { 
		if( AVG_AMP_RIGHT < 6 ) { return new Prediction("TOP", 17, 0); }
	if( AVG_AMP_RIGHT >= 6 ) { 
		if( AVG_DX2_RIGHT < -2.16 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT >= -2.16 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 9705 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_DX2_RIGHT >= 4.12 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT < 4.12 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 57, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6401 ) { 
	if( AMP_DELTA < 6596 ) { 
		if( DETECTION_DELTA >= 21 ) { return new Prediction("LEFT", 89, 0); }
	if( DETECTION_DELTA < 21 ) { 
	if( MAX_AMP_LEFT < 5282.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AVG_AMP_RIGHT < 14 ) { 
		if( MAX_DX2_LEFT >= 3774.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_DX2_LEFT < 3774.5 ) { 
		if( FIRST_RIGHT_DETECTION < 161.5 ) { return new Prediction("LEFT", 13, 0); }
	if( FIRST_RIGHT_DETECTION >= 161.5 ) { 
	if( MAX_DX2_RIGHT < 2754 ) { 
		if( AVG_DX2_RIGHT < 0.04 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.04 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 2754 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
		if( AVG_AMP_RIGHT >= 14 ) { return new Prediction("RIGHT", 11, 0); }
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AVG_DX2_RIGHT >= -0.38 ) { 
		if( MAX_DX2_LEFT >= 9547 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 9547 ) { 
		if( DX2_DELTA < 2669.5 ) { return new Prediction("LEFT", 49, 0); }
	if( DX2_DELTA >= 2669.5 ) { 
		if( FIRST_LEFT_DETECTION < 194 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 194 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < -0.38 ) { 
		if( DX2_DELTA < 749 ) { return new Prediction("TOP", 6, 0); }
	if( DX2_DELTA >= 749 ) { 
		if( FIRST_LEFT_DETECTION < 145.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 145.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5282.5 ) { 
		if( AMP_DELTA < 5606.5 ) { return new Prediction("TOP", 91, 0); }
	if( AMP_DELTA >= 5606.5 ) { 
		if( MAX_DX2_RIGHT < 5992 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 5992 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6596 ) { 
	if( MAX_DX2_LEFT < 5957.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( FIRST_RIGHT_DETECTION < 205 ) { return new Prediction("BOTTOM", 5, 0); }
		if( FIRST_RIGHT_DETECTION >= 205 ) { return new Prediction("LEFT", 9, 0); }
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 80, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( MAX_AMP_RIGHT < -10610.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_RIGHT >= -10610.5 ) { 
		if( AVG_DX2_RIGHT < 1.2 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT >= 1.2 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
		if( FIRST_LEFT_DETECTION >= 466.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 466.5 ) { return new Prediction("RIGHT", 30, 0); }
	}
	}
	}
	}
		if( MAX_DX2_LEFT >= 5957.5 ) { return new Prediction("TOP", 9, 0); }
	}
	}
return null;
}
private Prediction runTree20() {
	if( MAX_DX2_LEFT < 3003.5 ) { 
	if( MAX_AMP_RIGHT >= -7994.5 ) { 
	if( AVG_AMP_RIGHT < 17 ) { 
	if( AMP_DELTA < 4414.5 ) { 
		if( MAX_AMP_LEFT < 3915 ) { return new Prediction("LEFT", 146, 0); }
	if( MAX_AMP_LEFT >= 3915 ) { 
	if( FIRST_LEFT_DETECTION >= 147.5 ) { 
		if( AVG_DX2_RIGHT < 4.9 ) { return new Prediction("TOP", 13, 0); }
		if( AVG_DX2_RIGHT >= 4.9 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION < 147.5 ) { 
		if( AVG_AMP_LEFT < 13 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_LEFT >= 13 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( AMP_DELTA >= 4414.5 ) { 
	if( MAX_DX2_RIGHT < 6320.5 ) { 
		if( AVG_DX2_RIGHT < -1.44 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -1.44 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_DX2_RIGHT >= 6320.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 17 ) { 
	if( AVG_AMP_LEFT < 3 ) { 
		if( DX2_DELTA >= 2664 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA < 2664 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( AVG_AMP_LEFT >= 3 ) { 
		if( MAX_AMP_LEFT >= 3250.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 3250.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -7994.5 ) { 
	if( DX2_DELTA < 3537.5 ) { 
	if( AMP_DELTA >= 6599 ) { 
	if( MAX_DX2_RIGHT >= 5123.5 ) { 
		if( AVG_DX2_RIGHT >= 0.3 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT < 0.3 ) { return new Prediction("RIGHT", 10, 0); }
	}
		if( MAX_DX2_RIGHT < 5123.5 ) { return new Prediction("RIGHT", 73, 0); }
	}
	if( AMP_DELTA < 6599 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( AMP_DELTA >= 5424 ) { return new Prediction("LEFT", 6, 0); }
	if( AMP_DELTA < 5424 ) { 
		if( MAX_AMP_LEFT < 4869.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= 4869.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 21, 0); }
	}
	}
	if( DX2_DELTA >= 3537.5 ) { 
	if( AMP_DELTA >= 8023 ) { 
	if( AVG_AMP_RIGHT >= 10 ) { 
		if( AVG_AMP_LEFT >= -6.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_AMP_RIGHT < 10 ) { return new Prediction("BOTTOM", 33, 0); }
	}
		if( AMP_DELTA < 8023 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3003.5 ) { 
	if( MAX_AMP_LEFT >= 7449.5 ) { 
	if( AVG_AMP_RIGHT >= 17.5 ) { 
		if( MAX_DX2_RIGHT < 8569.5 ) { return new Prediction("TOP", 25, 0); }
	if( MAX_DX2_RIGHT >= 8569.5 ) { 
	if( AMP_DELTA < 11625.5 ) { 
		if( FIRST_RIGHT_DETECTION < 176 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 176 ) { return new Prediction("TOP", 4, 0); }
	}
		if( AMP_DELTA >= 11625.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 17.5 ) { 
	if( AMP_DELTA < 11086.5 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("LEFT", 1, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 153, 0); }
	}
		if( AMP_DELTA >= 11086.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	if( MAX_AMP_LEFT < 7449.5 ) { 
	if( MAX_DX2_RIGHT < 8594 ) { 
	if( MAX_DX2_RIGHT >= 5034 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_DX2_LEFT >= 10522 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 10522 ) { 
	if( AVG_AMP_LEFT < 13 ) { 
		if( AMP_DELTA >= 6987 ) { return new Prediction("RIGHT", 63, 0); }
		if( AMP_DELTA < 6987 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_LEFT >= 13 ) { 
		if( AVG_DX2_RIGHT < -0.87 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= -0.87 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	if( MAX_DX2_RIGHT < 5034 ) { 
	if( MAX_DX2_LEFT < 3547 ) { 
		if( AVG_AMP_RIGHT < 6 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_AMP_RIGHT >= 6 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( MAX_DX2_LEFT >= 3547 ) { return new Prediction("TOP", 21, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 8594 ) { 
	if( AVG_AMP_RIGHT >= -2.5 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 8, 0); }
	if( DETECTION_DELTA < 6 ) { 
	if( MAX_AMP_RIGHT >= 15591 ) { 
		if( AVG_DX2_LEFT < -1.55 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_LEFT >= -1.55 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( MAX_AMP_RIGHT < 15591 ) { return new Prediction("RIGHT", 26, 0); }
	}
	}
		if( AVG_AMP_RIGHT < -2.5 ) { return new Prediction("BOTTOM", 107, 0); }
	}
	}
	}
return null;
}
private Prediction runTree21() {
	if( MAX_DX2_LEFT >= 2391.5 ) { 
	if( MAX_DX2_RIGHT >= 7075.5 ) { 
	if( AVG_AMP_LEFT < -12.5 ) { 
	if( AMP_DELTA >= 5974.5 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 41, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AMP_DELTA < 5974.5 ) { return new Prediction("TOP", 12, 0); }
	}
	if( AVG_AMP_LEFT >= -12.5 ) { 
	if( MAX_AMP_LEFT < 11846.5 ) { 
	if( AVG_AMP_RIGHT < 28 ) { 
		if( AMP_DELTA < 4864 ) { return new Prediction("TOP", 6, 0); }
	if( AMP_DELTA >= 4864 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 156, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
	if( AVG_AMP_LEFT < 30.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	if( AVG_AMP_LEFT >= 30.5 ) { 
		if( FIRST_LEFT_DETECTION >= 133 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 133 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
		if( AVG_AMP_RIGHT >= 28 ) { return new Prediction("RIGHT", 10, 0); }
	}
		if( MAX_AMP_LEFT >= 11846.5 ) { return new Prediction("TOP", 34, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 7075.5 ) { 
	if( AMP_DELTA >= 7206 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( MAX_DX2_LEFT >= 6885.5 ) { return new Prediction("TOP", 10, 0); }
		if( MAX_DX2_LEFT < 6885.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
		if( AVG_AMP_RIGHT >= -18 ) { return new Prediction("RIGHT", 87, 0); }
	if( AVG_AMP_RIGHT < -18 ) { 
		if( MAX_DX2_RIGHT < 6250 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 6250 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( AMP_DELTA < 7206 ) { 
	if( MAX_AMP_LEFT < 5041.5 ) { 
	if( AMP_DELTA >= 2700 ) { 
		if( AVG_AMP_RIGHT < 22.5 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_AMP_RIGHT >= 22.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA < 2700 ) { 
		if( FIRST_RIGHT_DETECTION >= 135 ) { return new Prediction("TOP", 9, 0); }
	if( FIRST_RIGHT_DETECTION < 135 ) { 
		if( MAX_AMP_LEFT >= -7441.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_LEFT < -7441.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5041.5 ) { return new Prediction("TOP", 142, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2391.5 ) { 
	if( AMP_DELTA >= 6599 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( DX2_DELTA < 3560.5 ) { 
		if( AMP_DELTA >= 7197 ) { return new Prediction("RIGHT", 46, 0); }
	if( AMP_DELTA < 7197 ) { 
	if( DETECTION_DELTA >= 256.5 ) { 
		if( AVG_DX2_RIGHT < 0.65 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( DETECTION_DELTA < 256.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	if( DX2_DELTA >= 3560.5 ) { 
		if( DX2_DELTA >= 5102 ) { return new Prediction("BOTTOM", 7, 0); }
	if( DX2_DELTA < 5102 ) { 
		if( MAX_DX2_LEFT < 1821.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT >= 1821.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
		if( DX2_DELTA >= 3703.5 ) { return new Prediction("BOTTOM", 11, 0); }
		if( DX2_DELTA < 3703.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( AMP_DELTA < 6599 ) { 
	if( AVG_DX2_RIGHT < -3.36 ) { 
		if( FIRST_RIGHT_DETECTION < 151 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_RIGHT_DETECTION >= 151 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( AVG_DX2_RIGHT >= -3.36 ) { 
	if( MAX_AMP_LEFT < 3991.5 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
		if( AVG_DX2_RIGHT < -0.72 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_DX2_RIGHT >= -0.72 ) { 
	if( AMP_DELTA >= 6203.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 202 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 202 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA < 6203.5 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
		if( AMP_DELTA < 5114.5 ) { return new Prediction("LEFT", 133, 0); }
	}
	if( MAX_AMP_LEFT >= 3991.5 ) { 
		if( MAX_AMP_RIGHT < -8968 ) { return new Prediction("LEFT", 14, 0); }
	if( MAX_AMP_RIGHT >= -8968 ) { 
		if( AVG_DX2_RIGHT >= 2.07 ) { return new Prediction("LEFT", 6, 0); }
		if( AVG_DX2_RIGHT < 2.07 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree22() {
	if( MAX_AMP_LEFT < 6473 ) { 
	if( MAX_DX2_RIGHT >= 6490 ) { 
	if( AVG_AMP_RIGHT >= -2.5 ) { 
	if( MAX_DX2_LEFT < 15378.5 ) { 
	if( MAX_DX2_LEFT < 3424.5 ) { 
		if( DETECTION_DELTA < 9 ) { return new Prediction("RIGHT", 7, 0); }
		if( DETECTION_DELTA >= 9 ) { return new Prediction("BOTTOM", 12, 0); }
	}
	if( MAX_DX2_LEFT >= 3424.5 ) { 
	if( AVG_AMP_LEFT >= -3 ) { 
	if( AVG_DX2_LEFT >= -2.3 ) { 
		if( AVG_AMP_RIGHT >= 41.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_RIGHT < 41.5 ) { return new Prediction("BOTTOM", 11, 0); }
	}
		if( AVG_DX2_LEFT < -2.3 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("RIGHT", 48, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 15378.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AVG_AMP_RIGHT < -2.5 ) { 
		if( MAX_DX2_RIGHT >= 8566.5 ) { return new Prediction("BOTTOM", 93, 0); }
	if( MAX_DX2_RIGHT < 8566.5 ) { 
	if( MAX_DX2_LEFT < 11610.5 ) { 
		if( FIRST_LEFT_DETECTION >= 26.5 ) { return new Prediction("BOTTOM", 40, 0); }
		if( FIRST_LEFT_DETECTION < 26.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 11610.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6490 ) { 
	if( MAX_AMP_RIGHT >= -9914 ) { 
	if( DETECTION_DELTA < 14.5 ) { 
	if( AMP_DELTA >= 3662 ) { 
	if( AVG_AMP_RIGHT >= 21.5 ) { 
		if( FIRST_LEFT_DETECTION >= 283 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 283 ) { return new Prediction("RIGHT", 14, 0); }
	}
	if( AVG_AMP_RIGHT < 21.5 ) { 
	if( AMP_DELTA >= 6862 ) { 
		if( AVG_DX2_RIGHT >= 5.24 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT < 5.24 ) { return new Prediction("TOP", 5, 0); }
	}
	if( AMP_DELTA < 6862 ) { 
	if( MAX_AMP_RIGHT < 348 ) { 
	if( AMP_DELTA < 3955.5 ) { 
		if( AVG_DX2_RIGHT < 2.39 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.39 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA >= 3955.5 ) { return new Prediction("LEFT", 26, 0); }
	}
		if( MAX_AMP_RIGHT >= 348 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 3662 ) { 
	if( MAX_AMP_RIGHT >= -6512 ) { 
	if( AVG_DX2_LEFT < 1.38 ) { 
		if( AVG_DX2_LEFT < -1.18 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -1.18 ) { return new Prediction("LEFT", 37, 0); }
	}
		if( AVG_DX2_LEFT >= 1.38 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_RIGHT < -6512 ) { 
	if( FIRST_RIGHT_DETECTION < 137 ) { 
		if( MAX_AMP_LEFT >= 5146.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT < 5146.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 137 ) { return new Prediction("TOP", 15, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 14.5 ) { 
		if( AVG_AMP_RIGHT < 18.5 ) { return new Prediction("LEFT", 106, 0); }
		if( AVG_AMP_RIGHT >= 18.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -9914 ) { 
	if( AMP_DELTA >= 6947 ) { 
	if( MAX_DX2_LEFT >= 2102 ) { 
		if( MAX_DX2_RIGHT >= 6445 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_DX2_RIGHT < 6445 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("RIGHT", 82, 0); }
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT < 2102 ) { 
		if( AVG_AMP_RIGHT < -17 ) { return new Prediction("BOTTOM", 8, 0); }
	if( AVG_AMP_RIGHT >= -17 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("RIGHT", 19, 0); }
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AMP_DELTA < 6947 ) { 
	if( DX2_DELTA >= 1472 ) { 
	if( MAX_AMP_RIGHT < -11484.5 ) { 
		if( AVG_AMP_RIGHT < -14 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_AMP_RIGHT >= -14 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -11484.5 ) { return new Prediction("LEFT", 14, 0); }
	}
		if( DX2_DELTA < 1472 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6473 ) { 
	if( AMP_DELTA >= 9459.5 ) { 
	if( MAX_AMP_LEFT < 11846.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( MAX_AMP_LEFT >= 10665.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT < 10665.5 ) { return new Prediction("RIGHT", 21, 0); }
	}
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("BOTTOM", 14, 0); }
	}
		if( MAX_AMP_LEFT >= 11846.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AMP_DELTA < 9459.5 ) { 
		if( MAX_DX2_RIGHT >= 13246.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 13246.5 ) { return new Prediction("TOP", 192, 0); }
	}
	}
return null;
}
private Prediction runTree23() {
	if( AMP_DELTA >= 6814 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( AMP_DELTA >= 9459.5 ) { 
		if( AVG_DX2_LEFT < -3.04 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT >= -3.04 ) { return new Prediction("BOTTOM", 25, 0); }
	}
	if( AMP_DELTA < 9459.5 ) { 
		if( AVG_DX2_RIGHT >= 0.58 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT < 0.58 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( FIRST_LEFT_DETECTION >= 49.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( AMP_DELTA >= 22668.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 22668.5 ) { return new Prediction("RIGHT", 170, 0); }
	}
	if( AVG_AMP_LEFT >= 1.5 ) { 
	if( AMP_DELTA >= 11057 ) { 
		if( AVG_DX2_LEFT < 1.04 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT >= 1.04 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA < 11057 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 49.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AMP_DELTA >= 9223 ) { 
	if( DX2_DELTA < 3885.5 ) { 
	if( AVG_AMP_LEFT >= -13 ) { 
		if( AVG_AMP_RIGHT < 15 ) { return new Prediction("BOTTOM", 12, 0); }
		if( AVG_AMP_RIGHT >= 15 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_LEFT < -13 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DX2_DELTA >= 3885.5 ) { return new Prediction("BOTTOM", 132, 0); }
	}
	if( AMP_DELTA < 9223 ) { 
	if( AVG_AMP_LEFT < 11 ) { 
	if( FIRST_RIGHT_DETECTION < 252.5 ) { 
		if( MAX_DX2_RIGHT >= 3045 ) { return new Prediction("RIGHT", 10, 0); }
		if( MAX_DX2_RIGHT < 3045 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 252.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_AMP_LEFT >= 11 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_AMP_LEFT < 5322 ) { 
	if( AVG_AMP_RIGHT < 22 ) { 
		if( MAX_AMP_RIGHT < -11198 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_AMP_RIGHT >= -11198 ) { 
	if( DX2_DELTA < 196 ) { 
		if( FIRST_LEFT_DETECTION >= 158.5 ) { return new Prediction("TOP", 4, 0); }
	if( FIRST_LEFT_DETECTION < 158.5 ) { 
		if( MAX_DX2_RIGHT >= 2584.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT < 2584.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( DX2_DELTA >= 196 ) { 
		if( DX2_DELTA >= 7113 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA < 7113 ) { 
	if( AMP_DELTA < 6192.5 ) { 
	if( AVG_DX2_LEFT < -1.26 ) { 
		if( MAX_DX2_LEFT >= 1693 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 1693 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -1.26 ) { return new Prediction("LEFT", 180, 0); }
	}
	if( AMP_DELTA >= 6192.5 ) { 
		if( FIRST_LEFT_DETECTION < 228 ) { return new Prediction("LEFT", 10, 0); }
		if( FIRST_LEFT_DETECTION >= 228 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 22 ) { 
		if( AVG_DX2_LEFT < -2.41 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_LEFT >= -2.41 ) { 
		if( FIRST_RIGHT_DETECTION < 280.5 ) { return new Prediction("RIGHT", 16, 0); }
		if( FIRST_RIGHT_DETECTION >= 280.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 5322 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("LEFT", 4, 0); }
	if( DETECTION_DELTA >= 1 ) { 
		if( FIRST_LEFT_DETECTION >= 260.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION < 260.5 ) { 
	if( AVG_DX2_RIGHT < -3.17 ) { 
	if( MAX_DX2_LEFT < 4327.5 ) { 
		if( FIRST_LEFT_DETECTION < 220.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 220.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4327.5 ) { return new Prediction("TOP", 29, 0); }
	}
		if( AVG_DX2_RIGHT >= -3.17 ) { return new Prediction("TOP", 154, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree24() {
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_DX2_LEFT >= 2735 ) { 
	if( FIRST_RIGHT_DETECTION < 87 ) { 
		if( AVG_DX2_LEFT < 1.07 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 1.07 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 87 ) { 
		if( MAX_AMP_LEFT >= 6002.5 ) { return new Prediction("TOP", 175, 0); }
	if( MAX_AMP_LEFT < 6002.5 ) { 
		if( FIRST_LEFT_DETECTION < 52 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 52 ) { 
		if( AMP_DELTA < 5192.5 ) { return new Prediction("TOP", 14, 0); }
		if( AMP_DELTA >= 5192.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2735 ) { 
	if( AVG_AMP_RIGHT < 22 ) { 
	if( MAX_AMP_LEFT < 3918 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
	if( DX2_DELTA >= 1143.5 ) { 
	if( DX2_DELTA < 1363.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 118 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 118 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA >= 1363.5 ) { return new Prediction("LEFT", 13, 0); }
	}
		if( DX2_DELTA < 1143.5 ) { return new Prediction("LEFT", 39, 0); }
	}
	if( AVG_AMP_LEFT >= 2.5 ) { 
		if( AVG_AMP_RIGHT >= -26.5 ) { return new Prediction("LEFT", 99, 0); }
	if( AVG_AMP_RIGHT < -26.5 ) { 
		if( FIRST_RIGHT_DETECTION < 195.5 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_RIGHT_DETECTION >= 195.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 3918 ) { 
	if( MAX_DX2_LEFT < 1853.5 ) { 
		if( AMP_DELTA < 4541 ) { return new Prediction("TOP", 8, 0); }
		if( AMP_DELTA >= 4541 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 1853.5 ) { 
	if( MAX_AMP_RIGHT < -6813.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 131.5 ) { return new Prediction("LEFT", 21, 0); }
	if( FIRST_RIGHT_DETECTION < 131.5 ) { 
		if( MAX_AMP_LEFT >= 5753 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < 5753 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -6813.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 254 ) { 
		if( AVG_DX2_RIGHT >= -0.86 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < -0.86 ) { return new Prediction("TOP", 3, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 254 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 22 ) { 
		if( MAX_DX2_RIGHT >= 2869 ) { return new Prediction("RIGHT", 4, 0); }
	if( MAX_DX2_RIGHT < 2869 ) { 
		if( FIRST_RIGHT_DETECTION >= 272 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 272 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( MAX_DX2_RIGHT < 5653.5 ) { 
	if( AMP_DELTA >= 8364 ) { 
		if( FIRST_RIGHT_DETECTION >= 175.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 175.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( AMP_DELTA < 8364 ) { 
		if( MAX_AMP_RIGHT >= -11902.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT < -11902.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5653.5 ) { 
	if( MAX_AMP_LEFT < 5743 ) { 
		if( MAX_AMP_LEFT >= -18893.5 ) { return new Prediction("BOTTOM", 113, 0); }
		if( MAX_AMP_LEFT < -18893.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 5743 ) { 
	if( DX2_DELTA >= 4376 ) { 
		if( MAX_AMP_LEFT >= 21237 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 21237 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	if( DX2_DELTA < 4376 ) { 
		if( FIRST_LEFT_DETECTION >= 190.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION < 190.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( AMP_DELTA >= 9621.5 ) { 
		if( AVG_AMP_RIGHT < -14.5 ) { return new Prediction("BOTTOM", 67, 0); }
	if( AVG_AMP_RIGHT >= -14.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( MAX_DX2_LEFT < 5233 ) { return new Prediction("RIGHT", 88, 0); }
	if( MAX_DX2_LEFT >= 5233 ) { 
		if( AVG_DX2_RIGHT < -3.16 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -3.16 ) { return new Prediction("RIGHT", 28, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_RIGHT < 6166.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_RIGHT >= 6166.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	}
	if( AMP_DELTA < 9621.5 ) { 
	if( MAX_DX2_LEFT < 7476.5 ) { 
		if( DETECTION_DELTA < 520 ) { return new Prediction("RIGHT", 55, 0); }
		if( DETECTION_DELTA >= 520 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 7476.5 ) { 
		if( AVG_AMP_LEFT >= -30 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_AMP_LEFT < -30 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree25() {
	if( AMP_DELTA >= 7262 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA >= 7113 ) { 
	if( MAX_DX2_LEFT < 11974 ) { 
		if( AVG_DX2_RIGHT < -5.04 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -5.04 ) { return new Prediction("BOTTOM", 20, 0); }
	}
		if( MAX_DX2_LEFT >= 11974 ) { return new Prediction("TOP", 7, 0); }
	}
	if( DX2_DELTA < 7113 ) { 
	if( AVG_AMP_LEFT >= 7 ) { 
		if( AVG_DX2_RIGHT >= 4.54 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_RIGHT < 4.54 ) { 
	if( FIRST_RIGHT_DETECTION < 245.5 ) { 
		if( MAX_DX2_LEFT < 3713.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_LEFT >= 3713.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 245.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7 ) { 
	if( MAX_DX2_LEFT < 8020.5 ) { 
	if( AVG_DX2_RIGHT < -5.08 ) { 
		if( MAX_DX2_RIGHT < 7613 ) { return new Prediction("RIGHT", 16, 0); }
	if( MAX_DX2_RIGHT >= 7613 ) { 
		if( AVG_DX2_RIGHT < -7.19 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -7.19 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= -5.08 ) { return new Prediction("RIGHT", 141, 0); }
	}
	if( MAX_DX2_LEFT >= 8020.5 ) { 
		if( AVG_DX2_RIGHT >= 2.9 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 2.9 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_RIGHT < 5516.5 ) { 
		if( FIRST_RIGHT_DETECTION < 241.5 ) { return new Prediction("RIGHT", 12, 0); }
		if( FIRST_RIGHT_DETECTION >= 241.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 5516.5 ) { return new Prediction("BOTTOM", 161, 0); }
	}
	}
	if( AMP_DELTA < 7262 ) { 
	if( MAX_DX2_LEFT < 3037 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
	if( MAX_AMP_RIGHT >= -10065.5 ) { 
	if( AMP_DELTA >= 6740.5 ) { 
		if( FIRST_LEFT_DETECTION < 446 ) { return new Prediction("RIGHT", 7, 0); }
	if( FIRST_LEFT_DETECTION >= 446 ) { 
		if( MAX_AMP_RIGHT >= -7127.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT < -7127.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA < 6740.5 ) { 
		if( AVG_AMP_RIGHT < 8.5 ) { return new Prediction("LEFT", 12, 0); }
	if( AVG_AMP_RIGHT >= 8.5 ) { 
		if( DX2_DELTA >= 1280.5 ) { return new Prediction("LEFT", 5, 0); }
		if( DX2_DELTA < 1280.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
		if( MAX_AMP_RIGHT < -10065.5 ) { return new Prediction("LEFT", 32, 0); }
	}
	if( AMP_DELTA < 5114.5 ) { 
	if( MAX_DX2_LEFT >= 2108.5 ) { 
	if( FIRST_LEFT_DETECTION >= 210 ) { 
		if( FIRST_LEFT_DETECTION < 265 ) { return new Prediction("TOP", 10, 0); }
	if( FIRST_LEFT_DETECTION >= 265 ) { 
		if( AVG_DX2_RIGHT >= 1.91 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 1.91 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 210 ) { 
	if( AVG_DX2_RIGHT >= -4.56 ) { 
		if( DETECTION_DELTA >= 23 ) { return new Prediction("LEFT", 12, 0); }
	if( DETECTION_DELTA < 23 ) { 
	if( MAX_DX2_LEFT < 2462.5 ) { 
		if( DX2_DELTA < 932 ) { return new Prediction("TOP", 4, 0); }
		if( DX2_DELTA >= 932 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 2462.5 ) { return new Prediction("LEFT", 14, 0); }
	}
	}
		if( AVG_DX2_RIGHT < -4.56 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( MAX_DX2_LEFT < 2108.5 ) { 
	if( AVG_DX2_LEFT >= -1.29 ) { 
	if( AMP_DELTA >= 3751 ) { 
		if( MAX_AMP_LEFT < 4051.5 ) { return new Prediction("LEFT", 19, 0); }
		if( MAX_AMP_LEFT >= 4051.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AMP_DELTA < 3751 ) { return new Prediction("LEFT", 95, 0); }
	}
	if( AVG_DX2_LEFT < -1.29 ) { 
		if( AVG_DX2_LEFT >= -3.21 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT < -3.21 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3037 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
	if( MAX_DX2_LEFT >= 6322.5 ) { 
		if( AVG_DX2_LEFT >= -0.63 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < -0.63 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 6322.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( MAX_DX2_LEFT < 4317.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( MAX_DX2_LEFT < 4284.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_LEFT >= 4284.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA >= 7.5 ) { return new Prediction("TOP", 7, 0); }
	}
		if( MAX_DX2_LEFT >= 4317.5 ) { return new Prediction("TOP", 191, 0); }
	}
	}
	}
return null;
}
private Prediction runTree26() {
	if( AMP_DELTA >= 6869.5 ) { 
	if( AVG_AMP_RIGHT >= -13 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( MAX_DX2_RIGHT < 5521 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( MAX_AMP_RIGHT < -8230 ) { return new Prediction("RIGHT", 35, 0); }
		if( MAX_AMP_RIGHT >= -8230 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_RIGHT >= 5521 ) { 
	if( MAX_AMP_LEFT >= -3418.5 ) { 
	if( AVG_AMP_LEFT >= -9 ) { 
		if( AMP_DELTA < 8072 ) { return new Prediction("LEFT", 2, 0); }
		if( AMP_DELTA >= 8072 ) { return new Prediction("BOTTOM", 37, 0); }
	}
		if( AVG_AMP_LEFT < -9 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_AMP_LEFT < -3418.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
	if( DX2_DELTA >= 5780.5 ) { 
	if( AVG_AMP_RIGHT < 34 ) { 
		if( MAX_DX2_RIGHT < 15364 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_RIGHT >= 15364 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 34 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( DX2_DELTA < 5780.5 ) { return new Prediction("RIGHT", 146, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -13 ) { 
	if( MAX_DX2_RIGHT < 6092.5 ) { 
		if( MAX_DX2_LEFT >= 5113 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 5113 ) { 
		if( AVG_DX2_RIGHT >= 6.57 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_DX2_RIGHT < 6.57 ) { 
		if( MAX_AMP_LEFT < 167.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_AMP_LEFT >= 167.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6092.5 ) { 
		if( DETECTION_DELTA >= 5 ) { return new Prediction("BOTTOM", 186, 0); }
	if( DETECTION_DELTA < 5 ) { 
		if( MAX_DX2_RIGHT >= 10140.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( MAX_DX2_RIGHT < 10140.5 ) { 
		if( MAX_DX2_LEFT < 6160.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 6160.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6869.5 ) { 
	if( MAX_AMP_LEFT >= 4814.5 ) { 
	if( MAX_DX2_LEFT < 4317.5 ) { 
	if( MAX_DX2_RIGHT >= 5871 ) { 
		if( FIRST_RIGHT_DETECTION >= 165.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 165.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 5871 ) { 
		if( AMP_DELTA < 5718.5 ) { return new Prediction("TOP", 21, 0); }
		if( AMP_DELTA >= 5718.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 4317.5 ) { 
	if( AVG_AMP_LEFT >= 33 ) { 
		if( AVG_AMP_LEFT < 36 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT >= 36 ) { return new Prediction("TOP", 10, 0); }
	}
		if( AVG_AMP_LEFT < 33 ) { return new Prediction("TOP", 113, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4814.5 ) { 
	if( DX2_DELTA >= 3945 ) { 
		if( MAX_DX2_RIGHT < 10479 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 10479 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DX2_DELTA < 3945 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
	if( MAX_DX2_RIGHT >= 3549.5 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 33, 0); }
		if( AVG_AMP_RIGHT < -25.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 3549.5 ) { 
		if( MAX_AMP_LEFT < 3399 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_AMP_LEFT >= 3399 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA < 5114.5 ) { 
	if( MAX_AMP_LEFT >= 3538 ) { 
	if( FIRST_LEFT_DETECTION >= 157 ) { 
		if( FIRST_RIGHT_DETECTION >= 158.5 ) { return new Prediction("TOP", 9, 0); }
		if( FIRST_RIGHT_DETECTION < 158.5 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( FIRST_LEFT_DETECTION < 157 ) { return new Prediction("LEFT", 19, 0); }
	}
		if( MAX_AMP_LEFT < 3538 ) { return new Prediction("LEFT", 124, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree27() {
	if( MAX_DX2_RIGHT < 5638 ) { 
	if( MAX_AMP_LEFT < 5882.5 ) { 
	if( AVG_AMP_RIGHT < 15.5 ) { 
	if( AMP_DELTA < 6805.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( MAX_AMP_RIGHT < 5525.5 ) { 
		if( DX2_DELTA < 274 ) { return new Prediction("TOP", 7, 0); }
	if( DX2_DELTA >= 274 ) { 
	if( FIRST_RIGHT_DETECTION < 161.5 ) { 
		if( AVG_AMP_LEFT < 35 ) { return new Prediction("LEFT", 28, 0); }
		if( AVG_AMP_LEFT >= 35 ) { return new Prediction("TOP", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 161.5 ) { 
		if( MAX_AMP_LEFT >= 4293 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 4293 ) { 
		if( AVG_DX2_LEFT < 2.06 ) { return new Prediction("LEFT", 10, 0); }
		if( AVG_DX2_LEFT >= 2.06 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
		if( MAX_AMP_RIGHT >= 5525.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( AVG_DX2_LEFT >= 0.05 ) { 
	if( AVG_AMP_RIGHT < -23.5 ) { 
		if( MAX_DX2_LEFT < 1687 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 1687 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -23.5 ) { 
		if( DX2_DELTA >= 718 ) { return new Prediction("LEFT", 20, 0); }
	if( DX2_DELTA < 718 ) { 
		if( FIRST_LEFT_DETECTION < 51 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 51 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( AVG_DX2_LEFT < 0.05 ) { return new Prediction("LEFT", 132, 0); }
	}
	}
	if( AMP_DELTA >= 6805.5 ) { 
	if( DETECTION_DELTA < 13.5 ) { 
		if( AMP_DELTA >= 13202.5 ) { return new Prediction("TOP", 5, 0); }
	if( AMP_DELTA < 13202.5 ) { 
	if( MAX_AMP_LEFT >= 3626 ) { 
		if( AVG_DX2_RIGHT < 0.86 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.86 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( MAX_AMP_LEFT < 3626 ) { return new Prediction("RIGHT", 28, 0); }
	}
	}
		if( DETECTION_DELTA >= 13.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 15.5 ) { 
		if( AVG_DX2_RIGHT < 1.85 ) { return new Prediction("RIGHT", 73, 0); }
	if( AVG_DX2_RIGHT >= 1.85 ) { 
		if( MAX_DX2_LEFT < 2226 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT >= 2226 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5882.5 ) { return new Prediction("TOP", 74, 0); }
	}
	if( MAX_DX2_RIGHT >= 5638 ) { 
	if( AMP_DELTA >= 8052.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA < 6337.5 ) { 
	if( AVG_AMP_RIGHT >= -5 ) { 
	if( DX2_DELTA >= 5914.5 ) { 
		if( DX2_DELTA >= 6005.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( DX2_DELTA < 6005.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA < 5914.5 ) { return new Prediction("RIGHT", 80, 0); }
	}
	if( AVG_AMP_RIGHT < -5 ) { 
	if( FIRST_LEFT_DETECTION < 236 ) { 
		if( MAX_DX2_RIGHT < 8444.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT >= 8444.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 236 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( DX2_DELTA >= 6337.5 ) { 
	if( MAX_DX2_LEFT < 8665.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 121.5 ) { return new Prediction("BOTTOM", 22, 0); }
		if( FIRST_RIGHT_DETECTION < 121.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 8665.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_RIGHT >= 5907.5 ) { return new Prediction("BOTTOM", 153, 0); }
	if( MAX_DX2_RIGHT < 5907.5 ) { 
		if( FIRST_LEFT_DETECTION < 197 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 197 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	}
	if( AMP_DELTA < 8052.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_AMP_RIGHT >= 26 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_AMP_RIGHT < 26 ) { 
		if( MAX_AMP_RIGHT >= 2457 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT < 2457 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_DX2_LEFT >= 3971.5 ) { return new Prediction("TOP", 114, 0); }
	if( MAX_DX2_LEFT < 3971.5 ) { 
		if( MAX_AMP_LEFT < 5357.5 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_AMP_LEFT >= 5357.5 ) { 
		if( AVG_DX2_LEFT >= 2.37 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 2.37 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree28() {
	if( MAX_DX2_RIGHT >= 5527.5 ) { 
	if( AMP_DELTA >= 7608.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA < 6337.5 ) { 
		if( FIRST_LEFT_DETECTION >= 267.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_LEFT_DETECTION < 267.5 ) { 
		if( AVG_AMP_LEFT < -2.5 ) { return new Prediction("RIGHT", 91, 0); }
	if( AVG_AMP_LEFT >= -2.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
		if( AVG_DX2_LEFT >= -1.82 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < -1.82 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT < 14.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( DX2_DELTA >= 6337.5 ) { 
		if( AMP_DELTA >= 19568.5 ) { return new Prediction("BOTTOM", 10, 0); }
	if( AMP_DELTA < 19568.5 ) { 
		if( MAX_DX2_LEFT < 16742.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_DX2_LEFT >= 16742.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_DX2_RIGHT >= 2.85 ) { 
		if( MAX_AMP_LEFT >= -7 ) { return new Prediction("BOTTOM", 18, 0); }
		if( MAX_AMP_LEFT < -7 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 2.85 ) { return new Prediction("BOTTOM", 171, 0); }
	}
	}
	if( AMP_DELTA < 7608.5 ) { 
	if( MAX_AMP_LEFT < 7700 ) { 
		if( MAX_AMP_RIGHT < -15246 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_AMP_RIGHT >= -15246 ) { 
		if( FIRST_RIGHT_DETECTION < 225.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION >= 225.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 7700 ) { return new Prediction("TOP", 114, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5527.5 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
	if( MAX_AMP_RIGHT >= -10904.5 ) { 
		if( MAX_DX2_LEFT >= 5401.5 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_DX2_LEFT < 5401.5 ) { 
	if( MAX_AMP_LEFT < 3968.5 ) { 
	if( MAX_AMP_RIGHT < -8502 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( MAX_AMP_LEFT < 2634.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT >= 2634.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( MAX_DX2_LEFT < 2025 ) { return new Prediction("LEFT", 10, 0); }
		if( MAX_DX2_LEFT >= 2025 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= -8502 ) { return new Prediction("LEFT", 126, 0); }
	}
	if( MAX_AMP_LEFT >= 3968.5 ) { 
	if( AVG_AMP_LEFT < 14.5 ) { 
		if( DX2_DELTA >= 1281.5 ) { return new Prediction("LEFT", 10, 0); }
		if( DX2_DELTA < 1281.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_AMP_LEFT >= 14.5 ) { return new Prediction("LEFT", 15, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -10904.5 ) { 
	if( AVG_AMP_RIGHT < -29 ) { 
		if( FIRST_RIGHT_DETECTION >= 232.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 232.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= -29 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4800.5 ) { 
	if( MAX_AMP_LEFT < 5882.5 ) { 
		if( MAX_DX2_RIGHT < 5103.5 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 5103.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 5882.5 ) { return new Prediction("TOP", 51, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 5.5 ) { 
	if( AMP_DELTA >= 4180.5 ) { 
	if( AMP_DELTA >= 7185 ) { 
	if( FIRST_LEFT_DETECTION >= 79.5 ) { 
	if( FIRST_RIGHT_DETECTION < 137.5 ) { 
		if( MAX_AMP_LEFT < 14247.5 ) { return new Prediction("RIGHT", 15, 0); }
		if( MAX_AMP_LEFT >= 14247.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 137.5 ) { return new Prediction("RIGHT", 54, 0); }
	}
		if( FIRST_LEFT_DETECTION < 79.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AMP_DELTA < 7185 ) { 
	if( AVG_DX2_RIGHT < 2.5 ) { 
	if( MAX_DX2_RIGHT < 5215 ) { 
	if( MAX_DX2_LEFT >= 1378 ) { 
		if( MAX_DX2_RIGHT < 4746.5 ) { return new Prediction("RIGHT", 17, 0); }
	if( MAX_DX2_RIGHT >= 4746.5 ) { 
		if( AVG_DX2_RIGHT < -1.37 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= -1.37 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_DX2_LEFT < 1378 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_DX2_RIGHT >= 5215 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( AVG_DX2_RIGHT >= 2.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	if( AMP_DELTA < 4180.5 ) { 
		if( MAX_AMP_LEFT >= 3500 ) { return new Prediction("TOP", 13, 0); }
		if( MAX_AMP_LEFT < 3500 ) { return new Prediction("LEFT", 16, 0); }
	}
	}
	}
return null;
}
private Prediction runTree29() {
	if( AMP_DELTA < 7190.5 ) { 
	if( MAX_DX2_RIGHT < 5188.5 ) { 
	if( MAX_AMP_RIGHT >= -6716.5 ) { 
	if( FIRST_LEFT_DETECTION < 220.5 ) { 
	if( AVG_AMP_RIGHT < 7 ) { 
		if( MAX_AMP_LEFT < 5537.5 ) { return new Prediction("LEFT", 109, 0); }
		if( MAX_AMP_LEFT >= 5537.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= 7 ) { 
		if( MAX_AMP_RIGHT < -6032 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_AMP_RIGHT >= -6032 ) { 
		if( MAX_AMP_RIGHT >= 7019 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT < 7019 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION >= 220.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 237.5 ) { 
		if( MAX_AMP_LEFT < 3074 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_LEFT >= 3074 ) { return new Prediction("TOP", 9, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 237.5 ) { return new Prediction("LEFT", 18, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -6716.5 ) { 
	if( MAX_AMP_LEFT >= 5007 ) { 
		if( AVG_AMP_RIGHT < 51.5 ) { return new Prediction("TOP", 44, 0); }
		if( AVG_AMP_RIGHT >= 51.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_AMP_LEFT < 5007 ) { 
	if( MAX_DX2_RIGHT >= 3564 ) { 
		if( MAX_DX2_LEFT >= 1577.5 ) { return new Prediction("LEFT", 40, 0); }
	if( MAX_DX2_LEFT < 1577.5 ) { 
		if( AVG_DX2_LEFT < 0.03 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT >= 0.03 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 3564 ) { 
	if( AVG_AMP_RIGHT < 0 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("LEFT", 6, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( FIRST_LEFT_DETECTION >= 103 ) { return new Prediction("TOP", 5, 0); }
		if( FIRST_LEFT_DETECTION < 103 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 0 ) { 
		if( AMP_DELTA < 5390.5 ) { return new Prediction("LEFT", 3, 0); }
	if( AMP_DELTA >= 5390.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 140.5 ) { return new Prediction("RIGHT", 10, 0); }
		if( FIRST_RIGHT_DETECTION < 140.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5188.5 ) { 
	if( MAX_AMP_RIGHT < -12153.5 ) { 
	if( MAX_AMP_LEFT < 8952.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 6, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 8952.5 ) { return new Prediction("TOP", 116, 0); }
	}
	if( MAX_AMP_RIGHT >= -12153.5 ) { 
	if( AMP_DELTA >= 4664.5 ) { 
		if( AVG_DX2_RIGHT < -2.96 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT >= -2.96 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( AMP_DELTA < 4664.5 ) { 
		if( MAX_DX2_LEFT >= 3130.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_LEFT < 3130.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 7190.5 ) { 
	if( AMP_DELTA < 11447 ) { 
	if( MAX_DX2_LEFT >= 7920.5 ) { 
		if( AVG_AMP_LEFT < -8.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT >= -8.5 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_DX2_LEFT < 7920.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( MAX_DX2_LEFT < 3821 ) { return new Prediction("RIGHT", 103, 0); }
	if( MAX_DX2_LEFT >= 3821 ) { 
		if( MAX_DX2_LEFT >= 3965.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( MAX_DX2_LEFT < 3965.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( AVG_DX2_RIGHT >= 0.63 ) { return new Prediction("LEFT", 6, 0); }
		if( AVG_DX2_RIGHT < 0.63 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_AMP_LEFT >= -13 ) { return new Prediction("BOTTOM", 27, 0); }
		if( AVG_AMP_LEFT < -13 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 11447 ) { 
	if( AVG_AMP_LEFT >= -9.5 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( MAX_AMP_RIGHT < -16089.5 ) { 
		if( DETECTION_DELTA < 5.5 ) { return new Prediction("RIGHT", 13, 0); }
	if( DETECTION_DELTA >= 5.5 ) { 
		if( DX2_DELTA >= 3967.5 ) { return new Prediction("BOTTOM", 16, 0); }
		if( DX2_DELTA < 3967.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= -16089.5 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( AVG_DX2_LEFT >= 2.09 ) { 
		if( FIRST_LEFT_DETECTION >= 169 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION < 169 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < 2.09 ) { return new Prediction("BOTTOM", 119, 0); }
	}
	}
	if( AVG_AMP_LEFT < -9.5 ) { 
		if( AVG_AMP_RIGHT >= -18 ) { return new Prediction("RIGHT", 69, 0); }
	if( AVG_AMP_RIGHT < -18 ) { 
	if( MAX_DX2_RIGHT < 6914 ) { 
		if( MAX_AMP_RIGHT < -13363 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT >= -13363 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 6914 ) { return new Prediction("BOTTOM", 14, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree30() {
	if( AMP_DELTA >= 6861 ) { 
	if( MAX_AMP_LEFT < 3024 ) { 
	if( DX2_DELTA >= 5308.5 ) { 
		if( MAX_AMP_LEFT >= -5494 ) { return new Prediction("BOTTOM", 27, 0); }
	if( MAX_AMP_LEFT < -5494 ) { 
	if( MAX_DX2_LEFT >= 7265 ) { 
		if( MAX_AMP_LEFT < -9602 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT >= -9602 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_LEFT < 7265 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( DX2_DELTA < 5308.5 ) { 
		if( DETECTION_DELTA < 9.5 ) { return new Prediction("RIGHT", 116, 0); }
	if( DETECTION_DELTA >= 9.5 ) { 
	if( AMP_DELTA >= 8032.5 ) { 
		if( AVG_DX2_RIGHT >= -5.41 ) { return new Prediction("BOTTOM", 14, 0); }
		if( AVG_DX2_RIGHT < -5.41 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 8032.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 3024 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_RIGHT >= 3.5 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( FIRST_LEFT_DETECTION < 72 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 72 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_AMP_RIGHT >= 9.5 ) { return new Prediction("RIGHT", 70, 0); }
	}
	if( AVG_AMP_LEFT >= 8.5 ) { 
	if( MAX_DX2_RIGHT < 7662.5 ) { 
		if( AVG_DX2_LEFT >= 1.68 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 1.68 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 7662.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 3.5 ) { 
		if( MAX_DX2_RIGHT >= 10846.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( MAX_DX2_RIGHT < 10846.5 ) { 
	if( DX2_DELTA < 5181.5 ) { 
		if( AVG_DX2_LEFT < -5.01 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT >= -5.01 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( DX2_DELTA >= 5181.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_AMP_LEFT >= -14.5 ) { 
		if( AVG_DX2_RIGHT < 5.77 ) { return new Prediction("BOTTOM", 142, 0); }
		if( AVG_DX2_RIGHT >= 5.77 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_LEFT < -14.5 ) { 
		if( MAX_DX2_LEFT >= 3310 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_LEFT < 3310 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6861 ) { 
	if( MAX_DX2_LEFT < 2943 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( DX2_DELTA < 1760 ) { 
		if( MAX_DX2_LEFT >= 1378 ) { return new Prediction("RIGHT", 12, 0); }
		if( MAX_DX2_LEFT < 1378 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 1760 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( DETECTION_DELTA < 19.5 ) { 
	if( MAX_AMP_LEFT < 4599 ) { 
	if( DETECTION_DELTA < 15.5 ) { 
		if( AVG_DX2_LEFT < 0.78 ) { return new Prediction("LEFT", 66, 0); }
	if( AVG_DX2_LEFT >= 0.78 ) { 
		if( MAX_DX2_RIGHT >= 3122.5 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_DX2_RIGHT < 3122.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 15.5 ) { 
		if( AVG_DX2_RIGHT < -0.28 ) { return new Prediction("TOP", 1, 0); }
	if( AVG_DX2_RIGHT >= -0.28 ) { 
		if( FIRST_RIGHT_DETECTION < 169.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 169.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4599 ) { 
		if( AVG_DX2_RIGHT >= 3.6 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 3.6 ) { return new Prediction("TOP", 14, 0); }
	}
	}
		if( DETECTION_DELTA >= 19.5 ) { return new Prediction("LEFT", 106, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2943 ) { 
		if( MAX_AMP_RIGHT < -11932 ) { return new Prediction("TOP", 112, 0); }
	if( MAX_AMP_RIGHT >= -11932 ) { 
		if( AMP_DELTA < 4133 ) { return new Prediction("TOP", 57, 0); }
	if( AMP_DELTA >= 4133 ) { 
		if( MAX_AMP_LEFT < 5383 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_AMP_LEFT >= 5383 ) { 
		if( AVG_DX2_LEFT >= -0.16 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < -0.16 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree31() {
	if( AMP_DELTA >= 6869.5 ) { 
	if( AVG_AMP_RIGHT >= -7.5 ) { 
	if( DX2_DELTA < 5616 ) { 
	if( MAX_DX2_LEFT < 611 ) { 
		if( AVG_DX2_RIGHT < 0.65 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_LEFT >= 611 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( AVG_AMP_RIGHT >= 10 ) { return new Prediction("RIGHT", 145, 0); }
	if( AVG_AMP_RIGHT < 10 ) { 
		if( MAX_DX2_RIGHT < 5973.5 ) { return new Prediction("RIGHT", 22, 0); }
	if( MAX_DX2_RIGHT >= 5973.5 ) { 
		if( MAX_DX2_RIGHT >= 8103.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_DX2_RIGHT < 8103.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 8.5 ) { 
		if( AVG_AMP_LEFT >= 17.5 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_AMP_LEFT < 17.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	if( DX2_DELTA >= 5616 ) { 
		if( AVG_AMP_LEFT < -7.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( AVG_AMP_LEFT >= -7.5 ) { 
	if( FIRST_LEFT_DETECTION < 162 ) { 
		if( DX2_DELTA < 9846 ) { return new Prediction("BOTTOM", 5, 0); }
		if( DX2_DELTA >= 9846 ) { return new Prediction("TOP", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 162 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < -7.5 ) { 
	if( DX2_DELTA >= 3284.5 ) { 
	if( DX2_DELTA < 13093 ) { 
		if( AMP_DELTA >= 7619.5 ) { return new Prediction("BOTTOM", 154, 0); }
		if( AMP_DELTA < 7619.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DX2_DELTA >= 13093 ) { return new Prediction("TOP", 6, 0); }
	}
	if( DX2_DELTA < 3284.5 ) { 
		if( MAX_AMP_LEFT < -377 ) { return new Prediction("RIGHT", 6, 0); }
	if( MAX_AMP_LEFT >= -377 ) { 
		if( FIRST_LEFT_DETECTION < 181.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 181.5 ) { 
		if( AVG_DX2_RIGHT >= 3.29 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.29 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6869.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( MAX_DX2_LEFT < 3654.5 ) { 
	if( MAX_AMP_RIGHT >= -9586.5 ) { 
	if( DX2_DELTA < 1381 ) { 
		if( MAX_DX2_RIGHT < 2110 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 2110 ) { return new Prediction("RIGHT", 9, 0); }
	}
	if( DX2_DELTA >= 1381 ) { 
		if( FIRST_LEFT_DETECTION < 227.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 227.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -9586.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_LEFT >= 3654.5 ) { 
	if( MAX_DX2_LEFT < 4327.5 ) { 
		if( AVG_DX2_LEFT < -0.69 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= -0.69 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 4327.5 ) { return new Prediction("TOP", 31, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( DETECTION_DELTA < 20.5 ) { 
	if( MAX_DX2_LEFT >= 2402.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 157.5 ) { return new Prediction("TOP", 109, 0); }
	if( FIRST_RIGHT_DETECTION < 157.5 ) { 
	if( FIRST_LEFT_DETECTION < 153.5 ) { 
		if( MAX_DX2_RIGHT >= 2390 ) { return new Prediction("TOP", 65, 0); }
		if( MAX_DX2_RIGHT < 2390 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 153.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT < 2402.5 ) { 
	if( MAX_AMP_LEFT < 3968.5 ) { 
		if( AMP_DELTA < 6442.5 ) { return new Prediction("LEFT", 66, 0); }
	if( AMP_DELTA >= 6442.5 ) { 
		if( MAX_DX2_LEFT >= 1721.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_LEFT < 1721.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3968.5 ) { 
		if( AVG_DX2_RIGHT >= 2.37 ) { return new Prediction("LEFT", 13, 0); }
		if( AVG_DX2_RIGHT < 2.37 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 20.5 ) { return new Prediction("LEFT", 114, 0); }
	}
	}
return null;
}
private Prediction runTree32() {
	if( MAX_DX2_RIGHT >= 6224.5 ) { 
	if( MAX_AMP_LEFT < 10304 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA >= 8285 ) { 
		if( AVG_DX2_RIGHT < -0.87 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= -0.87 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DX2_DELTA < 8285 ) { return new Prediction("RIGHT", 76, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 49, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( AMP_DELTA >= 7726 ) { 
		if( MAX_DX2_LEFT < 18665.5 ) { return new Prediction("BOTTOM", 133, 0); }
		if( MAX_DX2_LEFT >= 18665.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA < 7726 ) { 
	if( AVG_DX2_RIGHT >= -1.12 ) { 
		if( AVG_AMP_RIGHT < -48.5 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_AMP_RIGHT >= -48.5 ) { 
	if( AVG_DX2_LEFT < -2.19 ) { 
		if( AVG_DX2_RIGHT < 5.96 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= 5.96 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -2.19 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( AVG_DX2_RIGHT < -1.12 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 10304 ) { 
	if( MAX_AMP_RIGHT < -22684.5 ) { 
		if( MAX_DX2_LEFT < 13450.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 13450.5 ) { return new Prediction("TOP", 5, 0); }
	}
		if( MAX_AMP_RIGHT >= -22684.5 ) { return new Prediction("TOP", 70, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6224.5 ) { 
	if( DETECTION_DELTA < 20.5 ) { 
	if( MAX_DX2_LEFT < 4264 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_AMP_LEFT >= 5047.5 ) { 
	if( FIRST_RIGHT_DETECTION < 258 ) { 
		if( DX2_DELTA >= 2086.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA < 2086.5 ) { return new Prediction("TOP", 19, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 258 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_AMP_LEFT < 5047.5 ) { 
	if( DX2_DELTA < 460.5 ) { 
		if( AVG_DX2_LEFT >= 0.05 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT < 0.05 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DX2_DELTA >= 460.5 ) { 
		if( AMP_DELTA < 6880.5 ) { return new Prediction("LEFT", 68, 0); }
	if( AMP_DELTA >= 6880.5 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( AMP_DELTA < 6786 ) { 
		if( FIRST_RIGHT_DETECTION >= 243 ) { return new Prediction("RIGHT", 13, 0); }
	if( FIRST_RIGHT_DETECTION < 243 ) { 
	if( MAX_AMP_LEFT >= 4188.5 ) { 
		if( FIRST_LEFT_DETECTION >= 100 ) { return new Prediction("TOP", 12, 0); }
		if( FIRST_LEFT_DETECTION < 100 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_AMP_LEFT < 4188.5 ) { 
		if( AVG_AMP_LEFT < 2 ) { return new Prediction("LEFT", 26, 0); }
	if( AVG_AMP_LEFT >= 2 ) { 
		if( AVG_DX2_LEFT < -0.04 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.04 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
		if( DETECTION_DELTA < 15.5 ) { return new Prediction("RIGHT", 115, 0); }
		if( DETECTION_DELTA >= 15.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 4264 ) { return new Prediction("TOP", 91, 0); }
	}
	if( DETECTION_DELTA >= 20.5 ) { 
	if( AMP_DELTA >= 6872.5 ) { 
		if( FIRST_LEFT_DETECTION < 467.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_LEFT_DETECTION >= 467.5 ) { 
		if( AVG_DX2_RIGHT < 0.65 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( AMP_DELTA < 6872.5 ) { return new Prediction("LEFT", 99, 0); }
	}
	}
return null;
}
private Prediction runTree33() {
	if( MAX_AMP_LEFT >= 6035 ) { 
	if( MAX_AMP_RIGHT < -26932 ) { 
	if( FIRST_LEFT_DETECTION < 151 ) { 
		if( MAX_DX2_LEFT >= 4753.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_LEFT < 4753.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 151 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( MAX_AMP_RIGHT >= -26932 ) { 
	if( DETECTION_DELTA < 1 ) { 
	if( FIRST_RIGHT_DETECTION >= 160 ) { 
		if( AVG_DX2_LEFT >= -2.04 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < -2.04 ) { return new Prediction("TOP", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 160 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( DETECTION_DELTA >= 1 ) { 
		if( MAX_AMP_LEFT >= 9365.5 ) { return new Prediction("TOP", 133, 0); }
	if( MAX_AMP_LEFT < 9365.5 ) { 
		if( MAX_DX2_RIGHT < 8269 ) { return new Prediction("TOP", 37, 0); }
	if( MAX_DX2_RIGHT >= 8269 ) { 
		if( MAX_AMP_RIGHT >= -23700 ) { return new Prediction("BOTTOM", 9, 0); }
	if( MAX_AMP_RIGHT < -23700 ) { 
		if( FIRST_LEFT_DETECTION >= 147 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 147 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 6035 ) { 
	if( DX2_DELTA >= 3431.5 ) { 
	if( AVG_AMP_RIGHT < 24.5 ) { 
	if( MAX_DX2_LEFT < 7367.5 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( MAX_DX2_RIGHT >= 6418.5 ) { 
		if( AVG_AMP_LEFT >= 38 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT < 38 ) { return new Prediction("BOTTOM", 154, 0); }
	}
	if( MAX_DX2_RIGHT < 6418.5 ) { 
		if( MAX_AMP_LEFT >= 3661 ) { return new Prediction("LEFT", 6, 0); }
	if( MAX_AMP_LEFT < 3661 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
		if( MAX_DX2_LEFT < 1647.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 1647.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
		if( DETECTION_DELTA < 7.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( DETECTION_DELTA >= 7.5 ) { 
		if( AVG_AMP_RIGHT >= 6.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT < 6.5 ) { return new Prediction("BOTTOM", 17, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 7367.5 ) { return new Prediction("TOP", 21, 0); }
	}
	if( AVG_AMP_RIGHT >= 24.5 ) { 
		if( AMP_DELTA >= 20765 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AMP_DELTA < 20765 ) { 
		if( DX2_DELTA < 6777.5 ) { return new Prediction("RIGHT", 38, 0); }
		if( DX2_DELTA >= 6777.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 3431.5 ) { 
	if( MAX_AMP_RIGHT >= -10883 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_AMP_LEFT >= 4218.5 ) { 
	if( AVG_AMP_LEFT < 19.5 ) { 
		if( DX2_DELTA < 1695.5 ) { return new Prediction("TOP", 14, 0); }
		if( DX2_DELTA >= 1695.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_AMP_LEFT >= 19.5 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( MAX_AMP_LEFT < 4218.5 ) { 
	if( AVG_AMP_RIGHT >= -26.5 ) { 
	if( DX2_DELTA < 413.5 ) { 
	if( FIRST_LEFT_DETECTION >= 180 ) { 
		if( AVG_DX2_RIGHT >= -0.09 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < -0.09 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 180 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( DX2_DELTA >= 413.5 ) { return new Prediction("LEFT", 95, 0); }
	}
	if( AVG_AMP_RIGHT < -26.5 ) { 
		if( AVG_DX2_RIGHT < 4.35 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT >= 4.35 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( FIRST_LEFT_DETECTION >= 98 ) { 
	if( DETECTION_DELTA < 16 ) { 
		if( AMP_DELTA < 3679.5 ) { return new Prediction("LEFT", 7, 0); }
	if( AMP_DELTA >= 3679.5 ) { 
	if( MAX_AMP_LEFT >= 2736.5 ) { 
		if( AVG_AMP_RIGHT >= 23.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_AMP_RIGHT < 23.5 ) { 
		if( AMP_DELTA >= 8405.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AMP_DELTA < 8405.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 2736.5 ) { 
	if( AMP_DELTA < 5944 ) { 
		if( AVG_DX2_LEFT >= -0.3 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_LEFT < -0.3 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA >= 5944 ) { return new Prediction("RIGHT", 32, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 16 ) { 
	if( MAX_AMP_LEFT < 4092 ) { 
		if( DETECTION_DELTA >= 506 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA < 506 ) { return new Prediction("LEFT", 38, 0); }
	}
		if( MAX_AMP_LEFT >= 4092 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 98 ) { return new Prediction("LEFT", 21, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -10883 ) { 
	if( DETECTION_DELTA < 71 ) { 
	if( DX2_DELTA >= 3174.5 ) { 
		if( AMP_DELTA >= 8618 ) { return new Prediction("RIGHT", 12, 0); }
		if( AMP_DELTA < 8618 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA < 3174.5 ) { return new Prediction("RIGHT", 97, 0); }
	}
		if( DETECTION_DELTA >= 71 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree34() {
	if( MAX_DX2_LEFT < 3003.5 ) { 
	if( MAX_AMP_RIGHT >= -9871.5 ) { 
	if( AVG_AMP_RIGHT < 17 ) { 
	if( AMP_DELTA >= 6170 ) { 
	if( DETECTION_DELTA < 9 ) { 
		if( MAX_AMP_LEFT >= 2674 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < 2674 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( DETECTION_DELTA >= 9 ) { 
		if( MAX_DX2_RIGHT >= 3960 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_DX2_RIGHT < 3960 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AMP_DELTA < 6170 ) { 
	if( DETECTION_DELTA < 16.5 ) { 
	if( MAX_AMP_RIGHT < 6324.5 ) { 
	if( MAX_DX2_RIGHT >= 2966.5 ) { 
		if( MAX_AMP_LEFT < 5059.5 ) { return new Prediction("LEFT", 44, 0); }
		if( MAX_AMP_LEFT >= 5059.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_RIGHT < 2966.5 ) { 
		if( MAX_DX2_RIGHT < 2498 ) { return new Prediction("LEFT", 12, 0); }
	if( MAX_DX2_RIGHT >= 2498 ) { 
	if( AMP_DELTA < 2905.5 ) { 
		if( DX2_DELTA < 586 ) { return new Prediction("TOP", 3, 0); }
		if( DX2_DELTA >= 586 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( AMP_DELTA >= 2905.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= 6324.5 ) { 
		if( MAX_DX2_LEFT < 2436 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 2436 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 16.5 ) { return new Prediction("LEFT", 112, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 17 ) { 
	if( DETECTION_DELTA >= 11 ) { 
		if( MAX_DX2_LEFT >= 1668.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 1668.5 ) { 
		if( AMP_DELTA >= 6872.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AMP_DELTA < 6872.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( DETECTION_DELTA < 11 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -9871.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT < 4085.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( AMP_DELTA < 6989.5 ) { return new Prediction("LEFT", 4, 0); }
	if( AMP_DELTA >= 6989.5 ) { 
		if( MAX_DX2_RIGHT < 7802 ) { return new Prediction("RIGHT", 8, 0); }
		if( MAX_DX2_RIGHT >= 7802 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 1.5 ) { return new Prediction("RIGHT", 65, 0); }
	}
	if( MAX_AMP_LEFT >= 4085.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( AVG_AMP_LEFT >= 1.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 243 ) { 
		if( FIRST_LEFT_DETECTION < 264 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 264 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 243 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( AVG_AMP_RIGHT >= 12 ) { 
		if( AVG_DX2_LEFT < -1.55 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= -1.55 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 12 ) { 
	if( MAX_DX2_RIGHT < 4632.5 ) { 
		if( AVG_DX2_RIGHT < 4.58 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= 4.58 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_DX2_RIGHT >= 4632.5 ) { 
		if( AVG_DX2_LEFT >= -2.1 ) { return new Prediction("BOTTOM", 32, 0); }
		if( AVG_DX2_LEFT < -2.1 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3003.5 ) { 
	if( AMP_DELTA >= 6773 ) { 
	if( DX2_DELTA < 3689.5 ) { 
	if( MAX_DX2_RIGHT >= 7273 ) { 
		if( AVG_AMP_LEFT < -10.5 ) { return new Prediction("RIGHT", 22, 0); }
	if( AVG_AMP_LEFT >= -10.5 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 8, 0); }
	if( DETECTION_DELTA < 6 ) { 
		if( AVG_DX2_LEFT >= -4.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_LEFT < -4.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT < 7273 ) { return new Prediction("RIGHT", 54, 0); }
	}
	if( DX2_DELTA >= 3689.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_DX2_RIGHT >= 4597 ) { return new Prediction("BOTTOM", 126, 0); }
		if( MAX_DX2_RIGHT < 4597 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DX2_DELTA >= 7113 ) { 
		if( DX2_DELTA < 12036 ) { return new Prediction("BOTTOM", 13, 0); }
		if( DX2_DELTA >= 12036 ) { return new Prediction("TOP", 8, 0); }
	}
	if( DX2_DELTA < 7113 ) { 
		if( MAX_DX2_RIGHT < 10562 ) { return new Prediction("RIGHT", 18, 0); }
	if( MAX_DX2_RIGHT >= 10562 ) { 
		if( MAX_DX2_RIGHT < 11490 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT >= 11490 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6773 ) { 
	if( MAX_DX2_RIGHT < 12504 ) { 
		if( FIRST_RIGHT_DETECTION < 86 ) { return new Prediction("RIGHT", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 86 ) { 
		if( MAX_AMP_RIGHT < 9103 ) { return new Prediction("TOP", 190, 0); }
	if( MAX_AMP_RIGHT >= 9103 ) { 
		if( MAX_DX2_RIGHT >= 9491.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 9491.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT >= 12504 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
return null;
}
private Prediction runTree35() {
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_AMP_RIGHT < -11413 ) { 
		if( AVG_AMP_LEFT < 28 ) { return new Prediction("TOP", 122, 0); }
	if( AVG_AMP_LEFT >= 28 ) { 
		if( AMP_DELTA >= 6688 ) { return new Prediction("LEFT", 2, 0); }
		if( AMP_DELTA < 6688 ) { return new Prediction("TOP", 23, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -11413 ) { 
	if( DETECTION_DELTA < 19.5 ) { 
	if( MAX_DX2_LEFT < 3004.5 ) { 
	if( FIRST_RIGHT_DETECTION < 250 ) { 
	if( MAX_AMP_LEFT < 4797.5 ) { 
	if( AVG_DX2_RIGHT >= -2.49 ) { 
		if( FIRST_LEFT_DETECTION < 230.5 ) { return new Prediction("LEFT", 79, 0); }
	if( FIRST_LEFT_DETECTION >= 230.5 ) { 
		if( FIRST_LEFT_DETECTION < 232.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 232.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	if( AVG_DX2_RIGHT < -2.49 ) { 
		if( MAX_DX2_LEFT >= 1799.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 1799.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4797.5 ) { 
		if( MAX_AMP_RIGHT >= -9901 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_RIGHT < -9901 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 250 ) { 
	if( MAX_DX2_RIGHT < 4613 ) { 
		if( FIRST_RIGHT_DETECTION < 280.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( FIRST_RIGHT_DETECTION >= 280.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 4613 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3004.5 ) { 
	if( AMP_DELTA >= 4023.5 ) { 
		if( AVG_DX2_RIGHT >= 5.78 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_RIGHT < 5.78 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AMP_DELTA < 4023.5 ) { return new Prediction("TOP", 41, 0); }
	}
	}
		if( DETECTION_DELTA >= 19.5 ) { return new Prediction("LEFT", 112, 0); }
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( DX2_DELTA < 4138.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( AVG_AMP_LEFT < -2.5 ) { return new Prediction("RIGHT", 124, 0); }
	if( AVG_AMP_LEFT >= -2.5 ) { 
		if( AMP_DELTA < 10295 ) { return new Prediction("RIGHT", 32, 0); }
	if( AMP_DELTA >= 10295 ) { 
		if( MAX_DX2_LEFT >= 3619 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT < 3619 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 8.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 181 ) { return new Prediction("LEFT", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 181 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_AMP_LEFT >= 1824.5 ) { return new Prediction("BOTTOM", 18, 0); }
	if( MAX_AMP_LEFT < 1824.5 ) { 
	if( FIRST_LEFT_DETECTION >= 160 ) { 
		if( DETECTION_DELTA < 63 ) { return new Prediction("RIGHT", 5, 0); }
	if( DETECTION_DELTA >= 63 ) { 
		if( AVG_DX2_LEFT < -0.25 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= -0.25 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 160 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( DX2_DELTA >= 4138.5 ) { 
	if( FIRST_LEFT_DETECTION < 135.5 ) { 
	if( MAX_DX2_RIGHT >= 8786 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 4, 0); }
		if( DETECTION_DELTA < 6 ) { return new Prediction("RIGHT", 14, 0); }
	}
	if( MAX_DX2_RIGHT < 8786 ) { 
		if( MAX_AMP_RIGHT < -14044 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_RIGHT >= -14044 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 135.5 ) { 
	if( MAX_AMP_LEFT < -5301 ) { 
		if( MAX_DX2_RIGHT < 6030.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 6030.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( MAX_AMP_LEFT >= -5301 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
		if( AVG_AMP_RIGHT >= 33 ) { return new Prediction("RIGHT", 6, 0); }
		if( AVG_AMP_RIGHT < 33 ) { return new Prediction("BOTTOM", 34, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( MAX_DX2_LEFT < 11997.5 ) { 
	if( AMP_DELTA < 8798 ) { 
		if( AVG_DX2_LEFT >= 0.53 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 0.53 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA >= 8798 ) { return new Prediction("BOTTOM", 121, 0); }
	}
		if( MAX_DX2_LEFT >= 11997.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree36() {
	if( MAX_AMP_LEFT < 6127.5 ) { 
	if( DX2_DELTA >= 3312.5 ) { 
	if( MAX_AMP_LEFT >= -5042 ) { 
	if( AVG_AMP_RIGHT >= 11 ) { 
		if( AVG_AMP_LEFT >= -6.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
	if( AVG_AMP_RIGHT < 11 ) { 
	if( MAX_DX2_LEFT < 2343.5 ) { 
	if( FIRST_LEFT_DETECTION < 202.5 ) { 
		if( AMP_DELTA < 7421.5 ) { return new Prediction("LEFT", 7, 0); }
	if( AMP_DELTA >= 7421.5 ) { 
		if( FIRST_RIGHT_DETECTION < 187 ) { return new Prediction("BOTTOM", 5, 0); }
		if( FIRST_RIGHT_DETECTION >= 187 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 202.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	if( MAX_DX2_LEFT >= 2343.5 ) { 
	if( MAX_DX2_RIGHT < 7010 ) { 
		if( AVG_DX2_LEFT < 0.79 ) { return new Prediction("BOTTOM", 9, 0); }
		if( AVG_DX2_LEFT >= 0.79 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 7010 ) { return new Prediction("BOTTOM", 132, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -5042 ) { 
	if( MAX_DX2_RIGHT >= 7243 ) { 
		if( AVG_AMP_LEFT < 3 ) { return new Prediction("RIGHT", 30, 0); }
		if( AVG_AMP_LEFT >= 3 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 7243 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( DX2_DELTA < 3312.5 ) { 
	if( AMP_DELTA >= 6577 ) { 
	if( FIRST_LEFT_DETECTION >= 98 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( FIRST_RIGHT_DETECTION < 151.5 ) { 
		if( AMP_DELTA >= 6861 ) { return new Prediction("RIGHT", 44, 0); }
		if( AMP_DELTA < 6861 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 151.5 ) { return new Prediction("RIGHT", 94, 0); }
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( FIRST_RIGHT_DETECTION < 166.5 ) { 
	if( FIRST_LEFT_DETECTION >= 418.5 ) { 
		if( FIRST_RIGHT_DETECTION < 142 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 142 ) { 
		if( FIRST_RIGHT_DETECTION >= 156 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 156 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 418.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 166.5 ) { 
		if( AVG_AMP_LEFT >= -11.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_AMP_LEFT < -11.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 98 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	if( AMP_DELTA < 6577 ) { 
	if( MAX_AMP_LEFT >= 4536 ) { 
	if( AVG_AMP_LEFT < 21 ) { 
		if( AVG_AMP_RIGHT < 36 ) { return new Prediction("TOP", 10, 0); }
		if( AVG_AMP_RIGHT >= 36 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 21 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_AMP_LEFT < 4536 ) { 
	if( MAX_AMP_LEFT >= 3544 ) { 
	if( AVG_AMP_RIGHT < 8 ) { 
	if( AMP_DELTA < 2745.5 ) { 
		if( AVG_AMP_RIGHT >= -11 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_AMP_RIGHT < -11 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AMP_DELTA >= 2745.5 ) { return new Prediction("LEFT", 17, 0); }
	}
	if( AVG_AMP_RIGHT >= 8 ) { 
		if( AVG_DX2_LEFT >= -1.52 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_LEFT < -1.52 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < 3544 ) { 
	if( MAX_AMP_RIGHT < 6325 ) { 
	if( AVG_AMP_RIGHT < 20 ) { 
	if( MAX_AMP_RIGHT < -8544 ) { 
	if( AVG_DX2_RIGHT < 2.52 ) { 
		if( MAX_DX2_RIGHT < 3144.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 3144.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= 2.52 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( MAX_AMP_RIGHT >= -8544 ) { return new Prediction("LEFT", 133, 0); }
	}
		if( AVG_AMP_RIGHT >= 20 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_AMP_RIGHT >= 6325 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6127.5 ) { 
	if( AMP_DELTA >= 9353.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( AMP_DELTA >= 11153 ) { return new Prediction("BOTTOM", 15, 0); }
	if( AMP_DELTA < 11153 ) { 
		if( MAX_DX2_LEFT >= 6254.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 6254.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("RIGHT", 20, 0); }
	}
	}
	if( AMP_DELTA < 9353.5 ) { 
	if( AVG_AMP_LEFT >= 23.5 ) { 
	if( MAX_AMP_LEFT < 7301 ) { 
		if( MAX_AMP_LEFT < 6298.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT >= 6298.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 7301 ) { return new Prediction("TOP", 32, 0); }
	}
		if( AVG_AMP_LEFT < 23.5 ) { return new Prediction("TOP", 164, 0); }
	}
	}
return null;
}
private Prediction runTree37() {
	if( MAX_DX2_LEFT < 3005 ) { 
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_AMP_LEFT < 4423 ) { 
	if( AVG_DX2_RIGHT < -1.51 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
		if( MAX_AMP_RIGHT < -8922 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_AMP_RIGHT >= -8922 ) { 
		if( FIRST_LEFT_DETECTION >= 274 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 274 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
		if( AVG_AMP_RIGHT < 16.5 ) { return new Prediction("LEFT", 18, 0); }
	}
	if( AVG_DX2_RIGHT >= -1.51 ) { 
	if( AMP_DELTA < 6442.5 ) { 
	if( AVG_DX2_LEFT >= 0.44 ) { 
		if( AVG_DX2_LEFT < 0.62 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= 0.62 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( AVG_DX2_LEFT < 0.44 ) { return new Prediction("LEFT", 142, 0); }
	}
	if( AMP_DELTA >= 6442.5 ) { 
		if( MAX_DX2_RIGHT < 3263.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 3263.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4423 ) { 
		if( DX2_DELTA < 1311.5 ) { return new Prediction("TOP", 12, 0); }
	if( DX2_DELTA >= 1311.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("LEFT", 21, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( FIRST_LEFT_DETECTION < 260 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( MAX_AMP_LEFT < 4484.5 ) { return new Prediction("RIGHT", 79, 0); }
	if( MAX_AMP_LEFT >= 4484.5 ) { 
		if( FIRST_RIGHT_DETECTION < 214 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 214 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( DX2_DELTA < 2316.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DX2_DELTA >= 2316.5 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION >= 260 ) { 
		if( DX2_DELTA >= 3622 ) { return new Prediction("BOTTOM", 19, 0); }
	if( DX2_DELTA < 3622 ) { 
		if( DX2_DELTA >= 2762 ) { return new Prediction("LEFT", 3, 0); }
		if( DX2_DELTA < 2762 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3005 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
	if( AMP_DELTA >= 9080 ) { 
	if( MAX_DX2_LEFT < 8261.5 ) { 
		if( MAX_AMP_LEFT >= -3980.5 ) { return new Prediction("BOTTOM", 121, 0); }
	if( MAX_AMP_LEFT < -3980.5 ) { 
		if( MAX_DX2_LEFT < 3757 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_DX2_LEFT >= 3757 ) { return new Prediction("BOTTOM", 11, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 8261.5 ) { 
		if( MAX_DX2_RIGHT < 12217 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_RIGHT >= 12217 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AMP_DELTA < 9080 ) { 
	if( MAX_AMP_RIGHT >= -10541 ) { 
		if( MAX_DX2_RIGHT < 6237 ) { return new Prediction("TOP", 22, 0); }
	if( MAX_DX2_RIGHT >= 6237 ) { 
		if( FIRST_RIGHT_DETECTION >= 135.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 135.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -10541 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 105, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
		if( AMP_DELTA < 5401.5 ) { return new Prediction("TOP", 62, 0); }
	if( AMP_DELTA >= 5401.5 ) { 
	if( DX2_DELTA < 6871 ) { 
	if( AVG_DX2_RIGHT >= -5.34 ) { 
		if( AVG_DX2_LEFT < 4.51 ) { return new Prediction("RIGHT", 104, 0); }
	if( AVG_DX2_LEFT >= 4.51 ) { 
		if( AVG_DX2_LEFT < 4.67 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 4.67 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	if( AVG_DX2_RIGHT < -5.34 ) { 
		if( AVG_DX2_RIGHT >= -5.36 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < -5.36 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( DX2_DELTA >= 6871 ) { 
	if( MAX_AMP_LEFT < 8191 ) { 
		if( FIRST_LEFT_DETECTION >= 128 ) { return new Prediction("BOTTOM", 8, 0); }
		if( FIRST_LEFT_DETECTION < 128 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 8191 ) { 
		if( MAX_DX2_RIGHT >= 8437 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT < 8437 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree38() {
	if( MAX_AMP_LEFT < 6127.5 ) { 
	if( AMP_DELTA < 6927.5 ) { 
		if( MAX_AMP_LEFT < -6674.5 ) { return new Prediction("TOP", 20, 0); }
	if( MAX_AMP_LEFT >= -6674.5 ) { 
	if( MAX_AMP_LEFT < 4796 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
	if( DX2_DELTA >= 453.5 ) { 
	if( AVG_DX2_RIGHT < -4.18 ) { 
		if( FIRST_RIGHT_DETECTION >= 189.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 189.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= -4.18 ) { 
		if( AVG_DX2_LEFT < 0.78 ) { return new Prediction("LEFT", 139, 0); }
	if( AVG_DX2_LEFT >= 0.78 ) { 
		if( FIRST_LEFT_DETECTION < 179.5 ) { return new Prediction("LEFT", 15, 0); }
		if( FIRST_LEFT_DETECTION >= 179.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 453.5 ) { 
		if( DETECTION_DELTA >= 19 ) { return new Prediction("LEFT", 26, 0); }
	if( DETECTION_DELTA < 19 ) { 
		if( FIRST_RIGHT_DETECTION >= 88 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 88 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 19.5 ) { 
		if( FIRST_LEFT_DETECTION < 228.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 228.5 ) { 
		if( FIRST_LEFT_DETECTION < 264.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 264.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4796 ) { 
	if( DX2_DELTA >= 1868 ) { 
	if( MAX_AMP_RIGHT < 62.5 ) { 
		if( AMP_DELTA < 6000 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AMP_DELTA >= 6000 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= 62.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( DX2_DELTA < 1868 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( DX2_DELTA >= 3666 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA >= 6361 ) { 
		if( MAX_DX2_LEFT >= 12075 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 12075 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	if( DX2_DELTA < 6361 ) { 
		if( MAX_AMP_LEFT >= 5723 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_AMP_LEFT < 5723 ) { 
		if( FIRST_RIGHT_DETECTION < 239 ) { return new Prediction("RIGHT", 31, 0); }
	if( FIRST_RIGHT_DETECTION >= 239 ) { 
		if( MAX_DX2_RIGHT < 9571.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_RIGHT >= 9571.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AVG_AMP_RIGHT >= 27 ) { return new Prediction("RIGHT", 2, 0); }
	if( AVG_AMP_RIGHT < 27 ) { 
		if( MAX_DX2_RIGHT >= 3677 ) { return new Prediction("BOTTOM", 146, 0); }
		if( MAX_DX2_RIGHT < 3677 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 3666 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( FIRST_RIGHT_DETECTION < 52 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 52 ) { 
		if( AVG_AMP_RIGHT >= -10.5 ) { return new Prediction("RIGHT", 133, 0); }
	if( AVG_AMP_RIGHT < -10.5 ) { 
		if( AVG_DX2_LEFT < -0.85 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_LEFT >= -0.85 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( FIRST_RIGHT_DETECTION >= 181 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_RIGHT_DETECTION < 181 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_AMP_RIGHT < 18.5 ) { return new Prediction("BOTTOM", 13, 0); }
		if( AVG_AMP_RIGHT >= 18.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6127.5 ) { 
	if( MAX_AMP_RIGHT < -21920.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( MAX_AMP_LEFT >= 13437 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_AMP_LEFT < 13437 ) { return new Prediction("BOTTOM", 14, 0); }
	}
		if( AVG_AMP_RIGHT >= 9.5 ) { return new Prediction("RIGHT", 15, 0); }
	}
	if( MAX_AMP_RIGHT >= -21920.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_DX2_LEFT >= 4.35 ) { 
		if( AVG_DX2_LEFT < 4.64 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 4.64 ) { return new Prediction("TOP", 21, 0); }
	}
		if( AVG_DX2_LEFT < 4.35 ) { return new Prediction("TOP", 139, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AMP_DELTA < 5026 ) { return new Prediction("TOP", 15, 0); }
	if( AMP_DELTA >= 5026 ) { 
	if( AVG_AMP_RIGHT >= -2.5 ) { 
		if( FIRST_LEFT_DETECTION < 220 ) { return new Prediction("RIGHT", 9, 0); }
		if( FIRST_LEFT_DETECTION >= 220 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < -2.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 126.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION < 126.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree39() {
	if( MAX_AMP_LEFT >= 7449.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AMP_DELTA >= 9526.5 ) { 
		if( MAX_DX2_RIGHT >= 11387.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_RIGHT < 11387.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA < 9526.5 ) { return new Prediction("TOP", 186, 0); }
	}
	}
	if( MAX_AMP_LEFT < 7449.5 ) { 
	if( MAX_DX2_RIGHT < 6444.5 ) { 
	if( MAX_DX2_LEFT >= 2932.5 ) { 
		if( AMP_DELTA < 4002.5 ) { return new Prediction("TOP", 17, 0); }
	if( AMP_DELTA >= 4002.5 ) { 
		if( DX2_DELTA >= 4401.5 ) { return new Prediction("TOP", 4, 0); }
	if( DX2_DELTA < 4401.5 ) { 
		if( AVG_DX2_RIGHT < 5.52 ) { return new Prediction("RIGHT", 46, 0); }
		if( AVG_DX2_RIGHT >= 5.52 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2932.5 ) { 
	if( MAX_AMP_RIGHT >= -9936 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( AMP_DELTA >= 2336 ) { 
	if( MAX_DX2_RIGHT < 2794.5 ) { 
		if( MAX_DX2_LEFT >= 728.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 728.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 2794.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
		if( AMP_DELTA < 2336 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( DETECTION_DELTA < 19.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( DX2_DELTA < 1324 ) { 
	if( MAX_AMP_RIGHT < -6159.5 ) { 
		if( MAX_AMP_RIGHT < -8999 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT >= -8999 ) { return new Prediction("TOP", 8, 0); }
	}
	if( MAX_AMP_RIGHT >= -6159.5 ) { 
		if( AVG_DX2_RIGHT >= -1.82 ) { return new Prediction("LEFT", 14, 0); }
		if( AVG_DX2_RIGHT < -1.82 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( DX2_DELTA >= 1324 ) { return new Prediction("LEFT", 40, 0); }
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( AMP_DELTA < 4169.5 ) { 
		if( MAX_AMP_LEFT >= 3906 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT < 3906 ) { return new Prediction("LEFT", 20, 0); }
	}
		if( AMP_DELTA >= 4169.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
		if( DETECTION_DELTA >= 19.5 ) { return new Prediction("LEFT", 99, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -9936 ) { 
	if( DX2_DELTA >= 2819.5 ) { 
	if( MAX_AMP_LEFT < 3528.5 ) { 
	if( DX2_DELTA >= 3518.5 ) { 
		if( AVG_DX2_LEFT >= -0.62 ) { return new Prediction("BOTTOM", 7, 0); }
		if( AVG_DX2_LEFT < -0.62 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA < 3518.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
		if( MAX_AMP_LEFT >= 3528.5 ) { return new Prediction("LEFT", 17, 0); }
	}
	if( DX2_DELTA < 2819.5 ) { 
	if( AVG_DX2_RIGHT < 6.66 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 77.5 ) { 
		if( AMP_DELTA < 5939.5 ) { return new Prediction("TOP", 1, 0); }
		if( AMP_DELTA >= 5939.5 ) { return new Prediction("RIGHT", 49, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 6.66 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6444.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( MAX_DX2_LEFT < 8223 ) { 
		if( AVG_AMP_RIGHT >= 31 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_RIGHT < 31 ) { return new Prediction("BOTTOM", 188, 0); }
	}
	if( MAX_DX2_LEFT >= 8223 ) { 
		if( AVG_DX2_RIGHT < 2.62 ) { return new Prediction("TOP", 7, 0); }
		if( AVG_DX2_RIGHT >= 2.62 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
	if( AVG_AMP_RIGHT < 22.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( AVG_DX2_LEFT < -2.26 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -2.26 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 22.5 ) { return new Prediction("RIGHT", 45, 0); }
	}
	}
	}
return null;
}
private Prediction runTree40() {
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( MAX_DX2_LEFT < 3277.5 ) { 
		if( MAX_AMP_RIGHT >= 8283 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_AMP_RIGHT < 8283 ) { 
	if( AVG_AMP_RIGHT < -16 ) { 
	if( FIRST_RIGHT_DETECTION >= 169 ) { 
		if( MAX_DX2_RIGHT < 3378 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_RIGHT >= 3378 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 169 ) { return new Prediction("LEFT", 9, 0); }
	}
		if( AVG_AMP_RIGHT >= -16 ) { return new Prediction("LEFT", 28, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3277.5 ) { 
	if( MAX_DX2_LEFT < 9085.5 ) { 
		if( MAX_DX2_RIGHT >= 9435 ) { return new Prediction("BOTTOM", 17, 0); }
		if( MAX_DX2_RIGHT < 9435 ) { return new Prediction("TOP", 35, 0); }
	}
		if( MAX_DX2_LEFT >= 9085.5 ) { return new Prediction("TOP", 47, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( AMP_DELTA >= 5222 ) { 
	if( AVG_AMP_RIGHT >= -13 ) { 
	if( AMP_DELTA >= 5983.5 ) { 
	if( AVG_DX2_RIGHT < -5.08 ) { 
		if( AVG_DX2_RIGHT < -5.09 ) { return new Prediction("RIGHT", 25, 0); }
		if( AVG_DX2_RIGHT >= -5.09 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -5.08 ) { return new Prediction("RIGHT", 173, 0); }
	}
	if( AMP_DELTA < 5983.5 ) { 
		if( MAX_AMP_RIGHT >= -8195 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_RIGHT < -8195 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -13 ) { 
		if( MAX_DX2_RIGHT >= 9373 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_DX2_RIGHT < 9373 ) { 
		if( AVG_DX2_LEFT < -1.18 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_LEFT >= -1.18 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( AMP_DELTA < 5222 ) { 
	if( MAX_AMP_LEFT < 2982.5 ) { 
	if( AVG_DX2_LEFT >= -0.1 ) { 
	if( MAX_AMP_LEFT >= -11352.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("LEFT", 19, 0); }
	}
		if( MAX_AMP_LEFT < -11352.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_DX2_LEFT < -0.1 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_LEFT >= 2982.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( FIRST_RIGHT_DETECTION < 115.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 115.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 67, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_RIGHT >= 6186.5 ) { 
	if( MAX_DX2_LEFT >= 7109 ) { 
		if( DX2_DELTA >= 6917.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 6917.5 ) { return new Prediction("TOP", 13, 0); }
	}
	if( MAX_DX2_LEFT < 7109 ) { 
		if( MAX_AMP_LEFT < 9449.5 ) { return new Prediction("BOTTOM", 149, 0); }
		if( MAX_AMP_LEFT >= 9449.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6186.5 ) { 
	if( MAX_AMP_LEFT < 5172.5 ) { 
	if( AMP_DELTA >= 6918 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( AVG_DX2_LEFT < 1.41 ) { 
		if( AVG_AMP_RIGHT >= -22.5 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_AMP_RIGHT < -22.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AVG_DX2_LEFT >= 1.41 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 77.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
	}
	if( AMP_DELTA < 6918 ) { 
	if( MAX_AMP_LEFT >= 4218.5 ) { 
		if( AVG_AMP_RIGHT < 2.5 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_AMP_RIGHT >= 2.5 ) { 
		if( MAX_DX2_LEFT < 1854.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 1854.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4218.5 ) { 
		if( AVG_AMP_RIGHT >= -26.5 ) { return new Prediction("LEFT", 106, 0); }
	if( AVG_AMP_RIGHT < -26.5 ) { 
		if( FIRST_LEFT_DETECTION >= 213 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 213 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	}
	}
		if( MAX_AMP_LEFT >= 5172.5 ) { return new Prediction("TOP", 43, 0); }
	}
	}
return null;
}
private Prediction runTree41() {
	if( AMP_DELTA >= 6947 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( MAX_AMP_LEFT < 11821 ) { 
	if( MAX_DX2_RIGHT < 8518.5 ) { 
		if( MAX_DX2_RIGHT < 4068.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4068.5 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( MAX_DX2_RIGHT >= 8518.5 ) { return new Prediction("BOTTOM", 30, 0); }
	}
		if( MAX_AMP_LEFT >= 11821 ) { return new Prediction("TOP", 9, 0); }
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( MAX_DX2_LEFT < 17785.5 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
		if( FIRST_LEFT_DETECTION >= 49.5 ) { return new Prediction("RIGHT", 136, 0); }
		if( FIRST_LEFT_DETECTION < 49.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_RIGHT < -12.5 ) { 
		if( DX2_DELTA >= 4979 ) { return new Prediction("BOTTOM", 5, 0); }
	if( DX2_DELTA < 4979 ) { 
		if( MAX_AMP_RIGHT >= -17347.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT < -17347.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 17785.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_LEFT >= 2599 ) { 
	if( AVG_AMP_LEFT < -18 ) { 
		if( AVG_DX2_RIGHT < 0.21 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.21 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT >= -18 ) { return new Prediction("BOTTOM", 148, 0); }
	}
	if( MAX_DX2_LEFT < 2599 ) { 
	if( AMP_DELTA >= 9223 ) { 
	if( AVG_AMP_RIGHT >= 3.5 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
		if( MAX_DX2_LEFT < 2513 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 2513 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( AVG_AMP_RIGHT < 3.5 ) { return new Prediction("BOTTOM", 33, 0); }
	}
	if( AMP_DELTA < 9223 ) { 
	if( AVG_AMP_RIGHT >= -12 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 77.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	if( AVG_AMP_RIGHT < -12 ) { 
		if( MAX_DX2_RIGHT < 5448.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 5448.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6947 ) { 
	if( MAX_AMP_RIGHT >= -11458.5 ) { 
	if( AMP_DELTA >= 3733 ) { 
	if( MAX_DX2_LEFT >= 3362.5 ) { 
		if( AVG_DX2_LEFT < -0.13 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AVG_DX2_LEFT >= -0.13 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_LEFT < 3362.5 ) { 
	if( AVG_AMP_RIGHT >= 2 ) { 
		if( AVG_AMP_LEFT >= 3.5 ) { return new Prediction("LEFT", 13, 0); }
		if( AVG_AMP_LEFT < 3.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	if( AVG_AMP_RIGHT < 2 ) { 
	if( MAX_DX2_RIGHT >= 3104.5 ) { 
		if( MAX_AMP_LEFT >= 2365 ) { return new Prediction("LEFT", 32, 0); }
	if( MAX_AMP_LEFT < 2365 ) { 
		if( MAX_AMP_LEFT >= -623.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_AMP_LEFT < -623.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 3104.5 ) { 
		if( MAX_DX2_RIGHT >= 2877 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_RIGHT < 2877 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 3733 ) { 
	if( MAX_AMP_LEFT < 3915 ) { 
	if( MAX_AMP_RIGHT < -6712 ) { 
		if( MAX_DX2_LEFT < 7114.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 7114.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -6712 ) { return new Prediction("LEFT", 140, 0); }
	}
	if( MAX_AMP_LEFT >= 3915 ) { 
		if( DX2_DELTA < 1422 ) { return new Prediction("TOP", 26, 0); }
	if( DX2_DELTA >= 1422 ) { 
		if( MAX_AMP_LEFT < 5676.5 ) { return new Prediction("LEFT", 9, 0); }
		if( MAX_AMP_LEFT >= 5676.5 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -11458.5 ) { 
	if( AVG_AMP_LEFT >= 26.5 ) { 
	if( AVG_DX2_RIGHT >= -4.71 ) { 
		if( AVG_AMP_LEFT >= 30 ) { return new Prediction("TOP", 20, 0); }
		if( AVG_AMP_LEFT < 30 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_RIGHT < -4.71 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_AMP_LEFT < 26.5 ) { 
		if( MAX_DX2_LEFT >= 4342 ) { return new Prediction("TOP", 126, 0); }
	if( MAX_DX2_LEFT < 4342 ) { 
		if( FIRST_LEFT_DETECTION < 189.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 189.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree42() {
	if( DETECTION_DELTA < 8.5 ) { 
	if( AMP_DELTA < 5371.5 ) { 
	if( MAX_DX2_LEFT >= 2818.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
	if( AVG_DX2_RIGHT < 5.26 ) { 
		if( MAX_DX2_RIGHT >= 8821 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 8821 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= 5.26 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_AMP_RIGHT < -10502 ) { return new Prediction("TOP", 110, 0); }
	if( MAX_AMP_RIGHT >= -10502 ) { 
		if( MAX_DX2_RIGHT < 5798.5 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_DX2_RIGHT >= 5798.5 ) { 
		if( MAX_DX2_RIGHT < 7573.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT >= 7573.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2818.5 ) { 
	if( MAX_DX2_RIGHT < 2764.5 ) { 
		if( FIRST_LEFT_DETECTION < 156.5 ) { return new Prediction("LEFT", 9, 0); }
	if( FIRST_LEFT_DETECTION >= 156.5 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
		if( AVG_DX2_RIGHT < 0.04 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= 0.04 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 2764.5 ) { return new Prediction("LEFT", 28, 0); }
	}
	}
	if( AMP_DELTA >= 5371.5 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
	if( MAX_DX2_LEFT < 3600 ) { 
	if( AMP_DELTA >= 6947 ) { 
	if( MAX_DX2_RIGHT >= 5193.5 ) { 
		if( AMP_DELTA < 9365.5 ) { return new Prediction("LEFT", 5, 0); }
	if( AMP_DELTA >= 9365.5 ) { 
		if( MAX_AMP_LEFT >= -68 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT < -68 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 5193.5 ) { return new Prediction("RIGHT", 21, 0); }
	}
		if( AMP_DELTA < 6947 ) { return new Prediction("LEFT", 22, 0); }
	}
	if( MAX_DX2_LEFT >= 3600 ) { 
		if( MAX_AMP_LEFT >= 14502.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 14502.5 ) { 
	if( AMP_DELTA < 15212.5 ) { 
	if( AVG_AMP_RIGHT >= -15.5 ) { 
		if( MAX_DX2_RIGHT >= 11586 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_DX2_RIGHT < 11586 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_RIGHT < -15.5 ) { return new Prediction("TOP", 5, 0); }
	}
		if( AMP_DELTA >= 15212.5 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( AVG_DX2_RIGHT < -4.87 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.87 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_AMP_RIGHT >= 9.5 ) { return new Prediction("RIGHT", 155, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( AVG_DX2_RIGHT < -2.77 ) { return new Prediction("BOTTOM", 5, 0); }
	if( AVG_DX2_RIGHT >= -2.77 ) { 
		if( AVG_DX2_LEFT >= 3.53 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_LEFT < 3.53 ) { 
		if( MAX_DX2_LEFT >= 8930 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 8930 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_AMP_LEFT >= 5344.5 ) { 
		if( MAX_DX2_RIGHT < 7899.5 ) { return new Prediction("TOP", 56, 0); }
		if( MAX_DX2_RIGHT >= 7899.5 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	if( MAX_AMP_LEFT < 5344.5 ) { 
	if( DX2_DELTA < 3325 ) { 
	if( AMP_DELTA < 6841.5 ) { 
	if( AMP_DELTA < 924.5 ) { 
		if( FIRST_LEFT_DETECTION >= 234 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION < 234 ) { return new Prediction("LEFT", 7, 0); }
	}
		if( AMP_DELTA >= 924.5 ) { return new Prediction("LEFT", 129, 0); }
	}
	if( AMP_DELTA >= 6841.5 ) { 
		if( DX2_DELTA < 2316.5 ) { return new Prediction("RIGHT", 14, 0); }
	if( DX2_DELTA >= 2316.5 ) { 
		if( MAX_DX2_LEFT >= 3185 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_LEFT < 3185 ) { 
	if( FIRST_RIGHT_DETECTION < 252 ) { 
		if( AVG_DX2_LEFT < -1.18 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= -1.18 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 252 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 3325 ) { 
	if( AVG_DX2_LEFT < -0.74 ) { 
		if( MAX_AMP_LEFT < 146 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_LEFT >= 146 ) { return new Prediction("BOTTOM", 54, 0); }
	}
	if( AVG_DX2_LEFT >= -0.74 ) { 
	if( FIRST_LEFT_DETECTION >= 31 ) { 
		if( DX2_DELTA >= 3913.5 ) { return new Prediction("BOTTOM", 83, 0); }
	if( DX2_DELTA < 3913.5 ) { 
		if( MAX_DX2_LEFT >= 1976 ) { return new Prediction("BOTTOM", 9, 0); }
	if( MAX_DX2_LEFT < 1976 ) { 
		if( AVG_DX2_LEFT >= -0.17 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < -0.17 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 31 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree43() {
	if( MAX_AMP_LEFT < 6559.5 ) { 
	if( MAX_DX2_LEFT < 3002 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
	if( MAX_AMP_LEFT < 3948.5 ) { 
	if( MAX_DX2_RIGHT >= 5377 ) { 
	if( AVG_DX2_RIGHT < -1.41 ) { 
		if( AVG_DX2_LEFT < -0.31 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.31 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( AVG_DX2_RIGHT >= -1.41 ) { return new Prediction("BOTTOM", 22, 0); }
	}
	if( MAX_DX2_RIGHT < 5377 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( AMP_DELTA < 6867.5 ) { return new Prediction("LEFT", 35, 0); }
		if( AMP_DELTA >= 6867.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_AMP_LEFT >= 1795.5 ) { 
	if( DX2_DELTA >= 2667 ) { 
		if( MAX_AMP_LEFT >= 2403.5 ) { return new Prediction("LEFT", 6, 0); }
		if( MAX_AMP_LEFT < 2403.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DX2_DELTA < 2667 ) { return new Prediction("LEFT", 48, 0); }
	}
		if( MAX_AMP_LEFT < 1795.5 ) { return new Prediction("LEFT", 54, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 3948.5 ) { 
		if( AMP_DELTA >= 9217.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AMP_DELTA < 9217.5 ) { 
		if( DX2_DELTA < 1485.5 ) { return new Prediction("TOP", 15, 0); }
		if( DX2_DELTA >= 1485.5 ) { return new Prediction("LEFT", 26, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 5.5 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
	if( AMP_DELTA < 6463.5 ) { 
		if( FIRST_RIGHT_DETECTION < 252.5 ) { return new Prediction("LEFT", 19, 0); }
		if( FIRST_RIGHT_DETECTION >= 252.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA >= 6463.5 ) { 
	if( FIRST_LEFT_DETECTION < 274.5 ) { 
	if( AVG_DX2_LEFT >= 2.18 ) { 
		if( MAX_DX2_RIGHT < 4771 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 4771 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT < 2.18 ) { return new Prediction("RIGHT", 24, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 274.5 ) { 
		if( MAX_DX2_RIGHT < 5152 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT >= 5152 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 19.5 ) { 
		if( MAX_DX2_RIGHT < 2310.5 ) { return new Prediction("TOP", 3, 0); }
	if( MAX_DX2_RIGHT >= 2310.5 ) { 
	if( MAX_AMP_RIGHT < -6872.5 ) { 
		if( AVG_DX2_LEFT >= -2.1 ) { return new Prediction("RIGHT", 42, 0); }
	if( AVG_DX2_LEFT < -2.1 ) { 
		if( AVG_DX2_RIGHT >= -4.44 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < -4.44 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -6872.5 ) { 
		if( AVG_DX2_LEFT >= 0.12 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_LEFT < 0.12 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3002 ) { 
	if( DX2_DELTA >= 5833 ) { 
		if( MAX_DX2_RIGHT >= 8321.5 ) { return new Prediction("BOTTOM", 106, 0); }
		if( MAX_DX2_RIGHT < 8321.5 ) { return new Prediction("TOP", 14, 0); }
	}
	if( DX2_DELTA < 5833 ) { 
	if( AVG_AMP_LEFT < -10.5 ) { 
		if( DETECTION_DELTA < 9.5 ) { return new Prediction("RIGHT", 74, 0); }
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_LEFT >= -10.5 ) { 
	if( DX2_DELTA < 2291.5 ) { 
		if( DX2_DELTA < 700.5 ) { return new Prediction("TOP", 5, 0); }
		if( DX2_DELTA >= 700.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	if( DX2_DELTA >= 2291.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( MAX_DX2_LEFT < 7080.5 ) { 
		if( MAX_DX2_LEFT >= 3013 ) { return new Prediction("BOTTOM", 47, 0); }
		if( MAX_DX2_LEFT < 3013 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 7080.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( DETECTION_DELTA < 4.5 ) { 
	if( MAX_AMP_RIGHT >= -12004 ) { 
		if( AVG_DX2_RIGHT >= 2.1 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < 2.1 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -12004 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6559.5 ) { 
	if( AMP_DELTA >= 9459.5 ) { 
	if( AVG_AMP_LEFT >= -3.5 ) { 
		if( AVG_DX2_LEFT >= -4.55 ) { return new Prediction("BOTTOM", 11, 0); }
		if( AVG_DX2_LEFT < -4.55 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_LEFT < -3.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
		if( AMP_DELTA < 9459.5 ) { return new Prediction("TOP", 181, 0); }
	}
return null;
}
private Prediction runTree44() {
	if( MAX_AMP_LEFT < 6473 ) { 
	if( AMP_DELTA < 7068.5 ) { 
	if( MAX_DX2_RIGHT < 5928.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 114, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_AMP_LEFT >= 5007 ) { 
		if( AVG_AMP_RIGHT >= 41 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_RIGHT < 41 ) { return new Prediction("TOP", 14, 0); }
	}
	if( MAX_AMP_LEFT < 5007 ) { 
	if( AMP_DELTA < 3955.5 ) { 
	if( AMP_DELTA < 3814 ) { 
	if( AVG_DX2_RIGHT < -1.1 ) { 
	if( AMP_DELTA < 3013.5 ) { 
		if( AVG_AMP_LEFT < -2.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT >= -2.5 ) { return new Prediction("TOP", 5, 0); }
	}
		if( AMP_DELTA >= 3013.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= -1.1 ) { 
		if( AVG_DX2_LEFT < 2.51 ) { return new Prediction("LEFT", 32, 0); }
		if( AVG_DX2_LEFT >= 2.51 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AMP_DELTA >= 3814 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AMP_DELTA >= 3955.5 ) { 
		if( AVG_AMP_RIGHT >= 21.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_AMP_RIGHT < 21.5 ) { 
		if( MAX_AMP_LEFT >= 2443 ) { return new Prediction("LEFT", 41, 0); }
	if( MAX_AMP_LEFT < 2443 ) { 
		if( AVG_AMP_LEFT >= 5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_AMP_LEFT < 5 ) { 
		if( MAX_AMP_LEFT >= 14 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_AMP_LEFT < 14 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 5928.5 ) { 
	if( FIRST_LEFT_DETECTION >= 239 ) { 
		if( AVG_DX2_RIGHT < 5.28 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= 5.28 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION < 239 ) { 
		if( MAX_DX2_LEFT < 9732 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 9732 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	}
	if( AMP_DELTA >= 7068.5 ) { 
	if( DX2_DELTA < 4065.5 ) { 
	if( AVG_AMP_LEFT >= 6.5 ) { 
		if( AMP_DELTA < 8411 ) { return new Prediction("LEFT", 4, 0); }
		if( AMP_DELTA >= 8411 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	if( AVG_AMP_LEFT < 6.5 ) { 
	if( DX2_DELTA >= 2982.5 ) { 
		if( DETECTION_DELTA < 9.5 ) { return new Prediction("RIGHT", 40, 0); }
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
		if( DX2_DELTA < 2982.5 ) { return new Prediction("RIGHT", 98, 0); }
	}
	}
	if( DX2_DELTA >= 4065.5 ) { 
	if( DX2_DELTA >= 5780.5 ) { 
		if( MAX_DX2_RIGHT >= 6791.5 ) { return new Prediction("BOTTOM", 107, 0); }
		if( MAX_DX2_RIGHT < 6791.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DX2_DELTA < 5780.5 ) { 
	if( AMP_DELTA < 13761 ) { 
	if( AMP_DELTA < 7802 ) { 
		if( AVG_DX2_LEFT < -0.48 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.48 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA >= 7802 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 42, 0); }
	}
	}
	if( AMP_DELTA >= 13761 ) { 
		if( MAX_AMP_RIGHT >= -19281 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_RIGHT < -19281 ) { 
		if( AVG_DX2_RIGHT < -4.69 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_RIGHT >= -4.69 ) { 
		if( FIRST_LEFT_DETECTION >= 257 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 257 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6473 ) { 
		if( DX2_DELTA < 2351 ) { return new Prediction("TOP", 84, 0); }
	if( DX2_DELTA >= 2351 ) { 
	if( AVG_AMP_RIGHT < 34 ) { 
	if( MAX_DX2_RIGHT >= 10881 ) { 
	if( AMP_DELTA < 8442.5 ) { 
		if( FIRST_RIGHT_DETECTION < 127.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 127.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AMP_DELTA >= 8442.5 ) { 
		if( AVG_DX2_LEFT < 2.2 ) { return new Prediction("BOTTOM", 11, 0); }
		if( AVG_DX2_LEFT >= 2.2 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 10881 ) { 
	if( DETECTION_DELTA < 1 ) { 
		if( FIRST_RIGHT_DETECTION >= 145.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 145.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DETECTION_DELTA >= 1 ) { 
	if( MAX_DX2_LEFT < 4755.5 ) { 
		if( AVG_DX2_LEFT >= 0.56 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 0.56 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4755.5 ) { return new Prediction("TOP", 105, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 34 ) { 
	if( DETECTION_DELTA >= 5 ) { 
		if( AVG_DX2_RIGHT < -4.75 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.75 ) { return new Prediction("TOP", 4, 0); }
	}
		if( DETECTION_DELTA < 5 ) { return new Prediction("RIGHT", 17, 0); }
	}
	}
	}
return null;
}
private Prediction runTree45() {
	if( MAX_DX2_RIGHT < 6557 ) { 
	if( MAX_DX2_LEFT >= 3758 ) { 
	if( MAX_DX2_LEFT < 4221 ) { 
	if( DETECTION_DELTA >= 2 ) { 
		if( FIRST_LEFT_DETECTION >= 154 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 154 ) { return new Prediction("TOP", 7, 0); }
	}
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4221 ) { return new Prediction("TOP", 108, 0); }
	}
	if( MAX_DX2_LEFT < 3758 ) { 
	if( AMP_DELTA < 6927.5 ) { 
	if( DETECTION_DELTA < 17 ) { 
	if( MAX_AMP_LEFT >= 5028 ) { 
		if( AVG_AMP_RIGHT < 35.5 ) { return new Prediction("TOP", 17, 0); }
		if( AVG_AMP_RIGHT >= 35.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 5028 ) { 
	if( DX2_DELTA < 1247 ) { 
		if( MAX_AMP_LEFT >= 3869.5 ) { return new Prediction("TOP", 4, 0); }
	if( MAX_AMP_LEFT < 3869.5 ) { 
	if( FIRST_LEFT_DETECTION >= 176 ) { 
		if( FIRST_LEFT_DETECTION >= 267 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_LEFT_DETECTION < 267 ) { 
		if( AVG_AMP_RIGHT >= 1 ) { return new Prediction("RIGHT", 10, 0); }
		if( AVG_AMP_RIGHT < 1 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 176 ) { return new Prediction("LEFT", 23, 0); }
	}
	}
		if( DX2_DELTA >= 1247 ) { return new Prediction("LEFT", 55, 0); }
	}
	}
		if( DETECTION_DELTA >= 17 ) { return new Prediction("LEFT", 106, 0); }
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( DX2_DELTA < 2833 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("RIGHT", 100, 0); }
	if( AVG_AMP_LEFT >= 8.5 ) { 
		if( AVG_DX2_LEFT >= 0.17 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 0.17 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( DX2_DELTA >= 2833 ) { 
	if( AVG_DX2_RIGHT < -2.64 ) { 
		if( MAX_DX2_RIGHT < 6335.5 ) { return new Prediction("RIGHT", 12, 0); }
		if( MAX_DX2_RIGHT >= 6335.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AVG_DX2_RIGHT >= -2.64 ) { 
	if( AMP_DELTA >= 8524.5 ) { 
		if( AVG_AMP_LEFT >= -1 ) { return new Prediction("BOTTOM", 10, 0); }
		if( AVG_AMP_LEFT < -1 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AMP_DELTA < 8524.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6557 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AMP_DELTA >= 4904 ) { 
	if( MAX_DX2_RIGHT >= 10846.5 ) { 
	if( FIRST_LEFT_DETECTION >= 136 ) { 
		if( AVG_AMP_LEFT < 2 ) { return new Prediction("RIGHT", 8, 0); }
		if( AVG_AMP_LEFT >= 2 ) { return new Prediction("BOTTOM", 27, 0); }
	}
		if( FIRST_LEFT_DETECTION < 136 ) { return new Prediction("RIGHT", 12, 0); }
	}
	if( MAX_DX2_RIGHT < 10846.5 ) { 
	if( AVG_AMP_LEFT >= -3 ) { 
		if( MAX_DX2_LEFT >= 5546.5 ) { return new Prediction("TOP", 6, 0); }
	if( MAX_DX2_LEFT < 5546.5 ) { 
		if( MAX_DX2_LEFT >= 3794 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_LEFT < 3794 ) { 
		if( AVG_DX2_LEFT < -0.54 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.54 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("RIGHT", 49, 0); }
	}
	}
		if( AMP_DELTA < 4904 ) { return new Prediction("TOP", 71, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( DX2_DELTA < 2541.5 ) { 
		if( AVG_DX2_LEFT >= 2.82 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 2.82 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DX2_DELTA >= 2541.5 ) { 
		if( MAX_DX2_LEFT < 9658 ) { return new Prediction("BOTTOM", 162, 0); }
		if( MAX_DX2_LEFT >= 9658 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree46() {
	if( MAX_DX2_LEFT < 3003.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
	if( MAX_DX2_RIGHT >= 3541.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_LEFT >= -1 ) { 
		if( AMP_DELTA < 6841.5 ) { return new Prediction("LEFT", 6, 0); }
		if( AMP_DELTA >= 6841.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( AVG_AMP_LEFT < -1 ) { 
		if( MAX_AMP_RIGHT < -7457.5 ) { return new Prediction("RIGHT", 65, 0); }
		if( MAX_AMP_RIGHT >= -7457.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( DX2_DELTA >= 4147 ) { return new Prediction("BOTTOM", 9, 0); }
	if( DX2_DELTA < 4147 ) { 
		if( MAX_AMP_RIGHT < -6795.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_AMP_RIGHT >= -6795.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 3541.5 ) { 
		if( AMP_DELTA < 4414.5 ) { return new Prediction("LEFT", 39, 0); }
	if( AMP_DELTA >= 4414.5 ) { 
		if( MAX_AMP_LEFT < -3186 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -3186 ) { return new Prediction("RIGHT", 18, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 1.5 ) { 
	if( AMP_DELTA < 8031.5 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
		if( AVG_AMP_LEFT >= 7 ) { return new Prediction("LEFT", 21, 0); }
	if( AVG_AMP_LEFT < 7 ) { 
		if( AVG_DX2_LEFT >= 0.31 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_DX2_LEFT < 0.31 ) { 
	if( AVG_DX2_LEFT < 0.06 ) { 
		if( AVG_DX2_LEFT >= -0.35 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_LEFT < -0.35 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= 0.06 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( MAX_DX2_RIGHT >= 2045 ) { return new Prediction("LEFT", 101, 0); }
	if( MAX_DX2_RIGHT < 2045 ) { 
		if( AVG_DX2_LEFT >= -0.68 ) { return new Prediction("LEFT", 16, 0); }
		if( AVG_DX2_LEFT < -0.68 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4800.5 ) { 
		if( MAX_AMP_RIGHT >= -9901 ) { return new Prediction("TOP", 14, 0); }
		if( MAX_AMP_RIGHT < -9901 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( AMP_DELTA >= 8031.5 ) { 
		if( AMP_DELTA >= 8687.5 ) { return new Prediction("BOTTOM", 26, 0); }
		if( AMP_DELTA < 8687.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3003.5 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( AMP_DELTA < 8348.5 ) { 
	if( AMP_DELTA >= 4023.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( AVG_AMP_RIGHT >= 14.5 ) { 
		if( AVG_DX2_RIGHT >= -3.54 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -3.54 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_AMP_RIGHT < 14.5 ) { 
		if( MAX_AMP_RIGHT < -10502 ) { return new Prediction("TOP", 15, 0); }
	if( MAX_AMP_RIGHT >= -10502 ) { 
		if( AVG_DX2_RIGHT >= 0.45 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 0.45 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( FIRST_LEFT_DETECTION >= 190.5 ) { 
		if( FIRST_RIGHT_DETECTION < 240 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 240 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 190.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( AMP_DELTA < 4023.5 ) { return new Prediction("TOP", 119, 0); }
	}
	if( AMP_DELTA >= 8348.5 ) { 
	if( AVG_DX2_RIGHT >= -3.13 ) { 
		if( AVG_DX2_RIGHT >= 5.12 ) { return new Prediction("TOP", 3, 0); }
	if( AVG_DX2_RIGHT < 5.12 ) { 
	if( MAX_DX2_LEFT < 8241 ) { 
	if( MAX_AMP_LEFT < -4721 ) { 
		if( MAX_AMP_RIGHT < -23773 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT >= -23773 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= -4721 ) { return new Prediction("BOTTOM", 115, 0); }
	}
	if( MAX_DX2_LEFT >= 8241 ) { 
	if( AVG_DX2_RIGHT < 1.25 ) { 
		if( FIRST_RIGHT_DETECTION >= 203 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 203 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= 1.25 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT < -3.13 ) { 
		if( AVG_AMP_RIGHT < 22.5 ) { return new Prediction("BOTTOM", 12, 0); }
		if( AVG_AMP_RIGHT >= 22.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( MAX_DX2_RIGHT >= 10383.5 ) { 
		if( AVG_AMP_RIGHT < -8 ) { return new Prediction("BOTTOM", 22, 0); }
		if( AVG_AMP_RIGHT >= -8 ) { return new Prediction("RIGHT", 22, 0); }
	}
	if( MAX_DX2_RIGHT < 10383.5 ) { 
		if( AMP_DELTA < 7349 ) { return new Prediction("TOP", 40, 0); }
	if( AMP_DELTA >= 7349 ) { 
	if( DETECTION_DELTA < 9 ) { 
	if( DX2_DELTA < 15252.5 ) { 
		if( AVG_DX2_RIGHT < 3.41 ) { return new Prediction("RIGHT", 80, 0); }
	if( AVG_DX2_RIGHT >= 3.41 ) { 
		if( FIRST_LEFT_DETECTION < 196.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 196.5 ) { 
		if( MAX_DX2_LEFT < 6331 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 6331 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( DX2_DELTA >= 15252.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DETECTION_DELTA >= 9 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree47() {
	if( AMP_DELTA >= 6814 ) { 
	if( DX2_DELTA >= 4642 ) { 
	if( FIRST_LEFT_DETECTION >= 137 ) { 
		if( AVG_AMP_RIGHT >= 33 ) { return new Prediction("RIGHT", 13, 0); }
	if( AVG_AMP_RIGHT < 33 ) { 
	if( AMP_DELTA >= 10540 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 153, 0); }
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_DX2_LEFT < 5643.5 ) { return new Prediction("BOTTOM", 8, 0); }
	if( MAX_DX2_LEFT >= 5643.5 ) { 
		if( AVG_DX2_RIGHT >= 3.19 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 3.19 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( AMP_DELTA < 10540 ) { 
		if( FIRST_LEFT_DETECTION < 259.5 ) { return new Prediction("TOP", 4, 0); }
	if( FIRST_LEFT_DETECTION >= 259.5 ) { 
		if( AVG_DX2_LEFT < 2.07 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_DX2_LEFT >= 2.07 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	if( FIRST_LEFT_DETECTION < 137 ) { 
		if( MAX_DX2_RIGHT < 9060.5 ) { return new Prediction("TOP", 10, 0); }
	if( MAX_DX2_RIGHT >= 9060.5 ) { 
		if( AVG_AMP_RIGHT < -1.5 ) { return new Prediction("BOTTOM", 8, 0); }
	if( AVG_AMP_RIGHT >= -1.5 ) { 
		if( MAX_AMP_LEFT < 6724.5 ) { return new Prediction("RIGHT", 5, 0); }
	if( MAX_AMP_LEFT >= 6724.5 ) { 
		if( AVG_DX2_LEFT < 3.45 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 3.45 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA < 4642 ) { 
	if( AVG_AMP_RIGHT >= -13 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT >= 5392.5 ) { 
		if( MAX_DX2_LEFT >= 3012 ) { return new Prediction("RIGHT", 16, 0); }
		if( MAX_DX2_LEFT < 3012 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_AMP_LEFT < 5392.5 ) { 
	if( MAX_AMP_LEFT >= 3884 ) { 
		if( FIRST_LEFT_DETECTION >= 71.5 ) { return new Prediction("RIGHT", 13, 0); }
		if( FIRST_LEFT_DETECTION < 71.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT < 3884 ) { return new Prediction("RIGHT", 114, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_DX2_LEFT >= 1746 ) { return new Prediction("BOTTOM", 7, 0); }
	if( MAX_DX2_LEFT < 1746 ) { 
		if( AVG_DX2_RIGHT >= 0.79 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 0.79 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < -13 ) { 
	if( AVG_DX2_LEFT < -1.37 ) { 
		if( AVG_AMP_LEFT < -17.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_AMP_LEFT >= -17.5 ) { 
		if( AVG_DX2_LEFT >= -4.4 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < -4.4 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_DX2_LEFT >= -1.37 ) { return new Prediction("BOTTOM", 20, 0); }
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_AMP_RIGHT >= -11458.5 ) { 
	if( MAX_AMP_LEFT >= 4993.5 ) { 
		if( AMP_DELTA < 3735 ) { return new Prediction("TOP", 34, 0); }
	if( AMP_DELTA >= 3735 ) { 
		if( MAX_DX2_LEFT < 3317 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT >= 3317 ) { 
		if( FIRST_RIGHT_DETECTION >= 111.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 111.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 4993.5 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
		if( AVG_DX2_LEFT >= 1.72 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_LEFT < 1.72 ) { 
	if( MAX_DX2_LEFT < 9078 ) { 
	if( AVG_DX2_LEFT < -2.18 ) { 
		if( MAX_DX2_LEFT >= 1783.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 1783.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_DX2_LEFT >= -2.18 ) { 
		if( FIRST_LEFT_DETECTION < 230.5 ) { return new Prediction("LEFT", 149, 0); }
	if( FIRST_LEFT_DETECTION >= 230.5 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 22, 0); }
		if( AVG_AMP_RIGHT < -25.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 9078 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( MAX_DX2_RIGHT < 3638 ) { 
	if( DX2_DELTA >= 554.5 ) { 
		if( DETECTION_DELTA >= 259.5 ) { return new Prediction("LEFT", 3, 0); }
		if( DETECTION_DELTA < 259.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	if( DX2_DELTA < 554.5 ) { 
		if( AVG_DX2_RIGHT >= -1.47 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_RIGHT < -1.47 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 3638 ) { 
	if( FIRST_LEFT_DETECTION < 261 ) { 
		if( DX2_DELTA < 1517.5 ) { return new Prediction("TOP", 1, 0); }
		if( DX2_DELTA >= 1517.5 ) { return new Prediction("LEFT", 15, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 261 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -11458.5 ) { 
	if( DETECTION_DELTA < 1 ) { 
		if( AVG_DX2_LEFT >= -4.85 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_LEFT < -4.85 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DETECTION_DELTA >= 1 ) { 
		if( MAX_DX2_LEFT >= 4342.5 ) { return new Prediction("TOP", 151, 0); }
	if( MAX_DX2_LEFT < 4342.5 ) { 
		if( MAX_DX2_RIGHT < 7303 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_RIGHT >= 7303 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree48() {
	if( DX2_DELTA < 3520.5 ) { 
	if( MAX_AMP_LEFT < 5049.5 ) { 
	if( AVG_DX2_RIGHT < -3.36 ) { 
		if( AVG_AMP_RIGHT >= 19 ) { return new Prediction("RIGHT", 37, 0); }
	if( AVG_AMP_RIGHT < 19 ) { 
	if( MAX_DX2_RIGHT < 7022 ) { 
		if( MAX_AMP_LEFT >= 2887.5 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_AMP_LEFT < 2887.5 ) { 
	if( AVG_DX2_RIGHT < -5.25 ) { 
		if( FIRST_RIGHT_DETECTION >= 223 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 223 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -5.25 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 7022 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -3.36 ) { 
	if( AMP_DELTA < 6880.5 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
	if( AMP_DELTA >= 73 ) { 
	if( AVG_DX2_LEFT < -1.26 ) { 
		if( DX2_DELTA >= 1473.5 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA < 1473.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_LEFT >= -1.26 ) { 
		if( AVG_DX2_RIGHT < 5.33 ) { return new Prediction("LEFT", 159, 0); }
	if( AVG_DX2_RIGHT >= 5.33 ) { 
		if( AVG_AMP_RIGHT < -24.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_RIGHT >= -24.5 ) { return new Prediction("LEFT", 17, 0); }
	}
	}
	}
		if( AMP_DELTA < 73 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
		if( DX2_DELTA >= 1274.5 ) { return new Prediction("LEFT", 22, 0); }
	if( DX2_DELTA < 1274.5 ) { 
	if( MAX_DX2_LEFT < 2039 ) { 
		if( MAX_DX2_RIGHT < 2505.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_RIGHT >= 2505.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_DX2_LEFT >= 2039 ) { 
		if( AVG_DX2_LEFT >= -1.52 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_DX2_LEFT < -1.52 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6880.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( DX2_DELTA >= 2560.5 ) { 
	if( DX2_DELTA < 2682 ) { 
		if( AVG_DX2_RIGHT < -0.28 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.28 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DX2_DELTA >= 2682 ) { return new Prediction("RIGHT", 12, 0); }
	}
		if( DX2_DELTA < 2560.5 ) { return new Prediction("RIGHT", 59, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( DETECTION_DELTA >= 320 ) { 
		if( DX2_DELTA >= 2762 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA < 2762 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA < 320 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5049.5 ) { 
	if( AMP_DELTA < 6509 ) { 
		if( MAX_DX2_RIGHT >= 11055 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 11055 ) { return new Prediction("TOP", 103, 0); }
	}
	if( AMP_DELTA >= 6509 ) { 
	if( AMP_DELTA >= 8869.5 ) { 
	if( AVG_DX2_LEFT >= 2.44 ) { 
		if( FIRST_LEFT_DETECTION >= 110 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_LEFT_DETECTION < 110 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_LEFT < 2.44 ) { return new Prediction("RIGHT", 22, 0); }
	}
	if( AMP_DELTA < 8869.5 ) { 
		if( AVG_DX2_RIGHT < 0.4 ) { return new Prediction("RIGHT", 3, 0); }
	if( AVG_DX2_RIGHT >= 0.4 ) { 
		if( MAX_AMP_LEFT >= 7339.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 7339.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA >= 3520.5 ) { 
	if( MAX_AMP_LEFT >= 8708.5 ) { 
		if( MAX_DX2_LEFT >= 6620 ) { return new Prediction("TOP", 78, 0); }
	if( MAX_DX2_LEFT < 6620 ) { 
		if( AMP_DELTA < 17476.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AMP_DELTA >= 17476.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( MAX_AMP_LEFT < 8708.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AVG_AMP_RIGHT >= 12 ) { 
		if( MAX_DX2_RIGHT >= 7056.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_DX2_RIGHT < 7056.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 12 ) { 
	if( AMP_DELTA < 7345.5 ) { 
		if( FIRST_LEFT_DETECTION < 207 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 207 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AMP_DELTA >= 7345.5 ) { return new Prediction("BOTTOM", 158, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_LEFT < 11034 ) { 
	if( AVG_AMP_RIGHT >= -4 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( AVG_DX2_RIGHT >= 6.76 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 6.76 ) { return new Prediction("BOTTOM", 4, 0); }
	}
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("RIGHT", 36, 0); }
	}
	if( AVG_AMP_RIGHT < -4 ) { 
	if( MAX_DX2_RIGHT < 9332 ) { 
	if( AVG_DX2_LEFT >= -0.56 ) { 
		if( AVG_DX2_LEFT < 2.2 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 2.2 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT < -0.56 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 9332 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 11034 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	}
return null;
}
private Prediction runTree49() {
	if( MAX_AMP_LEFT >= 5479.5 ) { 
	if( MAX_DX2_LEFT < 6383.5 ) { 
	if( DX2_DELTA < 2325 ) { 
		if( AMP_DELTA < 8418 ) { return new Prediction("TOP", 53, 0); }
		if( AMP_DELTA >= 8418 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( DX2_DELTA >= 2325 ) { 
	if( AMP_DELTA < 10005.5 ) { 
	if( MAX_DX2_RIGHT < 6117 ) { 
		if( MAX_DX2_RIGHT >= 3958.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_RIGHT < 3958.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 6117 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	if( AMP_DELTA >= 10005.5 ) { 
		if( AVG_AMP_RIGHT >= 3 ) { return new Prediction("RIGHT", 15, 0); }
		if( AVG_AMP_RIGHT < 3 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 6383.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_AMP_LEFT < 13 ) { return new Prediction("RIGHT", 6, 0); }
	if( AVG_AMP_LEFT >= 13 ) { 
		if( AVG_DX2_LEFT >= -4.85 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -4.85 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( AMP_DELTA >= 10519 ) { 
		if( FIRST_RIGHT_DETECTION >= 144.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 144.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 10519 ) { return new Prediction("TOP", 138, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 5479.5 ) { 
	if( MAX_DX2_RIGHT >= 5342 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
	if( MAX_DX2_RIGHT >= 8572 ) { 
	if( MAX_AMP_RIGHT >= -17277 ) { 
		if( MAX_DX2_LEFT < 6812.5 ) { return new Prediction("BOTTOM", 8, 0); }
		if( MAX_DX2_LEFT >= 6812.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_AMP_RIGHT < -17277 ) { 
		if( DETECTION_DELTA < 76 ) { return new Prediction("RIGHT", 23, 0); }
		if( DETECTION_DELTA >= 76 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 8572 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
		if( MAX_DX2_LEFT >= 10556 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_LEFT < 10556 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_AMP_RIGHT >= 8.5 ) { return new Prediction("RIGHT", 43, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -7.5 ) { 
	if( AMP_DELTA < 7659.5 ) { 
	if( MAX_AMP_LEFT >= -4873 ) { 
		if( MAX_DX2_LEFT < 3025.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT >= 3025.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT < -4873 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AMP_DELTA >= 7659.5 ) { 
	if( AVG_AMP_RIGHT < 22.5 ) { 
		if( MAX_DX2_LEFT >= 18133 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_LEFT < 18133 ) { 
	if( AMP_DELTA < 8675 ) { 
		if( FIRST_RIGHT_DETECTION >= 213 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 213 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AMP_DELTA >= 8675 ) { return new Prediction("BOTTOM", 154, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 22.5 ) { 
		if( MAX_DX2_LEFT >= 4494 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT < 4494 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT < 5342 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_AMP_LEFT < -4249.5 ) { 
		if( MAX_AMP_LEFT >= -7991 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT < -7991 ) { return new Prediction("TOP", 4, 0); }
	}
	if( MAX_AMP_LEFT >= -4249.5 ) { 
	if( AMP_DELTA < 6777.5 ) { 
		if( DX2_DELTA >= 1125 ) { return new Prediction("LEFT", 75, 0); }
	if( DX2_DELTA < 1125 ) { 
	if( AVG_DX2_LEFT < -1.26 ) { 
		if( FIRST_LEFT_DETECTION >= 203 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 203 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_LEFT >= -1.26 ) { 
		if( MAX_AMP_RIGHT >= -6395.5 ) { return new Prediction("LEFT", 34, 0); }
	if( MAX_AMP_RIGHT < -6395.5 ) { 
		if( AMP_DELTA >= 3917.5 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA < 3917.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6777.5 ) { 
	if( FIRST_RIGHT_DETECTION < 244.5 ) { 
		if( AVG_DX2_LEFT >= 1.3 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 1.3 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 244.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( DETECTION_DELTA < 19.5 ) { 
	if( MAX_AMP_RIGHT >= -8000 ) { 
	if( AVG_AMP_RIGHT < 14 ) { 
		if( MAX_DX2_LEFT < 1787.5 ) { return new Prediction("LEFT", 16, 0); }
	if( MAX_DX2_LEFT >= 1787.5 ) { 
		if( FIRST_RIGHT_DETECTION < 200.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_RIGHT_DETECTION >= 200.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 14 ) { return new Prediction("RIGHT", 9, 0); }
	}
	if( MAX_AMP_RIGHT < -8000 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 59, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( AMP_DELTA < 6841.5 ) { 
		if( MAX_DX2_RIGHT < 3396 ) { return new Prediction("RIGHT", 5, 0); }
	if( MAX_DX2_RIGHT >= 3396 ) { 
		if( AVG_DX2_LEFT < -0.93 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.93 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( AMP_DELTA >= 6841.5 ) { 
		if( MAX_DX2_RIGHT < 4537.5 ) { return new Prediction("RIGHT", 20, 0); }
		if( MAX_DX2_RIGHT >= 4537.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
		if( DETECTION_DELTA >= 19.5 ) { return new Prediction("LEFT", 55, 0); }
	}
	}
	}
return null;
}
private Prediction runTree50() {
	if( AMP_DELTA >= 7262 ) { 
	if( DX2_DELTA >= 3659 ) { 
	if( AVG_AMP_RIGHT >= 11 ) { 
		if( MAX_AMP_RIGHT < -19783 ) { return new Prediction("RIGHT", 23, 0); }
	if( MAX_AMP_RIGHT >= -19783 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
		if( MAX_AMP_LEFT < 15422 ) { return new Prediction("BOTTOM", 7, 0); }
		if( MAX_AMP_LEFT >= 15422 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 11 ) { 
	if( MAX_AMP_LEFT >= -5494 ) { 
	if( MAX_DX2_LEFT < 10542.5 ) { 
		if( AVG_AMP_LEFT >= -26.5 ) { return new Prediction("BOTTOM", 164, 0); }
		if( AVG_AMP_LEFT < -26.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 10542.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_AMP_LEFT < -5494 ) { 
		if( MAX_DX2_LEFT >= 12095.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 12095.5 ) { 
		if( FIRST_RIGHT_DETECTION < 220.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 220.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( DX2_DELTA < 3659 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( DX2_DELTA >= 2560.5 ) { 
	if( MAX_DX2_LEFT < 3410 ) { 
		if( FIRST_LEFT_DETECTION < 271.5 ) { return new Prediction("RIGHT", 30, 0); }
		if( FIRST_LEFT_DETECTION >= 271.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 3410 ) { 
		if( AVG_AMP_RIGHT >= -2.5 ) { return new Prediction("RIGHT", 15, 0); }
		if( AVG_AMP_RIGHT < -2.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( DX2_DELTA < 2560.5 ) { 
		if( AVG_AMP_RIGHT >= -40 ) { return new Prediction("RIGHT", 100, 0); }
		if( AVG_AMP_RIGHT < -40 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( AMP_DELTA < 8411 ) { return new Prediction("LEFT", 5, 0); }
		if( AMP_DELTA >= 8411 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	if( AMP_DELTA < 7262 ) { 
	if( MAX_DX2_LEFT >= 2865 ) { 
	if( MAX_AMP_RIGHT >= -14164.5 ) { 
	if( MAX_DX2_RIGHT < 10479 ) { 
	if( AVG_AMP_RIGHT >= 30 ) { 
		if( AMP_DELTA >= 3582.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AMP_DELTA < 3582.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_RIGHT < 30 ) { 
	if( MAX_DX2_LEFT < 4317.5 ) { 
		if( FIRST_RIGHT_DETECTION < 79 ) { return new Prediction("LEFT", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 79 ) { 
	if( MAX_AMP_LEFT < 6177.5 ) { 
		if( FIRST_LEFT_DETECTION >= 172 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 172 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 6177.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 4317.5 ) { return new Prediction("TOP", 72, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 10479 ) { 
		if( AVG_DX2_LEFT < -2.19 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -2.19 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -14164.5 ) { return new Prediction("TOP", 116, 0); }
	}
	if( MAX_DX2_LEFT < 2865 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
	if( MAX_DX2_RIGHT >= 3486.5 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
		if( AMP_DELTA >= 6779 ) { return new Prediction("RIGHT", 4, 0); }
		if( AMP_DELTA < 6779 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("LEFT", 39, 0); }
	}
	if( MAX_DX2_RIGHT < 3486.5 ) { 
		if( AVG_DX2_RIGHT < 0.32 ) { return new Prediction("RIGHT", 8, 0); }
	if( AVG_DX2_RIGHT >= 0.32 ) { 
		if( MAX_AMP_RIGHT < -8979.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT >= -8979.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( AMP_DELTA < 5114.5 ) { 
	if( MAX_DX2_LEFT >= 1789.5 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
		if( MAX_AMP_LEFT < 4128.5 ) { return new Prediction("LEFT", 39, 0); }
	if( MAX_AMP_LEFT >= 4128.5 ) { 
		if( DX2_DELTA < 1049.5 ) { return new Prediction("TOP", 4, 0); }
		if( DX2_DELTA >= 1049.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4800.5 ) { return new Prediction("TOP", 17, 0); }
	}
		if( MAX_DX2_LEFT < 1789.5 ) { return new Prediction("LEFT", 102, 0); }
	}
	}
	}
return null;
}
private Prediction runTree51() {
	if( DX2_DELTA >= 3431.5 ) { 
	if( AMP_DELTA < 8087.5 ) { 
	if( DX2_DELTA >= 4354 ) { 
		if( MAX_AMP_RIGHT >= 2432.5 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_AMP_RIGHT < 2432.5 ) { 
		if( MAX_DX2_LEFT < 5268 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 5268 ) { return new Prediction("TOP", 69, 0); }
	}
	}
	if( DX2_DELTA < 4354 ) { 
	if( MAX_DX2_LEFT < 5886 ) { 
		if( AVG_AMP_RIGHT >= 14.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_AMP_RIGHT < 14.5 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( MAX_DX2_LEFT >= 5886 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	if( AMP_DELTA >= 8087.5 ) { 
	if( AVG_AMP_RIGHT < 10.5 ) { 
	if( MAX_AMP_LEFT < -4334.5 ) { 
	if( DX2_DELTA >= 5308.5 ) { 
		if( AVG_DX2_RIGHT < 3.37 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT >= 3.37 ) { return new Prediction("TOP", 5, 0); }
	}
		if( DX2_DELTA < 5308.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( MAX_AMP_LEFT >= -4334.5 ) { 
		if( AVG_DX2_LEFT >= 3.52 ) { return new Prediction("TOP", 2, 0); }
	if( AVG_DX2_LEFT < 3.52 ) { 
	if( AVG_AMP_RIGHT >= 2 ) { 
		if( MAX_DX2_RIGHT >= 6993.5 ) { return new Prediction("BOTTOM", 13, 0); }
	if( MAX_DX2_RIGHT < 6993.5 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( AVG_AMP_RIGHT < 2 ) { return new Prediction("BOTTOM", 167, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 10.5 ) { 
		if( DX2_DELTA < 5686.5 ) { return new Prediction("RIGHT", 41, 0); }
	if( DX2_DELTA >= 5686.5 ) { 
		if( AVG_AMP_LEFT < -7 ) { return new Prediction("RIGHT", 9, 0); }
	if( AVG_AMP_LEFT >= -7 ) { 
		if( MAX_DX2_LEFT >= 10472.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 10472.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA < 3431.5 ) { 
	if( AMP_DELTA < 5944 ) { 
	if( MAX_AMP_LEFT >= 4954 ) { 
		if( DX2_DELTA < 3131 ) { return new Prediction("TOP", 112, 0); }
	if( DX2_DELTA >= 3131 ) { 
		if( MAX_AMP_LEFT >= 9455.5 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_AMP_LEFT < 9455.5 ) { 
		if( MAX_DX2_LEFT < 6981.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 6981.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 4954 ) { 
	if( AVG_DX2_LEFT < -1.24 ) { 
		if( DX2_DELTA < 925.5 ) { return new Prediction("TOP", 8, 0); }
	if( DX2_DELTA >= 925.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("LEFT", 3, 0); }
		if( DETECTION_DELTA < 4.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( AVG_DX2_LEFT >= -1.24 ) { 
	if( AVG_DX2_LEFT >= 0.09 ) { 
		if( FIRST_LEFT_DETECTION >= 191 ) { return new Prediction("TOP", 2, 0); }
	if( FIRST_LEFT_DETECTION < 191 ) { 
		if( AVG_DX2_LEFT >= 0.15 ) { return new Prediction("LEFT", 21, 0); }
		if( AVG_DX2_LEFT < 0.15 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_DX2_LEFT < 0.09 ) { 
	if( MAX_AMP_RIGHT < 6041.5 ) { 
	if( AVG_DX2_LEFT < -0.7 ) { 
		if( FIRST_LEFT_DETECTION >= 200.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 200.5 ) { return new Prediction("LEFT", 11, 0); }
	}
		if( AVG_DX2_LEFT >= -0.7 ) { return new Prediction("LEFT", 119, 0); }
	}
		if( MAX_AMP_RIGHT >= 6041.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 5944 ) { 
	if( AVG_AMP_RIGHT < -2 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AMP_DELTA < 6989.5 ) { return new Prediction("LEFT", 11, 0); }
	if( AMP_DELTA >= 6989.5 ) { 
		if( MAX_AMP_LEFT < 3042 ) { return new Prediction("RIGHT", 9, 0); }
	if( MAX_AMP_LEFT >= 3042 ) { 
		if( AVG_DX2_LEFT >= -3.12 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_DX2_LEFT < -3.12 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_AMP_LEFT < 19.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( AVG_AMP_LEFT >= 19.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -2 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( MAX_AMP_LEFT < 4285 ) { return new Prediction("RIGHT", 11, 0); }
	if( MAX_AMP_LEFT >= 4285 ) { 
		if( MAX_AMP_RIGHT >= -14436.5 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_AMP_RIGHT < -14436.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( DETECTION_DELTA >= 0.5 ) { 
	if( DX2_DELTA < 2870.5 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 77.5 ) { return new Prediction("RIGHT", 105, 0); }
	}
	if( DX2_DELTA >= 2870.5 ) { 
		if( MAX_AMP_LEFT < -1467.5 ) { return new Prediction("RIGHT", 12, 0); }
	if( MAX_AMP_LEFT >= -1467.5 ) { 
		if( AVG_DX2_RIGHT < -2.96 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -2.96 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree52() {
	if( AVG_AMP_RIGHT < 7.5 ) { 
	if( MAX_DX2_LEFT >= 2641 ) { 
	if( FIRST_LEFT_DETECTION >= 131.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AMP_DELTA < 10842 ) { 
	if( MAX_DX2_RIGHT < 11976.5 ) { 
	if( MAX_DX2_LEFT < 2850.5 ) { 
		if( AVG_DX2_LEFT < -0.39 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.39 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 2850.5 ) { 
		if( MAX_DX2_LEFT >= 4238.5 ) { return new Prediction("TOP", 73, 0); }
	if( MAX_DX2_LEFT < 4238.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 140.5 ) { return new Prediction("TOP", 7, 0); }
		if( FIRST_RIGHT_DETECTION < 140.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT >= 11976.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( AMP_DELTA >= 10842 ) { 
	if( MAX_AMP_LEFT >= -3993.5 ) { 
	if( AVG_DX2_LEFT >= 3.26 ) { 
		if( AVG_DX2_LEFT >= 3.75 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < 3.75 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT < 3.26 ) { return new Prediction("BOTTOM", 22, 0); }
	}
	if( MAX_AMP_LEFT < -3993.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 14, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( AVG_DX2_LEFT >= 1.4 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 1.4 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( DX2_DELTA < 2821 ) { 
		if( FIRST_RIGHT_DETECTION >= 91.5 ) { return new Prediction("TOP", 12, 0); }
		if( FIRST_RIGHT_DETECTION < 91.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( DX2_DELTA >= 2821 ) { 
		if( MAX_DX2_LEFT >= 7624.5 ) { return new Prediction("TOP", 9, 0); }
		if( MAX_DX2_LEFT < 7624.5 ) { return new Prediction("BOTTOM", 135, 0); }
	}
	}
	}
	if( FIRST_LEFT_DETECTION < 131.5 ) { 
	if( FIRST_RIGHT_DETECTION < 48 ) { 
	if( FIRST_LEFT_DETECTION >= 24.5 ) { 
		if( AVG_DX2_RIGHT < 3.1 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT >= 3.1 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 24.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 48 ) { 
	if( AMP_DELTA < 10609 ) { 
		if( MAX_AMP_LEFT >= 5463 ) { return new Prediction("TOP", 49, 0); }
	if( MAX_AMP_LEFT < 5463 ) { 
		if( AVG_DX2_RIGHT >= 6.58 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 6.58 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AMP_DELTA >= 10609 ) { 
	if( MAX_DX2_RIGHT >= 9119 ) { 
		if( MAX_DX2_LEFT < 3960 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 3960 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 9119 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2641 ) { 
	if( MAX_AMP_RIGHT < -10035.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( MAX_AMP_LEFT < 3838 ) { return new Prediction("RIGHT", 10, 0); }
		if( MAX_AMP_LEFT >= 3838 ) { return new Prediction("LEFT", 8, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_AMP_RIGHT < -11775.5 ) { return new Prediction("BOTTOM", 18, 0); }
		if( MAX_AMP_RIGHT >= -11775.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -10035.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 106, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( AMP_DELTA >= 6170 ) { 
		if( DETECTION_DELTA >= 11 ) { return new Prediction("BOTTOM", 5, 0); }
	if( DETECTION_DELTA < 11 ) { 
		if( MAX_AMP_LEFT < 3007.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_AMP_LEFT >= 3007.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AMP_DELTA < 6170 ) { 
	if( DX2_DELTA >= 383.5 ) { 
		if( MAX_AMP_LEFT < 4878.5 ) { return new Prediction("LEFT", 61, 0); }
		if( MAX_AMP_LEFT >= 4878.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DX2_DELTA < 383.5 ) { 
		if( MAX_DX2_RIGHT < 2700 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_DX2_RIGHT >= 2700 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 7.5 ) { 
	if( AMP_DELTA >= 6872.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( MAX_AMP_LEFT >= 3870 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( FIRST_LEFT_DETECTION < 55.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 55.5 ) { return new Prediction("RIGHT", 52, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
	if( MAX_DX2_RIGHT < 8938.5 ) { 
		if( AVG_DX2_RIGHT < -2.67 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= -2.67 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 8938.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3870 ) { return new Prediction("RIGHT", 109, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_LEFT < 1849.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 140.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_RIGHT_DETECTION < 140.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 1849.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AMP_DELTA < 6872.5 ) { 
	if( MAX_DX2_LEFT < 3654.5 ) { 
	if( AVG_DX2_RIGHT < -2.76 ) { 
	if( AVG_DX2_LEFT >= -0.3 ) { 
		if( AVG_DX2_RIGHT < -8.46 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -8.46 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( AVG_DX2_LEFT < -0.3 ) { 
		if( AVG_DX2_RIGHT < -4.32 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.32 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -2.76 ) { 
		if( DX2_DELTA >= 1271.5 ) { return new Prediction("LEFT", 18, 0); }
	if( DX2_DELTA < 1271.5 ) { 
		if( DX2_DELTA >= 683.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DX2_DELTA < 683.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3654.5 ) { 
		if( MAX_AMP_LEFT >= 5471.5 ) { return new Prediction("TOP", 35, 0); }
		if( MAX_AMP_LEFT < 5471.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree53() {
	if( MAX_AMP_RIGHT < -11602 ) { 
	if( MAX_AMP_LEFT < 9925.5 ) { 
	if( AVG_AMP_RIGHT < 0.5 ) { 
	if( AMP_DELTA < 9152.5 ) { 
	if( AVG_AMP_LEFT >= 16 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("LEFT", 4, 0); }
	if( DETECTION_DELTA >= 1.5 ) { 
		if( AMP_DELTA < 5452.5 ) { return new Prediction("TOP", 9, 0); }
		if( AMP_DELTA >= 5452.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT < 16 ) { 
		if( MAX_DX2_RIGHT < 4862.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT >= 4862.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	if( AMP_DELTA >= 9152.5 ) { 
	if( DX2_DELTA >= 3284.5 ) { 
	if( AVG_AMP_RIGHT >= -2.5 ) { 
		if( AVG_DX2_RIGHT < -1.71 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT >= -1.71 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( AVG_AMP_RIGHT < -2.5 ) { 
		if( MAX_DX2_LEFT >= 13319 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 13319 ) { return new Prediction("BOTTOM", 105, 0); }
	}
	}
	if( DX2_DELTA < 3284.5 ) { 
		if( FIRST_LEFT_DETECTION >= 156 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_LEFT_DETECTION < 156 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 0.5 ) { 
		if( AMP_DELTA < 4868 ) { return new Prediction("TOP", 5, 0); }
	if( AMP_DELTA >= 4868 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
	if( AMP_DELTA < 9581.5 ) { 
		if( MAX_DX2_RIGHT < 7668 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_RIGHT >= 7668 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AMP_DELTA >= 9581.5 ) { 
		if( AVG_DX2_LEFT < -1.35 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.35 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	if( DETECTION_DELTA < 4.5 ) { 
		if( MAX_AMP_LEFT >= 4900.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < 4900.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
	}
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 92, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 9925.5 ) { 
	if( MAX_DX2_LEFT < 5057.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 160.5 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 160.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( MAX_DX2_LEFT >= 5057.5 ) { 
		if( AMP_DELTA < 9699.5 ) { return new Prediction("TOP", 123, 0); }
		if( AMP_DELTA >= 9699.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -11602 ) { 
	if( DX2_DELTA >= 4467 ) { 
		if( MAX_AMP_RIGHT < 2612.5 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_RIGHT >= 2612.5 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("RIGHT", 1, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("BOTTOM", 52, 0); }
	}
	}
	if( DX2_DELTA < 4467 ) { 
	if( AMP_DELTA < 6927.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
		if( MAX_AMP_RIGHT < -10703 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_AMP_RIGHT >= -10703 ) { 
	if( MAX_AMP_LEFT < 4349 ) { 
	if( DETECTION_DELTA >= 5 ) { 
		if( MAX_AMP_RIGHT >= 634 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_AMP_RIGHT < 634 ) { 
		if( MAX_DX2_RIGHT < 2886 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT >= 2886 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( DETECTION_DELTA < 5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( MAX_AMP_LEFT >= 4349 ) { 
		if( FIRST_LEFT_DETECTION >= 107.5 ) { return new Prediction("TOP", 4, 0); }
		if( FIRST_LEFT_DETECTION < 107.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
		if( MAX_DX2_LEFT >= 2886.5 ) { return new Prediction("TOP", 35, 0); }
	if( MAX_DX2_LEFT < 2886.5 ) { 
	if( DX2_DELTA >= 1118 ) { 
	if( MAX_AMP_RIGHT < 6376.5 ) { 
	if( AVG_DX2_LEFT >= 0.76 ) { 
		if( AMP_DELTA >= 6308 ) { return new Prediction("RIGHT", 1, 0); }
		if( AMP_DELTA < 6308 ) { return new Prediction("LEFT", 12, 0); }
	}
		if( AVG_DX2_LEFT < 0.76 ) { return new Prediction("LEFT", 100, 0); }
	}
		if( MAX_AMP_RIGHT >= 6376.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DX2_DELTA < 1118 ) { 
		if( MAX_AMP_LEFT < 3894.5 ) { return new Prediction("LEFT", 94, 0); }
		if( MAX_AMP_LEFT >= 3894.5 ) { return new Prediction("TOP", 29, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( AVG_AMP_RIGHT >= -10.5 ) { 
		if( DETECTION_DELTA < 520 ) { return new Prediction("RIGHT", 45, 0); }
		if( DETECTION_DELTA >= 520 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < -10.5 ) { 
		if( AMP_DELTA < 8148 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA >= 8148 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree54() {
	if( MAX_AMP_RIGHT >= -11168 ) { 
	if( MAX_DX2_RIGHT >= 6169 ) { 
	if( DETECTION_DELTA >= 6 ) { 
		if( MAX_DX2_LEFT < 2287 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_DX2_LEFT >= 2287 ) { 
	if( FIRST_RIGHT_DETECTION < 114 ) { 
		if( AVG_DX2_RIGHT < -0.28 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT >= -0.28 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 114 ) { return new Prediction("BOTTOM", 48, 0); }
	}
	}
	if( DETECTION_DELTA < 6 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( AVG_AMP_LEFT < 28.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AVG_AMP_LEFT >= 28.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6169 ) { 
	if( AVG_AMP_RIGHT < 21 ) { 
	if( MAX_DX2_LEFT < 2420 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
		if( MAX_DX2_RIGHT < 5005.5 ) { return new Prediction("LEFT", 116, 0); }
		if( MAX_DX2_RIGHT >= 5005.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_AMP_LEFT < 3938 ) { 
		if( AVG_AMP_LEFT >= 3.5 ) { return new Prediction("LEFT", 46, 0); }
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( MAX_DX2_LEFT >= 1937.5 ) { 
	if( FIRST_LEFT_DETECTION >= 157 ) { 
		if( FIRST_LEFT_DETECTION >= 227 ) { return new Prediction("RIGHT", 4, 0); }
	if( FIRST_LEFT_DETECTION < 227 ) { 
	if( MAX_DX2_RIGHT < 3614 ) { 
		if( AVG_DX2_LEFT >= -0.03 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -0.03 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 3614 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 157 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( MAX_DX2_LEFT < 1937.5 ) { 
		if( AMP_DELTA < 6110.5 ) { return new Prediction("LEFT", 19, 0); }
		if( AMP_DELTA >= 6110.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 3938 ) { 
		if( AVG_DX2_RIGHT >= 2.37 ) { return new Prediction("LEFT", 12, 0); }
	if( AVG_DX2_RIGHT < 2.37 ) { 
		if( AVG_DX2_LEFT >= 0.59 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < 0.59 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 2420 ) { 
	if( MAX_AMP_RIGHT >= -9136 ) { 
	if( FIRST_RIGHT_DETECTION >= 134.5 ) { 
		if( FIRST_LEFT_DETECTION >= 158.5 ) { return new Prediction("TOP", 17, 0); }
	if( FIRST_LEFT_DETECTION < 158.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 148 ) { 
		if( MAX_DX2_LEFT >= 3937.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 3937.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 148 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 134.5 ) { 
		if( AVG_DX2_RIGHT < 3.82 ) { return new Prediction("LEFT", 9, 0); }
		if( AVG_DX2_RIGHT >= 3.82 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -9136 ) { return new Prediction("TOP", 17, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 21 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -11168 ) { 
	if( MAX_DX2_LEFT >= 6894 ) { 
	if( MAX_DX2_RIGHT < 10112.5 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 120, 0); }
	}
	if( MAX_DX2_RIGHT >= 10112.5 ) { 
	if( MAX_AMP_LEFT < 14474 ) { 
		if( MAX_DX2_RIGHT < 14032.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_RIGHT >= 14032.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 14474 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( MAX_DX2_LEFT < 6894 ) { 
	if( AVG_AMP_RIGHT < -2 ) { 
	if( MAX_AMP_RIGHT < -16336 ) { 
	if( AVG_AMP_LEFT >= -9.5 ) { 
		if( MAX_AMP_LEFT >= 13753.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 13753.5 ) { return new Prediction("BOTTOM", 98, 0); }
	}
	if( AVG_AMP_LEFT < -9.5 ) { 
		if( DX2_DELTA < 4674 ) { return new Prediction("RIGHT", 3, 0); }
		if( DX2_DELTA >= 4674 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -16336 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( MAX_AMP_LEFT >= 7380 ) { return new Prediction("TOP", 17, 0); }
	if( MAX_AMP_LEFT < 7380 ) { 
		if( AVG_AMP_LEFT >= 12.5 ) { return new Prediction("LEFT", 4, 0); }
		if( AVG_AMP_LEFT < 12.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_AMP_LEFT >= 6734 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_LEFT < 6734 ) { return new Prediction("BOTTOM", 21, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -2 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
		if( AMP_DELTA >= 5878.5 ) { return new Prediction("RIGHT", 103, 0); }
		if( AMP_DELTA < 5878.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_LEFT >= -7.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( MAX_DX2_RIGHT < 6731 ) { return new Prediction("RIGHT", 21, 0); }
	if( MAX_DX2_RIGHT >= 6731 ) { 
	if( DX2_DELTA < 5339.5 ) { 
		if( DX2_DELTA < 2578 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA >= 2578 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( DX2_DELTA >= 5339.5 ) { return new Prediction("BOTTOM", 11, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( AVG_AMP_LEFT >= 27 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_AMP_LEFT < 27 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 10, 0); }
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree55() {
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_DX2_LEFT < 2943 ) { 
	if( MAX_DX2_LEFT < 2420 ) { 
	if( MAX_AMP_LEFT < 3968.5 ) { 
		if( FIRST_RIGHT_DETECTION < 172 ) { return new Prediction("LEFT", 92, 0); }
	if( FIRST_RIGHT_DETECTION >= 172 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 35, 0); }
	if( AVG_AMP_RIGHT < -25.5 ) { 
		if( AVG_DX2_RIGHT >= 3.66 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < 3.66 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
		if( AVG_AMP_RIGHT < 5 ) { return new Prediction("LEFT", 25, 0); }
	if( AVG_AMP_RIGHT >= 5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( AVG_DX2_RIGHT >= 1.99 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 1.99 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 3968.5 ) { 
		if( DX2_DELTA >= 1292.5 ) { return new Prediction("LEFT", 23, 0); }
		if( DX2_DELTA < 1292.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2420 ) { 
	if( DX2_DELTA >= 206 ) { 
	if( AVG_AMP_RIGHT >= 4.5 ) { 
		if( FIRST_LEFT_DETECTION < 264.5 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 264.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < 4.5 ) { 
		if( FIRST_LEFT_DETECTION < 116.5 ) { return new Prediction("LEFT", 11, 0); }
	if( FIRST_LEFT_DETECTION >= 116.5 ) { 
		if( MAX_AMP_LEFT < 4974.5 ) { return new Prediction("LEFT", 6, 0); }
		if( MAX_AMP_LEFT >= 4974.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
		if( DX2_DELTA < 206 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2943 ) { 
	if( AVG_AMP_RIGHT < 66.5 ) { 
	if( MAX_AMP_LEFT >= 6144.5 ) { 
	if( AVG_AMP_LEFT >= 33 ) { 
		if( MAX_AMP_LEFT >= 9787.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_AMP_LEFT < 9787.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT < 33 ) { return new Prediction("TOP", 154, 0); }
	}
	if( MAX_AMP_LEFT < 6144.5 ) { 
	if( AMP_DELTA >= 3822 ) { 
		if( MAX_DX2_LEFT < 9732 ) { return new Prediction("BOTTOM", 7, 0); }
		if( MAX_DX2_LEFT >= 9732 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AMP_DELTA < 3822 ) { return new Prediction("TOP", 13, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 66.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( FIRST_LEFT_DETECTION >= 49.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_AMP_RIGHT < -17323 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_RIGHT >= -17323 ) { return new Prediction("RIGHT", 17, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_DX2_LEFT >= 16304.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 16304.5 ) { 
		if( MAX_AMP_LEFT < 8748 ) { return new Prediction("RIGHT", 125, 0); }
	if( MAX_AMP_LEFT >= 8748 ) { 
		if( MAX_AMP_LEFT < 9221.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= 9221.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
		if( FIRST_LEFT_DETECTION < 49.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AVG_DX2_RIGHT < 0.7 ) { 
		if( MAX_DX2_LEFT >= 4178.5 ) { return new Prediction("BOTTOM", 10, 0); }
		if( MAX_DX2_LEFT < 4178.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= 0.7 ) { 
		if( MAX_DX2_RIGHT >= 11033 ) { return new Prediction("BOTTOM", 8, 0); }
	if( MAX_DX2_RIGHT < 11033 ) { 
		if( MAX_DX2_LEFT < 5650.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_LEFT >= 5650.5 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( AVG_AMP_RIGHT >= -5 ) { 
		if( MAX_DX2_RIGHT >= 7235.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( MAX_DX2_RIGHT < 7235.5 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 30, 0); }
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -5 ) { 
	if( DX2_DELTA < 3264 ) { 
		if( DX2_DELTA >= 3104 ) { return new Prediction("RIGHT", 1, 0); }
	if( DX2_DELTA < 3104 ) { 
		if( AVG_AMP_RIGHT >= -15.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT < -15.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( DX2_DELTA >= 3264 ) { 
		if( AMP_DELTA >= 7619.5 ) { return new Prediction("BOTTOM", 156, 0); }
		if( AMP_DELTA < 7619.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree56() {
	if( AMP_DELTA >= 6814 ) { 
	if( AVG_AMP_RIGHT < -8 ) { 
	if( MAX_DX2_LEFT >= 7817.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 237.5 ) { 
		if( AVG_DX2_LEFT >= 0.51 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < 0.51 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 237.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DETECTION_DELTA < 6.5 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	if( MAX_DX2_LEFT < 7817.5 ) { 
	if( MAX_DX2_RIGHT < 6080.5 ) { 
		if( MAX_AMP_LEFT < 167.5 ) { return new Prediction("RIGHT", 10, 0); }
	if( MAX_AMP_LEFT >= 167.5 ) { 
		if( FIRST_LEFT_DETECTION >= 272.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( FIRST_LEFT_DETECTION < 272.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 6080.5 ) { 
	if( MAX_AMP_LEFT < -4334.5 ) { 
		if( FIRST_RIGHT_DETECTION < 153 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 153 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_AMP_LEFT >= -4334.5 ) { return new Prediction("BOTTOM", 133, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -8 ) { 
	if( MAX_DX2_RIGHT < 8260 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_DX2_RIGHT < 6.8 ) { 
		if( AVG_AMP_LEFT >= 6.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_LEFT < 6.5 ) { return new Prediction("RIGHT", 146, 0); }
	}
		if( AVG_DX2_RIGHT >= 6.8 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_RIGHT < 5085.5 ) { 
		if( FIRST_LEFT_DETECTION < 150 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 150 ) { 
		if( AVG_DX2_RIGHT < 0.65 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 5085.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 8260 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
		if( DX2_DELTA >= 7504 ) { return new Prediction("BOTTOM", 2, 0); }
	if( DX2_DELTA < 7504 ) { 
		if( MAX_AMP_RIGHT < 19846 ) { return new Prediction("RIGHT", 43, 0); }
	if( MAX_AMP_RIGHT >= 19846 ) { 
		if( FIRST_RIGHT_DETECTION < 220.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 220.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_AMP_LEFT < 4983.5 ) { 
	if( DX2_DELTA < 6157.5 ) { 
	if( AVG_AMP_RIGHT >= 16.5 ) { 
	if( FIRST_RIGHT_DETECTION < 280.5 ) { 
		if( AVG_DX2_RIGHT >= 2.04 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT < 2.04 ) { 
		if( MAX_DX2_RIGHT < 2110 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 2110 ) { return new Prediction("RIGHT", 12, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 280.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 16.5 ) { 
	if( MAX_DX2_LEFT < 3933.5 ) { 
	if( AVG_DX2_RIGHT < 5.33 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( FIRST_RIGHT_DETECTION < 245 ) { return new Prediction("LEFT", 5, 0); }
		if( FIRST_RIGHT_DETECTION >= 245 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DETECTION_DELTA >= 0.5 ) { 
		if( MAX_AMP_LEFT < 3991.5 ) { return new Prediction("LEFT", 150, 0); }
	if( MAX_AMP_LEFT >= 3991.5 ) { 
		if( MAX_DX2_RIGHT >= 3335.5 ) { return new Prediction("LEFT", 14, 0); }
		if( MAX_DX2_RIGHT < 3335.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 5.33 ) { 
	if( MAX_AMP_LEFT < 2625 ) { 
		if( MAX_DX2_LEFT < 1638.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 1638.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 2625 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3933.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( DX2_DELTA >= 6157.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_AMP_LEFT >= 4983.5 ) { 
	if( AMP_DELTA >= 4023.5 ) { 
	if( MAX_AMP_LEFT < 6623.5 ) { 
		if( DX2_DELTA < 1764 ) { return new Prediction("TOP", 3, 0); }
	if( DX2_DELTA >= 1764 ) { 
		if( FIRST_LEFT_DETECTION < 138.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 138.5 ) { return new Prediction("BOTTOM", 11, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 6623.5 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("TOP", 22, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
		if( AMP_DELTA < 4023.5 ) { return new Prediction("TOP", 172, 0); }
	}
	}
return null;
}
private Prediction runTree57() {
	if( AMP_DELTA < 7190.5 ) { 
	if( AVG_AMP_RIGHT < 15.5 ) { 
	if( MAX_DX2_LEFT >= 2749 ) { 
	if( MAX_AMP_LEFT < 8952.5 ) { 
	if( MAX_DX2_RIGHT < 6890 ) { 
		if( FIRST_RIGHT_DETECTION >= 47.5 ) { return new Prediction("TOP", 37, 0); }
		if( FIRST_RIGHT_DETECTION < 47.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 6890 ) { 
	if( MAX_DX2_LEFT < 12078 ) { 
		if( AVG_DX2_LEFT < -1.07 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -1.07 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 12078 ) { return new Prediction("TOP", 4, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 8952.5 ) { return new Prediction("TOP", 120, 0); }
	}
	if( MAX_DX2_LEFT < 2749 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
	if( AVG_DX2_RIGHT >= -3.39 ) { 
	if( MAX_AMP_RIGHT < -8688.5 ) { 
		if( MAX_AMP_LEFT < 268 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= 268 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -8688.5 ) { return new Prediction("LEFT", 45, 0); }
	}
		if( AVG_DX2_RIGHT < -3.39 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( AVG_AMP_LEFT >= 0.5 ) { 
	if( MAX_AMP_LEFT < 4782 ) { 
	if( DX2_DELTA < 49 ) { 
		if( AVG_DX2_LEFT < 0.26 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.26 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DX2_DELTA >= 49 ) { return new Prediction("LEFT", 134, 0); }
	}
	if( MAX_AMP_LEFT >= 4782 ) { 
		if( MAX_AMP_RIGHT < -11016 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_AMP_RIGHT >= -11016 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 15.5 ) { 
	if( MAX_DX2_LEFT < 3654.5 ) { 
		if( FIRST_LEFT_DETECTION >= 283 ) { return new Prediction("LEFT", 3, 0); }
	if( FIRST_LEFT_DETECTION < 283 ) { 
	if( DX2_DELTA >= 1274.5 ) { 
		if( MAX_DX2_LEFT >= 1650.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1650.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA < 1274.5 ) { return new Prediction("RIGHT", 16, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3654.5 ) { 
	if( MAX_AMP_LEFT < 7050 ) { 
		if( FIRST_LEFT_DETECTION < 185 ) { return new Prediction("RIGHT", 2, 0); }
	if( FIRST_LEFT_DETECTION >= 185 ) { 
		if( AVG_DX2_LEFT >= 1.01 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 1.01 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 7050 ) { return new Prediction("TOP", 18, 0); }
	}
	}
	}
	if( AMP_DELTA >= 7190.5 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
	if( MAX_DX2_LEFT < 10542.5 ) { 
	if( MAX_AMP_LEFT < 2466.5 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
		if( MAX_DX2_LEFT >= 1822.5 ) { return new Prediction("RIGHT", 16, 0); }
	if( MAX_DX2_LEFT < 1822.5 ) { 
		if( FIRST_LEFT_DETECTION < 197.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 197.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -12.5 ) { 
	if( DX2_DELTA >= 2774.5 ) { 
		if( MAX_AMP_LEFT >= -5778.5 ) { return new Prediction("BOTTOM", 16, 0); }
		if( MAX_AMP_LEFT < -5778.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DX2_DELTA < 2774.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 2466.5 ) { 
		if( AMP_DELTA >= 8927 ) { return new Prediction("BOTTOM", 147, 0); }
	if( AMP_DELTA < 8927 ) { 
		if( MAX_AMP_LEFT < 4841 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_AMP_LEFT >= 4841 ) { 
		if( AVG_DX2_LEFT >= -0.27 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT < -0.27 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
		if( MAX_DX2_LEFT >= 10542.5 ) { return new Prediction("TOP", 14, 0); }
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
	if( MAX_AMP_LEFT < 16326 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AMP_DELTA < 20334.5 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("RIGHT", 20, 0); }
	}
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("RIGHT", 162, 0); }
	}
		if( AMP_DELTA >= 20334.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_DX2_RIGHT >= 5166 ) { return new Prediction("BOTTOM", 11, 0); }
	if( MAX_DX2_RIGHT < 5166 ) { 
		if( FIRST_RIGHT_DETECTION < 197.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 197.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 16326 ) { return new Prediction("TOP", 5, 0); }
	}
	}
return null;
}
private Prediction runTree58() {
	if( AMP_DELTA < 5936.5 ) { 
	if( MAX_AMP_LEFT < 4140 ) { 
	if( DX2_DELTA < 3765 ) { 
	if( AVG_DX2_LEFT >= 0.44 ) { 
		if( AVG_DX2_LEFT < 0.58 ) { return new Prediction("TOP", 3, 0); }
		if( AVG_DX2_LEFT >= 0.58 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( AVG_DX2_LEFT < 0.44 ) { 
	if( MAX_AMP_RIGHT < 6041.5 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( MAX_DX2_RIGHT >= 2838 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 2838 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("LEFT", 142, 0); }
	}
		if( MAX_AMP_RIGHT >= 6041.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DX2_DELTA >= 3765 ) { 
		if( AMP_DELTA < 3384 ) { return new Prediction("TOP", 19, 0); }
	if( AMP_DELTA >= 3384 ) { 
		if( FIRST_LEFT_DETECTION < 101.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 101.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4140 ) { 
		if( MAX_AMP_RIGHT < -14341.5 ) { return new Prediction("TOP", 108, 0); }
	if( MAX_AMP_RIGHT >= -14341.5 ) { 
	if( MAX_AMP_LEFT < 6127.5 ) { 
	if( AMP_DELTA >= 3536 ) { 
		if( AVG_DX2_LEFT < 0.34 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_LEFT >= 0.34 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA < 3536 ) { 
		if( AVG_DX2_LEFT >= -0.72 ) { return new Prediction("TOP", 10, 0); }
	if( AVG_DX2_LEFT < -0.72 ) { 
		if( AVG_DX2_RIGHT < 1.37 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 1.37 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 6127.5 ) { 
		if( MAX_DX2_RIGHT >= 10318.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT < 10318.5 ) { return new Prediction("TOP", 62, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 5936.5 ) { 
	if( MAX_DX2_RIGHT >= 6213 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AVG_AMP_LEFT >= -4.5 ) { 
	if( MAX_DX2_RIGHT >= 7478 ) { 
	if( MAX_DX2_LEFT < 8261.5 ) { 
		if( MAX_AMP_RIGHT >= -26925.5 ) { return new Prediction("BOTTOM", 16, 0); }
		if( MAX_AMP_RIGHT < -26925.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 8261.5 ) { 
		if( AVG_AMP_LEFT < 36 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT >= 36 ) { return new Prediction("TOP", 3, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 7478 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( AVG_AMP_LEFT < -4.5 ) { 
		if( MAX_AMP_LEFT < 18918.5 ) { return new Prediction("RIGHT", 60, 0); }
		if( MAX_AMP_LEFT >= 18918.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 5.5 ) { 
	if( AVG_AMP_LEFT >= -16.5 ) { 
	if( AVG_DX2_LEFT < -2.56 ) { 
		if( MAX_DX2_LEFT >= 2774.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT < 2774.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -2.56 ) { return new Prediction("BOTTOM", 187, 0); }
	}
	if( AVG_AMP_LEFT < -16.5 ) { 
		if( AVG_DX2_RIGHT >= 1.24 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 1.24 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6213 ) { 
	if( AVG_AMP_LEFT >= 6.5 ) { 
		if( DX2_DELTA >= 4958 ) { return new Prediction("TOP", 8, 0); }
	if( DX2_DELTA < 4958 ) { 
		if( AVG_DX2_RIGHT >= 5.55 ) { return new Prediction("LEFT", 13, 0); }
	if( AVG_DX2_RIGHT < 5.55 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( DX2_DELTA < 2496 ) { return new Prediction("RIGHT", 1, 0); }
		if( DX2_DELTA >= 2496 ) { return new Prediction("LEFT", 10, 0); }
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < 6.5 ) { 
	if( DX2_DELTA < 4894.5 ) { 
	if( MAX_AMP_RIGHT >= -17471.5 ) { 
	if( AMP_DELTA < 6786 ) { 
		if( MAX_DX2_LEFT < 1964 ) { return new Prediction("RIGHT", 11, 0); }
		if( MAX_DX2_LEFT >= 1964 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AMP_DELTA >= 6786 ) { return new Prediction("RIGHT", 118, 0); }
	}
	if( MAX_AMP_RIGHT < -17471.5 ) { 
		if( AVG_DX2_RIGHT >= 3.19 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 3.19 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
		if( DX2_DELTA >= 4894.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
return null;
}
private Prediction runTree59() {
	if( AMP_DELTA < 7994 ) { 
	if( MAX_DX2_LEFT < 3073.5 ) { 
	if( AVG_DX2_RIGHT < -3.36 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
		if( MAX_DX2_LEFT < 2177.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2177.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_RIGHT >= 19.5 ) { 
		if( AVG_AMP_LEFT >= 3.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_LEFT < 3.5 ) { return new Prediction("RIGHT", 16, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -3.36 ) { 
	if( AMP_DELTA >= 6071 ) { 
	if( DX2_DELTA >= 2664 ) { 
		if( MAX_DX2_LEFT >= 1577.5 ) { return new Prediction("LEFT", 22, 0); }
	if( MAX_DX2_LEFT < 1577.5 ) { 
		if( AVG_DX2_RIGHT >= 3.19 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_RIGHT < 3.19 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DX2_DELTA < 2664 ) { 
		if( AVG_DX2_RIGHT >= 4.13 ) { return new Prediction("LEFT", 3, 0); }
	if( AVG_DX2_RIGHT < 4.13 ) { 
	if( MAX_DX2_RIGHT >= 4283.5 ) { 
		if( MAX_AMP_RIGHT < -10690.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT >= -10690.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 4283.5 ) { return new Prediction("RIGHT", 23, 0); }
	}
	}
	}
	if( AMP_DELTA < 6071 ) { 
	if( MAX_DX2_LEFT >= 2214.5 ) { 
	if( MAX_AMP_LEFT < 4599 ) { 
		if( DX2_DELTA >= 36 ) { return new Prediction("LEFT", 16, 0); }
		if( DX2_DELTA < 36 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 4599 ) { return new Prediction("TOP", 16, 0); }
	}
	if( MAX_DX2_LEFT < 2214.5 ) { 
	if( MAX_AMP_LEFT >= 4169 ) { 
		if( DX2_DELTA < 1311.5 ) { return new Prediction("TOP", 7, 0); }
		if( DX2_DELTA >= 1311.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	if( MAX_AMP_LEFT < 4169 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
		if( AMP_DELTA < 5170 ) { return new Prediction("RIGHT", 1, 0); }
		if( AMP_DELTA >= 5170 ) { return new Prediction("LEFT", 14, 0); }
	}
		if( AMP_DELTA < 5114.5 ) { return new Prediction("LEFT", 118, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 3073.5 ) { 
	if( MAX_DX2_RIGHT < 9304 ) { 
	if( MAX_DX2_LEFT < 4221 ) { 
	if( DX2_DELTA < 1764 ) { 
	if( MAX_AMP_LEFT < 5353 ) { 
		if( MAX_DX2_LEFT >= 3306.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT < 3306.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 5353 ) { return new Prediction("TOP", 9, 0); }
	}
		if( DX2_DELTA >= 1764 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 4221 ) { return new Prediction("TOP", 174, 0); }
	}
	if( MAX_DX2_RIGHT >= 9304 ) { 
		if( MAX_AMP_LEFT >= 9303.5 ) { return new Prediction("TOP", 15, 0); }
		if( MAX_AMP_LEFT < 9303.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 7994 ) { 
	if( MAX_AMP_RIGHT < 14257 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( MAX_AMP_RIGHT < -14237.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 116, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( AVG_AMP_RIGHT < 11.5 ) { return new Prediction("BOTTOM", 13, 0); }
		if( AVG_AMP_RIGHT >= 11.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -14237.5 ) { 
	if( DX2_DELTA >= 3659 ) { 
		if( AVG_DX2_LEFT < -2.62 ) { return new Prediction("TOP", 1, 0); }
	if( AVG_DX2_LEFT >= -2.62 ) { 
		if( MAX_DX2_LEFT >= 9004 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 9004 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	if( DX2_DELTA < 3659 ) { 
		if( MAX_DX2_LEFT >= 2102 ) { return new Prediction("RIGHT", 11, 0); }
	if( MAX_DX2_LEFT < 2102 ) { 
		if( DETECTION_DELTA < 13.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( DETECTION_DELTA >= 13.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( MAX_AMP_RIGHT < -15795 ) { 
	if( MAX_DX2_RIGHT < 7872 ) { 
		if( AVG_AMP_RIGHT < -35.5 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_AMP_RIGHT >= -35.5 ) { return new Prediction("RIGHT", 32, 0); }
	}
	if( MAX_DX2_RIGHT >= 7872 ) { 
	if( AVG_AMP_LEFT < -15.5 ) { 
		if( MAX_DX2_LEFT < 3765 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 3765 ) { return new Prediction("RIGHT", 25, 0); }
	}
	if( AVG_AMP_LEFT >= -15.5 ) { 
		if( DX2_DELTA < 5243 ) { return new Prediction("RIGHT", 5, 0); }
	if( DX2_DELTA >= 5243 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 9, 0); }
		if( DETECTION_DELTA < 6.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= -15795 ) { 
		if( MAX_DX2_LEFT >= 16730.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 16730.5 ) { return new Prediction("RIGHT", 50, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= 14257 ) { 
		if( AVG_AMP_RIGHT >= 27 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_RIGHT < 27 ) { return new Prediction("BOTTOM", 55, 0); }
	}
	}
return null;
}
private Prediction runTree60() {
	if( MAX_DX2_LEFT >= 2684 ) { 
	if( MAX_AMP_LEFT < 6044.5 ) { 
	if( AVG_AMP_LEFT >= -16.5 ) { 
	if( AVG_AMP_RIGHT >= 9 ) { 
	if( DX2_DELTA < 5686.5 ) { 
		if( MAX_AMP_LEFT < 5879 ) { return new Prediction("RIGHT", 41, 0); }
		if( MAX_AMP_LEFT >= 5879 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 5686.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 9 ) { 
	if( MAX_DX2_RIGHT < 6196 ) { 
	if( MAX_AMP_RIGHT >= -6768 ) { 
		if( FIRST_LEFT_DETECTION < 73.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 73.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_AMP_RIGHT < -6768 ) { 
		if( AVG_DX2_LEFT >= -0.62 ) { return new Prediction("TOP", 6, 0); }
		if( AVG_DX2_LEFT < -0.62 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 6196 ) { 
	if( MAX_AMP_LEFT >= -5580 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("BOTTOM", 148, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
		if( MAX_DX2_RIGHT >= 9350.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_RIGHT < 9350.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < -5580 ) { 
		if( MAX_DX2_LEFT >= 9854 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_LEFT < 9854 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT < -16.5 ) { 
		if( MAX_DX2_LEFT >= 15013 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 15013 ) { return new Prediction("RIGHT", 73, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 6044.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( AMP_DELTA >= 11050.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( AMP_DELTA < 11050.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 256 ) { 
		if( FIRST_RIGHT_DETECTION < 260 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 260 ) { return new Prediction("TOP", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 256 ) { return new Prediction("TOP", 133, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
	if( MAX_DX2_RIGHT < 10094 ) { 
	if( MAX_DX2_LEFT < 4028 ) { 
		if( AVG_DX2_LEFT >= 1.73 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < 1.73 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 4028 ) { 
		if( AVG_AMP_LEFT >= -30 ) { return new Prediction("TOP", 35, 0); }
	if( AVG_AMP_LEFT < -30 ) { 
		if( FIRST_LEFT_DETECTION >= 156 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 156 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 10094 ) { 
		if( AVG_DX2_LEFT >= 4.49 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 4.49 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2684 ) { 
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_AMP_RIGHT < 6376 ) { 
	if( MAX_AMP_LEFT < 3948.5 ) { 
	if( AVG_DX2_RIGHT < -2.58 ) { 
	if( MAX_AMP_RIGHT < -6875.5 ) { 
		if( MAX_AMP_LEFT < -2559.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -2559.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( MAX_AMP_RIGHT >= -6875.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	if( AVG_DX2_RIGHT >= -2.58 ) { 
		if( AVG_DX2_RIGHT < 5.33 ) { return new Prediction("LEFT", 149, 0); }
	if( AVG_DX2_RIGHT >= 5.33 ) { 
		if( AVG_DX2_LEFT >= 0.23 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < 0.23 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 3948.5 ) { 
	if( AVG_AMP_LEFT < 19 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
	if( AMP_DELTA >= 2077.5 ) { 
		if( MAX_DX2_RIGHT < 2831.5 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 2831.5 ) { return new Prediction("LEFT", 10, 0); }
	}
		if( AMP_DELTA < 2077.5 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_AMP_LEFT >= 4800.5 ) { return new Prediction("TOP", 6, 0); }
	}
		if( AVG_AMP_LEFT >= 19 ) { return new Prediction("LEFT", 21, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= 6376 ) { 
		if( MAX_DX2_RIGHT >= 2837.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( MAX_DX2_RIGHT < 2837.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("RIGHT", 69, 0); }
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_DX2_RIGHT < 5085.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_DX2_RIGHT >= 5085.5 ) { return new Prediction("BOTTOM", 29, 0); }
	}
	}
	}
return null;
}
private Prediction runTree61() {
	if( AMP_DELTA < 6927.5 ) { 
	if( DX2_DELTA < 3972.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 101, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_AMP_LEFT >= 4993.5 ) { 
		if( AVG_AMP_LEFT < 28 ) { return new Prediction("TOP", 95, 0); }
	if( AVG_AMP_LEFT >= 28 ) { 
	if( DX2_DELTA >= 2842 ) { 
		if( MAX_AMP_RIGHT < -10148 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_RIGHT >= -10148 ) { return new Prediction("TOP", 2, 0); }
	}
		if( DX2_DELTA < 2842 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	if( MAX_AMP_LEFT < 4993.5 ) { 
	if( MAX_AMP_LEFT < 3948.5 ) { 
	if( FIRST_LEFT_DETECTION >= 178.5 ) { 
	if( AVG_DX2_RIGHT >= 1.99 ) { 
		if( DX2_DELTA >= 2648 ) { return new Prediction("BOTTOM", 1, 0); }
		if( DX2_DELTA < 2648 ) { return new Prediction("LEFT", 14, 0); }
	}
	if( AVG_DX2_RIGHT < 1.99 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
		if( MAX_DX2_RIGHT >= 4547.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT < 4547.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
		if( AMP_DELTA < 5114.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 178.5 ) { return new Prediction("LEFT", 41, 0); }
	}
	if( MAX_AMP_LEFT >= 3948.5 ) { 
		if( DX2_DELTA < 1250 ) { return new Prediction("TOP", 9, 0); }
		if( DX2_DELTA >= 1250 ) { return new Prediction("LEFT", 25, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 3972.5 ) { 
	if( MAX_AMP_LEFT < 7680.5 ) { 
	if( MAX_DX2_LEFT < 8489 ) { 
		if( AVG_DX2_RIGHT < -1.71 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_DX2_RIGHT >= -1.71 ) { 
		if( AVG_DX2_LEFT < -0.85 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -0.85 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 8489 ) { return new Prediction("TOP", 13, 0); }
	}
		if( MAX_AMP_LEFT >= 7680.5 ) { return new Prediction("TOP", 71, 0); }
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( AMP_DELTA >= 8741 ) { 
	if( AVG_DX2_RIGHT < -4.26 ) { 
		if( AVG_AMP_RIGHT >= 3 ) { return new Prediction("RIGHT", 40, 0); }
	if( AVG_AMP_RIGHT < 3 ) { 
		if( FIRST_RIGHT_DETECTION >= 179.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 179.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -4.26 ) { 
	if( AVG_AMP_RIGHT >= -3.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( MAX_DX2_LEFT < 3983 ) { return new Prediction("RIGHT", 68, 0); }
	if( MAX_DX2_LEFT >= 3983 ) { 
	if( MAX_AMP_LEFT < 10386.5 ) { 
	if( DX2_DELTA >= 5802 ) { 
		if( AVG_DX2_RIGHT < 1.86 ) { return new Prediction("BOTTOM", 3, 0); }
	if( AVG_DX2_RIGHT >= 1.86 ) { 
		if( FIRST_RIGHT_DETECTION >= 189.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 189.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
		if( DX2_DELTA < 5802 ) { return new Prediction("RIGHT", 29, 0); }
	}
	if( MAX_AMP_LEFT >= 10386.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 156 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 156 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	if( AVG_AMP_RIGHT < -3.5 ) { 
		if( AVG_AMP_LEFT >= 42 ) { return new Prediction("TOP", 7, 0); }
	if( AVG_AMP_LEFT < 42 ) { 
	if( AVG_AMP_LEFT >= -14.5 ) { 
		if( MAX_DX2_LEFT >= 18205 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_LEFT < 18205 ) { 
		if( DX2_DELTA >= 1738.5 ) { return new Prediction("BOTTOM", 155, 0); }
		if( DX2_DELTA < 1738.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < -14.5 ) { 
		if( MAX_AMP_LEFT < -3833 ) { return new Prediction("RIGHT", 7, 0); }
		if( MAX_AMP_LEFT >= -3833 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 8741 ) { 
	if( MAX_DX2_RIGHT < 5088.5 ) { 
	if( AVG_AMP_RIGHT >= -13 ) { 
	if( MAX_DX2_RIGHT < 2880.5 ) { 
		if( MAX_DX2_RIGHT >= 2762 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 2762 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_DX2_RIGHT >= 2880.5 ) { return new Prediction("RIGHT", 38, 0); }
	}
	if( AVG_AMP_RIGHT < -13 ) { 
		if( AVG_DX2_RIGHT >= 5.37 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < 5.37 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5088.5 ) { 
	if( AVG_DX2_RIGHT >= 0.46 ) { 
		if( MAX_AMP_LEFT >= 4400.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_LEFT < 4400.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_DX2_RIGHT < 0.46 ) { 
		if( AVG_DX2_RIGHT < -4.61 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.61 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree62() {
	if( DX2_DELTA >= 4041.5 ) { 
		if( MAX_AMP_LEFT >= 11464 ) { return new Prediction("TOP", 76, 0); }
	if( MAX_AMP_LEFT < 11464 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( MAX_AMP_RIGHT >= -18210.5 ) { 
	if( AVG_AMP_LEFT >= 5 ) { 
		if( MAX_DX2_LEFT < 9264 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_DX2_LEFT >= 9264 ) { return new Prediction("TOP", 16, 0); }
	}
	if( AVG_AMP_LEFT < 5 ) { 
	if( FIRST_LEFT_DETECTION >= 193 ) { 
		if( AVG_DX2_RIGHT < 1.78 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_DX2_RIGHT >= 1.78 ) { return new Prediction("TOP", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION < 193 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( MAX_DX2_LEFT < 2888.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 2888.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( DETECTION_DELTA < 6.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -18210.5 ) { 
	if( DX2_DELTA >= 5604.5 ) { 
		if( FIRST_LEFT_DETECTION < 132.5 ) { return new Prediction("RIGHT", 8, 0); }
		if( FIRST_LEFT_DETECTION >= 132.5 ) { return new Prediction("BOTTOM", 16, 0); }
	}
		if( DX2_DELTA < 5604.5 ) { return new Prediction("RIGHT", 21, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AMP_DELTA >= 7581 ) { return new Prediction("BOTTOM", 174, 0); }
		if( AMP_DELTA < 7581 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	if( DX2_DELTA < 4041.5 ) { 
	if( AMP_DELTA < 6927.5 ) { 
	if( MAX_AMP_LEFT >= 4993.5 ) { 
	if( MAX_AMP_LEFT < 5628.5 ) { 
	if( MAX_AMP_RIGHT < -8747 ) { 
		if( AVG_DX2_LEFT >= 0.3 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT < 0.3 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -8747 ) { return new Prediction("TOP", 8, 0); }
	}
		if( MAX_AMP_LEFT >= 5628.5 ) { return new Prediction("TOP", 93, 0); }
	}
	if( MAX_AMP_LEFT < 4993.5 ) { 
	if( MAX_AMP_LEFT >= 3544 ) { 
		if( DX2_DELTA >= 1125 ) { return new Prediction("LEFT", 33, 0); }
		if( DX2_DELTA < 1125 ) { return new Prediction("TOP", 14, 0); }
	}
	if( MAX_AMP_LEFT < 3544 ) { 
	if( AVG_DX2_RIGHT < -1.52 ) { 
		if( AMP_DELTA < 4936.5 ) { return new Prediction("LEFT", 15, 0); }
	if( AMP_DELTA >= 4936.5 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -1.52 ) { 
	if( DX2_DELTA >= 1201.5 ) { 
	if( AMP_DELTA >= 6170 ) { 
	if( FIRST_LEFT_DETECTION < 217 ) { 
		if( FIRST_LEFT_DETECTION < 170 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 170 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 217 ) { 
		if( MAX_DX2_RIGHT >= 3960 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_RIGHT < 3960 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( AMP_DELTA < 6170 ) { return new Prediction("LEFT", 37, 0); }
	}
		if( DX2_DELTA < 1201.5 ) { return new Prediction("LEFT", 76, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( AMP_DELTA >= 8052.5 ) { 
	if( AVG_AMP_RIGHT < -29 ) { 
		if( MAX_DX2_LEFT < 7098.5 ) { return new Prediction("BOTTOM", 10, 0); }
		if( MAX_DX2_LEFT >= 7098.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -29 ) { 
		if( AVG_AMP_LEFT < 8.5 ) { return new Prediction("RIGHT", 136, 0); }
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AMP_DELTA < 8052.5 ) { 
	if( MAX_DX2_LEFT >= 2173 ) { 
		if( MAX_AMP_RIGHT >= -11486 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_AMP_RIGHT < -11486 ) { return new Prediction("LEFT", 7, 0); }
	}
	if( MAX_DX2_LEFT < 2173 ) { 
		if( FIRST_RIGHT_DETECTION >= 256 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 256 ) { return new Prediction("RIGHT", 24, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree63() {
	if( MAX_AMP_LEFT < 6559.5 ) { 
	if( AMP_DELTA < 8098.5 ) { 
	if( DETECTION_DELTA < 15.5 ) { 
	if( AMP_DELTA >= 5114.5 ) { 
	if( AVG_DX2_RIGHT < 0.33 ) { 
		if( MAX_DX2_RIGHT < 4348 ) { return new Prediction("RIGHT", 24, 0); }
	if( MAX_DX2_RIGHT >= 4348 ) { 
		if( DX2_DELTA < 2298 ) { return new Prediction("RIGHT", 5, 0); }
	if( DX2_DELTA >= 2298 ) { 
		if( MAX_DX2_RIGHT < 7922.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_RIGHT >= 7922.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= 0.33 ) { 
	if( AVG_AMP_LEFT < 2 ) { 
		if( AVG_DX2_LEFT >= 2.13 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 2.13 ) { return new Prediction("RIGHT", 9, 0); }
	}
	if( AVG_AMP_LEFT >= 2 ) { 
		if( MAX_DX2_RIGHT >= 3065 ) { return new Prediction("LEFT", 34, 0); }
		if( MAX_DX2_RIGHT < 3065 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 5114.5 ) { 
	if( MAX_DX2_LEFT >= 2886.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_LEFT < 4083 ) { 
		if( AVG_AMP_LEFT < 0.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT >= 0.5 ) { return new Prediction("TOP", 6, 0); }
	}
		if( MAX_DX2_LEFT >= 4083 ) { return new Prediction("TOP", 23, 0); }
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( MAX_DX2_RIGHT >= 5286 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_DX2_RIGHT < 5286 ) { 
		if( FIRST_LEFT_DETECTION >= 160 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION < 160 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2886.5 ) { 
	if( MAX_DX2_LEFT < 2193 ) { 
	if( DX2_DELTA >= 383.5 ) { 
		if( MAX_AMP_LEFT < 4347.5 ) { return new Prediction("LEFT", 41, 0); }
		if( MAX_AMP_LEFT >= 4347.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DX2_DELTA < 383.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_LEFT >= 2193 ) { 
		if( MAX_AMP_LEFT < 3732.5 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_AMP_LEFT >= 3732.5 ) { 
		if( MAX_DX2_RIGHT < 4162 ) { return new Prediction("TOP", 9, 0); }
		if( MAX_DX2_RIGHT >= 4162 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 15.5 ) { 
		if( MAX_AMP_RIGHT >= -7006.5 ) { return new Prediction("LEFT", 99, 0); }
	if( MAX_AMP_RIGHT < -7006.5 ) { 
	if( MAX_DX2_LEFT < 1718 ) { 
		if( MAX_DX2_LEFT >= 780.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT < 780.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 1718 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( AMP_DELTA >= 8098.5 ) { 
	if( FIRST_LEFT_DETECTION >= 262 ) { 
		if( MAX_DX2_RIGHT >= 4677.5 ) { return new Prediction("BOTTOM", 39, 0); }
		if( MAX_DX2_RIGHT < 4677.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION < 262 ) { 
	if( AVG_AMP_RIGHT < 7.5 ) { 
	if( MAX_DX2_RIGHT < 5457.5 ) { 
		if( MAX_AMP_LEFT >= -12017 ) { return new Prediction("RIGHT", 13, 0); }
		if( MAX_AMP_LEFT < -12017 ) { return new Prediction("TOP", 3, 0); }
	}
	if( MAX_DX2_RIGHT >= 5457.5 ) { 
		if( AVG_AMP_LEFT >= -14.5 ) { return new Prediction("BOTTOM", 144, 0); }
	if( AVG_AMP_LEFT < -14.5 ) { 
		if( FIRST_RIGHT_DETECTION < 159.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 159.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 7.5 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( FIRST_LEFT_DETECTION >= 77.5 ) { 
		if( DETECTION_DELTA < 9.5 ) { return new Prediction("RIGHT", 117, 0); }
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_DX2_LEFT < 2928 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 2928 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6559.5 ) { 
	if( AMP_DELTA >= 6300 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
		if( DX2_DELTA >= 6208.5 ) { return new Prediction("BOTTOM", 10, 0); }
	if( DX2_DELTA < 6208.5 ) { 
		if( AVG_DX2_RIGHT >= 5.25 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 5.25 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
	if( MAX_DX2_LEFT < 4894.5 ) { 
		if( AVG_DX2_LEFT < 0.98 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.98 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_DX2_LEFT >= 4894.5 ) { return new Prediction("RIGHT", 16, 0); }
	}
	}
		if( AMP_DELTA < 6300 ) { return new Prediction("TOP", 176, 0); }
	}
return null;
}
private Prediction runTree64() {
	if( AMP_DELTA < 7065.5 ) { 
	if( MAX_DX2_LEFT >= 2641 ) { 
	if( MAX_AMP_LEFT < 6257 ) { 
	if( AVG_AMP_RIGHT < 28 ) { 
	if( FIRST_RIGHT_DETECTION >= 131.5 ) { 
		if( AMP_DELTA < 4613 ) { return new Prediction("TOP", 19, 0); }
		if( AMP_DELTA >= 4613 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 131.5 ) { 
		if( AVG_DX2_LEFT < 1.55 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_DX2_LEFT >= 1.55 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 28 ) { return new Prediction("RIGHT", 7, 0); }
	}
	if( MAX_AMP_LEFT >= 6257 ) { 
	if( DETECTION_DELTA < 1 ) { 
		if( MAX_DX2_RIGHT < 9114 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_RIGHT >= 9114 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 164, 0); }
	}
	}
	if( MAX_DX2_LEFT < 2641 ) { 
	if( AVG_DX2_RIGHT < -1.52 ) { 
	if( FIRST_RIGHT_DETECTION < 186.5 ) { 
		if( AMP_DELTA < 6439.5 ) { return new Prediction("LEFT", 16, 0); }
		if( AMP_DELTA >= 6439.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 186.5 ) { 
	if( AMP_DELTA >= 4948 ) { 
		if( MAX_DX2_LEFT >= 1854 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT < 1854 ) { return new Prediction("RIGHT", 16, 0); }
	}
	if( AMP_DELTA < 4948 ) { 
	if( MAX_AMP_RIGHT >= -334.5 ) { 
		if( AVG_DX2_RIGHT >= -3.12 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < -3.12 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -334.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= -1.52 ) { 
	if( MAX_AMP_LEFT < 3968.5 ) { 
		if( DETECTION_DELTA >= 4.5 ) { return new Prediction("LEFT", 124, 0); }
	if( DETECTION_DELTA < 4.5 ) { 
		if( AVG_AMP_RIGHT >= 26 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT < 26 ) { return new Prediction("LEFT", 19, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3968.5 ) { 
		if( AVG_DX2_RIGHT >= 2.8 ) { return new Prediction("LEFT", 17, 0); }
	if( AVG_DX2_RIGHT < 2.8 ) { 
		if( MAX_DX2_RIGHT < 3982.5 ) { return new Prediction("TOP", 9, 0); }
		if( MAX_DX2_RIGHT >= 3982.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 7065.5 ) { 
	if( AVG_AMP_RIGHT < -3 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( AMP_DELTA >= 13859 ) { return new Prediction("BOTTOM", 14, 0); }
	if( AMP_DELTA < 13859 ) { 
		if( DETECTION_DELTA < 5.5 ) { return new Prediction("TOP", 8, 0); }
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
	if( MAX_DX2_LEFT >= 5642.5 ) { 
		if( AVG_DX2_RIGHT >= 2.87 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 2.87 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_LEFT < 5642.5 ) { 
		if( MAX_DX2_RIGHT >= 8655 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 8655 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_AMP_LEFT < -8464 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_AMP_LEFT >= -8464 ) { 
	if( MAX_DX2_RIGHT < 5448.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 190 ) { 
		if( AVG_DX2_LEFT >= 0.22 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 0.22 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 190 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 5448.5 ) { return new Prediction("BOTTOM", 147, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -3 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
		if( AMP_DELTA < 11648.5 ) { return new Prediction("RIGHT", 108, 0); }
	if( AMP_DELTA >= 11648.5 ) { 
		if( AVG_AMP_LEFT < -7.5 ) { return new Prediction("RIGHT", 48, 0); }
	if( AVG_AMP_LEFT >= -7.5 ) { 
		if( DX2_DELTA >= 5450 ) { return new Prediction("BOTTOM", 7, 0); }
	if( DX2_DELTA < 5450 ) { 
		if( FIRST_LEFT_DETECTION >= 67 ) { return new Prediction("RIGHT", 10, 0); }
		if( FIRST_LEFT_DETECTION < 67 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
	if( AMP_DELTA < 8348.5 ) { 
		if( FIRST_LEFT_DETECTION >= 246 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 246 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AMP_DELTA >= 8348.5 ) { return new Prediction("BOTTOM", 29, 0); }
	}
	}
	}
return null;
}
private Prediction runTree65() {
	if( MAX_DX2_RIGHT < 6214.5 ) { 
	if( MAX_AMP_LEFT < 5525.5 ) { 
	if( AMP_DELTA >= 6861 ) { 
	if( DX2_DELTA >= 3666 ) { 
	if( MAX_DX2_RIGHT >= 4740.5 ) { 
		if( MAX_AMP_LEFT < -347.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= -347.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
		if( MAX_DX2_RIGHT < 4740.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DX2_DELTA < 3666 ) { 
		if( AMP_DELTA >= 7927.5 ) { return new Prediction("RIGHT", 82, 0); }
	if( AMP_DELTA < 7927.5 ) { 
		if( DX2_DELTA < 2499.5 ) { return new Prediction("RIGHT", 20, 0); }
	if( DX2_DELTA >= 2499.5 ) { 
		if( AVG_DX2_RIGHT >= 0.71 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT < 0.71 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6861 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
		if( DX2_DELTA >= 4648 ) { return new Prediction("TOP", 6, 0); }
	if( DX2_DELTA < 4648 ) { 
	if( MAX_DX2_LEFT >= 2641 ) { 
		if( MAX_AMP_LEFT < 3676 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_AMP_LEFT >= 3676 ) { return new Prediction("TOP", 6, 0); }
	}
	if( MAX_DX2_LEFT < 2641 ) { 
		if( AVG_AMP_RIGHT >= -15.5 ) { return new Prediction("LEFT", 91, 0); }
	if( AVG_AMP_RIGHT < -15.5 ) { 
	if( MAX_AMP_LEFT < 4457.5 ) { 
	if( FIRST_LEFT_DETECTION >= 226 ) { 
		if( MAX_DX2_LEFT < 1787.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 1787.5 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( FIRST_LEFT_DETECTION < 226 ) { return new Prediction("LEFT", 32, 0); }
	}
	if( MAX_AMP_LEFT >= 4457.5 ) { 
		if( MAX_DX2_RIGHT < 3300.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_DX2_RIGHT >= 3300.5 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( FIRST_RIGHT_DETECTION < 172.5 ) { 
		if( AVG_DX2_RIGHT < -2 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= -2 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 172.5 ) { 
	if( MAX_AMP_RIGHT >= -8468 ) { 
		if( AVG_DX2_RIGHT < -8.46 ) { return new Prediction("LEFT", 1, 0); }
	if( AVG_DX2_RIGHT >= -8.46 ) { 
	if( DX2_DELTA >= 1274.5 ) { 
		if( AVG_DX2_LEFT >= 0.12 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.12 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA < 1274.5 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -8468 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5525.5 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("LEFT", 4, 0); }
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("TOP", 121, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 6214.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_RIGHT >= 11 ) { 
	if( MAX_DX2_LEFT < 9637.5 ) { 
	if( AVG_DX2_LEFT >= -2.65 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 69, 0); }
	if( AVG_AMP_LEFT >= 8 ) { 
		if( MAX_AMP_LEFT >= 10971.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 10971.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AVG_DX2_LEFT < -2.65 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 9637.5 ) { 
		if( MAX_DX2_RIGHT < 13964 ) { return new Prediction("TOP", 18, 0); }
		if( MAX_DX2_RIGHT >= 13964 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 11 ) { 
	if( MAX_DX2_LEFT < 9302 ) { 
	if( MAX_AMP_RIGHT >= -17519.5 ) { 
	if( MAX_AMP_LEFT < 7551 ) { 
		if( MAX_DX2_LEFT >= 3350 ) { return new Prediction("BOTTOM", 11, 0); }
		if( MAX_DX2_LEFT < 3350 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 7551 ) { 
		if( FIRST_LEFT_DETECTION < 259 ) { return new Prediction("TOP", 16, 0); }
		if( FIRST_LEFT_DETECTION >= 259 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -17519.5 ) { 
		if( DX2_DELTA < 6001.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( DX2_DELTA >= 6001.5 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 9302 ) { 
		if( MAX_DX2_RIGHT >= 13246.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_RIGHT < 13246.5 ) { return new Prediction("TOP", 49, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AMP_DELTA >= 6749 ) { return new Prediction("BOTTOM", 174, 0); }
		if( AMP_DELTA < 6749 ) { return new Prediction("TOP", 6, 0); }
	}
	}
return null;
}
private Prediction runTree66() {
	if( AMP_DELTA < 6786 ) { 
	if( MAX_DX2_LEFT < 3037 ) { 
	if( MAX_AMP_LEFT >= 4218.5 ) { 
	if( AMP_DELTA < 5188.5 ) { 
	if( AVG_AMP_LEFT < 19.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 75.5 ) { 
		if( MAX_DX2_LEFT < 2859 ) { return new Prediction("TOP", 12, 0); }
		if( MAX_DX2_LEFT >= 2859 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 75.5 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 19.5 ) { return new Prediction("LEFT", 5, 0); }
	}
		if( AMP_DELTA >= 5188.5 ) { return new Prediction("LEFT", 12, 0); }
	}
	if( MAX_AMP_LEFT < 4218.5 ) { 
	if( FIRST_RIGHT_DETECTION < 248 ) { 
	if( DX2_DELTA >= 2657 ) { 
		if( MAX_DX2_RIGHT >= 4395 ) { return new Prediction("LEFT", 14, 0); }
	if( MAX_DX2_RIGHT < 4395 ) { 
		if( FIRST_LEFT_DETECTION >= 446.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 446.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( DX2_DELTA < 2657 ) { 
		if( AVG_AMP_RIGHT < 9.5 ) { return new Prediction("LEFT", 152, 0); }
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( AVG_DX2_RIGHT < 0.98 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_DX2_RIGHT >= 0.98 ) { 
		if( AVG_DX2_LEFT < 0.41 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.41 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( FIRST_RIGHT_DETECTION >= 248 ) { 
		if( FIRST_RIGHT_DETECTION < 257.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( FIRST_RIGHT_DETECTION >= 257.5 ) { return new Prediction("LEFT", 11, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3037 ) { 
	if( MAX_DX2_LEFT >= 4342 ) { 
		if( MAX_DX2_RIGHT < 12504 ) { return new Prediction("TOP", 154, 0); }
		if( MAX_DX2_RIGHT >= 12504 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_LEFT < 4342 ) { 
	if( DX2_DELTA < 1764 ) { 
		if( MAX_DX2_RIGHT < 4348 ) { return new Prediction("TOP", 14, 0); }
		if( MAX_DX2_RIGHT >= 4348 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA >= 1764 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
	if( MAX_AMP_LEFT >= 2439.5 ) { 
	if( DX2_DELTA < 3229 ) { 
	if( DX2_DELTA >= 2818 ) { 
		if( MAX_AMP_LEFT < 5569.5 ) { return new Prediction("LEFT", 3, 0); }
	if( MAX_AMP_LEFT >= 5569.5 ) { 
		if( AVG_DX2_LEFT < -1.39 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= -1.39 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DX2_DELTA < 2818 ) { 
	if( DX2_DELTA >= 2290.5 ) { 
	if( AVG_AMP_RIGHT < -4.5 ) { 
		if( FIRST_LEFT_DETECTION >= 219 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 219 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -4.5 ) { 
		if( FIRST_RIGHT_DETECTION < 48.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 48.5 ) { return new Prediction("RIGHT", 16, 0); }
	}
	}
		if( DX2_DELTA < 2290.5 ) { return new Prediction("RIGHT", 36, 0); }
	}
	}
	if( DX2_DELTA >= 3229 ) { 
	if( AVG_AMP_RIGHT < 14 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AMP_DELTA < 11086.5 ) { 
		if( MAX_AMP_RIGHT < -13499.5 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_AMP_RIGHT >= -13499.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AMP_DELTA >= 11086.5 ) { return new Prediction("BOTTOM", 20, 0); }
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 156, 0); }
	}
	if( AVG_AMP_RIGHT >= 14 ) { 
		if( MAX_DX2_RIGHT >= 13367.5 ) { return new Prediction("RIGHT", 9, 0); }
	if( MAX_DX2_RIGHT < 13367.5 ) { 
		if( MAX_AMP_RIGHT >= 19932.5 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_AMP_RIGHT < 19932.5 ) { 
		if( AVG_AMP_LEFT < -5.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( AVG_AMP_LEFT >= -5.5 ) { 
		if( AVG_DX2_LEFT >= -2.15 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT < -2.15 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 2439.5 ) { 
	if( AVG_AMP_RIGHT < -16.5 ) { 
		if( MAX_AMP_LEFT < -9602 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_AMP_LEFT >= -9602 ) { 
		if( MAX_DX2_RIGHT < 6247 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_DX2_RIGHT >= 6247 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -16.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AVG_AMP_RIGHT >= -12.5 ) { return new Prediction("RIGHT", 110, 0); }
	if( AVG_AMP_RIGHT < -12.5 ) { 
		if( AVG_AMP_LEFT >= 3.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_LEFT < 3.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_DX2_RIGHT >= 4166 ) { 
		if( FIRST_RIGHT_DETECTION >= 212 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 212 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	if( MAX_DX2_RIGHT < 4166 ) { 
		if( AVG_DX2_RIGHT < -4.07 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.07 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree67() {
	if( AMP_DELTA >= 7614.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( DX2_DELTA >= 7113 ) { 
	if( AVG_AMP_LEFT < 50.5 ) { 
		if( MAX_DX2_RIGHT >= 11387.5 ) { return new Prediction("BOTTOM", 15, 0); }
		if( MAX_DX2_RIGHT < 11387.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_AMP_LEFT >= 50.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( DX2_DELTA < 7113 ) { 
	if( AVG_AMP_RIGHT >= -8.5 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
	if( AVG_DX2_LEFT >= -1.96 ) { 
	if( MAX_DX2_LEFT < 2594 ) { 
		if( AVG_DX2_LEFT < 0.91 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.91 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2594 ) { return new Prediction("RIGHT", 15, 0); }
	}
		if( AVG_DX2_LEFT < -1.96 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( DETECTION_DELTA >= 0.5 ) { 
	if( DX2_DELTA >= 5778 ) { 
		if( DX2_DELTA < 6105.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DX2_DELTA >= 6105.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( DX2_DELTA < 5778 ) { return new Prediction("RIGHT", 120, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -8.5 ) { 
	if( DX2_DELTA < 4091.5 ) { 
		if( MAX_DX2_LEFT >= 5731.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 5731.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DX2_DELTA >= 4091.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( DX2_DELTA >= 3246 ) { 
		if( MAX_AMP_LEFT >= -3201 ) { return new Prediction("BOTTOM", 167, 0); }
	if( MAX_AMP_LEFT < -3201 ) { 
		if( MAX_DX2_RIGHT < 7702.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT >= 7702.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	if( DX2_DELTA < 3246 ) { 
	if( AVG_AMP_LEFT >= -1.5 ) { 
		if( AVG_DX2_LEFT < 0.13 ) { return new Prediction("BOTTOM", 4, 0); }
	if( AVG_DX2_LEFT >= 0.13 ) { 
		if( AVG_DX2_LEFT >= 1.72 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 1.72 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT < -1.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	}
	if( AMP_DELTA < 7614.5 ) { 
	if( MAX_DX2_LEFT < 3037 ) { 
	if( MAX_AMP_LEFT < 3948.5 ) { 
	if( AVG_DX2_RIGHT >= -1.77 ) { 
	if( AVG_DX2_LEFT >= 0.05 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( DX2_DELTA >= 968.5 ) { 
		if( MAX_AMP_LEFT < -3072.5 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_LEFT >= -3072.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
		if( DX2_DELTA < 968.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( MAX_DX2_LEFT >= 1592 ) { return new Prediction("LEFT", 12, 0); }
		if( MAX_DX2_LEFT < 1592 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( AVG_DX2_LEFT < 0.05 ) { 
	if( DETECTION_DELTA < 14.5 ) { 
	if( AVG_AMP_RIGHT < 14 ) { 
		if( FIRST_LEFT_DETECTION >= 275 ) { return new Prediction("RIGHT", 1, 0); }
	if( FIRST_LEFT_DETECTION < 275 ) { 
	if( AVG_AMP_LEFT < 0.5 ) { 
		if( MAX_AMP_LEFT >= 2334 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < 2334 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( AVG_AMP_LEFT >= 0.5 ) { return new Prediction("LEFT", 42, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 14 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DETECTION_DELTA >= 14.5 ) { return new Prediction("LEFT", 93, 0); }
	}
	}
	if( AVG_DX2_RIGHT < -1.77 ) { 
		if( AMP_DELTA < 4414.5 ) { return new Prediction("LEFT", 12, 0); }
	if( AMP_DELTA >= 4414.5 ) { 
		if( AVG_DX2_RIGHT >= -5.71 ) { return new Prediction("RIGHT", 13, 0); }
	if( AVG_DX2_RIGHT < -5.71 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( AVG_DX2_LEFT >= 0.12 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.12 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 3948.5 ) { 
	if( DX2_DELTA >= 1374 ) { 
		if( AVG_DX2_LEFT < -3.38 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -3.38 ) { return new Prediction("LEFT", 35, 0); }
	}
		if( DX2_DELTA < 1374 ) { return new Prediction("TOP", 12, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3037 ) { 
		if( MAX_DX2_RIGHT < 10670 ) { return new Prediction("TOP", 185, 0); }
	if( MAX_DX2_RIGHT >= 10670 ) { 
		if( FIRST_LEFT_DETECTION < 149.5 ) { return new Prediction("TOP", 5, 0); }
	if( FIRST_LEFT_DETECTION >= 149.5 ) { 
		if( MAX_DX2_LEFT < 7916.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 7916.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree68() {
	if( AMP_DELTA < 6889 ) { 
	if( MAX_AMP_LEFT < 4797.5 ) { 
		if( MAX_AMP_LEFT < -6674.5 ) { return new Prediction("TOP", 12, 0); }
	if( MAX_AMP_LEFT >= -6674.5 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( FIRST_LEFT_DETECTION >= 177 ) { 
	if( AVG_AMP_RIGHT >= 3 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( FIRST_LEFT_DETECTION < 225 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 225 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( AVG_AMP_RIGHT < 34 ) { return new Prediction("RIGHT", 11, 0); }
	if( AVG_AMP_RIGHT >= 34 ) { 
		if( AVG_DX2_RIGHT < -0.54 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT >= -0.54 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 3 ) { 
		if( MAX_DX2_LEFT < 2409 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_DX2_LEFT >= 2409 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( FIRST_LEFT_DETECTION < 177 ) { 
		if( MAX_AMP_LEFT >= 4434.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 4434.5 ) { return new Prediction("LEFT", 20, 0); }
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( DETECTION_DELTA < 19.5 ) { 
	if( MAX_AMP_LEFT < 3968.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 213 ) { 
		if( AVG_DX2_RIGHT < 5.1 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT >= 5.1 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 213 ) { return new Prediction("LEFT", 28, 0); }
	}
	if( MAX_AMP_LEFT >= 3968.5 ) { 
		if( AVG_DX2_RIGHT < 1.69 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 1.69 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( DETECTION_DELTA >= 19.5 ) { return new Prediction("LEFT", 113, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4797.5 ) { 
	if( MAX_DX2_LEFT >= 2407 ) { 
	if( AMP_DELTA >= 4023.5 ) { 
		if( AVG_AMP_RIGHT < -21 ) { return new Prediction("TOP", 10, 0); }
	if( AVG_AMP_RIGHT >= -21 ) { 
		if( MAX_AMP_RIGHT >= -10554.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_RIGHT < -10554.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
		if( AMP_DELTA < 4023.5 ) { return new Prediction("TOP", 157, 0); }
	}
	if( MAX_DX2_LEFT < 2407 ) { 
		if( MAX_DX2_LEFT >= 2070 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_LEFT < 2070 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6889 ) { 
	if( MAX_DX2_RIGHT >= 6220 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( AVG_AMP_RIGHT >= 3 ) { 
		if( DX2_DELTA < 6592.5 ) { return new Prediction("RIGHT", 63, 0); }
	if( DX2_DELTA >= 6592.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 134.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 134.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT < 3 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( FIRST_LEFT_DETECTION >= 231 ) { return new Prediction("TOP", 2, 0); }
	if( FIRST_LEFT_DETECTION < 231 ) { 
		if( MAX_AMP_LEFT >= -234 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_AMP_LEFT < -234 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 31, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( MAX_AMP_LEFT < 11567.5 ) { 
		if( AVG_DX2_LEFT >= -2.67 ) { return new Prediction("BOTTOM", 160, 0); }
	if( AVG_DX2_LEFT < -2.67 ) { 
		if( AVG_AMP_LEFT < 16.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT >= 16.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 11567.5 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6220 ) { 
	if( AMP_DELTA >= 12797.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 162 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 162 ) { return new Prediction("TOP", 5, 0); }
	}
	if( AMP_DELTA < 12797.5 ) { 
	if( MAX_DX2_LEFT < 6023 ) { 
	if( DX2_DELTA >= 2987 ) { 
		if( MAX_AMP_LEFT >= 3491.5 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_AMP_LEFT < 3491.5 ) { 
		if( AMP_DELTA >= 10102.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( AMP_DELTA < 10102.5 ) { 
		if( AVG_DX2_RIGHT >= -0.04 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_RIGHT < -0.04 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( DX2_DELTA < 2987 ) { return new Prediction("RIGHT", 122, 0); }
	}
		if( MAX_DX2_LEFT >= 6023 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
return null;
}
private Prediction runTree69() {
	if( MAX_DX2_LEFT >= 2641 ) { 
	if( MAX_AMP_RIGHT < 13991.5 ) { 
	if( MAX_DX2_RIGHT < 9360.5 ) { 
	if( AVG_AMP_RIGHT >= 17.5 ) { 
		if( MAX_DX2_LEFT >= 7672 ) { return new Prediction("TOP", 13, 0); }
	if( MAX_DX2_LEFT < 7672 ) { 
	if( MAX_AMP_LEFT >= 7301.5 ) { 
		if( MAX_DX2_RIGHT >= 7105 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 7105 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_AMP_LEFT < 7301.5 ) { 
		if( AVG_DX2_RIGHT >= -5.23 ) { return new Prediction("RIGHT", 57, 0); }
	if( AVG_DX2_RIGHT < -5.23 ) { 
		if( FIRST_RIGHT_DETECTION < 209 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 209 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < 17.5 ) { 
	if( AMP_DELTA >= 8044 ) { 
	if( AVG_DX2_LEFT >= 1.26 ) { 
	if( MAX_AMP_RIGHT < -14850 ) { 
		if( FIRST_RIGHT_DETECTION >= 184 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 184 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( MAX_AMP_RIGHT >= -14850 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_DX2_LEFT < 1.26 ) { 
	if( MAX_AMP_LEFT >= -397.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 23, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( DX2_DELTA < 1610 ) { return new Prediction("TOP", 2, 0); }
		if( DX2_DELTA >= 1610 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < -397.5 ) { 
		if( AVG_AMP_RIGHT >= -19 ) { return new Prediction("RIGHT", 10, 0); }
	if( AVG_AMP_RIGHT < -19 ) { 
		if( FIRST_RIGHT_DETECTION < 74.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 74.5 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 8044 ) { 
		if( MAX_AMP_LEFT >= 6144.5 ) { return new Prediction("TOP", 148, 0); }
	if( MAX_AMP_LEFT < 6144.5 ) { 
	if( MAX_DX2_LEFT < 7000.5 ) { 
	if( MAX_DX2_RIGHT < 5215 ) { 
		if( FIRST_LEFT_DETECTION >= 84 ) { return new Prediction("TOP", 4, 0); }
		if( FIRST_LEFT_DETECTION < 84 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_RIGHT >= 5215 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( MAX_DX2_LEFT >= 7000.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 9360.5 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
		if( MAX_DX2_LEFT < 9369 ) { return new Prediction("BOTTOM", 92, 0); }
	if( MAX_DX2_LEFT >= 9369 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("LEFT", 1, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
		if( DETECTION_DELTA < 5.5 ) { return new Prediction("RIGHT", 17, 0); }
	if( DETECTION_DELTA >= 5.5 ) { 
		if( AVG_DX2_LEFT < -2.11 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -2.11 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= 13991.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 46, 0); }
	if( DETECTION_DELTA < 6.5 ) { 
		if( MAX_DX2_RIGHT < 10248 ) { return new Prediction("RIGHT", 7, 0); }
	if( MAX_DX2_RIGHT >= 10248 ) { 
		if( MAX_DX2_LEFT < 7469.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( MAX_DX2_LEFT >= 7469.5 ) { 
		if( FIRST_RIGHT_DETECTION < 215 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 215 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2641 ) { 
	if( MAX_AMP_RIGHT < -8153.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_RIGHT < -2 ) { 
		if( MAX_DX2_RIGHT < 3300.5 ) { return new Prediction("RIGHT", 3, 0); }
	if( MAX_DX2_RIGHT >= 3300.5 ) { 
		if( MAX_AMP_LEFT >= 24 ) { return new Prediction("LEFT", 15, 0); }
	if( MAX_AMP_LEFT < 24 ) { 
		if( AVG_DX2_LEFT < 0.34 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_LEFT >= 0.34 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -2 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
		if( MAX_AMP_RIGHT < -9758.5 ) { return new Prediction("RIGHT", 53, 0); }
	if( MAX_AMP_RIGHT >= -9758.5 ) { 
		if( AVG_DX2_LEFT >= -0.34 ) { return new Prediction("RIGHT", 8, 0); }
		if( AVG_DX2_LEFT < -0.34 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
		if( AVG_AMP_LEFT < 0.5 ) { return new Prediction("RIGHT", 9, 0); }
		if( AVG_AMP_LEFT >= 0.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_AMP_RIGHT >= -11361 ) { 
	if( MAX_AMP_LEFT < 2545.5 ) { 
		if( FIRST_RIGHT_DETECTION < 209 ) { return new Prediction("RIGHT", 2, 0); }
	if( FIRST_RIGHT_DETECTION >= 209 ) { 
		if( FIRST_RIGHT_DETECTION < 228.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 228.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 2545.5 ) { 
		if( AVG_AMP_RIGHT >= -37 ) { return new Prediction("LEFT", 13, 0); }
		if( AVG_AMP_RIGHT < -37 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -11361 ) { 
		if( AVG_AMP_LEFT < -10 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_LEFT >= -10 ) { return new Prediction("BOTTOM", 29, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -8153.5 ) { 
	if( AMP_DELTA < 5452 ) { 
		if( MAX_AMP_LEFT < 4140 ) { return new Prediction("LEFT", 139, 0); }
	if( MAX_AMP_LEFT >= 4140 ) { 
		if( MAX_DX2_RIGHT < 3364 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 3364 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AMP_DELTA >= 5452 ) { 
	if( MAX_DX2_RIGHT < 5956 ) { 
	if( AMP_DELTA >= 6396 ) { 
		if( DX2_DELTA >= 2664 ) { return new Prediction("LEFT", 2, 0); }
		if( DX2_DELTA < 2664 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AMP_DELTA < 6396 ) { return new Prediction("RIGHT", 7, 0); }
	}
		if( MAX_DX2_RIGHT >= 5956 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
return null;
}
private Prediction runTree70() {
	if( MAX_DX2_LEFT < 2729.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( DETECTION_DELTA >= 20 ) { 
		if( DX2_DELTA < 3499.5 ) { return new Prediction("LEFT", 58, 0); }
		if( DX2_DELTA >= 3499.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 20 ) { 
	if( AVG_AMP_RIGHT >= -34.5 ) { 
	if( MAX_DX2_RIGHT < 6387.5 ) { 
	if( AVG_AMP_RIGHT >= -0.5 ) { 
	if( MAX_AMP_RIGHT < -7541.5 ) { 
	if( AVG_DX2_RIGHT < 0.86 ) { 
		if( AVG_DX2_RIGHT < -1.97 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.97 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( AVG_DX2_RIGHT >= 0.86 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( MAX_AMP_RIGHT >= -7541.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 130 ) { return new Prediction("TOP", 5, 0); }
		if( FIRST_RIGHT_DETECTION < 130 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -0.5 ) { 
		if( FIRST_LEFT_DETECTION >= 160.5 ) { return new Prediction("LEFT", 27, 0); }
	if( FIRST_LEFT_DETECTION < 160.5 ) { 
		if( FIRST_LEFT_DETECTION >= 157 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION < 157 ) { return new Prediction("LEFT", 22, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT >= 6387.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
		if( AVG_AMP_RIGHT < -34.5 ) { return new Prediction("BOTTOM", 15, 0); }
	}
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
	if( MAX_AMP_RIGHT >= -8403.5 ) { 
		if( MAX_AMP_LEFT >= 4480.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 4480.5 ) { return new Prediction("LEFT", 51, 0); }
	}
	if( MAX_AMP_RIGHT < -8403.5 ) { 
		if( AMP_DELTA < 8473 ) { return new Prediction("RIGHT", 1, 0); }
		if( AMP_DELTA >= 8473 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( DETECTION_DELTA < 10.5 ) { 
	if( MAX_AMP_RIGHT >= -8246.5 ) { 
		if( FIRST_LEFT_DETECTION >= 245 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_LEFT_DETECTION < 245 ) { return new Prediction("LEFT", 13, 0); }
	}
	if( MAX_AMP_RIGHT < -8246.5 ) { 
	if( FIRST_LEFT_DETECTION < 261.5 ) { 
		if( AMP_DELTA >= 6779 ) { return new Prediction("RIGHT", 72, 0); }
		if( AMP_DELTA < 6779 ) { return new Prediction("LEFT", 2, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 261.5 ) { 
		if( AVG_DX2_LEFT >= 0.31 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT < 0.31 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 2729.5 ) { 
	if( MAX_DX2_LEFT < 6383.5 ) { 
	if( AMP_DELTA < 5381 ) { 
	if( AVG_AMP_RIGHT >= 27 ) { 
		if( MAX_DX2_LEFT < 3654.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_DX2_LEFT >= 3654.5 ) { return new Prediction("TOP", 5, 0); }
	}
	if( AVG_AMP_RIGHT < 27 ) { 
		if( AVG_DX2_RIGHT < 0.87 ) { return new Prediction("TOP", 30, 0); }
	if( AVG_DX2_RIGHT >= 0.87 ) { 
		if( DX2_DELTA < 1166 ) { return new Prediction("TOP", 19, 0); }
	if( DX2_DELTA >= 1166 ) { 
		if( MAX_AMP_RIGHT >= -7312.5 ) { return new Prediction("LEFT", 2, 0); }
	if( MAX_AMP_RIGHT < -7312.5 ) { 
		if( MAX_DX2_LEFT >= 4599 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 4599 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 5381 ) { 
	if( AVG_AMP_RIGHT >= 10 ) { 
	if( AVG_AMP_RIGHT < 34 ) { 
	if( MAX_DX2_RIGHT >= 9964.5 ) { 
		if( MAX_DX2_LEFT < 5426.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_DX2_LEFT >= 5426.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_DX2_RIGHT < 9964.5 ) { 
	if( AVG_DX2_LEFT < -2.55 ) { 
		if( FIRST_LEFT_DETECTION >= 177.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 177.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_DX2_LEFT >= -2.55 ) { return new Prediction("RIGHT", 23, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= 34 ) { return new Prediction("RIGHT", 59, 0); }
	}
	if( AVG_AMP_RIGHT < 10 ) { 
	if( MAX_DX2_RIGHT >= 6480 ) { 
		if( AVG_AMP_RIGHT < -14.5 ) { return new Prediction("BOTTOM", 153, 0); }
	if( AVG_AMP_RIGHT >= -14.5 ) { 
	if( AVG_DX2_RIGHT >= 0.45 ) { 
		if( MAX_AMP_RIGHT < -21560.5 ) { return new Prediction("BOTTOM", 5, 0); }
	if( MAX_AMP_RIGHT >= -21560.5 ) { 
	if( AVG_DX2_LEFT >= -2.73 ) { 
		if( MAX_AMP_RIGHT >= -17987 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < -17987 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( AVG_DX2_LEFT < -2.73 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT < 0.45 ) { 
		if( MAX_DX2_RIGHT < 7094.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 7094.5 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT < 6480 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 6383.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_AMP_RIGHT >= 21.5 ) { return new Prediction("RIGHT", 12, 0); }
	if( AVG_AMP_RIGHT < 21.5 ) { 
		if( FIRST_LEFT_DETECTION < 159 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 159 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
	if( MAX_AMP_RIGHT >= -22040 ) { 
		if( MAX_DX2_RIGHT < 11728.5 ) { return new Prediction("TOP", 141, 0); }
		if( MAX_DX2_RIGHT >= 11728.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_AMP_RIGHT < -22040 ) { 
	if( AVG_AMP_LEFT >= -11 ) { 
		if( FIRST_LEFT_DETECTION < 166.5 ) { return new Prediction("TOP", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 166.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( AVG_AMP_LEFT < -11 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree71() {
	if( AMP_DELTA >= 6814 ) { 
	if( AVG_AMP_RIGHT < -8 ) { 
	if( DX2_DELTA >= 13049 ) { 
		if( MAX_DX2_RIGHT < 13970 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 13970 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DX2_DELTA < 13049 ) { 
	if( DX2_DELTA >= 4114 ) { 
		if( MAX_DX2_RIGHT >= 5410.5 ) { return new Prediction("BOTTOM", 155, 0); }
		if( MAX_DX2_RIGHT < 5410.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DX2_DELTA < 4114 ) { 
	if( DETECTION_DELTA >= 7 ) { 
		if( FIRST_RIGHT_DETECTION < 132.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 132.5 ) { return new Prediction("BOTTOM", 16, 0); }
	}
	if( DETECTION_DELTA < 7 ) { 
		if( AVG_AMP_RIGHT < -36 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_AMP_RIGHT >= -36 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= -8 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( MAX_DX2_RIGHT < 7625 ) { 
	if( DETECTION_DELTA >= 12 ) { 
		if( MAX_DX2_LEFT < 1544.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT >= 1544.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DETECTION_DELTA < 12 ) { return new Prediction("RIGHT", 38, 0); }
	}
	if( MAX_DX2_RIGHT >= 7625 ) { 
		if( MAX_AMP_LEFT < -4433.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= -4433.5 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
		if( AVG_AMP_LEFT < -6.5 ) { return new Prediction("RIGHT", 121, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
	if( DX2_DELTA < 3410 ) { 
		if( FIRST_LEFT_DETECTION >= 124.5 ) { return new Prediction("LEFT", 8, 0); }
		if( FIRST_LEFT_DETECTION < 124.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DX2_DELTA >= 3410 ) { 
		if( MAX_DX2_RIGHT < 4929.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_RIGHT >= 4929.5 ) { 
		if( AMP_DELTA < 8072 ) { return new Prediction("LEFT", 1, 0); }
		if( AMP_DELTA >= 8072 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_DX2_RIGHT < 4549.5 ) { 
	if( DETECTION_DELTA < 20.5 ) { 
		if( MAX_AMP_LEFT >= 4387.5 ) { return new Prediction("TOP", 49, 0); }
	if( MAX_AMP_LEFT < 4387.5 ) { 
	if( FIRST_LEFT_DETECTION >= 177 ) { 
	if( AVG_AMP_RIGHT >= 21.5 ) { 
		if( MAX_DX2_LEFT >= 1388.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_LEFT < 1388.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_AMP_RIGHT < 21.5 ) { 
	if( MAX_DX2_LEFT < 2402 ) { 
	if( FIRST_RIGHT_DETECTION >= 175 ) { 
	if( AVG_DX2_LEFT < -1.13 ) { 
		if( MAX_AMP_RIGHT >= -7475 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_RIGHT < -7475 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_DX2_LEFT >= -1.13 ) { 
		if( DETECTION_DELTA < 15.5 ) { return new Prediction("LEFT", 32, 0); }
		if( DETECTION_DELTA >= 15.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION < 175 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 2402 ) { return new Prediction("TOP", 4, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 177 ) { return new Prediction("LEFT", 42, 0); }
	}
	}
		if( DETECTION_DELTA >= 20.5 ) { return new Prediction("LEFT", 96, 0); }
	}
	if( MAX_DX2_RIGHT >= 4549.5 ) { 
	if( MAX_DX2_LEFT >= 2688.5 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( AVG_DX2_LEFT >= -5.07 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < -5.07 ) { return new Prediction("TOP", 3, 0); }
	}
	if( DETECTION_DELTA >= 0.5 ) { 
	if( MAX_DX2_LEFT < 4083 ) { 
		if( MAX_AMP_LEFT < 6675 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_AMP_LEFT >= 6675 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_DX2_LEFT >= 4083 ) { return new Prediction("TOP", 161, 0); }
	}
	}
		if( MAX_DX2_LEFT < 2688.5 ) { return new Prediction("LEFT", 21, 0); }
	}
	}
return null;
}
private Prediction runTree72() {
	if( MAX_DX2_LEFT >= 3004 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
	if( MAX_AMP_RIGHT < 12355 ) { 
	if( MAX_DX2_LEFT < 6141.5 ) { 
	if( MAX_DX2_RIGHT >= 6527.5 ) { 
	if( AMP_DELTA < 8330 ) { 
		if( AVG_DX2_RIGHT < -1.57 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.57 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AMP_DELTA >= 8330 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
		if( MAX_AMP_LEFT < -153.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= -153.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( AVG_AMP_RIGHT < -12.5 ) { return new Prediction("BOTTOM", 94, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6527.5 ) { 
		if( MAX_AMP_LEFT < 554 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= 554 ) { return new Prediction("TOP", 23, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 6141.5 ) { 
	if( AMP_DELTA >= 11117 ) { 
		if( FIRST_RIGHT_DETECTION >= 168 ) { return new Prediction("BOTTOM", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 168 ) { return new Prediction("TOP", 5, 0); }
	}
		if( AMP_DELTA < 11117 ) { return new Prediction("TOP", 107, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 12355 ) { return new Prediction("BOTTOM", 42, 0); }
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
	if( MAX_AMP_LEFT < 10085 ) { 
	if( AMP_DELTA < 4927.5 ) { 
		if( FIRST_RIGHT_DETECTION < 106.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 106.5 ) { return new Prediction("TOP", 18, 0); }
	}
	if( AMP_DELTA >= 4927.5 ) { 
	if( MAX_AMP_LEFT >= -4289.5 ) { 
	if( DX2_DELTA >= 4108 ) { 
		if( AVG_DX2_RIGHT < 1.12 ) { return new Prediction("BOTTOM", 8, 0); }
	if( AVG_DX2_RIGHT >= 1.12 ) { 
		if( AVG_DX2_RIGHT >= 4.7 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 4.7 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	if( DX2_DELTA < 4108 ) { 
		if( FIRST_LEFT_DETECTION < 61 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_LEFT_DETECTION >= 61 ) { 
		if( AVG_AMP_LEFT < 13 ) { return new Prediction("RIGHT", 34, 0); }
		if( AVG_AMP_LEFT >= 13 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < -4289.5 ) { return new Prediction("RIGHT", 48, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 10085 ) { 
		if( MAX_AMP_RIGHT < 17245 ) { return new Prediction("TOP", 43, 0); }
		if( MAX_AMP_RIGHT >= 17245 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 3004 ) { 
	if( DX2_DELTA < 3537.5 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
	if( MAX_DX2_LEFT < 1250.5 ) { 
		if( AVG_DX2_RIGHT >= 0.79 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 0.79 ) { return new Prediction("RIGHT", 3, 0); }
	}
	if( MAX_DX2_LEFT >= 1250.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 107, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( AVG_DX2_RIGHT >= -0.33 ) { 
	if( MAX_AMP_LEFT < 4708 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 12, 0); }
	if( AVG_AMP_RIGHT < -25.5 ) { 
		if( FIRST_RIGHT_DETECTION < 147.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 147.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4708 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_RIGHT < -0.33 ) { 
		if( MAX_DX2_LEFT >= 1925 ) { return new Prediction("TOP", 7, 0); }
	if( MAX_DX2_LEFT < 1925 ) { 
		if( AVG_DX2_LEFT < -2.6 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -2.6 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA < 10.5 ) { 
	if( AMP_DELTA < 6786 ) { 
	if( AVG_DX2_RIGHT < -1.41 ) { 
	if( FIRST_RIGHT_DETECTION >= 167.5 ) { 
	if( AVG_DX2_RIGHT < -4.68 ) { 
		if( AVG_DX2_RIGHT >= -6.82 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < -6.82 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= -4.68 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 167.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= -1.41 ) { 
		if( MAX_AMP_LEFT < 3918 ) { return new Prediction("LEFT", 41, 0); }
	if( MAX_AMP_LEFT >= 3918 ) { 
	if( MAX_DX2_RIGHT >= 3266.5 ) { 
		if( MAX_DX2_LEFT >= 2704.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 2704.5 ) { return new Prediction("LEFT", 8, 0); }
	}
		if( MAX_DX2_RIGHT < 3266.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
	if( MAX_AMP_LEFT >= 3626 ) { 
		if( MAX_AMP_RIGHT < -13623.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( MAX_AMP_RIGHT >= -13623.5 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3626 ) { return new Prediction("RIGHT", 74, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3537.5 ) { 
		if( AVG_AMP_RIGHT >= 10 ) { return new Prediction("RIGHT", 15, 0); }
	if( AVG_AMP_RIGHT < 10 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( MAX_AMP_RIGHT >= -15798 ) { 
		if( MAX_AMP_LEFT < 3855.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= 3855.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_RIGHT < -15798 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( DETECTION_DELTA >= 7.5 ) { 
		if( MAX_AMP_RIGHT < -9222 ) { return new Prediction("BOTTOM", 44, 0); }
	if( MAX_AMP_RIGHT >= -9222 ) { 
		if( FIRST_LEFT_DETECTION >= 129.5 ) { return new Prediction("BOTTOM", 8, 0); }
		if( FIRST_LEFT_DETECTION < 129.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree73() {
	if( AMP_DELTA < 7280 ) { 
	if( MAX_DX2_RIGHT < 4777.5 ) { 
	if( MAX_AMP_LEFT >= 4439.5 ) { 
	if( DETECTION_DELTA < 59.5 ) { 
	if( FIRST_LEFT_DETECTION < 86.5 ) { 
		if( MAX_AMP_LEFT >= 6368.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 6368.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 86.5 ) { return new Prediction("TOP", 53, 0); }
	}
		if( DETECTION_DELTA >= 59.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( MAX_AMP_LEFT < 4439.5 ) { 
	if( AVG_AMP_LEFT < 2.5 ) { 
	if( DETECTION_DELTA < 16 ) { 
	if( AVG_AMP_RIGHT < 1.5 ) { 
	if( FIRST_RIGHT_DETECTION < 220.5 ) { 
		if( MAX_AMP_RIGHT < -8560 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT >= -8560 ) { return new Prediction("LEFT", 16, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 220.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_RIGHT >= 1.5 ) { 
		if( MAX_DX2_RIGHT >= 2448 ) { return new Prediction("RIGHT", 20, 0); }
		if( MAX_DX2_RIGHT < 2448 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( DETECTION_DELTA >= 16 ) { 
	if( AMP_DELTA >= 6872.5 ) { 
		if( FIRST_RIGHT_DETECTION < 142 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 142 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 6872.5 ) { return new Prediction("LEFT", 46, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 2.5 ) { 
		if( MAX_DX2_RIGHT >= 2615.5 ) { return new Prediction("LEFT", 93, 0); }
	if( MAX_DX2_RIGHT < 2615.5 ) { 
		if( MAX_AMP_LEFT >= 3600.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_LEFT < 3600.5 ) { return new Prediction("LEFT", 19, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 4777.5 ) { 
	if( MAX_DX2_LEFT < 4317.5 ) { 
	if( MAX_DX2_LEFT >= 2688.5 ) { 
	if( MAX_DX2_RIGHT < 6180 ) { 
		if( MAX_DX2_LEFT < 3543 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT >= 3543 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_RIGHT >= 6180 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( MAX_DX2_LEFT < 2688.5 ) { return new Prediction("LEFT", 17, 0); }
	}
	if( MAX_DX2_LEFT >= 4317.5 ) { 
		if( MAX_AMP_RIGHT < 1303 ) { return new Prediction("TOP", 144, 0); }
	if( MAX_AMP_RIGHT >= 1303 ) { 
		if( AVG_DX2_RIGHT >= -0.31 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT < -0.31 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 7280 ) { 
	if( DX2_DELTA < 3961 ) { 
	if( AMP_DELTA < 9095 ) { 
	if( AVG_DX2_LEFT >= 2.65 ) { 
		if( FIRST_LEFT_DETECTION >= 191 ) { return new Prediction("TOP", 3, 0); }
		if( FIRST_LEFT_DETECTION < 191 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_LEFT < 2.65 ) { 
		if( AVG_DX2_LEFT >= -2.2 ) { return new Prediction("RIGHT", 42, 0); }
		if( AVG_DX2_LEFT < -2.2 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA >= 9095 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
		if( AVG_AMP_RIGHT >= -35 ) { return new Prediction("RIGHT", 96, 0); }
		if( AVG_AMP_RIGHT < -35 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( DETECTION_DELTA >= 6 ) { return new Prediction("BOTTOM", 15, 0); }
		if( DETECTION_DELTA < 6 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3961 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
		if( MAX_DX2_LEFT >= 13872 ) { return new Prediction("TOP", 5, 0); }
		if( MAX_DX2_LEFT < 13872 ) { return new Prediction("BOTTOM", 153, 0); }
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 105.5 ) { return new Prediction("BOTTOM", 19, 0); }
		if( FIRST_RIGHT_DETECTION < 105.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DX2_DELTA >= 7504 ) { 
	if( FIRST_LEFT_DETECTION >= 136.5 ) { 
		if( FIRST_LEFT_DETECTION < 163.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 163.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( FIRST_LEFT_DETECTION < 136.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( DX2_DELTA < 7504 ) { return new Prediction("RIGHT", 33, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree74() {
	if( MAX_AMP_LEFT < 6559.5 ) { 
	if( MAX_DX2_RIGHT < 6213.5 ) { 
	if( DX2_DELTA >= 918 ) { 
	if( MAX_DX2_LEFT < 2822.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( FIRST_LEFT_DETECTION >= 177 ) { 
	if( AMP_DELTA < 8112 ) { 
	if( FIRST_LEFT_DETECTION >= 181 ) { 
	if( DX2_DELTA < 1324 ) { 
		if( AVG_AMP_RIGHT < 2.5 ) { return new Prediction("LEFT", 8, 0); }
	if( AVG_AMP_RIGHT >= 2.5 ) { 
		if( FIRST_LEFT_DETECTION >= 234.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_LEFT_DETECTION < 234.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DX2_DELTA >= 1324 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 38, 0); }
		if( AVG_AMP_RIGHT < -25.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 181 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA >= 8112 ) { 
		if( AVG_DX2_LEFT >= -1.02 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT < -1.02 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 177 ) { return new Prediction("LEFT", 48, 0); }
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
	if( AMP_DELTA >= 7197 ) { 
		if( MAX_DX2_LEFT >= 1424 ) { return new Prediction("RIGHT", 30, 0); }
		if( MAX_DX2_LEFT < 1424 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AMP_DELTA < 7197 ) { 
	if( AMP_DELTA < 6057 ) { 
		if( FIRST_LEFT_DETECTION < 250.5 ) { return new Prediction("LEFT", 26, 0); }
		if( FIRST_LEFT_DETECTION >= 250.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AMP_DELTA >= 6057 ) { 
	if( FIRST_LEFT_DETECTION >= 190 ) { 
		if( FIRST_RIGHT_DETECTION >= 219 ) { return new Prediction("RIGHT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 219 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( FIRST_LEFT_DETECTION < 190 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
		if( AVG_AMP_RIGHT >= 19.5 ) { return new Prediction("RIGHT", 33, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 2822.5 ) { 
		if( MAX_DX2_LEFT < 4611.5 ) { return new Prediction("RIGHT", 48, 0); }
		if( MAX_DX2_LEFT >= 4611.5 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	if( DX2_DELTA < 918 ) { 
		if( DETECTION_DELTA >= 13 ) { return new Prediction("LEFT", 67, 0); }
	if( DETECTION_DELTA < 13 ) { 
	if( MAX_AMP_RIGHT >= -6392 ) { 
		if( AVG_DX2_LEFT < -1.08 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -1.08 ) { return new Prediction("LEFT", 9, 0); }
	}
	if( MAX_AMP_RIGHT < -6392 ) { 
		if( DETECTION_DELTA < 3 ) { return new Prediction("RIGHT", 2, 0); }
		if( DETECTION_DELTA >= 3 ) { return new Prediction("TOP", 12, 0); }
	}
	}
	}
	}
	if( MAX_DX2_RIGHT >= 6213.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA >= 6361 ) { 
		if( MAX_DX2_LEFT >= 11442.5 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_LEFT < 11442.5 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	if( DX2_DELTA < 6361 ) { 
		if( MAX_AMP_RIGHT < -15728 ) { return new Prediction("RIGHT", 42, 0); }
	if( MAX_AMP_RIGHT >= -15728 ) { 
	if( AVG_DX2_RIGHT < 5.28 ) { 
	if( FIRST_LEFT_DETECTION < 214 ) { 
		if( AVG_AMP_RIGHT < 17 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_RIGHT >= 17 ) { return new Prediction("RIGHT", 8, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 214 ) { 
		if( FIRST_LEFT_DETECTION < 232 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 232 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( AVG_DX2_RIGHT >= 5.28 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 169, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 6559.5 ) { 
	if( MAX_AMP_RIGHT < -22317.5 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
		if( MAX_DX2_LEFT >= 7701.5 ) { return new Prediction("TOP", 10, 0); }
		if( MAX_DX2_LEFT < 7701.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
		if( AVG_AMP_RIGHT >= 8.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
	if( MAX_AMP_RIGHT >= -22317.5 ) { 
	if( MAX_DX2_RIGHT >= 11915 ) { 
		if( AMP_DELTA >= 13915.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( AMP_DELTA < 13915.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 11915 ) { 
	if( AVG_DX2_RIGHT >= 5.72 ) { 
		if( AMP_DELTA < 4605.5 ) { return new Prediction("TOP", 7, 0); }
		if( AMP_DELTA >= 4605.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_DX2_RIGHT < 5.72 ) { 
		if( AVG_DX2_LEFT < 3.56 ) { return new Prediction("TOP", 144, 0); }
	if( AVG_DX2_LEFT >= 3.56 ) { 
		if( AVG_AMP_RIGHT < 4 ) { return new Prediction("TOP", 21, 0); }
		if( AVG_AMP_RIGHT >= 4 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree75() {
	if( MAX_AMP_LEFT >= 6566.5 ) { 
	if( DETECTION_DELTA >= 3.5 ) { 
	if( MAX_DX2_RIGHT < 11872.5 ) { 
	if( AMP_DELTA >= 9353.5 ) { 
		if( AVG_AMP_LEFT >= 18.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_AMP_LEFT < 18.5 ) { 
		if( FIRST_RIGHT_DETECTION < 227.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 227.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( AMP_DELTA < 9353.5 ) { return new Prediction("TOP", 179, 0); }
	}
	if( MAX_DX2_RIGHT >= 11872.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 116.5 ) { return new Prediction("BOTTOM", 11, 0); }
		if( FIRST_RIGHT_DETECTION < 116.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 3.5 ) { 
	if( MAX_DX2_RIGHT < 8673 ) { 
	if( MAX_AMP_LEFT < 7051.5 ) { 
		if( MAX_DX2_RIGHT < 5712 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 5712 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT >= 7051.5 ) { return new Prediction("TOP", 15, 0); }
	}
	if( MAX_DX2_RIGHT >= 8673 ) { 
		if( AVG_AMP_RIGHT >= -10 ) { return new Prediction("RIGHT", 13, 0); }
	if( AVG_AMP_RIGHT < -10 ) { 
		if( FIRST_LEFT_DETECTION >= 161 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 161 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 6566.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( MAX_DX2_RIGHT < 8154.5 ) { 
	if( MAX_DX2_LEFT >= 3520.5 ) { 
		if( MAX_DX2_LEFT >= 7535.5 ) { return new Prediction("TOP", 7, 0); }
		if( MAX_DX2_LEFT < 7535.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_DX2_LEFT < 3520.5 ) { 
	if( DX2_DELTA < 1131 ) { 
		if( MAX_AMP_LEFT >= 3682 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_AMP_LEFT < 3682 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DX2_DELTA >= 1131 ) { return new Prediction("LEFT", 31, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 8154.5 ) { 
		if( MAX_DX2_LEFT >= 18133 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_LEFT < 18133 ) { return new Prediction("BOTTOM", 44, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
	if( AMP_DELTA < 6786 ) { 
	if( AVG_DX2_RIGHT < -1.72 ) { 
	if( FIRST_LEFT_DETECTION < 164.5 ) { 
		if( AVG_DX2_RIGHT < -4.47 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.47 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 164.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 272 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_RIGHT_DETECTION < 272 ) { 
		if( AVG_DX2_RIGHT >= -2.25 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < -2.25 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= -1.72 ) { 
	if( AVG_DX2_LEFT < -0.4 ) { 
		if( MAX_AMP_RIGHT < 1440.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_AMP_RIGHT >= 1440.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_LEFT >= -0.4 ) { 
	if( AVG_DX2_LEFT < 0.54 ) { 
		if( MAX_AMP_LEFT < -10659 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT >= -10659 ) { return new Prediction("LEFT", 18, 0); }
	}
	if( AVG_DX2_LEFT >= 0.54 ) { 
	if( AVG_DX2_RIGHT >= 1.46 ) { 
		if( AVG_DX2_RIGHT < 2.93 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.93 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 1.46 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
		if( DX2_DELTA >= 6139 ) { return new Prediction("BOTTOM", 17, 0); }
	if( DX2_DELTA < 6139 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( FIRST_LEFT_DETECTION >= 49.5 ) { return new Prediction("RIGHT", 146, 0); }
		if( FIRST_LEFT_DETECTION < 49.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_RIGHT < 6166.5 ) { return new Prediction("RIGHT", 17, 0); }
		if( MAX_DX2_RIGHT >= 6166.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
	if( MAX_AMP_RIGHT < -11471 ) { 
		if( MAX_DX2_RIGHT < 5436 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 5436 ) { return new Prediction("BOTTOM", 95, 0); }
	}
	if( MAX_AMP_RIGHT >= -11471 ) { 
	if( AMP_DELTA >= 7619.5 ) { 
		if( MAX_DX2_RIGHT < 4496 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT >= 4496 ) { return new Prediction("BOTTOM", 23, 0); }
	}
	if( AMP_DELTA < 7619.5 ) { 
	if( MAX_DX2_RIGHT >= 3126.5 ) { 
		if( AMP_DELTA < 6151.5 ) { return new Prediction("LEFT", 50, 0); }
	if( AMP_DELTA >= 6151.5 ) { 
		if( MAX_DX2_LEFT < 1787.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_DX2_LEFT >= 1787.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 3126.5 ) { 
	if( MAX_DX2_RIGHT < 2926 ) { 
		if( MAX_AMP_RIGHT >= -5460 ) { return new Prediction("LEFT", 70, 0); }
	if( MAX_AMP_RIGHT < -5460 ) { 
	if( MAX_DX2_LEFT < 2943 ) { 
		if( AVG_AMP_RIGHT < 16 ) { return new Prediction("LEFT", 7, 0); }
	if( AVG_AMP_RIGHT >= 16 ) { 
		if( FIRST_RIGHT_DETECTION >= 156 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION < 156 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 2943 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 2926 ) { 
		if( FIRST_LEFT_DETECTION < 238.5 ) { return new Prediction("TOP", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 238.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree76() {
	if( DX2_DELTA >= 3974.5 ) { 
	if( MAX_DX2_LEFT < 8922.5 ) { 
	if( MAX_AMP_LEFT >= -5494 ) { 
	if( DX2_DELTA < 7460.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AMP_DELTA < 12334 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( AVG_DX2_LEFT < -1.93 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -1.93 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( AMP_DELTA >= 12334 ) { 
		if( AVG_AMP_RIGHT < -16 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_AMP_RIGHT >= -16 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( FIRST_LEFT_DETECTION >= 26.5 ) { return new Prediction("BOTTOM", 88, 0); }
		if( FIRST_LEFT_DETECTION < 26.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( DX2_DELTA >= 7460.5 ) { return new Prediction("BOTTOM", 100, 0); }
	}
		if( MAX_AMP_LEFT < -5494 ) { return new Prediction("RIGHT", 17, 0); }
	}
	if( MAX_DX2_LEFT >= 8922.5 ) { 
		if( MAX_DX2_RIGHT >= 16410 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 16410 ) { return new Prediction("TOP", 86, 0); }
	}
	}
	if( DX2_DELTA < 3974.5 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( AMP_DELTA < 5944 ) { 
	if( MAX_DX2_LEFT < 3037 ) { 
	if( AMP_DELTA >= 3703 ) { 
	if( DX2_DELTA < 1233 ) { 
	if( MAX_AMP_LEFT < 4537 ) { 
		if( AVG_DX2_RIGHT >= 1.4 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_RIGHT < 1.4 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( MAX_AMP_LEFT >= 4537 ) { return new Prediction("TOP", 2, 0); }
	}
	if( DX2_DELTA >= 1233 ) { 
		if( MAX_AMP_LEFT < 6005 ) { return new Prediction("LEFT", 27, 0); }
		if( MAX_AMP_LEFT >= 6005 ) { return new Prediction("TOP", 6, 0); }
	}
	}
	if( AMP_DELTA < 3703 ) { 
	if( MAX_AMP_LEFT < 4140 ) { 
		if( DX2_DELTA >= 36 ) { return new Prediction("LEFT", 125, 0); }
	if( DX2_DELTA < 36 ) { 
		if( AVG_DX2_RIGHT < -1.07 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.07 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4140 ) { 
		if( DX2_DELTA < 1733 ) { return new Prediction("TOP", 16, 0); }
		if( DX2_DELTA >= 1733 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3037 ) { 
		if( FIRST_RIGHT_DETECTION >= 88 ) { return new Prediction("TOP", 77, 0); }
	if( FIRST_RIGHT_DETECTION < 88 ) { 
		if( FIRST_LEFT_DETECTION < 59 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 59 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5944 ) { 
	if( DX2_DELTA >= 2079 ) { 
	if( MAX_DX2_LEFT < 2686.5 ) { 
		if( MAX_AMP_LEFT >= 2946 ) { return new Prediction("LEFT", 19, 0); }
	if( MAX_AMP_LEFT < 2946 ) { 
	if( AMP_DELTA < 6786 ) { 
	if( MAX_AMP_RIGHT >= -8655.5 ) { 
		if( MAX_DX2_RIGHT < 3464.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT >= 3464.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -8655.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( AMP_DELTA >= 6786 ) { 
	if( MAX_AMP_LEFT >= -2868.5 ) { 
		if( DX2_DELTA < 2941 ) { return new Prediction("RIGHT", 10, 0); }
		if( DX2_DELTA >= 2941 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT < -2868.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 2686.5 ) { 
		if( AVG_AMP_RIGHT >= 19 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_RIGHT < 19 ) { return new Prediction("BOTTOM", 9, 0); }
	}
	}
	if( DX2_DELTA < 2079 ) { 
		if( AVG_AMP_LEFT >= 10.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT < 10.5 ) { return new Prediction("RIGHT", 41, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( AMP_DELTA >= 5418 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AVG_AMP_RIGHT < -42.5 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_RIGHT >= -42.5 ) { return new Prediction("RIGHT", 112, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 217.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 217.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
	if( AMP_DELTA < 5418 ) { 
	if( MAX_AMP_LEFT < 5681.5 ) { 
		if( MAX_DX2_RIGHT < 3718 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_DX2_RIGHT >= 3718 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 5681.5 ) { return new Prediction("TOP", 14, 0); }
	}
	}
	}
return null;
}
private Prediction runTree77() {
	if( AMP_DELTA >= 6947 ) { 
	if( DX2_DELTA < 3588.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( MAX_DX2_RIGHT < 7864.5 ) { return new Prediction("LEFT", 4, 0); }
	if( MAX_DX2_RIGHT >= 7864.5 ) { 
		if( FIRST_LEFT_DETECTION < 184 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 184 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_AMP_LEFT < 7.5 ) { 
		if( MAX_DX2_LEFT < 7670.5 ) { return new Prediction("RIGHT", 131, 0); }
	if( MAX_DX2_LEFT >= 7670.5 ) { 
		if( AVG_DX2_RIGHT >= 2.9 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 2.9 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_AMP_LEFT >= 3029 ) { 
		if( MAX_DX2_LEFT >= 2675.5 ) { return new Prediction("BOTTOM", 7, 0); }
		if( MAX_DX2_LEFT < 2675.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 3029 ) { 
	if( MAX_DX2_RIGHT >= 4170 ) { 
		if( AVG_DX2_LEFT < -0.31 ) { return new Prediction("BOTTOM", 6, 0); }
	if( AVG_DX2_LEFT >= -0.31 ) { 
		if( FIRST_LEFT_DETECTION >= 194.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION < 194.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 4170 ) { return new Prediction("RIGHT", 11, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3588.5 ) { 
	if( AVG_AMP_LEFT >= -14.5 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
	if( AVG_DX2_LEFT >= 2.21 ) { 
		if( AVG_DX2_LEFT < 3.47 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= 3.47 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_DX2_LEFT < 2.21 ) { 
		if( AVG_AMP_RIGHT >= 29.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT < 29.5 ) { return new Prediction("BOTTOM", 172, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( MAX_DX2_RIGHT < 11805.5 ) { 
		if( DX2_DELTA >= 6010.5 ) { return new Prediction("TOP", 9, 0); }
	if( DX2_DELTA < 6010.5 ) { 
		if( AVG_DX2_RIGHT >= 6.81 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 6.81 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
		if( MAX_DX2_RIGHT >= 11805.5 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	if( AVG_AMP_LEFT < -14.5 ) { 
	if( DETECTION_DELTA < 9 ) { 
		if( AVG_AMP_RIGHT >= -12 ) { return new Prediction("RIGHT", 27, 0); }
		if( AVG_AMP_RIGHT < -12 ) { return new Prediction("TOP", 1, 0); }
	}
		if( DETECTION_DELTA >= 9 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	}
	if( AMP_DELTA < 6947 ) { 
	if( MAX_AMP_LEFT < 4983.5 ) { 
		if( MAX_AMP_RIGHT < -11439 ) { return new Prediction("TOP", 11, 0); }
	if( MAX_AMP_RIGHT >= -11439 ) { 
	if( MAX_AMP_LEFT >= 4218.5 ) { 
	if( MAX_DX2_RIGHT >= 3412.5 ) { 
		if( AVG_DX2_LEFT >= -1.66 ) { return new Prediction("LEFT", 17, 0); }
	if( AVG_DX2_LEFT < -1.66 ) { 
		if( AMP_DELTA < 6046.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( AMP_DELTA >= 6046.5 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
		if( MAX_DX2_RIGHT < 3412.5 ) { return new Prediction("TOP", 8, 0); }
	}
	if( MAX_AMP_LEFT < 4218.5 ) { 
	if( AMP_DELTA < 5016.5 ) { 
		if( MAX_DX2_LEFT >= 7553 ) { return new Prediction("TOP", 2, 0); }
		if( MAX_DX2_LEFT < 7553 ) { return new Prediction("LEFT", 132, 0); }
	}
	if( AMP_DELTA >= 5016.5 ) { 
		if( MAX_DX2_RIGHT >= 3486.5 ) { return new Prediction("LEFT", 32, 0); }
	if( MAX_DX2_RIGHT < 3486.5 ) { 
		if( AVG_DX2_RIGHT >= 3.39 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.39 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4983.5 ) { 
		if( AVG_DX2_RIGHT < 3.26 ) { return new Prediction("TOP", 159, 0); }
	if( AVG_DX2_RIGHT >= 3.26 ) { 
	if( AVG_DX2_RIGHT >= 3.31 ) { 
		if( MAX_AMP_LEFT >= 6144.5 ) { return new Prediction("TOP", 30, 0); }
	if( MAX_AMP_LEFT < 6144.5 ) { 
		if( FIRST_LEFT_DETECTION < 237.5 ) { return new Prediction("TOP", 5, 0); }
		if( FIRST_LEFT_DETECTION >= 237.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AVG_DX2_RIGHT < 3.31 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
return null;
}
private Prediction runTree78() {
	if( MAX_AMP_LEFT >= 6144.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( MAX_AMP_LEFT >= 13370 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_AMP_LEFT < 13370 ) { 
		if( AVG_AMP_LEFT >= 6.5 ) { return new Prediction("LEFT", 7, 0); }
		if( AVG_AMP_LEFT < 6.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	}
	if( DETECTION_DELTA >= 1.5 ) { 
		if( MAX_AMP_LEFT >= 9365.5 ) { return new Prediction("TOP", 128, 0); }
	if( MAX_AMP_LEFT < 9365.5 ) { 
	if( MAX_AMP_RIGHT >= -19959.5 ) { 
		if( AMP_DELTA < 9155 ) { return new Prediction("TOP", 46, 0); }
		if( AMP_DELTA >= 9155 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_AMP_RIGHT < -19959.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 6144.5 ) { 
	if( DX2_DELTA < 3520.5 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
		if( MAX_AMP_LEFT >= 4993.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_AMP_LEFT < 4993.5 ) { 
	if( MAX_AMP_RIGHT >= -11655 ) { 
	if( AVG_AMP_RIGHT >= 18 ) { 
	if( AVG_DX2_RIGHT < 1.66 ) { 
		if( AVG_DX2_LEFT >= -0.63 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_LEFT < -0.63 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= 1.66 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( AVG_AMP_RIGHT < 18 ) { 
		if( AVG_DX2_LEFT >= -1.29 ) { return new Prediction("LEFT", 132, 0); }
	if( AVG_DX2_LEFT < -1.29 ) { 
		if( FIRST_LEFT_DETECTION >= 203 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION < 203 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
		if( MAX_AMP_RIGHT < -11655 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( DETECTION_DELTA < 10.5 ) { 
	if( MAX_AMP_RIGHT >= -11136 ) { 
	if( AMP_DELTA >= 6861 ) { 
		if( MAX_DX2_LEFT < 2966.5 ) { return new Prediction("RIGHT", 22, 0); }
	if( MAX_DX2_LEFT >= 2966.5 ) { 
		if( DX2_DELTA < 2470.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( DX2_DELTA >= 2470.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	if( AMP_DELTA < 6861 ) { 
	if( MAX_AMP_LEFT >= 3538 ) { 
	if( DX2_DELTA >= 1240.5 ) { 
		if( MAX_DX2_RIGHT >= 5872 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 5872 ) { return new Prediction("LEFT", 18, 0); }
	}
	if( DX2_DELTA < 1240.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 267.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 267.5 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	if( MAX_AMP_LEFT < 3538 ) { 
	if( FIRST_RIGHT_DETECTION >= 203 ) { 
		if( DX2_DELTA < 1381 ) { return new Prediction("RIGHT", 6, 0); }
	if( DX2_DELTA >= 1381 ) { 
		if( FIRST_LEFT_DETECTION < 216 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 216 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION < 203 ) { 
		if( AVG_AMP_RIGHT >= 25 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT < 25 ) { return new Prediction("LEFT", 37, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT < -11136 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( FIRST_RIGHT_DETECTION < 48.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 48.5 ) { return new Prediction("RIGHT", 107, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_DX2_LEFT < -0.65 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_LEFT >= -0.65 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3520.5 ) { 
	if( MAX_DX2_LEFT >= 7817.5 ) { 
	if( AVG_DX2_LEFT < -1.61 ) { 
		if( MAX_DX2_RIGHT >= 8926 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 8926 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -1.61 ) { return new Prediction("TOP", 17, 0); }
	}
	if( MAX_DX2_LEFT < 7817.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
		if( AVG_DX2_RIGHT < 6.95 ) { return new Prediction("BOTTOM", 16, 0); }
		if( AVG_DX2_RIGHT >= 6.95 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( AVG_AMP_LEFT < 3.5 ) { return new Prediction("RIGHT", 35, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_LEFT >= 1874 ) { 
		if( FIRST_LEFT_DETECTION < 50.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 50.5 ) { return new Prediction("BOTTOM", 144, 0); }
	}
	if( MAX_DX2_LEFT < 1874 ) { 
	if( AVG_DX2_LEFT < -0.31 ) { 
		if( AVG_DX2_LEFT < -0.65 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.65 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_LEFT >= -0.31 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree79() {
	if( MAX_AMP_LEFT < 6091.5 ) { 
	if( MAX_DX2_LEFT >= 2178 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( MAX_DX2_RIGHT >= 6333.5 ) { 
	if( MAX_DX2_RIGHT >= 10067 ) { 
		if( MAX_DX2_LEFT < 6230 ) { return new Prediction("BOTTOM", 101, 0); }
	if( MAX_DX2_LEFT >= 6230 ) { 
		if( MAX_DX2_LEFT >= 6489.5 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_DX2_LEFT < 6489.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 10067 ) { 
		if( MAX_DX2_LEFT >= 9848.5 ) { return new Prediction("TOP", 8, 0); }
	if( MAX_DX2_LEFT < 9848.5 ) { 
	if( AVG_AMP_LEFT >= -13 ) { 
		if( AMP_DELTA >= 4337 ) { return new Prediction("BOTTOM", 54, 0); }
		if( AMP_DELTA < 4337 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT < -13 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT < 6333.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( AMP_DELTA >= 7341.5 ) { return new Prediction("RIGHT", 20, 0); }
	if( AMP_DELTA < 7341.5 ) { 
		if( FIRST_LEFT_DETECTION < 140.5 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_LEFT_DETECTION >= 140.5 ) { 
		if( AVG_DX2_RIGHT >= -2.29 ) { return new Prediction("TOP", 7, 0); }
		if( AVG_DX2_RIGHT < -2.29 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 1.5 ) { 
	if( MAX_AMP_RIGHT < -8663 ) { 
		if( FIRST_RIGHT_DETECTION >= 171 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 171 ) { return new Prediction("TOP", 13, 0); }
	}
	if( MAX_AMP_RIGHT >= -8663 ) { 
	if( MAX_DX2_LEFT < 3037 ) { 
	if( AMP_DELTA < 2172 ) { 
		if( FIRST_LEFT_DETECTION >= 180 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION < 180 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AMP_DELTA >= 2172 ) { return new Prediction("LEFT", 11, 0); }
	}
		if( MAX_DX2_LEFT >= 3037 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
		if( MAX_AMP_LEFT < -15637.5 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_AMP_LEFT >= -15637.5 ) { 
	if( MAX_AMP_RIGHT < 23325 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AVG_DX2_LEFT >= -2 ) { return new Prediction("RIGHT", 109, 0); }
	if( AVG_DX2_LEFT < -2 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
		if( AVG_DX2_RIGHT < -2.28 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -2.28 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_RIGHT >= 19.5 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( AVG_DX2_RIGHT < 3.24 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT >= 3.24 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 23325 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2178 ) { 
	if( MAX_AMP_RIGHT < -8153.5 ) { 
	if( MAX_AMP_LEFT < 2968.5 ) { 
	if( AVG_AMP_RIGHT < 15 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( MAX_AMP_LEFT >= 2887.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT < 2887.5 ) { return new Prediction("RIGHT", 14, 0); }
	}
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_DX2_LEFT >= 2138.5 ) { return new Prediction("RIGHT", 1, 0); }
	if( MAX_DX2_LEFT < 2138.5 ) { 
		if( DX2_DELTA < 1958 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA >= 1958 ) { return new Prediction("BOTTOM", 12, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 15 ) { 
		if( MAX_AMP_LEFT < -3396.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_LEFT >= -3396.5 ) { return new Prediction("RIGHT", 26, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 2968.5 ) { 
		if( AVG_AMP_RIGHT >= 23.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( AVG_AMP_RIGHT < 23.5 ) { 
		if( MAX_AMP_RIGHT < -13200.5 ) { return new Prediction("BOTTOM", 2, 0); }
	if( MAX_AMP_RIGHT >= -13200.5 ) { 
	if( AVG_AMP_LEFT >= -1.5 ) { 
		if( AMP_DELTA >= 4484.5 ) { return new Prediction("LEFT", 24, 0); }
		if( AMP_DELTA < 4484.5 ) { return new Prediction("TOP", 2, 0); }
	}
		if( AVG_AMP_LEFT < -1.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= -8153.5 ) { 
	if( MAX_AMP_RIGHT >= 6907.5 ) { 
		if( MAX_AMP_LEFT < -100 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT >= -100 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_AMP_RIGHT < 6907.5 ) { 
		if( MAX_AMP_LEFT >= 4052 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_AMP_LEFT < 4052 ) { 
	if( AVG_DX2_RIGHT < -3.36 ) { 
		if( MAX_DX2_LEFT >= 1378 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT < 1378 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= -3.36 ) { 
	if( AMP_DELTA >= 6872.5 ) { 
		if( MAX_DX2_RIGHT >= 2762 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 2762 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 6872.5 ) { return new Prediction("LEFT", 142, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6091.5 ) { 
	if( MAX_AMP_RIGHT < -20050 ) { 
	if( MAX_AMP_LEFT < 16078.5 ) { 
	if( MAX_DX2_RIGHT < 11967.5 ) { 
		if( AVG_AMP_RIGHT >= 3 ) { return new Prediction("RIGHT", 14, 0); }
		if( AVG_AMP_RIGHT < 3 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_DX2_RIGHT >= 11967.5 ) { 
		if( AVG_AMP_RIGHT < 8 ) { return new Prediction("BOTTOM", 14, 0); }
		if( AVG_AMP_RIGHT >= 8 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 16078.5 ) { return new Prediction("TOP", 10, 0); }
	}
	if( MAX_AMP_RIGHT >= -20050 ) { 
	if( MAX_AMP_LEFT >= 7131 ) { 
	if( MAX_AMP_RIGHT < 17245 ) { 
	if( MAX_AMP_LEFT < 7838.5 ) { 
		if( MAX_AMP_RIGHT < -15171 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT >= -15171 ) { return new Prediction("TOP", 16, 0); }
	}
		if( MAX_AMP_LEFT >= 7838.5 ) { return new Prediction("TOP", 137, 0); }
	}
	if( MAX_AMP_RIGHT >= 17245 ) { 
		if( AVG_DX2_RIGHT >= -0.48 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT < -0.48 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT < 7131 ) { 
	if( AMP_DELTA >= 5094 ) { 
		if( MAX_DX2_RIGHT < 7355 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_RIGHT >= 7355 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 5094 ) { return new Prediction("TOP", 10, 0); }
	}
	}
	}
return null;
}
private Prediction runTree80() {
	if( MAX_DX2_LEFT >= 2644.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
	if( MAX_DX2_RIGHT >= 11958 ) { 
		if( AVG_DX2_LEFT >= -1.89 ) { return new Prediction("BOTTOM", 18, 0); }
		if( AVG_DX2_LEFT < -1.89 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_DX2_RIGHT < 11958 ) { 
	if( MAX_AMP_LEFT >= 6605.5 ) { 
		if( AMP_DELTA >= 12347.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 12347.5 ) { return new Prediction("TOP", 93, 0); }
	}
	if( MAX_AMP_LEFT < 6605.5 ) { 
	if( AVG_AMP_RIGHT < -15 ) { 
	if( MAX_AMP_RIGHT >= -17008.5 ) { 
		if( MAX_DX2_LEFT < 2944 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 2944 ) { return new Prediction("TOP", 21, 0); }
	}
	if( MAX_AMP_RIGHT < -17008.5 ) { 
		if( AVG_DX2_RIGHT >= -5.51 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < -5.51 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= -15 ) { 
		if( AVG_AMP_LEFT < 0 ) { return new Prediction("RIGHT", 9, 0); }
	if( AVG_AMP_LEFT >= 0 ) { 
	if( AVG_DX2_LEFT < 0.35 ) { 
		if( MAX_DX2_RIGHT >= 6168.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 6168.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= 0.35 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 5.5 ) { 
		if( AMP_DELTA < 4103.5 ) { return new Prediction("TOP", 29, 0); }
	if( AMP_DELTA >= 4103.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
		if( AVG_DX2_RIGHT < -4.87 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -4.87 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( AVG_AMP_RIGHT >= 9.5 ) { return new Prediction("RIGHT", 116, 0); }
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("BOTTOM", 8, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AMP_DELTA < 7927 ) { 
		if( MAX_DX2_LEFT >= 3121 ) { return new Prediction("TOP", 31, 0); }
	if( MAX_DX2_LEFT < 3121 ) { 
		if( MAX_AMP_LEFT >= 4783.5 ) { return new Prediction("TOP", 6, 0); }
		if( MAX_AMP_LEFT < 4783.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( AMP_DELTA >= 7927 ) { 
		if( AVG_AMP_RIGHT < 30.5 ) { return new Prediction("BOTTOM", 148, 0); }
		if( AVG_AMP_RIGHT >= 30.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2644.5 ) { 
	if( MAX_AMP_RIGHT < -10882.5 ) { 
	if( MAX_DX2_RIGHT >= 5465 ) { 
		if( AVG_DX2_LEFT >= -0.36 ) { return new Prediction("BOTTOM", 22, 0); }
	if( AVG_DX2_LEFT < -0.36 ) { 
		if( AVG_AMP_RIGHT < 18.5 ) { return new Prediction("BOTTOM", 9, 0); }
		if( AVG_AMP_RIGHT >= 18.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5465 ) { 
	if( MAX_DX2_RIGHT < 5077.5 ) { 
		if( FIRST_LEFT_DETECTION >= 274 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION < 274 ) { return new Prediction("RIGHT", 39, 0); }
	}
	if( MAX_DX2_RIGHT >= 5077.5 ) { 
		if( AVG_DX2_LEFT >= 2.55 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 2.55 ) { return new Prediction("LEFT", 9, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT >= -10882.5 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
		if( AMP_DELTA < 11600.5 ) { return new Prediction("LEFT", 118, 0); }
		if( AMP_DELTA >= 11600.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( AMP_DELTA < 6786 ) { 
	if( DETECTION_DELTA >= 10.5 ) { 
	if( MAX_AMP_LEFT >= 3879 ) { 
		if( MAX_AMP_RIGHT < -9353 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= -9353 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_AMP_LEFT < 3879 ) { 
		if( AMP_DELTA < 6151.5 ) { return new Prediction("LEFT", 16, 0); }
		if( AMP_DELTA >= 6151.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( DETECTION_DELTA < 10.5 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
	if( MAX_AMP_LEFT < 4599 ) { 
		if( MAX_AMP_LEFT < 4399 ) { return new Prediction("LEFT", 58, 0); }
	if( MAX_AMP_LEFT >= 4399 ) { 
		if( AVG_DX2_RIGHT < 1.35 ) { return new Prediction("LEFT", 5, 0); }
		if( AVG_DX2_RIGHT >= 1.35 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 4599 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
	if( MAX_AMP_LEFT >= 2035.5 ) { 
	if( AVG_DX2_RIGHT >= -2.12 ) { 
		if( AVG_DX2_LEFT < 0.93 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.93 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < -2.12 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( MAX_AMP_LEFT < 2035.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
		if( FIRST_RIGHT_DETECTION < 248 ) { return new Prediction("RIGHT", 12, 0); }
		if( FIRST_RIGHT_DETECTION >= 248 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree81() {
	if( MAX_DX2_LEFT >= 2641 ) { 
	if( MAX_AMP_LEFT >= 6144.5 ) { 
	if( DX2_DELTA >= 4795.5 ) { 
	if( AVG_AMP_LEFT < -7.5 ) { 
		if( MAX_DX2_RIGHT < 9277.5 ) { return new Prediction("TOP", 8, 0); }
		if( MAX_DX2_RIGHT >= 9277.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
	if( AVG_AMP_LEFT >= -7.5 ) { 
	if( AVG_DX2_RIGHT >= -3.41 ) { 
		if( AMP_DELTA < 9658 ) { return new Prediction("TOP", 44, 0); }
	if( AMP_DELTA >= 9658 ) { 
		if( AVG_DX2_LEFT < 2.97 ) { return new Prediction("BOTTOM", 9, 0); }
		if( AVG_DX2_LEFT >= 2.97 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AVG_DX2_RIGHT < -3.41 ) { 
		if( AVG_DX2_RIGHT >= -5.59 ) { return new Prediction("BOTTOM", 7, 0); }
		if( AVG_DX2_RIGHT < -5.59 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 4795.5 ) { 
	if( AVG_AMP_RIGHT >= 41.5 ) { 
		if( MAX_AMP_RIGHT < -17374.5 ) { return new Prediction("RIGHT", 5, 0); }
		if( MAX_AMP_RIGHT >= -17374.5 ) { return new Prediction("TOP", 4, 0); }
	}
	if( AVG_AMP_RIGHT < 41.5 ) { 
		if( AMP_DELTA < 5172.5 ) { return new Prediction("TOP", 130, 0); }
	if( AMP_DELTA >= 5172.5 ) { 
	if( FIRST_RIGHT_DETECTION < 182 ) { 
		if( AVG_DX2_RIGHT >= 2.79 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 2.79 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 182 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT < 6144.5 ) { 
	if( AVG_AMP_RIGHT < 8.5 ) { 
	if( AMP_DELTA >= 7726 ) { 
	if( AVG_AMP_RIGHT >= -12.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 13, 0); }
		if( AVG_AMP_LEFT >= -0.5 ) { return new Prediction("BOTTOM", 22, 0); }
	}
	if( AVG_AMP_RIGHT < -12.5 ) { 
	if( MAX_AMP_LEFT >= -14115.5 ) { 
		if( AVG_AMP_LEFT >= -9.5 ) { return new Prediction("BOTTOM", 116, 0); }
	if( AVG_AMP_LEFT < -9.5 ) { 
		if( MAX_DX2_RIGHT < 6914 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 6914 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	}
		if( MAX_AMP_LEFT < -14115.5 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	if( AMP_DELTA < 7726 ) { 
		if( DX2_DELTA >= 4953 ) { return new Prediction("TOP", 14, 0); }
	if( DX2_DELTA < 4953 ) { 
	if( MAX_AMP_LEFT < 6097.5 ) { 
		if( FIRST_LEFT_DETECTION >= 199 ) { return new Prediction("TOP", 5, 0); }
		if( FIRST_LEFT_DETECTION < 199 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( MAX_AMP_LEFT >= 6097.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( DX2_DELTA >= 5604.5 ) { 
	if( AVG_DX2_RIGHT < -1.4 ) { 
		if( MAX_DX2_RIGHT >= 8686.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_RIGHT < 8686.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -1.4 ) { return new Prediction("BOTTOM", 13, 0); }
	}
		if( DX2_DELTA < 5604.5 ) { return new Prediction("RIGHT", 104, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT < 2641 ) { 
	if( MAX_DX2_RIGHT >= 5527.5 ) { 
	if( MAX_AMP_LEFT >= 3661 ) { 
		if( FIRST_RIGHT_DETECTION < 209 ) { return new Prediction("LEFT", 8, 0); }
		if( FIRST_RIGHT_DETECTION >= 209 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_AMP_LEFT < 3661 ) { 
	if( AVG_AMP_RIGHT >= 2 ) { 
		if( AVG_DX2_RIGHT < 2.38 ) { return new Prediction("RIGHT", 6, 0); }
		if( AVG_DX2_RIGHT >= 2.38 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_RIGHT < 2 ) { return new Prediction("BOTTOM", 18, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5527.5 ) { 
	if( AMP_DELTA < 6805.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 96, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( MAX_AMP_LEFT >= 4439.5 ) { 
		if( MAX_DX2_RIGHT < 4535.5 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 4535.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( MAX_AMP_LEFT < 4439.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
		if( AVG_AMP_RIGHT < 5 ) { return new Prediction("LEFT", 16, 0); }
	if( AVG_AMP_RIGHT >= 5 ) { 
	if( MAX_AMP_LEFT < 3044 ) { 
		if( MAX_DX2_RIGHT >= 3359.5 ) { return new Prediction("LEFT", 9, 0); }
	if( MAX_DX2_RIGHT < 3359.5 ) { 
		if( MAX_DX2_RIGHT < 2884.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_RIGHT >= 2884.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 3044 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
		if( AVG_AMP_RIGHT >= -26.5 ) { return new Prediction("LEFT", 46, 0); }
	if( AVG_AMP_RIGHT < -26.5 ) { 
		if( AVG_DX2_RIGHT < 2.56 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 2.56 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6805.5 ) { 
	if( AVG_AMP_LEFT >= 6.5 ) { 
		if( FIRST_RIGHT_DETECTION < 190.5 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 190.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_LEFT < 6.5 ) { 
	if( DX2_DELTA >= 2860 ) { 
	if( FIRST_LEFT_DETECTION >= 260.5 ) { 
		if( MAX_DX2_LEFT < 683.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 683.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 260.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( DX2_DELTA < 2860 ) { return new Prediction("RIGHT", 45, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree82() {
	if( AMP_DELTA < 6805.5 ) { 
	if( MAX_AMP_LEFT >= 4993.5 ) { 
	if( FIRST_RIGHT_DETECTION < 86 ) { 
		if( MAX_AMP_LEFT < 8427.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_LEFT >= 8427.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 86 ) { 
		if( AVG_DX2_LEFT >= -1.96 ) { return new Prediction("TOP", 154, 0); }
	if( AVG_DX2_LEFT < -1.96 ) { 
	if( AVG_DX2_RIGHT < 2.91 ) { 
	if( MAX_DX2_LEFT < 4946.5 ) { 
		if( AVG_DX2_RIGHT < -1.93 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT >= -1.93 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_DX2_LEFT >= 4946.5 ) { return new Prediction("TOP", 20, 0); }
	}
		if( AVG_DX2_RIGHT >= 2.91 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 4993.5 ) { 
		if( MAX_AMP_LEFT < -6550.5 ) { return new Prediction("TOP", 20, 0); }
	if( MAX_AMP_LEFT >= -6550.5 ) { 
	if( AVG_AMP_RIGHT < 16 ) { 
	if( MAX_AMP_LEFT < 3948.5 ) { 
		if( MAX_AMP_RIGHT < 6325 ) { return new Prediction("LEFT", 130, 0); }
		if( MAX_AMP_RIGHT >= 6325 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( MAX_AMP_LEFT >= 3948.5 ) { 
		if( AVG_DX2_LEFT >= 1.72 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_LEFT < 1.72 ) { 
		if( AVG_AMP_LEFT >= 15.5 ) { return new Prediction("LEFT", 18, 0); }
	if( AVG_AMP_LEFT < 15.5 ) { 
		if( MAX_DX2_RIGHT >= 3266.5 ) { return new Prediction("LEFT", 12, 0); }
		if( MAX_DX2_RIGHT < 3266.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 16 ) { 
	if( MAX_AMP_LEFT >= 2035.5 ) { 
		if( AVG_AMP_LEFT < 3 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_AMP_LEFT >= 3 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( MAX_AMP_LEFT < 2035.5 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_LEFT >= 1784.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 1784.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( AMP_DELTA >= 6805.5 ) { 
	if( MAX_AMP_RIGHT >= 18005 ) { 
	if( MAX_AMP_LEFT < 5505 ) { 
		if( DETECTION_DELTA < 0.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( DETECTION_DELTA >= 0.5 ) { return new Prediction("BOTTOM", 47, 0); }
	}
		if( MAX_AMP_LEFT >= 5505 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_AMP_RIGHT < 18005 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( MAX_DX2_LEFT >= 7991 ) { 
	if( MAX_AMP_LEFT < 11028.5 ) { 
	if( AVG_DX2_RIGHT >= 2.9 ) { 
		if( MAX_AMP_RIGHT < -20143 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_AMP_RIGHT >= -20143 ) { return new Prediction("TOP", 6, 0); }
	}
		if( AVG_DX2_RIGHT < 2.9 ) { return new Prediction("RIGHT", 5, 0); }
	}
		if( MAX_AMP_LEFT >= 11028.5 ) { return new Prediction("TOP", 14, 0); }
	}
	if( MAX_DX2_LEFT < 7991 ) { 
	if( MAX_DX2_RIGHT >= 9506.5 ) { 
		if( AVG_AMP_RIGHT < -3 ) { return new Prediction("BOTTOM", 18, 0); }
	if( AVG_AMP_RIGHT >= -3 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("RIGHT", 18, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 9506.5 ) { 
		if( FIRST_RIGHT_DETECTION < 52 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_RIGHT_DETECTION >= 52 ) { 
	if( AVG_AMP_RIGHT < 2.5 ) { 
		if( MAX_AMP_LEFT < 3914.5 ) { return new Prediction("RIGHT", 17, 0); }
		if( MAX_AMP_LEFT >= 3914.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 2.5 ) { return new Prediction("RIGHT", 146, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( DX2_DELTA >= 3922.5 ) { 
		if( MAX_DX2_RIGHT < 4272.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4272.5 ) { return new Prediction("BOTTOM", 115, 0); }
	}
	if( DX2_DELTA < 3922.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 243 ) { 
		if( AMP_DELTA >= 8524.5 ) { return new Prediction("BOTTOM", 5, 0); }
		if( AMP_DELTA < 8524.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( FIRST_RIGHT_DETECTION < 243 ) { 
		if( AVG_AMP_RIGHT < -6.5 ) { return new Prediction("BOTTOM", 7, 0); }
	if( AVG_AMP_RIGHT >= -6.5 ) { 
		if( AVG_DX2_LEFT < -1.78 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_LEFT >= -1.78 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 144.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 144.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 11.5 ) { return new Prediction("RIGHT", 20, 0); }
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree83() {
	if( DX2_DELTA >= 3380.5 ) { 
	if( MAX_DX2_LEFT < 7749.5 ) { 
	if( MAX_DX2_RIGHT < 7820 ) { 
	if( AMP_DELTA < 12433 ) { 
	if( MAX_AMP_LEFT < 4396.5 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
	if( AVG_DX2_RIGHT >= -2.65 ) { 
		if( AVG_DX2_RIGHT < -0.1 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= -0.1 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < -2.65 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 31, 0); }
	}
	if( MAX_AMP_LEFT >= 4396.5 ) { 
		if( AVG_AMP_LEFT >= 7.5 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_AMP_LEFT < 7.5 ) { 
		if( AVG_DX2_RIGHT >= 1.95 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 1.95 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 12433 ) { 
		if( MAX_AMP_LEFT < 588.5 ) { return new Prediction("RIGHT", 21, 0); }
	if( MAX_AMP_LEFT >= 588.5 ) { 
		if( AVG_AMP_RIGHT >= 19 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_AMP_RIGHT < 19 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 7820 ) { 
		if( DETECTION_DELTA >= 5 ) { return new Prediction("BOTTOM", 154, 0); }
	if( DETECTION_DELTA < 5 ) { 
	if( MAX_DX2_RIGHT >= 10961 ) { 
		if( AVG_AMP_RIGHT >= 29.5 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_RIGHT < 29.5 ) { return new Prediction("BOTTOM", 10, 0); }
	}
		if( MAX_DX2_RIGHT < 10961 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 7749.5 ) { 
	if( MAX_AMP_RIGHT >= -25066 ) { 
	if( FIRST_LEFT_DETECTION < 268 ) { 
		if( MAX_DX2_RIGHT >= 15160.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 15160.5 ) { return new Prediction("TOP", 89, 0); }
	}
		if( FIRST_LEFT_DETECTION >= 268 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( MAX_AMP_RIGHT < -25066 ) { 
		if( MAX_DX2_LEFT < 20034.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_LEFT >= 20034.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( DX2_DELTA < 3380.5 ) { 
	if( MAX_AMP_LEFT < 6044.5 ) { 
	if( AMP_DELTA < 6786 ) { 
	if( FIRST_RIGHT_DETECTION >= 140.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AMP_DELTA >= 3910.5 ) { 
	if( AVG_AMP_RIGHT >= 3 ) { 
	if( AVG_DX2_RIGHT >= 0.63 ) { 
		if( MAX_DX2_RIGHT >= 3337.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_RIGHT < 3337.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_RIGHT < 0.63 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( AVG_AMP_RIGHT < 3 ) { return new Prediction("LEFT", 13, 0); }
	}
	if( AMP_DELTA < 3910.5 ) { 
		if( DX2_DELTA < 348.5 ) { return new Prediction("TOP", 4, 0); }
	if( DX2_DELTA >= 348.5 ) { 
	if( FIRST_LEFT_DETECTION >= 160 ) { 
		if( MAX_AMP_LEFT >= 4468 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_AMP_LEFT < 4468 ) { return new Prediction("LEFT", 15, 0); }
	}
	if( FIRST_LEFT_DETECTION < 160 ) { 
		if( AVG_DX2_LEFT < -1.36 ) { return new Prediction("TOP", 4, 0); }
		if( AVG_DX2_LEFT >= -1.36 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_LEFT < 2424.5 ) { 
	if( DX2_DELTA >= 31.5 ) { 
		if( AMP_DELTA < 6092.5 ) { return new Prediction("LEFT", 58, 0); }
	if( AMP_DELTA >= 6092.5 ) { 
		if( AVG_AMP_RIGHT >= -24 ) { return new Prediction("LEFT", 17, 0); }
		if( AVG_AMP_RIGHT < -24 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( DX2_DELTA < 31.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 2424.5 ) { 
		if( DETECTION_DELTA >= 55 ) { return new Prediction("LEFT", 3, 0); }
		if( DETECTION_DELTA < 55 ) { return new Prediction("TOP", 3, 0); }
	}
	}
	}
		if( FIRST_RIGHT_DETECTION < 140.5 ) { return new Prediction("LEFT", 99, 0); }
	}
	if( AMP_DELTA >= 6786 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( DETECTION_DELTA < 9.5 ) { return new Prediction("RIGHT", 128, 0); }
	if( DETECTION_DELTA >= 9.5 ) { 
		if( MAX_DX2_RIGHT < 4769.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( MAX_DX2_RIGHT >= 4769.5 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
		if( FIRST_LEFT_DETECTION < 109.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 109.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 6044.5 ) { 
	if( DETECTION_DELTA < 0.5 ) { 
		if( MAX_DX2_RIGHT < 5838 ) { return new Prediction("RIGHT", 2, 0); }
	if( MAX_DX2_RIGHT >= 5838 ) { 
		if( AVG_DX2_LEFT < 0.84 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= 0.84 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DETECTION_DELTA >= 0.5 ) { 
	if( MAX_AMP_RIGHT < -21231 ) { 
		if( AVG_DX2_RIGHT < 1.98 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_RIGHT >= 1.98 ) { return new Prediction("TOP", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -21231 ) { return new Prediction("TOP", 85, 0); }
	}
	}
	}
return null;
}
private Prediction runTree84() {
	if( AMP_DELTA >= 6814 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_RIGHT >= -4 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( MAX_AMP_RIGHT >= 4459 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_RIGHT < 4459 ) { 
		if( FIRST_LEFT_DETECTION < 185 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 185 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("RIGHT", 179, 0); }
	}
	if( AVG_AMP_RIGHT < -4 ) { 
	if( AVG_DX2_RIGHT < 1.2 ) { 
	if( AVG_AMP_LEFT >= -9.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 141 ) { return new Prediction("BOTTOM", 19, 0); }
	if( FIRST_RIGHT_DETECTION < 141 ) { 
		if( AVG_DX2_LEFT >= 0.45 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT < 0.45 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AVG_AMP_LEFT < -9.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( AVG_DX2_RIGHT >= 1.2 ) { 
	if( AMP_DELTA >= 7955.5 ) { 
		if( MAX_AMP_RIGHT < -22797 ) { return new Prediction("BOTTOM", 6, 0); }
		if( MAX_AMP_RIGHT >= -22797 ) { return new Prediction("TOP", 11, 0); }
	}
	if( AMP_DELTA < 7955.5 ) { 
		if( MAX_AMP_RIGHT < -9927 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_RIGHT >= -9927 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_LEFT >= 2653.5 ) { 
		if( MAX_DX2_RIGHT < 4388 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4388 ) { return new Prediction("BOTTOM", 129, 0); }
	}
	if( MAX_DX2_LEFT < 2653.5 ) { 
	if( AMP_DELTA >= 8215 ) { 
		if( MAX_DX2_RIGHT >= 5907.5 ) { return new Prediction("BOTTOM", 20, 0); }
	if( MAX_DX2_RIGHT < 5907.5 ) { 
		if( AVG_AMP_LEFT < 0.5 ) { return new Prediction("RIGHT", 14, 0); }
		if( AVG_AMP_LEFT >= 0.5 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AMP_DELTA < 8215 ) { 
		if( MAX_DX2_LEFT < 611 ) { return new Prediction("LEFT", 1, 0); }
	if( MAX_DX2_LEFT >= 611 ) { 
		if( AVG_DX2_LEFT >= 0.22 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < 0.22 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_AMP_LEFT >= 4993.5 ) { 
	if( MAX_AMP_LEFT < 8952.5 ) { 
	if( AMP_DELTA < 5096.5 ) { 
		if( FIRST_LEFT_DETECTION >= 260.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION < 260.5 ) { return new Prediction("TOP", 42, 0); }
	}
	if( AMP_DELTA >= 5096.5 ) { 
		if( MAX_AMP_RIGHT < -12903 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_RIGHT >= -12903 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 8952.5 ) { return new Prediction("TOP", 144, 0); }
	}
	if( MAX_AMP_LEFT < 4993.5 ) { 
	if( MAX_DX2_LEFT < 7701 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( MAX_AMP_RIGHT < 6325 ) { 
	if( AVG_AMP_RIGHT < 19.5 ) { 
		if( DX2_DELTA < 274 ) { return new Prediction("TOP", 2, 0); }
	if( DX2_DELTA >= 274 ) { 
		if( DX2_DELTA >= 1217.5 ) { return new Prediction("LEFT", 37, 0); }
	if( DX2_DELTA < 1217.5 ) { 
	if( AVG_DX2_LEFT >= -1.74 ) { 
		if( AVG_AMP_RIGHT < 7 ) { return new Prediction("LEFT", 15, 0); }
		if( AVG_AMP_RIGHT >= 7 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_DX2_LEFT < -1.74 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 19.5 ) { 
		if( MAX_AMP_RIGHT >= -7113.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_AMP_RIGHT < -7113.5 ) { return new Prediction("RIGHT", 5, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 6325 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_DX2_LEFT >= 0.05 ) { 
	if( AVG_DX2_RIGHT < -1.51 ) { 
		if( MAX_DX2_RIGHT >= 3382 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 3382 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_DX2_RIGHT >= -1.51 ) { 
		if( AVG_DX2_LEFT < 0.13 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.13 ) { return new Prediction("LEFT", 16, 0); }
	}
	}
		if( AVG_DX2_LEFT < 0.05 ) { return new Prediction("LEFT", 112, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 7701 ) { return new Prediction("TOP", 18, 0); }
	}
	}
return null;
}
private Prediction runTree85() {
	if( AMP_DELTA >= 6947 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
	if( MAX_DX2_LEFT < 9713 ) { 
		if( DX2_DELTA >= 4507 ) { return new Prediction("BOTTOM", 21, 0); }
	if( DX2_DELTA < 4507 ) { 
		if( MAX_AMP_LEFT < 3971.5 ) { return new Prediction("RIGHT", 7, 0); }
	if( MAX_AMP_LEFT >= 3971.5 ) { 
		if( AVG_DX2_RIGHT >= 3.91 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 3.91 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 9713 ) { return new Prediction("TOP", 9, 0); }
	}
	if( AVG_AMP_RIGHT >= -1.5 ) { 
	if( MAX_AMP_LEFT >= 4443.5 ) { 
	if( MAX_AMP_LEFT >= 6450.5 ) { 
	if( MAX_DX2_RIGHT >= 5061 ) { 
	if( MAX_AMP_RIGHT >= -19172 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_AMP_LEFT >= 2.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_RIGHT < -19172 ) { return new Prediction("RIGHT", 27, 0); }
	}
		if( MAX_DX2_RIGHT < 5061 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_AMP_LEFT < 6450.5 ) { 
	if( MAX_DX2_LEFT < 3247.5 ) { 
		if( MAX_AMP_RIGHT < -14601.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT >= -14601.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	if( MAX_DX2_LEFT >= 3247.5 ) { 
		if( MAX_AMP_LEFT >= 5175 ) { return new Prediction("RIGHT", 13, 0); }
		if( MAX_AMP_LEFT < 5175 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < 4443.5 ) { return new Prediction("RIGHT", 132, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_RIGHT < 5516.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 19, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 264 ) { return new Prediction("BOTTOM", 1, 0); }
	if( FIRST_RIGHT_DETECTION < 264 ) { 
		if( AVG_AMP_RIGHT < 16 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_AMP_RIGHT >= 16 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
		if( MAX_DX2_RIGHT >= 5516.5 ) { return new Prediction("BOTTOM", 170, 0); }
	}
	}
	if( AMP_DELTA < 6947 ) { 
	if( MAX_DX2_LEFT < 2420 ) { 
	if( AMP_DELTA < 5944 ) { 
	if( MAX_AMP_LEFT < 4782 ) { 
	if( MAX_AMP_LEFT >= 4218.5 ) { 
		if( DX2_DELTA >= 938 ) { return new Prediction("LEFT", 5, 0); }
		if( DX2_DELTA < 938 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_AMP_LEFT < 4218.5 ) { return new Prediction("LEFT", 124, 0); }
	}
		if( MAX_AMP_LEFT >= 4782 ) { return new Prediction("TOP", 6, 0); }
	}
	if( AMP_DELTA >= 5944 ) { 
		if( MAX_DX2_RIGHT >= 3308 ) { return new Prediction("LEFT", 34, 0); }
	if( MAX_DX2_RIGHT < 3308 ) { 
		if( FIRST_LEFT_DETECTION < 460.5 ) { return new Prediction("RIGHT", 6, 0); }
		if( FIRST_LEFT_DETECTION >= 460.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 2420 ) { 
	if( AMP_DELTA >= 4904 ) { 
		if( MAX_AMP_RIGHT >= -10882 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_RIGHT < -10882 ) { 
	if( DETECTION_DELTA >= 2 ) { 
		if( AVG_DX2_RIGHT >= 6.29 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 6.29 ) { return new Prediction("TOP", 10, 0); }
	}
		if( DETECTION_DELTA < 2 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( AMP_DELTA < 4904 ) { 
		if( MAX_DX2_LEFT >= 3039.5 ) { return new Prediction("TOP", 175, 0); }
	if( MAX_DX2_LEFT < 3039.5 ) { 
		if( MAX_AMP_LEFT < 4527 ) { return new Prediction("LEFT", 8, 0); }
		if( MAX_AMP_LEFT >= 4527 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree86() {
	if( MAX_DX2_LEFT >= 2996 ) { 
	if( MAX_AMP_LEFT >= 8647.5 ) { 
	if( MAX_DX2_RIGHT >= 11239.5 ) { 
	if( MAX_AMP_LEFT < 18610.5 ) { 
		if( DETECTION_DELTA >= 3.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( DETECTION_DELTA < 3.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( MAX_AMP_LEFT >= 18610.5 ) { return new Prediction("TOP", 5, 0); }
	}
		if( MAX_DX2_RIGHT < 11239.5 ) { return new Prediction("TOP", 142, 0); }
	}
	if( MAX_AMP_LEFT < 8647.5 ) { 
	if( MAX_AMP_LEFT >= -3629.5 ) { 
	if( MAX_AMP_LEFT >= 5334.5 ) { 
	if( MAX_DX2_RIGHT < 5629.5 ) { 
		if( AMP_DELTA < 7651.5 ) { return new Prediction("TOP", 24, 0); }
		if( AMP_DELTA >= 7651.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	if( MAX_DX2_RIGHT >= 5629.5 ) { 
		if( AVG_AMP_RIGHT < 5.5 ) { return new Prediction("BOTTOM", 23, 0); }
	if( AVG_AMP_RIGHT >= 5.5 ) { 
	if( AMP_DELTA < 10867.5 ) { 
		if( DX2_DELTA >= 3062.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( DX2_DELTA < 3062.5 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AMP_DELTA >= 10867.5 ) { return new Prediction("RIGHT", 31, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < 5334.5 ) { 
	if( AMP_DELTA < 10683 ) { 
		if( DETECTION_DELTA < 7.5 ) { return new Prediction("RIGHT", 6, 0); }
	if( DETECTION_DELTA >= 7.5 ) { 
		if( AVG_DX2_RIGHT >= -1.2 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < -1.2 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( AMP_DELTA >= 10683 ) { 
		if( AVG_DX2_LEFT < -3.95 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= -3.95 ) { return new Prediction("BOTTOM", 111, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -3629.5 ) { 
	if( AVG_AMP_RIGHT < -16.5 ) { 
	if( AVG_AMP_RIGHT < -19.5 ) { 
		if( MAX_AMP_LEFT >= -7227 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_AMP_LEFT < -7227 ) { return new Prediction("TOP", 18, 0); }
	}
		if( AVG_AMP_RIGHT >= -19.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_RIGHT >= -16.5 ) { 
	if( AVG_AMP_LEFT >= -1 ) { 
		if( MAX_AMP_RIGHT >= -18698 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_AMP_RIGHT < -18698 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT < -1 ) { return new Prediction("RIGHT", 71, 0); }
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 2996 ) { 
	if( AMP_DELTA < 6927.5 ) { 
		if( DETECTION_DELTA >= 17.5 ) { return new Prediction("LEFT", 110, 0); }
	if( DETECTION_DELTA < 17.5 ) { 
	if( AVG_AMP_RIGHT < 22.5 ) { 
	if( AMP_DELTA < 4802.5 ) { 
		if( AVG_DX2_RIGHT < -2.31 ) { return new Prediction("TOP", 5, 0); }
	if( AVG_DX2_RIGHT >= -2.31 ) { 
	if( FIRST_RIGHT_DETECTION >= 158.5 ) { 
		if( MAX_AMP_LEFT >= 3682 ) { return new Prediction("TOP", 10, 0); }
		if( MAX_AMP_LEFT < 3682 ) { return new Prediction("LEFT", 19, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 158.5 ) { return new Prediction("LEFT", 31, 0); }
	}
	}
	if( AMP_DELTA >= 4802.5 ) { 
		if( MAX_DX2_LEFT >= 1701.5 ) { return new Prediction("LEFT", 44, 0); }
	if( MAX_DX2_LEFT < 1701.5 ) { 
		if( MAX_AMP_LEFT < 838.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT >= 838.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 22.5 ) { 
		if( AVG_AMP_RIGHT < 34 ) { return new Prediction("RIGHT", 6, 0); }
	if( AVG_AMP_RIGHT >= 34 ) { 
		if( MAX_DX2_LEFT < 2445.5 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 2445.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 6927.5 ) { 
	if( MAX_DX2_RIGHT < 6379.5 ) { 
	if( DX2_DELTA >= 2392 ) { 
	if( MAX_AMP_LEFT < 4370.5 ) { 
		if( DETECTION_DELTA < 15.5 ) { return new Prediction("RIGHT", 25, 0); }
		if( DETECTION_DELTA >= 15.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
		if( MAX_AMP_LEFT >= 4370.5 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( DX2_DELTA < 2392 ) { return new Prediction("RIGHT", 49, 0); }
	}
	if( MAX_DX2_RIGHT >= 6379.5 ) { 
		if( MAX_DX2_RIGHT >= 7405.5 ) { return new Prediction("BOTTOM", 29, 0); }
	if( MAX_DX2_RIGHT < 7405.5 ) { 
		if( MAX_AMP_LEFT >= -2535.5 ) { return new Prediction("BOTTOM", 12, 0); }
		if( MAX_AMP_LEFT < -2535.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree87() {
	if( MAX_DX2_LEFT >= 3247 ) { 
	if( AVG_AMP_LEFT >= -6.5 ) { 
	if( MAX_AMP_LEFT >= 9365.5 ) { 
		if( MAX_AMP_RIGHT >= -23028.5 ) { return new Prediction("TOP", 101, 0); }
	if( MAX_AMP_RIGHT < -23028.5 ) { 
		if( MAX_DX2_RIGHT >= 11956.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_RIGHT < 11956.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	if( MAX_AMP_LEFT < 9365.5 ) { 
	if( MAX_AMP_RIGHT < -18201.5 ) { 
	if( AVG_AMP_LEFT < 0 ) { 
		if( MAX_AMP_LEFT < 6317 ) { return new Prediction("BOTTOM", 4, 0); }
		if( MAX_AMP_LEFT >= 6317 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 0 ) { return new Prediction("BOTTOM", 55, 0); }
	}
	if( MAX_AMP_RIGHT >= -18201.5 ) { 
		if( MAX_AMP_RIGHT >= 12226 ) { return new Prediction("BOTTOM", 35, 0); }
	if( MAX_AMP_RIGHT < 12226 ) { 
		if( AMP_DELTA < 3609 ) { return new Prediction("TOP", 37, 0); }
	if( AMP_DELTA >= 3609 ) { 
	if( MAX_DX2_RIGHT >= 7044 ) { 
	if( AVG_DX2_RIGHT < 4.71 ) { 
		if( AVG_AMP_RIGHT < 24.5 ) { return new Prediction("BOTTOM", 26, 0); }
		if( AVG_AMP_RIGHT >= 24.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= 4.71 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_DX2_RIGHT < 7044 ) { 
	if( MAX_AMP_RIGHT >= -10935.5 ) { 
		if( AVG_DX2_RIGHT < 3.27 ) { return new Prediction("TOP", 5, 0); }
		if( AVG_DX2_RIGHT >= 3.27 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_AMP_RIGHT < -10935.5 ) { 
		if( DX2_DELTA < 1380 ) { return new Prediction("TOP", 2, 0); }
		if( DX2_DELTA >= 1380 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( AVG_AMP_LEFT < -6.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( MAX_AMP_LEFT >= 7908 ) { 
		if( AMP_DELTA < 7349 ) { return new Prediction("TOP", 9, 0); }
	if( AMP_DELTA >= 7349 ) { 
		if( AVG_AMP_RIGHT < -23.5 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_RIGHT >= -23.5 ) { return new Prediction("RIGHT", 8, 0); }
	}
	}
		if( MAX_AMP_LEFT < 7908 ) { return new Prediction("RIGHT", 68, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
	if( DX2_DELTA >= 3812 ) { 
		if( AMP_DELTA < 8314 ) { return new Prediction("TOP", 5, 0); }
		if( AMP_DELTA >= 8314 ) { return new Prediction("BOTTOM", 17, 0); }
	}
	if( DX2_DELTA < 3812 ) { 
		if( AMP_DELTA < 6647 ) { return new Prediction("TOP", 15, 0); }
	if( AMP_DELTA >= 6647 ) { 
		if( MAX_AMP_RIGHT >= 2160 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 2160 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT < 3247 ) { 
	if( MAX_AMP_RIGHT >= -10875 ) { 
	if( MAX_AMP_LEFT < 4800.5 ) { 
	if( AVG_DX2_RIGHT < -1.52 ) { 
	if( AMP_DELTA < 4936.5 ) { 
	if( MAX_AMP_RIGHT < 4763.5 ) { 
		if( DETECTION_DELTA >= 21 ) { return new Prediction("LEFT", 16, 0); }
	if( DETECTION_DELTA < 21 ) { 
		if( FIRST_LEFT_DETECTION >= 119 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION < 119 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 4763.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AMP_DELTA >= 4936.5 ) { 
		if( MAX_DX2_RIGHT >= 5043 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 5043 ) { return new Prediction("RIGHT", 28, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -1.52 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
		if( FIRST_RIGHT_DETECTION < 208 ) { return new Prediction("LEFT", 75, 0); }
	if( FIRST_RIGHT_DETECTION >= 208 ) { 
	if( FIRST_RIGHT_DETECTION < 213.5 ) { 
		if( MAX_DX2_LEFT < 1604 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 1604 ) { return new Prediction("TOP", 2, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 213.5 ) { 
		if( MAX_DX2_RIGHT < 4168 ) { return new Prediction("LEFT", 13, 0); }
	if( MAX_DX2_RIGHT >= 4168 ) { 
		if( AVG_DX2_LEFT < -1.31 ) { return new Prediction("LEFT", 2, 0); }
	if( AVG_DX2_LEFT >= -1.31 ) { 
		if( AVG_DX2_LEFT < 1.38 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_LEFT >= 1.38 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
		if( FIRST_RIGHT_DETECTION < 143 ) { return new Prediction("LEFT", 44, 0); }
	if( FIRST_RIGHT_DETECTION >= 143 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
		if( AMP_DELTA >= 6172 ) { return new Prediction("RIGHT", 12, 0); }
	if( AMP_DELTA < 6172 ) { 
	if( MAX_DX2_LEFT >= 2179.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 221.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 221.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_LEFT < 2179.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( AVG_DX2_LEFT < -0.4 ) { return new Prediction("BOTTOM", 2, 0); }
	if( AVG_DX2_LEFT >= -0.4 ) { 
	if( AVG_AMP_RIGHT >= 2 ) { 
	if( MAX_AMP_RIGHT < -6872.5 ) { 
		if( FIRST_RIGHT_DETECTION < 208 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION >= 208 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -6872.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( AVG_AMP_RIGHT < 2 ) { return new Prediction("LEFT", 22, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 4800.5 ) { 
		if( AVG_DX2_RIGHT >= -2.11 ) { return new Prediction("TOP", 12, 0); }
		if( AVG_DX2_RIGHT < -2.11 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -10875 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( MAX_DX2_RIGHT < 7127 ) { 
	if( AVG_DX2_LEFT < -3.25 ) { 
		if( AVG_DX2_LEFT < -3.61 ) { return new Prediction("RIGHT", 3, 0); }
		if( AVG_DX2_LEFT >= -3.61 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -3.25 ) { return new Prediction("RIGHT", 67, 0); }
	}
	if( MAX_DX2_RIGHT >= 7127 ) { 
		if( MAX_AMP_LEFT >= -3595.5 ) { return new Prediction("BOTTOM", 8, 0); }
		if( MAX_AMP_LEFT < -3595.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( AMP_DELTA >= 8210.5 ) { 
	if( DX2_DELTA < 2871.5 ) { 
		if( AVG_AMP_LEFT < 10 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_LEFT >= 10 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 2871.5 ) { return new Prediction("BOTTOM", 52, 0); }
	}
	if( AMP_DELTA < 8210.5 ) { 
	if( AVG_AMP_LEFT < 16.5 ) { 
	if( AVG_DX2_RIGHT < 4.53 ) { 
		if( AVG_DX2_RIGHT < 0.49 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.49 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AVG_DX2_RIGHT >= 4.53 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_AMP_LEFT >= 16.5 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree88() {
	if( AMP_DELTA < 6786 ) { 
	if( FIRST_RIGHT_DETECTION < 106 ) { 
		if( MAX_AMP_LEFT < 4128.5 ) { return new Prediction("LEFT", 68, 0); }
		if( MAX_AMP_LEFT >= 4128.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( FIRST_RIGHT_DETECTION >= 106 ) { 
	if( MAX_AMP_LEFT < 4983.5 ) { 
	if( MAX_DX2_LEFT < 3990 ) { 
	if( AVG_DX2_RIGHT < -3.36 ) { 
		if( FIRST_RIGHT_DETECTION >= 272 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_RIGHT_DETECTION < 272 ) { 
		if( FIRST_LEFT_DETECTION < 106 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 106 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	if( AVG_DX2_RIGHT >= -3.36 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( FIRST_LEFT_DETECTION < 235.5 ) { return new Prediction("LEFT", 81, 0); }
	if( FIRST_LEFT_DETECTION >= 235.5 ) { 
		if( FIRST_LEFT_DETECTION < 250 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 250 ) { return new Prediction("LEFT", 12, 0); }
	}
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( AMP_DELTA >= 431.5 ) { 
	if( FIRST_RIGHT_DETECTION < 274.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
	if( FIRST_LEFT_DETECTION < 240 ) { 
		if( MAX_AMP_LEFT < 4797.5 ) { return new Prediction("LEFT", 12, 0); }
	if( MAX_AMP_LEFT >= 4797.5 ) { 
		if( MAX_DX2_RIGHT < 4115 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 4115 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 240 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("LEFT", 17, 0); }
	}
		if( FIRST_RIGHT_DETECTION >= 274.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AMP_DELTA < 431.5 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3990 ) { 
		if( MAX_DX2_RIGHT < 10479 ) { return new Prediction("TOP", 11, 0); }
		if( MAX_DX2_RIGHT >= 10479 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4983.5 ) { 
	if( AMP_DELTA >= 4023.5 ) { 
		if( MAX_AMP_LEFT < 6629.5 ) { return new Prediction("BOTTOM", 4, 0); }
	if( MAX_AMP_LEFT >= 6629.5 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("LEFT", 1, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("TOP", 17, 0); }
	}
	}
		if( AMP_DELTA < 4023.5 ) { return new Prediction("TOP", 153, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
	if( AVG_AMP_RIGHT < -14.5 ) { 
		if( MAX_DX2_LEFT >= 7991 ) { return new Prediction("TOP", 11, 0); }
	if( MAX_DX2_LEFT < 7991 ) { 
	if( AVG_DX2_RIGHT < 5.38 ) { 
		if( AVG_DX2_RIGHT >= -5.7 ) { return new Prediction("BOTTOM", 165, 0); }
		if( AVG_DX2_RIGHT < -5.7 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= 5.38 ) { 
		if( AVG_DX2_LEFT >= 0.22 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < 0.22 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= -14.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( MAX_AMP_LEFT >= 3884 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
		if( AVG_DX2_LEFT < 2.62 ) { return new Prediction("BOTTOM", 4, 0); }
		if( AVG_DX2_LEFT >= 2.62 ) { return new Prediction("RIGHT", 3, 0); }
	}
		if( AVG_AMP_RIGHT >= 11.5 ) { return new Prediction("RIGHT", 45, 0); }
	}
		if( MAX_AMP_LEFT < 3884 ) { return new Prediction("RIGHT", 127, 0); }
	}
	if( AVG_AMP_LEFT >= 8 ) { 
	if( MAX_DX2_LEFT >= 3647.5 ) { 
		if( MAX_DX2_LEFT < 11974 ) { return new Prediction("BOTTOM", 10, 0); }
		if( MAX_DX2_LEFT >= 11974 ) { return new Prediction("TOP", 6, 0); }
	}
		if( MAX_DX2_LEFT < 3647.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_AMP_LEFT < 1.5 ) { 
		if( AMP_DELTA < 10398.5 ) { return new Prediction("RIGHT", 13, 0); }
		if( AMP_DELTA >= 10398.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("BOTTOM", 25, 0); }
	}
	}
	}
return null;
}
private Prediction runTree89() {
	if( MAX_DX2_RIGHT < 5643.5 ) { 
	if( DETECTION_DELTA < 20.5 ) { 
	if( MAX_AMP_LEFT < 4399 ) { 
	if( AVG_AMP_RIGHT < 9.5 ) { 
	if( DX2_DELTA < 2669.5 ) { 
	if( AVG_DX2_RIGHT < -2.03 ) { 
		if( FIRST_RIGHT_DETECTION >= 161 ) { return new Prediction("RIGHT", 3, 0); }
		if( FIRST_RIGHT_DETECTION < 161 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_DX2_RIGHT >= -2.03 ) { 
	if( MAX_AMP_LEFT < 2453.5 ) { 
		if( AMP_DELTA < 6841.5 ) { return new Prediction("LEFT", 25, 0); }
		if( AMP_DELTA >= 6841.5 ) { return new Prediction("RIGHT", 12, 0); }
	}
	if( MAX_AMP_LEFT >= 2453.5 ) { 
		if( MAX_DX2_RIGHT < 2048.5 ) { return new Prediction("TOP", 1, 0); }
	if( MAX_DX2_RIGHT >= 2048.5 ) { 
	if( AVG_DX2_RIGHT < -1.1 ) { 
		if( MAX_DX2_LEFT >= 2214.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 2214.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -1.1 ) { return new Prediction("LEFT", 46, 0); }
	}
	}
	}
	}
	if( DX2_DELTA >= 2669.5 ) { 
		if( AMP_DELTA >= 6969.5 ) { return new Prediction("TOP", 3, 0); }
	if( AMP_DELTA < 6969.5 ) { 
		if( AVG_DX2_RIGHT >= 4.39 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 4.39 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT >= 9.5 ) { 
		if( MAX_DX2_LEFT >= 2338 ) { return new Prediction("RIGHT", 31, 0); }
	if( MAX_DX2_LEFT < 2338 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( AMP_DELTA < 6442.5 ) { 
	if( AVG_AMP_RIGHT >= 17.5 ) { 
		if( FIRST_LEFT_DETECTION >= 275.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 275.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( AVG_AMP_RIGHT < 17.5 ) { 
		if( FIRST_LEFT_DETECTION < 235.5 ) { return new Prediction("LEFT", 7, 0); }
		if( FIRST_LEFT_DETECTION >= 235.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( AMP_DELTA >= 6442.5 ) { return new Prediction("RIGHT", 38, 0); }
	}
		if( AVG_AMP_LEFT >= 5.5 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4399 ) { 
	if( AMP_DELTA < 6579.5 ) { 
	if( MAX_AMP_LEFT < 5282.5 ) { 
		if( AVG_DX2_LEFT >= 0.52 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.52 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_AMP_LEFT >= 5282.5 ) { return new Prediction("TOP", 77, 0); }
	}
	if( AMP_DELTA >= 6579.5 ) { 
	if( AVG_AMP_RIGHT < 24.5 ) { 
		if( MAX_DX2_LEFT < 6569.5 ) { return new Prediction("LEFT", 5, 0); }
		if( MAX_DX2_LEFT >= 6569.5 ) { return new Prediction("TOP", 3, 0); }
	}
		if( AVG_AMP_RIGHT >= 24.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 20.5 ) { 
		if( MAX_DX2_LEFT < 616.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( MAX_DX2_LEFT >= 616.5 ) { return new Prediction("LEFT", 111, 0); }
	}
	}
	if( MAX_DX2_RIGHT >= 5643.5 ) { 
	if( AMP_DELTA < 7502 ) { 
	if( MAX_DX2_LEFT < 4888 ) { 
		if( MAX_DX2_LEFT >= 3405 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_LEFT < 3405 ) { 
		if( FIRST_LEFT_DETECTION >= 126.5 ) { return new Prediction("LEFT", 7, 0); }
	if( FIRST_LEFT_DETECTION < 126.5 ) { 
		if( AVG_DX2_LEFT >= 2.83 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 2.83 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
		if( MAX_DX2_LEFT >= 4888 ) { return new Prediction("TOP", 109, 0); }
	}
	if( AMP_DELTA >= 7502 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT < 2 ) { 
		if( AMP_DELTA >= 22668.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 22668.5 ) { return new Prediction("RIGHT", 95, 0); }
	}
	if( AVG_AMP_LEFT >= 2 ) { 
	if( AVG_DX2_LEFT < -2.26 ) { 
		if( AVG_DX2_LEFT >= -4.7 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT < -4.7 ) { return new Prediction("TOP", 1, 0); }
	}
		if( AVG_DX2_LEFT >= -2.26 ) { return new Prediction("BOTTOM", 29, 0); }
	}
	}
		if( DETECTION_DELTA >= 8.5 ) { return new Prediction("BOTTOM", 171, 0); }
	}
	}
return null;
}
private Prediction runTree90() {
	if( AMP_DELTA < 7065.5 ) { 
	if( DETECTION_DELTA < 20.5 ) { 
	if( MAX_DX2_LEFT < 3004.5 ) { 
	if( MAX_DX2_LEFT < 1661.5 ) { 
	if( AMP_DELTA >= 6170 ) { 
		if( AVG_DX2_RIGHT < 2.5 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_RIGHT >= 2.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AMP_DELTA < 6170 ) { return new Prediction("LEFT", 26, 0); }
	}
	if( MAX_DX2_LEFT >= 1661.5 ) { 
	if( AMP_DELTA < 5100.5 ) { 
		if( FIRST_RIGHT_DETECTION < 129 ) { return new Prediction("LEFT", 12, 0); }
	if( FIRST_RIGHT_DETECTION >= 129 ) { 
	if( MAX_AMP_LEFT < 4349 ) { 
	if( MAX_DX2_LEFT < 2243.5 ) { 
		if( MAX_DX2_LEFT >= 1699 ) { return new Prediction("LEFT", 9, 0); }
		if( MAX_DX2_LEFT < 1699 ) { return new Prediction("TOP", 1, 0); }
	}
	if( MAX_DX2_LEFT >= 2243.5 ) { 
		if( FIRST_LEFT_DETECTION < 207 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 207 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4349 ) { 
		if( AVG_AMP_LEFT < 20.5 ) { return new Prediction("TOP", 16, 0); }
		if( AVG_AMP_LEFT >= 20.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA >= 5100.5 ) { 
	if( MAX_AMP_LEFT >= 2559 ) { 
		if( MAX_AMP_RIGHT < -8304 ) { return new Prediction("LEFT", 28, 0); }
		if( MAX_AMP_RIGHT >= -8304 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT < 2559 ) { return new Prediction("RIGHT", 10, 0); }
	}
	}
	}
	if( MAX_DX2_LEFT >= 3004.5 ) { 
	if( AVG_DX2_RIGHT < 1.25 ) { 
	if( MAX_AMP_LEFT < 6337.5 ) { 
		if( MAX_AMP_LEFT < -1826.5 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT >= -1826.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 6337.5 ) { return new Prediction("TOP", 104, 0); }
	}
	if( AVG_DX2_RIGHT >= 1.25 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
	if( MAX_DX2_RIGHT < 12170 ) { 
		if( AVG_DX2_RIGHT < 2.74 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_DX2_RIGHT >= 2.74 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_DX2_RIGHT >= 12170 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 61, 0); }
	}
	}
	}
		if( DETECTION_DELTA >= 20.5 ) { return new Prediction("LEFT", 109, 0); }
	}
	if( AMP_DELTA >= 7065.5 ) { 
	if( AVG_AMP_RIGHT < 7.5 ) { 
	if( MAX_DX2_RIGHT < 6195.5 ) { 
	if( DX2_DELTA < 4894.5 ) { 
	if( AVG_AMP_LEFT >= 6 ) { 
		if( MAX_AMP_LEFT < 4348 ) { return new Prediction("BOTTOM", 5, 0); }
		if( MAX_AMP_LEFT >= 4348 ) { return new Prediction("LEFT", 3, 0); }
	}
	if( AVG_AMP_LEFT < 6 ) { 
		if( FIRST_LEFT_DETECTION < 265 ) { return new Prediction("RIGHT", 22, 0); }
	if( FIRST_LEFT_DETECTION >= 265 ) { 
	if( AVG_DX2_RIGHT >= 0.63 ) { 
		if( FIRST_LEFT_DETECTION < 274.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 274.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_RIGHT < 0.63 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
		if( DX2_DELTA >= 4894.5 ) { return new Prediction("TOP", 8, 0); }
	}
	if( MAX_DX2_RIGHT >= 6195.5 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
	if( AVG_AMP_RIGHT < -1.5 ) { 
		if( DX2_DELTA >= 11311.5 ) { return new Prediction("TOP", 5, 0); }
	if( DX2_DELTA < 11311.5 ) { 
		if( AVG_DX2_LEFT < -4.24 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -4.24 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
		if( AVG_AMP_RIGHT >= -1.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( DETECTION_DELTA >= 5.5 ) { return new Prediction("BOTTOM", 195, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 7.5 ) { 
	if( DX2_DELTA >= 5604.5 ) { 
	if( FIRST_LEFT_DETECTION < 216 ) { 
	if( DETECTION_DELTA < 5.5 ) { 
		if( MAX_AMP_RIGHT >= 24709.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_RIGHT < 24709.5 ) { return new Prediction("RIGHT", 10, 0); }
	}
	if( DETECTION_DELTA >= 5.5 ) { 
		if( MAX_DX2_LEFT < 9761 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_LEFT >= 9761 ) { return new Prediction("TOP", 1, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 216 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	if( DX2_DELTA < 5604.5 ) { 
	if( MAX_AMP_LEFT >= 6187.5 ) { 
		if( AVG_DX2_RIGHT >= -5.34 ) { return new Prediction("RIGHT", 12, 0); }
		if( AVG_DX2_RIGHT < -5.34 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_AMP_LEFT < 6187.5 ) { return new Prediction("RIGHT", 135, 0); }
	}
	}
	}
return null;
}
private Prediction runTree91() {
	if( DETECTION_DELTA < 8.5 ) { 
	if( MAX_AMP_LEFT >= 6566.5 ) { 
	if( AMP_DELTA >= 9459.5 ) { 
		if( AVG_AMP_LEFT < -10 ) { return new Prediction("RIGHT", 12, 0); }
	if( AVG_AMP_LEFT >= -10 ) { 
		if( DX2_DELTA >= 13861 ) { return new Prediction("TOP", 1, 0); }
	if( DX2_DELTA < 13861 ) { 
		if( AVG_DX2_LEFT < -1.49 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -1.49 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	}
	if( AMP_DELTA < 9459.5 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( MAX_DX2_RIGHT < 5478 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_DX2_RIGHT >= 5478 ) { 
		if( FIRST_LEFT_DETECTION < 164.5 ) { return new Prediction("LEFT", 4, 0); }
		if( FIRST_LEFT_DETECTION >= 164.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 141, 0); }
	}
	}
	if( MAX_AMP_LEFT < 6566.5 ) { 
	if( AVG_AMP_LEFT >= 6.5 ) { 
	if( AMP_DELTA < 10588 ) { 
	if( DX2_DELTA < 6330 ) { 
		if( MAX_DX2_LEFT >= 3386.5 ) { return new Prediction("BOTTOM", 1, 0); }
	if( MAX_DX2_LEFT < 3386.5 ) { 
	if( FIRST_LEFT_DETECTION < 238.5 ) { 
	if( MAX_DX2_RIGHT < 2952.5 ) { 
		if( MAX_DX2_RIGHT >= 2832.5 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT < 2832.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_DX2_RIGHT >= 2952.5 ) { return new Prediction("LEFT", 37, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 238.5 ) { 
		if( AVG_DX2_RIGHT < 4.44 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT >= 4.44 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
		if( DX2_DELTA >= 6330 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AMP_DELTA >= 10588 ) { 
		if( FIRST_LEFT_DETECTION < 142 ) { return new Prediction("TOP", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 142 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	}
	if( AVG_AMP_LEFT < 6.5 ) { 
	if( AMP_DELTA >= 4948 ) { 
	if( AMP_DELTA >= 13471.5 ) { 
		if( MAX_AMP_RIGHT < -18275 ) { return new Prediction("RIGHT", 24, 0); }
	if( MAX_AMP_RIGHT >= -18275 ) { 
		if( FIRST_LEFT_DETECTION >= 160 ) { return new Prediction("BOTTOM", 2, 0); }
	if( FIRST_LEFT_DETECTION < 160 ) { 
		if( FIRST_RIGHT_DETECTION >= 158.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 158.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AMP_DELTA < 13471.5 ) { 
	if( DX2_DELTA >= 3366 ) { 
		if( AVG_AMP_LEFT >= 4.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_LEFT < 4.5 ) { return new Prediction("RIGHT", 20, 0); }
	}
		if( DX2_DELTA < 3366 ) { return new Prediction("RIGHT", 111, 0); }
	}
	}
	if( AMP_DELTA < 4948 ) { 
	if( MAX_DX2_LEFT < 3017.5 ) { 
	if( MAX_DX2_RIGHT >= 3485 ) { 
		if( AVG_AMP_LEFT >= -3 ) { return new Prediction("RIGHT", 4, 0); }
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_RIGHT < 3485 ) { return new Prediction("LEFT", 11, 0); }
	}
	if( MAX_DX2_LEFT >= 3017.5 ) { 
		if( FIRST_RIGHT_DETECTION < 117.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 117.5 ) { return new Prediction("TOP", 11, 0); }
	}
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( MAX_DX2_RIGHT >= 5664.5 ) { 
	if( AMP_DELTA >= 6749 ) { 
		if( AVG_AMP_RIGHT >= 29.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_AMP_RIGHT < 29.5 ) { return new Prediction("BOTTOM", 177, 0); }
	}
	if( AMP_DELTA < 6749 ) { 
		if( FIRST_LEFT_DETECTION < 55.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 55.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 5664.5 ) { 
	if( MAX_AMP_LEFT < 5172.5 ) { 
	if( DETECTION_DELTA >= 17.5 ) { 
	if( AMP_DELTA >= 6872.5 ) { 
		if( AVG_DX2_RIGHT < 0.65 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 6, 0); }
	}
		if( AMP_DELTA < 6872.5 ) { return new Prediction("LEFT", 102, 0); }
	}
	if( DETECTION_DELTA < 17.5 ) { 
	if( AMP_DELTA < 6834.5 ) { 
	if( DETECTION_DELTA < 16.5 ) { 
	if( MAX_DX2_RIGHT >= 2108.5 ) { 
	if( MAX_AMP_LEFT < 509.5 ) { 
		if( MAX_AMP_LEFT < -1448 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_LEFT >= -1448 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_LEFT >= 509.5 ) { return new Prediction("LEFT", 30, 0); }
	}
		if( MAX_DX2_RIGHT < 2108.5 ) { return new Prediction("TOP", 4, 0); }
	}
		if( DETECTION_DELTA >= 16.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AMP_DELTA >= 6834.5 ) { 
	if( FIRST_RIGHT_DETECTION >= 253.5 ) { 
		if( AVG_DX2_RIGHT >= 1.32 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 1.32 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( FIRST_RIGHT_DETECTION < 253.5 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 5172.5 ) { return new Prediction("TOP", 27, 0); }
	}
	}
return null;
}
private Prediction runTree92() {
	if( MAX_AMP_LEFT < 6044.5 ) { 
	if( AMP_DELTA >= 7955.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT < 5.5 ) { 
	if( MAX_DX2_LEFT < 19548.5 ) { 
	if( FIRST_LEFT_DETECTION >= 49.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 124, 0); }
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( AVG_DX2_RIGHT >= 1.7 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 1.7 ) { return new Prediction("RIGHT", 6, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION < 49.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 19548.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_LEFT >= 5.5 ) { 
		if( FIRST_LEFT_DETECTION >= 158.5 ) { return new Prediction("BOTTOM", 11, 0); }
		if( FIRST_LEFT_DETECTION < 158.5 ) { return new Prediction("TOP", 4, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_AMP_LEFT < -5.5 ) { 
		if( MAX_DX2_LEFT >= 3440.5 ) { return new Prediction("BOTTOM", 23, 0); }
	if( MAX_DX2_LEFT < 3440.5 ) { 
		if( AMP_DELTA >= 11522 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AMP_DELTA < 11522 ) { return new Prediction("RIGHT", 18, 0); }
	}
	}
	if( AVG_AMP_LEFT >= -5.5 ) { 
		if( MAX_DX2_RIGHT < 4424.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT >= 4424.5 ) { return new Prediction("BOTTOM", 141, 0); }
	}
	}
	}
	if( AMP_DELTA < 7955.5 ) { 
	if( AVG_AMP_RIGHT < 15.5 ) { 
	if( MAX_AMP_LEFT >= -7651 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_DX2_LEFT < 3028.5 ) { 
	if( DX2_DELTA >= 1324.5 ) { 
	if( AVG_AMP_LEFT < 8.5 ) { 
		if( AVG_AMP_RIGHT >= -25.5 ) { return new Prediction("LEFT", 15, 0); }
		if( AVG_AMP_RIGHT < -25.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_AMP_LEFT >= 8.5 ) { return new Prediction("LEFT", 77, 0); }
	}
	if( DX2_DELTA < 1324.5 ) { 
		if( MAX_AMP_LEFT >= 4097 ) { return new Prediction("TOP", 4, 0); }
		if( MAX_AMP_LEFT < 4097 ) { return new Prediction("LEFT", 46, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 3028.5 ) { return new Prediction("TOP", 2, 0); }
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
	if( MAX_AMP_RIGHT < -7573 ) { 
	if( MAX_AMP_LEFT >= 4449 ) { 
		if( FIRST_LEFT_DETECTION >= 147.5 ) { return new Prediction("TOP", 4, 0); }
		if( FIRST_LEFT_DETECTION < 147.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( MAX_AMP_LEFT < 4449 ) { 
	if( MAX_DX2_RIGHT < 5090.5 ) { 
		if( AVG_AMP_RIGHT < -21.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_AMP_RIGHT >= -21.5 ) { return new Prediction("RIGHT", 9, 0); }
	}
		if( MAX_DX2_RIGHT >= 5090.5 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -7573 ) { 
	if( MAX_DX2_LEFT >= 2297 ) { 
		if( AVG_DX2_RIGHT < -1.67 ) { return new Prediction("RIGHT", 1, 0); }
	if( AVG_DX2_RIGHT >= -1.67 ) { 
		if( FIRST_RIGHT_DETECTION < 102 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 102 ) { return new Prediction("TOP", 2, 0); }
	}
	}
		if( MAX_DX2_LEFT < 2297 ) { return new Prediction("LEFT", 55, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT < -7651 ) { return new Prediction("TOP", 15, 0); }
	}
	if( AVG_AMP_RIGHT >= 15.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
		if( DETECTION_DELTA < 8.5 ) { return new Prediction("RIGHT", 22, 0); }
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_DX2_RIGHT >= -4.92 ) { 
		if( MAX_DX2_LEFT < 697 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT >= 697 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AVG_DX2_RIGHT < -4.92 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 6044.5 ) { 
	if( MAX_AMP_RIGHT < -22727 ) { 
	if( DX2_DELTA >= 7113 ) { 
		if( FIRST_RIGHT_DETECTION < 121 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 121 ) { return new Prediction("BOTTOM", 13, 0); }
	}
	if( DX2_DELTA < 7113 ) { 
		if( AVG_AMP_LEFT >= 10.5 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_AMP_LEFT < 10.5 ) { return new Prediction("RIGHT", 13, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -22727 ) { 
	if( MAX_DX2_RIGHT < 12504 ) { 
	if( MAX_AMP_LEFT < 6920.5 ) { 
	if( MAX_DX2_RIGHT >= 4706 ) { 
	if( MAX_AMP_RIGHT >= -17259 ) { 
		if( MAX_DX2_LEFT >= 3520.5 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT < 3520.5 ) { return new Prediction("LEFT", 3, 0); }
	}
		if( MAX_AMP_RIGHT < -17259 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_DX2_RIGHT < 4706 ) { return new Prediction("TOP", 14, 0); }
	}
		if( MAX_AMP_LEFT >= 6920.5 ) { return new Prediction("TOP", 159, 0); }
	}
	if( MAX_DX2_RIGHT >= 12504 ) { 
		if( DX2_DELTA >= 8285 ) { return new Prediction("BOTTOM", 4, 0); }
	if( DX2_DELTA < 8285 ) { 
		if( FIRST_LEFT_DETECTION < 143 ) { return new Prediction("RIGHT", 2, 0); }
	if( FIRST_LEFT_DETECTION >= 143 ) { 
		if( FIRST_LEFT_DETECTION >= 158.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( FIRST_LEFT_DETECTION < 158.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree93() {
	if( AMP_DELTA >= 6814 ) { 
	if( MAX_AMP_RIGHT < 13991.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( DX2_DELTA >= 5604.5 ) { 
	if( MAX_DX2_LEFT < 12031.5 ) { 
		if( AVG_AMP_LEFT >= -3 ) { return new Prediction("BOTTOM", 27, 0); }
		if( AVG_AMP_LEFT < -3 ) { return new Prediction("RIGHT", 7, 0); }
	}
		if( MAX_DX2_LEFT >= 12031.5 ) { return new Prediction("TOP", 9, 0); }
	}
	if( DX2_DELTA < 5604.5 ) { 
	if( AVG_AMP_RIGHT < -32 ) { 
		if( FIRST_RIGHT_DETECTION >= 181.5 ) { return new Prediction("TOP", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 181.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -32 ) { 
	if( AMP_DELTA >= 8052.5 ) { 
		if( FIRST_LEFT_DETECTION < 52.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 52.5 ) { return new Prediction("RIGHT", 124, 0); }
	}
	if( AMP_DELTA < 8052.5 ) { 
		if( AVG_AMP_LEFT < 8 ) { return new Prediction("RIGHT", 25, 0); }
		if( AVG_AMP_LEFT >= 8 ) { return new Prediction("LEFT", 8, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
		if( MAX_DX2_RIGHT >= 5528.5 ) { return new Prediction("BOTTOM", 108, 0); }
	if( MAX_DX2_RIGHT < 5528.5 ) { 
	if( AVG_AMP_RIGHT >= -6 ) { 
		if( FIRST_LEFT_DETECTION < 77.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 77.5 ) { return new Prediction("RIGHT", 18, 0); }
	}
	if( AVG_AMP_RIGHT < -6 ) { 
	if( FIRST_LEFT_DETECTION >= 267 ) { 
		if( AVG_DX2_LEFT < 0.04 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= 0.04 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 267 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( MAX_AMP_RIGHT >= 13991.5 ) { 
		if( AVG_AMP_RIGHT < 9.5 ) { return new Prediction("BOTTOM", 59, 0); }
	if( AVG_AMP_RIGHT >= 9.5 ) { 
	if( AVG_AMP_RIGHT < 48.5 ) { 
		if( MAX_DX2_RIGHT >= 10133.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( MAX_DX2_RIGHT < 10133.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( AVG_AMP_RIGHT >= 48.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
	if( AMP_DELTA < 6814 ) { 
	if( MAX_DX2_RIGHT < 4782.5 ) { 
	if( MAX_DX2_LEFT < 3037 ) { 
	if( DX2_DELTA < 763 ) { 
	if( MAX_AMP_LEFT < 3676 ) { 
	if( MAX_AMP_RIGHT < -6773.5 ) { 
		if( MAX_DX2_RIGHT >= 2341.5 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_RIGHT < 2341.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_AMP_RIGHT >= -6773.5 ) { return new Prediction("LEFT", 53, 0); }
	}
		if( MAX_AMP_LEFT >= 3676 ) { return new Prediction("TOP", 15, 0); }
	}
	if( DX2_DELTA >= 763 ) { 
	if( MAX_AMP_RIGHT < -7417 ) { 
	if( AVG_AMP_LEFT >= 6 ) { 
		if( MAX_AMP_LEFT < 4800.5 ) { return new Prediction("LEFT", 20, 0); }
		if( MAX_AMP_LEFT >= 4800.5 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_LEFT < 6 ) { 
		if( AVG_AMP_RIGHT < 1.5 ) { return new Prediction("LEFT", 5, 0); }
	if( AVG_AMP_RIGHT >= 1.5 ) { 
	if( MAX_DX2_LEFT >= 1823 ) { 
		if( AVG_DX2_LEFT < -1.2 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -1.2 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_DX2_LEFT < 1823 ) { return new Prediction("RIGHT", 4, 0); }
	}
	}
	}
		if( MAX_AMP_RIGHT >= -7417 ) { return new Prediction("LEFT", 103, 0); }
	}
	}
	if( MAX_DX2_LEFT >= 3037 ) { 
		if( FIRST_LEFT_DETECTION >= 98.5 ) { return new Prediction("TOP", 30, 0); }
	if( FIRST_LEFT_DETECTION < 98.5 ) { 
		if( FIRST_RIGHT_DETECTION < 81.5 ) { return new Prediction("TOP", 4, 0); }
		if( FIRST_RIGHT_DETECTION >= 81.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( MAX_DX2_RIGHT >= 4782.5 ) { 
	if( AMP_DELTA < 3680 ) { 
		if( MAX_AMP_RIGHT < -8212 ) { return new Prediction("TOP", 121, 0); }
	if( MAX_AMP_RIGHT >= -8212 ) { 
		if( MAX_DX2_RIGHT < 6785 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_DX2_RIGHT >= 6785 ) { return new Prediction("TOP", 1, 0); }
	}
	}
	if( AMP_DELTA >= 3680 ) { 
		if( DX2_DELTA >= 7043.5 ) { return new Prediction("TOP", 14, 0); }
	if( DX2_DELTA < 7043.5 ) { 
	if( MAX_AMP_LEFT >= 7131 ) { 
		if( AVG_AMP_LEFT < 28 ) { return new Prediction("TOP", 19, 0); }
		if( AVG_AMP_LEFT >= 28 ) { return new Prediction("LEFT", 1, 0); }
	}
	if( MAX_AMP_LEFT < 7131 ) { 
	if( MAX_AMP_RIGHT < 1302 ) { 
		if( MAX_AMP_LEFT < 5209 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_AMP_LEFT >= 5209 ) { 
		if( FIRST_RIGHT_DETECTION < 133.5 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 133.5 ) { return new Prediction("BOTTOM", 5, 0); }
	}
	}
		if( MAX_AMP_RIGHT >= 1302 ) { return new Prediction("RIGHT", 3, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree94() {
	if( AMP_DELTA < 7280 ) { 
	if( MAX_AMP_RIGHT >= -10315 ) { 
	if( MAX_AMP_LEFT < 4599 ) { 
	if( DETECTION_DELTA < 7.5 ) { 
	if( AVG_AMP_RIGHT < -11.5 ) { 
		if( AVG_DX2_LEFT >= -1.29 ) { return new Prediction("LEFT", 11, 0); }
		if( AVG_DX2_LEFT < -1.29 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_RIGHT >= -11.5 ) { 
		if( AMP_DELTA >= 6089.5 ) { return new Prediction("RIGHT", 12, 0); }
	if( AMP_DELTA < 6089.5 ) { 
	if( AVG_DX2_RIGHT < -3.36 ) { 
		if( AVG_AMP_RIGHT >= 36.5 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_AMP_RIGHT < 36.5 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( AVG_DX2_RIGHT >= -3.36 ) { return new Prediction("LEFT", 13, 0); }
	}
	}
	}
	if( DETECTION_DELTA >= 7.5 ) { 
	if( FIRST_RIGHT_DETECTION < 250.5 ) { 
	if( AVG_DX2_RIGHT < -2.58 ) { 
		if( FIRST_LEFT_DETECTION < 143 ) { return new Prediction("LEFT", 3, 0); }
		if( FIRST_LEFT_DETECTION >= 143 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( AVG_DX2_RIGHT >= -2.58 ) { 
	if( AMP_DELTA >= 6203.5 ) { 
		if( AVG_DX2_LEFT < 0.03 ) { return new Prediction("LEFT", 4, 0); }
	if( AVG_DX2_LEFT >= 0.03 ) { 
		if( FIRST_RIGHT_DETECTION < 208.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 208.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
		if( AMP_DELTA < 6203.5 ) { return new Prediction("LEFT", 121, 0); }
	}
	}
	if( FIRST_RIGHT_DETECTION >= 250.5 ) { 
	if( MAX_DX2_LEFT >= 2002 ) { 
		if( MAX_DX2_RIGHT < 3976.5 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_RIGHT >= 3976.5 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 2002 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT >= 4599 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( AVG_DX2_RIGHT >= 2.48 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_RIGHT < 2.48 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 39, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -10315 ) { 
	if( MAX_DX2_RIGHT >= 6041 ) { 
		if( AMP_DELTA < 5180 ) { return new Prediction("TOP", 88, 0); }
	if( AMP_DELTA >= 5180 ) { 
	if( AVG_DX2_LEFT < -1.87 ) { 
		if( AVG_DX2_LEFT < -2.08 ) { return new Prediction("BOTTOM", 3, 0); }
		if( AVG_DX2_LEFT >= -2.08 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( AVG_DX2_LEFT >= -1.87 ) { return new Prediction("TOP", 5, 0); }
	}
	}
	if( MAX_DX2_RIGHT < 6041 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("LEFT", 7, 0); }
	if( DETECTION_DELTA >= 1 ) { 
	if( FIRST_LEFT_DETECTION < 264 ) { 
	if( MAX_AMP_RIGHT < -11413 ) { 
	if( MAX_DX2_LEFT < 4221 ) { 
		if( AVG_DX2_RIGHT < -2.16 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= -2.16 ) { return new Prediction("TOP", 4, 0); }
	}
		if( MAX_DX2_LEFT >= 4221 ) { return new Prediction("TOP", 44, 0); }
	}
	if( MAX_AMP_RIGHT >= -11413 ) { 
		if( MAX_AMP_LEFT >= 5424.5 ) { return new Prediction("TOP", 15, 0); }
		if( MAX_AMP_LEFT < 5424.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
		if( FIRST_LEFT_DETECTION >= 264 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 7280 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_LEFT >= 3.5 ) { 
	if( MAX_DX2_LEFT < 12108 ) { 
	if( AMP_DELTA < 8999 ) { 
		if( MAX_AMP_RIGHT < -12651 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_AMP_RIGHT >= -12651 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AMP_DELTA >= 8999 ) { return new Prediction("BOTTOM", 33, 0); }
	}
		if( MAX_DX2_LEFT >= 12108 ) { return new Prediction("TOP", 7, 0); }
	}
	if( AVG_AMP_LEFT < 3.5 ) { 
		if( MAX_AMP_LEFT < -20814 ) { return new Prediction("TOP", 2, 0); }
	if( MAX_AMP_LEFT >= -20814 ) { 
		if( DX2_DELTA >= 8384 ) { return new Prediction("BOTTOM", 3, 0); }
	if( DX2_DELTA < 8384 ) { 
	if( AVG_DX2_RIGHT < -5.08 ) { 
		if( FIRST_RIGHT_DETECTION >= 56 ) { return new Prediction("RIGHT", 26, 0); }
		if( FIRST_RIGHT_DETECTION < 56 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( AVG_DX2_RIGHT >= -5.08 ) { return new Prediction("RIGHT", 165, 0); }
	}
	}
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_AMP_RIGHT < 5.5 ) { 
		if( MAX_DX2_LEFT >= 2181 ) { return new Prediction("BOTTOM", 132, 0); }
	if( MAX_DX2_LEFT < 2181 ) { 
	if( DETECTION_DELTA < 9.5 ) { 
		if( AVG_DX2_LEFT < 0.07 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT >= 0.07 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( DETECTION_DELTA >= 9.5 ) { return new Prediction("BOTTOM", 19, 0); }
	}
	}
	if( AVG_AMP_RIGHT >= 5.5 ) { 
	if( DX2_DELTA < 4136 ) { 
		if( AVG_AMP_LEFT < 3 ) { return new Prediction("RIGHT", 11, 0); }
		if( AVG_AMP_LEFT >= 3 ) { return new Prediction("BOTTOM", 1, 0); }
	}
		if( DX2_DELTA >= 4136 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
return null;
}
private Prediction runTree95() {
	if( AMP_DELTA < 6705.5 ) { 
	if( AVG_DX2_LEFT >= 1.26 ) { 
		if( FIRST_LEFT_DETECTION >= 110 ) { return new Prediction("TOP", 58, 0); }
	if( FIRST_LEFT_DETECTION < 110 ) { 
		if( AVG_DX2_LEFT >= 1.81 ) { return new Prediction("TOP", 6, 0); }
	if( AVG_DX2_LEFT < 1.81 ) { 
		if( MAX_DX2_RIGHT >= 6206 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT < 6206 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
	if( AVG_DX2_LEFT < 1.26 ) { 
	if( MAX_AMP_LEFT < 5322 ) { 
	if( MAX_DX2_LEFT >= 3261 ) { 
		if( MAX_AMP_RIGHT >= -10013.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_AMP_RIGHT < -10013.5 ) { return new Prediction("TOP", 9, 0); }
	}
	if( MAX_DX2_LEFT < 3261 ) { 
	if( AVG_DX2_RIGHT < -1.52 ) { 
		if( AVG_DX2_LEFT >= 0.05 ) { return new Prediction("TOP", 4, 0); }
	if( AVG_DX2_LEFT < 0.05 ) { 
	if( AMP_DELTA >= 4948 ) { 
		if( MAX_AMP_RIGHT < -8922 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_AMP_RIGHT >= -8922 ) { return new Prediction("RIGHT", 13, 0); }
	}
	if( AMP_DELTA < 4948 ) { 
		if( DETECTION_DELTA >= 2 ) { return new Prediction("LEFT", 19, 0); }
		if( DETECTION_DELTA < 2 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	}
	if( AVG_DX2_RIGHT >= -1.52 ) { 
	if( MAX_DX2_LEFT >= 2866 ) { 
		if( AVG_DX2_RIGHT >= 1.77 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_RIGHT < 1.77 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_LEFT < 2866 ) { 
		if( FIRST_RIGHT_DETECTION < 201.5 ) { return new Prediction("LEFT", 118, 0); }
	if( FIRST_RIGHT_DETECTION >= 201.5 ) { 
	if( MAX_AMP_LEFT < 3758.5 ) { 
		if( AMP_DELTA < 6112 ) { return new Prediction("LEFT", 32, 0); }
	if( AMP_DELTA >= 6112 ) { 
		if( AVG_DX2_RIGHT >= 5.19 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_RIGHT < 5.19 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3758.5 ) { 
		if( AMP_DELTA < 3519 ) { return new Prediction("TOP", 3, 0); }
		if( AMP_DELTA >= 3519 ) { return new Prediction("LEFT", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 5322 ) { 
	if( MAX_AMP_LEFT < 8952.5 ) { 
	if( MAX_DX2_RIGHT >= 6026.5 ) { 
		if( MAX_AMP_LEFT < 5681.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( MAX_AMP_LEFT >= 5681.5 ) { return new Prediction("LEFT", 4, 0); }
	}
		if( MAX_DX2_RIGHT < 6026.5 ) { return new Prediction("TOP", 26, 0); }
	}
		if( MAX_AMP_LEFT >= 8952.5 ) { return new Prediction("TOP", 87, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6705.5 ) { 
	if( AVG_AMP_LEFT < -0.5 ) { 
	if( MAX_DX2_RIGHT < 7312 ) { 
		if( MAX_DX2_LEFT < 6764 ) { return new Prediction("RIGHT", 100, 0); }
		if( MAX_DX2_LEFT >= 6764 ) { return new Prediction("TOP", 2, 0); }
	}
	if( MAX_DX2_RIGHT >= 7312 ) { 
	if( DETECTION_DELTA >= 6.5 ) { 
		if( AVG_AMP_RIGHT < 24.5 ) { return new Prediction("BOTTOM", 37, 0); }
		if( AVG_AMP_RIGHT >= 24.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	if( DETECTION_DELTA < 6.5 ) { 
	if( DETECTION_DELTA >= 4.5 ) { 
		if( FIRST_LEFT_DETECTION < 61.5 ) { return new Prediction("BOTTOM", 2, 0); }
		if( FIRST_LEFT_DETECTION >= 61.5 ) { return new Prediction("RIGHT", 6, 0); }
	}
		if( DETECTION_DELTA < 4.5 ) { return new Prediction("RIGHT", 75, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= -0.5 ) { 
	if( AVG_AMP_RIGHT >= 3.5 ) { 
	if( MAX_DX2_RIGHT >= 5577 ) { 
		if( AVG_DX2_LEFT < -1.91 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT >= -1.91 ) { return new Prediction("BOTTOM", 17, 0); }
	}
	if( MAX_DX2_RIGHT < 5577 ) { 
		if( AVG_DX2_RIGHT < 0.86 ) { return new Prediction("RIGHT", 21, 0); }
	if( AVG_DX2_RIGHT >= 0.86 ) { 
		if( MAX_DX2_LEFT >= 2424 ) { return new Prediction("LEFT", 1, 0); }
		if( MAX_DX2_LEFT < 2424 ) { return new Prediction("RIGHT", 2, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < 3.5 ) { 
	if( MAX_DX2_LEFT < 8683.5 ) { 
	if( MAX_DX2_RIGHT >= 5465 ) { 
		if( AVG_DX2_RIGHT >= 7.75 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 7.75 ) { return new Prediction("BOTTOM", 128, 0); }
	}
	if( MAX_DX2_RIGHT < 5465 ) { 
	if( MAX_DX2_LEFT >= 1962 ) { 
		if( MAX_AMP_LEFT >= 410 ) { return new Prediction("LEFT", 3, 0); }
		if( MAX_AMP_LEFT < 410 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT < 1962 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
		if( MAX_DX2_LEFT >= 8683.5 ) { return new Prediction("TOP", 16, 0); }
	}
	}
	}
return null;
}
private Prediction runTree96() {
	if( DX2_DELTA < 3520.5 ) { 
	if( MAX_AMP_RIGHT >= -10875.5 ) { 
	if( MAX_AMP_LEFT < 4599 ) { 
	if( AMP_DELTA < 6786 ) { 
	if( AMP_DELTA >= 3703 ) { 
		if( AVG_AMP_RIGHT < 16 ) { return new Prediction("LEFT", 49, 0); }
	if( AVG_AMP_RIGHT >= 16 ) { 
	if( MAX_AMP_RIGHT >= -8468 ) { 
		if( MAX_DX2_LEFT >= 1378 ) { return new Prediction("RIGHT", 10, 0); }
		if( MAX_DX2_LEFT < 1378 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_RIGHT < -8468 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( AMP_DELTA < 3703 ) { 
		if( AVG_AMP_RIGHT < 8 ) { return new Prediction("LEFT", 143, 0); }
	if( AVG_AMP_RIGHT >= 8 ) { 
		if( MAX_AMP_LEFT < 3831.5 ) { return new Prediction("LEFT", 13, 0); }
		if( MAX_AMP_LEFT >= 3831.5 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	if( AMP_DELTA >= 6786 ) { 
	if( AVG_AMP_RIGHT >= -37 ) { 
		if( AVG_AMP_RIGHT >= 14.5 ) { return new Prediction("RIGHT", 19, 0); }
	if( AVG_AMP_RIGHT < 14.5 ) { 
		if( FIRST_LEFT_DETECTION < 415 ) { return new Prediction("RIGHT", 7, 0); }
		if( FIRST_LEFT_DETECTION >= 415 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
		if( AVG_AMP_RIGHT < -37 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 4599 ) { 
		if( MAX_DX2_RIGHT < 4194 ) { return new Prediction("TOP", 28, 0); }
	if( MAX_DX2_RIGHT >= 4194 ) { 
		if( AMP_DELTA >= 3386.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( AMP_DELTA < 3386.5 ) { return new Prediction("TOP", 8, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -10875.5 ) { 
	if( AVG_AMP_RIGHT >= -7.5 ) { 
	if( AMP_DELTA < 7301 ) { 
	if( AVG_DX2_RIGHT >= 0.89 ) { 
		if( MAX_AMP_LEFT < 7327 ) { return new Prediction("LEFT", 7, 0); }
		if( MAX_AMP_LEFT >= 7327 ) { return new Prediction("TOP", 5, 0); }
	}
		if( AVG_DX2_RIGHT < 0.89 ) { return new Prediction("TOP", 22, 0); }
	}
	if( AMP_DELTA >= 7301 ) { 
	if( AMP_DELTA < 8098.5 ) { 
	if( MAX_AMP_LEFT >= 4625 ) { 
		if( DX2_DELTA >= 2752.5 ) { return new Prediction("LEFT", 4, 0); }
		if( DX2_DELTA < 2752.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( MAX_AMP_LEFT < 4625 ) { return new Prediction("RIGHT", 6, 0); }
	}
	if( AMP_DELTA >= 8098.5 ) { 
		if( FIRST_LEFT_DETECTION >= 79.5 ) { return new Prediction("RIGHT", 96, 0); }
		if( FIRST_LEFT_DETECTION < 79.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( AVG_AMP_RIGHT < -7.5 ) { 
	if( AMP_DELTA < 8771.5 ) { 
		if( DX2_DELTA < 2888 ) { return new Prediction("TOP", 40, 0); }
	if( DX2_DELTA >= 2888 ) { 
		if( AVG_DX2_LEFT < 1.32 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_LEFT >= 1.32 ) { return new Prediction("TOP", 7, 0); }
	}
	}
	if( AMP_DELTA >= 8771.5 ) { 
	if( AVG_AMP_LEFT >= -2 ) { 
		if( AVG_DX2_LEFT < -3.52 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT >= -3.52 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AVG_AMP_LEFT < -2 ) { 
		if( DX2_DELTA < 3312 ) { return new Prediction("RIGHT", 8, 0); }
		if( DX2_DELTA >= 3312 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	if( DX2_DELTA >= 3520.5 ) { 
	if( MAX_DX2_LEFT >= 7770 ) { 
		if( MAX_DX2_RIGHT >= 14033 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_RIGHT < 14033 ) { return new Prediction("TOP", 87, 0); }
	}
	if( MAX_DX2_LEFT < 7770 ) { 
	if( AVG_AMP_RIGHT < 11.5 ) { 
	if( AVG_AMP_LEFT < -15 ) { 
		if( AVG_DX2_LEFT >= -1.45 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_DX2_LEFT < -1.45 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_AMP_LEFT >= -15 ) { 
	if( AVG_AMP_LEFT >= 33 ) { 
		if( MAX_DX2_LEFT < 4706 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 4706 ) { return new Prediction("TOP", 1, 0); }
	}
	if( AVG_AMP_LEFT < 33 ) { 
	if( MAX_AMP_LEFT < -5467.5 ) { 
		if( MAX_AMP_LEFT >= -6223.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_LEFT < -6223.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( MAX_AMP_LEFT >= -5467.5 ) { 
	if( AVG_DX2_RIGHT >= 5.92 ) { 
		if( FIRST_LEFT_DETECTION < 260 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 260 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	if( AVG_DX2_RIGHT < 5.92 ) { 
		if( FIRST_LEFT_DETECTION >= 26.5 ) { return new Prediction("BOTTOM", 173, 0); }
		if( FIRST_LEFT_DETECTION < 26.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 11.5 ) { 
		if( MAX_DX2_RIGHT >= 12521.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_RIGHT < 12521.5 ) { 
	if( DETECTION_DELTA >= 6 ) { 
		if( MAX_DX2_RIGHT < 7722 ) { return new Prediction("RIGHT", 3, 0); }
		if( MAX_DX2_RIGHT >= 7722 ) { return new Prediction("BOTTOM", 3, 0); }
	}
		if( DETECTION_DELTA < 6 ) { return new Prediction("RIGHT", 38, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree97() {
	if( AMP_DELTA >= 6483 ) { 
	if( AVG_AMP_RIGHT >= -3.5 ) { 
	if( AVG_AMP_LEFT < 8 ) { 
	if( DETECTION_DELTA >= 12 ) { 
		if( AVG_DX2_RIGHT < -0.34 ) { return new Prediction("BOTTOM", 1, 0); }
	if( AVG_DX2_RIGHT >= -0.34 ) { 
		if( AVG_DX2_RIGHT < 0.65 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.65 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	if( DETECTION_DELTA < 12 ) { 
		if( AVG_DX2_RIGHT >= -4.92 ) { return new Prediction("RIGHT", 169, 0); }
	if( AVG_DX2_RIGHT < -4.92 ) { 
		if( FIRST_LEFT_DETECTION < 58.5 ) { return new Prediction("BOTTOM", 1, 0); }
		if( FIRST_LEFT_DETECTION >= 58.5 ) { return new Prediction("RIGHT", 17, 0); }
	}
	}
	}
	if( AVG_AMP_LEFT >= 8 ) { 
	if( AMP_DELTA < 8301.5 ) { 
		if( FIRST_RIGHT_DETECTION < 176.5 ) { return new Prediction("TOP", 1, 0); }
		if( FIRST_RIGHT_DETECTION >= 176.5 ) { return new Prediction("LEFT", 6, 0); }
	}
	if( AMP_DELTA >= 8301.5 ) { 
		if( MAX_DX2_RIGHT >= 5306 ) { return new Prediction("BOTTOM", 19, 0); }
	if( MAX_DX2_RIGHT < 5306 ) { 
		if( AVG_DX2_LEFT < -0.64 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= -0.64 ) { return new Prediction("TOP", 2, 0); }
	}
	}
	}
	}
	if( AVG_AMP_RIGHT < -3.5 ) { 
	if( DX2_DELTA < 3779.5 ) { 
	if( MAX_DX2_RIGHT >= 5313 ) { 
	if( MAX_DX2_LEFT < 7098.5 ) { 
		if( MAX_DX2_LEFT < 2686.5 ) { return new Prediction("LEFT", 4, 0); }
		if( MAX_DX2_LEFT >= 2686.5 ) { return new Prediction("BOTTOM", 9, 0); }
	}
		if( MAX_DX2_LEFT >= 7098.5 ) { return new Prediction("TOP", 6, 0); }
	}
	if( MAX_DX2_RIGHT < 5313 ) { 
		if( AVG_AMP_LEFT < 0.5 ) { return new Prediction("RIGHT", 14, 0); }
	if( AVG_AMP_LEFT >= 0.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 253.5 ) { return new Prediction("LEFT", 1, 0); }
		if( FIRST_RIGHT_DETECTION < 253.5 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	if( DX2_DELTA >= 3779.5 ) { 
	if( FIRST_LEFT_DETECTION < 132.5 ) { 
		if( DETECTION_DELTA >= 6.5 ) { return new Prediction("BOTTOM", 8, 0); }
		if( DETECTION_DELTA < 6.5 ) { return new Prediction("TOP", 11, 0); }
	}
	if( FIRST_LEFT_DETECTION >= 132.5 ) { 
	if( MAX_DX2_LEFT >= 7817.5 ) { 
		if( AVG_DX2_LEFT < -0.94 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_LEFT >= -0.94 ) { return new Prediction("TOP", 3, 0); }
	}
		if( MAX_DX2_LEFT < 7817.5 ) { return new Prediction("BOTTOM", 162, 0); }
	}
	}
	}
	}
	if( AMP_DELTA < 6483 ) { 
	if( MAX_AMP_RIGHT >= -10132 ) { 
	if( MAX_AMP_LEFT < 3948.5 ) { 
	if( MAX_AMP_RIGHT < -6712 ) { 
	if( MAX_AMP_LEFT < 2416.5 ) { 
	if( MAX_DX2_LEFT >= 1703 ) { 
		if( AVG_DX2_LEFT >= 1.37 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_LEFT < 1.37 ) { return new Prediction("LEFT", 5, 0); }
	}
	if( MAX_DX2_LEFT < 1703 ) { 
		if( AVG_DX2_RIGHT < 1.37 ) { return new Prediction("RIGHT", 5, 0); }
		if( AVG_DX2_RIGHT >= 1.37 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 2416.5 ) { return new Prediction("LEFT", 18, 0); }
	}
	if( MAX_AMP_RIGHT >= -6712 ) { 
		if( MAX_AMP_RIGHT >= 6907.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_AMP_RIGHT < 6907.5 ) { return new Prediction("LEFT", 119, 0); }
	}
	}
	if( MAX_AMP_LEFT >= 3948.5 ) { 
	if( MAX_DX2_LEFT >= 2641 ) { 
	if( AMP_DELTA >= 3733 ) { 
		if( AVG_AMP_LEFT >= 23.5 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_AMP_LEFT < 23.5 ) { return new Prediction("RIGHT", 2, 0); }
	}
		if( AMP_DELTA < 3733 ) { return new Prediction("TOP", 31, 0); }
	}
	if( MAX_DX2_LEFT < 2641 ) { 
		if( MAX_DX2_RIGHT >= 3925 ) { return new Prediction("LEFT", 11, 0); }
		if( MAX_DX2_RIGHT < 3925 ) { return new Prediction("TOP", 13, 0); }
	}
	}
	}
	if( MAX_AMP_RIGHT < -10132 ) { 
		if( MAX_DX2_LEFT < 2386 ) { return new Prediction("LEFT", 7, 0); }
	if( MAX_DX2_LEFT >= 2386 ) { 
	if( DETECTION_DELTA < 1 ) { 
		if( AVG_DX2_LEFT >= -4.85 ) { return new Prediction("LEFT", 2, 0); }
		if( AVG_DX2_LEFT < -4.85 ) { return new Prediction("TOP", 1, 0); }
	}
	if( DETECTION_DELTA >= 1 ) { 
	if( AMP_DELTA >= 4904 ) { 
		if( MAX_AMP_RIGHT < -12689.5 ) { return new Prediction("TOP", 16, 0); }
		if( MAX_AMP_RIGHT >= -12689.5 ) { return new Prediction("BOTTOM", 2, 0); }
	}
		if( AMP_DELTA < 4904 ) { return new Prediction("TOP", 146, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree98() {
	if( MAX_AMP_LEFT < 6966.5 ) { 
	if( AMP_DELTA < 7291.5 ) { 
	if( MAX_AMP_LEFT >= 5007 ) { 
	if( MAX_AMP_RIGHT < -10331 ) { 
		if( MAX_DX2_LEFT >= 3080 ) { return new Prediction("BOTTOM", 3, 0); }
		if( MAX_DX2_LEFT < 3080 ) { return new Prediction("LEFT", 2, 0); }
	}
		if( MAX_AMP_RIGHT >= -10331 ) { return new Prediction("TOP", 21, 0); }
	}
	if( MAX_AMP_LEFT < 5007 ) { 
	if( DX2_DELTA >= 3945 ) { 
	if( MAX_DX2_LEFT < 6787 ) { 
		if( AVG_DX2_RIGHT < 0.54 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT >= 0.54 ) { return new Prediction("RIGHT", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 6787 ) { return new Prediction("TOP", 14, 0); }
	}
	if( DX2_DELTA < 3945 ) { 
	if( AMP_DELTA < 5452 ) { 
	if( MAX_AMP_LEFT >= 3544 ) { 
		if( DX2_DELTA >= 1125 ) { return new Prediction("LEFT", 18, 0); }
	if( DX2_DELTA < 1125 ) { 
		if( AVG_DX2_LEFT < -0.93 ) { return new Prediction("RIGHT", 2, 0); }
		if( AVG_DX2_LEFT >= -0.93 ) { return new Prediction("TOP", 6, 0); }
	}
	}
		if( MAX_AMP_LEFT < 3544 ) { return new Prediction("LEFT", 148, 0); }
	}
	if( AMP_DELTA >= 5452 ) { 
	if( MAX_AMP_LEFT < 2812 ) { 
		if( DX2_DELTA < 1883 ) { return new Prediction("RIGHT", 12, 0); }
	if( DX2_DELTA >= 1883 ) { 
	if( MAX_DX2_LEFT < 1826 ) { 
		if( DX2_DELTA >= 2860 ) { return new Prediction("LEFT", 1, 0); }
		if( DX2_DELTA < 2860 ) { return new Prediction("RIGHT", 4, 0); }
	}
		if( MAX_DX2_LEFT >= 1826 ) { return new Prediction("LEFT", 3, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 2812 ) { return new Prediction("LEFT", 27, 0); }
	}
	}
	}
	}
	if( AMP_DELTA >= 7291.5 ) { 
	if( DETECTION_DELTA < 8.5 ) { 
	if( AVG_AMP_RIGHT >= -3.5 ) { 
	if( MAX_AMP_LEFT >= 4405.5 ) { 
	if( MAX_DX2_RIGHT >= 9039.5 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 7, 0); }
		if( AVG_AMP_LEFT >= 1.5 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	if( MAX_DX2_RIGHT < 9039.5 ) { 
		if( AMP_DELTA < 8933 ) { return new Prediction("LEFT", 3, 0); }
		if( AMP_DELTA >= 8933 ) { return new Prediction("RIGHT", 15, 0); }
	}
	}
		if( MAX_AMP_LEFT < 4405.5 ) { return new Prediction("RIGHT", 111, 0); }
	}
	if( AVG_AMP_RIGHT < -3.5 ) { 
	if( MAX_AMP_RIGHT >= -17348 ) { 
		if( FIRST_LEFT_DETECTION < 138 ) { return new Prediction("TOP", 7, 0); }
	if( FIRST_LEFT_DETECTION >= 138 ) { 
		if( AVG_AMP_LEFT < 2 ) { return new Prediction("RIGHT", 9, 0); }
		if( AVG_AMP_LEFT >= 2 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	}
		if( MAX_AMP_RIGHT < -17348 ) { return new Prediction("BOTTOM", 10, 0); }
	}
	}
	if( DETECTION_DELTA >= 8.5 ) { 
	if( AVG_AMP_RIGHT >= -10.5 ) { 
		if( MAX_AMP_LEFT >= 3172.5 ) { return new Prediction("BOTTOM", 14, 0); }
	if( MAX_AMP_LEFT < 3172.5 ) { 
	if( FIRST_RIGHT_DETECTION < 248 ) { 
		if( MAX_DX2_RIGHT >= 6173 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_DX2_RIGHT < 6173 ) { 
		if( AVG_DX2_LEFT < -1.78 ) { return new Prediction("BOTTOM", 2, 0); }
		if( AVG_DX2_LEFT >= -1.78 ) { return new Prediction("RIGHT", 17, 0); }
	}
	}
		if( FIRST_RIGHT_DETECTION >= 248 ) { return new Prediction("BOTTOM", 4, 0); }
	}
	}
	if( AVG_AMP_RIGHT < -10.5 ) { 
		if( AVG_DX2_RIGHT >= 5.87 ) { return new Prediction("LEFT", 1, 0); }
		if( AVG_DX2_RIGHT < 5.87 ) { return new Prediction("BOTTOM", 152, 0); }
	}
	}
	}
	}
	if( MAX_AMP_LEFT >= 6966.5 ) { 
	if( MAX_AMP_RIGHT < -22727 ) { 
		if( AVG_AMP_LEFT < 1.5 ) { return new Prediction("RIGHT", 8, 0); }
	if( AVG_AMP_LEFT >= 1.5 ) { 
		if( AVG_DX2_LEFT < -2.7 ) { return new Prediction("TOP", 1, 0); }
		if( AVG_DX2_LEFT >= -2.7 ) { return new Prediction("BOTTOM", 6, 0); }
	}
	}
	if( MAX_AMP_RIGHT >= -22727 ) { 
	if( AMP_DELTA >= 11153 ) { 
		if( DETECTION_DELTA < 1.5 ) { return new Prediction("RIGHT", 3, 0); }
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("BOTTOM", 3, 0); }
	}
	if( AMP_DELTA < 11153 ) { 
	if( DETECTION_DELTA < 1.5 ) { 
		if( FIRST_RIGHT_DETECTION < 165 ) { return new Prediction("LEFT", 2, 0); }
	if( FIRST_RIGHT_DETECTION >= 165 ) { 
		if( MAX_DX2_RIGHT < 6903 ) { return new Prediction("TOP", 1, 0); }
		if( MAX_DX2_RIGHT >= 6903 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
		if( DETECTION_DELTA >= 1.5 ) { return new Prediction("TOP", 171, 0); }
	}
	}
	}
return null;
}
private Prediction runTree99() {
	if( AVG_AMP_RIGHT < 8.5 ) { 
	if( MAX_DX2_LEFT < 2729.5 ) { 
	if( MAX_DX2_RIGHT >= 6199 ) { 
		if( AMP_DELTA < 5848.5 ) { return new Prediction("LEFT", 2, 0); }
		if( AMP_DELTA >= 5848.5 ) { return new Prediction("BOTTOM", 23, 0); }
	}
	if( MAX_DX2_RIGHT < 6199 ) { 
	if( MAX_AMP_RIGHT >= -8151 ) { 
		if( MAX_AMP_LEFT < 4599 ) { return new Prediction("LEFT", 138, 0); }
	if( MAX_AMP_LEFT >= 4599 ) { 
		if( DX2_DELTA < 1733 ) { return new Prediction("TOP", 4, 0); }
		if( DX2_DELTA >= 1733 ) { return new Prediction("LEFT", 4, 0); }
	}
	}
	if( MAX_AMP_RIGHT < -8151 ) { 
	if( AVG_AMP_LEFT >= 4.5 ) { 
	if( DX2_DELTA >= 1191.5 ) { 
	if( MAX_AMP_LEFT < 3297 ) { 
		if( MAX_AMP_RIGHT < -10809.5 ) { return new Prediction("BOTTOM", 3, 0); }
	if( MAX_AMP_RIGHT >= -10809.5 ) { 
	if( AVG_AMP_LEFT >= 7.5 ) { 
		if( AVG_DX2_RIGHT >= 4.23 ) { return new Prediction("BOTTOM", 1, 0); }
		if( AVG_DX2_RIGHT < 4.23 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( AVG_AMP_LEFT < 7.5 ) { return new Prediction("LEFT", 5, 0); }
	}
	}
		if( MAX_AMP_LEFT >= 3297 ) { return new Prediction("LEFT", 21, 0); }
	}
		if( DX2_DELTA < 1191.5 ) { return new Prediction("TOP", 3, 0); }
	}
	if( AVG_AMP_LEFT < 4.5 ) { 
		if( AVG_AMP_LEFT < -0.5 ) { return new Prediction("RIGHT", 22, 0); }
	if( AVG_AMP_LEFT >= -0.5 ) { 
		if( MAX_AMP_RIGHT >= -10105.5 ) { return new Prediction("RIGHT", 4, 0); }
	if( MAX_AMP_RIGHT < -10105.5 ) { 
		if( AVG_DX2_LEFT >= -0.35 ) { return new Prediction("LEFT", 3, 0); }
		if( AVG_DX2_LEFT < -0.35 ) { return new Prediction("BOTTOM", 1, 0); }
	}
	}
	}
	}
	}
	}
	if( MAX_DX2_LEFT >= 2729.5 ) { 
	if( MAX_AMP_LEFT >= 8647.5 ) { 
	if( MAX_AMP_LEFT < 11456.5 ) { 
		if( MAX_AMP_RIGHT < -20147.5 ) { return new Prediction("BOTTOM", 6, 0); }
	if( MAX_AMP_RIGHT >= -20147.5 ) { 
		if( AVG_AMP_LEFT < 32 ) { return new Prediction("TOP", 30, 0); }
	if( AVG_AMP_LEFT >= 32 ) { 
		if( AVG_DX2_RIGHT >= 3.39 ) { return new Prediction("TOP", 2, 0); }
		if( AVG_DX2_RIGHT < 3.39 ) { return new Prediction("LEFT", 2, 0); }
	}
	}
	}
		if( MAX_AMP_LEFT >= 11456.5 ) { return new Prediction("TOP", 88, 0); }
	}
	if( MAX_AMP_LEFT < 8647.5 ) { 
	if( MAX_AMP_LEFT >= -3640 ) { 
	if( MAX_AMP_RIGHT < -13966.5 ) { 
		if( DETECTION_DELTA < 1 ) { return new Prediction("RIGHT", 1, 0); }
		if( DETECTION_DELTA >= 1 ) { return new Prediction("BOTTOM", 99, 0); }
	}
	if( MAX_AMP_RIGHT >= -13966.5 ) { 
	if( MAX_DX2_RIGHT >= 6006 ) { 
		if( MAX_DX2_LEFT < 3210 ) { return new Prediction("LEFT", 2, 0); }
		if( MAX_DX2_LEFT >= 3210 ) { return new Prediction("BOTTOM", 57, 0); }
	}
	if( MAX_DX2_RIGHT < 6006 ) { 
		if( MAX_AMP_LEFT >= 4714.5 ) { return new Prediction("TOP", 16, 0); }
		if( MAX_AMP_LEFT < 4714.5 ) { return new Prediction("LEFT", 1, 0); }
	}
	}
	}
	if( MAX_AMP_LEFT < -3640 ) { 
		if( AMP_DELTA < 7855 ) { return new Prediction("TOP", 18, 0); }
	if( AMP_DELTA >= 7855 ) { 
	if( DX2_DELTA < 5910 ) { 
		if( MAX_AMP_RIGHT < 2764 ) { return new Prediction("RIGHT", 14, 0); }
		if( MAX_AMP_RIGHT >= 2764 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( DX2_DELTA >= 5910 ) { 
		if( MAX_DX2_LEFT >= 12075 ) { return new Prediction("TOP", 3, 0); }
		if( MAX_DX2_LEFT < 12075 ) { return new Prediction("BOTTOM", 7, 0); }
	}
	}
	}
	}
	}
	}
	if( AVG_AMP_RIGHT >= 8.5 ) { 
	if( AMP_DELTA >= 4992 ) { 
	if( DX2_DELTA >= 5778 ) { 
		if( MAX_DX2_LEFT >= 10472.5 ) { return new Prediction("TOP", 5, 0); }
	if( MAX_DX2_LEFT < 10472.5 ) { 
		if( FIRST_RIGHT_DETECTION >= 116.5 ) { return new Prediction("BOTTOM", 6, 0); }
		if( FIRST_RIGHT_DETECTION < 116.5 ) { return new Prediction("RIGHT", 1, 0); }
	}
	}
	if( DX2_DELTA < 5778 ) { 
	if( AVG_AMP_LEFT >= 6.5 ) { 
		if( FIRST_LEFT_DETECTION >= 109 ) { return new Prediction("LEFT", 9, 0); }
		if( FIRST_LEFT_DETECTION < 109 ) { return new Prediction("BOTTOM", 2, 0); }
	}
	if( AVG_AMP_LEFT < 6.5 ) { 
	if( MAX_DX2_LEFT < 611 ) { 
		if( FIRST_RIGHT_DETECTION < 142 ) { return new Prediction("LEFT", 2, 0); }
		if( FIRST_RIGHT_DETECTION >= 142 ) { return new Prediction("RIGHT", 2, 0); }
	}
	if( MAX_DX2_LEFT >= 611 ) { 
		if( AVG_AMP_LEFT < 2.5 ) { return new Prediction("RIGHT", 151, 0); }
	if( AVG_AMP_LEFT >= 2.5 ) { 
	if( FIRST_LEFT_DETECTION >= 231 ) { 
		if( AVG_DX2_LEFT >= 0.32 ) { return new Prediction("RIGHT", 1, 0); }
		if( AVG_DX2_LEFT < 0.32 ) { return new Prediction("LEFT", 1, 0); }
	}
		if( FIRST_LEFT_DETECTION < 231 ) { return new Prediction("RIGHT", 7, 0); }
	}
	}
	}
	}
	}
	if( AMP_DELTA < 4992 ) { 
	if( MAX_DX2_LEFT < 3048.5 ) { 
	if( DX2_DELTA >= 50.5 ) { 
		if( MAX_DX2_LEFT >= 2221.5 ) { return new Prediction("RIGHT", 1, 0); }
		if( MAX_DX2_LEFT < 2221.5 ) { return new Prediction("LEFT", 17, 0); }
	}
		if( DX2_DELTA < 50.5 ) { return new Prediction("TOP", 1, 0); }
	}
		if( MAX_DX2_LEFT >= 3048.5 ) { return new Prediction("TOP", 35, 0); }
	}
	}
return null;
}
}

