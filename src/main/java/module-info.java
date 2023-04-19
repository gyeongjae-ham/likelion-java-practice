module com.likelion.project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.project1 to javafx.fxml;
    exports com.likelion.project1;
}
