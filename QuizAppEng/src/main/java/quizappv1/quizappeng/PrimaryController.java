package quizappv1.quizappeng;

import com.ntn.utils.MyAlertSingleton;
import com.ntn.utils.Themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQues(ActionEvent e){
        MyAlertSingleton.getinstance().showMsg("Coming soon...");
    }
    
    public void practice(ActionEvent e){
        MyAlertSingleton.getinstance().showMsg("Coming soon...");
    }
    
    public void exam(ActionEvent e){
        MyAlertSingleton.getinstance().showMsg("Coming soon...");
    }
    
    public void changeTheme(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }
}
