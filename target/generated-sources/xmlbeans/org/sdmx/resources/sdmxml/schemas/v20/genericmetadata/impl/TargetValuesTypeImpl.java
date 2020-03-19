/*
 * XML Type:  TargetValuesType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.impl;
/**
 * An XML TargetValuesType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata).
 *
 * This is a complex type.
 */
public class TargetValuesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.TargetValuesType
{
    private static final long serialVersionUID = 1L;
    
    public TargetValuesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTVALUE$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/genericmetadata", "ComponentValue");
    
    
    /**
     * Gets array of all "ComponentValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType[] getComponentValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTVALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType[] result = new org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType getComponentValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType)get_store().find_element_user(COMPONENTVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComponentValue" element
     */
    public int sizeOfComponentValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTVALUE$0);
        }
    }
    
    /**
     * Sets array of all "ComponentValue" element
     */
    public void setComponentValueArray(org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType[] componentValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentValueArray, COMPONENTVALUE$0);
        }
    }
    
    /**
     * Sets ith "ComponentValue" element
     */
    public void setComponentValueArray(int i, org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType componentValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType)get_store().find_element_user(COMPONENTVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType insertNewComponentValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType)get_store().insert_element_user(COMPONENTVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType addNewComponentValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.genericmetadata.ComponentValueType)get_store().add_element_user(COMPONENTVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentValue" element
     */
    public void removeComponentValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTVALUE$0, i);
        }
    }
}
