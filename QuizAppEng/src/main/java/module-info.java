module quizappv1.quizappeng {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens quizappv1.quizappeng to javafx.fxml;
    exports quizappv1.quizappeng;
}
