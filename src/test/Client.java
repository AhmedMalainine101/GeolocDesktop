package test;

import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IdaoRemote;
import entities.Utilisateur;


public class Client {
	public static IdaoRemote<Utilisateur> lookUp() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IdaoRemote<Utilisateur>) context.lookup("ejb:/Geoloc/UtilisateurService!dao.UtilisateurRemote");
	}

	public static void main(String[] args) {
		try {
			IdaoRemote<Utilisateur> service = lookUp();
			
//
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
