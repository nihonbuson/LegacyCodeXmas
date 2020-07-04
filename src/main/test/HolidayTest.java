import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolidayTest {
    @Test
    void isNotXmas() {
        Holiday holiday = new FakeHoliday();
        boolean actual = holiday.isXmas();
        assertEquals(false,actual);
    }
//    @Test
//    void isXmas() {
//        boolean actual = new Holiday().isXmas();
//        assertEquals(true,actual);
//    }

}