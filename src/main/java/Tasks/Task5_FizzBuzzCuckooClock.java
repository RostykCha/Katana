package Tasks;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5_FizzBuzzCuckooClock {
    @Test
    public void SomeBasicTimesTests() {
        System.out.println("Testing with time " + "13:34");
        assertEquals("tick", fizzBuzzCuckooClock("13:34"));
        System.out.println("Testing with time " + "21:00");
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", fizzBuzzCuckooClock("21:00"));
        System.out.println("Testing with time " + "11:15");
        assertEquals("Fizz Buzz", fizzBuzzCuckooClock("11:15"));
        System.out.println("Testing with time " + "03:03");
        assertEquals("Fizz", fizzBuzzCuckooClock("03:03"));
        System.out.println("Testing with time " + "14:30");
        assertEquals("Cuckoo", fizzBuzzCuckooClock("14:30"));
        System.out.println("Testing with time " + "08:55");
        assertEquals("Buzz", fizzBuzzCuckooClock("08:55"));
        System.out.println("Testing with time " + "00:00");
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", fizzBuzzCuckooClock("00:00"));
        System.out.println("Testing with time " + "12:00");
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", fizzBuzzCuckooClock("12:00"));
    }

    public String fizzBuzzCuckooClock(String time) {
        String result = "";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date time24 = sdf.parse(time);
            SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm");
            String time12 = sdf2.format(time24);
            int parsedTime = LocalTime.parse(time12).getHour() * 60 + LocalTime.parse(time12).getMinute();
            if (parsedTime % 60 == 0) {
                int numberToRepeat = parsedTime / 60;
                for (int i = 0; i < numberToRepeat; i++) {
                    result += "Cuckoo ";
                }
                result = result.substring(0, result.length() - 1);
            } else if (parsedTime % 30 == 0) {
                result = "Cuckoo";
            } else if (parsedTime % 5 == 0 && parsedTime % 3 == 0) {
                result = "Fizz Buzz";
            } else if (parsedTime % 5 == 0) {
                result = "Buzz";
            } else if (parsedTime % 3 == 0) {
                result = "Fizz";
            } else {
                result = "tick";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
