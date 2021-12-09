package com.example.kerekparbolt;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;

public class HelloController {

    @FXML
    public Button btnLegolcsobbMtb;
    @FXML
    public Button btnGyerek;
    @FXML
    public Button btnTrekking;
    @FXML
    public Button btnBeolvas;
    @FXML
    public Button btnHibasAdat;
    @FXML
    public Button btnKilep;
    @FXML
    public TableView<Kerekpar> tableKerekparok;
    @FXML
    public TableColumn<Kerekpar, Integer> colCikk;
    @FXML
    public TableColumn<Kerekpar, String> colNev;
    @FXML
    public TableColumn<Kerekpar, String> colTipus;
    @FXML
    public TableColumn<Kerekpar, Integer> colAr;
    @FXML
    public TableColumn<Kerekpar, Boolean> colHasznalt;
    @FXML
    public TableColumn<Kerekpar, String> colKat;
    @FXML
    public TableColumn<Kerekpar, LocalDate> colDate;

    @FXML
    public void initialize(){
        colCikk.setCellValueFactory(new PropertyValueFactory<>("cikkSzam"));
        colNev.setCellValueFactory(new PropertyValueFactory<>("nev"));
        colTipus.setCellValueFactory(new PropertyValueFactory<>("tipus"));
        colAr.setCellValueFactory(new PropertyValueFactory<>("ar"));
        colHasznalt.setCellValueFactory(new PropertyValueFactory<>("hasznalt"));
        colKat.setCellValueFactory(new PropertyValueFactory<>("KategoriaSzoveg"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("rogzitesDatuma"));

        //Kerekpar k1 = new Kerekpar("123;asdasd;trekking;123123123;0;2;2020.09.22");
        //tableKerekparok.getItems().add(k1);
    }

    public void btnLegolcsobbMtbClick(MouseEvent mouseEvent) {
    }

    public void btnGyerekClick(MouseEvent mouseEvent) {
    }

    public void btnTrekkingClick(MouseEvent mouseEvent) {
    }
    @FXML
    public void btnBeolvasClick(MouseEvent mouseEvent) {
        try {
            FileReader fr = new FileReader("kerekparok.csv");
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String sor = br.readLine();
            while (sor != null){
                Kerekpar obj = new Kerekpar(sor);
                tableKerekparok.getItems().add(obj);
                sor = br.readLine();
            }
            btnLegolcsobbMtb.setDisable(false);
            btnGyerek.setDisable(false);
            btnTrekking.setDisable(false);
            btnHibasAdat.setDisable(false);

        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }

    public void btnHibasAdatClick(MouseEvent mouseEvent) {
    }

    public void btnKilepClick(MouseEvent mouseEvent) {
    }
}