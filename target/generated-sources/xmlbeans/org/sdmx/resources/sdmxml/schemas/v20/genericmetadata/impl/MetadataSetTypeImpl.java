/*
 * XML Type:  MetadataSetType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.impl;
/**
 * An XML MetadataSetType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is a complex type.
 */
public class MetadataSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.MetadataSetType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "Name");
    private static final javax.xml.namespace.QName METADATASTRUCTUREREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "MetadataStructureRef");
    private static final javax.xml.namespace.QName METADATASTRUCTUREAGENCYREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "MetadataStructureAgencyRef");
    private static final javax.xml.namespace.QName REPORTREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "ReportRef");
    private static final javax.xml.namespace.QName ATTRIBUTEVALUESET$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "AttributeValueSet");
    private static final javax.xml.namespace.QName ANNOTATIONS$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "Annotations");
    private static final javax.xml.namespace.QName METADATASTRUCTUREURI$12 = 
        new javax.xml.namespace.QName("", "metadataStructureURI");
    private static final javax.xml.namespace.QName DATASETID$14 = 
        new javax.xml.namespace.QName("", "datasetID");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEMEAGENCYID$16 = 
        new javax.xml.namespace.QName("", "dataProviderSchemeAgencyId");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEMEID$18 = 
        new javax.xml.namespace.QName("", "dataProviderSchemeId");
    private static final javax.xml.namespace.QName DATAPROVIDERID$20 = 
        new javax.xml.namespace.QName("", "dataProviderID");
    private static final javax.xml.namespace.QName DATAFLOWAGENCYID$22 = 
        new javax.xml.namespace.QName("", "dataflowAgencyID");
    private static final javax.xml.namespace.QName DATAFLOWID$24 = 
        new javax.xml.namespace.QName("", "dataflowID");
    private static final javax.xml.namespace.QName ACTION$26 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName REPORTINGBEGINDATE$28 = 
        new javax.xml.namespace.QName("", "reportingBeginDate");
    private static final javax.xml.namespace.QName REPORTINGENDDATE$30 = 
        new javax.xml.namespace.QName("", "reportingEndDate");
    private static final javax.xml.namespace.QName VALIDFROMDATE$32 = 
        new javax.xml.namespace.QName("", "validFromDate");
    private static final javax.xml.namespace.QName VALIDTODATE$34 = 
        new javax.xml.namespace.QName("", "validToDate");
    private static final javax.xml.namespace.QName PUBLICATIONYEAR$36 = 
        new javax.xml.namespace.QName("", "publicationYear");
    private static final javax.xml.namespace.QName PUBLICATIONPERIOD$38 = 
        new javax.xml.namespace.QName("", "publicationPeriod");
    
    
    /**
     * Gets array of all "Name" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0);
        }
    }
    
    /**
     * Sets array of all "Name" element
     */
    public void setNameArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
    }
    
    /**
     * Sets ith "Name" element
     */
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, i);
        }
    }
    
    /**
     * Gets the "MetadataStructureRef" element
     */
    public java.lang.String getMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTUREREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(METADATASTRUCTUREREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MetadataStructureRef" element
     */
    public void setMetadataStructureRef(java.lang.String metadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTUREREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASTRUCTUREREF$2);
            }
            target.setStringValue(metadataStructureRef);
        }
    }
    
    /**
     * Sets (as xml) the "MetadataStructureRef" element
     */
    public void xsetMetadataStructureRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType metadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(METADATASTRUCTUREREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(METADATASTRUCTUREREF$2);
            }
            target.set(metadataStructureRef);
        }
    }
    
    /**
     * Gets the "MetadataStructureAgencyRef" element
     */
    public java.lang.String getMetadataStructureAgencyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTUREAGENCYREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MetadataStructureAgencyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMetadataStructureAgencyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(METADATASTRUCTUREAGENCYREF$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MetadataStructureAgencyRef" element
     */
    public void setMetadataStructureAgencyRef(java.lang.String metadataStructureAgencyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTUREAGENCYREF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASTRUCTUREAGENCYREF$4);
            }
            target.setStringValue(metadataStructureAgencyRef);
        }
    }
    
    /**
     * Sets (as xml) the "MetadataStructureAgencyRef" element
     */
    public void xsetMetadataStructureAgencyRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType metadataStructureAgencyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(METADATASTRUCTUREAGENCYREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(METADATASTRUCTUREAGENCYREF$4);
            }
            target.set(metadataStructureAgencyRef);
        }
    }
    
    /**
     * Gets the "ReportRef" element
     */
    public java.lang.String getReportRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetReportRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(REPORTREF$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReportRef" element
     */
    public void setReportRef(java.lang.String reportRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTREF$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTREF$6);
            }
            target.setStringValue(reportRef);
        }
    }
    
    /**
     * Sets (as xml) the "ReportRef" element
     */
    public void xsetReportRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType reportRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(REPORTREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(REPORTREF$6);
            }
            target.set(reportRef);
        }
    }
    
    /**
     * Gets array of all "AttributeValueSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType[] getAttributeValueSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEVALUESET$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType[] result = new org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeValueSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType getAttributeValueSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType)get_store().find_element_user(ATTRIBUTEVALUESET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttributeValueSet" element
     */
    public int sizeOfAttributeValueSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEVALUESET$8);
        }
    }
    
    /**
     * Sets array of all "AttributeValueSet" element
     */
    public void setAttributeValueSetArray(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType[] attributeValueSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeValueSetArray, ATTRIBUTEVALUESET$8);
        }
    }
    
    /**
     * Sets ith "AttributeValueSet" element
     */
    public void setAttributeValueSetArray(int i, org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType attributeValueSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType)get_store().find_element_user(ATTRIBUTEVALUESET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeValueSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeValueSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType insertNewAttributeValueSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType)get_store().insert_element_user(ATTRIBUTEVALUESET$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeValueSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType addNewAttributeValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.AttributeValueSetType)get_store().add_element_user(ATTRIBUTEVALUESET$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeValueSet" element
     */
    public void removeAttributeValueSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEVALUESET$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$10, 0);
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
            return get_store().count_elements(ANNOTATIONS$10) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$10);
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
            get_store().remove_element(ANNOTATIONS$10, 0);
        }
    }
    
    /**
     * Gets the "metadataStructureURI" attribute
     */
    public java.lang.String getMetadataStructureURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATASTRUCTUREURI$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "metadataStructureURI" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetMetadataStructureURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(METADATASTRUCTUREURI$12);
            return target;
        }
    }
    
    /**
     * True if has "metadataStructureURI" attribute
     */
    public boolean isSetMetadataStructureURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METADATASTRUCTUREURI$12) != null;
        }
    }
    
    /**
     * Sets the "metadataStructureURI" attribute
     */
    public void setMetadataStructureURI(java.lang.String metadataStructureURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATASTRUCTUREURI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METADATASTRUCTUREURI$12);
            }
            target.setStringValue(metadataStructureURI);
        }
    }
    
    /**
     * Sets (as xml) the "metadataStructureURI" attribute
     */
    public void xsetMetadataStructureURI(org.apache.xmlbeans.XmlAnyURI metadataStructureURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(METADATASTRUCTUREURI$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(METADATASTRUCTUREURI$12);
            }
            target.set(metadataStructureURI);
        }
    }
    
    /**
     * Unsets the "metadataStructureURI" attribute
     */
    public void unsetMetadataStructureURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METADATASTRUCTUREURI$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASETID$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATASETID$14);
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
            return get_store().find_attribute_user(DATASETID$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASETID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASETID$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATASETID$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATASETID$14);
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
            get_store().remove_attribute(DATASETID$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16);
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
            return get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAPROVIDERSCHEMEAGENCYID$16);
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
            get_store().remove_attribute(DATAPROVIDERSCHEMEAGENCYID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$18);
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
            return get_store().find_attribute_user(DATAPROVIDERSCHEMEID$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPROVIDERSCHEMEID$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERSCHEMEID$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAPROVIDERSCHEMEID$18);
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
            get_store().remove_attribute(DATAPROVIDERSCHEMEID$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERID$20);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERID$20);
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
            return get_store().find_attribute_user(DATAPROVIDERID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAPROVIDERID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAPROVIDERID$20);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAPROVIDERID$20);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAPROVIDERID$20);
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
            get_store().remove_attribute(DATAPROVIDERID$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWAGENCYID$22);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWAGENCYID$22);
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
            return get_store().find_attribute_user(DATAFLOWAGENCYID$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWAGENCYID$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAFLOWAGENCYID$22);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWAGENCYID$22);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAFLOWAGENCYID$22);
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
            get_store().remove_attribute(DATAFLOWAGENCYID$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWID$24);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWID$24);
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
            return get_store().find_attribute_user(DATAFLOWID$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAFLOWID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAFLOWID$24);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(DATAFLOWID$24);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(DATAFLOWID$24);
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
            get_store().remove_attribute(DATAFLOWID$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$26);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_attribute_user(ACTION$26);
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
            return get_store().find_attribute_user(ACTION$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$26);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_attribute_user(ACTION$26);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().add_attribute_user(ACTION$26);
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
            get_store().remove_attribute(ACTION$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$28);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$28);
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
            return get_store().find_attribute_user(REPORTINGBEGINDATE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGBEGINDATE$28);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$28);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(REPORTINGBEGINDATE$28);
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
            get_store().remove_attribute(REPORTINGBEGINDATE$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$30);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$30);
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
            return get_store().find_attribute_user(REPORTINGENDDATE$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGENDDATE$30);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$30);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(REPORTINGENDDATE$30);
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
            get_store().remove_attribute(REPORTINGENDDATE$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$32);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDFROMDATE$32);
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
            return get_store().find_attribute_user(VALIDFROMDATE$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROMDATE$32);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDFROMDATE$32);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(VALIDFROMDATE$32);
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
            get_store().remove_attribute(VALIDFROMDATE$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$34);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDTODATE$34);
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
            return get_store().find_attribute_user(VALIDTODATE$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTODATE$34);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDTODATE$34);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(VALIDTODATE$34);
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
            get_store().remove_attribute(VALIDTODATE$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$36);
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
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$36);
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
            return get_store().find_attribute_user(PUBLICATIONYEAR$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONYEAR$36);
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
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGYear)get_store().add_attribute_user(PUBLICATIONYEAR$36);
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
            get_store().remove_attribute(PUBLICATIONYEAR$36);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$38);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$38);
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
            return get_store().find_attribute_user(PUBLICATIONPERIOD$38) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONPERIOD$38);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$38);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(PUBLICATIONPERIOD$38);
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
            get_store().remove_attribute(PUBLICATIONPERIOD$38);
        }
    }
}
