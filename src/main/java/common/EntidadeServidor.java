package common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Classe persistida do Servidor com inteface fluente
 * 
 * @author EHDFREITAS
 *
 */
@Entity
@Table(name = "server")
public class EntidadeServidor {

	@Id
	@Column(name = "server_ip")
	private String ipServer;

	@Column(name = "server_porta")
	private Integer portaServer;

	@Transient
	private String Status;
	
	/**
	 * @return the ipServer
	 */
	public String getIpServer() {
		return ipServer;
	}

	/**
	 * @param ipServer
	 *            the ipServer to set
	 */
	public EntidadeServidor setIpServer(final String ipServer) {
		this.ipServer = ipServer;
		return this;
	}

	/**
	 * @return the portaServer
	 */
	public Integer getPortaServer() {
		return portaServer;
	}

	/**
	 * @param portaServer
	 *            the portaServer to set
	 */
	public EntidadeServidor setPortaServer(final Integer portaServer) {
		this.portaServer = portaServer;
		return this;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param status the status to set
	 */
	public EntidadeServidor setStatus(final String status) {
		Status = status;
		return this;
	}
}
