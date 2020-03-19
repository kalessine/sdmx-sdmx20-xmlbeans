/*
 * XML Type:  AgencyWhereType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML AgencyWhereType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public class AgencyWhereTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.query.AgencyWhereType
{
    private static final long serialVersionUID = 1L;
    
    public AgencyWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFAMILY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "KeyFamily");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataStructure");
    private static final javax.xml.namespace.QName STRUCTURESET$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StructureSet");
    private static final javax.xml.namespace.QName CODELIST$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Codelist");
    private static final javax.xml.namespace.QName CATEGORY$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Category");
    private static final javax.xml.namespace.QName CONCEPT$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Concept");
    private static final javax.xml.namespace.QName AGENCYID$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "AgencyID");
    private static final javax.xml.namespace.QName OR$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Or");
    private static final javax.xml.namespace.QName AND$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "And");
    
    
    /**
     * Gets array of all "KeyFamily" elements
     */
    public java.lang.String[] getKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILY$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamily" element
     */
    public java.lang.String getKeyFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "KeyFamily" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILY$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString xgetKeyFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "KeyFamily" element
     */
    public int sizeOfKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILY$0);
        }
    }
    
    /**
     * Sets array of all "KeyFamily" element
     */
    public void setKeyFamilyArray(java.lang.String[] keyFamilyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyArray, KEYFAMILY$0);
        }
    }
    
    /**
     * Sets ith "KeyFamily" element
     */
    public void setKeyFamilyArray(int i, java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Sets (as xml) array of all "KeyFamily" element
     */
    public void xsetKeyFamilyArray(org.apache.xmlbeans.XmlString[]keyFamilyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyArray, KEYFAMILY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "KeyFamily" element
     */
    public void xsetKeyFamilyArray(int i, org.apache.xmlbeans.XmlString keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamily);
        }
    }
    
    /**
     * Inserts the value as the ith "KeyFamily" element
     */
    public void insertKeyFamily(int i, java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYFAMILY$0, i);
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Appends the value as the last "KeyFamily" element
     */
    public void addKeyFamily(java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILY$0);
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString insertNewKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYFAMILY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString addNewKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYFAMILY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamily" element
     */
    public void removeKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILY$0, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    public java.lang.String[] getMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructure" element
     */
    public java.lang.String getMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "MetadataStructure" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "MetadataStructure" element
     */
    public int sizeOfMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$2);
        }
    }
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    public void setMetadataStructureArray(java.lang.String[] metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$2);
        }
    }
    
    /**
     * Sets ith "MetadataStructure" element
     */
    public void setMetadataStructureArray(int i, java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Sets (as xml) array of all "MetadataStructure" element
     */
    public void xsetMetadataStructureArray(org.apache.xmlbeans.XmlString[]metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "MetadataStructure" element
     */
    public void xsetMetadataStructureArray(int i, org.apache.xmlbeans.XmlString metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Inserts the value as the ith "MetadataStructure" element
     */
    public void insertMetadataStructure(int i, java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(METADATASTRUCTURE$2, i);
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Appends the value as the last "MetadataStructure" element
     */
    public void addMetadataStructure(java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASTRUCTURE$2);
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString insertNewMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(METADATASTRUCTURE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATASTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    public void removeMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$2, i);
        }
    }
    
    /**
     * Gets array of all "StructureSet" elements
     */
    public java.lang.String[] getStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESET$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "StructureSet" element
     */
    public java.lang.String getStructureSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURESET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "StructureSet" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESET$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "StructureSet" element
     */
    public org.apache.xmlbeans.XmlString xgetStructureSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUCTURESET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "StructureSet" element
     */
    public int sizeOfStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESET$4);
        }
    }
    
    /**
     * Sets array of all "StructureSet" element
     */
    public void setStructureSetArray(java.lang.String[] structureSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetArray, STRUCTURESET$4);
        }
    }
    
    /**
     * Sets ith "StructureSet" element
     */
    public void setStructureSetArray(int i, java.lang.String structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURESET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(structureSet);
        }
    }
    
    /**
     * Sets (as xml) array of all "StructureSet" element
     */
    public void xsetStructureSetArray(org.apache.xmlbeans.XmlString[]structureSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetArray, STRUCTURESET$4);
        }
    }
    
    /**
     * Sets (as xml) ith "StructureSet" element
     */
    public void xsetStructureSetArray(int i, org.apache.xmlbeans.XmlString structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUCTURESET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureSet);
        }
    }
    
    /**
     * Inserts the value as the ith "StructureSet" element
     */
    public void insertStructureSet(int i, java.lang.String structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRUCTURESET$4, i);
            target.setStringValue(structureSet);
        }
    }
    
    /**
     * Appends the value as the last "StructureSet" element
     */
    public void addStructureSet(java.lang.String structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUCTURESET$4);
            target.setStringValue(structureSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSet" element
     */
    public org.apache.xmlbeans.XmlString insertNewStructureSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRUCTURESET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSet" element
     */
    public org.apache.xmlbeans.XmlString addNewStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRUCTURESET$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureSet" element
     */
    public void removeStructureSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESET$4, i);
        }
    }
    
    /**
     * Gets array of all "Codelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[] getCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELIST$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType getCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Codelist" element
     */
    public int sizeOfCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$6);
        }
    }
    
    /**
     * Sets array of all "Codelist" element
     */
    public void setCodelistArray(org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType[] codelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistArray, CODELIST$6);
        }
    }
    
    /**
     * Sets ith "Codelist" element
     */
    public void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType insertNewCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().insert_element_user(CODELIST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType addNewCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().add_element_user(CODELIST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Codelist" element
     */
    public void removeCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$6, i);
        }
    }
    
    /**
     * Gets array of all "Category" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$8);
        }
    }
    
    /**
     * Sets array of all "Category" element
     */
    public void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$8);
        }
    }
    
    /**
     * Sets ith "Category" element
     */
    public void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().insert_element_user(CATEGORY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().add_element_user(CATEGORY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$8, i);
        }
    }
    
    /**
     * Gets array of all "Concept" elements
     */
    public java.lang.String[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Concept" element
     */
    public java.lang.String getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Concept" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Concept" element
     */
    public org.apache.xmlbeans.XmlString xgetConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$10);
        }
    }
    
    /**
     * Sets array of all "Concept" element
     */
    public void setConceptArray(java.lang.String[] conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$10);
        }
    }
    
    /**
     * Sets ith "Concept" element
     */
    public void setConceptArray(int i, java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(concept);
        }
    }
    
    /**
     * Sets (as xml) array of all "Concept" element
     */
    public void xsetConceptArray(org.apache.xmlbeans.XmlString[]conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$10);
        }
    }
    
    /**
     * Sets (as xml) ith "Concept" element
     */
    public void xsetConceptArray(int i, org.apache.xmlbeans.XmlString concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts the value as the ith "Concept" element
     */
    public void insertConcept(int i, java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONCEPT$10, i);
            target.setStringValue(concept);
        }
    }
    
    /**
     * Appends the value as the last "Concept" element
     */
    public void addConcept(java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPT$10);
            target.setStringValue(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    public org.apache.xmlbeans.XmlString insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONCEPT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    public org.apache.xmlbeans.XmlString addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$10, i);
        }
    }
    
    /**
     * Gets array of all "AgencyID" elements
     */
    public java.lang.String[] getAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$12, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$12, i);
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
    public org.apache.xmlbeans.XmlString[] xgetAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString xgetAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENCYID$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
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
            return get_store().count_elements(AGENCYID$12);
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
            arraySetterHelper(agencyIDArray, AGENCYID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$12, i);
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
    public void xsetAgencyIDArray(org.apache.xmlbeans.XmlString[]agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$12);
        }
    }
    
    /**
     * Sets (as xml) ith "AgencyID" element
     */
    public void xsetAgencyIDArray(int i, org.apache.xmlbeans.XmlString agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENCYID$12, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AGENCYID$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCYID$12);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString insertNewAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(AGENCYID$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString addNewAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGENCYID$12);
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
            get_store().remove_element(AGENCYID$12, i);
        }
    }
    
    /**
     * Gets array of all "Or" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType[] getOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OR$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.OrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType getOrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().find_element_user(OR$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Or" element
     */
    public int sizeOfOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OR$14);
        }
    }
    
    /**
     * Sets array of all "Or" element
     */
    public void setOrArray(org.sdmx.resources.sdmxml.schemas.v20.query.OrType[] orArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orArray, OR$14);
        }
    }
    
    /**
     * Sets ith "Or" element
     */
    public void setOrArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.OrType or)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().find_element_user(OR$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(or);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType insertNewOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().insert_element_user(OR$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().add_element_user(OR$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Or" element
     */
    public void removeOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OR$14, i);
        }
    }
    
    /**
     * Gets array of all "And" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType[] getAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AND$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType[] result = new org.sdmx.resources.sdmxml.schemas.v20.query.AndType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType getAndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().find_element_user(AND$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "And" element
     */
    public int sizeOfAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AND$16);
        }
    }
    
    /**
     * Sets array of all "And" element
     */
    public void setAndArray(org.sdmx.resources.sdmxml.schemas.v20.query.AndType[] andArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(andArray, AND$16);
        }
    }
    
    /**
     * Sets ith "And" element
     */
    public void setAndArray(int i, org.sdmx.resources.sdmxml.schemas.v20.query.AndType and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().find_element_user(AND$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(and);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType insertNewAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().insert_element_user(AND$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType addNewAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().add_element_user(AND$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "And" element
     */
    public void removeAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AND$16, i);
        }
    }
}
