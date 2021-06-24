package fr.abouopensource.github.io.session3

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .master("local[*]")
      .appName("")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()

  }
}
