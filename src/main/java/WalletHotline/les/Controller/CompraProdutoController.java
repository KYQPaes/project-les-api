package WalletHotline.les.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WalletHotline.les.Model.CompraProdutoModel;
import WalletHotline.les.Repository.CompraProdutoRepository;
import WalletHotline.les.Repository.CustomCompraProdutoRepository;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/compraprodutos")
public class CompraProdutoController {

        @Autowired
        private CompraProdutoRepository repository;

        @Autowired
        private CustomCompraProdutoRepository customRepository;

        @GetMapping(path = "")
        @CrossOrigin(origins = "http://192.168.1.19:8080")
        public Iterable<CompraProdutoModel> consultarTodos() {
                return repository.findAll();
        }

        @GetMapping(path = "compraid/{id}")
        public Iterable<CompraProdutoModel> consultar(@PathVariable("id") Integer id) {
                return repository.findByCompraid(id);
        }

        @GetMapping(path = "graphProduto/{id}/{dataInicial}/{dataFinal}")
        public Object graphProduto(@PathVariable("id") Integer id, @PathVariable("dataInicial") String dataInicial,
                        @PathVariable("dataFinal") String dataFinal) {
                return customRepository.graphProduto(id, dataInicial, dataFinal);
        }

        @GetMapping(path = "graphData/{dataInicial}/{dataFinal}")
        public List graphData(@PathVariable("dataInicial") String dataInicial,
                        @PathVariable("dataFinal") String dataFinal) {
                return customRepository.graphData(dataInicial, dataFinal);
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
