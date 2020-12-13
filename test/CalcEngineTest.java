import junit.framework.TestCase;
import org.junit.Test;

public class CalcEngineTest extends TestCase {

    @Test
    public void testNumberPressed() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        assertEquals(5,c.getDisplayValue());
        c.numberPressed(5);
        assertEquals(55, c.getDisplayValue());
    }

    @Test
    public void testPlus() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.plus();
        c.numberPressed(5);
        c.plus();
        c.numberPressed(2);
        c.equals();
        assertEquals(12,c.getDisplayValue());
    }

    @Test
    public void testMinus() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.minus();
        c.numberPressed(2);
        c.minus();
        c.numberPressed(1);
        c.equals();
        assertEquals(2, c.getDisplayValue());
    }

    @Test
    public void testTestEquals() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.minus();
        c.numberPressed(3);
        c.equals();
        assertEquals(2,c.getDisplayValue());
        c.plus();
        c.numberPressed(10);
        c.equals();
        assertEquals(12, c.getDisplayValue());

    }

    @Test
    public void testClear() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.plus();
        c.numberPressed(5);
        c.clear();
        c.numberPressed(2);
        c.minus();
        c.numberPressed(1);
        c.equals();
        assertEquals(1,c.getDisplayValue());
    }
}