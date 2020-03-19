/*
 * XML Type:  CodeMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML CodeMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class CodeMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.CodeMapType
{
    private static final long serialVersionUID = 1L;
    
    public CodeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPCODEREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MapCodeRef");
    private static final javax.xml.namespace.QName MAPTARGETCODEREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MapTargetCodeRef");
    private static final javax.xml.namespace.QName CODEALIAS$4 = 
        new javax.xml.namespace.QName("", "CodeAlias");
    
    
    /**
     * Gets the "MapCodeRef" element
     */
    public java.lang.String getMapCodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCODEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MapCodeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMapCodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPCODEREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MapCodeRef" element
     */
    public void setMapCodeRef(java.lang.String mapCodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCODEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPCODEREF$0);
            }
            target.setStringValue(mapCodeRef);
        }
    }
    
    /**
     * Sets (as xml) the "MapCodeRef" element
     */
    public void xsetMapCodeRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType mapCodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPCODEREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(MAPCODEREF$0);
            }
            target.set(mapCodeRef);
        }
    }
    
    /**
     * Gets the "MapTargetCodeRef" element
     */
    public java.lang.String getMapTargetCodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPTARGETCODEREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MapTargetCodeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMapTargetCodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPTARGETCODEREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MapTargetCodeRef" element
     */
    public void setMapTargetCodeRef(java.lang.String mapTargetCodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPTARGETCODEREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPTARGETCODEREF$2);
            }
            target.setStringValue(mapTargetCodeRef);
        }
    }
    
    /**
     * Sets (as xml) the "MapTargetCodeRef" element
     */
    public void xsetMapTargetCodeRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType mapTargetCodeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPTARGETCODEREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(MAPTARGETCODEREF$2);
            }
            target.set(mapTargetCodeRef);
        }
    }
    
    /**
     * Gets the "CodeAlias" attribute
     */
    public java.lang.String getCodeAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODEALIAS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodeAlias" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodeAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODEALIAS$4);
            return target;
        }
    }
    
    /**
     * True if has "CodeAlias" attribute
     */
    public boolean isSetCodeAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODEALIAS$4) != null;
        }
    }
    
    /**
     * Sets the "CodeAlias" attribute
     */
    public void setCodeAlias(java.lang.String codeAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODEALIAS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODEALIAS$4);
            }
            target.setStringValue(codeAlias);
        }
    }
    
    /**
     * Sets (as xml) the "CodeAlias" attribute
     */
    public void xsetCodeAlias(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codeAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CODEALIAS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CODEALIAS$4);
            }
            target.set(codeAlias);
        }
    }
    
    /**
     * Unsets the "CodeAlias" attribute
     */
    public void unsetCodeAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODEALIAS$4);
        }
    }
}
