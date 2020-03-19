/*
 * XML Type:  ConceptMapType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ConceptMapType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ConceptMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ConceptMapType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ConceptID");
    private static final javax.xml.namespace.QName TARGETCONCEPTID$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TargetConceptID");
    private static final javax.xml.namespace.QName CONCEPTALIAS$4 = 
        new javax.xml.namespace.QName("", "conceptAlias");
    
    
    /**
     * Gets the "ConceptID" element
     */
    public java.lang.String getConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConceptID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CONCEPTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConceptID" element
     */
    public void setConceptID(java.lang.String conceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPTID$0);
            }
            target.setStringValue(conceptID);
        }
    }
    
    /**
     * Sets (as xml) the "ConceptID" element
     */
    public void xsetConceptID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CONCEPTID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CONCEPTID$0);
            }
            target.set(conceptID);
        }
    }
    
    /**
     * Gets the "TargetConceptID" element
     */
    public java.lang.String getTargetConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCONCEPTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetConceptID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetTargetConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETCONCEPTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetConceptID" element
     */
    public void setTargetConceptID(java.lang.String targetConceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCONCEPTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETCONCEPTID$2);
            }
            target.setStringValue(targetConceptID);
        }
    }
    
    /**
     * Sets (as xml) the "TargetConceptID" element
     */
    public void xsetTargetConceptID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType targetConceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(TARGETCONCEPTID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(TARGETCONCEPTID$2);
            }
            target.set(targetConceptID);
        }
    }
    
    /**
     * Gets the "conceptAlias" attribute
     */
    public java.lang.String getConceptAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTALIAS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conceptAlias" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetConceptAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTALIAS$4);
            return target;
        }
    }
    
    /**
     * True if has "conceptAlias" attribute
     */
    public boolean isSetConceptAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONCEPTALIAS$4) != null;
        }
    }
    
    /**
     * Sets the "conceptAlias" attribute
     */
    public void setConceptAlias(java.lang.String conceptAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONCEPTALIAS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONCEPTALIAS$4);
            }
            target.setStringValue(conceptAlias);
        }
    }
    
    /**
     * Sets (as xml) the "conceptAlias" attribute
     */
    public void xsetConceptAlias(org.sdmx.resources.sdmxml.schemas.v20.common.IDType conceptAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(CONCEPTALIAS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(CONCEPTALIAS$4);
            }
            target.set(conceptAlias);
        }
    }
    
    /**
     * Unsets the "conceptAlias" attribute
     */
    public void unsetConceptAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONCEPTALIAS$4);
        }
    }
}
