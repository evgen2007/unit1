import org.junit.jupiter.api.*;

@DisplayName("Test1")
public class TestUnit {
    @Test
    public void test1() {
        Unit u1 = new Unit("Ork1");
        String oldName;
        String newName;
        oldName = u1.getName();
        u1.setName("Ork1");
        newName = u1.getName();
        Assertions.assertEquals(oldName, newName);
    }

    @Test
    public void test2() {
        Unit u1 = new Unit("Ork1");
        Assertions.assertFalse(u1.getName() == null || u1.getName().isEmpty());
    }

    @Test
    public void test3(){
        Unit u1 = new Unit("Ork1");
        Assertions.assertEquals(u1.getHealth(), 100);
        u1.setHealth(-100);
        Assertions.assertEquals(u1.getHealth(), 100);
        u1.setHealth(105);
        Assertions.assertEquals(u1.getHealth(), 100);
    }
}
