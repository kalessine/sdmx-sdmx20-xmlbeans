/*
 * XML Type:  CubeRegionType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.common.impl;
/**
 * An XML CubeRegionType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common).
 *
 * This is a complex type.
 */
public class CubeRegionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.common.CubeRegionType
{
    private static final long serialVersionUID = 1L;
    
    public CubeRegionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/common", "Member");
    private static final javax.xml.namespace.QName ISINCLUDED$2 = 
        new javax.xml.namespace.QName("", "isIncluded");
    
    
    /**
     * Gets array of all "Member" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberType[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.MemberType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Member" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberType getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$0);
        }
    }
    
    /**
     * Sets array of all "Member" element
     */
    public void setMemberArray(org.sdmx.resources.sdmxml.schemas.v20.common.MemberType[] memberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(memberArray, MEMBER$0);
        }
    }
    
    /**
     * Sets ith "Member" element
     */
    public void setMemberArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.MemberType member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Member" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberType insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberType)get_store().insert_element_user(MEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Member" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.MemberType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.MemberType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.MemberType)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINCLUDED$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINCLUDED$2);
            }
            target.set(isIncluded);
        }
    }
}
