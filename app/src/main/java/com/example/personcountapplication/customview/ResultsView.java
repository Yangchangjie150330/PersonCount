package com.example.personcountapplication.customview;

import java.util.List;
import org.tensorflow.lite.examples.detection.tflite.Detector.Recognition;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
