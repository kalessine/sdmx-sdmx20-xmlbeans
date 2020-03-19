/*
 * XML Type:  DataSetType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.generic.impl;
/**
 * An XML DataSetType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic).
 *
 * This is a complex type.
 */
public class DataSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.generic.DataSetType
{
    private static final long serialVersionUID = 1L;
    
    public DataSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFAMILYREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "KeyFamilyRef");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Attributes");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Group");
    private static final javax.xml.namespace.QName SERIES$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Series");
    private static final javax.xml.namespace.QName ANNOTATIONS$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/generic", "Annotations");
    private static final javax.xml.namespace.QName KEYFAMILYURI$10 = 
        new javax.xml.namespace.QName("", "keyFamilyURI");
    private static final javax.xml.namespace.QName DATASETID$12 = 
        new javax.xml.namespace.QName("", "datasetID");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEMEAGENCYID$14 = 
        new javax.xml.namespace.QName("", "dataProviderSchemeAgencyId");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEMEID$16 = 
        new javax.xml.namespace.QName("", "dataProviderSchemeId");
    private static final javax.xml.namespace.QName DATAPROVIDERID$18 = 
        new javax.xml.namespace.QName("", "dataProviderID");
    private static final javax.xml.namespace.QName DATAFLOWAGENCYID$20 = 
        new javax.xml.namespace.QName("", "dataflowAgencyID");
    private static final javax.xml.namespace.QName DATAFLOWID$22 = 
        new javax.xml.namespace.QName("", "dataflowID");
    private static final javax.xml.namespace.QName ACTION$24 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName REPORTINGBEGINDATE$26 = 
        new javax.xml.namespace.QName("", "reportingBeginDate");
    private static final javax.xml.namespace.QName REPORTINGENDDATE$28 = 
        new javax.xml.namespace.QName("", "reportingEndDate");
    private static final javax.xml.namespace.QName VALIDFROMDATE$30 = 
        new javax.xml.namespace.QName("", "validFromDate");
    private static final javax.xml.namespace.QName VALIDTODATE$32 = 
        new javax.xml.namespace.QName("", "validToDate");
    private static final javax.xml.namespace.QName PUBLICATIONYEAR$34 = 
        new javax.xml.namespace.QName("", "publicationYear");
    private static final javax.xml.namespace.QName PUBLICATIONPERIOD$36 = 
        new javax.xml.namespace.QName("", "publicationPeriod");
    
    
    /**
     * Gets the "KeyFamilyRef" element
     */
    public java.lang.String getKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(KEYFAMILYREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KeyFamilyRef" element
     */
    public void setKeyFamilyRef(java.lang.String keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILYREF$0);
            }
            target.setStringValue(keyFamilyRef);
        }
    }
    
    /**
     * Sets (as xml) the "KeyFamilyRef" element
     */
    public void xsetKeyFamilyRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(KEYFAMILYREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(KEYFAMILYREF$0);
            }
            target.set(keyFamilyRef);
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
     * Gets array of all "Group" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType[] result = new org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$4);
        }
    }
    
    /**
     * Sets array of all "Group" element
     */
    public void setGroupArray(org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$4);
        }
    }
    
    /**
     * Sets ith "Group" element
     */
    public void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType)get_store().insert_element_user(GROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.GroupType)get_store().add_element_user(GROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$4, i);
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
            get_store().find_all_element_users(SERIES$6, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().find_element_user(SERIES$6, i);
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
            return get_store().count_elements(SERIES$6);
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
            arraySetterHelper(seriesArray, SERIES$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().find_element_user(SERIES$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().insert_element_user(SERIES$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.generic.SeriesType)get_store().add_element_user(SERIES$6);
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
            get_store().remove_element(SERIES$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$8, 0);
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
            return get_store().count_elements(ANNOTATIONS$8) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$8);
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
            get_store().remove_element(ANNOTATIONS$8, 0);
        }
    }
    
    /**
     * Gets the "keyFamilyURI" attribute
     */
    public java.lang.String getKeyFamilyURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYFAMILYURI$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "keyFamilyURI" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetKeyFamilyURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(KEYFAMILYURI$10);
            return target;
        }
    }
    
    /**
     * True if has "keyFamilyURI" attribute
     */
    public boolean isSetKeyFamilyURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEYFAMILYURI$10) != null;
        }
    }
    
    /**
     * Sets the "keyFamilyURI" attribute
     */
    public void setKeyFamilyURI(java.lang.String keyFamilyURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYFAMILYURI$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYFAMILYURI$10);
            }
            target.setStringValue(keyFamilyURI);
        }
    }
    
    /**
     * Sets (as xml) the "keyFamilyURI" attribute
     */
    public void xsetKeyFamilyURI(org.apache.xmlbeans.XmlAnyURI keyFamilyURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(KEYFAMILYURI$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(KEYFAMILYURI$10);
            }
            target.set(keyFamilyURI);
        }
    }
    
    /**
     * Unsets the "keyFamilyURI" attribute
     */
    public void unsetKeyFamilyURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEYFAMILYURI$10);
        }
    }
    
    /**
     * Gets the "datasetID" attribute
     */
    public java.lang.String getDatasetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASETID$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "datasetID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDatasetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATASETID$12);
            return target;
        }
    }
    
    /**
     * True if has "datasetID" attribute
     */
    public boolean isSetDatasetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATASETID$12) != null;
        }
    }
    
    /**
     * Sets the "datasetID" attribute
     */
    public void setDatasetID(java.lang.String datasetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASETID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASETID$12);
            }
            target.setStringValue(datasetID);
        }
    }
    
    /**
     * Sets (as xml) the "datasetID" attribute
     */
    public void xsetDatasetID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType datasetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATASETID$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATASETID$12);
            }
            target.set(datasetID);
        }
    }
    
    /**
     * Unsets the "datasetID" attribute
     */
    public void unsetDatasetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATASETID$12);
        }
    }
    
    /**
     * Gets the "dataProviderSchemeAgencyId" attribute
     */
    public java.lang.String getDataProviderSchemeAgencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataProviderSchemeAgencyId" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataProviderSchemeAgencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14);
            return target;
        }
    }
    
    /**
     * True if has "dataProviderSchemeAgencyId" attribute
     */
    public boolean isSetDataProviderSchemeAgencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14) != null;
        }
    }
    
    /**
     * Sets the "dataProviderSchemeAgencyId" attribute
     */
    public void setDataProviderSchemeAgencyId(java.lang.String dataProviderSchemeAgencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14);
            }
            target.setStringValue(dataProviderSchemeAgencyId);
        }
    }
    
    /**
     * Sets (as xml) the "dataProviderSchemeAgencyId" attribute
     */
    public void xsetDataProviderSchemeAgencyId(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataProviderSchemeAgencyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAPROVIDERSCHEMEAGENCYID$14);
            }
            target.set(dataProviderSchemeAgencyId);
        }
    }
    
    /**
     * Unsets the "dataProviderSchemeAgencyId" attribute
     */
    public void unsetDataProviderSchemeAgencyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAPROVIDERSCHEMEAGENCYID$14);
        }
    }
    
    /**
     * Gets the "dataProviderSchemeId" attribute
     */
    public java.lang.String getDataProviderSchemeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataProviderSchemeId" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataProviderSchemeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$16);
            return target;
        }
    }
    
    /**
     * True if has "dataProviderSchemeId" attribute
     */
    public boolean isSetDataProviderSchemeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAPROVIDERSCHEMEID$16) != null;
        }
    }
    
    /**
     * Sets the "dataProviderSchemeId" attribute
     */
    public void setDataProviderSchemeId(java.lang.String dataProviderSchemeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPROVIDERSCHEMEID$16);
            }
            target.setStringValue(dataProviderSchemeId);
        }
    }
    
    /**
     * Sets (as xml) the "dataProviderSchemeId" attribute
     */
    public void xsetDataProviderSchemeId(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataProviderSchemeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAPROVIDERSCHEMEID$16);
            }
            target.set(dataProviderSchemeId);
        }
    }
    
    /**
     * Unsets the "dataProviderSchemeId" attribute
     */
    public void unsetDataProviderSchemeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAPROVIDERSCHEMEID$16);
        }
    }
    
    /**
     * Gets the "dataProviderID" attribute
     */
    public java.lang.String getDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERID$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataProviderID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERID$18);
            return target;
        }
    }
    
    /**
     * True if has "dataProviderID" attribute
     */
    public boolean isSetDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAPROVIDERID$18) != null;
        }
    }
    
    /**
     * Sets the "dataProviderID" attribute
     */
    public void setDataProviderID(java.lang.String dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPROVIDERID$18);
            }
            target.setStringValue(dataProviderID);
        }
    }
    
    /**
     * Sets (as xml) the "dataProviderID" attribute
     */
    public void xsetDataProviderID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataProviderID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERID$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAPROVIDERID$18);
            }
            target.set(dataProviderID);
        }
    }
    
    /**
     * Unsets the "dataProviderID" attribute
     */
    public void unsetDataProviderID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAPROVIDERID$18);
        }
    }
    
    /**
     * Gets the "dataflowAgencyID" attribute
     */
    public java.lang.String getDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWAGENCYID$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataflowAgencyID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWAGENCYID$20);
            return target;
        }
    }
    
    /**
     * True if has "dataflowAgencyID" attribute
     */
    public boolean isSetDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAFLOWAGENCYID$20) != null;
        }
    }
    
    /**
     * Sets the "dataflowAgencyID" attribute
     */
    public void setDataflowAgencyID(java.lang.String dataflowAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWAGENCYID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAFLOWAGENCYID$20);
            }
            target.setStringValue(dataflowAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "dataflowAgencyID" attribute
     */
    public void xsetDataflowAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataflowAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWAGENCYID$20);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAFLOWAGENCYID$20);
            }
            target.set(dataflowAgencyID);
        }
    }
    
    /**
     * Unsets the "dataflowAgencyID" attribute
     */
    public void unsetDataflowAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAFLOWAGENCYID$20);
        }
    }
    
    /**
     * Gets the "dataflowID" attribute
     */
    public java.lang.String getDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWID$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataflowID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWID$22);
            return target;
        }
    }
    
    /**
     * True if has "dataflowID" attribute
     */
    public boolean isSetDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATAFLOWID$22) != null;
        }
    }
    
    /**
     * Sets the "dataflowID" attribute
     */
    public void setDataflowID(java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAFLOWID$22);
            }
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Sets (as xml) the "dataflowID" attribute
     */
    public void xsetDataflowID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWID$22);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAFLOWID$22);
            }
            target.set(dataflowID);
        }
    }
    
    /**
     * Unsets the "dataflowID" attribute
     */
    public void unsetDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATAFLOWID$22);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$24);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_attribute_user(ACTION$24);
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$24) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$24);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_attribute_user(ACTION$24);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().add_attribute_user(ACTION$24);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$24);
        }
    }
    
    /**
     * Gets the "reportingBeginDate" attribute
     */
    public java.lang.Object getReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$26);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$26);
            return target;
        }
    }
    
    /**
     * True if has "reportingBeginDate" attribute
     */
    public boolean isSetReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTINGBEGINDATE$26) != null;
        }
    }
    
    /**
     * Sets the "reportingBeginDate" attribute
     */
    public void setReportingBeginDate(java.lang.Object reportingBeginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGBEGINDATE$26);
            }
            target.setObjectValue(reportingBeginDate);
        }
    }
    
    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    public void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType reportingBeginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$26);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(REPORTINGBEGINDATE$26);
            }
            target.set(reportingBeginDate);
        }
    }
    
    /**
     * Unsets the "reportingBeginDate" attribute
     */
    public void unsetReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTINGBEGINDATE$26);
        }
    }
    
    /**
     * Gets the "reportingEndDate" attribute
     */
    public java.lang.Object getReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$28);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$28);
            return target;
        }
    }
    
    /**
     * True if has "reportingEndDate" attribute
     */
    public boolean isSetReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTINGENDDATE$28) != null;
        }
    }
    
    /**
     * Sets the "reportingEndDate" attribute
     */
    public void setReportingEndDate(java.lang.Object reportingEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGENDDATE$28);
            }
            target.setObjectValue(reportingEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    public void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType reportingEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$28);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(REPORTINGENDDATE$28);
            }
            target.set(reportingEndDate);
        }
    }
    
    /**
     * Unsets the "reportingEndDate" attribute
     */
    public void unsetReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTINGENDDATE$28);
        }
    }
    
    /**
     * Gets the "validFromDate" attribute
     */
    public java.lang.Object getValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$30);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "validFromDate" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDFROMDATE$30);
            return target;
        }
    }
    
    /**
     * True if has "validFromDate" attribute
     */
    public boolean isSetValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROMDATE$30) != null;
        }
    }
    
    /**
     * Sets the "validFromDate" attribute
     */
    public void setValidFromDate(java.lang.Object validFromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROMDATE$30);
            }
            target.setObjectValue(validFromDate);
        }
    }
    
    /**
     * Sets (as xml) the "validFromDate" attribute
     */
    public void xsetValidFromDate(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validFromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDFROMDATE$30);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(VALIDFROMDATE$30);
            }
            target.set(validFromDate);
        }
    }
    
    /**
     * Unsets the "validFromDate" attribute
     */
    public void unsetValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROMDATE$30);
        }
    }
    
    /**
     * Gets the "validToDate" attribute
     */
    public java.lang.Object getValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$32);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "validToDate" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDTODATE$32);
            return target;
        }
    }
    
    /**
     * True if has "validToDate" attribute
     */
    public boolean isSetValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTODATE$32) != null;
        }
    }
    
    /**
     * Sets the "validToDate" attribute
     */
    public void setValidToDate(java.lang.Object validToDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTODATE$32);
            }
            target.setObjectValue(validToDate);
        }
    }
    
    /**
     * Sets (as xml) the "validToDate" attribute
     */
    public void xsetValidToDate(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validToDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDTODATE$32);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(VALIDTODATE$32);
            }
            target.set(validToDate);
        }
    }
    
    /**
     * Unsets the "validToDate" attribute
     */
    public void unsetValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTODATE$32);
        }
    }
    
    /**
     * Gets the "publicationYear" attribute
     */
    public java.util.Calendar getPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$34);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    public org.apache.xmlbeans.XmlGYear xgetPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$34);
            return target;
        }
    }
    
    /**
     * True if has "publicationYear" attribute
     */
    public boolean isSetPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLICATIONYEAR$34) != null;
        }
    }
    
    /**
     * Sets the "publicationYear" attribute
     */
    public void setPublicationYear(java.util.Calendar publicationYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONYEAR$34);
            }
            target.setCalendarValue(publicationYear);
        }
    }
    
    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    public void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGYear)get_store().add_attribute_user(PUBLICATIONYEAR$34);
            }
            target.set(publicationYear);
        }
    }
    
    /**
     * Unsets the "publicationYear" attribute
     */
    public void unsetPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLICATIONYEAR$34);
        }
    }
    
    /**
     * Gets the "publicationPeriod" attribute
     */
    public java.lang.Object getPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$36);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$36);
            return target;
        }
    }
    
    /**
     * True if has "publicationPeriod" attribute
     */
    public boolean isSetPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLICATIONPERIOD$36) != null;
        }
    }
    
    /**
     * Sets the "publicationPeriod" attribute
     */
    public void setPublicationPeriod(java.lang.Object publicationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONPERIOD$36);
            }
            target.setObjectValue(publicationPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    public void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType publicationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$36);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(PUBLICATIONPERIOD$36);
            }
            target.set(publicationPeriod);
        }
    }
    
    /**
     * Unsets the "publicationPeriod" attribute
     */
    public void unsetPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLICATIONPERIOD$36);
        }
    }
}
