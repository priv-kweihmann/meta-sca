SRC_URI += "https://proxy.golang.org/github.com/openzipkin/zipkin-go/@v/v0.2.5.zip;srcoutput=github.com/openzipkin/zipkin-go;srcinput=github.com/openzipkin/zipkin-go@v0.2.5;downloadfilename=github-com-openzipkin-zipkin-go-0.2.5.zip;name=github-com-openzipkin-zipkin-go"
SRC_URI[github-com-openzipkin-zipkin-go.sha256sum] = "337535c088bd6f7a479e21747044286f66490871948989d52f7812bc4cca955e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/openzipkin/zipkin-go/LICENSE;md5=aa0e5d6d95d878dca816abf94da09587 \
"

GOSRC_INCLUDEGUARD += "github.com-openzipkin-zipkin-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shopify-sarama-sources.inc', '', 'github.com-shopify-sarama-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-streadway-amqp-sources.inc', '', 'github.com-streadway-amqp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
