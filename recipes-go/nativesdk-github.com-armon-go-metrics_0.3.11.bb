SUMMARY = "go.mod: github.com/armon/go-metrics"
HOMEPAGE = "https://pkg.go.dev/github.com/armon/go-metrics"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-armon-go-metrics-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-circonus-labs-circonus-gometrics \
    nativesdk-github.com-datadog-datadog-go \
    nativesdk-github.com-hashicorp-go-immutable-radix \
    nativesdk-github.com-prometheus-client-golang \
"
GO_IMPORT = "github.com/armon/go-metrics"
inherit gosrc
inherit nativesdk
