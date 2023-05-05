SUMMARY = "go.mod: github.com/prometheus/common"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/common"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-common-sources.inc

EXTRA_DEPENDS += "\
    github.com-alecthomas-kingpin-v2-native \
    github.com-go-kit-log-native \
    github.com-julienschmidt-httprouter-native \
    github.com-matttproud-golang-protobuf-extensions-native \
    github.com-mwitkow-go-conntrack-native \
    github.com-prometheus-client-golang-native \
    github.com-prometheus-client-model-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    google.golang.org-protobuf-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/prometheus/common"

inherit gosrc
inherit native
