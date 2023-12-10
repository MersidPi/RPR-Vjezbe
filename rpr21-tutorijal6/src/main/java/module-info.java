module com.example.rpr21tutorijal6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpr21tutorijal6 to javafx.fxml;
    exports com.example.rpr21tutorijal6;
}