/*
 * An XML document type.
 * Localname: Section
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/cross
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.cross.SectionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.cross.impl;
/**
 * A document containing one Section(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/cross) element.
 *
 * This is a complex type.
 */
public class SectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.cross.SectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/cross", "Section");
    
    
    /**
     * Gets the "Section" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType getSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType)get_store().find_element_user(SECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Section" element
     */
    public void setSection(org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType section)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType)get_store().find_element_user(SECTION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType)get_store().add_element_user(SECTION$0);
            }
            target.set(section);
        }
    }
    
    /**
     * Appends and returns a new empty "Section" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.cross.SectionType)get_store().add_element_user(SECTION$0);
            return target;
        }
    }
}
