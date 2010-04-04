package se.unlogic.eagledns;

import java.net.InetAddress;
import java.net.Socket;

import org.xbill.DNS.Message;

/**
 * This interface represents a incoming DNS query
 * 
 * @author Robert "Unlogic" Olofsson (unlogic@unlogic.se)
 *
 */
public interface Request {

	/**
	 * @return the incoming query parsed as a {@link Message} object.
	 */
	public Message getQuery();

	/**
	 * @return the incoming query as a raw byte array.
	 */
	public byte[] getRawQuery();

	/**
	 * @return the length of the data in the raw query.
	 */
	public int getRawQueryLength();

	/**
	 * @return the TCP socket associated with the query. If the query was received on a UDP socket this field will be null.
	 */
	public Socket getSocket();

	/**
	 * @return the address of the client that sent the query;
	 */
	public InetAddress getClientAddress();
}
