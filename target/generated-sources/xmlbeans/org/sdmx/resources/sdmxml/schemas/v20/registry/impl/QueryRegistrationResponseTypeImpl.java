/*
 * XML Type:  QueryRegistrationResponseType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML QueryRegistrationResponseType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class QueryRegistrationResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESULT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "QueryResult");
    
    
    /**
     * Gets array of all "QueryResult" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType[] getQueryResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYRESULT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType getQueryResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType)get_store().find_element_user(QUERYRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QueryResult" element
     */
    public int sizeOfQueryResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYRESULT$0);
        }
    }
    
    /**
     * Sets array of all "QueryResult" element
     */
    public void setQueryResultArray(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType[] queryResultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryResultArray, QUERYRESULT$0);
        }
    }
    
    /**
     * Sets ith "QueryResult" element
     */
    public void setQueryResultArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType queryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType)get_store().find_element_user(QUERYRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryResult);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType insertNewQueryResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType)get_store().insert_element_user(QUERYRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType addNewQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryResultType)get_store().add_element_user(QUERYRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "QueryResult" element
     */
    public void removeQueryResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYRESULT$0, i);
        }
    }
}
