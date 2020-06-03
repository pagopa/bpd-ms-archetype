@SETLOCAL ENABLEDELAYEDEXPANSION

:: e.g.: test-service
@SET MNAME=%1
:: e.g.: TestService
@SET MNAME_CAMEL=%2
:: e.g.: TEST_SERVICE
@SET MNAME_UPPER=%3
:: e.g.: test_service
@SET MNAME_PACKAGE=%4

mvn archetype:generate -B^
	-DarchetypeGroupId=it.gov.pagopa.bpd.ms^
	-DarchetypeArtifactId=bpd-ms-archetype^
	-DarchetypeVersion=1.0-SNAPSHOT^
	-DgroupId=it.gov.pagopa.fa.ms^
	-DartifactId=fa-ms-%MNAME%^
	-Dversion=1.0-SNAPSHOT^
	-Dpackage=it.gov.pagopa.fa^
	-DmsName=%MNAME%^
	-DmsNameCamelCase=Fa%MNAME_CAMEL%^
	-DmsNameUpperCase=FA_%MNAME_UPPER%^
	-DmsPackageName=%MNAME_PACKAGE%^
	-DappType=fa

@ENDLOCAL
