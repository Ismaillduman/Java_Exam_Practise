package exam_5;

import java.sql.SQLException;

public class Exception2 {

    private static void availableSeats() throws  SQLException {
        throw null; //Line 7
    }
    public static void main(String[] args) throws SQLException  {
        try {
            availableSeats(); //Line 12
        } catch(NullPointerException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }

        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag1 && flag2);
    }
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
//private static void m() throws SQLException {
//    try {
//        throw new SQLException();
//    } catch (Exception e) {
//
//        //throw e;
//
//    }
//}
//
//    public static void main(String[] args) {
//        try {
//            m();
//        } catch(SQLException e) {
//            System.out.println("CAUGHT SUCCESSFULLY");
//        }
//
//        boolean flag = false;
//        do {
//            if(flag != flag) { //Line n1
//                System.out.print(1); //Line n2
//                continue; //Line n3
//            }
//            System.out.print(2); //Line n4
//        } while(flag); //Line n5
//        String str = "ALASKA";
//        System.out.println(str.charAt(str.indexOf("A") + 1));
    }



