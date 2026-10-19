package com.main.ejercicio1_3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtNumero;
    @FXML
    private Button btnAnalizar;
    @FXML
    private Button btnLimpiar;
    @FXML
    private TextField txtCantCifras;
    @FXML
    private TextField txtSumaImpares;
    @FXML
    private TextField txtSumaPares;
    @FXML
    private TextField txtSumaTotal;
    @FXML
    private TextField txtCifraMayor;
    @FXML
    private TextField txtCifraMenor;
    @FXML
    private TextArea txtDivisores;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void btnAnalizarOnAction(ActionEvent event) {
        int n = Integer.parseInt(txtNumero.getText());
        int aux = n;
        
        int cantCifras = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int cifraMayor = -1;
        int cifraMenor = 10;
        
        while (aux > 0) {
            int digito = aux % 10;
            cantCifras = cantCifras + 1;
            sumaTotal = sumaTotal + digito;
            
            if (digito % 2 == 0) {
                sumaPares = sumaPares + digito;
            } else {
                sumaImpares = sumaImpares + digito;
            }
            
            if (digito > cifraMayor) {
                cifraMayor = digito;
            }
            
            if (digito < cifraMenor) {
                cifraMenor = digito;
            }
            
            aux = aux / 10;
        }
        
        String listaDivisores = "";
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                listaDivisores = listaDivisores + i + "\n";
            }
            i = i + 1;
        }
        
        txtCantCifras.setText(String.valueOf(cantCifras));
        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtCifraMayor.setText(String.valueOf(cifraMayor));
        txtCifraMenor.setText(String.valueOf(cifraMenor));
        txtDivisores.setText(listaDivisores);
    }

    @FXML
    private void btnLimpiarOnAction(ActionEvent event) {
        txtNumero.setText("");
        txtCantCifras.setText("");
        txtSumaImpares.setText("");
        txtSumaPares.setText("");
        txtSumaTotal.setText("");
        txtCifraMayor.setText("");
        txtCifraMenor.setText("");
        txtDivisores.setText("");
    }
}
