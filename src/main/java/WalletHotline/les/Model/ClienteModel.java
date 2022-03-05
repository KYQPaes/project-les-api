package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria um id com autoincrement
    public Integer id;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String nome;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String senha;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String data_nasc;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String sexo;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String email;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String genero;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String cpf;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String endereco;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String tptelefone;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String ddd;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String telefone;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTptelefone() {
        return this.tptelefone;
    }

    public void setTptelefone(String tptelefone) {
        this.tptelefone = tptelefone;
    }

    public String getDdd() {
        return this.ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
