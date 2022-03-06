package WalletHotline.les.Controller;

import WalletHotline.les.Model.CartaoModel;
import WalletHotline.les.Repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

        // create
        @PostMapping(path = "")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public CartaoModel salvar(@RequestBody CartaoModel cartao) {
                return repository.save(cartao);
        }

        // @GetMapping(path = "/api/cartoes/{id}")
        // @CrossOrigin(origins = "http://192.168.1.19:8080")
        // public ResponseEntity consultar(@PathVariable("id") Integer id) {
        // return repository.findById(id).map(record ->
        // ResponseEntity.ok().body(record)).orElseThrow();
        // }

        // @GetMapping(path = "/api/cartoes")
        // @CrossOrigin(origins = "http://192.168.1.19:8080")
        // public Iterable<CartaoModel> listar() {
        // return repository.findAll();
        // }
}
