SUMMARY = "go.mod: github.com/go-text/typesetting"
HOMEPAGE = "https://pkg.go.dev/github.com/go-text/typesetting"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-text-typesetting-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-go-text-typesetting-utils \
    nativesdk-golang.org-x-image \
"
GO_IMPORT = "github.com/go-text/typesetting"
inherit gosrc
inherit nativesdk
