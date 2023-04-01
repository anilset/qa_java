import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {
    @Test
    public void checkGetFamily() {
        Animal animal = new Animal();
        String actualResult = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actualResult);
    }

    @Test
    public void checkGetFoodExceptionMessage() throws Exception {
        Animal animal = new Animal();
        String[] animalKinds = {"Всеядное", "Cat", "Lion", null};
        for (String kind: animalKinds) {
            Throwable thrown = assertThrows(Exception.class, () -> animal.getFood(kind));
            String actualMessage = thrown.getMessage();
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", actualMessage);
        }
    }
}
