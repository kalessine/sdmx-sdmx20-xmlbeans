/*
 * XML Type:  ComponentsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML ComponentsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface ComponentsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("componentstype813dtype");
    
    /**
     * Gets array of all "Dimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType[] getDimensionArray();
    
    /**
     * Gets ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType getDimensionArray(int i);
    
    /**
     * Returns number of "Dimension" element
     */
    int sizeOfDimensionArray();
    
    /**
     * Sets array of all "Dimension" element
     */
    void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType[] dimensionArray);
    
    /**
     * Sets ith "Dimension" element
     */
    void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType dimension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType insertNewDimension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType addNewDimension();
    
    /**
     * Removes the ith "Dimension" element
     */
    void removeDimension(int i);
    
    /**
     * Gets the "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType getTimeDimension();
    
    /**
     * True if has "TimeDimension" element
     */
    boolean isSetTimeDimension();
    
    /**
     * Sets the "TimeDimension" element
     */
    void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType timeDimension);
    
    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType addNewTimeDimension();
    
    /**
     * Unsets the "TimeDimension" element
     */
    void unsetTimeDimension();
    
    /**
     * Gets array of all "Group" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType[] getGroupArray();
    
    /**
     * Gets ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType getGroupArray(int i);
    
    /**
     * Returns number of "Group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "Group" element
     */
    void setGroupArray(org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType[] groupArray);
    
    /**
     * Sets ith "Group" element
     */
    void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType addNewGroup();
    
    /**
     * Removes the ith "Group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType getPrimaryMeasure();
    
    /**
     * Sets the "PrimaryMeasure" element
     */
    void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType primaryMeasure);
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType addNewPrimaryMeasure();
    
    /**
     * Gets array of all "CrossSectionalMeasure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType[] getCrossSectionalMeasureArray();
    
    /**
     * Gets ith "CrossSectionalMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType getCrossSectionalMeasureArray(int i);
    
    /**
     * Returns number of "CrossSectionalMeasure" element
     */
    int sizeOfCrossSectionalMeasureArray();
    
    /**
     * Sets array of all "CrossSectionalMeasure" element
     */
    void setCrossSectionalMeasureArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType[] crossSectionalMeasureArray);
    
    /**
     * Sets ith "CrossSectionalMeasure" element
     */
    void setCrossSectionalMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType crossSectionalMeasure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CrossSectionalMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType insertNewCrossSectionalMeasure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CrossSectionalMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType addNewCrossSectionalMeasure();
    
    /**
     * Removes the ith "CrossSectionalMeasure" element
     */
    void removeCrossSectionalMeasure(int i);
    
    /**
     * Gets array of all "Attribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType[] getAttributeArray();
    
    /**
     * Gets ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType getAttributeArray(int i);
    
    /**
     * Returns number of "Attribute" element
     */
    int sizeOfAttributeArray();
    
    /**
     * Sets array of all "Attribute" element
     */
    void setAttributeArray(org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType[] attributeArray);
    
    /**
     * Sets ith "Attribute" element
     */
    void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType attribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType insertNewAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType addNewAttribute();
    
    /**
     * Removes the ith "Attribute" element
     */
    void removeAttribute(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
