

package com.university.rahim.uitms.Accelerometer_Module.Classifier;

import java.util.List;

public class ModelRandomForest extends RandomForest {

	public double Y28;
	public double Y29;
	public double X29;
	public double X28;
	public double X25;
	public double X24;
	public double X27;
	public double X26;
	public double Y24;
	public double X20;
	public double X23;
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
	public double Y21;
	public double Y22;
	public double Y23;
	public double X21;
	public double Y25;
	public double Z8;
	public double Y26;
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
	public double X11;
	public double X12;
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
	public double Y32;
	public double Y31;
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
		b.append(", X24: ");
		b.append(X24);
		b.append(", X27: ");
		b.append(X27);
		b.append(", X26: ");
		b.append(X26);
		b.append(", Y24: ");
		b.append(Y24);
		b.append(", X20: ");
		b.append(X20);
		b.append(", X23: ");
		b.append(X23);
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
		b.append(", Y21: ");
		b.append(Y21);
		b.append(", Y22: ");
		b.append(Y22);
		b.append(", Y23: ");
		b.append(Y23);
		b.append(", X21: ");
		b.append(X21);
		b.append(", Y25: ");
		b.append(Y25);
		b.append(", Z8: ");
		b.append(Z8);
		b.append(", Y26: ");
		b.append(Y26);
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
		b.append(", X11: ");
		b.append(X11);
		b.append(", X12: ");
		b.append(X12);
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
		b.append(", Y32: ");
		b.append(Y32);
		b.append(", Y31: ");
		b.append(Y31);
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
	}

	private Prediction runTree0() {
		if( X8 >= 0.12 ) {
			if( X23 >= 0.15 ) {
				if( X22 >= 0.17 ) {
					if( X28 >= 0.16 ) {
						if( X18 < 0.08 ) { return new Prediction("Right", 1, 0); }
						if( X18 >= 0.08 ) {
							if( Y30 >= -0.08 ) { return new Prediction("Left", 693, 0); }
							if( Y30 < -0.08 ) {
								if( X26 < 0.16 ) { return new Prediction("Right", 1, 0); }
								if( X26 >= 0.16 ) {
									if( Z1 >= 9.82 ) {
										if( X32 < 0.17 ) { return new Prediction("Right", 2, 0); }
										if( X32 >= 0.17 ) { return new Prediction("Left", 33, 0); }
									}
									if( Z1 < 9.82 ) { return new Prediction("Left", 156, 0); }
								}
							}
						}
					}
					if( X28 < 0.16 ) {
						if( X2 < 0.16 ) {
							if( X25 >= 0.19 ) { return new Prediction("Right", 2, 0); }
							if( X25 < 0.19 ) { return new Prediction("Left", 13, 0); }
						}
						if( X2 >= 0.16 ) {
							if( X26 < 0.16 ) { return new Prediction("Left", 1, 0); }
							if( X26 >= 0.16 ) { return new Prediction("Right", 6, 0); }
						}
					}
				}
				if( X22 < 0.17 ) {
					if( Z7 < 9.97 ) {
						if( Z1 < 9.56 ) {
							if( Y26 < -0.08 ) { return new Prediction("Right", 13, 0); }
							if( Y26 >= -0.08 ) {
								if( X10 < 0.09 ) { return new Prediction("Right", 1, 0); }
								if( X10 >= 0.09 ) { return new Prediction("Left", 2, 0); }
							}
						}
						if( Z1 >= 9.56 ) {
							if( X13 >= 0.11 ) { return new Prediction("Left", 31, 0); }
							if( X13 < 0.11 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( Z7 >= 9.97 ) {
						if( Y16 >= -0.12 ) { return new Prediction("Right", 29, 0); }
						if( Y16 < -0.12 ) {
							if( X10 >= 0.06 ) { return new Prediction("Right", 3, 0); }
							if( X10 < 0.06 ) { return new Prediction("Left", 1, 0); }
						}
					}
				}
			}
			if( X23 < 0.15 ) {
				if( X24 < 0.14 ) { return new Prediction("Right", 48, 0); }
				if( X24 >= 0.14 ) {
					if( X10 >= 0.2 ) { return new Prediction("Right", 15, 0); }
					if( X10 < 0.2 ) {
						if( X25 >= 0.18 ) { return new Prediction("Right", 5, 0); }
						if( X25 < 0.18 ) { return new Prediction("Left", 15, 0); }
					}
				}
			}
		}
		if( X8 < 0.12 ) {
			if( Z2 >= 9.55 ) {
				if( X24 < 0.15 ) {
					if( Z30 >= 9.92 ) {
						if( X3 < 0.12 ) { return new Prediction("Left", 2, 0); }
						if( X3 >= 0.12 ) { return new Prediction("Right", 1, 0); }
					}
					if( Z30 < 9.92 ) { return new Prediction("Right", 35, 0); }
				}
				if( X24 >= 0.15 ) {
					if( X18 < 0.23 ) {
						if( Y24 < -0.1 ) {
							if( X17 >= 0.17 ) { return new Prediction("Right", 4, 0); }
							if( X17 < 0.17 ) { return new Prediction("Left", 2, 0); }
						}
						if( Y24 >= -0.1 ) { return new Prediction("Left", 85, 0); }
					}
					if( X18 >= 0.23 ) { return new Prediction("Right", 6, 0); }
				}
			}
			if( Z2 < 9.55 ) {
				if( Z15 < 10.29 ) {
					if( X15 >= 0.15 ) {
						if( Z13 < 9.49 ) { return new Prediction("Right", 41, 0); }
						if( Z13 >= 9.49 ) {
							if( X24 < 0.16 ) { return new Prediction("Left", 2, 0); }
							if( X24 >= 0.16 ) {
								if( Z6 >= 9.85 ) { return new Prediction("Right", 7, 0); }
								if( Z6 < 9.85 ) {
									if( X4 >= 0.17 ) { return new Prediction("Left", 1, 0); }
									if( X4 < 0.17 ) { return new Prediction("Right", 1, 0); }
								}
							}
						}
					}
					if( X15 < 0.15 ) { return new Prediction("Right", 772, 0); }
				}
				if( Z15 >= 10.29 ) { return new Prediction("Left", 1, 0); }
			}
		}
		return null;
	}
	private Prediction runTree1() {
		if( X10 >= 0.24 ) {
			if( X13 >= 0.22 ) {
				if( X8 < 0.15 ) { return new Prediction("Right", 274, 0); }
				if( X8 >= 0.15 ) {
					if( Y30 >= -0.09 ) {
						if( X3 < 0.21 ) {
							if( X12 < 0.14 ) { return new Prediction("Right", 1, 0); }
							if( X12 >= 0.14 ) { return new Prediction("Left", 79, 0); }
						}
						if( X3 >= 0.21 ) {
							if( X7 >= 0.21 ) { return new Prediction("Left", 6, 0); }
							if( X7 < 0.21 ) {
								if( X30 >= 0.19 ) { return new Prediction("Left", 1, 0); }
								if( X30 < 0.19 ) { return new Prediction("Right", 7, 0); }
							}
						}
					}
					if( Y30 < -0.09 ) {
						if( X3 < 0.12 ) { return new Prediction("Left", 2, 0); }
						if( X3 >= 0.12 ) { return new Prediction("Right", 6, 0); }
					}
				}
			}
			if( X13 < 0.22 ) {
				if( Z32 < 9.79 ) { return new Prediction("Right", 449, 0); }
				if( Z32 >= 9.79 ) { return new Prediction("Left", 1, 0); }
			}
		}
		if( X10 < 0.24 ) {
			if( X24 < 0.15 ) {
				if( X14 < 0.17 ) { return new Prediction("Right", 188, 0); }
				if( X14 >= 0.17 ) {
					if( Z27 < 9.79 ) { return new Prediction("Right", 8, 0); }
					if( Z27 >= 9.79 ) { return new Prediction("Left", 4, 0); }
				}
			}
			if( X24 >= 0.15 ) {
				if( X19 < 0.15 ) {
					if( X1 >= 0.19 ) { return new Prediction("Right", 16, 0); }
					if( X1 < 0.19 ) {
						if( X3 < 0.03 ) { return new Prediction("Right", 6, 0); }
						if( X3 >= 0.03 ) {
							if( X22 >= 0.16 ) { return new Prediction("Left", 5, 0); }
							if( X22 < 0.16 ) { return new Prediction("Right", 2, 0); }
						}
					}
				}
				if( X19 >= 0.15 ) {
					if( X21 >= 0.15 ) {
						if( X23 >= 0.23 ) { return new Prediction("Right", 3, 0); }
						if( X23 < 0.23 ) {
							if( Y19 >= -0.08 ) {
								if( Y2 >= -0.09 ) { return new Prediction("Left", 575, 0); }
								if( Y2 < -0.09 ) {
									if( X30 < 0.16 ) {
										if( X5 < 0.13 ) { return new Prediction("Left", 2, 0); }
										if( X5 >= 0.13 ) { return new Prediction("Right", 1, 0); }
									}
									if( X30 >= 0.16 ) { return new Prediction("Left", 159, 0); }
								}
							}
							if( Y19 < -0.08 ) {
								if( X20 >= 0.23 ) { return new Prediction("Right", 1, 0); }
								if( X20 < 0.23 ) {
									if( X19 >= 0.18 ) {
										if( X14 >= 0.11 ) { return new Prediction("Left", 157, 0); }
										if( X14 < 0.11 ) { return new Prediction("Right", 1, 0); }
									}
									if( X19 < 0.18 ) {
										if( X19 < 0.17 ) { return new Prediction("Left", 31, 0); }
										if( X19 >= 0.17 ) {
											if( Y32 >= -0.08 ) { return new Prediction("Left", 11, 0); }
											if( Y32 < -0.08 ) { return new Prediction("Right", 4, 0); }
										}
									}
								}
							}
						}
					}
					if( X21 < 0.15 ) {
						if( X15 >= 0.17 ) { return new Prediction("Left", 3, 0); }
						if( X15 < 0.17 ) { return new Prediction("Right", 30, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree2() {
		if( X5 < 0.12 ) {
			if( X14 < 0.17 ) {
				if( X7 < 0.14 ) { return new Prediction("Right", 578, 0); }
				if( X7 >= 0.14 ) {
					if( X1 < 0.14 ) { return new Prediction("Left", 2, 0); }
					if( X1 >= 0.14 ) { return new Prediction("Right", 13, 0); }
				}
			}
			if( X14 >= 0.17 ) {
				if( X9 < 0.27 ) {
					if( Y3 < -0.08 ) { return new Prediction("Left", 87, 0); }
					if( Y3 >= -0.08 ) {
						if( X1 < 0.17 ) { return new Prediction("Left", 2, 0); }
						if( X1 >= 0.17 ) { return new Prediction("Right", 9, 0); }
					}
				}
				if( X9 >= 0.27 ) {
					if( Y14 < -0.12 ) { return new Prediction("Left", 7, 0); }
					if( Y14 >= -0.12 ) {
						if( X26 < 0.17 ) { return new Prediction("Left", 2, 0); }
						if( X26 >= 0.17 ) {
							if( Z14 >= 9.77 ) { return new Prediction("Right", 14, 0); }
							if( Z14 < 9.77 ) { return new Prediction("Left", 1, 0); }
						}
					}
				}
			}
		}
		if( X5 >= 0.12 ) {
			if( X32 < 0.17 ) {
				if( Y27 < -0.09 ) {
					if( X14 < 0.16 ) {
						if( X2 < 0.09 ) { return new Prediction("Left", 1, 0); }
						if( X2 >= 0.09 ) { return new Prediction("Right", 187, 0); }
					}
					if( X14 >= 0.16 ) {
						if( X22 >= 0.16 ) {
							if( Z20 >= 9.88 ) { return new Prediction("Right", 4, 0); }
							if( Z20 < 9.88 ) { return new Prediction("Left", 19, 0); }
						}
						if( X22 < 0.16 ) { return new Prediction("Right", 16, 0); }
					}
				}
				if( Y27 >= -0.09 ) {
					if( X21 >= 0.15 ) {
						if( X2 < 0.15 ) { return new Prediction("Left", 73, 0); }
						if( X2 >= 0.15 ) {
							if( Z7 < 10 ) {
								if( X17 >= 0.14 ) {
									if( Y24 >= -0.05 ) { return new Prediction("Right", 2, 0); }
									if( Y24 < -0.05 ) {
										if( Y9 < -0.07 ) { return new Prediction("Left", 25, 0); }
										if( Y9 >= -0.07 ) {
											if( X24 < 0.17 ) { return new Prediction("Left", 2, 0); }
											if( X24 >= 0.17 ) { return new Prediction("Right", 2, 0); }
										}
									}
								}
								if( X17 < 0.14 ) { return new Prediction("Right", 3, 0); }
							}
							if( Z7 >= 10 ) {
								if( X16 >= 0.15 ) { return new Prediction("Left", 2, 0); }
								if( X16 < 0.15 ) { return new Prediction("Right", 28, 0); }
							}
						}
					}
					if( X21 < 0.15 ) { return new Prediction("Right", 58, 0); }
				}
			}
			if( X32 >= 0.17 ) {
				if( X15 >= 0.15 ) {
					if( X18 >= 0.11 ) {
						if( X15 >= 0.17 ) { return new Prediction("Left", 631, 0); }
						if( X15 < 0.17 ) {
							if( X11 >= 0.27 ) { return new Prediction("Right", 4, 0); }
							if( X11 < 0.27 ) {
								if( X18 >= 0.26 ) { return new Prediction("Right", 1, 0); }
								if( X18 < 0.26 ) { return new Prediction("Left", 138, 0); }
							}
						}
					}
					if( X18 < 0.11 ) { return new Prediction("Right", 5, 0); }
				}
				if( X15 < 0.15 ) {
					if( Z26 < 9.91 ) {
						if( Z18 < 9.78 ) {
							if( X17 < 0.21 ) { return new Prediction("Left", 14, 0); }
							if( X17 >= 0.21 ) { return new Prediction("Right", 11, 0); }
						}
						if( Z18 >= 9.78 ) { return new Prediction("Right", 59, 0); }
					}
					if( Z26 >= 9.91 ) {
						if( Y25 < -0.07 ) { return new Prediction("Left", 31, 0); }
						if( Y25 >= -0.07 ) { return new Prediction("Right", 2, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree3() {
		if( X23 >= 0.15 ) {
			if( X1 >= 0.19 ) {
				if( Z2 < 9.4 ) {
					if( Y21 >= -0.1 ) { return new Prediction("Right", 253, 0); }
					if( Y21 < -0.1 ) {
						if( X5 < 0.2 ) { return new Prediction("Right", 2, 0); }
						if( X5 >= 0.2 ) { return new Prediction("Left", 3, 0); }
					}
				}
				if( Z2 >= 9.4 ) {
					if( Z28 >= 9.66 ) {
						if( Z15 >= 9.42 ) {
							if( X15 >= 0.15 ) {
								if( X10 >= 0.25 ) {
									if( X19 < 0.21 ) { return new Prediction("Right", 11, 0); }
									if( X19 >= 0.21 ) { return new Prediction("Left", 2, 0); }
								}
								if( X10 < 0.25 ) { return new Prediction("Left", 88, 0); }
							}
							if( X15 < 0.15 ) {
								if( Y21 >= -0.09 ) { return new Prediction("Right", 56, 0); }
								if( Y21 < -0.09 ) {
									if( X3 < 0.22 ) { return new Prediction("Right", 1, 0); }
									if( X3 >= 0.22 ) { return new Prediction("Left", 3, 0); }
								}
							}
						}
						if( Z15 < 9.42 ) { return new Prediction("Right", 43, 0); }
					}
					if( Z28 < 9.66 ) { return new Prediction("Left", 133, 0); }
				}
			}
			if( X1 < 0.19 ) {
				if( Z23 >= 9.71 ) {
					if( X20 < 0.18 ) {
						if( X11 >= 0.13 ) {
							if( X12 < 0.09 ) { return new Prediction("Right", 2, 0); }
							if( X12 >= 0.09 ) {
								if( Y28 < -0.07 ) {
									if( X28 >= 0.16 ) {
										if( Z27 >= 9.7 ) { return new Prediction("Right", 1, 0); }
										if( Z27 < 9.7 ) { return new Prediction("Left", 15, 0); }
									}
									if( X28 < 0.16 ) { return new Prediction("Right", 3, 0); }
								}
								if( Y28 >= -0.07 ) { return new Prediction("Left", 36, 0); }
							}
						}
						if( X11 < 0.13 ) {
							if( X8 < 0.03 ) { return new Prediction("Left", 2, 0); }
							if( X8 >= 0.03 ) { return new Prediction("Right", 16, 0); }
						}
					}
					if( X20 >= 0.18 ) { return new Prediction("Left", 146, 0); }
				}
				if( Z23 < 9.71 ) {
					if( Y26 < -0.09 ) {
						if( X24 < 0.14 ) { return new Prediction("Right", 2, 0); }
						if( X24 >= 0.14 ) {
							if( X14 >= 0.14 ) { return new Prediction("Left", 161, 0); }
							if( X14 < 0.14 ) {
								if( X5 < 0.19 ) { return new Prediction("Right", 1, 0); }
								if( X5 >= 0.19 ) { return new Prediction("Left", 11, 0); }
							}
						}
					}
					if( Y26 >= -0.09 ) { return new Prediction("Left", 423, 0); }
				}
			}
		}
		if( X23 < 0.15 ) {
			if( Z8 < 9.95 ) {
				if( Y27 < -0.08 ) { return new Prediction("Right", 18, 0); }
				if( Y27 >= -0.08 ) {
					if( X18 < 0.23 ) {
						if( X5 >= 0.17 ) { return new Prediction("Left", 12, 0); }
						if( X5 < 0.17 ) {
							if( Y11 >= -0.08 ) { return new Prediction("Right", 2, 0); }
							if( Y11 < -0.08 ) { return new Prediction("Left", 2, 0); }
						}
					}
					if( X18 >= 0.23 ) { return new Prediction("Right", 5, 0); }
				}
			}
			if( Z8 >= 9.95 ) {
				if( Z2 >= 9.77 ) { return new Prediction("Left", 2, 0); }
				if( Z2 < 9.77 ) { return new Prediction("Right", 578, 0); }
			}
		}
		return null;
	}
	private Prediction runTree4() {
		if( X15 >= 0.14 ) {
			if( X21 >= 0.15 ) {
				if( X13 < 0.09 ) {
					if( X29 >= 0.18 ) { return new Prediction("Left", 2, 0); }
					if( X29 < 0.18 ) { return new Prediction("Right", 7, 0); }
				}
				if( X13 >= 0.09 ) {
					if( Y20 >= -0.1 ) {
						if( X9 < 0.51 ) {
							if( Z29 >= 9.47 ) {
								if( Z14 < 9.16 ) {
									if( Y7 >= -0.19 ) {
										if( X2 >= 0.13 ) { return new Prediction("Right", 2, 0); }
										if( X2 < 0.13 ) { return new Prediction("Left", 1, 0); }
									}
									if( Y7 < -0.19 ) { return new Prediction("Left", 16, 0); }
								}
								if( Z14 >= 9.16 ) {
									if( X17 >= 0.26 ) { return new Prediction("Right", 1, 0); }
									if( X17 < 0.26 ) { return new Prediction("Left", 968, 0); }
								}
							}
							if( Z29 < 9.47 ) {
								if( X3 >= -0.02 ) { return new Prediction("Left", 5, 0); }
								if( X3 < -0.02 ) { return new Prediction("Right", 2, 0); }
							}
						}
						if( X9 >= 0.51 ) { return new Prediction("Right", 2, 0); }
					}
					if( Y20 < -0.1 ) {
						if( Z1 >= 9.72 ) { return new Prediction("Left", 10, 0); }
						if( Z1 < 9.72 ) {
							if( X26 >= 0.19 ) {
								if( X26 >= 0.2 ) { return new Prediction("Left", 2, 0); }
								if( X26 < 0.2 ) {
									if( X18 < 0.12 ) { return new Prediction("Left", 1, 0); }
									if( X18 >= 0.12 ) { return new Prediction("Right", 2, 0); }
								}
							}
							if( X26 < 0.19 ) { return new Prediction("Right", 10, 0); }
						}
					}
				}
			}
			if( X21 < 0.15 ) {
				if( X17 >= 0.17 ) { return new Prediction("Right", 84, 0); }
				if( X17 < 0.17 ) {
					if( X3 >= 0.27 ) { return new Prediction("Right", 3, 0); }
					if( X3 < 0.27 ) { return new Prediction("Left", 1, 0); }
				}
			}
		}
		if( X15 < 0.14 ) {
			if( X17 < 0.12 ) {
				if( X3 < 0.13 ) {
					if( Z3 >= 9.72 ) { return new Prediction("Right", 1, 0); }
					if( Z3 < 9.72 ) { return new Prediction("Left", 26, 0); }
				}
				if( X3 >= 0.13 ) {
					if( X28 >= 0.15 ) { return new Prediction("Right", 130, 0); }
					if( X28 < 0.15 ) { return new Prediction("Left", 2, 0); }
				}
			}
			if( X17 >= 0.12 ) {
				if( Z29 < 9.56 ) {
					if( X18 >= 0.19 ) { return new Prediction("Right", 4, 0); }
					if( X18 < 0.19 ) { return new Prediction("Left", 7, 0); }
				}
				if( Z29 >= 9.56 ) {
					if( X32 >= 0.2 ) { return new Prediction("Left", 1, 0); }
					if( X32 < 0.2 ) {
						if( Z5 >= 9.33 ) { return new Prediction("Right", 742, 0); }
						if( Z5 < 9.33 ) { return new Prediction("Left", 1, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree5() {
		if( X1 < 0.2 ) {
			if( X21 < 0.16 ) {
				if( Z1 >= 9.67 ) { return new Prediction("Left", 5, 0); }
				if( Z1 < 9.67 ) {
					if( Z22 >= 9.73 ) { return new Prediction("Left", 2, 0); }
					if( Z22 < 9.73 ) {
						if( Z31 < 9.57 ) {
							if( Z3 < 9.37 ) { return new Prediction("Right", 7, 0); }
							if( Z3 >= 9.37 ) {
								if( X5 >= 0.15 ) { return new Prediction("Left", 4, 0); }
								if( X5 < 0.15 ) { return new Prediction("Right", 1, 0); }
							}
						}
						if( Z31 >= 9.57 ) { return new Prediction("Right", 86, 0); }
					}
				}
			}
			if( X21 >= 0.16 ) {
				if( X23 >= 0.15 ) {
					if( X3 < 0.19 ) {
						if( X28 >= 0.15 ) {
							if( Z31 >= 9.7 ) {
								if( X16 < 0.13 ) { return new Prediction("Right", 1, 0); }
								if( X16 >= 0.13 ) {
									if( Z32 < 9.7 ) {
										if( Z5 < 9.79 ) { return new Prediction("Left", 10, 0); }
										if( Z5 >= 9.79 ) { return new Prediction("Right", 1, 0); }
									}
									if( Z32 >= 9.7 ) { return new Prediction("Left", 121, 0); }
								}
							}
							if( Z31 < 9.7 ) { return new Prediction("Left", 674, 0); }
						}
						if( X28 < 0.15 ) {
							if( X12 < 0.24 ) { return new Prediction("Right", 8, 0); }
							if( X12 >= 0.24 ) { return new Prediction("Left", 1, 0); }
						}
					}
					if( X3 >= 0.19 ) {
						if( X25 < 0.16 ) { return new Prediction("Right", 10, 0); }
						if( X25 >= 0.16 ) {
							if( X11 >= 0.24 ) {
								if( X1 >= 0.11 ) { return new Prediction("Right", 3, 0); }
								if( X1 < 0.11 ) { return new Prediction("Left", 1, 0); }
							}
							if( X11 < 0.24 ) { return new Prediction("Left", 62, 0); }
						}
					}
				}
				if( X23 < 0.15 ) {
					if( X2 < 0.14 ) { return new Prediction("Left", 1, 0); }
					if( X2 >= 0.14 ) {
						if( Y27 >= -0.06 ) { return new Prediction("Left", 1, 0); }
						if( Y27 < -0.06 ) { return new Prediction("Right", 39, 0); }
					}
				}
			}
		}
		if( X1 >= 0.2 ) {
			if( Z29 < 9.67 ) {
				if( X14 < 0.13 ) {
					if( X25 < 0.1 ) { return new Prediction("Left", 1, 0); }
					if( X25 >= 0.1 ) { return new Prediction("Right", 19, 0); }
				}
				if( X14 >= 0.13 ) {
					if( X19 < 0.15 ) { return new Prediction("Right", 7, 0); }
					if( X19 >= 0.15 ) {
						if( X22 < 0.13 ) { return new Prediction("Right", 2, 0); }
						if( X22 >= 0.13 ) { return new Prediction("Left", 113, 0); }
					}
				}
			}
			if( Z29 >= 9.67 ) {
				if( X21 < 0.16 ) { return new Prediction("Right", 715, 0); }
				if( X21 >= 0.16 ) {
					if( Z13 >= 9.51 ) {
						if( Y10 < -0.07 ) {
							if( X9 < 0.2 ) { return new Prediction("Left", 1, 0); }
							if( X9 >= 0.2 ) { return new Prediction("Right", 2, 0); }
						}
						if( Y10 >= -0.07 ) { return new Prediction("Left", 13, 0); }
					}
					if( Z13 < 9.51 ) {
						if( X14 < 0.16 ) { return new Prediction("Right", 104, 0); }
						if( X14 >= 0.16 ) {
							if( X5 >= 0.14 ) {
								if( X9 < 0.09 ) { return new Prediction("Right", 2, 0); }
								if( X9 >= 0.09 ) { return new Prediction("Left", 6, 0); }
							}
							if( X5 < 0.14 ) { return new Prediction("Right", 10, 0); }
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree6() {
		if( X22 >= 0.16 ) {
			if( Z19 >= 9.8 ) {
				if( Z13 < 9.5 ) {
					if( Z25 >= 9.8 ) {
						if( X2 < 0.21 ) { return new Prediction("Left", 14, 0); }
						if( X2 >= 0.21 ) { return new Prediction("Right", 1, 0); }
					}
					if( Z25 < 9.8 ) {
						if( Z23 < 9.47 ) {
							if( X10 >= -0.05 ) { return new Prediction("Left", 8, 0); }
							if( X10 < -0.05 ) { return new Prediction("Right", 1, 0); }
						}
						if( Z23 >= 9.47 ) {
							if( Y10 < -0.03 ) { return new Prediction("Right", 79, 0); }
							if( Y10 >= -0.03 ) {
								if( X3 < 0.22 ) { return new Prediction("Left", 1, 0); }
								if( X3 >= 0.22 ) { return new Prediction("Right", 1, 0); }
							}
						}
					}
				}
				if( Z13 >= 9.5 ) {
					if( Y2 < -0.16 ) { return new Prediction("Right", 3, 0); }
					if( Y2 >= -0.16 ) {
						if( X17 >= 0.15 ) { return new Prediction("Left", 139, 0); }
						if( X17 < 0.15 ) { return new Prediction("Right", 1, 0); }
					}
				}
			}
			if( Z19 < 9.8 ) {
				if( X23 < 0.21 ) {
					if( X13 < 0.14 ) {
						if( Y1 >= 0.02 ) {
							if( X5 < -0.01 ) { return new Prediction("Right", 1, 0); }
							if( X5 >= -0.01 ) { return new Prediction("Left", 36, 0); }
						}
						if( Y1 < 0.02 ) { return new Prediction("Right", 9, 0); }
					}
					if( X13 >= 0.14 ) {
						if( X27 < 0.17 ) {
							if( Z2 >= 9.82 ) { return new Prediction("Left", 23, 0); }
							if( Z2 < 9.82 ) {
								if( Z11 < 9.68 ) { return new Prediction("Left", 12, 0); }
								if( Z11 >= 9.68 ) {
									if( X20 < 0.19 ) { return new Prediction("Right", 6, 0); }
									if( X20 >= 0.19 ) { return new Prediction("Left", 4, 0); }
								}
							}
						}
						if( X27 >= 0.17 ) {
							if( X18 >= 0.24 ) {
								if( X32 >= 0.18 ) { return new Prediction("Left", 2, 0); }
								if( X32 < 0.18 ) { return new Prediction("Right", 3, 0); }
							}
							if( X18 < 0.24 ) {
								if( X16 < 0.12 ) {
									if( Z16 < 9.98 ) { return new Prediction("Right", 3, 0); }
									if( Z16 >= 9.98 ) { return new Prediction("Left", 12, 0); }
								}
								if( X16 >= 0.12 ) { return new Prediction("Left", 742, 0); }
							}
						}
					}
				}
				if( X23 >= 0.21 ) {
					if( Z23 < 9.68 ) { return new Prediction("Left", 14, 0); }
					if( Z23 >= 9.68 ) { return new Prediction("Right", 11, 0); }
				}
			}
		}
		if( X22 < 0.16 ) {
			if( X10 < 0.22 ) {
				if( X20 >= 0.2 ) {
					if( Z11 < 10.15 ) { return new Prediction("Right", 120, 0); }
					if( Z11 >= 10.15 ) {
						if( X1 >= 0.25 ) { return new Prediction("Left", 3, 0); }
						if( X1 < 0.25 ) { return new Prediction("Right", 2, 0); }
					}
				}
				if( X20 < 0.2 ) {
					if( Z16 >= 10.04 ) { return new Prediction("Right", 11, 0); }
					if( Z16 < 10.04 ) {
						if( X31 < 0.17 ) {
							if( Y20 >= -0.08 ) { return new Prediction("Right", 8, 0); }
							if( Y20 < -0.08 ) {
								if( X3 >= 0.27 ) { return new Prediction("Right", 1, 0); }
								if( X3 < 0.27 ) { return new Prediction("Left", 4, 0); }
							}
						}
						if( X31 >= 0.17 ) {
							if( Z31 < 9.58 ) { return new Prediction("Left", 19, 0); }
							if( Z31 >= 9.58 ) {
								if( X4 < 0.11 ) { return new Prediction("Right", 2, 0); }
								if( X4 >= 0.11 ) {
									if( X15 < 0.11 ) { return new Prediction("Right", 1, 0); }
									if( X15 >= 0.11 ) { return new Prediction("Left", 8, 0); }
								}
							}
						}
					}
				}
			}
			if( X10 >= 0.22 ) {
				if( X2 >= 0.11 ) { return new Prediction("Right", 727, 0); }
				if( X2 < 0.11 ) { return new Prediction("Left", 1, 0); }
			}
		}
		return null;
	}
	private Prediction runTree7() {
		if( X21 < 0.16 ) {
			if( Z23 >= 9.79 ) {
				if( X19 < 0.15 ) { return new Prediction("Right", 8, 0); }
				if( X19 >= 0.15 ) {
					if( X22 < 0.12 ) { return new Prediction("Right", 4, 0); }
					if( X22 >= 0.12 ) { return new Prediction("Left", 21, 0); }
				}
			}
			if( Z23 < 9.79 ) {
				if( X15 >= 0.15 ) {
					if( Z3 < 9.54 ) {
						if( Y25 >= -0.06 ) {
							if( X4 >= 0.08 ) { return new Prediction("Left", 1, 0); }
							if( X4 < 0.08 ) { return new Prediction("Right", 1, 0); }
						}
						if( Y25 < -0.06 ) { return new Prediction("Right", 62, 0); }
					}
					if( Z3 >= 9.54 ) {
						if( Z6 < 10.1 ) { return new Prediction("Left", 16, 0); }
						if( Z6 >= 10.1 ) { return new Prediction("Right", 3, 0); }
					}
				}
				if( X15 < 0.15 ) {
					if( X29 < 0.13 ) { return new Prediction("Left", 2, 0); }
					if( X29 >= 0.13 ) { return new Prediction("Right", 735, 0); }
				}
			}
		}
		if( X21 >= 0.16 ) {
			if( X7 >= 0.12 ) {
				if( X24 < 0.14 ) { return new Prediction("Right", 34, 0); }
				if( X24 >= 0.14 ) {
					if( X26 < 0.15 ) { return new Prediction("Right", 9, 0); }
					if( X26 >= 0.15 ) {
						if( X5 >= 0.03 ) {
							if( Z8 >= 9.16 ) {
								if( X3 >= 0.15 ) {
									if( Y28 < -0.07 ) {
										if( Y11 < -0.11 ) { return new Prediction("Right", 2, 0); }
										if( Y11 >= -0.11 ) {
											if( X32 < 0.16 ) {
												if( X13 >= 0.18 ) { return new Prediction("Left", 7, 0); }
												if( X13 < 0.18 ) {
													if( Y27 >= -0.07 ) { return new Prediction("Left", 3, 0); }
													if( Y27 < -0.07 ) { return new Prediction("Right", 4, 0); }
												}
											}
											if( X32 >= 0.16 ) { return new Prediction("Left", 112, 0); }
										}
									}
									if( Y28 >= -0.07 ) { return new Prediction("Left", 182, 0); }
								}
								if( X3 < 0.15 ) { return new Prediction("Left", 589, 0); }
							}
							if( Z8 < 9.16 ) { return new Prediction("Right", 2, 0); }
						}
						if( X5 < 0.03 ) {
							if( X23 < 0.2 ) { return new Prediction("Left", 6, 0); }
							if( X23 >= 0.2 ) { return new Prediction("Right", 5, 0); }
						}
					}
				}
			}
			if( X7 < 0.12 ) {
				if( Y29 < -0.06 ) {
					if( Z3 >= 9.5 ) {
						if( X15 >= 0.15 ) {
							if( Z12 >= 9.37 ) { return new Prediction("Left", 17, 0); }
							if( Z12 < 9.37 ) {
								if( Y4 < -0.09 ) { return new Prediction("Left", 2, 0); }
								if( Y4 >= -0.09 ) { return new Prediction("Right", 5, 0); }
							}
						}
						if( X15 < 0.15 ) { return new Prediction("Right", 38, 0); }
					}
					if( Z3 < 9.5 ) { return new Prediction("Right", 104, 0); }
				}
				if( Y29 >= -0.06 ) {
					if( X18 < 0.23 ) { return new Prediction("Left", 55, 0); }
					if( X18 >= 0.23 ) { return new Prediction("Right", 4, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree8() {
		if( Z8 >= 9.96 ) {
			if( Z13 < 9.41 ) {
				if( Y29 < -0.06 ) {
					if( X2 >= 0.13 ) {
						if( X32 < 0.17 ) { return new Prediction("Right", 612, 0); }
						if( X32 >= 0.17 ) {
							if( X5 >= 0.25 ) {
								if( Y12 >= -0.06 ) { return new Prediction("Right", 15, 0); }
								if( Y12 < -0.06 ) { return new Prediction("Left", 4, 0); }
							}
							if( X5 < 0.25 ) { return new Prediction("Right", 158, 0); }
						}
					}
					if( X2 < 0.13 ) { return new Prediction("Left", 18, 0); }
				}
				if( Y29 >= -0.06 ) {
					if( Y31 < -0.05 ) { return new Prediction("Left", 22, 0); }
					if( Y31 >= -0.05 ) {
						if( X21 >= 0.18 ) { return new Prediction("Left", 1, 0); }
						if( X21 < 0.18 ) { return new Prediction("Right", 5, 0); }
					}
				}
			}
			if( Z13 >= 9.41 ) {
				if( X22 >= 0.15 ) {
					if( X19 >= 0.24 ) {
						if( X8 < 0.27 ) { return new Prediction("Right", 19, 0); }
						if( X8 >= 0.27 ) { return new Prediction("Left", 2, 0); }
					}
					if( X19 < 0.24 ) {
						if( Z24 >= 9.63 ) {
							if( X5 < 0.07 ) { return new Prediction("Right", 4, 0); }
							if( X5 >= 0.07 ) {
								if( Z19 < 9.79 ) { return new Prediction("Left", 12, 0); }
								if( Z19 >= 9.79 ) { return new Prediction("Right", 1, 0); }
							}
						}
						if( Z24 < 9.63 ) { return new Prediction("Left", 132, 0); }
					}
				}
				if( X22 < 0.15 ) { return new Prediction("Right", 136, 0); }
			}
		}
		if( Z8 < 9.96 ) {
			if( Y6 < -0.15 ) {
				if( Z11 < 9.49 ) {
					if( X12 < 0.33 ) { return new Prediction("Right", 30, 0); }
					if( X12 >= 0.33 ) { return new Prediction("Left", 4, 0); }
				}
				if( Z11 >= 9.49 ) {
					if( X2 >= 0.19 ) { return new Prediction("Right", 2, 0); }
					if( X2 < 0.19 ) { return new Prediction("Left", 26, 0); }
				}
			}
			if( Y6 >= -0.15 ) {
				if( X16 < 0.21 ) {
					if( Y29 >= -0.08 ) {
						if( Z10 < 10.1 ) {
							if( X12 >= -0.02 ) {
								if( Z8 >= 9.71 ) {
									if( Y17 < -0.04 ) {
										if( X14 >= 0.11 ) {
											if( Z8 >= 9.71 ) { return new Prediction("Left", 375, 0); }
											if( Z8 < 9.71 ) {
												if( Y1 < -0.05 ) { return new Prediction("Right", 1, 0); }
												if( Y1 >= -0.05 ) { return new Prediction("Left", 1, 0); }
											}
										}
										if( X14 < 0.11 ) { return new Prediction("Right", 1, 0); }
									}
									if( Y17 >= -0.04 ) {
										if( Y5 >= -0.05 ) { return new Prediction("Right", 2, 0); }
										if( Y5 < -0.05 ) { return new Prediction("Left", 2, 0); }
									}
								}
								if( Z8 < 9.71 ) { return new Prediction("Left", 284, 0); }
							}
							if( X12 < -0.02 ) { return new Prediction("Right", 2, 0); }
						}
						if( Z10 >= 10.1 ) { return new Prediction("Right", 4, 0); }
					}
					if( Y29 < -0.08 ) {
						if( Y27 < -0.09 ) {
							if( X31 < 0.15 ) { return new Prediction("Right", 7, 0); }
							if( X31 >= 0.15 ) {
								if( X22 >= 0.16 ) { return new Prediction("Left", 24, 0); }
								if( X22 < 0.16 ) { return new Prediction("Right", 6, 0); }
							}
						}
						if( Y27 >= -0.09 ) {
							if( Z28 < 9.54 ) {
								if( X7 < 0.24 ) { return new Prediction("Left", 1, 0); }
								if( X7 >= 0.24 ) { return new Prediction("Right", 1, 0); }
							}
							if( Z28 >= 9.54 ) { return new Prediction("Left", 64, 0); }
						}
					}
				}
				if( X16 >= 0.21 ) {
					if( Y1 >= 0.03 ) {
						if( Y14 < -0.04 ) { return new Prediction("Right", 12, 0); }
						if( Y14 >= -0.04 ) { return new Prediction("Left", 1, 0); }
					}
					if( Y1 < 0.03 ) {
						if( X21 >= 0.14 ) {
							if( X19 >= 0.18 ) { return new Prediction("Left", 29, 0); }
							if( X19 < 0.18 ) {
								if( X7 < 0.4 ) { return new Prediction("Right", 3, 0); }
								if( X7 >= 0.4 ) { return new Prediction("Left", 2, 0); }
							}
						}
						if( X21 < 0.14 ) { return new Prediction("Right", 8, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree9() {
		if( X22 >= 0.16 ) {
			if( X23 >= 0.14 ) {
				if( X18 >= 0.14 ) {
					if( X27 < 0.21 ) {
						if( Z7 >= 10.07 ) {
							if( X14 >= 0.14 ) { return new Prediction("Left", 72, 0); }
							if( X14 < 0.14 ) {
								if( X5 >= 0.28 ) { return new Prediction("Left", 4, 0); }
								if( X5 < 0.28 ) { return new Prediction("Right", 15, 0); }
							}
						}
						if( Z7 < 10.07 ) {
							if( Y25 < -0.09 ) {
								if( X19 < 0.15 ) { return new Prediction("Right", 2, 0); }
								if( X19 >= 0.15 ) {
									if( Z12 >= 9.71 ) {
										if( Y18 < -0.09 ) { return new Prediction("Right", 1, 0); }
										if( Y18 >= -0.09 ) { return new Prediction("Left", 13, 0); }
									}
									if( Z12 < 9.71 ) { return new Prediction("Left", 126, 0); }
								}
							}
							if( Y25 >= -0.09 ) { return new Prediction("Left", 677, 0); }
						}
					}
					if( X27 >= 0.21 ) {
						if( Y22 < -0.08 ) {
							if( X1 >= 0.12 ) {
								if( X5 >= 0.16 ) { return new Prediction("Left", 2, 0); }
								if( X5 < 0.16 ) { return new Prediction("Right", 15, 0); }
							}
							if( X1 < 0.12 ) { return new Prediction("Left", 6, 0); }
						}
						if( Y22 >= -0.08 ) { return new Prediction("Left", 20, 0); }
					}
				}
				if( X18 < 0.14 ) {
					if( X25 >= 0.15 ) {
						if( Z27 >= 9.7 ) {
							if( X29 >= 0.15 ) { return new Prediction("Left", 86, 0); }
							if( X29 < 0.15 ) { return new Prediction("Right", 1, 0); }
						}
						if( Z27 < 9.7 ) { return new Prediction("Right", 8, 0); }
					}
					if( X25 < 0.15 ) { return new Prediction("Right", 20, 0); }
				}
			}
			if( X23 < 0.14 ) { return new Prediction("Right", 51, 0); }
		}
		if( X22 < 0.16 ) {
			if( Z2 >= 9.58 ) {
				if( Y12 >= -0.06 ) { return new Prediction("Right", 22, 0); }
				if( Y12 < -0.06 ) {
					if( X19 >= 0.2 ) { return new Prediction("Right", 7, 0); }
					if( X19 < 0.2 ) { return new Prediction("Left", 40, 0); }
				}
			}
			if( Z2 < 9.58 ) {
				if( Z1 >= 9.4 ) {
					if( Z13 < 9.5 ) {
						if( Y3 < 0.03 ) { return new Prediction("Right", 225, 0); }
						if( Y3 >= 0.03 ) { return new Prediction("Left", 1, 0); }
					}
					if( Z13 >= 9.5 ) {
						if( Z21 >= 9.51 ) {
							if( X6 >= 0.17 ) {
								if( X4 >= 0.26 ) { return new Prediction("Right", 1, 0); }
								if( X4 < 0.26 ) { return new Prediction("Left", 2, 0); }
							}
							if( X6 < 0.17 ) { return new Prediction("Right", 18, 0); }
						}
						if( Z21 < 9.51 ) { return new Prediction("Left", 6, 0); }
					}
				}
				if( Z1 < 9.4 ) { return new Prediction("Right", 592, 0); }
			}
		}
		return null;
	}
	private Prediction runTree10() {
		if( X3 < 0.18 ) {
			if( X23 >= 0.14 ) {
				if( X4 < 0.03 ) {
					if( Z13 < 9.76 ) {
						if( Z12 < 9.25 ) { return new Prediction("Left", 28, 0); }
						if( Z12 >= 9.25 ) {
							if( X23 < 0.18 ) { return new Prediction("Right", 2, 0); }
							if( X23 >= 0.18 ) { return new Prediction("Left", 6, 0); }
						}
					}
					if( Z13 >= 9.76 ) { return new Prediction("Right", 12, 0); }
				}
				if( X4 >= 0.03 ) {
					if( X22 >= 0.15 ) {
						if( Y32 >= -0.08 ) { return new Prediction("Left", 617, 0); }
						if( Y32 < -0.08 ) {
							if( X2 < -0.06 ) { return new Prediction("Right", 2, 0); }
							if( X2 >= -0.06 ) {
								if( Z9 >= 9.67 ) { return new Prediction("Left", 108, 0); }
								if( Z9 < 9.67 ) {
									if( X28 >= 0.16 ) {
										if( Z17 >= 9.69 ) {
											if( X2 < 0.15 ) { return new Prediction("Left", 6, 0); }
											if( X2 >= 0.15 ) { return new Prediction("Right", 1, 0); }
										}
										if( Z17 < 9.69 ) { return new Prediction("Left", 37, 0); }
									}
									if( X28 < 0.16 ) {
										if( Y12 < -0.08 ) { return new Prediction("Left", 1, 0); }
										if( Y12 >= -0.08 ) { return new Prediction("Right", 2, 0); }
									}
								}
							}
						}
					}
					if( X22 < 0.15 ) {
						if( X19 < 0.17 ) {
							if( X2 >= 0.26 ) { return new Prediction("Right", 1, 0); }
							if( X2 < 0.26 ) { return new Prediction("Left", 2, 0); }
						}
						if( X19 >= 0.17 ) { return new Prediction("Right", 11, 0); }
					}
				}
			}
			if( X23 < 0.14 ) { return new Prediction("Right", 32, 0); }
		}
		if( X3 >= 0.18 ) {
			if( Z7 < 9.95 ) {
				if( X11 >= 0.11 ) {
					if( Z13 >= 9.46 ) {
						if( X5 >= 0 ) {
							if( Z2 < 9.57 ) {
								if( X4 >= 0.14 ) {
									if( Y21 >= -0.05 ) { return new Prediction("Right", 1, 0); }
									if( Y21 < -0.05 ) { return new Prediction("Left", 51, 0); }
								}
								if( X4 < 0.14 ) { return new Prediction("Right", 1, 0); }
							}
							if( Z2 >= 9.57 ) { return new Prediction("Left", 110, 0); }
						}
						if( X5 < 0 ) { return new Prediction("Right", 2, 0); }
					}
					if( Z13 < 9.46 ) {
						if( X22 >= 0.15 ) {
							if( Y17 < -0.09 ) { return new Prediction("Right", 2, 0); }
							if( Y17 >= -0.09 ) { return new Prediction("Left", 25, 0); }
						}
						if( X22 < 0.15 ) { return new Prediction("Right", 23, 0); }
					}
				}
				if( X11 < 0.11 ) { return new Prediction("Right", 33, 0); }
			}
			if( Z7 >= 9.95 ) {
				if( Z1 >= 9.73 ) { return new Prediction("Left", 20, 0); }
				if( Z1 < 9.73 ) {
					if( X8 < 0.14 ) {
						if( Z3 >= 9.58 ) {
							if( Y28 < -0.07 ) { return new Prediction("Right", 25, 0); }
							if( Y28 >= -0.07 ) {
								if( X16 < 0.19 ) { return new Prediction("Left", 3, 0); }
								if( X16 >= 0.19 ) { return new Prediction("Right", 1, 0); }
							}
						}
						if( Z3 < 9.58 ) { return new Prediction("Right", 778, 0); }
					}
					if( X8 >= 0.14 ) {
						if( Y18 < -0.1 ) {
							if( Z31 < 9.57 ) { return new Prediction("Left", 11, 0); }
							if( Z31 >= 9.57 ) { return new Prediction("Right", 13, 0); }
						}
						if( Y18 >= -0.1 ) {
							if( X14 >= 0.18 ) {
								if( X12 < 0.16 ) { return new Prediction("Right", 5, 0); }
								if( X12 >= 0.16 ) { return new Prediction("Left", 3, 0); }
							}
							if( X14 < 0.18 ) { return new Prediction("Right", 58, 0); }
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree11() {
		if( Y29 < -0.07 ) {
			if( Z8 >= 9.96 ) {
				if( X15 >= 0.15 ) {
					if( X6 < 0.24 ) {
						if( Z1 < 9.48 ) {
							if( X29 >= 0.19 ) { return new Prediction("Left", 3, 0); }
							if( X29 < 0.19 ) { return new Prediction("Right", 37, 0); }
						}
						if( Z1 >= 9.48 ) {
							if( X21 >= 0.15 ) {
								if( Z4 < 9.45 ) { return new Prediction("Right", 2, 0); }
								if( Z4 >= 9.45 ) { return new Prediction("Left", 23, 0); }
							}
							if( X21 < 0.15 ) { return new Prediction("Right", 5, 0); }
						}
					}
					if( X6 >= 0.24 ) { return new Prediction("Left", 91, 0); }
				}
				if( X15 < 0.15 ) {
					if( Z5 < 9.87 ) { return new Prediction("Right", 685, 0); }
					if( Z5 >= 9.87 ) {
						if( Z22 < 9.49 ) { return new Prediction("Left", 2, 0); }
						if( Z22 >= 9.49 ) { return new Prediction("Right", 56, 0); }
					}
				}
			}
			if( Z8 < 9.96 ) {
				if( X1 < 0.2 ) {
					if( X26 < 0.17 ) {
						if( Y9 >= -0.08 ) { return new Prediction("Right", 9, 0); }
						if( Y9 < -0.08 ) {
							if( X15 >= 0.22 ) { return new Prediction("Right", 4, 0); }
							if( X15 < 0.22 ) { return new Prediction("Left", 15, 0); }
						}
					}
					if( X26 >= 0.17 ) {
						if( X7 < 0.18 ) {
							if( Z8 < 9.91 ) { return new Prediction("Left", 43, 0); }
							if( Z8 >= 9.91 ) {
								if( X15 >= 0.15 ) { return new Prediction("Left", 4, 0); }
								if( X15 < 0.15 ) { return new Prediction("Right", 3, 0); }
							}
						}
						if( X7 >= 0.18 ) { return new Prediction("Left", 237, 0); }
					}
				}
				if( X1 >= 0.2 ) {
					if( Y17 < -0.09 ) { return new Prediction("Right", 36, 0); }
					if( Y17 >= -0.09 ) {
						if( Z2 < 9.53 ) {
							if( X29 >= 0.19 ) { return new Prediction("Left", 3, 0); }
							if( X29 < 0.19 ) {
								if( X6 >= 0.2 ) {
									if( X6 >= 0.2 ) { return new Prediction("Right", 1, 0); }
									if( X6 < 0.2 ) { return new Prediction("Left", 1, 0); }
								}
								if( X6 < 0.2 ) { return new Prediction("Right", 23, 0); }
							}
						}
						if( Z2 >= 9.53 ) { return new Prediction("Left", 49, 0); }
					}
				}
			}
		}
		if( Y29 >= -0.07 ) {
			if( X23 >= 0.16 ) {
				if( X20 >= 0.16 ) {
					if( Z2 >= 9.33 ) {
						if( X22 >= 0.14 ) {
							if( X24 < 0.15 ) {
								if( Y19 < -0.07 ) { return new Prediction("Right", 2, 0); }
								if( Y19 >= -0.07 ) { return new Prediction("Left", 4, 0); }
							}
							if( X24 >= 0.15 ) {
								if( Z18 >= 9.4 ) { return new Prediction("Left", 536, 0); }
								if( Z18 < 9.4 ) { return new Prediction("Right", 1, 0); }
							}
						}
						if( X22 < 0.14 ) { return new Prediction("Right", 3, 0); }
					}
					if( Z2 < 9.33 ) {
						if( Z16 < 10.19 ) {
							if( X5 < 0.27 ) { return new Prediction("Right", 18, 0); }
							if( X5 >= 0.27 ) { return new Prediction("Left", 2, 0); }
						}
						if( Z16 >= 10.19 ) { return new Prediction("Left", 8, 0); }
					}
				}
				if( X20 < 0.16 ) {
					if( Y26 >= -0.07 ) { return new Prediction("Left", 7, 0); }
					if( Y26 < -0.07 ) {
						if( X29 < 0.17 ) { return new Prediction("Right", 18, 0); }
						if( X29 >= 0.17 ) {
							if( X2 < 0.35 ) { return new Prediction("Left", 2, 0); }
							if( X2 >= 0.35 ) { return new Prediction("Right", 3, 0); }
						}
					}
				}
			}
			if( X23 < 0.16 ) {
				if( X22 < 0.18 ) {
					if( X1 < 0.17 ) { return new Prediction("Left", 7, 0); }
					if( X1 >= 0.17 ) {
						if( Z29 < 9.66 ) {
							if( X25 >= 0.18 ) { return new Prediction("Right", 9, 0); }
							if( X25 < 0.18 ) { return new Prediction("Left", 5, 0); }
						}
						if( Z29 >= 9.66 ) { return new Prediction("Right", 70, 0); }
					}
				}
				if( X22 >= 0.18 ) { return new Prediction("Left", 6, 0); }
			}
		}
		return null;
	}
	private Prediction runTree12() {
		if( Z7 < 9.96 ) {
			if( X32 < 0.17 ) {
				if( X10 >= 0.25 ) {
					if( Y10 < -0.09 ) {
						if( X25 >= 0.15 ) { return new Prediction("Left", 4, 0); }
						if( X25 < 0.15 ) { return new Prediction("Right", 1, 0); }
					}
					if( Y10 >= -0.09 ) { return new Prediction("Right", 26, 0); }
				}
				if( X10 < 0.25 ) {
					if( X1 < 0.15 ) { return new Prediction("Left", 81, 0); }
					if( X1 >= 0.15 ) {
						if( Y13 >= -0.06 ) {
							if( Z7 >= 9.84 ) { return new Prediction("Right", 15, 0); }
							if( Z7 < 9.84 ) {
								if( X5 < 0.35 ) { return new Prediction("Right", 2, 0); }
								if( X5 >= 0.35 ) { return new Prediction("Left", 1, 0); }
							}
						}
						if( Y13 < -0.06 ) {
							if( Z10 < 10.01 ) {
								if( X19 >= 0.18 ) { return new Prediction("Left", 22, 0); }
								if( X19 < 0.18 ) {
									if( Z25 < 9.75 ) { return new Prediction("Right", 3, 0); }
									if( Z25 >= 9.75 ) {
										if( Z5 >= 9.91 ) { return new Prediction("Right", 1, 0); }
										if( Z5 < 9.91 ) { return new Prediction("Left", 11, 0); }
									}
								}
							}
							if( Z10 >= 10.01 ) { return new Prediction("Right", 3, 0); }
						}
					}
				}
			}
			if( X32 >= 0.17 ) {
				if( X22 >= 0.16 ) {
					if( Z28 >= 9.38 ) {
						if( Z1 >= 9.22 ) {
							if( X23 >= 0.15 ) { return new Prediction("Left", 717, 0); }
							if( X23 < 0.15 ) {
								if( X1 >= 0.18 ) { return new Prediction("Right", 1, 0); }
								if( X1 < 0.18 ) { return new Prediction("Left", 3, 0); }
							}
						}
						if( Z1 < 9.22 ) {
							if( X8 >= 0.12 ) { return new Prediction("Right", 2, 0); }
							if( X8 < 0.12 ) { return new Prediction("Left", 2, 0); }
						}
					}
					if( Z28 < 9.38 ) { return new Prediction("Right", 2, 0); }
				}
				if( X22 < 0.16 ) {
					if( Y27 < -0.08 ) { return new Prediction("Right", 15, 0); }
					if( Y27 >= -0.08 ) {
						if( Y15 < -0.06 ) { return new Prediction("Left", 7, 0); }
						if( Y15 >= -0.06 ) { return new Prediction("Right", 5, 0); }
					}
				}
			}
		}
		if( Z7 >= 9.96 ) {
			if( X7 >= 0.21 ) {
				if( Z27 >= 9.88 ) {
					if( X17 < 0.23 ) { return new Prediction("Left", 117, 0); }
					if( X17 >= 0.23 ) {
						if( X12 >= 0.23 ) { return new Prediction("Left", 5, 0); }
						if( X12 < 0.23 ) { return new Prediction("Right", 1, 0); }
					}
				}
				if( Z27 < 9.88 ) {
					if( X14 < 0.17 ) { return new Prediction("Right", 21, 0); }
					if( X14 >= 0.17 ) {
						if( X22 >= 0.16 ) {
							if( X12 < 0.32 ) { return new Prediction("Left", 30, 0); }
							if( X12 >= 0.32 ) { return new Prediction("Right", 2, 0); }
						}
						if( X22 < 0.16 ) { return new Prediction("Right", 7, 0); }
					}
				}
			}
			if( X7 < 0.21 ) {
				if( Z31 < 9.61 ) {
					if( Y3 >= -0.03 ) {
						if( Z25 < 9.59 ) {
							if( X8 < 0.14 ) { return new Prediction("Right", 14, 0); }
							if( X8 >= 0.14 ) { return new Prediction("Left", 4, 0); }
						}
						if( Z25 >= 9.59 ) { return new Prediction("Right", 347, 0); }
					}
					if( Y3 < -0.03 ) {
						if( Z28 >= 9.65 ) {
							if( Y24 >= -0.08 ) {
								if( X9 < 0.21 ) {
									if( X20 >= 0.21 ) { return new Prediction("Right", 3, 0); }
									if( X20 < 0.21 ) {
										if( X25 >= 0.2 ) {
											if( X17 < 0.22 ) { return new Prediction("Left", 1, 0); }
											if( X17 >= 0.22 ) { return new Prediction("Right", 1, 0); }
										}
										if( X25 < 0.2 ) { return new Prediction("Left", 29, 0); }
									}
								}
								if( X9 >= 0.21 ) { return new Prediction("Right", 27, 0); }
							}
							if( Y24 < -0.08 ) {
								if( Z15 >= 9.48 ) {
									if( X1 < 0.1 ) { return new Prediction("Left", 1, 0); }
									if( X1 >= 0.1 ) { return new Prediction("Right", 128, 0); }
								}
								if( Z15 < 9.48 ) { return new Prediction("Left", 3, 0); }
							}
						}
						if( Z28 < 9.65 ) { return new Prediction("Left", 27, 0); }
					}
				}
				if( Z31 >= 9.61 ) { return new Prediction("Right", 341, 0); }
			}
		}
		return null;
	}
	private Prediction runTree13() {
		if( X1 >= 0.18 ) {
			if( Z29 >= 9.68 ) {
				if( X15 >= 0.16 ) {
					if( Y25 < -0.08 ) {
						if( X7 >= 0.16 ) { return new Prediction("Left", 7, 0); }
						if( X7 < 0.16 ) { return new Prediction("Right", 38, 0); }
					}
					if( Y25 >= -0.08 ) {
						if( Z13 < 9.43 ) {
							if( X7 < 0.27 ) { return new Prediction("Right", 8, 0); }
							if( X7 >= 0.27 ) { return new Prediction("Left", 1, 0); }
						}
						if( Z13 >= 9.43 ) { return new Prediction("Left", 46, 0); }
					}
				}
				if( X15 < 0.16 ) { return new Prediction("Right", 838, 0); }
			}
			if( Z29 < 9.68 ) {
				if( X13 < 0.15 ) { return new Prediction("Right", 42, 0); }
				if( X13 >= 0.15 ) {
					if( X23 >= 0.15 ) {
						if( Y10 < -0.02 ) {
							if( X5 >= 0.03 ) { return new Prediction("Left", 186, 0); }
							if( X5 < 0.03 ) { return new Prediction("Right", 2, 0); }
						}
						if( Y10 >= -0.02 ) { return new Prediction("Right", 4, 0); }
					}
					if( X23 < 0.15 ) { return new Prediction("Right", 5, 0); }
				}
			}
		}
		if( X1 < 0.18 ) {
			if( X3 >= 0.16 ) {
				if( Z9 < 9.92 ) {
					if( X4 < 0.1 ) { return new Prediction("Right", 7, 0); }
					if( X4 >= 0.1 ) {
						if( Y30 >= -0.08 ) { return new Prediction("Left", 75, 0); }
						if( Y30 < -0.08 ) {
							if( Z16 >= 9.68 ) {
								if( X6 < 0.18 ) {
									if( X27 < 0.2 ) { return new Prediction("Right", 4, 0); }
									if( X27 >= 0.2 ) { return new Prediction("Left", 1, 0); }
								}
								if( X6 >= 0.18 ) { return new Prediction("Left", 3, 0); }
							}
							if( Z16 < 9.68 ) { return new Prediction("Left", 26, 0); }
						}
					}
				}
				if( Z9 >= 9.92 ) {
					if( X23 >= 0.15 ) {
						if( X27 < 0.2 ) { return new Prediction("Left", 27, 0); }
						if( X27 >= 0.2 ) {
							if( X15 >= 0.17 ) { return new Prediction("Left", 1, 0); }
							if( X15 < 0.17 ) { return new Prediction("Right", 3, 0); }
						}
					}
					if( X23 < 0.15 ) { return new Prediction("Right", 38, 0); }
				}
			}
			if( X3 < 0.16 ) {
				if( Z23 >= 9.92 ) {
					if( X26 >= 0.18 ) { return new Prediction("Left", 2, 0); }
					if( X26 < 0.18 ) { return new Prediction("Right", 8, 0); }
				}
				if( Z23 < 9.92 ) {
					if( X19 >= 0.25 ) { return new Prediction("Right", 7, 0); }
					if( X19 < 0.25 ) { return new Prediction("Left", 654, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree14() {
		if( X22 >= 0.16 ) {
			if( X7 >= 0.13 ) {
				if( X20 < 0.24 ) {
					if( X24 < 0.21 ) {
						if( Z26 >= 9.76 ) {
							if( Z13 < 10.04 ) { return new Prediction("Left", 637, 0); }
							if( Z13 >= 10.04 ) { return new Prediction("Right", 1, 0); }
						}
						if( Z26 < 9.76 ) {
							if( X10 < 0.17 ) {
								if( X23 >= 0.17 ) {
									if( Z2 >= 9.65 ) {
										if( X1 < 0.16 ) { return new Prediction("Right", 3, 0); }
										if( X1 >= 0.16 ) { return new Prediction("Left", 4, 0); }
									}
									if( Z2 < 9.65 ) { return new Prediction("Left", 14, 0); }
								}
								if( X23 < 0.17 ) { return new Prediction("Right", 4, 0); }
							}
							if( X10 >= 0.17 ) {
								if( Z22 < 9.7 ) {
									if( Z12 >= 9.71 ) {
										if( X32 < 0.17 ) { return new Prediction("Right", 2, 0); }
										if( X32 >= 0.17 ) { return new Prediction("Left", 4, 0); }
									}
									if( Z12 < 9.71 ) { return new Prediction("Left", 33, 0); }
								}
								if( Z22 >= 9.7 ) { return new Prediction("Left", 202, 0); }
							}
						}
					}
					if( X24 >= 0.21 ) {
						if( X5 < 0.06 ) { return new Prediction("Right", 7, 0); }
						if( X5 >= 0.06 ) { return new Prediction("Left", 8, 0); }
					}
				}
				if( X20 >= 0.24 ) {
					if( X14 < 0.17 ) { return new Prediction("Right", 19, 0); }
					if( X14 >= 0.17 ) { return new Prediction("Left", 9, 0); }
				}
			}
			if( X7 < 0.13 ) {
				if( Z2 >= 9.61 ) { return new Prediction("Left", 70, 0); }
				if( Z2 < 9.61 ) {
					if( Y13 >= -0.06 ) { return new Prediction("Right", 48, 0); }
					if( Y13 < -0.06 ) {
						if( X15 < 0.11 ) { return new Prediction("Right", 17, 0); }
						if( X15 >= 0.11 ) {
							if( Y5 < -0.17 ) { return new Prediction("Left", 19, 0); }
							if( Y5 >= -0.17 ) {
								if( X4 >= 0.25 ) { return new Prediction("Left", 5, 0); }
								if( X4 < 0.25 ) { return new Prediction("Right", 7, 0); }
							}
						}
					}
				}
			}
		}
		if( X22 < 0.16 ) {
			if( X15 >= 0.17 ) {
				if( X29 >= 0.18 ) {
					if( Y5 < -0.2 ) { return new Prediction("Right", 2, 0); }
					if( Y5 >= -0.2 ) { return new Prediction("Left", 23, 0); }
				}
				if( X29 < 0.18 ) {
					if( Y16 >= -0.1 ) {
						if( X22 < 0.13 ) { return new Prediction("Right", 13, 0); }
						if( X22 >= 0.13 ) {
							if( X20 >= 0.15 ) { return new Prediction("Left", 7, 0); }
							if( X20 < 0.15 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( Y16 < -0.1 ) { return new Prediction("Right", 23, 0); }
				}
			}
			if( X15 < 0.17 ) {
				if( Z29 >= 9.65 ) { return new Prediction("Right", 825, 0); }
				if( Z29 < 9.65 ) {
					if( X6 < 0.25 ) {
						if( Z27 >= 9.74 ) { return new Prediction("Right", 18, 0); }
						if( Z27 < 9.74 ) { return new Prediction("Left", 1, 0); }
					}
					if( X6 >= 0.25 ) { return new Prediction("Left", 6, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree15() {
		if( X17 < 0.21 ) {
			if( X10 >= 0.26 ) {
				if( Y28 < -0.06 ) {
					if( X7 < 0.15 ) { return new Prediction("Right", 296, 0); }
					if( X7 >= 0.15 ) {
						if( Y2 >= -0.15 ) {
							if( X19 < 0.22 ) { return new Prediction("Left", 6, 0); }
							if( X19 >= 0.22 ) { return new Prediction("Right", 8, 0); }
						}
						if( Y2 < -0.15 ) { return new Prediction("Left", 9, 0); }
					}
				}
				if( Y28 >= -0.06 ) {
					if( X21 < 0.16 ) { return new Prediction("Right", 5, 0); }
					if( X21 >= 0.16 ) { return new Prediction("Left", 43, 0); }
				}
			}
			if( X10 < 0.26 ) {
				if( X3 >= 0.15 ) {
					if( X14 < 0.13 ) {
						if( Y20 >= 0.02 ) { return new Prediction("Left", 2, 0); }
						if( Y20 < 0.02 ) { return new Prediction("Right", 214, 0); }
					}
					if( X14 >= 0.13 ) {
						if( Z15 >= 9.4 ) {
							if( Z1 >= 9.28 ) {
								if( Y27 < -0.08 ) {
									if( X24 >= 0.18 ) { return new Prediction("Left", 34, 0); }
									if( X24 < 0.18 ) {
										if( X32 < 0.16 ) { return new Prediction("Right", 4, 0); }
										if( X32 >= 0.16 ) {
											if( X22 >= 0.17 ) { return new Prediction("Left", 19, 0); }
											if( X22 < 0.17 ) {
												if( Y13 < -0.09 ) { return new Prediction("Left", 1, 0); }
												if( Y13 >= -0.09 ) { return new Prediction("Right", 2, 0); }
											}
										}
									}
								}
								if( Y27 >= -0.08 ) { return new Prediction("Left", 263, 0); }
							}
							if( Z1 < 9.28 ) { return new Prediction("Right", 5, 0); }
						}
						if( Z15 < 9.4 ) {
							if( Y9 >= -0.08 ) { return new Prediction("Left", 4, 0); }
							if( Y9 < -0.08 ) { return new Prediction("Right", 9, 0); }
						}
					}
				}
				if( X3 < 0.15 ) {
					if( Y32 >= -0.09 ) {
						if( X29 >= 0.22 ) { return new Prediction("Right", 1, 0); }
						if( X29 < 0.22 ) {
							if( X19 >= 0.25 ) { return new Prediction("Right", 1, 0); }
							if( X19 < 0.25 ) { return new Prediction("Left", 599, 0); }
						}
					}
					if( Y32 < -0.09 ) {
						if( X5 < 0.23 ) {
							if( X14 >= 0.07 ) { return new Prediction("Left", 7, 0); }
							if( X14 < 0.07 ) { return new Prediction("Right", 1, 0); }
						}
						if( X5 >= 0.23 ) { return new Prediction("Right", 9, 0); }
					}
				}
			}
		}
		if( X17 >= 0.21 ) {
			if( Z15 >= 9.5 ) {
				if( X28 >= 0.17 ) {
					if( Z22 < 9.59 ) {
						if( Z25 >= 9.86 ) {
							if( Z5 < 9.9 ) { return new Prediction("Right", 8, 0); }
							if( Z5 >= 9.9 ) { return new Prediction("Left", 2, 0); }
						}
						if( Z25 < 9.86 ) { return new Prediction("Right", 175, 0); }
					}
					if( Z22 >= 9.59 ) {
						if( X14 >= 0.15 ) {
							if( X4 >= 0.41 ) { return new Prediction("Right", 2, 0); }
							if( X4 < 0.41 ) {
								if( Y25 < -0.1 ) { return new Prediction("Right", 1, 0); }
								if( Y25 >= -0.1 ) { return new Prediction("Left", 16, 0); }
							}
						}
						if( X14 < 0.15 ) { return new Prediction("Right", 14, 0); }
					}
				}
				if( X28 < 0.17 ) {
					if( Z21 >= 9.72 ) { return new Prediction("Left", 1, 0); }
					if( Z21 < 9.72 ) { return new Prediction("Right", 249, 0); }
				}
			}
			if( Z15 < 9.5 ) {
				if( Z12 < 9.43 ) { return new Prediction("Right", 3, 0); }
				if( Z12 >= 9.43 ) { return new Prediction("Left", 20, 0); }
			}
		}
		return null;
	}
	private Prediction runTree16() {
		if( X15 < 0.13 ) {
			if( Z25 >= 9.93 ) {
				if( X6 >= 0.07 ) { return new Prediction("Left", 8, 0); }
				if( X6 < 0.07 ) { return new Prediction("Right", 1, 0); }
			}
			if( Z25 < 9.93 ) {
				if( X2 < 0.1 ) { return new Prediction("Left", 10, 0); }
				if( X2 >= 0.1 ) {
					if( Z28 >= 9.65 ) { return new Prediction("Right", 857, 0); }
					if( Z28 < 9.65 ) {
						if( X11 >= 0.02 ) { return new Prediction("Left", 2, 0); }
						if( X11 < 0.02 ) { return new Prediction("Right", 1, 0); }
					}
				}
			}
		}
		if( X15 >= 0.13 ) {
			if( Z10 < 9.56 ) {
				if( X22 >= 0.16 ) {
					if( Y5 >= -0.13 ) {
						if( X8 >= 0.13 ) { return new Prediction("Left", 103, 0); }
						if( X8 < 0.13 ) {
							if( X13 < 0.15 ) { return new Prediction("Right", 2, 0); }
							if( X13 >= 0.15 ) { return new Prediction("Left", 6, 0); }
						}
					}
					if( Y5 < -0.13 ) {
						if( X4 < 0.18 ) { return new Prediction("Right", 10, 0); }
						if( X4 >= 0.18 ) { return new Prediction("Left", 3, 0); }
					}
				}
				if( X22 < 0.16 ) {
					if( Z3 >= 9.58 ) {
						if( Z10 < 9.48 ) { return new Prediction("Right", 3, 0); }
						if( Z10 >= 9.48 ) { return new Prediction("Left", 2, 0); }
					}
					if( Z3 < 9.58 ) { return new Prediction("Right", 107, 0); }
				}
			}
			if( Z10 >= 9.56 ) {
				if( X23 >= 0.14 ) {
					if( X1 < 0.21 ) {
						if( Z29 < 9.54 ) {
							if( X3 >= 0.04 ) { return new Prediction("Left", 3, 0); }
							if( X3 < 0.04 ) { return new Prediction("Right", 3, 0); }
						}
						if( Z29 >= 9.54 ) {
							if( X5 < 0.23 ) {
								if( X2 < 0.16 ) { return new Prediction("Left", 244, 0); }
								if( X2 >= 0.16 ) {
									if( Y13 < -0.05 ) {
										if( X29 >= 0.15 ) {
											if( Z5 >= 9.62 ) { return new Prediction("Left", 111, 0); }
											if( Z5 < 9.62 ) { return new Prediction("Right", 1, 0); }
										}
										if( X29 < 0.15 ) {
											if( X2 >= 0.18 ) { return new Prediction("Left", 1, 0); }
											if( X2 < 0.18 ) { return new Prediction("Right", 3, 0); }
										}
									}
									if( Y13 >= -0.05 ) { return new Prediction("Right", 2, 0); }
								}
							}
							if( X5 >= 0.23 ) { return new Prediction("Left", 428, 0); }
						}
					}
					if( X1 >= 0.21 ) {
						if( X10 >= 0.25 ) {
							if( Y29 < -0.07 ) { return new Prediction("Right", 11, 0); }
							if( Y29 >= -0.07 ) { return new Prediction("Left", 6, 0); }
						}
						if( X10 < 0.25 ) {
							if( X18 >= 0.14 ) { return new Prediction("Left", 76, 0); }
							if( X18 < 0.14 ) { return new Prediction("Right", 5, 0); }
						}
					}
				}
				if( X23 < 0.14 ) { return new Prediction("Right", 24, 0); }
			}
		}
		return null;
	}
	private Prediction runTree17() {
		if( X2 >= 0.18 ) {
			if( X15 >= 0.16 ) {
				if( X18 < 0.23 ) {
					if( Z2 >= 9.38 ) {
						if( X12 < 0.15 ) {
							if( X11 < 0.16 ) { return new Prediction("Right", 3, 0); }
							if( X11 >= 0.16 ) { return new Prediction("Left", 2, 0); }
						}
						if( X12 >= 0.15 ) {
							if( Y8 < -0.21 ) {
								if( Y8 < -0.23 ) { return new Prediction("Left", 3, 0); }
								if( Y8 >= -0.23 ) { return new Prediction("Right", 1, 0); }
							}
							if( Y8 >= -0.21 ) { return new Prediction("Left", 220, 0); }
						}
					}
					if( Z2 < 9.38 ) {
						if( Z2 < 9.26 ) { return new Prediction("Right", 17, 0); }
						if( Z2 >= 9.26 ) {
							if( X1 >= 0.26 ) { return new Prediction("Right", 3, 0); }
							if( X1 < 0.26 ) { return new Prediction("Left", 1, 0); }
						}
					}
				}
				if( X18 >= 0.23 ) {
					if( X28 < 0.24 ) { return new Prediction("Right", 39, 0); }
					if( X28 >= 0.24 ) { return new Prediction("Left", 3, 0); }
				}
			}
			if( X15 < 0.16 ) {
				if( Z15 < 9.95 ) {
					if( Z21 >= 9.65 ) {
						if( Y26 >= -0.07 ) {
							if( Y12 >= -0.15 ) { return new Prediction("Left", 3, 0); }
							if( Y12 < -0.15 ) { return new Prediction("Right", 1, 0); }
						}
						if( Y26 < -0.07 ) {
							if( Z14 >= 9.85 ) { return new Prediction("Left", 1, 0); }
							if( Z14 < 9.85 ) { return new Prediction("Right", 40, 0); }
						}
					}
					if( Z21 < 9.65 ) { return new Prediction("Right", 797, 0); }
				}
				if( Z15 >= 9.95 ) {
					if( Z23 >= 9.81 ) { return new Prediction("Left", 8, 0); }
					if( Z23 < 9.81 ) {
						if( Z1 >= 9.55 ) { return new Prediction("Left", 2, 0); }
						if( Z1 < 9.55 ) { return new Prediction("Right", 35, 0); }
					}
				}
			}
		}
		if( X2 < 0.18 ) {
			if( X31 < 0.15 ) {
				if( Z10 < 9.63 ) { return new Prediction("Left", 1, 0); }
				if( Z10 >= 9.63 ) { return new Prediction("Right", 26, 0); }
			}
			if( X31 >= 0.15 ) {
				if( X22 >= 0.16 ) {
					if( X25 < 0.13 ) { return new Prediction("Right", 5, 0); }
					if( X25 >= 0.13 ) {
						if( X11 < 0.22 ) {
							if( Y26 < -0.04 ) { return new Prediction("Left", 663, 0); }
							if( Y26 >= -0.04 ) {
								if( X10 < 0.05 ) { return new Prediction("Right", 1, 0); }
								if( X10 >= 0.05 ) { return new Prediction("Left", 2, 0); }
							}
						}
						if( X11 >= 0.22 ) {
							if( Z14 >= 10.12 ) { return new Prediction("Right", 6, 0); }
							if( Z14 < 10.12 ) {
								if( X14 < 0.13 ) { return new Prediction("Right", 5, 0); }
								if( X14 >= 0.13 ) {
									if( Y19 < -0.12 ) { return new Prediction("Right", 1, 0); }
									if( Y19 >= -0.12 ) { return new Prediction("Left", 114, 0); }
								}
							}
						}
					}
				}
				if( X22 < 0.16 ) {
					if( Y14 >= -0.08 ) {
						if( Y17 >= -0.06 ) { return new Prediction("Left", 1, 0); }
						if( Y17 < -0.06 ) { return new Prediction("Right", 22, 0); }
					}
					if( Y14 < -0.08 ) {
						if( X23 < 0.19 ) { return new Prediction("Left", 6, 0); }
						if( X23 >= 0.19 ) { return new Prediction("Right", 1, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree18() {
		if( X32 < 0.17 ) {
			if( Z7 < 9.96 ) {
				if( X7 >= 0.13 ) {
					if( X20 >= 0.15 ) {
						if( X16 < 0.07 ) { return new Prediction("Right", 3, 0); }
						if( X16 >= 0.07 ) {
							if( Z26 >= 9.74 ) { return new Prediction("Left", 83, 0); }
							if( Z26 < 9.74 ) {
								if( Z13 >= 9.73 ) { return new Prediction("Left", 20, 0); }
								if( Z13 < 9.73 ) {
									if( Y31 >= -0.06 ) { return new Prediction("Left", 1, 0); }
									if( Y31 < -0.06 ) { return new Prediction("Right", 2, 0); }
								}
							}
						}
					}
					if( X20 < 0.15 ) {
						if( X23 >= 0.1 ) { return new Prediction("Right", 6, 0); }
						if( X23 < 0.1 ) { return new Prediction("Left", 1, 0); }
					}
				}
				if( X7 < 0.13 ) {
					if( Y28 < -0.06 ) { return new Prediction("Right", 30, 0); }
					if( Y28 >= -0.06 ) { return new Prediction("Left", 4, 0); }
				}
			}
			if( Z7 >= 9.96 ) {
				if( X14 < 0.17 ) {
					if( X3 >= 0.16 ) { return new Prediction("Right", 728, 0); }
					if( X3 < 0.16 ) {
						if( Z5 < 9.84 ) { return new Prediction("Right", 15, 0); }
						if( Z5 >= 9.84 ) { return new Prediction("Left", 3, 0); }
					}
				}
				if( X14 >= 0.17 ) {
					if( X10 >= 0.19 ) {
						if( Z4 < 9.95 ) { return new Prediction("Right", 14, 0); }
						if( Z4 >= 9.95 ) { return new Prediction("Left", 2, 0); }
					}
					if( X10 < 0.19 ) {
						if( X19 < 0.23 ) {
							if( X2 < 0.23 ) { return new Prediction("Left", 22, 0); }
							if( X2 >= 0.23 ) { return new Prediction("Right", 1, 0); }
						}
						if( X19 >= 0.23 ) { return new Prediction("Right", 5, 0); }
					}
				}
			}
		}
		if( X32 >= 0.17 ) {
			if( X14 >= 0.14 ) {
				if( X19 < 0.14 ) { return new Prediction("Right", 17, 0); }
				if( X19 >= 0.14 ) {
					if( X7 >= 0.09 ) {
						if( Y20 >= -0.09 ) { return new Prediction("Left", 741, 0); }
						if( Y20 < -0.09 ) {
							if( Y21 >= -0.09 ) { return new Prediction("Left", 37, 0); }
							if( Y21 < -0.09 ) {
								if( X3 < 0.03 ) { return new Prediction("Right", 2, 0); }
								if( X3 >= 0.03 ) {
									if( X20 >= 0.17 ) { return new Prediction("Left", 15, 0); }
									if( X20 < 0.17 ) { return new Prediction("Right", 1, 0); }
								}
							}
						}
					}
					if( X7 < 0.09 ) {
						if( Z4 >= 9.57 ) {
							if( X15 >= 0.15 ) { return new Prediction("Left", 48, 0); }
							if( X15 < 0.15 ) { return new Prediction("Right", 1, 0); }
						}
						if( Z4 < 9.57 ) { return new Prediction("Right", 11, 0); }
					}
				}
			}
			if( X14 < 0.14 ) {
				if( X8 < 0.14 ) {
					if( X2 < 0.1 ) { return new Prediction("Left", 2, 0); }
					if( X2 >= 0.1 ) { return new Prediction("Right", 173, 0); }
				}
				if( X8 >= 0.14 ) {
					if( Y5 >= -0.1 ) { return new Prediction("Left", 36, 0); }
					if( Y5 < -0.1 ) { return new Prediction("Right", 9, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree19() {
		if( Z17 < 9.67 ) {
			if( X3 < 0.03 ) { return new Prediction("Right", 6, 0); }
			if( X3 >= 0.03 ) {
				if( X24 < 0.21 ) {
					if( Y1 >= -0.14 ) { return new Prediction("Left", 249, 0); }
					if( Y1 < -0.14 ) {
						if( X15 >= 0.16 ) { return new Prediction("Left", 3, 0); }
						if( X15 < 0.16 ) { return new Prediction("Right", 2, 0); }
					}
				}
				if( X24 >= 0.21 ) { return new Prediction("Right", 4, 0); }
			}
		}
		if( Z17 >= 9.67 ) {
			if( X23 >= 0.15 ) {
				if( X21 >= 0.15 ) {
					if( X32 < 0.16 ) {
						if( X1 >= 0.19 ) {
							if( Z28 < 9.7 ) {
								if( X23 < 0.19 ) { return new Prediction("Left", 8, 0); }
								if( X23 >= 0.19 ) { return new Prediction("Right", 2, 0); }
							}
							if( Z28 >= 9.7 ) {
								if( Z17 < 9.83 ) { return new Prediction("Left", 1, 0); }
								if( Z17 >= 9.83 ) { return new Prediction("Right", 66, 0); }
							}
						}
						if( X1 < 0.19 ) {
							if( Z27 >= 9.76 ) { return new Prediction("Left", 57, 0); }
							if( Z27 < 9.76 ) { return new Prediction("Right", 1, 0); }
						}
					}
					if( X32 >= 0.16 ) {
						if( X15 < 0.12 ) {
							if( X19 < 0.22 ) { return new Prediction("Left", 10, 0); }
							if( X19 >= 0.22 ) { return new Prediction("Right", 20, 0); }
						}
						if( X15 >= 0.12 ) {
							if( X19 < 0.14 ) { return new Prediction("Right", 2, 0); }
							if( X19 >= 0.14 ) {
								if( X14 >= 0.15 ) { return new Prediction("Left", 672, 0); }
								if( X14 < 0.15 ) {
									if( X8 >= 0.12 ) { return new Prediction("Left", 44, 0); }
									if( X8 < 0.12 ) {
										if( Y27 < -0.08 ) { return new Prediction("Right", 4, 0); }
										if( Y27 >= -0.08 ) { return new Prediction("Left", 1, 0); }
									}
								}
							}
						}
					}
				}
				if( X21 < 0.15 ) {
					if( Z1 >= 9.79 ) { return new Prediction("Left", 1, 0); }
					if( Z1 < 9.79 ) { return new Prediction("Right", 330, 0); }
				}
			}
			if( X23 < 0.15 ) {
				if( X3 >= 0.16 ) { return new Prediction("Right", 535, 0); }
				if( X3 < 0.16 ) {
					if( Z4 >= 9.42 ) {
						if( X14 < 0.17 ) { return new Prediction("Right", 12, 0); }
						if( X14 >= 0.17 ) { return new Prediction("Left", 1, 0); }
					}
					if( Z4 < 9.42 ) { return new Prediction("Left", 2, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree20() {
		if( X14 >= 0.15 ) {
			if( Z9 >= 9.35 ) {
				if( X25 >= 0.14 ) {
					if( X22 >= 0.15 ) {
						if( Z14 >= 10.07 ) {
							if( X29 < 0.17 ) { return new Prediction("Right", 5, 0); }
							if( X29 >= 0.17 ) { return new Prediction("Left", 2, 0); }
						}
						if( Z14 < 10.07 ) {
							if( Y16 < -0.14 ) {
								if( X24 < 0.14 ) { return new Prediction("Right", 4, 0); }
								if( X24 >= 0.14 ) { return new Prediction("Left", 9, 0); }
							}
							if( Y16 >= -0.14 ) {
								if( Y31 < -0.09 ) {
									if( X18 >= 0.15 ) { return new Prediction("Left", 6, 0); }
									if( X18 < 0.15 ) { return new Prediction("Right", 2, 0); }
								}
								if( Y31 >= -0.09 ) {
									if( X29 >= 0.15 ) {
										if( Y32 >= -0.09 ) { return new Prediction("Left", 875, 0); }
										if( Y32 < -0.09 ) {
											if( Y12 < -0.08 ) {
												if( X15 < 0.19 ) {
													if( X4 >= 0.17 ) { return new Prediction("Left", 2, 0); }
													if( X4 < 0.17 ) { return new Prediction("Right", 1, 0); }
												}
												if( X15 >= 0.19 ) { return new Prediction("Left", 7, 0); }
											}
											if( Y12 >= -0.08 ) { return new Prediction("Left", 32, 0); }
										}
									}
									if( X29 < 0.15 ) {
										if( X11 >= 0.18 ) { return new Prediction("Left", 8, 0); }
										if( X11 < 0.18 ) {
											if( X11 >= 0.18 ) { return new Prediction("Right", 1, 0); }
											if( X11 < 0.18 ) { return new Prediction("Left", 1, 0); }
										}
									}
								}
							}
						}
					}
					if( X22 < 0.15 ) { return new Prediction("Right", 27, 0); }
				}
				if( X25 < 0.14 ) {
					if( X3 < 0.14 ) { return new Prediction("Left", 3, 0); }
					if( X3 >= 0.14 ) {
						if( Z15 >= 9.78 ) { return new Prediction("Left", 1, 0); }
						if( Z15 < 9.78 ) { return new Prediction("Right", 14, 0); }
					}
				}
			}
			if( Z9 < 9.35 ) {
				if( Z27 < 9.71 ) {
					if( X3 >= -0.01 ) { return new Prediction("Left", 17, 0); }
					if( X3 < -0.01 ) { return new Prediction("Right", 1, 0); }
				}
				if( Z27 >= 9.71 ) {
					if( X22 < 0.19 ) { return new Prediction("Right", 41, 0); }
					if( X22 >= 0.19 ) { return new Prediction("Left", 1, 0); }
				}
			}
		}
		if( X14 < 0.15 ) {
			if( X3 >= 0.16 ) {
				if( Z30 >= 9.6 ) { return new Prediction("Right", 675, 0); }
				if( Z30 < 9.6 ) {
					if( Z12 < 9.54 ) { return new Prediction("Right", 212, 0); }
					if( Z12 >= 9.54 ) {
						if( Y14 < -0.04 ) { return new Prediction("Left", 13, 0); }
						if( Y14 >= -0.04 ) { return new Prediction("Right", 3, 0); }
					}
				}
			}
			if( X3 < 0.16 ) {
				if( X21 < 0.16 ) { return new Prediction("Right", 11, 0); }
				if( X21 >= 0.16 ) {
					if( Y6 < -0.12 ) {
						if( X2 >= 0.11 ) { return new Prediction("Right", 3, 0); }
						if( X2 < 0.11 ) { return new Prediction("Left", 2, 0); }
					}
					if( Y6 >= -0.12 ) { return new Prediction("Left", 54, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree21() {
		if( X2 >= 0.18 ) {
			if( Z29 < 9.7 ) {
				if( Z3 < 9.55 ) {
					if( Z26 < 9.78 ) {
						if( Y1 >= -0.15 ) { return new Prediction("Left", 29, 0); }
						if( Y1 < -0.15 ) { return new Prediction("Right", 1, 0); }
					}
					if( Z26 >= 9.78 ) { return new Prediction("Right", 65, 0); }
				}
				if( Z3 >= 9.55 ) {
					if( X13 >= 0.13 ) {
						if( X4 < 0.03 ) { return new Prediction("Right", 1, 0); }
						if( X4 >= 0.03 ) { return new Prediction("Left", 175, 0); }
					}
					if( X13 < 0.13 ) { return new Prediction("Right", 11, 0); }
				}
			}
			if( Z29 >= 9.7 ) {
				if( X7 < 0.14 ) { return new Prediction("Right", 822, 0); }
				if( X7 >= 0.14 ) {
					if( Y2 >= -0.09 ) {
						if( Z20 < 9.85 ) {
							if( Y7 >= 0 ) { return new Prediction("Right", 2, 0); }
							if( Y7 < 0 ) {
								if( Y12 < -0.08 ) {
									if( X8 >= 0.19 ) { return new Prediction("Left", 1, 0); }
									if( X8 < 0.19 ) { return new Prediction("Right", 1, 0); }
								}
								if( Y12 >= -0.08 ) { return new Prediction("Left", 30, 0); }
							}
						}
						if( Z20 >= 9.85 ) { return new Prediction("Right", 10, 0); }
					}
					if( Y2 < -0.09 ) { return new Prediction("Right", 34, 0); }
				}
			}
		}
		if( X2 < 0.18 ) {
			if( Z7 >= 9.99 ) {
				if( Z12 < 9.47 ) {
					if( Z26 >= 9.85 ) {
						if( X3 >= 0.17 ) { return new Prediction("Right", 7, 0); }
						if( X3 < 0.17 ) { return new Prediction("Left", 31, 0); }
					}
					if( Z26 < 9.85 ) { return new Prediction("Right", 36, 0); }
				}
				if( Z12 >= 9.47 ) {
					if( X19 < 0.15 ) { return new Prediction("Right", 3, 0); }
					if( X19 >= 0.15 ) { return new Prediction("Left", 108, 0); }
				}
			}
			if( Z7 < 9.99 ) {
				if( X4 >= -0.03 ) {
					if( Y22 < -0.08 ) {
						if( Y31 < -0.1 ) {
							if( X11 < 0.17 ) { return new Prediction("Right", 4, 0); }
							if( X11 >= 0.17 ) { return new Prediction("Left", 1, 0); }
						}
						if( Y31 >= -0.1 ) {
							if( X14 < 0.12 ) { return new Prediction("Right", 2, 0); }
							if( X14 >= 0.12 ) { return new Prediction("Left", 79, 0); }
						}
					}
					if( Y22 >= -0.08 ) {
						if( X19 >= 0.18 ) { return new Prediction("Left", 489, 0); }
						if( X19 < 0.18 ) {
							if( Y32 >= -0.08 ) { return new Prediction("Left", 66, 0); }
							if( Y32 < -0.08 ) {
								if( X27 < 0.17 ) {
									if( X9 >= 0.19 ) { return new Prediction("Right", 1, 0); }
									if( X9 < 0.19 ) { return new Prediction("Left", 2, 0); }
								}
								if( X27 >= 0.17 ) { return new Prediction("Left", 9, 0); }
							}
						}
					}
				}
				if( X4 < -0.03 ) {
					if( X20 < 0.18 ) { return new Prediction("Right", 8, 0); }
					if( X20 >= 0.18 ) { return new Prediction("Left", 5, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree22() {
		if( Z8 >= 9.96 ) {
			if( X31 >= 0.18 ) {
				if( X1 >= 0.19 ) {
					if( X15 >= 0.16 ) {
						if( X22 >= 0.15 ) { return new Prediction("Left", 29, 0); }
						if( X22 < 0.15 ) { return new Prediction("Right", 2, 0); }
					}
					if( X15 < 0.16 ) { return new Prediction("Right", 39, 0); }
				}
				if( X1 < 0.19 ) {
					if( Y31 < -0.08 ) {
						if( X6 >= 0.3 ) { return new Prediction("Left", 2, 0); }
						if( X6 < 0.3 ) { return new Prediction("Right", 2, 0); }
					}
					if( Y31 >= -0.08 ) { return new Prediction("Left", 131, 0); }
				}
			}
			if( X31 < 0.18 ) {
				if( X2 < 0.14 ) {
					if( Y20 >= -0.11 ) { return new Prediction("Left", 25, 0); }
					if( Y20 < -0.11 ) { return new Prediction("Right", 1, 0); }
				}
				if( X2 >= 0.14 ) {
					if( Z3 < 9.86 ) {
						if( X8 >= 0.19 ) {
							if( Z18 < 10.01 ) {
								if( Y30 < -0.05 ) {
									if( Y25 >= -0.06 ) {
										if( X5 < 0.42 ) { return new Prediction("Left", 1, 0); }
										if( X5 >= 0.42 ) { return new Prediction("Right", 1, 0); }
									}
									if( Y25 < -0.06 ) { return new Prediction("Right", 37, 0); }
								}
								if( Y30 >= -0.05 ) { return new Prediction("Left", 2, 0); }
							}
							if( Z18 >= 10.01 ) { return new Prediction("Left", 6, 0); }
						}
						if( X8 < 0.19 ) {
							if( Z3 < 9.56 ) { return new Prediction("Right", 804, 0); }
							if( Z3 >= 9.56 ) {
								if( Y28 < -0.07 ) {
									if( Z12 < 9.58 ) { return new Prediction("Right", 46, 0); }
									if( Z12 >= 9.58 ) { return new Prediction("Left", 1, 0); }
								}
								if( Y28 >= -0.07 ) {
									if( X26 >= 0.19 ) { return new Prediction("Right", 1, 0); }
									if( X26 < 0.19 ) { return new Prediction("Left", 2, 0); }
								}
							}
						}
					}
					if( Z3 >= 9.86 ) { return new Prediction("Left", 5, 0); }
				}
			}
		}
		if( Z8 < 9.96 ) {
			if( X17 < 0.22 ) {
				if( X19 < 0.14 ) {
					if( X5 >= 0.3 ) {
						if( Y11 >= -0.08 ) { return new Prediction("Left", 4, 0); }
						if( Y11 < -0.08 ) { return new Prediction("Right", 1, 0); }
					}
					if( X5 < 0.3 ) {
						if( X12 < 0.28 ) { return new Prediction("Right", 15, 0); }
						if( X12 >= 0.28 ) { return new Prediction("Left", 1, 0); }
					}
				}
				if( X19 >= 0.14 ) {
					if( Z10 < 9.92 ) {
						if( X31 < 0.15 ) { return new Prediction("Right", 5, 0); }
						if( X31 >= 0.15 ) {
							if( X21 >= 0.14 ) {
								if( Z13 >= 10.1 ) { return new Prediction("Right", 3, 0); }
								if( Z13 < 10.1 ) {
									if( X8 >= 0.11 ) {
										if( Y30 >= -0.08 ) { return new Prediction("Left", 509, 0); }
										if( Y30 < -0.08 ) {
											if( Y3 < -0.09 ) {
												if( Z18 < 9.66 ) { return new Prediction("Left", 23, 0); }
												if( Z18 >= 9.66 ) {
													if( Y4 < -0.08 ) { return new Prediction("Left", 6, 0); }
													if( Y4 >= -0.08 ) { return new Prediction("Right", 1, 0); }
												}
											}
											if( Y3 >= -0.09 ) { return new Prediction("Left", 149, 0); }
										}
									}
									if( X8 < 0.11 ) {
										if( Z3 >= 9.6 ) { return new Prediction("Left", 45, 0); }
										if( Z3 < 9.6 ) {
											if( X22 >= 0.16 ) { return new Prediction("Left", 2, 0); }
											if( X22 < 0.16 ) { return new Prediction("Right", 2, 0); }
										}
									}
								}
							}
							if( X21 < 0.14 ) { return new Prediction("Right", 3, 0); }
						}
					}
					if( Z10 >= 9.92 ) {
						if( X14 < 0.13 ) { return new Prediction("Right", 20, 0); }
						if( X14 >= 0.13 ) {
							if( Z23 >= 9.73 ) { return new Prediction("Right", 2, 0); }
							if( Z23 < 9.73 ) {
								if( Z27 < 9.73 ) { return new Prediction("Right", 1, 0); }
								if( Z27 >= 9.73 ) { return new Prediction("Left", 69, 0); }
							}
						}
					}
				}
			}
			if( X17 >= 0.22 ) {
				if( X21 >= 0.15 ) {
					if( Z13 >= 9.95 ) { return new Prediction("Right", 1, 0); }
					if( Z13 < 9.95 ) { return new Prediction("Left", 10, 0); }
				}
				if( X21 < 0.15 ) { return new Prediction("Right", 24, 0); }
			}
		}
		return null;
	}
	private Prediction runTree23() {
		if( Z1 >= 9.43 ) {
			if( X23 >= 0.16 ) {
				if( X2 >= 0.19 ) {
					if( X32 < 0.16 ) {
						if( X14 >= 0.18 ) { return new Prediction("Left", 6, 0); }
						if( X14 < 0.18 ) { return new Prediction("Right", 37, 0); }
					}
					if( X32 >= 0.16 ) {
						if( X13 < 0.14 ) { return new Prediction("Right", 18, 0); }
						if( X13 >= 0.14 ) {
							if( X14 < 0.16 ) {
								if( X28 < 0.19 ) {
									if( Z7 < 10.02 ) { return new Prediction("Left", 11, 0); }
									if( Z7 >= 10.02 ) {
										if( X3 < 0.36 ) { return new Prediction("Right", 2, 0); }
										if( X3 >= 0.36 ) { return new Prediction("Left", 3, 0); }
									}
								}
								if( X28 >= 0.19 ) { return new Prediction("Right", 3, 0); }
							}
							if( X14 >= 0.16 ) { return new Prediction("Left", 195, 0); }
						}
					}
				}
				if( X2 < 0.19 ) {
					if( Z8 >= 9.16 ) {
						if( Z23 >= 9.71 ) {
							if( Z17 >= 9.86 ) { return new Prediction("Left", 91, 0); }
							if( Z17 < 9.86 ) {
								if( Z31 < 9.63 ) { return new Prediction("Right", 3, 0); }
								if( Z31 >= 9.63 ) {
									if( X30 < 0.17 ) {
										if( Z23 >= 9.72 ) {
											if( X4 < 0.33 ) { return new Prediction("Left", 27, 0); }
											if( X4 >= 0.33 ) { return new Prediction("Right", 1, 0); }
										}
										if( Z23 < 9.72 ) { return new Prediction("Right", 3, 0); }
									}
									if( X30 >= 0.17 ) { return new Prediction("Left", 61, 0); }
								}
							}
						}
						if( Z23 < 9.71 ) {
							if( X15 >= 0.04 ) { return new Prediction("Left", 509, 0); }
							if( X15 < 0.04 ) { return new Prediction("Right", 1, 0); }
						}
					}
					if( Z8 < 9.16 ) { return new Prediction("Right", 7, 0); }
				}
			}
			if( X23 < 0.16 ) {
				if( X14 < 0.16 ) {
					if( Z7 < 9.78 ) { return new Prediction("Left", 2, 0); }
					if( Z7 >= 9.78 ) {
						if( Z29 < 9.62 ) { return new Prediction("Left", 1, 0); }
						if( Z29 >= 9.62 ) { return new Prediction("Right", 207, 0); }
					}
				}
				if( X14 >= 0.16 ) {
					if( Z18 >= 9.81 ) {
						if( X3 < 0.14 ) { return new Prediction("Left", 14, 0); }
						if( X3 >= 0.14 ) {
							if( X29 >= 0.18 ) { return new Prediction("Right", 14, 0); }
							if( X29 < 0.18 ) {
								if( X17 < 0.22 ) { return new Prediction("Left", 6, 0); }
								if( X17 >= 0.22 ) { return new Prediction("Right", 5, 0); }
							}
						}
					}
					if( Z18 < 9.81 ) { return new Prediction("Left", 18, 0); }
				}
			}
		}
		if( Z1 < 9.43 ) {
			if( Z23 >= 9.37 ) {
				if( X3 >= 0.15 ) {
					if( Z8 >= 10 ) { return new Prediction("Right", 667, 0); }
					if( Z8 < 10 ) {
						if( X2 >= 0.25 ) { return new Prediction("Right", 38, 0); }
						if( X2 < 0.25 ) {
							if( X7 < 0.07 ) { return new Prediction("Right", 2, 0); }
							if( X7 >= 0.07 ) { return new Prediction("Left", 6, 0); }
						}
					}
				}
				if( X3 < 0.15 ) {
					if( X1 >= 0.18 ) { return new Prediction("Right", 10, 0); }
					if( X1 < 0.18 ) {
						if( X4 < 0.03 ) { return new Prediction("Right", 2, 0); }
						if( X4 >= 0.03 ) { return new Prediction("Left", 42, 0); }
					}
				}
			}
			if( Z23 < 9.37 ) {
				if( X31 < 0.15 ) { return new Prediction("Right", 1, 0); }
				if( X31 >= 0.15 ) { return new Prediction("Left", 20, 0); }
			}
		}
		return null;
	}
	private Prediction runTree24() {
		if( X31 < 0.17 ) {
			if( Z7 >= 9.91 ) {
				if( Z17 >= 9.99 ) {
					if( X1 < 0.14 ) { return new Prediction("Left", 6, 0); }
					if( X1 >= 0.14 ) { return new Prediction("Right", 509, 0); }
				}
				if( Z17 < 9.99 ) {
					if( Z5 < 9.95 ) {
						if( X5 < 0.23 ) {
							if( X1 < 0.08 ) { return new Prediction("Left", 2, 0); }
							if( X1 >= 0.08 ) { return new Prediction("Right", 240, 0); }
						}
						if( X5 >= 0.23 ) {
							if( X28 >= 0.17 ) {
								if( Y1 >= -0.03 ) { return new Prediction("Left", 3, 0); }
								if( Y1 < -0.03 ) {
									if( Y14 >= -0.09 ) { return new Prediction("Right", 66, 0); }
									if( Y14 < -0.09 ) {
										if( X1 < 0.3 ) { return new Prediction("Right", 2, 0); }
										if( X1 >= 0.3 ) { return new Prediction("Left", 1, 0); }
									}
								}
							}
							if( X28 < 0.17 ) {
								if( X9 < 0.33 ) { return new Prediction("Left", 12, 0); }
								if( X9 >= 0.33 ) { return new Prediction("Right", 2, 0); }
							}
						}
					}
					if( Z5 >= 9.95 ) {
						if( Z2 >= 9.65 ) { return new Prediction("Left", 11, 0); }
						if( Z2 < 9.65 ) {
							if( X10 >= 0.14 ) { return new Prediction("Right", 9, 0); }
							if( X10 < 0.14 ) { return new Prediction("Left", 2, 0); }
						}
					}
				}
			}
			if( Z7 < 9.91 ) {
				if( X19 < 0.14 ) {
					if( X16 < 0.11 ) { return new Prediction("Left", 1, 0); }
					if( X16 >= 0.11 ) { return new Prediction("Right", 9, 0); }
				}
				if( X19 >= 0.14 ) {
					if( Z8 < 10.04 ) {
						if( Z20 < 9.87 ) {
							if( Z10 < 9.23 ) {
								if( X5 >= 0.29 ) { return new Prediction("Left", 2, 0); }
								if( X5 < 0.29 ) { return new Prediction("Right", 4, 0); }
							}
							if( Z10 >= 9.23 ) {
								if( Z4 >= 9.75 ) {
									if( Y2 >= -0.09 ) {
										if( Z21 < 9.71 ) { return new Prediction("Right", 5, 0); }
										if( Z21 >= 9.71 ) { return new Prediction("Left", 4, 0); }
									}
									if( Y2 < -0.09 ) { return new Prediction("Left", 19, 0); }
								}
								if( Z4 < 9.75 ) { return new Prediction("Left", 99, 0); }
							}
						}
						if( Z20 >= 9.87 ) { return new Prediction("Right", 4, 0); }
					}
					if( Z8 >= 10.04 ) { return new Prediction("Right", 8, 0); }
				}
			}
		}
		if( X31 >= 0.17 ) {
			if( X10 < 0.23 ) {
				if( X19 >= 0.24 ) {
					if( X16 >= 0.17 ) { return new Prediction("Left", 3, 0); }
					if( X16 < 0.17 ) { return new Prediction("Right", 16, 0); }
				}
				if( X19 < 0.24 ) {
					if( X25 >= 0.14 ) {
						if( X12 < 0.08 ) {
							if( Z10 < 9.66 ) { return new Prediction("Right", 6, 0); }
							if( Z10 >= 9.66 ) { return new Prediction("Left", 14, 0); }
						}
						if( X12 >= 0.08 ) {
							if( X15 < 0.11 ) {
								if( X8 >= 0.13 ) { return new Prediction("Left", 3, 0); }
								if( X8 < 0.13 ) { return new Prediction("Right", 6, 0); }
							}
							if( X15 >= 0.11 ) {
								if( Y19 < -0.11 ) {
									if( X8 < 0.26 ) { return new Prediction("Right", 3, 0); }
									if( X8 >= 0.26 ) { return new Prediction("Left", 1, 0); }
								}
								if( Y19 >= -0.11 ) {
									if( X18 >= 0.14 ) { return new Prediction("Left", 710, 0); }
									if( X18 < 0.14 ) {
										if( Y29 >= -0.09 ) { return new Prediction("Left", 77, 0); }
										if( Y29 < -0.09 ) { return new Prediction("Right", 1, 0); }
									}
								}
							}
						}
					}
					if( X25 < 0.14 ) { return new Prediction("Right", 12, 0); }
				}
			}
			if( X10 >= 0.23 ) {
				if( Z1 >= 9.51 ) {
					if( Y6 >= -0.22 ) { return new Prediction("Left", 27, 0); }
					if( Y6 < -0.22 ) {
						if( X13 >= 0.23 ) { return new Prediction("Left", 5, 0); }
						if( X13 < 0.23 ) { return new Prediction("Right", 5, 0); }
					}
				}
				if( Z1 < 9.51 ) {
					if( Z12 >= 9.66 ) { return new Prediction("Left", 7, 0); }
					if( Z12 < 9.66 ) {
						if( X14 >= 0.19 ) {
							if( X23 >= 0.16 ) { return new Prediction("Left", 3, 0); }
							if( X23 < 0.16 ) { return new Prediction("Right", 4, 0); }
						}
						if( X14 < 0.19 ) { return new Prediction("Right", 110, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree25() {
		if( Z13 < 9.48 ) {
			if( X32 < 0.17 ) {
				if( X14 < 0.17 ) {
					if( Z26 < 9.99 ) {
						if( X5 >= 0.22 ) {
							if( Y4 < 0.03 ) {
								if( Z6 >= 10.14 ) {
									if( Z1 >= 9.55 ) { return new Prediction("Left", 1, 0); }
									if( Z1 < 9.55 ) { return new Prediction("Right", 13, 0); }
								}
								if( Z6 < 10.14 ) { return new Prediction("Right", 102, 0); }
							}
							if( Y4 >= 0.03 ) { return new Prediction("Left", 3, 0); }
						}
						if( X5 < 0.22 ) { return new Prediction("Right", 531, 0); }
					}
					if( Z26 >= 9.99 ) {
						if( X17 < 0.2 ) { return new Prediction("Left", 7, 0); }
						if( X17 >= 0.2 ) { return new Prediction("Right", 2, 0); }
					}
				}
				if( X14 >= 0.17 ) {
					if( X22 >= 0.15 ) {
						if( X24 < 0.14 ) { return new Prediction("Right", 10, 0); }
						if( X24 >= 0.14 ) {
							if( X25 < 0.13 ) { return new Prediction("Right", 2, 0); }
							if( X25 >= 0.13 ) { return new Prediction("Left", 67, 0); }
						}
					}
					if( X22 < 0.15 ) { return new Prediction("Right", 26, 0); }
				}
			}
			if( X32 >= 0.17 ) {
				if( X3 < 0.18 ) {
					if( X14 < 0.12 ) {
						if( X3 < 0.1 ) { return new Prediction("Left", 7, 0); }
						if( X3 >= 0.1 ) { return new Prediction("Right", 9, 0); }
					}
					if( X14 >= 0.12 ) { return new Prediction("Left", 259, 0); }
				}
				if( X3 >= 0.18 ) {
					if( Y29 >= -0.08 ) {
						if( Y7 < -0.1 ) {
							if( Y2 < -0.32 ) { return new Prediction("Left", 1, 0); }
							if( Y2 >= -0.32 ) { return new Prediction("Right", 25, 0); }
						}
						if( Y7 >= -0.1 ) {
							if( Z28 >= 9.67 ) {
								if( X29 >= 0.19 ) {
									if( X9 >= 0.36 ) { return new Prediction("Right", 2, 0); }
									if( X9 < 0.36 ) { return new Prediction("Left", 10, 0); }
								}
								if( X29 < 0.19 ) {
									if( X28 >= 0.17 ) { return new Prediction("Right", 25, 0); }
									if( X28 < 0.17 ) { return new Prediction("Left", 1, 0); }
								}
							}
							if( Z28 < 9.67 ) { return new Prediction("Left", 41, 0); }
						}
					}
					if( Y29 < -0.08 ) {
						if( X23 >= 0.23 ) { return new Prediction("Left", 2, 0); }
						if( X23 < 0.23 ) { return new Prediction("Right", 107, 0); }
					}
				}
			}
		}
		if( Z13 >= 9.48 ) {
			if( X5 < 0.06 ) {
				if( X22 < 0.18 ) { return new Prediction("Right", 49, 0); }
				if( X22 >= 0.18 ) {
					if( X19 < 0.17 ) { return new Prediction("Right", 5, 0); }
					if( X19 >= 0.17 ) { return new Prediction("Left", 1, 0); }
				}
			}
			if( X5 >= 0.06 ) {
				if( X8 < 0.14 ) {
					if( X21 >= 0.15 ) {
						if( X17 >= 0.14 ) { return new Prediction("Left", 52, 0); }
						if( X17 < 0.14 ) { return new Prediction("Right", 9, 0); }
					}
					if( X21 < 0.15 ) {
						if( Y12 < -0.13 ) {
							if( X1 < 0.27 ) { return new Prediction("Left", 1, 0); }
							if( X1 >= 0.27 ) { return new Prediction("Right", 2, 0); }
						}
						if( Y12 >= -0.13 ) { return new Prediction("Right", 37, 0); }
					}
				}
				if( X8 >= 0.14 ) {
					if( Y2 < -0.16 ) {
						if( Z3 < 9.67 ) { return new Prediction("Right", 10, 0); }
						if( Z3 >= 9.67 ) { return new Prediction("Left", 7, 0); }
					}
					if( Y2 >= -0.16 ) {
						if( Z17 >= 9.39 ) {
							if( X23 >= 0.14 ) {
								if( X5 >= 0.09 ) {
									if( X28 >= 0.15 ) { return new Prediction("Left", 584, 0); }
									if( X28 < 0.15 ) {
										if( Y3 >= -0.07 ) { return new Prediction("Left", 2, 0); }
										if( Y3 < -0.07 ) { return new Prediction("Right", 1, 0); }
									}
								}
								if( X5 < 0.09 ) {
									if( Z6 < 9.97 ) { return new Prediction("Left", 10, 0); }
									if( Z6 >= 9.97 ) { return new Prediction("Right", 1, 0); }
								}
							}
							if( X23 < 0.14 ) { return new Prediction("Right", 2, 0); }
						}
						if( Z17 < 9.39 ) { return new Prediction("Right", 7, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree26() {
		if( X31 < 0.17 ) {
			if( Y28 < -0.07 ) {
				if( Z12 < 9.51 ) {
					if( X1 >= 0.13 ) {
						if( Z7 < 9.88 ) {
							if( Y4 >= 0.02 ) {
								if( X28 < 0.18 ) { return new Prediction("Left", 2, 0); }
								if( X28 >= 0.18 ) { return new Prediction("Right", 2, 0); }
							}
							if( Y4 < 0.02 ) { return new Prediction("Right", 6, 0); }
						}
						if( Z7 >= 9.88 ) {
							if( Y2 < 0.23 ) { return new Prediction("Right", 685, 0); }
							if( Y2 >= 0.23 ) {
								if( X11 >= 0.18 ) { return new Prediction("Right", 1, 0); }
								if( X11 < 0.18 ) { return new Prediction("Left", 1, 0); }
							}
						}
					}
					if( X1 < 0.13 ) { return new Prediction("Left", 14, 0); }
				}
				if( Z12 >= 9.51 ) {
					if( X9 < 0.31 ) {
						if( X16 >= 0.09 ) {
							if( Y24 >= -0.09 ) { return new Prediction("Left", 28, 0); }
							if( Y24 < -0.09 ) {
								if( X25 < 0.17 ) { return new Prediction("Left", 1, 0); }
								if( X25 >= 0.17 ) { return new Prediction("Right", 2, 0); }
							}
						}
						if( X16 < 0.09 ) { return new Prediction("Right", 1, 0); }
					}
					if( X9 >= 0.31 ) { return new Prediction("Right", 3, 0); }
				}
			}
			if( Y28 >= -0.07 ) {
				if( X25 >= 0.14 ) {
					if( X14 < 0.16 ) {
						if( X1 < 0.23 ) {
							if( Z8 >= 9.89 ) { return new Prediction("Right", 7, 0); }
							if( Z8 < 9.89 ) { return new Prediction("Left", 10, 0); }
						}
						if( X1 >= 0.23 ) { return new Prediction("Right", 43, 0); }
					}
					if( X14 >= 0.16 ) {
						if( X21 < 0.13 ) { return new Prediction("Right", 7, 0); }
						if( X21 >= 0.13 ) {
							if( X19 < 0.14 ) {
								if( X16 >= 0.17 ) { return new Prediction("Right", 3, 0); }
								if( X16 < 0.17 ) { return new Prediction("Left", 3, 0); }
							}
							if( X19 >= 0.14 ) { return new Prediction("Left", 84, 0); }
						}
					}
				}
				if( X25 < 0.14 ) { return new Prediction("Right", 21, 0); }
			}
		}
		if( X31 >= 0.17 ) {
			if( Z13 < 9.49 ) {
				if( X15 >= 0.16 ) {
					if( Y32 < -0.05 ) {
						if( X23 >= 0.14 ) { return new Prediction("Left", 275, 0); }
						if( X23 < 0.14 ) { return new Prediction("Right", 2, 0); }
					}
					if( Y32 >= -0.05 ) {
						if( X8 < 0.17 ) {
							if( Y4 < -0.21 ) { return new Prediction("Left", 2, 0); }
							if( Y4 >= -0.21 ) { return new Prediction("Right", 5, 0); }
						}
						if( X8 >= 0.17 ) { return new Prediction("Left", 9, 0); }
					}
				}
				if( X15 < 0.16 ) {
					if( Y3 >= 0.04 ) {
						if( X3 < 0.19 ) { return new Prediction("Left", 40, 0); }
						if( X3 >= 0.19 ) { return new Prediction("Right", 20, 0); }
					}
					if( Y3 < 0.04 ) {
						if( Z25 >= 9.91 ) {
							if( X20 < 0.19 ) { return new Prediction("Right", 4, 0); }
							if( X20 >= 0.19 ) { return new Prediction("Left", 4, 0); }
						}
						if( Z25 < 9.91 ) { return new Prediction("Right", 178, 0); }
					}
				}
			}
			if( Z13 >= 9.49 ) {
				if( X14 >= 0.14 ) {
					if( Z12 >= 10.08 ) { return new Prediction("Right", 7, 0); }
					if( Z12 < 10.08 ) {
						if( X18 < 0.13 ) {
							if( Y29 < -0.07 ) { return new Prediction("Left", 2, 0); }
							if( Y29 >= -0.07 ) { return new Prediction("Right", 3, 0); }
						}
						if( X18 >= 0.13 ) {
							if( X16 >= 0.22 ) {
								if( X20 >= 0.16 ) { return new Prediction("Left", 27, 0); }
								if( X20 < 0.16 ) {
									if( X15 >= 0.23 ) { return new Prediction("Left", 1, 0); }
									if( X15 < 0.23 ) { return new Prediction("Right", 3, 0); }
								}
							}
							if( X16 < 0.22 ) { return new Prediction("Left", 501, 0); }
						}
					}
				}
				if( X14 < 0.14 ) {
					if( Z21 >= 9.68 ) { return new Prediction("Left", 7, 0); }
					if( Z21 < 9.68 ) {
						if( Z4 >= 9.26 ) { return new Prediction("Right", 15, 0); }
						if( Z4 < 9.26 ) { return new Prediction("Left", 4, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree27() {
		if( X15 >= 0.15 ) {
			if( X31 < 0.17 ) {
				if( X17 < 0.2 ) {
					if( X20 >= 0.14 ) {
						if( X23 >= 0.14 ) {
							if( Z31 < 9.69 ) { return new Prediction("Left", 97, 0); }
							if( Z31 >= 9.69 ) {
								if( Y10 < -0.07 ) { return new Prediction("Left", 15, 0); }
								if( Y10 >= -0.07 ) {
									if( X22 < 0.18 ) { return new Prediction("Right", 3, 0); }
									if( X22 >= 0.18 ) { return new Prediction("Left", 2, 0); }
								}
							}
						}
						if( X23 < 0.14 ) { return new Prediction("Right", 7, 0); }
					}
					if( X20 < 0.14 ) { return new Prediction("Right", 9, 0); }
				}
				if( X17 >= 0.2 ) {
					if( Z12 < 9.51 ) { return new Prediction("Right", 55, 0); }
					if( Z12 >= 9.51 ) {
						if( X4 < 0.06 ) { return new Prediction("Right", 1, 0); }
						if( X4 >= 0.06 ) { return new Prediction("Left", 3, 0); }
					}
				}
			}
			if( X31 >= 0.17 ) {
				if( X2 < 0.34 ) {
					if( X29 < 0.16 ) {
						if( Y26 < -0.08 ) { return new Prediction("Right", 5, 0); }
						if( Y26 >= -0.08 ) { return new Prediction("Left", 2, 0); }
					}
					if( X29 >= 0.16 ) {
						if( Z1 < 9.25 ) {
							if( X8 < 0.26 ) { return new Prediction("Right", 1, 0); }
							if( X8 >= 0.26 ) { return new Prediction("Left", 1, 0); }
						}
						if( Z1 >= 9.25 ) {
							if( Z30 >= 9.41 ) { return new Prediction("Left", 815, 0); }
							if( Z30 < 9.41 ) {
								if( X7 < 0.27 ) { return new Prediction("Right", 1, 0); }
								if( X7 >= 0.27 ) { return new Prediction("Left", 3, 0); }
							}
						}
					}
				}
				if( X2 >= 0.34 ) {
					if( X15 < 0.18 ) { return new Prediction("Right", 8, 0); }
					if( X15 >= 0.18 ) { return new Prediction("Left", 5, 0); }
				}
			}
		}
		if( X15 < 0.15 ) {
			if( Z21 >= 9.4 ) {
				if( Y28 >= -0.08 ) {
					if( X7 >= 0.12 ) {
						if( X32 < 0.17 ) {
							if( Z32 >= 9.68 ) { return new Prediction("Left", 1, 0); }
							if( Z32 < 9.68 ) { return new Prediction("Right", 9, 0); }
						}
						if( X32 >= 0.17 ) {
							if( X11 >= 0.26 ) { return new Prediction("Right", 2, 0); }
							if( X11 < 0.26 ) { return new Prediction("Left", 28, 0); }
						}
					}
					if( X7 < 0.12 ) {
						if( Z20 < 9.51 ) {
							if( X16 < 0.18 ) { return new Prediction("Right", 9, 0); }
							if( X16 >= 0.18 ) { return new Prediction("Left", 2, 0); }
						}
						if( Z20 >= 9.51 ) { return new Prediction("Right", 177, 0); }
					}
				}
				if( Y28 < -0.08 ) {
					if( Z8 >= 9.79 ) {
						if( Z4 < 9.89 ) { return new Prediction("Right", 681, 0); }
						if( Z4 >= 9.89 ) {
							if( Y10 < -0.07 ) { return new Prediction("Left", 1, 0); }
							if( Y10 >= -0.07 ) { return new Prediction("Right", 20, 0); }
						}
					}
					if( Z8 < 9.79 ) {
						if( Z3 >= 9.46 ) { return new Prediction("Left", 4, 0); }
						if( Z3 < 9.46 ) { return new Prediction("Right", 7, 0); }
					}
				}
			}
			if( Z21 < 9.4 ) {
				if( X2 < 0.14 ) { return new Prediction("Left", 35, 0); }
				if( X2 >= 0.14 ) { return new Prediction("Right", 24, 0); }
			}
		}
		return null;
	}
	private Prediction runTree28() {
		if( X2 >= 0.18 ) {
			if( X14 >= 0.15 ) {
				if( X32 < 0.17 ) {
					if( Z29 >= 9.65 ) {
						if( Y26 < -0.08 ) { return new Prediction("Right", 43, 0); }
						if( Y26 >= -0.08 ) {
							if( X20 >= 0.2 ) { return new Prediction("Right", 11, 0); }
							if( X20 < 0.2 ) {
								if( X28 < 0.18 ) { return new Prediction("Left", 4, 0); }
								if( X28 >= 0.18 ) { return new Prediction("Right", 1, 0); }
							}
						}
					}
					if( Z29 < 9.65 ) {
						if( X27 >= 0.18 ) { return new Prediction("Right", 7, 0); }
						if( X27 < 0.18 ) { return new Prediction("Left", 11, 0); }
					}
				}
				if( X32 >= 0.17 ) {
					if( X13 < 0.14 ) { return new Prediction("Right", 10, 0); }
					if( X13 >= 0.14 ) {
						if( Y22 < -0.1 ) {
							if( X15 >= 0.22 ) { return new Prediction("Right", 5, 0); }
							if( X15 < 0.22 ) { return new Prediction("Left", 1, 0); }
						}
						if( Y22 >= -0.1 ) {
							if( Y11 < 0 ) {
								if( X9 >= -0.02 ) { return new Prediction("Left", 225, 0); }
								if( X9 < -0.02 ) { return new Prediction("Right", 1, 0); }
							}
							if( Y11 >= 0 ) { return new Prediction("Right", 3, 0); }
						}
					}
				}
			}
			if( X14 < 0.15 ) {
				if( X32 >= 0.18 ) {
					if( Z12 < 9.58 ) { return new Prediction("Right", 30, 0); }
					if( Z12 >= 9.58 ) {
						if( X5 >= 0.17 ) { return new Prediction("Left", 7, 0); }
						if( X5 < 0.17 ) { return new Prediction("Right", 2, 0); }
					}
				}
				if( X32 < 0.18 ) {
					if( Z8 >= 9.89 ) { return new Prediction("Right", 765, 0); }
					if( Z8 < 9.89 ) {
						if( Y26 >= -0.07 ) {
							if( X14 >= 0.11 ) { return new Prediction("Left", 2, 0); }
							if( X14 < 0.11 ) { return new Prediction("Right", 3, 0); }
						}
						if( Y26 < -0.07 ) { return new Prediction("Right", 26, 0); }
					}
				}
			}
		}
		if( X2 < 0.18 ) {
			if( X28 < 0.2 ) {
				if( Z7 >= 10.1 ) {
					if( X20 >= 0.22 ) {
						if( X30 >= 0.19 ) { return new Prediction("Left", 5, 0); }
						if( X30 < 0.19 ) { return new Prediction("Right", 9, 0); }
					}
					if( X20 < 0.22 ) {
						if( X23 >= 0.16 ) { return new Prediction("Left", 44, 0); }
						if( X23 < 0.16 ) {
							if( X6 >= 0.2 ) { return new Prediction("Left", 1, 0); }
							if( X6 < 0.2 ) { return new Prediction("Right", 3, 0); }
						}
					}
				}
				if( Z7 < 10.1 ) {
					if( Z9 < 9.19 ) {
						if( Y19 < -0.06 ) { return new Prediction("Right", 8, 0); }
						if( Y19 >= -0.06 ) { return new Prediction("Left", 1, 0); }
					}
					if( Z9 >= 9.19 ) {
						if( X21 < 0.16 ) {
							if( X4 < 0.21 ) {
								if( X28 < 0.18 ) { return new Prediction("Right", 1, 0); }
								if( X28 >= 0.18 ) { return new Prediction("Left", 2, 0); }
							}
							if( X4 >= 0.21 ) { return new Prediction("Right", 3, 0); }
						}
						if( X21 >= 0.16 ) {
							if( Z18 >= 9.37 ) { return new Prediction("Left", 668, 0); }
							if( Z18 < 9.37 ) {
								if( X4 >= 0.24 ) { return new Prediction("Right", 1, 0); }
								if( X4 < 0.24 ) { return new Prediction("Left", 1, 0); }
							}
						}
					}
				}
			}
			if( X28 >= 0.2 ) {
				if( X23 >= 0.17 ) { return new Prediction("Left", 98, 0); }
				if( X23 < 0.17 ) {
					if( Z8 >= 10 ) { return new Prediction("Right", 27, 0); }
					if( Z8 < 10 ) {
						if( X3 >= 0.16 ) { return new Prediction("Right", 1, 0); }
						if( X3 < 0.16 ) { return new Prediction("Left", 3, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree29() {
		if( X14 >= 0.15 ) {
			if( X17 < 0.23 ) {
				if( Z12 >= 10 ) {
					if( X17 >= 0.16 ) {
						if( X19 >= 0.13 ) { return new Prediction("Left", 6, 0); }
						if( X19 < 0.13 ) { return new Prediction("Right", 2, 0); }
					}
					if( X17 < 0.16 ) { return new Prediction("Right", 10, 0); }
				}
				if( Z12 < 10 ) {
					if( Y28 >= -0.1 ) {
						if( Z28 >= 9.47 ) {
							if( Z3 < 9.31 ) {
								if( X5 < 0.13 ) { return new Prediction("Right", 5, 0); }
								if( X5 >= 0.13 ) { return new Prediction("Left", 8, 0); }
							}
							if( Z3 >= 9.31 ) {
								if( Y27 < -0.08 ) {
									if( X31 < 0.17 ) {
										if( Z21 < 9.67 ) {
											if( X19 < 0.29 ) { return new Prediction("Left", 27, 0); }
											if( X19 >= 0.29 ) { return new Prediction("Right", 1, 0); }
										}
										if( Z21 >= 9.67 ) {
											if( X18 >= 0.19 ) { return new Prediction("Left", 2, 0); }
											if( X18 < 0.19 ) { return new Prediction("Right", 5, 0); }
										}
									}
									if( X31 >= 0.17 ) { return new Prediction("Left", 280, 0); }
								}
								if( Y27 >= -0.08 ) { return new Prediction("Left", 616, 0); }
							}
						}
						if( Z28 < 9.47 ) {
							if( Y4 < -0.21 ) { return new Prediction("Left", 3, 0); }
							if( Y4 >= -0.21 ) {
								if( X5 >= 0.14 ) { return new Prediction("Left", 2, 0); }
								if( X5 < 0.14 ) { return new Prediction("Right", 4, 0); }
							}
						}
					}
					if( Y28 < -0.1 ) {
						if( X15 >= 0.14 ) {
							if( X7 < 0.31 ) { return new Prediction("Left", 3, 0); }
							if( X7 >= 0.31 ) { return new Prediction("Right", 1, 0); }
						}
						if( X15 < 0.14 ) { return new Prediction("Right", 6, 0); }
					}
				}
			}
			if( X17 >= 0.23 ) {
				if( X21 < 0.17 ) { return new Prediction("Right", 66, 0); }
				if( X21 >= 0.17 ) {
					if( X9 >= 0.12 ) { return new Prediction("Left", 21, 0); }
					if( X9 < 0.12 ) { return new Prediction("Right", 5, 0); }
				}
			}
		}
		if( X14 < 0.15 ) {
			if( X7 >= 0.13 ) {
				if( Z27 < 9.91 ) {
					if( Z7 >= 9.84 ) { return new Prediction("Right", 69, 0); }
					if( Z7 < 9.84 ) { return new Prediction("Left", 14, 0); }
				}
				if( Z27 >= 9.91 ) { return new Prediction("Left", 43, 0); }
			}
			if( X7 < 0.13 ) {
				if( Z5 >= 9.8 ) {
					if( X5 < 0.27 ) { return new Prediction("Right", 86, 0); }
					if( X5 >= 0.27 ) {
						if( X8 >= 0.09 ) { return new Prediction("Left", 3, 0); }
						if( X8 < 0.09 ) { return new Prediction("Right", 3, 0); }
					}
				}
				if( Z5 < 9.8 ) { return new Prediction("Right", 742, 0); }
			}
		}
		return null;
	}
	private Prediction runTree30() {
		if( Z7 < 9.96 ) {
			if( Z1 >= 9.4 ) {
				if( X14 >= 0.11 ) {
					if( X21 >= 0.15 ) {
						if( Z21 < 9.55 ) { return new Prediction("Left", 421, 0); }
						if( Z21 >= 9.55 ) {
							if( X24 < 0.14 ) { return new Prediction("Right", 7, 0); }
							if( X24 >= 0.14 ) {
								if( Z28 >= 9.46 ) {
									if( X16 < 0.12 ) { return new Prediction("Right", 1, 0); }
									if( X16 >= 0.12 ) {
										if( X29 >= 0.15 ) { return new Prediction("Left", 371, 0); }
										if( X29 < 0.15 ) {
											if( Y9 < -0.07 ) { return new Prediction("Left", 5, 0); }
											if( Y9 >= -0.07 ) { return new Prediction("Right", 1, 0); }
										}
									}
								}
								if( Z28 < 9.46 ) {
									if( X1 >= 0.06 ) { return new Prediction("Left", 5, 0); }
									if( X1 < 0.06 ) { return new Prediction("Right", 4, 0); }
								}
							}
						}
					}
					if( X21 < 0.15 ) {
						if( Z7 >= 9.85 ) { return new Prediction("Right", 9, 0); }
						if( Z7 < 9.85 ) { return new Prediction("Left", 3, 0); }
					}
				}
				if( X14 < 0.11 ) {
					if( X13 < 0.14 ) {
						if( X2 < 0.14 ) { return new Prediction("Left", 4, 0); }
						if( X2 >= 0.14 ) { return new Prediction("Right", 3, 0); }
					}
					if( X13 >= 0.14 ) { return new Prediction("Right", 13, 0); }
				}
			}
			if( Z1 < 9.4 ) {
				if( Z27 >= 9.97 ) { return new Prediction("Left", 15, 0); }
				if( Z27 < 9.97 ) {
					if( X20 >= 0.16 ) {
						if( X8 < 0.14 ) {
							if( Z20 < 9.36 ) { return new Prediction("Left", 3, 0); }
							if( Z20 >= 9.36 ) { return new Prediction("Right", 11, 0); }
						}
						if( X8 >= 0.14 ) { return new Prediction("Left", 11, 0); }
					}
					if( X20 < 0.16 ) { return new Prediction("Right", 25, 0); }
				}
			}
		}
		if( Z7 >= 9.96 ) {
			if( X2 < 0.15 ) {
				if( X25 < 0.13 ) { return new Prediction("Right", 3, 0); }
				if( X25 >= 0.13 ) { return new Prediction("Left", 148, 0); }
			}
			if( X2 >= 0.15 ) {
				if( X5 < 0.24 ) {
					if( Y28 >= -0.05 ) {
						if( X31 >= 0.18 ) { return new Prediction("Left", 3, 0); }
						if( X31 < 0.18 ) {
							if( Z2 < 9.71 ) { return new Prediction("Right", 6, 0); }
							if( Z2 >= 9.71 ) { return new Prediction("Left", 1, 0); }
						}
					}
					if( Y28 < -0.05 ) {
						if( Z12 >= 9.49 ) {
							if( X23 >= 0.17 ) { return new Prediction("Left", 1, 0); }
							if( X23 < 0.17 ) { return new Prediction("Right", 6, 0); }
						}
						if( Z12 < 9.49 ) { return new Prediction("Right", 797, 0); }
					}
				}
				if( X5 >= 0.24 ) {
					if( X8 >= 0.22 ) {
						if( X23 >= 0.15 ) {
							if( X28 >= 0.22 ) { return new Prediction("Right", 2, 0); }
							if( X28 < 0.22 ) { return new Prediction("Left", 40, 0); }
						}
						if( X23 < 0.15 ) { return new Prediction("Right", 11, 0); }
					}
					if( X8 < 0.22 ) {
						if( Z19 >= 9.82 ) { return new Prediction("Right", 72, 0); }
						if( Z19 < 9.82 ) {
							if( Z8 >= 10.22 ) { return new Prediction("Right", 8, 0); }
							if( Z8 < 10.22 ) {
								if( Y12 >= -0.06 ) { return new Prediction("Right", 4, 0); }
								if( Y12 < -0.06 ) { return new Prediction("Left", 19, 0); }
							}
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree31() {
		if( Z2 < 9.43 ) {
			if( X15 < 0.13 ) {
				if( Z27 < 10.02 ) {
					if( X7 < 0.33 ) { return new Prediction("Right", 568, 0); }
					if( X7 >= 0.33 ) { return new Prediction("Left", 1, 0); }
				}
				if( Z27 >= 10.02 ) { return new Prediction("Left", 4, 0); }
			}
			if( X15 >= 0.13 ) {
				if( X16 >= 0.22 ) { return new Prediction("Right", 79, 0); }
				if( X16 < 0.22 ) {
					if( Z24 < 9.66 ) {
						if( X19 >= 0.26 ) { return new Prediction("Right", 5, 0); }
						if( X19 < 0.26 ) {
							if( X6 < 0.13 ) { return new Prediction("Right", 1, 0); }
							if( X6 >= 0.13 ) { return new Prediction("Left", 53, 0); }
						}
					}
					if( Z24 >= 9.66 ) {
						if( Y15 >= -0.1 ) {
							if( X21 < 0.16 ) { return new Prediction("Right", 14, 0); }
							if( X21 >= 0.16 ) { return new Prediction("Left", 10, 0); }
						}
						if( Y15 < -0.1 ) { return new Prediction("Right", 18, 0); }
					}
				}
			}
		}
		if( Z2 >= 9.43 ) {
			if( X7 < 0.14 ) {
				if( X15 >= 0.14 ) {
					if( X10 < 0.23 ) {
						if( Z9 >= 10.2 ) { return new Prediction("Right", 4, 0); }
						if( Z9 < 10.2 ) {
							if( X18 < 0.23 ) { return new Prediction("Left", 126, 0); }
							if( X18 >= 0.23 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( X10 >= 0.23 ) { return new Prediction("Right", 10, 0); }
				}
				if( X15 < 0.14 ) {
					if( X1 < 0.16 ) {
						if( X3 < 0.18 ) { return new Prediction("Left", 1, 0); }
						if( X3 >= 0.18 ) { return new Prediction("Right", 1, 0); }
					}
					if( X1 >= 0.16 ) { return new Prediction("Right", 226, 0); }
				}
			}
			if( X7 >= 0.14 ) {
				if( Y26 < -0.08 ) {
					if( Z6 >= 9.91 ) {
						if( X21 < 0.17 ) {
							if( X10 < 0 ) { return new Prediction("Left", 2, 0); }
							if( X10 >= 0 ) {
								if( X11 >= 0.08 ) { return new Prediction("Right", 28, 0); }
								if( X11 < 0.08 ) {
									if( X15 < 0.19 ) { return new Prediction("Right", 3, 0); }
									if( X15 >= 0.19 ) { return new Prediction("Left", 1, 0); }
								}
							}
						}
						if( X21 >= 0.17 ) {
							if( X31 >= 0.19 ) { return new Prediction("Left", 14, 0); }
							if( X31 < 0.19 ) {
								if( Y14 >= -0.09 ) {
									if( Y10 >= -0.06 ) { return new Prediction("Left", 2, 0); }
									if( Y10 < -0.06 ) { return new Prediction("Right", 10, 0); }
								}
								if( Y14 < -0.09 ) { return new Prediction("Left", 10, 0); }
							}
						}
					}
					if( Z6 < 9.91 ) {
						if( X31 < 0.16 ) {
							if( Y6 < -0.09 ) { return new Prediction("Right", 9, 0); }
							if( Y6 >= -0.09 ) { return new Prediction("Left", 4, 0); }
						}
						if( X31 >= 0.16 ) {
							if( X14 >= 0.11 ) {
								if( Y1 >= -0.09 ) { return new Prediction("Left", 227, 0); }
								if( Y1 < -0.09 ) {
									if( X7 < 0.17 ) {
										if( Z4 < 9.81 ) { return new Prediction("Left", 3, 0); }
										if( Z4 >= 9.81 ) { return new Prediction("Right", 4, 0); }
									}
									if( X7 >= 0.17 ) {
										if( X19 >= 0.24 ) { return new Prediction("Right", 1, 0); }
										if( X19 < 0.24 ) { return new Prediction("Left", 35, 0); }
									}
								}
							}
							if( X14 < 0.11 ) {
								if( X23 < 0.18 ) { return new Prediction("Right", 5, 0); }
								if( X23 >= 0.18 ) { return new Prediction("Left", 1, 0); }
							}
						}
					}
				}
				if( Y26 >= -0.08 ) {
					if( X18 < 0.13 ) {
						if( Y29 < -0.07 ) { return new Prediction("Right", 7, 0); }
						if( Y29 >= -0.07 ) {
							if( Z22 >= 9.45 ) {
								if( X6 < 0.34 ) { return new Prediction("Left", 1, 0); }
								if( X6 >= 0.34 ) { return new Prediction("Right", 3, 0); }
							}
							if( Z22 < 9.45 ) { return new Prediction("Left", 17, 0); }
						}
					}
					if( X18 >= 0.13 ) {
						if( X12 >= 0.27 ) {
							if( X16 < 0.13 ) { return new Prediction("Right", 3, 0); }
							if( X16 >= 0.13 ) {
								if( Z21 >= 9.53 ) {
									if( X30 >= 0.18 ) { return new Prediction("Left", 1, 0); }
									if( X30 < 0.18 ) { return new Prediction("Right", 1, 0); }
								}
								if( Z21 < 9.53 ) { return new Prediction("Left", 32, 0); }
							}
						}
						if( X12 < 0.27 ) {
							if( Y2 < -0.23 ) { return new Prediction("Right", 1, 0); }
							if( Y2 >= -0.23 ) { return new Prediction("Left", 485, 0); }
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree32() {
		if( X8 >= 0.12 ) {
			if( X21 < 0.16 ) {
				if( Z28 >= 9.66 ) { return new Prediction("Right", 70, 0); }
				if( Z28 < 9.66 ) {
					if( X16 < 0.19 ) {
						if( X5 < 0.07 ) { return new Prediction("Right", 1, 0); }
						if( X5 >= 0.07 ) { return new Prediction("Left", 7, 0); }
					}
					if( X16 >= 0.19 ) { return new Prediction("Right", 12, 0); }
				}
			}
			if( X21 >= 0.16 ) {
				if( Y5 < -0.17 ) {
					if( Z5 >= 9.7 ) {
						if( X31 < 0.17 ) {
							if( Z16 < 9.91 ) { return new Prediction("Right", 3, 0); }
							if( Z16 >= 9.91 ) {
								if( X13 < 0.17 ) { return new Prediction("Right", 1, 0); }
								if( X13 >= 0.17 ) { return new Prediction("Left", 3, 0); }
							}
						}
						if( X31 >= 0.17 ) { return new Prediction("Left", 75, 0); }
					}
					if( Z5 < 9.7 ) {
						if( Z8 >= 9.89 ) { return new Prediction("Right", 21, 0); }
						if( Z8 < 9.89 ) { return new Prediction("Left", 3, 0); }
					}
				}
				if( Y5 >= -0.17 ) {
					if( Z29 >= 9.47 ) {
						if( Y13 >= -0.11 ) {
							if( X29 >= 0.2 ) {
								if( Z19 >= 9.97 ) { return new Prediction("Right", 1, 0); }
								if( Z19 < 9.97 ) { return new Prediction("Left", 32, 0); }
							}
							if( X29 < 0.2 ) {
								if( X31 < 0.16 ) {
									if( Y30 >= -0.08 ) { return new Prediction("Left", 51, 0); }
									if( Y30 < -0.08 ) {
										if( X5 < 0.19 ) { return new Prediction("Right", 1, 0); }
										if( X5 >= 0.19 ) { return new Prediction("Left", 4, 0); }
									}
								}
								if( X31 >= 0.16 ) { return new Prediction("Left", 726, 0); }
							}
						}
						if( Y13 < -0.11 ) {
							if( X22 < 0.21 ) { return new Prediction("Left", 20, 0); }
							if( X22 >= 0.21 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( Z29 < 9.47 ) {
						if( X19 < 0.15 ) { return new Prediction("Right", 3, 0); }
						if( X19 >= 0.15 ) {
							if( X15 >= 0.21 ) { return new Prediction("Right", 1, 0); }
							if( X15 < 0.21 ) { return new Prediction("Left", 6, 0); }
						}
					}
				}
			}
		}
		if( X8 < 0.12 ) {
			if( X14 >= 0.15 ) {
				if( X18 < 0.23 ) {
					if( Z21 < 9.66 ) {
						if( X10 >= 0.32 ) { return new Prediction("Right", 5, 0); }
						if( X10 < 0.32 ) { return new Prediction("Left", 103, 0); }
					}
					if( Z21 >= 9.66 ) { return new Prediction("Right", 19, 0); }
				}
				if( X18 >= 0.23 ) { return new Prediction("Right", 37, 0); }
			}
			if( X14 < 0.15 ) {
				if( Z12 < 9.54 ) { return new Prediction("Right", 808, 0); }
				if( Z12 >= 9.54 ) {
					if( Z30 >= 9.7 ) { return new Prediction("Right", 9, 0); }
					if( Z30 < 9.7 ) {
						if( X7 < 0.07 ) { return new Prediction("Right", 5, 0); }
						if( X7 >= 0.07 ) { return new Prediction("Left", 4, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree33() {
		if( X15 >= 0.15 ) {
			if( Z14 >= 9.86 ) {
				if( X18 >= 0.24 ) { return new Prediction("Right", 28, 0); }
				if( X18 < 0.24 ) {
					if( X9 >= 0.24 ) {
						if( Z24 < 9.81 ) { return new Prediction("Right", 17, 0); }
						if( Z24 >= 9.81 ) {
							if( X20 < 0.18 ) {
								if( Y13 < -0.09 ) { return new Prediction("Right", 8, 0); }
								if( Y13 >= -0.09 ) {
									if( X14 >= 0.18 ) { return new Prediction("Right", 3, 0); }
									if( X14 < 0.18 ) { return new Prediction("Left", 2, 0); }
								}
							}
							if( X20 >= 0.18 ) { return new Prediction("Left", 16, 0); }
						}
					}
					if( X9 < 0.24 ) {
						if( Z8 >= 9.12 ) {
							if( X20 >= 0.14 ) { return new Prediction("Left", 90, 0); }
							if( X20 < 0.14 ) { return new Prediction("Right", 5, 0); }
						}
						if( Z8 < 9.12 ) { return new Prediction("Right", 5, 0); }
					}
				}
			}
			if( Z14 < 9.86 ) {
				if( X15 >= 0.16 ) {
					if( X1 >= 0.35 ) { return new Prediction("Right", 6, 0); }
					if( X1 < 0.35 ) {
						if( X22 >= 0.15 ) {
							if( Y19 < -0.12 ) { return new Prediction("Right", 2, 0); }
							if( Y19 >= -0.12 ) {
								if( Y31 < -0.09 ) {
									if( X3 < -0.05 ) { return new Prediction("Right", 1, 0); }
									if( X3 >= -0.05 ) {
										if( Z6 < 9.82 ) { return new Prediction("Left", 47, 0); }
										if( Z6 >= 9.82 ) {
											if( Y16 >= -0.08 ) { return new Prediction("Left", 7, 0); }
											if( Y16 < -0.08 ) { return new Prediction("Right", 2, 0); }
										}
									}
								}
								if( Y31 >= -0.09 ) { return new Prediction("Left", 825, 0); }
							}
						}
						if( X22 < 0.15 ) { return new Prediction("Right", 2, 0); }
					}
				}
				if( X15 < 0.16 ) {
					if( X16 >= 0.16 ) { return new Prediction("Right", 9, 0); }
					if( X16 < 0.16 ) {
						if( X11 < 0.22 ) {
							if( X6 >= 0.07 ) { return new Prediction("Left", 24, 0); }
							if( X6 < 0.07 ) { return new Prediction("Right", 1, 0); }
						}
						if( X11 >= 0.22 ) { return new Prediction("Right", 2, 0); }
					}
				}
			}
		}
		if( X15 < 0.15 ) {
			if( X23 >= 0.17 ) {
				if( X7 < 0.15 ) {
					if( Z17 < 9.71 ) {
						if( X17 >= 0.17 ) { return new Prediction("Right", 2, 0); }
						if( X17 < 0.17 ) { return new Prediction("Left", 1, 0); }
					}
					if( Z17 >= 9.71 ) { return new Prediction("Right", 224, 0); }
				}
				if( X7 >= 0.15 ) {
					if( Y3 >= -0.07 ) { return new Prediction("Left", 46, 0); }
					if( Y3 < -0.07 ) { return new Prediction("Right", 2, 0); }
				}
			}
			if( X23 < 0.17 ) {
				if( X27 >= 0.18 ) { return new Prediction("Right", 571, 0); }
				if( X27 < 0.18 ) {
					if( Z8 >= 9.73 ) {
						if( X10 >= -0.04 ) { return new Prediction("Right", 77, 0); }
						if( X10 < -0.04 ) {
							if( X2 < 0.16 ) { return new Prediction("Left", 2, 0); }
							if( X2 >= 0.16 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( Z8 < 9.73 ) { return new Prediction("Left", 4, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree34() {
		if( X6 < 0.12 ) {
			if( X14 < 0.17 ) {
				if( Z29 < 9.66 ) {
					if( Y3 >= -0.02 ) { return new Prediction("Right", 11, 0); }
					if( Y3 < -0.02 ) { return new Prediction("Left", 2, 0); }
				}
				if( Z29 >= 9.66 ) { return new Prediction("Right", 656, 0); }
			}
			if( X14 >= 0.17 ) {
				if( Y4 < -0.01 ) {
					if( Y10 >= -0.05 ) {
						if( Z7 >= 9.93 ) { return new Prediction("Left", 3, 0); }
						if( Z7 < 9.93 ) { return new Prediction("Right", 5, 0); }
					}
					if( Y10 < -0.05 ) {
						if( X29 >= 0.15 ) { return new Prediction("Left", 67, 0); }
						if( X29 < 0.15 ) { return new Prediction("Right", 1, 0); }
					}
				}
				if( Y4 >= -0.01 ) { return new Prediction("Right", 11, 0); }
			}
		}
		if( X6 >= 0.12 ) {
			if( X15 >= 0.14 ) {
				if( X22 >= 0.15 ) {
					if( X12 >= 0.26 ) {
						if( X19 >= 0.25 ) { return new Prediction("Right", 14, 0); }
						if( X19 < 0.25 ) {
							if( Z31 < 9.69 ) { return new Prediction("Left", 67, 0); }
							if( Z31 >= 9.69 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( X12 < 0.26 ) {
						if( Z8 < 9.21 ) { return new Prediction("Right", 5, 0); }
						if( Z8 >= 9.21 ) {
							if( X19 < 0.14 ) {
								if( X3 >= 0.05 ) { return new Prediction("Left", 1, 0); }
								if( X3 < 0.05 ) { return new Prediction("Right", 2, 0); }
							}
							if( X19 >= 0.14 ) {
								if( X32 >= 0.15 ) { return new Prediction("Left", 803, 0); }
								if( X32 < 0.15 ) {
									if( Y31 >= -0.07 ) { return new Prediction("Left", 8, 0); }
									if( Y31 < -0.07 ) { return new Prediction("Right", 2, 0); }
								}
							}
						}
					}
				}
				if( X22 < 0.15 ) { return new Prediction("Right", 48, 0); }
			}
			if( X15 < 0.14 ) {
				if( X25 >= 0.15 ) {
					if( Y3 >= 0.01 ) {
						if( X21 < 0.16 ) { return new Prediction("Right", 16, 0); }
						if( X21 >= 0.16 ) { return new Prediction("Left", 38, 0); }
					}
					if( Y3 < 0.01 ) {
						if( X22 < 0.19 ) {
							if( Z22 < 9.69 ) { return new Prediction("Right", 108, 0); }
							if( Z22 >= 9.69 ) { return new Prediction("Left", 1, 0); }
						}
						if( X22 >= 0.19 ) { return new Prediction("Left", 7, 0); }
					}
				}
				if( X25 < 0.15 ) {
					if( Y30 < -0.04 ) { return new Prediction("Right", 154, 0); }
					if( Y30 >= -0.04 ) { return new Prediction("Left", 1, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree35() {
		if( Z1 >= 9.43 ) {
			if( X19 < 0.23 ) {
				if( X32 < 0.17 ) {
					if( X21 >= 0.15 ) {
						if( Y5 < -0.08 ) {
							if( X15 >= 0.15 ) {
								if( Z22 < 9.61 ) { return new Prediction("Left", 31, 0); }
								if( Z22 >= 9.61 ) {
									if( X12 >= 0.18 ) { return new Prediction("Left", 9, 0); }
									if( X12 < 0.18 ) {
										if( Y24 < -0.07 ) { return new Prediction("Right", 11, 0); }
										if( Y24 >= -0.07 ) { return new Prediction("Left", 3, 0); }
									}
								}
							}
							if( X15 < 0.15 ) {
								if( X31 < 0.17 ) { return new Prediction("Right", 12, 0); }
								if( X31 >= 0.17 ) {
									if( X17 >= 0.15 ) { return new Prediction("Left", 1, 0); }
									if( X17 < 0.15 ) { return new Prediction("Right", 3, 0); }
								}
							}
						}
						if( Y5 >= -0.08 ) {
							if( X24 < 0.16 ) {
								if( X11 >= 0.25 ) { return new Prediction("Right", 3, 0); }
								if( X11 < 0.25 ) { return new Prediction("Left", 4, 0); }
							}
							if( X24 >= 0.16 ) { return new Prediction("Left", 68, 0); }
						}
					}
					if( X21 < 0.15 ) {
						if( X2 < 0.17 ) { return new Prediction("Left", 1, 0); }
						if( X2 >= 0.17 ) { return new Prediction("Right", 72, 0); }
					}
				}
				if( X32 >= 0.17 ) {
					if( X19 < 0.17 ) {
						if( Y13 >= -0.06 ) {
							if( Y29 < -0.07 ) { return new Prediction("Right", 11, 0); }
							if( Y29 >= -0.07 ) {
								if( X3 >= 0.33 ) { return new Prediction("Right", 1, 0); }
								if( X3 < 0.33 ) { return new Prediction("Left", 8, 0); }
							}
						}
						if( Y13 < -0.06 ) {
							if( Z10 < 9.18 ) { return new Prediction("Right", 4, 0); }
							if( Z10 >= 9.18 ) {
								if( Z3 < 9.73 ) {
									if( Y9 >= -0.02 ) { return new Prediction("Right", 5, 0); }
									if( Y9 < -0.02 ) {
										if( X2 < 0 ) {
											if( X14 >= 0.18 ) { return new Prediction("Right", 3, 0); }
											if( X14 < 0.18 ) { return new Prediction("Left", 2, 0); }
										}
										if( X2 >= 0 ) { return new Prediction("Left", 35, 0); }
									}
								}
								if( Z3 >= 9.73 ) { return new Prediction("Left", 67, 0); }
							}
						}
					}
					if( X19 >= 0.17 ) {
						if( X23 >= 0.15 ) {
							if( X23 >= 0.17 ) {
								if( X26 < 0.15 ) { return new Prediction("Right", 1, 0); }
								if( X26 >= 0.15 ) { return new Prediction("Left", 635, 0); }
							}
							if( X23 < 0.17 ) {
								if( X4 < 0.13 ) { return new Prediction("Right", 3, 0); }
								if( X4 >= 0.13 ) {
									if( Y10 < -0.08 ) {
										if( X7 < 0.15 ) { return new Prediction("Right", 1, 0); }
										if( X7 >= 0.15 ) { return new Prediction("Left", 1, 0); }
									}
									if( Y10 >= -0.08 ) { return new Prediction("Left", 38, 0); }
								}
							}
						}
						if( X23 < 0.15 ) { return new Prediction("Right", 5, 0); }
					}
				}
			}
			if( X19 >= 0.23 ) {
				if( X14 < 0.16 ) { return new Prediction("Right", 168, 0); }
				if( X14 >= 0.16 ) {
					if( Z19 >= 9.96 ) { return new Prediction("Right", 4, 0); }
					if( Z19 < 9.96 ) { return new Prediction("Left", 23, 0); }
				}
			}
		}
		if( Z1 < 9.43 ) {
			if( X2 < 0.15 ) {
				if( X4 >= 0.01 ) { return new Prediction("Left", 56, 0); }
				if( X4 < 0.01 ) { return new Prediction("Right", 1, 0); }
			}
			if( X2 >= 0.15 ) {
				if( Z32 < 9.7 ) {
					if( X14 >= 0.18 ) {
						if( Z20 < 9.64 ) { return new Prediction("Right", 17, 0); }
						if( Z20 >= 9.64 ) {
							if( X5 < 0.12 ) { return new Prediction("Right", 7, 0); }
							if( X5 >= 0.12 ) { return new Prediction("Left", 8, 0); }
						}
					}
					if( X14 < 0.18 ) {
						if( Y18 >= -0.12 ) { return new Prediction("Right", 683, 0); }
						if( Y18 < -0.12 ) {
							if( Z23 < 9.39 ) { return new Prediction("Left", 1, 0); }
							if( Z23 >= 9.39 ) { return new Prediction("Right", 10, 0); }
						}
					}
				}
				if( Z32 >= 9.7 ) {
					if( X12 < 0.2 ) { return new Prediction("Right", 13, 0); }
					if( X12 >= 0.2 ) { return new Prediction("Left", 4, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree36() {
		if( X23 >= 0.16 ) {
			if( X32 < 0.17 ) {
				if( X14 < 0.16 ) {
					if( Z21 >= 9.4 ) {
						if( Z7 < 9.83 ) { return new Prediction("Left", 4, 0); }
						if( Z7 >= 9.83 ) {
							if( Z30 < 9.87 ) { return new Prediction("Right", 211, 0); }
							if( Z30 >= 9.87 ) {
								if( X12 < 0.15 ) { return new Prediction("Left", 1, 0); }
								if( X12 >= 0.15 ) { return new Prediction("Right", 3, 0); }
							}
						}
					}
					if( Z21 < 9.4 ) {
						if( X11 >= 0.18 ) { return new Prediction("Right", 7, 0); }
						if( X11 < 0.18 ) { return new Prediction("Left", 8, 0); }
					}
				}
				if( X14 >= 0.16 ) {
					if( X10 >= 0.27 ) {
						if( Z22 >= 9.44 ) { return new Prediction("Right", 11, 0); }
						if( Z22 < 9.44 ) { return new Prediction("Left", 3, 0); }
					}
					if( X10 < 0.27 ) {
						if( Z30 >= 9.44 ) {
							if( Z22 < 9.7 ) { return new Prediction("Left", 83, 0); }
							if( Z22 >= 9.7 ) {
								if( Z16 < 9.66 ) { return new Prediction("Left", 13, 0); }
								if( Z16 >= 9.66 ) {
									if( Z11 >= 9.65 ) { return new Prediction("Right", 2, 0); }
									if( Z11 < 9.65 ) { return new Prediction("Left", 7, 0); }
								}
							}
						}
						if( Z30 < 9.44 ) {
							if( Y1 >= 0.06 ) { return new Prediction("Left", 1, 0); }
							if( Y1 < 0.06 ) { return new Prediction("Right", 3, 0); }
						}
					}
				}
			}
			if( X32 >= 0.17 ) {
				if( X10 >= 0.24 ) {
					if( Z22 >= 9.46 ) {
						if( X22 >= 0.17 ) {
							if( X21 >= 0.18 ) { return new Prediction("Left", 23, 0); }
							if( X21 < 0.18 ) {
								if( Y22 < -0.08 ) { return new Prediction("Right", 4, 0); }
								if( Y22 >= -0.08 ) { return new Prediction("Left", 2, 0); }
							}
						}
						if( X22 < 0.17 ) {
							if( X27 >= 0.18 ) { return new Prediction("Right", 57, 0); }
							if( X27 < 0.18 ) {
								if( Y10 >= -0.12 ) { return new Prediction("Right", 2, 0); }
								if( Y10 < -0.12 ) { return new Prediction("Left", 1, 0); }
							}
						}
					}
					if( Z22 < 9.46 ) { return new Prediction("Left", 34, 0); }
				}
				if( X10 < 0.24 ) {
					if( X27 < 0.15 ) { return new Prediction("Right", 8, 0); }
					if( X27 >= 0.15 ) {
						if( X18 < 0.16 ) {
							if( Y5 >= -0.11 ) {
								if( Z6 >= 10.19 ) { return new Prediction("Right", 1, 0); }
								if( Z6 < 10.19 ) { return new Prediction("Left", 161, 0); }
							}
							if( Y5 < -0.11 ) {
								if( Z1 >= 9.72 ) { return new Prediction("Left", 9, 0); }
								if( Z1 < 9.72 ) {
									if( X2 < 0.16 ) { return new Prediction("Left", 4, 0); }
									if( X2 >= 0.16 ) { return new Prediction("Right", 6, 0); }
								}
							}
						}
						if( X18 >= 0.16 ) {
							if( X18 >= 0.25 ) { return new Prediction("Right", 1, 0); }
							if( X18 < 0.25 ) {
								if( X32 >= 0.19 ) {
									if( X14 >= 0.14 ) { return new Prediction("Left", 132, 0); }
									if( X14 < 0.14 ) { return new Prediction("Right", 1, 0); }
								}
								if( X32 < 0.19 ) { return new Prediction("Left", 530, 0); }
							}
						}
					}
				}
			}
		}
		if( X23 < 0.16 ) {
			if( X14 < 0.16 ) {
				if( X19 < 0.06 ) { return new Prediction("Left", 2, 0); }
				if( X19 >= 0.06 ) {
					if( Z8 >= 9.79 ) { return new Prediction("Right", 625, 0); }
					if( Z8 < 9.79 ) { return new Prediction("Left", 3, 0); }
				}
			}
			if( X14 >= 0.16 ) {
				if( Y27 < -0.09 ) {
					if( X32 >= 0.19 ) { return new Prediction("Left", 1, 0); }
					if( X32 < 0.19 ) { return new Prediction("Right", 22, 0); }
				}
				if( Y27 >= -0.09 ) {
					if( X3 >= 0.25 ) {
						if( Z1 < 9.47 ) { return new Prediction("Right", 8, 0); }
						if( Z1 >= 9.47 ) {
							if( X3 < 0.35 ) { return new Prediction("Left", 1, 0); }
							if( X3 >= 0.35 ) { return new Prediction("Right", 1, 0); }
						}
					}
					if( X3 < 0.25 ) {
						if( X22 < 0.13 ) { return new Prediction("Right", 1, 0); }
						if( X22 >= 0.13 ) { return new Prediction("Left", 36, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree37() {
		if( X1 >= 0.18 ) {
			if( Z7 < 9.95 ) {
				if( Z19 < 9.78 ) {
					if( Y5 < -0.15 ) {
						if( X27 < 0.17 ) {
							if( Y13 < -0.05 ) { return new Prediction("Left", 2, 0); }
							if( Y13 >= -0.05 ) { return new Prediction("Right", 1, 0); }
						}
						if( X27 >= 0.17 ) { return new Prediction("Right", 13, 0); }
					}
					if( Y5 >= -0.15 ) {
						if( Y9 >= -0.03 ) { return new Prediction("Right", 11, 0); }
						if( Y9 < -0.03 ) {
							if( X28 >= 0.16 ) {
								if( Z24 >= 9.63 ) { return new Prediction("Left", 195, 0); }
								if( Z24 < 9.63 ) {
									if( X15 >= 0.16 ) { return new Prediction("Left", 3, 0); }
									if( X15 < 0.16 ) { return new Prediction("Right", 3, 0); }
								}
							}
							if( X28 < 0.16 ) {
								if( Z17 >= 9.7 ) { return new Prediction("Right", 4, 0); }
								if( Z17 < 9.7 ) { return new Prediction("Left", 3, 0); }
							}
						}
					}
				}
				if( Z19 >= 9.78 ) {
					if( X16 < 0.18 ) { return new Prediction("Right", 31, 0); }
					if( X16 >= 0.18 ) {
						if( X4 < 0.28 ) { return new Prediction("Left", 1, 0); }
						if( X4 >= 0.28 ) { return new Prediction("Right", 1, 0); }
					}
				}
			}
			if( Z7 >= 9.95 ) {
				if( X32 >= 0.18 ) {
					if( X21 >= 0.15 ) {
						if( Z26 < 9.79 ) { return new Prediction("Right", 8, 0); }
						if( Z26 >= 9.79 ) {
							if( Y12 < -0.01 ) {
								if( Y21 >= -0.05 ) {
									if( X14 < 0.16 ) { return new Prediction("Right", 1, 0); }
									if( X14 >= 0.16 ) { return new Prediction("Left", 1, 0); }
								}
								if( Y21 < -0.05 ) { return new Prediction("Left", 25, 0); }
							}
							if( Y12 >= -0.01 ) { return new Prediction("Right", 2, 0); }
						}
					}
					if( X21 < 0.15 ) { return new Prediction("Right", 21, 0); }
				}
				if( X32 < 0.18 ) {
					if( X6 < 0.24 ) {
						if( Y29 < -0.06 ) { return new Prediction("Right", 789, 0); }
						if( Y29 >= -0.06 ) {
							if( X21 < 0.16 ) { return new Prediction("Right", 8, 0); }
							if( X21 >= 0.16 ) { return new Prediction("Left", 3, 0); }
						}
					}
					if( X6 >= 0.24 ) {
						if( Y5 >= -0.13 ) { return new Prediction("Left", 8, 0); }
						if( Y5 < -0.13 ) {
							if( Z6 < 9.82 ) { return new Prediction("Right", 48, 0); }
							if( Z6 >= 9.82 ) {
								if( Z29 < 9.62 ) { return new Prediction("Left", 4, 0); }
								if( Z29 >= 9.62 ) {
									if( Z14 >= 9.4 ) { return new Prediction("Right", 6, 0); }
									if( Z14 < 9.4 ) { return new Prediction("Left", 1, 0); }
								}
							}
						}
					}
				}
			}
		}
		if( X1 < 0.18 ) {
			if( X3 < 0.14 ) {
				if( X5 < -0.08 ) { return new Prediction("Right", 4, 0); }
				if( X5 >= -0.08 ) {
					if( Z17 < 9.88 ) {
						if( Y13 >= -0.02 ) { return new Prediction("Right", 2, 0); }
						if( Y13 < -0.02 ) {
							if( X18 >= 0.14 ) { return new Prediction("Left", 103, 0); }
							if( X18 < 0.14 ) { return new Prediction("Right", 3, 0); }
						}
					}
					if( Z17 >= 9.88 ) { return new Prediction("Left", 482, 0); }
				}
			}
			if( X3 >= 0.14 ) {
				if( Z8 < 10.04 ) {
					if( X21 < 0.16 ) {
						if( X2 < 0.16 ) { return new Prediction("Left", 1, 0); }
						if( X2 >= 0.16 ) { return new Prediction("Right", 6, 0); }
					}
					if( X21 >= 0.16 ) {
						if( Y32 >= -0.09 ) { return new Prediction("Left", 164, 0); }
						if( Y32 < -0.09 ) {
							if( Z5 >= 9.8 ) { return new Prediction("Right", 1, 0); }
							if( Z5 < 9.8 ) { return new Prediction("Left", 5, 0); }
						}
					}
				}
				if( Z8 >= 10.04 ) {
					if( X23 >= 0.15 ) {
						if( X8 < 0.02 ) { return new Prediction("Right", 4, 0); }
						if( X8 >= 0.02 ) { return new Prediction("Left", 23, 0); }
					}
					if( X23 < 0.15 ) { return new Prediction("Right", 42, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree38() {
		if( X23 >= 0.15 ) {
			if( X22 >= 0.17 ) {
				if( Z28 < 9.42 ) { return new Prediction("Right", 5, 0); }
				if( Z28 >= 9.42 ) {
					if( X19 >= 0.25 ) {
						if( X6 < 0.35 ) { return new Prediction("Right", 13, 0); }
						if( X6 >= 0.35 ) { return new Prediction("Left", 3, 0); }
					}
					if( X19 < 0.25 ) {
						if( Z1 < 9.26 ) {
							if( Y5 >= -0.05 ) {
								if( X3 < 0.23 ) { return new Prediction("Left", 5, 0); }
								if( X3 >= 0.23 ) { return new Prediction("Right", 1, 0); }
							}
							if( Y5 < -0.05 ) { return new Prediction("Right", 10, 0); }
						}
						if( Z1 >= 9.26 ) {
							if( X24 >= 0.13 ) {
								if( X31 < 0.15 ) {
									if( Y25 < -0.08 ) { return new Prediction("Left", 12, 0); }
									if( Y25 >= -0.08 ) { return new Prediction("Right", 2, 0); }
								}
								if( X31 >= 0.15 ) {
									if( X25 >= 0.15 ) { return new Prediction("Left", 921, 0); }
									if( X25 < 0.15 ) {
										if( X7 >= 0.08 ) { return new Prediction("Left", 7, 0); }
										if( X7 < 0.08 ) { return new Prediction("Right", 1, 0); }
									}
								}
							}
							if( X24 < 0.13 ) { return new Prediction("Right", 2, 0); }
						}
					}
				}
			}
			if( X22 < 0.17 ) {
				if( Z29 < 9.66 ) {
					if( X19 < 0.16 ) {
						if( X24 >= 0.18 ) { return new Prediction("Right", 9, 0); }
						if( X24 < 0.18 ) { return new Prediction("Left", 2, 0); }
					}
					if( X19 >= 0.16 ) { return new Prediction("Left", 42, 0); }
				}
				if( Z29 >= 9.66 ) {
					if( X8 >= 0.2 ) {
						if( Y29 < -0.07 ) {
							if( Y10 < -0.08 ) { return new Prediction("Left", 1, 0); }
							if( Y10 >= -0.08 ) { return new Prediction("Right", 18, 0); }
						}
						if( Y29 >= -0.07 ) { return new Prediction("Left", 8, 0); }
					}
					if( X8 < 0.2 ) {
						if( Z17 < 9.88 ) {
							if( X14 < 0.16 ) { return new Prediction("Right", 18, 0); }
							if( X14 >= 0.16 ) { return new Prediction("Left", 2, 0); }
						}
						if( Z17 >= 9.88 ) { return new Prediction("Right", 324, 0); }
					}
				}
			}
		}
		if( X23 < 0.15 ) {
			if( X11 >= 0.18 ) {
				if( Y27 >= -0.07 ) {
					if( Z2 >= 9.46 ) {
						if( X18 < 0.23 ) { return new Prediction("Left", 3, 0); }
						if( X18 >= 0.23 ) { return new Prediction("Right", 2, 0); }
					}
					if( Z2 < 9.46 ) { return new Prediction("Right", 14, 0); }
				}
				if( Y27 < -0.07 ) { return new Prediction("Right", 473, 0); }
			}
			if( X11 < 0.18 ) {
				if( Z3 >= 9.69 ) { return new Prediction("Left", 9, 0); }
				if( Z3 < 9.69 ) {
					if( Z1 < 9.47 ) { return new Prediction("Right", 79, 0); }
					if( Z1 >= 9.47 ) {
						if( X24 < 0.14 ) { return new Prediction("Right", 36, 0); }
						if( X24 >= 0.14 ) {
							if( Y2 < -0.1 ) { return new Prediction("Right", 5, 0); }
							if( Y2 >= -0.1 ) { return new Prediction("Left", 6, 0); }
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree39() {
		if( X15 < 0.13 ) {
			if( Y29 < -0.07 ) {
				if( Z28 < 10 ) {
					if( X32 >= 0.2 ) { return new Prediction("Left", 1, 0); }
					if( X32 < 0.2 ) { return new Prediction("Right", 744, 0); }
				}
				if( Z28 >= 10 ) { return new Prediction("Left", 1, 0); }
			}
			if( Y29 >= -0.07 ) {
				if( Z22 < 9.41 ) {
					if( X14 < 0.01 ) { return new Prediction("Right", 2, 0); }
					if( X14 >= 0.01 ) { return new Prediction("Left", 23, 0); }
				}
				if( Z22 >= 9.41 ) {
					if( Z8 >= 9.78 ) { return new Prediction("Right", 56, 0); }
					if( Z8 < 9.78 ) { return new Prediction("Left", 3, 0); }
				}
			}
		}
		if( X15 >= 0.13 ) {
			if( X22 >= 0.15 ) {
				if( X5 >= 0.03 ) {
					if( X23 >= 0.14 ) {
						if( X15 >= 0.15 ) {
							if( Z17 >= 9.38 ) { return new Prediction("Left", 995, 0); }
							if( Z17 < 9.38 ) { return new Prediction("Right", 3, 0); }
						}
						if( X15 < 0.15 ) {
							if( Y1 >= -0.03 ) { return new Prediction("Left", 34, 0); }
							if( Y1 < -0.03 ) {
								if( Y26 < -0.08 ) { return new Prediction("Right", 8, 0); }
								if( Y26 >= -0.08 ) { return new Prediction("Left", 4, 0); }
							}
						}
					}
					if( X23 < 0.14 ) { return new Prediction("Right", 6, 0); }
				}
				if( X5 < 0.03 ) {
					if( X24 >= 0.19 ) { return new Prediction("Right", 15, 0); }
					if( X24 < 0.19 ) { return new Prediction("Left", 20, 0); }
				}
			}
			if( X22 < 0.15 ) {
				if( Y10 < -0.09 ) {
					if( X21 >= 0.15 ) { return new Prediction("Left", 3, 0); }
					if( X21 < 0.15 ) { return new Prediction("Right", 5, 0); }
				}
				if( Y10 >= -0.09 ) { return new Prediction("Right", 110, 0); }
			}
		}
		return null;
	}
	private Prediction runTree40() {
		if( X14 >= 0.14 ) {
			if( X32 < 0.17 ) {
				if( Z2 < 9.43 ) {
					if( X10 < 0.13 ) { return new Prediction("Left", 4, 0); }
					if( X10 >= 0.13 ) { return new Prediction("Right", 55, 0); }
				}
				if( Z2 >= 9.43 ) {
					if( Y18 < -0.1 ) {
						if( Z1 >= 9.55 ) {
							if( X3 < 0.11 ) { return new Prediction("Left", 2, 0); }
							if( X3 >= 0.11 ) { return new Prediction("Right", 18, 0); }
						}
						if( Z1 < 9.55 ) {
							if( X11 >= 0.24 ) { return new Prediction("Right", 5, 0); }
							if( X11 < 0.24 ) { return new Prediction("Left", 17, 0); }
						}
					}
					if( Y18 >= -0.1 ) {
						if( Z4 < 9.9 ) {
							if( X19 < 0.16 ) {
								if( X12 < 0.15 ) { return new Prediction("Right", 3, 0); }
								if( X12 >= 0.15 ) { return new Prediction("Left", 1, 0); }
							}
							if( X19 >= 0.16 ) {
								if( X19 >= 0.18 ) { return new Prediction("Left", 108, 0); }
								if( X19 < 0.18 ) {
									if( Z10 < 9.67 ) {
										if( Y27 < -0.08 ) { return new Prediction("Right", 2, 0); }
										if( Y27 >= -0.08 ) {
											if( X7 < 0.18 ) { return new Prediction("Left", 11, 0); }
											if( X7 >= 0.18 ) { return new Prediction("Right", 1, 0); }
										}
									}
									if( Z10 >= 9.67 ) { return new Prediction("Left", 22, 0); }
								}
							}
						}
						if( Z4 >= 9.9 ) {
							if( X28 >= 0.16 ) {
								if( X19 < 0.15 ) { return new Prediction("Right", 2, 0); }
								if( X19 >= 0.15 ) { return new Prediction("Left", 10, 0); }
							}
							if( X28 < 0.16 ) { return new Prediction("Right", 7, 0); }
						}
					}
				}
			}
			if( X32 >= 0.17 ) {
				if( X19 < 0.17 ) {
					if( X17 < 0.23 ) {
						if( Y31 < -0.1 ) {
							if( X16 < 0.19 ) { return new Prediction("Right", 4, 0); }
							if( X16 >= 0.19 ) { return new Prediction("Left", 1, 0); }
						}
						if( Y31 >= -0.1 ) {
							if( X8 >= 0.45 ) { return new Prediction("Right", 1, 0); }
							if( X8 < 0.45 ) { return new Prediction("Left", 98, 0); }
						}
					}
					if( X17 >= 0.23 ) {
						if( Y9 >= -0.17 ) { return new Prediction("Right", 20, 0); }
						if( Y9 < -0.17 ) { return new Prediction("Left", 2, 0); }
					}
				}
				if( X19 >= 0.17 ) {
					if( X15 >= 0.15 ) { return new Prediction("Left", 707, 0); }
					if( X15 < 0.15 ) {
						if( X30 < 0.2 ) { return new Prediction("Left", 13, 0); }
						if( X30 >= 0.2 ) { return new Prediction("Right", 2, 0); }
					}
				}
			}
		}
		if( X14 < 0.14 ) {
			if( Y5 >= 0.06 ) {
				if( Z17 >= 10.11 ) {
					if( Y12 >= -0.05 ) { return new Prediction("Left", 32, 0); }
					if( Y12 < -0.05 ) { return new Prediction("Right", 21, 0); }
				}
				if( Z17 < 10.11 ) {
					if( Z22 < 9.42 ) { return new Prediction("Left", 1, 0); }
					if( Z22 >= 9.42 ) { return new Prediction("Right", 62, 0); }
				}
			}
			if( Y5 < 0.06 ) {
				if( Z7 < 9.78 ) {
					if( Z27 >= 9.76 ) {
						if( Y21 < -0.06 ) { return new Prediction("Right", 2, 0); }
						if( Y21 >= -0.06 ) { return new Prediction("Left", 1, 0); }
					}
					if( Z27 < 9.76 ) { return new Prediction("Left", 11, 0); }
				}
				if( Z7 >= 9.78 ) {
					if( Z12 < 9.55 ) { return new Prediction("Right", 772, 0); }
					if( Z12 >= 9.55 ) {
						if( X4 < 0.28 ) { return new Prediction("Right", 11, 0); }
						if( X4 >= 0.28 ) {
							if( X5 >= 0.15 ) { return new Prediction("Left", 2, 0); }
							if( X5 < 0.15 ) { return new Prediction("Right", 2, 0); }
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree41() {
		if( Z28 < 9.68 ) {
			if( X29 < 0.17 ) {
				if( Z26 >= 9.77 ) {
					if( Z22 < 9.48 ) { return new Prediction("Left", 1, 0); }
					if( Z22 >= 9.48 ) {
						if( X3 < 0.29 ) { return new Prediction("Right", 21, 0); }
						if( X3 >= 0.29 ) {
							if( Z1 >= 9.59 ) { return new Prediction("Left", 1, 0); }
							if( Z1 < 9.59 ) { return new Prediction("Right", 8, 0); }
						}
					}
				}
				if( Z26 < 9.77 ) { return new Prediction("Left", 28, 0); }
			}
			if( X29 >= 0.17 ) {
				if( Y12 >= -0.05 ) {
					if( X17 >= 0.17 ) { return new Prediction("Right", 6, 0); }
					if( X17 < 0.17 ) { return new Prediction("Left", 3, 0); }
				}
				if( Y12 < -0.05 ) {
					if( Z27 < 9.5 ) {
						if( X15 >= 0.22 ) { return new Prediction("Right", 5, 0); }
						if( X15 < 0.22 ) { return new Prediction("Left", 3, 0); }
					}
					if( Z27 >= 9.5 ) {
						if( X20 < 0.18 ) {
							if( Y29 >= -0.08 ) { return new Prediction("Left", 86, 0); }
							if( Y29 < -0.08 ) {
								if( X22 < 0.18 ) { return new Prediction("Left", 6, 0); }
								if( X22 >= 0.18 ) { return new Prediction("Right", 1, 0); }
							}
						}
						if( X20 >= 0.18 ) { return new Prediction("Left", 224, 0); }
					}
				}
			}
		}
		if( Z28 >= 9.68 ) {
			if( X15 >= 0.16 ) {
				if( Z3 < 9.3 ) {
					if( X9 < 0.08 ) { return new Prediction("Left", 2, 0); }
					if( X9 >= 0.08 ) { return new Prediction("Right", 19, 0); }
				}
				if( Z3 >= 9.3 ) {
					if( X2 < 0.29 ) {
						if( Z27 < 9.78 ) {
							if( X5 >= 0.31 ) { return new Prediction("Right", 4, 0); }
							if( X5 < 0.31 ) {
								if( Z11 < 9.71 ) {
									if( Z3 >= 9.81 ) {
										if( X21 >= 0.18 ) { return new Prediction("Right", 2, 0); }
										if( X21 < 0.18 ) { return new Prediction("Left", 1, 0); }
									}
									if( Z3 < 9.81 ) {
										if( X20 >= 0.22 ) { return new Prediction("Right", 1, 0); }
										if( X20 < 0.22 ) { return new Prediction("Left", 23, 0); }
									}
								}
								if( Z11 >= 9.71 ) { return new Prediction("Left", 70, 0); }
							}
						}
						if( Z27 >= 9.78 ) { return new Prediction("Left", 519, 0); }
					}
					if( X2 >= 0.29 ) { return new Prediction("Right", 11, 0); }
				}
			}
			if( X15 < 0.16 ) {
				if( X2 < 0.14 ) { return new Prediction("Left", 69, 0); }
				if( X2 >= 0.14 ) {
					if( Z12 < 9.58 ) {
						if( X3 < 0.18 ) {
							if( Z22 < 9.43 ) { return new Prediction("Left", 5, 0); }
							if( Z22 >= 9.43 ) { return new Prediction("Right", 33, 0); }
						}
						if( X3 >= 0.18 ) { return new Prediction("Right", 865, 0); }
					}
					if( Z12 >= 9.58 ) {
						if( X15 < 0.11 ) { return new Prediction("Right", 7, 0); }
						if( X15 >= 0.11 ) {
							if( X17 < 0.21 ) { return new Prediction("Left", 8, 0); }
							if( X17 >= 0.21 ) { return new Prediction("Right", 1, 0); }
						}
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree42() {
		if( X22 >= 0.16 ) {
			if( X24 < 0.14 ) { return new Prediction("Right", 82, 0); }
			if( X24 >= 0.14 ) {
				if( X5 >= 0.15 ) {
					if( Z32 < 9.63 ) { return new Prediction("Left", 615, 0); }
					if( Z32 >= 9.63 ) {
						if( Y16 >= -0.1 ) {
							if( Y13 >= -0.11 ) {
								if( X31 < 0.16 ) {
									if( X9 < 0.16 ) { return new Prediction("Left", 3, 0); }
									if( X9 >= 0.16 ) {
										if( Y23 < -0.07 ) { return new Prediction("Right", 5, 0); }
										if( Y23 >= -0.07 ) { return new Prediction("Left", 2, 0); }
									}
								}
								if( X31 >= 0.16 ) { return new Prediction("Left", 226, 0); }
							}
							if( Y13 < -0.11 ) { return new Prediction("Right", 1, 0); }
						}
						if( Y16 < -0.1 ) { return new Prediction("Right", 2, 0); }
					}
				}
				if( X5 < 0.15 ) {
					if( Y26 >= -0.07 ) { return new Prediction("Left", 77, 0); }
					if( Y26 < -0.07 ) {
						if( Y2 < -0.04 ) {
							if( Z23 < 9.94 ) {
								if( Y10 < -0.02 ) { return new Prediction("Left", 79, 0); }
								if( Y10 >= -0.02 ) { return new Prediction("Right", 1, 0); }
							}
							if( Z23 >= 9.94 ) { return new Prediction("Right", 2, 0); }
						}
						if( Y2 >= -0.04 ) {
							if( Y21 >= -0.05 ) { return new Prediction("Left", 6, 0); }
							if( Y21 < -0.05 ) { return new Prediction("Right", 24, 0); }
						}
					}
				}
			}
		}
		if( X22 < 0.16 ) {
			if( Z2 < 9.63 ) {
				if( X9 >= 0.25 ) { return new Prediction("Right", 560, 0); }
				if( X9 < 0.25 ) {
					if( X22 >= 0.15 ) {
						if( X16 >= 0.17 ) {
							if( Z30 < 9.54 ) { return new Prediction("Right", 4, 0); }
							if( Z30 >= 9.54 ) { return new Prediction("Left", 13, 0); }
						}
						if( X16 < 0.17 ) { return new Prediction("Right", 45, 0); }
					}
					if( X22 < 0.15 ) { return new Prediction("Right", 256, 0); }
				}
			}
			if( Z2 >= 9.63 ) {
				if( X24 >= 0.19 ) {
					if( X22 >= 0.15 ) { return new Prediction("Left", 3, 0); }
					if( X22 < 0.15 ) { return new Prediction("Right", 2, 0); }
				}
				if( X24 < 0.19 ) { return new Prediction("Left", 25, 0); }
			}
		}
		return null;
	}
	private Prediction runTree43() {
		if( X7 >= 0.13 ) {
			if( Y5 >= -0.13 ) {
				if( X4 < 0.02 ) {
					if( Z9 < 9.45 ) { return new Prediction("Right", 10, 0); }
					if( Z9 >= 9.45 ) {
						if( X30 < 0.17 ) { return new Prediction("Right", 2, 0); }
						if( X30 >= 0.17 ) { return new Prediction("Left", 17, 0); }
					}
				}
				if( X4 >= 0.02 ) {
					if( X32 >= 0.15 ) {
						if( Y20 >= -0.08 ) {
							if( Z29 < 9.85 ) { return new Prediction("Left", 607, 0); }
							if( Z29 >= 9.85 ) {
								if( X15 < 0.12 ) { return new Prediction("Right", 1, 0); }
								if( X15 >= 0.12 ) { return new Prediction("Left", 28, 0); }
							}
						}
						if( Y20 < -0.08 ) {
							if( X7 < 0.17 ) {
								if( X27 >= 0.19 ) {
									if( Z20 >= 9.88 ) { return new Prediction("Right", 1, 0); }
									if( Z20 < 9.88 ) { return new Prediction("Left", 8, 0); }
								}
								if( X27 < 0.19 ) { return new Prediction("Right", 3, 0); }
							}
							if( X7 >= 0.17 ) {
								if( X31 < 0.15 ) { return new Prediction("Right", 1, 0); }
								if( X31 >= 0.15 ) {
									if( X6 < 0.4 ) { return new Prediction("Left", 118, 0); }
									if( X6 >= 0.4 ) {
										if( X1 < 0.01 ) { return new Prediction("Right", 1, 0); }
										if( X1 >= 0.01 ) { return new Prediction("Left", 1, 0); }
									}
								}
							}
						}
					}
					if( X32 < 0.15 ) {
						if( X10 >= 0.2 ) { return new Prediction("Right", 8, 0); }
						if( X10 < 0.2 ) {
							if( X9 >= 0.19 ) {
								if( X7 >= 0.19 ) { return new Prediction("Left", 1, 0); }
								if( X7 < 0.19 ) { return new Prediction("Right", 1, 0); }
							}
							if( X9 < 0.19 ) { return new Prediction("Left", 6, 0); }
						}
					}
				}
			}
			if( Y5 < -0.13 ) {
				if( X30 < 0.17 ) {
					if( Z11 >= 9.52 ) {
						if( Y7 < -0.1 ) { return new Prediction("Left", 11, 0); }
						if( Y7 >= -0.1 ) { return new Prediction("Right", 3, 0); }
					}
					if( Z11 < 9.52 ) { return new Prediction("Right", 40, 0); }
				}
				if( X30 >= 0.17 ) {
					if( Z31 < 9.62 ) {
						if( Z3 >= 9.47 ) { return new Prediction("Left", 122, 0); }
						if( Z3 < 9.47 ) {
							if( Z22 < 9.48 ) { return new Prediction("Left", 8, 0); }
							if( Z22 >= 9.48 ) { return new Prediction("Right", 6, 0); }
						}
					}
					if( Z31 >= 9.62 ) {
						if( X23 >= 0.17 ) { return new Prediction("Left", 4, 0); }
						if( X23 < 0.17 ) {
							if( X2 >= 0.13 ) { return new Prediction("Right", 27, 0); }
							if( X2 < 0.13 ) { return new Prediction("Left", 1, 0); }
						}
					}
				}
			}
		}
		if( X7 < 0.13 ) {
			if( X31 < 0.17 ) {
				if( Z29 >= 9.64 ) { return new Prediction("Right", 721, 0); }
				if( Z29 < 9.64 ) {
					if( Y14 < -0.06 ) { return new Prediction("Left", 10, 0); }
					if( Y14 >= -0.06 ) { return new Prediction("Right", 7, 0); }
				}
			}
			if( X31 >= 0.17 ) {
				if( Z3 >= 9.61 ) {
					if( Y5 < -0.21 ) { return new Prediction("Right", 3, 0); }
					if( Y5 >= -0.21 ) {
						if( X12 >= 0.27 ) { return new Prediction("Right", 3, 0); }
						if( X12 < 0.27 ) { return new Prediction("Left", 80, 0); }
					}
				}
				if( Z3 < 9.61 ) {
					if( Z13 >= 9.45 ) {
						if( Y5 >= -0.1 ) { return new Prediction("Right", 21, 0); }
						if( Y5 < -0.1 ) {
							if( Y23 >= -0.08 ) {
								if( Z3 >= 9.4 ) { return new Prediction("Left", 16, 0); }
								if( Z3 < 9.4 ) { return new Prediction("Right", 1, 0); }
							}
							if( Y23 < -0.08 ) {
								if( X8 < 0.03 ) { return new Prediction("Right", 2, 0); }
								if( X8 >= 0.03 ) {
									if( X2 >= 0.32 ) { return new Prediction("Left", 1, 0); }
									if( X2 < 0.32 ) { return new Prediction("Right", 1, 0); }
								}
							}
						}
					}
					if( Z13 < 9.45 ) { return new Prediction("Right", 131, 0); }
				}
			}
		}
		return null;
	}
	private Prediction runTree44() {
		if( X10 >= 0.24 ) {
			if( X14 >= 0.15 ) {
				if( X3 >= 0.25 ) { return new Prediction("Right", 51, 0); }
				if( X3 < 0.25 ) {
					if( Z16 < 9.94 ) {
						if( X22 >= 0.15 ) {
							if( Z30 >= 9.44 ) {
								if( Y9 >= -0.23 ) { return new Prediction("Left", 18, 0); }
								if( Y9 < -0.23 ) {
									if( X12 < 0.33 ) { return new Prediction("Right", 1, 0); }
									if( X12 >= 0.33 ) { return new Prediction("Left", 3, 0); }
								}
							}
							if( Z30 < 9.44 ) { return new Prediction("Right", 2, 0); }
						}
						if( X22 < 0.15 ) { return new Prediction("Right", 8, 0); }
					}
					if( Z16 >= 9.94 ) {
						if( X6 >= 0.03 ) { return new Prediction("Left", 49, 0); }
						if( X6 < 0.03 ) { return new Prediction("Right", 1, 0); }
					}
				}
			}
			if( X14 < 0.15 ) { return new Prediction("Right", 682, 0); }
		}
		if( X10 < 0.24 ) {
			if( Z20 >= 9.8 ) {
				if( X16 >= 0.15 ) {
					if( X19 < 0.23 ) {
						if( X8 >= 0.12 ) { return new Prediction("Left", 135, 0); }
						if( X8 < 0.12 ) {
							if( Y5 < -0.17 ) { return new Prediction("Left", 17, 0); }
							if( Y5 >= -0.17 ) { return new Prediction("Right", 3, 0); }
						}
					}
					if( X19 >= 0.23 ) { return new Prediction("Right", 23, 0); }
				}
				if( X16 < 0.15 ) {
					if( Z27 < 9.95 ) { return new Prediction("Right", 173, 0); }
					if( Z27 >= 9.95 ) { return new Prediction("Left", 1, 0); }
				}
			}
			if( Z20 < 9.8 ) {
				if( Z7 < 9.97 ) {
					if( Z14 >= 10.07 ) {
						if( Y16 < -0.06 ) { return new Prediction("Left", 5, 0); }
						if( Y16 >= -0.06 ) { return new Prediction("Right", 5, 0); }
					}
					if( Z14 < 10.07 ) {
						if( Z22 >= 9.56 ) {
							if( X18 >= 0.15 ) {
								if( X31 < 0.16 ) {
									if( Y24 >= -0.09 ) { return new Prediction("Left", 13, 0); }
									if( Y24 < -0.09 ) { return new Prediction("Right", 2, 0); }
								}
								if( X31 >= 0.16 ) { return new Prediction("Left", 305, 0); }
							}
							if( X18 < 0.15 ) { return new Prediction("Right", 6, 0); }
						}
						if( Z22 < 9.56 ) { return new Prediction("Left", 373, 0); }
					}
				}
				if( Z7 >= 9.97 ) {
					if( X14 >= 0.14 ) {
						if( Y18 < -0.02 ) {
							if( X12 >= 0.1 ) {
								if( Z11 < 9.26 ) {
									if( Y22 >= -0.07 ) { return new Prediction("Left", 5, 0); }
									if( Y22 < -0.07 ) { return new Prediction("Right", 2, 0); }
								}
								if( Z11 >= 9.26 ) { return new Prediction("Left", 82, 0); }
							}
							if( X12 < 0.1 ) {
								if( Y16 < -0.14 ) { return new Prediction("Left", 1, 0); }
								if( Y16 >= -0.14 ) { return new Prediction("Right", 5, 0); }
							}
						}
						if( Y18 >= -0.02 ) { return new Prediction("Right", 3, 0); }
					}
					if( X14 < 0.14 ) {
						if( X7 >= 0.34 ) { return new Prediction("Left", 3, 0); }
						if( X7 < 0.34 ) { return new Prediction("Right", 56, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree45() {
		if( X14 < 0.16 ) {
			if( Z5 >= 9.33 ) {
				if( X7 < 0.14 ) {
					if( Z30 >= 9.57 ) { return new Prediction("Right", 696, 0); }
					if( Z30 < 9.57 ) {
						if( Z15 >= 9.93 ) {
							if( X4 >= 0.27 ) { return new Prediction("Left", 5, 0); }
							if( X4 < 0.27 ) { return new Prediction("Right", 14, 0); }
						}
						if( Z15 < 9.93 ) {
							if( X27 < 0.17 ) {
								if( Z7 >= 10.07 ) { return new Prediction("Left", 1, 0); }
								if( Z7 < 10.07 ) { return new Prediction("Right", 6, 0); }
							}
							if( X27 >= 0.17 ) { return new Prediction("Right", 119, 0); }
						}
					}
				}
				if( X7 >= 0.14 ) {
					if( Z21 >= 9.68 ) {
						if( X15 >= 0.06 ) { return new Prediction("Left", 29, 0); }
						if( X15 < 0.06 ) { return new Prediction("Right", 1, 0); }
					}
					if( Z21 < 9.68 ) {
						if( X10 >= 0.02 ) {
							if( Z22 >= 9.37 ) {
								if( Y22 < -0.1 ) {
									if( Y26 < -0.08 ) { return new Prediction("Right", 4, 0); }
									if( Y26 >= -0.08 ) { return new Prediction("Left", 2, 0); }
								}
								if( Y22 >= -0.1 ) { return new Prediction("Right", 70, 0); }
							}
							if( Z22 < 9.37 ) { return new Prediction("Left", 4, 0); }
						}
						if( X10 < 0.02 ) {
							if( X32 < 0.16 ) { return new Prediction("Right", 2, 0); }
							if( X32 >= 0.16 ) { return new Prediction("Left", 8, 0); }
						}
					}
				}
			}
			if( Z5 < 9.33 ) {
				if( X30 < 0.15 ) { return new Prediction("Right", 1, 0); }
				if( X30 >= 0.15 ) { return new Prediction("Left", 66, 0); }
			}
		}
		if( X14 >= 0.16 ) {
			if( X3 >= 0.33 ) {
				if( Z24 >= 9.79 ) {
					if( X15 >= 0.16 ) { return new Prediction("Left", 4, 0); }
					if( X15 < 0.16 ) { return new Prediction("Right", 1, 0); }
				}
				if( Z24 < 9.79 ) { return new Prediction("Right", 39, 0); }
			}
			if( X3 < 0.33 ) {
				if( X23 >= 0.14 ) {
					if( X18 >= 0.14 ) {
						if( X3 >= 0.25 ) {
							if( X12 >= 0.13 ) { return new Prediction("Left", 74, 0); }
							if( X12 < 0.13 ) { return new Prediction("Right", 9, 0); }
						}
						if( X3 < 0.25 ) {
							if( Y28 >= -0.11 ) { return new Prediction("Left", 798, 0); }
							if( Y28 < -0.11 ) {
								if( Y18 >= -0.04 ) { return new Prediction("Right", 1, 0); }
								if( Y18 < -0.04 ) { return new Prediction("Left", 2, 0); }
							}
						}
					}
					if( X18 < 0.14 ) {
						if( Z14 >= 9.86 ) {
							if( X20 < 0.19 ) { return new Prediction("Right", 13, 0); }
							if( X20 >= 0.19 ) { return new Prediction("Left", 1, 0); }
						}
						if( Z14 < 9.86 ) {
							if( X16 < 0.12 ) {
								if( Y7 < -0.1 ) { return new Prediction("Right", 5, 0); }
								if( Y7 >= -0.1 ) { return new Prediction("Left", 1, 0); }
							}
							if( X16 >= 0.12 ) { return new Prediction("Left", 47, 0); }
						}
					}
				}
				if( X23 < 0.14 ) { return new Prediction("Right", 10, 0); }
			}
		}
		return null;
	}
	private Prediction runTree46() {
		if( X10 >= 0.24 ) {
			if( Z27 >= 9.93 ) {
				if( X3 < 0.23 ) { return new Prediction("Left", 32, 0); }
				if( X3 >= 0.23 ) { return new Prediction("Right", 33, 0); }
			}
			if( Z27 < 9.93 ) {
				if( Y27 >= -0.06 ) {
					if( Z7 >= 9.9 ) {
						if( Y10 >= -0.13 ) { return new Prediction("Right", 3, 0); }
						if( Y10 < -0.13 ) { return new Prediction("Left", 1, 0); }
					}
					if( Z7 < 9.9 ) { return new Prediction("Left", 16, 0); }
				}
				if( Y27 < -0.06 ) {
					if( X1 < 0.15 ) {
						if( X29 < 0.16 ) { return new Prediction("Right", 1, 0); }
						if( X29 >= 0.16 ) { return new Prediction("Left", 27, 0); }
					}
					if( X1 >= 0.15 ) {
						if( Z29 >= 9.64 ) {
							if( X22 < 0.22 ) { return new Prediction("Right", 725, 0); }
							if( X22 >= 0.22 ) { return new Prediction("Left", 2, 0); }
						}
						if( Z29 < 9.64 ) {
							if( X14 >= 0.22 ) { return new Prediction("Left", 8, 0); }
							if( X14 < 0.22 ) {
								if( Y1 < 0.04 ) { return new Prediction("Right", 6, 0); }
								if( Y1 >= 0.04 ) { return new Prediction("Left", 1, 0); }
							}
						}
					}
				}
			}
		}
		if( X10 < 0.24 ) {
			if( X24 < 0.15 ) {
				if( Z31 < 9.58 ) {
					if( X13 >= 0.1 ) { return new Prediction("Left", 5, 0); }
					if( X13 < 0.1 ) { return new Prediction("Right", 1, 0); }
				}
				if( Z31 >= 9.58 ) {
					if( X8 < 0.37 ) { return new Prediction("Right", 201, 0); }
					if( X8 >= 0.37 ) { return new Prediction("Left", 1, 0); }
				}
			}
			if( X24 >= 0.15 ) {
				if( X14 < 0.12 ) {
					if( X2 >= 0.11 ) { return new Prediction("Right", 36, 0); }
					if( X2 < 0.11 ) { return new Prediction("Left", 17, 0); }
				}
				if( X14 >= 0.12 ) {
					if( X24 < 0.21 ) {
						if( X22 >= 0.16 ) {
							if( X28 >= 0.16 ) {
								if( X7 < 0.17 ) {
									if( Y32 >= -0.09 ) { return new Prediction("Left", 147, 0); }
									if( Y32 < -0.09 ) {
										if( X29 < 0.17 ) { return new Prediction("Right", 1, 0); }
										if( X29 >= 0.17 ) { return new Prediction("Left", 10, 0); }
									}
								}
								if( X7 >= 0.17 ) { return new Prediction("Left", 674, 0); }
							}
							if( X28 < 0.16 ) {
								if( X23 < 0.2 ) { return new Prediction("Left", 16, 0); }
								if( X23 >= 0.2 ) { return new Prediction("Right", 2, 0); }
							}
						}
						if( X22 < 0.16 ) {
							if( Z8 < 9.94 ) {
								if( X2 < 0.23 ) { return new Prediction("Left", 24, 0); }
								if( X2 >= 0.23 ) {
									if( Y1 >= -0.09 ) { return new Prediction("Left", 3, 0); }
									if( Y1 < -0.09 ) { return new Prediction("Right", 2, 0); }
								}
							}
							if( Z8 >= 9.94 ) {
								if( X13 < 0.17 ) { return new Prediction("Right", 15, 0); }
								if( X13 >= 0.17 ) {
									if( Z26 >= 9.7 ) { return new Prediction("Left", 12, 0); }
									if( Z26 < 9.7 ) { return new Prediction("Right", 3, 0); }
								}
							}
						}
					}
					if( X24 >= 0.21 ) {
						if( X30 >= 0.19 ) { return new Prediction("Left", 1, 0); }
						if( X30 < 0.19 ) { return new Prediction("Right", 7, 0); }
					}
				}
			}
		}
		return null;
	}
	private Prediction runTree47() {
		if( Z1 >= 9.43 ) {
			if( X14 >= 0.14 ) {
				if( X28 >= 0.16 ) {
					if( X23 >= 0.15 ) {
						if( X25 < 0.13 ) { return new Prediction("Right", 3, 0); }
						if( X25 >= 0.13 ) {
							if( X22 < 0.13 ) { return new Prediction("Right", 1, 0); }
							if( X22 >= 0.13 ) {
								if( X27 < 0.15 ) { return new Prediction("Right", 1, 0); }
								if( X27 >= 0.15 ) { return new Prediction("Left", 901, 0); }
							}
						}
					}
					if( X23 < 0.15 ) { return new Prediction("Right", 10, 0); }
				}
				if( X28 < 0.16 ) {
					if( Z5 >= 9.75 ) {
						if( X9 >= 0.19 ) {
							if( Z2 >= 9.82 ) { return new Prediction("Left", 1, 0); }
							if( Z2 < 9.82 ) { return new Prediction("Right", 28, 0); }
						}
						if( X9 < 0.19 ) { return new Prediction("Left", 8, 0); }
					}
					if( Z5 < 9.75 ) {
						if( X30 >= 0.18 ) { return new Prediction("Right", 1, 0); }
						if( X30 < 0.18 ) { return new Prediction("Left", 24, 0); }
					}
				}
			}
			if( X14 < 0.14 ) {
				if( X1 < 0.16 ) {
					if( X12 < 0.21 ) { return new Prediction("Left", 18, 0); }
					if( X12 >= 0.21 ) { return new Prediction("Right", 2, 0); }
				}
				if( X1 >= 0.16 ) {
					if( Z17 >= 9.74 ) {
						if( Z17 < 10.16 ) {
							if( X2 < 0.16 ) {
								if( Y5 < -0.2 ) { return new Prediction("Left", 1, 0); }
								if( Y5 >= -0.2 ) { return new Prediction("Right", 2, 0); }
							}
							if( X2 >= 0.16 ) { return new Prediction("Right", 231, 0); }
						}
						if( Z17 >= 10.16 ) { return new Prediction("Left", 2, 0); }
					}
					if( Z17 < 9.74 ) { return new Prediction("Left", 2, 0); }
				}
			}
		}
		if( Z1 < 9.43 ) {
			if( Y14 < -0.06 ) {
				if( X21 >= 0.19 ) {
					if( X8 >= 0.12 ) { return new Prediction("Left", 12, 0); }
					if( X8 < 0.12 ) { return new Prediction("Right", 15, 0); }
				}
				if( X21 < 0.19 ) {
					if( X23 < 0.2 ) { return new Prediction("Right", 528, 0); }
					if( X23 >= 0.2 ) {
						if( Y16 < -0.04 ) { return new Prediction("Right", 34, 0); }
						if( Y16 >= -0.04 ) { return new Prediction("Left", 2, 0); }
					}
				}
			}
			if( Y14 >= -0.06 ) {
				if( X7 >= 0.16 ) {
					if( X12 >= 0 ) {
						if( X3 < 0.23 ) { return new Prediction("Left", 68, 0); }
						if( X3 >= 0.23 ) { return new Prediction("Right", 1, 0); }
					}
					if( X12 < 0 ) { return new Prediction("Right", 4, 0); }
				}
				if( X7 < 0.16 ) { return new Prediction("Right", 133, 0); }
			}
		}
		return null;
	}
	private Prediction runTree48() {
		if( X7 < 0.14 ) {
			if( X22 >= 0.15 ) {
				if( X14 >= 0.15 ) {
					if( X24 >= 0.13 ) {
						if( X21 >= 0.15 ) { return new Prediction("Left", 103, 0); }
						if( X21 < 0.15 ) { return new Prediction("Right", 2, 0); }
					}
					if( X24 < 0.13 ) { return new Prediction("Right", 3, 0); }
				}
				if( X14 < 0.15 ) {
					if( Z30 < 9.58 ) {
						if( Z12 >= 9.49 ) { return new Prediction("Left", 5, 0); }
						if( Z12 < 9.49 ) { return new Prediction("Right", 11, 0); }
					}
					if( Z30 >= 9.58 ) { return new Prediction("Right", 162, 0); }
				}
			}
			if( X22 < 0.15 ) {
				if( X1 < 0.16 ) {
					if( X10 >= 0.19 ) { return new Prediction("Right", 5, 0); }
					if( X10 < 0.19 ) { return new Prediction("Left", 3, 0); }
				}
				if( X1 >= 0.16 ) { return new Prediction("Right", 742, 0); }
			}
		}
		if( X7 >= 0.14 ) {
			if( X22 >= 0.15 ) {
				if( Y19 >= -0.08 ) {
					if( X14 < 0.12 ) {
						if( Y29 < -0.07 ) {
							if( X19 < 0.23 ) { return new Prediction("Left", 1, 0); }
							if( X19 >= 0.23 ) { return new Prediction("Right", 6, 0); }
						}
						if( Y29 >= -0.07 ) { return new Prediction("Left", 6, 0); }
					}
					if( X14 >= 0.12 ) {
						if( Y17 < -0.04 ) {
							if( Z31 >= 9.79 ) {
								if( X17 < 0.13 ) { return new Prediction("Right", 5, 0); }
								if( X17 >= 0.13 ) { return new Prediction("Left", 63, 0); }
							}
							if( Z31 < 9.79 ) { return new Prediction("Left", 690, 0); }
						}
						if( Y17 >= -0.04 ) {
							if( X5 >= 0.1 ) { return new Prediction("Left", 2, 0); }
							if( X5 < 0.1 ) { return new Prediction("Right", 4, 0); }
						}
					}
				}
				if( Y19 < -0.08 ) {
					if( X15 < 0.13 ) {
						if( Y5 < -0.03 ) { return new Prediction("Right", 17, 0); }
						if( Y5 >= -0.03 ) { return new Prediction("Left", 1, 0); }
					}
					if( X15 >= 0.13 ) {
						if( Z9 < 9.38 ) {
							if( X4 >= 0.08 ) { return new Prediction("Left", 1, 0); }
							if( X4 < 0.08 ) { return new Prediction("Right", 6, 0); }
						}
						if( Z9 >= 9.38 ) {
							if( X19 < 0.28 ) {
								if( Y29 >= -0.08 ) { return new Prediction("Left", 110, 0); }
								if( Y29 < -0.08 ) {
									if( X15 >= 0.22 ) { return new Prediction("Right", 2, 0); }
									if( X15 < 0.22 ) {
										if( Z24 >= 9.72 ) {
											if( X14 >= 0.19 ) { return new Prediction("Left", 2, 0); }
											if( X14 < 0.19 ) { return new Prediction("Right", 2, 0); }
										}
										if( Z24 < 9.72 ) { return new Prediction("Left", 24, 0); }
									}
								}
							}
							if( X19 >= 0.28 ) { return new Prediction("Right", 3, 0); }
						}
					}
				}
			}
			if( X22 < 0.15 ) { return new Prediction("Right", 52, 0); }
		}
		return null;
	}
	private Prediction runTree49() {
		if( X7 < 0.14 ) {
			if( X19 < 0.21 ) {
				if( X27 >= 0.19 ) {
					if( X21 >= 0.15 ) {
						if( Z2 < 9.49 ) { return new Prediction("Right", 21, 0); }
						if( Z2 >= 9.49 ) {
							if( X19 >= 0.2 ) {
								if( X30 < 0.2 ) { return new Prediction("Right", 3, 0); }
								if( X30 >= 0.2 ) { return new Prediction("Left", 2, 0); }
							}
							if( X19 < 0.2 ) { return new Prediction("Left", 22, 0); }
						}
					}
					if( X21 < 0.15 ) { return new Prediction("Right", 323, 0); }
				}
				if( X27 < 0.19 ) {
					if( X14 >= 0.15 ) {
						if( Y11 < -0.03 ) {
							if( X10 >= 0.24 ) {
								if( Y5 < -0.24 ) { return new Prediction("Left", 2, 0); }
								if( Y5 >= -0.24 ) { return new Prediction("Right", 17, 0); }
							}
							if( X10 < 0.24 ) { return new Prediction("Left", 82, 0); }
						}
						if( Y11 >= -0.03 ) { return new Prediction("Right", 12, 0); }
					}
					if( X14 < 0.15 ) {
						if( Z25 >= 9.85 ) {
							if( Z12 >= 9.56 ) { return new Prediction("Left", 3, 0); }
							if( Z12 < 9.56 ) { return new Prediction("Right", 12, 0); }
						}
						if( Z25 < 9.85 ) { return new Prediction("Right", 137, 0); }
					}
				}
			}
			if( X19 >= 0.21 ) {
				if( Z10 < 9.78 ) {
					if( X32 >= 0.18 ) { return new Prediction("Left", 2, 0); }
					if( X32 < 0.18 ) {
						if( X26 < 0.17 ) { return new Prediction("Left", 1, 0); }
						if( X26 >= 0.17 ) { return new Prediction("Right", 62, 0); }
					}
				}
				if( Z10 >= 9.78 ) { return new Prediction("Right", 340, 0); }
			}
		}
		if( X7 >= 0.14 ) {
			if( Z19 >= 9.82 ) {
				if( Z12 < 9.5 ) {
					if( Z18 < 9.84 ) { return new Prediction("Left", 1, 0); }
					if( Z18 >= 9.84 ) {
						if( Y10 >= -0.04 ) {
							if( X19 >= 0.2 ) { return new Prediction("Right", 3, 0); }
							if( X19 < 0.2 ) { return new Prediction("Left", 1, 0); }
						}
						if( Y10 < -0.04 ) { return new Prediction("Right", 48, 0); }
					}
				}
				if( Z12 >= 9.5 ) {
					if( X15 < 0.11 ) { return new Prediction("Right", 4, 0); }
					if( X15 >= 0.11 ) { return new Prediction("Left", 98, 0); }
				}
			}
			if( Z19 < 9.82 ) {
				if( X3 < 0.29 ) {
					if( X17 < 0.22 ) {
						if( Z12 >= 10 ) { return new Prediction("Right", 7, 0); }
						if( Z12 < 10 ) {
							if( X14 >= 0.11 ) {
								if( X8 >= 0.2 ) { return new Prediction("Left", 563, 0); }
								if( X8 < 0.2 ) {
									if( X22 >= 0.15 ) {
										if( Z6 < 9.83 ) { return new Prediction("Left", 173, 0); }
										if( Z6 >= 9.83 ) {
											if( Y16 >= -0.08 ) { return new Prediction("Left", 27, 0); }
											if( Y16 < -0.08 ) {
												if( Y29 >= -0.08 ) { return new Prediction("Left", 9, 0); }
												if( Y29 < -0.08 ) { return new Prediction("Right", 1, 0); }
											}
										}
									}
									if( X22 < 0.15 ) {
										if( Y19 >= -0.08 ) { return new Prediction("Right", 2, 0); }
										if( Y19 < -0.08 ) { return new Prediction("Left", 4, 0); }
									}
								}
							}
							if( X14 < 0.11 ) {
								if( X29 >= 0.19 ) { return new Prediction("Left", 1, 0); }
								if( X29 < 0.19 ) { return new Prediction("Right", 2, 0); }
							}
						}
					}
					if( X17 >= 0.22 ) {
						if( X30 < 0.17 ) { return new Prediction("Right", 12, 0); }
						if( X30 >= 0.17 ) { return new Prediction("Left", 5, 0); }
					}
				}
				if( X3 >= 0.29 ) {
					if( X32 < 0.17 ) { return new Prediction("Right", 25, 0); }
					if( X32 >= 0.17 ) {
						if( X21 >= 0.14 ) { return new Prediction("Left", 4, 0); }
						if( X21 < 0.14 ) { return new Prediction("Right", 2, 0); }
					}
				}
			}
		}
		return null;
	}
}

