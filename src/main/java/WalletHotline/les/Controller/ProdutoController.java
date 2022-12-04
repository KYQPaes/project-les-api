package WalletHotline.les.Controller;

import WalletHotline.les.Model.ProdutoModel;
import WalletHotline.les.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

        @Autowired
        private ProdutoRepository repository;

        @GetMapping(path = "/tipo/{tipo}")
        public Iterable<ProdutoModel> consultarPorTipo(@PathVariable("tipo") String tipo) {
                return repository.findByTipo(tipo);
        }

        @GetMapping(path = "")
        public Iterable<ProdutoModel> consultarTodos() {
                return repository.findAll();
        }

        @GetMapping(path = "/{id}")
        public ResponseEntity consultar(@PathVariable("id") Integer id) {
                return repository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElseThrow();
        }

        // update
        @PutMapping(path = "")
        public ProdutoModel atualizar(@RequestBody ProdutoModel produto) {
                return repository.save(produto);
        }
}
