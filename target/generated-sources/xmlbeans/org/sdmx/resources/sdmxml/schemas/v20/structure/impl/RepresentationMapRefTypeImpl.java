/*
 * XML Type:  RepresentationMapRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML RepresentationMapRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class RepresentationMapRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType
{
    private static final long serialVersionUID = 1L;
    
    public RepresentationMapRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPRESENTATIONMAPAGENCYID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "RepresentationMapAgencyID");
    private static final javax.xml.namespace.QName REPRESENTATIONMAPID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "RepresentationMapID");
    private static final javax.xml.namespace.QName REPRESENTATIONTYPE$4 = 
        new javax.xml.namespace.QName("", "representationType");
    
    
    /**
     * Gets the "RepresentationMapAgencyID" element
     */
    public java.lang.String getRepresentationMapAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIONMAPAGENCYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RepresentationMapAgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetRepresentationMapAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(REPRESENTATIONMAPAGENCYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RepresentationMapAgencyID" element
     */
    public void setRepresentationMapAgencyID(java.lang.String representationMapAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIONMAPAGENCYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPRESENTATIONMAPAGENCYID$0);
            }
            target.setStringValue(representationMapAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "RepresentationMapAgencyID" element
     */
    public void xsetRepresentationMapAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType representationMapAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(REPRESENTATIONMAPAGENCYID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(REPRESENTATIONMAPAGENCYID$0);
            }
            target.set(representationMapAgencyID);
        }
    }
    
    /**
     * Gets the "RepresentationMapID" element
     */
    public java.lang.String getRepresentationMapID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIONMAPID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RepresentationMapID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetRepresentationMapID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(REPRESENTATIONMAPID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RepresentationMapID" element
     */
    public void setRepresentationMapID(java.lang.String representationMapID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPRESENTATIONMAPID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPRESENTATIONMAPID$2);
            }
            target.setStringValue(representationMapID);
        }
    }
    
    /**
     * Sets (as xml) the "RepresentationMapID" element
     */
    public void xsetRepresentationMapID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType representationMapID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(REPRESENTATIONMAPID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(REPRESENTATIONMAPID$2);
            }
            target.set(representationMapID);
        }
    }
    
    /**
     * Gets the "representationType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType.Enum getRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPRESENTATIONTYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "representationType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType xgetRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType)get_store().find_attribute_user(REPRESENTATIONTYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType)get_default_attribute_value(REPRESENTATIONTYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "representationType" attribute
     */
    public boolean isSetRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPRESENTATIONTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "representationType" attribute
     */
    public void setRepresentationType(org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType.Enum representationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATIONTYPE$4);
            }
            target.setEnumValue(representationType);
        }
    }
    
    /**
     * Sets (as xml) the "representationType" attribute
     */
    public void xsetRepresentationType(org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType representationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType)get_store().find_attribute_user(REPRESENTATIONTYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationTypeType)get_store().add_attribute_user(REPRESENTATIONTYPE$4);
            }
            target.set(representationType);
        }
    }
    
    /**
     * Unsets the "representationType" attribute
     */
    public void unsetRepresentationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPRESENTATIONTYPE$4);
        }
    }
}
