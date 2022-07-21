package IsbasiRepository;

import IsbasiModel.Bank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;

@Repository
public class BankRepository extends AbstractIsbasiRepository<Bank> implements IBankRepository{

}
