/*
 * An XML document type.
 * Localname: Key
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.utility.KeyDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.utility.impl;
/**
 * A document containing one Key(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility) element.
 *
 * This is a complex type.
 */
public class KeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.utility.KeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "Key");
    
    
    /**
     * Gets the "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType)get_store().find_element_user(KEY$0, 0);
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
    public void setKey(org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType)get_store().add_element_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Appends and returns a new empty "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.KeyType)get_store().add_element_user(KEY$0);
            return target;
        }
    }
}
