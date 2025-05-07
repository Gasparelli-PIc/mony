module com.mony {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mony to javafx.fxml;
    exports com.mony;
}
