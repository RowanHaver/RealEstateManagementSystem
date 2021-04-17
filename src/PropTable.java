import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PropTable {

    TextField propTypeInput, bedroomInput, bathroomInput, squareFeetInput, countryInput, cityInput, addressInput, streetInput, streetNumberInput, PropertyIDInput;
    javafx.scene.control.TableColumn<Property, String> propTypeColumn, bedroomsColumn,bathroomsColumn,squareFeetColumn,countryColumn,cityColumn,addressColumn,streetColumn,streetNumberColumn,propertyIDColumn;

    public void CreatePropertyColumn(){
        //Property tableView
        propTypeColumn = new javafx.scene.control.TableColumn<>("PropertyType");
        propTypeColumn.setMinWidth(80);
        propTypeColumn.setCellValueFactory(new PropertyValueFactory<>("propertyType"));

        bedroomsColumn = new javafx.scene.control.TableColumn<>("Bedrooms");
        bedroomsColumn.setMinWidth(70);
        bedroomsColumn.setCellValueFactory(new PropertyValueFactory<>("bedrooms"));

        bathroomsColumn = new javafx.scene.control.TableColumn<>("Bathrooms");
        bathroomsColumn.setMinWidth(70);
        bathroomsColumn.setCellValueFactory(new PropertyValueFactory<>("bathrooms"));

        squareFeetColumn = new javafx.scene.control.TableColumn<>("Square feet");
        squareFeetColumn.setMinWidth(70);
        squareFeetColumn.setCellValueFactory(new PropertyValueFactory<>("squareFeet"));

        countryColumn = new javafx.scene.control.TableColumn<>("Country");
        countryColumn.setMinWidth(200);
        countryColumn.setCellValueFactory(new PropertyValueFactory<>("country"));

        cityColumn = new javafx.scene.control.TableColumn<>("City");
        cityColumn.setMinWidth(150);
        cityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));

        addressColumn = new javafx.scene.control.TableColumn<>("address");
        addressColumn.setMinWidth(200);
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("Address"));

        streetColumn = new javafx.scene.control.TableColumn<>("Street");
        streetColumn.setMinWidth(200);
        streetColumn.setCellValueFactory(new PropertyValueFactory<>("street"));

        streetNumberColumn = new javafx.scene.control.TableColumn<>("House/Apartment ");
        streetNumberColumn.setMinWidth(150);
        streetNumberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));

        propertyIDColumn = new TableColumn<>("Property ID");
        propertyIDColumn.setMinWidth(100);
        propertyIDColumn.setCellValueFactory(new PropertyValueFactory<>("propertyID"));

        //TableColumn<Tenant, String> TenantName = new TableColumn<>("Tenant");

    }

    public void inputPropertyText() {
        //input
        propTypeInput = new TextField();
        propTypeInput.setPromptText("Property type");
        propTypeInput.setMaxWidth(120);

        bedroomInput = new TextField();
        bedroomInput.setPromptText("Bedrooms");
        bedroomInput.setMaxWidth(100);

        bathroomInput = new TextField();
        bathroomInput.setPromptText("Bathrooms");
        bathroomInput.setMaxWidth(100);

        squareFeetInput = new TextField();
        squareFeetInput.setPromptText("Square feet");
        squareFeetInput.setMaxWidth(100);

        countryInput = new TextField();
        countryInput.setPromptText("Country");
        countryInput.setMinWidth(100);

        cityInput = new TextField();
        cityInput.setPromptText("City");
        cityInput.setMaxWidth(100);

        addressInput = new TextField();
        addressInput.setPromptText("Address");
        addressInput.setMaxWidth(100);

        streetInput = new TextField();
        streetInput.setPromptText("Street");
        streetInput.setMaxWidth(100);

        streetNumberInput = new TextField();
        streetNumberInput.setPromptText("House/Apartment");
        streetNumberInput.setMaxWidth(120);

        PropertyIDInput = new TextField();
        PropertyIDInput.setPromptText("Property ID");
        PropertyIDInput.setMaxWidth(80);
    }




}
