package converter;

import java.util.ArrayList;

/**
 * Created by a.amanzhol on 04.09.2015.
 */


public class SubjectSetValues {
    public static void main(String[] args) {


        ArrayList<String> columns = new ArrayList<String>();
        columns.add("ИД");
        columns.add("Код");
        columns.add("Наименование на русском");
        columns.add("Наименование на казахском");
        columns.add("Аббревиатура");


        for (String asd : columns) {

            System.out.print(asd + "///");
        }

        /*List<Subject> values = new ArrayList<Subject>();
        for (int i=0;i<16;i++){
            Subject su=new Subject();
            su.setId((long) i);
            su.setNameKz("namekz" + i);
            su.setNameRu("nameRu" + i);
            su.setCode("code" + i);
            su.setShortName("shortname");
            values.add(su);
        }

        for (Subject row:values){
            System.out.println(row.getId() + " " + row.getCode()+" "+row.getNameKz()+" "+row.getNameRu()+" "+row.getShortName());
        }*/

    }
}