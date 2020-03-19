/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.registry.impl;
/**
 * An XML SubmitStructureRequestType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry).
 *
 * This is a complex type.
 */
public class SubmitStructureRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.registry.SubmitStructureRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURELOCATION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "StructureLocation");
    private static final javax.xml.namespace.QName STRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "Structure");
    private static final javax.xml.namespace.QName SUBMITTEDSTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/registry", "SubmittedStructure");
    
    
    /**
     * Gets the "StructureLocation" element
     */
    public java.lang.String getStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StructureLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "StructureLocation" element
     */
    public boolean isSetStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURELOCATION$0) != 0;
        }
    }
    
    /**
     * Sets the "StructureLocation" element
     */
    public void setStructureLocation(java.lang.String structureLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUCTURELOCATION$0);
            }
            target.setStringValue(structureLocation);
        }
    }
    
    /**
     * Sets (as xml) the "StructureLocation" element
     */
    public void xsetStructureLocation(org.apache.xmlbeans.XmlAnyURI structureLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(STRUCTURELOCATION$0);
            }
            target.set(structureLocation);
        }
    }
    
    /**
     * Unsets the "StructureLocation" element
     */
    public void unsetStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURELOCATION$0, 0);
        }
    }
    
    /**
     * Gets the "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType getStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType)get_store().find_element_user(STRUCTURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Structure" element
     */
    public boolean isSetStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$2) != 0;
        }
    }
    
    /**
     * Sets the "Structure" element
     */
    public void setStructure(org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType)get_store().find_element_user(STRUCTURE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType)get_store().add_element_user(STRUCTURE$2);
            }
            target.set(structure);
        }
    }
    
    /**
     * Appends and returns a new empty "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.StructureType)get_store().add_element_user(STRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Structure" element
     */
    public void unsetStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$2, 0);
        }
    }
    
    /**
     * Gets array of all "SubmittedStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType[] getSubmittedStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBMITTEDSTRUCTURE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType getSubmittedStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType)get_store().find_element_user(SUBMITTEDSTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubmittedStructure" element
     */
    public int sizeOfSubmittedStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITTEDSTRUCTURE$4);
        }
    }
    
    /**
     * Sets array of all "SubmittedStructure" element
     */
    public void setSubmittedStructureArray(org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType[] submittedStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(submittedStructureArray, SUBMITTEDSTRUCTURE$4);
        }
    }
    
    /**
     * Sets ith "SubmittedStructure" element
     */
    public void setSubmittedStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType submittedStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType)get_store().find_element_user(SUBMITTEDSTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(submittedStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType insertNewSubmittedStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType)get_store().insert_element_user(SUBMITTEDSTRUCTURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType addNewSubmittedStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.registry.SubmittedStructureType)get_store().add_element_user(SUBMITTEDSTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubmittedStructure" element
     */
    public void removeSubmittedStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITTEDSTRUCTURE$4, i);
        }
    }
}
