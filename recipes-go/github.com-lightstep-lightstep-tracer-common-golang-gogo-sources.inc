SRC_URI += "git://github.com/lightstep/lightstep-tracer-common;nobranch=1;protocol=https;srcinput=github.com/lightstep/lightstep-tracer-common/golang/gogo;srcoutput=github.com/lightstep/lightstep-tracer-common;destsuffix=github.com/lightstep/lightstep-tracer-common/golang/gogo;name=github-com-lightstep-lightstep-tracer-common-golang-gogo"
SRCREV_github-com-lightstep-lightstep-tracer-common-golang-gogo = "a88bf8de3718c9b0279d85effcf667f7a94d6101"

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
