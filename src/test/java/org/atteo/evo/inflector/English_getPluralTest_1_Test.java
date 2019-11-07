package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_getPluralTest_1_Test {
  @Test
  public void getPluralTest() throws Exception {
    // Arrange
    English english = new English();
    String word = "$";
    int count = 1;

    // Act
    String actual = english.getPlural(word, count);

    // Assert
    Assert.assertEquals("$", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
