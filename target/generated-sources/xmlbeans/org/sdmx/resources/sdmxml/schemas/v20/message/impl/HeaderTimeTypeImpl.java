/*
 * XML Type:  HeaderTimeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * An XML HeaderTimeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlDate
 */
public class HeaderTimeTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlDate
{
    private static final long serialVersionUID = 1L;
    
    public HeaderTimeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected HeaderTimeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
