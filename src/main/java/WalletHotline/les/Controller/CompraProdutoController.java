package WalletHotline.les.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
