/*
 * XML Type:  PrimaryMeasureType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML PrimaryMeasureType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface PrimaryMeasureType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimaryMeasureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("primarymeasuretypecaa3type");
    
    /**
     * Gets the "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getTextFormat();
    
    /**
     * True if has "TextFormat" element
     */
    boolean isSetTextFormat();
    
    /**
     * Sets the "TextFormat" element
     */
    void setTextFormat(org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType textFormat);
    
    /**
     * Appends and returns a new empty "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType addNewTextFormat();
    
    /**
     * Unsets the "TextFormat" element
     */
    void unsetTextFormat();
    
    /**
     * Gets the "Annotations" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType getAnnotations();
    
    /**
     * True if has "Annotations" element
     */
    boolean isSetAnnotations();
    
    /**
     * Sets the "Annotations" element
     */
    void setAnnotations(org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType annotations);
    
    /**
     * Appends and returns a new empty "Annotations" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType addNewAnnotations();
    
    /**
     * Unsets the "Annotations" element
     */
    void unsetAnnotations();
    
    /**
     * Gets the "conceptRef" attribute
     */
    java.lang.String getConceptRef();
    
    /**
     * Gets (as xml) the "conceptRef" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptRef();
    
    /**
     * Sets the "conceptRef" attribute
     */
    void setConceptRef(java.lang.String conceptRef);
    
    /**
     * Sets (as xml) the "conceptRef" attribute
     */
    void xsetConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptRef);
    
    /**
     * Gets the "conceptVersion" attribute
     */
    java.lang.String getConceptVersion();
    
    /**
     * Gets (as xml) the "conceptVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetConceptVersion();
    
    /**
     * True if has "conceptVersion" attribute
     */
    boolean isSetConceptVersion();
    
    /**
     * Sets the "conceptVersion" attribute
     */
    void setConceptVersion(java.lang.String conceptVersion);
    
    /**
     * Sets (as xml) the "conceptVersion" attribute
     */
    void xsetConceptVersion(org.apache.xmlbeans.XmlString conceptVersion);
    
    /**
     * Unsets the "conceptVersion" attribute
     */
    void unsetConceptVersion();
    
    /**
     * Gets the "conceptAgency" attribute
     */
    java.lang.String getConceptAgency();
    
    /**
     * Gets (as xml) the "conceptAgency" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptAgency();
    
    /**
     * True if has "conceptAgency" attribute
     */
    boolean isSetConceptAgency();
    
    /**
     * Sets the "conceptAgency" attribute
     */
    void setConceptAgency(java.lang.String conceptAgency);
    
    /**
     * Sets (as xml) the "conceptAgency" attribute
     */
    void xsetConceptAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptAgency);
    
    /**
     * Unsets the "conceptAgency" attribute
     */
    void unsetConceptAgency();
    
    /**
     * Gets the "conceptSchemeRef" attribute
     */
    java.lang.String getConceptSchemeRef();
    
    /**
     * Gets (as xml) the "conceptSchemeRef" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptSchemeRef();
    
    /**
     * True if has "conceptSchemeRef" attribute
     */
    boolean isSetConceptSchemeRef();
    
    /**
     * Sets the "conceptSchemeRef" attribute
     */
    void setConceptSchemeRef(java.lang.String conceptSchemeRef);
    
    /**
     * Sets (as xml) the "conceptSchemeRef" attribute
     */
    void xsetConceptSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptSchemeRef);
    
    /**
     * Unsets the "conceptSchemeRef" attribute
     */
    void unsetConceptSchemeRef();
    
    /**
     * Gets the "conceptSchemeAgency" attribute
     */
    java.lang.String getConceptSchemeAgency();
    
    /**
     * Gets (as xml) the "conceptSchemeAgency" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptSchemeAgency();
    
    /**
     * True if has "conceptSchemeAgency" attribute
     */
    boolean isSetConceptSchemeAgency();
    
    /**
     * Sets the "conceptSchemeAgency" attribute
     */
    void setConceptSchemeAgency(java.lang.String conceptSchemeAgency);
    
    /**
     * Sets (as xml) the "conceptSchemeAgency" attribute
     */
    void xsetConceptSchemeAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptSchemeAgency);
    
    /**
     * Unsets the "conceptSchemeAgency" attribute
     */
    void unsetConceptSchemeAgency();
    
    /**
     * Gets the "codelist" attribute
     */
    java.lang.String getCodelist();
    
    /**
     * Gets (as xml) the "codelist" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelist();
    
    /**
     * True if has "codelist" attribute
     */
    boolean isSetCodelist();
    
    /**
     * Sets the "codelist" attribute
     */
    void setCodelist(java.lang.String codelist);
    
    /**
     * Sets (as xml) the "codelist" attribute
     */
    void xsetCodelist(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelist);
    
    /**
     * Unsets the "codelist" attribute
     */
    void unsetCodelist();
    
    /**
     * Gets the "codelistVersion" attribute
     */
    java.lang.String getCodelistVersion();
    
    /**
     * Gets (as xml) the "codelistVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetCodelistVersion();
    
    /**
     * True if has "codelistVersion" attribute
     */
    boolean isSetCodelistVersion();
    
    /**
     * Sets the "codelistVersion" attribute
     */
    void setCodelistVersion(java.lang.String codelistVersion);
    
    /**
     * Sets (as xml) the "codelistVersion" attribute
     */
    void xsetCodelistVersion(org.apache.xmlbeans.XmlString codelistVersion);
    
    /**
     * Unsets the "codelistVersion" attribute
     */
    void unsetCodelistVersion();
    
    /**
     * Gets the "codelistAgency" attribute
     */
    java.lang.String getCodelistAgency();
    
    /**
     * Gets (as xml) the "codelistAgency" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelistAgency();
    
    /**
     * True if has "codelistAgency" attribute
     */
    boolean isSetCodelistAgency();
    
    /**
     * Sets the "codelistAgency" attribute
     */
    void setCodelistAgency(java.lang.String codelistAgency);
    
    /**
     * Sets (as xml) the "codelistAgency" attribute
     */
    void xsetCodelistAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelistAgency);
    
    /**
     * Unsets the "codelistAgency" attribute
     */
    void unsetCodelistAgency();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
