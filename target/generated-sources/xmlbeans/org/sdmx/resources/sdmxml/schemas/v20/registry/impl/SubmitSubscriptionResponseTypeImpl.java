/*
 * XML Type:  SubmitSubscriptionResponseType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmitSubscriptionResponseType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONURN$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SubscriptionURN");
    private static final javax.xml.namespace.QName SUBSCRIBERASSIGNEDID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SubscriberAssignedID");
    private static final javax.xml.namespace.QName SUBSCRIPTIONSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SubscriptionStatus");
    
    
    /**
     * Gets the "SubscriptionURN" element
     */
    public java.lang.String getSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriptionURN" element
     */
    public boolean isSetSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONURN$0) != 0;
        }
    }
    
    /**
     * Sets the "SubscriptionURN" element
     */
    public void setSubscriptionURN(java.lang.String subscriptionURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONURN$0);
            }
            target.setStringValue(subscriptionURN);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    public void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SUBSCRIPTIONURN$0);
            }
            target.set(subscriptionURN);
        }
    }
    
    /**
     * Unsets the "SubscriptionURN" element
     */
    public void unsetSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONURN$0, 0);
        }
    }
    
    /**
     * Gets the "SubscriberAssignedID" element
     */
    public java.lang.String getSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberAssignedID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberAssignedID" element
     */
    public boolean isSetSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERASSIGNEDID$2) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberAssignedID" element
     */
    public void setSubscriberAssignedID(java.lang.String subscriberAssignedID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERASSIGNEDID$2);
            }
            target.setStringValue(subscriberAssignedID);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberAssignedID" element
     */
    public void xsetSubscriberAssignedID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType subscriberAssignedID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(SUBSCRIBERASSIGNEDID$2);
            }
            target.set(subscriberAssignedID);
        }
    }
    
    /**
     * Unsets the "SubscriberAssignedID" element
     */
    public void unsetSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERASSIGNEDID$2, 0);
        }
    }
    
    /**
     * Gets the "SubscriptionStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType getSubscriptionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(SUBSCRIPTIONSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriptionStatus" element
     */
    public void setSubscriptionStatus(org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType subscriptionStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().find_element_user(SUBSCRIPTIONSTATUS$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(SUBSCRIPTIONSTATUS$4);
            }
            target.set(subscriptionStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriptionStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType addNewSubscriptionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType)get_store().add_element_user(SUBSCRIPTIONSTATUS$4);
            return target;
        }
    }
}
