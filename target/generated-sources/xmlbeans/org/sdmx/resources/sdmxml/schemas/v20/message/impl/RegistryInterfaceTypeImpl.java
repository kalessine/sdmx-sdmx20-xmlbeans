/*
 * XML Type:  RegistryInterfaceType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.RegistryInterfaceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * An XML RegistryInterfaceType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a complex type.
 */
public class RegistryInterfaceTypeImpl extends org.sdmx.resources.sdmxml.schemas.v20.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.RegistryInterfaceType
{
    private static final long serialVersionUID = 1L;
    
    public RegistryInterfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitSubscriptionRequest");
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONRESPONSE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitSubscriptionResponse");
    private static final javax.xml.namespace.QName NOTIFYREGISTRYEVENT$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "NotifyRegistryEvent");
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONREQUEST$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitRegistrationRequest");
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONRESPONSE$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitRegistrationResponse");
    private static final javax.xml.namespace.QName QUERYREGISTRATIONREQUEST$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryRegistrationRequest");
    private static final javax.xml.namespace.QName QUERYREGISTRATIONRESPONSE$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryRegistrationResponse");
    private static final javax.xml.namespace.QName SUBMITSTRUCTUREREQUEST$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitStructureRequest");
    private static final javax.xml.namespace.QName SUBMITSTRUCTURERESPONSE$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitStructureResponse");
    private static final javax.xml.namespace.QName QUERYSTRUCTUREREQUEST$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryStructureRequest");
    private static final javax.xml.namespace.QName QUERYSTRUCTURERESPONSE$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryStructureResponse");
    private static final javax.xml.namespace.QName SUBMITPROVISIONINGREQUEST$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitProvisioningRequest");
    private static final javax.xml.namespace.QName SUBMITPROVISIONINGRESPONSE$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "SubmitProvisioningResponse");
    private static final javax.xml.namespace.QName QUERYPROVISIONINGREQUEST$26 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryProvisioningRequest");
    private static final javax.xml.namespace.QName QUERYPROVISIONINGRESPONSE$28 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "QueryProvisioningResponse");
    
    
    /**
     * Gets the "SubmitSubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType getSubmitSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitSubscriptionRequest" element
     */
    public boolean isSetSubmitSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSUBSCRIPTIONREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionRequest" element
     */
    public void setSubmitSubscriptionRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType submitSubscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONREQUEST$0);
            }
            target.set(submitSubscriptionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType addNewSubmitSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitSubscriptionRequest" element
     */
    public void unsetSubmitSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSUBSCRIPTIONREQUEST$0, 0);
        }
    }
    
    /**
     * Gets the "SubmitSubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType getSubmitSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONRESPONSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitSubscriptionResponse" element
     */
    public boolean isSetSubmitSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSUBSCRIPTIONRESPONSE$2) != 0;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionResponse" element
     */
    public void setSubmitSubscriptionResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType submitSubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONRESPONSE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONRESPONSE$2);
            }
            target.set(submitSubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType addNewSubmitSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitSubscriptionResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONRESPONSE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitSubscriptionResponse" element
     */
    public void unsetSubmitSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSUBSCRIPTIONRESPONSE$2, 0);
        }
    }
    
    /**
     * Gets the "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType getNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NotifyRegistryEvent" element
     */
    public boolean isSetNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFYREGISTRYEVENT$4) != 0;
        }
    }
    
    /**
     * Sets the "NotifyRegistryEvent" element
     */
    public void setNotifyRegistryEvent(org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType notifyRegistryEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$4);
            }
            target.set(notifyRegistryEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType addNewNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "NotifyRegistryEvent" element
     */
    public void unsetNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFYREGISTRYEVENT$4, 0);
        }
    }
    
    /**
     * Gets the "SubmitRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType getSubmitRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType)get_store().find_element_user(SUBMITREGISTRATIONREQUEST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitRegistrationRequest" element
     */
    public boolean isSetSubmitRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITREGISTRATIONREQUEST$6) != 0;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationRequest" element
     */
    public void setSubmitRegistrationRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType submitRegistrationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType)get_store().find_element_user(SUBMITREGISTRATIONREQUEST$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType)get_store().add_element_user(SUBMITREGISTRATIONREQUEST$6);
            }
            target.set(submitRegistrationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType addNewSubmitRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationRequestType)get_store().add_element_user(SUBMITREGISTRATIONREQUEST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitRegistrationRequest" element
     */
    public void unsetSubmitRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITREGISTRATIONREQUEST$6, 0);
        }
    }
    
    /**
     * Gets the "SubmitRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType getSubmitRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType)get_store().find_element_user(SUBMITREGISTRATIONRESPONSE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitRegistrationResponse" element
     */
    public boolean isSetSubmitRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITREGISTRATIONRESPONSE$8) != 0;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationResponse" element
     */
    public void setSubmitRegistrationResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType submitRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType)get_store().find_element_user(SUBMITREGISTRATIONRESPONSE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType)get_store().add_element_user(SUBMITREGISTRATIONRESPONSE$8);
            }
            target.set(submitRegistrationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType addNewSubmitRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitRegistrationResponseType)get_store().add_element_user(SUBMITREGISTRATIONRESPONSE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitRegistrationResponse" element
     */
    public void unsetSubmitRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITREGISTRATIONRESPONSE$8, 0);
        }
    }
    
    /**
     * Gets the "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType getQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryRegistrationRequest" element
     */
    public boolean isSetQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYREGISTRATIONREQUEST$10) != 0;
        }
    }
    
    /**
     * Sets the "QueryRegistrationRequest" element
     */
    public void setQueryRegistrationRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType queryRegistrationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$10);
            }
            target.set(queryRegistrationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType addNewQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryRegistrationRequest" element
     */
    public void unsetQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYREGISTRATIONREQUEST$10, 0);
        }
    }
    
    /**
     * Gets the "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType getQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryRegistrationResponse" element
     */
    public boolean isSetQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYREGISTRATIONRESPONSE$12) != 0;
        }
    }
    
    /**
     * Sets the "QueryRegistrationResponse" element
     */
    public void setQueryRegistrationResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType queryRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$12);
            }
            target.set(queryRegistrationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType addNewQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryRegistrationResponse" element
     */
    public void unsetQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYREGISTRATIONRESPONSE$12, 0);
        }
    }
    
    /**
     * Gets the "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType getSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitStructureRequest" element
     */
    public boolean isSetSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSTRUCTUREREQUEST$14) != 0;
        }
    }
    
    /**
     * Sets the "SubmitStructureRequest" element
     */
    public void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType submitStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$14);
            }
            target.set(submitStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType addNewSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitStructureRequest" element
     */
    public void unsetSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSTRUCTUREREQUEST$14, 0);
        }
    }
    
    /**
     * Gets the "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType getSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitStructureResponse" element
     */
    public boolean isSetSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSTRUCTURERESPONSE$16) != 0;
        }
    }
    
    /**
     * Sets the "SubmitStructureResponse" element
     */
    public void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType submitStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$16);
            }
            target.set(submitStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType addNewSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitStructureResponse" element
     */
    public void unsetSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSTRUCTURERESPONSE$16, 0);
        }
    }
    
    /**
     * Gets the "QueryStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType getQueryStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType)get_store().find_element_user(QUERYSTRUCTUREREQUEST$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryStructureRequest" element
     */
    public boolean isSetQueryStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSTRUCTUREREQUEST$18) != 0;
        }
    }
    
    /**
     * Sets the "QueryStructureRequest" element
     */
    public void setQueryStructureRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType queryStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType)get_store().find_element_user(QUERYSTRUCTUREREQUEST$18, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType)get_store().add_element_user(QUERYSTRUCTUREREQUEST$18);
            }
            target.set(queryStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType addNewQueryStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType)get_store().add_element_user(QUERYSTRUCTUREREQUEST$18);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryStructureRequest" element
     */
    public void unsetQueryStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSTRUCTUREREQUEST$18, 0);
        }
    }
    
    /**
     * Gets the "QueryStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType getQueryStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType)get_store().find_element_user(QUERYSTRUCTURERESPONSE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryStructureResponse" element
     */
    public boolean isSetQueryStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSTRUCTURERESPONSE$20) != 0;
        }
    }
    
    /**
     * Sets the "QueryStructureResponse" element
     */
    public void setQueryStructureResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType queryStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType)get_store().find_element_user(QUERYSTRUCTURERESPONSE$20, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType)get_store().add_element_user(QUERYSTRUCTURERESPONSE$20);
            }
            target.set(queryStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType addNewQueryStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureResponseType)get_store().add_element_user(QUERYSTRUCTURERESPONSE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryStructureResponse" element
     */
    public void unsetQueryStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSTRUCTURERESPONSE$20, 0);
        }
    }
    
    /**
     * Gets the "SubmitProvisioningRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType getSubmitProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType)get_store().find_element_user(SUBMITPROVISIONINGREQUEST$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitProvisioningRequest" element
     */
    public boolean isSetSubmitProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITPROVISIONINGREQUEST$22) != 0;
        }
    }
    
    /**
     * Sets the "SubmitProvisioningRequest" element
     */
    public void setSubmitProvisioningRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType submitProvisioningRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType)get_store().find_element_user(SUBMITPROVISIONINGREQUEST$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType)get_store().add_element_user(SUBMITPROVISIONINGREQUEST$22);
            }
            target.set(submitProvisioningRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitProvisioningRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType addNewSubmitProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningRequestType)get_store().add_element_user(SUBMITPROVISIONINGREQUEST$22);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitProvisioningRequest" element
     */
    public void unsetSubmitProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITPROVISIONINGREQUEST$22, 0);
        }
    }
    
    /**
     * Gets the "SubmitProvisioningResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType getSubmitProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType)get_store().find_element_user(SUBMITPROVISIONINGRESPONSE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitProvisioningResponse" element
     */
    public boolean isSetSubmitProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITPROVISIONINGRESPONSE$24) != 0;
        }
    }
    
    /**
     * Sets the "SubmitProvisioningResponse" element
     */
    public void setSubmitProvisioningResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType submitProvisioningResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType)get_store().find_element_user(SUBMITPROVISIONINGRESPONSE$24, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType)get_store().add_element_user(SUBMITPROVISIONINGRESPONSE$24);
            }
            target.set(submitProvisioningResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitProvisioningResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType addNewSubmitProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitProvisioningResponseType)get_store().add_element_user(SUBMITPROVISIONINGRESPONSE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitProvisioningResponse" element
     */
    public void unsetSubmitProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITPROVISIONINGRESPONSE$24, 0);
        }
    }
    
    /**
     * Gets the "QueryProvisioningRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType getQueryProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType)get_store().find_element_user(QUERYPROVISIONINGREQUEST$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryProvisioningRequest" element
     */
    public boolean isSetQueryProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYPROVISIONINGREQUEST$26) != 0;
        }
    }
    
    /**
     * Sets the "QueryProvisioningRequest" element
     */
    public void setQueryProvisioningRequest(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType queryProvisioningRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType)get_store().find_element_user(QUERYPROVISIONINGREQUEST$26, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType)get_store().add_element_user(QUERYPROVISIONINGREQUEST$26);
            }
            target.set(queryProvisioningRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryProvisioningRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType addNewQueryProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningRequestType)get_store().add_element_user(QUERYPROVISIONINGREQUEST$26);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryProvisioningRequest" element
     */
    public void unsetQueryProvisioningRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYPROVISIONINGREQUEST$26, 0);
        }
    }
    
    /**
     * Gets the "QueryProvisioningResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType getQueryProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType)get_store().find_element_user(QUERYPROVISIONINGRESPONSE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryProvisioningResponse" element
     */
    public boolean isSetQueryProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYPROVISIONINGRESPONSE$28) != 0;
        }
    }
    
    /**
     * Sets the "QueryProvisioningResponse" element
     */
    public void setQueryProvisioningResponse(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType queryProvisioningResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType)get_store().find_element_user(QUERYPROVISIONINGRESPONSE$28, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType)get_store().add_element_user(QUERYPROVISIONINGRESPONSE$28);
            }
            target.set(queryProvisioningResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryProvisioningResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType addNewQueryProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType)get_store().add_element_user(QUERYPROVISIONINGRESPONSE$28);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryProvisioningResponse" element
     */
    public void unsetQueryProvisioningResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYPROVISIONINGRESPONSE$28, 0);
        }
    }
}
