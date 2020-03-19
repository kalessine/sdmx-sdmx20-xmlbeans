/*
 * An XML document type.
 * Localname: MetadataReport
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one MetadataReport(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class MetadataReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAREPORT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "MetadataReport");
    
    
    /**
     * Gets the "MetadataReport" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType getMetadataReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType)get_store().find_element_user(METADATAREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataReport" element
     */
    public void setMetadataReport(org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType metadataReport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType)get_store().find_element_user(METADATAREPORT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType)get_store().add_element_user(METADATAREPORT$0);
            }
            target.set(metadataReport);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataReport" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType addNewMetadataReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.MetadataReportType)get_store().add_element_user(METADATAREPORT$0);
            return target;
        }
    }
}
