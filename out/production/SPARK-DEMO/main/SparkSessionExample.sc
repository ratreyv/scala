import org.apache.spark.sql.SparkSession
val spark:SparkSession = SparkSession.builder()
  .master("local[1]")
  .appName("SparkByExamples.com")
  .getOrCreate()

println("First SparkContext:")
println("APP Name :"+spark.sparkContext.appName);
println("Deploy Mode :"+spark.sparkContext.deployMode);
println("Master :"+spark.sparkContext.master);

