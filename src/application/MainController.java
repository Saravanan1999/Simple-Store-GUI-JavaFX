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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable{
	

	@FXML
	private TextField usr;
	@FXML
	private TextField pss;
	@FXML
	private TextField mob;
	@FXML
	private ComboBox<Integer> q1;
	@FXML
	private ComboBox<Integer> q2;
	@FXML
	private ComboBox<Integer> q3;
	@FXML
	private ComboBox<Integer> q4;
	@FXML
	private ComboBox<Integer> q5;
	@FXML
	private ComboBox<Integer> q6;
	@FXML
	private ComboBox<Integer> q7;
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
	private RadioButton r1;
	@FXML
	private RadioButton r2;
	@FXML
	private RadioButton r3;
	@FXML
	private Label l1;
	@FXML
	private Label l2;
	@FXML
	private Label l3;
	ObservableList<Integer> l = FXCollections.observableArrayList(1,2,3,4,5);
	
	static String user;
	static String pass;
	static String country;
	static String gender;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		q1.getItems().addAll(l);
		q2.getItems().addAll(l);
		q3.getItems().addAll(l);
		q4.getItems().addAll(l);
		q5.getItems().addAll(l);
		q6.getItems().addAll(l);
		q7.getItems().addAll(l);
	}


	
	public void Order(ActionEvent event) throws Exception{
		int total_price=0;
		int q;
		if(i1.isSelected()) {
			
			q=q1.getValue();
			total_price +=q*20;
		
		}
		if(i2.isSelected()) {
			
			q=q2.getValue();
			total_price +=q*40;
			
		}
		if(i3.isSelected()) {
			
			q=q3.getValue();
			total_price +=q*60;
			
		}
		if(i4.isSelected()) {
			q=q4.getValue();
			total_price +=q*80;
			
		}
		if(i5.isSelected()) {
			q=q5.getValue();
			total_price +=q*10;
			
		}
		if(i6.isSelected()) {
			q=q6.getValue();
			total_price +=q*25;
			
		}
		if(i7.isSelected()) {
			q=q7.getValue();
			total_price +=q*95;
			
		}
		if(total_price!=0) {
			l1.setText("Your order has been placed successfully");
			l2.setText("Total order price:"+total_price);
			if(r2.isSelected()) {
				l3.setText("Payment Method:Credit/Debit Card");
			}
			else if(r3.isSelected()) {
				l3.setText("Payment Method:Netbanking");
			}
			else {
				l3.setText("Payment Method:Cash On Delivery");
			}
		}
		
	
		
		
	}
	public void check1(ActionEvent event) {
		if(r1.isSelected()) {
			r2.setSelected(false);
			r3.setSelected(false);
		}
	}
	public void check2(ActionEvent event) {
		if(r2.isSelected()) {
			r1.setSelected(false);
			r3.setSelected(false);
		}
	}
	public void check3(ActionEvent event) {
		if(r3.isSelected()) {
			r1.setSelected(false);
			r2.setSelected(false);
		}
	}

	

}
