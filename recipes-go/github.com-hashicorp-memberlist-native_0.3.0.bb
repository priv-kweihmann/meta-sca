SUMMARY = "go.mod: github.com/hashicorp/memberlist"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/memberlist"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-memberlist-sources.inc

EXTRA_DEPENDS += "\
    github.com-armon-go-metrics-native \
    github.com-google-btree-native \
    github.com-hashicorp-go-msgpack-native \
    github.com-hashicorp-go-multierror-native \
    github.com-hashicorp-go-sockaddr-native \
    github.com-miekg-dns-native \
    github.com-sean--seed-native \
"

GO_IMPORT = "github.com/hashicorp/memberlist"

inherit gosrc
inherit native
