import java.util.ArrayList;
import java.util.List;

public class StoreDAO{

    private List<Store> stores = new ArrayList<>();

    public List<Store> getAllStores(){
        return stores;
    }

    public void addStore(Store store){
        stores.add(store);
    }
}
