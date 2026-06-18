module quizappv1.quizappeng {
    requires javafx.controls;
    requires javafx.fxml;

    opens quizappv1.quizappeng to javafx.fxml;
    exports quizappv1.quizappeng;
}
