/*
 * XML Type:  TargetIdentifiersType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.TargetIdentifiersType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML TargetIdentifiersType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class TargetIdentifiersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.TargetIdentifiersType
{
    private static final long serialVersionUID = 1L;
    
    public TargetIdentifiersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLTARGETIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "FullTargetIdentifier");
    private static final javax.xml.namespace.QName PARTIALTARGETIDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "PartialTargetIdentifier");
    private static final javax.xml.namespace.QName ANNOTATIONS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    
    
    /**
     * Gets the "FullTargetIdentifier" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType getFullTargetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType)get_store().find_element_user(FULLTARGETIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FullTargetIdentifier" element
     */
    public void setFullTargetIdentifier(org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType fullTargetIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType)get_store().find_element_user(FULLTARGETIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType)get_store().add_element_user(FULLTARGETIDENTIFIER$0);
            }
            target.set(fullTargetIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "FullTargetIdentifier" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType addNewFullTargetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.FullTargetIdentifierType)get_store().add_element_user(FULLTARGETIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "PartialTargetIdentifier" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType[] getPartialTargetIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTIALTARGETIDENTIFIER$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PartialTargetIdentifier" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType getPartialTargetIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType)get_store().find_element_user(PARTIALTARGETIDENTIFIER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PartialTargetIdentifier" element
     */
    public int sizeOfPartialTargetIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTIALTARGETIDENTIFIER$2);
        }
    }
    
    /**
     * Sets array of all "PartialTargetIdentifier" element
     */
    public void setPartialTargetIdentifierArray(org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType[] partialTargetIdentifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partialTargetIdentifierArray, PARTIALTARGETIDENTIFIER$2);
        }
    }
    
    /**
     * Sets ith "PartialTargetIdentifier" element
     */
    public void setPartialTargetIdentifierArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType partialTargetIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType)get_store().find_element_user(PARTIALTARGETIDENTIFIER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(partialTargetIdentifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PartialTargetIdentifier" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType insertNewPartialTargetIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType)get_store().insert_element_user(PARTIALTARGETIDENTIFIER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PartialTargetIdentifier" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType addNewPartialTargetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PartialTargetIdentifierType)get_store().add_element_user(PARTIALTARGETIDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PartialTargetIdentifier" element
     */
    public void removePartialTargetIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTIALTARGETIDENTIFIER$2, i);
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
}
