SRC_URI += "https://proxy.golang.org/go.opencensus.io/@v/v0.23.0.zip;srcoutput=go.opencensus.io;srcinput=go.opencensus.io@v0.23.0;downloadfilename=go-opencensus-io-0.23.0.zip;name=go-opencensus-io"
SRC_URI[go-opencensus-io.sha256sum] = "81c78beb84872084d6d5ddc0a0bffc47294412898472c891a29cfcb66f3fa2d8"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.opencensus.io/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"

GOSRC_INCLUDEGUARD += "go.opencensus.io-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-groupcache-sources.inc', '', 'github.com-golang-groupcache-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
