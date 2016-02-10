import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
   public void numberWord_translateANumberLessThan10ToAWord_word() {
     App numbersToWords = new App();
     String word = "two";
     assertEquals(word, numbersToWords.numberWord(2));
   }

   @Test
    public void numberWord_translateANumberLessThan20ToAWord_word() {
      App numbersToWords = new App();
      String word = "twelve";
      assertEquals(word, numbersToWords.numberWord(12));
    }

   @Test
    public void numberWord_translateANumberByTens_word() {
      App numbersToWords = new App();
      String word = "twenty";
      assertEquals(word, numbersToWords.numberWord(20));
    }

   @Test
    public void numberWord_translateANumberBetweenTens_word() {
      App numbersToWords = new App();
      String word = "ninety eight";
      assertEquals(word, numbersToWords.numberWord(98));
    }

    @Test
     public void numberWord_translateANumberAbove99_word() {
       App numbersToWords = new App();
       String word = "one hundred one";
       assertEquals(word, numbersToWords.numberWord(101));
     }

   @Test
    public void numberWord_translateANumberBetween100And120_word() {
      App numbersToWords = new App();
      String word = "one hundred eighteen";
      assertEquals(word, numbersToWords.numberWord(118));
    }

    @Test
     public void numberWord_translateANumberUnder1000_word() {
       App numbersToWords = new App();
       String word = "nine hundred ninety six";
       assertEquals(word, numbersToWords.numberWord(996));
     }
}
