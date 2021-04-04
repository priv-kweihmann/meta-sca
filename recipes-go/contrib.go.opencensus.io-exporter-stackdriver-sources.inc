SRC_URI += "https://proxy.golang.org/contrib.go.opencensus.io/exporter/stackdriver/@v/v0.13.5.zip;srcoutput=contrib.go.opencensus.io/exporter/stackdriver;srcinput=contrib.go.opencensus.io/exporter/stackdriver@v0.13.5;downloadfilename=contrib-go-opencensus-io-exporter-stackdriver-0.13.5.zip;name=contrib-go-opencensus-io-exporter-stackdriver"
SRC_URI[contrib-go-opencensus-io-exporter-stackdriver.sha256sum] = "733e3c5d605f561a8e563fa060d0efc3a7b4e295f57614465e6d9d19b09a0bb4"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/contrib.go.opencensus.io/exporter/stackdriver/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "contrib.go.opencensus.io-exporter-stackdriver-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-aws-sdk-go-sources.inc', '', 'github.com-aws-aws-sdk-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-census-instrumentation-opencensus-proto-sources.inc', '', 'github.com-census-instrumentation-opencensus-proto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jstemmer-go-junit-report-sources.inc', '', 'github.com-jstemmer-go-junit-report-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-lint-sources.inc', '', 'golang.org-x-lint-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-oauth2-sources.inc', '', 'golang.org-x-oauth2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'honnef.co-go-tools-sources.inc', '', 'honnef.co-go-tools-sources.inc', d)}
