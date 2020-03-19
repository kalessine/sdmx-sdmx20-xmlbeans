/*
 * XML Type:  SubmitSubscriptionRequestType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmitSubscriptionRequestType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Subscription");
    
    
    /**
     * Gets array of all "Subscription" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType[] getSubscriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIPTION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType getSubscriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType)get_store().find_element_user(SUBSCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Subscription" element
     */
    public int sizeOfSubscriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "Subscription" element
     */
    public void setSubscriptionArray(org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType[] subscriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscriptionArray, SUBSCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "Subscription" element
     */
    public void setSubscriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType subscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType)get_store().find_element_user(SUBSCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType insertNewSubscription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType)get_store().insert_element_user(SUBSCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType addNewSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType)get_store().add_element_user(SUBSCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Subscription" element
     */
    public void removeSubscription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTION$0, i);
        }
    }
}
