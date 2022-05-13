SUMMARY = "go.mod: github.com/go-kit/kit"
HOMEPAGE = "https://pkg.go.dev/github.com/go-kit/kit"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-kit-kit-sources.inc

EXTRA_DEPENDS += "\
    github.com-afex-hystrix-go-native \
    github.com-aws-aws-sdk-go-native \
    github.com-aws-aws-sdk-go-v2-native \
    github.com-casbin-casbin-v2-native \
    github.com-go-kit-log-native \
    github.com-go-zookeeper-zk-native \
    github.com-golang-jwt-jwt-v4-native \
    github.com-hashicorp-consul-api-native \
    github.com-hudl-fargo-native \
    github.com-influxdata-influxdb1-client-native \
    github.com-nats-io-nats.go-native \
    github.com-opentracing-opentracing-go-native \
    github.com-openzipkin-zipkin-go-native \
    github.com-performancecopilot-speed-v4-native \
    github.com-prometheus-client-golang-native \
    github.com-sirupsen-logrus-native \
    github.com-sony-gobreaker-native \
    github.com-streadway-amqp-native \
    github.com-streadway-handy-native \
    github.com-vividcortex-gohistogram-native \
    go.etcd.io-etcd-client-pkg-v3-native \
    go.etcd.io-etcd-client-v2-native \
    go.etcd.io-etcd-client-v3-native \
    go.opencensus.io-native \
    go.uber.org-zap-native \
    golang.org-x-sync-native \
    golang.org-x-time-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/go-kit/kit"

inherit gosrc
inherit native
