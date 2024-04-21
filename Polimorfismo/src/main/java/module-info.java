module com.Kat.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.Kat.polimorfismo.models to javafx.base;
    opens com.Kat.polimorfismo to javafx.fxml;
    exports com.Kat.polimorfismo;
    exports com.Kat.polimorfismo.controllers;
    opens com.Kat.polimorfismo.controllers to javafx.fxml;
}