SUMMARY = "go.mod: github.com/prometheus/client_golang"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/client_golang"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-client-golang-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-beorn7-perks \
    nativesdk-github.com-cespare-xxhash-v2 \
    nativesdk-github.com-davecgh-go-spew \
    nativesdk-github.com-json-iterator-go \
    nativesdk-github.com-prometheus-client-model \
    nativesdk-github.com-prometheus-common \
    nativesdk-github.com-prometheus-procfs \
    nativesdk-golang.org-x-sys \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/prometheus/client_golang"
inherit gosrc
inherit nativesdk
