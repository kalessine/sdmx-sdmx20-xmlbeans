/*
 * XML Type:  DimensionType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML DimensionType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class DimensionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType
{
    private static final long serialVersionUID = 1L;
    
    public DimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TextFormat");
    private static final javax.xml.namespace.QName ANNOTATIONS$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName CONCEPTREF$4 = 
        new javax.xml.namespace.QName("", "conceptRef");
    private static final javax.xml.namespace.QName CONCEPTVERSION$6 = 
        new javax.xml.namespace.QName("", "conceptVersion");
    private static final javax.xml.namespace.QName CONCEPTAGENCY$8 = 
        new javax.xml.namespace.QName("", "conceptAgency");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$10 = 
        new javax.xml.namespace.QName("", "conceptSchemeRef");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEAGENCY$12 = 
        new javax.xml.namespace.QName("", "conceptSchemeAgency");
    private static final javax.xml.namespace.QName CODELIST$14 = 
        new javax.xml.namespace.QName("", "codelist");
    private static final javax.xml.namespace.QName CODELISTVERSION$16 = 
        new javax.xml.namespace.QName("", "codelistVersion");
    private static final javax.xml.namespace.QName CODELISTAGENCY$18 = 
        new javax.xml.namespace.QName("", "codelistAgency");
    private static final javax.xml.namespace.QName ISMEASUREDIMENSION$20 = 
        new javax.xml.namespace.QName("", "isMeasureDimension");
    private static final javax.xml.namespace.QName ISFREQUENCYDIMENSION$22 = 
        new javax.xml.namespace.QName("", "isFrequencyDimension");
    private static final javax.xml.namespace.QName ISENTITYDIMENSION$24 = 
        new javax.xml.namespace.QName("", "isEntityDimension");
    private static final javax.xml.namespace.QName ISCOUNTDIMENSION$26 = 
        new javax.xml.namespace.QName("", "isCountDimension");
    private static final javax.xml.namespace.QName ISNONOBSERVATIONTIMEDIMENSION$28 = 
        new javax.xml.namespace.QName("", "isNonObservationTimeDimension");
    private static final javax.xml.namespace.QName ISIDENTITYDIMENSION$30 = 
        new javax.xml.namespace.QName("", "isIdentityDimension");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHDATASET$32 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachDataSet");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHGROUP$34 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachGroup");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHSECTION$36 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachSection");
    private static final javax.xml.namespace.QName CROSSSECTIONALATTACHOBSERVATION$38 = 
        new javax.xml.namespace.QName("", "crossSectionalAttachObservation");
    
    
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
     * Gets the "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$2, 0);
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
            return get_store().count_elements(ANNOTATIONS$2) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$2);
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
            get_store().remove_element(ANNOTATIONS$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTREF$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTREF$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTREF$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTREF$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTREF$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTVERSION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONCEPTVERSION$6);
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
            return get_store().find_attribute_user(CONCEPTVERSION$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTVERSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTVERSION$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONCEPTVERSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONCEPTVERSION$6);
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
            get_store().remove_attribute(CONCEPTVERSION$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTAGENCY$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTAGENCY$8);
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
            return get_store().find_attribute_user(CONCEPTAGENCY$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTAGENCY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTAGENCY$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTAGENCY$8);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTAGENCY$8);
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
            get_store().remove_attribute(CONCEPTAGENCY$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEREF$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEREF$10);
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
            return get_store().find_attribute_user(CONCEPTSCHEMEREF$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTSCHEMEREF$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEREF$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTSCHEMEREF$10);
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
            get_store().remove_attribute(CONCEPTSCHEMEREF$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$12);
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
            return get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTSCHEMEAGENCY$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTSCHEMEAGENCY$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTSCHEMEAGENCY$12);
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
            get_store().remove_attribute(CONCEPTSCHEMEAGENCY$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELIST$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELIST$14);
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
            return get_store().find_attribute_user(CODELIST$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELIST$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELIST$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELIST$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CODELIST$14);
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
            get_store().remove_attribute(CODELIST$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTVERSION$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODELISTVERSION$16);
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
            return get_store().find_attribute_user(CODELISTVERSION$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTVERSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELISTVERSION$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODELISTVERSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODELISTVERSION$16);
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
            get_store().remove_attribute(CODELISTVERSION$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTAGENCY$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELISTAGENCY$18);
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
            return get_store().find_attribute_user(CODELISTAGENCY$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTAGENCY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELISTAGENCY$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODELISTAGENCY$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CODELISTAGENCY$18);
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
            get_store().remove_attribute(CODELISTAGENCY$18);
        }
    }
    
    /**
     * Gets the "isMeasureDimension" attribute
     */
    public boolean getIsMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMEASUREDIMENSION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISMEASUREDIMENSION$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMeasureDimension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMEASUREDIMENSION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISMEASUREDIMENSION$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "isMeasureDimension" attribute
     */
    public boolean isSetIsMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISMEASUREDIMENSION$20) != null;
        }
    }
    
    /**
     * Sets the "isMeasureDimension" attribute
     */
    public void setIsMeasureDimension(boolean isMeasureDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMEASUREDIMENSION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISMEASUREDIMENSION$20);
            }
            target.setBooleanValue(isMeasureDimension);
        }
    }
    
    /**
     * Sets (as xml) the "isMeasureDimension" attribute
     */
    public void xsetIsMeasureDimension(org.apache.xmlbeans.XmlBoolean isMeasureDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMEASUREDIMENSION$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISMEASUREDIMENSION$20);
            }
            target.set(isMeasureDimension);
        }
    }
    
    /**
     * Unsets the "isMeasureDimension" attribute
     */
    public void unsetIsMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISMEASUREDIMENSION$20);
        }
    }
    
    /**
     * Gets the "isFrequencyDimension" attribute
     */
    public boolean getIsFrequencyDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFREQUENCYDIMENSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISFREQUENCYDIMENSION$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isFrequencyDimension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsFrequencyDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFREQUENCYDIMENSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISFREQUENCYDIMENSION$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "isFrequencyDimension" attribute
     */
    public boolean isSetIsFrequencyDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISFREQUENCYDIMENSION$22) != null;
        }
    }
    
    /**
     * Sets the "isFrequencyDimension" attribute
     */
    public void setIsFrequencyDimension(boolean isFrequencyDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFREQUENCYDIMENSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFREQUENCYDIMENSION$22);
            }
            target.setBooleanValue(isFrequencyDimension);
        }
    }
    
    /**
     * Sets (as xml) the "isFrequencyDimension" attribute
     */
    public void xsetIsFrequencyDimension(org.apache.xmlbeans.XmlBoolean isFrequencyDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFREQUENCYDIMENSION$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFREQUENCYDIMENSION$22);
            }
            target.set(isFrequencyDimension);
        }
    }
    
    /**
     * Unsets the "isFrequencyDimension" attribute
     */
    public void unsetIsFrequencyDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISFREQUENCYDIMENSION$22);
        }
    }
    
    /**
     * Gets the "isEntityDimension" attribute
     */
    public boolean getIsEntityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISENTITYDIMENSION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISENTITYDIMENSION$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isEntityDimension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsEntityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISENTITYDIMENSION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISENTITYDIMENSION$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "isEntityDimension" attribute
     */
    public boolean isSetIsEntityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISENTITYDIMENSION$24) != null;
        }
    }
    
    /**
     * Sets the "isEntityDimension" attribute
     */
    public void setIsEntityDimension(boolean isEntityDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISENTITYDIMENSION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISENTITYDIMENSION$24);
            }
            target.setBooleanValue(isEntityDimension);
        }
    }
    
    /**
     * Sets (as xml) the "isEntityDimension" attribute
     */
    public void xsetIsEntityDimension(org.apache.xmlbeans.XmlBoolean isEntityDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISENTITYDIMENSION$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISENTITYDIMENSION$24);
            }
            target.set(isEntityDimension);
        }
    }
    
    /**
     * Unsets the "isEntityDimension" attribute
     */
    public void unsetIsEntityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISENTITYDIMENSION$24);
        }
    }
    
    /**
     * Gets the "isCountDimension" attribute
     */
    public boolean getIsCountDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOUNTDIMENSION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCOUNTDIMENSION$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCountDimension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCountDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOUNTDIMENSION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCOUNTDIMENSION$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "isCountDimension" attribute
     */
    public boolean isSetIsCountDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCOUNTDIMENSION$26) != null;
        }
    }
    
    /**
     * Sets the "isCountDimension" attribute
     */
    public void setIsCountDimension(boolean isCountDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCOUNTDIMENSION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCOUNTDIMENSION$26);
            }
            target.setBooleanValue(isCountDimension);
        }
    }
    
    /**
     * Sets (as xml) the "isCountDimension" attribute
     */
    public void xsetIsCountDimension(org.apache.xmlbeans.XmlBoolean isCountDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCOUNTDIMENSION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCOUNTDIMENSION$26);
            }
            target.set(isCountDimension);
        }
    }
    
    /**
     * Unsets the "isCountDimension" attribute
     */
    public void unsetIsCountDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCOUNTDIMENSION$26);
        }
    }
    
    /**
     * Gets the "isNonObservationTimeDimension" attribute
     */
    public boolean getIsNonObservationTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISNONOBSERVATIONTIMEDIMENSION$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNonObservationTimeDimension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNonObservationTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISNONOBSERVATIONTIMEDIMENSION$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "isNonObservationTimeDimension" attribute
     */
    public boolean isSetIsNonObservationTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28) != null;
        }
    }
    
    /**
     * Sets the "isNonObservationTimeDimension" attribute
     */
    public void setIsNonObservationTimeDimension(boolean isNonObservationTimeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28);
            }
            target.setBooleanValue(isNonObservationTimeDimension);
        }
    }
    
    /**
     * Sets (as xml) the "isNonObservationTimeDimension" attribute
     */
    public void xsetIsNonObservationTimeDimension(org.apache.xmlbeans.XmlBoolean isNonObservationTimeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISNONOBSERVATIONTIMEDIMENSION$28);
            }
            target.set(isNonObservationTimeDimension);
        }
    }
    
    /**
     * Unsets the "isNonObservationTimeDimension" attribute
     */
    public void unsetIsNonObservationTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISNONOBSERVATIONTIMEDIMENSION$28);
        }
    }
    
    /**
     * Gets the "isIdentityDimension" attribute
     */
    public boolean getIsIdentityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISIDENTITYDIMENSION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISIDENTITYDIMENSION$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isIdentityDimension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsIdentityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISIDENTITYDIMENSION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISIDENTITYDIMENSION$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "isIdentityDimension" attribute
     */
    public boolean isSetIsIdentityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISIDENTITYDIMENSION$30) != null;
        }
    }
    
    /**
     * Sets the "isIdentityDimension" attribute
     */
    public void setIsIdentityDimension(boolean isIdentityDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISIDENTITYDIMENSION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISIDENTITYDIMENSION$30);
            }
            target.setBooleanValue(isIdentityDimension);
        }
    }
    
    /**
     * Sets (as xml) the "isIdentityDimension" attribute
     */
    public void xsetIsIdentityDimension(org.apache.xmlbeans.XmlBoolean isIdentityDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISIDENTITYDIMENSION$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISIDENTITYDIMENSION$30);
            }
            target.set(isIdentityDimension);
        }
    }
    
    /**
     * Unsets the "isIdentityDimension" attribute
     */
    public void unsetIsIdentityDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISIDENTITYDIMENSION$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$32);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$32);
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
            return get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHDATASET$32);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHDATASET$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHDATASET$32);
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
            get_store().remove_attribute(CROSSSECTIONALATTACHDATASET$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$34);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$34);
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
            return get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHGROUP$34);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHGROUP$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHGROUP$34);
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
            get_store().remove_attribute(CROSSSECTIONALATTACHGROUP$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$36);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$36);
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
            return get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHSECTION$36);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHSECTION$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHSECTION$36);
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
            get_store().remove_attribute(CROSSSECTIONALATTACHSECTION$36);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38);
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
            return get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CROSSSECTIONALATTACHOBSERVATION$38);
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
            get_store().remove_attribute(CROSSSECTIONALATTACHOBSERVATION$38);
        }
    }
}
