SRC_URI += "https://proxy.golang.org/cloud.google.com/go/resourcesettings/@v/v1.5.1.zip;srcoutput=cloud.google.com/go/resourcesettings;srcinput=cloud.google.com/go/resourcesettings@v1.5.1;downloadfilename=cloud-google-com-go-resourcesettings-1.5.1.zip;name=cloud-google-com-go-resourcesettings"
SRC_URI[cloud-google-com-go-resourcesettings.sha256sum] = "5fc1c68a92f47a4d4c3530c4feed86c53d94256ecf9f037fda0ada1aa50df8cc"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/resourcesettings/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-resourcesettings-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
