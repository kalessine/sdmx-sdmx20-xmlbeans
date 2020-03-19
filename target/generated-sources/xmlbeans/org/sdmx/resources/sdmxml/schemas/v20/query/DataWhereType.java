/*
 * XML Type:  DataWhereType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query;


/**
 * An XML DataWhereType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public interface DataWhereType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("datawheretypee4a7type");
    
    /**
     * Gets the "DataSet" element
     */
    java.lang.String getDataSet();
    
    /**
     * Gets (as xml) the "DataSet" element
     */
    org.apache.xmlbeans.XmlString xgetDataSet();
    
    /**
     * True if has "DataSet" element
     */
    boolean isSetDataSet();
    
    /**
     * Sets the "DataSet" element
     */
    void setDataSet(java.lang.String dataSet);
    
    /**
     * Sets (as xml) the "DataSet" element
     */
    void xsetDataSet(org.apache.xmlbeans.XmlString dataSet);
    
    /**
     * Unsets the "DataSet" element
     */
    void unsetDataSet();
    
    /**
     * Gets the "KeyFamily" element
     */
    java.lang.String getKeyFamily();
    
    /**
     * Gets (as xml) the "KeyFamily" element
     */
    org.apache.xmlbeans.XmlString xgetKeyFamily();
    
    /**
     * True if has "KeyFamily" element
     */
    boolean isSetKeyFamily();
    
    /**
     * Sets the "KeyFamily" element
     */
    void setKeyFamily(java.lang.String keyFamily);
    
    /**
     * Sets (as xml) the "KeyFamily" element
     */
    void xsetKeyFamily(org.apache.xmlbeans.XmlString keyFamily);
    
    /**
     * Unsets the "KeyFamily" element
     */
    void unsetKeyFamily();
    
    /**
     * Gets the "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType getDimension();
    
    /**
     * True if has "Dimension" element
     */
    boolean isSetDimension();
    
    /**
     * Sets the "Dimension" element
     */
    void setDimension(org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType dimension);
    
    /**
     * Appends and returns a new empty "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType addNewDimension();
    
    /**
     * Unsets the "Dimension" element
     */
    void unsetDimension();
    
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
     * Gets the "Dataflow" element
     */
    java.lang.String getDataflow();
    
    /**
     * Gets (as xml) the "Dataflow" element
     */
    org.apache.xmlbeans.XmlString xgetDataflow();
    
    /**
     * True if has "Dataflow" element
     */
    boolean isSetDataflow();
    
    /**
     * Sets the "Dataflow" element
     */
    void setDataflow(java.lang.String dataflow);
    
    /**
     * Sets (as xml) the "Dataflow" element
     */
    void xsetDataflow(org.apache.xmlbeans.XmlString dataflow);
    
    /**
     * Unsets the "Dataflow" element
     */
    void unsetDataflow();
    
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
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
