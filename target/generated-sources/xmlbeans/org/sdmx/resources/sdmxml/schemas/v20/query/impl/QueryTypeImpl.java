/*
 * XML Type:  QueryType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.QueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML QueryType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public class QueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.query.QueryType
{
    private static final long serialVersionUID = 1L;
    
    public QueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAWHERE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "DataWhere");
    private static final javax.xml.namespace.QName METADATAWHERE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataWhere");
    private static final javax.xml.namespace.QName KEYFAMILYWHERE$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "KeyFamilyWhere");
    private static final javax.xml.namespace.QName METADATASTRUCTUREWHERE$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataStructureWhere");
    private static final javax.xml.namespace.QName CODELISTWHERE$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "CodelistWhere");
    private static final javax.xml.namespace.QName CONCEPTWHERE$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "ConceptWhere");
    private static final javax.xml.namespace.QName AGENCYWHERE$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "AgencyWhere");
    private static final javax.xml.namespace.QName DATAPROVIDERWHERE$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "DataProviderWhere");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTWHERE$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "HierarchicalCodelistWhere");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYWHERE$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "ReportingTaxonomyWhere");
    private static final javax.xml.namespace.QName DATAFLOWWHERE$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "DataflowWhere");
    private static final javax.xml.namespace.QName METADATAFLOWWHERE$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataflowWhere");
    private static final javax.xml.namespace.QName STRUCTURESETWHERE$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StructureSetWhere");
    private static final javax.xml.namespace.QName PROCESSWHERE$26 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "ProcessWhere");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEWHERE$28 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "OrganisationSchemeWhere");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEWHERE$30 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "ConceptSchemeWhere");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEWHERE$32 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "CategorySchemeWhere");
    private static final javax.xml.namespace.QName DEFAULTLIMIT$34 = 
        new javax.xml.namespace.QName("", "defaultLimit");
    
    
    /**
     * Gets array of all "DataWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType[] getDataWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType getDataWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType)get_store().find_element_user(DATAWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataWhere" element
     */
    public int sizeOfDataWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAWHERE$0);
        }
    }
    
    /**
     * Sets array of all "DataWhere" element
     */
    public void setDataWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType[] dataWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataWhereArray, DATAWHERE$0);
        }
    }
    
    /**
     * Sets ith "DataWhere" element
     */
    public void setDataWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType dataWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType)get_store().find_element_user(DATAWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType insertNewDataWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType)get_store().insert_element_user(DATAWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType addNewDataWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataWhereType)get_store().add_element_user(DATAWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataWhere" element
     */
    public void removeDataWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAWHERE$0, i);
        }
    }
    
    /**
     * Gets array of all "MetadataWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType[] getMetadataWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAWHERE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType getMetadataWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType)get_store().find_element_user(METADATAWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataWhere" element
     */
    public int sizeOfMetadataWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAWHERE$2);
        }
    }
    
    /**
     * Sets array of all "MetadataWhere" element
     */
    public void setMetadataWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType[] metadataWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataWhereArray, METADATAWHERE$2);
        }
    }
    
    /**
     * Sets ith "MetadataWhere" element
     */
    public void setMetadataWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType metadataWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType)get_store().find_element_user(METADATAWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType insertNewMetadataWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType)get_store().insert_element_user(METADATAWHERE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType addNewMetadataWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType)get_store().add_element_user(METADATAWHERE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataWhere" element
     */
    public void removeMetadataWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAWHERE$2, i);
        }
    }
    
    /**
     * Gets array of all "KeyFamilyWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType[] getKeyFamilyWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYWHERE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamilyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType getKeyFamilyWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType)get_store().find_element_user(KEYFAMILYWHERE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyFamilyWhere" element
     */
    public int sizeOfKeyFamilyWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYWHERE$4);
        }
    }
    
    /**
     * Sets array of all "KeyFamilyWhere" element
     */
    public void setKeyFamilyWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType[] keyFamilyWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyWhereArray, KEYFAMILYWHERE$4);
        }
    }
    
    /**
     * Sets ith "KeyFamilyWhere" element
     */
    public void setKeyFamilyWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType keyFamilyWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType)get_store().find_element_user(KEYFAMILYWHERE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamilyWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamilyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType insertNewKeyFamilyWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType)get_store().insert_element_user(KEYFAMILYWHERE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType addNewKeyFamilyWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.KeyFamilyWhereType)get_store().add_element_user(KEYFAMILYWHERE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamilyWhere" element
     */
    public void removeKeyFamilyWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYWHERE$4, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructureWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType[] getMetadataStructureWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREWHERE$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType getMetadataStructureWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType)get_store().find_element_user(METADATASTRUCTUREWHERE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructureWhere" element
     */
    public int sizeOfMetadataStructureWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREWHERE$6);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureWhere" element
     */
    public void setMetadataStructureWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType[] metadataStructureWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureWhereArray, METADATASTRUCTUREWHERE$6);
        }
    }
    
    /**
     * Sets ith "MetadataStructureWhere" element
     */
    public void setMetadataStructureWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType metadataStructureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType)get_store().find_element_user(METADATASTRUCTUREWHERE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructureWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType insertNewMetadataStructureWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType)get_store().insert_element_user(METADATASTRUCTUREWHERE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType addNewMetadataStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType)get_store().add_element_user(METADATASTRUCTUREWHERE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructureWhere" element
     */
    public void removeMetadataStructureWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREWHERE$6, i);
        }
    }
    
    /**
     * Gets array of all "CodelistWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType[] getCodelistWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELISTWHERE$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType getCodelistWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType)get_store().find_element_user(CODELISTWHERE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodelistWhere" element
     */
    public int sizeOfCodelistWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTWHERE$8);
        }
    }
    
    /**
     * Sets array of all "CodelistWhere" element
     */
    public void setCodelistWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType[] codelistWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistWhereArray, CODELISTWHERE$8);
        }
    }
    
    /**
     * Sets ith "CodelistWhere" element
     */
    public void setCodelistWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType codelistWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType)get_store().find_element_user(CODELISTWHERE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelistWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType insertNewCodelistWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType)get_store().insert_element_user(CODELISTWHERE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType addNewCodelistWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistWhereType)get_store().add_element_user(CODELISTWHERE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodelistWhere" element
     */
    public void removeCodelistWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTWHERE$8, i);
        }
    }
    
    /**
     * Gets array of all "ConceptWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType[] getConceptWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTWHERE$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType getConceptWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType)get_store().find_element_user(CONCEPTWHERE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptWhere" element
     */
    public int sizeOfConceptWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTWHERE$10);
        }
    }
    
    /**
     * Sets array of all "ConceptWhere" element
     */
    public void setConceptWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType[] conceptWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptWhereArray, CONCEPTWHERE$10);
        }
    }
    
    /**
     * Sets ith "ConceptWhere" element
     */
    public void setConceptWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType conceptWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType)get_store().find_element_user(CONCEPTWHERE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType insertNewConceptWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType)get_store().insert_element_user(CONCEPTWHERE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType addNewConceptWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptWhereType)get_store().add_element_user(CONCEPTWHERE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptWhere" element
     */
    public void removeConceptWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTWHERE$10, i);
        }
    }
    
    /**
     * Gets array of all "AgencyWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType[] getAgencyWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYWHERE$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType getAgencyWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType)get_store().find_element_user(AGENCYWHERE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AgencyWhere" element
     */
    public int sizeOfAgencyWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYWHERE$12);
        }
    }
    
    /**
     * Sets array of all "AgencyWhere" element
     */
    public void setAgencyWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType[] agencyWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyWhereArray, AGENCYWHERE$12);
        }
    }
    
    /**
     * Sets ith "AgencyWhere" element
     */
    public void setAgencyWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType agencyWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType)get_store().find_element_user(AGENCYWHERE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType insertNewAgencyWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType)get_store().insert_element_user(AGENCYWHERE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType addNewAgencyWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType)get_store().add_element_user(AGENCYWHERE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "AgencyWhere" element
     */
    public void removeAgencyWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYWHERE$12, i);
        }
    }
    
    /**
     * Gets array of all "DataProviderWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType[] getDataProviderWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERWHERE$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProviderWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType getDataProviderWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType)get_store().find_element_user(DATAPROVIDERWHERE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataProviderWhere" element
     */
    public int sizeOfDataProviderWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERWHERE$14);
        }
    }
    
    /**
     * Sets array of all "DataProviderWhere" element
     */
    public void setDataProviderWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType[] dataProviderWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderWhereArray, DATAPROVIDERWHERE$14);
        }
    }
    
    /**
     * Sets ith "DataProviderWhere" element
     */
    public void setDataProviderWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType dataProviderWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType)get_store().find_element_user(DATAPROVIDERWHERE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProviderWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType insertNewDataProviderWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType)get_store().insert_element_user(DATAPROVIDERWHERE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType addNewDataProviderWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataProviderWhereType)get_store().add_element_user(DATAPROVIDERWHERE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProviderWhere" element
     */
    public void removeDataProviderWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERWHERE$14, i);
        }
    }
    
    /**
     * Gets array of all "HierarchicalCodelistWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType[] getHierarchicalCodelistWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELISTWHERE$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType getHierarchicalCodelistWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType)get_store().find_element_user(HIERARCHICALCODELISTWHERE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCodelistWhere" element
     */
    public int sizeOfHierarchicalCodelistWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELISTWHERE$16);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCodelistWhere" element
     */
    public void setHierarchicalCodelistWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType[] hierarchicalCodelistWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistWhereArray, HIERARCHICALCODELISTWHERE$16);
        }
    }
    
    /**
     * Sets ith "HierarchicalCodelistWhere" element
     */
    public void setHierarchicalCodelistWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType hierarchicalCodelistWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType)get_store().find_element_user(HIERARCHICALCODELISTWHERE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCodelistWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType insertNewHierarchicalCodelistWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType)get_store().insert_element_user(HIERARCHICALCODELISTWHERE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType addNewHierarchicalCodelistWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.HierarchicalCodelistWhereType)get_store().add_element_user(HIERARCHICALCODELISTWHERE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCodelistWhere" element
     */
    public void removeHierarchicalCodelistWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELISTWHERE$16, i);
        }
    }
    
    /**
     * Gets array of all "ReportingTaxonomyWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType[] getReportingTaxonomyWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMYWHERE$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingTaxonomyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType getReportingTaxonomyWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType)get_store().find_element_user(REPORTINGTAXONOMYWHERE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingTaxonomyWhere" element
     */
    public int sizeOfReportingTaxonomyWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMYWHERE$18);
        }
    }
    
    /**
     * Sets array of all "ReportingTaxonomyWhere" element
     */
    public void setReportingTaxonomyWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType[] reportingTaxonomyWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyWhereArray, REPORTINGTAXONOMYWHERE$18);
        }
    }
    
    /**
     * Sets ith "ReportingTaxonomyWhere" element
     */
    public void setReportingTaxonomyWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType reportingTaxonomyWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType)get_store().find_element_user(REPORTINGTAXONOMYWHERE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingTaxonomyWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType insertNewReportingTaxonomyWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType)get_store().insert_element_user(REPORTINGTAXONOMYWHERE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType addNewReportingTaxonomyWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ReportingTaxonomyWhereType)get_store().add_element_user(REPORTINGTAXONOMYWHERE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingTaxonomyWhere" element
     */
    public void removeReportingTaxonomyWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMYWHERE$18, i);
        }
    }
    
    /**
     * Gets array of all "DataflowWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType[] getDataflowWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWWHERE$20, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType getDataflowWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType)get_store().find_element_user(DATAFLOWWHERE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataflowWhere" element
     */
    public int sizeOfDataflowWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWWHERE$20);
        }
    }
    
    /**
     * Sets array of all "DataflowWhere" element
     */
    public void setDataflowWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType[] dataflowWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowWhereArray, DATAFLOWWHERE$20);
        }
    }
    
    /**
     * Sets ith "DataflowWhere" element
     */
    public void setDataflowWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType dataflowWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType)get_store().find_element_user(DATAFLOWWHERE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflowWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType insertNewDataflowWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType)get_store().insert_element_user(DATAFLOWWHERE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType addNewDataflowWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DataflowWhereType)get_store().add_element_user(DATAFLOWWHERE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataflowWhere" element
     */
    public void removeDataflowWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWWHERE$20, i);
        }
    }
    
    /**
     * Gets array of all "MetadataflowWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType[] getMetadataflowWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWWHERE$22, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType getMetadataflowWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType)get_store().find_element_user(METADATAFLOWWHERE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataflowWhere" element
     */
    public int sizeOfMetadataflowWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWWHERE$22);
        }
    }
    
    /**
     * Sets array of all "MetadataflowWhere" element
     */
    public void setMetadataflowWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType[] metadataflowWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowWhereArray, METADATAFLOWWHERE$22);
        }
    }
    
    /**
     * Sets ith "MetadataflowWhere" element
     */
    public void setMetadataflowWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType metadataflowWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType)get_store().find_element_user(METADATAFLOWWHERE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflowWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType insertNewMetadataflowWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType)get_store().insert_element_user(METADATAFLOWWHERE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType addNewMetadataflowWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.MetadataflowWhereType)get_store().add_element_user(METADATAFLOWWHERE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataflowWhere" element
     */
    public void removeMetadataflowWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWWHERE$22, i);
        }
    }
    
    /**
     * Gets array of all "StructureSetWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType[] getStructureSetWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESETWHERE$24, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructureSetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType getStructureSetWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType)get_store().find_element_user(STRUCTURESETWHERE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructureSetWhere" element
     */
    public int sizeOfStructureSetWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESETWHERE$24);
        }
    }
    
    /**
     * Sets array of all "StructureSetWhere" element
     */
    public void setStructureSetWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType[] structureSetWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetWhereArray, STRUCTURESETWHERE$24);
        }
    }
    
    /**
     * Sets ith "StructureSetWhere" element
     */
    public void setStructureSetWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType structureSetWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType)get_store().find_element_user(STRUCTURESETWHERE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureSetWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType insertNewStructureSetWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType)get_store().insert_element_user(STRUCTURESETWHERE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType addNewStructureSetWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureSetWhereType)get_store().add_element_user(STRUCTURESETWHERE$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureSetWhere" element
     */
    public void removeStructureSetWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESETWHERE$24, i);
        }
    }
    
    /**
     * Gets array of all "ProcessWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType[] getProcessWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSWHERE$26, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProcessWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType getProcessWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType)get_store().find_element_user(PROCESSWHERE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProcessWhere" element
     */
    public int sizeOfProcessWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSWHERE$26);
        }
    }
    
    /**
     * Sets array of all "ProcessWhere" element
     */
    public void setProcessWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType[] processWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processWhereArray, PROCESSWHERE$26);
        }
    }
    
    /**
     * Sets ith "ProcessWhere" element
     */
    public void setProcessWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType processWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType)get_store().find_element_user(PROCESSWHERE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType insertNewProcessWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType)get_store().insert_element_user(PROCESSWHERE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType addNewProcessWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ProcessWhereType)get_store().add_element_user(PROCESSWHERE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProcessWhere" element
     */
    public void removeProcessWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSWHERE$26, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationSchemeWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType[] getOrganisationSchemeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEMEWHERE$28, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType getOrganisationSchemeWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType)get_store().find_element_user(ORGANISATIONSCHEMEWHERE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationSchemeWhere" element
     */
    public int sizeOfOrganisationSchemeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEWHERE$28);
        }
    }
    
    /**
     * Sets array of all "OrganisationSchemeWhere" element
     */
    public void setOrganisationSchemeWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType[] organisationSchemeWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeWhereArray, ORGANISATIONSCHEMEWHERE$28);
        }
    }
    
    /**
     * Sets ith "OrganisationSchemeWhere" element
     */
    public void setOrganisationSchemeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType organisationSchemeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType)get_store().find_element_user(ORGANISATIONSCHEMEWHERE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationSchemeWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType insertNewOrganisationSchemeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType)get_store().insert_element_user(ORGANISATIONSCHEMEWHERE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType addNewOrganisationSchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrganisationSchemeWhereType)get_store().add_element_user(ORGANISATIONSCHEMEWHERE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationSchemeWhere" element
     */
    public void removeOrganisationSchemeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEWHERE$28, i);
        }
    }
    
    /**
     * Gets array of all "ConceptSchemeWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType[] getConceptSchemeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEMEWHERE$30, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType getConceptSchemeWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType)get_store().find_element_user(CONCEPTSCHEMEWHERE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptSchemeWhere" element
     */
    public int sizeOfConceptSchemeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEMEWHERE$30);
        }
    }
    
    /**
     * Sets array of all "ConceptSchemeWhere" element
     */
    public void setConceptSchemeWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType[] conceptSchemeWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeWhereArray, CONCEPTSCHEMEWHERE$30);
        }
    }
    
    /**
     * Sets ith "ConceptSchemeWhere" element
     */
    public void setConceptSchemeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType conceptSchemeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType)get_store().find_element_user(CONCEPTSCHEMEWHERE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptSchemeWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType insertNewConceptSchemeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType)get_store().insert_element_user(CONCEPTSCHEMEWHERE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType addNewConceptSchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.ConceptSchemeWhereType)get_store().add_element_user(CONCEPTSCHEMEWHERE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptSchemeWhere" element
     */
    public void removeConceptSchemeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEMEWHERE$30, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType[] getCategorySchemeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEWHERE$32, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType getCategorySchemeWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType)get_store().find_element_user(CATEGORYSCHEMEWHERE$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategorySchemeWhere" element
     */
    public int sizeOfCategorySchemeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEWHERE$32);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeWhere" element
     */
    public void setCategorySchemeWhereArray(org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType[] categorySchemeWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeWhereArray, CATEGORYSCHEMEWHERE$32);
        }
    }
    
    /**
     * Sets ith "CategorySchemeWhere" element
     */
    public void setCategorySchemeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType categorySchemeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType)get_store().find_element_user(CATEGORYSCHEMEWHERE$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorySchemeWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType insertNewCategorySchemeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType)get_store().insert_element_user(CATEGORYSCHEMEWHERE$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType addNewCategorySchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategorySchemeWhereType)get_store().add_element_user(CATEGORYSCHEMEWHERE$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorySchemeWhere" element
     */
    public void removeCategorySchemeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEWHERE$32, i);
        }
    }
    
    /**
     * Gets the "defaultLimit" attribute
     */
    public java.math.BigInteger getDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTLIMIT$34);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultLimit" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DEFAULTLIMIT$34);
            return target;
        }
    }
    
    /**
     * True if has "defaultLimit" attribute
     */
    public boolean isSetDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTLIMIT$34) != null;
        }
    }
    
    /**
     * Sets the "defaultLimit" attribute
     */
    public void setDefaultLimit(java.math.BigInteger defaultLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTLIMIT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTLIMIT$34);
            }
            target.setBigIntegerValue(defaultLimit);
        }
    }
    
    /**
     * Sets (as xml) the "defaultLimit" attribute
     */
    public void xsetDefaultLimit(org.apache.xmlbeans.XmlInteger defaultLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DEFAULTLIMIT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DEFAULTLIMIT$34);
            }
            target.set(defaultLimit);
        }
    }
    
    /**
     * Unsets the "defaultLimit" attribute
     */
    public void unsetDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTLIMIT$34);
        }
    }
}
