package exam_5;
class Report {
 public String generateReport2(int a) {
 return "CSV";
 }

 public Object generateReport2() {
 return "XLSX";
 }
 }

 public class TestReport {
 public static void main(String[] args) {
      Report rep = new Report();
String csv = rep.generateReport2(5);
 Object xlsx = rep.generateReport2();
System.out.println(csv + ":" + (String)xlsx);
 }
 }