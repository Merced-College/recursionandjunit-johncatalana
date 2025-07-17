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

   // strcount
   @Test public void testStrCount_1() {assertEquals(2, Main.strCount("catcowcat", "cat")); }
   @Test public void testStrCount_2() { assertEquals(1, Main.strCount("catcowcat", "cow")); }
   @Test public void testStrCount_3() { assertEquals(0, Main.strCount("catcowcat", "dog")); }
   @Test public void testStrCount_4() { assertEquals(2, Main.strCount("aaaa", "aa")); }
   @Test public void testStrCount_5() { assertEquals(3, Main.strCount("xxx", "x")); }
   @Test public void testStrCount_6() { assertEquals(0, Main.strCount("hello", "lls")); }
   @Test public void testStrCount_7() { assertEquals(1, Main.strCount("abc", "abc")); }
   @Test public void testStrCount_8() { assertEquals(0, Main.strCount("", "abc")); }
   @Test public void testStrCount_9() { assertEquals(1, Main.strCount("dogcat", "cat")); }
   @Test public void testStrCount_10() { assertEquals(0, Main.strCount("hi", "hihi")); }

   // stringClean
   @Test public void testStringClean_1() {assertEquals("yza", Main.stringClean("yyzzza")); }
   @Test public void testStringClean_2() { assertEquals("abcd", Main.stringClean("abbbcdd")); }
   @Test public void testStringClean_3() { assertEquals("Helo", Main.stringClean("Hello")); }
   @Test public void testStringClean_4() { assertEquals("a", Main.stringClean("aaaaa")); }
   @Test public void testStringClean_5() { assertEquals("", Main.stringClean("")); }
   @Test public void testStringClean_6() { assertEquals("xyzxyz", Main.stringClean("xxyyzzxyz")); }
   @Test public void testStringClean_7() { assertEquals("abc", Main.stringClean("aabbcc")); }
   @Test public void testStringClean_8() { assertEquals("ab", Main.stringClean("aaab")); }
   @Test public void testStringClean_9() { assertEquals("wxyz", Main.stringClean("wwxxxyyyzzz")); }
   @Test public void testStringClean_10() { assertEquals("a", Main.stringClean("a")); }
}
