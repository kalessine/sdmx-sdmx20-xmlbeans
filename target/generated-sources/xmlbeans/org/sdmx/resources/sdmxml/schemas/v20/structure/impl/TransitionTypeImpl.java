/*
 * XML Type:  TransitionType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML TransitionType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class TransitionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType
{
    private static final long serialVersionUID = 1L;
    
    public TransitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETSTEP$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetStep");
    private static final javax.xml.namespace.QName CONDITION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Condition");
    
    
    /**
     * Gets the "TargetStep" element
     */
    public java.lang.String getTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETSTEP$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TargetStep" element
     */
    public boolean isSetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETSTEP$0) != 0;
        }
    }
    
    /**
     * Sets the "TargetStep" element
     */
    public void setTargetStep(java.lang.String targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTEP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETSTEP$0);
            }
            target.setStringValue(targetStep);
        }
    }
    
    /**
     * Sets (as xml) the "TargetStep" element
     */
    public void xsetTargetStep(org.sdmx.resources.sdmxml.schemas.v20.common.IDType targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETSTEP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(TARGETSTEP$0);
            }
            target.set(targetStep);
        }
    }
    
    /**
     * Unsets the "TargetStep" element
     */
    public void unsetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETSTEP$0, 0);
        }
    }
    
    /**
     * Gets the "Condition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(CONDITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Condition" element
     */
    public boolean isSetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$2) != 0;
        }
    }
    
    /**
     * Sets the "Condition" element
     */
    public void setCondition(org.sdmx.resources.sdmxml.schemas.v20.common.TextType condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(CONDITION$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(CONDITION$2);
            }
            target.set(condition);
        }
    }
    
    /**
     * Appends and returns a new empty "Condition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(CONDITION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Condition" element
     */
    public void unsetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$2, 0);
        }
    }
}
