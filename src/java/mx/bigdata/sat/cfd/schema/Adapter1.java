//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.01 at 12:09:45 PM CST 
//


package mx.bigdata.sat.cfd.schema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (mx.bigdata.sat.schema.binder.DateTimeCustomBinder.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (mx.bigdata.sat.schema.binder.DateTimeCustomBinder.printDateTime(value));
    }

}
