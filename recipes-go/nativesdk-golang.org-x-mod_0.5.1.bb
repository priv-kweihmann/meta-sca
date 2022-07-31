SUMMARY = "go.mod: golang.org/x/mod"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/mod"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-mod-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-crypto \
    nativesdk-golang.org-x-xerrors \
"
GO_IMPORT = "golang.org/x/mod"
inherit gosrc
inherit nativesdk
