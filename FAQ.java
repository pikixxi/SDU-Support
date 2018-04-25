package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
//My class extends from Pane
public class FAQ extends Pane {
    //Create Variable
    Button buttonMenuFAQ;
    public FAQ(){

        //Scene for FAQ
        //Create Image
        ImageView imageMenu = new ImageView(new Image(getClass().getResourceAsStream("menu.png")));
        imageMenu.setFitHeight(20);
        imageMenu.setFitWidth(20);

        //Create Label and Set CSS
        Label labelFAQ = new Label("FAQ");
        labelFAQ.setId("label");

        //Create Button and Set size and CSS
        buttonMenuFAQ = new Button("",imageMenu);
        buttonMenuFAQ.setPrefSize(20,20);
        buttonMenuFAQ.setId("button");

        //Create HBox and Set Position, CSS, Size, Spacing and Elements
        HBox hBoxFAQ = new HBox();
        hBoxFAQ.setAlignment(Pos.CENTER_LEFT);
        hBoxFAQ.setId("hBox");
        hBoxFAQ.setPrefSize(300,40);
        hBoxFAQ.setSpacing(10);
        hBoxFAQ.getChildren().addAll(buttonMenuFAQ, labelFAQ);

        //add image
        ImageView imageViewFAQ = new ImageView(new Image(getClass().getResourceAsStream("sduback.jpg")));
        imageViewFAQ.setFitWidth(300);
        imageViewFAQ.setFitHeight(460);

        //Create GridPane
        GridPane gridPaneFAQ = new GridPane();
        gridPaneFAQ.add(hBoxFAQ,0,0);
        gridPaneFAQ.add(imageViewFAQ,0,1);

        //Set GridPane to the Pane
        getChildren().addAll(gridPaneFAQ);


    }
}
