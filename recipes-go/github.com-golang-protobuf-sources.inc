SRC_URI += "https://proxy.golang.org/github.com/golang/protobuf/@v/v1.5.3.zip;srcoutput=github.com/golang/protobuf;srcinput=github.com/golang/protobuf@v1.5.3;downloadfilename=github-com-golang-protobuf-1.5.3.zip;name=github-com-golang-protobuf"
SRC_URI[github-com-golang-protobuf.sha256sum] = "93bda6e88d4a0a493a98b481de67a10000a755d15f16a800b49a6b96d1bd6f81"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/golang/protobuf/LICENSE;md5=939cce1ec101726fa754e698ac871622 \
"

GOSRC_INCLUDEGUARD += "github.com-golang-protobuf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
