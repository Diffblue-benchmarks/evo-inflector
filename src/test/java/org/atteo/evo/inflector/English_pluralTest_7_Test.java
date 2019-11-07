package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_pluralTest_7_Test {
  @Test
  public void pluralTest() throws Exception {
    // Arrange
    String word = "$";
    int count = 1;

    // Act
    String actual = English.plural(word, count);

    // Assert
    Assert.assertEquals("$", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
