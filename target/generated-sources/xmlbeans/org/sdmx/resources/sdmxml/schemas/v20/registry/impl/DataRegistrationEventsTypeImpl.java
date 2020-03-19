/*
 * XML Type:  DataRegistrationEventsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML DataRegistrationEventsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class DataRegistrationEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType
{
    private static final long serialVersionUID = 1L;
    
    public DataRegistrationEventsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLEVENTSID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "AllEventsID");
    private static final javax.xml.namespace.QName DATAPROVIDERID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderID");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreementID");
    private static final javax.xml.namespace.QName DATAFLOWID$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowID");
    private static final javax.xml.namespace.QName KEYFAMILYID$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "KeyFamilyID");
    private static final javax.xml.namespace.QName CATEGORYID$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategoryID");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEID$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategorySchemeID");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEAGENCYID$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategorySchemeAgencyID");
    
    
    /**
     * Gets array of all "AllEventsID" elements
     */
    public java.lang.String[] getAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALLEVENTSID$0, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLEVENTSID$0, i);
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
            get_store().find_all_element_users(ALLEVENTSID$0, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLEVENTSID$0, i);
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
            return get_store().count_elements(ALLEVENTSID$0);
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
            arraySetterHelper(allEventsIDArray, ALLEVENTSID$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLEVENTSID$0, i);
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
            arraySetterHelper(allEventsIDArray, ALLEVENTSID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLEVENTSID$0, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ALLEVENTSID$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLEVENTSID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ALLEVENTSID$0, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALLEVENTSID$0);
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
            get_store().remove_element(ALLEVENTSID$0, i);
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
     * Gets array of all "ProvisionAgreementID" elements
     */
    public java.lang.String[] getProvisionAgreementIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENTID$4, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVISIONAGREEMENTID$4, i);
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
    public org.apache.xmlbeans.XmlString[] xgetProvisionAgreementIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENTID$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ProvisionAgreementID" element
     */
    public org.apache.xmlbeans.XmlString xgetProvisionAgreementIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVISIONAGREEMENTID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
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
            return get_store().count_elements(PROVISIONAGREEMENTID$4);
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
            arraySetterHelper(provisionAgreementIDArray, PROVISIONAGREEMENTID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVISIONAGREEMENTID$4, i);
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
    public void xsetProvisionAgreementIDArray(org.apache.xmlbeans.XmlString[]provisionAgreementIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementIDArray, PROVISIONAGREEMENTID$4);
        }
    }
    
    /**
     * Sets (as xml) ith "ProvisionAgreementID" element
     */
    public void xsetProvisionAgreementIDArray(int i, org.apache.xmlbeans.XmlString provisionAgreementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVISIONAGREEMENTID$4, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROVISIONAGREEMENTID$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVISIONAGREEMENTID$4);
            target.setStringValue(provisionAgreementID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreementID" element
     */
    public org.apache.xmlbeans.XmlString insertNewProvisionAgreementID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROVISIONAGREEMENTID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreementID" element
     */
    public org.apache.xmlbeans.XmlString addNewProvisionAgreementID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVISIONAGREEMENTID$4);
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
            get_store().remove_element(PROVISIONAGREEMENTID$4, i);
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
            get_store().find_all_element_users(DATAFLOWID$6, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$6, i);
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
            get_store().find_all_element_users(DATAFLOWID$6, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWID$6, i);
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
            return get_store().count_elements(DATAFLOWID$6);
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
            arraySetterHelper(dataflowIDArray, DATAFLOWID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$6, i);
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
            arraySetterHelper(dataflowIDArray, DATAFLOWID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWID$6, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAFLOWID$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOWID$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATAFLOWID$6, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAFLOWID$6);
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
            get_store().remove_element(DATAFLOWID$6, i);
        }
    }
    
    /**
     * Gets array of all "KeyFamilyID" elements
     */
    public java.lang.String[] getKeyFamilyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYID$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamilyID" element
     */
    public java.lang.String getKeyFamilyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "KeyFamilyID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKeyFamilyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYID$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "KeyFamilyID" element
     */
    public org.apache.xmlbeans.XmlString xgetKeyFamilyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILYID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "KeyFamilyID" element
     */
    public int sizeOfKeyFamilyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYID$8);
        }
    }
    
    /**
     * Sets array of all "KeyFamilyID" element
     */
    public void setKeyFamilyIDArray(java.lang.String[] keyFamilyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyIDArray, KEYFAMILYID$8);
        }
    }
    
    /**
     * Sets ith "KeyFamilyID" element
     */
    public void setKeyFamilyIDArray(int i, java.lang.String keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(keyFamilyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "KeyFamilyID" element
     */
    public void xsetKeyFamilyIDArray(org.apache.xmlbeans.XmlString[]keyFamilyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyIDArray, KEYFAMILYID$8);
        }
    }
    
    /**
     * Sets (as xml) ith "KeyFamilyID" element
     */
    public void xsetKeyFamilyIDArray(int i, org.apache.xmlbeans.XmlString keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILYID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamilyID);
        }
    }
    
    /**
     * Inserts the value as the ith "KeyFamilyID" element
     */
    public void insertKeyFamilyID(int i, java.lang.String keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYFAMILYID$8, i);
            target.setStringValue(keyFamilyID);
        }
    }
    
    /**
     * Appends the value as the last "KeyFamilyID" element
     */
    public void addKeyFamilyID(java.lang.String keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILYID$8);
            target.setStringValue(keyFamilyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamilyID" element
     */
    public org.apache.xmlbeans.XmlString insertNewKeyFamilyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYFAMILYID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyID" element
     */
    public org.apache.xmlbeans.XmlString addNewKeyFamilyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYFAMILYID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamilyID" element
     */
    public void removeKeyFamilyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYID$8, i);
        }
    }
    
    /**
     * Gets array of all "CategoryID" elements
     */
    public java.lang.String[] getCategoryIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYID$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryID" element
     */
    public java.lang.String getCategoryIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CategoryID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCategoryIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYID$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CategoryID" element
     */
    public org.apache.xmlbeans.XmlString xgetCategoryIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "CategoryID" element
     */
    public int sizeOfCategoryIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYID$10);
        }
    }
    
    /**
     * Sets array of all "CategoryID" element
     */
    public void setCategoryIDArray(java.lang.String[] categoryIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryIDArray, CATEGORYID$10);
        }
    }
    
    /**
     * Sets ith "CategoryID" element
     */
    public void setCategoryIDArray(int i, java.lang.String categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(categoryID);
        }
    }
    
    /**
     * Sets (as xml) array of all "CategoryID" element
     */
    public void xsetCategoryIDArray(org.apache.xmlbeans.XmlString[]categoryIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryIDArray, CATEGORYID$10);
        }
    }
    
    /**
     * Sets (as xml) ith "CategoryID" element
     */
    public void xsetCategoryIDArray(int i, org.apache.xmlbeans.XmlString categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryID);
        }
    }
    
    /**
     * Inserts the value as the ith "CategoryID" element
     */
    public void insertCategoryID(int i, java.lang.String categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORYID$10, i);
            target.setStringValue(categoryID);
        }
    }
    
    /**
     * Appends the value as the last "CategoryID" element
     */
    public void addCategoryID(java.lang.String categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$10);
            target.setStringValue(categoryID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryID" element
     */
    public org.apache.xmlbeans.XmlString insertNewCategoryID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CATEGORYID$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryID" element
     */
    public org.apache.xmlbeans.XmlString addNewCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYID$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategoryID" element
     */
    public void removeCategoryID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYID$10, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeID" elements
     */
    public java.lang.String[] getCategorySchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEID$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeID" element
     */
    public java.lang.String getCategorySchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CategorySchemeID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCategorySchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEID$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CategorySchemeID" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorySchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "CategorySchemeID" element
     */
    public int sizeOfCategorySchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEID$12);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeID" element
     */
    public void setCategorySchemeIDArray(java.lang.String[] categorySchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeIDArray, CATEGORYSCHEMEID$12);
        }
    }
    
    /**
     * Sets ith "CategorySchemeID" element
     */
    public void setCategorySchemeIDArray(int i, java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Sets (as xml) array of all "CategorySchemeID" element
     */
    public void xsetCategorySchemeIDArray(org.apache.xmlbeans.XmlString[]categorySchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeIDArray, CATEGORYSCHEMEID$12);
        }
    }
    
    /**
     * Sets (as xml) ith "CategorySchemeID" element
     */
    public void xsetCategorySchemeIDArray(int i, org.apache.xmlbeans.XmlString categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorySchemeID);
        }
    }
    
    /**
     * Inserts the value as the ith "CategorySchemeID" element
     */
    public void insertCategorySchemeID(int i, java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORYSCHEMEID$12, i);
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Appends the value as the last "CategorySchemeID" element
     */
    public void addCategorySchemeID(java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYSCHEMEID$12);
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeID" element
     */
    public org.apache.xmlbeans.XmlString insertNewCategorySchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CATEGORYSCHEMEID$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeID" element
     */
    public org.apache.xmlbeans.XmlString addNewCategorySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYSCHEMEID$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorySchemeID" element
     */
    public void removeCategorySchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEID$12, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeAgencyID" elements
     */
    public java.lang.String[] getCategorySchemeAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEAGENCYID$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeAgencyID" element
     */
    public java.lang.String getCategorySchemeAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CategorySchemeAgencyID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCategorySchemeAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEAGENCYID$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CategorySchemeAgencyID" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorySchemeAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "CategorySchemeAgencyID" element
     */
    public int sizeOfCategorySchemeAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEAGENCYID$14);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeAgencyID" element
     */
    public void setCategorySchemeAgencyIDArray(java.lang.String[] categorySchemeAgencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeAgencyIDArray, CATEGORYSCHEMEAGENCYID$14);
        }
    }
    
    /**
     * Sets ith "CategorySchemeAgencyID" element
     */
    public void setCategorySchemeAgencyIDArray(int i, java.lang.String categorySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(categorySchemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "CategorySchemeAgencyID" element
     */
    public void xsetCategorySchemeAgencyIDArray(org.apache.xmlbeans.XmlString[]categorySchemeAgencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeAgencyIDArray, CATEGORYSCHEMEAGENCYID$14);
        }
    }
    
    /**
     * Sets (as xml) ith "CategorySchemeAgencyID" element
     */
    public void xsetCategorySchemeAgencyIDArray(int i, org.apache.xmlbeans.XmlString categorySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorySchemeAgencyID);
        }
    }
    
    /**
     * Inserts the value as the ith "CategorySchemeAgencyID" element
     */
    public void insertCategorySchemeAgencyID(int i, java.lang.String categorySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORYSCHEMEAGENCYID$14, i);
            target.setStringValue(categorySchemeAgencyID);
        }
    }
    
    /**
     * Appends the value as the last "CategorySchemeAgencyID" element
     */
    public void addCategorySchemeAgencyID(java.lang.String categorySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYSCHEMEAGENCYID$14);
            target.setStringValue(categorySchemeAgencyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeAgencyID" element
     */
    public org.apache.xmlbeans.XmlString insertNewCategorySchemeAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CATEGORYSCHEMEAGENCYID$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeAgencyID" element
     */
    public org.apache.xmlbeans.XmlString addNewCategorySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYSCHEMEAGENCYID$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorySchemeAgencyID" element
     */
    public void removeCategorySchemeAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEAGENCYID$14, i);
        }
    }
}
