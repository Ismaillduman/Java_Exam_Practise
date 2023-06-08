public class Triangle {
    static double area;
//    int b = 2, h = 3;
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
        //throw new Exception();
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("checking card");
        //throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        double p = 0,b = 0,h = 0;

        if(area==0){
            
            b=3;
            p=4;
            h=0.5;

        }
        area=p*b*h;
        System.out.println(area);
        Triangle ex= new Triangle();
        int cardNo=1233;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);
    }
}
