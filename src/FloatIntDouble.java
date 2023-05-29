import java.util.ArrayList;

  class Student {


    public static void sum(Integer x,int y){
        System.out.println("int"+ (x+y));


    } public static void sum(float x,float y){
        System.out.println("float"+ (x+y));


    } public static void sum(double x,double y){
        System.out.println("double"+ (x+y));


    }

        String name;
        public Student(String name){
            this.name=name;
        }

    public static void main(String[] args) {

        String[] a= new String[3];
        a[1]="l";
        a[2]="l";
        for (String s : a) {
            System.out.println(s);
        }

        Student[] b=new Student[3];
        b[0]=new Student("d");
        b[1]=new Student("d");
        b[2]=new Student("d");

        for (Student student : b) {
            System.out.println(student.name);
        }


        ArrayList<Integer > colors= new ArrayList<>();
        colors.add(1);
        colors.add(2);
        colors.add(3);
        colors.add(4);
        colors.add(5);
        colors.add(6);
        colors.add(null);
        colors.remove(2);
        colors.remove(null);

        System.out.println(colors);


sum(10,20);
sum(10.0,20.0);
    }
}
