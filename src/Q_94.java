import java.util.ArrayList;
import java.util.List;

public class Q_94 {
    public class Person{
String name;
int age;

        public Person(String name) {
            setName(name);
        }

        public Person(String name, int age) {
            //Person(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Person> st= new ArrayList<>();
    }

}
