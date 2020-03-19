/*
 * XML Type:  TimePeriodType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common.impl;
/**
 * An XML TimePeriodType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 *     org.sdmx.resources.sdmxml.schemas.v20.common.PeriodType
 */
public class TimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlGYear, org.sdmx.resources.sdmxml.schemas.v20.common.PeriodType
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected TimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
