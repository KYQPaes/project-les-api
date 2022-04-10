package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "cupom")
public class CupomModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria um id com autoincrement
        public Integer id;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String validade;

        @Column(name = "cliente_id", nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public Integer clienteId;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String codigo;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String descricao;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String status;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getValidade() {
                return validade;
        }

        public void setValidade(String validade) {
                this.validade = validade;
        }

        public Integer getClienteId() {
                return clienteId;
        }

        public void setClienteId(Integer clienteId) {
                this.clienteId = clienteId;
        }

        public String getCodigo() {
                return codigo;
        }

        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

}
