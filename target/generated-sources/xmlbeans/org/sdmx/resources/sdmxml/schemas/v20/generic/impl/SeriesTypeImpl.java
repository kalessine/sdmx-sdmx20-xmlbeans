/*
 * XML Type:  SeriesType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.generic.impl;
/**
 * An XML SeriesType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic).
 *
 * This is a complex type.
 */
public class SeriesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType
{
    private static final long serialVersionUID = 1L;
    
    public SeriesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIESKEY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "SeriesKey");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Attributes");
    private static final javax.xml.namespace.QName OBS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Obs");
    private static final javax.xml.namespace.QName ANNOTATIONS$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Annotations");
    
    
    /**
     * Gets the "SeriesKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType getSeriesKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType)get_store().find_element_user(SERIESKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SeriesKey" element
     */
    public void setSeriesKey(org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType seriesKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType)get_store().find_element_user(SERIESKEY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType)get_store().add_element_user(SERIESKEY$0);
            }
            target.set(seriesKey);
        }
    }
    
    /**
     * Appends and returns a new empty "SeriesKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType addNewSeriesKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesKeyType)get_store().add_element_user(SERIESKEY$0);
            return target;
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
     * Gets array of all "Obs" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType[] getObsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBS$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType[] result = new org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType getObsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType)get_store().find_element_user(OBS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Obs" element
     */
    public int sizeOfObsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBS$4);
        }
    }
    
    /**
     * Sets array of all "Obs" element
     */
    public void setObsArray(org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType[] obsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(obsArray, OBS$4);
        }
    }
    
    /**
     * Sets ith "Obs" element
     */
    public void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType obs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType)get_store().find_element_user(OBS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(obs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType insertNewObs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType)get_store().insert_element_user(OBS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType addNewObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.ObsType)get_store().add_element_user(OBS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Obs" element
     */
    public void removeObs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBS$4, i);
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
}
