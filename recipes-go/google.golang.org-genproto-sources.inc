SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20230530153820-e85fd2cbaebc.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20230530153820-e85fd2cbaebc;downloadfilename=google-golang-org-genproto-0.0.0-20230530153820-e85fd2cbaebc.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "aef9c5e2e180545376c7a95ffa72f8e45a014a2239450e7facc405da95563a07"
GOSRC_REMOVEDIRS += "google.golang.org/genproto/googleapis/analytics/admin/v1alpha google.golang.org/genproto/googleapis/cloud/tasks/v2beta google.golang.org/genproto/googleapis/cloud/tasks/v2beta2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-accessapproval-sources.inc', '', 'cloud.google.com-go-accessapproval-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-accesscontextmanager-sources.inc', '', 'cloud.google.com-go-accesscontextmanager-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-aiplatform-sources.inc', '', 'cloud.google.com-go-aiplatform-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-analytics-sources.inc', '', 'cloud.google.com-go-analytics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-apigateway-sources.inc', '', 'cloud.google.com-go-apigateway-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-apigeeconnect-sources.inc', '', 'cloud.google.com-go-apigeeconnect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-apigeeregistry-sources.inc', '', 'cloud.google.com-go-apigeeregistry-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-appengine-sources.inc', '', 'cloud.google.com-go-appengine-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-area120-sources.inc', '', 'cloud.google.com-go-area120-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-artifactregistry-sources.inc', '', 'cloud.google.com-go-artifactregistry-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-asset-sources.inc', '', 'cloud.google.com-go-asset-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-assuredworkloads-sources.inc', '', 'cloud.google.com-go-assuredworkloads-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-automl-sources.inc', '', 'cloud.google.com-go-automl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-baremetalsolution-sources.inc', '', 'cloud.google.com-go-baremetalsolution-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-batch-sources.inc', '', 'cloud.google.com-go-batch-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-beyondcorp-sources.inc', '', 'cloud.google.com-go-beyondcorp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-bigquery-sources.inc', '', 'cloud.google.com-go-bigquery-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-billing-sources.inc', '', 'cloud.google.com-go-billing-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-binaryauthorization-sources.inc', '', 'cloud.google.com-go-binaryauthorization-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-certificatemanager-sources.inc', '', 'cloud.google.com-go-certificatemanager-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-channel-sources.inc', '', 'cloud.google.com-go-channel-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-cloudbuild-sources.inc', '', 'cloud.google.com-go-cloudbuild-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-clouddms-sources.inc', '', 'cloud.google.com-go-clouddms-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-cloudtasks-sources.inc', '', 'cloud.google.com-go-cloudtasks-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-sources.inc', '', 'cloud.google.com-go-compute-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-contactcenterinsights-sources.inc', '', 'cloud.google.com-go-contactcenterinsights-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-container-sources.inc', '', 'cloud.google.com-go-container-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-containeranalysis-sources.inc', '', 'cloud.google.com-go-containeranalysis-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datacatalog-sources.inc', '', 'cloud.google.com-go-datacatalog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dataflow-sources.inc', '', 'cloud.google.com-go-dataflow-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dataform-sources.inc', '', 'cloud.google.com-go-dataform-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datafusion-sources.inc', '', 'cloud.google.com-go-datafusion-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datalabeling-sources.inc', '', 'cloud.google.com-go-datalabeling-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dataplex-sources.inc', '', 'cloud.google.com-go-dataplex-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dataproc-sources.inc', '', 'cloud.google.com-go-dataproc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dataqna-sources.inc', '', 'cloud.google.com-go-dataqna-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datastore-sources.inc', '', 'cloud.google.com-go-datastore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datastream-sources.inc', '', 'cloud.google.com-go-datastream-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-deploy-sources.inc', '', 'cloud.google.com-go-deploy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dialogflow-sources.inc', '', 'cloud.google.com-go-dialogflow-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-dlp-sources.inc', '', 'cloud.google.com-go-dlp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-documentai-sources.inc', '', 'cloud.google.com-go-documentai-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-domains-sources.inc', '', 'cloud.google.com-go-domains-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-edgecontainer-sources.inc', '', 'cloud.google.com-go-edgecontainer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-errorreporting-sources.inc', '', 'cloud.google.com-go-errorreporting-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-essentialcontacts-sources.inc', '', 'cloud.google.com-go-essentialcontacts-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-eventarc-sources.inc', '', 'cloud.google.com-go-eventarc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-filestore-sources.inc', '', 'cloud.google.com-go-filestore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-firestore-sources.inc', '', 'cloud.google.com-go-firestore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-functions-sources.inc', '', 'cloud.google.com-go-functions-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-gaming-sources.inc', '', 'cloud.google.com-go-gaming-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-gkebackup-sources.inc', '', 'cloud.google.com-go-gkebackup-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-gkeconnect-sources.inc', '', 'cloud.google.com-go-gkeconnect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-gkehub-sources.inc', '', 'cloud.google.com-go-gkehub-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-gkemulticloud-sources.inc', '', 'cloud.google.com-go-gkemulticloud-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-gsuiteaddons-sources.inc', '', 'cloud.google.com-go-gsuiteaddons-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-iam-sources.inc', '', 'cloud.google.com-go-iam-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-iap-sources.inc', '', 'cloud.google.com-go-iap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-ids-sources.inc', '', 'cloud.google.com-go-ids-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-iot-sources.inc', '', 'cloud.google.com-go-iot-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-kms-sources.inc', '', 'cloud.google.com-go-kms-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-language-sources.inc', '', 'cloud.google.com-go-language-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-lifesciences-sources.inc', '', 'cloud.google.com-go-lifesciences-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-logging-sources.inc', '', 'cloud.google.com-go-logging-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-longrunning-sources.inc', '', 'cloud.google.com-go-longrunning-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-managedidentities-sources.inc', '', 'cloud.google.com-go-managedidentities-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-maps-sources.inc', '', 'cloud.google.com-go-maps-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-mediatranslation-sources.inc', '', 'cloud.google.com-go-mediatranslation-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-memcache-sources.inc', '', 'cloud.google.com-go-memcache-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-metastore-sources.inc', '', 'cloud.google.com-go-metastore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-monitoring-sources.inc', '', 'cloud.google.com-go-monitoring-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-networkconnectivity-sources.inc', '', 'cloud.google.com-go-networkconnectivity-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-networkmanagement-sources.inc', '', 'cloud.google.com-go-networkmanagement-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-networksecurity-sources.inc', '', 'cloud.google.com-go-networksecurity-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-notebooks-sources.inc', '', 'cloud.google.com-go-notebooks-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-optimization-sources.inc', '', 'cloud.google.com-go-optimization-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-orchestration-sources.inc', '', 'cloud.google.com-go-orchestration-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-orgpolicy-sources.inc', '', 'cloud.google.com-go-orgpolicy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-osconfig-sources.inc', '', 'cloud.google.com-go-osconfig-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-oslogin-sources.inc', '', 'cloud.google.com-go-oslogin-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-phishingprotection-sources.inc', '', 'cloud.google.com-go-phishingprotection-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-policytroubleshooter-sources.inc', '', 'cloud.google.com-go-policytroubleshooter-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-privatecatalog-sources.inc', '', 'cloud.google.com-go-privatecatalog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-pubsub-sources.inc', '', 'cloud.google.com-go-pubsub-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-pubsublite-sources.inc', '', 'cloud.google.com-go-pubsublite-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-recaptchaenterprise-v2-sources.inc', '', 'cloud.google.com-go-recaptchaenterprise-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-recommendationengine-sources.inc', '', 'cloud.google.com-go-recommendationengine-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-recommender-sources.inc', '', 'cloud.google.com-go-recommender-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-redis-sources.inc', '', 'cloud.google.com-go-redis-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-resourcemanager-sources.inc', '', 'cloud.google.com-go-resourcemanager-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-resourcesettings-sources.inc', '', 'cloud.google.com-go-resourcesettings-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-retail-sources.inc', '', 'cloud.google.com-go-retail-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-run-sources.inc', '', 'cloud.google.com-go-run-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-scheduler-sources.inc', '', 'cloud.google.com-go-scheduler-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-secretmanager-sources.inc', '', 'cloud.google.com-go-secretmanager-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-security-sources.inc', '', 'cloud.google.com-go-security-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-securitycenter-sources.inc', '', 'cloud.google.com-go-securitycenter-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-servicedirectory-sources.inc', '', 'cloud.google.com-go-servicedirectory-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-shell-sources.inc', '', 'cloud.google.com-go-shell-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-spanner-sources.inc', '', 'cloud.google.com-go-spanner-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-speech-sources.inc', '', 'cloud.google.com-go-speech-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-storagetransfer-sources.inc', '', 'cloud.google.com-go-storagetransfer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-talent-sources.inc', '', 'cloud.google.com-go-talent-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-texttospeech-sources.inc', '', 'cloud.google.com-go-texttospeech-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-tpu-sources.inc', '', 'cloud.google.com-go-tpu-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-trace-sources.inc', '', 'cloud.google.com-go-trace-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-translate-sources.inc', '', 'cloud.google.com-go-translate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-video-sources.inc', '', 'cloud.google.com-go-video-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-videointelligence-sources.inc', '', 'cloud.google.com-go-videointelligence-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-vision-v2-sources.inc', '', 'cloud.google.com-go-vision-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-vmmigration-sources.inc', '', 'cloud.google.com-go-vmmigration-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-vmwareengine-sources.inc', '', 'cloud.google.com-go-vmwareengine-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-vpcaccess-sources.inc', '', 'cloud.google.com-go-vpcaccess-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-webrisk-sources.inc', '', 'cloud.google.com-go-webrisk-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-websecurityscanner-sources.inc', '', 'cloud.google.com-go-websecurityscanner-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-workflows-sources.inc', '', 'cloud.google.com-go-workflows-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-rpc-sources.inc', '', 'google.golang.org-genproto-googleapis-rpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
