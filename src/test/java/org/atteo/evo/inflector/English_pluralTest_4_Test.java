package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_pluralTest_4_Test {
  @Test
  public void pluralTest() throws Exception {
    // Arrange
    String word = "$";

    // Act
    String actual = English.plural(word);

    // Assert
    Assert.assertEquals("$s", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
