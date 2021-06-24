package fr.abouopensource.github.io
import org.apache.spark.sql.SparkSession



object Main {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .master("local[*]")
      .appName("Spark SQL basic example")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()

    val df = spark.read
      .csv("/home/abou/IdeaProjects/best-pratices-spark/src/main/resources/address-multiline.csv")
      .cache()

    df.select("_c2").show()

    df.printSchema()

  }
}
