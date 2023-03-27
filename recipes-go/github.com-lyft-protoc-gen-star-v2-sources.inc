SRC_URI += "https://proxy.golang.org/github.com/lyft/protoc-gen-star/v2/@v/v2.0.3.zip;srcoutput=github.com/lyft/protoc-gen-star/v2;srcinput=github.com/lyft/protoc-gen-star/v2@v2.0.3;downloadfilename=github-com-lyft-protoc-gen-star-v2-2.0.3.zip;name=github-com-lyft-protoc-gen-star-v2"
SRC_URI[github-com-lyft-protoc-gen-star-v2.sha256sum] = "470b1555254cdc780f840700144c2cf6ca9966b1260972a90c825b00b901e3fe"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lyft/protoc-gen-star/v2/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"

GOSRC_INCLUDEGUARD += "github.com-lyft-protoc-gen-star-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-afero-sources.inc', '', 'github.com-spf13-afero-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
