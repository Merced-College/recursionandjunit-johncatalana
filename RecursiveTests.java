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

   // countHi
   @Test public void testCountHi_1() {assertEquals(1, Main.countHi("xxhixx")); }
   @Test public void testCountHi_2() { assertEquals(2, Main.countHi("xhixhix")); }
   @Test public void testCountHi_3() { assertEquals(1, Main.countHi("hi")); }
   @Test public void testCountHi_4() { assertEquals(0, Main.countHi("hello")); }
   @Test public void testCountHi_5() { assertEquals(3, Main.countHi("hihihi")); }
   @Test public void testCountHi_6() { assertEquals(0, Main.countHi("")); }
   @Test public void testCountHi_7() { assertEquals(1, Main.countHi("hihello")); }
   @Test public void testCountHi_8() { assertEquals(2, Main.countHi("hixhi")); }
   @Test public void testCountHi_9() { assertEquals(0, Main.countHi("hhh")); }
   @Test public void testCountHi_10() { assertEquals(4, Main.countHi("hihihihi")); }

   // countHi2
   @Test public void testCountHi2_1() {assertEquals(1, Main.countHi2("ahixhi")); }
   @Test public void testCountHi2_2() { assertEquals(2, Main.countHi2("ahibhi")); }
   @Test public void testCountHi2_3() { assertEquals(0, Main.countHi2("xhixhi")); }
   @Test public void testCountHi2_4() { assertEquals(1, Main.countHi2("xhihi")); }
   @Test public void testCountHi2_5() { assertEquals(0, Main.countHi2("xhi")); }
   @Test public void testCountHi2_6() { assertEquals(0, Main.countHi2("x")); }
   @Test public void testCountHi2_7() { assertEquals(1, Main.countHi2("hix")); }
   @Test public void testCountHi2_8() { assertEquals(3, Main.countHi2("hihihi")); }
   @Test public void testCountHi2_9() { assertEquals(1, Main.countHi2("xhihixhi")); }
   @Test public void testCountHi2_10() { assertEquals(3, Main.countHi2("ahihihi")); }
}
