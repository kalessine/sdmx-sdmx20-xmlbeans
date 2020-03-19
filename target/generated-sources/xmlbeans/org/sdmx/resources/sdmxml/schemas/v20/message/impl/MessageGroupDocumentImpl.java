/*
 * An XML document type.
 * Localname: MessageGroup
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one MessageGroup(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class MessageGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEGROUP$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "MessageGroup");
    
    
    /**
     * Gets the "MessageGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType getMessageGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType)get_store().find_element_user(MESSAGEGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessageGroup" element
     */
    public void setMessageGroup(org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType messageGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType)get_store().find_element_user(MESSAGEGROUP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType)get_store().add_element_user(MESSAGEGROUP$0);
            }
            target.set(messageGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "MessageGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType addNewMessageGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.MessageGroupType)get_store().add_element_user(MESSAGEGROUP$0);
            return target;
        }
    }
}
