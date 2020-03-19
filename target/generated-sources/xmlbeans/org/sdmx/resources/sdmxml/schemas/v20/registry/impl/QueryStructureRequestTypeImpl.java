/*
 * XML Type:  QueryStructureRequestType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML QueryStructureRequestType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class QueryStructureRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.QueryStructureRequestType
{
    private static final long serialVersionUID = 1L;
    
    public QueryStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "AgencyRef");
    private static final javax.xml.namespace.QName DATAPROVIDERREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataProviderRef");
    private static final javax.xml.namespace.QName DATAFLOWREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowRef");
    private static final javax.xml.namespace.QName METADATAFLOWREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowRef");
    private static final javax.xml.namespace.QName CODELISTREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CodelistRef");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEREF$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategorySchemeRef");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEREF$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ConceptSchemeRef");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEREF$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemeRef");
    private static final javax.xml.namespace.QName KEYFAMILYREF$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "KeyFamilyRef");
    private static final javax.xml.namespace.QName METADATASTRUCTUREREF$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataStructureRef");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTREF$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "HierarchicalCodelistRef");
    private static final javax.xml.namespace.QName STRUCTURESETREF$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructureSetRef");
    private static final javax.xml.namespace.QName PROCESSREF$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProcessRef");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYREF$26 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ReportingTaxonomyRef");
    private static final javax.xml.namespace.QName RESOLVEREFERENCES$28 = 
        new javax.xml.namespace.QName("", "resolveReferences");
    
    
    /**
     * Gets array of all "AgencyRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType[] getAgencyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYREF$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType getAgencyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType)get_store().find_element_user(AGENCYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AgencyRef" element
     */
    public int sizeOfAgencyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYREF$0);
        }
    }
    
    /**
     * Sets array of all "AgencyRef" element
     */
    public void setAgencyRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType[] agencyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyRefArray, AGENCYREF$0);
        }
    }
    
    /**
     * Sets ith "AgencyRef" element
     */
    public void setAgencyRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType agencyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType)get_store().find_element_user(AGENCYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType insertNewAgencyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType)get_store().insert_element_user(AGENCYREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType addNewAgencyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.AgencyRefType)get_store().add_element_user(AGENCYREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AgencyRef" element
     */
    public void removeAgencyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYREF$0, i);
        }
    }
    
    /**
     * Gets array of all "DataProviderRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] getDataProviderRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERREF$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType getDataProviderRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataProviderRef" element
     */
    public int sizeOfDataProviderRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERREF$2);
        }
    }
    
    /**
     * Sets array of all "DataProviderRef" element
     */
    public void setDataProviderRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType[] dataProviderRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderRefArray, DATAPROVIDERREF$2);
        }
    }
    
    /**
     * Sets ith "DataProviderRef" element
     */
    public void setDataProviderRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType dataProviderRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().find_element_user(DATAPROVIDERREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProviderRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType insertNewDataProviderRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().insert_element_user(DATAPROVIDERREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType addNewDataProviderRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataProviderRefType)get_store().add_element_user(DATAPROVIDERREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProviderRef" element
     */
    public void removeDataProviderRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERREF$2, i);
        }
    }
    
    /**
     * Gets array of all "DataflowRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] getDataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWREF$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType getDataflowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataflowRef" element
     */
    public int sizeOfDataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWREF$4);
        }
    }
    
    /**
     * Sets array of all "DataflowRef" element
     */
    public void setDataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType[] dataflowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowRefArray, DATAFLOWREF$4);
        }
    }
    
    /**
     * Sets ith "DataflowRef" element
     */
    public void setDataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType dataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().find_element_user(DATAFLOWREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType insertNewDataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().insert_element_user(DATAFLOWREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType addNewDataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.DataflowRefType)get_store().add_element_user(DATAFLOWREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataflowRef" element
     */
    public void removeDataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWREF$4, i);
        }
    }
    
    /**
     * Gets array of all "MetadataflowRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] getMetadataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWREF$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType getMetadataflowRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataflowRef" element
     */
    public int sizeOfMetadataflowRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWREF$6);
        }
    }
    
    /**
     * Sets array of all "MetadataflowRef" element
     */
    public void setMetadataflowRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType[] metadataflowRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowRefArray, METADATAFLOWREF$6);
        }
    }
    
    /**
     * Sets ith "MetadataflowRef" element
     */
    public void setMetadataflowRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType metadataflowRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().find_element_user(METADATAFLOWREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflowRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType insertNewMetadataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().insert_element_user(METADATAFLOWREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType addNewMetadataflowRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataflowRefType)get_store().add_element_user(METADATAFLOWREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataflowRef" element
     */
    public void removeMetadataflowRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWREF$6, i);
        }
    }
    
    /**
     * Gets array of all "CodelistRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType[] getCodelistRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELISTREF$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType getCodelistRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().find_element_user(CODELISTREF$8, i);
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
            return get_store().count_elements(CODELISTREF$8);
        }
    }
    
    /**
     * Sets array of all "CodelistRef" element
     */
    public void setCodelistRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType[] codelistRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistRefArray, CODELISTREF$8);
        }
    }
    
    /**
     * Sets ith "CodelistRef" element
     */
    public void setCodelistRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType codelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().find_element_user(CODELISTREF$8, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType insertNewCodelistRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().insert_element_user(CODELISTREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType addNewCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CodelistRefType)get_store().add_element_user(CODELISTREF$8);
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
            get_store().remove_element(CODELISTREF$8, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType[] getCategorySchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEREF$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType getCategorySchemeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().find_element_user(CATEGORYSCHEMEREF$10, i);
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
            return get_store().count_elements(CATEGORYSCHEMEREF$10);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeRef" element
     */
    public void setCategorySchemeRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType[] categorySchemeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeRefArray, CATEGORYSCHEMEREF$10);
        }
    }
    
    /**
     * Sets ith "CategorySchemeRef" element
     */
    public void setCategorySchemeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType categorySchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().find_element_user(CATEGORYSCHEMEREF$10, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType insertNewCategorySchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().insert_element_user(CATEGORYSCHEMEREF$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType addNewCategorySchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.CategorySchemeRefType)get_store().add_element_user(CATEGORYSCHEMEREF$10);
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
            get_store().remove_element(CATEGORYSCHEMEREF$10, i);
        }
    }
    
    /**
     * Gets array of all "ConceptSchemeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType[] getConceptSchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEMEREF$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType getConceptSchemeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$12, i);
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
            return get_store().count_elements(CONCEPTSCHEMEREF$12);
        }
    }
    
    /**
     * Sets array of all "ConceptSchemeRef" element
     */
    public void setConceptSchemeRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType[] conceptSchemeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeRefArray, CONCEPTSCHEMEREF$12);
        }
    }
    
    /**
     * Sets ith "ConceptSchemeRef" element
     */
    public void setConceptSchemeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType conceptSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().find_element_user(CONCEPTSCHEMEREF$12, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType insertNewConceptSchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().insert_element_user(CONCEPTSCHEMEREF$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType addNewConceptSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ConceptSchemeRefType)get_store().add_element_user(CONCEPTSCHEMEREF$12);
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
            get_store().remove_element(CONCEPTSCHEMEREF$12, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationSchemeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType[] getOrganisationSchemeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEMEREF$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType getOrganisationSchemeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().find_element_user(ORGANISATIONSCHEMEREF$14, i);
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
            return get_store().count_elements(ORGANISATIONSCHEMEREF$14);
        }
    }
    
    /**
     * Sets array of all "OrganisationSchemeRef" element
     */
    public void setOrganisationSchemeRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType[] organisationSchemeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeRefArray, ORGANISATIONSCHEMEREF$14);
        }
    }
    
    /**
     * Sets ith "OrganisationSchemeRef" element
     */
    public void setOrganisationSchemeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType organisationSchemeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().find_element_user(ORGANISATIONSCHEMEREF$14, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType insertNewOrganisationSchemeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().insert_element_user(ORGANISATIONSCHEMEREF$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType addNewOrganisationSchemeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.OrganisationSchemeRefType)get_store().add_element_user(ORGANISATIONSCHEMEREF$14);
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
            get_store().remove_element(ORGANISATIONSCHEMEREF$14, i);
        }
    }
    
    /**
     * Gets array of all "KeyFamilyRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType[] getKeyFamilyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYREF$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType getKeyFamilyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$16, i);
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
            return get_store().count_elements(KEYFAMILYREF$16);
        }
    }
    
    /**
     * Sets array of all "KeyFamilyRef" element
     */
    public void setKeyFamilyRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType[] keyFamilyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyRefArray, KEYFAMILYREF$16);
        }
    }
    
    /**
     * Sets ith "KeyFamilyRef" element
     */
    public void setKeyFamilyRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().find_element_user(KEYFAMILYREF$16, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType insertNewKeyFamilyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().insert_element_user(KEYFAMILYREF$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType addNewKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.KeyFamilyRefType)get_store().add_element_user(KEYFAMILYREF$16);
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
            get_store().remove_element(KEYFAMILYREF$16, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructureRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType[] getMetadataStructureRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREREF$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType getMetadataStructureRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$18, i);
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
            return get_store().count_elements(METADATASTRUCTUREREF$18);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureRef" element
     */
    public void setMetadataStructureRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType[] metadataStructureRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureRefArray, METADATASTRUCTUREREF$18);
        }
    }
    
    /**
     * Sets ith "MetadataStructureRef" element
     */
    public void setMetadataStructureRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType metadataStructureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().find_element_user(METADATASTRUCTUREREF$18, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType insertNewMetadataStructureRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().insert_element_user(METADATASTRUCTUREREF$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType addNewMetadataStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.MetadataStructureRefType)get_store().add_element_user(METADATASTRUCTUREREF$18);
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
            get_store().remove_element(METADATASTRUCTUREREF$18, i);
        }
    }
    
    /**
     * Gets array of all "HierarchicalCodelistRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType[] getHierarchicalCodelistRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELISTREF$20, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType getHierarchicalCodelistRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$20, i);
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
            return get_store().count_elements(HIERARCHICALCODELISTREF$20);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCodelistRef" element
     */
    public void setHierarchicalCodelistRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType[] hierarchicalCodelistRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistRefArray, HIERARCHICALCODELISTREF$20);
        }
    }
    
    /**
     * Sets ith "HierarchicalCodelistRef" element
     */
    public void setHierarchicalCodelistRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType hierarchicalCodelistRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().find_element_user(HIERARCHICALCODELISTREF$20, i);
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
    public org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType insertNewHierarchicalCodelistRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().insert_element_user(HIERARCHICALCODELISTREF$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelistRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType addNewHierarchicalCodelistRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.HierarchicalCodelistRefType)get_store().add_element_user(HIERARCHICALCODELISTREF$20);
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
            get_store().remove_element(HIERARCHICALCODELISTREF$20, i);
        }
    }
    
    /**
     * Gets array of all "StructureSetRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType[] getStructureSetRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESETREF$22, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructureSetRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType getStructureSetRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().find_element_user(STRUCTURESETREF$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructureSetRef" element
     */
    public int sizeOfStructureSetRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESETREF$22);
        }
    }
    
    /**
     * Sets array of all "StructureSetRef" element
     */
    public void setStructureSetRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType[] structureSetRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetRefArray, STRUCTURESETREF$22);
        }
    }
    
    /**
     * Sets ith "StructureSetRef" element
     */
    public void setStructureSetRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType structureSetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().find_element_user(STRUCTURESETREF$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureSetRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSetRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType insertNewStructureSetRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().insert_element_user(STRUCTURESETREF$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSetRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType addNewStructureSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureSetRefType)get_store().add_element_user(STRUCTURESETREF$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureSetRef" element
     */
    public void removeStructureSetRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESETREF$22, i);
        }
    }
    
    /**
     * Gets array of all "ProcessRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType[] getProcessRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSREF$24, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProcessRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType getProcessRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().find_element_user(PROCESSREF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProcessRef" element
     */
    public int sizeOfProcessRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSREF$24);
        }
    }
    
    /**
     * Sets array of all "ProcessRef" element
     */
    public void setProcessRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType[] processRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processRefArray, PROCESSREF$24);
        }
    }
    
    /**
     * Sets ith "ProcessRef" element
     */
    public void setProcessRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType processRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().find_element_user(PROCESSREF$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType insertNewProcessRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().insert_element_user(PROCESSREF$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType addNewProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ProcessRefType)get_store().add_element_user(PROCESSREF$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProcessRef" element
     */
    public void removeProcessRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSREF$24, i);
        }
    }
    
    /**
     * Gets array of all "ReportingTaxonomyRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType[] getReportingTaxonomyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMYREF$26, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingTaxonomyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType getReportingTaxonomyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().find_element_user(REPORTINGTAXONOMYREF$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingTaxonomyRef" element
     */
    public int sizeOfReportingTaxonomyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMYREF$26);
        }
    }
    
    /**
     * Sets array of all "ReportingTaxonomyRef" element
     */
    public void setReportingTaxonomyRefArray(org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType[] reportingTaxonomyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyRefArray, REPORTINGTAXONOMYREF$26);
        }
    }
    
    /**
     * Sets ith "ReportingTaxonomyRef" element
     */
    public void setReportingTaxonomyRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType reportingTaxonomyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().find_element_user(REPORTINGTAXONOMYREF$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingTaxonomyRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType insertNewReportingTaxonomyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().insert_element_user(REPORTINGTAXONOMYREF$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomyRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType addNewReportingTaxonomyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.ReportingTaxonomyRefType)get_store().add_element_user(REPORTINGTAXONOMYREF$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingTaxonomyRef" element
     */
    public void removeReportingTaxonomyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMYREF$26, i);
        }
    }
    
    /**
     * Gets the "resolveReferences" attribute
     */
    public boolean getResolveReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLVEREFERENCES$28);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "resolveReferences" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetResolveReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RESOLVEREFERENCES$28);
            return target;
        }
    }
    
    /**
     * Sets the "resolveReferences" attribute
     */
    public void setResolveReferences(boolean resolveReferences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOLVEREFERENCES$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOLVEREFERENCES$28);
            }
            target.setBooleanValue(resolveReferences);
        }
    }
    
    /**
     * Sets (as xml) the "resolveReferences" attribute
     */
    public void xsetResolveReferences(org.apache.xmlbeans.XmlBoolean resolveReferences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RESOLVEREFERENCES$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RESOLVEREFERENCES$28);
            }
            target.set(resolveReferences);
        }
    }
}
