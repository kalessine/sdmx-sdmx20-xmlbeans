/*
 * XML Type:  CategoryMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML CategoryMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class CategoryMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryMapType
{
    private static final long serialVersionUID = 1L;
    
    public CategoryMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CategoryID");
    private static final javax.xml.namespace.QName TARGETCATEGORYID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetCategoryID");
    private static final javax.xml.namespace.QName CATEGORYALIAS$4 = 
        new javax.xml.namespace.QName("", "categoryAlias");
    
    
    /**
     * Gets the "CategoryID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType getCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().find_element_user(CATEGORYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryID" element
     */
    public void setCategoryID(org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().find_element_user(CATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().add_element_user(CATEGORYID$0);
            }
            target.set(categoryID);
        }
    }
    
    /**
     * Appends and returns a new empty "CategoryID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType addNewCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().add_element_user(CATEGORYID$0);
            return target;
        }
    }
    
    /**
     * Gets the "TargetCategoryID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType getTargetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().find_element_user(TARGETCATEGORYID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TargetCategoryID" element
     */
    public void setTargetCategoryID(org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType targetCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().find_element_user(TARGETCATEGORYID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().add_element_user(TARGETCATEGORYID$2);
            }
            target.set(targetCategoryID);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetCategoryID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType addNewTargetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().add_element_user(TARGETCATEGORYID$2);
            return target;
        }
    }
    
    /**
     * Gets the "categoryAlias" attribute
     */
    public java.lang.String getCategoryAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYALIAS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "categoryAlias" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCategoryAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CATEGORYALIAS$4);
            return target;
        }
    }
    
    /**
     * True if has "categoryAlias" attribute
     */
    public boolean isSetCategoryAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATEGORYALIAS$4) != null;
        }
    }
    
    /**
     * Sets the "categoryAlias" attribute
     */
    public void setCategoryAlias(java.lang.String categoryAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYALIAS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYALIAS$4);
            }
            target.setStringValue(categoryAlias);
        }
    }
    
    /**
     * Sets (as xml) the "categoryAlias" attribute
     */
    public void xsetCategoryAlias(org.sdmx.resources.sdmxml.schemas.v20.common.IDType categoryAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CATEGORYALIAS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CATEGORYALIAS$4);
            }
            target.set(categoryAlias);
        }
    }
    
    /**
     * Unsets the "categoryAlias" attribute
     */
    public void unsetCategoryAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATEGORYALIAS$4);
        }
    }
}
