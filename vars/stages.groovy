def call(String stageName){

if ("${stageName}" == "scm")
	{
	echo " This stage is scm"
	}
else if ("${stageName}" == "Build")
	{
	echo " This stage is build"
	}
else if ("${stageName}" == "BuildImage")
	{
	echo " This stage is Imge Building"
	}
else if ("${stageName}" == "Deployment")
	{
	echo " This stage is Deploying in cluster"
	}
}
