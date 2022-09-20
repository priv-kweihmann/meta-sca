SRC_URI += "https://proxy.golang.org/github.com/envoyproxy/protoc-gen-validate/@v/v0.6.8.zip;srcoutput=github.com/envoyproxy/protoc-gen-validate;srcinput=github.com/envoyproxy/protoc-gen-validate@v0.6.8;downloadfilename=github-com-envoyproxy-protoc-gen-validate-0.6.8.zip;name=github-com-envoyproxy-protoc-gen-validate"
SRC_URI[github-com-envoyproxy-protoc-gen-validate.sha256sum] = "734c2c951e0290da7199878bafa33d2ed3698f004ade379b7bbf6721c6bd1ee9"

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
