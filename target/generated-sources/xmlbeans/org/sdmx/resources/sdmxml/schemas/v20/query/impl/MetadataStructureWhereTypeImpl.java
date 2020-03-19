/*
 * XML Type:  MetadataStructureWhereType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML MetadataStructureWhereType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public class MetadataStructureWhereTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.query.MetadataStructureWhereType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYFAMILY$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "KeyFamily");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataStructure");
    private static final javax.xml.namespace.QName STRUCTURESET$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StructureSet");
    private static final javax.xml.namespace.QName DIMENSION$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Dimension");
    private static final javax.xml.namespace.QName STRUCTURECOMPONENT$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StructureComponent");
    private static final javax.xml.namespace.QName ATTRIBUTE$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Attribute");
    private static final javax.xml.namespace.QName CODELIST$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Codelist");
    private static final javax.xml.namespace.QName CATEGORY$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Category");
    private static final javax.xml.namespace.QName CONCEPT$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Concept");
    private static final javax.xml.namespace.QName AGENCYID$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "AgencyID");
    private static final javax.xml.namespace.QName VERSION$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Version");
    private static final javax.xml.namespace.QName OR$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Or");
    private static final javax.xml.namespace.QName AND$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "And");
    
    
    /**
     * Gets the "KeyFamily" element
     */
    public java.lang.String getKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KeyFamily" element
     */
    public org.apache.xmlbeans.XmlString xgetKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "KeyFamily" element
     */
    public boolean isSetKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILY$0) != 0;
        }
    }
    
    /**
     * Sets the "KeyFamily" element
     */
    public void setKeyFamily(java.lang.String keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILY$0);
            }
            target.setStringValue(keyFamily);
        }
    }
    
    /**
     * Sets (as xml) the "KeyFamily" element
     */
    public void xsetKeyFamily(org.apache.xmlbeans.XmlString keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYFAMILY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYFAMILY$0);
            }
            target.set(keyFamily);
        }
    }
    
    /**
     * Unsets the "KeyFamily" element
     */
    public void unsetKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILY$0, 0);
        }
    }
    
    /**
     * Gets the "MetadataStructure" element
     */
    public java.lang.String getMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MetadataStructure" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTURE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MetadataStructure" element
     */
    public boolean isSetMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "MetadataStructure" element
     */
    public void setMetadataStructure(java.lang.String metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASTRUCTURE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASTRUCTURE$2);
            }
            target.setStringValue(metadataStructure);
        }
    }
    
    /**
     * Sets (as xml) the "MetadataStructure" element
     */
    public void xsetMetadataStructure(org.apache.xmlbeans.XmlString metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASTRUCTURE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATASTRUCTURE$2);
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Unsets the "MetadataStructure" element
     */
    public void unsetMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$2, 0);
        }
    }
    
    /**
     * Gets the "StructureSet" element
     */
    public java.lang.String getStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURESET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StructureSet" element
     */
    public org.apache.xmlbeans.XmlString xgetStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUCTURESET$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "StructureSet" element
     */
    public boolean isSetStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESET$4) != 0;
        }
    }
    
    /**
     * Sets the "StructureSet" element
     */
    public void setStructureSet(java.lang.String structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURESET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUCTURESET$4);
            }
            target.setStringValue(structureSet);
        }
    }
    
    /**
     * Sets (as xml) the "StructureSet" element
     */
    public void xsetStructureSet(org.apache.xmlbeans.XmlString structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRUCTURESET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRUCTURESET$4);
            }
            target.set(structureSet);
        }
    }
    
    /**
     * Unsets the "StructureSet" element
     */
    public void unsetStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESET$4, 0);
        }
    }
    
    /**
     * Gets the "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().find_element_user(DIMENSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Dimension" element
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$6) != 0;
        }
    }
    
    /**
     * Sets the "Dimension" element
     */
    public void setDimension(org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().find_element_user(DIMENSION$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().add_element_user(DIMENSION$6);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Appends and returns a new empty "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.DimensionType)get_store().add_element_user(DIMENSION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Dimension" element
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$6, 0);
        }
    }
    
    /**
     * Gets the "StructureComponent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType getStructureComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().find_element_user(STRUCTURECOMPONENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureComponent" element
     */
    public boolean isSetStructureComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURECOMPONENT$8) != 0;
        }
    }
    
    /**
     * Sets the "StructureComponent" element
     */
    public void setStructureComponent(org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType structureComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().find_element_user(STRUCTURECOMPONENT$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().add_element_user(STRUCTURECOMPONENT$8);
            }
            target.set(structureComponent);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureComponent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType addNewStructureComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().add_element_user(STRUCTURECOMPONENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureComponent" element
     */
    public void unsetStructureComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURECOMPONENT$8, 0);
        }
    }
    
    /**
     * Gets the "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().find_element_user(ATTRIBUTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attribute" element
     */
    public boolean isSetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$10) != 0;
        }
    }
    
    /**
     * Sets the "Attribute" element
     */
    public void setAttribute(org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().find_element_user(ATTRIBUTE$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().add_element_user(ATTRIBUTE$10);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Appends and returns a new empty "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().add_element_user(ATTRIBUTE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Attribute" element
     */
    public void unsetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$10, 0);
        }
    }
    
    /**
     * Gets the "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType getCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Codelist" element
     */
    public boolean isSetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$12) != 0;
        }
    }
    
    /**
     * Sets the "Codelist" element
     */
    public void setCodelist(org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().add_element_user(CODELIST$12);
            }
            target.set(codelist);
        }
    }
    
    /**
     * Appends and returns a new empty "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType addNewCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().add_element_user(CODELIST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Codelist" element
     */
    public void unsetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$12, 0);
        }
    }
    
    /**
     * Gets the "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$14) != 0;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    public void setCategory(org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().add_element_user(CATEGORY$14);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().add_element_user(CATEGORY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$14, 0);
        }
    }
    
    /**
     * Gets the "Concept" element
     */
    public java.lang.String getConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Concept" element
     */
    public org.apache.xmlbeans.XmlString xgetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "Concept" element
     */
    public boolean isSetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$16) != 0;
        }
    }
    
    /**
     * Sets the "Concept" element
     */
    public void setConcept(java.lang.String concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPT$16);
            }
            target.setStringValue(concept);
        }
    }
    
    /**
     * Sets (as xml) the "Concept" element
     */
    public void xsetConcept(org.apache.xmlbeans.XmlString concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPT$16);
            }
            target.set(concept);
        }
    }
    
    /**
     * Unsets the "Concept" element
     */
    public void unsetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$16, 0);
        }
    }
    
    /**
     * Gets the "AgencyID" element
     */
    public java.lang.String getAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AgencyID" element
     */
    public org.apache.xmlbeans.XmlString xgetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENCYID$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "AgencyID" element
     */
    public boolean isSetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYID$18) != 0;
        }
    }
    
    /**
     * Sets the "AgencyID" element
     */
    public void setAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCYID$18);
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) the "AgencyID" element
     */
    public void xsetAgencyID(org.apache.xmlbeans.XmlString agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGENCYID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGENCYID$18);
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Unsets the "AgencyID" element
     */
    public void unsetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYID$18, 0);
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$20) != 0;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$20);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$20);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "Version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$20, 0);
        }
    }
    
    /**
     * Gets the "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType getOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().find_element_user(OR$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Or" element
     */
    public boolean isSetOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OR$22) != 0;
        }
    }
    
    /**
     * Sets the "Or" element
     */
    public void setOr(org.sdmx.resources.sdmxml.schemas.v20.query.OrType or)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().find_element_user(OR$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().add_element_user(OR$22);
            }
            target.set(or);
        }
    }
    
    /**
     * Appends and returns a new empty "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.OrType addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.OrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.OrType)get_store().add_element_user(OR$22);
            return target;
        }
    }
    
    /**
     * Unsets the "Or" element
     */
    public void unsetOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OR$22, 0);
        }
    }
    
    /**
     * Gets the "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType getAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().find_element_user(AND$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "And" element
     */
    public boolean isSetAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AND$24) != 0;
        }
    }
    
    /**
     * Sets the "And" element
     */
    public void setAnd(org.sdmx.resources.sdmxml.schemas.v20.query.AndType and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().find_element_user(AND$24, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().add_element_user(AND$24);
            }
            target.set(and);
        }
    }
    
    /**
     * Appends and returns a new empty "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.AndType addNewAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.AndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AndType)get_store().add_element_user(AND$24);
            return target;
        }
    }
    
    /**
     * Unsets the "And" element
     */
    public void unsetAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AND$24, 0);
        }
    }
}
