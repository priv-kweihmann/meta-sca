SUMMARY = "go.mod: github.com/prometheus/client_golang"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/client_golang"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-client-golang-sources.inc

EXTRA_DEPENDS += "\
    github.com-beorn7-perks-native \
    github.com-cespare-xxhash-v2-native \
    github.com-golang-protobuf-native \
    github.com-json-iterator-go-native \
    github.com-prometheus-client-model-native \
    github.com-prometheus-common-native \
    github.com-prometheus-procfs-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/prometheus/client_golang"

inherit gosrc
inherit native
