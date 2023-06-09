package exam_5;

public class TestCounter {
    public static void main(String[] args) {
        Counter[] arr = new Counter[2]; //Line n2
        for (Counter ctr : arr) {
            System.out.print(ctr.count); //Line n3
        }
        String a="asd";
        String b="ASD";
        System.out.println(b.toLowerCase().equals(a));
        System.out.println(a.length() == b.length());
    }
}
