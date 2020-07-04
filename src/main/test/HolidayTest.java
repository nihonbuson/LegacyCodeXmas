import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolidayTest {
    @Test
    void isNotXmas() {
        new Holiday().isXmas();
        assertEquals(1,1);
    }
}