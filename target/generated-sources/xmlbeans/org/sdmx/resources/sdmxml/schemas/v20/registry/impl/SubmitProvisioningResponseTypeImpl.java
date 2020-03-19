/*
 * XML Type:  SubmitProvisioningResponseType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmitProvisioningResponseType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmitProvisioningResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitProvisioningResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONINGSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisioningStatus");
    
    
    /**
     * Gets array of all "ProvisioningStatus" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType[] getProvisioningStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONINGSTATUS$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisioningStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType getProvisioningStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType)get_store().find_element_user(PROVISIONINGSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProvisioningStatus" element
     */
    public int sizeOfProvisioningStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONINGSTATUS$0);
        }
    }
    
    /**
     * Sets array of all "ProvisioningStatus" element
     */
    public void setProvisioningStatusArray(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType[] provisioningStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisioningStatusArray, PROVISIONINGSTATUS$0);
        }
    }
    
    /**
     * Sets ith "ProvisioningStatus" element
     */
    public void setProvisioningStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType provisioningStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType)get_store().find_element_user(PROVISIONINGSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisioningStatus);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisioningStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType insertNewProvisioningStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType)get_store().insert_element_user(PROVISIONINGSTATUS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisioningStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType addNewProvisioningStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningStatusType)get_store().add_element_user(PROVISIONINGSTATUS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProvisioningStatus" element
     */
    public void removeProvisioningStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONINGSTATUS$0, i);
        }
    }
}
