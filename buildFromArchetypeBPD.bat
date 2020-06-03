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
	-DgroupId=it.gov.pagopa.bpd.ms^
	-DartifactId=bpd-ms-%MNAME%^
	-Dversion=1.0-SNAPSHOT^
	-Dpackage=it.gov.pagopa.bpd^
	-DmsName=%MNAME%^
	-DmsNameCamelCase=Bpd%MNAME_CAMEL%^
	-DmsNameUpperCase=BPD_%MNAME_UPPER%^
	-DmsPackageName=%MNAME_PACKAGE%^
	-DappType=bpd

@ENDLOCAL
