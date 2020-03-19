/*
 * XML Type:  ResultType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML ResultType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class ResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType
{
    private static final long serialVersionUID = 1L;
    
    public ResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASOURCE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Datasource");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisionAgreementRef");
    private static final javax.xml.namespace.QName DATAFLOWREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADATAFLOWREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowRef");
    private static final javax.xml.namespace.QName DATAPROVIDERREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderRef");
    
    
    /**
     * Gets the "Datasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType getDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().find_element_user(DATASOURCE$0, 0);
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
            return get_store().count_elements(DATASOURCE$0) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().find_element_user(DATASOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().add_element_user(DATASOURCE$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType)get_store().add_element_user(DATASOURCE$0);
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
            get_store().remove_element(DATASOURCE$0, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().find_element_user(PROVISIONAGREEMENTREF$2, 0);
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
            return get_store().count_elements(PROVISIONAGREEMENTREF$2) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().find_element_user(PROVISIONAGREEMENTREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().add_element_user(PROVISIONAGREEMENTREF$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType)get_store().add_element_user(PROVISIONAGREEMENTREF$2);
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
            get_store().remove_element(PROVISIONAGREEMENTREF$2, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$4, 0);
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
            return get_store().count_elements(DATAFLOWREF$4) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$4);
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
            get_store().remove_element(DATAFLOWREF$4, 0);
        }
    }
    
    /**
     * Gets the "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(METADATAFLOWREF$6, 0);
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
            return get_store().count_elements(METADATAFLOWREF$6) != 0;
        }
    }
    
    /**
     * Sets the "MetadataflowRef" element
     */
    public void setMetadataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType metadataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(METADATAFLOWREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(METADATAFLOWREF$6);
            }
            target.set(metadataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(METADATAFLOWREF$6);
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
            get_store().remove_element(METADATAFLOWREF$6, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$8, 0);
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
            return get_store().count_elements(DATAPROVIDERREF$8) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$8);
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
            get_store().remove_element(DATAPROVIDERREF$8, 0);
        }
    }
}
