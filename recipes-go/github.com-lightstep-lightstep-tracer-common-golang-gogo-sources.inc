SRC_URI += "https://github.com/lightstep/lightstep-tracer-common/archive/refs/tags/v1.1.0.zip;srcoutput=github.com/lightstep/lightstep-tracer-common;srcinput=lightstep-tracer-common-1.1.0;downloadfilename=github-com-lightstep-lightstep-tracer-common-golang-gogo-1.1.0.zip;name=github-com-lightstep-lightstep-tracer-common-golang-gogo"
SRC_URI[github-com-lightstep-lightstep-tracer-common-golang-gogo.sha256sum] = "d0dec6837de67e4d58f5c407160043f7109a6ba5e1a500211a570fa1b690e9b0"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lightstep/lightstep-tracer-common/LICENSE;md5=ce5e14e16e13722613cbe38415c54085 \
    file://src/github.com/lightstep/lightstep-tracer-common/third_party/googleapis/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-lightstep-lightstep-tracer-common-golang-gogo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
