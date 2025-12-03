package objectoriented;

public class OrderSystem {
    public static void main(String[] args) {
        Menu currymenu = new Menu();
        Menu saladmenu = new Menu();
        Menu gratinmenu = new Menu();

        currymenu.name = "curry";
        currymenu.price = 200;

        saladmenu.name = "salad";
        saladmenu.price = 300;

        gratinmenu.name = "gratin";
        gratinmenu.price = 950;

        System.out.println(currymenu.name + ": " + currymenu.price + " yen");
        System.out.println(saladmenu.name + ": " + saladmenu.price + " yen");
        System.out.println(gratinmenu.name + ": " + gratinmenu.price + " yen");
    }
}