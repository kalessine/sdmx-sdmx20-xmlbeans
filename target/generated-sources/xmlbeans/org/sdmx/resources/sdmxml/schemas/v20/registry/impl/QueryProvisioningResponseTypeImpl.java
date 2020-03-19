/*
 * XML Type:  QueryProvisioningResponseType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML QueryProvisioningResponseType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class QueryProvisioningResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType
{
    private static final long serialVersionUID = 1L;
    
    public QueryProvisioningResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreement");
    private static final javax.xml.namespace.QName DATAFLOWREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADATAFLOWREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowRef");
    private static final javax.xml.namespace.QName DATAPROVIDERREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderRef");
    private static final javax.xml.namespace.QName STATUSMESSAGE$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StatusMessage");
    
    
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
     * Gets array of all "DataflowRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] getDataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWREF$2, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$2, i);
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
            return get_store().count_elements(DATAFLOWREF$2);
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
            arraySetterHelper(dataflowRefArray, DATAFLOWREF$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$2, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().insert_element_user(DATAFLOWREF$2, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$2);
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
            get_store().remove_element(DATAFLOWREF$2, i);
        }
    }
    
    /**
     * Gets array of all "MetadataflowRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] getMetadataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWREF$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadataflowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataflowRef" element
     */
    public int sizeOfMetadataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWREF$4);
        }
    }
    
    /**
     * Sets array of all "MetadataflowRef" element
     */
    public void setMetadataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] metadataflowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowRefArray, METADATAFLOWREF$4);
        }
    }
    
    /**
     * Sets ith "MetadataflowRef" element
     */
    public void setMetadataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType insertNewMetadataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().insert_element_user(METADATAFLOWREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataflowRef" element
     */
    public void removeMetadataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWREF$4, i);
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
            get_store().find_all_element_users(DATAPROVIDERREF$6, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$6, i);
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
            return get_store().count_elements(DATAPROVIDERREF$6);
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
            arraySetterHelper(dataProviderRefArray, DATAPROVIDERREF$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().insert_element_user(DATAPROVIDERREF$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$6);
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
            get_store().remove_element(DATAPROVIDERREF$6, i);
        }
    }
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$8);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType addNewStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$8);
            return target;
        }
    }
}
