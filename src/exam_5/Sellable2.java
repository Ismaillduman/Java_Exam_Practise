package exam_5;

public interface Sellable2 {
    double getPrice();

    default String symbol() {
        return "$";
    }
}
