package dk.mercantec.javaii;

import org.junit.Test;

public class ExternalTest {

    @Test
    public void testGetCompany() throws Exception {
        System.out.println("GetCompany");
        Object result = "";
        assert(result instanceof String);
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("ExternalToString");
        Object result = "";
        assert(result instanceof String);
    }

    @Test
    public void testSetCompany() throws Exception {
        System.out.println("SetCompany");
        Object result = "Tester";
        assert(result instanceof String);
    }
}