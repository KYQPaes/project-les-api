package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Cria um id com autoincrement
    public Integer id;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String nome;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String sobrenome;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String senha;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String data_nasc;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String sexo;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String email;

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
