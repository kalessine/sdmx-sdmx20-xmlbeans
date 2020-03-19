/*
 * XML Type:  TextFormatType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML TextFormatType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface TextFormatType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextFormatType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("textformattype61abtype");
    
    /**
     * Gets the "textType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.Enum getTextType();
    
    /**
     * Gets (as xml) the "textType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType xgetTextType();
    
    /**
     * True if has "textType" attribute
     */
    boolean isSetTextType();
    
    /**
     * Sets the "textType" attribute
     */
    void setTextType(org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.Enum textType);
    
    /**
     * Sets (as xml) the "textType" attribute
     */
    void xsetTextType(org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType textType);
    
    /**
     * Unsets the "textType" attribute
     */
    void unsetTextType();
    
    /**
     * Gets the "isSequence" attribute
     */
    boolean getIsSequence();
    
    /**
     * Gets (as xml) the "isSequence" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsSequence();
    
    /**
     * True if has "isSequence" attribute
     */
    boolean isSetIsSequence();
    
    /**
     * Sets the "isSequence" attribute
     */
    void setIsSequence(boolean isSequence);
    
    /**
     * Sets (as xml) the "isSequence" attribute
     */
    void xsetIsSequence(org.apache.xmlbeans.XmlBoolean isSequence);
    
    /**
     * Unsets the "isSequence" attribute
     */
    void unsetIsSequence();
    
    /**
     * Gets the "minLength" attribute
     */
    java.math.BigInteger getMinLength();
    
    /**
     * Gets (as xml) the "minLength" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetMinLength();
    
    /**
     * True if has "minLength" attribute
     */
    boolean isSetMinLength();
    
    /**
     * Sets the "minLength" attribute
     */
    void setMinLength(java.math.BigInteger minLength);
    
    /**
     * Sets (as xml) the "minLength" attribute
     */
    void xsetMinLength(org.apache.xmlbeans.XmlInteger minLength);
    
    /**
     * Unsets the "minLength" attribute
     */
    void unsetMinLength();
    
    /**
     * Gets the "maxLength" attribute
     */
    java.math.BigInteger getMaxLength();
    
    /**
     * Gets (as xml) the "maxLength" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetMaxLength();
    
    /**
     * True if has "maxLength" attribute
     */
    boolean isSetMaxLength();
    
    /**
     * Sets the "maxLength" attribute
     */
    void setMaxLength(java.math.BigInteger maxLength);
    
    /**
     * Sets (as xml) the "maxLength" attribute
     */
    void xsetMaxLength(org.apache.xmlbeans.XmlInteger maxLength);
    
    /**
     * Unsets the "maxLength" attribute
     */
    void unsetMaxLength();
    
    /**
     * Gets the "startValue" attribute
     */
    double getStartValue();
    
    /**
     * Gets (as xml) the "startValue" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetStartValue();
    
    /**
     * True if has "startValue" attribute
     */
    boolean isSetStartValue();
    
    /**
     * Sets the "startValue" attribute
     */
    void setStartValue(double startValue);
    
    /**
     * Sets (as xml) the "startValue" attribute
     */
    void xsetStartValue(org.apache.xmlbeans.XmlDouble startValue);
    
    /**
     * Unsets the "startValue" attribute
     */
    void unsetStartValue();
    
    /**
     * Gets the "endValue" attribute
     */
    double getEndValue();
    
    /**
     * Gets (as xml) the "endValue" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetEndValue();
    
    /**
     * True if has "endValue" attribute
     */
    boolean isSetEndValue();
    
    /**
     * Sets the "endValue" attribute
     */
    void setEndValue(double endValue);
    
    /**
     * Sets (as xml) the "endValue" attribute
     */
    void xsetEndValue(org.apache.xmlbeans.XmlDouble endValue);
    
    /**
     * Unsets the "endValue" attribute
     */
    void unsetEndValue();
    
    /**
     * Gets the "interval" attribute
     */
    double getInterval();
    
    /**
     * Gets (as xml) the "interval" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetInterval();
    
    /**
     * True if has "interval" attribute
     */
    boolean isSetInterval();
    
    /**
     * Sets the "interval" attribute
     */
    void setInterval(double interval);
    
    /**
     * Sets (as xml) the "interval" attribute
     */
    void xsetInterval(org.apache.xmlbeans.XmlDouble interval);
    
    /**
     * Unsets the "interval" attribute
     */
    void unsetInterval();
    
    /**
     * Gets the "timeInterval" attribute
     */
    org.apache.xmlbeans.GDuration getTimeInterval();
    
    /**
     * Gets (as xml) the "timeInterval" attribute
     */
    org.apache.xmlbeans.XmlDuration xgetTimeInterval();
    
    /**
     * True if has "timeInterval" attribute
     */
    boolean isSetTimeInterval();
    
    /**
     * Sets the "timeInterval" attribute
     */
    void setTimeInterval(org.apache.xmlbeans.GDuration timeInterval);
    
    /**
     * Sets (as xml) the "timeInterval" attribute
     */
    void xsetTimeInterval(org.apache.xmlbeans.XmlDuration timeInterval);
    
    /**
     * Unsets the "timeInterval" attribute
     */
    void unsetTimeInterval();
    
    /**
     * Gets the "decimals" attribute
     */
    java.math.BigInteger getDecimals();
    
    /**
     * Gets (as xml) the "decimals" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetDecimals();
    
    /**
     * True if has "decimals" attribute
     */
    boolean isSetDecimals();
    
    /**
     * Sets the "decimals" attribute
     */
    void setDecimals(java.math.BigInteger decimals);
    
    /**
     * Sets (as xml) the "decimals" attribute
     */
    void xsetDecimals(org.apache.xmlbeans.XmlInteger decimals);
    
    /**
     * Unsets the "decimals" attribute
     */
    void unsetDecimals();
    
    /**
     * Gets the "pattern" attribute
     */
    java.lang.String getPattern();
    
    /**
     * Gets (as xml) the "pattern" attribute
     */
    org.apache.xmlbeans.XmlString xgetPattern();
    
    /**
     * True if has "pattern" attribute
     */
    boolean isSetPattern();
    
    /**
     * Sets the "pattern" attribute
     */
    void setPattern(java.lang.String pattern);
    
    /**
     * Sets (as xml) the "pattern" attribute
     */
    void xsetPattern(org.apache.xmlbeans.XmlString pattern);
    
    /**
     * Unsets the "pattern" attribute
     */
    void unsetPattern();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
