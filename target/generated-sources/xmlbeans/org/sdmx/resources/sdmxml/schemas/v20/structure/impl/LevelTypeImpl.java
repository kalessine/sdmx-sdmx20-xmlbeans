/*
 * XML Type:  LevelType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.LevelType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML LevelType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class LevelTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.LevelType
{
    private static final long serialVersionUID = 1L;
    
    public LevelTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Description");
    private static final javax.xml.namespace.QName ORDER$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Order");
    private static final javax.xml.namespace.QName CODINGTYPE$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodingType");
    private static final javax.xml.namespace.QName ANNOTATIONS$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName URN$12 = 
        new javax.xml.namespace.QName("", "urn");
    
    
    /**
     * Gets array of all "Name" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0);
        }
    }
    
    /**
     * Sets array of all "Name" element
     */
    public void setNameArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
    }
    
    /**
     * Sets ith "Name" element
     */
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, i);
        }
    }
    
    /**
     * Gets array of all "Description" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(DESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2);
        }
    }
    
    /**
     * Sets array of all "Description" element
     */
    public void setDescriptionArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$2);
        }
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(DESCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(DESCRIPTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, i);
        }
    }
    
    /**
     * Gets the "Order" element
     */
    public java.math.BigInteger getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "Order" element
     */
    public org.apache.xmlbeans.XmlInteger xgetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Order" element
     */
    public void setOrder(java.math.BigInteger order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDER$4);
            }
            target.setBigIntegerValue(order);
        }
    }
    
    /**
     * Sets (as xml) the "Order" element
     */
    public void xsetOrder(org.apache.xmlbeans.XmlInteger order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORDER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ORDER$4);
            }
            target.set(order);
        }
    }
    
    /**
     * Gets the "CodingType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getCodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(CODINGTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodingType" element
     */
    public boolean isSetCodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODINGTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "CodingType" element
     */
    public void setCodingType(org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType codingType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(CODINGTYPE$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(CODINGTYPE$6);
            }
            target.set(codingType);
        }
    }
    
    /**
     * Appends and returns a new empty "CodingType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType addNewCodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(CODINGTYPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CodingType" element
     */
    public void unsetCodingType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODINGTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Annotations" element
     */
    public boolean isSetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "Annotations" element
     */
    public void setAnnotations(org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType annotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$8);
            }
            target.set(annotations);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType addNewAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Annotations" element
     */
    public void unsetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONS$8, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v20.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "urn" attribute
     */
    public java.lang.String getUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URN$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "urn" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URN$12);
            return target;
        }
    }
    
    /**
     * True if has "urn" attribute
     */
    public boolean isSetUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URN$12) != null;
        }
    }
    
    /**
     * Sets the "urn" attribute
     */
    public void setUrn(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URN$12);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "urn" attribute
     */
    public void xsetUrn(org.apache.xmlbeans.XmlAnyURI urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URN$12);
            }
            target.set(urn);
        }
    }
    
    /**
     * Unsets the "urn" attribute
     */
    public void unsetUrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URN$12);
        }
    }
}
