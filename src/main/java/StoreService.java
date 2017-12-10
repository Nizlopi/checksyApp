import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreService {

    private StoreDAO storeDAO;

    public void addStore(String storeName, String storeCity){
        storeDAO.addStore(new Store(storeName, storeCity));
    }

    public List<Store> getAllStores(){
        return storeDAO.getAllStores();
    }

}
