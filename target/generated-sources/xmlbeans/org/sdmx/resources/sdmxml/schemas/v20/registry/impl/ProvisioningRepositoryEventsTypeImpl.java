/*
 * XML Type:  ProvisioningRepositoryEventsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML ProvisioningRepositoryEventsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class ProvisioningRepositoryEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType
{
    private static final long serialVersionUID = 1L;
    
    public ProvisioningRepositoryEventsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreementID");
    private static final javax.xml.namespace.QName DATAPROVIDERID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderID");
    private static final javax.xml.namespace.QName DATAFLOWID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowID");
    private static final javax.xml.namespace.QName METADATAFLOWID$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowID");
    private static final javax.xml.namespace.QName ALLEVENTSID$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "AllEventsID");
    
    
    /**
     * Gets array of all "ProvisionAgreementID" elements
     */
    public java.lang.String[] getProvisionAgreementIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENTID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisionAgreementID" element
     */
    public java.lang.String getProvisionAgreementIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVISIONAGREEMENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ProvisionAgreementID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetProvisionAgreementIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENTID$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.IDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ProvisionAgreementID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetProvisionAgreementIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(PROVISIONAGREEMENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)target;
        }
    }
    
    /**
     * Returns number of "ProvisionAgreementID" element
     */
    public int sizeOfProvisionAgreementIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENTID$0);
        }
    }
    
    /**
     * Sets array of all "ProvisionAgreementID" element
     */
    public void setProvisionAgreementIDArray(java.lang.String[] provisionAgreementIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementIDArray, PROVISIONAGREEMENTID$0);
        }
    }
    
    /**
     * Sets ith "ProvisionAgreementID" element
     */
    public void setProvisionAgreementIDArray(int i, java.lang.String provisionAgreementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVISIONAGREEMENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(provisionAgreementID);
        }
    }
    
    /**
     * Sets (as xml) array of all "ProvisionAgreementID" element
     */
    public void xsetProvisionAgreementIDArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[]provisionAgreementIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementIDArray, PROVISIONAGREEMENTID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "ProvisionAgreementID" element
     */
    public void xsetProvisionAgreementIDArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType provisionAgreementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(PROVISIONAGREEMENTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisionAgreementID);
        }
    }
    
    /**
     * Inserts the value as the ith "ProvisionAgreementID" element
     */
    public void insertProvisionAgreementID(int i, java.lang.String provisionAgreementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROVISIONAGREEMENTID$0, i);
            target.setStringValue(provisionAgreementID);
        }
    }
    
    /**
     * Appends the value as the last "ProvisionAgreementID" element
     */
    public void addProvisionAgreementID(java.lang.String provisionAgreementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVISIONAGREEMENTID$0);
            target.setStringValue(provisionAgreementID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreementID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewProvisionAgreementID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().insert_element_user(PROVISIONAGREEMENTID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreementID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewProvisionAgreementID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(PROVISIONAGREEMENTID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProvisionAgreementID" element
     */
    public void removeProvisionAgreementID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENTID$0, i);
        }
    }
    
    /**
     * Gets array of all "DataProviderID" elements
     */
    public java.lang.String[] getDataProviderIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERID$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DataProviderID" element
     */
    public java.lang.String getDataProviderIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DataProviderID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDataProviderIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERID$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DataProviderID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataProviderIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "DataProviderID" element
     */
    public int sizeOfDataProviderIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERID$2);
        }
    }
    
    /**
     * Sets array of all "DataProviderID" element
     */
    public void setDataProviderIDArray(java.lang.String[] dataProviderIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderIDArray, DATAPROVIDERID$2);
        }
    }
    
    /**
     * Sets ith "DataProviderID" element
     */
    public void setDataProviderIDArray(int i, java.lang.String dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataProviderID);
        }
    }
    
    /**
     * Sets (as xml) array of all "DataProviderID" element
     */
    public void xsetDataProviderIDArray(org.apache.xmlbeans.XmlString[]dataProviderIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderIDArray, DATAPROVIDERID$2);
        }
    }
    
    /**
     * Sets (as xml) ith "DataProviderID" element
     */
    public void xsetDataProviderIDArray(int i, org.apache.xmlbeans.XmlString dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProviderID);
        }
    }
    
    /**
     * Inserts the value as the ith "DataProviderID" element
     */
    public void insertDataProviderID(int i, java.lang.String dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAPROVIDERID$2, i);
            target.setStringValue(dataProviderID);
        }
    }
    
    /**
     * Appends the value as the last "DataProviderID" element
     */
    public void addDataProviderID(java.lang.String dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROVIDERID$2);
            target.setStringValue(dataProviderID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderID" element
     */
    public org.apache.xmlbeans.XmlString insertNewDataProviderID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATAPROVIDERID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderID" element
     */
    public org.apache.xmlbeans.XmlString addNewDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROVIDERID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProviderID" element
     */
    public void removeDataProviderID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERID$2, i);
        }
    }
    
    /**
     * Gets array of all "DataflowID" elements
     */
    public java.lang.String[] getDataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWID$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DataflowID" element
     */
    public java.lang.String getDataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DataflowID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWID$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DataflowID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "DataflowID" element
     */
    public int sizeOfDataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWID$4);
        }
    }
    
    /**
     * Sets array of all "DataflowID" element
     */
    public void setDataflowIDArray(java.lang.String[] dataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowIDArray, DATAFLOWID$4);
        }
    }
    
    /**
     * Sets ith "DataflowID" element
     */
    public void setDataflowIDArray(int i, java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Sets (as xml) array of all "DataflowID" element
     */
    public void xsetDataflowIDArray(org.apache.xmlbeans.XmlString[]dataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowIDArray, DATAFLOWID$4);
        }
    }
    
    /**
     * Sets (as xml) ith "DataflowID" element
     */
    public void xsetDataflowIDArray(int i, org.apache.xmlbeans.XmlString dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflowID);
        }
    }
    
    /**
     * Inserts the value as the ith "DataflowID" element
     */
    public void insertDataflowID(int i, java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAFLOWID$4, i);
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Appends the value as the last "DataflowID" element
     */
    public void addDataflowID(java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOWID$4);
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowID" element
     */
    public org.apache.xmlbeans.XmlString insertNewDataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATAFLOWID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowID" element
     */
    public org.apache.xmlbeans.XmlString addNewDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAFLOWID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataflowID" element
     */
    public void removeDataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWID$4, i);
        }
    }
    
    /**
     * Gets array of all "MetadataflowID" elements
     */
    public java.lang.String[] getMetadataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWID$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataflowID" element
     */
    public java.lang.String getMetadataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOWID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MetadataflowID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWID$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MetadataflowID" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOWID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MetadataflowID" element
     */
    public int sizeOfMetadataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWID$6);
        }
    }
    
    /**
     * Sets array of all "MetadataflowID" element
     */
    public void setMetadataflowIDArray(java.lang.String[] metadataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowIDArray, METADATAFLOWID$6);
        }
    }
    
    /**
     * Sets ith "MetadataflowID" element
     */
    public void setMetadataflowIDArray(int i, java.lang.String metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOWID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataflowID);
        }
    }
    
    /**
     * Sets (as xml) array of all "MetadataflowID" element
     */
    public void xsetMetadataflowIDArray(org.apache.xmlbeans.XmlString[]metadataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowIDArray, METADATAFLOWID$6);
        }
    }
    
    /**
     * Sets (as xml) ith "MetadataflowID" element
     */
    public void xsetMetadataflowIDArray(int i, org.apache.xmlbeans.XmlString metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOWID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflowID);
        }
    }
    
    /**
     * Inserts the value as the ith "MetadataflowID" element
     */
    public void insertMetadataflowID(int i, java.lang.String metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATAFLOWID$6, i);
            target.setStringValue(metadataflowID);
        }
    }
    
    /**
     * Appends the value as the last "MetadataflowID" element
     */
    public void addMetadataflowID(java.lang.String metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAFLOWID$6);
            target.setStringValue(metadataflowID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowID" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATAFLOWID$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowID" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATAFLOWID$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataflowID" element
     */
    public void removeMetadataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWID$6, i);
        }
    }
    
    /**
     * Gets array of all "AllEventsID" elements
     */
    public java.lang.String[] getAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALLEVENTSID$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AllEventsID" element
     */
    public java.lang.String getAllEventsIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLEVENTSID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AllEventsID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALLEVENTSID$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AllEventsID" element
     */
    public org.apache.xmlbeans.XmlString xgetAllEventsIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLEVENTSID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "AllEventsID" element
     */
    public int sizeOfAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLEVENTSID$8);
        }
    }
    
    /**
     * Sets array of all "AllEventsID" element
     */
    public void setAllEventsIDArray(java.lang.String[] allEventsIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(allEventsIDArray, ALLEVENTSID$8);
        }
    }
    
    /**
     * Sets ith "AllEventsID" element
     */
    public void setAllEventsIDArray(int i, java.lang.String allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLEVENTSID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(allEventsID);
        }
    }
    
    /**
     * Sets (as xml) array of all "AllEventsID" element
     */
    public void xsetAllEventsIDArray(org.apache.xmlbeans.XmlString[]allEventsIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(allEventsIDArray, ALLEVENTSID$8);
        }
    }
    
    /**
     * Sets (as xml) ith "AllEventsID" element
     */
    public void xsetAllEventsIDArray(int i, org.apache.xmlbeans.XmlString allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLEVENTSID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(allEventsID);
        }
    }
    
    /**
     * Inserts the value as the ith "AllEventsID" element
     */
    public void insertAllEventsID(int i, java.lang.String allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ALLEVENTSID$8, i);
            target.setStringValue(allEventsID);
        }
    }
    
    /**
     * Appends the value as the last "AllEventsID" element
     */
    public void addAllEventsID(java.lang.String allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLEVENTSID$8);
            target.setStringValue(allEventsID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AllEventsID" element
     */
    public org.apache.xmlbeans.XmlString insertNewAllEventsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ALLEVENTSID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AllEventsID" element
     */
    public org.apache.xmlbeans.XmlString addNewAllEventsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALLEVENTSID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "AllEventsID" element
     */
    public void removeAllEventsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLEVENTSID$8, i);
        }
    }
}
