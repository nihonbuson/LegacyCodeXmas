import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolidayTest {
    @Test
    void isNotXmas() {
        boolean actual = new Holiday().isXmas();
        assertEquals(false,actual);
    }
    @Test
    void isXmas() {
        boolean actual = new Holiday().isXmas();
        assertEquals(true,actual);
    }

}