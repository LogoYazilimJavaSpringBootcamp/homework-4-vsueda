package IsbasiController;

import IsbasiManager.IBankManager;
import IsbasiModel.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banks")
public class BankController {

    @Autowired
    private IBankManager iBankManager;


    @GetMapping(path = "/get/{id}")
    private Bank get(@PathVariable Long id){
        return iBankManager.get(id);
    }

    @GetMapping(path = "/list")
    private List<Bank> getList(){
        return iBankManager.getList();
    }

    @PostMapping(path = "/save")
    public void saveEgitim(@RequestBody Bank bank) {
        iBankManager.save(bank);
    }

    @GetMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id){
       Bank bank = iBankManager.get(id);
       iBankManager.delete(bank);
    }

    @GetMapping(path = "/updadte/{id}")
    public Bank update(@PathVariable Long id){
        Bank bank = iBankManager.get(id);
       return iBankManager.update(bank);
    }
}
