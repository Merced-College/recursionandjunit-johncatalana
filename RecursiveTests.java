//public import org.junit.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTests {
    // count8
   @Test public void testCount8_1() { assertEquals(1, Main.count8(8)); }
   @Test public void testCount8_2() { assertEquals(2, Main.count8(818)); }
   @Test public void testCount8_3() { assertEquals(4, Main.count8(8818)); }
   @Test public void testCount8_4() { assertEquals(0, Main.count8(123)); }
   @Test public void testCount8_5() { assertEquals(0, Main.count8(0)); }
   @Test public void testCount8_6() { assertEquals(1, Main.count8(280)); }
   @Test public void testCount8_7() { assertEquals(4, Main.count8(8088)); }
   @Test public void testCount8_8() { assertEquals(5, Main.count8(888)); }
   @Test public void testCount8_9() { assertEquals(1, Main.count8(18)); }
   @Test public void testCount8_10() { assertEquals(9, Main.count8(88888)); }

   
}
