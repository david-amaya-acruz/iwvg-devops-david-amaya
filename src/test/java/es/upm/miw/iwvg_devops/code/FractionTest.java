package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void isProper() {
        this.fraction = new Fraction(3,4);
        assertTrue(this.fraction.isProper());
    }

    @Test
    void isImproper() {
        this.fraction = new Fraction(2,1);
        assertTrue(this.fraction.isImproper());
    }

    @Test
    void isReducible() {
        this.fraction = new Fraction(5 ,3);
        assertFalse(this.fraction.isReducible());
        this.fraction = new Fraction(3,5);
        assertFalse(this.fraction.isReducible());
        this.fraction = new Fraction(2,1);
        assertTrue(this.fraction.isReducible());
        this.fraction = new Fraction(4,2);
        assertTrue(this.fraction.isReducible());
        this.fraction = new Fraction(5,10);
        assertTrue(this.fraction.isReducible());
    }

    @Test
    void isEquivalent() {
        Fraction fraction = new Fraction(1,2);
        this.fraction = new Fraction(2 ,4);
        assertTrue( this.fraction.isEquivalent(fraction));
    }


    @Test
    void add() {
        Fraction fraction = new Fraction(1,2);
        this.fraction = new Fraction(1 ,4);
        Fraction result = this.fraction.add(fraction);
        assertEquals(6, result.getNumerator());
        assertEquals(8, result.getDenominator());
    }

    @Test
    void multiply() {
        Fraction fraction = new Fraction(3,6);
        this.fraction = new Fraction(5 ,3);
        Fraction result = this.fraction.multiply(fraction);
        assertEquals(15, result.getNumerator());
        assertEquals(18, result.getDenominator());
    }


}