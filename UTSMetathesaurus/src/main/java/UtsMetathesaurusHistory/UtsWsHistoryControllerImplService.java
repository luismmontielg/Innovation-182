
package UtsMetathesaurusHistory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "UtsWsHistoryControllerImplService", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", wsdlLocation = "https://uts-ws.nlm.nih.gov/services/nwsHistory?wsdl")
public class UtsWsHistoryControllerImplService
    extends Service
{

    private final static URL UTSWSHISTORYCONTROLLERIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(UtsMetathesaurusHistory.UtsWsHistoryControllerImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = UtsMetathesaurusHistory.UtsWsHistoryControllerImplService.class.getResource(".");
            url = new URL(baseUrl, "https://uts-ws.nlm.nih.gov/services/nwsHistory?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://uts-ws.nlm.nih.gov/services/nwsHistory?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UTSWSHISTORYCONTROLLERIMPLSERVICE_WSDL_LOCATION = url;
    }

    public UtsWsHistoryControllerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtsWsHistoryControllerImplService() {
        super(UTSWSHISTORYCONTROLLERIMPLSERVICE_WSDL_LOCATION, new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsHistoryControllerImplService"));
    }

    /**
     * 
     * @return
     *     returns UtsWsHistoryController
     */
    @WebEndpoint(name = "UtsWsHistoryControllerImplPort")
    public UtsWsHistoryController getUtsWsHistoryControllerImplPort() {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsHistoryControllerImplPort"), UtsWsHistoryController.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtsWsHistoryController
     */
    @WebEndpoint(name = "UtsWsHistoryControllerImplPort")
    public UtsWsHistoryController getUtsWsHistoryControllerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.uts.umls.nlm.nih.gov/", "UtsWsHistoryControllerImplPort"), UtsWsHistoryController.class, features);
    }

}
