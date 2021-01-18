package view;

import controller.buyer.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Useroperation {

    @FXML
    private Button btn_register;

    @FXML
    private Button btn_upgrade;

    @FXML
    private Text txt_print;

    @FXML
    private Text txt_upgradeprint;

    @FXML
    void callprint(ActionEvent event) {
        BuyerService sunShineBuyersClub = new BuyerService();
        sunShineBuyersClub.register("tom");
        sunShineBuyersClub.register("george",400);
        sunShineBuyersClub.register("sam",50);
        sunShineBuyersClub.register("ruth",150);
        sunShineBuyersClub.register("amid");
        StringBuffer stringBuffer = new StringBuffer();
        for (String name : sunShineBuyersClub.getAllBuyersWithName().keySet())
        stringBuffer.append(name + "'s UserID and status are " + sunShineBuyersClub.getAllBuyersWithName().get(name).getUserId() + " and " + sunShineBuyersClub.getAllBuyersWithName().get(name).getStatus() + ", respectively."+"\n");
        txt_print.setText(stringBuffer.toString());
    }

    @FXML
    void callupgrade(ActionEvent event) {
        txt_print.setVisible(false);
        BuyerService LunaBuyersClub = new BuyerService();
        LunaBuyersClub.register("tom");
        LunaBuyersClub.register("george",400);
        LunaBuyersClub.register("sam",50);
        LunaBuyersClub.register("ruth",150);
        LunaBuyersClub.register("amid");
        LunaBuyersClub.upgradeMembership("tom");
        LunaBuyersClub.upgradeMembership("george");
        LunaBuyersClub.upgradeMembership("sam");
        LunaBuyersClub.upgradeMembership("ruth");
        LunaBuyersClub.upgradeMembership("amid");
        StringBuffer stringBuffer2 = new StringBuffer();
        for (String name : LunaBuyersClub.getAllBuyersWithName().keySet())
            stringBuffer2.append(name + "'s UserID and status are " + LunaBuyersClub.getAllBuyersWithName().get(name).getUserId() + " and " + LunaBuyersClub.getAllBuyersWithName().get(name).getStatus() + ", respectively."+"\n");
        txt_upgradeprint.setText(stringBuffer2.toString());

    }

}
