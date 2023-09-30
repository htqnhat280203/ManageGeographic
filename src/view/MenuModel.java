package view;

public class MenuModel {
    private String[] menuItems = {
        "Input the information of 11 countries in East Asia",
        "Display the information of country you've just input",
        "Search the information of country by user-entered name",
        "Display the information of countries sorted name in ascending",
        "Exit"
    };

    private int selectedMenuItem;

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setSelectedMenuItem(int selectedMenuItem) {
        this.selectedMenuItem = selectedMenuItem;
    }

    public int getSelectedMenuItem() {
        return selectedMenuItem;
    }
}