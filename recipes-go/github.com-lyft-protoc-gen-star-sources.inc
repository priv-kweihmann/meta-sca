SRC_URI += "https://proxy.golang.org/github.com/lyft/protoc-gen-star/@v/v0.6.2.zip;srcoutput=github.com/lyft/protoc-gen-star;srcinput=github.com/lyft/protoc-gen-star@v0.6.2;downloadfilename=github-com-lyft-protoc-gen-star-0.6.2.zip;name=github-com-lyft-protoc-gen-star"
SRC_URI[github-com-lyft-protoc-gen-star.sha256sum] = "3a96b1b0445119e245f8504d395e276026824e89f3e256111a822ac11bdac6ff"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lyft/protoc-gen-star/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"

GOSRC_INCLUDEGUARD += "github.com-lyft-protoc-gen-star-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-afero-sources.inc', '', 'github.com-spf13-afero-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
