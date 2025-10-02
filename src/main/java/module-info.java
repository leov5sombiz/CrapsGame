module com.example.crapsgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.graphics;


    opens com.example.crapsgame to javafx.fxml;
    opens com.example.crapsgame.controller to javafx.fxml;

    exports com.example.crapsgame;
}