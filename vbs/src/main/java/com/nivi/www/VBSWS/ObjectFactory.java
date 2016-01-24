
package com.nivi.www.VBSWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nivi.www.VBSWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendVBSDetailsResponse_QNAME = new QName("http://www.nivi.com/VBSWS/", "sendVBSDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nivi.www.VBSWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Output }
     * 
     */
    public Output createOutput() {
        return new Output();
    }

    /**
     * Create an instance of {@link SendVBSDetails }
     * 
     */
    public SendVBSDetails createSendVBSDetails() {
        return new SendVBSDetails();
    }

    /**
     * Create an instance of {@link VbLoadType }
     * 
     */
    public VbLoadType createVbLoadType() {
        return new VbLoadType();
    }

    /**
     * Create an instance of {@link VbLoadListType }
     * 
     */
    public VbLoadListType createVbLoadListType() {
        return new VbLoadListType();
    }

    /**
     * Create an instance of {@link VbsDetailsType }
     * 
     */
    public VbsDetailsType createVbsDetailsType() {
        return new VbsDetailsType();
    }

    /**
     * Create an instance of {@link VbType }
     * 
     */
    public VbType createVbType() {
        return new VbType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Output }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nivi.com/VBSWS/", name = "sendVBSDetailsResponse")
    public JAXBElement<Output> createSendVBSDetailsResponse(Output value) {
        return new JAXBElement<Output>(_SendVBSDetailsResponse_QNAME, Output.class, null, value);
    }

}
