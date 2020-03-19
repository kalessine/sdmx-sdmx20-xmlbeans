/*
 * XML Type:  QueryMessageType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * An XML QueryMessageType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a complex type.
 */
public class QueryMessageTypeImpl extends org.sdmx.resources.sdmxml.schemas.v20.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.QueryMessageType
{
    private static final long serialVersionUID = 1L;
    
    public QueryMessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.QueryType getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.QueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.QueryType)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(org.sdmx.resources.sdmxml.schemas.v20.query.QueryType query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.QueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.QueryType)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.QueryType)get_store().add_element_user(QUERY$0);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.QueryType addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.QueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.QueryType)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
}
