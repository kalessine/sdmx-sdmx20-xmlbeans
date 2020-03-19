/*
 * XML Type:  KeyFamiliesType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML KeyFamiliesType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class KeyFamiliesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamiliesType
{
    private static final long serialVersionUID = 1L;
    
    public KeyFamiliesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFAMILY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "KeyFamily");
    
    
    /**
     * Gets array of all "KeyFamily" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType[] getKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamily" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType getKeyFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType)get_store().find_element_user(KEYFAMILY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
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
    public void setKeyFamilyArray(org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType[] keyFamilyArray)
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
    public void setKeyFamilyArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType)get_store().find_element_user(KEYFAMILY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamily);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType insertNewKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType)get_store().insert_element_user(KEYFAMILY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType addNewKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.KeyFamilyType)get_store().add_element_user(KEYFAMILY$0);
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
}
