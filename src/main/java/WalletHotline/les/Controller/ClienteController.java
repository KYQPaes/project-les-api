package WalletHotline.les.Controller;

import WalletHotline.les.Model.ClienteModel;
import WalletHotline.les.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // read
    @GetMapping(path = "/api/clientes/{id}")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElseThrow();
    }

    @GetMapping(path = "/api/clientes/log")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public Iterable<ClienteModel> consultarLogin(@RequestParam String email, @RequestParam String senha) {
        return repository.findByEmailAndSenha(email, senha);
    }

    // create
    @PostMapping(path = "/api/clientes")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public ClienteModel salvar(@RequestBody ClienteModel cliente) {
        return repository.save(cliente);
    }

    // update
    @PutMapping(path = "/api/clientes")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public ClienteModel atualizar(@RequestBody ClienteModel cliente) {
        return repository.save(cliente);
    }

    // get
    @GetMapping(path = "/api/clientes")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public Iterable<ClienteModel> consultarTodos() {
        return repository.findAll();
    }

    // delete
    @DeleteMapping(path = "/api/clientes/{id}")
    @CrossOrigin(origins = "http://192.168.1.19:8080")
    public void deletar(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}