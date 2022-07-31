SUMMARY = "go.mod: github.com/hashicorp/serf"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/serf"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-serf-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-armon-circbuf \
    nativesdk-github.com-armon-go-metrics \
    nativesdk-github.com-hashicorp-go-msgpack \
    nativesdk-github.com-hashicorp-go-syslog \
    nativesdk-github.com-hashicorp-logutils \
    nativesdk-github.com-hashicorp-mdns \
    nativesdk-github.com-hashicorp-memberlist \
    nativesdk-github.com-mitchellh-mapstructure \
    nativesdk-github.com-ryanuber-columnize \
"
GO_IMPORT = "github.com/hashicorp/serf"
# standalone version is broken
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
