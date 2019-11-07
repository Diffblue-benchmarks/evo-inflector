package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_getPluralTest_6_Test {
  @Test
  public void getPluralTest() throws Exception {
    // Arrange
    English english = new English();
    String word = "$";

    // Act
    String actual = english.getPlural(word);

    // Assert
    Assert.assertEquals("$s", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
