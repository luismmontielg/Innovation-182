
package gov.nih.nlm.uts.webservice.finder;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UtsWsFinderController", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UtsWsFinderController {


    /**
     * 
     * @param psf
     * @param ticket
     * @param string
     * @param target
     * @param searchType
     * @param returnType
     * @param version
     * @return
     *     returns int
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCount", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.GetCount")
    @ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.GetCountResponse")
    public int getCount(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "returnType", targetNamespace = "")
        String returnType,
        @WebParam(name = "target", targetNamespace = "")
        String target,
        @WebParam(name = "string", targetNamespace = "")
        String string,
        @WebParam(name = "searchType", targetNamespace = "")
        String searchType,
        @WebParam(name = "psf", targetNamespace = "")
        Psf psf)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param psf
     * @param ticket
     * @param string
     * @param target
     * @param searchType
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.uts.webservice.finder.UiLabel>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findConcepts", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindConcepts")
    @ResponseWrapper(localName = "findConceptsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindConceptsResponse")
    public List<UiLabel> findConcepts(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "target", targetNamespace = "")
        String target,
        @WebParam(name = "string", targetNamespace = "")
        String string,
        @WebParam(name = "searchType", targetNamespace = "")
        String searchType,
        @WebParam(name = "psf", targetNamespace = "")
        Psf psf)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param psf
     * @param ticket
     * @param string
     * @param target
     * @param searchType
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.uts.webservice.finder.UiLabel>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAtoms", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindAtoms")
    @ResponseWrapper(localName = "findAtomsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindAtomsResponse")
    public List<UiLabel> findAtoms(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "target", targetNamespace = "")
        String target,
        @WebParam(name = "string", targetNamespace = "")
        String string,
        @WebParam(name = "searchType", targetNamespace = "")
        String searchType,
        @WebParam(name = "psf", targetNamespace = "")
        Psf psf)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param psf
     * @param ticket
     * @param string
     * @param target
     * @param searchType
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.uts.webservice.finder.UiLabelRootSource>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCodes", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindCodes")
    @ResponseWrapper(localName = "findCodesResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindCodesResponse")
    public List<UiLabelRootSource> findCodes(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "target", targetNamespace = "")
        String target,
        @WebParam(name = "string", targetNamespace = "")
        String string,
        @WebParam(name = "searchType", targetNamespace = "")
        String searchType,
        @WebParam(name = "psf", targetNamespace = "")
        Psf psf)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param psf
     * @param ticket
     * @param string
     * @param target
     * @param searchType
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.uts.webservice.finder.UiLabelRootSource>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findSourceConcepts", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindSourceConcepts")
    @ResponseWrapper(localName = "findSourceConceptsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindSourceConceptsResponse")
    public List<UiLabelRootSource> findSourceConcepts(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "target", targetNamespace = "")
        String target,
        @WebParam(name = "string", targetNamespace = "")
        String string,
        @WebParam(name = "searchType", targetNamespace = "")
        String searchType,
        @WebParam(name = "psf", targetNamespace = "")
        Psf psf)
        throws UtsFault_Exception
    ;

    /**
     * 
     * @param psf
     * @param ticket
     * @param string
     * @param target
     * @param searchType
     * @param version
     * @return
     *     returns java.util.List<gov.nih.nlm.uts.webservice.finder.UiLabelRootSource>
     * @throws UtsFault_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findSourceDescriptors", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindSourceDescriptors")
    @ResponseWrapper(localName = "findSourceDescriptorsResponse", targetNamespace = "http://webservice.uts.umls.nlm.nih.gov/", className = "gov.nih.nlm.uts.webservice.finder.FindSourceDescriptorsResponse")
    public List<UiLabelRootSource> findSourceDescriptors(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket,
        @WebParam(name = "version", targetNamespace = "")
        String version,
        @WebParam(name = "target", targetNamespace = "")
        String target,
        @WebParam(name = "string", targetNamespace = "")
        String string,
        @WebParam(name = "searchType", targetNamespace = "")
        String searchType,
        @WebParam(name = "psf", targetNamespace = "")
        Psf psf)
        throws UtsFault_Exception
    ;

}
