
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionExceptionTest {

    private Feline feline;
    @Test
    public void checkLionExceptionMessage() {
        String[] options = {"оно", null};
        for (String option: options) {
            Throwable thrown = assertThrows(Exception.class, () -> new Lion(option, feline));
            String actualMessage = thrown.getMessage();
            assertEquals("Используйте допустимые значения пола животного - самец или самка", actualMessage);
        }
    }
}
