/*
 * XML Type:  TextFormatType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML TextFormatType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class TextFormatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType
{
    private static final long serialVersionUID = 1L;
    
    public TextFormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTTYPE$0 = 
        new javax.xml.namespace.QName("", "textType");
    private static final javax.xml.namespace.QName ISSEQUENCE$2 = 
        new javax.xml.namespace.QName("", "isSequence");
    private static final javax.xml.namespace.QName MINLENGTH$4 = 
        new javax.xml.namespace.QName("", "minLength");
    private static final javax.xml.namespace.QName MAXLENGTH$6 = 
        new javax.xml.namespace.QName("", "maxLength");
    private static final javax.xml.namespace.QName STARTVALUE$8 = 
        new javax.xml.namespace.QName("", "startValue");
    private static final javax.xml.namespace.QName ENDVALUE$10 = 
        new javax.xml.namespace.QName("", "endValue");
    private static final javax.xml.namespace.QName INTERVAL$12 = 
        new javax.xml.namespace.QName("", "interval");
    private static final javax.xml.namespace.QName TIMEINTERVAL$14 = 
        new javax.xml.namespace.QName("", "timeInterval");
    private static final javax.xml.namespace.QName DECIMALS$16 = 
        new javax.xml.namespace.QName("", "decimals");
    private static final javax.xml.namespace.QName PATTERN$18 = 
        new javax.xml.namespace.QName("", "pattern");
    
    
    /**
     * Gets the "textType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.Enum getTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "textType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType xgetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType)get_store().find_attribute_user(TEXTTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "textType" attribute
     */
    public boolean isSetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "textType" attribute
     */
    public void setTextType(org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType.Enum textType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTTYPE$0);
            }
            target.setEnumValue(textType);
        }
    }
    
    /**
     * Sets (as xml) the "textType" attribute
     */
    public void xsetTextType(org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType textType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextTypeType)get_store().add_attribute_user(TEXTTYPE$0);
            }
            target.set(textType);
        }
    }
    
    /**
     * Unsets the "textType" attribute
     */
    public void unsetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTTYPE$0);
        }
    }
    
    /**
     * Gets the "isSequence" attribute
     */
    public boolean getIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSEQUENCE$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSequence" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSEQUENCE$2);
            return target;
        }
    }
    
    /**
     * True if has "isSequence" attribute
     */
    public boolean isSetIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSEQUENCE$2) != null;
        }
    }
    
    /**
     * Sets the "isSequence" attribute
     */
    public void setIsSequence(boolean isSequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSEQUENCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSEQUENCE$2);
            }
            target.setBooleanValue(isSequence);
        }
    }
    
    /**
     * Sets (as xml) the "isSequence" attribute
     */
    public void xsetIsSequence(org.apache.xmlbeans.XmlBoolean isSequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSEQUENCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISSEQUENCE$2);
            }
            target.set(isSequence);
        }
    }
    
    /**
     * Unsets the "isSequence" attribute
     */
    public void unsetIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSEQUENCE$2);
        }
    }
    
    /**
     * Gets the "minLength" attribute
     */
    public java.math.BigInteger getMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "minLength" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MINLENGTH$4);
            return target;
        }
    }
    
    /**
     * True if has "minLength" attribute
     */
    public boolean isSetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINLENGTH$4) != null;
        }
    }
    
    /**
     * Sets the "minLength" attribute
     */
    public void setMinLength(java.math.BigInteger minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINLENGTH$4);
            }
            target.setBigIntegerValue(minLength);
        }
    }
    
    /**
     * Sets (as xml) the "minLength" attribute
     */
    public void xsetMinLength(org.apache.xmlbeans.XmlInteger minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MINLENGTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(MINLENGTH$4);
            }
            target.set(minLength);
        }
    }
    
    /**
     * Unsets the "minLength" attribute
     */
    public void unsetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINLENGTH$4);
        }
    }
    
    /**
     * Gets the "maxLength" attribute
     */
    public java.math.BigInteger getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLength" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MAXLENGTH$6);
            return target;
        }
    }
    
    /**
     * True if has "maxLength" attribute
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXLENGTH$6) != null;
        }
    }
    
    /**
     * Sets the "maxLength" attribute
     */
    public void setMaxLength(java.math.BigInteger maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXLENGTH$6);
            }
            target.setBigIntegerValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "maxLength" attribute
     */
    public void xsetMaxLength(org.apache.xmlbeans.XmlInteger maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(MAXLENGTH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(MAXLENGTH$6);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Unsets the "maxLength" attribute
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXLENGTH$6);
        }
    }
    
    /**
     * Gets the "startValue" attribute
     */
    public double getStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVALUE$8);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "startValue" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTVALUE$8);
            return target;
        }
    }
    
    /**
     * True if has "startValue" attribute
     */
    public boolean isSetStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTVALUE$8) != null;
        }
    }
    
    /**
     * Sets the "startValue" attribute
     */
    public void setStartValue(double startValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTVALUE$8);
            }
            target.setDoubleValue(startValue);
        }
    }
    
    /**
     * Sets (as xml) the "startValue" attribute
     */
    public void xsetStartValue(org.apache.xmlbeans.XmlDouble startValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(STARTVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(STARTVALUE$8);
            }
            target.set(startValue);
        }
    }
    
    /**
     * Unsets the "startValue" attribute
     */
    public void unsetStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTVALUE$8);
        }
    }
    
    /**
     * Gets the "endValue" attribute
     */
    public double getEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVALUE$10);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "endValue" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDVALUE$10);
            return target;
        }
    }
    
    /**
     * True if has "endValue" attribute
     */
    public boolean isSetEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDVALUE$10) != null;
        }
    }
    
    /**
     * Sets the "endValue" attribute
     */
    public void setEndValue(double endValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVALUE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDVALUE$10);
            }
            target.setDoubleValue(endValue);
        }
    }
    
    /**
     * Sets (as xml) the "endValue" attribute
     */
    public void xsetEndValue(org.apache.xmlbeans.XmlDouble endValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ENDVALUE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ENDVALUE$10);
            }
            target.set(endValue);
        }
    }
    
    /**
     * Unsets the "endValue" attribute
     */
    public void unsetEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDVALUE$10);
        }
    }
    
    /**
     * Gets the "interval" attribute
     */
    public double getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERVAL$12);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "interval" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INTERVAL$12);
            return target;
        }
    }
    
    /**
     * True if has "interval" attribute
     */
    public boolean isSetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERVAL$12) != null;
        }
    }
    
    /**
     * Sets the "interval" attribute
     */
    public void setInterval(double interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERVAL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERVAL$12);
            }
            target.setDoubleValue(interval);
        }
    }
    
    /**
     * Sets (as xml) the "interval" attribute
     */
    public void xsetInterval(org.apache.xmlbeans.XmlDouble interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INTERVAL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INTERVAL$12);
            }
            target.set(interval);
        }
    }
    
    /**
     * Unsets the "interval" attribute
     */
    public void unsetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERVAL$12);
        }
    }
    
    /**
     * Gets the "timeInterval" attribute
     */
    public org.apache.xmlbeans.GDuration getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEINTERVAL$14);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeInterval" attribute
     */
    public org.apache.xmlbeans.XmlDuration xgetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(TIMEINTERVAL$14);
            return target;
        }
    }
    
    /**
     * True if has "timeInterval" attribute
     */
    public boolean isSetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMEINTERVAL$14) != null;
        }
    }
    
    /**
     * Sets the "timeInterval" attribute
     */
    public void setTimeInterval(org.apache.xmlbeans.GDuration timeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEINTERVAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEINTERVAL$14);
            }
            target.setGDurationValue(timeInterval);
        }
    }
    
    /**
     * Sets (as xml) the "timeInterval" attribute
     */
    public void xsetTimeInterval(org.apache.xmlbeans.XmlDuration timeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(TIMEINTERVAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_attribute_user(TIMEINTERVAL$14);
            }
            target.set(timeInterval);
        }
    }
    
    /**
     * Unsets the "timeInterval" attribute
     */
    public void unsetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMEINTERVAL$14);
        }
    }
    
    /**
     * Gets the "decimals" attribute
     */
    public java.math.BigInteger getDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALS$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimals" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DECIMALS$16);
            return target;
        }
    }
    
    /**
     * True if has "decimals" attribute
     */
    public boolean isSetDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMALS$16) != null;
        }
    }
    
    /**
     * Sets the "decimals" attribute
     */
    public void setDecimals(java.math.BigInteger decimals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMALS$16);
            }
            target.setBigIntegerValue(decimals);
        }
    }
    
    /**
     * Sets (as xml) the "decimals" attribute
     */
    public void xsetDecimals(org.apache.xmlbeans.XmlInteger decimals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DECIMALS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DECIMALS$16);
            }
            target.set(decimals);
        }
    }
    
    /**
     * Unsets the "decimals" attribute
     */
    public void unsetDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMALS$16);
        }
    }
    
    /**
     * Gets the "pattern" attribute
     */
    public java.lang.String getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pattern" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATTERN$18);
            return target;
        }
    }
    
    /**
     * True if has "pattern" attribute
     */
    public boolean isSetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATTERN$18) != null;
        }
    }
    
    /**
     * Sets the "pattern" attribute
     */
    public void setPattern(java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATTERN$18);
            }
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Sets (as xml) the "pattern" attribute
     */
    public void xsetPattern(org.apache.xmlbeans.XmlString pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATTERN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATTERN$18);
            }
            target.set(pattern);
        }
    }
    
    /**
     * Unsets the "pattern" attribute
     */
    public void unsetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATTERN$18);
        }
    }
}
