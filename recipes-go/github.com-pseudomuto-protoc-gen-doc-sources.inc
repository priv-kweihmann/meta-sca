SRC_URI += "https://proxy.golang.org/github.com/pseudomuto/protoc-gen-doc/@v/v1.5.0.zip;srcoutput=github.com/pseudomuto/protoc-gen-doc;srcinput=github.com/pseudomuto/protoc-gen-doc@v1.5.0;downloadfilename=github-com-pseudomuto-protoc-gen-doc-1.5.0.zip;name=github-com-pseudomuto-protoc-gen-doc"
SRC_URI[github-com-pseudomuto-protoc-gen-doc.sha256sum] = "5fbf9eb35a70a67401ba65f0fc54ab0d5150c65c6eed24f16ea82f5eb10fdec7"

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
