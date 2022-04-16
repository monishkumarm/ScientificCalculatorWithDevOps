import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal;

    @Test
    public void SQrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, Calculator.SquareRoot(4), DELTA);
        assertEquals("Finding square root for True Positive", 3, Calculator.SquareRoot(9), DELTA);
    }

    @Test
    public void SQrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, Calculator.SquareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, Calculator.SquareRoot(2), DELTA);
    }

    @Test
    public void FactorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 24, Calculator.Factorial(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 120, Calculator.Factorial(5), DELTA);
    }

    @Test
    public void factoriaFactorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 24, Calculator.Factorial(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 120, Calculator.Factorial(6), DELTA);
    }

    @Test
    public void NaturalLogTruePositive(){
        assertEquals("Finding natural log for True Positive", 2.302585092994046, Calculator.NaturalLog(10), DELTA);
        assertEquals("Finding natural log for True Positive", 0, Calculator.NaturalLog(1), DELTA);
    }

    @Test
    public void NaturalLogFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 7, Calculator.NaturalLog(15), DELTA);
        assertNotEquals("Finding natural log for False Positive", 4.5, Calculator.NaturalLog(12.3), DELTA);
    }

    @Test
    public void PowerTruePositive(){
        assertEquals("Finding power for True Positive", 8, Calculator.Power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", -91.125, Calculator.Power(-4.5, 3), DELTA);
    }

    @Test
    public void PowerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, Calculator.Power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 27, Calculator.Power(-3, 3), DELTA);
    }
}
