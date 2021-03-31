SUMMARY = "go.mod: github.com/hashicorp/serf"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/serf"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-serf-sources.inc
require github.com-armon-circbuf-sources.inc
require github.com-armon-go-metrics-sources.inc
require github.com-armon-go-radix-sources.inc
require github.com-beorn7-perks-sources.inc
require github.com-bgentry-speakeasy-sources.inc
require github.com-cespare-xxhash-v2-sources.inc
require github.com-circonus-labs-circonus-gometrics-sources.inc
require github.com-creack-pty-sources.inc
require github.com-datadog-datadog-go-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-fatih-color-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-btree-sources.inc
require github.com-google-go-cmp-sources.inc
require github.com-hashicorp-errwrap-sources.inc
require github.com-hashicorp-go-immutable-radix-sources.inc
require github.com-hashicorp-go-msgpack-sources.inc
require github.com-hashicorp-go-multierror-sources.inc
require github.com-hashicorp-go-sockaddr-sources.inc
require github.com-hashicorp-go-syslog-sources.inc
require github.com-hashicorp-golang-lru-sources.inc
require github.com-hashicorp-logutils-sources.inc
require github.com-hashicorp-mdns-sources.inc
require github.com-hashicorp-memberlist-sources.inc
require github.com-json-iterator-go-sources.inc
require github.com-julienschmidt-httprouter-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc
require github.com-masterminds-sprig-sources.inc
require github.com-mattn-go-colorable-sources.inc
require github.com-mattn-go-isatty-sources.inc
require github.com-matttproud-golang-protobuf-extensions-sources.inc
require github.com-miekg-dns-sources.inc
require github.com-mitchellh-cli-sources.inc
require github.com-mitchellh-go-wordwrap-sources.inc
require github.com-mitchellh-mapstructure-sources.inc
require github.com-modern-go-concurrent-sources.inc
require github.com-modern-go-reflect2-sources.inc
require github.com-mwitkow-go-conntrack-sources.inc
require github.com-pkg-errors-sources.inc
require github.com-pmezard-go-difflib-sources.inc
require github.com-posener-complete-sources.inc
require github.com-prometheus-client-golang-sources.inc
require github.com-prometheus-client-model-sources.inc
require github.com-prometheus-common-sources.inc
require github.com-prometheus-procfs-sources.inc
require github.com-ryanuber-columnize-sources.inc
require github.com-sean--seed-sources.inc
require github.com-sirupsen-logrus-sources.inc
require github.com-stretchr-objx-sources.inc
require github.com-stretchr-testify-sources.inc
require github.com-yuin-goldmark-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-mod-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-tools-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-protobuf-sources.inc
require gopkg.in-alecthomas-kingpin.v2-sources.inc
require gopkg.in-check.v1-sources.inc
require gopkg.in-yaml.v2-sources.inc
require gopkg.in-yaml.v3-sources.inc

GO_IMPORT = "github.com/hashicorp/serf"

inherit gosrc
inherit native
