/*
 * XML Type:  ResultType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry;


/**
 * An XML ResultType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public interface ResultType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("resulttyped4cctype");
    
    /**
     * Gets the "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType getDatasource();
    
    /**
     * True if has "Datasource" element
     */
    boolean isSetDatasource();
    
    /**
     * Sets the "Datasource" element
     */
    void setDatasource(org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType datasource);
    
    /**
     * Appends and returns a new empty "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DatasourceType addNewDatasource();
    
    /**
     * Unsets the "Datasource" element
     */
    void unsetDatasource();
    
    /**
     * Gets the "ProvisionAgreementRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType getProvisionAgreementRef();
    
    /**
     * True if has "ProvisionAgreementRef" element
     */
    boolean isSetProvisionAgreementRef();
    
    /**
     * Sets the "ProvisionAgreementRef" element
     */
    void setProvisionAgreementRef(org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType provisionAgreementRef);
    
    /**
     * Appends and returns a new empty "ProvisionAgreementRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementRefType addNewProvisionAgreementRef();
    
    /**
     * Unsets the "ProvisionAgreementRef" element
     */
    void unsetProvisionAgreementRef();
    
    /**
     * Gets the "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRef();
    
    /**
     * True if has "DataflowRef" element
     */
    boolean isSetDataflowRef();
    
    /**
     * Sets the "DataflowRef" element
     */
    void setDataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef);
    
    /**
     * Appends and returns a new empty "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef();
    
    /**
     * Unsets the "DataflowRef" element
     */
    void unsetDataflowRef();
    
    /**
     * Gets the "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getMetadataflowRef();
    
    /**
     * True if has "MetadataflowRef" element
     */
    boolean isSetMetadataflowRef();
    
    /**
     * Sets the "MetadataflowRef" element
     */
    void setMetadataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType metadataflowRef);
    
    /**
     * Appends and returns a new empty "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewMetadataflowRef();
    
    /**
     * Unsets the "MetadataflowRef" element
     */
    void unsetMetadataflowRef();
    
    /**
     * Gets the "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRef();
    
    /**
     * True if has "DataProviderRef" element
     */
    boolean isSetDataProviderRef();
    
    /**
     * Sets the "DataProviderRef" element
     */
    void setDataProviderRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType dataProviderRef);
    
    /**
     * Appends and returns a new empty "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType addNewDataProviderRef();
    
    /**
     * Unsets the "DataProviderRef" element
     */
    void unsetDataProviderRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
