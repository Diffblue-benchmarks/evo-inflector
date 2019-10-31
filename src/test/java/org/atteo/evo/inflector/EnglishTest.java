package org.atteo.evo.inflector;

import org.atteo.evo.inflector.English.MODE;
import org.atteo.evo.inflector.English;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class EnglishTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99909dcbc950d3facbf() {

    // Act, creating object to test constructor
    final English actual = new English();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputEnglish_anglicizedOutputNotNull9999865b61dad52993d() {

    // Arrange
    final English.MODE arg0 = English.MODE.ENGLISH_ANGLICIZED;

    // Act, creating object to test constructor
    final English actual = new English(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPluralInputNotNullPositiveOutputNotNull9994697432aad1d2c90() {

    // Arrange
    final English thisObj = new English();
    final String arg0 = "$";
    final int arg1 = 1;

    // Act
    final String actual = thisObj.getPlural(arg0, arg1);

    // Assert result
    Assert.assertEquals("$", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPluralInputNotNullOutputNotNull999c1081d765ed846c8() {

    // Arrange
    final English thisObj = new English();
    final String arg0 = "$";

    // Act
    final String actual = thisObj.getPlural(arg0);

    // Assert result
    Assert.assertEquals("$s", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void pluralInputNotNullPositiveOutputNotNull999e6701975b39d2d96() {

    // Arrange
    final String arg0 = "$";
    final int arg1 = 1;

    // Act
    final String actual = English.plural(arg0, arg1);

    // Assert result
    Assert.assertEquals("$", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void pluralInputNotNullOutputNotNull9998448a841b8ad363d() {

    // Arrange
    final String arg0 = "$";

    // Act
    final String actual = English.plural(arg0);

    // Assert result
    Assert.assertEquals("$s", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setModeInputEnglish_anglicizedOutputVoid999c44583f3b8e65caf() {

    // Arrange
    final English.MODE arg0 = English.MODE.ENGLISH_ANGLICIZED;

    // Act
    English.setMode(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputEnglish_anglicized999cb17b360d9eedf1d() {

    // Arrange
    final String arg0 = "ENGLISH_ANGLICIZED";

    // Act
    final English.MODE actual = English.MODE.valueOf(arg0);

    // Assert result
    Assert.assertEquals(English.MODE.ENGLISH_ANGLICIZED, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput29993a6fdc707a784e57() {

    // Act
    final English.MODE[] actual = English.MODE.values();

    // Assert result
    Assert.assertArrayEquals(new English.MODE[]{ English.MODE.ENGLISH_ANGLICIZED, English.MODE.ENGLISH_CLASSICAL }, actual);

  }
}
