SUMMARY = "go.mod: github.com/go-kit/kit"
HOMEPAGE = "https://pkg.go.dev/github.com/go-kit/kit"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-kit-kit-sources.inc

EXTRA_DEPENDS += "\
    github.com-afex-hystrix-go-native \
    github.com-apache-thrift-native \
    github.com-aws-aws-sdk-go-native \
    github.com-aws-aws-sdk-go-v2-native \
    github.com-casbin-casbin-v2-native \
    github.com-davecgh-go-spew-native \
    github.com-dgrijalva-jwt-go-native \
    github.com-go-logfmt-logfmt-native \
    github.com-golang-protobuf-native \
    github.com-gorilla-mux-native \
    github.com-hashicorp-consul-api-native \
    github.com-hudl-fargo-native \
    github.com-influxdata-influxdb1-client-native \
    github.com-lightstep-lightstep-tracer-go-native \
    github.com-nats-io-nats.go-native \
    github.com-oklog-oklog-native \
    github.com-opentracing-opentracing-go-native \
    github.com-openzipkin-contrib-zipkin-go-opentracing-native \
    github.com-openzipkin-zipkin-go-native \
    github.com-pborman-uuid-native \
    github.com-performancecopilot-speed-native \
    github.com-pkg-errors-native \
    github.com-prometheus-client-golang-native \
    github.com-samuel-go-zookeeper-native \
    github.com-sirupsen-logrus-native \
    github.com-sony-gobreaker-native \
    github.com-streadway-amqp-native \
    github.com-streadway-handy-native \
    github.com-vividcortex-gohistogram-native \
    go.etcd.io-etcd-native \
    go.opencensus.io-native \
    go.uber.org-zap-native \
    golang.org-x-sync-native \
    golang.org-x-time-native \
    golang.org-x-tools-native \
    google.golang.org-grpc-native \
    sourcegraph.com-sourcegraph-appdash-native \
"

GO_IMPORT = "github.com/go-kit/kit"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
