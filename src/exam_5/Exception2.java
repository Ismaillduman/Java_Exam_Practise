package exam_5;

import java.sql.SQLException;

public class Exception2 {

//        private static void checkData() throws SQLException {
//            try {
//                throw new SQLException();
//            } catch (Exception e) {
//                e = null; //Line 10
//                throw e; //Line 11
//            }
//        }
//
//        public static void main(String[] args) {
//            try {
//                checkData(); //Line 17
//            } catch(SQLException e) {
//                System.out.println("NOT AVAILABLE");
//            }
//        }
private static void m() throws SQLException {
    try {
        throw new SQLException();
    } catch (Exception e) {

        //throw e;

    }
}

    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");
        }

        boolean flag = false;
        do {
            if(flag != flag) { //Line n1
                System.out.print(1); //Line n2
                continue; //Line n3
            }
            System.out.print(2); //Line n4
        } while(flag); //Line n5
        String str = "ALASKA";
        System.out.println(str.charAt(str.indexOf("A") + 1));
    }
    }


