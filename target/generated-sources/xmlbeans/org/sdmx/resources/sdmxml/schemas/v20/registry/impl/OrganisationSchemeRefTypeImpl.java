/*
 * XML Type:  OrganisationSchemeRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML OrganisationSchemeRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class OrganisationSchemeRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "URN");
    private static final javax.xml.namespace.QName AGENCYID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "AgencyID");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemeID");
    private static final javax.xml.namespace.QName VERSION$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Version");
    
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "URN" element
     */
    public boolean isSetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URN$0) != 0;
        }
    }
    
    /**
     * Sets the "URN" element
     */
    public void setURN(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$0);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "URN" element
     */
    public void xsetURN(org.apache.xmlbeans.XmlAnyURI urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URN$0);
            }
            target.set(urn);
        }
    }
    
    /**
     * Unsets the "URN" element
     */
    public void unsetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URN$0, 0);
        }
    }
    
    /**
     * Gets the "AgencyID" element
     */
    public java.lang.String getAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(AGENCYID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AgencyID" element
     */
    public boolean isSetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYID$2) != 0;
        }
    }
    
    /**
     * Sets the "AgencyID" element
     */
    public void setAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCYID$2);
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) the "AgencyID" element
     */
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(AGENCYID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(AGENCYID$2);
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Unsets the "AgencyID" element
     */
    public void unsetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYID$2, 0);
        }
    }
    
    /**
     * Gets the "OrganisationSchemeID" element
     */
    public java.lang.String getOrganisationSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSCHEMEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationSchemeID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetOrganisationSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ORGANISATIONSCHEMEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrganisationSchemeID" element
     */
    public boolean isSetOrganisationSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEID$4) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeID" element
     */
    public void setOrganisationSchemeID(java.lang.String organisationSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSCHEMEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSCHEMEID$4);
            }
            target.setStringValue(organisationSchemeID);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationSchemeID" element
     */
    public void xsetOrganisationSchemeID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType organisationSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ORGANISATIONSCHEMEID$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(ORGANISATIONSCHEMEID$4);
            }
            target.set(organisationSchemeID);
        }
    }
    
    /**
     * Unsets the "OrganisationSchemeID" element
     */
    public void unsetOrganisationSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEID$4, 0);
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$6);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$6);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "Version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$6, 0);
        }
    }
}
