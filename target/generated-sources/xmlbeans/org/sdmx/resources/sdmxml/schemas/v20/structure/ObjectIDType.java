/*
 * XML Type:  ObjectIDType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML ObjectIDType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.
 */
public interface ObjectIDType extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectIDType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("objectidtypef501type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AGENCY = Enum.forString("Agency");
    static final Enum CONCEPT_SCHEME = Enum.forString("ConceptScheme");
    static final Enum CONCEPT = Enum.forString("Concept");
    static final Enum CODELIST = Enum.forString("Codelist");
    static final Enum CODE = Enum.forString("Code");
    static final Enum KEY_FAMILY = Enum.forString("KeyFamily");
    static final Enum COMPONENT = Enum.forString("Component");
    static final Enum KEY_DESCRIPTOR = Enum.forString("KeyDescriptor");
    static final Enum MEASURE_DESCRIPTOR = Enum.forString("MeasureDescriptor");
    static final Enum ATTRIBUTE_DESCRIPTOR = Enum.forString("AttributeDescriptor");
    static final Enum GROUP_KEY_DESCRIPTOR = Enum.forString("GroupKeyDescriptor");
    static final Enum DIMENSION = Enum.forString("Dimension");
    static final Enum MEASURE = Enum.forString("Measure");
    static final Enum ATTRIBUTE = Enum.forString("Attribute");
    static final Enum CATEGORY_SCHEME = Enum.forString("CategoryScheme");
    static final Enum REPORTING_TAXONOMY = Enum.forString("ReportingTaxonomy");
    static final Enum CATEGORY = Enum.forString("Category");
    static final Enum ORGANISATION_SCHEME = Enum.forString("OrganisationScheme");
    static final Enum DATA_PROVIDER = Enum.forString("DataProvider");
    static final Enum METADATA_STRUCTURE = Enum.forString("MetadataStructure");
    static final Enum FULL_TARGET_IDENTIFIER = Enum.forString("FullTargetIdentifier");
    static final Enum PARTIAL_TARGET_IDENTIFIER = Enum.forString("PartialTargetIdentifier");
    static final Enum METADATA_ATTRIBUTE = Enum.forString("MetadataAttribute");
    static final Enum DATA_FLOW = Enum.forString("DataFlow");
    static final Enum PROVISION_AGREEMENT = Enum.forString("ProvisionAgreement");
    static final Enum METADATA_FLOW = Enum.forString("MetadataFlow");
    static final Enum CONTENT_CONSTRAINT = Enum.forString("ContentConstraint");
    static final Enum ATTACHMENT_CONSTRAINT = Enum.forString("AttachmentConstraint");
    static final Enum DATA_SET = Enum.forString("DataSet");
    static final Enum XS_DATA_SET = Enum.forString("XSDataSet");
    static final Enum METADATA_SET = Enum.forString("MetadataSet");
    static final Enum HIERARCHICAL_CODELIST = Enum.forString("HierarchicalCodelist");
    static final Enum HIERARCHY = Enum.forString("Hierarchy");
    static final Enum STRUCTURE_SET = Enum.forString("StructureSet");
    static final Enum STRUCTURE_MAP = Enum.forString("StructureMap");
    static final Enum COMPONENT_MAP = Enum.forString("ComponentMap");
    static final Enum CODELIST_MAP = Enum.forString("CodelistMap");
    static final Enum CODE_MAP = Enum.forString("CodeMap");
    static final Enum CATEGORY_SCHEME_MAP = Enum.forString("CategorySchemeMap");
    static final Enum CATEGORY_MAP = Enum.forString("CategoryMap");
    static final Enum ORGANISATION_SCHEME_MAP = Enum.forString("OrganisationSchemeMap");
    static final Enum ORGANISATION_ROLE_MAP = Enum.forString("OrganisationRoleMap");
    static final Enum CONCEPT_SCHEME_MAP = Enum.forString("ConceptSchemeMap");
    static final Enum CONCEPT_MAP = Enum.forString("ConceptMap");
    static final Enum PROCESS = Enum.forString("Process");
    static final Enum PROCESS_STEP = Enum.forString("ProcessStep");
    
    static final int INT_AGENCY = Enum.INT_AGENCY;
    static final int INT_CONCEPT_SCHEME = Enum.INT_CONCEPT_SCHEME;
    static final int INT_CONCEPT = Enum.INT_CONCEPT;
    static final int INT_CODELIST = Enum.INT_CODELIST;
    static final int INT_CODE = Enum.INT_CODE;
    static final int INT_KEY_FAMILY = Enum.INT_KEY_FAMILY;
    static final int INT_COMPONENT = Enum.INT_COMPONENT;
    static final int INT_KEY_DESCRIPTOR = Enum.INT_KEY_DESCRIPTOR;
    static final int INT_MEASURE_DESCRIPTOR = Enum.INT_MEASURE_DESCRIPTOR;
    static final int INT_ATTRIBUTE_DESCRIPTOR = Enum.INT_ATTRIBUTE_DESCRIPTOR;
    static final int INT_GROUP_KEY_DESCRIPTOR = Enum.INT_GROUP_KEY_DESCRIPTOR;
    static final int INT_DIMENSION = Enum.INT_DIMENSION;
    static final int INT_MEASURE = Enum.INT_MEASURE;
    static final int INT_ATTRIBUTE = Enum.INT_ATTRIBUTE;
    static final int INT_CATEGORY_SCHEME = Enum.INT_CATEGORY_SCHEME;
    static final int INT_REPORTING_TAXONOMY = Enum.INT_REPORTING_TAXONOMY;
    static final int INT_CATEGORY = Enum.INT_CATEGORY;
    static final int INT_ORGANISATION_SCHEME = Enum.INT_ORGANISATION_SCHEME;
    static final int INT_DATA_PROVIDER = Enum.INT_DATA_PROVIDER;
    static final int INT_METADATA_STRUCTURE = Enum.INT_METADATA_STRUCTURE;
    static final int INT_FULL_TARGET_IDENTIFIER = Enum.INT_FULL_TARGET_IDENTIFIER;
    static final int INT_PARTIAL_TARGET_IDENTIFIER = Enum.INT_PARTIAL_TARGET_IDENTIFIER;
    static final int INT_METADATA_ATTRIBUTE = Enum.INT_METADATA_ATTRIBUTE;
    static final int INT_DATA_FLOW = Enum.INT_DATA_FLOW;
    static final int INT_PROVISION_AGREEMENT = Enum.INT_PROVISION_AGREEMENT;
    static final int INT_METADATA_FLOW = Enum.INT_METADATA_FLOW;
    static final int INT_CONTENT_CONSTRAINT = Enum.INT_CONTENT_CONSTRAINT;
    static final int INT_ATTACHMENT_CONSTRAINT = Enum.INT_ATTACHMENT_CONSTRAINT;
    static final int INT_DATA_SET = Enum.INT_DATA_SET;
    static final int INT_XS_DATA_SET = Enum.INT_XS_DATA_SET;
    static final int INT_METADATA_SET = Enum.INT_METADATA_SET;
    static final int INT_HIERARCHICAL_CODELIST = Enum.INT_HIERARCHICAL_CODELIST;
    static final int INT_HIERARCHY = Enum.INT_HIERARCHY;
    static final int INT_STRUCTURE_SET = Enum.INT_STRUCTURE_SET;
    static final int INT_STRUCTURE_MAP = Enum.INT_STRUCTURE_MAP;
    static final int INT_COMPONENT_MAP = Enum.INT_COMPONENT_MAP;
    static final int INT_CODELIST_MAP = Enum.INT_CODELIST_MAP;
    static final int INT_CODE_MAP = Enum.INT_CODE_MAP;
    static final int INT_CATEGORY_SCHEME_MAP = Enum.INT_CATEGORY_SCHEME_MAP;
    static final int INT_CATEGORY_MAP = Enum.INT_CATEGORY_MAP;
    static final int INT_ORGANISATION_SCHEME_MAP = Enum.INT_ORGANISATION_SCHEME_MAP;
    static final int INT_ORGANISATION_ROLE_MAP = Enum.INT_ORGANISATION_ROLE_MAP;
    static final int INT_CONCEPT_SCHEME_MAP = Enum.INT_CONCEPT_SCHEME_MAP;
    static final int INT_CONCEPT_MAP = Enum.INT_CONCEPT_MAP;
    static final int INT_PROCESS = Enum.INT_PROCESS;
    static final int INT_PROCESS_STEP = Enum.INT_PROCESS_STEP;
    
    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AGENCY
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_AGENCY = 1;
        static final int INT_CONCEPT_SCHEME = 2;
        static final int INT_CONCEPT = 3;
        static final int INT_CODELIST = 4;
        static final int INT_CODE = 5;
        static final int INT_KEY_FAMILY = 6;
        static final int INT_COMPONENT = 7;
        static final int INT_KEY_DESCRIPTOR = 8;
        static final int INT_MEASURE_DESCRIPTOR = 9;
        static final int INT_ATTRIBUTE_DESCRIPTOR = 10;
        static final int INT_GROUP_KEY_DESCRIPTOR = 11;
        static final int INT_DIMENSION = 12;
        static final int INT_MEASURE = 13;
        static final int INT_ATTRIBUTE = 14;
        static final int INT_CATEGORY_SCHEME = 15;
        static final int INT_REPORTING_TAXONOMY = 16;
        static final int INT_CATEGORY = 17;
        static final int INT_ORGANISATION_SCHEME = 18;
        static final int INT_DATA_PROVIDER = 19;
        static final int INT_METADATA_STRUCTURE = 20;
        static final int INT_FULL_TARGET_IDENTIFIER = 21;
        static final int INT_PARTIAL_TARGET_IDENTIFIER = 22;
        static final int INT_METADATA_ATTRIBUTE = 23;
        static final int INT_DATA_FLOW = 24;
        static final int INT_PROVISION_AGREEMENT = 25;
        static final int INT_METADATA_FLOW = 26;
        static final int INT_CONTENT_CONSTRAINT = 27;
        static final int INT_ATTACHMENT_CONSTRAINT = 28;
        static final int INT_DATA_SET = 29;
        static final int INT_XS_DATA_SET = 30;
        static final int INT_METADATA_SET = 31;
        static final int INT_HIERARCHICAL_CODELIST = 32;
        static final int INT_HIERARCHY = 33;
        static final int INT_STRUCTURE_SET = 34;
        static final int INT_STRUCTURE_MAP = 35;
        static final int INT_COMPONENT_MAP = 36;
        static final int INT_CODELIST_MAP = 37;
        static final int INT_CODE_MAP = 38;
        static final int INT_CATEGORY_SCHEME_MAP = 39;
        static final int INT_CATEGORY_MAP = 40;
        static final int INT_ORGANISATION_SCHEME_MAP = 41;
        static final int INT_ORGANISATION_ROLE_MAP = 42;
        static final int INT_CONCEPT_SCHEME_MAP = 43;
        static final int INT_CONCEPT_MAP = 44;
        static final int INT_PROCESS = 45;
        static final int INT_PROCESS_STEP = 46;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Agency", INT_AGENCY),
                new Enum("ConceptScheme", INT_CONCEPT_SCHEME),
                new Enum("Concept", INT_CONCEPT),
                new Enum("Codelist", INT_CODELIST),
                new Enum("Code", INT_CODE),
                new Enum("KeyFamily", INT_KEY_FAMILY),
                new Enum("Component", INT_COMPONENT),
                new Enum("KeyDescriptor", INT_KEY_DESCRIPTOR),
                new Enum("MeasureDescriptor", INT_MEASURE_DESCRIPTOR),
                new Enum("AttributeDescriptor", INT_ATTRIBUTE_DESCRIPTOR),
                new Enum("GroupKeyDescriptor", INT_GROUP_KEY_DESCRIPTOR),
                new Enum("Dimension", INT_DIMENSION),
                new Enum("Measure", INT_MEASURE),
                new Enum("Attribute", INT_ATTRIBUTE),
                new Enum("CategoryScheme", INT_CATEGORY_SCHEME),
                new Enum("ReportingTaxonomy", INT_REPORTING_TAXONOMY),
                new Enum("Category", INT_CATEGORY),
                new Enum("OrganisationScheme", INT_ORGANISATION_SCHEME),
                new Enum("DataProvider", INT_DATA_PROVIDER),
                new Enum("MetadataStructure", INT_METADATA_STRUCTURE),
                new Enum("FullTargetIdentifier", INT_FULL_TARGET_IDENTIFIER),
                new Enum("PartialTargetIdentifier", INT_PARTIAL_TARGET_IDENTIFIER),
                new Enum("MetadataAttribute", INT_METADATA_ATTRIBUTE),
                new Enum("DataFlow", INT_DATA_FLOW),
                new Enum("ProvisionAgreement", INT_PROVISION_AGREEMENT),
                new Enum("MetadataFlow", INT_METADATA_FLOW),
                new Enum("ContentConstraint", INT_CONTENT_CONSTRAINT),
                new Enum("AttachmentConstraint", INT_ATTACHMENT_CONSTRAINT),
                new Enum("DataSet", INT_DATA_SET),
                new Enum("XSDataSet", INT_XS_DATA_SET),
                new Enum("MetadataSet", INT_METADATA_SET),
                new Enum("HierarchicalCodelist", INT_HIERARCHICAL_CODELIST),
                new Enum("Hierarchy", INT_HIERARCHY),
                new Enum("StructureSet", INT_STRUCTURE_SET),
                new Enum("StructureMap", INT_STRUCTURE_MAP),
                new Enum("ComponentMap", INT_COMPONENT_MAP),
                new Enum("CodelistMap", INT_CODELIST_MAP),
                new Enum("CodeMap", INT_CODE_MAP),
                new Enum("CategorySchemeMap", INT_CATEGORY_SCHEME_MAP),
                new Enum("CategoryMap", INT_CATEGORY_MAP),
                new Enum("OrganisationSchemeMap", INT_ORGANISATION_SCHEME_MAP),
                new Enum("OrganisationRoleMap", INT_ORGANISATION_ROLE_MAP),
                new Enum("ConceptSchemeMap", INT_CONCEPT_SCHEME_MAP),
                new Enum("ConceptMap", INT_CONCEPT_MAP),
                new Enum("Process", INT_PROCESS),
                new Enum("ProcessStep", INT_PROCESS_STEP),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
