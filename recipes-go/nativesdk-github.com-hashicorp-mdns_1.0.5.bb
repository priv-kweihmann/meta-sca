SUMMARY = "go.mod: github.com/hashicorp/mdns"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/mdns"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-mdns-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-miekg-dns \
    nativesdk-golang.org-x-net \
"
GO_IMPORT = "github.com/hashicorp/mdns"
inherit gosrc
inherit nativesdk
