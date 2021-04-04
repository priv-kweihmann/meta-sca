SRC_URI += "https://proxy.golang.org/github.com/go-kit/kit/@v/v0.10.0.zip;srcoutput=github.com/go-kit/kit;srcinput=github.com/go-kit/kit@v0.10.0;downloadfilename=github-com-go-kit-kit-0.10.0.zip;name=github-com-go-kit-kit"
SRC_URI[github-com-go-kit-kit.sha256sum] = "dbdc933092b036483ca332f8c7c13e8b7d029192e79354d4f5a581ef3c364816"
GOSRC_REMOVEDIRS += "github.com/go-kit/kit/metrics/cloudwatch2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-kit/kit/LICENSE;md5=8e845ab50365175be4ee5d9703dbe45e \
    file://src/github.com/go-kit/kit/log/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "github.com-go-kit-kit-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-afex-hystrix-go-sources.inc', '', 'github.com-afex-hystrix-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-apache-thrift-sources.inc', '', 'github.com-apache-thrift-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-aws-sdk-go-sources.inc', '', 'github.com-aws-aws-sdk-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-aws-sdk-go-v2-sources.inc', '', 'github.com-aws-aws-sdk-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-casbin-casbin-v2-sources.inc', '', 'github.com-casbin-casbin-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-davecgh-go-spew-sources.inc', '', 'github.com-davecgh-go-spew-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-dgrijalva-jwt-go-sources.inc', '', 'github.com-dgrijalva-jwt-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-logfmt-logfmt-sources.inc', '', 'github.com-go-logfmt-logfmt-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-mux-sources.inc', '', 'github.com-gorilla-mux-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-consul-api-sources.inc', '', 'github.com-hashicorp-consul-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hudl-fargo-sources.inc', '', 'github.com-hudl-fargo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-influxdata-influxdb1-client-sources.inc', '', 'github.com-influxdata-influxdb1-client-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lightstep-lightstep-tracer-go-sources.inc', '', 'github.com-lightstep-lightstep-tracer-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nats-io-nats.go-sources.inc', '', 'github.com-nats-io-nats.go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-oklog-oklog-sources.inc', '', 'github.com-oklog-oklog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-openzipkin-contrib-zipkin-go-opentracing-sources.inc', '', 'github.com-openzipkin-contrib-zipkin-go-opentracing-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-openzipkin-zipkin-go-sources.inc', '', 'github.com-openzipkin-zipkin-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pborman-uuid-sources.inc', '', 'github.com-pborman-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-performancecopilot-speed-sources.inc', '', 'github.com-performancecopilot-speed-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-golang-sources.inc', '', 'github.com-prometheus-client-golang-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-samuel-go-zookeeper-sources.inc', '', 'github.com-samuel-go-zookeeper-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sony-gobreaker-sources.inc', '', 'github.com-sony-gobreaker-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-streadway-amqp-sources.inc', '', 'github.com-streadway-amqp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-streadway-handy-sources.inc', '', 'github.com-streadway-handy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-vividcortex-gohistogram-sources.inc', '', 'github.com-vividcortex-gohistogram-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-sources.inc', '', 'go.etcd.io-etcd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-time-sources.inc', '', 'golang.org-x-time-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'sourcegraph.com-sourcegraph-appdash-sources.inc', '', 'sourcegraph.com-sourcegraph-appdash-sources.inc', d)}
