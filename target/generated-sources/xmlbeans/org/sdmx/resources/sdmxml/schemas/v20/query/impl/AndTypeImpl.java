/*
 * XML Type:  AndType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.AndType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML AndType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public class AndTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.query.AndType
{
    private static final long serialVersionUID = 1L;
    
    public AndTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "DataSet");
    private static final javax.xml.namespace.QName METADATASET$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataSet");
    private static final javax.xml.namespace.QName KEYFAMILY$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "KeyFamily");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataStructure");
    private static final javax.xml.namespace.QName DIMENSION$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Dimension");
    private static final javax.xml.namespace.QName STRUCTURECOMPONENT$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StructureComponent");
    private static final javax.xml.namespace.QName ATTRIBUTE$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Attribute");
    private static final javax.xml.namespace.QName CODELIST$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Codelist");
    private static final javax.xml.namespace.QName TIME$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Time");
    private static final javax.xml.namespace.QName CATEGORY$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Category");
    private static final javax.xml.namespace.QName CONCEPT$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Concept");
    private static final javax.xml.namespace.QName AGENCYID$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "AgencyID");
    private static final javax.xml.namespace.QName DATAPROVIDER$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "DataProvider");
    private static final javax.xml.namespace.QName DATAFLOW$26 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Dataflow");
    private static final javax.xml.namespace.QName METADATAFLOW$28 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Metadataflow");
    private static final javax.xml.namespace.QName VERSION$30 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Version");
    private static final javax.xml.namespace.QName OR$32 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Or");
    private static final javax.xml.namespace.QName AND$34 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "And");
    
    
    /**
     * Gets array of all "DataSet" elements
     */
    public java.lang.String[] getDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public java.lang.String getDataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DataSet" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DataSet" element
     */
    public org.apache.xmlbeans.XmlString xgetDataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "DataSet" element
     */
    public int sizeOfDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASET$0);
        }
    }
    
    /**
     * Sets array of all "DataSet" element
     */
    public void setDataSetArray(java.lang.String[] dataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetArray, DATASET$0);
        }
    }
    
    /**
     * Sets ith "DataSet" element
     */
    public void setDataSetArray(int i, java.lang.String dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataSet);
        }
    }
    
    /**
     * Sets (as xml) array of all "DataSet" element
     */
    public void xsetDataSetArray(org.apache.xmlbeans.XmlString[]dataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetArray, DATASET$0);
        }
    }
    
    /**
     * Sets (as xml) ith "DataSet" element
     */
    public void xsetDataSetArray(int i, org.apache.xmlbeans.XmlString dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSet);
        }
    }
    
    /**
     * Inserts the value as the ith "DataSet" element
     */
    public void insertDataSet(int i, java.lang.String dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATASET$0, i);
            target.setStringValue(dataSet);
        }
    }
    
    /**
     * Appends the value as the last "DataSet" element
     */
    public void addDataSet(java.lang.String dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASET$0);
            target.setStringValue(dataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    public org.apache.xmlbeans.XmlString insertNewDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATASET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.apache.xmlbeans.XmlString addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATASET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSet" element
     */
    public void removeDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASET$0, i);
        }
    }
    
    /**
     * Gets array of all "MetadataSet" elements
     */
    public java.lang.String[] getMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataSet" element
     */
    public java.lang.String getMetadataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MetadataSet" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MetadataSet" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MetadataSet" element
     */
    public int sizeOfMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASET$2);
        }
    }
    
    /**
     * Sets array of all "MetadataSet" element
     */
    public void setMetadataSetArray(java.lang.String[] metadataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSetArray, METADATASET$2);
        }
    }
    
    /**
     * Sets ith "MetadataSet" element
     */
    public void setMetadataSetArray(int i, java.lang.String metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataSet);
        }
    }
    
    /**
     * Sets (as xml) array of all "MetadataSet" element
     */
    public void xsetMetadataSetArray(org.apache.xmlbeans.XmlString[]metadataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSetArray, METADATASET$2);
        }
    }
    
    /**
     * Sets (as xml) ith "MetadataSet" element
     */
    public void xsetMetadataSetArray(int i, org.apache.xmlbeans.XmlString metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Inserts the value as the ith "MetadataSet" element
     */
    public void insertMetadataSet(int i, java.lang.String metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATASET$2, i);
            target.setStringValue(metadataSet);
        }
    }
    
    /**
     * Appends the value as the last "MetadataSet" element
     */
    public void addMetadataSet(java.lang.String metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASET$2);
            target.setStringValue(metadataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATASET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATASET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataSet" element
     */
    public void removeMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASET$2, i);
        }
    }
    
    /**
     * Gets array of all "KeyFamily" elements
     */
    public java.lang.String[] getKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILY$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamily" element
     */
    public java.lang.String getKeyFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "KeyFamily" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILY$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString xgetKeyFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "KeyFamily" element
     */
    public int sizeOfKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILY$4);
        }
    }
    
    /**
     * Sets array of all "KeyFamily" element
     */
    public void setKeyFamilyArray(java.lang.String[] keyFamilyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyArray, KEYFAMILY$4);
        }
    }
    
    /**
     * Sets ith "KeyFamily" element
     */
    public void setKeyFamilyArray(int i, java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Sets (as xml) array of all "KeyFamily" element
     */
    public void xsetKeyFamilyArray(org.apache.xmlbeans.XmlString[]keyFamilyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyArray, KEYFAMILY$4);
        }
    }
    
    /**
     * Sets (as xml) ith "KeyFamily" element
     */
    public void xsetKeyFamilyArray(int i, org.apache.xmlbeans.XmlString keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamily);
        }
    }
    
    /**
     * Inserts the value as the ith "KeyFamily" element
     */
    public void insertKeyFamily(int i, java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYFAMILY$4, i);
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Appends the value as the last "KeyFamily" element
     */
    public void addKeyFamily(java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILY$4);
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString insertNewKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYFAMILY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString addNewKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYFAMILY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamily" element
     */
    public void removeKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILY$4, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    public java.lang.String[] getMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructure" element
     */
    public java.lang.String getMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTURE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MetadataStructure" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTURE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MetadataStructure" element
     */
    public int sizeOfMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$6);
        }
    }
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    public void setMetadataStructureArray(java.lang.String[] metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$6);
        }
    }
    
    /**
     * Sets ith "MetadataStructure" element
     */
    public void setMetadataStructureArray(int i, java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTURE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Sets (as xml) array of all "MetadataStructure" element
     */
    public void xsetMetadataStructureArray(org.apache.xmlbeans.XmlString[]metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "MetadataStructure" element
     */
    public void xsetMetadataStructureArray(int i, org.apache.xmlbeans.XmlString metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTURE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Inserts the value as the ith "MetadataStructure" element
     */
    public void insertMetadataStructure(int i, java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATASTRUCTURE$6, i);
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Appends the value as the last "MetadataStructure" element
     */
    public void addMetadataStructure(java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASTRUCTURE$6);
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATASTRUCTURE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATASTRUCTURE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    public void removeMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$6, i);
        }
    }
    
    /**
     * Gets array of all "Dimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().find_element_user(DIMENSION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$8);
        }
    }
    
    /**
     * Sets array of all "Dimension" element
     */
    public void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType[] dimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionArray, DIMENSION$8);
        }
    }
    
    /**
     * Sets ith "Dimension" element
     */
    public void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().find_element_user(DIMENSION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().insert_element_user(DIMENSION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().add_element_user(DIMENSION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$8, i);
        }
    }
    
    /**
     * Gets array of all "StructureComponent" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType[] getStructureComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURECOMPONENT$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructureComponent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType getStructureComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().find_element_user(STRUCTURECOMPONENT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructureComponent" element
     */
    public int sizeOfStructureComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURECOMPONENT$10);
        }
    }
    
    /**
     * Sets array of all "StructureComponent" element
     */
    public void setStructureComponentArray(org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType[] structureComponentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureComponentArray, STRUCTURECOMPONENT$10);
        }
    }
    
    /**
     * Sets ith "StructureComponent" element
     */
    public void setStructureComponentArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType structureComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().find_element_user(STRUCTURECOMPONENT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureComponent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureComponent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType insertNewStructureComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().insert_element_user(STRUCTURECOMPONENT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureComponent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType addNewStructureComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().add_element_user(STRUCTURECOMPONENT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureComponent" element
     */
    public void removeStructureComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURECOMPONENT$10, i);
        }
    }
    
    /**
     * Gets array of all "Attribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().find_element_user(ATTRIBUTE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$12);
        }
    }
    
    /**
     * Sets array of all "Attribute" element
     */
    public void setAttributeArray(org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$12);
        }
    }
    
    /**
     * Sets ith "Attribute" element
     */
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().find_element_user(ATTRIBUTE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().insert_element_user(ATTRIBUTE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().add_element_user(ATTRIBUTE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$12, i);
        }
    }
    
    /**
     * Gets array of all "Codelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[] getCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELIST$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType getCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Codelist" element
     */
    public int sizeOfCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$14);
        }
    }
    
    /**
     * Sets array of all "Codelist" element
     */
    public void setCodelistArray(org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[] codelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistArray, CODELIST$14);
        }
    }
    
    /**
     * Sets ith "Codelist" element
     */
    public void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType insertNewCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().insert_element_user(CODELIST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType addNewCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().add_element_user(CODELIST$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Codelist" element
     */
    public void removeCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$14, i);
        }
    }
    
    /**
     * Gets array of all "Time" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.TimeType[] getTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIME$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.TimeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Time" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.TimeType getTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().find_element_user(TIME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Time" element
     */
    public int sizeOfTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$16);
        }
    }
    
    /**
     * Sets array of all "Time" element
     */
    public void setTimeArray(org.sdmx.resources.sdmxml.schemas.v20.query.TimeType[] timeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeArray, TIME$16);
        }
    }
    
    /**
     * Sets ith "Time" element
     */
    public void setTimeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.TimeType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().find_element_user(TIME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(time);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Time" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.TimeType insertNewTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().insert_element_user(TIME$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Time" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.TimeType addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().add_element_user(TIME$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Time" element
     */
    public void removeTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$16, i);
        }
    }
    
    /**
     * Gets array of all "Category" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$18);
        }
    }
    
    /**
     * Sets array of all "Category" element
     */
    public void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$18);
        }
    }
    
    /**
     * Sets ith "Category" element
     */
    public void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().insert_element_user(CATEGORY$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().add_element_user(CATEGORY$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$18, i);
        }
    }
    
    /**
     * Gets array of all "Concept" elements
     */
    public java.lang.String[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Concept" element
     */
    public java.lang.String getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Concept" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$20, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Concept" element
     */
    public org.apache.xmlbeans.XmlString xgetConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$20);
        }
    }
    
    /**
     * Sets array of all "Concept" element
     */
    public void setConceptArray(java.lang.String[] conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$20);
        }
    }
    
    /**
     * Sets ith "Concept" element
     */
    public void setConceptArray(int i, java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(concept);
        }
    }
    
    /**
     * Sets (as xml) array of all "Concept" element
     */
    public void xsetConceptArray(org.apache.xmlbeans.XmlString[]conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$20);
        }
    }
    
    /**
     * Sets (as xml) ith "Concept" element
     */
    public void xsetConceptArray(int i, org.apache.xmlbeans.XmlString concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts the value as the ith "Concept" element
     */
    public void insertConcept(int i, java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONCEPT$20, i);
            target.setStringValue(concept);
        }
    }
    
    /**
     * Appends the value as the last "Concept" element
     */
    public void addConcept(java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPT$20);
            target.setStringValue(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    public org.apache.xmlbeans.XmlString insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONCEPT$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    public org.apache.xmlbeans.XmlString addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPT$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "Concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$20, i);
        }
    }
    
    /**
     * Gets array of all "AgencyID" elements
     */
    public java.lang.String[] getAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyID" element
     */
    public java.lang.String getAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AgencyID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString xgetAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENCYID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "AgencyID" element
     */
    public int sizeOfAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYID$22);
        }
    }
    
    /**
     * Sets array of all "AgencyID" element
     */
    public void setAgencyIDArray(java.lang.String[] agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$22);
        }
    }
    
    /**
     * Sets ith "AgencyID" element
     */
    public void setAgencyIDArray(int i, java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "AgencyID" element
     */
    public void xsetAgencyIDArray(org.apache.xmlbeans.XmlString[]agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$22);
        }
    }
    
    /**
     * Sets (as xml) ith "AgencyID" element
     */
    public void xsetAgencyIDArray(int i, org.apache.xmlbeans.XmlString agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENCYID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Inserts the value as the ith "AgencyID" element
     */
    public void insertAgencyID(int i, java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AGENCYID$22, i);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Appends the value as the last "AgencyID" element
     */
    public void addAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCYID$22);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString insertNewAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(AGENCYID$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString addNewAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGENCYID$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "AgencyID" element
     */
    public void removeAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYID$22, i);
        }
    }
    
    /**
     * Gets array of all "DataProvider" elements
     */
    public java.lang.String[] getDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDER$24, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DataProvider" element
     */
    public java.lang.String getDataProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDER$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DataProvider" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDER$24, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DataProvider" element
     */
    public org.apache.xmlbeans.XmlString xgetDataProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDER$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "DataProvider" element
     */
    public int sizeOfDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$24);
        }
    }
    
    /**
     * Sets array of all "DataProvider" element
     */
    public void setDataProviderArray(java.lang.String[] dataProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderArray, DATAPROVIDER$24);
        }
    }
    
    /**
     * Sets ith "DataProvider" element
     */
    public void setDataProviderArray(int i, java.lang.String dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDER$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataProvider);
        }
    }
    
    /**
     * Sets (as xml) array of all "DataProvider" element
     */
    public void xsetDataProviderArray(org.apache.xmlbeans.XmlString[]dataProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderArray, DATAPROVIDER$24);
        }
    }
    
    /**
     * Sets (as xml) ith "DataProvider" element
     */
    public void xsetDataProviderArray(int i, org.apache.xmlbeans.XmlString dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDER$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Inserts the value as the ith "DataProvider" element
     */
    public void insertDataProvider(int i, java.lang.String dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAPROVIDER$24, i);
            target.setStringValue(dataProvider);
        }
    }
    
    /**
     * Appends the value as the last "DataProvider" element
     */
    public void addDataProvider(java.lang.String dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROVIDER$24);
            target.setStringValue(dataProvider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    public org.apache.xmlbeans.XmlString insertNewDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATAPROVIDER$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    public org.apache.xmlbeans.XmlString addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROVIDER$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProvider" element
     */
    public void removeDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$24, i);
        }
    }
    
    /**
     * Gets array of all "Dataflow" elements
     */
    public java.lang.String[] getDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOW$26, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Dataflow" element
     */
    public java.lang.String getDataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOW$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Dataflow" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOW$26, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Dataflow" element
     */
    public org.apache.xmlbeans.XmlString xgetDataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOW$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Dataflow" element
     */
    public int sizeOfDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOW$26);
        }
    }
    
    /**
     * Sets array of all "Dataflow" element
     */
    public void setDataflowArray(java.lang.String[] dataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowArray, DATAFLOW$26);
        }
    }
    
    /**
     * Sets ith "Dataflow" element
     */
    public void setDataflowArray(int i, java.lang.String dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOW$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataflow);
        }
    }
    
    /**
     * Sets (as xml) array of all "Dataflow" element
     */
    public void xsetDataflowArray(org.apache.xmlbeans.XmlString[]dataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowArray, DATAFLOW$26);
        }
    }
    
    /**
     * Sets (as xml) ith "Dataflow" element
     */
    public void xsetDataflowArray(int i, org.apache.xmlbeans.XmlString dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOW$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflow);
        }
    }
    
    /**
     * Inserts the value as the ith "Dataflow" element
     */
    public void insertDataflow(int i, java.lang.String dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAFLOW$26, i);
            target.setStringValue(dataflow);
        }
    }
    
    /**
     * Appends the value as the last "Dataflow" element
     */
    public void addDataflow(java.lang.String dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOW$26);
            target.setStringValue(dataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    public org.apache.xmlbeans.XmlString insertNewDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATAFLOW$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    public org.apache.xmlbeans.XmlString addNewDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAFLOW$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dataflow" element
     */
    public void removeDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOW$26, i);
        }
    }
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    public java.lang.String[] getMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOW$28, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Metadataflow" element
     */
    public java.lang.String getMetadataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOW$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Metadataflow" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOW$28, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Metadataflow" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOW$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Metadataflow" element
     */
    public int sizeOfMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOW$28);
        }
    }
    
    /**
     * Sets array of all "Metadataflow" element
     */
    public void setMetadataflowArray(java.lang.String[] metadataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowArray, METADATAFLOW$28);
        }
    }
    
    /**
     * Sets ith "Metadataflow" element
     */
    public void setMetadataflowArray(int i, java.lang.String metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOW$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataflow);
        }
    }
    
    /**
     * Sets (as xml) array of all "Metadataflow" element
     */
    public void xsetMetadataflowArray(org.apache.xmlbeans.XmlString[]metadataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowArray, METADATAFLOW$28);
        }
    }
    
    /**
     * Sets (as xml) ith "Metadataflow" element
     */
    public void xsetMetadataflowArray(int i, org.apache.xmlbeans.XmlString metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOW$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Inserts the value as the ith "Metadataflow" element
     */
    public void insertMetadataflow(int i, java.lang.String metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATAFLOW$28, i);
            target.setStringValue(metadataflow);
        }
    }
    
    /**
     * Appends the value as the last "Metadataflow" element
     */
    public void addMetadataflow(java.lang.String metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAFLOW$28);
            target.setStringValue(metadataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATAFLOW$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATAFLOW$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "Metadataflow" element
     */
    public void removeMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOW$28, i);
        }
    }
    
    /**
     * Gets array of all "Version" elements
     */
    public java.lang.String[] getVersionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSION$30, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Version" element
     */
    public java.lang.String getVersionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Version" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetVersionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSION$30, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Version" element
     */
    public int sizeOfVersionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$30);
        }
    }
    
    /**
     * Sets array of all "Version" element
     */
    public void setVersionArray(java.lang.String[] versionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(versionArray, VERSION$30);
        }
    }
    
    /**
     * Sets ith "Version" element
     */
    public void setVersionArray(int i, java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) array of all "Version" element
     */
    public void xsetVersionArray(org.apache.xmlbeans.XmlString[]versionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(versionArray, VERSION$30);
        }
    }
    
    /**
     * Sets (as xml) ith "Version" element
     */
    public void xsetVersionArray(int i, org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(version);
        }
    }
    
    /**
     * Inserts the value as the ith "Version" element
     */
    public void insertVersion(int i, java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VERSION$30, i);
            target.setStringValue(version);
        }
    }
    
    /**
     * Appends the value as the last "Version" element
     */
    public void addVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$30);
            target.setStringValue(version);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Version" element
     */
    public org.apache.xmlbeans.XmlString insertNewVersion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VERSION$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Version" element
     */
    public org.apache.xmlbeans.XmlString addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "Version" element
     */
    public void removeVersion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$30, i);
        }
    }
    
    /**
     * Gets array of all "Or" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType[] getOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OR$32, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.OrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType getOrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().find_element_user(OR$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Or" element
     */
    public int sizeOfOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OR$32);
        }
    }
    
    /**
     * Sets array of all "Or" element
     */
    public void setOrArray(org.sdmx.resources.sdmxml.schemas.v20.query.OrType[] orArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orArray, OR$32);
        }
    }
    
    /**
     * Sets ith "Or" element
     */
    public void setOrArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.OrType or)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().find_element_user(OR$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(or);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType insertNewOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().insert_element_user(OR$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().add_element_user(OR$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "Or" element
     */
    public void removeOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OR$32, i);
        }
    }
    
    /**
     * Gets array of all "And" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType[] getAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AND$34, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.AndType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType getAndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().find_element_user(AND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "And" element
     */
    public int sizeOfAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AND$34);
        }
    }
    
    /**
     * Sets array of all "And" element
     */
    public void setAndArray(org.sdmx.resources.sdmxml.schemas.v20.query.AndType[] andArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(andArray, AND$34);
        }
    }
    
    /**
     * Sets ith "And" element
     */
    public void setAndArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.AndType and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().find_element_user(AND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(and);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType insertNewAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().insert_element_user(AND$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType addNewAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().add_element_user(AND$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "And" element
     */
    public void removeAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AND$34, i);
        }
    }
}
