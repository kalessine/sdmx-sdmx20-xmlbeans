/*
 * XML Type:  OrganisationMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML OrganisationMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class OrganisationMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationMapType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "OrganisationID");
    private static final javax.xml.namespace.QName TARGETORGANISATIONID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetOrganisationID");
    private static final javax.xml.namespace.QName ORGANISATIONALIAS$4 = 
        new javax.xml.namespace.QName("", "organisationAlias");
    
    
    /**
     * Gets the "OrganisationID" element
     */
    public java.lang.String getOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ORGANISATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationID" element
     */
    public void setOrganisationID(java.lang.String organisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONID$0);
            }
            target.setStringValue(organisationID);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationID" element
     */
    public void xsetOrganisationID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType organisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ORGANISATIONID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(ORGANISATIONID$0);
            }
            target.set(organisationID);
        }
    }
    
    /**
     * Gets the "TargetOrganisationID" element
     */
    public java.lang.String getTargetOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETORGANISATIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetOrganisationID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetTargetOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETORGANISATIONID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetOrganisationID" element
     */
    public void setTargetOrganisationID(java.lang.String targetOrganisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETORGANISATIONID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETORGANISATIONID$2);
            }
            target.setStringValue(targetOrganisationID);
        }
    }
    
    /**
     * Sets (as xml) the "TargetOrganisationID" element
     */
    public void xsetTargetOrganisationID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType targetOrganisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETORGANISATIONID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(TARGETORGANISATIONID$2);
            }
            target.set(targetOrganisationID);
        }
    }
    
    /**
     * Gets the "organisationAlias" attribute
     */
    public java.lang.String getOrganisationAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONALIAS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organisationAlias" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetOrganisationAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ORGANISATIONALIAS$4);
            return target;
        }
    }
    
    /**
     * True if has "organisationAlias" attribute
     */
    public boolean isSetOrganisationAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORGANISATIONALIAS$4) != null;
        }
    }
    
    /**
     * Sets the "organisationAlias" attribute
     */
    public void setOrganisationAlias(java.lang.String organisationAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONALIAS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORGANISATIONALIAS$4);
            }
            target.setStringValue(organisationAlias);
        }
    }
    
    /**
     * Sets (as xml) the "organisationAlias" attribute
     */
    public void xsetOrganisationAlias(org.sdmx.resources.sdmxml.schemas.v20.common.IDType organisationAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ORGANISATIONALIAS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ORGANISATIONALIAS$4);
            }
            target.set(organisationAlias);
        }
    }
    
    /**
     * Unsets the "organisationAlias" attribute
     */
    public void unsetOrganisationAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORGANISATIONALIAS$4);
        }
    }
}
