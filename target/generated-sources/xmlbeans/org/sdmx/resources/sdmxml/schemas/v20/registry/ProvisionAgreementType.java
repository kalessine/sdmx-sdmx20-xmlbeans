/*
 * XML Type:  ProvisionAgreementType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry;


/**
 * An XML ProvisionAgreementType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public interface ProvisionAgreementType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProvisionAgreementType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("provisionagreementtype06b4type");
    
    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getNameArray();
    
    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType getNameArray(int i);
    
    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "Name" element
     */
    void setNameArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] nameArray);
    
    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewName();
    
    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);
    
    /**
     * Gets array of all "Description" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getDescriptionArray();
    
    /**
     * Gets ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType getDescriptionArray(int i);
    
    /**
     * Returns number of "Description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "Description" element
     */
    void setDescriptionArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] descriptionArray);
    
    /**
     * Sets ith "Description" element
     */
    void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewDescription();
    
    /**
     * Removes the ith "Description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRef();
    
    /**
     * True if has "DataflowRef" element
     */
    boolean isSetDataflowRef();
    
    /**
     * Sets the "DataflowRef" element
     */
    void setDataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef);
    
    /**
     * Appends and returns a new empty "DataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef();
    
    /**
     * Unsets the "DataflowRef" element
     */
    void unsetDataflowRef();
    
    /**
     * Gets the "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadataflowRef();
    
    /**
     * True if has "MetadataflowRef" element
     */
    boolean isSetMetadataflowRef();
    
    /**
     * Sets the "MetadataflowRef" element
     */
    void setMetadataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadataflowRef);
    
    /**
     * Appends and returns a new empty "MetadataflowRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadataflowRef();
    
    /**
     * Unsets the "MetadataflowRef" element
     */
    void unsetMetadataflowRef();
    
    /**
     * Gets the "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRef();
    
    /**
     * Sets the "DataProviderRef" element
     */
    void setDataProviderRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType dataProviderRef);
    
    /**
     * Appends and returns a new empty "DataProviderRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType addNewDataProviderRef();
    
    /**
     * Gets the "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType getDatasource();
    
    /**
     * True if has "Datasource" element
     */
    boolean isSetDatasource();
    
    /**
     * Sets the "Datasource" element
     */
    void setDatasource(org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType datasource);
    
    /**
     * Appends and returns a new empty "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.registry.QueryableDatasourceType addNewDatasource();
    
    /**
     * Unsets the "Datasource" element
     */
    void unsetDatasource();
    
    /**
     * Gets the "Constraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType getConstraint();
    
    /**
     * True if has "Constraint" element
     */
    boolean isSetConstraint();
    
    /**
     * Sets the "Constraint" element
     */
    void setConstraint(org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType constraint);
    
    /**
     * Appends and returns a new empty "Constraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType addNewConstraint();
    
    /**
     * Unsets the "Constraint" element
     */
    void unsetConstraint();
    
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
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v20.common.IDType id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "uri" attribute
     */
    java.lang.String getUri();
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();
    
    /**
     * True if has "uri" attribute
     */
    boolean isSetUri();
    
    /**
     * Sets the "uri" attribute
     */
    void setUri(java.lang.String uri);
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
    
    /**
     * Unsets the "uri" attribute
     */
    void unsetUri();
    
    /**
     * Gets the "urn" attribute
     */
    java.lang.String getUrn();
    
    /**
     * Gets (as xml) the "urn" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetUrn();
    
    /**
     * True if has "urn" attribute
     */
    boolean isSetUrn();
    
    /**
     * Sets the "urn" attribute
     */
    void setUrn(java.lang.String urn);
    
    /**
     * Sets (as xml) the "urn" attribute
     */
    void xsetUrn(org.apache.xmlbeans.XmlAnyURI urn);
    
    /**
     * Unsets the "urn" attribute
     */
    void unsetUrn();
    
    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetAction();
    
    /**
     * True if has "action" attribute
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType action);
    
    /**
     * Unsets the "action" attribute
     */
    void unsetAction();
    
    /**
     * Gets the "indexTimeSeries" attribute
     */
    boolean getIndexTimeSeries();
    
    /**
     * Gets (as xml) the "indexTimeSeries" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexTimeSeries();
    
    /**
     * True if has "indexTimeSeries" attribute
     */
    boolean isSetIndexTimeSeries();
    
    /**
     * Sets the "indexTimeSeries" attribute
     */
    void setIndexTimeSeries(boolean indexTimeSeries);
    
    /**
     * Sets (as xml) the "indexTimeSeries" attribute
     */
    void xsetIndexTimeSeries(org.apache.xmlbeans.XmlBoolean indexTimeSeries);
    
    /**
     * Unsets the "indexTimeSeries" attribute
     */
    void unsetIndexTimeSeries();
    
    /**
     * Gets the "indexDataSet" attribute
     */
    boolean getIndexDataSet();
    
    /**
     * Gets (as xml) the "indexDataSet" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexDataSet();
    
    /**
     * True if has "indexDataSet" attribute
     */
    boolean isSetIndexDataSet();
    
    /**
     * Sets the "indexDataSet" attribute
     */
    void setIndexDataSet(boolean indexDataSet);
    
    /**
     * Sets (as xml) the "indexDataSet" attribute
     */
    void xsetIndexDataSet(org.apache.xmlbeans.XmlBoolean indexDataSet);
    
    /**
     * Unsets the "indexDataSet" attribute
     */
    void unsetIndexDataSet();
    
    /**
     * Gets the "indexReportingPeriod" attribute
     */
    boolean getIndexReportingPeriod();
    
    /**
     * Gets (as xml) the "indexReportingPeriod" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexReportingPeriod();
    
    /**
     * True if has "indexReportingPeriod" attribute
     */
    boolean isSetIndexReportingPeriod();
    
    /**
     * Sets the "indexReportingPeriod" attribute
     */
    void setIndexReportingPeriod(boolean indexReportingPeriod);
    
    /**
     * Sets (as xml) the "indexReportingPeriod" attribute
     */
    void xsetIndexReportingPeriod(org.apache.xmlbeans.XmlBoolean indexReportingPeriod);
    
    /**
     * Unsets the "indexReportingPeriod" attribute
     */
    void unsetIndexReportingPeriod();
    
    /**
     * Gets the "validFrom" attribute
     */
    java.lang.Object getValidFrom();
    
    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidFrom();
    
    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();
    
    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.lang.Object validFrom);
    
    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validFrom);
    
    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();
    
    /**
     * Gets the "validTo" attribute
     */
    java.lang.Object getValidTo();
    
    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidTo();
    
    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();
    
    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.lang.Object validTo);
    
    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validTo);
    
    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.registry.ProvisionAgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
