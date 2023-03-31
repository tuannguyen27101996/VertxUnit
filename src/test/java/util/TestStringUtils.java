package util;


import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(VertxUnitRunner.class)
public class TestStringUtils {

    @Test
    public void testGetNoSpaceString(TestContext testContext) {

        testContext.assertEquals(StringUtils.getNoSpaceString("123"), "123");
    }

    @Test
    public void testCheckIsNumberStringCaseTrue(TestContext testContext) {

        testContext.assertEquals(StringUtils.checkIsNumberString("123"), true);
    }
    @Test
    public void testCheckIsNumberStringCaseFalse(TestContext testContext) {

        testContext.assertEquals(StringUtils.checkIsNumberString("123a"), false);
    }
}
