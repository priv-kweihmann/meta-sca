SRC_URI += "https://proxy.golang.org/github.com/openzipkin-contrib/zipkin-go-opentracing/@v/v0.4.5.zip;srcoutput=github.com/openzipkin-contrib/zipkin-go-opentracing;srcinput=github.com/openzipkin-contrib/zipkin-go-opentracing@v0.4.5;downloadfilename=github-com-openzipkin-contrib-zipkin-go-opentracing-0.4.5.zip;name=github-com-openzipkin-contrib-zipkin-go-opentracing"
SRC_URI[github-com-openzipkin-contrib-zipkin-go-opentracing.sha256sum] = "74763b01a30fa2f7116f0408c792b4db50bb01200cfe5f3f8b351ac638d1adb4"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/openzipkin-contrib/zipkin-go-opentracing/LICENSE;md5=aa0e5d6d95d878dca816abf94da09587 \
"

GOSRC_INCLUDEGUARD += "github.com-openzipkin-contrib-zipkin-go-opentracing-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-contrib-go-observer-sources.inc', '', 'github.com-opentracing-contrib-go-observer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-openzipkin-zipkin-go-sources.inc', '', 'github.com-openzipkin-zipkin-go-sources.inc', d)}
