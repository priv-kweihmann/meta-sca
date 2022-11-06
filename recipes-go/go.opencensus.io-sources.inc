SRC_URI += "https://proxy.golang.org/go.opencensus.io/@v/v0.24.0.zip;srcoutput=go.opencensus.io;srcinput=go.opencensus.io@v0.24.0;downloadfilename=go-opencensus-io-0.24.0.zip;name=go-opencensus-io"
SRC_URI[go-opencensus-io.sha256sum] = "203a767d7f8e7c1ebe5588220ad168d1e15b14ae70a636de7ca9a4a88a7e0d0c"

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
