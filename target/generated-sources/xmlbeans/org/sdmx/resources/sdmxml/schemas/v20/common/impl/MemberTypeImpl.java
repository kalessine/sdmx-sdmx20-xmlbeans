/*
 * XML Type:  MemberType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.MemberType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common.impl;
/**
 * An XML MemberType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a complex type.
 */
public class MemberTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.common.MemberType
{
    private static final long serialVersionUID = 1L;
    
    public MemberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "ComponentRef");
    private static final javax.xml.namespace.QName MEMBERVALUE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "MemberValue");
    private static final javax.xml.namespace.QName ISINCLUDED$4 = 
        new javax.xml.namespace.QName("", "isIncluded");
    
    
    /**
     * Gets the "ComponentRef" element
     */
    public java.lang.String getComponentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPONENTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ComponentRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetComponentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(COMPONENTREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ComponentRef" element
     */
    public void setComponentRef(java.lang.String componentRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPONENTREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPONENTREF$0);
            }
            target.setStringValue(componentRef);
        }
    }
    
    /**
     * Sets (as xml) the "ComponentRef" element
     */
    public void xsetComponentRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType componentRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(COMPONENTREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(COMPONENTREF$0);
            }
            target.set(componentRef);
        }
    }
    
    /**
     * Gets array of all "MemberValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType[] getMemberValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBERVALUE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MemberValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType getMemberValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType)get_store().find_element_user(MEMBERVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MemberValue" element
     */
    public int sizeOfMemberValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERVALUE$2);
        }
    }
    
    /**
     * Sets array of all "MemberValue" element
     */
    public void setMemberValueArray(org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType[] memberValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(memberValueArray, MEMBERVALUE$2);
        }
    }
    
    /**
     * Sets ith "MemberValue" element
     */
    public void setMemberValueArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType memberValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType)get_store().find_element_user(MEMBERVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(memberValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MemberValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType insertNewMemberValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType)get_store().insert_element_user(MEMBERVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MemberValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType addNewMemberValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberValueType)get_store().add_element_user(MEMBERVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MemberValue" element
     */
    public void removeMemberValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERVALUE$2, i);
        }
    }
    
    /**
     * Gets the "isIncluded" attribute
     */
    public boolean getIsIncluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isIncluded" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsIncluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$4);
            return target;
        }
    }
    
    /**
     * Sets the "isIncluded" attribute
     */
    public void setIsIncluded(boolean isIncluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINCLUDED$4);
            }
            target.setBooleanValue(isIncluded);
        }
    }
    
    /**
     * Sets (as xml) the "isIncluded" attribute
     */
    public void xsetIsIncluded(org.apache.xmlbeans.XmlBoolean isIncluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINCLUDED$4);
            }
            target.set(isIncluded);
        }
    }
}
