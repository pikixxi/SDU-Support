package sample;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main extends Application {
    //Create variables
    Scene sceneLife;
    Image image1;
    ImageView imageMenu;
    Scene menu;
    Button buttonMenu;

    @Override
    public void start(Stage window) throws Exception{


        //I call the Book class. Class book in the form of Pane and for this I add it to the Scene
        Books books = new Books();

        //Create actions for buttons in te class Book
        books.buttonMenu.setOnAction(event -> window.setScene(menu));
        books.buttonFiz.setOnAction(event -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(books.fileFiz.getAbsolutePath());

        });
        books.buttonFizKey.setOnAction(event -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(books.fileFizKey.getAbsolutePath());
        });

        books.buttonBer.setOnAction(event -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(books.fileBer.getAbsolutePath());
        });

        books.buttonRyb.setOnAction(event -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(books.fileRyb.getAbsolutePath());
        });

        books.buttonRyb2.setOnAction(event -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(books.fileRyb2.getAbsolutePath());
        });

        books.buttonRos.setOnAction(event -> {
            HostServices hostServices = getHostServices();
            hostServices.showDocument(books.fileRos.getAbsolutePath());
        });

        //Create Scene for Books and set Pane in Scene
        Scene sceneBook = new Scene(books,300,500);
        //Set CSS file to the Scene
        sceneBook.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());


        //I call the Map class.
        Map mainMap = new Map();
        //Set mainMap Pane to the Scene
        Scene sceneMap = new Scene(mainMap,300,500);

        //Create actions for buttons in te class Map
        mainMap.buttonMenuMap.setOnAction(event -> window.setScene(menu));
        //Set CSS file to the Scene
        sceneMap.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        //Set other Panes to Scenes
        Scene sceneMapetaj1 = new Scene(mainMap.imageetajj1,300,500);
        sceneMapetaj1.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());

        Scene sceneMapetaj2 = new Scene(mainMap.imageetajj2,300,500);
        sceneMapetaj2.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());

        Scene sceneMapetaj3 = new Scene(mainMap.imageetajj3,300,500);
        sceneMapetaj3.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());

        //Create actions for buttons in te class Map
        mainMap.buttonMenuMapetaj1.setOnAction(event -> window.setScene(sceneMap));
        mainMap.buttonMenuMapetaj2.setOnAction(event -> window.setScene(sceneMap));
        mainMap.buttonMenuMapetaj3.setOnAction(event -> window.setScene(sceneMap));
        mainMap.etaj1.setOnAction(event -> window.setScene(sceneMapetaj1));
        mainMap.etaj2.setOnAction(event -> window.setScene(sceneMapetaj2));
        mainMap.etaj3.setOnAction(event -> window.setScene(sceneMapetaj3));



        //I call the Club class.
        Clubs clubs = new Clubs();
        //Create ScrollPane
        ScrollPane scrollPaneClub =new ScrollPane( clubs.scrollPaneClub);
        //Create ScrollBars for ScrollPanes
        scrollPaneClub.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPaneClub.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        //Set Pane of each club to the Scenes and set CSS files to Scenes
        Scene sceneClub = new Scene(scrollPaneClub,300,500);
        sceneClub.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneArtInfo = new Scene(clubs.gridPaneArt,300,500);
        sceneArtInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneDebatInfo = new Scene(clubs.gridPaneDebat,300,500);
        sceneDebatInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneDombyraInfo = new Scene(clubs.gridPaneDom,300,500);
        sceneDombyraInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneEventInfo = new Scene(clubs.gridPaneEvent,300,500);
        sceneEventInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneEducInfo = new Scene(clubs.gridPaneEduc,300,500);
        sceneEducInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneEnacInfo = new Scene(clubs.gridPaneEnac,300,500);
        sceneEnacInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneFFInfo = new Scene(clubs.gridPaneFF,300,500);
        sceneFFInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        Scene sceneIQInfo = new Scene(clubs.gridPaneIQ,300,500);
        sceneIQInfo.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());

        //Create actions for buttons in te class Clubs
        clubs.buttonMenuClub.setOnAction(event -> window.setScene(menu));
        clubs.buttonMenuArt.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuDeb.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuDom.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuEvent.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuEduc.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuEnac.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuFF.setOnAction(event -> window.setScene(sceneClub));
        clubs.buttonMenuIQ.setOnAction(event -> window.setScene(sceneClub));

        //Create actions for buttons in te class Clubs
        clubs.buttonArt.setOnAction(event -> window.setScene(sceneArtInfo));
        clubs.buttonDeb.setOnAction(event -> window.setScene(sceneDebatInfo));
        clubs.buttonDom.setOnAction(event -> window.setScene(sceneDombyraInfo));
        clubs.buttonEC.setOnAction(event -> window.setScene(sceneEventInfo));
        clubs.buttonEduc.setOnAction(event -> window.setScene(sceneEducInfo));
        clubs.buttonEnac.setOnAction(event -> window.setScene(sceneEnacInfo));
        clubs.buttonFoto.setOnAction(event -> window.setScene(sceneFFInfo));
        clubs.buttonIq.setOnAction(event -> window.setScene(sceneIQInfo));


        //FAQ FAQ FAQ FAQ FAQ FAQ FAQ FAQ FAQ
        //I call the FAQ class.
        FAQ faq= new FAQ();
        //Set faq Pane to the Scene
        Scene sceneFAQ = new Scene(faq,300,500);
        //Set CSS file to the Scene
        sceneFAQ.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());
        //Create actions for buttons in te class FAQ
        faq.buttonMenuFAQ.setOnAction(event -> window.setScene(menu));


        // Add images
        image1 = new Image(getClass().getResourceAsStream("menu.png"));
        //Set Image to ImageView
        imageMenu = new ImageView(image1);
        //Set size for ImageViews
        imageMenu.setFitHeight(20);
        imageMenu.setFitWidth(20);

        Image image2 = new Image(getClass().getResourceAsStream("newspaper.png"));
        ImageView imageNews = new ImageView(image2);
        imageNews.setFitHeight(20);
        imageNews.setFitWidth(20);

        Image image3 = new Image(getClass().getResourceAsStream("placeholder.png"));
        ImageView imageMap = new ImageView(image3);
        imageMap.setFitHeight(20);
        imageMap.setFitWidth(20);

        Image image4 = new Image(getClass().getResourceAsStream("user.png"));
        ImageView imageClub = new ImageView(image4);
        imageClub.setFitHeight(20);
        imageClub.setFitWidth(20);

        Image image5 = new Image(getClass().getResourceAsStream("book.png"));
        ImageView imageBook = new ImageView(image5);
        imageBook.setFitHeight(20);
        imageBook.setFitWidth(20);


        Image image8 = new Image(getClass().getResourceAsStream("question.png"));
        ImageView imageFAQ = new ImageView(image8);
        imageFAQ.setFitHeight(20);
        imageFAQ.setFitWidth(20);

        //Scene for news
        //Create button
        buttonMenu = new Button("",imageMenu);
        //Set size for button
        buttonMenu.setPrefSize(20,20);
        //Set CSS to button
        buttonMenu.setId("button");

        //Create Label
        Label label = new Label("Новости");
        //Set Css to the Label
        label.setId("label");

        //Create HBox
        HBox hBox = new HBox();
        //Set Position to the HBox
        hBox.setAlignment(Pos.CENTER_LEFT);
        //Set Css to the HBox
        hBox.setId("hBox");
        //Set Size to the HBox
        hBox.setPrefSize(300, 40);
        //Set Spacing
        hBox.setSpacing(10);
        //Set elements to the HBox
        hBox.getChildren().addAll(buttonMenu, label);


        //Create HyperLinks
        Hyperlink hyperlinkMatrix = new Hyperlink("Стали известны победители INFOMATRIX–ASIA 2018");
        //Create action for HyperLink
        hyperlinkMatrix.setOnAction(event -> getHostServices().showDocument("http://sdu.edu.kz/ru/novosti/2018/04/17/infomatrixasia-kompyuterlik-zhobalar-bajauyny-zhei/"));
        //Set CSS to the HyperLink
        hyperlinkMatrix.setId("label1");

        Hyperlink hyperlinkStart = new Hyperlink("Cтартовал VI международный конкурс компьютерных проектов INFOMATRIX-ASIA");
        hyperlinkStart.setOnAction(event -> getHostServices().showDocument("http://sdu.edu.kz/ru/novosti/2018/04/13/ctartoval-vi-mezhdunarodnyj-konkurs-kompyuternyh-p/"));
        hyperlinkStart.setId("label1");

        Hyperlink hyperlinkUSA = new Hyperlink("Генеральный консул США посетил SDU");
        hyperlinkUSA.setOnAction(event -> getHostServices().showDocument("http://sdu.edu.kz/ru/novosti/2018/04/12/generalnyj-konsul-ssha-posetil-sdu/"));
        hyperlinkUSA.setId("label1");

        Hyperlink hyperlinkFire = new Hyperlink("В СДУ прошла учебная эвакуация");
        hyperlinkFire.setOnAction(event -> getHostServices().showDocument("http://sdu.edu.kz/ru/novosti/2018/03/30/v-sdu-proshla-uchebnaya-evakuaciya/"));
        hyperlinkFire.setId("label1");

        Hyperlink hyperlinkAltyn = new Hyperlink("Претенденты на Алтын белгі посетили СДУ");
        hyperlinkAltyn.setOnAction(event -> getHostServices().showDocument("http://sdu.edu.kz/ru/novosti/2018/03/26/pretendenty-na-altyn-belgi-posetili-sdu/"));
        hyperlinkAltyn.setId("label1");

        //Set Images
        ImageView imageViewInfom = new ImageView(new Image(getClass().getResourceAsStream("infomatrix.jpg")));
        imageViewInfom.setFitWidth(300);
        imageViewInfom.setFitHeight(150);

        ImageView imageViewStart = new ImageView(new Image(getClass().getResourceAsStream("start.jpg")));
        imageViewStart.setFitWidth(300);
        imageViewStart.setFitHeight(150);

        ImageView imageViewUSA = new ImageView(new Image(getClass().getResourceAsStream("USA.jpg")));
        imageViewUSA.setFitWidth(300);
        imageViewUSA.setFitHeight(150);

        ImageView imageViewFire = new ImageView(new Image(getClass().getResourceAsStream("fire.jpg")));
        imageViewFire.setFitWidth(300);
        imageViewFire.setFitHeight(150);

        ImageView imageViewAltyn = new ImageView(new Image(getClass().getResourceAsStream("altyn.jpg")));
        imageViewAltyn.setFitWidth(300);
        imageViewAltyn.setFitHeight(150);

        //Create GridPane
        GridPane gridPane = new GridPane();
        //Set elements to the GridPane
        gridPane.add(hBox, 0, 0);
        gridPane.add(imageViewInfom,0,1);
        gridPane.add(hyperlinkMatrix,0,2);
        gridPane.add(imageViewStart,0,3);
        gridPane.add(hyperlinkStart,0,4);
        gridPane.add(imageViewUSA,0,5);
        gridPane.add(hyperlinkUSA,0,6);
        gridPane.add(imageViewFire,0,7);
        gridPane.add(hyperlinkFire,0,8);
        gridPane.add(imageViewAltyn,0,9);
        gridPane.add(hyperlinkAltyn,0,10);
        //Set spacing
        gridPane.setVgap(5);

        //Create ScrollPane
        ScrollPane scrollPaneNews = new ScrollPane();
        //Set element to the ScrollPane
        scrollPaneNews.setContent(gridPane);
        //Create ScrollBars for ScrollPanes
        scrollPaneNews.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPaneNews.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        //Set gridpane to the Scene
        Scene sceneNews = new Scene(scrollPaneNews,300,500);
        buttonMenu.setOnAction(event -> window.setScene(menu));
        sceneNews.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());



        //Scene for Menu
        //Create buttons for menu and Set CSS and Actions
        Button buttonNews = addButton("Новости",imageNews);
        buttonNews.setId("buttonMenu");
        buttonNews.setOnAction(event -> window.setScene(sceneNews));
        Button buttonMap = addButton("Карта",imageMap);
        buttonMap.setId("buttonMenu");
        buttonMap.setOnAction(event -> window.setScene(sceneMap));
        Button buttonClubs = addButton("Клубы",imageClub);
        buttonClubs.setId("buttonMenu");
        buttonClubs.setOnAction(event -> window.setScene(sceneClub));
        Button buttonBook = addButton("Книги",imageBook);
        buttonBook.setId("buttonMenu");
        buttonBook.setOnAction(event -> window.setScene(sceneBook));
        Button buttonFAQ = addButton("FAQ",imageFAQ);
        buttonFAQ.setId("buttonMenu");
        buttonFAQ.setOnAction(event -> window.setScene(sceneFAQ));

        //Create BorderPane
        BorderPane borderPaneMenu = new BorderPane();
        //Set CSS to the BorderPane
        borderPaneMenu.setId("menu");
        //Create VBox
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);
        vBox.getChildren().addAll(buttonNews,buttonMap,buttonClubs, buttonBook,buttonFAQ );
        borderPaneMenu.setCenter(vBox);

        //Create Scene for News and Set CSS
        menu = new Scene(borderPaneMenu,300,500);
        menu.getStylesheets().add((getClass().getResource("simple_css.css")).toExternalForm());

        //Title of the Project
        window.setTitle("SDU Support");
        //Scene Scene to the Window
        window.setScene(menu);
        //So that it is impossible to change the size
        window.setResizable(false);
        //Add icon
        window.getIcons().add(new Image("sample/Sduicon.png"));
        //View Window
        window.show();

    }

    //Main method
    public static void main(String[] args) {
        launch(args);
    }


    // method for easily create buttons
    private static Button  addButton(String name,ImageView imageView){

        Button button = new Button(name,imageView);
        button.setPrefSize(250,20);
        return button;

    }
}


