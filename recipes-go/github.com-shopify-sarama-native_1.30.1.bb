SUMMARY = "go.mod: github.com/Shopify/sarama"
HOMEPAGE = "https://pkg.go.dev/github.com/Shopify/sarama"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shopify-sarama-sources.inc

EXTRA_DEPENDS += "\
    github.com-davecgh-go-spew-native \
    github.com-eapache-go-resiliency-native \
    github.com-eapache-go-xerial-snappy-native \
    github.com-eapache-queue-native \
    github.com-jcmturner-gofork-native \
    github.com-jcmturner-gokrb5-v8-native \
    github.com-klauspost-compress-native \
    github.com-pierrec-lz4-native \
    github.com-rcrowley-go-metrics-native \
    github.com-xdg-go-scram-native \
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/Shopify/sarama"

inherit gosrc
inherit native
