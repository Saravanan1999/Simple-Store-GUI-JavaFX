package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class ResetController{
	@FXML
	private PasswordField oldpass;
	@FXML
	private PasswordField newpass;
	@FXML
	private Label resetlabel;
	public void ResetPass(ActionEvent e) throws Exception {
		if((oldpass.getText()).equals(Main.pass)) {
			Main.pass = newpass.getText();
			resetlabel.setText("Password reset successfully");
			
		}
		else {
			resetlabel.setText("Current password incorrect");
		}
	}
	public void Btmp(ActionEvent e) throws Exception{
		Stage s = Main.getPrimaryStage();
		
		Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene scene2 = new Scene(root,639,731);
		s.setScene(scene2);
		s.show();
	}
	
}
