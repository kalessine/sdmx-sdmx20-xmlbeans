/*
 * XML Type:  EventSelectorType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML EventSelectorType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class EventSelectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType
{
    private static final long serialVersionUID = 1L;
    
    public EventSelectorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURALREPOSITORYEVENTS$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructuralRepositoryEvents");
    private static final javax.xml.namespace.QName PROVISIONINGREPOSITORYEVENTS$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisioningRepositoryEvents");
    private static final javax.xml.namespace.QName DATAREGISTRATIONEVENTS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataRegistrationEvents");
    private static final javax.xml.namespace.QName METADATAREGISTRATIONEVENTS$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataRegistrationEvents");
    
    
    /**
     * Gets the "StructuralRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType getStructuralRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType)get_store().find_element_user(STRUCTURALREPOSITORYEVENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructuralRepositoryEvents" element
     */
    public boolean isSetStructuralRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURALREPOSITORYEVENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "StructuralRepositoryEvents" element
     */
    public void setStructuralRepositoryEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType structuralRepositoryEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType)get_store().find_element_user(STRUCTURALREPOSITORYEVENTS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType)get_store().add_element_user(STRUCTURALREPOSITORYEVENTS$0);
            }
            target.set(structuralRepositoryEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuralRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType addNewStructuralRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType)get_store().add_element_user(STRUCTURALREPOSITORYEVENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "StructuralRepositoryEvents" element
     */
    public void unsetStructuralRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURALREPOSITORYEVENTS$0, 0);
        }
    }
    
    /**
     * Gets the "ProvisioningRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType getProvisioningRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType)get_store().find_element_user(PROVISIONINGREPOSITORYEVENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisioningRepositoryEvents" element
     */
    public boolean isSetProvisioningRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONINGREPOSITORYEVENTS$2) != 0;
        }
    }
    
    /**
     * Sets the "ProvisioningRepositoryEvents" element
     */
    public void setProvisioningRepositoryEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType provisioningRepositoryEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType)get_store().find_element_user(PROVISIONINGREPOSITORYEVENTS$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType)get_store().add_element_user(PROVISIONINGREPOSITORYEVENTS$2);
            }
            target.set(provisioningRepositoryEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisioningRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType addNewProvisioningRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType)get_store().add_element_user(PROVISIONINGREPOSITORYEVENTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisioningRepositoryEvents" element
     */
    public void unsetProvisioningRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONINGREPOSITORYEVENTS$2, 0);
        }
    }
    
    /**
     * Gets the "DataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType getDataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType)get_store().find_element_user(DATAREGISTRATIONEVENTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataRegistrationEvents" element
     */
    public boolean isSetDataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAREGISTRATIONEVENTS$4) != 0;
        }
    }
    
    /**
     * Sets the "DataRegistrationEvents" element
     */
    public void setDataRegistrationEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType dataRegistrationEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType)get_store().find_element_user(DATAREGISTRATIONEVENTS$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType)get_store().add_element_user(DATAREGISTRATIONEVENTS$4);
            }
            target.set(dataRegistrationEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "DataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType addNewDataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType)get_store().add_element_user(DATAREGISTRATIONEVENTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataRegistrationEvents" element
     */
    public void unsetDataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAREGISTRATIONEVENTS$4, 0);
        }
    }
    
    /**
     * Gets the "MetadataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType getMetadataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType)get_store().find_element_user(METADATAREGISTRATIONEVENTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataRegistrationEvents" element
     */
    public boolean isSetMetadataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAREGISTRATIONEVENTS$6) != 0;
        }
    }
    
    /**
     * Sets the "MetadataRegistrationEvents" element
     */
    public void setMetadataRegistrationEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType metadataRegistrationEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType)get_store().find_element_user(METADATAREGISTRATIONEVENTS$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType)get_store().add_element_user(METADATAREGISTRATIONEVENTS$6);
            }
            target.set(metadataRegistrationEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType addNewMetadataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType)get_store().add_element_user(METADATAREGISTRATIONEVENTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataRegistrationEvents" element
     */
    public void unsetMetadataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAREGISTRATIONEVENTS$6, 0);
        }
    }
}
