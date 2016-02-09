import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static String numberWord(Integer number) {
    String outPut = "";
    String[] lessThan20 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    for (Integer i= 0; i <= lessThan20.length; i++) {
      if (i == number) {
       outPut = lessThan20[i-1];
      }
    }
    return outPut;
  }
}
