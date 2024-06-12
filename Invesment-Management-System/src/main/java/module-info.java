module org.example.db {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.jfoenix;
    requires java.sql;
    requires javafx.base;


    opens org.example.db to javafx.fxml;
    exports org.example.db;
}