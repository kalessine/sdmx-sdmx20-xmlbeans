/*
 * XML Type:  ComponentsType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ComponentsType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ComponentsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ComponentsType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Dimension");
    private static final javax.xml.namespace.QName TIMEDIMENSION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "TimeDimension");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Group");
    private static final javax.xml.namespace.QName PRIMARYMEASURE$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "PrimaryMeasure");
    private static final javax.xml.namespace.QName CROSSSECTIONALMEASURE$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CrossSectionalMeasure");
    private static final javax.xml.namespace.QName ATTRIBUTE$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Attribute");
    
    
    /**
     * Gets array of all "Dimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$0);
        }
    }
    
    /**
     * Sets array of all "Dimension" element
     */
    public void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType[] dimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionArray, DIMENSION$0);
        }
    }
    
    /**
     * Sets ith "Dimension" element
     */
    public void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType)get_store().insert_element_user(DIMENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.DimensionType)get_store().add_element_user(DIMENSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$0, i);
        }
    }
    
    /**
     * Gets the "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType getTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType)get_store().find_element_user(TIMEDIMENSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeDimension" element
     */
    public boolean isSetTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDIMENSION$2) != 0;
        }
    }
    
    /**
     * Sets the "TimeDimension" element
     */
    public void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType timeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType)get_store().find_element_user(TIMEDIMENSION$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType)get_store().add_element_user(TIMEDIMENSION$2);
            }
            target.set(timeDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType addNewTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TimeDimensionType)get_store().add_element_user(TIMEDIMENSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeDimension" element
     */
    public void unsetTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDIMENSION$2, 0);
        }
    }
    
    /**
     * Gets array of all "Group" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$4);
        }
    }
    
    /**
     * Sets array of all "Group" element
     */
    public void setGroupArray(org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$4);
        }
    }
    
    /**
     * Sets ith "Group" element
     */
    public void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType)get_store().insert_element_user(GROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.GroupType)get_store().add_element_user(GROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$4, i);
        }
    }
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType getPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType)get_store().find_element_user(PRIMARYMEASURE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryMeasure" element
     */
    public void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType primaryMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType)get_store().find_element_user(PRIMARYMEASURE$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType)get_store().add_element_user(PRIMARYMEASURE$6);
            }
            target.set(primaryMeasure);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType addNewPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.PrimaryMeasureType)get_store().add_element_user(PRIMARYMEASURE$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "CrossSectionalMeasure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType[] getCrossSectionalMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CROSSSECTIONALMEASURE$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CrossSectionalMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType getCrossSectionalMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType)get_store().find_element_user(CROSSSECTIONALMEASURE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CrossSectionalMeasure" element
     */
    public int sizeOfCrossSectionalMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSSECTIONALMEASURE$8);
        }
    }
    
    /**
     * Sets array of all "CrossSectionalMeasure" element
     */
    public void setCrossSectionalMeasureArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType[] crossSectionalMeasureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(crossSectionalMeasureArray, CROSSSECTIONALMEASURE$8);
        }
    }
    
    /**
     * Sets ith "CrossSectionalMeasure" element
     */
    public void setCrossSectionalMeasureArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType crossSectionalMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType)get_store().find_element_user(CROSSSECTIONALMEASURE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(crossSectionalMeasure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CrossSectionalMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType insertNewCrossSectionalMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType)get_store().insert_element_user(CROSSSECTIONALMEASURE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CrossSectionalMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType addNewCrossSectionalMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CrossSectionalMeasureType)get_store().add_element_user(CROSSSECTIONALMEASURE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "CrossSectionalMeasure" element
     */
    public void removeCrossSectionalMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSSECTIONALMEASURE$8, i);
        }
    }
    
    /**
     * Gets array of all "Attribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType)get_store().find_element_user(ATTRIBUTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$10);
        }
    }
    
    /**
     * Sets array of all "Attribute" element
     */
    public void setAttributeArray(org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$10);
        }
    }
    
    /**
     * Sets ith "Attribute" element
     */
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType)get_store().find_element_user(ATTRIBUTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType)get_store().insert_element_user(ATTRIBUTE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.AttributeType)get_store().add_element_user(ATTRIBUTE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$10, i);
        }
    }
}
