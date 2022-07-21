package IsbasiManager;

import IsbasiModel.Bank;
import IsbasiRepository.IBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BankManager implements IBankManager{
    @Autowired
    EntityManager entityManager;

    @Autowired
    private IBankRepository bankRepository;

    private Bank get(Long id){
        return bankRepository.get(id);
    }

    @Override
    public Bank get(Object id) {
        return bankRepository.get(id);
    }

    public List<Bank> getList() {
        return bankRepository.getList();
    }

    public void save(Bank object){
        bankRepository.save(object);
    }
    public Bank update(Bank object){
        return bankRepository.update(object);
    }
    public void delete(Bank object){
        bankRepository.delete(object);
    }


}
