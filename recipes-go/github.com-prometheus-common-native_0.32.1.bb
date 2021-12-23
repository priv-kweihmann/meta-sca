SUMMARY = "go.mod: github.com/prometheus/common"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/common"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-common-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-kit-log-native \
    github.com-golang-protobuf-native \
    github.com-julienschmidt-httprouter-native \
    github.com-matttproud-golang-protobuf-extensions-native \
    github.com-mwitkow-go-conntrack-native \
    github.com-pkg-errors-native \
    github.com-prometheus-client-golang-native \
    github.com-prometheus-client-model-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    gopkg.in-alecthomas-kingpin.v2-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/prometheus/common"

inherit gosrc
inherit native
