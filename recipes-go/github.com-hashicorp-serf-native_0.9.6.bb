SUMMARY = "go.mod: github.com/hashicorp/serf"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/serf"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-serf-sources.inc

EXTRA_DEPENDS += "\
    github.com-armon-circbuf-native \
    github.com-armon-go-metrics-native \
    github.com-hashicorp-go-msgpack-native \
    github.com-hashicorp-go-syslog-native \
    github.com-hashicorp-logutils-native \
    github.com-hashicorp-mdns-native \
    github.com-hashicorp-memberlist-native \
    github.com-mitchellh-cli-native \
    github.com-mitchellh-mapstructure-native \
    github.com-ryanuber-columnize-native \
"

GO_IMPORT = "github.com/hashicorp/serf"

# standalone version is broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
