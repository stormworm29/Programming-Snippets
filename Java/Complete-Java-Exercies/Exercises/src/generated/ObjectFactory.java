//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.14 at 08:23:26 PM IST 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
	
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyList }
     * 
     */
    public CompanyList createCompanyList() {
        return new CompanyList();
    }

    /**
     * Create an instance of {@link CompanyList.Company }
     * 
     */
    public CompanyList.Company createCompanyListCompany() {
        return new CompanyList.Company();
    }

    /**
     * Create an instance of {@link CompanyList.Company.EmployeeList }
     * 
     */
    public CompanyList.Company.EmployeeList createCompanyListCompanyEmployeeList() {
        return new CompanyList.Company.EmployeeList();
    }

    /**
     * Create an instance of {@link CompanyList.Company.EmployeeList.Employee }
     * 
     */
    public CompanyList.Company.EmployeeList.Employee createCompanyListCompanyEmployeeListEmployee() {
        return new CompanyList.Company.EmployeeList.Employee();
    }

}