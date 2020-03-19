/*
 * XML Type:  SubmitProvisioningRequestType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmitProvisioningRequestType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmitProvisioningRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitProvisioningRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreement");
    private static final javax.xml.namespace.QName DATAPROVIDERREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderRef");
    private static final javax.xml.namespace.QName DATAFLOWREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADATATAFLOWREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadatataflowRef");
    
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType[] getProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType getProvisionAgreementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().find_element_user(PROVISIONAGREEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    public int sizeOfProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENT$0);
        }
    }
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType[] provisionAgreementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$0);
        }
    }
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().find_element_user(PROVISIONAGREEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType insertNewProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().insert_element_user(PROVISIONAGREEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().add_element_user(PROVISIONAGREEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    public void removeProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENT$0, i);
        }
    }
    
    /**
     * Gets array of all "DataProviderRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] getDataProviderRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERREF$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataProviderRef" element
     */
    public int sizeOfDataProviderRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERREF$2);
        }
    }
    
    /**
     * Sets array of all "DataProviderRef" element
     */
    public void setDataProviderRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] dataProviderRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderRefArray, DATAPROVIDERREF$2);
        }
    }
    
    /**
     * Sets ith "DataProviderRef" element
     */
    public void setDataProviderRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType dataProviderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProviderRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType insertNewDataProviderRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().insert_element_user(DATAPROVIDERREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType addNewDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProviderRef" element
     */
    public void removeDataProviderRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERREF$2, i);
        }
    }
    
    /**
     * Gets array of all "DataflowRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] getDataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWREF$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataflowRef" element
     */
    public int sizeOfDataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWREF$4);
        }
    }
    
    /**
     * Sets array of all "DataflowRef" element
     */
    public void setDataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] dataflowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowRefArray, DATAFLOWREF$4);
        }
    }
    
    /**
     * Sets ith "DataflowRef" element
     */
    public void setDataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType insertNewDataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().insert_element_user(DATAFLOWREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataflowRef" element
     */
    public void removeDataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWREF$4, i);
        }
    }
    
    /**
     * Gets array of all "MetadatataflowRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] getMetadatataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATAFLOWREF$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadatataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadatataflowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATATAFLOWREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadatataflowRef" element
     */
    public int sizeOfMetadatataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATAFLOWREF$6);
        }
    }
    
    /**
     * Sets array of all "MetadatataflowRef" element
     */
    public void setMetadatataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] metadatataflowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadatataflowRefArray, METADATATAFLOWREF$6);
        }
    }
    
    /**
     * Sets ith "MetadatataflowRef" element
     */
    public void setMetadatataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadatataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATATAFLOWREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadatataflowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadatataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType insertNewMetadatataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().insert_element_user(METADATATAFLOWREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadatataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadatataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATATAFLOWREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadatataflowRef" element
     */
    public void removeMetadatataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATAFLOWREF$6, i);
        }
    }
}
