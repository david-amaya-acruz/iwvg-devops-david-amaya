package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchesTest {


    @Test
    void findFirstProperFractionByUserId() {
        Fraction result = new Searches().findFirstProperFractionByUserId("1");
        assertEquals(0,result.getNumerator());
        assertEquals(1,result.getDenominator());
    }

    @Test
    void findUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez","Blanco","López", "Torres"), new Searches()
                .findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void findHighestFraction() {
        Fraction result =new Searches().findHighestFraction();
        assertEquals(0, result.getNumerator());
        assertEquals(0, result.getDenominator());
    }

    @Test
    void findUserNameBySomeImproperFraction() {
        assertEquals(List.of("Oscar","Ana","Paula", "Antonio"), new Searches()
                .findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }
}
