SRC_URI += "https://proxy.golang.org/github.com/pseudomuto/protoc-gen-doc/@v/v1.5.1.zip;srcoutput=github.com/pseudomuto/protoc-gen-doc;srcinput=github.com/pseudomuto/protoc-gen-doc@v1.5.1;downloadfilename=github-com-pseudomuto-protoc-gen-doc-1.5.1.zip;name=github-com-pseudomuto-protoc-gen-doc"
SRC_URI[github-com-pseudomuto-protoc-gen-doc.sha256sum] = "93ae05513ebae02343e919e7923f11cb8d5f06e36b8dd6900f07081d1debf628"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pseudomuto/protoc-gen-doc/LICENSE.md;md5=114c0f46cb78b8bc309446102e59996c \
"

GOSRC_INCLUDEGUARD += "github.com-pseudomuto-protoc-gen-doc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', '', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-masterminds-sprig-sources.inc', '', 'github.com-masterminds-sprig-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mwitkow-go-proto-validators-sources.inc', '', 'github.com-mwitkow-go-proto-validators-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pseudomuto-protokit-sources.inc', '', 'github.com-pseudomuto-protokit-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
