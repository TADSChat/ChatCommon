package common;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Interface para o Client do Chat
 * 
 * Contem os metodos definidos pelo cliente, e executados pelo servidor
 * 
 * @author Dread
 *
 */
public interface InterfaceUsuario extends Remote {

	public static final String NOME = "Transferencia";
	
	/**
	 * Metodo para recebimento de mensagem
	 * 
	 * @param remetente
	 *            Usuario que enviou a mensagem
	 * @param mensagem
	 *            Mensagem recebida
	 * @throws RemoteException
	 */
	public void receberMensagem(EntidadeUsuario remetente, String mensagem) throws RemoteException;

	/**
	 * Metodo para recebimento de arquivo
	 * 
	 * @param remetente
	 *            Usuario que enviou o arquivo
	 * @param arquivo
	 *            Arquivo recebido
	 * @throws RemoteException
	 */
	public void receberArquivo(EntidadeUsuario remetente, File arquivo) throws RemoteException;

	/**
	 * Metodo para recebimento de participantes ativos
	 * 
	 * @param arrayList
	 *            Lista de usuarios conectados
	 * @throws RemoteException
	 */
	public void receberListaParticipantes(List<EntidadeUsuario> lista) throws RemoteException;

	/**
	 * Metodo para desconectar o usuario pelo servidor
	 * @throws RemoteException
	 */
	public void desconectarForcado() throws RemoteException;
}
