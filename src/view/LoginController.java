package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private TextField txt_username;

    @FXML
    private TextField txt_password;

    @FXML
    private TextField txt_confirm_password;

    @FXML
    private TextField txt_email;

    @FXML
    private DatePicker datepick;

    @FXML
    private Button btn_register;

    @FXML
    private Text txt_result;

    @FXML
    void callsettxtsucc(ActionEvent event) {
        txt_result.setText("Register Successfully");
    }

    @FXML
    void calldoublecheck(ActionEvent event) {

    }

    @FXML
    void callsendbirt(ActionEvent event) {

    }

    @FXML
    void callsendemail(ActionEvent event) {

    }

    @FXML
    void callsendpassword(ActionEvent event) {

    }

    @FXML
    void callsendusername(ActionEvent event) {

    }


}
