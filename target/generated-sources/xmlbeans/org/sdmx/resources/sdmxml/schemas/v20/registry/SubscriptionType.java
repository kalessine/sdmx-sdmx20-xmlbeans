/*
 * XML Type:  SubscriptionType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry;


/**
 * An XML SubscriptionType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public interface SubscriptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("subscriptiontype368ctype");
    
    /**
     * Gets the "Action" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getAction();
    
    /**
     * Gets (as xml) the "Action" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetAction();
    
    /**
     * Sets the "Action" element
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum action);
    
    /**
     * Sets (as xml) the "Action" element
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType action);
    
    /**
     * Gets the "RegistryURN" element
     */
    java.lang.String getRegistryURN();
    
    /**
     * Gets (as xml) the "RegistryURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetRegistryURN();
    
    /**
     * True if has "RegistryURN" element
     */
    boolean isSetRegistryURN();
    
    /**
     * Sets the "RegistryURN" element
     */
    void setRegistryURN(java.lang.String registryURN);
    
    /**
     * Sets (as xml) the "RegistryURN" element
     */
    void xsetRegistryURN(org.apache.xmlbeans.XmlAnyURI registryURN);
    
    /**
     * Unsets the "RegistryURN" element
     */
    void unsetRegistryURN();
    
    /**
     * Gets the "NotificationMailTo" element
     */
    java.lang.String getNotificationMailTo();
    
    /**
     * Gets (as xml) the "NotificationMailTo" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetNotificationMailTo();
    
    /**
     * True if has "NotificationMailTo" element
     */
    boolean isSetNotificationMailTo();
    
    /**
     * Sets the "NotificationMailTo" element
     */
    void setNotificationMailTo(java.lang.String notificationMailTo);
    
    /**
     * Sets (as xml) the "NotificationMailTo" element
     */
    void xsetNotificationMailTo(org.apache.xmlbeans.XmlAnyURI notificationMailTo);
    
    /**
     * Unsets the "NotificationMailTo" element
     */
    void unsetNotificationMailTo();
    
    /**
     * Gets the "NotificationHTTP" element
     */
    java.lang.String getNotificationHTTP();
    
    /**
     * Gets (as xml) the "NotificationHTTP" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetNotificationHTTP();
    
    /**
     * True if has "NotificationHTTP" element
     */
    boolean isSetNotificationHTTP();
    
    /**
     * Sets the "NotificationHTTP" element
     */
    void setNotificationHTTP(java.lang.String notificationHTTP);
    
    /**
     * Sets (as xml) the "NotificationHTTP" element
     */
    void xsetNotificationHTTP(org.apache.xmlbeans.XmlAnyURI notificationHTTP);
    
    /**
     * Unsets the "NotificationHTTP" element
     */
    void unsetNotificationHTTP();
    
    /**
     * Gets the "SubscriberAssignedID" element
     */
    java.lang.String getSubscriberAssignedID();
    
    /**
     * Gets (as xml) the "SubscriberAssignedID" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetSubscriberAssignedID();
    
    /**
     * True if has "SubscriberAssignedID" element
     */
    boolean isSetSubscriberAssignedID();
    
    /**
     * Sets the "SubscriberAssignedID" element
     */
    void setSubscriberAssignedID(java.lang.String subscriberAssignedID);
    
    /**
     * Sets (as xml) the "SubscriberAssignedID" element
     */
    void xsetSubscriberAssignedID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType subscriberAssignedID);
    
    /**
     * Unsets the "SubscriberAssignedID" element
     */
    void unsetSubscriberAssignedID();
    
    /**
     * Gets the "ValidityPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType getValidityPeriod();
    
    /**
     * Sets the "ValidityPeriod" element
     */
    void setValidityPeriod(org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType validityPeriod);
    
    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ValidityPeriodType addNewValidityPeriod();
    
    /**
     * Gets the "EventSelector" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType getEventSelector();
    
    /**
     * Sets the "EventSelector" element
     */
    void setEventSelector(org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType eventSelector);
    
    /**
     * Appends and returns a new empty "EventSelector" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType addNewEventSelector();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
