/*
 * An XML document type.
 * Localname: MetadataSet
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/metadatareport
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.metadatareport.impl;
/**
 * A document containing one MetadataSet(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/metadatareport) element.
 *
 * This is a complex type.
 */
public class MetadataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASET$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/metadatareport", "MetadataSet");
    
    
    /**
     * Gets the "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType getMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().find_element_user(METADATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataSet" element
     */
    public void setMetadataSet(org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().find_element_user(METADATASET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().add_element_user(METADATASET$0);
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType addNewMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.metadatareport.MetadataSetType)get_store().add_element_user(METADATASET$0);
            return target;
        }
    }
}
