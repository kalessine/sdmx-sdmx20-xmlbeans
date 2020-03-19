/*
 * XML Type:  SubmittedStructureType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmittedStructureType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmittedStructureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType
{
    private static final long serialVersionUID = 1L;
    
    public SubmittedStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFLOWREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADATAFLOWREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowRef");
    private static final javax.xml.namespace.QName CODELISTREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CodelistRef");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "HierarchicalCodelistRef");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategorySchemeRef");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ConceptSchemeRef");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEREF$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemeRef");
    private static final javax.xml.namespace.QName KEYFAMILYREF$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "KeyFamilyRef");
    private static final javax.xml.namespace.QName METADATASTRUCTUREREF$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataStructureRef");
    private static final javax.xml.namespace.QName PROCESSREF$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProcessRef");
    private static final javax.xml.namespace.QName STRUCTURESETREF$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructureSetRef");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYREF$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ReportingTaxonomyRef");
    private static final javax.xml.namespace.QName EXTERNALDEPENDENCIES$24 = 
        new javax.xml.namespace.QName("", "externalDependencies");
    private static final javax.xml.namespace.QName ACTION$26 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName ISFINAL$28 = 
        new javax.xml.namespace.QName("", "isFinal");
    
    
    /**
     * Gets the "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataflowRef" element
     */
    public boolean isSetDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWREF$0) != 0;
        }
    }
    
    /**
     * Sets the "DataflowRef" element
     */
    public void setDataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$0);
            }
            target.set(dataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataflowRef" element
     */
    public void unsetDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWREF$0, 0);
        }
    }
    
    /**
     * Gets the "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataflowRef" element
     */
    public boolean isSetMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWREF$2) != 0;
        }
    }
    
    /**
     * Sets the "MetadataflowRef" element
     */
    public void setMetadataflowRef(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$2);
            }
            target.set(metadataflowRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataflowRef" element
     */
    public void unsetMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWREF$2, 0);
        }
    }
    
    /**
     * Gets the "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType getCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().find_element_user(CODELISTREF$4, 0);
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
    public void setCodelistRef(org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType codelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().find_element_user(CODELISTREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().add_element_user(CODELISTREF$4);
            }
            target.set(codelistRef);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType addNewCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().add_element_user(CODELISTREF$4);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType getHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$6, 0);
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
    public void setHierarchicalCodelistRef(org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType hierarchicalCodelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().add_element_user(HIERARCHICALCODELISTREF$6);
            }
            target.set(hierarchicalCodelistRef);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType addNewHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().add_element_user(HIERARCHICALCODELISTREF$6);
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
     * Gets the "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType getCategorySchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().find_element_user(CATEGORYSCHEMEREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemeRef" element
     */
    public boolean isSetCategorySchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEREF$8) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemeRef" element
     */
    public void setCategorySchemeRef(org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType categorySchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().find_element_user(CATEGORYSCHEMEREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().add_element_user(CATEGORYSCHEMEREF$8);
            }
            target.set(categorySchemeRef);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType addNewCategorySchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().add_element_user(CATEGORYSCHEMEREF$8);
            return target;
        }
    }
    
    /**
     * Unsets the "CategorySchemeRef" element
     */
    public void unsetCategorySchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEREF$8, 0);
        }
    }
    
    /**
     * Gets the "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType getConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConceptSchemeRef" element
     */
    public boolean isSetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEMEREF$10) != 0;
        }
    }
    
    /**
     * Sets the "ConceptSchemeRef" element
     */
    public void setConceptSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType conceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().add_element_user(CONCEPTSCHEMEREF$10);
            }
            target.set(conceptSchemeRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType addNewConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().add_element_user(CONCEPTSCHEMEREF$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ConceptSchemeRef" element
     */
    public void unsetConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEMEREF$10, 0);
        }
    }
    
    /**
     * Gets the "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType getOrganisationSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().find_element_user(ORGANISATIONSCHEMEREF$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationSchemeRef" element
     */
    public boolean isSetOrganisationSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEREF$12) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeRef" element
     */
    public void setOrganisationSchemeRef(org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType organisationSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().find_element_user(ORGANISATIONSCHEMEREF$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().add_element_user(ORGANISATIONSCHEMEREF$12);
            }
            target.set(organisationSchemeRef);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType addNewOrganisationSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().add_element_user(ORGANISATIONSCHEMEREF$12);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationSchemeRef" element
     */
    public void unsetOrganisationSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEREF$12, 0);
        }
    }
    
    /**
     * Gets the "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType getKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$14, 0);
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
            return get_store().count_elements(KEYFAMILYREF$14) != 0;
        }
    }
    
    /**
     * Sets the "KeyFamilyRef" element
     */
    public void setKeyFamilyRef(org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().add_element_user(KEYFAMILYREF$14);
            }
            target.set(keyFamilyRef);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType addNewKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().add_element_user(KEYFAMILYREF$14);
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
            get_store().remove_element(KEYFAMILYREF$14, 0);
        }
    }
    
    /**
     * Gets the "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType getMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$16, 0);
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
            return get_store().count_elements(METADATASTRUCTUREREF$16) != 0;
        }
    }
    
    /**
     * Sets the "MetadataStructureRef" element
     */
    public void setMetadataStructureRef(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType metadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().add_element_user(METADATASTRUCTUREREF$16);
            }
            target.set(metadataStructureRef);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType addNewMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().add_element_user(METADATASTRUCTUREREF$16);
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
            get_store().remove_element(METADATASTRUCTUREREF$16, 0);
        }
    }
    
    /**
     * Gets the "ProcessRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType getProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().find_element_user(PROCESSREF$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcessRef" element
     */
    public boolean isSetProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSREF$18) != 0;
        }
    }
    
    /**
     * Sets the "ProcessRef" element
     */
    public void setProcessRef(org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType processRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().find_element_user(PROCESSREF$18, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().add_element_user(PROCESSREF$18);
            }
            target.set(processRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ProcessRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType addNewProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().add_element_user(PROCESSREF$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcessRef" element
     */
    public void unsetProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSREF$18, 0);
        }
    }
    
    /**
     * Gets the "StructureSetRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType getStructureSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().find_element_user(STRUCTURESETREF$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureSetRef" element
     */
    public boolean isSetStructureSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESETREF$20) != 0;
        }
    }
    
    /**
     * Sets the "StructureSetRef" element
     */
    public void setStructureSetRef(org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType structureSetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().find_element_user(STRUCTURESETREF$20, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().add_element_user(STRUCTURESETREF$20);
            }
            target.set(structureSetRef);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSetRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType addNewStructureSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().add_element_user(STRUCTURESETREF$20);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureSetRef" element
     */
    public void unsetStructureSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESETREF$20, 0);
        }
    }
    
    /**
     * Gets the "ReportingTaxonomyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType getReportingTaxonomyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().find_element_user(REPORTINGTAXONOMYREF$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingTaxonomyRef" element
     */
    public boolean isSetReportingTaxonomyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMYREF$22) != 0;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomyRef" element
     */
    public void setReportingTaxonomyRef(org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType reportingTaxonomyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().find_element_user(REPORTINGTAXONOMYREF$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().add_element_user(REPORTINGTAXONOMYREF$22);
            }
            target.set(reportingTaxonomyRef);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType addNewReportingTaxonomyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().add_element_user(REPORTINGTAXONOMYREF$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingTaxonomyRef" element
     */
    public void unsetReportingTaxonomyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMYREF$22, 0);
        }
    }
    
    /**
     * Gets the "externalDependencies" attribute
     */
    public boolean getExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALDEPENDENCIES$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "externalDependencies" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTERNALDEPENDENCIES$24);
            return target;
        }
    }
    
    /**
     * True if has "externalDependencies" attribute
     */
    public boolean isSetExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTERNALDEPENDENCIES$24) != null;
        }
    }
    
    /**
     * Sets the "externalDependencies" attribute
     */
    public void setExternalDependencies(boolean externalDependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALDEPENDENCIES$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTERNALDEPENDENCIES$24);
            }
            target.setBooleanValue(externalDependencies);
        }
    }
    
    /**
     * Sets (as xml) the "externalDependencies" attribute
     */
    public void xsetExternalDependencies(org.apache.xmlbeans.XmlBoolean externalDependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTERNALDEPENDENCIES$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTERNALDEPENDENCIES$24);
            }
            target.set(externalDependencies);
        }
    }
    
    /**
     * Unsets the "externalDependencies" attribute
     */
    public void unsetExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTERNALDEPENDENCIES$24);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$26);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_attribute_user(ACTION$26);
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$26) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$26);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_attribute_user(ACTION$26);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().add_attribute_user(ACTION$26);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFINAL$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFINAL$28);
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
            return get_store().find_attribute_user(ISFINAL$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFINAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFINAL$28);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFINAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFINAL$28);
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
            get_store().remove_attribute(ISFINAL$28);
        }
    }
}
