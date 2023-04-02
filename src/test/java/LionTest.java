import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    Feline feline;
    String sex;
    boolean expectedHasMane;

    public LionTest (Feline feline, String sex, boolean expectedHasMane) {
        this.feline = feline;
        this.sex =sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters (name = "{index}: Семейство{0}, Пол{1}, Есть ли грива{2}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {new Feline(), "Самец", true },
                {new Feline(), "Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
