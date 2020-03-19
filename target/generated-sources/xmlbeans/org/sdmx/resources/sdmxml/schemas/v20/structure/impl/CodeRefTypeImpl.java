/*
 * XML Type:  CodeRefType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.structure.impl;
/**
 * An XML CodeRefType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure).
 *
 * This is a complex type.
 */
public class CodeRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType
{
    private static final long serialVersionUID = 1L;
    
    public CodeRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "URN");
    private static final javax.xml.namespace.QName CODELISTALIASREF$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodelistAliasRef");
    private static final javax.xml.namespace.QName CODEID$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodeID");
    private static final javax.xml.namespace.QName CODEREF$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "CodeRef");
    private static final javax.xml.namespace.QName LEVELREF$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "LevelRef");
    private static final javax.xml.namespace.QName NODEALIASID$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "NodeAliasID");
    private static final javax.xml.namespace.QName VERSION$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "Version");
    private static final javax.xml.namespace.QName VALIDFROM$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/structure", "ValidTo");
    
    
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
     * Gets the "CodelistAliasRef" element
     */
    public java.lang.String getCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODELISTALIASREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodelistAliasRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CODELISTALIASREF$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodelistAliasRef" element
     */
    public boolean isSetCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTALIASREF$2) != 0;
        }
    }
    
    /**
     * Sets the "CodelistAliasRef" element
     */
    public void setCodelistAliasRef(java.lang.String codelistAliasRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODELISTALIASREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODELISTALIASREF$2);
            }
            target.setStringValue(codelistAliasRef);
        }
    }
    
    /**
     * Sets (as xml) the "CodelistAliasRef" element
     */
    public void xsetCodelistAliasRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codelistAliasRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CODELISTALIASREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CODELISTALIASREF$2);
            }
            target.set(codelistAliasRef);
        }
    }
    
    /**
     * Unsets the "CodelistAliasRef" element
     */
    public void unsetCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTALIASREF$2, 0);
        }
    }
    
    /**
     * Gets the "CodeID" element
     */
    public java.lang.String getCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodeID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CODEID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodeID" element
     */
    public boolean isSetCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEID$4) != 0;
        }
    }
    
    /**
     * Sets the "CodeID" element
     */
    public void setCodeID(java.lang.String codeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEID$4);
            }
            target.setStringValue(codeID);
        }
    }
    
    /**
     * Sets (as xml) the "CodeID" element
     */
    public void xsetCodeID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType codeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(CODEID$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(CODEID$4);
            }
            target.set(codeID);
        }
    }
    
    /**
     * Unsets the "CodeID" element
     */
    public void unsetCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEID$4, 0);
        }
    }
    
    /**
     * Gets array of all "CodeRef" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType[] getCodeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODEREF$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType[] result = new org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType getCodeRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType)get_store().find_element_user(CODEREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodeRef" element
     */
    public int sizeOfCodeRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEREF$6);
        }
    }
    
    /**
     * Sets array of all "CodeRef" element
     */
    public void setCodeRefArray(org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType[] codeRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeRefArray, CODEREF$6);
        }
    }
    
    /**
     * Sets ith "CodeRef" element
     */
    public void setCodeRefArray(int i, org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType codeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType)get_store().find_element_user(CODEREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codeRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType insertNewCodeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType)get_store().insert_element_user(CODEREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodeRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType addNewCodeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.structure.CodeRefType)get_store().add_element_user(CODEREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodeRef" element
     */
    public void removeCodeRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEREF$6, i);
        }
    }
    
    /**
     * Gets the "LevelRef" element
     */
    public java.lang.String getLevelRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVELREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LevelRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetLevelRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(LEVELREF$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "LevelRef" element
     */
    public boolean isSetLevelRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEVELREF$8) != 0;
        }
    }
    
    /**
     * Sets the "LevelRef" element
     */
    public void setLevelRef(java.lang.String levelRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVELREF$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEVELREF$8);
            }
            target.setStringValue(levelRef);
        }
    }
    
    /**
     * Sets (as xml) the "LevelRef" element
     */
    public void xsetLevelRef(org.sdmx.resources.sdmxml.schemas.v20.common.IDType levelRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(LEVELREF$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(LEVELREF$8);
            }
            target.set(levelRef);
        }
    }
    
    /**
     * Unsets the "LevelRef" element
     */
    public void unsetLevelRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEVELREF$8, 0);
        }
    }
    
    /**
     * Gets the "NodeAliasID" element
     */
    public java.lang.String getNodeAliasID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODEALIASID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NodeAliasID" element
     */
    public org.apache.xmlbeans.XmlString xgetNodeAliasID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NODEALIASID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "NodeAliasID" element
     */
    public boolean isSetNodeAliasID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NODEALIASID$10) != 0;
        }
    }
    
    /**
     * Sets the "NodeAliasID" element
     */
    public void setNodeAliasID(java.lang.String nodeAliasID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODEALIASID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NODEALIASID$10);
            }
            target.setStringValue(nodeAliasID);
        }
    }
    
    /**
     * Sets (as xml) the "NodeAliasID" element
     */
    public void xsetNodeAliasID(org.apache.xmlbeans.XmlString nodeAliasID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NODEALIASID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NODEALIASID$10);
            }
            target.set(nodeAliasID);
        }
    }
    
    /**
     * Unsets the "NodeAliasID" element
     */
    public void unsetNodeAliasID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NODEALIASID$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
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
            return get_store().count_elements(VERSION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$12);
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
            get_store().remove_element(VERSION$12, 0);
        }
    }
    
    /**
     * Gets the "ValidFrom" element
     */
    public java.lang.Object getValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDFROM$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidFrom" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(VALIDFROM$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidFrom" element
     */
    public boolean isSetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDFROM$14) != 0;
        }
    }
    
    /**
     * Sets the "ValidFrom" element
     */
    public void setValidFrom(java.lang.Object validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDFROM$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDFROM$14);
            }
            target.setObjectValue(validFrom);
        }
    }
    
    /**
     * Sets (as xml) the "ValidFrom" element
     */
    public void xsetValidFrom(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(VALIDFROM$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_element_user(VALIDFROM$14);
            }
            target.set(validFrom);
        }
    }
    
    /**
     * Unsets the "ValidFrom" element
     */
    public void unsetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDFROM$14, 0);
        }
    }
    
    /**
     * Gets the "ValidTo" element
     */
    public java.lang.Object getValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDTO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidTo" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType xgetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(VALIDTO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ValidTo" element
     */
    public boolean isSetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDTO$16) != 0;
        }
    }
    
    /**
     * Sets the "ValidTo" element
     */
    public void setValidTo(java.lang.Object validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDTO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDTO$16);
            }
            target.setObjectValue(validTo);
        }
    }
    
    /**
     * Sets (as xml) the "ValidTo" element
     */
    public void xsetValidTo(org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().find_element_user(VALIDTO$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.TimePeriodType)get_store().add_element_user(VALIDTO$16);
            }
            target.set(validTo);
        }
    }
    
    /**
     * Unsets the "ValidTo" element
     */
    public void unsetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDTO$16, 0);
        }
    }
}
