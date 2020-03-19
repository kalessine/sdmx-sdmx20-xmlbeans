/*
 * XML Type:  HeaderType
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * An XML HeaderType(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message).
 *
 * This is a complex type.
 */
public class HeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.HeaderType
{
    private static final long serialVersionUID = 1L;
    
    public HeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "ID");
    private static final javax.xml.namespace.QName TEST$2 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Test");
    private static final javax.xml.namespace.QName TRUNCATED$4 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Truncated");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Name");
    private static final javax.xml.namespace.QName PREPARED$8 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Prepared");
    private static final javax.xml.namespace.QName SENDER$10 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Sender");
    private static final javax.xml.namespace.QName RECEIVER$12 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Receiver");
    private static final javax.xml.namespace.QName KEYFAMILYREF$14 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "KeyFamilyRef");
    private static final javax.xml.namespace.QName KEYFAMILYAGENCY$16 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "KeyFamilyAgency");
    private static final javax.xml.namespace.QName DATASETAGENCY$18 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "DataSetAgency");
    private static final javax.xml.namespace.QName DATASETID$20 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "DataSetID");
    private static final javax.xml.namespace.QName DATASETACTION$22 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "DataSetAction");
    private static final javax.xml.namespace.QName EXTRACTED$24 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Extracted");
    private static final javax.xml.namespace.QName REPORTINGBEGIN$26 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "ReportingBegin");
    private static final javax.xml.namespace.QName REPORTINGEND$28 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "ReportingEnd");
    private static final javax.xml.namespace.QName SOURCE$30 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "Source");
    
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.IDType xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v20.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.IDType)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "Test" element
     */
    public boolean getTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEST$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Test" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Test" element
     */
    public void setTest(boolean test)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEST$2);
            }
            target.setBooleanValue(test);
        }
    }
    
    /**
     * Sets (as xml) the "Test" element
     */
    public void xsetTest(org.apache.xmlbeans.XmlBoolean test)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TEST$2);
            }
            target.set(test);
        }
    }
    
    /**
     * Gets the "Truncated" element
     */
    public boolean getTruncated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRUNCATED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Truncated" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTruncated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRUNCATED$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Truncated" element
     */
    public boolean isSetTruncated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRUNCATED$4) != 0;
        }
    }
    
    /**
     * Sets the "Truncated" element
     */
    public void setTruncated(boolean truncated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRUNCATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRUNCATED$4);
            }
            target.setBooleanValue(truncated);
        }
    }
    
    /**
     * Sets (as xml) the "Truncated" element
     */
    public void xsetTruncated(org.apache.xmlbeans.XmlBoolean truncated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRUNCATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRUNCATED$4);
            }
            target.set(truncated);
        }
    }
    
    /**
     * Unsets the "Truncated" element
     */
    public void unsetTruncated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRUNCATED$4, 0);
        }
    }
    
    /**
     * Gets array of all "Name" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$6, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(NAME$6, i);
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
            return get_store().count_elements(NAME$6);
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
            arraySetterHelper(nameArray, NAME$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(NAME$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(NAME$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(NAME$6);
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
            get_store().remove_element(NAME$6, i);
        }
    }
    
    /**
     * Gets the "Prepared" element
     */
    public java.util.Calendar getPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPARED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Prepared" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType xgetPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().find_element_user(PREPARED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Prepared" element
     */
    public void setPrepared(java.util.Calendar prepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPARED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPARED$8);
            }
            target.setCalendarValue(prepared);
        }
    }
    
    /**
     * Sets (as xml) the "Prepared" element
     */
    public void xsetPrepared(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType prepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().find_element_user(PREPARED$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().add_element_user(PREPARED$8);
            }
            target.set(prepared);
        }
    }
    
    /**
     * Gets array of all "Sender" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] getSenderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SENDER$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] result = new org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Sender" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType getSenderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().find_element_user(SENDER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Sender" element
     */
    public int sizeOfSenderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDER$10);
        }
    }
    
    /**
     * Sets array of all "Sender" element
     */
    public void setSenderArray(org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] senderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(senderArray, SENDER$10);
        }
    }
    
    /**
     * Sets ith "Sender" element
     */
    public void setSenderArray(int i, org.sdmx.resources.sdmxml.schemas.v20.message.PartyType sender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().find_element_user(SENDER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sender);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sender" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType insertNewSender(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().insert_element_user(SENDER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Sender" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType addNewSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().add_element_user(SENDER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Sender" element
     */
    public void removeSender(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDER$10, i);
        }
    }
    
    /**
     * Gets array of all "Receiver" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] getReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECEIVER$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] result = new org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Receiver" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType getReceiverArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().find_element_user(RECEIVER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Receiver" element
     */
    public int sizeOfReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVER$12);
        }
    }
    
    /**
     * Sets array of all "Receiver" element
     */
    public void setReceiverArray(org.sdmx.resources.sdmxml.schemas.v20.message.PartyType[] receiverArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(receiverArray, RECEIVER$12);
        }
    }
    
    /**
     * Sets ith "Receiver" element
     */
    public void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v20.message.PartyType receiver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().find_element_user(RECEIVER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(receiver);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType insertNewReceiver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().insert_element_user(RECEIVER$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.PartyType addNewReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.PartyType)get_store().add_element_user(RECEIVER$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Receiver" element
     */
    public void removeReceiver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVER$12, i);
        }
    }
    
    /**
     * Gets the "KeyFamilyRef" element
     */
    public java.lang.String getKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYREF$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KeyFamilyRef" element
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(KEYFAMILYREF$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "KeyFamilyRef" element
     */
    public boolean isSetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYREF$14) != 0;
        }
    }
    
    /**
     * Sets the "KeyFamilyRef" element
     */
    public void setKeyFamilyRef(java.lang.String keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYREF$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILYREF$14);
            }
            target.setStringValue(keyFamilyRef);
        }
    }
    
    /**
     * Sets (as xml) the "KeyFamilyRef" element
     */
    public void xsetKeyFamilyRef(org.apache.xmlbeans.XmlNMTOKEN keyFamilyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(KEYFAMILYREF$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_element_user(KEYFAMILYREF$14);
            }
            target.set(keyFamilyRef);
        }
    }
    
    /**
     * Unsets the "KeyFamilyRef" element
     */
    public void unsetKeyFamilyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYREF$14, 0);
        }
    }
    
    /**
     * Gets the "KeyFamilyAgency" element
     */
    public java.lang.String getKeyFamilyAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYAGENCY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "KeyFamilyAgency" element
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetKeyFamilyAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(KEYFAMILYAGENCY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "KeyFamilyAgency" element
     */
    public boolean isSetKeyFamilyAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILYAGENCY$16) != 0;
        }
    }
    
    /**
     * Sets the "KeyFamilyAgency" element
     */
    public void setKeyFamilyAgency(java.lang.String keyFamilyAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYFAMILYAGENCY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYFAMILYAGENCY$16);
            }
            target.setStringValue(keyFamilyAgency);
        }
    }
    
    /**
     * Sets (as xml) the "KeyFamilyAgency" element
     */
    public void xsetKeyFamilyAgency(org.apache.xmlbeans.XmlNMTOKEN keyFamilyAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(KEYFAMILYAGENCY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_element_user(KEYFAMILYAGENCY$16);
            }
            target.set(keyFamilyAgency);
        }
    }
    
    /**
     * Unsets the "KeyFamilyAgency" element
     */
    public void unsetKeyFamilyAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILYAGENCY$16, 0);
        }
    }
    
    /**
     * Gets the "DataSetAgency" element
     */
    public java.lang.String getDataSetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETAGENCY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSetAgency" element
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetDataSetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(DATASETAGENCY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataSetAgency" element
     */
    public boolean isSetDataSetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETAGENCY$18) != 0;
        }
    }
    
    /**
     * Sets the "DataSetAgency" element
     */
    public void setDataSetAgency(java.lang.String dataSetAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETAGENCY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASETAGENCY$18);
            }
            target.setStringValue(dataSetAgency);
        }
    }
    
    /**
     * Sets (as xml) the "DataSetAgency" element
     */
    public void xsetDataSetAgency(org.apache.xmlbeans.XmlNMTOKEN dataSetAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(DATASETAGENCY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_element_user(DATASETAGENCY$18);
            }
            target.set(dataSetAgency);
        }
    }
    
    /**
     * Unsets the "DataSetAgency" element
     */
    public void unsetDataSetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETAGENCY$18, 0);
        }
    }
    
    /**
     * Gets the "DataSetID" element
     */
    public java.lang.String getDataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSetID" element
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetDataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(DATASETID$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataSetID" element
     */
    public boolean isSetDataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETID$20) != 0;
        }
    }
    
    /**
     * Sets the "DataSetID" element
     */
    public void setDataSetID(java.lang.String dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASETID$20);
            }
            target.setStringValue(dataSetID);
        }
    }
    
    /**
     * Sets (as xml) the "DataSetID" element
     */
    public void xsetDataSetID(org.apache.xmlbeans.XmlNMTOKEN dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_element_user(DATASETID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_element_user(DATASETID$20);
            }
            target.set(dataSetID);
        }
    }
    
    /**
     * Unsets the "DataSetID" element
     */
    public void unsetDataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETID$20, 0);
        }
    }
    
    /**
     * Gets the "DataSetAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum getDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETACTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSetAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.ActionType xgetDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_element_user(DATASETACTION$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataSetAction" element
     */
    public boolean isSetDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETACTION$22) != 0;
        }
    }
    
    /**
     * Sets the "DataSetAction" element
     */
    public void setDataSetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType.Enum dataSetAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETACTION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASETACTION$22);
            }
            target.setEnumValue(dataSetAction);
        }
    }
    
    /**
     * Sets (as xml) the "DataSetAction" element
     */
    public void xsetDataSetAction(org.sdmx.resources.sdmxml.schemas.v20.common.ActionType dataSetAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().find_element_user(DATASETACTION$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.common.ActionType)get_store().add_element_user(DATASETACTION$22);
            }
            target.set(dataSetAction);
        }
    }
    
    /**
     * Unsets the "DataSetAction" element
     */
    public void unsetDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETACTION$22, 0);
        }
    }
    
    /**
     * Gets the "Extracted" element
     */
    public java.util.Calendar getExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACTED$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Extracted" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXTRACTED$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "Extracted" element
     */
    public boolean isSetExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRACTED$24) != 0;
        }
    }
    
    /**
     * Sets the "Extracted" element
     */
    public void setExtracted(java.util.Calendar extracted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACTED$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACTED$24);
            }
            target.setCalendarValue(extracted);
        }
    }
    
    /**
     * Sets (as xml) the "Extracted" element
     */
    public void xsetExtracted(org.apache.xmlbeans.XmlDateTime extracted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXTRACTED$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXTRACTED$24);
            }
            target.set(extracted);
        }
    }
    
    /**
     * Unsets the "Extracted" element
     */
    public void unsetExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRACTED$24, 0);
        }
    }
    
    /**
     * Gets the "ReportingBegin" element
     */
    public java.util.Calendar getReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGBEGIN$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingBegin" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType xgetReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().find_element_user(REPORTINGBEGIN$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingBegin" element
     */
    public boolean isSetReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGBEGIN$26) != 0;
        }
    }
    
    /**
     * Sets the "ReportingBegin" element
     */
    public void setReportingBegin(java.util.Calendar reportingBegin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGBEGIN$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGBEGIN$26);
            }
            target.setCalendarValue(reportingBegin);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingBegin" element
     */
    public void xsetReportingBegin(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType reportingBegin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().find_element_user(REPORTINGBEGIN$26, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().add_element_user(REPORTINGBEGIN$26);
            }
            target.set(reportingBegin);
        }
    }
    
    /**
     * Unsets the "ReportingBegin" element
     */
    public void unsetReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGBEGIN$26, 0);
        }
    }
    
    /**
     * Gets the "ReportingEnd" element
     */
    public java.util.Calendar getReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGEND$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingEnd" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType xgetReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().find_element_user(REPORTINGEND$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingEnd" element
     */
    public boolean isSetReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGEND$28) != 0;
        }
    }
    
    /**
     * Sets the "ReportingEnd" element
     */
    public void setReportingEnd(java.util.Calendar reportingEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGEND$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGEND$28);
            }
            target.setCalendarValue(reportingEnd);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingEnd" element
     */
    public void xsetReportingEnd(org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType reportingEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().find_element_user(REPORTINGEND$28, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.HeaderTimeType)get_store().add_element_user(REPORTINGEND$28);
            }
            target.set(reportingEnd);
        }
    }
    
    /**
     * Unsets the "ReportingEnd" element
     */
    public void unsetReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGEND$28, 0);
        }
    }
    
    /**
     * Gets array of all "Source" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$30, targetList);
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v20.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(SOURCE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$30);
        }
    }
    
    /**
     * Sets array of all "Source" element
     */
    public void setSourceArray(org.sdmx.resources.sdmxml.schemas.v20.common.TextType[] sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$30);
        }
    }
    
    /**
     * Sets ith "Source" element
     */
    public void setSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v20.common.TextType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().find_element_user(SOURCE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().insert_element_user(SOURCE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.common.TextType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.common.TextType)get_store().add_element_user(SOURCE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "Source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$30, i);
        }
    }
}
