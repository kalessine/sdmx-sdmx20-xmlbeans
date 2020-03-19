/*
 * XML Type:  MetadataAttributeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML MetadataAttributeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class MetadataAttributeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MetadataAttribute");
    private static final javax.xml.namespace.QName TEXTFORMAT$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TextFormat");
    private static final javax.xml.namespace.QName ANNOTATIONS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName CONCEPTREF$6 = 
        new javax.xml.namespace.QName("", "conceptRef");
    private static final javax.xml.namespace.QName CONCEPTVERSION$8 = 
        new javax.xml.namespace.QName("", "conceptVersion");
    private static final javax.xml.namespace.QName CONCEPTAGENCY$10 = 
        new javax.xml.namespace.QName("", "conceptAgency");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$12 = 
        new javax.xml.namespace.QName("", "conceptSchemeRef");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEAGENCY$14 = 
        new javax.xml.namespace.QName("", "conceptSchemeAgency");
    private static final javax.xml.namespace.QName REPRESENTATIONSCHEME$16 = 
        new javax.xml.namespace.QName("", "representationScheme");
    private static final javax.xml.namespace.QName REPRESENTATIONSCHEMEAGENCY$18 = 
        new javax.xml.namespace.QName("", "representationSchemeAgency");
    private static final javax.xml.namespace.QName USAGESTATUS$20 = 
        new javax.xml.namespace.QName("", "usageStatus");
    
    
    /**
     * Gets array of all "MetadataAttribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType[] getMetadataAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAATTRIBUTE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType getMetadataAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType)get_store().find_element_user(METADATAATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataAttribute" element
     */
    public int sizeOfMetadataAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "MetadataAttribute" element
     */
    public void setMetadataAttributeArray(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType[] metadataAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataAttributeArray, METADATAATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "MetadataAttribute" element
     */
    public void setMetadataAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType metadataAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType)get_store().find_element_user(METADATAATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType insertNewMetadataAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType)get_store().insert_element_user(METADATAATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType addNewMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataAttributeType)get_store().add_element_user(METADATAATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataAttribute" element
     */
    public void removeMetadataAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAATTRIBUTE$0, i);
        }
    }
    
    /**
     * Gets the "TextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(TEXTFORMAT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TextFormat" element
     */
    public boolean isSetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTFORMAT$2) != 0;
        }
    }
    
    /**
     * Sets the "TextFormat" element
     */
    public void setTextFormat(org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType textFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(TEXTFORMAT$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(TEXTFORMAT$2);
            }
            target.set(textFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "TextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType addNewTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(TEXTFORMAT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TextFormat" element
     */
    public void unsetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTFORMAT$2, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$4, 0);
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
            return get_store().count_elements(ANNOTATIONS$4) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$4);
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
            get_store().remove_element(ANNOTATIONS$4, 0);
        }
    }
    
    /**
     * Gets the "conceptRef" attribute
     */
    public java.lang.String getConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTREF$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptRef" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTREF$6);
            return target;
        }
    }
    
    /**
     * Sets the "conceptRef" attribute
     */
    public void setConceptRef(java.lang.String conceptRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTREF$6);
            }
            target.setStringValue(conceptRef);
        }
    }
    
    /**
     * Sets (as xml) the "conceptRef" attribute
     */
    public void xsetConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTREF$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTREF$6);
            }
            target.set(conceptRef);
        }
    }
    
    /**
     * Gets the "conceptVersion" attribute
     */
    public java.lang.String getConceptVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTVERSION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptVersion" attribute
     */
    public org.apache.xmlbeans.XmlString xgetConceptVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONCEPTVERSION$8);
            return target;
        }
    }
    
    /**
     * True if has "conceptVersion" attribute
     */
    public boolean isSetConceptVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCEPTVERSION$8) != null;
        }
    }
    
    /**
     * Sets the "conceptVersion" attribute
     */
    public void setConceptVersion(java.lang.String conceptVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTVERSION$8);
            }
            target.setStringValue(conceptVersion);
        }
    }
    
    /**
     * Sets (as xml) the "conceptVersion" attribute
     */
    public void xsetConceptVersion(org.apache.xmlbeans.XmlString conceptVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONCEPTVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONCEPTVERSION$8);
            }
            target.set(conceptVersion);
        }
    }
    
    /**
     * Unsets the "conceptVersion" attribute
     */
    public void unsetConceptVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCEPTVERSION$8);
        }
    }
    
    /**
     * Gets the "conceptAgency" attribute
     */
    public java.lang.String getConceptAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTAGENCY$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptAgency" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTAGENCY$10);
            return target;
        }
    }
    
    /**
     * True if has "conceptAgency" attribute
     */
    public boolean isSetConceptAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCEPTAGENCY$10) != null;
        }
    }
    
    /**
     * Sets the "conceptAgency" attribute
     */
    public void setConceptAgency(java.lang.String conceptAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTAGENCY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTAGENCY$10);
            }
            target.setStringValue(conceptAgency);
        }
    }
    
    /**
     * Sets (as xml) the "conceptAgency" attribute
     */
    public void xsetConceptAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTAGENCY$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTAGENCY$10);
            }
            target.set(conceptAgency);
        }
    }
    
    /**
     * Unsets the "conceptAgency" attribute
     */
    public void unsetConceptAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCEPTAGENCY$10);
        }
    }
    
    /**
     * Gets the "conceptSchemeRef" attribute
     */
    public java.lang.String getConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEREF$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptSchemeRef" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEREF$12);
            return target;
        }
    }
    
    /**
     * True if has "conceptSchemeRef" attribute
     */
    public boolean isSetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCEPTSCHEMEREF$12) != null;
        }
    }
    
    /**
     * Sets the "conceptSchemeRef" attribute
     */
    public void setConceptSchemeRef(java.lang.String conceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEREF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTSCHEMEREF$12);
            }
            target.setStringValue(conceptSchemeRef);
        }
    }
    
    /**
     * Sets (as xml) the "conceptSchemeRef" attribute
     */
    public void xsetConceptSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEREF$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTSCHEMEREF$12);
            }
            target.set(conceptSchemeRef);
        }
    }
    
    /**
     * Unsets the "conceptSchemeRef" attribute
     */
    public void unsetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCEPTSCHEMEREF$12);
        }
    }
    
    /**
     * Gets the "conceptSchemeAgency" attribute
     */
    public java.lang.String getConceptSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptSchemeAgency" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$14);
            return target;
        }
    }
    
    /**
     * True if has "conceptSchemeAgency" attribute
     */
    public boolean isSetConceptSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$14) != null;
        }
    }
    
    /**
     * Sets the "conceptSchemeAgency" attribute
     */
    public void setConceptSchemeAgency(java.lang.String conceptSchemeAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTSCHEMEAGENCY$14);
            }
            target.setStringValue(conceptSchemeAgency);
        }
    }
    
    /**
     * Sets (as xml) the "conceptSchemeAgency" attribute
     */
    public void xsetConceptSchemeAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptSchemeAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTSCHEMEAGENCY$14);
            }
            target.set(conceptSchemeAgency);
        }
    }
    
    /**
     * Unsets the "conceptSchemeAgency" attribute
     */
    public void unsetConceptSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCEPTSCHEMEAGENCY$14);
        }
    }
    
    /**
     * Gets the "representationScheme" attribute
     */
    public java.lang.String getRepresentationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "representationScheme" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetRepresentationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEME$16);
            return target;
        }
    }
    
    /**
     * True if has "representationScheme" attribute
     */
    public boolean isSetRepresentationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPRESENTATIONSCHEME$16) != null;
        }
    }
    
    /**
     * Sets the "representationScheme" attribute
     */
    public void setRepresentationScheme(java.lang.String representationScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATIONSCHEME$16);
            }
            target.setStringValue(representationScheme);
        }
    }
    
    /**
     * Sets (as xml) the "representationScheme" attribute
     */
    public void xsetRepresentationScheme(org.sdmx.resources.sdmxml.schemas.v20.common.IDType representationScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEME$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(REPRESENTATIONSCHEME$16);
            }
            target.set(representationScheme);
        }
    }
    
    /**
     * Unsets the "representationScheme" attribute
     */
    public void unsetRepresentationScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPRESENTATIONSCHEME$16);
        }
    }
    
    /**
     * Gets the "representationSchemeAgency" attribute
     */
    public java.lang.String getRepresentationSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "representationSchemeAgency" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetRepresentationSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$18);
            return target;
        }
    }
    
    /**
     * True if has "representationSchemeAgency" attribute
     */
    public boolean isSetRepresentationSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$18) != null;
        }
    }
    
    /**
     * Sets the "representationSchemeAgency" attribute
     */
    public void setRepresentationSchemeAgency(java.lang.String representationSchemeAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATIONSCHEMEAGENCY$18);
            }
            target.setStringValue(representationSchemeAgency);
        }
    }
    
    /**
     * Sets (as xml) the "representationSchemeAgency" attribute
     */
    public void xsetRepresentationSchemeAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType representationSchemeAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(REPRESENTATIONSCHEMEAGENCY$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(REPRESENTATIONSCHEMEAGENCY$18);
            }
            target.set(representationSchemeAgency);
        }
    }
    
    /**
     * Unsets the "representationSchemeAgency" attribute
     */
    public void unsetRepresentationSchemeAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPRESENTATIONSCHEMEAGENCY$18);
        }
    }
    
    /**
     * Gets the "usageStatus" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType.Enum getUsageStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGESTATUS$20);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "usageStatus" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType xgetUsageStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType)get_store().find_attribute_user(USAGESTATUS$20);
            return target;
        }
    }
    
    /**
     * Sets the "usageStatus" attribute
     */
    public void setUsageStatus(org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType.Enum usageStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGESTATUS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGESTATUS$20);
            }
            target.setEnumValue(usageStatus);
        }
    }
    
    /**
     * Sets (as xml) the "usageStatus" attribute
     */
    public void xsetUsageStatus(org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType usageStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType)get_store().find_attribute_user(USAGESTATUS$20);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.UsageStatusType)get_store().add_attribute_user(USAGESTATUS$20);
            }
            target.set(usageStatus);
        }
    }
}
