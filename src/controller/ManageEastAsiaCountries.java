package controller;

import model.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import view.MenuModel;
import view.MenuView;

public class ManageEastAsiaCountries {
    
private final static Scanner sc = new Scanner(System.in);
    private MenuModel model;
    private MenuView view;

    public ManageEastAsiaCountries(MenuModel model, MenuView view) {
        this.model = model;
        this.view = view;
    }
   

    public void startMenu() {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Country> lc = new ArrayList<>();
        while (true) {
            view.Menu();
            int choice = view.UserChoice();

            switch (choice) {
                case 1:
                    inputCountry(lc);
                    break;
                case 2:
                    printCountry(lc);
                    break;
                case 3:
                   searchByName(lc);
                    break;
                case 4:
                    printCountrySorted(lc);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    //cho phep nguoi dung nhap thong tin cua dat nuoc
    public static void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of contry: ");
        String countryCode = Validation.checkInputString();
        //check co ton tai dat nuoc hay khong
        if (!Validation.checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = Validation.checkInputString();
        System.out.print("Enter total area: ");
        double countryArea = Validation.checkInputDouble();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = Validation.checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }

    //the hien thong tin quoc gia
    public static void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //the hien thong tin quoc gia duoc sap xep trinh tu
    public static void printCountrySorted(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //cho phep nguoi dung tim kiem thong tin quoc gia bang ten
    public static void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = Validation.checkInputString();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }
    
}