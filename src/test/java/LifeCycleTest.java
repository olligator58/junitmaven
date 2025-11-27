import org.junit.jupiter.api.*;

public class LifeCycleTest {

    LifeCycleTest() {
        System.out.println("Test Class Constructor");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before the test fixture");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After the test fixture");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each test");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}