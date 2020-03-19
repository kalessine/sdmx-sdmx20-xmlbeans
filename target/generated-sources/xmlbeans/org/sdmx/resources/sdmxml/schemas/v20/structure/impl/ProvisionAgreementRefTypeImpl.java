/*
 * XML Type:  ProvisionAgreementRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ProvisionAgreementRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ProvisionAgreementRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType
{
    private static final long serialVersionUID = 1L;
    
    public ProvisionAgreementRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "URN");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEAGENCYID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "OrganisationSchemeAgencyID");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "OrganisationSchemeID");
    private static final javax.xml.namespace.QName DATAPROVIDERID$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataProviderID");
    private static final javax.xml.namespace.QName DATAPROVIDERVERSION$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataProviderVersion");
    private static final javax.xml.namespace.QName DATAFLOWAGENCYID$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataflowAgencyID");
    private static final javax.xml.namespace.QName DATAFLOWID$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataflowID");
    private static final javax.xml.namespace.QName DATAFLOWVERSION$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataflowVersion");
    private static final javax.xml.namespace.QName CONSTRAINT$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Constraint");
    
    
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
     * Gets the "OrganisationSchemeAgencyID" element
     */
    public java.lang.String getOrganisationSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSCHEMEAGENCYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationSchemeAgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetOrganisationSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ORGANISATIONSCHEMEAGENCYID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrganisationSchemeAgencyID" element
     */
    public boolean isSetOrganisationSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEAGENCYID$2) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeAgencyID" element
     */
    public void setOrganisationSchemeAgencyID(java.lang.String organisationSchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSCHEMEAGENCYID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSCHEMEAGENCYID$2);
            }
            target.setStringValue(organisationSchemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationSchemeAgencyID" element
     */
    public void xsetOrganisationSchemeAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType organisationSchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ORGANISATIONSCHEMEAGENCYID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(ORGANISATIONSCHEMEAGENCYID$2);
            }
            target.set(organisationSchemeAgencyID);
        }
    }
    
    /**
     * Unsets the "OrganisationSchemeAgencyID" element
     */
    public void unsetOrganisationSchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEAGENCYID$2, 0);
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
     * Gets the "DataProviderID" element
     */
    public java.lang.String getDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDERID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataProviderID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(DATAPROVIDERID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataProviderID" element
     */
    public boolean isSetDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERID$6) != 0;
        }
    }
    
    /**
     * Sets the "DataProviderID" element
     */
    public void setDataProviderID(java.lang.String dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROVIDERID$6);
            }
            target.setStringValue(dataProviderID);
        }
    }
    
    /**
     * Sets (as xml) the "DataProviderID" element
     */
    public void xsetDataProviderID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(DATAPROVIDERID$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(DATAPROVIDERID$6);
            }
            target.set(dataProviderID);
        }
    }
    
    /**
     * Unsets the "DataProviderID" element
     */
    public void unsetDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERID$6, 0);
        }
    }
    
    /**
     * Gets the "DataProviderVersion" element
     */
    public java.lang.String getDataProviderVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDERVERSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataProviderVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetDataProviderVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDERVERSION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataProviderVersion" element
     */
    public boolean isSetDataProviderVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERVERSION$8) != 0;
        }
    }
    
    /**
     * Sets the "DataProviderVersion" element
     */
    public void setDataProviderVersion(java.lang.String dataProviderVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDERVERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROVIDERVERSION$8);
            }
            target.setStringValue(dataProviderVersion);
        }
    }
    
    /**
     * Sets (as xml) the "DataProviderVersion" element
     */
    public void xsetDataProviderVersion(org.apache.xmlbeans.XmlString dataProviderVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDERVERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROVIDERVERSION$8);
            }
            target.set(dataProviderVersion);
        }
    }
    
    /**
     * Unsets the "DataProviderVersion" element
     */
    public void unsetDataProviderVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERVERSION$8, 0);
        }
    }
    
    /**
     * Gets the "DataflowAgencyID" element
     */
    public java.lang.String getDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWAGENCYID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataflowAgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(DATAFLOWAGENCYID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataflowAgencyID" element
     */
    public boolean isSetDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWAGENCYID$10) != 0;
        }
    }
    
    /**
     * Sets the "DataflowAgencyID" element
     */
    public void setDataflowAgencyID(java.lang.String dataflowAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWAGENCYID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOWAGENCYID$10);
            }
            target.setStringValue(dataflowAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "DataflowAgencyID" element
     */
    public void xsetDataflowAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataflowAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(DATAFLOWAGENCYID$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(DATAFLOWAGENCYID$10);
            }
            target.set(dataflowAgencyID);
        }
    }
    
    /**
     * Unsets the "DataflowAgencyID" element
     */
    public void unsetDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWAGENCYID$10, 0);
        }
    }
    
    /**
     * Gets the "DataflowID" element
     */
    public java.lang.String getDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataflowID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(DATAFLOWID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataflowID" element
     */
    public boolean isSetDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWID$12) != 0;
        }
    }
    
    /**
     * Sets the "DataflowID" element
     */
    public void setDataflowID(java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOWID$12);
            }
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Sets (as xml) the "DataflowID" element
     */
    public void xsetDataflowID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(DATAFLOWID$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(DATAFLOWID$12);
            }
            target.set(dataflowID);
        }
    }
    
    /**
     * Unsets the "DataflowID" element
     */
    public void unsetDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWID$12, 0);
        }
    }
    
    /**
     * Gets the "DataflowVersion" element
     */
    public java.lang.String getDataflowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWVERSION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataflowVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetDataflowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWVERSION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataflowVersion" element
     */
    public boolean isSetDataflowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWVERSION$14) != 0;
        }
    }
    
    /**
     * Sets the "DataflowVersion" element
     */
    public void setDataflowVersion(java.lang.String dataflowVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWVERSION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOWVERSION$14);
            }
            target.setStringValue(dataflowVersion);
        }
    }
    
    /**
     * Sets (as xml) the "DataflowVersion" element
     */
    public void xsetDataflowVersion(org.apache.xmlbeans.XmlString dataflowVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWVERSION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAFLOWVERSION$14);
            }
            target.set(dataflowVersion);
        }
    }
    
    /**
     * Unsets the "DataflowVersion" element
     */
    public void unsetDataflowVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWVERSION$14, 0);
        }
    }
    
    /**
     * Gets the "Constraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType getConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().find_element_user(CONSTRAINT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Constraint" element
     */
    public boolean isSetConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINT$16) != 0;
        }
    }
    
    /**
     * Sets the "Constraint" element
     */
    public void setConstraint(org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType constraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().find_element_user(CONSTRAINT$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().add_element_user(CONSTRAINT$16);
            }
            target.set(constraint);
        }
    }
    
    /**
     * Appends and returns a new empty "Constraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType addNewConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().add_element_user(CONSTRAINT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Constraint" element
     */
    public void unsetConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINT$16, 0);
        }
    }
}
