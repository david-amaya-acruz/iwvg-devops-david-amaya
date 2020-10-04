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
}
