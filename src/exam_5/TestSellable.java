package exam_5;

public class TestSellable {
    public static void main(String[] args) {
        Sellable obj = new Chair(); //Line n1
        System.out.println(obj.symbol() + obj.getPrice()); //Line n2
    }
}
