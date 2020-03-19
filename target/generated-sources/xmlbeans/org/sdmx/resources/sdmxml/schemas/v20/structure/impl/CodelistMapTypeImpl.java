/*
 * XML Type:  CodelistMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML CodelistMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class CodelistMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistMapType
{
    private static final long serialVersionUID = 1L;
    
    public CodelistMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Description");
    private static final javax.xml.namespace.QName CODELISTREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodelistRef");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "HierarchicalCodelistRef");
    private static final javax.xml.namespace.QName TARGETCODELISTREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetCodelistRef");
    private static final javax.xml.namespace.QName TARGETHIERARCHICALCODELISTREF$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetHierarchicalCodelistRef");
    private static final javax.xml.namespace.QName CODEMAP$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodeMap");
    private static final javax.xml.namespace.QName ANNOTATIONS$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName ID$16 = 
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
     * Gets the "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType getCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().find_element_user(CODELISTREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodelistRef" element
     */
    public boolean isSetCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTREF$4) != 0;
        }
    }
    
    /**
     * Sets the "CodelistRef" element
     */
    public void setCodelistRef(org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType codelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().find_element_user(CODELISTREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().add_element_user(CODELISTREF$4);
            }
            target.set(codelistRef);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType addNewCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().add_element_user(CODELISTREF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CodelistRef" element
     */
    public void unsetCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTREF$4, 0);
        }
    }
    
    /**
     * Gets the "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType getHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HierarchicalCodelistRef" element
     */
    public boolean isSetHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELISTREF$6) != 0;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelistRef" element
     */
    public void setHierarchicalCodelistRef(org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType hierarchicalCodelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().add_element_user(HIERARCHICALCODELISTREF$6);
            }
            target.set(hierarchicalCodelistRef);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType addNewHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().add_element_user(HIERARCHICALCODELISTREF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "HierarchicalCodelistRef" element
     */
    public void unsetHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELISTREF$6, 0);
        }
    }
    
    /**
     * Gets the "TargetCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType getTargetCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().find_element_user(TARGETCODELISTREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TargetCodelistRef" element
     */
    public boolean isSetTargetCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETCODELISTREF$8) != 0;
        }
    }
    
    /**
     * Sets the "TargetCodelistRef" element
     */
    public void setTargetCodelistRef(org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType targetCodelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().find_element_user(TARGETCODELISTREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().add_element_user(TARGETCODELISTREF$8);
            }
            target.set(targetCodelistRef);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType addNewTargetCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().add_element_user(TARGETCODELISTREF$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TargetCodelistRef" element
     */
    public void unsetTargetCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETCODELISTREF$8, 0);
        }
    }
    
    /**
     * Gets the "TargetHierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType getTargetHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().find_element_user(TARGETHIERARCHICALCODELISTREF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TargetHierarchicalCodelistRef" element
     */
    public boolean isSetTargetHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETHIERARCHICALCODELISTREF$10) != 0;
        }
    }
    
    /**
     * Sets the "TargetHierarchicalCodelistRef" element
     */
    public void setTargetHierarchicalCodelistRef(org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType targetHierarchicalCodelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().find_element_user(TARGETHIERARCHICALCODELISTREF$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().add_element_user(TARGETHIERARCHICALCODELISTREF$10);
            }
            target.set(targetHierarchicalCodelistRef);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetHierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType addNewTargetHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().add_element_user(TARGETHIERARCHICALCODELISTREF$10);
            return target;
        }
    }
    
    /**
     * Unsets the "TargetHierarchicalCodelistRef" element
     */
    public void unsetTargetHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETHIERARCHICALCODELISTREF$10, 0);
        }
    }
    
    /**
     * Gets array of all "CodeMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType[] getCodeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODEMAP$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType getCodeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType)get_store().find_element_user(CODEMAP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodeMap" element
     */
    public int sizeOfCodeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEMAP$12);
        }
    }
    
    /**
     * Sets array of all "CodeMap" element
     */
    public void setCodeMapArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType[] codeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeMapArray, CODEMAP$12);
        }
    }
    
    /**
     * Sets ith "CodeMap" element
     */
    public void setCodeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType codeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType)get_store().find_element_user(CODEMAP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType insertNewCodeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType)get_store().insert_element_user(CODEMAP$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType addNewCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType)get_store().add_element_user(CODEMAP$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodeMap" element
     */
    public void removeCodeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEMAP$12, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$14, 0);
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
            return get_store().count_elements(ANNOTATIONS$14) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$14);
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
            get_store().remove_element(ANNOTATIONS$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ID$16);
            }
            target.set(id);
        }
    }
}
