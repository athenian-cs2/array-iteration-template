import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class MyTests {

  @Test
  public void testAddArrays3() {
    assertArrayEquals(
        new int[] {3, 7, 11},
        MyMain.addArrays3(new int[] {1, 3, 5}, new int[] {2, 4, 6}),
        "Adding [1, 3, 5] + [2, 4, 6] should be: [3, 7, 11]");
    assertArrayEquals(
        new int[] {0, 0, 0},
        MyMain.addArrays3(new int[] {1, 2, 3}, new int[] {-1, -2, -3}),
        "Adding [1, 2, 3] + [-1, -2, -3] should be: [0, 0, 0]");
    assertArrayEquals(
        new int[] {10, 20, 30},
        MyMain.addArrays3(new int[] {5, 10, 15}, new int[] {5, 10, 15}),
        "Adding [5, 10, 15] + [5, 10, 15] should be: [10, 20, 30]");
    assertArrayEquals(
        new int[] {0, 1, 2},
        MyMain.addArrays3(new int[] {0, 0, 0}, new int[] {0, 1, 2}),
        "Adding [0, 0, 0] + [0, 1, 2] should be: [0, 1, 2]");
  }

  @Test
  public void testAverage3() {
    assertArrayEquals(
        new double[] {3.0, 3.0, 3.0},
        MyMain.average3(new int[] {1, 3, 5}),
        0.001,
        "Average of [1, 3, 5] should be: [3.0, 3.0, 3.0]");
    assertArrayEquals(
        new double[] {2.0, 2.0, 2.0},
        MyMain.average3(new int[] {0, 2, 4}),
        0.001,
        "Average of [0, 2, 4] should be: [2.0, 2.0, 2.0]");
    assertArrayEquals(
        new double[] {5.0, 5.0, 5.0},
        MyMain.average3(new int[] {5, 5, 5}),
        0.001,
        "Average of [5, 5, 5] should be: [5.0, 5.0, 5.0]");
    assertArrayEquals(
        new double[] {0.0, 0.0, 0.0},
        MyMain.average3(new int[] {-3, 0, 3}),
        0.001,
        "Average of [-3, 0, 3] should be: [0.0, 0.0, 0.0]");
  }

  @Test
  public void testSum() {
    assertEquals(
        40,
        MyMain.sum(new int[] {1, 6, 2, 6, 8, 2, 3, 9, 3}),
        "Sum of [1, 6, 2, 6, 8, 2, 3, 9, 3] should be: 40");
    assertEquals(
        15,
        MyMain.sum(new int[] {1, 2, 3, 4, 5}),
        "Sum of [1, 2, 3, 4, 5] should be: 15");
    assertEquals(
        0,
        MyMain.sum(new int[] {0, 0, 0, 0}),
        "Sum of [0, 0, 0, 0] should be: 0");
    assertEquals(
        0,
        MyMain.sum(new int[] {-5, -2, 7}),
        "Sum of [-5, -2, 7] should be: 0");
    assertEquals(
        100,
        MyMain.sum(new int[] {100}),
        "Sum of [100] should be: 100");
  }

  @Test
  public void testMax() {
    assertEquals(
        9,
        MyMain.max(new int[] {1, 6, 2, 6, 8, 2, 3, 9, 3}),
        "Max of [1, 6, 2, 6, 8, 2, 3, 9, 3] should be: 9");
    assertEquals(
        5,
        MyMain.max(new int[] {1, 2, 3, 4, 5}),
        "Max of [1, 2, 3, 4, 5] should be: 5");
    assertEquals(
        0,
        MyMain.max(new int[] {-5, -2, 0, -10}),
        "Max of [-5, -2, 0, -10] should be: 0");
    assertEquals(
        -1,
        MyMain.max(new int[] {-5, -2, -1, -10}),
        "Max of [-5, -2, -1, -10] should be: -1");
    assertEquals(
        100,
        MyMain.max(new int[] {100}),
        "Max of [100] should be: 100");
  }

  @Test
  public void testReverse() {
    assertEquals(
        "[5, 4, 3, 2, 1]",
        Arrays.toString(MyMain.reverse(new int[] {1, 2, 3, 4, 5})),
        "The array [1, 2, 3, 4, 5] when reversed should be: " + "[5, 4, 3, 2, 1]");
    assertEquals(
        "[1, 2, 3, 4, 5]",
        Arrays.toString(MyMain.reverse(new int[] {5, 4, 3, 2, 1})),
        "The array [5, 4, 3, 2, 1] when reversed should be: " + "[1, 2, 3, 4, 5]");
    assertEquals(
        "[1, 1, 1, 1, 1]",
        Arrays.toString(MyMain.reverse(new int[] {1, 1, 1, 1, 1})),
        "The array [1, 1 ,1, 1, 1] when reversed should be: " + "[1, 1, 1, 1, 1]");
    assertEquals(
        "[-1, 3, 5, -3, 7]",
        Arrays.toString(MyMain.reverse(new int[] {7, -3, 5, 3, -1})),
        "The array [7, -3, 5, 3, -1] when reversed should be: " + "[-1, 3, 5, -3, 7]");
  }

  @Test
  public void testSecondLargest() {
    assertEquals(
        4,
        MyMain.secondLargest(new int[] {1, 2, 3, 4, 5}),
        "The second largest value in the array [1, 2, 3, 4, 5] should be: " + 4);
    assertEquals(
        23,
        MyMain.secondLargest(new int[] {11, 23, 5, 97, 6, 18}),
        "The second largest value in the array [11, 23, 5, 97, 6, 18] should be: " + 23);
    assertEquals(
        27,
        MyMain.secondLargest(new int[] {27, 12, 18, 28, 24, 22}),
        "The second largest value in the array [27, 12, 18, 28, 24, 22] should be: " + 27);
    assertEquals(
        -18,
        MyMain.secondLargest(new int[] {-27, -12, -18, -28, -24, -22}),
        "The second largest value in the array [-27, -12, -18, -28, -24, -22] should be: " + -18);
    assertEquals(
        8,
        MyMain.secondLargest(new int[] {12, 2, 3, 4, 5, 7, 8}),
        "The second largest value in the array [12, 2, 3, 4, 5, 7, 8] should be: " + 8);
  }

  @Test
  public void testSpellCheck() {
    assertEquals(
        true, MyMain.spellCheck("dog"), "The output of spellchecking \"dog\" should be: " + true);
    assertEquals(
        false,
        MyMain.spellCheck("doge"),
        "The output of spellchecking \"doge\" should be: " + false);
    assertEquals(
        true,
        MyMain.spellCheck("water"),
        "The output of spellchecking \"water\" should be: " + true);
    assertEquals(
        true, MyMain.spellCheck("will"), "The output of spellchecking \"will\" should be: " + true);
    assertEquals(
        false,
        MyMain.spellCheck("peoples"),
        "The output of spellchecking \"peoples\" should be: " + false);
    assertEquals(
        false, MyMain.spellCheck("why"), "The output of spellchecking \"why\" should be: " + false);
  }
}
