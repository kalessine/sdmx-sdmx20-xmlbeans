/*
 * XML Type:  AttributeValueSetType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata;


/**
 * An XML AttributeValueSetType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is a complex type.
 */
public interface AttributeValueSetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeValueSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("attributevaluesettype18b5type");
    
    /**
     * Gets the "TargetRef" element
     */
    java.lang.String getTargetRef();
    
    /**
     * Gets (as xml) the "TargetRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetTargetRef();
    
    /**
     * Sets the "TargetRef" element
     */
    void setTargetRef(java.lang.String targetRef);
    
    /**
     * Sets (as xml) the "TargetRef" element
     */
    void xsetTargetRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType targetRef);
    
    /**
     * Gets the "TargetValues" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType getTargetValues();
    
    /**
     * Sets the "TargetValues" element
     */
    void setTargetValues(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType targetValues);
    
    /**
     * Appends and returns a new empty "TargetValues" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType addNewTargetValues();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
