SUMMARY = "go.mod: github.com/miekg/dns"
HOMEPAGE = "https://pkg.go.dev/github.com/miekg/dns"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-miekg-dns-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-net \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "github.com/miekg/dns"
inherit gosrc
inherit nativesdk
