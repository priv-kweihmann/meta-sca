SRC_URI += "https://proxy.golang.org/github.com/go-kit/kit/@v/v0.12.0.zip;srcoutput=github.com/go-kit/kit;srcinput=github.com/go-kit/kit@v0.12.0;downloadfilename=github-com-go-kit-kit-0.12.0.zip;name=github-com-go-kit-kit"
SRC_URI[github-com-go-kit-kit.sha256sum] = "2006e7fbfba4273d29042661e2c13749105ac430d85f06175359b520371e6c5a"
GOSRC_REMOVEDIRS += "github.com/go-kit/kit/metrics/cloudwatch2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-kit/kit/LICENSE;md5=8e845ab50365175be4ee5d9703dbe45e \
"

GOSRC_INCLUDEGUARD += "github.com-go-kit-kit-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-afex-hystrix-go-sources.inc', '', 'github.com-afex-hystrix-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-aws-sdk-go-sources.inc', '', 'github.com-aws-aws-sdk-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-aws-sdk-go-v2-sources.inc', '', 'github.com-aws-aws-sdk-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-casbin-casbin-v2-sources.inc', '', 'github.com-casbin-casbin-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-kit-log-sources.inc', '', 'github.com-go-kit-log-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-zookeeper-zk-sources.inc', '', 'github.com-go-zookeeper-zk-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-jwt-jwt-v4-sources.inc', '', 'github.com-golang-jwt-jwt-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-consul-api-sources.inc', '', 'github.com-hashicorp-consul-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hudl-fargo-sources.inc', '', 'github.com-hudl-fargo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-influxdata-influxdb1-client-sources.inc', '', 'github.com-influxdata-influxdb1-client-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nats-io-nats.go-sources.inc', '', 'github.com-nats-io-nats.go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-opentracing-opentracing-go-sources.inc', '', 'github.com-opentracing-opentracing-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-openzipkin-zipkin-go-sources.inc', '', 'github.com-openzipkin-zipkin-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-performancecopilot-speed-v4-sources.inc', '', 'github.com-performancecopilot-speed-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-golang-sources.inc', '', 'github.com-prometheus-client-golang-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sony-gobreaker-sources.inc', '', 'github.com-sony-gobreaker-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-streadway-amqp-sources.inc', '', 'github.com-streadway-amqp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-streadway-handy-sources.inc', '', 'github.com-streadway-handy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-vividcortex-gohistogram-sources.inc', '', 'github.com-vividcortex-gohistogram-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-pkg-v3-sources.inc', '', 'go.etcd.io-etcd-client-pkg-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-v2-sources.inc', '', 'go.etcd.io-etcd-client-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-client-v3-sources.inc', '', 'go.etcd.io-etcd-client-v3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-time-sources.inc', '', 'golang.org-x-time-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
