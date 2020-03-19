/*
 * XML Type:  QueryResultType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML QueryResultType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class QueryResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType
{
    private static final long serialVersionUID = 1L;
    
    public QueryResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATARESULT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataResult");
    private static final javax.xml.namespace.QName METADATARESULT$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataResult");
    private static final javax.xml.namespace.QName STATUSMESSAGE$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StatusMessage");
    private static final javax.xml.namespace.QName TIMESERIESMATCH$6 = 
        new javax.xml.namespace.QName("", "timeSeriesMatch");
    
    
    /**
     * Gets the "DataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType getDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().find_element_user(DATARESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataResult" element
     */
    public boolean isSetDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARESULT$0) != 0;
        }
    }
    
    /**
     * Sets the "DataResult" element
     */
    public void setDataResult(org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType dataResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().find_element_user(DATARESULT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().add_element_user(DATARESULT$0);
            }
            target.set(dataResult);
        }
    }
    
    /**
     * Appends and returns a new empty "DataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType addNewDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().add_element_user(DATARESULT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataResult" element
     */
    public void unsetDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARESULT$0, 0);
        }
    }
    
    /**
     * Gets the "MetadataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType getMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().find_element_user(METADATARESULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataResult" element
     */
    public boolean isSetMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATARESULT$2) != 0;
        }
    }
    
    /**
     * Sets the "MetadataResult" element
     */
    public void setMetadataResult(org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType metadataResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().find_element_user(METADATARESULT$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().add_element_user(METADATARESULT$2);
            }
            target.set(metadataResult);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType addNewMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType)get_store().add_element_user(METADATARESULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataResult" element
     */
    public void unsetMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATARESULT$2, 0);
        }
    }
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StatusMessage" element
     */
    public boolean isSetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSMESSAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$4);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType addNewStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "StatusMessage" element
     */
    public void unsetStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSMESSAGE$4, 0);
        }
    }
    
    /**
     * Gets the "timeSeriesMatch" attribute
     */
    public boolean getTimeSeriesMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESERIESMATCH$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeSeriesMatch" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTimeSeriesMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESERIESMATCH$6);
            return target;
        }
    }
    
    /**
     * Sets the "timeSeriesMatch" attribute
     */
    public void setTimeSeriesMatch(boolean timeSeriesMatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESERIESMATCH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESERIESMATCH$6);
            }
            target.setBooleanValue(timeSeriesMatch);
        }
    }
    
    /**
     * Sets (as xml) the "timeSeriesMatch" attribute
     */
    public void xsetTimeSeriesMatch(org.apache.xmlbeans.XmlBoolean timeSeriesMatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESERIESMATCH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TIMESERIESMATCH$6);
            }
            target.set(timeSeriesMatch);
        }
    }
}
