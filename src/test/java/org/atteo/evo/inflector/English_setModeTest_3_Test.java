package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English;
import org.junit.Test;
import org.junit.rules.Timeout;

public class English_setModeTest_3_Test {
  @Test
  public void setModeTest() throws Exception {
    // Arrange
    English.MODE mode = English.MODE.ENGLISH_ANGLICIZED;

    // Act
    English.setMode(mode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
