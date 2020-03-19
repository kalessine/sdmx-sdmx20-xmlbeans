/*
 * XML Type:  CodeRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML CodeRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface CodeRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("codereftype3b9btype");
    
    /**
     * Gets the "URN" element
     */
    java.lang.String getURN();
    
    /**
     * Gets (as xml) the "URN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetURN();
    
    /**
     * True if has "URN" element
     */
    boolean isSetURN();
    
    /**
     * Sets the "URN" element
     */
    void setURN(java.lang.String urn);
    
    /**
     * Sets (as xml) the "URN" element
     */
    void xsetURN(org.apache.xmlbeans.XmlAnyURI urn);
    
    /**
     * Unsets the "URN" element
     */
    void unsetURN();
    
    /**
     * Gets the "CodelistAliasRef" element
     */
    java.lang.String getCodelistAliasRef();
    
    /**
     * Gets (as xml) the "CodelistAliasRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelistAliasRef();
    
    /**
     * True if has "CodelistAliasRef" element
     */
    boolean isSetCodelistAliasRef();
    
    /**
     * Sets the "CodelistAliasRef" element
     */
    void setCodelistAliasRef(java.lang.String codelistAliasRef);
    
    /**
     * Sets (as xml) the "CodelistAliasRef" element
     */
    void xsetCodelistAliasRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelistAliasRef);
    
    /**
     * Unsets the "CodelistAliasRef" element
     */
    void unsetCodelistAliasRef();
    
    /**
     * Gets the "CodeID" element
     */
    java.lang.String getCodeID();
    
    /**
     * Gets (as xml) the "CodeID" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodeID();
    
    /**
     * True if has "CodeID" element
     */
    boolean isSetCodeID();
    
    /**
     * Sets the "CodeID" element
     */
    void setCodeID(java.lang.String codeID);
    
    /**
     * Sets (as xml) the "CodeID" element
     */
    void xsetCodeID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codeID);
    
    /**
     * Unsets the "CodeID" element
     */
    void unsetCodeID();
    
    /**
     * Gets array of all "CodeRef" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType[] getCodeRefArray();
    
    /**
     * Gets ith "CodeRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType getCodeRefArray(int i);
    
    /**
     * Returns number of "CodeRef" element
     */
    int sizeOfCodeRefArray();
    
    /**
     * Sets array of all "CodeRef" element
     */
    void setCodeRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType[] codeRefArray);
    
    /**
     * Sets ith "CodeRef" element
     */
    void setCodeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType codeRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType insertNewCodeRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType addNewCodeRef();
    
    /**
     * Removes the ith "CodeRef" element
     */
    void removeCodeRef(int i);
    
    /**
     * Gets the "LevelRef" element
     */
    java.lang.String getLevelRef();
    
    /**
     * Gets (as xml) the "LevelRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetLevelRef();
    
    /**
     * True if has "LevelRef" element
     */
    boolean isSetLevelRef();
    
    /**
     * Sets the "LevelRef" element
     */
    void setLevelRef(java.lang.String levelRef);
    
    /**
     * Sets (as xml) the "LevelRef" element
     */
    void xsetLevelRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType levelRef);
    
    /**
     * Unsets the "LevelRef" element
     */
    void unsetLevelRef();
    
    /**
     * Gets the "NodeAliasID" element
     */
    java.lang.String getNodeAliasID();
    
    /**
     * Gets (as xml) the "NodeAliasID" element
     */
    org.apache.xmlbeans.XmlString xgetNodeAliasID();
    
    /**
     * True if has "NodeAliasID" element
     */
    boolean isSetNodeAliasID();
    
    /**
     * Sets the "NodeAliasID" element
     */
    void setNodeAliasID(java.lang.String nodeAliasID);
    
    /**
     * Sets (as xml) the "NodeAliasID" element
     */
    void xsetNodeAliasID(org.apache.xmlbeans.XmlString nodeAliasID);
    
    /**
     * Unsets the "NodeAliasID" element
     */
    void unsetNodeAliasID();
    
    /**
     * Gets the "Version" element
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "Version" element
     */
    org.apache.xmlbeans.XmlString xgetVersion();
    
    /**
     * True if has "Version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "Version" element
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "Version" element
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);
    
    /**
     * Unsets the "Version" element
     */
    void unsetVersion();
    
    /**
     * Gets the "ValidFrom" element
     */
    java.lang.Object getValidFrom();
    
    /**
     * Gets (as xml) the "ValidFrom" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidFrom();
    
    /**
     * True if has "ValidFrom" element
     */
    boolean isSetValidFrom();
    
    /**
     * Sets the "ValidFrom" element
     */
    void setValidFrom(java.lang.Object validFrom);
    
    /**
     * Sets (as xml) the "ValidFrom" element
     */
    void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validFrom);
    
    /**
     * Unsets the "ValidFrom" element
     */
    void unsetValidFrom();
    
    /**
     * Gets the "ValidTo" element
     */
    java.lang.Object getValidTo();
    
    /**
     * Gets (as xml) the "ValidTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidTo();
    
    /**
     * True if has "ValidTo" element
     */
    boolean isSetValidTo();
    
    /**
     * Sets the "ValidTo" element
     */
    void setValidTo(java.lang.Object validTo);
    
    /**
     * Sets (as xml) the "ValidTo" element
     */
    void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validTo);
    
    /**
     * Unsets the "ValidTo" element
     */
    void unsetValidTo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
