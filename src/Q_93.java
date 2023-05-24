public class Q_93 {
    int id;
    String name;

    public Q_93(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Q_93 q930= new Q_93(101,"pen");
        Q_93 q931= new Q_93(101,"pen");
        Q_93 q933= q930;
        boolean ans= q930==q931;
        boolean ans2=q930.name.equals(q931.name);
        System.out.println(ans2+""+ans);
    }
}
