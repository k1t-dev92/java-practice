package objectoriented;

public class OrderSystem {
    public static void main(String[] args) {
        Menu currymenu = new Menu("curry", 200);
        Menu saladmenu = new Menu("salad", 300);
        Menu gratinmenu = new Menu("gratin", 950);

        int curryTotal = 1;
        int currySum = currymenu.getPrice(curryTotal);

        int saladTotal = 2;
        int saladSum = saladmenu.getPrice(saladTotal);

        int gratinTotal = 3;
        int gratinSum = gratinmenu.getPrice(gratinTotal);

        System.out.println(currymenu.getName() + ": " + currySum + " yen");
        System.out.println(saladmenu.getName() + ": " + saladSum + " yen");
        System.out.println(gratinmenu.getName() + ": " + gratinSum + " yen");
    }
}