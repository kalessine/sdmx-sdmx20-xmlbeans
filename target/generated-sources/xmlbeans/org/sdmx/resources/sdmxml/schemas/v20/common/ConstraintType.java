/*
 * XML Type:  ConstraintType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common;


/**
 * An XML ConstraintType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a complex type.
 */
public interface ConstraintType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConstraintType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("constrainttypeecfatype");
    
    /**
     * Gets the "ConstraintID" element
     */
    java.lang.String getConstraintID();
    
    /**
     * Gets (as xml) the "ConstraintID" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConstraintID();
    
    /**
     * Sets the "ConstraintID" element
     */
    void setConstraintID(java.lang.String constraintID);
    
    /**
     * Sets (as xml) the "ConstraintID" element
     */
    void xsetConstraintID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType constraintID);
    
    /**
     * Gets array of all "CubeRegion" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType[] getCubeRegionArray();
    
    /**
     * Gets ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType getCubeRegionArray(int i);
    
    /**
     * Returns number of "CubeRegion" element
     */
    int sizeOfCubeRegionArray();
    
    /**
     * Sets array of all "CubeRegion" element
     */
    void setCubeRegionArray(org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType[] cubeRegionArray);
    
    /**
     * Sets ith "CubeRegion" element
     */
    void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType cubeRegion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType insertNewCubeRegion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType addNewCubeRegion();
    
    /**
     * Removes the ith "CubeRegion" element
     */
    void removeCubeRegion(int i);
    
    /**
     * Gets the "MetadataConceptSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType getMetadataConceptSet();
    
    /**
     * True if has "MetadataConceptSet" element
     */
    boolean isSetMetadataConceptSet();
    
    /**
     * Sets the "MetadataConceptSet" element
     */
    void setMetadataConceptSet(org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType metadataConceptSet);
    
    /**
     * Appends and returns a new empty "MetadataConceptSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType addNewMetadataConceptSet();
    
    /**
     * Unsets the "MetadataConceptSet" element
     */
    void unsetMetadataConceptSet();
    
    /**
     * Gets array of all "KeySet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType[] getKeySetArray();
    
    /**
     * Gets ith "KeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType getKeySetArray(int i);
    
    /**
     * Returns number of "KeySet" element
     */
    int sizeOfKeySetArray();
    
    /**
     * Sets array of all "KeySet" element
     */
    void setKeySetArray(org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType[] keySetArray);
    
    /**
     * Sets ith "KeySet" element
     */
    void setKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType keySet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType insertNewKeySet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType addNewKeySet();
    
    /**
     * Removes the ith "KeySet" element
     */
    void removeKeySet(int i);
    
    /**
     * Gets the "ReleaseCalendar" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType getReleaseCalendar();
    
    /**
     * True if has "ReleaseCalendar" element
     */
    boolean isSetReleaseCalendar();
    
    /**
     * Sets the "ReleaseCalendar" element
     */
    void setReleaseCalendar(org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType releaseCalendar);
    
    /**
     * Appends and returns a new empty "ReleaseCalendar" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType addNewReleaseCalendar();
    
    /**
     * Unsets the "ReleaseCalendar" element
     */
    void unsetReleaseCalendar();
    
    /**
     * Gets the "ReferencePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType getReferencePeriod();
    
    /**
     * True if has "ReferencePeriod" element
     */
    boolean isSetReferencePeriod();
    
    /**
     * Sets the "ReferencePeriod" element
     */
    void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType referencePeriod);
    
    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType addNewReferencePeriod();
    
    /**
     * Unsets the "ReferencePeriod" element
     */
    void unsetReferencePeriod();
    
    /**
     * Gets the "ConstraintType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType.Enum getConstraintType();
    
    /**
     * Gets (as xml) the "ConstraintType" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType xgetConstraintType();
    
    /**
     * Sets the "ConstraintType" attribute
     */
    void setConstraintType(org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType.Enum constraintType);
    
    /**
     * Sets (as xml) the "ConstraintType" attribute
     */
    void xsetConstraintType(org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType constraintType);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
