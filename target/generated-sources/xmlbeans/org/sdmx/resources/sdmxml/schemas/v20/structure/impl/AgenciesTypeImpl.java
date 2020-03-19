/*
 * XML Type:  AgenciesType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.AgenciesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML AgenciesType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class AgenciesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.AgenciesType
{
    private static final long serialVersionUID = 1L;
    
    public AgenciesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Agency");
    
    
    /**
     * Gets array of all "Agency" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[] getAgencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType getAgencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().find_element_user(AGENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Agency" element
     */
    public int sizeOfAgencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCY$0);
        }
    }
    
    /**
     * Sets array of all "Agency" element
     */
    public void setAgencyArray(org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[] agencyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyArray, AGENCY$0);
        }
    }
    
    /**
     * Sets ith "Agency" element
     */
    public void setAgencyArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType agency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().find_element_user(AGENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agency);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType insertNewAgency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().insert_element_user(AGENCY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType addNewAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().add_element_user(AGENCY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Agency" element
     */
    public void removeAgency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCY$0, i);
        }
    }
}
