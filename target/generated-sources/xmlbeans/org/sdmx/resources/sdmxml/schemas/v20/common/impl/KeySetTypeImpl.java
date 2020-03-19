/*
 * XML Type:  KeySetType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common.impl;
/**
 * An XML KeySetType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a complex type.
 */
public class KeySetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType
{
    private static final long serialVersionUID = 1L;
    
    public KeySetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "Key");
    private static final javax.xml.namespace.QName ISINCLUDED$2 = 
        new javax.xml.namespace.QName("", "isIncluded");
    
    
    /**
     * Gets the "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.KeyType getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Key" element
     */
    public void setKey(org.sdmx.resources.sdmxml.schemas.v20.common.KeyType key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType)get_store().add_element_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Appends and returns a new empty "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.KeyType addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType)get_store().add_element_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Gets the "isIncluded" attribute
     */
    public boolean getIsIncluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isIncluded" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsIncluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$2);
            return target;
        }
    }
    
    /**
     * Sets the "isIncluded" attribute
     */
    public void setIsIncluded(boolean isIncluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINCLUDED$2);
            }
            target.setBooleanValue(isIncluded);
        }
    }
    
    /**
     * Sets (as xml) the "isIncluded" attribute
     */
    public void xsetIsIncluded(org.apache.xmlbeans.XmlBoolean isIncluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINCLUDED$2);
            }
            target.set(isIncluded);
        }
    }
}
