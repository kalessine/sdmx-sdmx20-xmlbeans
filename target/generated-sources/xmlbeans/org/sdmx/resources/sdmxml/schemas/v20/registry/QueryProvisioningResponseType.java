/*
 * XML Type:  QueryProvisioningResponseType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry;


/**
 * An XML QueryProvisioningResponseType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public interface QueryProvisioningResponseType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryProvisioningResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("queryprovisioningresponsetype0b05type");
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType[] getProvisionAgreementArray();
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType getProvisionAgreementArray(int i);
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType[] provisionAgreementArray);
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType provisionAgreement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType insertNewProvisionAgreement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType addNewProvisionAgreement();
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);
    
    /**
     * Gets array of all "DataflowRef" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] getDataflowRefArray();
    
    /**
     * Gets ith "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRefArray(int i);
    
    /**
     * Returns number of "DataflowRef" element
     */
    int sizeOfDataflowRefArray();
    
    /**
     * Sets array of all "DataflowRef" element
     */
    void setDataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] dataflowRefArray);
    
    /**
     * Sets ith "DataflowRef" element
     */
    void setDataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType insertNewDataflowRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef();
    
    /**
     * Removes the ith "DataflowRef" element
     */
    void removeDataflowRef(int i);
    
    /**
     * Gets array of all "MetadataflowRef" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] getMetadataflowRefArray();
    
    /**
     * Gets ith "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadataflowRefArray(int i);
    
    /**
     * Returns number of "MetadataflowRef" element
     */
    int sizeOfMetadataflowRefArray();
    
    /**
     * Sets array of all "MetadataflowRef" element
     */
    void setMetadataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] metadataflowRefArray);
    
    /**
     * Sets ith "MetadataflowRef" element
     */
    void setMetadataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadataflowRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType insertNewMetadataflowRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadataflowRef();
    
    /**
     * Removes the ith "MetadataflowRef" element
     */
    void removeMetadataflowRef(int i);
    
    /**
     * Gets array of all "DataProviderRef" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] getDataProviderRefArray();
    
    /**
     * Gets ith "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRefArray(int i);
    
    /**
     * Returns number of "DataProviderRef" element
     */
    int sizeOfDataProviderRefArray();
    
    /**
     * Sets array of all "DataProviderRef" element
     */
    void setDataProviderRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] dataProviderRefArray);
    
    /**
     * Sets ith "DataProviderRef" element
     */
    void setDataProviderRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType dataProviderRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType insertNewDataProviderRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType addNewDataProviderRef();
    
    /**
     * Removes the ith "DataProviderRef" element
     */
    void removeDataProviderRef(int i);
    
    /**
     * Gets the "StatusMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType getStatusMessage();
    
    /**
     * Sets the "StatusMessage" element
     */
    void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType statusMessage);
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.StatusMessageType addNewStatusMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.QueryProvisioningResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
