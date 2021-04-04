SRC_URI += "https://proxy.golang.org/github.com/lightstep/lightstep-tracer-common/golang/gogo/@v/v0.0.0-20210210170715-a8dfcb80d3a7.zip;srcoutput=github.com/lightstep/lightstep-tracer-common/golang/gogo;srcinput=github.com/lightstep/lightstep-tracer-common/golang/gogo@v0.0.0-20210210170715-a8dfcb80d3a7;downloadfilename=github-com-lightstep-lightstep-tracer-common-golang-gogo-0.0.0-20210210170715-a8dfcb80d3a7.zip;name=github-com-lightstep-lightstep-tracer-common-golang-gogo"
SRC_URI[github-com-lightstep-lightstep-tracer-common-golang-gogo.sha256sum] = "b4cdc3a48d9a9f46c14875fb399d6345c17c57940ff58243a0ccd7d670934f5f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lightstep/lightstep-tracer-common/golang/gogo/LICENSE;md5=ce5e14e16e13722613cbe38415c54085 \
"

GOSRC_INCLUDEGUARD += "github.com-lightstep-lightstep-tracer-common-golang-gogo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
