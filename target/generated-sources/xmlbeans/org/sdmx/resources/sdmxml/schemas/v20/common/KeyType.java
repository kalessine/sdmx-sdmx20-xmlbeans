/*
 * XML Type:  KeyType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.KeyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common;


/**
 * An XML KeyType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a complex type.
 */
public interface KeyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("keytype5ceatype");
    
    /**
     * Gets array of all "ComponentRef" elements
     */
    java.lang.String[] getComponentRefArray();
    
    /**
     * Gets ith "ComponentRef" element
     */
    java.lang.String getComponentRefArray(int i);
    
    /**
     * Gets (as xml) array of all "ComponentRef" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetComponentRefArray();
    
    /**
     * Gets (as xml) ith "ComponentRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetComponentRefArray(int i);
    
    /**
     * Returns number of "ComponentRef" element
     */
    int sizeOfComponentRefArray();
    
    /**
     * Sets array of all "ComponentRef" element
     */
    void setComponentRefArray(java.lang.String[] componentRefArray);
    
    /**
     * Sets ith "ComponentRef" element
     */
    void setComponentRefArray(int i, java.lang.String componentRef);
    
    /**
     * Sets (as xml) array of all "ComponentRef" element
     */
    void xsetComponentRefArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] componentRefArray);
    
    /**
     * Sets (as xml) ith "ComponentRef" element
     */
    void xsetComponentRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType componentRef);
    
    /**
     * Inserts the value as the ith "ComponentRef" element
     */
    void insertComponentRef(int i, java.lang.String componentRef);
    
    /**
     * Appends the value as the last "ComponentRef" element
     */
    void addComponentRef(java.lang.String componentRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewComponentRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewComponentRef();
    
    /**
     * Removes the ith "ComponentRef" element
     */
    void removeComponentRef(int i);
    
    /**
     * Gets array of all "Value" elements
     */
    java.lang.String[] getValueArray();
    
    /**
     * Gets ith "Value" element
     */
    java.lang.String getValueArray(int i);
    
    /**
     * Gets (as xml) array of all "Value" elements
     */
    org.apache.xmlbeans.XmlString[] xgetValueArray();
    
    /**
     * Gets (as xml) ith "Value" element
     */
    org.apache.xmlbeans.XmlString xgetValueArray(int i);
    
    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();
    
    /**
     * Sets array of all "Value" element
     */
    void setValueArray(java.lang.String[] valueArray);
    
    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, java.lang.String value);
    
    /**
     * Sets (as xml) array of all "Value" element
     */
    void xsetValueArray(org.apache.xmlbeans.XmlString[] valueArray);
    
    /**
     * Sets (as xml) ith "Value" element
     */
    void xsetValueArray(int i, org.apache.xmlbeans.XmlString value);
    
    /**
     * Inserts the value as the ith "Value" element
     */
    void insertValue(int i, java.lang.String value);
    
    /**
     * Appends the value as the last "Value" element
     */
    void addValue(java.lang.String value);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.apache.xmlbeans.XmlString insertNewValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.apache.xmlbeans.XmlString addNewValue();
    
    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.KeyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.KeyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
