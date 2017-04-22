package common;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Com base no código encontrado em:
 * http://stackoverflow.com/questions/304268/getting-a-files-md5-checksum-in-java/304350
 *
 */
public class Criptografia {

	/**
	 * Retorna o md5 a partir do nome do arquivo.
	 * 
	 * @param filename
	 * @return
	 * @throws Exception
	 */
	public static String criptografar(String string) {
		return hashString(string, "SHA-256");
	}

	private static String hashString(String message, String algorithm) {
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance(algorithm);
			messageDigest.update(message.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] hashedBytes = messageDigest.digest();
		return convertBytesToHex(hashedBytes);
	}

	private static String convertBytesToHex(byte[] bytes) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(0xff & bytes[i]);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}
	
}