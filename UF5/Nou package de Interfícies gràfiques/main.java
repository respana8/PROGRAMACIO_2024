import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class main{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage escenariPrincipal) {
        Button boto = new Button("BOTÓ");
        boto.setOnAction(e -> salutacio());
        StackPane arrel = new StackPane();
        arrel.getChildren().add(boto);
        Disposicio disposicio = new Disposicio(arrel, 300, 200);
        escenariPrincipal.setTitle("JavaFX");
        escenariPrincipal.setScene(disposicio);
        escenariPrincipal.show();
    }
    private void salutacio() {
        Stage finestra = new Stage();
        finestra.initModality(Modality.APPLICATION_MODAL);
        finestra.setTitle("JAVAFX");
        VBox contingut = new VBox(10);
        contingut.getChildren().addAll(etiqueta);
        contingut.setStyle("-fx-padding: 20px;");
        Scene disposicio = new Disposicio(contingut, 300, 150);
        finestra.setScene(disposicio);
        finestra.showAndWait();
    }
}
