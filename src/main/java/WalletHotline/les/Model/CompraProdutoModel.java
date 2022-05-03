package WalletHotline.les.Model;

import javax.persistence.*;

import WalletHotline.les.CompositeKey.CompraProdutoCompositeKey;

@Entity(name = "compras_produtos")
@IdClass(CompraProdutoCompositeKey.class)
public class CompraProdutoModel {

        @Id
        @Column(name = "compra_id", nullable = true, length = 50, columnDefinition = "default 'NULL'")
        private Integer compraid;

        @Id
        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        private Integer produtoid;

        @Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
        private Integer quantidade;

        public void setCompraid(Integer compraid) {
                this.compraid = compraid;
        }

        public Integer getCompraid() {
                return compraid;
        }

        public void setProdutoid(Integer produtoid) {
                this.produtoid = produtoid;
        }

        public Integer getProdutoid() {
                return produtoid;
        }

        public void setQuantidade(Integer quantidade) {
                this.quantidade = quantidade;
        }

        public Integer getQuantidade() {
                return quantidade;
        }
}