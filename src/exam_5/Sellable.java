package exam_5;

public interface Sellable {
    double getPrice();
    
     default String symbol() {
        return "$";
    }
}


//Chair.java


//Test.java

 
