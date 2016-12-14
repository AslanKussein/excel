/*
 * An XML document type.
 * Localname: Workspace
 * Namespace: 
 * Java type: noNamespace.WorkspaceDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one Workspace(@) element.
 *
 * This is a complex type.
 */
public class WorkspaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.WorkspaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkspaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSPACE$0 = 
        new javax.xml.namespace.QName("", "Workspace");
    
    
    /**
     * Gets the "Workspace" element
     */
    public noNamespace.WorkspaceType getWorkspace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WorkspaceType target = null;
            target = (noNamespace.WorkspaceType)get_store().find_element_user(WORKSPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Workspace" element
     */
    public void setWorkspace(noNamespace.WorkspaceType workspace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WorkspaceType target = null;
            target = (noNamespace.WorkspaceType)get_store().find_element_user(WORKSPACE$0, 0);
            if (target == null)
            {
                target = (noNamespace.WorkspaceType)get_store().add_element_user(WORKSPACE$0);
            }
            target.set(workspace);
        }
    }
    
    /**
     * Appends and returns a new empty "Workspace" element
     */
    public noNamespace.WorkspaceType addNewWorkspace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.WorkspaceType target = null;
            target = (noNamespace.WorkspaceType)get_store().add_element_user(WORKSPACE$0);
            return target;
        }
    }
}
