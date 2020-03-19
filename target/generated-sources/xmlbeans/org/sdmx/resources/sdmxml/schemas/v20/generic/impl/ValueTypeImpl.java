/*
 * XML Type:  ValueType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.generic.ValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.generic.impl;
/**
 * An XML ValueType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic).
 *
 * This is a complex type.
 */
public class ValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.generic.ValueType
{
    private static final long serialVersionUID = 1L;
    
    public ValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPT$0 = 
        new javax.xml.namespace.QName("", "concept");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName STARTTIME$4 = 
        new javax.xml.namespace.QName("", "startTime");
    
    
    /**
     * Gets the "concept" attribute
     */
    public java.lang.String getConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "concept" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPT$0);
            return target;
        }
    }
    
    /**
     * True if has "concept" attribute
     */
    public boolean isSetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCEPT$0) != null;
        }
    }
    
    /**
     * Sets the "concept" attribute
     */
    public void setConcept(java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPT$0);
            }
            target.setStringValue(concept);
        }
    }
    
    /**
     * Sets (as xml) the "concept" attribute
     */
    public void xsetConcept(org.sdmx.resources.sdmxml.schemas.v20.common.IDType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPT$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPT$0);
            }
            target.set(concept);
        }
    }
    
    /**
     * Unsets the "concept" attribute
     */
    public void unsetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCEPT$0);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$2) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$2);
        }
    }
    
    /**
     * Gets the "startTime" attribute
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$4);
            return target;
        }
    }
    
    /**
     * True if has "startTime" attribute
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTTIME$4) != null;
        }
    }
    
    /**
     * Sets the "startTime" attribute
     */
    public void setStartTime(java.util.Calendar startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$4);
            }
            target.setCalendarValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "startTime" attribute
     */
    public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(STARTTIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(STARTTIME$4);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Unsets the "startTime" attribute
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTTIME$4);
        }
    }
}
