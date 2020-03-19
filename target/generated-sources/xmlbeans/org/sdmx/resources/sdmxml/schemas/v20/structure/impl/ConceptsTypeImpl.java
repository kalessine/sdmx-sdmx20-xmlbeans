/*
 * XML Type:  ConceptsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ConceptsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ConceptsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPT$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Concept");
    private static final javax.xml.namespace.QName CONCEPTSCHEME$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ConceptScheme");
    private static final javax.xml.namespace.QName ANNOTATIONS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    
    
    /**
     * Gets array of all "Concept" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType)get_store().find_element_user(CONCEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$0);
        }
    }
    
    /**
     * Sets array of all "Concept" element
     */
    public void setConceptArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType[] conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$0);
        }
    }
    
    /**
     * Sets ith "Concept" element
     */
    public void setConceptArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType)get_store().find_element_user(CONCEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType)get_store().insert_element_user(CONCEPT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptType)get_store().add_element_user(CONCEPT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$0, i);
        }
    }
    
    /**
     * Gets array of all "ConceptScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType[] getConceptSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEME$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType getConceptSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType)get_store().find_element_user(CONCEPTSCHEME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptScheme" element
     */
    public int sizeOfConceptSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEME$2);
        }
    }
    
    /**
     * Sets array of all "ConceptScheme" element
     */
    public void setConceptSchemeArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType[] conceptSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeArray, CONCEPTSCHEME$2);
        }
    }
    
    /**
     * Sets ith "ConceptScheme" element
     */
    public void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType conceptScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType)get_store().find_element_user(CONCEPTSCHEME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType insertNewConceptScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType)get_store().insert_element_user(CONCEPTSCHEME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType addNewConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeType)get_store().add_element_user(CONCEPTSCHEME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptScheme" element
     */
    public void removeConceptScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEME$2, i);
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
