/*
 * An XML document type.
 * Localname: DataSet
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.compact.impl;
/**
 * A document containing one DataSet(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact) element.
 *
 * This is a complex type.
 */
public class DataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact", "DataSet");
    
    
    /**
     * Gets the "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType getDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().find_element_user(DATASET$0, 0);
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
    public void setDataSet(org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().find_element_user(DATASET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().add_element_user(DATASET$0);
            }
            target.set(dataSet);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.DataSetType)get_store().add_element_user(DATASET$0);
            return target;
        }
    }
}
