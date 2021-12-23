SUMMARY = "go.mod: github.com/prometheus/client_model"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/client_model"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-client-model-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
"

GO_IMPORT = "github.com/prometheus/client_model"

inherit gosrc
inherit native
