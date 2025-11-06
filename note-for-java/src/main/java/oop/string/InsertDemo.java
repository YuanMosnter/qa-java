package oop.string;

import java.util.Arrays;

public class InsertDemo {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        System.out.println(Arrays.toString(fields));
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        System.out.println(
                "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO: fields [name,position,salary]

        StringBuilder sb = new StringBuilder();
        String columns = String.join(", ",fields);

        // 拼接 ?,?,?
        StringBuilder placeholder = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            placeholder.append("?");
            if (i< fields.length-1 ){
                placeholder.append(", ");
            }

        }
        System.out.println(placeholder);

       return "INSERT INTO "+table+" ("+columns+")" +" VALUES " +"("+placeholder+")" ;



    }
}
