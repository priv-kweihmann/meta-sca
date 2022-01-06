SRC_URI += "https://proxy.golang.org/cloud.google.com/go/compute/@v/v0.1.0.zip;srcoutput=cloud.google.com/go/compute;srcinput=cloud.google.com/go/compute@v0.1.0;downloadfilename=cloud-google-com-go-compute-0.1.0.zip;name=cloud-google-com-go-compute"
SRC_URI[cloud-google-com-go-compute.sha256sum] = "5178a3b525efe2866f1760264cb510525333457bcb21b1045e7fd432f1ce5340"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/compute/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client.go;md5=253d1f6a23f90c953bcea9a41041be60 \
    file://src/cloud.google.com/go/compute/apiv1/license_codes_client_example_test.go;md5=9751400613955af6df604db0eb67603a \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client.go;md5=05643b06ddfd30b0216cc9563ea050cc \
    file://src/cloud.google.com/go/compute/apiv1/licenses_client_example_test.go;md5=c94b296ea4c8d8935c8be544c9343608 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-compute-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
