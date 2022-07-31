SRC_URI += "https://proxy.golang.org/google.golang.org/protobuf/@v/v1.28.1.zip;srcoutput=google.golang.org/protobuf;srcinput=google.golang.org/protobuf@v1.28.1;downloadfilename=google-golang-org-protobuf-1.28.1.zip;name=google-golang-org-protobuf"
SRC_URI[google-golang-org-protobuf.sha256sum] = "bf386bcd36987f898e70c8330c6f7ada03e5112909f0a92b7510961403bf61da"
GOSRC_REMOVEDIRS += "google.golang.org/protobuf/internal/benchmarks"
GOSRC_REMOVEDIRS += "google.golang.org/protobuf/internal/weakdeps"
GOSRC_REMOVEDIRS += "google.golang.org/protobuf/internal/conformance"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/protobuf/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-protobuf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
