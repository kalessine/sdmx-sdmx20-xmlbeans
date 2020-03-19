/*
 * An XML document type.
 * Localname: GenericData
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one GenericData(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class GenericDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICDATA$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "GenericData");
    
    
    /**
     * Gets the "GenericData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType getGenericData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType)get_store().find_element_user(GENERICDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericData" element
     */
    public void setGenericData(org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType genericData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType)get_store().find_element_user(GENERICDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType)get_store().add_element_user(GENERICDATA$0);
            }
            target.set(genericData);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType addNewGenericData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericDataType)get_store().add_element_user(GENERICDATA$0);
            return target;
        }
    }
}
