import com.kata.LeapYear;
import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void given1900ThenFalse() {

        LeapYear leapYear = new LeapYear();

        int year = 1900;
        boolean expectedOutput = false;

        boolean output = leapYear.check(year);

        Assert.assertEquals(output, expectedOutput);
    }

    @Test
    public void given2001ThenFalse() {

        LeapYear leapYear = new LeapYear();

        int year = 2001;
        boolean expectedOutput = false;

        boolean output = leapYear.check(year);

        Assert.assertEquals(output, expectedOutput);
    }

    @Test
    public void given1996ThenTrue() {

        LeapYear leapYear = new LeapYear();

        int year = 1996;
        boolean expectedOutput = true;

        boolean output = leapYear.check(year);

        Assert.assertEquals(output, expectedOutput);
    }

    @Test
    public void given2044ThenTrue() {

        LeapYear leapYear = new LeapYear();

        int year = 2044;
        boolean expectedOutput = true;

        boolean output = leapYear.check(year);

        Assert.assertEquals(output, expectedOutput);
    }

    @Test
    public void given2032ThenTrue() {

        LeapYear leapYear = new LeapYear();

        int year = 2032;
        boolean expectedOutput = true;

        boolean output = leapYear.check(year);

        Assert.assertEquals(output, expectedOutput);
    }
}
