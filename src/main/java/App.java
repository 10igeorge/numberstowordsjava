import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static String numberWord(Integer number) {
    String results = "";
    HashMap<Integer, String> under20Map = new HashMap<Integer, String>();
    under20Map.put(1, "one");
    under20Map.put(2, "two");
    under20Map.put(3, "three");

    for (Object key : under20Map.keySet()){
     if (key == number){
       results = under20Map.get(key);
      }
    }
    return results;
  }
}



// String results = "";
// HashMap<Integer, String> lessThan20Map = new HashMap<Integer, String>();
// HashMap<Integer, String> moreThan20Map = new HashMap<Integer, String>();
// String[] lessThan20 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
// String[] moreThan20 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//
// for (Integer i= 0; i <= lessThan20.length; i++) {
//   lessThan20Map.put(i, lessThan20[i]);
// }
//
// for (Integer i=0; i <= moreThan20.length; i++) {
//   moreThan20Map.put(i, moreThan20[i]);
// }
//
// if (number < 20) {
//   for (Object key : lessThan20Map.keySet() ) {
//     if (number == key) {
//       results = lessThan20Map.get(key);
//     }
//   }
// }
// return results;
