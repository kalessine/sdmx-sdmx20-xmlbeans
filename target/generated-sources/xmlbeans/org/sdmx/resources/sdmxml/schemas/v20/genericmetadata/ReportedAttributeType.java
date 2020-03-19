/*
 * XML Type:  ReportedAttributeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata;


/**
 * An XML ReportedAttributeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is a complex type.
 */
public interface ReportedAttributeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportedAttributeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("reportedattributetypef2d1type");
    
    /**
     * Gets array of all "Value" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getValueArray();
    
    /**
     * Gets ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType getValueArray(int i);
    
    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();
    
    /**
     * Sets array of all "Value" element
     */
    void setValueArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] valueArray);
    
    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType value);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewValue();
    
    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
    
    /**
     * Gets the "StartTime" element
     */
    java.util.Calendar getStartTime();
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartTime();
    
    /**
     * True if has "StartTime" element
     */
    boolean isSetStartTime();
    
    /**
     * Sets the "StartTime" element
     */
    void setStartTime(java.util.Calendar startTime);
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
    
    /**
     * Unsets the "StartTime" element
     */
    void unsetStartTime();
    
    /**
     * Gets array of all "ReportedAttribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType[] getReportedAttributeArray();
    
    /**
     * Gets ith "ReportedAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType getReportedAttributeArray(int i);
    
    /**
     * Returns number of "ReportedAttribute" element
     */
    int sizeOfReportedAttributeArray();
    
    /**
     * Sets array of all "ReportedAttribute" element
     */
    void setReportedAttributeArray(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType[] reportedAttributeArray);
    
    /**
     * Sets ith "ReportedAttribute" element
     */
    void setReportedAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType reportedAttribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportedAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType insertNewReportedAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportedAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType addNewReportedAttribute();
    
    /**
     * Removes the ith "ReportedAttribute" element
     */
    void removeReportedAttribute(int i);
    
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
     * Gets the "conceptID" attribute
     */
    java.lang.String getConceptID();
    
    /**
     * Gets (as xml) the "conceptID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptID();
    
    /**
     * Sets the "conceptID" attribute
     */
    void setConceptID(java.lang.String conceptID);
    
    /**
     * Sets (as xml) the "conceptID" attribute
     */
    void xsetConceptID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
