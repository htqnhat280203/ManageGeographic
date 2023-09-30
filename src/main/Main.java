package main;



import model.Country;
import controller.ManageEastAsiaCountries;
import java.util.ArrayList;
import view.MenuModel;
import view.MenuView;

public class Main {
    public static void main(String[] args) {
        MenuModel model = new MenuModel();
        MenuView view = new MenuView(model);
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries(model, view);
        manager.startMenu();
}
}