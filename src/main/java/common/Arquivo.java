package common;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.Arrays;

public class Arquivo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String extensao;
	private Path path;
	private byte[] dados;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensão) {
		this.extensao = extensão;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public byte[] getDados() {
		return dados;
	}

	public void setDados(byte[] dados) {
		this.dados = dados;
	}

	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", extens�o=" + extensao + ", path=" + path + ", dados="
				+ Arrays.toString(dados) + "]";
	}

	public Arquivo() {

	}

}
