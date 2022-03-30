package fr.semifir;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    @Test
    public void addition() {
        //comment
        int result = Calculatrice.addition(10,10,10);
        assertEquals(30, result);
    }
    @Test
    public void soustraction() {
        int result = Calculatrice.soustraction(10,2,3);
        assertEquals(5, result);
    }
    @Test
    public void multiplication() {
        int result = Calculatrice.multiplication(10,10);
        assertEquals(100, result);
    }
    @Test
    public void division() {
        int result = Calculatrice.division(10,2);
        assertEquals(5, result);
    }
}
