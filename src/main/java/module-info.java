module com.revisionapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.revisionapp to javafx.fxml;
    exports com.revisionapp;
}