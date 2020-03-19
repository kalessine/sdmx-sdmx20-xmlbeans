/*
 * XML Type:  NotifyRegistryEventType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML NotifyRegistryEventType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class NotifyRegistryEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType
{
    private static final long serialVersionUID = 1L;
    
    public NotifyRegistryEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTTIME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "EventTime");
    private static final javax.xml.namespace.QName OBJECTURN$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ObjectURN");
    private static final javax.xml.namespace.QName SUBSCRIPTIONURN$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SubscriptionURN");
    private static final javax.xml.namespace.QName EVENTACTION$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "EventAction");
    private static final javax.xml.namespace.QName STRUCTURALEVENT$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructuralEvent");
    private static final javax.xml.namespace.QName PROVISIONINGEVENT$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProvisioningEvent");
    private static final javax.xml.namespace.QName REGISTRATIONEVENT$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "RegistrationEvent");
    
    
    /**
     * Gets the "EventTime" element
     */
    public java.util.Calendar getEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EventTime" element
     */
    public void setEventTime(java.util.Calendar eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTIME$0);
            }
            target.setCalendarValue(eventTime);
        }
    }
    
    /**
     * Sets (as xml) the "EventTime" element
     */
    public void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTTIME$0);
            }
            target.set(eventTime);
        }
    }
    
    /**
     * Gets the "ObjectURN" element
     */
    public java.lang.String getObjectURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTURN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetObjectURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBJECTURN$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ObjectURN" element
     */
    public void setObjectURN(java.lang.String objectURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTURN$2);
            }
            target.setStringValue(objectURN);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectURN" element
     */
    public void xsetObjectURN(org.apache.xmlbeans.XmlAnyURI objectURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBJECTURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(OBJECTURN$2);
            }
            target.set(objectURN);
        }
    }
    
    /**
     * Gets the "SubscriptionURN" element
     */
    public java.lang.String getSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$4, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$4, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONURN$4);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SUBSCRIPTIONURN$4);
            }
            target.set(subscriptionURN);
        }
    }
    
    /**
     * Gets the "EventAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getEventAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTACTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetEventAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_element_user(EVENTACTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EventAction" element
     */
    public void setEventAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum eventAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTACTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTACTION$6);
            }
            target.setEnumValue(eventAction);
        }
    }
    
    /**
     * Sets (as xml) the "EventAction" element
     */
    public void xsetEventAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType eventAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_element_user(EVENTACTION$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().add_element_user(EVENTACTION$6);
            }
            target.set(eventAction);
        }
    }
    
    /**
     * Gets the "StructuralEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType getStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType)get_store().find_element_user(STRUCTURALEVENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructuralEvent" element
     */
    public boolean isSetStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURALEVENT$8) != 0;
        }
    }
    
    /**
     * Sets the "StructuralEvent" element
     */
    public void setStructuralEvent(org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType structuralEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType)get_store().find_element_user(STRUCTURALEVENT$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType)get_store().add_element_user(STRUCTURALEVENT$8);
            }
            target.set(structuralEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuralEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType addNewStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType)get_store().add_element_user(STRUCTURALEVENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "StructuralEvent" element
     */
    public void unsetStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURALEVENT$8, 0);
        }
    }
    
    /**
     * Gets the "ProvisioningEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType getProvisioningEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType)get_store().find_element_user(PROVISIONINGEVENT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisioningEvent" element
     */
    public boolean isSetProvisioningEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONINGEVENT$10) != 0;
        }
    }
    
    /**
     * Sets the "ProvisioningEvent" element
     */
    public void setProvisioningEvent(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType provisioningEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType)get_store().find_element_user(PROVISIONINGEVENT$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType)get_store().add_element_user(PROVISIONINGEVENT$10);
            }
            target.set(provisioningEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisioningEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType addNewProvisioningEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningEventType)get_store().add_element_user(PROVISIONINGEVENT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisioningEvent" element
     */
    public void unsetProvisioningEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONINGEVENT$10, 0);
        }
    }
    
    /**
     * Gets the "RegistrationEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType getRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType)get_store().find_element_user(REGISTRATIONEVENT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RegistrationEvent" element
     */
    public boolean isSetRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONEVENT$12) != 0;
        }
    }
    
    /**
     * Sets the "RegistrationEvent" element
     */
    public void setRegistrationEvent(org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType registrationEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType)get_store().find_element_user(REGISTRATIONEVENT$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType)get_store().add_element_user(REGISTRATIONEVENT$12);
            }
            target.set(registrationEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "RegistrationEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType addNewRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.RegistrationEventType)get_store().add_element_user(REGISTRATIONEVENT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "RegistrationEvent" element
     */
    public void unsetRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONEVENT$12, 0);
        }
    }
}
