/*
 * XML Type:  ReportedAttributeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.impl;
/**
 * An XML ReportedAttributeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is a complex type.
 */
public class ReportedAttributeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType
{
    private static final long serialVersionUID = 1L;
    
    public ReportedAttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "Value");
    private static final javax.xml.namespace.QName STARTTIME$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "StartTime");
    private static final javax.xml.namespace.QName REPORTEDATTRIBUTE$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "ReportedAttribute");
    private static final javax.xml.namespace.QName ANNOTATIONS$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "Annotations");
    private static final javax.xml.namespace.QName CONCEPTID$8 = 
        new javax.xml.namespace.QName("", "conceptID");
    
    
    /**
     * Gets array of all "Value" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0);
        }
    }
    
    /**
     * Sets array of all "Value" element
     */
    public void setValueArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$0);
        }
    }
    
    /**
     * Sets ith "Value" element
     */
    public void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(VALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, i);
        }
    }
    
    /**
     * Gets the "StartTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$2, 0);
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
            return get_store().count_elements(STARTTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "StartTime" element
     */
    public void setStartTime(java.util.Calendar startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$2);
            }
            target.setCalendarValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$2);
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
            get_store().remove_element(STARTTIME$2, 0);
        }
    }
    
    /**
     * Gets array of all "ReportedAttribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType[] getReportedAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTEDATTRIBUTE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportedAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType getReportedAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType)get_store().find_element_user(REPORTEDATTRIBUTE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportedAttribute" element
     */
    public int sizeOfReportedAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTEDATTRIBUTE$4);
        }
    }
    
    /**
     * Sets array of all "ReportedAttribute" element
     */
    public void setReportedAttributeArray(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType[] reportedAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportedAttributeArray, REPORTEDATTRIBUTE$4);
        }
    }
    
    /**
     * Sets ith "ReportedAttribute" element
     */
    public void setReportedAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType reportedAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType)get_store().find_element_user(REPORTEDATTRIBUTE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportedAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportedAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType insertNewReportedAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType)get_store().insert_element_user(REPORTEDATTRIBUTE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportedAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType addNewReportedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ReportedAttributeType)get_store().add_element_user(REPORTEDATTRIBUTE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportedAttribute" element
     */
    public void removeReportedAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTEDATTRIBUTE$4, i);
        }
    }
    
    /**
     * Gets the "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Annotations" element
     */
    public boolean isSetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "Annotations" element
     */
    public void setAnnotations(org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType annotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$6);
            }
            target.set(annotations);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType addNewAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Annotations" element
     */
    public void unsetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONS$6, 0);
        }
    }
    
    /**
     * Gets the "conceptID" attribute
     */
    public java.lang.String getConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTID$8);
            return target;
        }
    }
    
    /**
     * Sets the "conceptID" attribute
     */
    public void setConceptID(java.lang.String conceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTID$8);
            }
            target.setStringValue(conceptID);
        }
    }
    
    /**
     * Sets (as xml) the "conceptID" attribute
     */
    public void xsetConceptID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTID$8);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTID$8);
            }
            target.set(conceptID);
        }
    }
}
