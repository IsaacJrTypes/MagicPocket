// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pocket pocket = new Pocket();
        System.out.println(pocket.getNumItems());
        pocket.addItem("cat");
        pocket.addItem("dog");
        pocket.printItems();
        pocket.addItem("bird");
        System.out.println(pocket.getNumItems());
        pocket.removeItem("cat");
        System.out.println(pocket.getNumItems());
        pocket.printItems();
    }
}