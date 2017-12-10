import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {

    private String storeName;
    private String storeCity;

    public Store(String storeName, String storeCity) {
        this.storeName = storeName;
        this.storeCity = storeCity;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreCity() {
        return storeCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(storeName, store.storeName) &&
                Objects.equals(storeCity, store.storeCity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(storeName, storeCity);
    }
}
