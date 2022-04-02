package WalletHotline.les.Model;

import javax.persistence.*;

@Entity(name = "produtos")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Cria um id com autoincrement
	public Integer id;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String nome;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String descricao;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public float preco;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String imagem;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String tipo;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String imagem2;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String imagem3;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public Integer quantidade;

	@Column(nullable = true, length = 50, columnDefinition = "default 'NULL'")
	public String situacao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagem2() {
		return imagem2;
	}

	public void setImagem2(String imagem2) {
		this.imagem2 = imagem2;
	}

	public String getImagem3() {
		return imagem3;
	}

	public void setImagem3(String imagem3) {
		this.imagem3 = imagem3;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}
