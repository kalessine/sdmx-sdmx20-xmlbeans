/*
 * XML Type:  RegistrationStatusType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationStatusType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML RegistrationStatusType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class RegistrationStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationStatusType
{
    private static final long serialVersionUID = 1L;
    
    public RegistrationStatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StatusMessage");
    private static final javax.xml.namespace.QName DATASOURCE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Datasource");
    private static final javax.xml.namespace.QName DATAPROVIDERREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderRef");
    private static final javax.xml.namespace.QName DATAFLOWREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADAFLOWREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadaflowRef");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTREF$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreementRef");
    
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$0);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType addNewStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$0);
            return target;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().find_element_user(DATASOURCE$2, 0);
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
            return get_store().count_elements(DATASOURCE$2) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().find_element_user(DATASOURCE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().add_element_user(DATASOURCE$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().add_element_user(DATASOURCE$2);
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
            get_store().remove_element(DATASOURCE$2, 0);
        }
    }
    
    /**
     * Gets the "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$4, 0);
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
            return get_store().count_elements(DATAPROVIDERREF$4) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$4);
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
            get_store().remove_element(DATAPROVIDERREF$4, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$6, 0);
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
            return get_store().count_elements(DATAFLOWREF$6) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$6);
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
            get_store().remove_element(DATAFLOWREF$6, 0);
        }
    }
    
    /**
     * Gets the "MetadaflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadaflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADAFLOWREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadaflowRef" element
     */
    public boolean isSetMetadaflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADAFLOWREF$8) != 0;
        }
    }
    
    /**
     * Sets the "MetadaflowRef" element
     */
    public void setMetadaflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadaflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADAFLOWREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADAFLOWREF$8);
            }
            target.set(metadaflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadaflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadaflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADAFLOWREF$8);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadaflowRef" element
     */
    public void unsetMetadaflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADAFLOWREF$8, 0);
        }
    }
    
    /**
     * Gets the "ProvisionAgreementRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType getProvisionAgreementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().find_element_user(PROVISIONAGREEMENTREF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisionAgreementRef" element
     */
    public boolean isSetProvisionAgreementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENTREF$10) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgreementRef" element
     */
    public void setProvisionAgreementRef(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType provisionAgreementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().find_element_user(PROVISIONAGREEMENTREF$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().add_element_user(PROVISIONAGREEMENTREF$10);
            }
            target.set(provisionAgreementRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreementRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType addNewProvisionAgreementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().add_element_user(PROVISIONAGREEMENTREF$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisionAgreementRef" element
     */
    public void unsetProvisionAgreementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENTREF$10, 0);
        }
    }
}
