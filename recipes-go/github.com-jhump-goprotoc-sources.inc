SRC_URI += "https://proxy.golang.org/github.com/jhump/goprotoc/@v/v0.5.0.zip;srcoutput=github.com/jhump/goprotoc;srcinput=github.com/jhump/goprotoc@v0.5.0;downloadfilename=github-com-jhump-goprotoc-0.5.0.zip;name=github-com-jhump-goprotoc"
SRC_URI[github-com-jhump-goprotoc.sha256sum] = "6e83bda69bf7c91e8271a355f9c56c7ed4b94e88effcf7bfe5262071054c5e47"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jhump/goprotoc/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-jhump-goprotoc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jhump-gopoet-sources.inc', '', 'github.com-jhump-gopoet-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jhump-protoreflect-sources.inc', '', 'github.com-jhump-protoreflect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
