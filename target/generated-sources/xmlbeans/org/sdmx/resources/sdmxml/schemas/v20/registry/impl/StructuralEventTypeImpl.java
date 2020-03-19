/*
 * XML Type:  StructuralEventType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML StructuralEventType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class StructuralEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralEventType
{
    private static final long serialVersionUID = 1L;
    
    public StructuralEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMES$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemes");
    private static final javax.xml.namespace.QName DATAFLOWS$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Dataflows");
    private static final javax.xml.namespace.QName METADATAFLOWS$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Metadataflows");
    private static final javax.xml.namespace.QName CATEGORYSCHEMES$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategorySchemes");
    private static final javax.xml.namespace.QName CODELISTS$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CodeLists");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTS$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "HierarchicalCodelists");
    private static final javax.xml.namespace.QName CONCEPTS$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Concepts");
    private static final javax.xml.namespace.QName METADATASTRUCTUREDEFINITIONS$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataStructureDefinitions");
    private static final javax.xml.namespace.QName KEYFAMILIES$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "KeyFamilies");
    private static final javax.xml.namespace.QName STRUCTURESETS$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructureSets");
    private static final javax.xml.namespace.QName PROCESSES$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Processes");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMIES$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ReportingTaxonomies");
    
    
    /**
     * Gets the "OrganisationSchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType getOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType)get_store().find_element_user(ORGANISATIONSCHEMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationSchemes" element
     */
    public boolean isSetOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMES$0) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationSchemes" element
     */
    public void setOrganisationSchemes(org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType organisationSchemes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType)get_store().find_element_user(ORGANISATIONSCHEMES$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType)get_store().add_element_user(ORGANISATIONSCHEMES$0);
            }
            target.set(organisationSchemes);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType addNewOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.OrganisationSchemesType)get_store().add_element_user(ORGANISATIONSCHEMES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationSchemes" element
     */
    public void unsetOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMES$0, 0);
        }
    }
    
    /**
     * Gets the "Dataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType getDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType)get_store().find_element_user(DATAFLOWS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Dataflows" element
     */
    public boolean isSetDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWS$2) != 0;
        }
    }
    
    /**
     * Sets the "Dataflows" element
     */
    public void setDataflows(org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType dataflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType)get_store().find_element_user(DATAFLOWS$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType)get_store().add_element_user(DATAFLOWS$2);
            }
            target.set(dataflows);
        }
    }
    
    /**
     * Appends and returns a new empty "Dataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType addNewDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DataflowsType)get_store().add_element_user(DATAFLOWS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Dataflows" element
     */
    public void unsetDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWS$2, 0);
        }
    }
    
    /**
     * Gets the "Metadataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType getMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType)get_store().find_element_user(METADATAFLOWS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Metadataflows" element
     */
    public boolean isSetMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWS$4) != 0;
        }
    }
    
    /**
     * Sets the "Metadataflows" element
     */
    public void setMetadataflows(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType metadataflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType)get_store().find_element_user(METADATAFLOWS$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType)get_store().add_element_user(METADATAFLOWS$4);
            }
            target.set(metadataflows);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType addNewMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataflowsType)get_store().add_element_user(METADATAFLOWS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Metadataflows" element
     */
    public void unsetMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWS$4, 0);
        }
    }
    
    /**
     * Gets the "CategorySchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType getCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType)get_store().find_element_user(CATEGORYSCHEMES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemes" element
     */
    public boolean isSetCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMES$6) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemes" element
     */
    public void setCategorySchemes(org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType categorySchemes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType)get_store().find_element_user(CATEGORYSCHEMES$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType)get_store().add_element_user(CATEGORYSCHEMES$6);
            }
            target.set(categorySchemes);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType addNewCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategorySchemesType)get_store().add_element_user(CATEGORYSCHEMES$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CategorySchemes" element
     */
    public void unsetCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMES$6, 0);
        }
    }
    
    /**
     * Gets the "CodeLists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType getCodeLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType)get_store().find_element_user(CODELISTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodeLists" element
     */
    public boolean isSetCodeLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTS$8) != 0;
        }
    }
    
    /**
     * Sets the "CodeLists" element
     */
    public void setCodeLists(org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType codeLists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType)get_store().find_element_user(CODELISTS$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType)get_store().add_element_user(CODELISTS$8);
            }
            target.set(codeLists);
        }
    }
    
    /**
     * Appends and returns a new empty "CodeLists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType addNewCodeLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType)get_store().add_element_user(CODELISTS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "CodeLists" element
     */
    public void unsetCodeLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTS$8, 0);
        }
    }
    
    /**
     * Gets the "HierarchicalCodelists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType getHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType)get_store().find_element_user(HIERARCHICALCODELISTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HierarchicalCodelists" element
     */
    public boolean isSetHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELISTS$10) != 0;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelists" element
     */
    public void setHierarchicalCodelists(org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType hierarchicalCodelists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType)get_store().find_element_user(HIERARCHICALCODELISTS$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType)get_store().add_element_user(HIERARCHICALCODELISTS$10);
            }
            target.set(hierarchicalCodelists);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType addNewHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.HierarchicalCodelistsType)get_store().add_element_user(HIERARCHICALCODELISTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "HierarchicalCodelists" element
     */
    public void unsetHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELISTS$10, 0);
        }
    }
    
    /**
     * Gets the "Concepts" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType getConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType)get_store().find_element_user(CONCEPTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Concepts" element
     */
    public boolean isSetConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTS$12) != 0;
        }
    }
    
    /**
     * Sets the "Concepts" element
     */
    public void setConcepts(org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType concepts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType)get_store().find_element_user(CONCEPTS$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType)get_store().add_element_user(CONCEPTS$12);
            }
            target.set(concepts);
        }
    }
    
    /**
     * Appends and returns a new empty "Concepts" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType addNewConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptsType)get_store().add_element_user(CONCEPTS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Concepts" element
     */
    public void unsetConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTS$12, 0);
        }
    }
    
    /**
     * Gets the "MetadataStructureDefinitions" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType getMetadataStructureDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType)get_store().find_element_user(METADATASTRUCTUREDEFINITIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataStructureDefinitions" element
     */
    public boolean isSetMetadataStructureDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREDEFINITIONS$14) != 0;
        }
    }
    
    /**
     * Sets the "MetadataStructureDefinitions" element
     */
    public void setMetadataStructureDefinitions(org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType metadataStructureDefinitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType)get_store().find_element_user(METADATASTRUCTUREDEFINITIONS$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType)get_store().add_element_user(METADATASTRUCTUREDEFINITIONS$14);
            }
            target.set(metadataStructureDefinitions);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructureDefinitions" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType addNewMetadataStructureDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.MetadataStructureDefinitionsType)get_store().add_element_user(METADATASTRUCTUREDEFINITIONS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataStructureDefinitions" element
     */
    public void unsetMetadataStructureDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREDEFINITIONS$14, 0);
        }
    }
    
    /**
     * Gets the "KeyFamilies" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType getKeyFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType)get_store().find_element_user(KEYFAMILIES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "KeyFamilies" element
     */
    public boolean isSetKeyFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILIES$16) != 0;
        }
    }
    
    /**
     * Sets the "KeyFamilies" element
     */
    public void setKeyFamilies(org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType keyFamilies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType)get_store().find_element_user(KEYFAMILIES$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType)get_store().add_element_user(KEYFAMILIES$16);
            }
            target.set(keyFamilies);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyFamilies" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType addNewKeyFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType)get_store().add_element_user(KEYFAMILIES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "KeyFamilies" element
     */
    public void unsetKeyFamilies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILIES$16, 0);
        }
    }
    
    /**
     * Gets the "StructureSets" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType getStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType)get_store().find_element_user(STRUCTURESETS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureSets" element
     */
    public boolean isSetStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESETS$18) != 0;
        }
    }
    
    /**
     * Sets the "StructureSets" element
     */
    public void setStructureSets(org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType structureSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType)get_store().find_element_user(STRUCTURESETS$18, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType)get_store().add_element_user(STRUCTURESETS$18);
            }
            target.set(structureSets);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSets" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType addNewStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.StructureSetsType)get_store().add_element_user(STRUCTURESETS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureSets" element
     */
    public void unsetStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESETS$18, 0);
        }
    }
    
    /**
     * Gets the "Processes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType getProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType)get_store().find_element_user(PROCESSES$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Processes" element
     */
    public boolean isSetProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSES$20) != 0;
        }
    }
    
    /**
     * Sets the "Processes" element
     */
    public void setProcesses(org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType processes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType)get_store().find_element_user(PROCESSES$20, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType)get_store().add_element_user(PROCESSES$20);
            }
            target.set(processes);
        }
    }
    
    /**
     * Appends and returns a new empty "Processes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType addNewProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessesType)get_store().add_element_user(PROCESSES$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Processes" element
     */
    public void unsetProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSES$20, 0);
        }
    }
    
    /**
     * Gets the "ReportingTaxonomies" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType getReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType)get_store().find_element_user(REPORTINGTAXONOMIES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingTaxonomies" element
     */
    public boolean isSetReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMIES$22) != 0;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomies" element
     */
    public void setReportingTaxonomies(org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType reportingTaxonomies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType)get_store().find_element_user(REPORTINGTAXONOMIES$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType)get_store().add_element_user(REPORTINGTAXONOMIES$22);
            }
            target.set(reportingTaxonomies);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomies" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType addNewReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ReportingTaxonomiesType)get_store().add_element_user(REPORTINGTAXONOMIES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingTaxonomies" element
     */
    public void unsetReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMIES$22, 0);
        }
    }
}
