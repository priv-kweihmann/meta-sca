SRC_URI += "https://proxy.golang.org/github.com/lightstep/lightstep-tracer-go/@v/v0.24.0.zip;srcoutput=github.com/lightstep/lightstep-tracer-go;srcinput=github.com/lightstep/lightstep-tracer-go@v0.24.0;downloadfilename=github-com-lightstep-lightstep-tracer-go-0.24.0.zip;name=github-com-lightstep-lightstep-tracer-go"
SRC_URI[github-com-lightstep-lightstep-tracer-go.sha256sum] = "f0348e7d63a711c5c283e870dec64cca24700394895bab9274aad49329b73ce9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lightstep/lightstep-tracer-go/LICENSE;md5=f8c63238785e7e0ca110b323ac0e4481 \
"

GOSRC_INCLUDEGUARD += "github.com-lightstep-lightstep-tracer-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gogo-protobuf-sources.inc', '', 'github.com-gogo-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lightstep-lightstep-tracer-common-golang-gogo-sources.inc', '', 'github.com-lightstep-lightstep-tracer-common-golang-gogo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shirou-gopsutil-sources.inc', '', 'github.com-shirou-gopsutil-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
