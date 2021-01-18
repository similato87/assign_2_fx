package view;

import controller.part.PartService;
import model.Part;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Set;

public class CargoTrace {


    @FXML
    private Label txtdescription;

    @FXML
    private Label txtprices;

    @FXML
    private TextField txfcode;

    @FXML
    void callgetgoods(ActionEvent event) {
        PartService.init();
        Set<Part> partSet = PartService.getAllParts();
//       System.out.println(txfcode.getText());
        for (Part p : partSet) {
            if (p.getCode() == txfcode.getText()) ;
            {
                txtprices.setText(String.valueOf(p.getPrice()));
                txtdescription.setText(p.getDescription());
                txtprices.setVisible(true);
                txtdescription.setVisible(true);
            }
        }


    }
    @FXML
    void callrefresh(ActionEvent event) {

    }

}

