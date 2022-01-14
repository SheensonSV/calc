module com.forfun.calc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.forfun.calc to javafx.fxml;
    exports com.forfun.calc;
}