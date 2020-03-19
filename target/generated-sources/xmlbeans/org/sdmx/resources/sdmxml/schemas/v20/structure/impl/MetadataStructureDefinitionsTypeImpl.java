/*
 * XML Type:  MetadataStructureDefinitionsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML MetadataStructureDefinitionsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class MetadataStructureDefinitionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureDefinitionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASTRUCTUREDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MetadataStructureDefinition");
    
    
    /**
     * Gets array of all "MetadataStructureDefinition" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType[] getMetadataStructureDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREDEFINITION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureDefinition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType getMetadataStructureDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType)get_store().find_element_user(METADATASTRUCTUREDEFINITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructureDefinition" element
     */
    public int sizeOfMetadataStructureDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREDEFINITION$0);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureDefinition" element
     */
    public void setMetadataStructureDefinitionArray(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType[] metadataStructureDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureDefinitionArray, METADATASTRUCTUREDEFINITION$0);
        }
    }
    
    /**
     * Sets ith "MetadataStructureDefinition" element
     */
    public void setMetadataStructureDefinitionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType metadataStructureDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType)get_store().find_element_user(METADATASTRUCTUREDEFINITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructureDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType insertNewMetadataStructureDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType)get_store().insert_element_user(METADATASTRUCTUREDEFINITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType addNewMetadataStructureDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionType)get_store().add_element_user(METADATASTRUCTUREDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructureDefinition" element
     */
    public void removeMetadataStructureDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREDEFINITION$0, i);
        }
    }
}
