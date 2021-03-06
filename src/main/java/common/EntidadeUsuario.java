package common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Classe persistida do Usuario com inteface fluente
 * 
 * @author Dread
 *
 */
@Entity
@Table(name = "chatUser")
public class EntidadeUsuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "user_id", columnDefinition = "serial")
	private Integer id;

	@Column(name = "user_name")
	private String nome;

	@Column(name = "user_email")
	private String email;

	@Column(name = "user_password")
	private String senha;

	@Transient
	private Status status;

	@Transient
	private String ipConexao;

	@Transient
	private Integer portaConexao;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public EntidadeUsuario setId(final Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public EntidadeUsuario setNome(final String nome) {
		this.nome = nome;
		return this;
	}

	/**
	 * @return the login
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public EntidadeUsuario setEmail(final String email) {
		this.email = email;
		return this;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha
	 *            the senha to set
	 */
	public EntidadeUsuario setSenha(final String senha) {
		this.senha = senha;
		return this;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public EntidadeUsuario setStatus(final Status status) {
		this.status = status;
		return this;
	}

	/**
	 * @return the ipConexao
	 */
	public String getIpConexao() {
		return ipConexao;
	}

	/**
	 * @param ipConexao
	 *            the ipConexao to set
	 * @return
	 */
	public EntidadeUsuario setIpConexao(final String ipConexao) {
		this.ipConexao = ipConexao;
		return this;
	}

	/**
	 * @return the portaConexao
	 */
	public Integer getPortaConexao() {
		return portaConexao;
	}

	/**
	 * @param portaConexao
	 *            the portaConexao to set
	 */
	public EntidadeUsuario setPortaConexao(final Integer portaConexao) {
		this.portaConexao = portaConexao;
		return this;
	}
}
