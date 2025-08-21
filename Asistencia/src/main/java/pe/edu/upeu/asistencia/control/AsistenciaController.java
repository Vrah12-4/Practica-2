package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.springframework.stereotype.Controller;

@Controller
public class AsistenciaController {

    @FXML
    TextField textNum1, txtNum2;
    @FXML Label txtResult;

    @FXML
    public void sumar() {
        double num1 = Double.parseDouble(textNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        double resultado = num1 + num2;
        txtResult.setText(String.valueOf(resultado));
    }

}
