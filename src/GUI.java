import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GUI extends Application implements Serializable {

    private BorderPane root;
    TableView<Property> propertyTable;
    TableView<Tenant> tenantTable;

    HBox addBox;

    PropTable PropertyTableClass = new PropTable();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //screen width
        stage.setWidth(1700);
        stage.setHeight(1700);

        //borderpane
        root = new BorderPane();
        root.setPadding(new Insets(10));

        //top name
        HBox TopBox = new HBox();
        TopBox.setPadding(new Insets(5,10,10,10));
        Label labelName = new Label("REMS");
        labelName.setFont(Font.font("Amble CN",18));
        TopBox.getChildren().add(labelName);

        //Side Menu
        VBox sideMenu = new VBox();
        sideMenu.setAlignment(Pos.TOP_CENTER);
        sideMenu.setPadding(new Insets(10));
        Button btnView1 = new Button("Home");
        btnView1.setOnAction(e -> switchContent(1));
        Button btnView2 = new Button("Properties");
        btnView2.setOnAction(e -> switchContent(2));
        Button btnView3 = new Button("Leases");
        btnView3.setOnAction(e -> switchContent(3));
        Button btnView4 = new Button("Tenants");
        btnView4.setOnAction(e -> switchContent(4));
        sideMenu.getChildren().addAll(btnView1,btnView2, btnView3,btnView4);


        //Property Column
        PropertyTableClass.CreatePropertyColumn();

        //Property TextField
        PropertyTableClass.inputPropertyText();

        //Buttons
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButton());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButton());

        //Property TextBox
        addBox = new HBox();
        addBox.setPadding(new Insets(10,10,10,10));
        addBox.setSpacing(10);
        addBox.getChildren().addAll(PropertyTableClass.propTypeInput, PropertyTableClass.bedroomInput, PropertyTableClass.bathroomInput, PropertyTableClass.squareFeetInput, PropertyTableClass.countryInput, PropertyTableClass.cityInput, PropertyTableClass.addressInput, PropertyTableClass.streetInput, PropertyTableClass.streetNumberInput, PropertyTableClass.PropertyIDInput,addButton,deleteButton);

        //Property Column
        propertyTable = new TableView<>();
        propertyTable.setItems(getProperty());
        propertyTable.getColumns().addAll(PropertyTableClass.propTypeColumn,PropertyTableClass.bedroomsColumn,PropertyTableClass.bathroomsColumn,PropertyTableClass.squareFeetColumn,PropertyTableClass.countryColumn,PropertyTableClass.cityColumn,PropertyTableClass.addressColumn,PropertyTableClass.streetColumn,PropertyTableClass.streetNumberColumn,PropertyTableClass.propertyIDColumn);

        root.setTop(TopBox);
        root.setLeft(sideMenu);

        stage.setScene(new Scene(root));
        stage.show();

    }

    private void switchContent(int view){
        switch (view){
            case 1:
                root.setCenter(HomeSection());
                break;
            case 2:
                root.setCenter(PropertySection());
                break;
            case 3:
                root.setCenter(LeaseSection());
                break;
            case 4:
                root.setCenter(TenantSection());
                break;
        }
    }

    private Node HomeSection(){
        GridPane homeGrid = new GridPane();
        homeGrid.setPadding(new Insets(5,10,10,10));
        Label HomeName = new Label("Home");
        HomeName.setFont(Font.font("Amble CN",18));
        homeGrid.getChildren().add(HomeName);
        return homeGrid;
    }

    private Node PropertySection(){
        GridPane propertyGrid = new GridPane();
        propertyGrid.setPadding(new Insets(5,10,10,10));
        Label PropertyName = new Label("Properties");
        PropertyName.setFont(Font.font("Amble CN",18));
        propertyGrid.add(PropertyName,0,0);
        propertyGrid.add(propertyTable,0,1);
        propertyGrid.add(addBox,0,2);
        return propertyGrid;
    }

    private Node LeaseSection(){
        GridPane leaseGrid = new GridPane();
        leaseGrid.setPadding(new Insets(5,10,10,10));
        Label leaseName = new Label("Lease");
        leaseName.setFont(Font.font("Amble CN",18));
        leaseGrid.getChildren().add(leaseName);
        return leaseGrid;
    }

    private Node TenantSection(){
        GridPane TenantGrid = new GridPane();
        TenantGrid.setPadding(new Insets(5,10,10,10));
        Label tenantName = new Label("Tenant");
        tenantName.setFont(Font.font("Amble CN",18));
        TenantGrid.getChildren().add(tenantName);
        return TenantGrid;
    }


    public ObservableList<Property> getProperty(){
        ObservableList<Property> properties = FXCollections.observableArrayList();
        return properties;
    }

    //propTypeInput, bedroomInput, bathroomInput, squareFeetInput, countryInput, cityInput, addressInput, streetInput, streetNumberInput, PropertyIDInput
    public void addButton(){
        Property property = new Property();
        property.setPropertyType(PropertyTableClass.propTypeInput.getText());
        property.setBedrooms(Integer.parseInt(PropertyTableClass.bedroomInput.getText())); //to make it an integer
        property.setBathrooms(Integer.parseInt(PropertyTableClass.bathroomInput.getText()));
        property.setSquareFeet(Integer.parseInt(PropertyTableClass.squareFeetInput.getText()));
        property.setCountry(PropertyTableClass.countryInput.getText());
        property.setCity(PropertyTableClass.cityInput.getText());
        property.setAddress(PropertyTableClass.addressInput.getText());
        property.setStreet(PropertyTableClass.streetInput.getText());
        property.setNumber(Integer.parseInt(PropertyTableClass.streetNumberInput.getText()));
        property.setPropertyID(Integer.parseInt(PropertyTableClass.PropertyIDInput.getText()));
        propertyTable.getItems().add(property);
        PropertyTableClass.propTypeInput.clear();
        PropertyTableClass.bedroomInput.clear();
        PropertyTableClass.bathroomInput.clear();
        PropertyTableClass.squareFeetInput.clear();
        PropertyTableClass.countryInput.clear();
        PropertyTableClass.cityInput.clear();
        PropertyTableClass.addressInput.clear();
        PropertyTableClass.streetInput.clear();
        PropertyTableClass.streetNumberInput.clear();
        PropertyTableClass.PropertyIDInput.clear();
    }

    public void deleteButton(){
        ObservableList<Property> propertySelected, allProperties;
        allProperties = propertyTable.getItems(); //
        propertySelected = propertyTable.getSelectionModel().getSelectedItems();

        propertySelected.forEach(allProperties::remove); // removes all properties selected
    }



}
