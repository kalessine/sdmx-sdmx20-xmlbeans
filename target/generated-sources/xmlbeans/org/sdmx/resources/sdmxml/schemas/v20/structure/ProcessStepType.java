/*
 * XML Type:  ProcessStepType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML ProcessStepType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface ProcessStepType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessStepType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("processsteptype2a90type");
    
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
     * Gets array of all "Input" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] getInputArray();
    
    /**
     * Gets ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum getInputArray(int i);
    
    /**
     * Gets (as xml) array of all "Input" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] xgetInputArray();
    
    /**
     * Gets (as xml) ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType xgetInputArray(int i);
    
    /**
     * Returns number of "Input" element
     */
    int sizeOfInputArray();
    
    /**
     * Sets array of all "Input" element
     */
    void setInputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] inputArray);
    
    /**
     * Sets ith "Input" element
     */
    void setInputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum input);
    
    /**
     * Sets (as xml) array of all "Input" element
     */
    void xsetInputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] inputArray);
    
    /**
     * Sets (as xml) ith "Input" element
     */
    void xsetInputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType input);
    
    /**
     * Inserts the value as the ith "Input" element
     */
    void insertInput(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum input);
    
    /**
     * Appends the value as the last "Input" element
     */
    void addInput(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum input);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType insertNewInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType addNewInput();
    
    /**
     * Removes the ith "Input" element
     */
    void removeInput(int i);
    
    /**
     * Gets array of all "Output" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] getOutputArray();
    
    /**
     * Gets ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum getOutputArray(int i);
    
    /**
     * Gets (as xml) array of all "Output" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] xgetOutputArray();
    
    /**
     * Gets (as xml) ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType xgetOutputArray(int i);
    
    /**
     * Returns number of "Output" element
     */
    int sizeOfOutputArray();
    
    /**
     * Sets array of all "Output" element
     */
    void setOutputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] outputArray);
    
    /**
     * Sets ith "Output" element
     */
    void setOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum output);
    
    /**
     * Sets (as xml) array of all "Output" element
     */
    void xsetOutputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] outputArray);
    
    /**
     * Sets (as xml) ith "Output" element
     */
    void xsetOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType output);
    
    /**
     * Inserts the value as the ith "Output" element
     */
    void insertOutput(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum output);
    
    /**
     * Appends the value as the last "Output" element
     */
    void addOutput(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum output);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType insertNewOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType addNewOutput();
    
    /**
     * Removes the ith "Output" element
     */
    void removeOutput(int i);
    
    /**
     * Gets array of all "Computation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getComputationArray();
    
    /**
     * Gets ith "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType getComputationArray(int i);
    
    /**
     * Returns number of "Computation" element
     */
    int sizeOfComputationArray();
    
    /**
     * Sets array of all "Computation" element
     */
    void setComputationArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] computationArray);
    
    /**
     * Sets ith "Computation" element
     */
    void setComputationArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType computation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewComputation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewComputation();
    
    /**
     * Removes the ith "Computation" element
     */
    void removeComputation(int i);
    
    /**
     * Gets array of all "Transition" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType[] getTransitionArray();
    
    /**
     * Gets ith "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType getTransitionArray(int i);
    
    /**
     * Returns number of "Transition" element
     */
    int sizeOfTransitionArray();
    
    /**
     * Sets array of all "Transition" element
     */
    void setTransitionArray(org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType[] transitionArray);
    
    /**
     * Sets ith "Transition" element
     */
    void setTransitionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType transition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType insertNewTransition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType addNewTransition();
    
    /**
     * Removes the ith "Transition" element
     */
    void removeTransition(int i);
    
    /**
     * Gets array of all "ProcessStep" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType[] getProcessStepArray();
    
    /**
     * Gets ith "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType getProcessStepArray(int i);
    
    /**
     * Returns number of "ProcessStep" element
     */
    int sizeOfProcessStepArray();
    
    /**
     * Sets array of all "ProcessStep" element
     */
    void setProcessStepArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType[] processStepArray);
    
    /**
     * Sets ith "ProcessStep" element
     */
    void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType processStep);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType insertNewProcessStep(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType addNewProcessStep();
    
    /**
     * Removes the ith "ProcessStep" element
     */
    void removeProcessStep(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
