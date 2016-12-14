/*
 * XML Type:  WorkspaceType
 * Namespace: 
 * Java type: noNamespace.WorkspaceType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML WorkspaceType(@).
 *
 * This is a complex type.
 */
public class WorkspaceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WorkspaceType
{
    private static final long serialVersionUID = 1L;
    
    public WorkspaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHEET$0 = 
        new javax.xml.namespace.QName("", "Sheet");
    
    
    /**
     * Gets array of all "Sheet" elements
     */
    public noNamespace.SheetType[] getSheetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHEET$0, targetList);
            noNamespace.SheetType[] result = new noNamespace.SheetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Sheet" element
     */
    public noNamespace.SheetType getSheetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SheetType target = null;
            target = (noNamespace.SheetType)get_store().find_element_user(SHEET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Sheet" element
     */
    public int sizeOfSheetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHEET$0);
        }
    }
    
    /**
     * Sets array of all "Sheet" element
     */
    public void setSheetArray(noNamespace.SheetType[] sheetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sheetArray, SHEET$0);
        }
    }
    
    /**
     * Sets ith "Sheet" element
     */
    public void setSheetArray(int i, noNamespace.SheetType sheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SheetType target = null;
            target = (noNamespace.SheetType)get_store().find_element_user(SHEET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sheet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sheet" element
     */
    public noNamespace.SheetType insertNewSheet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SheetType target = null;
            target = (noNamespace.SheetType)get_store().insert_element_user(SHEET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Sheet" element
     */
    public noNamespace.SheetType addNewSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SheetType target = null;
            target = (noNamespace.SheetType)get_store().add_element_user(SHEET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Sheet" element
     */
    public void removeSheet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHEET$0, i);
        }
    }
}
