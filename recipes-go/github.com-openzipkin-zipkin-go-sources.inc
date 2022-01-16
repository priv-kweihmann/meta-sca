SRC_URI += "https://proxy.golang.org/github.com/openzipkin/zipkin-go/@v/v0.4.0.zip;srcoutput=github.com/openzipkin/zipkin-go;srcinput=github.com/openzipkin/zipkin-go@v0.4.0;downloadfilename=github-com-openzipkin-zipkin-go-0.4.0.zip;name=github-com-openzipkin-zipkin-go"
SRC_URI[github-com-openzipkin-zipkin-go.sha256sum] = "830d54a7bd19422b1510fdab391bfd60f378ad1dddc16b3838a783de8f2e8eea"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/openzipkin/zipkin-go/LICENSE;md5=aa0e5d6d95d878dca816abf94da09587 \
"

GOSRC_INCLUDEGUARD += "github.com-openzipkin-zipkin-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rabbitmq-amqp091-go-sources.inc', '', 'github.com-rabbitmq-amqp091-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shopify-sarama-sources.inc', '', 'github.com-shopify-sarama-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
