package exam_5;

public class Chair implements Sellable, Sellable2 {
    public double getPrice() {
        return 35;
    }

    @Override
    public String symbol() {
        return Sellable.super.symbol();
    }


//    //public   String symbol() {
//        return "£";
//    }
}
