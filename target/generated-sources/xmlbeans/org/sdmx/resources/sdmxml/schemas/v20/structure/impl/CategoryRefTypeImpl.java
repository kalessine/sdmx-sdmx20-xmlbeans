/*
 * XML Type:  CategoryRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML CategoryRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class CategoryRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryRefType
{
    private static final long serialVersionUID = 1L;
    
    public CategoryRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "URN");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CategorySchemeID");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEAGENCYID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CategorySchemeAgencyID");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEVERSION$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CategorySchemeVersion");
    private static final javax.xml.namespace.QName CATEGORYID$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CategoryID");
    
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "URN" element
     */
    public boolean isSetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URN$0) != 0;
        }
    }
    
    /**
     * Sets the "URN" element
     */
    public void setURN(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$0);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "URN" element
     */
    public void xsetURN(org.apache.xmlbeans.XmlAnyURI urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URN$0);
            }
            target.set(urn);
        }
    }
    
    /**
     * Unsets the "URN" element
     */
    public void unsetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URN$0, 0);
        }
    }
    
    /**
     * Gets the "CategorySchemeID" element
     */
    public java.lang.String getCategorySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategorySchemeID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCategorySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CATEGORYSCHEMEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemeID" element
     */
    public boolean isSetCategorySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEID$2) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemeID" element
     */
    public void setCategorySchemeID(java.lang.String categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYSCHEMEID$2);
            }
            target.setStringValue(categorySchemeID);
        }
    }
    
    /**
     * Sets (as xml) the "CategorySchemeID" element
     */
    public void xsetCategorySchemeID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType categorySchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CATEGORYSCHEMEID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CATEGORYSCHEMEID$2);
            }
            target.set(categorySchemeID);
        }
    }
    
    /**
     * Unsets the "CategorySchemeID" element
     */
    public void unsetCategorySchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEID$2, 0);
        }
    }
    
    /**
     * Gets the "CategorySchemeAgencyID" element
     */
    public java.lang.String getCategorySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategorySchemeAgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCategorySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemeAgencyID" element
     */
    public boolean isSetCategorySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEAGENCYID$4) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemeAgencyID" element
     */
    public void setCategorySchemeAgencyID(java.lang.String categorySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYSCHEMEAGENCYID$4);
            }
            target.setStringValue(categorySchemeAgencyID);
        }
    }
    
    /**
     * Sets (as xml) the "CategorySchemeAgencyID" element
     */
    public void xsetCategorySchemeAgencyID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType categorySchemeAgencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CATEGORYSCHEMEAGENCYID$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CATEGORYSCHEMEAGENCYID$4);
            }
            target.set(categorySchemeAgencyID);
        }
    }
    
    /**
     * Unsets the "CategorySchemeAgencyID" element
     */
    public void unsetCategorySchemeAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEAGENCYID$4, 0);
        }
    }
    
    /**
     * Gets the "CategorySchemeVersion" element
     */
    public java.lang.String getCategorySchemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategorySchemeVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetCategorySchemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemeVersion" element
     */
    public boolean isSetCategorySchemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemeVersion" element
     */
    public void setCategorySchemeVersion(java.lang.String categorySchemeVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYSCHEMEVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYSCHEMEVERSION$6);
            }
            target.setStringValue(categorySchemeVersion);
        }
    }
    
    /**
     * Sets (as xml) the "CategorySchemeVersion" element
     */
    public void xsetCategorySchemeVersion(org.apache.xmlbeans.XmlString categorySchemeVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORYSCHEMEVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORYSCHEMEVERSION$6);
            }
            target.set(categorySchemeVersion);
        }
    }
    
    /**
     * Unsets the "CategorySchemeVersion" element
     */
    public void unsetCategorySchemeVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEVERSION$6, 0);
        }
    }
    
    /**
     * Gets the "CategoryID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType getCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().find_element_user(CATEGORYID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategoryID" element
     */
    public boolean isSetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYID$8) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().find_element_user(CATEGORYID$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().add_element_user(CATEGORYID$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CategoryIDType)get_store().add_element_user(CATEGORYID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "CategoryID" element
     */
    public void unsetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYID$8, 0);
        }
    }
}
