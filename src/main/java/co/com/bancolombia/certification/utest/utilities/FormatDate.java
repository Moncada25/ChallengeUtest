package co.com.bancolombia.certification.utest.utilities;

public class FormatDate {

  public static String getValue(String date, int index){
    return date.split("/")[index];
  }
}
