module com.likelion.project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.project1 to javafx.fxml;
    exports com.likelion.project1;
    exports com.likelion.project1.week1.day1;
    opens com.likelion.project1.week1.day1 to javafx.fxml;
    exports com.likelion.project1.week1.day2;
    opens com.likelion.project1.week1.day2 to javafx.fxml;
}
