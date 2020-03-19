/*
 * XML Type:  RepresentationSchemeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML RepresentationSchemeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class RepresentationSchemeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public RepresentationSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPRESENTATIONSCHEME$0 = 
        new javax.xml.namespace.QName("", "representationScheme");
    private static final javax.xml.namespace.QName REPRESENTATIONSCHEMEAGENCY$2 = 
        new javax.xml.namespace.QName("", "representationSchemeAgency");
    private static final javax.xml.namespace.QName REPRESENTATIONSCHEMETYPE$4 = 
        new javax.xml.namespace.QName("", "representationSchemeType");
    
    
    /**
     * Gets the "representationScheme" attribute
     */
    public java.lang.String getRepresentationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "representationScheme" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetRepresentationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEME$0);
            return target;
        }
    }
    
    /**
     * Sets the "representationScheme" attribute
     */
    public void setRepresentationScheme(java.lang.String representationScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATIONSCHEME$0);
            }
            target.setStringValue(representationScheme);
        }
    }
    
    /**
     * Sets (as xml) the "representationScheme" attribute
     */
    public void xsetRepresentationScheme(org.sdmx.resources.sdmxml.schemas.v20.common.IDType representationScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEME$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(REPRESENTATIONSCHEME$0);
            }
            target.set(representationScheme);
        }
    }
    
    /**
     * Gets the "representationSchemeAgency" attribute
     */
    public java.lang.String getRepresentationSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "representationSchemeAgency" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetRepresentationSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$2);
            return target;
        }
    }
    
    /**
     * Sets the "representationSchemeAgency" attribute
     */
    public void setRepresentationSchemeAgency(java.lang.String representationSchemeAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATIONSCHEMEAGENCY$2);
            }
            target.setStringValue(representationSchemeAgency);
        }
    }
    
    /**
     * Sets (as xml) the "representationSchemeAgency" attribute
     */
    public void xsetRepresentationSchemeAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType representationSchemeAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(REPRESENTATIONSCHEMEAGENCY$2);
            }
            target.set(representationSchemeAgency);
        }
    }
    
    /**
     * Gets the "representationSchemeType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType.Enum getRepresentationSchemeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEMETYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "representationSchemeType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType xgetRepresentationSchemeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType)get_store().find_attribute_user(REPRESENTATIONSCHEMETYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "representationSchemeType" attribute
     */
    public void setRepresentationSchemeType(org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType.Enum representationSchemeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEMETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATIONSCHEMETYPE$4);
            }
            target.setEnumValue(representationSchemeType);
        }
    }
    
    /**
     * Sets (as xml) the "representationSchemeType" attribute
     */
    public void xsetRepresentationSchemeType(org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType representationSchemeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType)get_store().find_attribute_user(REPRESENTATIONSCHEMETYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationSchemeTypeType)get_store().add_attribute_user(REPRESENTATIONSCHEMETYPE$4);
            }
            target.set(representationSchemeType);
        }
    }
}
