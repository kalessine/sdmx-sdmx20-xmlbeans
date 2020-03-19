/*
 * An XML document type.
 * Localname: Obs
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.compact.ObsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.compact.impl;
/**
 * A document containing one Obs(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact) element.
 *
 * This is a complex type.
 */
public class ObsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.compact.ObsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBS$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact", "Obs");
    
    
    /**
     * Gets the "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType getObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType)get_store().find_element_user(OBS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Obs" element
     */
    public void setObs(org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType obs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType)get_store().find_element_user(OBS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType)get_store().add_element_user(OBS$0);
            }
            target.set(obs);
        }
    }
    
    /**
     * Appends and returns a new empty "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType addNewObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.ObsType)get_store().add_element_user(OBS$0);
            return target;
        }
    }
}
