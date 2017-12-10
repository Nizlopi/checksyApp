import org.assertj.core.api.AbstractBooleanArrayAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.verify;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class StoreServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private StoreService storeService;

    @Mock
    private StoreDAO storeDAO;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addStore_ShouldCallStoreRepository() throws Exception {
        storeService.addStore("Mediamarkt", "Antwerpen");

        verify(storeDAO).addStore(new Store("Mediamarkt", "Antwerpen"));
    }

    @Test
    public void getAllStores() throws Exception {
        Store store1 = new Store("Mediamarkt", "Antwerpen");
        Store store2 = new Store("H&M", "Antwerpen");
        Store store3 = new Store("Primark", "Gent");

        when(storeDAO.getAllStores()).thenReturn(Arrays.asList(store1, store2));

        assertThat(storeService.getAllStores()).containsOnly(store1, store2);
    }
}

