/*
 * XML Type:  RelatedStructuresType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.RelatedStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML RelatedStructuresType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class RelatedStructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.RelatedStructuresType
{
    private static final long serialVersionUID = 1L;
    
    public RelatedStructuresTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFAMILYREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "KeyFamilyRef");
    private static final javax.xml.namespace.QName METADATASTRUCTUREREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MetadataStructureRef");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ConceptSchemeRef");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CategorySchemeRef");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "OrganisationSchemeRef");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTREF$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "HierarchicalCodelistRef");
    
    
    /**
     * Gets array of all "KeyFamilyRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType[] getKeyFamilyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYREF$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType getKeyFamilyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyFamilyRef" element
     */
    public int sizeOfKeyFamilyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYREF$0);
        }
    }
    
    /**
     * Sets array of all "KeyFamilyRef" element
     */
    public void setKeyFamilyRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType[] keyFamilyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyRefArray, KEYFAMILYREF$0);
        }
    }
    
    /**
     * Sets ith "KeyFamilyRef" element
     */
    public void setKeyFamilyRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamilyRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType insertNewKeyFamilyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().insert_element_user(KEYFAMILYREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType addNewKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyRefType)get_store().add_element_user(KEYFAMILYREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamilyRef" element
     */
    public void removeKeyFamilyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYREF$0, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructureRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType[] getMetadataStructureRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREREF$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType getMetadataStructureRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructureRef" element
     */
    public int sizeOfMetadataStructureRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREREF$2);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureRef" element
     */
    public void setMetadataStructureRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType[] metadataStructureRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureRefArray, METADATASTRUCTUREREF$2);
        }
    }
    
    /**
     * Sets ith "MetadataStructureRef" element
     */
    public void setMetadataStructureRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType metadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructureRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType insertNewMetadataStructureRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().insert_element_user(METADATASTRUCTUREREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType addNewMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureRefType)get_store().add_element_user(METADATASTRUCTUREREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructureRef" element
     */
    public void removeMetadataStructureRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREREF$2, i);
        }
    }
    
    /**
     * Gets array of all "ConceptSchemeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType[] getConceptSchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEMEREF$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType getConceptSchemeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptSchemeRef" element
     */
    public int sizeOfConceptSchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEMEREF$4);
        }
    }
    
    /**
     * Sets array of all "ConceptSchemeRef" element
     */
    public void setConceptSchemeRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType[] conceptSchemeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeRefArray, CONCEPTSCHEMEREF$4);
        }
    }
    
    /**
     * Sets ith "ConceptSchemeRef" element
     */
    public void setConceptSchemeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType conceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptSchemeRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType insertNewConceptSchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptSchemeRefType)get_store().insert_element_user(CONCEPTSCHEMEREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeRef" element
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
     * Removes the ith "ConceptSchemeRef" element
     */
    public void removeConceptSchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEMEREF$4, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType[] getCategorySchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEREF$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType getCategorySchemeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType)get_store().find_element_user(CATEGORYSCHEMEREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategorySchemeRef" element
     */
    public int sizeOfCategorySchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEREF$6);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeRef" element
     */
    public void setCategorySchemeRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType[] categorySchemeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeRefArray, CATEGORYSCHEMEREF$6);
        }
    }
    
    /**
     * Sets ith "CategorySchemeRef" element
     */
    public void setCategorySchemeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType categorySchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType)get_store().find_element_user(CATEGORYSCHEMEREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorySchemeRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType insertNewCategorySchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType)get_store().insert_element_user(CATEGORYSCHEMEREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType addNewCategorySchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemeRefType)get_store().add_element_user(CATEGORYSCHEMEREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorySchemeRef" element
     */
    public void removeCategorySchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEREF$6, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationSchemeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType[] getOrganisationSchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEMEREF$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType getOrganisationSchemeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType)get_store().find_element_user(ORGANISATIONSCHEMEREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationSchemeRef" element
     */
    public int sizeOfOrganisationSchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEREF$8);
        }
    }
    
    /**
     * Sets array of all "OrganisationSchemeRef" element
     */
    public void setOrganisationSchemeRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType[] organisationSchemeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeRefArray, ORGANISATIONSCHEMEREF$8);
        }
    }
    
    /**
     * Sets ith "OrganisationSchemeRef" element
     */
    public void setOrganisationSchemeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType organisationSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType)get_store().find_element_user(ORGANISATIONSCHEMEREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationSchemeRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType insertNewOrganisationSchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType)get_store().insert_element_user(ORGANISATIONSCHEMEREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType addNewOrganisationSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemeRefType)get_store().add_element_user(ORGANISATIONSCHEMEREF$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationSchemeRef" element
     */
    public void removeOrganisationSchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEREF$8, i);
        }
    }
    
    /**
     * Gets array of all "HierarchicalCodelistRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType[] getHierarchicalCodelistRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELISTREF$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType getHierarchicalCodelistRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCodelistRef" element
     */
    public int sizeOfHierarchicalCodelistRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELISTREF$10);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCodelistRef" element
     */
    public void setHierarchicalCodelistRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType[] hierarchicalCodelistRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistRefArray, HIERARCHICALCODELISTREF$10);
        }
    }
    
    /**
     * Sets ith "HierarchicalCodelistRef" element
     */
    public void setHierarchicalCodelistRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType hierarchicalCodelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCodelistRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType insertNewHierarchicalCodelistRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().insert_element_user(HIERARCHICALCODELISTREF$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType addNewHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistRefType)get_store().add_element_user(HIERARCHICALCODELISTREF$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCodelistRef" element
     */
    public void removeHierarchicalCodelistRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELISTREF$10, i);
        }
    }
}
