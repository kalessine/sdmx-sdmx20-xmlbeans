/*
 * An XML document type.
 * Localname: UtilityData
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one UtilityData(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class UtilityDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public UtilityDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UTILITYDATA$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "UtilityData");
    
    
    /**
     * Gets the "UtilityData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType getUtilityData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType)get_store().find_element_user(UTILITYDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UtilityData" element
     */
    public void setUtilityData(org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType utilityData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType)get_store().find_element_user(UTILITYDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType)get_store().add_element_user(UTILITYDATA$0);
            }
            target.set(utilityData);
        }
    }
    
    /**
     * Appends and returns a new empty "UtilityData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType addNewUtilityData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.UtilityDataType)get_store().add_element_user(UTILITYDATA$0);
            return target;
        }
    }
}
