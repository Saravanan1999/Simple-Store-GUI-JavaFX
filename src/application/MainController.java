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
	private TextField q1;
	@FXML
	private TextField q2;
	@FXML
	private TextField q3;
	@FXML
	private TextField q4;
	@FXML
	private TextField q5;
	@FXML
	private TextField q6;
	@FXML
	private TextField q7;
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
		int q;
		if(i1.isSelected()) {
			q = Integer.parseInt(q1.getText());
			if(q<=0) {
				total_price +=q*20;
			}
		}
		if(i2.isSelected()) {
			q = Integer.parseInt(q2.getText());
			if(q<=0) {
				total_price +=q*40;
			}
		}
		if(i3.isSelected()) {
			q = Integer.parseInt(q3.getText());
			if(q<=10) {
				total_price +=q*60;
			}
		}
		if(i4.isSelected()) {
			q = Integer.parseInt(q4.getText());
			if(q<=10) {
				total_price +=q*80;
			}
		}
		if(i5.isSelected()) {
			q = Integer.parseInt(q5.getText());
			if(q<=10) {
				total_price +=q*10;
			}
		}
		if(i6.isSelected()) {
			q = Integer.parseInt(q6.getText());
			if(q<=10) {
				total_price +=q*25;
			}
		}
		if(i7.isSelected()) {
			q = Integer.parseInt(q7.getText());
			if(q<=10) {	
				total_price +=q*95;
			}
		}
		if(total_price!=10) {
			l1.setText("Your order has been placed successfully");
			l2.setText("Total order price:"+total_price);
		}
	
		
	}

}
