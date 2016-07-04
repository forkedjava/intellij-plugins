package org.intellij.plugins.postcss.inspections;

import com.intellij.testFramework.TestDataPath;
import org.intellij.plugins.postcss.PostCssFixtureTestCase;
import org.jetbrains.annotations.NotNull;

@TestDataPath("$CONTENT_ROOT/testData/inspections/nesting/")
public class PostCssNestingInspectionTest extends PostCssFixtureTestCase {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    myFixture.enableInspections(PostCssNestingInspection.class);
  }

  public void testNormalRulesetWithNestingSelectors() {
    doTest();
  }

  public void testNestedRulesetWithoutAmpersand() {
    doTest();
  }

  public void testNestedRulesetWithNestWithoutAmpersand() {
    doTest();
  }

  public void testNestedRulesetWithoutNest() {
    doTest();
  }

  public void testCorrectNesting() {
    doTest();
  }

  public void testRuleInsideMedia() {
    doTest();
  }

  public void testRuleInsideDocument() {
    doTest();
  }

  public void testRuleInsideSupports() {
    doTest();
  }

  public void testNestedRuleInsideMedia() {
    doTest();
  }

  public void testNestedRuleInsideDocument() {
    doTest();
  }

  public void testNestedRuleInsideSupports() {
    doTest();
  }

  private long doTest() {
    return myFixture.testHighlighting(true, false, false, getTestName(true) + ".pcss");
  }

  @Override
  protected boolean isWriteActionRequired() {
    return false;
  }

  @NotNull
  @Override
  protected String getTestDataSubdir() {
    return "nesting";
  }
}