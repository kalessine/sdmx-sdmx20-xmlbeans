/*
 * XML Type:  UtilityDataType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * An XML UtilityDataType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a complex type.
 */
public class UtilityDataTypeImpl extends org.sdmx.resources.sdmxml.schemas.v20.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType
{
    private static final long serialVersionUID = 1L;
    
    public UtilityDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "DataSet");
    
    
    /**
     * Gets the "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType getDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().find_element_user(DATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSet" element
     */
    public void setDataSet(org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().find_element_user(DATASET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().add_element_user(DATASET$0);
            }
            target.set(dataSet);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.DataSetType)get_store().add_element_user(DATASET$0);
            return target;
        }
    }
}
