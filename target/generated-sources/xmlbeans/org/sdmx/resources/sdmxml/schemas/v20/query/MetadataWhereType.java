/*
 * XML Type:  MetadataWhereType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query;


/**
 * An XML MetadataWhereType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public interface MetadataWhereType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("metadatawheretype0e42type");
    
    /**
     * Gets the "MetadataSet" element
     */
    java.lang.String getMetadataSet();
    
    /**
     * Gets (as xml) the "MetadataSet" element
     */
    org.apache.xmlbeans.XmlString xgetMetadataSet();
    
    /**
     * True if has "MetadataSet" element
     */
    boolean isSetMetadataSet();
    
    /**
     * Sets the "MetadataSet" element
     */
    void setMetadataSet(java.lang.String metadataSet);
    
    /**
     * Sets (as xml) the "MetadataSet" element
     */
    void xsetMetadataSet(org.apache.xmlbeans.XmlString metadataSet);
    
    /**
     * Unsets the "MetadataSet" element
     */
    void unsetMetadataSet();
    
    /**
     * Gets the "MetadataStructure" element
     */
    java.lang.String getMetadataStructure();
    
    /**
     * Gets (as xml) the "MetadataStructure" element
     */
    org.apache.xmlbeans.XmlString xgetMetadataStructure();
    
    /**
     * True if has "MetadataStructure" element
     */
    boolean isSetMetadataStructure();
    
    /**
     * Sets the "MetadataStructure" element
     */
    void setMetadataStructure(java.lang.String metadataStructure);
    
    /**
     * Sets (as xml) the "MetadataStructure" element
     */
    void xsetMetadataStructure(org.apache.xmlbeans.XmlString metadataStructure);
    
    /**
     * Unsets the "MetadataStructure" element
     */
    void unsetMetadataStructure();
    
    /**
     * Gets the "StructureComponent" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType getStructureComponent();
    
    /**
     * True if has "StructureComponent" element
     */
    boolean isSetStructureComponent();
    
    /**
     * Sets the "StructureComponent" element
     */
    void setStructureComponent(org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType structureComponent);
    
    /**
     * Appends and returns a new empty "StructureComponent" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType addNewStructureComponent();
    
    /**
     * Unsets the "StructureComponent" element
     */
    void unsetStructureComponent();
    
    /**
     * Gets the "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType getAttribute();
    
    /**
     * True if has "Attribute" element
     */
    boolean isSetAttribute();
    
    /**
     * Sets the "Attribute" element
     */
    void setAttribute(org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType attribute);
    
    /**
     * Appends and returns a new empty "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType addNewAttribute();
    
    /**
     * Unsets the "Attribute" element
     */
    void unsetAttribute();
    
    /**
     * Gets the "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType getCodelist();
    
    /**
     * True if has "Codelist" element
     */
    boolean isSetCodelist();
    
    /**
     * Sets the "Codelist" element
     */
    void setCodelist(org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType codelist);
    
    /**
     * Appends and returns a new empty "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType addNewCodelist();
    
    /**
     * Unsets the "Codelist" element
     */
    void unsetCodelist();
    
    /**
     * Gets the "Time" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.TimeType getTime();
    
    /**
     * True if has "Time" element
     */
    boolean isSetTime();
    
    /**
     * Sets the "Time" element
     */
    void setTime(org.sdmx.resources.sdmxml.schemas.v20.query.TimeType time);
    
    /**
     * Appends and returns a new empty "Time" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.TimeType addNewTime();
    
    /**
     * Unsets the "Time" element
     */
    void unsetTime();
    
    /**
     * Gets the "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType getCategory();
    
    /**
     * True if has "Category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "Category" element
     */
    void setCategory(org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType category);
    
    /**
     * Appends and returns a new empty "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType addNewCategory();
    
    /**
     * Unsets the "Category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "Concept" element
     */
    java.lang.String getConcept();
    
    /**
     * Gets (as xml) the "Concept" element
     */
    org.apache.xmlbeans.XmlString xgetConcept();
    
    /**
     * True if has "Concept" element
     */
    boolean isSetConcept();
    
    /**
     * Sets the "Concept" element
     */
    void setConcept(java.lang.String concept);
    
    /**
     * Sets (as xml) the "Concept" element
     */
    void xsetConcept(org.apache.xmlbeans.XmlString concept);
    
    /**
     * Unsets the "Concept" element
     */
    void unsetConcept();
    
    /**
     * Gets the "DataProvider" element
     */
    java.lang.String getDataProvider();
    
    /**
     * Gets (as xml) the "DataProvider" element
     */
    org.apache.xmlbeans.XmlString xgetDataProvider();
    
    /**
     * True if has "DataProvider" element
     */
    boolean isSetDataProvider();
    
    /**
     * Sets the "DataProvider" element
     */
    void setDataProvider(java.lang.String dataProvider);
    
    /**
     * Sets (as xml) the "DataProvider" element
     */
    void xsetDataProvider(org.apache.xmlbeans.XmlString dataProvider);
    
    /**
     * Unsets the "DataProvider" element
     */
    void unsetDataProvider();
    
    /**
     * Gets the "Metadataflow" element
     */
    java.lang.String getMetadataflow();
    
    /**
     * Gets (as xml) the "Metadataflow" element
     */
    org.apache.xmlbeans.XmlString xgetMetadataflow();
    
    /**
     * True if has "Metadataflow" element
     */
    boolean isSetMetadataflow();
    
    /**
     * Sets the "Metadataflow" element
     */
    void setMetadataflow(java.lang.String metadataflow);
    
    /**
     * Sets (as xml) the "Metadataflow" element
     */
    void xsetMetadataflow(org.apache.xmlbeans.XmlString metadataflow);
    
    /**
     * Unsets the "Metadataflow" element
     */
    void unsetMetadataflow();
    
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
     * Gets the "Or" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.OrType getOr();
    
    /**
     * True if has "Or" element
     */
    boolean isSetOr();
    
    /**
     * Sets the "Or" element
     */
    void setOr(org.sdmx.resources.sdmxml.schemas.v20.query.OrType or);
    
    /**
     * Appends and returns a new empty "Or" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.OrType addNewOr();
    
    /**
     * Unsets the "Or" element
     */
    void unsetOr();
    
    /**
     * Gets the "And" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.AndType getAnd();
    
    /**
     * True if has "And" element
     */
    boolean isSetAnd();
    
    /**
     * Sets the "And" element
     */
    void setAnd(org.sdmx.resources.sdmxml.schemas.v20.query.AndType and);
    
    /**
     * Appends and returns a new empty "And" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.AndType addNewAnd();
    
    /**
     * Unsets the "And" element
     */
    void unsetAnd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
