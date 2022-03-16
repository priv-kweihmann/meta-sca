SRC_URI += "https://proxy.golang.org/github.com/google/martian/v3/@v/v3.3.2.zip;srcoutput=github.com/google/martian/v3;srcinput=github.com/google/martian/v3@v3.3.2;downloadfilename=github-com-google-martian-v3-3.3.2.zip;name=github-com-google-martian-v3"
SRC_URI[github-com-google-martian-v3.sha256sum] = "aa691c18a36d986d0505aab68925985faba03d72e15729ee1b97f919af8e628c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/martian/v3/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-martian-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
