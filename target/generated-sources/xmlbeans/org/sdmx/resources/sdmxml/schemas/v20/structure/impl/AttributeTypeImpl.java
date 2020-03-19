/*
 * XML Type:  AttributeType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML AttributeType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class AttributeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TextFormat");
    private static final javax.xml.namespace.QName ATTACHMENTGROUP$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "AttachmentGroup");
    private static final javax.xml.namespace.QName ATTACHMENTMEASURE$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "AttachmentMeasure");
    private static final javax.xml.namespace.QName ANNOTATIONS$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName CONCEPTREF$8 = 
        new javax.xml.namespace.QName("", "conceptRef");
    private static final javax.xml.namespace.QName CONCEPTVERSION$10 = 
        new javax.xml.namespace.QName("", "conceptVersion");
    private static final javax.xml.namespace.QName CONCEPTAGENCY$12 = 
        new javax.xml.namespace.QName("", "conceptAgency");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$14 = 
        new javax.xml.namespace.QName("", "conceptSchemeRef");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEAGENCY$16 = 
        new javax.xml.namespace.QName("", "conceptSchemeAgency");
    private static final javax.xml.namespace.QName CODELIST$18 = 
        new javax.xml.namespace.QName("", "codelist");
    private static final javax.xml.namespace.QName CODELISTVERSION$20 = 
        new javax.xml.namespace.QName("", "codelistVersion");
    private static final javax.xml.namespace.QName CODELISTAGENCY$22 = 
        new javax.xml.namespace.QName("", "codelistAgency");
    private static final javax.xml.namespace.QName ATTACHMENTLEVEL$24 = 
        new javax.xml.namespace.QName("", "attachmentLevel");
    private static final javax.xml.namespace.QName ASSIGNMENTSTATUS$26 = 
        new javax.xml.namespace.QName("", "assignmentStatus");
    private static final javax.xml.namespace.QName ISTIMEFORMAT$28 = 
        new javax.xml.namespace.QName("", "isTimeFormat");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHDATASET$30 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachDataSet");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHGROUP$32 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachGroup");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHSECTION$34 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachSection");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHOBSERVATION$36 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachObservation");
    private static final javax.xml.namespace.QName ISENTITYATTRIBUTE$38 = 
        new javax.xml.namespace.QName("", "isEntityAttribute");
    private static final javax.xml.namespace.QName ISNONOBSERVATIONALTIMEATTRIBUTE$40 = 
        new javax.xml.namespace.QName("", "isNonObservationalTimeAttribute");
    private static final javax.xml.namespace.QName ISCOUNTATTRIBUTE$42 = 
        new javax.xml.namespace.QName("", "isCountAttribute");
    private static final javax.xml.namespace.QName ISFREQUENCYATTRIBUTE$44 = 
        new javax.xml.namespace.QName("", "isFrequencyAttribute");
    private static final javax.xml.namespace.QName ISIDENTITYATTRIBUTE$46 = 
        new javax.xml.namespace.QName("", "isIdentityAttribute");
    
    
    /**
     * Gets the "TextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(TEXTFORMAT$0, 0);
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
            return get_store().count_elements(TEXTFORMAT$0) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(TEXTFORMAT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(TEXTFORMAT$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(TEXTFORMAT$0);
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
            get_store().remove_element(TEXTFORMAT$0, 0);
        }
    }
    
    /**
     * Gets array of all "AttachmentGroup" elements
     */
    public java.lang.String[] getAttachmentGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTGROUP$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentGroup" element
     */
    public java.lang.String getAttachmentGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AttachmentGroup" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetAttachmentGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTGROUP$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.IDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AttachmentGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAttachmentGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ATTACHMENTGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)target;
        }
    }
    
    /**
     * Returns number of "AttachmentGroup" element
     */
    public int sizeOfAttachmentGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTGROUP$2);
        }
    }
    
    /**
     * Sets array of all "AttachmentGroup" element
     */
    public void setAttachmentGroupArray(java.lang.String[] attachmentGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentGroupArray, ATTACHMENTGROUP$2);
        }
    }
    
    /**
     * Sets ith "AttachmentGroup" element
     */
    public void setAttachmentGroupArray(int i, java.lang.String attachmentGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(attachmentGroup);
        }
    }
    
    /**
     * Sets (as xml) array of all "AttachmentGroup" element
     */
    public void xsetAttachmentGroupArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[]attachmentGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentGroupArray, ATTACHMENTGROUP$2);
        }
    }
    
    /**
     * Sets (as xml) ith "AttachmentGroup" element
     */
    public void xsetAttachmentGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType attachmentGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ATTACHMENTGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentGroup);
        }
    }
    
    /**
     * Inserts the value as the ith "AttachmentGroup" element
     */
    public void insertAttachmentGroup(int i, java.lang.String attachmentGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTACHMENTGROUP$2, i);
            target.setStringValue(attachmentGroup);
        }
    }
    
    /**
     * Appends the value as the last "AttachmentGroup" element
     */
    public void addAttachmentGroup(java.lang.String attachmentGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTGROUP$2);
            target.setStringValue(attachmentGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewAttachmentGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().insert_element_user(ATTACHMENTGROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewAttachmentGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(ATTACHMENTGROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentGroup" element
     */
    public void removeAttachmentGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTGROUP$2, i);
        }
    }
    
    /**
     * Gets array of all "AttachmentMeasure" elements
     */
    public java.lang.String[] getAttachmentMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTMEASURE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentMeasure" element
     */
    public java.lang.String getAttachmentMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTMEASURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AttachmentMeasure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetAttachmentMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTMEASURE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.IDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AttachmentMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAttachmentMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ATTACHMENTMEASURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)target;
        }
    }
    
    /**
     * Returns number of "AttachmentMeasure" element
     */
    public int sizeOfAttachmentMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTMEASURE$4);
        }
    }
    
    /**
     * Sets array of all "AttachmentMeasure" element
     */
    public void setAttachmentMeasureArray(java.lang.String[] attachmentMeasureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentMeasureArray, ATTACHMENTMEASURE$4);
        }
    }
    
    /**
     * Sets ith "AttachmentMeasure" element
     */
    public void setAttachmentMeasureArray(int i, java.lang.String attachmentMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTMEASURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(attachmentMeasure);
        }
    }
    
    /**
     * Sets (as xml) array of all "AttachmentMeasure" element
     */
    public void xsetAttachmentMeasureArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[]attachmentMeasureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentMeasureArray, ATTACHMENTMEASURE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "AttachmentMeasure" element
     */
    public void xsetAttachmentMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType attachmentMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ATTACHMENTMEASURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentMeasure);
        }
    }
    
    /**
     * Inserts the value as the ith "AttachmentMeasure" element
     */
    public void insertAttachmentMeasure(int i, java.lang.String attachmentMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTACHMENTMEASURE$4, i);
            target.setStringValue(attachmentMeasure);
        }
    }
    
    /**
     * Appends the value as the last "AttachmentMeasure" element
     */
    public void addAttachmentMeasure(java.lang.String attachmentMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTMEASURE$4);
            target.setStringValue(attachmentMeasure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewAttachmentMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().insert_element_user(ATTACHMENTMEASURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewAttachmentMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(ATTACHMENTMEASURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentMeasure" element
     */
    public void removeAttachmentMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTMEASURE$4, i);
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
     * Gets the "conceptRef" attribute
     */
    public java.lang.String getConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTREF$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTREF$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTREF$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTREF$8);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTREF$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTVERSION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONCEPTVERSION$10);
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
            return get_store().find_attribute_user(CONCEPTVERSION$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTVERSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTVERSION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONCEPTVERSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONCEPTVERSION$10);
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
            get_store().remove_attribute(CONCEPTVERSION$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTAGENCY$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTAGENCY$12);
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
            return get_store().find_attribute_user(CONCEPTAGENCY$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTAGENCY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTAGENCY$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTAGENCY$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTAGENCY$12);
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
            get_store().remove_attribute(CONCEPTAGENCY$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEREF$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEREF$14);
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
            return get_store().find_attribute_user(CONCEPTSCHEMEREF$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTSCHEMEREF$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEREF$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTSCHEMEREF$14);
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
            get_store().remove_attribute(CONCEPTSCHEMEREF$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$16);
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
            return get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTSCHEMEAGENCY$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTSCHEMEAGENCY$16);
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
            get_store().remove_attribute(CONCEPTSCHEMEAGENCY$16);
        }
    }
    
    /**
     * Gets the "codelist" attribute
     */
    public java.lang.String getCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELIST$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codelist" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELIST$18);
            return target;
        }
    }
    
    /**
     * True if has "codelist" attribute
     */
    public boolean isSetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODELIST$18) != null;
        }
    }
    
    /**
     * Sets the "codelist" attribute
     */
    public void setCodelist(java.lang.String codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELIST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELIST$18);
            }
            target.setStringValue(codelist);
        }
    }
    
    /**
     * Sets (as xml) the "codelist" attribute
     */
    public void xsetCodelist(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELIST$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CODELIST$18);
            }
            target.set(codelist);
        }
    }
    
    /**
     * Unsets the "codelist" attribute
     */
    public void unsetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODELIST$18);
        }
    }
    
    /**
     * Gets the "codelistVersion" attribute
     */
    public java.lang.String getCodelistVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTVERSION$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codelistVersion" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCodelistVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODELISTVERSION$20);
            return target;
        }
    }
    
    /**
     * True if has "codelistVersion" attribute
     */
    public boolean isSetCodelistVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODELISTVERSION$20) != null;
        }
    }
    
    /**
     * Sets the "codelistVersion" attribute
     */
    public void setCodelistVersion(java.lang.String codelistVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTVERSION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELISTVERSION$20);
            }
            target.setStringValue(codelistVersion);
        }
    }
    
    /**
     * Sets (as xml) the "codelistVersion" attribute
     */
    public void xsetCodelistVersion(org.apache.xmlbeans.XmlString codelistVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODELISTVERSION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODELISTVERSION$20);
            }
            target.set(codelistVersion);
        }
    }
    
    /**
     * Unsets the "codelistVersion" attribute
     */
    public void unsetCodelistVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODELISTVERSION$20);
        }
    }
    
    /**
     * Gets the "codelistAgency" attribute
     */
    public java.lang.String getCodelistAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTAGENCY$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codelistAgency" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelistAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELISTAGENCY$22);
            return target;
        }
    }
    
    /**
     * True if has "codelistAgency" attribute
     */
    public boolean isSetCodelistAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODELISTAGENCY$22) != null;
        }
    }
    
    /**
     * Sets the "codelistAgency" attribute
     */
    public void setCodelistAgency(java.lang.String codelistAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTAGENCY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELISTAGENCY$22);
            }
            target.setStringValue(codelistAgency);
        }
    }
    
    /**
     * Sets (as xml) the "codelistAgency" attribute
     */
    public void xsetCodelistAgency(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelistAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELISTAGENCY$22);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CODELISTAGENCY$22);
            }
            target.set(codelistAgency);
        }
    }
    
    /**
     * Unsets the "codelistAgency" attribute
     */
    public void unsetCodelistAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODELISTAGENCY$22);
        }
    }
    
    /**
     * Gets the "attachmentLevel" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType.Enum getAttachmentLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTLEVEL$24);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "attachmentLevel" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType xgetAttachmentLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType)get_store().find_attribute_user(ATTACHMENTLEVEL$24);
            return target;
        }
    }
    
    /**
     * Sets the "attachmentLevel" attribute
     */
    public void setAttachmentLevel(org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType.Enum attachmentLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTLEVEL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTACHMENTLEVEL$24);
            }
            target.setEnumValue(attachmentLevel);
        }
    }
    
    /**
     * Sets (as xml) the "attachmentLevel" attribute
     */
    public void xsetAttachmentLevel(org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType attachmentLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType)get_store().find_attribute_user(ATTACHMENTLEVEL$24);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttachmentLevelType)get_store().add_attribute_user(ATTACHMENTLEVEL$24);
            }
            target.set(attachmentLevel);
        }
    }
    
    /**
     * Gets the "assignmentStatus" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType.Enum getAssignmentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNMENTSTATUS$26);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "assignmentStatus" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType xgetAssignmentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType)get_store().find_attribute_user(ASSIGNMENTSTATUS$26);
            return target;
        }
    }
    
    /**
     * Sets the "assignmentStatus" attribute
     */
    public void setAssignmentStatus(org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType.Enum assignmentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNMENTSTATUS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNMENTSTATUS$26);
            }
            target.setEnumValue(assignmentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "assignmentStatus" attribute
     */
    public void xsetAssignmentStatus(org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType assignmentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType)get_store().find_attribute_user(ASSIGNMENTSTATUS$26);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AssignmentStatusType)get_store().add_attribute_user(ASSIGNMENTSTATUS$26);
            }
            target.set(assignmentStatus);
        }
    }
    
    /**
     * Gets the "isTimeFormat" attribute
     */
    public boolean getIsTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISTIMEFORMAT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISTIMEFORMAT$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isTimeFormat" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISTIMEFORMAT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISTIMEFORMAT$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "isTimeFormat" attribute
     */
    public boolean isSetIsTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISTIMEFORMAT$28) != null;
        }
    }
    
    /**
     * Sets the "isTimeFormat" attribute
     */
    public void setIsTimeFormat(boolean isTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISTIMEFORMAT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISTIMEFORMAT$28);
            }
            target.setBooleanValue(isTimeFormat);
        }
    }
    
    /**
     * Sets (as xml) the "isTimeFormat" attribute
     */
    public void xsetIsTimeFormat(org.apache.xmlbeans.XmlBoolean isTimeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISTIMEFORMAT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISTIMEFORMAT$28);
            }
            target.set(isTimeFormat);
        }
    }
    
    /**
     * Unsets the "isTimeFormat" attribute
     */
    public void unsetIsTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISTIMEFORMAT$28);
        }
    }
    
    /**
     * Gets the "crossSectionalAttachDataSet" attribute
     */
    public boolean getCrossSectionalAttachDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$30);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "crossSectionalAttachDataSet" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$30);
            return target;
        }
    }
    
    /**
     * True if has "crossSectionalAttachDataSet" attribute
     */
    public boolean isSetCrossSectionalAttachDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$30) != null;
        }
    }
    
    /**
     * Sets the "crossSectionalAttachDataSet" attribute
     */
    public void setCrossSectionalAttachDataSet(boolean crossSectionalAttachDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHDATASET$30);
            }
            target.setBooleanValue(crossSectionalAttachDataSet);
        }
    }
    
    /**
     * Sets (as xml) the "crossSectionalAttachDataSet" attribute
     */
    public void xsetCrossSectionalAttachDataSet(org.apache.xmlbeans.XmlBoolean crossSectionalAttachDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHDATASET$30);
            }
            target.set(crossSectionalAttachDataSet);
        }
    }
    
    /**
     * Unsets the "crossSectionalAttachDataSet" attribute
     */
    public void unsetCrossSectionalAttachDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CROSSSECTIONALATTACHDATASET$30);
        }
    }
    
    /**
     * Gets the "crossSectionalAttachGroup" attribute
     */
    public boolean getCrossSectionalAttachGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$32);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "crossSectionalAttachGroup" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$32);
            return target;
        }
    }
    
    /**
     * True if has "crossSectionalAttachGroup" attribute
     */
    public boolean isSetCrossSectionalAttachGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$32) != null;
        }
    }
    
    /**
     * Sets the "crossSectionalAttachGroup" attribute
     */
    public void setCrossSectionalAttachGroup(boolean crossSectionalAttachGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHGROUP$32);
            }
            target.setBooleanValue(crossSectionalAttachGroup);
        }
    }
    
    /**
     * Sets (as xml) the "crossSectionalAttachGroup" attribute
     */
    public void xsetCrossSectionalAttachGroup(org.apache.xmlbeans.XmlBoolean crossSectionalAttachGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHGROUP$32);
            }
            target.set(crossSectionalAttachGroup);
        }
    }
    
    /**
     * Unsets the "crossSectionalAttachGroup" attribute
     */
    public void unsetCrossSectionalAttachGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CROSSSECTIONALATTACHGROUP$32);
        }
    }
    
    /**
     * Gets the "crossSectionalAttachSection" attribute
     */
    public boolean getCrossSectionalAttachSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$34);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "crossSectionalAttachSection" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$34);
            return target;
        }
    }
    
    /**
     * True if has "crossSectionalAttachSection" attribute
     */
    public boolean isSetCrossSectionalAttachSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$34) != null;
        }
    }
    
    /**
     * Sets the "crossSectionalAttachSection" attribute
     */
    public void setCrossSectionalAttachSection(boolean crossSectionalAttachSection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHSECTION$34);
            }
            target.setBooleanValue(crossSectionalAttachSection);
        }
    }
    
    /**
     * Sets (as xml) the "crossSectionalAttachSection" attribute
     */
    public void xsetCrossSectionalAttachSection(org.apache.xmlbeans.XmlBoolean crossSectionalAttachSection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHSECTION$34);
            }
            target.set(crossSectionalAttachSection);
        }
    }
    
    /**
     * Unsets the "crossSectionalAttachSection" attribute
     */
    public void unsetCrossSectionalAttachSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CROSSSECTIONALATTACHSECTION$34);
        }
    }
    
    /**
     * Gets the "crossSectionalAttachObservation" attribute
     */
    public boolean getCrossSectionalAttachObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "crossSectionalAttachObservation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCrossSectionalAttachObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36);
            return target;
        }
    }
    
    /**
     * True if has "crossSectionalAttachObservation" attribute
     */
    public boolean isSetCrossSectionalAttachObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36) != null;
        }
    }
    
    /**
     * Sets the "crossSectionalAttachObservation" attribute
     */
    public void setCrossSectionalAttachObservation(boolean crossSectionalAttachObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36);
            }
            target.setBooleanValue(crossSectionalAttachObservation);
        }
    }
    
    /**
     * Sets (as xml) the "crossSectionalAttachObservation" attribute
     */
    public void xsetCrossSectionalAttachObservation(org.apache.xmlbeans.XmlBoolean crossSectionalAttachObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHOBSERVATION$36);
            }
            target.set(crossSectionalAttachObservation);
        }
    }
    
    /**
     * Unsets the "crossSectionalAttachObservation" attribute
     */
    public void unsetCrossSectionalAttachObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CROSSSECTIONALATTACHOBSERVATION$36);
        }
    }
    
    /**
     * Gets the "isEntityAttribute" attribute
     */
    public boolean getIsEntityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISENTITYATTRIBUTE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISENTITYATTRIBUTE$38);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isEntityAttribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsEntityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISENTITYATTRIBUTE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISENTITYATTRIBUTE$38);
            }
            return target;
        }
    }
    
    /**
     * True if has "isEntityAttribute" attribute
     */
    public boolean isSetIsEntityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISENTITYATTRIBUTE$38) != null;
        }
    }
    
    /**
     * Sets the "isEntityAttribute" attribute
     */
    public void setIsEntityAttribute(boolean isEntityAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISENTITYATTRIBUTE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISENTITYATTRIBUTE$38);
            }
            target.setBooleanValue(isEntityAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "isEntityAttribute" attribute
     */
    public void xsetIsEntityAttribute(org.apache.xmlbeans.XmlBoolean isEntityAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISENTITYATTRIBUTE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISENTITYATTRIBUTE$38);
            }
            target.set(isEntityAttribute);
        }
    }
    
    /**
     * Unsets the "isEntityAttribute" attribute
     */
    public void unsetIsEntityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISENTITYATTRIBUTE$38);
        }
    }
    
    /**
     * Gets the "isNonObservationalTimeAttribute" attribute
     */
    public boolean getIsNonObservationalTimeAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNonObservationalTimeAttribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNonObservationalTimeAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            }
            return target;
        }
    }
    
    /**
     * True if has "isNonObservationalTimeAttribute" attribute
     */
    public boolean isSetIsNonObservationalTimeAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40) != null;
        }
    }
    
    /**
     * Sets the "isNonObservationalTimeAttribute" attribute
     */
    public void setIsNonObservationalTimeAttribute(boolean isNonObservationalTimeAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            }
            target.setBooleanValue(isNonObservationalTimeAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "isNonObservationalTimeAttribute" attribute
     */
    public void xsetIsNonObservationalTimeAttribute(org.apache.xmlbeans.XmlBoolean isNonObservationalTimeAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
            }
            target.set(isNonObservationalTimeAttribute);
        }
    }
    
    /**
     * Unsets the "isNonObservationalTimeAttribute" attribute
     */
    public void unsetIsNonObservationalTimeAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISNONOBSERVATIONALTIMEATTRIBUTE$40);
        }
    }
    
    /**
     * Gets the "isCountAttribute" attribute
     */
    public boolean getIsCountAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOUNTATTRIBUTE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCOUNTATTRIBUTE$42);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCountAttribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCountAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOUNTATTRIBUTE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCOUNTATTRIBUTE$42);
            }
            return target;
        }
    }
    
    /**
     * True if has "isCountAttribute" attribute
     */
    public boolean isSetIsCountAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCOUNTATTRIBUTE$42) != null;
        }
    }
    
    /**
     * Sets the "isCountAttribute" attribute
     */
    public void setIsCountAttribute(boolean isCountAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOUNTATTRIBUTE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCOUNTATTRIBUTE$42);
            }
            target.setBooleanValue(isCountAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "isCountAttribute" attribute
     */
    public void xsetIsCountAttribute(org.apache.xmlbeans.XmlBoolean isCountAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOUNTATTRIBUTE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCOUNTATTRIBUTE$42);
            }
            target.set(isCountAttribute);
        }
    }
    
    /**
     * Unsets the "isCountAttribute" attribute
     */
    public void unsetIsCountAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCOUNTATTRIBUTE$42);
        }
    }
    
    /**
     * Gets the "isFrequencyAttribute" attribute
     */
    public boolean getIsFrequencyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFREQUENCYATTRIBUTE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISFREQUENCYATTRIBUTE$44);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isFrequencyAttribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsFrequencyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFREQUENCYATTRIBUTE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISFREQUENCYATTRIBUTE$44);
            }
            return target;
        }
    }
    
    /**
     * True if has "isFrequencyAttribute" attribute
     */
    public boolean isSetIsFrequencyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISFREQUENCYATTRIBUTE$44) != null;
        }
    }
    
    /**
     * Sets the "isFrequencyAttribute" attribute
     */
    public void setIsFrequencyAttribute(boolean isFrequencyAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFREQUENCYATTRIBUTE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFREQUENCYATTRIBUTE$44);
            }
            target.setBooleanValue(isFrequencyAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "isFrequencyAttribute" attribute
     */
    public void xsetIsFrequencyAttribute(org.apache.xmlbeans.XmlBoolean isFrequencyAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFREQUENCYATTRIBUTE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFREQUENCYATTRIBUTE$44);
            }
            target.set(isFrequencyAttribute);
        }
    }
    
    /**
     * Unsets the "isFrequencyAttribute" attribute
     */
    public void unsetIsFrequencyAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISFREQUENCYATTRIBUTE$44);
        }
    }
    
    /**
     * Gets the "isIdentityAttribute" attribute
     */
    public boolean getIsIdentityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISIDENTITYATTRIBUTE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISIDENTITYATTRIBUTE$46);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isIdentityAttribute" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsIdentityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISIDENTITYATTRIBUTE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISIDENTITYATTRIBUTE$46);
            }
            return target;
        }
    }
    
    /**
     * True if has "isIdentityAttribute" attribute
     */
    public boolean isSetIsIdentityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISIDENTITYATTRIBUTE$46) != null;
        }
    }
    
    /**
     * Sets the "isIdentityAttribute" attribute
     */
    public void setIsIdentityAttribute(boolean isIdentityAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISIDENTITYATTRIBUTE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISIDENTITYATTRIBUTE$46);
            }
            target.setBooleanValue(isIdentityAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "isIdentityAttribute" attribute
     */
    public void xsetIsIdentityAttribute(org.apache.xmlbeans.XmlBoolean isIdentityAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISIDENTITYATTRIBUTE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISIDENTITYATTRIBUTE$46);
            }
            target.set(isIdentityAttribute);
        }
    }
    
    /**
     * Unsets the "isIdentityAttribute" attribute
     */
    public void unsetIsIdentityAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISIDENTITYATTRIBUTE$46);
        }
    }
}
