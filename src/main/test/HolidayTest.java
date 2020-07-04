import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HolidayTest {
    @Test
    void isNotXmas() {
        Holiday holiday = new FakeHoliday();
        boolean actual = holiday.isXmas();
        assertEquals(false,actual);
    }

    private class FakeHoliday extends Holiday {
        @Override
        protected LocalDate getNow() {
            return LocalDate.of(2020,12,23);
        }
    }
//    @Test
//    void isXmas() {
//        boolean actual = new Holiday().isXmas();
//        assertEquals(true,actual);
//    }

}