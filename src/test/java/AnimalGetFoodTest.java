import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    String animalKind;
    List<String> expectedMenu;

    public AnimalGetFoodTest(String animalKind, List<String> expectedMenu) {
        this.animalKind = animalKind;
        this.expectedMenu = expectedMenu;
    }
    @Parameterized.Parameters
    public static Object[][] getAnimalKinds() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodCheck() throws Exception {
        Animal animal = new Animal();
        List <String> actualFood = animal.getFood(animalKind);
        assertTrue(actualFood.containsAll(expectedMenu));
        //assertEquals(expectedMenu, actualFood);
    }
}
