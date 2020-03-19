/*
 * XML Type:  StructureSetType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML StructureSetType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface StructureSetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructureSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("structuresettype45d6type");
    
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
     * Gets the "RelatedStructures" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.RelatedStructuresType getRelatedStructures();
    
    /**
     * True if has "RelatedStructures" element
     */
    boolean isSetRelatedStructures();
    
    /**
     * Sets the "RelatedStructures" element
     */
    void setRelatedStructures(org.sdmx.resources.sdmxml.schemas.v20.structure.RelatedStructuresType relatedStructures);
    
    /**
     * Appends and returns a new empty "RelatedStructures" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.RelatedStructuresType addNewRelatedStructures();
    
    /**
     * Unsets the "RelatedStructures" element
     */
    void unsetRelatedStructures();
    
    /**
     * Gets the "StructureMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.StructureMapType getStructureMap();
    
    /**
     * True if has "StructureMap" element
     */
    boolean isSetStructureMap();
    
    /**
     * Sets the "StructureMap" element
     */
    void setStructureMap(org.sdmx.resources.sdmxml.schemas.v20.structure.StructureMapType structureMap);
    
    /**
     * Appends and returns a new empty "StructureMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.StructureMapType addNewStructureMap();
    
    /**
     * Unsets the "StructureMap" element
     */
    void unsetStructureMap();
    
    /**
     * Gets the "CodelistMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistMapType getCodelistMap();
    
    /**
     * True if has "CodelistMap" element
     */
    boolean isSetCodelistMap();
    
    /**
     * Sets the "CodelistMap" element
     */
    void setCodelistMap(org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistMapType codelistMap);
    
    /**
     * Appends and returns a new empty "CodelistMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistMapType addNewCodelistMap();
    
    /**
     * Unsets the "CodelistMap" element
     */
    void unsetCodelistMap();
    
    /**
     * Gets the "CategorySchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeMapType getCategorySchemeMap();
    
    /**
     * True if has "CategorySchemeMap" element
     */
    boolean isSetCategorySchemeMap();
    
    /**
     * Sets the "CategorySchemeMap" element
     */
    void setCategorySchemeMap(org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeMapType categorySchemeMap);
    
    /**
     * Appends and returns a new empty "CategorySchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeMapType addNewCategorySchemeMap();
    
    /**
     * Unsets the "CategorySchemeMap" element
     */
    void unsetCategorySchemeMap();
    
    /**
     * Gets the "ConceptSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeMapType getConceptSchemeMap();
    
    /**
     * True if has "ConceptSchemeMap" element
     */
    boolean isSetConceptSchemeMap();
    
    /**
     * Sets the "ConceptSchemeMap" element
     */
    void setConceptSchemeMap(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeMapType conceptSchemeMap);
    
    /**
     * Appends and returns a new empty "ConceptSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeMapType addNewConceptSchemeMap();
    
    /**
     * Unsets the "ConceptSchemeMap" element
     */
    void unsetConceptSchemeMap();
    
    /**
     * Gets the "OrganisationSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeMapType getOrganisationSchemeMap();
    
    /**
     * True if has "OrganisationSchemeMap" element
     */
    boolean isSetOrganisationSchemeMap();
    
    /**
     * Sets the "OrganisationSchemeMap" element
     */
    void setOrganisationSchemeMap(org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeMapType organisationSchemeMap);
    
    /**
     * Appends and returns a new empty "OrganisationSchemeMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeMapType addNewOrganisationSchemeMap();
    
    /**
     * Unsets the "OrganisationSchemeMap" element
     */
    void unsetOrganisationSchemeMap();
    
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
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v20.common.IDType id);
    
    /**
     * Gets the "agencyID" attribute
     */
    java.lang.String getAgencyID();
    
    /**
     * Gets (as xml) the "agencyID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAgencyID();
    
    /**
     * True if has "agencyID" attribute
     */
    boolean isSetAgencyID();
    
    /**
     * Sets the "agencyID" attribute
     */
    void setAgencyID(java.lang.String agencyID);
    
    /**
     * Sets (as xml) the "agencyID" attribute
     */
    void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType agencyID);
    
    /**
     * Unsets the "agencyID" attribute
     */
    void unsetAgencyID();
    
    /**
     * Gets the "version" attribute
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    org.apache.xmlbeans.XmlString xgetVersion();
    
    /**
     * True if has "version" attribute
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.apache.xmlbeans.XmlString version);
    
    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();
    
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
     * Gets the "isFinal" attribute
     */
    boolean getIsFinal();
    
    /**
     * Gets (as xml) the "isFinal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFinal();
    
    /**
     * True if has "isFinal" attribute
     */
    boolean isSetIsFinal();
    
    /**
     * Sets the "isFinal" attribute
     */
    void setIsFinal(boolean isFinal);
    
    /**
     * Sets (as xml) the "isFinal" attribute
     */
    void xsetIsFinal(org.apache.xmlbeans.XmlBoolean isFinal);
    
    /**
     * Unsets the "isFinal" attribute
     */
    void unsetIsFinal();
    
    /**
     * Gets the "isExternalReference" attribute
     */
    boolean getIsExternalReference();
    
    /**
     * Gets (as xml) the "isExternalReference" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsExternalReference();
    
    /**
     * True if has "isExternalReference" attribute
     */
    boolean isSetIsExternalReference();
    
    /**
     * Sets the "isExternalReference" attribute
     */
    void setIsExternalReference(boolean isExternalReference);
    
    /**
     * Sets (as xml) the "isExternalReference" attribute
     */
    void xsetIsExternalReference(org.apache.xmlbeans.XmlBoolean isExternalReference);
    
    /**
     * Unsets the "isExternalReference" attribute
     */
    void unsetIsExternalReference();
    
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
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
