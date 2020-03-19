/*
 * XML Type:  SubmitRegistrationRequestType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmitRegistrationRequestType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmitRegistrationRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Registration");
    
    
    /**
     * Gets array of all "Registration" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType[] getRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRATION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType getRegistrationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType)get_store().find_element_user(REGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Registration" element
     */
    public int sizeOfRegistrationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATION$0);
        }
    }
    
    /**
     * Sets array of all "Registration" element
     */
    public void setRegistrationArray(org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType[] registrationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(registrationArray, REGISTRATION$0);
        }
    }
    
    /**
     * Sets ith "Registration" element
     */
    public void setRegistrationArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType registration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType)get_store().find_element_user(REGISTRATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(registration);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType insertNewRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType)get_store().insert_element_user(REGISTRATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType addNewRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationType)get_store().add_element_user(REGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Registration" element
     */
    public void removeRegistration(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATION$0, i);
        }
    }
}
