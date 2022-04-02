package WalletHotline.les.Controller;

import WalletHotline.les.Model.CartaoModel;
import WalletHotline.les.Repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/cartoes")
public class CartaoController {

        @Autowired
        private CartaoRepository repository;

        @GetMapping(path = "/clienteid/{id}")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public Iterable<CartaoModel> cliente_id(@PathVariable("id") Integer cliente_id) {
                return repository.findByClienteId(cliente_id);
        }

        // delete
        @DeleteMapping(path = "/{id}")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public void deletar(@PathVariable("id") Integer id) {
                repository.deleteById(id);
        }

        // update
        @PutMapping(path = "")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public CartaoModel atualizar(@RequestBody CartaoModel cartao) {
                return repository.save(cartao);
        }

        // create/update
        @PostMapping(path = "") // salva e atualiza caso tenha um id
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public CartaoModel salvar(@RequestBody CartaoModel cartao) {
                return repository.save(cartao);
        }

        // get
        @GetMapping(path = "")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public Iterable<CartaoModel> consultarTodos() {
                return repository.findAll();
        }
}
