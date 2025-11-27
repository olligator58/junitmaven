import org.example.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    User user;

    @BeforeEach
    public void createUser() {
        String username = "Alice";
        String password = "12345678";
        user = new User(username, password);
    }

    @Test
    public void hasStrongPassword() {
        assertTrue(user.hasStrongPassword());
    }

    @Test
    public void hasValidUsername() {
        assertTrue(user.hasValidUsername());
    }

    @Test
    public void isValid() {
        assertTrue(user.isValid());
    }
}
