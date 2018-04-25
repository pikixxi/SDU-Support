package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

//My Class extends from Pane
public class Map extends Pane {
    //Declareting Variables
    Button buttonMenuMap;
    Button buttonMenuMapetaj1;
    Button buttonMenuMapetaj2;
    Button buttonMenuMapetaj3;
    VBox imageetajj1;
    VBox imageetajj2;
    VBox imageetajj3;
    Button etaj1;
    Button etaj2;
    Button etaj3;


    public Map() {

        //Add images and set Size
        ImageView imageMenu = new ImageView(new Image(getClass().getResourceAsStream("menu.png")));
        imageMenu.setFitHeight(20);
        imageMenu.setFitWidth(20);

        ImageView imageMenuMap = new ImageView(new Image(getClass().getResourceAsStream("menu.png")));
        imageMenuMap.setFitHeight(20);
        imageMenuMap.setFitWidth(20);

        //Create Label and Set CSS
        Label labelMap = new Label("Карта");
        labelMap.setId("label");

        //Create Buttons and set CSS, title, and text Fill
        etaj1 = new Button("Первый Этаж");
        etaj1.setId("button");
        etaj1.setTextFill(javafx.scene.paint.Color.WHITE);

        etaj2 = new Button("Второй Этаж");
        etaj2.setId("button");
        etaj2.setTextFill(javafx.scene.paint.Color.WHITE);

        etaj3 = new Button("Третий Этаж");
        etaj3.setId("button");
        etaj3.setTextFill(javafx.scene.paint.Color.WHITE);

        //Create Button and Set size and CSS
        buttonMenuMap = new Button("",imageMenuMap);
        buttonMenuMap.setPrefSize(20,20);
        buttonMenuMap.setId("button");

        //Create HBox and Set Position, CSS, Size, Spacing and Elements
        HBox hBoxMap = new HBox();
        hBoxMap.setAlignment(Pos.CENTER_LEFT);
        hBoxMap.setId("hBox");
        hBoxMap.setPrefSize(300,40);
        hBoxMap.setSpacing(10);
        hBoxMap.getChildren().addAll(buttonMenuMap, labelMap);

        //Create GridPane and set Position,Spacing,Padding,Elements
        GridPane gridPanemap = new GridPane();
        gridPanemap.setAlignment(Pos.CENTER);
        gridPanemap.setHgap(5);
        gridPanemap.setVgap(5);
        gridPanemap.setPadding(new Insets(150,0,0,0));
        gridPanemap.add(etaj1,0,6);
        gridPanemap.add(etaj2,0,7);
        gridPanemap.add(etaj3,0,8);


        GridPane gridPaneMap = new GridPane();
        gridPaneMap.add(hBoxMap,0,0);
        gridPaneMap.add(gridPanemap,0,1);
        getChildren().addAll(new ImageView(new Image(getClass().getResourceAsStream("custom-maps.jpg"))), gridPaneMap);






//MAP SDU SDU SDU SDU SDU SDU SDU SDU SDU SDU SDU SDU SDU SDU SDU
        Label labelMapetaj1 = new Label("Первый этаж");
        labelMapetaj1.setId("label");

        buttonMenuMapetaj1 = new Button("",imageMenu);
        buttonMenuMapetaj1.setPrefSize(20,20);
        buttonMenuMapetaj1.setId("button");

        //Create ScrollBar
        ScrollBar scrollBarMap1 = new ScrollBar();
        //Set Max and min size
        scrollBarMap1.setMax(300);
        scrollBarMap1.setMin(0);
        //Set Value
        scrollBarMap1.setValue(100);
        //Set CSS
        scrollBarMap1.setId("menu");



        HBox hBoxMapetaj1 = new HBox();
        hBoxMapetaj1.setAlignment(Pos.CENTER_LEFT);
        hBoxMapetaj1.setId("hBox");
        hBoxMapetaj1.setPrefSize(300,40);
        hBoxMapetaj1.setSpacing(10);
        hBoxMapetaj1.getChildren().addAll(buttonMenuMapetaj1, labelMapetaj1,scrollBarMap1);

        Image imageEtaj1 = new Image(getClass().getResourceAsStream("1ETAJ.jpg"));
        ImageView imageetaj1 = new ImageView(imageEtaj1);
        imageetaj1.setFitHeight(800);
        imageetaj1.setFitWidth(1200);

        VBox paneEtaj1 = new VBox();
        paneEtaj1.getChildren().addAll(imageetaj1);
        paneEtaj1.setPrefSize(2000,1500);

        //Create ScrollPane
        ScrollPane scrolletaj1 = new ScrollPane();
        scrolletaj1.setContent(paneEtaj1);
        scrolletaj1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrolletaj1.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        //Set Event for ScrollBar
        scrollBarMap1.valueProperty().addListener(event ->{
            imageetaj1.setScaleX(scrollBarMap1.getValue()/100);

            imageetaj1.setScaleY(scrollBarMap1.getValue()/100);});



        //This Proses same with 2,3 fool
        Label labelMapetaj2 = new Label("Второй этаж");
        labelMapetaj2.setId("label");

        buttonMenuMapetaj2 = new Button("",imageMenu);


        ScrollBar scrollBarMap2 = new ScrollBar();
        scrollBarMap2.setMax(300);
        scrollBarMap2.setMin(0);
        scrollBarMap2.setValue(100);
        scrollBarMap2.setId("menu");

        buttonMenuMapetaj2.setPrefSize(20,20);
        buttonMenuMapetaj2.setId("button");

        Image imageEtaj2 = new Image(getClass().getResourceAsStream("2ETAJ.jpg"));
        ImageView imageetaj2 = new ImageView(imageEtaj2);
        imageetaj2.setFitHeight(800);
        imageetaj2.setFitWidth(1200);


        HBox hBoxMapetaj2 = new HBox();
        hBoxMapetaj2.setAlignment(Pos.CENTER_LEFT);
        hBoxMapetaj2.setId("hBox");
        hBoxMapetaj2.setPrefSize(300,40);
        hBoxMapetaj2.setSpacing(10);
        hBoxMapetaj2.getChildren().addAll(buttonMenuMapetaj2, labelMapetaj2,scrollBarMap2);



        imageetajj1 = new VBox();
        imageetajj1.getChildren().addAll(hBoxMapetaj1,scrolletaj1);


        scrollBarMap2.valueProperty().addListener(event ->{
            imageetaj2.setScaleX(scrollBarMap2.getValue()/100);

            imageetaj2.setScaleY(scrollBarMap2.getValue()/100);});

        VBox vBoxEtaj2 = new VBox();
        vBoxEtaj2.setPrefSize(2000,1000);
        vBoxEtaj2.getChildren().addAll(imageetaj2);

        ScrollPane scrolletaj2 = new ScrollPane();
        scrolletaj2.setContent(vBoxEtaj2);
        scrolletaj2.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrolletaj2.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);



