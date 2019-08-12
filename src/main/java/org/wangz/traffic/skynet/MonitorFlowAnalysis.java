package org.wangz.traffic.skynet;


import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.wangz.constant.Constant;

public class MonitorFlowAnalysis {

    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .appName(Constant.SPARK_APPNAME)
                .master(Constant.SPARK_RUN_MODE)
                .enableHiveSupport()
                .getOrCreate();
        JavaSparkContext sc = new JavaSparkContext(spark.sparkContext());

    }
}
