package WalletHotline.les.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WalletHotline.les.Model.CompraProdutoModel;
import WalletHotline.les.Repository.CompraProdutoRepository;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/compraprodutos")
public class CompraProdutoController {

        @Autowired
        private CompraProdutoRepository repository;

        @GetMapping(path = "")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public Iterable<CompraProdutoModel> consultarTodos() {
                return repository.findAll();
        }

        @PostMapping(path = "")
        public void salvar(@RequestBody Iterable<CompraProdutoModel> compras) {
                // List<CompraProdutoModel> lista = compra.getCompraProduto();
                // lista.forEach(action -> action.set(compra));
                // compra.setCompraProduto(cp);
                compras.forEach(compra -> repository.save(compra));
                return;
        }
}
