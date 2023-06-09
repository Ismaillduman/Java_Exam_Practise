interface ILog {
    static void log() {
        System.out.println("ILog");
    }
}
 
abstract class Log {
    public static void log() {
        System.out.println("Log");
    }
}
 
class MyLogger  extends Log implements ILog {
public static void log(){

    System.out.println("mylogger");
}
    public static void main(String[] args) {
ILog.log();
    }
}

