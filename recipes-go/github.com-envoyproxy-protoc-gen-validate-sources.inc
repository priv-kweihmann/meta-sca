SRC_URI += "https://proxy.golang.org/github.com/envoyproxy/protoc-gen-validate/@v/v1.0.0.zip;srcoutput=github.com/envoyproxy/protoc-gen-validate;srcinput=github.com/envoyproxy/protoc-gen-validate@v1.0.0;downloadfilename=github-com-envoyproxy-protoc-gen-validate-1.0.0.zip;name=github-com-envoyproxy-protoc-gen-validate"
SRC_URI[github-com-envoyproxy-protoc-gen-validate.sha256sum] = "c9fca6e784be0898f0995e171ad3c9e87e052f6e1c9a2610d1a05400bb9c6d6e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/envoyproxy/protoc-gen-validate/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-envoyproxy-protoc-gen-validate-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-iancoleman-strcase-sources.inc', '', 'github.com-iancoleman-strcase-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lyft-protoc-gen-star-v2-sources.inc', '', 'github.com-lyft-protoc-gen-star-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-lint-sources.inc', '', 'golang.org-x-lint-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
