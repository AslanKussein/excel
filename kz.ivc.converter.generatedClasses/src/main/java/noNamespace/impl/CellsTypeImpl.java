/*
 * XML Type:  CellsType
 * Namespace: 
 * Java type: noNamespace.CellsType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML CellsType(@).
 *
 * This is a complex type.
 */
public class CellsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CellsType
{
    private static final long serialVersionUID = 1L;
    
    public CellsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "Value");
    private static final javax.xml.namespace.QName INDEX$2 = 
        new javax.xml.namespace.QName("", "index");
    private static final javax.xml.namespace.QName WIDTH$4 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName BOLD$6 = 
        new javax.xml.namespace.QName("", "bold");
    private static final javax.xml.namespace.QName ITALIC$8 = 
        new javax.xml.namespace.QName("", "italic");
    private static final javax.xml.namespace.QName UNDERLINE$10 = 
        new javax.xml.namespace.QName("", "underline");
    private static final javax.xml.namespace.QName TEXTALIGN$12 = 
        new javax.xml.namespace.QName("", "text_align");
    private static final javax.xml.namespace.QName BORDERTOP$14 = 
        new javax.xml.namespace.QName("", "border_top");
    private static final javax.xml.namespace.QName BORDERRIGHT$16 = 
        new javax.xml.namespace.QName("", "border_right");
    private static final javax.xml.namespace.QName BORDERBOTTOM$18 = 
        new javax.xml.namespace.QName("", "border_bottom");
    private static final javax.xml.namespace.QName BORDERLEFT$20 = 
        new javax.xml.namespace.QName("", "border_left");
    
    
    /**
     * Gets the "Value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "index" attribute
     */
    public int getIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEX$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "index" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INDEX$2);
            return target;
        }
    }
    
    /**
     * True if has "index" attribute
     */
    public boolean isSetIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDEX$2) != null;
        }
    }
    
    /**
     * Sets the "index" attribute
     */
    public void setIndex(int index)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEX$2);
            }
            target.setIntValue(index);
        }
    }
    
    /**
     * Sets (as xml) the "index" attribute
     */
    public void xsetIndex(org.apache.xmlbeans.XmlInt index)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INDEX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(INDEX$2);
            }
            target.set(index);
        }
    }
    
    /**
     * Unsets the "index" attribute
     */
    public void unsetIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDEX$2);
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public double getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(WIDTH$4);
            }
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(WIDTH$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$4) != null;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(double width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$4);
            }
            target.setDoubleValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlDouble width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(WIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(WIDTH$4);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$4);
        }
    }
    
    /**
     * Gets the "bold" attribute
     */
    public boolean getBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BOLD$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bold" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BOLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BOLD$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "bold" attribute
     */
    public boolean isSetBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BOLD$6) != null;
        }
    }
    
    /**
     * Sets the "bold" attribute
     */
    public void setBold(boolean bold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BOLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BOLD$6);
            }
            target.setBooleanValue(bold);
        }
    }
    
    /**
     * Sets (as xml) the "bold" attribute
     */
    public void xsetBold(org.apache.xmlbeans.XmlBoolean bold)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BOLD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BOLD$6);
            }
            target.set(bold);
        }
    }
    
    /**
     * Unsets the "bold" attribute
     */
    public void unsetBold()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BOLD$6);
        }
    }
    
    /**
     * Gets the "italic" attribute
     */
    public boolean getItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITALIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITALIC$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "italic" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ITALIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ITALIC$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "italic" attribute
     */
    public boolean isSetItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITALIC$8) != null;
        }
    }
    
    /**
     * Sets the "italic" attribute
     */
    public void setItalic(boolean italic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITALIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITALIC$8);
            }
            target.setBooleanValue(italic);
        }
    }
    
    /**
     * Sets (as xml) the "italic" attribute
     */
    public void xsetItalic(org.apache.xmlbeans.XmlBoolean italic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ITALIC$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ITALIC$8);
            }
            target.set(italic);
        }
    }
    
    /**
     * Unsets the "italic" attribute
     */
    public void unsetItalic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITALIC$8);
        }
    }
    
    /**
     * Gets the "underline" attribute
     */
    public byte getUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNDERLINE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNDERLINE$10);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "underline" attribute
     */
    public org.apache.xmlbeans.XmlByte xgetUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_attribute_user(UNDERLINE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_default_attribute_value(UNDERLINE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "underline" attribute
     */
    public boolean isSetUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNDERLINE$10) != null;
        }
    }
    
    /**
     * Sets the "underline" attribute
     */
    public void setUnderline(byte underline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNDERLINE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNDERLINE$10);
            }
            target.setByteValue(underline);
        }
    }
    
    /**
     * Sets (as xml) the "underline" attribute
     */
    public void xsetUnderline(org.apache.xmlbeans.XmlByte underline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_attribute_user(UNDERLINE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_attribute_user(UNDERLINE$10);
            }
            target.set(underline);
        }
    }
    
    /**
     * Unsets the "underline" attribute
     */
    public void unsetUnderline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNDERLINE$10);
        }
    }
    
    /**
     * Gets the "text_align" attribute
     */
    public short getTextAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTALIGN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEXTALIGN$12);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "text_align" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetTextAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(TEXTALIGN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_default_attribute_value(TEXTALIGN$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "text_align" attribute
     */
    public boolean isSetTextAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTALIGN$12) != null;
        }
    }
    
    /**
     * Sets the "text_align" attribute
     */
    public void setTextAlign(short textAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTALIGN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTALIGN$12);
            }
            target.setShortValue(textAlign);
        }
    }
    
    /**
     * Sets (as xml) the "text_align" attribute
     */
    public void xsetTextAlign(org.apache.xmlbeans.XmlShort textAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(TEXTALIGN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(TEXTALIGN$12);
            }
            target.set(textAlign);
        }
    }
    
    /**
     * Unsets the "text_align" attribute
     */
    public void unsetTextAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTALIGN$12);
        }
    }
    
    /**
     * Gets the "border_top" attribute
     */
    public short getBorderTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOP$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BORDERTOP$14);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "border_top" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetBorderTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERTOP$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_default_attribute_value(BORDERTOP$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "border_top" attribute
     */
    public boolean isSetBorderTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERTOP$14) != null;
        }
    }
    
    /**
     * Sets the "border_top" attribute
     */
    public void setBorderTop(short borderTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERTOP$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERTOP$14);
            }
            target.setShortValue(borderTop);
        }
    }
    
    /**
     * Sets (as xml) the "border_top" attribute
     */
    public void xsetBorderTop(org.apache.xmlbeans.XmlShort borderTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERTOP$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(BORDERTOP$14);
            }
            target.set(borderTop);
        }
    }
    
    /**
     * Unsets the "border_top" attribute
     */
    public void unsetBorderTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERTOP$14);
        }
    }
    
    /**
     * Gets the "border_right" attribute
     */
    public short getBorderRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BORDERRIGHT$16);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "border_right" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetBorderRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERRIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_default_attribute_value(BORDERRIGHT$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "border_right" attribute
     */
    public boolean isSetBorderRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERRIGHT$16) != null;
        }
    }
    
    /**
     * Sets the "border_right" attribute
     */
    public void setBorderRight(short borderRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERRIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERRIGHT$16);
            }
            target.setShortValue(borderRight);
        }
    }
    
    /**
     * Sets (as xml) the "border_right" attribute
     */
    public void xsetBorderRight(org.apache.xmlbeans.XmlShort borderRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERRIGHT$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(BORDERRIGHT$16);
            }
            target.set(borderRight);
        }
    }
    
    /**
     * Unsets the "border_right" attribute
     */
    public void unsetBorderRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERRIGHT$16);
        }
    }
    
    /**
     * Gets the "border_bottom" attribute
     */
    public short getBorderBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOM$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BORDERBOTTOM$18);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "border_bottom" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetBorderBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERBOTTOM$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_default_attribute_value(BORDERBOTTOM$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "border_bottom" attribute
     */
    public boolean isSetBorderBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERBOTTOM$18) != null;
        }
    }
    
    /**
     * Sets the "border_bottom" attribute
     */
    public void setBorderBottom(short borderBottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERBOTTOM$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERBOTTOM$18);
            }
            target.setShortValue(borderBottom);
        }
    }
    
    /**
     * Sets (as xml) the "border_bottom" attribute
     */
    public void xsetBorderBottom(org.apache.xmlbeans.XmlShort borderBottom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERBOTTOM$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(BORDERBOTTOM$18);
            }
            target.set(borderBottom);
        }
    }
    
    /**
     * Unsets the "border_bottom" attribute
     */
    public void unsetBorderBottom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERBOTTOM$18);
        }
    }
    
    /**
     * Gets the "border_left" attribute
     */
    public short getBorderLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BORDERLEFT$20);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "border_left" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetBorderLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERLEFT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_default_attribute_value(BORDERLEFT$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "border_left" attribute
     */
    public boolean isSetBorderLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDERLEFT$20) != null;
        }
    }
    
    /**
     * Sets the "border_left" attribute
     */
    public void setBorderLeft(short borderLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDERLEFT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDERLEFT$20);
            }
            target.setShortValue(borderLeft);
        }
    }
    
    /**
     * Sets (as xml) the "border_left" attribute
     */
    public void xsetBorderLeft(org.apache.xmlbeans.XmlShort borderLeft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BORDERLEFT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(BORDERLEFT$20);
            }
            target.set(borderLeft);
        }
    }
    
    /**
     * Unsets the "border_left" attribute
     */
    public void unsetBorderLeft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDERLEFT$20);
        }
    }
}
