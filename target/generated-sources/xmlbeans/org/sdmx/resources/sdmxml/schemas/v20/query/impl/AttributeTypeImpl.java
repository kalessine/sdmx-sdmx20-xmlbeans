/*
 * XML Type:  AttributeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML AttributeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType.
 */
public class AttributeTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ATTACHMENTLEVEL$2 = 
        new javax.xml.namespace.QName("", "attachmentLevel");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
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
            return get_store().find_attribute_user(ID$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
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
            get_store().remove_attribute(ID$0);
        }
    }
    
    /**
     * Gets the "attachmentLevel" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType.Enum getAttachmentLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTLEVEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ATTACHMENTLEVEL$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "attachmentLevel" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType xgetAttachmentLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType)get_store().find_attribute_user(ATTACHMENTLEVEL$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType)get_default_attribute_value(ATTACHMENTLEVEL$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "attachmentLevel" attribute
     */
    public boolean isSetAttachmentLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTACHMENTLEVEL$2) != null;
        }
    }
    
    /**
     * Sets the "attachmentLevel" attribute
     */
    public void setAttachmentLevel(org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType.Enum attachmentLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTLEVEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTACHMENTLEVEL$2);
            }
            target.setEnumValue(attachmentLevel);
        }
    }
    
    /**
     * Sets (as xml) the "attachmentLevel" attribute
     */
    public void xsetAttachmentLevel(org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType attachmentLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType)get_store().find_attribute_user(ATTACHMENTLEVEL$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttachmentLevelType)get_store().add_attribute_user(ATTACHMENTLEVEL$2);
            }
            target.set(attachmentLevel);
        }
    }
    
    /**
     * Unsets the "attachmentLevel" attribute
     */
    public void unsetAttachmentLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTACHMENTLEVEL$2);
        }
    }
}
