import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void getFelineFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensParamsTest() {
        for (int i = 0; i < 11; i++) {
            assertEquals(i, feline.getKittens(i));
        }
    }

    @Test
    public void getKittensTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void eatMeatTest() throws Exception {
    feline.eatMeat();
    Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
