/*
 * An XML document type.
 * Localname: GenericMetadata
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one GenericMetadata(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class GenericMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "GenericMetadata");
    
    
    /**
     * Gets the "GenericMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType getGenericMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType)get_store().find_element_user(GENERICMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericMetadata" element
     */
    public void setGenericMetadata(org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType genericMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType)get_store().find_element_user(GENERICMETADATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType)get_store().add_element_user(GENERICMETADATA$0);
            }
            target.set(genericMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType addNewGenericMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.GenericMetadataType)get_store().add_element_user(GENERICMETADATA$0);
            return target;
        }
    }
}
