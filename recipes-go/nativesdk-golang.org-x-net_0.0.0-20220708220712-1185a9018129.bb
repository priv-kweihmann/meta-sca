SUMMARY = "go.mod: golang.org/x/net"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/net"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-net-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-term \
    nativesdk-golang.org-x-text \
"
GO_IMPORT = "golang.org/x/net"
inherit gosrc
inherit nativesdk
