import java.beans.Transient;


import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testMultiply() {
        assertEquals(2, SkillDemo.multiply(2,3));
    }

}
