SUMMARY = "go.mod: github.com/hashicorp/memberlist"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/memberlist"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-memberlist-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-armon-go-metrics \
    nativesdk-github.com-google-btree \
    nativesdk-github.com-hashicorp-go-msgpack \
    nativesdk-github.com-hashicorp-go-multierror \
    nativesdk-github.com-hashicorp-go-sockaddr \
    nativesdk-github.com-miekg-dns \
    nativesdk-github.com-sean--seed \
"
GO_IMPORT = "github.com/hashicorp/memberlist"
inherit gosrc
inherit nativesdk
