package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "enderecos")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria um id com autoincrement
    public Integer id;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String cep;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String pais;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String endereco;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String numero;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String bairro;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String cidade;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String estado;

    @Column(name = "cliente_id", nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public Integer clienteId;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String tipo_residencia;

    @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
    public String tipo_logradouro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getTipo_residencia() {
        return tipo_residencia;
    }

    public void setTipo_residencia(String tipo_residencia) {
        this.tipo_residencia = tipo_residencia;
    }

    public String getTipo_logradouro() {
        return tipo_logradouro;
    }

    public void setTipo_logradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }
}
