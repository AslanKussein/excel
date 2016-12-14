/*
 * XML Type:  SheetType
 * Namespace: 
 * Java type: noNamespace.SheetType
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * An XML SheetType(@).
 *
 * This is a complex type.
 */
public interface SheetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SheetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC44BAE5678CB4F42A46057206F068F9").resolveHandle("sheettype54d0type");
    
    /**
     * Gets array of all "Row" elements
     */
    noNamespace.RowType[] getRowArray();
    
    /**
     * Gets ith "Row" element
     */
    noNamespace.RowType getRowArray(int i);
    
    /**
     * Returns number of "Row" element
     */
    int sizeOfRowArray();
    
    /**
     * Sets array of all "Row" element
     */
    void setRowArray(noNamespace.RowType[] rowArray);
    
    /**
     * Sets ith "Row" element
     */
    void setRowArray(int i, noNamespace.RowType row);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Row" element
     */
    noNamespace.RowType insertNewRow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Row" element
     */
    noNamespace.RowType addNewRow();
    
    /**
     * Removes the ith "Row" element
     */
    void removeRow(int i);
    
    /**
     * Gets array of all "Col" elements
     */
    noNamespace.ColType[] getColArray();
    
    /**
     * Gets ith "Col" element
     */
    noNamespace.ColType getColArray(int i);
    
    /**
     * Returns number of "Col" element
     */
    int sizeOfColArray();
    
    /**
     * Sets array of all "Col" element
     */
    void setColArray(noNamespace.ColType[] colArray);
    
    /**
     * Sets ith "Col" element
     */
    void setColArray(int i, noNamespace.ColType col);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Col" element
     */
    noNamespace.ColType insertNewCol(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Col" element
     */
    noNamespace.ColType addNewCol();
    
    /**
     * Removes the ith "Col" element
     */
    void removeCol(int i);
    
    /**
     * Gets the "SheetName" attribute
     */
    java.lang.String getSheetName();
    
    /**
     * Gets (as xml) the "SheetName" attribute
     */
    org.apache.xmlbeans.XmlString xgetSheetName();
    
    /**
     * True if has "SheetName" attribute
     */
    boolean isSetSheetName();
    
    /**
     * Sets the "SheetName" attribute
     */
    void setSheetName(java.lang.String sheetName);
    
    /**
     * Sets (as xml) the "SheetName" attribute
     */
    void xsetSheetName(org.apache.xmlbeans.XmlString sheetName);
    
    /**
     * Unsets the "SheetName" attribute
     */
    void unsetSheetName();
    
    /**
     * Gets the "landScape" attribute
     */
    boolean getLandScape();
    
    /**
     * Gets (as xml) the "landScape" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLandScape();
    
    /**
     * True if has "landScape" attribute
     */
    boolean isSetLandScape();
    
    /**
     * Sets the "landScape" attribute
     */
    void setLandScape(boolean landScape);
    
    /**
     * Sets (as xml) the "landScape" attribute
     */
    void xsetLandScape(org.apache.xmlbeans.XmlBoolean landScape);
    
    /**
     * Unsets the "landScape" attribute
     */
    void unsetLandScape();
    
    /**
     * Gets the "ColNum" attribute
     */
    int getColNum();
    
    /**
     * Gets (as xml) the "ColNum" attribute
     */
    org.apache.xmlbeans.XmlInt xgetColNum();
    
    /**
     * True if has "ColNum" attribute
     */
    boolean isSetColNum();
    
    /**
     * Sets the "ColNum" attribute
     */
    void setColNum(int colNum);
    
    /**
     * Sets (as xml) the "ColNum" attribute
     */
    void xsetColNum(org.apache.xmlbeans.XmlInt colNum);
    
    /**
     * Unsets the "ColNum" attribute
     */
    void unsetColNum();
    
    /**
     * Gets the "RowNum" attribute
     */
    int getRowNum();
    
    /**
     * Gets (as xml) the "RowNum" attribute
     */
    org.apache.xmlbeans.XmlInt xgetRowNum();
    
    /**
     * True if has "RowNum" attribute
     */
    boolean isSetRowNum();
    
    /**
     * Sets the "RowNum" attribute
     */
    void setRowNum(int rowNum);
    
    /**
     * Sets (as xml) the "RowNum" attribute
     */
    void xsetRowNum(org.apache.xmlbeans.XmlInt rowNum);
    
    /**
     * Unsets the "RowNum" attribute
     */
    void unsetRowNum();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.SheetType newInstance() {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.SheetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.SheetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.SheetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.SheetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.SheetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.SheetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.SheetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.SheetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.SheetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.SheetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.SheetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.SheetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.SheetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.SheetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.SheetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.SheetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.SheetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.SheetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
