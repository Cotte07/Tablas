package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.Hyperlink;

public class LoginController {
	@FXML
	private TextField idTxtUsuario;
	@FXML
	private TextField idTxtContrasena;
	@FXML
	private Button IdbtnIngresar;
	@FXML
	private Hyperlink idLinkOlvidar;

	// Event Listener on Button[#IdbtnIngresar].onMouseClicked
	@FXML
	public void ClicIngresar(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Hyperlink[#idLinkOlvidar].onMouseClicked
	@FXML
	public void ClicOlvidasteContrasena(MouseEvent event) {
		// TODO Autogenerated
	}
}
