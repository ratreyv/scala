import org.apache.spark.sql.{SQLContext, SparkSession}

val spark = SparkSession.builder()
  .master("local[1]")
  .appName("SparkByExamples.com")
  .getOrCreate();

spark.sparkContext.setLogLevel("ERROR")


val sqlContext:SQLContext = spark.sqlContext

//read csv with options
val df = sqlContext.read.options(Map("inferSchema"->"true","delimiter"->",","header"->"true"))
  .csv("C:\\Users\\TEMP\\IdeaProjects\\SparkDemo\\src\\resources\\zipcodes.csv")
df.show()
df.printSchema()

df.createOrReplaceTempView("TAB")
sqlContext.sql("select * from TAB")
  .show(false)
