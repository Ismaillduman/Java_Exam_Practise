package exam_5;

public class Profitable {
    public interface Profitable1 {
        default double profit() {
            return 12.5;
        }
    }
    public interface Profitable2 {
        default double profit() {
            return 25.5;
        }
    }
    public abstract class Profit implements Profitable1, Profitable2 {
        @Override
        public double profit() {
            return Profitable1.super.profit();
        }

        /*INSERT*/
    }
}
