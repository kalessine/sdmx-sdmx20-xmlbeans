/*
 * XML Type:  DataProviderRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML DataProviderRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class DataProviderRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType
{
    private static final long serialVersionUID = 1L;
    
    public DataProviderRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "URN");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEAGENCYID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemeAgencyID");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemeID");
    private static final javax.xml.namespace.QName DATAPROVIDERID$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderID");
    private static final javax.xml.namespace.QName VERSION$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Version");
    private static final javax.xml.namespace.QName DATASOURCE$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Datasource");
    private static final javax.xml.namespace.QName CONSTRAINT$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Constraint");
    
    
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
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$8, 0);
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
            return get_store().count_elements(VERSION$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$8);
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
            get_store().remove_element(VERSION$8, 0);
        }
    }
    
    /**
     * Gets the "Datasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType getDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().find_element_user(DATASOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Datasource" element
     */
    public boolean isSetDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "Datasource" element
     */
    public void setDatasource(org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType datasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().find_element_user(DATASOURCE$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().add_element_user(DATASOURCE$10);
            }
            target.set(datasource);
        }
    }
    
    /**
     * Appends and returns a new empty "Datasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType addNewDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().add_element_user(DATASOURCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Datasource" element
     */
    public void unsetDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCE$10, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().find_element_user(CONSTRAINT$12, 0);
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
            return get_store().count_elements(CONSTRAINT$12) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().find_element_user(CONSTRAINT$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().add_element_user(CONSTRAINT$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType)get_store().add_element_user(CONSTRAINT$12);
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
            get_store().remove_element(CONSTRAINT$12, 0);
        }
    }
}
