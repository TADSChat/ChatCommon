package common;

import java.nio.file.Path;
import java.util.Arrays;

public class Arquivo {
	
	private String nome;
	private String extensão;
	private Path path;
	private byte[] dados;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getExtensão() {
		return extensão;
	}
	public void setExtensão(String extensão) {
		this.extensão = extensão;
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
		return "Arquivo [nome=" + nome + ", extensão=" + extensão + ", path=" + path + ", dados="
				+ Arrays.toString(dados) + "]";
	}
	public Arquivo() {
	
	}
	
	
	
	
}
