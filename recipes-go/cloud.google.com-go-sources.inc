SRC_URI += "https://proxy.golang.org/cloud.google.com/go/@v/v0.87.0.zip;srcoutput=cloud.google.com/go;srcinput=cloud.google.com/go@v0.87.0;downloadfilename=cloud-google-com-go-0.87.0.zip;name=cloud-google-com-go"
SRC_URI[cloud-google-com-go.sha256sum] = "447413ac027910b0006ff0b1b0d76a905ad262da9c62d3867b61e6b13aee5bd8"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client.go;md5=c652900f62b858a9bb4e9b030f64e11a \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client_example_test.go;md5=2592f27d6c178290c179f3d769cd611e \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client.go;md5=462062414fa0b5a8ca901d490e21081c \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client_example_test.go;md5=d09107e44aa72a6ff682d0fd861d3d45 \
    file://src/cloud.google.com/go/third_party/pkgsite/LICENSE;md5=9d210c7471ce08e3db5261f33bf8fce6 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-storage-sources.inc', '', 'cloud.google.com-go-storage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-mock-sources.inc', '', 'github.com-golang-mock-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-martian-v3-sources.inc', '', 'github.com-google-martian-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-pprof-sources.inc', '', 'github.com-google-pprof-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jstemmer-go-junit-report-sources.inc', '', 'github.com-jstemmer-go-junit-report-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-lint-sources.inc', '', 'golang.org-x-lint-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-oauth2-sources.inc', '', 'golang.org-x-oauth2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
