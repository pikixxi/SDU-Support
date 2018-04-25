package sample;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;


import java.io.File;
import java.io.IOException;
//My Class extends from Pane
public class Books extends Pane {
// Create variables
    Button buttonMenu;
    File fileFiz;
    File fileFizKey;
    File fileBer;
    File fileRyb;
    File fileRyb2;
    File fileRos;
    Button buttonFiz;
    Button buttonFizKey;
    Button buttonBer;
    Button buttonRyb;
    Button buttonRyb2;
    Button buttonRos;
    public Books(){
        //Scene for books
        // Add images
        ImageView imageMenu = new ImageView(new Image(getClass().getResourceAsStream("menu.png")));
        imageMenu.setFitHeight(20);
        imageMenu.setFitWidth(20);

        //button for to go back
        buttonMenu = new Button("",imageMenu);
        buttonMenu.setPrefSize(20,20);
        buttonMenu.setId("button");

        //Create Label and Set CSS
        Label labelBook = new Label("Книги");
        labelBook.setId("label");

        //Create HBox and Set Position, CSS, Size, Spacing and Elements
        HBox hBoxBook = new HBox();
        hBoxBook.setAlignment(Pos.CENTER_LEFT);
        hBoxBook.setId("hBox");
        hBoxBook.setPrefSize(150, 40);
        hBoxBook.setSpacing(10);
        hBoxBook.getChildren().addAll(buttonMenu, labelBook);
        HBox hBoxBook1 =new HBox();
        hBoxBook1.setPrefSize(150,40);
        hBoxBook1.setId("hBox");

        //books
        ImageView imageViewFizika = new ImageView(new Image(getClass().getResourceAsStream("fizik.jpg")));
        imageViewFizika.setFitHeight(140);
        imageViewFizika.setFitWidth(135);

        ImageView imageViewFizikaKey = new ImageView(new Image(getClass().getResourceAsStream("fizikkeubook.jpg")));
        imageViewFizikaKey.setFitHeight(140);
        imageViewFizikaKey.setFitWidth(135);

        ImageView imageViewBer = new ImageView(new Image(getClass().getResourceAsStream("ber.jpg")));
        imageViewBer.setFitHeight(140);
        imageViewBer.setFitWidth(135);

        ImageView imageViewRyb = new ImageView(new Image(getClass().getResourceAsStream("bushko.jpg")));
        imageViewRyb.setFitHeight(140);
        imageViewRyb.setFitWidth(135);

        ImageView imageViewRyb2 = new ImageView(new Image(getClass().getResourceAsStream("bushko2.jpg")));
        imageViewRyb2.setFitHeight(140);
        imageViewRyb2.setFitWidth(135);

        ImageView imageViewRosen = new ImageView(new Image(getClass().getResourceAsStream("rosen.jpg")));
        imageViewRosen.setFitHeight(140);
        imageViewRosen.setFitWidth(135);

        buttonFiz = new Button("",imageViewFizika);
        buttonFiz.setPrefSize(135,140);
        //Add books tp program
        fileFiz = new File("C:/Users/User/IdeaProjects/SDU_Support/src/sample/6th.pdf");

        buttonFizKey = new Button("",imageViewFizikaKey);
        buttonFizKey.setPrefSize(135,140);
        fileFizKey = new File("C:/Users/User/IdeaProjects/SDU_Support/src/sample/Physics-keybook.pdf");

        buttonBer = new Button("",imageViewBer);
        buttonBer.setPrefSize(135,140);
        fileBer = new File("C:/Users/User/IdeaProjects/SDU_Support/src/sample/berm.pdf");

        buttonRyb = new Button("",imageViewRyb);
        buttonRyb.setPrefSize(135,140);
        fileRyb = new File("C:/Users/User/IdeaProjects/SDU_Support/src/sample/Ryabushko.pdf");

        buttonRyb2 = new Button("",imageViewRyb2);
        buttonRyb2.setPrefSize(135,140);
        fileRyb2 = new File("C:/Users/User/IdeaProjects/SDU_Support/src/sample/ryabushko2.pdf");

        buttonRos = new Button("",imageViewRosen);
        buttonRos.setPrefSize(135,140);
        fileRos = new File("C:/Users/User/IdeaProjects/SDU_Support/src/sample/Rosen.pdf");

        //Create GridPane and set Position,Elements
        GridPane gridPaneBook = new GridPane();
        gridPaneBook.add(hBoxBook, 0, 0);
        gridPaneBook.add(hBoxBook1,1,0);
        gridPaneBook.add(buttonFiz,0,1);
        gridPaneBook.add(buttonFizKey, 1,1);
        gridPaneBook.add(buttonBer,0,2);
        gridPaneBook.add(buttonRyb,1,2);
        gridPaneBook.add(buttonRyb2,0,3);
        gridPaneBook.add(buttonRos,1,3);

        getChildren().addAll(gridPaneBook);
    }
}
