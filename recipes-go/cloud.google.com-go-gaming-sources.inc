SRC_URI += "https://proxy.golang.org/cloud.google.com/go/gaming/@v/v1.10.0.zip;srcoutput=cloud.google.com/go/gaming;srcinput=cloud.google.com/go/gaming@v1.10.0;downloadfilename=cloud-google-com-go-gaming-1.10.0.zip;name=cloud-google-com-go-gaming"
SRC_URI[cloud-google-com-go-gaming.sha256sum] = "8329ac03da7a8c46ba23ed90ea010dc7f51e1403d57257b16ac0b463e7a49ed2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/gaming/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-gaming-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-longrunning-sources.inc', '', 'cloud.google.com-go-longrunning-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
