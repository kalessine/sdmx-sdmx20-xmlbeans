/*
 * An XML document type.
 * Localname: CompactData
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one CompactData(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class CompactDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompactDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPACTDATA$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "CompactData");
    
    
    /**
     * Gets the "CompactData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType getCompactData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType)get_store().find_element_user(COMPACTDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompactData" element
     */
    public void setCompactData(org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType compactData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType)get_store().find_element_user(COMPACTDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType)get_store().add_element_user(COMPACTDATA$0);
            }
            target.set(compactData);
        }
    }
    
    /**
     * Appends and returns a new empty "CompactData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType addNewCompactData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.CompactDataType)get_store().add_element_user(COMPACTDATA$0);
            return target;
        }
    }
}
