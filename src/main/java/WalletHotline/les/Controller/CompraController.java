package WalletHotline.les.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WalletHotline.les.Model.CompraModel;
// import WalletHotline.les.Model.CompraProdutoModel;
import WalletHotline.les.Repository.CompraRepository;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/compras")
public class CompraController {

        @Autowired
        private CompraRepository repository;

        @GetMapping(path = "/clienteid/{id}")
        public Iterable<CompraModel> consultarClienteId(@PathVariable("id") Integer id) {
                return repository.findByClienteId(id);
        }

        @PostMapping(path = "")
        public CompraModel salvar(@RequestBody CompraModel compra) {
                // List<CompraProdutoModel> lista = compra.getCompraProduto();
                // lista.forEach(action -> action.set(compra));
                // compra.setCompraProduto(cp);
                return repository.save(compra);
        }

        // update
        @PutMapping(path = "")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public CompraModel atualizar(@RequestBody CompraModel compra) {
                return repository.save(compra);
        }

}
