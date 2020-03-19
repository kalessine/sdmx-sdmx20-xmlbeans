/*
 * XML Type:  TimeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.TimeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML TimeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public class TimeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.query.TimeType
{
    private static final long serialVersionUID = 1L;
    
    public TimeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTTIME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StartTime");
    private static final javax.xml.namespace.QName ENDTIME$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "EndTime");
    private static final javax.xml.namespace.QName TIME$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Time");
    
    
    /**
     * Gets the "StartTime" element
     */
    public java.lang.Object getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(STARTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "StartTime" element
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "StartTime" element
     */
    public void setStartTime(java.lang.Object startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$0);
            }
            target.setObjectValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    public void xsetStartTime(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_element_user(STARTTIME$0);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Unsets the "StartTime" element
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$0, 0);
        }
    }
    
    /**
     * Gets the "EndTime" element
     */
    public java.lang.Object getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndTime" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(ENDTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "EndTime" element
     */
    public boolean isSetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "EndTime" element
     */
    public void setEndTime(java.lang.Object endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$2);
            }
            target.setObjectValue(endTime);
        }
    }
    
    /**
     * Sets (as xml) the "EndTime" element
     */
    public void xsetEndTime(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_element_user(ENDTIME$2);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Unsets the "EndTime" element
     */
    public void unsetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDTIME$2, 0);
        }
    }
    
    /**
     * Gets the "Time" element
     */
    public java.lang.Object getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "Time" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(TIME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$4) != 0;
        }
    }
    
    /**
     * Sets the "Time" element
     */
    public void setTime(java.lang.Object time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$4);
            }
            target.setObjectValue(time);
        }
    }
    
    /**
     * Sets (as xml) the "Time" element
     */
    public void xsetTime(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_element_user(TIME$4);
            }
            target.set(time);
        }
    }
    
    /**
     * Unsets the "Time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$4, 0);
        }
    }
}
