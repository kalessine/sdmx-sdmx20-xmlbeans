/*
 * XML Type:  ComponentMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML ComponentMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface ComponentMapType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentMapType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("componentmaptype1b06type");
    
    /**
     * Gets the "MapConceptRef" element
     */
    java.lang.String getMapConceptRef();
    
    /**
     * Gets (as xml) the "MapConceptRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMapConceptRef();
    
    /**
     * Sets the "MapConceptRef" element
     */
    void setMapConceptRef(java.lang.String mapConceptRef);
    
    /**
     * Sets (as xml) the "MapConceptRef" element
     */
    void xsetMapConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType mapConceptRef);
    
    /**
     * Gets the "MapTargetConceptRef" element
     */
    java.lang.String getMapTargetConceptRef();
    
    /**
     * Gets (as xml) the "MapTargetConceptRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMapTargetConceptRef();
    
    /**
     * Sets the "MapTargetConceptRef" element
     */
    void setMapTargetConceptRef(java.lang.String mapTargetConceptRef);
    
    /**
     * Sets (as xml) the "MapTargetConceptRef" element
     */
    void xsetMapTargetConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType mapTargetConceptRef);
    
    /**
     * Gets the "RepresentationMapRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType getRepresentationMapRef();
    
    /**
     * True if has "RepresentationMapRef" element
     */
    boolean isSetRepresentationMapRef();
    
    /**
     * Sets the "RepresentationMapRef" element
     */
    void setRepresentationMapRef(org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType representationMapRef);
    
    /**
     * Appends and returns a new empty "RepresentationMapRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType addNewRepresentationMapRef();
    
    /**
     * Unsets the "RepresentationMapRef" element
     */
    void unsetRepresentationMapRef();
    
    /**
     * Gets the "ToTextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getToTextFormat();
    
    /**
     * True if has "ToTextFormat" element
     */
    boolean isSetToTextFormat();
    
    /**
     * Sets the "ToTextFormat" element
     */
    void setToTextFormat(org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType toTextFormat);
    
    /**
     * Appends and returns a new empty "ToTextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType addNewToTextFormat();
    
    /**
     * Unsets the "ToTextFormat" element
     */
    void unsetToTextFormat();
    
    /**
     * Gets the "ToValueType" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType.Enum getToValueType();
    
    /**
     * Gets (as xml) the "ToValueType" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType xgetToValueType();
    
    /**
     * True if has "ToValueType" element
     */
    boolean isSetToValueType();
    
    /**
     * Sets the "ToValueType" element
     */
    void setToValueType(org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType.Enum toValueType);
    
    /**
     * Sets (as xml) the "ToValueType" element
     */
    void xsetToValueType(org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType toValueType);
    
    /**
     * Unsets the "ToValueType" element
     */
    void unsetToValueType();
    
    /**
     * Gets the "componentAlias" attribute
     */
    java.lang.String getComponentAlias();
    
    /**
     * Gets (as xml) the "componentAlias" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetComponentAlias();
    
    /**
     * True if has "componentAlias" attribute
     */
    boolean isSetComponentAlias();
    
    /**
     * Sets the "componentAlias" attribute
     */
    void setComponentAlias(java.lang.String componentAlias);
    
    /**
     * Sets (as xml) the "componentAlias" attribute
     */
    void xsetComponentAlias(org.sdmx.resources.sdmxml.schemas.v20.common.IDType componentAlias);
    
    /**
     * Unsets the "componentAlias" attribute
     */
    void unsetComponentAlias();
    
    /**
     * Gets the "preferredLanguage" attribute
     */
    java.lang.String getPreferredLanguage();
    
    /**
     * Gets (as xml) the "preferredLanguage" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetPreferredLanguage();
    
    /**
     * True if has "preferredLanguage" attribute
     */
    boolean isSetPreferredLanguage();
    
    /**
     * Sets the "preferredLanguage" attribute
     */
    void setPreferredLanguage(java.lang.String preferredLanguage);
    
    /**
     * Sets (as xml) the "preferredLanguage" attribute
     */
    void xsetPreferredLanguage(org.apache.xmlbeans.XmlLanguage preferredLanguage);
    
    /**
     * Unsets the "preferredLanguage" attribute
     */
    void unsetPreferredLanguage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
