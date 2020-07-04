import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HolidayTest {
    @Test
    void isNotXmas() {
        FakeHoliday holiday = new FakeHoliday();
        holiday.set(LocalDate.of(2020,12,23));
        boolean actual = holiday.isXmas();
        assertEquals(false,actual);
    }

    private class FakeHoliday extends Holiday {
        private LocalDate now;

        @Override
        protected LocalDate getNow() {
            return now;
        }

        public void set(LocalDate now) {
            this.now = now;
        }
    }
//    @Test
//    void isXmas() {
//        boolean actual = new Holiday().isXmas();
//        assertEquals(true,actual);
//    }

}