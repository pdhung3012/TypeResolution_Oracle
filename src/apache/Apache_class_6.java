package apache;
//ID = 1560230
import org.apache.directory.api.ldap.model.entry.Entry;
import org.apache.directory.server.core.DefaultDirectoryService;
import org.apache.directory.server.core.api.partition.Partition;
import org.apache.directory.server.core.entry.ServerEntry;
import org.apache.directory.server.ldap.LdapServer;
import org.apache.directory.server.protocol.shared.transport.TcpTransport;
import org.apache.directory.shared.ldap.exception.LdapNameNotFoundException;
import org.apache.directory.shared.ldap.name.LdapDN;

public class Apache_class_6 {
	public void startDirectoryService() throws Exception {
	    DefaultDirectoryService service = new DefaultDirectoryService();
	    service.getChangeLog().setEnabled( false );

//	    Partition apachePartition = addPartition("apache", "dc=apache,dc=org");

	    LdapServer ldapService = new LdapServer();
	    ldapService.setTransports(new TcpTransport(389));
	    ldapService.setDirectoryService(service);

	    service.startup();
	    ldapService.start();

	    Partition apachePartition = null;
		service.getAdminSession().lookup( apachePartition.getSuffixDn() );
	}
}
