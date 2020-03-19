/*
 * XML Type:  ProvisioningEventType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML ProvisioningEventType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class ProvisioningEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType
{
    private static final long serialVersionUID = 1L;
    
    public ProvisioningEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROVIDERREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderRef");
    private static final javax.xml.namespace.QName DATAFLOWREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADATAFLOWREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowRef");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreement");
    
    
    /**
     * Gets the "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProviderRef" element
     */
    public boolean isSetDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERREF$0) != 0;
        }
    }
    
    /**
     * Sets the "DataProviderRef" element
     */
    public void setDataProviderRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType dataProviderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$0);
            }
            target.set(dataProviderRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType addNewDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataProviderRef" element
     */
    public void unsetDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERREF$0, 0);
        }
    }
    
    /**
     * Gets the "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataflowRef" element
     */
    public boolean isSetDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWREF$2) != 0;
        }
    }
    
    /**
     * Sets the "DataflowRef" element
     */
    public void setDataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$2);
            }
            target.set(dataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataflowRef" element
     */
    public void unsetDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWREF$2, 0);
        }
    }
    
    /**
     * Gets the "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataflowRef" element
     */
    public boolean isSetMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWREF$4) != 0;
        }
    }
    
    /**
     * Sets the "MetadataflowRef" element
     */
    public void setMetadataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$4);
            }
            target.set(metadataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataflowRef" element
     */
    public void unsetMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWREF$4, 0);
        }
    }
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType getProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().find_element_user(PROVISIONAGREEMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisionAgreement" element
     */
    public boolean isSetProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgreement" element
     */
    public void setProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().find_element_user(PROVISIONAGREEMENT$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().add_element_user(PROVISIONAGREEMENT$6);
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType)get_store().add_element_user(PROVISIONAGREEMENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisionAgreement" element
     */
    public void unsetProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENT$6, 0);
        }
    }
}
