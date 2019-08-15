package org.wangz.traffic.skynet;


import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.wangz.traffic.constant.Constant;
import scala.collection.immutable.List;

import java.util.ArrayList;

public class MonitorFlowAnalysis {
    /**
     * 进行本地测试，模拟生成的数据也放入了 MySQL 中，分别为
     * monitor_camera_info  标准信息表，记录所有卡扣下的所有摄像头  如00001 52265 ...
     * monitor_flow_action  真实监测表，记录 * 2018-11-05	0003	21305	京W93011	2018-11-05 08:55:26	124	45	03
     * @param args
     */

    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .appName(Constant.SPARK_APPNAME)
                .master(Constant.SPARK_RUN_MODE)
                .getOrCreate();
        JavaSparkContext sc = new JavaSparkContext(spark.sparkContext());
        ArrayList list = new ArrayList();
        JavaRDD rdd = sc.parallelize(list);


    }
}
