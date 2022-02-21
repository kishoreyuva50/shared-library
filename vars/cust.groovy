def call(String CustStage){

if ("${CustStage}" == "Maven")
	{
	echo " This Value is Maven"
	}
else if ("${CustStage}" == "Gradle")
	{
	echo " This Value is Gradle"
	}
else if ("${CustStage}" == "Gradle-6.8")
	{
	echo " This Value is Gradle-6.8"
	}
else if ("${CustStage}" == "node")
	{
	echo " This value is Node"
	}
}
