package IsbasiManager;

import IsbasiModel.Bank;

import java.util.List;

public interface IBankManager {

    Bank get(Object id);

    List<Bank> getList();

    void save(Bank object);

    Bank update(Bank object);

    void delete(Bank object);
}