        imageetajj2 = new VBox();
        imageetajj2.getChildren().addAll(hBoxMapetaj2,scrolletaj2);



        Label labelMapetaj3 = new Label("Третий этаж");
        labelMapetaj3.setId("label");

        buttonMenuMapetaj3 = new Button("",imageMenu);

        ScrollBar scrollBarMap3 = new ScrollBar();
        scrollBarMap3.setMax(300);
        scrollBarMap3.setMin(0);
        scrollBarMap3.setValue(100);
        scrollBarMap3.setId("menu");


        buttonMenuMapetaj3.setPrefSize(20,20);
        buttonMenuMapetaj3.setId("button");

        Image imageEtaj3 = new Image(getClass().getResourceAsStream("3ETAJ.jpg"));
        ImageView imageetaj3 = new ImageView(imageEtaj3);
        imageetaj3.setFitHeight(800);
        imageetaj3.setFitWidth(1200);


        HBox hBoxMapetaj3 = new HBox();
        hBoxMapetaj3.setAlignment(Pos.CENTER_LEFT);
        hBoxMapetaj3.setId("menu");
        hBoxMapetaj3.setPrefSize(300,40);
        hBoxMapetaj3.setSpacing(10);
        hBoxMapetaj3.getChildren().addAll(buttonMenuMapetaj3, labelMapetaj3,scrollBarMap3);

        VBox vBoxEtaj3 = new VBox();
        vBoxEtaj3.setPrefSize(2000,1000);
        vBoxEtaj3.getChildren().addAll(imageetaj3);

        ScrollPane scrolletaj3 = new ScrollPane();
        scrolletaj3.setContent(vBoxEtaj3);
        scrolletaj3.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrolletaj3.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        scrollBarMap3.valueProperty().addListener(event ->{
            imageetaj3.setScaleX(scrollBarMap3.getValue()/100);

            imageetaj3.setScaleY(scrollBarMap3.getValue()/100);});



        imageetajj3 = new VBox();
        imageetajj3.getChildren().addAll(hBoxMapetaj3,scrolletaj3);


   }
}
