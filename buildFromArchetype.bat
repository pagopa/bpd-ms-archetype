@SETLOCAL ENABLEDELAYEDEXPANSION

@SET MNAME=test-service
@SET MNAME_CAMEL=TestService
@SET MNAME_UPPER=TEST_SERVICE
@SET MNAME_PACKAGE=test_service

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
	-DmsPackageName=%MNAME_PACKAGE%

@ENDLOCAL