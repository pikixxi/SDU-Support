package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

//My Class extends from Pane
public class Clubs extends Pane{
    //Declareting Variables
    Button buttonMenuArt;
    Button buttonMenuDeb;
    Button buttonMenuDom;
    Button buttonMenuEvent;
    Button buttonMenuEduc;
    Button buttonMenuEnac;
    Button buttonMenuClub;
    Button buttonMenuFF;
    Button buttonMenuIQ;
    Button buttonArt;
    Button buttonDeb;
    Button buttonDom;
    Button buttonEC;
    Button buttonEduc;
    Button buttonEnac;
    Button buttonFoto;
    Button buttonIq;
    GridPane gridPaneArt;
    GridPane gridPaneDebat;
    GridPane gridPaneDom;
    GridPane gridPaneEvent;
    GridPane gridPaneEduc;
    GridPane gridPaneEnac;
    GridPane gridPaneFF;
    GridPane gridPaneIQ;
    ScrollPane scrollPaneClub;
    public Clubs(){

        //Scene for Clubs

        //Add images and set Size
        ImageView imageMenu = new ImageView(new Image(getClass().getResourceAsStream("menu.png")));
        imageMenu.setFitHeight(20);
        imageMenu.setFitWidth(20);

        ImageView imageMenuMain = new ImageView(new Image(getClass().getResourceAsStream("menu.png")));
        imageMenuMain.setFitHeight(20);
        imageMenuMain.setFitWidth(20);

        //Create Label and Set CSS
        Label labelClub = new Label("Клубы");
        labelClub.setId("label");

        //Create Button and Set size and CSS
        buttonMenuClub= new Button("",imageMenuMain);
        buttonMenuClub.setPrefSize(20,20);
        buttonMenuClub.setId("button");

        //Create HBox and Set Position, CSS, Size, Spacing and Elements
        HBox hBoxClub = new HBox();
        hBoxClub.setAlignment(Pos.CENTER_LEFT);
        hBoxClub.setId("hBox");
        hBoxClub.setPrefSize(150,40);
        hBoxClub.setSpacing(10);
        hBoxClub.getChildren().addAll(buttonMenuClub, labelClub);
        HBox hBoxClub1 = new HBox();
        hBoxClub1.setId("hBox");
        hBoxClub1.setPrefSize(150,40);

        // ART ART ART ART ART ART ART ART ART ART

        //Create Label and Set CSS
        Label labelArt = new Label("Art club");
        labelArt.setId("label");

        //Add images and set Size
        ImageView imageInfoArt = new ImageView(new Image(getClass().getResourceAsStream("ArtClub.JPG")));
        imageInfoArt.setFitHeight(460);
        imageInfoArt.setFitWidth(300);

        //Create Button and Set size and CSS
        buttonMenuArt = new Button("",imageMenu);
        buttonMenuArt.setPrefSize(20,20);
        buttonMenuArt.setId("button");

        //Create HBox and Set Position, CSS, Size, Spacing and Elements
        HBox hBoxArt = new HBox();
        hBoxArt.setAlignment(Pos.CENTER_LEFT);
        hBoxArt.setId("hBox");
        hBoxArt.setPrefSize(300,40);
        hBoxArt.setSpacing(10);
        hBoxArt.getChildren().addAll(buttonMenuArt, labelArt);

        //Create GridPane  and set elements
        gridPaneArt = new GridPane();
        gridPaneArt.add(hBoxArt,0,0);
        gridPaneArt.add(imageInfoArt,0,1);

        //And this prosses repead for each Club

//DEBAT DEABAT DEBAT DEBAT DEBAT DEBAT
        Label labelDebat = new Label("Debate club");
        labelDebat.setId("label");

        ImageView imageInfoDeb = new ImageView(new Image(getClass().getResourceAsStream("Debat.JPG")));
        imageInfoDeb.setFitHeight(460);
        imageInfoDeb.setFitWidth(300);

        buttonMenuDeb = new Button("",imageMenu);

        buttonMenuDeb.setPrefSize(20,20);
        buttonMenuDeb.setId("button");

        HBox hBoxDeb = new HBox();
        hBoxDeb.setAlignment(Pos.CENTER_LEFT);
        hBoxDeb.setId("hBox");
        hBoxDeb.setPrefSize(300,40);
        hBoxDeb.setSpacing(10);
        hBoxDeb.getChildren().addAll(buttonMenuDeb, labelDebat);

        gridPaneDebat = new GridPane();
        gridPaneDebat.add(hBoxDeb,0,0);
        gridPaneDebat.add(imageInfoDeb,0,1);


        //DOMBYRA DOMBYRA DOMBYRA DOMBYRA DOMBYRA DOMBYRA

        Label labelDOM = new Label("Dombyra club");
        labelDOM.setId("label");

        ImageView imageInfoDom = new ImageView(new Image(getClass().getResourceAsStream("Dombra.JPG")));
        imageInfoDom.setFitHeight(460);
        imageInfoDom.setFitWidth(300);

        buttonMenuDom = new Button("",imageMenu);

        buttonMenuDom.setPrefSize(20,20);
        buttonMenuDom.setId("button");

        HBox hBoxDom = new HBox();
        hBoxDom.setAlignment(Pos.CENTER_LEFT);
        hBoxDom.setId("hBox");
        hBoxDom.setPrefSize(300,40);
        hBoxDom.setSpacing(10);
        hBoxDom.getChildren().addAll(buttonMenuDom, labelDOM);

        gridPaneDom = new GridPane();
        gridPaneDom.add(hBoxDom,0,0);
        gridPaneDom.add(imageInfoDom,0,1);


        //EVENT EVENT EVNETN EVNT EVENT
        Label labelEvent = new Label("Event club");
        labelEvent.setId("label");

        ImageView imageInfoEvent = new ImageView(new Image(getClass().getResourceAsStream("Event.JPG")));
        imageInfoEvent.setFitHeight(460);
        imageInfoEvent.setFitWidth(300);

        buttonMenuEvent = new Button("",imageMenu);

        buttonMenuEvent.setPrefSize(20,20);
        buttonMenuEvent.setId("button");

        HBox hBoxEvent = new HBox();
        hBoxEvent.setAlignment(Pos.CENTER_LEFT);
        hBoxEvent.setId("hBox");
        hBoxEvent.setPrefSize(300,40);
        hBoxEvent.setSpacing(10);
        hBoxEvent.getChildren().addAll(buttonMenuEvent, labelEvent);

        gridPaneEvent = new GridPane();
        gridPaneEvent.add(hBoxEvent,0,0);
        gridPaneEvent.add(imageInfoEvent,0,1);

//        Scene sceneEventInfo = new Scene(gridPaneEvent,300,500);
//        sceneEventInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        //buttonMenuEvent.setOnAction(event -> window.setScene(sceneClub));


        //EDUC EDUC EDUC EDUC EDCU EDUC EDUC EDUCE EDUC EDUC EDUC EDUC
        Label labelEduc = new Label("Education club");
        labelEduc.setId("label");

        ImageView imageInfoEduc = new ImageView(new Image(getClass().getResourceAsStream("Educa.JPG")));
        imageInfoEduc.setFitHeight(460);
        imageInfoEduc.setFitWidth(300);

        buttonMenuEduc = new Button("",imageMenu);

        buttonMenuEduc.setPrefSize(20,20);
        buttonMenuEduc.setId("button");

        HBox hBoxEduc = new HBox();
        hBoxEduc.setAlignment(Pos.CENTER_LEFT);
        hBoxEduc.setId("hBox");
        hBoxEduc.setPrefSize(300,40);
        hBoxEduc.setSpacing(10);
        hBoxEduc.getChildren().addAll(buttonMenuEduc, labelEduc);

        gridPaneEduc = new GridPane();
        gridPaneEduc.add(hBoxEduc,0,0);
        gridPaneEduc.add(imageInfoEduc,0,1);

//        Scene sceneEducInfo = new Scene(gridPaneEduc,300,500);
//        sceneEducInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
//        buttonMenuEduc.setOnAction(event -> window.setScene(sceneClub));



        //ENAC ENAC ENAC ENAC ENAC ENCA

        Label labelEnac = new Label("Enactus club");
        labelEnac.setId("label");

        ImageView imageInfoEnac = new ImageView(new Image(getClass().getResourceAsStream("Enac.JPG")));
        imageInfoEnac.setFitHeight(460);
        imageInfoEnac.setFitWidth(300);

        buttonMenuEnac = new Button("",imageMenu);

        buttonMenuEnac.setPrefSize(20,20);
        buttonMenuEnac.setId("button");

        HBox hBoxEnuc = new HBox();
        hBoxEnuc.setAlignment(Pos.CENTER_LEFT);
        hBoxEnuc.setId("hBox");
        hBoxEnuc.setPrefSize(300,40);
        hBoxEnuc.setSpacing(10);
        hBoxEnuc.getChildren().addAll(buttonMenuEnac, labelEnac);

        gridPaneEnac = new GridPane();
        gridPaneEnac.add(hBoxEnuc,0,0);
        gridPaneEnac.add(imageInfoEnac,0,1);

//        Scene sceneEnacInfo = new Scene(gridPaneEnac,300,500);
//        sceneEnacInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
//        buttonMenuEnac.setOnAction(event -> window.setScene(sceneClub));

//FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF

        Label labelFoto = new Label("Foto Fabrica");
        labelFoto.setId("label");

        ImageView imageInfoFF = new ImageView(new Image(getClass().getResourceAsStream("ff.png")));
        imageInfoFF.setFitHeight(460);
        imageInfoFF.setFitWidth(300);

        buttonMenuFF = new Button("",imageMenu);

        buttonMenuFF.setPrefSize(20,20);
        buttonMenuFF.setId("button");

        HBox hBoxFF = new HBox();
        hBoxFF.setAlignment(Pos.CENTER_LEFT);
        hBoxFF.setId("hBox");
        hBoxFF.setPrefSize(300,40);
        hBoxFF.setSpacing(10);
        hBoxFF.getChildren().addAll(buttonMenuFF, labelFoto);

        gridPaneFF = new GridPane();
        gridPaneFF.add(hBoxFF,0,0);
        gridPaneFF.add(imageInfoFF,0,1);

//iqiqiiqiqiqiqiiqqiqiiqiqiqiqqiqqqiiqiqiqiqqiqiqiiqiqqiqiqiqiqiqiqiqiqiqiqiqiqiiq

        Label labelIQ = new Label("IQ club");
        labelIQ.setId("label");

        ImageView imageInfoIQ = new ImageView(new Image(getClass().getResourceAsStream("iq.png")));
        imageInfoIQ.setFitHeight(460);
        imageInfoIQ.setFitWidth(300);

        buttonMenuIQ = new Button("",imageMenu);

        buttonMenuIQ.setPrefSize(20,20);
        buttonMenuIQ.setId("button");

        HBox hBoxIQ = new HBox();
        hBoxIQ.setAlignment(Pos.CENTER_LEFT);
        hBoxIQ.setId("hBox");
        hBoxIQ.setPrefSize(300,40);
        hBoxIQ.setSpacing(10);
        hBoxIQ.getChildren().addAll(buttonMenuIQ, labelIQ);

        gridPaneIQ = new GridPane();
        gridPaneIQ.add(hBoxIQ,0,0);
        gridPaneIQ.add(imageInfoIQ,0,1);








        ImageView imageViewArt = new ImageView(new Image(getClass().getResourceAsStream("artc.jpg")));
        imageViewArt.setFitWidth(125);
        imageViewArt.setFitHeight(125);
        buttonArt = new Button("",imageViewArt);
        buttonArt.setPrefSize(125,125);
       // buttonArt.setOnAction(event -> window.setScene(sceneArtInfo));

        ImageView imageViewDeb = new ImageView(new Image(getClass().getResourceAsStream("debc.jpg")));
        imageViewDeb.setFitHeight(125);
        imageViewDeb.setFitWidth(125);
        buttonDeb = new Button("", imageViewDeb);
        buttonDeb.setPrefSize(125,125);
       // buttonDeb.setOnAction(event -> window.setScene(sceneDebInfo));

        ImageView imageViewDom = new ImageView(new Image(getClass().getResourceAsStream("dombyra.jpg")));
        imageViewDom.setFitWidth(125);
        imageViewDom.setFitHeight(125);
        buttonDom = new Button("", imageViewDom);
        buttonDom.setPrefSize(125,125);
        //buttonDom.setOnAction(event -> window.setScene(sceneDomInfo));

        ImageView imageViewEC = new ImageView(new Image(getClass().getResourceAsStream("ec.jpg")));
        imageViewEC.setFitWidth(125);
        imageViewEC.setFitHeight(125);
        buttonEC = new Button("", imageViewEC);
        buttonEC.setPrefSize(125,125);
        //buttonEC.setOnAction(event -> window.setScene(sceneEventInfo));

        ImageView imageViewEduc = new ImageView(new Image(getClass().getResourceAsStream("educ.jpg")));
        imageViewEduc.setFitWidth(125);
        imageViewEduc.setFitHeight(125);
        buttonEduc = new Button("", imageViewEduc);
        buttonEduc.setPrefSize(125,125);
        //buttonEduc.setOnAction(event -> window.setScene(sceneEducInfo));

        ImageView imageViewEnac = new ImageView(new Image(getClass().getResourceAsStream("enactus.jpg")));
        imageViewEnac.setFitWidth(125);
        imageViewEnac.setFitHeight(125);
        buttonEnac = new Button("", imageViewEnac);
        buttonEnac.setPrefSize(125,125);
        //buttonEnac.setOnAction(event -> window.setScene(sceneEnacInfo));

        ImageView imageViewFoto = new ImageView(new Image(getClass().getResourceAsStream("ffc.jpg")));
        imageViewFoto.setFitWidth(125);
        imageViewFoto.setFitHeight(125);
        buttonFoto = new Button("", imageViewFoto);
        buttonFoto.setPrefSize(125,125);

        ImageView imageViewIQ = new ImageView(new Image(getClass().getResourceAsStream("iq.jpg")));
        imageViewIQ.setFitWidth(125);
        imageViewIQ.setFitHeight(125);
        buttonIq = new Button("", imageViewIQ);
        buttonIq.setPrefSize(125,125);

        GridPane gridPaneClub = new GridPane();
        gridPaneClub.add(hBoxClub,0,0);
        gridPaneClub.add(hBoxClub1,1,0);
        gridPaneClub.add(buttonArt,0,1);
        gridPaneClub.add(buttonDeb,1,1);
        gridPaneClub.add(buttonDom,0,2);
        gridPaneClub.add(buttonEC,1,2);
        gridPaneClub.add(buttonEduc,0,3);
        gridPaneClub.add(buttonEnac,1,3);
        gridPaneClub.add(buttonFoto,0,4);
        gridPaneClub.add(buttonIq,1,4);

        gridPaneClub.setAlignment(Pos.TOP_CENTER);
        gridPaneClub.setVgap(10);
        scrollPaneClub = new ScrollPane();
        scrollPaneClub.setContent(gridPaneClub);
        scrollPaneClub.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPaneClub.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        getChildren().addAll(scrollPaneClub);
    }
}
