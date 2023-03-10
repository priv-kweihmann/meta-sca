SUMMARY = "go.mod: github.com/prometheus/common"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/common"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-common-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-alecthomas-kingpin-v2 \
    nativesdk-github.com-go-kit-log \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-julienschmidt-httprouter \
    nativesdk-github.com-matttproud-golang-protobuf-extensions \
    nativesdk-github.com-mwitkow-go-conntrack \
    nativesdk-github.com-prometheus-client-golang \
    nativesdk-github.com-prometheus-client-model \
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-oauth2 \
    nativesdk-gopkg.in-yaml.v2 \
"
GO_IMPORT = "github.com/prometheus/common"
inherit gosrc
inherit nativesdk
