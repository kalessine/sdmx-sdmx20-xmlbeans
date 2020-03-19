/*
 * XML Type:  ConstraintType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common.impl;
/**
 * An XML ConstraintType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a complex type.
 */
public class ConstraintTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintType
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "ConstraintID");
    private static final javax.xml.namespace.QName CUBEREGION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "CubeRegion");
    private static final javax.xml.namespace.QName METADATACONCEPTSET$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "MetadataConceptSet");
    private static final javax.xml.namespace.QName KEYSET$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "KeySet");
    private static final javax.xml.namespace.QName RELEASECALENDAR$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "ReleaseCalendar");
    private static final javax.xml.namespace.QName REFERENCEPERIOD$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "ReferencePeriod");
    private static final javax.xml.namespace.QName CONSTRAINTTYPE$12 = 
        new javax.xml.namespace.QName("", "ConstraintType");
    
    
    /**
     * Gets the "ConstraintID" element
     */
    public java.lang.String getConstraintID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConstraintID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConstraintID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CONSTRAINTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintID" element
     */
    public void setConstraintID(java.lang.String constraintID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTRAINTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTRAINTID$0);
            }
            target.setStringValue(constraintID);
        }
    }
    
    /**
     * Sets (as xml) the "ConstraintID" element
     */
    public void xsetConstraintID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType constraintID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CONSTRAINTID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CONSTRAINTID$0);
            }
            target.set(constraintID);
        }
    }
    
    /**
     * Gets array of all "CubeRegion" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType[] getCubeRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUBEREGION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType getCubeRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType)get_store().find_element_user(CUBEREGION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CubeRegion" element
     */
    public int sizeOfCubeRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUBEREGION$2);
        }
    }
    
    /**
     * Sets array of all "CubeRegion" element
     */
    public void setCubeRegionArray(org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType[] cubeRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cubeRegionArray, CUBEREGION$2);
        }
    }
    
    /**
     * Sets ith "CubeRegion" element
     */
    public void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType cubeRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType)get_store().find_element_user(CUBEREGION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cubeRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType insertNewCubeRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType)get_store().insert_element_user(CUBEREGION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType addNewCubeRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType)get_store().add_element_user(CUBEREGION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "CubeRegion" element
     */
    public void removeCubeRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUBEREGION$2, i);
        }
    }
    
    /**
     * Gets the "MetadataConceptSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType getMetadataConceptSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType)get_store().find_element_user(METADATACONCEPTSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataConceptSet" element
     */
    public boolean isSetMetadataConceptSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATACONCEPTSET$4) != 0;
        }
    }
    
    /**
     * Sets the "MetadataConceptSet" element
     */
    public void setMetadataConceptSet(org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType metadataConceptSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType)get_store().find_element_user(METADATACONCEPTSET$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType)get_store().add_element_user(METADATACONCEPTSET$4);
            }
            target.set(metadataConceptSet);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataConceptSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType addNewMetadataConceptSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MetadataConceptSetType)get_store().add_element_user(METADATACONCEPTSET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataConceptSet" element
     */
    public void unsetMetadataConceptSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATACONCEPTSET$4, 0);
        }
    }
    
    /**
     * Gets array of all "KeySet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType[] getKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYSET$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType getKeySetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType)get_store().find_element_user(KEYSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeySet" element
     */
    public int sizeOfKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYSET$6);
        }
    }
    
    /**
     * Sets array of all "KeySet" element
     */
    public void setKeySetArray(org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType[] keySetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keySetArray, KEYSET$6);
        }
    }
    
    /**
     * Sets ith "KeySet" element
     */
    public void setKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType keySet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType)get_store().find_element_user(KEYSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keySet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType insertNewKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType)get_store().insert_element_user(KEYSET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType addNewKeySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.KeySetType)get_store().add_element_user(KEYSET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeySet" element
     */
    public void removeKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYSET$6, i);
        }
    }
    
    /**
     * Gets the "ReleaseCalendar" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType getReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType)get_store().find_element_user(RELEASECALENDAR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReleaseCalendar" element
     */
    public boolean isSetReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEASECALENDAR$8) != 0;
        }
    }
    
    /**
     * Sets the "ReleaseCalendar" element
     */
    public void setReleaseCalendar(org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType releaseCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType)get_store().find_element_user(RELEASECALENDAR$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType)get_store().add_element_user(RELEASECALENDAR$8);
            }
            target.set(releaseCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "ReleaseCalendar" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType addNewReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReleaseCalendarType)get_store().add_element_user(RELEASECALENDAR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ReleaseCalendar" element
     */
    public void unsetReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEASECALENDAR$8, 0);
        }
    }
    
    /**
     * Gets the "ReferencePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType getReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType)get_store().find_element_user(REFERENCEPERIOD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferencePeriod" element
     */
    public boolean isSetReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEPERIOD$10) != 0;
        }
    }
    
    /**
     * Sets the "ReferencePeriod" element
     */
    public void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType referencePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType)get_store().find_element_user(REFERENCEPERIOD$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType)get_store().add_element_user(REFERENCEPERIOD$10);
            }
            target.set(referencePeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType addNewReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ReferencePeriodType)get_store().add_element_user(REFERENCEPERIOD$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferencePeriod" element
     */
    public void unsetReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEPERIOD$10, 0);
        }
    }
    
    /**
     * Gets the "ConstraintType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType.Enum getConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSTRAINTTYPE$12);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConstraintType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType xgetConstraintType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType)get_store().find_attribute_user(CONSTRAINTTYPE$12);
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintType" attribute
     */
    public void setConstraintType(org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType.Enum constraintType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSTRAINTTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSTRAINTTYPE$12);
            }
            target.setEnumValue(constraintType);
        }
    }
    
    /**
     * Sets (as xml) the "ConstraintType" attribute
     */
    public void xsetConstraintType(org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType constraintType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType)get_store().find_attribute_user(CONSTRAINTTYPE$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ConstraintTypeType)get_store().add_attribute_user(CONSTRAINTTYPE$12);
            }
            target.set(constraintType);
        }
    }
}
