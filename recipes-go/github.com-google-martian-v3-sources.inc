SRC_URI += "https://proxy.golang.org/github.com/google/martian/v3/@v/v3.2.1.zip;srcoutput=github.com/google/martian/v3;srcinput=github.com/google/martian/v3@v3.2.1;downloadfilename=github-com-google-martian-v3-3.2.1.zip;name=github-com-google-martian-v3"
SRC_URI[github-com-google-martian-v3.sha256sum] = "d1450c8806be91afda7d68d9eee117de58aa04e89d01dbd328455c294379c6c0"

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
