package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_EnglishTest_5_Test {
  @Test
  public void EnglishTest() throws Exception {
    // Arrange
    English.MODE mode = English.MODE.ENGLISH_ANGLICIZED;

    // Act
    English english = new English(mode);

    // Assert
    Assert.assertNotNull(english.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
