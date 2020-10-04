package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(1,2);
    }

    @Test
    void testFractionIntInt() {
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(2, this.fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction= new Fraction();
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(1, this.fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5,this.fraction.decimal(),10e-5);
    }

    @Test
    void setNumeratorInt() {
        this.fraction.setNumerator(8);
        assertEquals(8,this.fraction.getNumerator());
    }
    @Test
    void setDenominatorInt() {
        this.fraction.setDenominator(12);
        assertEquals(12,this.fraction.getDenominator());
    }

}
