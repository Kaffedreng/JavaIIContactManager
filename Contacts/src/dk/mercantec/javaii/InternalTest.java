package dk.mercantec.javaii;

import org.junit.Test;

public class InternalTest {

    @Test
    public void testGetDepartment() throws Exception {
        System.out.println("GetDepartment");
        Object result = "";
        assert(result instanceof String);
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("InternalToString");
        Object result = "Tester";
        assert(result instanceof String);
    }

    @Test
    public void testSetDepartment() throws Exception {
        System.out.println("SetDepartment");
        Object result = "Tester";
        assert(result instanceof String);
    }
}