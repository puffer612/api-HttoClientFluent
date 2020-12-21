package com.youlu.util;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class JDBCUtils {
    //这个工具类,主要为我们获取一个数据库连接
 /*   private static String driverName = "com.mysql.jdbc.Driver" ;
    private static String url = "jdbc:mysql://192.168.28.77:3306/cucumbers";
    private static String username = "root";
    private static String password = "123456";*/
   private static String driverName = YamlUtils.getMysqlConfig().get("driverName");
   private static String url = YamlUtils.getMysqlConfig().get("driverName");
   private static String username = YamlUtils.getMysqlConfig().get("driverName");
   private static String password = YamlUtils.getMysqlConfig().get("driverName");

    //静态代码块,目的,让第一次使用到JDBCUtils中加载驱动,第二次以后不再加载了
    static{
        //1.加载驱动
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            //System.out.println("驱动加载失败..请检查驱动包");
            throw new RuntimeException("驱动加载失败..请检查驱动包");
        }
    }
    /*
    * 获取数据库的连接
    * */
    public static Connection getConnection() throws Exception{
        //2.获取和数据库的连接
        Connection conn =  DriverManager.getConnection(url, username, password);
        //3.返回连接对象
        return conn;

    }


    /*
    * 关闭所有资源
    * Connection  数据库连接
    * Statement 通过连接对象，获取sql执行对象
    * ResultSet 执行结果
    * */
    public static void closeAll(Connection conn, Statement st, ResultSet rs){
        //负责关闭
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    /*
    * 查询结果并返回一个map集合
    * Connection  数据库连接
    * Statement 通过连接对象，获取sql执行对象
    * ResultSet 执行结果
    * */
    public static Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        Connection conn = null;
        Statement statement = null;

        return map;
    }
}
