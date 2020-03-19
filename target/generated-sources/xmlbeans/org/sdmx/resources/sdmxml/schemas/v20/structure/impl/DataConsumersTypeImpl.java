/*
 * XML Type:  DataConsumersType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.DataConsumersType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML DataConsumersType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class DataConsumersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.DataConsumersType
{
    private static final long serialVersionUID = 1L;
    
    public DataConsumersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATACONSUMER$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataConsumer");
    
    
    /**
     * Gets array of all "DataConsumer" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[] getDataConsumerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACONSUMER$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType getDataConsumerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().find_element_user(DATACONSUMER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataConsumer" element
     */
    public int sizeOfDataConsumerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSUMER$0);
        }
    }
    
    /**
     * Sets array of all "DataConsumer" element
     */
    public void setDataConsumerArray(org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType[] dataConsumerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataConsumerArray, DATACONSUMER$0);
        }
    }
    
    /**
     * Sets ith "DataConsumer" element
     */
    public void setDataConsumerArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType dataConsumer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().find_element_user(DATACONSUMER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataConsumer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType insertNewDataConsumer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().insert_element_user(DATACONSUMER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType addNewDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationType)get_store().add_element_user(DATACONSUMER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataConsumer" element
     */
    public void removeDataConsumer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSUMER$0, i);
        }
    }
}
