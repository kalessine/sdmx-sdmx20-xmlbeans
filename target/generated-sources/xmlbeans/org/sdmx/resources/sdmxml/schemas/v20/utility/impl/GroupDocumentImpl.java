/*
 * An XML document type.
 * Localname: Group
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.utility.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.utility.impl;
/**
 * A document containing one Group(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.utility.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/utility", "Group");
    
    
    /**
     * Gets the "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.utility.GroupType)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
