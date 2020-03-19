/*
 * XML Type:  ConceptSchemeMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ConceptSchemeMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ConceptSchemeMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeMapType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Description");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ConceptSchemeRef");
    private static final javax.xml.namespace.QName TARGETCONCEPTSCHEMEREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetConceptSchemeRef");
    private static final javax.xml.namespace.QName CONCEPTMAP$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ConceptMap");
    private static final javax.xml.namespace.QName ANNOTATIONS$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
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
     * Gets array of all "Description" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(DESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2);
        }
    }
    
    /**
     * Sets array of all "Description" element
     */
    public void setDescriptionArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$2);
        }
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(DESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(DESCRIPTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, i);
        }
    }
    
    /**
     * Gets the "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType getConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptSchemeRef" element
     */
    public void setConceptSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType conceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().add_element_user(CONCEPTSCHEMEREF$4);
            }
            target.set(conceptSchemeRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType addNewConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().add_element_user(CONCEPTSCHEMEREF$4);
            return target;
        }
    }
    
    /**
     * Gets the "TargetConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType getTargetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().find_element_user(TARGETCONCEPTSCHEMEREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TargetConceptSchemeRef" element
     */
    public void setTargetConceptSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType targetConceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().find_element_user(TARGETCONCEPTSCHEMEREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().add_element_user(TARGETCONCEPTSCHEMEREF$6);
            }
            target.set(targetConceptSchemeRef);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType addNewTargetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().add_element_user(TARGETCONCEPTSCHEMEREF$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "ConceptMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType[] getConceptMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTMAP$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType getConceptMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType)get_store().find_element_user(CONCEPTMAP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptMap" element
     */
    public int sizeOfConceptMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTMAP$8);
        }
    }
    
    /**
     * Sets array of all "ConceptMap" element
     */
    public void setConceptMapArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType[] conceptMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptMapArray, CONCEPTMAP$8);
        }
    }
    
    /**
     * Sets ith "ConceptMap" element
     */
    public void setConceptMapArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType conceptMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType)get_store().find_element_user(CONCEPTMAP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType insertNewConceptMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType)get_store().insert_element_user(CONCEPTMAP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType addNewConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType)get_store().add_element_user(CONCEPTMAP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptMap" element
     */
    public void removeConceptMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTMAP$8, i);
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
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$12);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v20.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ID$12);
            }
            target.set(id);
        }
    }
}
