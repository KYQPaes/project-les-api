package WalletHotline.les.Controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import WalletHotline.les.Model.CupomModel;
import WalletHotline.les.Repository.CupomRepository;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/cupom")
public class CupomController {
        @Autowired
        private CupomRepository repository;

        @GetMapping(path = "/clienteid/{id}")
        public Iterable<CupomModel> consultarClienteId(@PathVariable("id") Integer id) {
                return repository.findByClienteId(id);
        }

        // get
        @GetMapping(path = "")
        public Iterable<CupomModel> consultarTodos() {
                return repository.findAll();
        }

        @PostMapping(path = "")
        public CupomModel salvar(@RequestBody CupomModel cupom) {
                return repository.save(cupom);
        }
}
