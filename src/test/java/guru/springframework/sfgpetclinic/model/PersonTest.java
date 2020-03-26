package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1l, "Tutku", "Ince");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Tutku", person.getFirstName()),
                () -> assertEquals("Ince", person.getLastName()));
    }

    @Test
    void groupedAssertionsWithMessages() {
        // given
        Person person = new Person(1l, "Tutku", "Ince");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Tutku", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Ince", person.getLastName(), "Last Name Failed")
        );
    }
}