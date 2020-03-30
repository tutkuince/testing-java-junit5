package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    private IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {
        assertEquals("index", indexController.index());
        assertEquals("index", indexController.index(), "Wrong View Returned!");
        assertEquals("index", indexController.index(), () -> "This is some expensive " +
                "Message to build" +
                "for my test");
    }

    @Test
    @DisplayName("Test exception")
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class,
                () -> indexController.oopsHandler()
                );
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100),
                () -> Thread.sleep(2000));
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100),
                () -> Thread.sleep(2000));
    }


    @Test
    void testAssumptionTrue() {
        assumeTrue("INCE".equalsIgnoreCase(System.getenv("INCE_RUNTIME")));
    }

    @Test
    void testAssumptionIsTrue() {
        assumeTrue("INCE".equalsIgnoreCase("INCE"));
    }
}