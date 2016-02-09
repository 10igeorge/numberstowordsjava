import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
   public void numberWord_translateANumberToAWord_word() {
     App numbersToWords = new App();
     String word = "one";
     assertEquals(word, numbersToWords.numberWord(1));
   }
}
