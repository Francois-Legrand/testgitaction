package fr.semifir;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        //comment
        int result = Calculatrice.addition(10,10,10);
        assertEquals(30, result);
    }
    @Test
    public void testSoustraction() {
        int result = Calculatrice.soustraction(10,2,3);
        assertEquals(5, result);
    }
    @Test
    public void testMultiplication() {
        int result = Calculatrice.multiplication(10,10);
        assertEquals(100, result);
    }
    @Test
    public void testDivision() {
        int result = Calculatrice.division(10,2);
        assertEquals(5, result);
    }
}
