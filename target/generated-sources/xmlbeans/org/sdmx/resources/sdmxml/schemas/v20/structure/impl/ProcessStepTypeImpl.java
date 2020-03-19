/*
 * XML Type:  ProcessStepType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML ProcessStepType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class ProcessStepTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessStepTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Description");
    private static final javax.xml.namespace.QName INPUT$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Input");
    private static final javax.xml.namespace.QName OUTPUT$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Output");
    private static final javax.xml.namespace.QName COMPUTATION$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Computation");
    private static final javax.xml.namespace.QName TRANSITION$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Transition");
    private static final javax.xml.namespace.QName PROCESSSTEP$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ProcessStep");
    private static final javax.xml.namespace.QName ANNOTATIONS$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Annotations");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "id");
    
    
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
     * Gets array of all "Input" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] getInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUT$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum getInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Input" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] xgetInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUT$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType xgetInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().find_element_user(INPUT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)target;
        }
    }
    
    /**
     * Returns number of "Input" element
     */
    public int sizeOfInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUT$4);
        }
    }
    
    /**
     * Sets array of all "Input" element
     */
    public void setInputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] inputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputArray, INPUT$4);
        }
    }
    
    /**
     * Sets ith "Input" element
     */
    public void setInputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(input);
        }
    }
    
    /**
     * Sets (as xml) array of all "Input" element
     */
    public void xsetInputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[]inputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputArray, INPUT$4);
        }
    }
    
    /**
     * Sets (as xml) ith "Input" element
     */
    public void xsetInputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().find_element_user(INPUT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(input);
        }
    }
    
    /**
     * Inserts the value as the ith "Input" element
     */
    public void insertInput(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INPUT$4, i);
            target.setEnumValue(input);
        }
    }
    
    /**
     * Appends the value as the last "Input" element
     */
    public void addInput(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INPUT$4);
            target.setEnumValue(input);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType insertNewInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().insert_element_user(INPUT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().add_element_user(INPUT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Input" element
     */
    public void removeInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUT$4, i);
        }
    }
    
    /**
     * Gets array of all "Output" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] getOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum getOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Output" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] xgetOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType xgetOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().find_element_user(OUTPUT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)target;
        }
    }
    
    /**
     * Returns number of "Output" element
     */
    public int sizeOfOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUT$6);
        }
    }
    
    /**
     * Sets array of all "Output" element
     */
    public void setOutputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum[] outputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputArray, OUTPUT$6);
        }
    }
    
    /**
     * Sets ith "Output" element
     */
    public void setOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(output);
        }
    }
    
    /**
     * Sets (as xml) array of all "Output" element
     */
    public void xsetOutputArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType[]outputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputArray, OUTPUT$6);
        }
    }
    
    /**
     * Sets (as xml) ith "Output" element
     */
    public void xsetOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().find_element_user(OUTPUT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(output);
        }
    }
    
    /**
     * Inserts the value as the ith "Output" element
     */
    public void insertOutput(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OUTPUT$6, i);
            target.setEnumValue(output);
        }
    }
    
    /**
     * Appends the value as the last "Output" element
     */
    public void addOutput(org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType.Enum output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTPUT$6);
            target.setEnumValue(output);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType insertNewOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().insert_element_user(OUTPUT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ObjectIDType)get_store().add_element_user(OUTPUT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Output" element
     */
    public void removeOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUT$6, i);
        }
    }
    
    /**
     * Gets array of all "Computation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getComputationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPUTATION$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Computation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getComputationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(COMPUTATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Computation" element
     */
    public int sizeOfComputationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPUTATION$8);
        }
    }
    
    /**
     * Sets array of all "Computation" element
     */
    public void setComputationArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] computationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(computationArray, COMPUTATION$8);
        }
    }
    
    /**
     * Sets ith "Computation" element
     */
    public void setComputationArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType computation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(COMPUTATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(computation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Computation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewComputation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(COMPUTATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Computation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(COMPUTATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Computation" element
     */
    public void removeComputation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPUTATION$8, i);
        }
    }
    
    /**
     * Gets array of all "Transition" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType[] getTransitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSITION$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType getTransitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType)get_store().find_element_user(TRANSITION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Transition" element
     */
    public int sizeOfTransitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSITION$10);
        }
    }
    
    /**
     * Sets array of all "Transition" element
     */
    public void setTransitionArray(org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType[] transitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transitionArray, TRANSITION$10);
        }
    }
    
    /**
     * Sets ith "Transition" element
     */
    public void setTransitionArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType transition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType)get_store().find_element_user(TRANSITION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType insertNewTransition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType)get_store().insert_element_user(TRANSITION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType addNewTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.TransitionType)get_store().add_element_user(TRANSITION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Transition" element
     */
    public void removeTransition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSITION$10, i);
        }
    }
    
    /**
     * Gets array of all "ProcessStep" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType[] getProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSSTEP$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType getProcessStepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType)get_store().find_element_user(PROCESSSTEP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProcessStep" element
     */
    public int sizeOfProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSSTEP$12);
        }
    }
    
    /**
     * Sets array of all "ProcessStep" element
     */
    public void setProcessStepArray(org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType[] processStepArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processStepArray, PROCESSSTEP$12);
        }
    }
    
    /**
     * Sets ith "ProcessStep" element
     */
    public void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType processStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType)get_store().find_element_user(PROCESSSTEP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processStep);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType insertNewProcessStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType)get_store().insert_element_user(PROCESSSTEP$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType addNewProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.ProcessStepType)get_store().add_element_user(PROCESSSTEP$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProcessStep" element
     */
    public void removeProcessStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSSTEP$12, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$14, 0);
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
            return get_store().count_elements(ANNOTATIONS$14) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$14);
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
            get_store().remove_element(ANNOTATIONS$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_attribute_user(ID$16);
            }
            target.set(id);
        }
    }
}
