SRC_URI += "https://proxy.golang.org/github.com/matttproud/golang_protobuf_extensions/@v/v1.0.4.zip;srcoutput=github.com/matttproud/golang_protobuf_extensions;srcinput=github.com/matttproud/golang_protobuf_extensions@v1.0.4;downloadfilename=github-com-matttproud-golang-protobuf-extensions-1.0.4.zip;name=github-com-matttproud-golang-protobuf-extensions"
SRC_URI[github-com-matttproud-golang-protobuf-extensions.sha256sum] = "0b44aabaa9aea5d28e667849ad4d9821351466c3591dd7beddb2d025db6d55f2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/matttproud/golang_protobuf_extensions/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-matttproud-golang-protobuf-extensions-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
