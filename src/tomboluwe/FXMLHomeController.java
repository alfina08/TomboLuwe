package tomboluwe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class FXMLHomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXCheckBox mak1;

    @FXML
    private JFXCheckBox mak2;

    @FXML
    private JFXCheckBox mak3;

    @FXML
    private JFXCheckBox mak4;

    @FXML
    private JFXCheckBox mak5;

    @FXML
    private JFXCheckBox mak6;

    @FXML
    private JFXCheckBox mak7;

    @FXML
    private JFXCheckBox mak8;

    @FXML
    private Label hargaMakanan;

    @FXML
    private Label hargaMakanan1;

    @FXML
    private Label hargaMakanan11;

    @FXML
    private Label hargaMakanan13;

    @FXML
    private Label hargaMakanan12;

    @FXML
    private Label hargaMakanan121;

    @FXML
    private Label hargaMakanan1211;

    @FXML
    private Label hargaMakanan12111;

    @FXML
    private JFXTextField jumlah1;

    @FXML
    private JFXTextField jumlah6;

    @FXML
    private JFXTextField jumlah7;

    @FXML
    private JFXTextField jumlah8;

    @FXML
    private JFXTextField jumlah2;

    @FXML
    private JFXTextField jumlah3;

    @FXML
    private JFXTextField jumlah4;

    @FXML
    private JFXTextField jumlah5;

    @FXML
    private JFXButton btnCetak1;

    @FXML
    private JFXTextField inAn;

    @FXML
    private JFXTextField jumlahUang;

    @FXML
    private Label total;

    @FXML
    private JFXButton btnCetak;

    @FXML
    private JFXTextArea hasilPesanan;

    @FXML
    private JFXRadioButton radio1;

    @FXML
    private ToggleGroup keterangan;

    @FXML
    private JFXRadioButton radio2;

    @FXML
    void CetakPemesan(ActionEvent event) {

    }

    @FXML
    void Hitung(ActionEvent event) {

    }

    @FXML
    void bebekgoreng(ActionEvent event) {

    }

    @FXML
    void nasiAnget(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert mak1 != null : "fx:id=\"mak1\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak2 != null : "fx:id=\"mak2\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak3 != null : "fx:id=\"mak3\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak4 != null : "fx:id=\"mak4\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak5 != null : "fx:id=\"mak5\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak6 != null : "fx:id=\"mak6\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak7 != null : "fx:id=\"mak7\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert mak8 != null : "fx:id=\"mak8\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan != null : "fx:id=\"hargaMakanan\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan1 != null : "fx:id=\"hargaMakanan1\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan11 != null : "fx:id=\"hargaMakanan11\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan13 != null : "fx:id=\"hargaMakanan13\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan12 != null : "fx:id=\"hargaMakanan12\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan121 != null : "fx:id=\"hargaMakanan121\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan1211 != null : "fx:id=\"hargaMakanan1211\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hargaMakanan12111 != null : "fx:id=\"hargaMakanan12111\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah1 != null : "fx:id=\"jumlah1\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah6 != null : "fx:id=\"jumlah6\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah7 != null : "fx:id=\"jumlah7\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah8 != null : "fx:id=\"jumlah8\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah2 != null : "fx:id=\"jumlah2\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah3 != null : "fx:id=\"jumlah3\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah4 != null : "fx:id=\"jumlah4\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlah5 != null : "fx:id=\"jumlah5\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert btnCetak1 != null : "fx:id=\"btnCetak1\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert inAn != null : "fx:id=\"inAn\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert jumlahUang != null : "fx:id=\"jumlahUang\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert btnCetak != null : "fx:id=\"btnCetak\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert hasilPesanan != null : "fx:id=\"hasilPesanan\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert radio1 != null : "fx:id=\"radio1\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert keterangan != null : "fx:id=\"keterangan\" was not injected: check your FXML file 'LocalFest.fxml'.";
        assert radio2 != null : "fx:id=\"radio2\" was not injected: check your FXML file 'LocalFest.fxml'.";

    }
}
