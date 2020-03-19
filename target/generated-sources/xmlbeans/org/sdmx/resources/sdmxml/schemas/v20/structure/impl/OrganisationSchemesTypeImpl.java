/*
 * XML Type:  OrganisationSchemesType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML OrganisationSchemesType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "OrganisationScheme");
    
    
    /**
     * Gets array of all "OrganisationScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType[] getOrganisationSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType getOrganisationSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType)get_store().find_element_user(ORGANISATIONSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationScheme" element
     */
    public int sizeOfOrganisationSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEME$0);
        }
    }
    
    /**
     * Sets array of all "OrganisationScheme" element
     */
    public void setOrganisationSchemeArray(org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType[] organisationSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeArray, ORGANISATIONSCHEME$0);
        }
    }
    
    /**
     * Sets ith "OrganisationScheme" element
     */
    public void setOrganisationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType organisationScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType)get_store().find_element_user(ORGANISATIONSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType insertNewOrganisationScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType)get_store().insert_element_user(ORGANISATIONSCHEME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType addNewOrganisationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeType)get_store().add_element_user(ORGANISATIONSCHEME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationScheme" element
     */
    public void removeOrganisationScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEME$0, i);
        }
    }
}
