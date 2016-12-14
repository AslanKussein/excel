/*
 * XML Type:  ColType
 * Namespace: 
 * Java type: noNamespace.ColType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML ColType(@).
 *
 * This is a complex type.
 */
public class ColTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ColType
{
    private static final long serialVersionUID = 1L;
    
    public ColTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMN$0 = 
        new javax.xml.namespace.QName("", "Column");
    private static final javax.xml.namespace.QName COLNAME$2 = 
        new javax.xml.namespace.QName("", "ColName");
    private static final javax.xml.namespace.QName COLINDEX$4 = 
        new javax.xml.namespace.QName("", "ColIndex");
    
    
    /**
     * Gets the "Column" element
     */
    public java.lang.String getColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Column" element
     */
    public org.apache.xmlbeans.XmlString xgetColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Column" element
     */
    public void setColumn(java.lang.String column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMN$0);
            }
            target.setStringValue(column);
        }
    }
    
    /**
     * Sets (as xml) the "Column" element
     */
    public void xsetColumn(org.apache.xmlbeans.XmlString column)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMN$0);
            }
            target.set(column);
        }
    }
    
    /**
     * Gets the "ColName" attribute
     */
    public java.lang.String getColName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "ColName" attribute
     */
    public boolean isSetColName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLNAME$2) != null;
        }
    }
    
    /**
     * Sets the "ColName" attribute
     */
    public void setColName(java.lang.String colName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLNAME$2);
            }
            target.setStringValue(colName);
        }
    }
    
    /**
     * Sets (as xml) the "ColName" attribute
     */
    public void xsetColName(org.apache.xmlbeans.XmlString colName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLNAME$2);
            }
            target.set(colName);
        }
    }
    
    /**
     * Unsets the "ColName" attribute
     */
    public void unsetColName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLNAME$2);
        }
    }
    
    /**
     * Gets the "ColIndex" attribute
     */
    public int getColIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLINDEX$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColIndex" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetColIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COLINDEX$4);
            return target;
        }
    }
    
    /**
     * True if has "ColIndex" attribute
     */
    public boolean isSetColIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLINDEX$4) != null;
        }
    }
    
    /**
     * Sets the "ColIndex" attribute
     */
    public void setColIndex(int colIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLINDEX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLINDEX$4);
            }
            target.setIntValue(colIndex);
        }
    }
    
    /**
     * Sets (as xml) the "ColIndex" attribute
     */
    public void xsetColIndex(org.apache.xmlbeans.XmlInt colIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COLINDEX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(COLINDEX$4);
            }
            target.set(colIndex);
        }
    }
    
    /**
     * Unsets the "ColIndex" attribute
     */
    public void unsetColIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLINDEX$4);
        }
    }
}
