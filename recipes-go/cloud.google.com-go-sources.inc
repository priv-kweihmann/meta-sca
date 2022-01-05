SRC_URI += "https://proxy.golang.org/cloud.google.com/go/@v/v0.100.1.zip;srcoutput=cloud.google.com/go;srcinput=cloud.google.com/go@v0.100.1;downloadfilename=cloud-google-com-go-0.100.1.zip;name=cloud-google-com-go"
SRC_URI[cloud-google-com-go.sha256sum] = "ca3bc64130ed4cd611175aa4a6948851d72e9f241b124cec7fb85b291051ecfc"
GOSRC_REMOVEDIRS += "cloud.google.com/go/analytics/admin/apiv1alpha/"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client.go;md5=253d1f6a23f90c953bcea9a41041be60 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client_example_test.go;md5=9751400613955af6df604db0eb67603a \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client.go;md5=05643b06ddfd30b0216cc9563ea050cc \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client_example_test.go;md5=c94b296ea4c8d8935c8be544c9343608 \
    file://src/cloud.google.com/go/third_party/pkgsite/LICENSE;md5=9d210c7471ce08e3db5261f33bf8fce6 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-martian-v3-sources.inc', '', 'github.com-google-martian-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-oauth2-sources.inc', '', 'golang.org-x-oauth2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
