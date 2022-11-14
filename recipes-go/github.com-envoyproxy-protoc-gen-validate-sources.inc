SRC_URI += "https://proxy.golang.org/github.com/envoyproxy/protoc-gen-validate/@v/v0.9.0.zip;srcoutput=github.com/envoyproxy/protoc-gen-validate;srcinput=github.com/envoyproxy/protoc-gen-validate@v0.9.0;downloadfilename=github-com-envoyproxy-protoc-gen-validate-0.9.0.zip;name=github-com-envoyproxy-protoc-gen-validate"
SRC_URI[github-com-envoyproxy-protoc-gen-validate.sha256sum] = "2e5267c571d9544b85fdd645744059e1ff1f1bbe09ef255f5638cf623c72efa9"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/envoyproxy/protoc-gen-validate/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-envoyproxy-protoc-gen-validate-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-iancoleman-strcase-sources.inc', '', 'github.com-iancoleman-strcase-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lyft-protoc-gen-star-sources.inc', '', 'github.com-lyft-protoc-gen-star-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-lint-sources.inc', '', 'golang.org-x-lint-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
