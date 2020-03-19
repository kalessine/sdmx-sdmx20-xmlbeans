/*
 * XML Type:  MessageGroupType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * An XML MessageGroupType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a complex type.
 */
public class MessageGroupTypeImpl extends org.sdmx.resources.sdmxml.schemas.v20.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType
{
    private static final long serialVersionUID = 1L;
    
    public MessageGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "DataSet");
    private static final javax.xml.namespace.QName DATASET2$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "DataSet");
    private static final javax.xml.namespace.QName DATASET3$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact", "DataSet");
    private static final javax.xml.namespace.QName DATASET4$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/cross", "DataSet");
    private static final javax.xml.namespace.QName METADATASET$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "MetadataSet");
    private static final javax.xml.namespace.QName METADATASET2$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/metadatareport", "MetadataSet");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType[] getDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType getDataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType)get_store().find_element_user(DATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
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
    public void setDataSetArray(org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType[] dataSetArray)
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
    public void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType)get_store().find_element_user(DATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType insertNewDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType)get_store().insert_element_user(DATASET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType)get_store().add_element_user(DATASET$0);
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
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType[] getDataSet2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET2$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType getDataSet2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().find_element_user(DATASET2$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataSet" element
     */
    public int sizeOfDataSet2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASET2$2);
        }
    }
    
    /**
     * Sets array of all "DataSet" element
     */
    public void setDataSet2Array(org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType[] dataSet2Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSet2Array, DATASET2$2);
        }
    }
    
    /**
     * Sets ith "DataSet" element
     */
    public void setDataSet2Array(int i, org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType dataSet2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().find_element_user(DATASET2$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSet2);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType insertNewDataSet2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().insert_element_user(DATASET2$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType addNewDataSet2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().add_element_user(DATASET2$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSet" element
     */
    public void removeDataSet2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASET2$2, i);
        }
    }
    
    /**
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType[] getDataSet3Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET3$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType getDataSet3Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().find_element_user(DATASET3$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataSet" element
     */
    public int sizeOfDataSet3Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASET3$4);
        }
    }
    
    /**
     * Sets array of all "DataSet" element
     */
    public void setDataSet3Array(org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType[] dataSet3Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSet3Array, DATASET3$4);
        }
    }
    
    /**
     * Sets ith "DataSet" element
     */
    public void setDataSet3Array(int i, org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType dataSet3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().find_element_user(DATASET3$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSet3);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType insertNewDataSet3(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().insert_element_user(DATASET3$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType addNewDataSet3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().add_element_user(DATASET3$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSet" element
     */
    public void removeDataSet3(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASET3$4, i);
        }
    }
    
    /**
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType[] getDataSet4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET4$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType getDataSet4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType)get_store().find_element_user(DATASET4$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataSet" element
     */
    public int sizeOfDataSet4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASET4$6);
        }
    }
    
    /**
     * Sets array of all "DataSet" element
     */
    public void setDataSet4Array(org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType[] dataSet4Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSet4Array, DATASET4$6);
        }
    }
    
    /**
     * Sets ith "DataSet" element
     */
    public void setDataSet4Array(int i, org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType dataSet4)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType)get_store().find_element_user(DATASET4$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSet4);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType insertNewDataSet4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType)get_store().insert_element_user(DATASET4$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType addNewDataSet4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.DataSetType)get_store().add_element_user(DATASET4$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSet" element
     */
    public void removeDataSet4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASET4$6, i);
        }
    }
    
    /**
     * Gets array of all "MetadataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType[] getMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType getMetadataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType)get_store().find_element_user(METADATASET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
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
            return get_store().count_elements(METADATASET$8);
        }
    }
    
    /**
     * Sets array of all "MetadataSet" element
     */
    public void setMetadataSetArray(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType[] metadataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSetArray, METADATASET$8);
        }
    }
    
    /**
     * Sets ith "MetadataSet" element
     */
    public void setMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType)get_store().find_element_user(METADATASET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType insertNewMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType)get_store().insert_element_user(METADATASET$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType addNewMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType)get_store().add_element_user(METADATASET$8);
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
            get_store().remove_element(METADATASET$8, i);
        }
    }
    
    /**
     * Gets array of all "MetadataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType[] getMetadataSet2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET2$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType getMetadataSet2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().find_element_user(METADATASET2$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataSet" element
     */
    public int sizeOfMetadataSet2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASET2$10);
        }
    }
    
    /**
     * Sets array of all "MetadataSet" element
     */
    public void setMetadataSet2Array(org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType[] metadataSet2Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSet2Array, METADATASET2$10);
        }
    }
    
    /**
     * Sets ith "MetadataSet" element
     */
    public void setMetadataSet2Array(int i, org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType metadataSet2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().find_element_user(METADATASET2$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSet2);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType insertNewMetadataSet2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().insert_element_user(METADATASET2$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType addNewMetadataSet2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().add_element_user(METADATASET2$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataSet" element
     */
    public void removeMetadataSet2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASET2$10, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$12);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$12) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlNMTOKEN id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ID$12);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$12);
        }
    }
}
