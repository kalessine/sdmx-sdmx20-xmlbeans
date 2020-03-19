/*
 * XML Type:  HierarchicalCodelistType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML HierarchicalCodelistType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class HierarchicalCodelistTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Description");
    private static final javax.xml.namespace.QName CODELISTREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodelistRef");
    private static final javax.xml.namespace.QName HIERARCHY$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Hierarchy");
    private static final javax.xml.namespace.QName ANNOTATIONS$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName AGENCYID$12 = 
        new javax.xml.namespace.QName("", "agencyID");
    private static final javax.xml.namespace.QName VERSION$14 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName URN$16 = 
        new javax.xml.namespace.QName("", "urn");
    private static final javax.xml.namespace.QName URI$18 = 
        new javax.xml.namespace.QName("", "uri");
    private static final javax.xml.namespace.QName ISEXTERNALREFERENCE$20 = 
        new javax.xml.namespace.QName("", "isExternalReference");
    private static final javax.xml.namespace.QName ISFINAL$22 = 
        new javax.xml.namespace.QName("", "isFinal");
    private static final javax.xml.namespace.QName VALIDFROM$24 = 
        new javax.xml.namespace.QName("", "validFrom");
    private static final javax.xml.namespace.QName VALIDTO$26 = 
        new javax.xml.namespace.QName("", "validTo");
    
    
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
     * Gets array of all "CodelistRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType[] getCodelistRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELISTREF$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType getCodelistRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().find_element_user(CODELISTREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodelistRef" element
     */
    public int sizeOfCodelistRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTREF$4);
        }
    }
    
    /**
     * Sets array of all "CodelistRef" element
     */
    public void setCodelistRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType[] codelistRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistRefArray, CODELISTREF$4);
        }
    }
    
    /**
     * Sets ith "CodelistRef" element
     */
    public void setCodelistRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType codelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().find_element_user(CODELISTREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelistRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType insertNewCodelistRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodelistRefType)get_store().insert_element_user(CODELISTREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodelistRef" element
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
     * Removes the ith "CodelistRef" element
     */
    public void removeCodelistRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTREF$4, i);
        }
    }
    
    /**
     * Gets array of all "Hierarchy" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType[] getHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHY$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType getHierarchyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType)get_store().find_element_user(HIERARCHY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Hierarchy" element
     */
    public int sizeOfHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHY$6);
        }
    }
    
    /**
     * Sets array of all "Hierarchy" element
     */
    public void setHierarchyArray(org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType[] hierarchyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchyArray, HIERARCHY$6);
        }
    }
    
    /**
     * Sets ith "Hierarchy" element
     */
    public void setHierarchyArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType)get_store().find_element_user(HIERARCHY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType insertNewHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType)get_store().insert_element_user(HIERARCHY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType addNewHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchyType)get_store().add_element_user(HIERARCHY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Hierarchy" element
     */
    public void removeHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHY$6, i);
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
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "agencyID" attribute
     */
    public java.lang.String getAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCYID$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agencyID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(AGENCYID$12);
            return target;
        }
    }
    
    /**
     * Sets the "agencyID" attribute
     */
    public void setAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCYID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCYID$12);
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) the "agencyID" attribute
     */
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(AGENCYID$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(AGENCYID$12);
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$14);
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$14) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$14);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$14);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$14);
        }
    }
    
    /**
     * Gets the "urn" attribute
     */
    public java.lang.String getUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URN$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "urn" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URN$16);
            return target;
        }
    }
    
    /**
     * True if has "urn" attribute
     */
    public boolean isSetUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URN$16) != null;
        }
    }
    
    /**
     * Sets the "urn" attribute
     */
    public void setUrn(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URN$16);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "urn" attribute
     */
    public void xsetUrn(org.apache.xmlbeans.XmlAnyURI urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URN$16);
            }
            target.set(urn);
        }
    }
    
    /**
     * Unsets the "urn" attribute
     */
    public void unsetUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URN$16);
        }
    }
    
    /**
     * Gets the "uri" attribute
     */
    public java.lang.String getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$18);
            return target;
        }
    }
    
    /**
     * True if has "uri" attribute
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$18) != null;
        }
    }
    
    /**
     * Sets the "uri" attribute
     */
    public void setUri(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$18);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" attribute
     */
    public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$18);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "uri" attribute
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$18);
        }
    }
    
    /**
     * Gets the "isExternalReference" attribute
     */
    public boolean getIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTERNALREFERENCE$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExternalReference" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTERNALREFERENCE$20);
            return target;
        }
    }
    
    /**
     * True if has "isExternalReference" attribute
     */
    public boolean isSetIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISEXTERNALREFERENCE$20) != null;
        }
    }
    
    /**
     * Sets the "isExternalReference" attribute
     */
    public void setIsExternalReference(boolean isExternalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTERNALREFERENCE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISEXTERNALREFERENCE$20);
            }
            target.setBooleanValue(isExternalReference);
        }
    }
    
    /**
     * Sets (as xml) the "isExternalReference" attribute
     */
    public void xsetIsExternalReference(org.apache.xmlbeans.XmlBoolean isExternalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTERNALREFERENCE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISEXTERNALREFERENCE$20);
            }
            target.set(isExternalReference);
        }
    }
    
    /**
     * Unsets the "isExternalReference" attribute
     */
    public void unsetIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISEXTERNALREFERENCE$20);
        }
    }
    
    /**
     * Gets the "isFinal" attribute
     */
    public boolean getIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFINAL$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isFinal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFINAL$22);
            return target;
        }
    }
    
    /**
     * True if has "isFinal" attribute
     */
    public boolean isSetIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISFINAL$22) != null;
        }
    }
    
    /**
     * Sets the "isFinal" attribute
     */
    public void setIsFinal(boolean isFinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFINAL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFINAL$22);
            }
            target.setBooleanValue(isFinal);
        }
    }
    
    /**
     * Sets (as xml) the "isFinal" attribute
     */
    public void xsetIsFinal(org.apache.xmlbeans.XmlBoolean isFinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFINAL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFINAL$22);
            }
            target.set(isFinal);
        }
    }
    
    /**
     * Unsets the "isFinal" attribute
     */
    public void unsetIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISFINAL$22);
        }
    }
    
    /**
     * Gets the "validFrom" attribute
     */
    public java.lang.Object getValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$24);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "validFrom" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDFROM$24);
            return target;
        }
    }
    
    /**
     * True if has "validFrom" attribute
     */
    public boolean isSetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROM$24) != null;
        }
    }
    
    /**
     * Sets the "validFrom" attribute
     */
    public void setValidFrom(java.lang.Object validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$24);
            }
            target.setObjectValue(validFrom);
        }
    }
    
    /**
     * Sets (as xml) the "validFrom" attribute
     */
    public void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDFROM$24);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(VALIDFROM$24);
            }
            target.set(validFrom);
        }
    }
    
    /**
     * Unsets the "validFrom" attribute
     */
    public void unsetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROM$24);
        }
    }
    
    /**
     * Gets the "validTo" attribute
     */
    public java.lang.Object getValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$26);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "validTo" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDTO$26);
            return target;
        }
    }
    
    /**
     * True if has "validTo" attribute
     */
    public boolean isSetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTO$26) != null;
        }
    }
    
    /**
     * Sets the "validTo" attribute
     */
    public void setValidTo(java.lang.Object validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$26);
            }
            target.setObjectValue(validTo);
        }
    }
    
    /**
     * Sets (as xml) the "validTo" attribute
     */
    public void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_attribute_user(VALIDTO$26);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_attribute_user(VALIDTO$26);
            }
            target.set(validTo);
        }
    }
    
    /**
     * Unsets the "validTo" attribute
     */
    public void unsetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTO$26);
        }
    }
}
