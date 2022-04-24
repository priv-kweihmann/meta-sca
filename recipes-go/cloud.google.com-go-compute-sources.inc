SRC_URI += "https://proxy.golang.org/cloud.google.com/go/compute/@v/v1.6.1.zip;srcoutput=cloud.google.com/go/compute;srcinput=cloud.google.com/go/compute@v1.6.1;downloadfilename=cloud-google-com-go-compute-1.6.1.zip;name=cloud-google-com-go-compute"
SRC_URI[cloud-google-com-go-compute.sha256sum] = "fd9c29e99ad763abad551b83a41ceaab0da5212b2f684b6ac02fa1a26a014914"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/compute/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client.go;md5=3f228ff3c7fab16f3c5dfc7845375484 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client_example_test.go;md5=84d433f4cfbd6dbd7f48c4389c54d38a \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client.go;md5=29b1812620df4d314604e6a8f44133be \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client_example_test.go;md5=9a58814aea41d4733bbe4bbed559c977 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-compute-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
