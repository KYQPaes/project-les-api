package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "cartoes")
public class CartaoModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria um id com autoincrement
        public Integer id;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String nome;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String numero;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String cvv;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String validade;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String cpf;

        @Column(name = "cliente_id", nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public Integer clienteId;

        public Integer getId() {
                return this.id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getNome() {
                return this.nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getNumero() {
                return this.numero;
        }

        public void setNumero(String numero) {
                this.numero = numero;
        }

        public String getCvv() {
                return this.cvv;
        }

        public void setCvv(String cvv) {
                this.cvv = cvv;
        }

        public String getValidade() {
                return this.validade;
        }

        public void setValidade(String validade) {
                this.validade = validade;
        }

        public String getCpf() {
                return this.cpf;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }

        public Integer getClienteId() {
                return this.clienteId;
        }

        public void setClienteId(Integer clienteId) {
                this.clienteId = clienteId;
        }

}
