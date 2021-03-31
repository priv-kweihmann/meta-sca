SUMMARY = "go.mod: github.com/armon/go-metrics"
HOMEPAGE = "https://pkg.go.dev/github.com/armon/go-metrics"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-armon-go-metrics-sources.inc
require github.com-beorn7-perks-sources.inc
require github.com-cespare-xxhash-v2-sources.inc
require github.com-circonus-labs-circonus-gometrics-sources.inc
require github.com-creack-pty-sources.inc
require github.com-datadog-datadog-go-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require github.com-hashicorp-go-immutable-radix-sources.inc
require github.com-hashicorp-golang-lru-sources.inc
require github.com-json-iterator-go-sources.inc
require github.com-julienschmidt-httprouter-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc
require github.com-matttproud-golang-protobuf-extensions-sources.inc
require github.com-modern-go-concurrent-sources.inc
require github.com-modern-go-reflect2-sources.inc
require github.com-mwitkow-go-conntrack-sources.inc
require github.com-pkg-errors-sources.inc
require github.com-pmezard-go-difflib-sources.inc
require github.com-prometheus-client-golang-sources.inc
require github.com-prometheus-client-model-sources.inc
require github.com-prometheus-common-sources.inc
require github.com-prometheus-procfs-sources.inc
require github.com-sirupsen-logrus-sources.inc
require github.com-stretchr-objx-sources.inc
require github.com-stretchr-testify-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-protobuf-sources.inc
require gopkg.in-alecthomas-kingpin.v2-sources.inc
require gopkg.in-check.v1-sources.inc
require gopkg.in-yaml.v2-sources.inc
require gopkg.in-yaml.v3-sources.inc

GO_IMPORT = "github.com/armon/go-metrics"

inherit gosrc
inherit native
