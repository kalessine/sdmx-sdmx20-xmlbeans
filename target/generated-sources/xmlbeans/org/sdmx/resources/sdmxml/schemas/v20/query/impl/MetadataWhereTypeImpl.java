/*
 * XML Type:  MetadataWhereType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.query.impl;
/**
 * An XML MetadataWhereType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query).
 *
 * This is a complex type.
 */
public class MetadataWhereTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.query.MetadataWhereType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASET$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataSet");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "MetadataStructure");
    private static final javax.xml.namespace.QName STRUCTURECOMPONENT$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "StructureComponent");
    private static final javax.xml.namespace.QName ATTRIBUTE$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Attribute");
    private static final javax.xml.namespace.QName CODELIST$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Codelist");
    private static final javax.xml.namespace.QName TIME$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Time");
    private static final javax.xml.namespace.QName CATEGORY$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Category");
    private static final javax.xml.namespace.QName CONCEPT$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Concept");
    private static final javax.xml.namespace.QName DATAPROVIDER$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "DataProvider");
    private static final javax.xml.namespace.QName METADATAFLOW$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Metadataflow");
    private static final javax.xml.namespace.QName VERSION$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Version");
    private static final javax.xml.namespace.QName OR$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "Or");
    private static final javax.xml.namespace.QName AND$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/query", "And");
    
    
    /**
     * Gets the "MetadataSet" element
     */
    public java.lang.String getMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MetadataSet" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASET$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MetadataSet" element
     */
    public boolean isSetMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASET$0) != 0;
        }
    }
    
    /**
     * Sets the "MetadataSet" element
     */
    public void setMetadataSet(java.lang.String metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATASET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATASET$0);
            }
            target.setStringValue(metadataSet);
        }
    }
    
    /**
     * Sets (as xml) the "MetadataSet" element
     */
    public void xsetMetadataSet(org.apache.xmlbeans.XmlString metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATASET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATASET$0);
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Unsets the "MetadataSet" element
     */
    public void unsetMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASET$0, 0);
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
     * Gets the "StructureComponent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType getStructureComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().find_element_user(STRUCTURECOMPONENT$4, 0);
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
            return get_store().count_elements(STRUCTURECOMPONENT$4) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().find_element_user(STRUCTURECOMPONENT$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().add_element_user(STRUCTURECOMPONENT$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.StructureComponentType)get_store().add_element_user(STRUCTURECOMPONENT$4);
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
            get_store().remove_element(STRUCTURECOMPONENT$4, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().find_element_user(ATTRIBUTE$6, 0);
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
            return get_store().count_elements(ATTRIBUTE$6) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().find_element_user(ATTRIBUTE$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().add_element_user(ATTRIBUTE$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.AttributeType)get_store().add_element_user(ATTRIBUTE$6);
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
            get_store().remove_element(ATTRIBUTE$6, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$8, 0);
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
            return get_store().count_elements(CODELIST$8) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().find_element_user(CODELIST$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().add_element_user(CODELIST$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CodelistType)get_store().add_element_user(CODELIST$8);
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
            get_store().remove_element(CODELIST$8, 0);
        }
    }
    
    /**
     * Gets the "Time" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.TimeType getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().find_element_user(TIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$10) != 0;
        }
    }
    
    /**
     * Sets the "Time" element
     */
    public void setTime(org.sdmx.resources.sdmxml.schemas.v20.query.TimeType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().find_element_user(TIME$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().add_element_user(TIME$10);
            }
            target.set(time);
        }
    }
    
    /**
     * Appends and returns a new empty "Time" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.query.TimeType addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.query.TimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.TimeType)get_store().add_element_user(TIME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$10, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$12, 0);
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
            return get_store().count_elements(CATEGORY$12) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().find_element_user(CATEGORY$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().add_element_user(CATEGORY$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.query.CategoryType)get_store().add_element_user(CATEGORY$12);
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
            get_store().remove_element(CATEGORY$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$14, 0);
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
            return get_store().count_elements(CONCEPT$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPT$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPT$14);
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
            get_store().remove_element(CONCEPT$14, 0);
        }
    }
    
    /**
     * Gets the "DataProvider" element
     */
    public java.lang.String getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataProvider" element
     */
    public org.apache.xmlbeans.XmlString xgetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDER$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataProvider" element
     */
    public boolean isSetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$16) != 0;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(java.lang.String dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAPROVIDER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAPROVIDER$16);
            }
            target.setStringValue(dataProvider);
        }
    }
    
    /**
     * Sets (as xml) the "DataProvider" element
     */
    public void xsetDataProvider(org.apache.xmlbeans.XmlString dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAPROVIDER$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAPROVIDER$16);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Unsets the "DataProvider" element
     */
    public void unsetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$16, 0);
        }
    }
    
    /**
     * Gets the "Metadataflow" element
     */
    public java.lang.String getMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOW$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Metadataflow" element
     */
    public org.apache.xmlbeans.XmlString xgetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOW$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Metadataflow" element
     */
    public boolean isSetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOW$18) != 0;
        }
    }
    
    /**
     * Sets the "Metadataflow" element
     */
    public void setMetadataflow(java.lang.String metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAFLOW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAFLOW$18);
            }
            target.setStringValue(metadataflow);
        }
    }
    
    /**
     * Sets (as xml) the "Metadataflow" element
     */
    public void xsetMetadataflow(org.apache.xmlbeans.XmlString metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAFLOW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATAFLOW$18);
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Unsets the "Metadataflow" element
     */
    public void unsetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOW$18, 0);
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
