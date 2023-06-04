SUMMARY = "go.mod: google.golang.org/genproto"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/genproto"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-genproto-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-accessapproval-native \
    cloud.google.com-go-accesscontextmanager-native \
    cloud.google.com-go-aiplatform-native \
    cloud.google.com-go-analytics-native \
    cloud.google.com-go-apigateway-native \
    cloud.google.com-go-apigeeconnect-native \
    cloud.google.com-go-apigeeregistry-native \
    cloud.google.com-go-appengine-native \
    cloud.google.com-go-area120-native \
    cloud.google.com-go-artifactregistry-native \
    cloud.google.com-go-asset-native \
    cloud.google.com-go-assuredworkloads-native \
    cloud.google.com-go-automl-native \
    cloud.google.com-go-baremetalsolution-native \
    cloud.google.com-go-batch-native \
    cloud.google.com-go-beyondcorp-native \
    cloud.google.com-go-bigquery-native \
    cloud.google.com-go-billing-native \
    cloud.google.com-go-binaryauthorization-native \
    cloud.google.com-go-certificatemanager-native \
    cloud.google.com-go-channel-native \
    cloud.google.com-go-cloudbuild-native \
    cloud.google.com-go-clouddms-native \
    cloud.google.com-go-cloudtasks-native \
    cloud.google.com-go-compute-native \
    cloud.google.com-go-contactcenterinsights-native \
    cloud.google.com-go-container-native \
    cloud.google.com-go-containeranalysis-native \
    cloud.google.com-go-datacatalog-native \
    cloud.google.com-go-dataflow-native \
    cloud.google.com-go-dataform-native \
    cloud.google.com-go-datafusion-native \
    cloud.google.com-go-datalabeling-native \
    cloud.google.com-go-dataplex-native \
    cloud.google.com-go-dataproc-native \
    cloud.google.com-go-dataqna-native \
    cloud.google.com-go-datastore-native \
    cloud.google.com-go-datastream-native \
    cloud.google.com-go-deploy-native \
    cloud.google.com-go-dialogflow-native \
    cloud.google.com-go-dlp-native \
    cloud.google.com-go-documentai-native \
    cloud.google.com-go-domains-native \
    cloud.google.com-go-edgecontainer-native \
    cloud.google.com-go-errorreporting-native \
    cloud.google.com-go-essentialcontacts-native \
    cloud.google.com-go-eventarc-native \
    cloud.google.com-go-filestore-native \
    cloud.google.com-go-firestore-native \
    cloud.google.com-go-functions-native \
    cloud.google.com-go-gaming-native \
    cloud.google.com-go-gkebackup-native \
    cloud.google.com-go-gkeconnect-native \
    cloud.google.com-go-gkehub-native \
    cloud.google.com-go-gkemulticloud-native \
    cloud.google.com-go-gsuiteaddons-native \
    cloud.google.com-go-iam-native \
    cloud.google.com-go-iap-native \
    cloud.google.com-go-ids-native \
    cloud.google.com-go-iot-native \
    cloud.google.com-go-kms-native \
    cloud.google.com-go-language-native \
    cloud.google.com-go-lifesciences-native \
    cloud.google.com-go-logging-native \
    cloud.google.com-go-longrunning-native \
    cloud.google.com-go-managedidentities-native \
    cloud.google.com-go-maps-native \
    cloud.google.com-go-mediatranslation-native \
    cloud.google.com-go-memcache-native \
    cloud.google.com-go-metastore-native \
    cloud.google.com-go-monitoring-native \
    cloud.google.com-go-native \
    cloud.google.com-go-networkconnectivity-native \
    cloud.google.com-go-networkmanagement-native \
    cloud.google.com-go-networksecurity-native \
    cloud.google.com-go-notebooks-native \
    cloud.google.com-go-optimization-native \
    cloud.google.com-go-orchestration-native \
    cloud.google.com-go-orgpolicy-native \
    cloud.google.com-go-osconfig-native \
    cloud.google.com-go-oslogin-native \
    cloud.google.com-go-phishingprotection-native \
    cloud.google.com-go-policytroubleshooter-native \
    cloud.google.com-go-privatecatalog-native \
    cloud.google.com-go-pubsub-native \
    cloud.google.com-go-pubsublite-native \
    cloud.google.com-go-recaptchaenterprise-v2-native \
    cloud.google.com-go-recommendationengine-native \
    cloud.google.com-go-recommender-native \
    cloud.google.com-go-redis-native \
    cloud.google.com-go-resourcemanager-native \
    cloud.google.com-go-resourcesettings-native \
    cloud.google.com-go-retail-native \
    cloud.google.com-go-run-native \
    cloud.google.com-go-scheduler-native \
    cloud.google.com-go-secretmanager-native \
    cloud.google.com-go-security-native \
    cloud.google.com-go-securitycenter-native \
    cloud.google.com-go-servicedirectory-native \
    cloud.google.com-go-shell-native \
    cloud.google.com-go-spanner-native \
    cloud.google.com-go-speech-native \
    cloud.google.com-go-storagetransfer-native \
    cloud.google.com-go-talent-native \
    cloud.google.com-go-texttospeech-native \
    cloud.google.com-go-tpu-native \
    cloud.google.com-go-trace-native \
    cloud.google.com-go-translate-native \
    cloud.google.com-go-video-native \
    cloud.google.com-go-videointelligence-native \
    cloud.google.com-go-vision-v2-native \
    cloud.google.com-go-vmmigration-native \
    cloud.google.com-go-vmwareengine-native \
    cloud.google.com-go-vpcaccess-native \
    cloud.google.com-go-webrisk-native \
    cloud.google.com-go-websecurityscanner-native \
    cloud.google.com-go-workflows-native \
    github.com-golang-protobuf-native \
    google.golang.org-genproto-googleapis-api-native \
    google.golang.org-genproto-googleapis-rpc-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "google.golang.org/genproto"

inherit gosrc
inherit native
