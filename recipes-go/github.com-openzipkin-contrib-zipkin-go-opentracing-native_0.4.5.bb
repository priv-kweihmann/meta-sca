SUMMARY = "go.mod: github.com/openzipkin-contrib/zipkin-go-opentracing"
HOMEPAGE = "https://pkg.go.dev/github.com/openzipkin-contrib/zipkin-go-opentracing"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-openzipkin-contrib-zipkin-go-opentracing-sources.inc
require cloud.google.com-go-sources.inc
require cloud.google.com-go-storage-sources.inc
require github.com-census-instrumentation-opencensus-proto-sources.inc
require github.com-chzyer-readline-sources.inc
require github.com-cncf-udpa-go-sources.inc
require github.com-creack-pty-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-eapache-go-resiliency-sources.inc
require github.com-eapache-go-xerial-snappy-sources.inc
require github.com-eapache-queue-sources.inc
require github.com-envoyproxy-go-control-plane-sources.inc
require github.com-envoyproxy-protoc-gen-validate-sources.inc
require github.com-golang-glog-sources.inc
require github.com-golang-groupcache-sources.inc
require github.com-golang-mock-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require github.com-google-martian-v3-sources.inc
require github.com-google-pprof-sources.inc
require github.com-google-uuid-sources.inc
require github.com-googleapis-gax-go-v2-sources.inc
require github.com-gorilla-securecookie-sources.inc
require github.com-gorilla-sessions-sources.inc
require github.com-hashicorp-go-uuid-sources.inc
require github.com-iancoleman-strcase-sources.inc
require github.com-ianlancetaylor-demangle-sources.inc
require github.com-jcmturner-aescts-v2-sources.inc
require github.com-jcmturner-dnsutils-v2-sources.inc
require github.com-jcmturner-gofork-sources.inc
require github.com-jcmturner-goidentity-v6-sources.inc
require github.com-jcmturner-gokrb5-v8-sources.inc
require github.com-jcmturner-rpc-v2-sources.inc
require github.com-jstemmer-go-junit-report-sources.inc
require github.com-klauspost-compress-sources.inc
require github.com-kr-fs-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc
require github.com-lyft-protoc-gen-star-sources.inc
require github.com-opentracing-contrib-go-observer-sources.inc
require github.com-opentracing-opentracing-go-sources.inc
require github.com-openzipkin-zipkin-go-sources.inc
require github.com-pierrec-lz4-sources.inc
require github.com-pkg-errors-sources.inc
require github.com-pkg-sftp-sources.inc
require github.com-pmezard-go-difflib-sources.inc
require github.com-prometheus-client-model-sources.inc
require github.com-rcrowley-go-metrics-sources.inc
require github.com-shopify-sarama-sources.inc
require github.com-spf13-afero-sources.inc
require github.com-streadway-amqp-sources.inc
require github.com-stretchr-objx-sources.inc
require github.com-stretchr-testify-sources.inc
require github.com-xdg-scram-sources.inc
require github.com-yuin-goldmark-sources.inc
require go.opencensus.io-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-lint-sources.inc
require golang.org-x-mod-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-oauth2-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-tools-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-api-sources.inc
require google.golang.org-appengine-sources.inc
require google.golang.org-genproto-sources.inc
require google.golang.org-grpc-sources.inc
require google.golang.org-protobuf-sources.inc
require gopkg.in-check.v1-sources.inc
require gopkg.in-yaml.v3-sources.inc

GO_IMPORT = "github.com/openzipkin-contrib/zipkin-go-opentracing"

inherit gosrc
inherit native
