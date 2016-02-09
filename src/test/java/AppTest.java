import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
   public void numberWord_translateANumberLessThan20ToAWord_word() {
     App numbersToWords = new App();
     String word = "two";
     assertEquals(word, numbersToWords.numberWord(2));
   }

}
