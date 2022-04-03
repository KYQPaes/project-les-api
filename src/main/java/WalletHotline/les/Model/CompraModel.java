package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "compras")
public class CompraModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Cria um id com autoincrement
        public Integer id;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String data_comp;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String status;

        @Column(name = "cliente_id", nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public Integer clienteId;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String metodo;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String endereco;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public Float frete;

        @Column(name = "cupom_id", nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public Integer cupomId;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public Float valor;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        public String metodo2;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getData_comp() {
                return data_comp;
        }

        public void setData_comp(String data_comp) {
                this.data_comp = data_comp;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public Integer getClienteId() {
                return clienteId;
        }

        public void setClienteId(Integer clienteId) {
                this.clienteId = clienteId;
        }

        public String getMetodo() {
                return metodo;
        }

        public void setMetodo(String metodo) {
                this.metodo = metodo;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public Float getFrete() {
                return frete;
        }

        public void setFrete(Float frete) {
                this.frete = frete;
        }

        public Integer getCupomId() {
                return cupomId;
        }

        public void setCupomId(Integer cupomId) {
                this.cupomId = cupomId;
        }

        public Float getValor() {
                return valor;
        }

        public void setValor(Float valor) {
                this.valor = valor;
        }

        public String getMetodo2() {
                return metodo2;
        }

        public void setMetodo2(String metodo2) {
                this.metodo2 = metodo2;
        }
}