/*
 * An XML document type.
 * Localname: Header
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one Header(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Header");
    
    
    /**
     * Gets the "Header" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Header" element
     */
    public void setHeader(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "Header" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
}
