/*
 * XML Type:  CodeListsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML CodeListsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class CodeListsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListsType
{
    private static final long serialVersionUID = 1L;
    
    public CodeListsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODELIST$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodeList");
    
    
    /**
     * Gets array of all "CodeList" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType[] getCodeListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELIST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType getCodeListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType)get_store().find_element_user(CODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodeList" element
     */
    public int sizeOfCodeListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$0);
        }
    }
    
    /**
     * Sets array of all "CodeList" element
     */
    public void setCodeListArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType[] codeListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeListArray, CODELIST$0);
        }
    }
    
    /**
     * Sets ith "CodeList" element
     */
    public void setCodeListArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType codeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType)get_store().find_element_user(CODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codeList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType insertNewCodeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType)get_store().insert_element_user(CODELIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType addNewCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeListType)get_store().add_element_user(CODELIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodeList" element
     */
    public void removeCodeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$0, i);
        }
    }
}
