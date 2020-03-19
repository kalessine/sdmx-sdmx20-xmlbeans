/*
 * XML Type:  GroupType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.generic.impl;
/**
 * An XML GroupType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic).
 *
 * This is a complex type.
 */
public class GroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType
{
    private static final long serialVersionUID = 1L;
    
    public GroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPKEY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "GroupKey");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Attributes");
    private static final javax.xml.namespace.QName SERIES$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Series");
    private static final javax.xml.namespace.QName ANNOTATIONS$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Annotations");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "GroupKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType getGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().find_element_user(GROUPKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GroupKey" element
     */
    public boolean isSetGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPKEY$0) != 0;
        }
    }
    
    /**
     * Sets the "GroupKey" element
     */
    public void setGroupKey(org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType groupKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().find_element_user(GROUPKEY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().add_element_user(GROUPKEY$0);
            }
            target.set(groupKey);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType addNewGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().add_element_user(GROUPKEY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "GroupKey" element
     */
    public void unsetGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPKEY$0, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$2);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$2, 0);
        }
    }
    
    /**
     * Gets array of all "Series" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType[] getSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIES$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType[] result = new org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType getSeriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().find_element_user(SERIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Series" element
     */
    public int sizeOfSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIES$4);
        }
    }
    
    /**
     * Sets array of all "Series" element
     */
    public void setSeriesArray(org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType[] seriesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(seriesArray, SERIES$4);
        }
    }
    
    /**
     * Sets ith "Series" element
     */
    public void setSeriesArray(int i, org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().find_element_user(SERIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(series);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType insertNewSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().insert_element_user(SERIES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().add_element_user(SERIES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Series" element
     */
    public void removeSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIES$4, i);
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
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPE$8);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlNMTOKEN type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(TYPE$8);
            }
            target.set(type);
        }
    }
}
