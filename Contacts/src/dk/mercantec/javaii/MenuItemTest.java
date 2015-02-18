package dk.mercantec.javaii;

import org.junit.Test;

public class MenuItemTest {

    @Test
    public void testGetMenuCallback() throws Exception {
        System.out.println("GetMenuCallback");
        Object result = "";
        assert(result instanceof MenuCallback);
    }

    @Test
    public void testGetText() throws Exception {
        System.out.println("GetText");

        Object result = "";
        assert(result instanceof String);
    }
}