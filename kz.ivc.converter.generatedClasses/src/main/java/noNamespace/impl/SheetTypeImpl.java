/*
 * XML Type:  SheetType
 * Namespace: 
 * Java type: noNamespace.SheetType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML SheetType(@).
 *
 * This is a complex type.
 */
public class SheetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SheetType
{
    private static final long serialVersionUID = 1L;
    
    public SheetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROW$0 = 
        new javax.xml.namespace.QName("", "Row");
    private static final javax.xml.namespace.QName COL$2 = 
        new javax.xml.namespace.QName("", "Col");
    private static final javax.xml.namespace.QName SHEETNAME$4 = 
        new javax.xml.namespace.QName("", "SheetName");
    private static final javax.xml.namespace.QName LANDSCAPE$6 = 
        new javax.xml.namespace.QName("", "landScape");
    private static final javax.xml.namespace.QName COLNUM$8 = 
        new javax.xml.namespace.QName("", "ColNum");
    private static final javax.xml.namespace.QName ROWNUM$10 = 
        new javax.xml.namespace.QName("", "RowNum");
    
    
    /**
     * Gets array of all "Row" elements
     */
    public noNamespace.RowType[] getRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROW$0, targetList);
            noNamespace.RowType[] result = new noNamespace.RowType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Row" element
     */
    public noNamespace.RowType getRowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RowType target = null;
            target = (noNamespace.RowType)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Row" element
     */
    public int sizeOfRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROW$0);
        }
    }
    
    /**
     * Sets array of all "Row" element
     */
    public void setRowArray(noNamespace.RowType[] rowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rowArray, ROW$0);
        }
    }
    
    /**
     * Sets ith "Row" element
     */
    public void setRowArray(int i, noNamespace.RowType row)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RowType target = null;
            target = (noNamespace.RowType)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(row);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Row" element
     */
    public noNamespace.RowType insertNewRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RowType target = null;
            target = (noNamespace.RowType)get_store().insert_element_user(ROW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Row" element
     */
    public noNamespace.RowType addNewRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RowType target = null;
            target = (noNamespace.RowType)get_store().add_element_user(ROW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Row" element
     */
    public void removeRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROW$0, i);
        }
    }
    
    /**
     * Gets array of all "Col" elements
     */
    public noNamespace.ColType[] getColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COL$2, targetList);
            noNamespace.ColType[] result = new noNamespace.ColType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Col" element
     */
    public noNamespace.ColType getColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ColType target = null;
            target = (noNamespace.ColType)get_store().find_element_user(COL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Col" element
     */
    public int sizeOfColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COL$2);
        }
    }
    
    /**
     * Sets array of all "Col" element
     */
    public void setColArray(noNamespace.ColType[] colArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colArray, COL$2);
        }
    }
    
    /**
     * Sets ith "Col" element
     */
    public void setColArray(int i, noNamespace.ColType col)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ColType target = null;
            target = (noNamespace.ColType)get_store().find_element_user(COL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(col);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Col" element
     */
    public noNamespace.ColType insertNewCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ColType target = null;
            target = (noNamespace.ColType)get_store().insert_element_user(COL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Col" element
     */
    public noNamespace.ColType addNewCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ColType target = null;
            target = (noNamespace.ColType)get_store().add_element_user(COL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Col" element
     */
    public void removeCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COL$2, i);
        }
    }
    
    /**
     * Gets the "SheetName" attribute
     */
    public java.lang.String getSheetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SheetName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSheetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHEETNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "SheetName" attribute
     */
    public boolean isSetSheetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHEETNAME$4) != null;
        }
    }
    
    /**
     * Sets the "SheetName" attribute
     */
    public void setSheetName(java.lang.String sheetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEETNAME$4);
            }
            target.setStringValue(sheetName);
        }
    }
    
    /**
     * Sets (as xml) the "SheetName" attribute
     */
    public void xsetSheetName(org.apache.xmlbeans.XmlString sheetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SHEETNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SHEETNAME$4);
            }
            target.set(sheetName);
        }
    }
    
    /**
     * Unsets the "SheetName" attribute
     */
    public void unsetSheetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHEETNAME$4);
        }
    }
    
    /**
     * Gets the "landScape" attribute
     */
    public boolean getLandScape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDSCAPE$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "landScape" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLandScape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LANDSCAPE$6);
            return target;
        }
    }
    
    /**
     * True if has "landScape" attribute
     */
    public boolean isSetLandScape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANDSCAPE$6) != null;
        }
    }
    
    /**
     * Sets the "landScape" attribute
     */
    public void setLandScape(boolean landScape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANDSCAPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANDSCAPE$6);
            }
            target.setBooleanValue(landScape);
        }
    }
    
    /**
     * Sets (as xml) the "landScape" attribute
     */
    public void xsetLandScape(org.apache.xmlbeans.XmlBoolean landScape)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LANDSCAPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LANDSCAPE$6);
            }
            target.set(landScape);
        }
    }
    
    /**
     * Unsets the "landScape" attribute
     */
    public void unsetLandScape()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANDSCAPE$6);
        }
    }
    
    /**
     * Gets the "ColNum" attribute
     */
    public int getColNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNUM$8);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ColNum" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetColNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COLNUM$8);
            return target;
        }
    }
    
    /**
     * True if has "ColNum" attribute
     */
    public boolean isSetColNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLNUM$8) != null;
        }
    }
    
    /**
     * Sets the "ColNum" attribute
     */
    public void setColNum(int colNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNUM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLNUM$8);
            }
            target.setIntValue(colNum);
        }
    }
    
    /**
     * Sets (as xml) the "ColNum" attribute
     */
    public void xsetColNum(org.apache.xmlbeans.XmlInt colNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COLNUM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(COLNUM$8);
            }
            target.set(colNum);
        }
    }
    
    /**
     * Unsets the "ColNum" attribute
     */
    public void unsetColNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLNUM$8);
        }
    }
    
    /**
     * Gets the "RowNum" attribute
     */
    public int getRowNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWNUM$10);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RowNum" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetRowNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ROWNUM$10);
            return target;
        }
    }
    
    /**
     * True if has "RowNum" attribute
     */
    public boolean isSetRowNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWNUM$10) != null;
        }
    }
    
    /**
     * Sets the "RowNum" attribute
     */
    public void setRowNum(int rowNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWNUM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWNUM$10);
            }
            target.setIntValue(rowNum);
        }
    }
    
    /**
     * Sets (as xml) the "RowNum" attribute
     */
    public void xsetRowNum(org.apache.xmlbeans.XmlInt rowNum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ROWNUM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ROWNUM$10);
            }
            target.set(rowNum);
        }
    }
    
    /**
     * Unsets the "RowNum" attribute
     */
    public void unsetRowNum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWNUM$10);
        }
    }
}
