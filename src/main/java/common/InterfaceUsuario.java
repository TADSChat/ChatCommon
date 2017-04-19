package common;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
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

	/**
	 * Recebe a listagem de contatos Online do servidor
	 * 
	 * @param lista
	 *            Lista de contatos que estao disponiveis
	 * @throws RemoteException
	 */
	public void receberContatosOnline(List<EntidadeUsuario> lista) throws RemoteException;

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
	public void receberArquivo(EntidadeUsuario remetente, Arquivo arquivo) throws RemoteException;

	/**
	 * Metodo para recebimento de participantes ativos
	 * 
	 * @param arrayList
	 *            Lista de usuarios conectados
	 * @throws RemoteException
	 */
	public void receberListaParticipantes(ArrayList<EntidadeUsuario> arrayList) throws RemoteException;

}
