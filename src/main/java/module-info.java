module com.example.javaprojekt {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javaprojekt to javafx.fxml;
    exports com.example.javaprojekt;
}