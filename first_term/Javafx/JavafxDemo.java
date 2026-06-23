package Javafx;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class JavafxDemo extends Application {
    public void start(Stage stage)
    {
        TextField name=new TextField();
        Label namel=new Label("Name:");
        Button ok=new Button("OK");
        ok.setOnAction(e -> 
        {
           String nameTxt= name.getText ();
           name.setText(nameTxt.toUpperCase());

        });

        HBox hbox=new HBox();
        hbox.getChildren().add(namel);
        hbox.getChildren().add(name);
        hbox.getChildren().add(ok);

        Scene sc=new Scene(hbox,400,400);
        stage.setScene(sc);
        stage.setTitle("my fx example");
        stage.show();



    }
    public static void main(String[]args)
    {
        launch(args);
    }

}
