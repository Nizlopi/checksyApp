import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private UserService userService;

    @Mock
    private UserDAO userDAO;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addStore_ShouldCallStoreRepository() throws Exception {
        userService.addUser("Christoph", "Marckx", "Rumst", "christoph.marckx@gmail.com", "0472258387");

        verify(userDAO).addUser(new User("Christoph", "Marckx", "Rumst", "christoph.marckx@gmail.com", "0472258387"));
    }

    @Test
    public void getAllUsers() throws Exception {
        User user1 = new User("Christoph", "Marckx", "Rumst", "christoph.marckx@gmail.com", "0472258387");
        User user2 = new User("Eline", "De Mulder", "Kallo", "elinedm@gmail.com", "0472258387");
        User user3 = new User("Len", "Karpisek", "Rumst", "len.karpisek@gmail.com", "0472258387");

        when(userDAO.getAllUsers()).thenReturn(Arrays.asList(user1, user2));

        assertThat(userService.getAllUsers()).containsOnly(user1, user2);
    }
}