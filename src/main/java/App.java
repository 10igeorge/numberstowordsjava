import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static String numberWord(Integer number) {
    String results = "";
    HashMap<Integer, String> under10Map = new HashMap<Integer, String>();
    under10Map.put(1, "one");
    under10Map.put(2, "two");
    under10Map.put(3, "three");
    under10Map.put(4, "four");
    under10Map.put(5, "five");
    under10Map.put(6, "six");
    under10Map.put(7, "seven");
    under10Map.put(8, "eight");
    under10Map.put(9, "nine");

    HashMap<Integer, String> under20Map = new HashMap<Integer, String>();
    under20Map.put(10, "ten");
    under20Map.put(11, "eleven");
    under20Map.put(12, "twelve");
    under20Map.put(13, "thirteen");
    under20Map.put(14, "fourteen");
    under20Map.put(15, "fifteen");
    under20Map.put(16, "sixteen");
    under20Map.put(17, "seventeen");
    under20Map.put(18, "eighteen");
    under20Map.put(19, "nineteen");

    HashMap<Integer, String> tensMap = new HashMap<Integer, String>();
    tensMap.put(20, "twenty");
    tensMap.put(30, "thirty");
    tensMap.put(40, "forty");
    tensMap.put(50, "fifty");
    tensMap.put(60, "sixty");
    tensMap.put(70, "seventy");
    tensMap.put(80, "eighty");
    tensMap.put(90, "ninety");

    if (number < 10){
      for (Object key : under10Map.keySet()){
       if (key == number){
         results = under10Map.get(key);
        }
      }
    }

    if (number > 10 && number < 20){
      for (Object key : under20Map.keySet()){
       if (key == number){
         results = under20Map.get(key);
        }
      }
    }

    if (number % 10 == 0){
      for (Object key : tensMap.keySet()){
        if (key == number){
          results = tensMap.get(key);
        }
      }
    }
    if (number > 20){
      for (Integer key : tensMap.keySet()){
        if (key / 10 == number / 10){
          results = tensMap.get(key);
        }
      }
      for (Integer key : under10Map.keySet()){
        if (key % 10 == number % 10){
          results = results.concat(" " + under10Map.get(key));
        }
      }
    }
    //
    // if (number > 20 && number % 10 > 0){
    //
    // }
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
