/*
 * An XML document type.
 * Localname: QueryMessage
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one QueryMessage(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class QueryMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryMessage");
    
    
    /**
     * Gets the "QueryMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType getQueryMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType)get_store().find_element_user(QUERYMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryMessage" element
     */
    public void setQueryMessage(org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType queryMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType)get_store().find_element_user(QUERYMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType)get_store().add_element_user(QUERYMESSAGE$0);
            }
            target.set(queryMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType addNewQueryMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType)get_store().add_element_user(QUERYMESSAGE$0);
            return target;
        }
    }
}
