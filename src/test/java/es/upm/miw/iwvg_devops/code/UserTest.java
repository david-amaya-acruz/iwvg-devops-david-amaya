package es.upm.miw.iwvg_devops.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    private List<Fraction> fractionList;

    @BeforeEach
    void before() {
        this.fractionList = new ArrayList<>();
        Fraction fractionOne = new Fraction(1, 2);
        Fraction fractionTwo = new Fraction(3, 2);
        this.fractionList.add(fractionOne);
        this.fractionList.add(fractionTwo);
        this.user = new User("1715606255", "DAVID", "AMAYA", fractionList);
    }

    @Test
    void testUserStringStringStringList() {
        assertEquals("1715606255", this.user.getId());
        assertEquals("DAVID", this.user.getName());
        assertEquals("AMAYA", this.user.getFamilyName());
        assertEquals(this.fractionList, this.user.getFractions());
    }

    @Test
    void testUser() {
        this.user = new User();
        assertEquals(0, user.getFractions().size());

    }

    @Test
    void setNameString() {
        this.user.setName("ALEXANDER");
        assertEquals("ALEXANDER", user.getName());
    }

    @Test
    void setFamilyName() {
        this.user.setFamilyName("CRUZ");
        assertEquals("CRUZ", this.user.getFamilyName());
    }

    @Test
    void fullName() {
        assertEquals("DAVID AMAYA", this.user.fullName());
    }

    @Test
    void initials() {
        assertEquals("D.", this.user.initials());
    }

    @Test
    void toString1() {
        assertEquals("User{id='1715606255', name='DAVID', familyName='AMAYA'," +
                        " fractions=[Fraction{numerator=1, denominator=2}, Fraction{numerator=3, denominator=2}]}",
                this.user.toString());
    }
}
