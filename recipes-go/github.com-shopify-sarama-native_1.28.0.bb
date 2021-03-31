SUMMARY = "go.mod: github.com/Shopify/sarama"
HOMEPAGE = "https://pkg.go.dev/github.com/Shopify/sarama"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shopify-sarama-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-eapache-go-resiliency-sources.inc
require github.com-eapache-go-xerial-snappy-sources.inc
require github.com-eapache-queue-sources.inc
require github.com-gorilla-securecookie-sources.inc
require github.com-gorilla-sessions-sources.inc
require github.com-hashicorp-go-uuid-sources.inc
require github.com-jcmturner-aescts-v2-sources.inc
require github.com-jcmturner-dnsutils-v2-sources.inc
require github.com-jcmturner-gofork-sources.inc
require github.com-jcmturner-goidentity-v6-sources.inc
require github.com-jcmturner-gokrb5-v8-sources.inc
require github.com-jcmturner-rpc-v2-sources.inc
require github.com-klauspost-compress-sources.inc
require github.com-pierrec-lz4-sources.inc
require github.com-rcrowley-go-metrics-sources.inc
require github.com-xdg-scram-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc

GO_IMPORT = "github.com/Shopify/sarama"

inherit gosrc
inherit native
