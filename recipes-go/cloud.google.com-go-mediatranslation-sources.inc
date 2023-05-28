SRC_URI += "https://proxy.golang.org/cloud.google.com/go/mediatranslation/@v/v0.7.1.zip;srcoutput=cloud.google.com/go/mediatranslation;srcinput=cloud.google.com/go/mediatranslation@v0.7.1;downloadfilename=cloud-google-com-go-mediatranslation-0.7.1.zip;name=cloud-google-com-go-mediatranslation"
SRC_URI[cloud-google-com-go-mediatranslation.sha256sum] = "e5bf460c7b49ea4e57f8846a5e2308ec07b17f60a9487ff13f929eb4307eb51c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/mediatranslation/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-mediatranslation-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
