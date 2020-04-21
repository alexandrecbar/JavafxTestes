package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

	@FXML
	private MenuItem Inserir;

	@FXML
	private MenuItem Editar;

	@FXML
	private MenuItem Deletar;

	@FXML
	private MenuItem Sair;

	@FXML
	private MenuItem Ferramentas;

	@FXML
	private MenuItem Auxiliares;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("BoxPrincipal.fxml"));
//			ScrollPane scrollPane = loader.load();
//
//			scrollPane.setFitToHeight(true);
//			scrollPane.setFitToWidth(true);

			VBox vbox = loader.load();
			Scene mainScene = new Scene(vbox);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Janela teste com Javafx");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	@FXML
	public void inserir() {

		Alert inserir = new Alert(Alert.AlertType.INFORMATION);
		inserir.setTitle("Inserir");
		inserir.show();

	}

	@FXML
	public void editar() {

		Alert inserir = new Alert(Alert.AlertType.INFORMATION);
		inserir.setTitle("Editar");
		inserir.show();

	}

	@FXML
	public void deletar() {

		Alert inserir = new Alert(Alert.AlertType.INFORMATION);
		inserir.setTitle("Deletar");
		inserir.show();

	}

	@FXML
	public void sair() {

		Alert inserir = new Alert(Alert.AlertType.INFORMATION);
		inserir.setTitle("Sair");
		inserir.show();

	}

	@FXML
	public void Ferramentas() {

		Alert inserir = new Alert(Alert.AlertType.INFORMATION);
		inserir.setTitle("Ferramentas");
		inserir.show();

	}

	@FXML
	public void Auxiliares() {

		Alert inserir = new Alert(Alert.AlertType.INFORMATION);
		inserir.setTitle("Auxiliares");
		inserir.show();

	}

}
