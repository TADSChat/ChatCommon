package common;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface para o Servidor de Chat.
 * 
 * Contem os metodos executados definidos pelo servidor, e executados pelo
 * cliente
 * 
 * @author Dread
 *
 */
public interface InterfaceServidor extends Remote {

	public static final String NOME = "ChatRMI";

	//
	/**
	 * Metodo para conectar o usuario ao servidor de chat
	 * 
	 * @param usuario
	 *            Usuario que esta se conectando
	 * @param interfaceUsuario
	 *            Inteface que contem os metodos a serem executados no cliente
	 * @return
	 * @throws RemoteException
	 */
	public EntidadeUsuario conectarChat(EntidadeUsuario usuario, InterfaceUsuario interfaceUsuario)
			throws RemoteException;

	/**
	 * Metodo para desconectar o usuario do servidor de chat
	 * 
	 * @param usuario
	 *            Usuario que esta se desconectando
	 * @throws RemoteException
	 */
	public void desconectarChat(EntidadeUsuario usuario) throws RemoteException;

	/**
	 * Metodo para envio de mensagem de um usuario para outro
	 * 
	 * @param remetente
	 *            Usuario que esta enviando a mensagem
	 * @param destinatario
	 *            Usuario que esta recebendo a mensagem
	 * @param mensagem
	 *            Mensagem a ser enviada
	 * @throws RemoteException
	 */
	public void enviarMensagem(EntidadeUsuario remetente, EntidadeUsuario destinatario, String mensagem)
			throws RemoteException;

	/**
	 * Metodo para envio de mensagem de um usario para todos os demais
	 * 
	 * @param remetente
	 *            Usuario que esta enviando a mensagem
	 * @param mensagem
	 *            Mensagem a ser enviada
	 * @throws RemoteException
	 */
	public void enviarMensagem(EntidadeUsuario remetente, String mensagem) throws RemoteException;

	/**
	 * Metodo para atualização de status
	 * 
	 * @param usuario
	 *            Usuario que esta atualizando o status
	 * @throws RemoteException
	 */
	public boolean atualizarStatus(EntidadeUsuario usuario) throws RemoteException;

	/**
	 * Metodo para atualiza��o de senha
	 * 
	 * @param usuario
	 *            Usuario que esta atualizando a senha
	 * @throws RemoteException
	 */
	public boolean alterarSenha(EntidadeUsuario usuario) throws RemoteException;

}
