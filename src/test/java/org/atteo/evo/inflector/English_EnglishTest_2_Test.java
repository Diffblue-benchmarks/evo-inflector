package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_EnglishTest_2_Test {
  @Test
  public void EnglishTest() throws Exception {
    // Arrange and Act
    English english = new English();

    // Assert
    Assert.assertNotNull(english.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
