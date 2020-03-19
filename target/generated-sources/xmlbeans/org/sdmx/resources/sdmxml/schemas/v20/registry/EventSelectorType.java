/*
 * XML Type:  EventSelectorType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry;


/**
 * An XML EventSelectorType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public interface EventSelectorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventSelectorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("eventselectortype46c2type");
    
    /**
     * Gets the "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType getStructuralRepositoryEvents();
    
    /**
     * True if has "StructuralRepositoryEvents" element
     */
    boolean isSetStructuralRepositoryEvents();
    
    /**
     * Sets the "StructuralRepositoryEvents" element
     */
    void setStructuralRepositoryEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType structuralRepositoryEvents);
    
    /**
     * Appends and returns a new empty "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType addNewStructuralRepositoryEvents();
    
    /**
     * Unsets the "StructuralRepositoryEvents" element
     */
    void unsetStructuralRepositoryEvents();
    
    /**
     * Gets the "ProvisioningRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType getProvisioningRepositoryEvents();
    
    /**
     * True if has "ProvisioningRepositoryEvents" element
     */
    boolean isSetProvisioningRepositoryEvents();
    
    /**
     * Sets the "ProvisioningRepositoryEvents" element
     */
    void setProvisioningRepositoryEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType provisioningRepositoryEvents);
    
    /**
     * Appends and returns a new empty "ProvisioningRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisioningRepositoryEventsType addNewProvisioningRepositoryEvents();
    
    /**
     * Unsets the "ProvisioningRepositoryEvents" element
     */
    void unsetProvisioningRepositoryEvents();
    
    /**
     * Gets the "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType getDataRegistrationEvents();
    
    /**
     * True if has "DataRegistrationEvents" element
     */
    boolean isSetDataRegistrationEvents();
    
    /**
     * Sets the "DataRegistrationEvents" element
     */
    void setDataRegistrationEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType dataRegistrationEvents);
    
    /**
     * Appends and returns a new empty "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataRegistrationEventsType addNewDataRegistrationEvents();
    
    /**
     * Unsets the "DataRegistrationEvents" element
     */
    void unsetDataRegistrationEvents();
    
    /**
     * Gets the "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType getMetadataRegistrationEvents();
    
    /**
     * True if has "MetadataRegistrationEvents" element
     */
    boolean isSetMetadataRegistrationEvents();
    
    /**
     * Sets the "MetadataRegistrationEvents" element
     */
    void setMetadataRegistrationEvents(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType metadataRegistrationEvents);
    
    /**
     * Appends and returns a new empty "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataRegistrationEventsType addNewMetadataRegistrationEvents();
    
    /**
     * Unsets the "MetadataRegistrationEvents" element
     */
    void unsetMetadataRegistrationEvents();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
