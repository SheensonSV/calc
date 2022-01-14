package com.forfun.calc;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;

public class TestController {
    private Double percent = 0.;
    @FXML
    private ProgressBar progressBar;

    @FXML
    protected void onProgressBarClick() throws InterruptedException {
        for (Integer i = 1; i <= 100; i++)
        {
            percent = percent + i.doubleValue() / 100;
            progressBar.setProgress(i);
            Thread.sleep(100);
        }
        percent = percent + 0.005D;
        progressBar.setProgress(percent);
    }
}