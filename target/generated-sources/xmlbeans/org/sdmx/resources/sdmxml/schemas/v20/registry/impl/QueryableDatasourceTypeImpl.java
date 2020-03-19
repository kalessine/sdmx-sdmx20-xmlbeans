/*
 * XML Type:  QueryableDatasourceType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML QueryableDatasourceType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class QueryableDatasourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType
{
    private static final long serialVersionUID = 1L;
    
    public QueryableDatasourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAURL$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataUrl");
    private static final javax.xml.namespace.QName WSDLURL$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "WSDLUrl");
    private static final javax.xml.namespace.QName ISRESTDATASOURCE$4 = 
        new javax.xml.namespace.QName("", "isRESTDatasource");
    private static final javax.xml.namespace.QName ISWEBSERVICEDATASOURCE$6 = 
        new javax.xml.namespace.QName("", "isWebServiceDatasource");
    
    
    /**
     * Gets the "DataUrl" element
     */
    public java.lang.String getDataUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataUrl" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetDataUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATAURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataUrl" element
     */
    public void setDataUrl(java.lang.String dataUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAURL$0);
            }
            target.setStringValue(dataUrl);
        }
    }
    
    /**
     * Sets (as xml) the "DataUrl" element
     */
    public void xsetDataUrl(org.apache.xmlbeans.XmlAnyURI dataUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATAURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DATAURL$0);
            }
            target.set(dataUrl);
        }
    }
    
    /**
     * Gets the "WSDLUrl" element
     */
    public java.lang.String getWSDLUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WSDLUrl" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWSDLUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLURL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "WSDLUrl" element
     */
    public boolean isSetWSDLUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLURL$2) != 0;
        }
    }
    
    /**
     * Sets the "WSDLUrl" element
     */
    public void setWSDLUrl(java.lang.String wsdlUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSDLURL$2);
            }
            target.setStringValue(wsdlUrl);
        }
    }
    
    /**
     * Sets (as xml) the "WSDLUrl" element
     */
    public void xsetWSDLUrl(org.apache.xmlbeans.XmlAnyURI wsdlUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WSDLURL$2);
            }
            target.set(wsdlUrl);
        }
    }
    
    /**
     * Unsets the "WSDLUrl" element
     */
    public void unsetWSDLUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLURL$2, 0);
        }
    }
    
    /**
     * Gets the "isRESTDatasource" attribute
     */
    public boolean getIsRESTDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISRESTDATASOURCE$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isRESTDatasource" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRESTDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISRESTDATASOURCE$4);
            return target;
        }
    }
    
    /**
     * Sets the "isRESTDatasource" attribute
     */
    public void setIsRESTDatasource(boolean isRESTDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISRESTDATASOURCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISRESTDATASOURCE$4);
            }
            target.setBooleanValue(isRESTDatasource);
        }
    }
    
    /**
     * Sets (as xml) the "isRESTDatasource" attribute
     */
    public void xsetIsRESTDatasource(org.apache.xmlbeans.XmlBoolean isRESTDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISRESTDATASOURCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISRESTDATASOURCE$4);
            }
            target.set(isRESTDatasource);
        }
    }
    
    /**
     * Gets the "isWebServiceDatasource" attribute
     */
    public boolean getIsWebServiceDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isWebServiceDatasource" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsWebServiceDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$6);
            return target;
        }
    }
    
    /**
     * Sets the "isWebServiceDatasource" attribute
     */
    public void setIsWebServiceDatasource(boolean isWebServiceDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISWEBSERVICEDATASOURCE$6);
            }
            target.setBooleanValue(isWebServiceDatasource);
        }
    }
    
    /**
     * Sets (as xml) the "isWebServiceDatasource" attribute
     */
    public void xsetIsWebServiceDatasource(org.apache.xmlbeans.XmlBoolean isWebServiceDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISWEBSERVICEDATASOURCE$6);
            }
            target.set(isWebServiceDatasource);
        }
    }
}
