/*
 * XML Type:  ComponentMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ComponentMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ComponentMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentMapType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPCONCEPTREF$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MapConceptRef");
    private static final javax.xml.namespace.QName MAPTARGETCONCEPTREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "MapTargetConceptRef");
    private static final javax.xml.namespace.QName REPRESENTATIONMAPREF$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "RepresentationMapRef");
    private static final javax.xml.namespace.QName TOTEXTFORMAT$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ToTextFormat");
    private static final javax.xml.namespace.QName TOVALUETYPE$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ToValueType");
    private static final javax.xml.namespace.QName COMPONENTALIAS$10 = 
        new javax.xml.namespace.QName("", "componentAlias");
    private static final javax.xml.namespace.QName PREFERREDLANGUAGE$12 = 
        new javax.xml.namespace.QName("", "preferredLanguage");
    
    
    /**
     * Gets the "MapConceptRef" element
     */
    public java.lang.String getMapConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCONCEPTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MapConceptRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMapConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPCONCEPTREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MapConceptRef" element
     */
    public void setMapConceptRef(java.lang.String mapConceptRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPCONCEPTREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPCONCEPTREF$0);
            }
            target.setStringValue(mapConceptRef);
        }
    }
    
    /**
     * Sets (as xml) the "MapConceptRef" element
     */
    public void xsetMapConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType mapConceptRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPCONCEPTREF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(MAPCONCEPTREF$0);
            }
            target.set(mapConceptRef);
        }
    }
    
    /**
     * Gets the "MapTargetConceptRef" element
     */
    public java.lang.String getMapTargetConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPTARGETCONCEPTREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MapTargetConceptRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetMapTargetConceptRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPTARGETCONCEPTREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MapTargetConceptRef" element
     */
    public void setMapTargetConceptRef(java.lang.String mapTargetConceptRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPTARGETCONCEPTREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPTARGETCONCEPTREF$2);
            }
            target.setStringValue(mapTargetConceptRef);
        }
    }
    
    /**
     * Sets (as xml) the "MapTargetConceptRef" element
     */
    public void xsetMapTargetConceptRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType mapTargetConceptRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(MAPTARGETCONCEPTREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(MAPTARGETCONCEPTREF$2);
            }
            target.set(mapTargetConceptRef);
        }
    }
    
    /**
     * Gets the "RepresentationMapRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType getRepresentationMapRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType)get_store().find_element_user(REPRESENTATIONMAPREF$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RepresentationMapRef" element
     */
    public boolean isSetRepresentationMapRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIONMAPREF$4) != 0;
        }
    }
    
    /**
     * Sets the "RepresentationMapRef" element
     */
    public void setRepresentationMapRef(org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType representationMapRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType)get_store().find_element_user(REPRESENTATIONMAPREF$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType)get_store().add_element_user(REPRESENTATIONMAPREF$4);
            }
            target.set(representationMapRef);
        }
    }
    
    /**
     * Appends and returns a new empty "RepresentationMapRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType addNewRepresentationMapRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.RepresentationMapRefType)get_store().add_element_user(REPRESENTATIONMAPREF$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RepresentationMapRef" element
     */
    public void unsetRepresentationMapRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIONMAPREF$4, 0);
        }
    }
    
    /**
     * Gets the "ToTextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType getToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(TOTEXTFORMAT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ToTextFormat" element
     */
    public boolean isSetToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTEXTFORMAT$6) != 0;
        }
    }
    
    /**
     * Sets the "ToTextFormat" element
     */
    public void setToTextFormat(org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType toTextFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().find_element_user(TOTEXTFORMAT$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(TOTEXTFORMAT$6);
            }
            target.set(toTextFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "ToTextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType addNewToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TextFormatType)get_store().add_element_user(TOTEXTFORMAT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ToTextFormat" element
     */
    public void unsetToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTEXTFORMAT$6, 0);
        }
    }
    
    /**
     * Gets the "ToValueType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType.Enum getToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOVALUETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ToValueType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType xgetToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType)get_store().find_element_user(TOVALUETYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ToValueType" element
     */
    public boolean isSetToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOVALUETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "ToValueType" element
     */
    public void setToValueType(org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType.Enum toValueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOVALUETYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOVALUETYPE$8);
            }
            target.setEnumValue(toValueType);
        }
    }
    
    /**
     * Sets (as xml) the "ToValueType" element
     */
    public void xsetToValueType(org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType toValueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType)get_store().find_element_user(TOVALUETYPE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ToValueTypeType)get_store().add_element_user(TOVALUETYPE$8);
            }
            target.set(toValueType);
        }
    }
    
    /**
     * Unsets the "ToValueType" element
     */
    public void unsetToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOVALUETYPE$8, 0);
        }
    }
    
    /**
     * Gets the "componentAlias" attribute
     */
    public java.lang.String getComponentAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPONENTALIAS$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "componentAlias" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetComponentAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(COMPONENTALIAS$10);
            return target;
        }
    }
    
    /**
     * True if has "componentAlias" attribute
     */
    public boolean isSetComponentAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPONENTALIAS$10) != null;
        }
    }
    
    /**
     * Sets the "componentAlias" attribute
     */
    public void setComponentAlias(java.lang.String componentAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPONENTALIAS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPONENTALIAS$10);
            }
            target.setStringValue(componentAlias);
        }
    }
    
    /**
     * Sets (as xml) the "componentAlias" attribute
     */
    public void xsetComponentAlias(org.sdmx.resources.sdmxml.schemas.v20.common.IDType componentAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(COMPONENTALIAS$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(COMPONENTALIAS$10);
            }
            target.set(componentAlias);
        }
    }
    
    /**
     * Unsets the "componentAlias" attribute
     */
    public void unsetComponentAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPONENTALIAS$10);
        }
    }
    
    /**
     * Gets the "preferredLanguage" attribute
     */
    public java.lang.String getPreferredLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERREDLANGUAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PREFERREDLANGUAGE$12);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "preferredLanguage" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetPreferredLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PREFERREDLANGUAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_default_attribute_value(PREFERREDLANGUAGE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "preferredLanguage" attribute
     */
    public boolean isSetPreferredLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREFERREDLANGUAGE$12) != null;
        }
    }
    
    /**
     * Sets the "preferredLanguage" attribute
     */
    public void setPreferredLanguage(java.lang.String preferredLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERREDLANGUAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERREDLANGUAGE$12);
            }
            target.setStringValue(preferredLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "preferredLanguage" attribute
     */
    public void xsetPreferredLanguage(org.apache.xmlbeans.XmlLanguage preferredLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(PREFERREDLANGUAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(PREFERREDLANGUAGE$12);
            }
            target.set(preferredLanguage);
        }
    }
    
    /**
     * Unsets the "preferredLanguage" attribute
     */
    public void unsetPreferredLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREFERREDLANGUAGE$12);
        }
    }
}
