/*
 * XML Type:  AttributeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML AttributeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public interface AttributeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("attributetype0d11type");
    
    /**
     * Gets the "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getTextFormat();
    
    /**
     * True if has "TextFormat" element
     */
    boolean isSetTextFormat();
    
    /**
     * Sets the "TextFormat" element
     */
    void setTextFormat(org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType textFormat);
    
    /**
     * Appends and returns a new empty "TextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType addNewTextFormat();
    
    /**
     * Unsets the "TextFormat" element
     */
    void unsetTextFormat();
    
    /**
     * Gets array of all "AttachmentGroup" elements
     */
    java.lang.String[] getAttachmentGroupArray();
    
    /**
     * Gets ith "AttachmentGroup" element
     */
    java.lang.String getAttachmentGroupArray(int i);
    
    /**
     * Gets (as xml) array of all "AttachmentGroup" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetAttachmentGroupArray();
    
    /**
     * Gets (as xml) ith "AttachmentGroup" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAttachmentGroupArray(int i);
    
    /**
     * Returns number of "AttachmentGroup" element
     */
    int sizeOfAttachmentGroupArray();
    
    /**
     * Sets array of all "AttachmentGroup" element
     */
    void setAttachmentGroupArray(java.lang.String[] attachmentGroupArray);
    
    /**
     * Sets ith "AttachmentGroup" element
     */
    void setAttachmentGroupArray(int i, java.lang.String attachmentGroup);
    
    /**
     * Sets (as xml) array of all "AttachmentGroup" element
     */
    void xsetAttachmentGroupArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] attachmentGroupArray);
    
    /**
     * Sets (as xml) ith "AttachmentGroup" element
     */
    void xsetAttachmentGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType attachmentGroup);
    
    /**
     * Inserts the value as the ith "AttachmentGroup" element
     */
    void insertAttachmentGroup(int i, java.lang.String attachmentGroup);
    
    /**
     * Appends the value as the last "AttachmentGroup" element
     */
    void addAttachmentGroup(java.lang.String attachmentGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentGroup" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewAttachmentGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentGroup" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewAttachmentGroup();
    
    /**
     * Removes the ith "AttachmentGroup" element
     */
    void removeAttachmentGroup(int i);
    
    /**
     * Gets array of all "AttachmentMeasure" elements
     */
    java.lang.String[] getAttachmentMeasureArray();
    
    /**
     * Gets ith "AttachmentMeasure" element
     */
    java.lang.String getAttachmentMeasureArray(int i);
    
    /**
     * Gets (as xml) array of all "AttachmentMeasure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetAttachmentMeasureArray();
    
    /**
     * Gets (as xml) ith "AttachmentMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAttachmentMeasureArray(int i);
    
    /**
     * Returns number of "AttachmentMeasure" element
     */
    int sizeOfAttachmentMeasureArray();
    
    /**
     * Sets array of all "AttachmentMeasure" element
     */
    void setAttachmentMeasureArray(java.lang.String[] attachmentMeasureArray);
    
    /**
     * Sets ith "AttachmentMeasure" element
     */
    void setAttachmentMeasureArray(int i, java.lang.String attachmentMeasure);
    
    /**
     * Sets (as xml) array of all "AttachmentMeasure" element
     */
    void xsetAttachmentMeasureArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] attachmentMeasureArray);
    
    /**
     * Sets (as xml) ith "AttachmentMeasure" element
     */
    void xsetAttachmentMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType attachmentMeasure);
    
    /**
     * Inserts the value as the ith "AttachmentMeasure" element
     */
    void insertAttachmentMeasure(int i, java.lang.String attachmentMeasure);
    
    /**
     * Appends the value as the last "AttachmentMeasure" element
     */
    void addAttachmentMeasure(java.lang.String attachmentMeasure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewAttachmentMeasure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewAttachmentMeasure();
    
    /**
     * Removes the ith "AttachmentMeasure" element
     */
    void removeAttachmentMeasure(int i);
    
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
     * Gets the "conceptRef" attribute
     */
    java.lang.String getConceptRef();
    
    /**
     * Gets (as xml) the "conceptRef" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptRef();
    
    /**
     * Sets the "conceptRef" attribute
     */
    void setConceptRef(java.lang.String conceptRef);
    
    /**
     * Sets (as xml) the "conceptRef" attribute
     */
    void xsetConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptRef);
    
    /**
     * Gets the "conceptVersion" attribute
     */
    java.lang.String getConceptVersion();
    
    /**
     * Gets (as xml) the "conceptVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetConceptVersion();
    
    /**
     * True if has "conceptVersion" attribute
     */
    boolean isSetConceptVersion();
    
    /**
     * Sets the "conceptVersion" attribute
     */
    void setConceptVersion(java.lang.String conceptVersion);
    
    /**
     * Sets (as xml) the "conceptVersion" attribute
     */
    void xsetConceptVersion(org.apache.xmlbeans.XmlString conceptVersion);
    
    /**
     * Unsets the "conceptVersion" attribute
     */
    void unsetConceptVersion();
    
    /**
     * Gets the "conceptAgency" attribute
     */
    java.lang.String getConceptAgency();
    
    /**
     * Gets (as xml) the "conceptAgency" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptAgency();
    
    /**
     * True if has "conceptAgency" attribute
     */
    boolean isSetConceptAgency();
    
    /**
     * Sets the "conceptAgency" attribute
     */
    void setConceptAgency(java.lang.String conceptAgency);
    
    /**
     * Sets (as xml) the "conceptAgency" attribute
     */
    void xsetConceptAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptAgency);
    
    /**
     * Unsets the "conceptAgency" attribute
     */
    void unsetConceptAgency();
    
    /**
     * Gets the "conceptSchemeRef" attribute
     */
    java.lang.String getConceptSchemeRef();
    
    /**
     * Gets (as xml) the "conceptSchemeRef" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptSchemeRef();
    
    /**
     * True if has "conceptSchemeRef" attribute
     */
    boolean isSetConceptSchemeRef();
    
    /**
     * Sets the "conceptSchemeRef" attribute
     */
    void setConceptSchemeRef(java.lang.String conceptSchemeRef);
    
    /**
     * Sets (as xml) the "conceptSchemeRef" attribute
     */
    void xsetConceptSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptSchemeRef);
    
    /**
     * Unsets the "conceptSchemeRef" attribute
     */
    void unsetConceptSchemeRef();
    
    /**
     * Gets the "conceptSchemeAgency" attribute
     */
    java.lang.String getConceptSchemeAgency();
    
    /**
     * Gets (as xml) the "conceptSchemeAgency" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptSchemeAgency();
    
    /**
     * True if has "conceptSchemeAgency" attribute
     */
    boolean isSetConceptSchemeAgency();
    
    /**
     * Sets the "conceptSchemeAgency" attribute
     */
    void setConceptSchemeAgency(java.lang.String conceptSchemeAgency);
    
    /**
     * Sets (as xml) the "conceptSchemeAgency" attribute
     */
    void xsetConceptSchemeAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptSchemeAgency);
    
    /**
     * Unsets the "conceptSchemeAgency" attribute
     */
    void unsetConceptSchemeAgency();
    
    /**
     * Gets the "codelist" attribute
     */
    java.lang.String getCodelist();
    
    /**
     * Gets (as xml) the "codelist" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelist();
    
    /**
     * True if has "codelist" attribute
     */
    boolean isSetCodelist();
    
    /**
     * Sets the "codelist" attribute
     */
    void setCodelist(java.lang.String codelist);
    
    /**
     * Sets (as xml) the "codelist" attribute
     */
    void xsetCodelist(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelist);
    
    /**
     * Unsets the "codelist" attribute
     */
    void unsetCodelist();
    
    /**
     * Gets the "codelistVersion" attribute
     */
    java.lang.String getCodelistVersion();
    
    /**
     * Gets (as xml) the "codelistVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetCodelistVersion();
    
    /**
     * True if has "codelistVersion" attribute
     */
    boolean isSetCodelistVersion();
    
    /**
     * Sets the "codelistVersion" attribute
     */
    void setCodelistVersion(java.lang.String codelistVersion);
    
    /**
     * Sets (as xml) the "codelistVersion" attribute
     */
    void xsetCodelistVersion(org.apache.xmlbeans.XmlString codelistVersion);
    
    /**
     * Unsets the "codelistVersion" attribute
     */
    void unsetCodelistVersion();
    
    /**
     * Gets the "codelistAgency" attribute
     */
    java.lang.String getCodelistAgency();
    
    /**
     * Gets (as xml) the "codelistAgency" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelistAgency();
    
    /**
     * True if has "codelistAgency" attribute
     */
    boolean isSetCodelistAgency();
    
    /**
     * Sets the "codelistAgency" attribute
     */
    void setCodelistAgency(java.lang.String codelistAgency);
    
    /**
     * Sets (as xml) the "codelistAgency" attribute
     */
    void xsetCodelistAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelistAgency);
    
    /**
     * Unsets the "codelistAgency" attribute
     */
    void unsetCodelistAgency();
    
    /**
     * Gets the "attachmentLevel" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType.Enum getAttachmentLevel();
    
    /**
     * Gets (as xml) the "attachmentLevel" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType xgetAttachmentLevel();
    
    /**
     * Sets the "attachmentLevel" attribute
     */
    void setAttachmentLevel(org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType.Enum attachmentLevel);
    
    /**
     * Sets (as xml) the "attachmentLevel" attribute
     */
    void xsetAttachmentLevel(org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType attachmentLevel);
    
    /**
     * Gets the "assignmentStatus" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType.Enum getAssignmentStatus();
    
    /**
     * Gets (as xml) the "assignmentStatus" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType xgetAssignmentStatus();
    
    /**
     * Sets the "assignmentStatus" attribute
     */
    void setAssignmentStatus(org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType.Enum assignmentStatus);
    
    /**
     * Sets (as xml) the "assignmentStatus" attribute
     */
    void xsetAssignmentStatus(org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType assignmentStatus);
    
    /**
     * Gets the "isTimeFormat" attribute
     */
    boolean getIsTimeFormat();
    
    /**
     * Gets (as xml) the "isTimeFormat" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTimeFormat();
    
    /**
     * True if has "isTimeFormat" attribute
     */
    boolean isSetIsTimeFormat();
    
    /**
     * Sets the "isTimeFormat" attribute
     */
    void setIsTimeFormat(boolean isTimeFormat);
    
    /**
     * Sets (as xml) the "isTimeFormat" attribute
     */
    void xsetIsTimeFormat(org.apache.xmlbeans.XmlBoolean isTimeFormat);
    
    /**
     * Unsets the "isTimeFormat" attribute
     */
    void unsetIsTimeFormat();
    
    /**
     * Gets the "crossSectionalAttachDataSet" attribute
     */
    boolean getCrossSectionalAttachDataSet();
    
    /**
     * Gets (as xml) the "crossSectionalAttachDataSet" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachDataSet();
    
    /**
     * True if has "crossSectionalAttachDataSet" attribute
     */
    boolean isSetCrossSectionalAttachDataSet();
    
    /**
     * Sets the "crossSectionalAttachDataSet" attribute
     */
    void setCrossSectionalAttachDataSet(boolean crossSectionalAttachDataSet);
    
    /**
     * Sets (as xml) the "crossSectionalAttachDataSet" attribute
     */
    void xsetCrossSectionalAttachDataSet(org.apache.xmlbeans.XmlBoolean crossSectionalAttachDataSet);
    
    /**
     * Unsets the "crossSectionalAttachDataSet" attribute
     */
    void unsetCrossSectionalAttachDataSet();
    
    /**
     * Gets the "crossSectionalAttachGroup" attribute
     */
    boolean getCrossSectionalAttachGroup();
    
    /**
     * Gets (as xml) the "crossSectionalAttachGroup" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachGroup();
    
    /**
     * True if has "crossSectionalAttachGroup" attribute
     */
    boolean isSetCrossSectionalAttachGroup();
    
    /**
     * Sets the "crossSectionalAttachGroup" attribute
     */
    void setCrossSectionalAttachGroup(boolean crossSectionalAttachGroup);
    
    /**
     * Sets (as xml) the "crossSectionalAttachGroup" attribute
     */
    void xsetCrossSectionalAttachGroup(org.apache.xmlbeans.XmlBoolean crossSectionalAttachGroup);
    
    /**
     * Unsets the "crossSectionalAttachGroup" attribute
     */
    void unsetCrossSectionalAttachGroup();
    
    /**
     * Gets the "crossSectionalAttachSection" attribute
     */
    boolean getCrossSectionalAttachSection();
    
    /**
     * Gets (as xml) the "crossSectionalAttachSection" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachSection();
    
    /**
     * True if has "crossSectionalAttachSection" attribute
     */
    boolean isSetCrossSectionalAttachSection();
    
    /**
     * Sets the "crossSectionalAttachSection" attribute
     */
    void setCrossSectionalAttachSection(boolean crossSectionalAttachSection);
    
    /**
     * Sets (as xml) the "crossSectionalAttachSection" attribute
     */
    void xsetCrossSectionalAttachSection(org.apache.xmlbeans.XmlBoolean crossSectionalAttachSection);
    
    /**
     * Unsets the "crossSectionalAttachSection" attribute
     */
    void unsetCrossSectionalAttachSection();
    
    /**
     * Gets the "crossSectionalAttachObservation" attribute
     */
    boolean getCrossSectionalAttachObservation();
    
    /**
     * Gets (as xml) the "crossSectionalAttachObservation" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachObservation();
    
    /**
     * True if has "crossSectionalAttachObservation" attribute
     */
    boolean isSetCrossSectionalAttachObservation();
    
    /**
     * Sets the "crossSectionalAttachObservation" attribute
     */
    void setCrossSectionalAttachObservation(boolean crossSectionalAttachObservation);
    
    /**
     * Sets (as xml) the "crossSectionalAttachObservation" attribute
     */
    void xsetCrossSectionalAttachObservation(org.apache.xmlbeans.XmlBoolean crossSectionalAttachObservation);
    
    /**
     * Unsets the "crossSectionalAttachObservation" attribute
     */
    void unsetCrossSectionalAttachObservation();
    
    /**
     * Gets the "isEntityAttribute" attribute
     */
    boolean getIsEntityAttribute();
    
    /**
     * Gets (as xml) the "isEntityAttribute" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsEntityAttribute();
    
    /**
     * True if has "isEntityAttribute" attribute
     */
    boolean isSetIsEntityAttribute();
    
    /**
     * Sets the "isEntityAttribute" attribute
     */
    void setIsEntityAttribute(boolean isEntityAttribute);
    
    /**
     * Sets (as xml) the "isEntityAttribute" attribute
     */
    void xsetIsEntityAttribute(org.apache.xmlbeans.XmlBoolean isEntityAttribute);
    
    /**
     * Unsets the "isEntityAttribute" attribute
     */
    void unsetIsEntityAttribute();
    
    /**
     * Gets the "isNonObservationalTimeAttribute" attribute
     */
    boolean getIsNonObservationalTimeAttribute();
    
    /**
     * Gets (as xml) the "isNonObservationalTimeAttribute" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsNonObservationalTimeAttribute();
    
    /**
     * True if has "isNonObservationalTimeAttribute" attribute
     */
    boolean isSetIsNonObservationalTimeAttribute();
    
    /**
     * Sets the "isNonObservationalTimeAttribute" attribute
     */
    void setIsNonObservationalTimeAttribute(boolean isNonObservationalTimeAttribute);
    
    /**
     * Sets (as xml) the "isNonObservationalTimeAttribute" attribute
     */
    void xsetIsNonObservationalTimeAttribute(org.apache.xmlbeans.XmlBoolean isNonObservationalTimeAttribute);
    
    /**
     * Unsets the "isNonObservationalTimeAttribute" attribute
     */
    void unsetIsNonObservationalTimeAttribute();
    
    /**
     * Gets the "isCountAttribute" attribute
     */
    boolean getIsCountAttribute();
    
    /**
     * Gets (as xml) the "isCountAttribute" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCountAttribute();
    
    /**
     * True if has "isCountAttribute" attribute
     */
    boolean isSetIsCountAttribute();
    
    /**
     * Sets the "isCountAttribute" attribute
     */
    void setIsCountAttribute(boolean isCountAttribute);
    
    /**
     * Sets (as xml) the "isCountAttribute" attribute
     */
    void xsetIsCountAttribute(org.apache.xmlbeans.XmlBoolean isCountAttribute);
    
    /**
     * Unsets the "isCountAttribute" attribute
     */
    void unsetIsCountAttribute();
    
    /**
     * Gets the "isFrequencyAttribute" attribute
     */
    boolean getIsFrequencyAttribute();
    
    /**
     * Gets (as xml) the "isFrequencyAttribute" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFrequencyAttribute();
    
    /**
     * True if has "isFrequencyAttribute" attribute
     */
    boolean isSetIsFrequencyAttribute();
    
    /**
     * Sets the "isFrequencyAttribute" attribute
     */
    void setIsFrequencyAttribute(boolean isFrequencyAttribute);
    
    /**
     * Sets (as xml) the "isFrequencyAttribute" attribute
     */
    void xsetIsFrequencyAttribute(org.apache.xmlbeans.XmlBoolean isFrequencyAttribute);
    
    /**
     * Unsets the "isFrequencyAttribute" attribute
     */
    void unsetIsFrequencyAttribute();
    
    /**
     * Gets the "isIdentityAttribute" attribute
     */
    boolean getIsIdentityAttribute();
    
    /**
     * Gets (as xml) the "isIdentityAttribute" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsIdentityAttribute();
    
    /**
     * True if has "isIdentityAttribute" attribute
     */
    boolean isSetIsIdentityAttribute();
    
    /**
     * Sets the "isIdentityAttribute" attribute
     */
    void setIsIdentityAttribute(boolean isIdentityAttribute);
    
    /**
     * Sets (as xml) the "isIdentityAttribute" attribute
     */
    void xsetIsIdentityAttribute(org.apache.xmlbeans.XmlBoolean isIdentityAttribute);
    
    /**
     * Unsets the "isIdentityAttribute" attribute
     */
    void unsetIsIdentityAttribute();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
