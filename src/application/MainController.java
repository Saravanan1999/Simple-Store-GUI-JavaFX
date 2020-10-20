package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController{
	@FXML
	private Label status;
	@FXML
	private TextField txtUsername;
	@FXML
	private TextField txtPassword;
	@FXML
	private CheckBox i1;
	@FXML
	private CheckBox i2;
	@FXML
	private CheckBox i3;
	@FXML
	private CheckBox i4;
	@FXML
	private CheckBox i5;
	@FXML
	private CheckBox i6;
	@FXML
	private CheckBox i7;
	@FXML
	private Label l1;
	@FXML
	private Label l2;
	
	private ComboBox<String> c;
	public void Submit(ActionEvent event) throws Exception {
		
		if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")) {
			Stage s = Main.getPrimaryStage();
			status.setText("Login Success");
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,600,650);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			s.setScene(scene);
			s.show();
		}
		else {
			status.setText("Login Failed");
		}
	}

	
	public void Order(ActionEvent event) throws Exception{
		int total_price=0;
		if(i1.isSelected()) {
			total_price +=20;
		}
		if(i2.isSelected()) {
			total_price +=40;
		}
		if(i3.isSelected()) {
			total_price +=60;
		}
		if(i4.isSelected()) {
			total_price +=80;
		}
		if(i5.isSelected()) {
			total_price +=10;
		}
		if(i6.isSelected()) {
			total_price +=25;
		}
		if(i7.isSelected()) {
			total_price +=95;
		}
		if(total_price!=0) {
			l1.setText("Your order has been placed successfully");
			l2.setText("Total order price:"+total_price);
		}
	
		
	}

}
