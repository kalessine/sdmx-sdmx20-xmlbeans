/*
 * XML Type:  SubscriptionType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubscriptionType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubscriptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Action");
    private static final javax.xml.namespace.QName REGISTRYURN$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "RegistryURN");
    private static final javax.xml.namespace.QName NOTIFICATIONMAILTO$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "NotificationMailTo");
    private static final javax.xml.namespace.QName NOTIFICATIONHTTP$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "NotificationHTTP");
    private static final javax.xml.namespace.QName SUBSCRIBERASSIGNEDID$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SubscriberAssignedID");
    private static final javax.xml.namespace.QName VALIDITYPERIOD$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ValidityPeriod");
    private static final javax.xml.namespace.QName EVENTSELECTOR$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "EventSelector");
    
    
    /**
     * Gets the "Action" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Action" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_element_user(ACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Action" element
     */
    public void setAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$0);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "Action" element
     */
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().add_element_user(ACTION$0);
            }
            target.set(action);
        }
    }
    
    /**
     * Gets the "RegistryURN" element
     */
    public java.lang.String getRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYURN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegistryURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REGISTRYURN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RegistryURN" element
     */
    public boolean isSetRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRYURN$2) != 0;
        }
    }
    
    /**
     * Sets the "RegistryURN" element
     */
    public void setRegistryURN(java.lang.String registryURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRYURN$2);
            }
            target.setStringValue(registryURN);
        }
    }
    
    /**
     * Sets (as xml) the "RegistryURN" element
     */
    public void xsetRegistryURN(org.apache.xmlbeans.XmlAnyURI registryURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REGISTRYURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REGISTRYURN$2);
            }
            target.set(registryURN);
        }
    }
    
    /**
     * Unsets the "RegistryURN" element
     */
    public void unsetRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRYURN$2, 0);
        }
    }
    
    /**
     * Gets the "NotificationMailTo" element
     */
    public java.lang.String getNotificationMailTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONMAILTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationMailTo" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNotificationMailTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NOTIFICATIONMAILTO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "NotificationMailTo" element
     */
    public boolean isSetNotificationMailTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONMAILTO$4) != 0;
        }
    }
    
    /**
     * Sets the "NotificationMailTo" element
     */
    public void setNotificationMailTo(java.lang.String notificationMailTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONMAILTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONMAILTO$4);
            }
            target.setStringValue(notificationMailTo);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationMailTo" element
     */
    public void xsetNotificationMailTo(org.apache.xmlbeans.XmlAnyURI notificationMailTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NOTIFICATIONMAILTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(NOTIFICATIONMAILTO$4);
            }
            target.set(notificationMailTo);
        }
    }
    
    /**
     * Unsets the "NotificationMailTo" element
     */
    public void unsetNotificationMailTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONMAILTO$4, 0);
        }
    }
    
    /**
     * Gets the "NotificationHTTP" element
     */
    public java.lang.String getNotificationHTTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONHTTP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NotificationHTTP" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNotificationHTTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NOTIFICATIONHTTP$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NotificationHTTP" element
     */
    public boolean isSetNotificationHTTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONHTTP$6) != 0;
        }
    }
    
    /**
     * Sets the "NotificationHTTP" element
     */
    public void setNotificationHTTP(java.lang.String notificationHTTP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONHTTP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONHTTP$6);
            }
            target.setStringValue(notificationHTTP);
        }
    }
    
    /**
     * Sets (as xml) the "NotificationHTTP" element
     */
    public void xsetNotificationHTTP(org.apache.xmlbeans.XmlAnyURI notificationHTTP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(NOTIFICATIONHTTP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(NOTIFICATIONHTTP$6);
            }
            target.set(notificationHTTP);
        }
    }
    
    /**
     * Unsets the "NotificationHTTP" element
     */
    public void unsetNotificationHTTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONHTTP$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
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
            return get_store().count_elements(SUBSCRIBERASSIGNEDID$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERASSIGNEDID$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(SUBSCRIBERASSIGNEDID$8);
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
            get_store().remove_element(SUBSCRIBERASSIGNEDID$8, 0);
        }
    }
    
    /**
     * Gets the "ValidityPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType getValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType)get_store().find_element_user(VALIDITYPERIOD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidityPeriod" element
     */
    public void setValidityPeriod(org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType validityPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType)get_store().find_element_user(VALIDITYPERIOD$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType)get_store().add_element_user(VALIDITYPERIOD$10);
            }
            target.set(validityPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType addNewValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType)get_store().add_element_user(VALIDITYPERIOD$10);
            return target;
        }
    }
    
    /**
     * Gets the "EventSelector" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType getEventSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType)get_store().find_element_user(EVENTSELECTOR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventSelector" element
     */
    public void setEventSelector(org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType eventSelector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType)get_store().find_element_user(EVENTSELECTOR$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType)get_store().add_element_user(EVENTSELECTOR$12);
            }
            target.set(eventSelector);
        }
    }
    
    /**
     * Appends and returns a new empty "EventSelector" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType addNewEventSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType)get_store().add_element_user(EVENTSELECTOR$12);
            return target;
        }
    }
}
