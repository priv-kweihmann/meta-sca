SRC_URI += "https://proxy.golang.org/github.com/pseudomuto/protoc-gen-doc/@v/v1.4.1.zip;srcoutput=github.com/pseudomuto/protoc-gen-doc;srcinput=github.com/pseudomuto/protoc-gen-doc@v1.4.1;downloadfilename=github-com-pseudomuto-protoc-gen-doc-1.4.1.zip;name=github-com-pseudomuto-protoc-gen-doc"
SRC_URI[github-com-pseudomuto-protoc-gen-doc.sha256sum] = "0f5fb7a2ca32fd2945299677bcdef433073edea8c0e2e42bcad593275ae4a5a4"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pseudomuto/protoc-gen-doc/LICENSE.md;md5=908179eb2e795029a23bf43d1e3e26f1 \
"

GOSRC_INCLUDEGUARD += "github.com-pseudomuto-protoc-gen-doc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', '', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-sprig-sources.inc', '', 'github.com-masterminds-sprig-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mwitkow-go-proto-validators-sources.inc', '', 'github.com-mwitkow-go-proto-validators-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pseudomuto-protokit-sources.inc', '', 'github.com-pseudomuto-protokit-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
