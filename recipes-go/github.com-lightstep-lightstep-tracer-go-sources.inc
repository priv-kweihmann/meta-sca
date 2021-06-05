SRC_URI += "https://proxy.golang.org/github.com/lightstep/lightstep-tracer-go/@v/v0.25.0.zip;srcoutput=github.com/lightstep/lightstep-tracer-go;srcinput=github.com/lightstep/lightstep-tracer-go@v0.25.0;downloadfilename=github-com-lightstep-lightstep-tracer-go-0.25.0.zip;name=github-com-lightstep-lightstep-tracer-go"
SRC_URI[github-com-lightstep-lightstep-tracer-go.sha256sum] = "dfc55de2439327b15d817da47b452154f23353c6c4e3769759da7b551d6bc8a3"

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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shirou-gopsutil-v3-sources.inc', '', 'github.com-shirou-gopsutil-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
