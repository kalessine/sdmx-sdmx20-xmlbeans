/*
 * An XML document type.
 * Localname: Series
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.compact.impl;
/**
 * A document containing one Series(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact) element.
 *
 * This is a complex type.
 */
public class SeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public SeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIES$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/compact", "Series");
    
    
    /**
     * Gets the "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType getSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType)get_store().find_element_user(SERIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Series" element
     */
    public void setSeries(org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType)get_store().find_element_user(SERIES$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType)get_store().add_element_user(SERIES$0);
            }
            target.set(series);
        }
    }
    
    /**
     * Appends and returns a new empty "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.compact.SeriesType)get_store().add_element_user(SERIES$0);
            return target;
        }
    }
}
