/*
 * XML Type:  SeriesType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.generic;


/**
 * An XML SeriesType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic).
 *
 * This is a complex type.
 */
public interface SeriesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeriesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("seriestype4c42type");
    
    /**
     * Gets the "SeriesKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType getSeriesKey();
    
    /**
     * Sets the "SeriesKey" element
     */
    void setSeriesKey(org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType seriesKey);
    
    /**
     * Appends and returns a new empty "SeriesKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType addNewSeriesKey();
    
    /**
     * Gets the "Attributes" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType getAttributes();
    
    /**
     * True if has "Attributes" element
     */
    boolean isSetAttributes();
    
    /**
     * Sets the "Attributes" element
     */
    void setAttributes(org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType attributes);
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType addNewAttributes();
    
    /**
     * Unsets the "Attributes" element
     */
    void unsetAttributes();
    
    /**
     * Gets array of all "Obs" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType[] getObsArray();
    
    /**
     * Gets ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType getObsArray(int i);
    
    /**
     * Returns number of "Obs" element
     */
    int sizeOfObsArray();
    
    /**
     * Sets array of all "Obs" element
     */
    void setObsArray(org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType[] obsArray);
    
    /**
     * Sets ith "Obs" element
     */
    void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType obs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType insertNewObs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType addNewObs();
    
    /**
     * Removes the ith "Obs" element
     */
    void removeObs(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
