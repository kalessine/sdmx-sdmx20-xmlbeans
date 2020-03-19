/*
 * An XML document type.
 * Localname: CrossSectionalData
 * Namespace: http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v20.message.impl;
/**
 * A document containing one CrossSectionalData(@http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message) element.
 *
 * This is a complex type.
 */
public class CrossSectionalDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public CrossSectionalDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSECTIONALDATA$0 = 
        new javax.xml.namespace.QName("http://www.SDMX.org/resources/SDMXML/schemas/v2_0/message", "CrossSectionalData");
    
    
    /**
     * Gets the "CrossSectionalData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType getCrossSectionalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType)get_store().find_element_user(CROSSSECTIONALDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CrossSectionalData" element
     */
    public void setCrossSectionalData(org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType crossSectionalData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType)get_store().find_element_user(CROSSSECTIONALDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType)get_store().add_element_user(CROSSSECTIONALDATA$0);
            }
            target.set(crossSectionalData);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossSectionalData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType addNewCrossSectionalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v20.message.CrossSectionalDataType)get_store().add_element_user(CROSSSECTIONALDATA$0);
            return target;
        }
    }
}
