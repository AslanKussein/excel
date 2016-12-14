/*
 * XML Type:  RowType
 * Namespace: 
 * Java type: noNamespace.RowType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML RowType(@).
 *
 * This is a complex type.
 */
public class RowTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RowType
{
    private static final long serialVersionUID = 1L;
    
    public RowTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEIGHT$0 = 
        new javax.xml.namespace.QName("", "height");
    private static final javax.xml.namespace.QName CELL$2 = 
        new javax.xml.namespace.QName("", "Cell");
    private static final javax.xml.namespace.QName ROWINDEX$4 = 
        new javax.xml.namespace.QName("", "row_index");
    
    
    /**
     * Gets the "height" element
     */
    public double getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "height" element
     */
    public org.apache.xmlbeans.XmlDouble xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(HEIGHT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "height" element
     */
    public void setHeight(double height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEIGHT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEIGHT$0);
            }
            target.setDoubleValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "height" element
     */
    public void xsetHeight(org.apache.xmlbeans.XmlDouble height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(HEIGHT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(HEIGHT$0);
            }
            target.set(height);
        }
    }
    
    /**
     * Gets array of all "Cell" elements
     */
    public noNamespace.CellsType[] getCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CELL$2, targetList);
            noNamespace.CellsType[] result = new noNamespace.CellsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Cell" element
     */
    public noNamespace.CellsType getCellArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CellsType target = null;
            target = (noNamespace.CellsType)get_store().find_element_user(CELL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Cell" element
     */
    public int sizeOfCellArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CELL$2);
        }
    }
    
    /**
     * Sets array of all "Cell" element
     */
    public void setCellArray(noNamespace.CellsType[] cellArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cellArray, CELL$2);
        }
    }
    
    /**
     * Sets ith "Cell" element
     */
    public void setCellArray(int i, noNamespace.CellsType cell)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CellsType target = null;
            target = (noNamespace.CellsType)get_store().find_element_user(CELL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cell);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Cell" element
     */
    public noNamespace.CellsType insertNewCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CellsType target = null;
            target = (noNamespace.CellsType)get_store().insert_element_user(CELL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Cell" element
     */
    public noNamespace.CellsType addNewCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CellsType target = null;
            target = (noNamespace.CellsType)get_store().add_element_user(CELL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Cell" element
     */
    public void removeCell(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CELL$2, i);
        }
    }
    
    /**
     * Gets the "row_index" attribute
     */
    public int getRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWINDEX$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "row_index" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ROWINDEX$4);
            return target;
        }
    }
    
    /**
     * True if has "row_index" attribute
     */
    public boolean isSetRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWINDEX$4) != null;
        }
    }
    
    /**
     * Sets the "row_index" attribute
     */
    public void setRowIndex(int rowIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWINDEX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWINDEX$4);
            }
            target.setIntValue(rowIndex);
        }
    }
    
    /**
     * Sets (as xml) the "row_index" attribute
     */
    public void xsetRowIndex(org.apache.xmlbeans.XmlInt rowIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ROWINDEX$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ROWINDEX$4);
            }
            target.set(rowIndex);
        }
    }
    
    /**
     * Unsets the "row_index" attribute
     */
    public void unsetRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWINDEX$4);
        }
    }
}
