package root;
import javax.servlet.http.HttpServletResponse;
import com.sap.ecm.api.AbstractCmisProxyServlet;
public class CMISProxyServlet extends AbstractCmisProxyServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected boolean supportAtomPubBinding() {
		return false;
	}

	@Override
	protected boolean supportBrowserBinding() {
		return true;
	}

       
    public CMISProxyServlet() {
        super();
    }

    @Override
    protected String getRepositoryUniqueName() {
        return "doccon.repository";
    }

    @Override
    // For applications in production, use a secure location to store the secret key.
    protected String getRepositoryKey() {
        return "Doccon@1234567890";
    }

}