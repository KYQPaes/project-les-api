package WalletHotline.les.Controller;

import WalletHotline.les.Model.ClienteModel;
import WalletHotline.les.Repository.ClienteRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 9999, origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    // read teste
    @GetMapping(path = "/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id).map(record -> ResponseEntity.ok().body(record)).orElseThrow();
    }

    @GetMapping(path = "/log")
    public Iterable<ClienteModel> consultarLogin(@RequestParam String email, @RequestParam String senha) {
        if (email.equals("admin@admin.com") && senha.equals("admin123")) {
            ClienteModel cliente = new ClienteModel();
            cliente.setId(0);
            cliente.setNome("admin@admin.com");
            cliente.setEmail("admin");
            cliente.setSenha("admin123");

            List<ClienteModel> lista = new ArrayList<ClienteModel>();
            lista.add(cliente);
            return lista;
        } else {
            return repository.findByEmailAndSenha(email, senha);
        }
    }

    // create
    @PostMapping(path = "")
    public ClienteModel salvar(@RequestBody ClienteModel cliente) {
        return repository.save(cliente);
    }

    // update
    @PutMapping(path = "")
    public ClienteModel atualizar(@RequestBody ClienteModel cliente) {
        return repository.save(cliente);
    }

    // get
    @GetMapping(path = "")
    public Iterable<ClienteModel> consultarTodos() {
        return repository.findAll();
    }

    // delete
    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}