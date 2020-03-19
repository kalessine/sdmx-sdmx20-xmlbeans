/*
 * XML Type:  HeaderType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message;


/**
 * An XML HeaderType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a complex type.
 */
public interface HeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("headertype8408type");
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType id);
    
    /**
     * Gets the "Test" element
     */
    boolean getTest();
    
    /**
     * Gets (as xml) the "Test" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTest();
    
    /**
     * Sets the "Test" element
     */
    void setTest(boolean test);
    
    /**
     * Sets (as xml) the "Test" element
     */
    void xsetTest(org.apache.xmlbeans.XmlBoolean test);
    
    /**
     * Gets the "Truncated" element
     */
    boolean getTruncated();
    
    /**
     * Gets (as xml) the "Truncated" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTruncated();
    
    /**
     * True if has "Truncated" element
     */
    boolean isSetTruncated();
    
    /**
     * Sets the "Truncated" element
     */
    void setTruncated(boolean truncated);
    
    /**
     * Sets (as xml) the "Truncated" element
     */
    void xsetTruncated(org.apache.xmlbeans.XmlBoolean truncated);
    
    /**
     * Unsets the "Truncated" element
     */
    void unsetTruncated();
    
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
     * Gets the "Prepared" element
     */
    java.util.Calendar getPrepared();
    
    /**
     * Gets (as xml) the "Prepared" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType xgetPrepared();
    
    /**
     * Sets the "Prepared" element
     */
    void setPrepared(java.util.Calendar prepared);
    
    /**
     * Sets (as xml) the "Prepared" element
     */
    void xsetPrepared(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType prepared);
    
    /**
     * Gets array of all "Sender" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] getSenderArray();
    
    /**
     * Gets ith "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType getSenderArray(int i);
    
    /**
     * Returns number of "Sender" element
     */
    int sizeOfSenderArray();
    
    /**
     * Sets array of all "Sender" element
     */
    void setSenderArray(org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] senderArray);
    
    /**
     * Sets ith "Sender" element
     */
    void setSenderArray(int i, org.sdmx.resources.sdmxml.schemas.v20.message.PartyType sender);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType insertNewSender(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType addNewSender();
    
    /**
     * Removes the ith "Sender" element
     */
    void removeSender(int i);
    
    /**
     * Gets array of all "Receiver" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] getReceiverArray();
    
    /**
     * Gets ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType getReceiverArray(int i);
    
    /**
     * Returns number of "Receiver" element
     */
    int sizeOfReceiverArray();
    
    /**
     * Sets array of all "Receiver" element
     */
    void setReceiverArray(org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] receiverArray);
    
    /**
     * Sets ith "Receiver" element
     */
    void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v20.message.PartyType receiver);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType insertNewReceiver(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.PartyType addNewReceiver();
    
    /**
     * Removes the ith "Receiver" element
     */
    void removeReceiver(int i);
    
    /**
     * Gets the "KeyFamilyRef" element
     */
    java.lang.String getKeyFamilyRef();
    
    /**
     * Gets (as xml) the "KeyFamilyRef" element
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetKeyFamilyRef();
    
    /**
     * True if has "KeyFamilyRef" element
     */
    boolean isSetKeyFamilyRef();
    
    /**
     * Sets the "KeyFamilyRef" element
     */
    void setKeyFamilyRef(java.lang.String keyFamilyRef);
    
    /**
     * Sets (as xml) the "KeyFamilyRef" element
     */
    void xsetKeyFamilyRef(org.apache.xmlbeans.XmlNMTOKEN keyFamilyRef);
    
    /**
     * Unsets the "KeyFamilyRef" element
     */
    void unsetKeyFamilyRef();
    
    /**
     * Gets the "KeyFamilyAgency" element
     */
    java.lang.String getKeyFamilyAgency();
    
    /**
     * Gets (as xml) the "KeyFamilyAgency" element
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetKeyFamilyAgency();
    
    /**
     * True if has "KeyFamilyAgency" element
     */
    boolean isSetKeyFamilyAgency();
    
    /**
     * Sets the "KeyFamilyAgency" element
     */
    void setKeyFamilyAgency(java.lang.String keyFamilyAgency);
    
    /**
     * Sets (as xml) the "KeyFamilyAgency" element
     */
    void xsetKeyFamilyAgency(org.apache.xmlbeans.XmlNMTOKEN keyFamilyAgency);
    
    /**
     * Unsets the "KeyFamilyAgency" element
     */
    void unsetKeyFamilyAgency();
    
    /**
     * Gets the "DataSetAgency" element
     */
    java.lang.String getDataSetAgency();
    
    /**
     * Gets (as xml) the "DataSetAgency" element
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetDataSetAgency();
    
    /**
     * True if has "DataSetAgency" element
     */
    boolean isSetDataSetAgency();
    
    /**
     * Sets the "DataSetAgency" element
     */
    void setDataSetAgency(java.lang.String dataSetAgency);
    
    /**
     * Sets (as xml) the "DataSetAgency" element
     */
    void xsetDataSetAgency(org.apache.xmlbeans.XmlNMTOKEN dataSetAgency);
    
    /**
     * Unsets the "DataSetAgency" element
     */
    void unsetDataSetAgency();
    
    /**
     * Gets the "DataSetID" element
     */
    java.lang.String getDataSetID();
    
    /**
     * Gets (as xml) the "DataSetID" element
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetDataSetID();
    
    /**
     * True if has "DataSetID" element
     */
    boolean isSetDataSetID();
    
    /**
     * Sets the "DataSetID" element
     */
    void setDataSetID(java.lang.String dataSetID);
    
    /**
     * Sets (as xml) the "DataSetID" element
     */
    void xsetDataSetID(org.apache.xmlbeans.XmlNMTOKEN dataSetID);
    
    /**
     * Unsets the "DataSetID" element
     */
    void unsetDataSetID();
    
    /**
     * Gets the "DataSetAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getDataSetAction();
    
    /**
     * Gets (as xml) the "DataSetAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetDataSetAction();
    
    /**
     * True if has "DataSetAction" element
     */
    boolean isSetDataSetAction();
    
    /**
     * Sets the "DataSetAction" element
     */
    void setDataSetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum dataSetAction);
    
    /**
     * Sets (as xml) the "DataSetAction" element
     */
    void xsetDataSetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType dataSetAction);
    
    /**
     * Unsets the "DataSetAction" element
     */
    void unsetDataSetAction();
    
    /**
     * Gets the "Extracted" element
     */
    java.util.Calendar getExtracted();
    
    /**
     * Gets (as xml) the "Extracted" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExtracted();
    
    /**
     * True if has "Extracted" element
     */
    boolean isSetExtracted();
    
    /**
     * Sets the "Extracted" element
     */
    void setExtracted(java.util.Calendar extracted);
    
    /**
     * Sets (as xml) the "Extracted" element
     */
    void xsetExtracted(org.apache.xmlbeans.XmlDateTime extracted);
    
    /**
     * Unsets the "Extracted" element
     */
    void unsetExtracted();
    
    /**
     * Gets the "ReportingBegin" element
     */
    java.util.Calendar getReportingBegin();
    
    /**
     * Gets (as xml) the "ReportingBegin" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType xgetReportingBegin();
    
    /**
     * True if has "ReportingBegin" element
     */
    boolean isSetReportingBegin();
    
    /**
     * Sets the "ReportingBegin" element
     */
    void setReportingBegin(java.util.Calendar reportingBegin);
    
    /**
     * Sets (as xml) the "ReportingBegin" element
     */
    void xsetReportingBegin(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType reportingBegin);
    
    /**
     * Unsets the "ReportingBegin" element
     */
    void unsetReportingBegin();
    
    /**
     * Gets the "ReportingEnd" element
     */
    java.util.Calendar getReportingEnd();
    
    /**
     * Gets (as xml) the "ReportingEnd" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType xgetReportingEnd();
    
    /**
     * True if has "ReportingEnd" element
     */
    boolean isSetReportingEnd();
    
    /**
     * Sets the "ReportingEnd" element
     */
    void setReportingEnd(java.util.Calendar reportingEnd);
    
    /**
     * Sets (as xml) the "ReportingEnd" element
     */
    void xsetReportingEnd(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType reportingEnd);
    
    /**
     * Unsets the "ReportingEnd" element
     */
    void unsetReportingEnd();
    
    /**
     * Gets array of all "Source" elements
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getSourceArray();
    
    /**
     * Gets ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType getSourceArray(int i);
    
    /**
     * Returns number of "Source" element
     */
    int sizeOfSourceArray();
    
    /**
     * Sets array of all "Source" element
     */
    void setSourceArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] sourceArray);
    
    /**
     * Sets ith "Source" element
     */
    void setSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType source);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewSource();
    
    /**
     * Removes the ith "Source" element
     */
    void removeSource(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
