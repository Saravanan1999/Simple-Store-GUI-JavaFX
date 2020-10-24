package application;
	
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;



public class Main extends Application implements Initializable{

    private static Stage primaryStage; 
    @FXML
    
	private TextField usr;
	@FXML
	private TextField pss;
	@FXML
	private TextField mob;
	@FXML
	private ChoiceBox<String> gen;
    @FXML
    private ComboBox<String> cntry;
    @FXML
	private Label status;
	@FXML
	private Label sgnlab;
	@FXML
	private TextField txtUsername;
	@FXML
	private PasswordField txtPassword;
	
	
	static String user;
	static String pass;
	static String mobile;
	static String country;
	static String gender;
    ObservableList<String> list = FXCollections.observableArrayList("Male","Female","Others");
    ObservableList<String> countrylist = FXCollections.observableArrayList("Australia","India","United States","United Kingdom");
    private void setPrimaryStage(Stage stage) {
        Main.primaryStage = stage;
    }

    static public Stage getPrimaryStage() {
        return Main.primaryStage;
    }
    public void Signup(ActionEvent event) throws Exception{
    	user = usr.getText();
    	pass = pss.getText();
    	mobile = mob.getText();
    	country = cntry.getValue();
    	gender = gen.getValue();
    	sgnlab.setText("SignUp Success");
    }
	public void Submit(ActionEvent event) throws Exception {
		
		if(txtUsername.getText().equals(user) && txtPassword.getText().equals(pass)) {
			Stage s = getPrimaryStage();
			status.setText("Login Success");
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene2 = new Scene(root,639,731);
			s.setScene(scene2);
			s.show();
		}
		else {
			status.setText("Login Failed");
		}
	}
	
	public void start(Stage primaryStage) {
		try {
			setPrimaryStage(primaryStage);
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene1 = new Scene(root,667,450);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene1);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		gen.setItems(list);
		cntry.setItems(countrylist);
	}


}
