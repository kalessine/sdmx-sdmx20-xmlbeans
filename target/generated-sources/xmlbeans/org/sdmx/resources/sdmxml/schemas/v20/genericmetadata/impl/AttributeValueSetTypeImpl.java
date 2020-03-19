/*
 * XML Type:  AttributeValueSetType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.impl;
/**
 * An XML AttributeValueSetType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is a complex type.
 */
public class AttributeValueSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeValueSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "TargetRef");
    private static final javax.xml.namespace.QName TARGETVALUES$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "TargetValues");
    private static final javax.xml.namespace.QName REPORTEDATTRIBUTE$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "ReportedAttribute");
    
    
    /**
     * Gets the "TargetRef" element
     */
    public java.lang.String getTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetRef" element
     */
    public void setTargetRef(java.lang.String targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETREF$0);
            }
            target.setStringValue(targetRef);
        }
    }
    
    /**
     * Sets (as xml) the "TargetRef" element
     */
    public void xsetTargetRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(TARGETREF$0);
            }
            target.set(targetRef);
        }
    }
    
    /**
     * Gets the "TargetValues" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType getTargetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType)get_store().find_element_user(TARGETVALUES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TargetValues" element
     */
    public void setTargetValues(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType targetValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType)get_store().find_element_user(TARGETVALUES$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType)get_store().add_element_user(TARGETVALUES$2);
            }
            target.set(targetValues);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetValues" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType addNewTargetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType)get_store().add_element_user(TARGETVALUES$2);
            return target;
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
}
