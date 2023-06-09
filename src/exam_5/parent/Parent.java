package exam_5.parent;

import java.io.IOException;

public class Parent {

        Parent() throws IOException{
            System.out.print("HAKUNA");
        }
    }

    class Child extends Parent {
        Child() throws Exception {
            super();
            System.out.println("MATATA");
        }
    }

