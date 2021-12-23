SUMMARY = "go.mod: github.com/openzipkin/zipkin-go"
HOMEPAGE = "https://pkg.go.dev/github.com/openzipkin/zipkin-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-openzipkin-zipkin-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-rabbitmq-amqp091-go-native \
    github.com-shopify-sarama-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/openzipkin/zipkin-go"

inherit gosrc
inherit native
