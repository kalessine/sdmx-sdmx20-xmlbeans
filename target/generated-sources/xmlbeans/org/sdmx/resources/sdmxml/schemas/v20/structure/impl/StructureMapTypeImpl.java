/*
 * XML Type:  StructureMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.StructureMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML StructureMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class StructureMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.StructureMapType
{
    private static final long serialVersionUID = 1L;
    
    public StructureMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Description");
    private static final javax.xml.namespace.QName KEYFAMILYREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "KeyFamilyRef");
    private static final javax.xml.namespace.QName METADATASTRUCTUREREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MetadataStructureRef");
    private static final javax.xml.namespace.QName TARGETKEYFAMILYREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetKeyFamilyRef");
    private static final javax.xml.namespace.QName TARGETMETADATASTRUCTUREREF$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetMetadataStructureRef");
    private static final javax.xml.namespace.QName COMPONENTMAP$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ComponentMap");
    private static final javax.xml.namespace.QName ANNOTATIONS$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName ISEXTENSION$16 = 
        new javax.xml.namespace.QName("", "isExtension");
    private static final javax.xml.namespace.QName ID$18 = 
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
     * Gets the "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType getKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "KeyFamilyRef" element
     */
    public boolean isSetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYREF$4) != 0;
        }
    }
    
    /**
     * Sets the "KeyFamilyRef" element
     */
    public void setKeyFamilyRef(org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().add_element_user(KEYFAMILYREF$4);
            }
            target.set(keyFamilyRef);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType addNewKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().add_element_user(KEYFAMILYREF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "KeyFamilyRef" element
     */
    public void unsetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYREF$4, 0);
        }
    }
    
    /**
     * Gets the "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType getMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataStructureRef" element
     */
    public boolean isSetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREREF$6) != 0;
        }
    }
    
    /**
     * Sets the "MetadataStructureRef" element
     */
    public void setMetadataStructureRef(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType metadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().add_element_user(METADATASTRUCTUREREF$6);
            }
            target.set(metadataStructureRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType addNewMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().add_element_user(METADATASTRUCTUREREF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataStructureRef" element
     */
    public void unsetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREREF$6, 0);
        }
    }
    
    /**
     * Gets the "TargetKeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType getTargetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().find_element_user(TARGETKEYFAMILYREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TargetKeyFamilyRef" element
     */
    public boolean isSetTargetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETKEYFAMILYREF$8) != 0;
        }
    }
    
    /**
     * Sets the "TargetKeyFamilyRef" element
     */
    public void setTargetKeyFamilyRef(org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType targetKeyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().find_element_user(TARGETKEYFAMILYREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().add_element_user(TARGETKEYFAMILYREF$8);
            }
            target.set(targetKeyFamilyRef);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetKeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType addNewTargetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().add_element_user(TARGETKEYFAMILYREF$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TargetKeyFamilyRef" element
     */
    public void unsetTargetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETKEYFAMILYREF$8, 0);
        }
    }
    
    /**
     * Gets the "TargetMetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType getTargetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().find_element_user(TARGETMETADATASTRUCTUREREF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TargetMetadataStructureRef" element
     */
    public boolean isSetTargetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETMETADATASTRUCTUREREF$10) != 0;
        }
    }
    
    /**
     * Sets the "TargetMetadataStructureRef" element
     */
    public void setTargetMetadataStructureRef(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType targetMetadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().find_element_user(TARGETMETADATASTRUCTUREREF$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().add_element_user(TARGETMETADATASTRUCTUREREF$10);
            }
            target.set(targetMetadataStructureRef);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetMetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType addNewTargetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().add_element_user(TARGETMETADATASTRUCTUREREF$10);
            return target;
        }
    }
    
    /**
     * Unsets the "TargetMetadataStructureRef" element
     */
    public void unsetTargetMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETMETADATASTRUCTUREREF$10, 0);
        }
    }
    
    /**
     * Gets array of all "ComponentMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType[] getComponentMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTMAP$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType getComponentMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType)get_store().find_element_user(COMPONENTMAP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComponentMap" element
     */
    public int sizeOfComponentMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTMAP$12);
        }
    }
    
    /**
     * Sets array of all "ComponentMap" element
     */
    public void setComponentMapArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType[] componentMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentMapArray, COMPONENTMAP$12);
        }
    }
    
    /**
     * Sets ith "ComponentMap" element
     */
    public void setComponentMapArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType componentMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType)get_store().find_element_user(COMPONENTMAP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType insertNewComponentMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType)get_store().insert_element_user(COMPONENTMAP$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType addNewComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType)get_store().add_element_user(COMPONENTMAP$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentMap" element
     */
    public void removeComponentMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTMAP$12, i);
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
     * Gets the "isExtension" attribute
     */
    public boolean getIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTENSION$16);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExtension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTENSION$16);
            return target;
        }
    }
    
    /**
     * True if has "isExtension" attribute
     */
    public boolean isSetIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISEXTENSION$16) != null;
        }
    }
    
    /**
     * Sets the "isExtension" attribute
     */
    public void setIsExtension(boolean isExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTENSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISEXTENSION$16);
            }
            target.setBooleanValue(isExtension);
        }
    }
    
    /**
     * Sets (as xml) the "isExtension" attribute
     */
    public void xsetIsExtension(org.apache.xmlbeans.XmlBoolean isExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTENSION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISEXTENSION$16);
            }
            target.set(isExtension);
        }
    }
    
    /**
     * Unsets the "isExtension" attribute
     */
    public void unsetIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISEXTENSION$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ID$18);
            }
            target.set(id);
        }
    }
}
