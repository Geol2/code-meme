package com.meme.code.exampleTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.meme.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  public void testCalculatorAdd10And50() {
    Calculator cal = new Calculator();
    double result = cal.add(10, 50);
    assertEquals(60, result, 0);
  }

  @Test
  public void testCalculatorAdd10And50Failed() {
    Calculator cal = new Calculator();
    double result = cal.add(10, 50);
    assertNotEquals(30, result, 0);
  }
}
