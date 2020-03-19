/*
 * XML Type:  StructuralRepositoryEventsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML StructuralRepositoryEventsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class StructuralRepositoryEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.StructuralRepositoryEventsType
{
    private static final long serialVersionUID = 1L;
    
    public StructuralRepositoryEventsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "AgencyID");
    private static final javax.xml.namespace.QName ALLEVENTSID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "AllEventsID");
    private static final javax.xml.namespace.QName KEYFAMILYID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "KeyFamilyID");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEID$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ConceptSchemeID");
    private static final javax.xml.namespace.QName CODELISTID$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CodeListID");
    private static final javax.xml.namespace.QName METADATASTRUCTUREID$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataStructureID");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEID$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "CategorySchemeID");
    private static final javax.xml.namespace.QName DATAFLOWID$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "DataflowID");
    private static final javax.xml.namespace.QName METADATAFLOWID$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "MetadataflowID");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEID$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "OrganisationSchemeID");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTID$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "HierarchicalCodelistID");
    private static final javax.xml.namespace.QName STRUCTURESETID$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructureSetID");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYID$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ReportingTaxonomyID");
    private static final javax.xml.namespace.QName PROCESSID$26 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "ProcessID");
    
    
    /**
     * Gets array of all "AgencyID" elements
     */
    public java.lang.String[] getAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyID" element
     */
    public java.lang.String getAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AgencyID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] xgetAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.IDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)target;
        }
    }
    
    /**
     * Returns number of "AgencyID" element
     */
    public int sizeOfAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYID$0);
        }
    }
    
    /**
     * Sets array of all "AgencyID" element
     */
    public void setAgencyIDArray(java.lang.String[] agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$0);
        }
    }
    
    /**
     * Sets ith "AgencyID" element
     */
    public void setAgencyIDArray(int i, java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "AgencyID" element
     */
    public void xsetAgencyIDArray(org.sdmx.resources.sdmxml.schemas.v20.common.IDType[]agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "AgencyID" element
     */
    public void xsetAgencyIDArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.IDType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Inserts the value as the ith "AgencyID" element
     */
    public void insertAgencyID(int i, java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AGENCYID$0, i);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Appends the value as the last "AgencyID" element
     */
    public void addAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCYID$0);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType insertNewAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().insert_element_user(AGENCYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType addNewAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(AGENCYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AgencyID" element
     */
    public void removeAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYID$0, i);
        }
    }
    
    /**
     * Gets array of all "AllEventsID" elements
     */
    public java.lang.String[] getAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALLEVENTSID$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AllEventsID" element
     */
    public java.lang.String getAllEventsIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLEVENTSID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AllEventsID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALLEVENTSID$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AllEventsID" element
     */
    public org.apache.xmlbeans.XmlString xgetAllEventsIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLEVENTSID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "AllEventsID" element
     */
    public int sizeOfAllEventsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLEVENTSID$2);
        }
    }
    
    /**
     * Sets array of all "AllEventsID" element
     */
    public void setAllEventsIDArray(java.lang.String[] allEventsIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(allEventsIDArray, ALLEVENTSID$2);
        }
    }
    
    /**
     * Sets ith "AllEventsID" element
     */
    public void setAllEventsIDArray(int i, java.lang.String allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLEVENTSID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(allEventsID);
        }
    }
    
    /**
     * Sets (as xml) array of all "AllEventsID" element
     */
    public void xsetAllEventsIDArray(org.apache.xmlbeans.XmlString[]allEventsIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(allEventsIDArray, ALLEVENTSID$2);
        }
    }
    
    /**
     * Sets (as xml) ith "AllEventsID" element
     */
    public void xsetAllEventsIDArray(int i, org.apache.xmlbeans.XmlString allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALLEVENTSID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(allEventsID);
        }
    }
    
    /**
     * Inserts the value as the ith "AllEventsID" element
     */
    public void insertAllEventsID(int i, java.lang.String allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ALLEVENTSID$2, i);
            target.setStringValue(allEventsID);
        }
    }
    
    /**
     * Appends the value as the last "AllEventsID" element
     */
    public void addAllEventsID(java.lang.String allEventsID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLEVENTSID$2);
            target.setStringValue(allEventsID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AllEventsID" element
     */
    public org.apache.xmlbeans.XmlString insertNewAllEventsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ALLEVENTSID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AllEventsID" element
     */
    public org.apache.xmlbeans.XmlString addNewAllEventsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALLEVENTSID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AllEventsID" element
     */
    public void removeAllEventsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLEVENTSID$2, i);
        }
    }
    
    /**
     * Gets array of all "KeyFamilyID" elements
     */
    public java.lang.String[] getKeyFamilyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYID$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamilyID" element
     */
    public java.lang.String getKeyFamilyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "KeyFamilyID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKeyFamilyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILYID$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "KeyFamilyID" element
     */
    public org.apache.xmlbeans.XmlString xgetKeyFamilyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILYID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "KeyFamilyID" element
     */
    public int sizeOfKeyFamilyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYID$4);
        }
    }
    
    /**
     * Sets array of all "KeyFamilyID" element
     */
    public void setKeyFamilyIDArray(java.lang.String[] keyFamilyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyIDArray, KEYFAMILYID$4);
        }
    }
    
    /**
     * Sets ith "KeyFamilyID" element
     */
    public void setKeyFamilyIDArray(int i, java.lang.String keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(keyFamilyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "KeyFamilyID" element
     */
    public void xsetKeyFamilyIDArray(org.apache.xmlbeans.XmlString[]keyFamilyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyIDArray, KEYFAMILYID$4);
        }
    }
    
    /**
     * Sets (as xml) ith "KeyFamilyID" element
     */
    public void xsetKeyFamilyIDArray(int i, org.apache.xmlbeans.XmlString keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILYID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamilyID);
        }
    }
    
    /**
     * Inserts the value as the ith "KeyFamilyID" element
     */
    public void insertKeyFamilyID(int i, java.lang.String keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYFAMILYID$4, i);
            target.setStringValue(keyFamilyID);
        }
    }
    
    /**
     * Appends the value as the last "KeyFamilyID" element
     */
    public void addKeyFamilyID(java.lang.String keyFamilyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILYID$4);
            target.setStringValue(keyFamilyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamilyID" element
     */
    public org.apache.xmlbeans.XmlString insertNewKeyFamilyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYFAMILYID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyID" element
     */
    public org.apache.xmlbeans.XmlString addNewKeyFamilyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYFAMILYID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamilyID" element
     */
    public void removeKeyFamilyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYID$4, i);
        }
    }
    
    /**
     * Gets array of all "ConceptSchemeID" elements
     */
    public java.lang.String[] getConceptSchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEMEID$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptSchemeID" element
     */
    public java.lang.String getConceptSchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTSCHEMEID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ConceptSchemeID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetConceptSchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEMEID$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ConceptSchemeID" element
     */
    public org.apache.xmlbeans.XmlString xgetConceptSchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTSCHEMEID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ConceptSchemeID" element
     */
    public int sizeOfConceptSchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEMEID$6);
        }
    }
    
    /**
     * Sets array of all "ConceptSchemeID" element
     */
    public void setConceptSchemeIDArray(java.lang.String[] conceptSchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeIDArray, CONCEPTSCHEMEID$6);
        }
    }
    
    /**
     * Sets ith "ConceptSchemeID" element
     */
    public void setConceptSchemeIDArray(int i, java.lang.String conceptSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTSCHEMEID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(conceptSchemeID);
        }
    }
    
    /**
     * Sets (as xml) array of all "ConceptSchemeID" element
     */
    public void xsetConceptSchemeIDArray(org.apache.xmlbeans.XmlString[]conceptSchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeIDArray, CONCEPTSCHEMEID$6);
        }
    }
    
    /**
     * Sets (as xml) ith "ConceptSchemeID" element
     */
    public void xsetConceptSchemeIDArray(int i, org.apache.xmlbeans.XmlString conceptSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTSCHEMEID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptSchemeID);
        }
    }
    
    /**
     * Inserts the value as the ith "ConceptSchemeID" element
     */
    public void insertConceptSchemeID(int i, java.lang.String conceptSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONCEPTSCHEMEID$6, i);
            target.setStringValue(conceptSchemeID);
        }
    }
    
    /**
     * Appends the value as the last "ConceptSchemeID" element
     */
    public void addConceptSchemeID(java.lang.String conceptSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPTSCHEMEID$6);
            target.setStringValue(conceptSchemeID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSchemeID" element
     */
    public org.apache.xmlbeans.XmlString insertNewConceptSchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONCEPTSCHEMEID$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeID" element
     */
    public org.apache.xmlbeans.XmlString addNewConceptSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPTSCHEMEID$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptSchemeID" element
     */
    public void removeConceptSchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEMEID$6, i);
        }
    }
    
    /**
     * Gets array of all "CodeListID" elements
     */
    public java.lang.String[] getCodeListIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELISTID$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CodeListID" element
     */
    public java.lang.String getCodeListIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODELISTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CodeListID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCodeListIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELISTID$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CodeListID" element
     */
    public org.apache.xmlbeans.XmlString xgetCodeListIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODELISTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "CodeListID" element
     */
    public int sizeOfCodeListIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTID$8);
        }
    }
    
    /**
     * Sets array of all "CodeListID" element
     */
    public void setCodeListIDArray(java.lang.String[] codeListIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeListIDArray, CODELISTID$8);
        }
    }
    
    /**
     * Sets ith "CodeListID" element
     */
    public void setCodeListIDArray(int i, java.lang.String codeListID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODELISTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(codeListID);
        }
    }
    
    /**
     * Sets (as xml) array of all "CodeListID" element
     */
    public void xsetCodeListIDArray(org.apache.xmlbeans.XmlString[]codeListIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeListIDArray, CODELISTID$8);
        }
    }
    
    /**
     * Sets (as xml) ith "CodeListID" element
     */
    public void xsetCodeListIDArray(int i, org.apache.xmlbeans.XmlString codeListID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODELISTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codeListID);
        }
    }
    
    /**
     * Inserts the value as the ith "CodeListID" element
     */
    public void insertCodeListID(int i, java.lang.String codeListID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CODELISTID$8, i);
            target.setStringValue(codeListID);
        }
    }
    
    /**
     * Appends the value as the last "CodeListID" element
     */
    public void addCodeListID(java.lang.String codeListID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODELISTID$8);
            target.setStringValue(codeListID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeListID" element
     */
    public org.apache.xmlbeans.XmlString insertNewCodeListID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CODELISTID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodeListID" element
     */
    public org.apache.xmlbeans.XmlString addNewCodeListID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODELISTID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodeListID" element
     */
    public void removeCodeListID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTID$8, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructureID" elements
     */
    public java.lang.String[] getMetadataStructureIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREID$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureID" element
     */
    public java.lang.String getMetadataStructureIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTUREID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MetadataStructureID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataStructureIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREID$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MetadataStructureID" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataStructureIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTUREID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MetadataStructureID" element
     */
    public int sizeOfMetadataStructureIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREID$10);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureID" element
     */
    public void setMetadataStructureIDArray(java.lang.String[] metadataStructureIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureIDArray, METADATASTRUCTUREID$10);
        }
    }
    
    /**
     * Sets ith "MetadataStructureID" element
     */
    public void setMetadataStructureIDArray(int i, java.lang.String metadataStructureID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTUREID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataStructureID);
        }
    }
    
    /**
     * Sets (as xml) array of all "MetadataStructureID" element
     */
    public void xsetMetadataStructureIDArray(org.apache.xmlbeans.XmlString[]metadataStructureIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureIDArray, METADATASTRUCTUREID$10);
        }
    }
    
    /**
     * Sets (as xml) ith "MetadataStructureID" element
     */
    public void xsetMetadataStructureIDArray(int i, org.apache.xmlbeans.XmlString metadataStructureID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTUREID$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructureID);
        }
    }
    
    /**
     * Inserts the value as the ith "MetadataStructureID" element
     */
    public void insertMetadataStructureID(int i, java.lang.String metadataStructureID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATASTRUCTUREID$10, i);
            target.setStringValue(metadataStructureID);
        }
    }
    
    /**
     * Appends the value as the last "MetadataStructureID" element
     */
    public void addMetadataStructureID(java.lang.String metadataStructureID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASTRUCTUREID$10);
            target.setStringValue(metadataStructureID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureID" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataStructureID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATASTRUCTUREID$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureID" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataStructureID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATASTRUCTUREID$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructureID" element
     */
    public void removeMetadataStructureID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREID$10, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeID" elements
     */
    public java.lang.String[] getCategorySchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEID$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeID" element
     */
    public java.lang.String getCategorySchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CategorySchemeID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCategorySchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEID$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CategorySchemeID" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorySchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "CategorySchemeID" element
     */
    public int sizeOfCategorySchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEID$12);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeID" element
     */
    public void setCategorySchemeIDArray(java.lang.String[] categorySchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeIDArray, CATEGORYSCHEMEID$12);
        }
    }
    
    /**
     * Sets ith "CategorySchemeID" element
     */
    public void setCategorySchemeIDArray(int i, java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Sets (as xml) array of all "CategorySchemeID" element
     */
    public void xsetCategorySchemeIDArray(org.apache.xmlbeans.XmlString[]categorySchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeIDArray, CATEGORYSCHEMEID$12);
        }
    }
    
    /**
     * Sets (as xml) ith "CategorySchemeID" element
     */
    public void xsetCategorySchemeIDArray(int i, org.apache.xmlbeans.XmlString categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorySchemeID);
        }
    }
    
    /**
     * Inserts the value as the ith "CategorySchemeID" element
     */
    public void insertCategorySchemeID(int i, java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORYSCHEMEID$12, i);
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Appends the value as the last "CategorySchemeID" element
     */
    public void addCategorySchemeID(java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYSCHEMEID$12);
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeID" element
     */
    public org.apache.xmlbeans.XmlString insertNewCategorySchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CATEGORYSCHEMEID$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeID" element
     */
    public org.apache.xmlbeans.XmlString addNewCategorySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYSCHEMEID$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorySchemeID" element
     */
    public void removeCategorySchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEID$12, i);
        }
    }
    
    /**
     * Gets array of all "DataflowID" elements
     */
    public java.lang.String[] getDataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWID$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DataflowID" element
     */
    public java.lang.String getDataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DataflowID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetDataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOWID$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DataflowID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "DataflowID" element
     */
    public int sizeOfDataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWID$14);
        }
    }
    
    /**
     * Sets array of all "DataflowID" element
     */
    public void setDataflowIDArray(java.lang.String[] dataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowIDArray, DATAFLOWID$14);
        }
    }
    
    /**
     * Sets ith "DataflowID" element
     */
    public void setDataflowIDArray(int i, java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFLOWID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Sets (as xml) array of all "DataflowID" element
     */
    public void xsetDataflowIDArray(org.apache.xmlbeans.XmlString[]dataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowIDArray, DATAFLOWID$14);
        }
    }
    
    /**
     * Sets (as xml) ith "DataflowID" element
     */
    public void xsetDataflowIDArray(int i, org.apache.xmlbeans.XmlString dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAFLOWID$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflowID);
        }
    }
    
    /**
     * Inserts the value as the ith "DataflowID" element
     */
    public void insertDataflowID(int i, java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAFLOWID$14, i);
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Appends the value as the last "DataflowID" element
     */
    public void addDataflowID(java.lang.String dataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFLOWID$14);
            target.setStringValue(dataflowID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowID" element
     */
    public org.apache.xmlbeans.XmlString insertNewDataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATAFLOWID$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowID" element
     */
    public org.apache.xmlbeans.XmlString addNewDataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAFLOWID$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataflowID" element
     */
    public void removeDataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWID$14, i);
        }
    }
    
    /**
     * Gets array of all "MetadataflowID" elements
     */
    public java.lang.String[] getMetadataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWID$16, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataflowID" element
     */
    public java.lang.String getMetadataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOWID$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MetadataflowID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWID$16, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MetadataflowID" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataflowIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOWID$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MetadataflowID" element
     */
    public int sizeOfMetadataflowIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWID$16);
        }
    }
    
    /**
     * Sets array of all "MetadataflowID" element
     */
    public void setMetadataflowIDArray(java.lang.String[] metadataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowIDArray, METADATAFLOWID$16);
        }
    }
    
    /**
     * Sets ith "MetadataflowID" element
     */
    public void setMetadataflowIDArray(int i, java.lang.String metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOWID$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataflowID);
        }
    }
    
    /**
     * Sets (as xml) array of all "MetadataflowID" element
     */
    public void xsetMetadataflowIDArray(org.apache.xmlbeans.XmlString[]metadataflowIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowIDArray, METADATAFLOWID$16);
        }
    }
    
    /**
     * Sets (as xml) ith "MetadataflowID" element
     */
    public void xsetMetadataflowIDArray(int i, org.apache.xmlbeans.XmlString metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOWID$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflowID);
        }
    }
    
    /**
     * Inserts the value as the ith "MetadataflowID" element
     */
    public void insertMetadataflowID(int i, java.lang.String metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATAFLOWID$16, i);
            target.setStringValue(metadataflowID);
        }
    }
    
    /**
     * Appends the value as the last "MetadataflowID" element
     */
    public void addMetadataflowID(java.lang.String metadataflowID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAFLOWID$16);
            target.setStringValue(metadataflowID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowID" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATAFLOWID$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowID" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataflowID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATAFLOWID$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataflowID" element
     */
    public void removeMetadataflowID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWID$16, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationSchemeID" elements
     */
    public java.lang.String[] getOrganisationSchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEMEID$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationSchemeID" element
     */
    public java.lang.String getOrganisationSchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSCHEMEID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "OrganisationSchemeID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOrganisationSchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEMEID$18, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "OrganisationSchemeID" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganisationSchemeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANISATIONSCHEMEID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "OrganisationSchemeID" element
     */
    public int sizeOfOrganisationSchemeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEID$18);
        }
    }
    
    /**
     * Sets array of all "OrganisationSchemeID" element
     */
    public void setOrganisationSchemeIDArray(java.lang.String[] organisationSchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeIDArray, ORGANISATIONSCHEMEID$18);
        }
    }
    
    /**
     * Sets ith "OrganisationSchemeID" element
     */
    public void setOrganisationSchemeIDArray(int i, java.lang.String organisationSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONSCHEMEID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(organisationSchemeID);
        }
    }
    
    /**
     * Sets (as xml) array of all "OrganisationSchemeID" element
     */
    public void xsetOrganisationSchemeIDArray(org.apache.xmlbeans.XmlString[]organisationSchemeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeIDArray, ORGANISATIONSCHEMEID$18);
        }
    }
    
    /**
     * Sets (as xml) ith "OrganisationSchemeID" element
     */
    public void xsetOrganisationSchemeIDArray(int i, org.apache.xmlbeans.XmlString organisationSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANISATIONSCHEMEID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationSchemeID);
        }
    }
    
    /**
     * Inserts the value as the ith "OrganisationSchemeID" element
     */
    public void insertOrganisationSchemeID(int i, java.lang.String organisationSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ORGANISATIONSCHEMEID$18, i);
            target.setStringValue(organisationSchemeID);
        }
    }
    
    /**
     * Appends the value as the last "OrganisationSchemeID" element
     */
    public void addOrganisationSchemeID(java.lang.String organisationSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONSCHEMEID$18);
            target.setStringValue(organisationSchemeID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationSchemeID" element
     */
    public org.apache.xmlbeans.XmlString insertNewOrganisationSchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ORGANISATIONSCHEMEID$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeID" element
     */
    public org.apache.xmlbeans.XmlString addNewOrganisationSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANISATIONSCHEMEID$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationSchemeID" element
     */
    public void removeOrganisationSchemeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEID$18, i);
        }
    }
    
    /**
     * Gets array of all "HierarchicalCodelistID" elements
     */
    public java.lang.String[] getHierarchicalCodelistIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELISTID$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCodelistID" element
     */
    public java.lang.String getHierarchicalCodelistIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHICALCODELISTID$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "HierarchicalCodelistID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetHierarchicalCodelistIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELISTID$20, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "HierarchicalCodelistID" element
     */
    public org.apache.xmlbeans.XmlString xgetHierarchicalCodelistIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHICALCODELISTID$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCodelistID" element
     */
    public int sizeOfHierarchicalCodelistIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELISTID$20);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCodelistID" element
     */
    public void setHierarchicalCodelistIDArray(java.lang.String[] hierarchicalCodelistIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistIDArray, HIERARCHICALCODELISTID$20);
        }
    }
    
    /**
     * Sets ith "HierarchicalCodelistID" element
     */
    public void setHierarchicalCodelistIDArray(int i, java.lang.String hierarchicalCodelistID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIERARCHICALCODELISTID$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(hierarchicalCodelistID);
        }
    }
    
    /**
     * Sets (as xml) array of all "HierarchicalCodelistID" element
     */
    public void xsetHierarchicalCodelistIDArray(org.apache.xmlbeans.XmlString[]hierarchicalCodelistIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistIDArray, HIERARCHICALCODELISTID$20);
        }
    }
    
    /**
     * Sets (as xml) ith "HierarchicalCodelistID" element
     */
    public void xsetHierarchicalCodelistIDArray(int i, org.apache.xmlbeans.XmlString hierarchicalCodelistID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIERARCHICALCODELISTID$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCodelistID);
        }
    }
    
    /**
     * Inserts the value as the ith "HierarchicalCodelistID" element
     */
    public void insertHierarchicalCodelistID(int i, java.lang.String hierarchicalCodelistID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HIERARCHICALCODELISTID$20, i);
            target.setStringValue(hierarchicalCodelistID);
        }
    }
    
    /**
     * Appends the value as the last "HierarchicalCodelistID" element
     */
    public void addHierarchicalCodelistID(java.lang.String hierarchicalCodelistID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIERARCHICALCODELISTID$20);
            target.setStringValue(hierarchicalCodelistID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelistID" element
     */
    public org.apache.xmlbeans.XmlString insertNewHierarchicalCodelistID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(HIERARCHICALCODELISTID$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelistID" element
     */
    public org.apache.xmlbeans.XmlString addNewHierarchicalCodelistID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIERARCHICALCODELISTID$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCodelistID" element
     */
    public void removeHierarchicalCodelistID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELISTID$20, i);
        }
    }
    
    /**
     * Gets array of all "StructureSetID" elements
     */
    public java.lang.String[] getStructureSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESETID$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "StructureSetID" element
     */
    public java.lang.String getStructureSetIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURESETID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "StructureSetID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStructureSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESETID$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "StructureSetID" element
     */
    public org.apache.xmlbeans.XmlString xgetStructureSetIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUCTURESETID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "StructureSetID" element
     */
    public int sizeOfStructureSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESETID$22);
        }
    }
    
    /**
     * Sets array of all "StructureSetID" element
     */
    public void setStructureSetIDArray(java.lang.String[] structureSetIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetIDArray, STRUCTURESETID$22);
        }
    }
    
    /**
     * Sets ith "StructureSetID" element
     */
    public void setStructureSetIDArray(int i, java.lang.String structureSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURESETID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(structureSetID);
        }
    }
    
    /**
     * Sets (as xml) array of all "StructureSetID" element
     */
    public void xsetStructureSetIDArray(org.apache.xmlbeans.XmlString[]structureSetIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetIDArray, STRUCTURESETID$22);
        }
    }
    
    /**
     * Sets (as xml) ith "StructureSetID" element
     */
    public void xsetStructureSetIDArray(int i, org.apache.xmlbeans.XmlString structureSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUCTURESETID$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureSetID);
        }
    }
    
    /**
     * Inserts the value as the ith "StructureSetID" element
     */
    public void insertStructureSetID(int i, java.lang.String structureSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRUCTURESETID$22, i);
            target.setStringValue(structureSetID);
        }
    }
    
    /**
     * Appends the value as the last "StructureSetID" element
     */
    public void addStructureSetID(java.lang.String structureSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUCTURESETID$22);
            target.setStringValue(structureSetID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSetID" element
     */
    public org.apache.xmlbeans.XmlString insertNewStructureSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRUCTURESETID$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSetID" element
     */
    public org.apache.xmlbeans.XmlString addNewStructureSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRUCTURESETID$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureSetID" element
     */
    public void removeStructureSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESETID$22, i);
        }
    }
    
    /**
     * Gets array of all "ReportingTaxonomyID" elements
     */
    public java.lang.String[] getReportingTaxonomyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMYID$24, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingTaxonomyID" element
     */
    public java.lang.String getReportingTaxonomyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGTAXONOMYID$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ReportingTaxonomyID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetReportingTaxonomyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMYID$24, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ReportingTaxonomyID" element
     */
    public org.apache.xmlbeans.XmlString xgetReportingTaxonomyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTINGTAXONOMYID$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ReportingTaxonomyID" element
     */
    public int sizeOfReportingTaxonomyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMYID$24);
        }
    }
    
    /**
     * Sets array of all "ReportingTaxonomyID" element
     */
    public void setReportingTaxonomyIDArray(java.lang.String[] reportingTaxonomyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyIDArray, REPORTINGTAXONOMYID$24);
        }
    }
    
    /**
     * Sets ith "ReportingTaxonomyID" element
     */
    public void setReportingTaxonomyIDArray(int i, java.lang.String reportingTaxonomyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGTAXONOMYID$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(reportingTaxonomyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "ReportingTaxonomyID" element
     */
    public void xsetReportingTaxonomyIDArray(org.apache.xmlbeans.XmlString[]reportingTaxonomyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyIDArray, REPORTINGTAXONOMYID$24);
        }
    }
    
    /**
     * Sets (as xml) ith "ReportingTaxonomyID" element
     */
    public void xsetReportingTaxonomyIDArray(int i, org.apache.xmlbeans.XmlString reportingTaxonomyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPORTINGTAXONOMYID$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingTaxonomyID);
        }
    }
    
    /**
     * Inserts the value as the ith "ReportingTaxonomyID" element
     */
    public void insertReportingTaxonomyID(int i, java.lang.String reportingTaxonomyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REPORTINGTAXONOMYID$24, i);
            target.setStringValue(reportingTaxonomyID);
        }
    }
    
    /**
     * Appends the value as the last "ReportingTaxonomyID" element
     */
    public void addReportingTaxonomyID(java.lang.String reportingTaxonomyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGTAXONOMYID$24);
            target.setStringValue(reportingTaxonomyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomyID" element
     */
    public org.apache.xmlbeans.XmlString insertNewReportingTaxonomyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REPORTINGTAXONOMYID$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomyID" element
     */
    public org.apache.xmlbeans.XmlString addNewReportingTaxonomyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPORTINGTAXONOMYID$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingTaxonomyID" element
     */
    public void removeReportingTaxonomyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMYID$24, i);
        }
    }
    
    /**
     * Gets array of all "ProcessID" elements
     */
    public java.lang.String[] getProcessIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSID$26, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "ProcessID" element
     */
    public java.lang.String getProcessIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "ProcessID" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetProcessIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSID$26, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "ProcessID" element
     */
    public org.apache.xmlbeans.XmlString xgetProcessIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "ProcessID" element
     */
    public int sizeOfProcessIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSID$26);
        }
    }
    
    /**
     * Sets array of all "ProcessID" element
     */
    public void setProcessIDArray(java.lang.String[] processIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processIDArray, PROCESSID$26);
        }
    }
    
    /**
     * Sets ith "ProcessID" element
     */
    public void setProcessIDArray(int i, java.lang.String processID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(processID);
        }
    }
    
    /**
     * Sets (as xml) array of all "ProcessID" element
     */
    public void xsetProcessIDArray(org.apache.xmlbeans.XmlString[]processIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processIDArray, PROCESSID$26);
        }
    }
    
    /**
     * Sets (as xml) ith "ProcessID" element
     */
    public void xsetProcessIDArray(int i, org.apache.xmlbeans.XmlString processID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSID$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processID);
        }
    }
    
    /**
     * Inserts the value as the ith "ProcessID" element
     */
    public void insertProcessID(int i, java.lang.String processID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROCESSID$26, i);
            target.setStringValue(processID);
        }
    }
    
    /**
     * Appends the value as the last "ProcessID" element
     */
    public void addProcessID(java.lang.String processID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSID$26);
            target.setStringValue(processID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessID" element
     */
    public org.apache.xmlbeans.XmlString insertNewProcessID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROCESSID$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessID" element
     */
    public org.apache.xmlbeans.XmlString addNewProcessID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESSID$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProcessID" element
     */
    public void removeProcessID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSID$26, i);
        }
    }
}
