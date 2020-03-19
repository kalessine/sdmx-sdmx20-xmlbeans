/*
 * XML Type:  AttachmentConstraintRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentConstraintRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML AttachmentConstraintRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class AttachmentConstraintRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentConstraintRefType
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentConstraintRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFLOWREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataflowRef");
    private static final javax.xml.namespace.QName METADATAFLOWREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MetadataflowRef");
    private static final javax.xml.namespace.QName DATAPROVIDERREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "DataProviderRef");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ProvisionAgreementRef");
    private static final javax.xml.namespace.QName CONSTRAINTREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ConstraintRef");
    
    
    /**
     * Gets the "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType getDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType)get_store().find_element_user(DATAFLOWREF$0, 0);
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
            return get_store().count_elements(DATAFLOWREF$0) != 0;
        }
    }
    
    /**
     * Sets the "DataflowRef" element
     */
    public void setDataflowRef(org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType dataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType)get_store().find_element_user(DATAFLOWREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType)get_store().add_element_user(DATAFLOWREF$0);
            }
            target.set(dataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType addNewDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowRefType)get_store().add_element_user(DATAFLOWREF$0);
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
            get_store().remove_element(DATAFLOWREF$0, 0);
        }
    }
    
    /**
     * Gets the "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType getMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$2, 0);
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
            return get_store().count_elements(METADATAFLOWREF$2) != 0;
        }
    }
    
    /**
     * Sets the "MetadataflowRef" element
     */
    public void setMetadataflowRef(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType metadataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$2);
            }
            target.set(metadataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType addNewMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$2);
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
            get_store().remove_element(METADATAFLOWREF$2, 0);
        }
    }
    
    /**
     * Gets the "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType getDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$4, 0);
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
    public void setDataProviderRef(org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType dataProviderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$4);
            }
            target.set(dataProviderRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType addNewDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$4);
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
     * Gets the "ProvisionAgreementRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType getProvisionAgreementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType)get_store().find_element_user(PROVISIONAGREEMENTREF$6, 0);
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
            return get_store().count_elements(PROVISIONAGREEMENTREF$6) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgreementRef" element
     */
    public void setProvisionAgreementRef(org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType provisionAgreementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType)get_store().find_element_user(PROVISIONAGREEMENTREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType)get_store().add_element_user(PROVISIONAGREEMENTREF$6);
            }
            target.set(provisionAgreementRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreementRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType addNewProvisionAgreementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProvisionAgreementRefType)get_store().add_element_user(PROVISIONAGREEMENTREF$6);
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
            get_store().remove_element(PROVISIONAGREEMENTREF$6, 0);
        }
    }
    
    /**
     * Gets the "ConstraintRef" element
     */
    public java.lang.String getConstraintRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConstraintRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConstraintRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CONSTRAINTREF$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintRef" element
     */
    public void setConstraintRef(java.lang.String constraintRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTREF$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTRAINTREF$8);
            }
            target.setStringValue(constraintRef);
        }
    }
    
    /**
     * Sets (as xml) the "ConstraintRef" element
     */
    public void xsetConstraintRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType constraintRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CONSTRAINTREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CONSTRAINTREF$8);
            }
            target.set(constraintRef);
        }
    }
}
