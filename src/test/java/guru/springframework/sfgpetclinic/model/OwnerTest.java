package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Tutku", "Ince");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        assertAll("Properties Test",
                () ->
                    assertAll("Person Properties",
                            () -> assertEquals("Tutku", owner.getFirstName(), "First Name Did not Match"),
                            () -> assertEquals("Ince", owner.getLastName())),
                () ->
                    assertAll("Owner Properties",
                            () -> assertEquals("Key West", owner.getCity(), "City Did not Match"),
                            () -> assertEquals("1231231234", owner.getTelephone()))
                );
    }

}