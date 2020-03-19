/*
 * XML Type:  ComponentValueType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.impl;
/**
 * An XML ComponentValueType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType.
 */
public class ComponentValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ComponentValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("", "object");
    private static final javax.xml.namespace.QName COMPONENT$2 = 
        new javax.xml.namespace.QName("", "component");
    
    
    /**
     * Gets the "object" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType.Enum getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECT$0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "object" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType xgetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType)get_store().find_attribute_user(OBJECT$0);
            return target;
        }
    }
    
    /**
     * Sets the "object" attribute
     */
    public void setObject(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType.Enum object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECT$0);
            }
            target.setEnumValue(object);
        }
    }
    
    /**
     * Sets (as xml) the "object" attribute
     */
    public void xsetObject(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType)get_store().find_attribute_user(OBJECT$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ObjectIDType)get_store().add_attribute_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Gets the "component" attribute
     */
    public java.lang.String getComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPONENT$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "component" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(COMPONENT$2);
            return target;
        }
    }
    
    /**
     * True if has "component" attribute
     */
    public boolean isSetComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPONENT$2) != null;
        }
    }
    
    /**
     * Sets the "component" attribute
     */
    public void setComponent(java.lang.String component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPONENT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPONENT$2);
            }
            target.setStringValue(component);
        }
    }
    
    /**
     * Sets (as xml) the "component" attribute
     */
    public void xsetComponent(org.sdmx.resources.sdmxml.schemas.v20.common.IDType component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(COMPONENT$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(COMPONENT$2);
            }
            target.set(component);
        }
    }
    
    /**
     * Unsets the "component" attribute
     */
    public void unsetComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPONENT$2);
        }
    }
}
