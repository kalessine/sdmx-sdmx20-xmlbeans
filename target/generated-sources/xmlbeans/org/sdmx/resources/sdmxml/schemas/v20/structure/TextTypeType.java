/*
 * XML Type:  TextTypeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure;


/**
 * An XML TextTypeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.
 */
public interface TextTypeType extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TextTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F0107E49A1166E3A1B698FD8F6E9440").resolveHandle("texttypetype1e6etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum STRING = Enum.forString("String");
    static final Enum BIG_INTEGER = Enum.forString("BigInteger");
    static final Enum INTEGER = Enum.forString("Integer");
    static final Enum LONG = Enum.forString("Long");
    static final Enum SHORT = Enum.forString("Short");
    static final Enum DECIMAL = Enum.forString("Decimal");
    static final Enum FLOAT = Enum.forString("Float");
    static final Enum DOUBLE = Enum.forString("Double");
    static final Enum BOOLEAN = Enum.forString("Boolean");
    static final Enum DATE_TIME = Enum.forString("DateTime");
    static final Enum DATE = Enum.forString("Date");
    static final Enum TIME = Enum.forString("Time");
    static final Enum YEAR = Enum.forString("Year");
    static final Enum MONTH = Enum.forString("Month");
    static final Enum DAY = Enum.forString("Day");
    static final Enum MONTH_DAY = Enum.forString("MonthDay");
    static final Enum YEAR_MONTH = Enum.forString("YearMonth");
    static final Enum DURATION = Enum.forString("Duration");
    static final Enum URI = Enum.forString("URI");
    static final Enum TIMESPAN = Enum.forString("Timespan");
    static final Enum COUNT = Enum.forString("Count");
    static final Enum INCLUSIVE_VALUE_RANGE = Enum.forString("InclusiveValueRange");
    static final Enum EXCLUSIVE_VALUE_RANGE = Enum.forString("ExclusiveValueRange");
    static final Enum INCREMENTAL = Enum.forString("Incremental");
    static final Enum OBSERVATIONAL_TIME_PERIOD = Enum.forString("ObservationalTimePeriod");
    
    static final int INT_STRING = Enum.INT_STRING;
    static final int INT_BIG_INTEGER = Enum.INT_BIG_INTEGER;
    static final int INT_INTEGER = Enum.INT_INTEGER;
    static final int INT_LONG = Enum.INT_LONG;
    static final int INT_SHORT = Enum.INT_SHORT;
    static final int INT_DECIMAL = Enum.INT_DECIMAL;
    static final int INT_FLOAT = Enum.INT_FLOAT;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
    static final int INT_DATE_TIME = Enum.INT_DATE_TIME;
    static final int INT_DATE = Enum.INT_DATE;
    static final int INT_TIME = Enum.INT_TIME;
    static final int INT_YEAR = Enum.INT_YEAR;
    static final int INT_MONTH = Enum.INT_MONTH;
    static final int INT_DAY = Enum.INT_DAY;
    static final int INT_MONTH_DAY = Enum.INT_MONTH_DAY;
    static final int INT_YEAR_MONTH = Enum.INT_YEAR_MONTH;
    static final int INT_DURATION = Enum.INT_DURATION;
    static final int INT_URI = Enum.INT_URI;
    static final int INT_TIMESPAN = Enum.INT_TIMESPAN;
    static final int INT_COUNT = Enum.INT_COUNT;
    static final int INT_INCLUSIVE_VALUE_RANGE = Enum.INT_INCLUSIVE_VALUE_RANGE;
    static final int INT_EXCLUSIVE_VALUE_RANGE = Enum.INT_EXCLUSIVE_VALUE_RANGE;
    static final int INT_INCREMENTAL = Enum.INT_INCREMENTAL;
    static final int INT_OBSERVATIONAL_TIME_PERIOD = Enum.INT_OBSERVATIONAL_TIME_PERIOD;
    
    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_STRING
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
        
        static final int INT_STRING = 1;
        static final int INT_BIG_INTEGER = 2;
        static final int INT_INTEGER = 3;
        static final int INT_LONG = 4;
        static final int INT_SHORT = 5;
        static final int INT_DECIMAL = 6;
        static final int INT_FLOAT = 7;
        static final int INT_DOUBLE = 8;
        static final int INT_BOOLEAN = 9;
        static final int INT_DATE_TIME = 10;
        static final int INT_DATE = 11;
        static final int INT_TIME = 12;
        static final int INT_YEAR = 13;
        static final int INT_MONTH = 14;
        static final int INT_DAY = 15;
        static final int INT_MONTH_DAY = 16;
        static final int INT_YEAR_MONTH = 17;
        static final int INT_DURATION = 18;
        static final int INT_URI = 19;
        static final int INT_TIMESPAN = 20;
        static final int INT_COUNT = 21;
        static final int INT_INCLUSIVE_VALUE_RANGE = 22;
        static final int INT_EXCLUSIVE_VALUE_RANGE = 23;
        static final int INT_INCREMENTAL = 24;
        static final int INT_OBSERVATIONAL_TIME_PERIOD = 25;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("String", INT_STRING),
                new Enum("BigInteger", INT_BIG_INTEGER),
                new Enum("Integer", INT_INTEGER),
                new Enum("Long", INT_LONG),
                new Enum("Short", INT_SHORT),
                new Enum("Decimal", INT_DECIMAL),
                new Enum("Float", INT_FLOAT),
                new Enum("Double", INT_DOUBLE),
                new Enum("Boolean", INT_BOOLEAN),
                new Enum("DateTime", INT_DATE_TIME),
                new Enum("Date", INT_DATE),
                new Enum("Time", INT_TIME),
                new Enum("Year", INT_YEAR),
                new Enum("Month", INT_MONTH),
                new Enum("Day", INT_DAY),
                new Enum("MonthDay", INT_MONTH_DAY),
                new Enum("YearMonth", INT_YEAR_MONTH),
                new Enum("Duration", INT_DURATION),
                new Enum("URI", INT_URI),
                new Enum("Timespan", INT_TIMESPAN),
                new Enum("Count", INT_COUNT),
                new Enum("InclusiveValueRange", INT_INCLUSIVE_VALUE_RANGE),
                new Enum("ExclusiveValueRange", INT_EXCLUSIVE_VALUE_RANGE),
                new Enum("Incremental", INT_INCREMENTAL),
                new Enum("ObservationalTimePeriod", INT_OBSERVATIONAL_TIME_PERIOD),
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
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
