/*
 * XML Type:  DatasourceType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML DatasourceType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class DatasourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType
{
    private static final long serialVersionUID = 1L;
    
    public DatasourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEDATASOURCE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SimpleDatasource");
    private static final javax.xml.namespace.QName QUERYABLEDATASOURCE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "QueryableDatasource");
    
    
    /**
     * Gets the "SimpleDatasource" element
     */
    public java.lang.String getSimpleDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SimpleDatasource" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSimpleDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SimpleDatasource" element
     */
    public boolean isSetSimpleDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIMPLEDATASOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "SimpleDatasource" element
     */
    public void setSimpleDatasource(java.lang.String simpleDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEDATASOURCE$0);
            }
            target.setStringValue(simpleDatasource);
        }
    }
    
    /**
     * Sets (as xml) the "SimpleDatasource" element
     */
    public void xsetSimpleDatasource(org.apache.xmlbeans.XmlAnyURI simpleDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SIMPLEDATASOURCE$0);
            }
            target.set(simpleDatasource);
        }
    }
    
    /**
     * Unsets the "SimpleDatasource" element
     */
    public void unsetSimpleDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIMPLEDATASOURCE$0, 0);
        }
    }
    
    /**
     * Gets the "QueryableDatasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType getQueryableDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType)get_store().find_element_user(QUERYABLEDATASOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryableDatasource" element
     */
    public boolean isSetQueryableDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYABLEDATASOURCE$2) != 0;
        }
    }
    
    /**
     * Sets the "QueryableDatasource" element
     */
    public void setQueryableDatasource(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType queryableDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType)get_store().find_element_user(QUERYABLEDATASOURCE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType)get_store().add_element_user(QUERYABLEDATASOURCE$2);
            }
            target.set(queryableDatasource);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryableDatasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType addNewQueryableDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType)get_store().add_element_user(QUERYABLEDATASOURCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryableDatasource" element
     */
    public void unsetQueryableDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYABLEDATASOURCE$2, 0);
        }
    }
}
