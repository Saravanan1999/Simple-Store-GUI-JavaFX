package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class OrderItems implements Initializable{
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
	@FXML
	private ComboBox<String> c;
	@FXML
	private Label l;
	ObservableList<String> lst = FXCollections.observableArrayList("1","2","3");
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
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		c.setItems(lst);
	}
}
