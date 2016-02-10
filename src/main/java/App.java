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
//Numbers under 10
    if (number < 10){
      for (Object key : under10Map.keySet()){
       if (key == number){
         results = under10Map.get(key);
        }
      }
    }
//Teens (Numbers between 10 and 20)
    if (number > 10 && number < 20){
      for (Object key : under20Map.keySet()) {
       if (key == number){
         results = under20Map.get(key);
        }
      }
    }
//Numbers ending in 0 (20, 30, 40)
    if (number % 10 == 0){
      for (Object key : tensMap.keySet()) {
        if (key == number){
          results = tensMap.get(key);
        }
      }
    }
//Numbers 21-99
    if (number > 20){
      for (Integer key : tensMap.keySet()) {
        if (key / 10 == number / 10){
          results = tensMap.get(key);
        }
      }
      for (Integer key : under10Map.keySet()) {
        if (key % 10 == number % 10){
          results = results.concat(" " + under10Map.get(key));
        }
      }
    }
//Hundreds
  if (number > 99){
    for (Integer key : under10Map.keySet()) {
      if (number / 100 == key){
        results = under10Map.get(key) + " hundred";
      }
    }
    if (number < 110){
      for (Integer prop : under10Map.keySet()) {
        if (prop % 10 == number % 10){
          results = results.concat(" " + under10Map.get(prop));
        }
      }
    } else if (number < 120){
      for (Integer key : under20Map.keySet()) {
       if (number % 100 == key){
         results = results.concat(" " + under20Map.get(key));
        }
      }
    } else if (number < 1000){
      for (Integer key : tensMap.keySet()) {
        if ((key/10)%10 == (number/10)%10){
          results = results.concat(" " + tensMap.get(key));
        }
      }
      for (Integer key : under10Map.keySet()) {
        if ((key%10)%10 == (number%10)%10){
          results = results.concat(" " + under10Map.get(key));
        }
      }
    }
  }
    return results;
  }
}
