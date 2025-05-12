module org.example.judlj_test_sifrovacka {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.judlj_test_sifrovacka to javafx.fxml;
    exports org.example.judlj_test_sifrovacka;
}