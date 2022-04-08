module com.example.fromintellijjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fromintellijjavafx to javafx.fxml;
    exports com.example.fromintellijjavafx;
}