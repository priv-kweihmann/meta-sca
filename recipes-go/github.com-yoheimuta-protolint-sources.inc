SRC_URI += "https://proxy.golang.org/github.com/yoheimuta/protolint/@v/v0.37.0.zip;srcoutput=github.com/yoheimuta/protolint;srcinput=github.com/yoheimuta/protolint@v0.37.0;downloadfilename=github-com-yoheimuta-protolint-0.37.0.zip;name=github-com-yoheimuta-protolint"
SRC_URI[github-com-yoheimuta-protolint.sha256sum] = "c22d42fd8eb39dd0dbe5d51bc4d04b14f3a2372cb81e8094e1600b4d3e0f3e46"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yoheimuta/protolint/LICENSE;md5=680197209f0f60cc65a5508f43c2c888 \
"

GOSRC_INCLUDEGUARD += "github.com-yoheimuta-protolint-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gertd-go-pluralize-sources.inc', '', 'github.com-gertd-go-pluralize-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-hclog-sources.inc', '', 'github.com-hashicorp-go-hclog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-plugin-sources.inc', '', 'github.com-hashicorp-go-plugin-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yoheimuta-go-protoparser-v4-sources.inc', '', 'github.com-yoheimuta-go-protoparser-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
