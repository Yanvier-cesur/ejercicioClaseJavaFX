module org.example.ejercicioclasejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejercicioclasejavafx to javafx.fxml;
    exports org.example.ejercicioclasejavafx;
}