
package clientsga.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientsga.ws package. 
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

    private final static QName _AddPerson_QNAME = new QName("http://service.sga.dss.com.ar/", "addPerson");
    private final static QName _UpdatePerson_QNAME = new QName("http://service.sga.dss.com.ar/", "updatePerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://service.sga.dss.com.ar/", "updatePersonResponse");
    private final static QName _AddPersonResponse_QNAME = new QName("http://service.sga.dss.com.ar/", "addPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://service.sga.dss.com.ar/", "deletePerson");
    private final static QName _ListPeople_QNAME = new QName("http://service.sga.dss.com.ar/", "listPeople");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://service.sga.dss.com.ar/", "deletePersonResponse");
    private final static QName _ListPeopleResponse_QNAME = new QName("http://service.sga.dss.com.ar/", "listPeopleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientsga.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ListPeopleResponse }
     * 
     */
    public ListPeopleResponse createListPeopleResponse() {
        return new ListPeopleResponse();
    }

    /**
     * Create an instance of {@link ListPeople }
     * 
     */
    public ListPeople createListPeople() {
        return new ListPeople();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "listPeople")
    public JAXBElement<ListPeople> createListPeople(ListPeople value) {
        return new JAXBElement<ListPeople>(_ListPeople_QNAME, ListPeople.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.sga.dss.com.ar/", name = "listPeopleResponse")
    public JAXBElement<ListPeopleResponse> createListPeopleResponse(ListPeopleResponse value) {
        return new JAXBElement<ListPeopleResponse>(_ListPeopleResponse_QNAME, ListPeopleResponse.class, null, value);
    }

}
