SRC_URI += "https://proxy.golang.org/github.com/lyft/protoc-gen-star/@v/v0.5.3.zip;srcoutput=github.com/lyft/protoc-gen-star;srcinput=github.com/lyft/protoc-gen-star@v0.5.3;downloadfilename=github-com-lyft-protoc-gen-star-0.5.3.zip;name=github-com-lyft-protoc-gen-star"
SRC_URI[github-com-lyft-protoc-gen-star.sha256sum] = "dabbc4c4e579794053260cdebc105e2f6d3c57002ee5fc3abbc03d5109c477cc"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lyft/protoc-gen-star/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"

GOSRC_INCLUDEGUARD += "github.com-lyft-protoc-gen-star-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-afero-sources.inc', '', 'github.com-spf13-afero-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
