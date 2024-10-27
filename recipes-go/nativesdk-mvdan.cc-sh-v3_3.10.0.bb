SUMMARY = "go.mod: mvdan.cc/sh/v3"
HOMEPAGE = "https://pkg.go.dev/mvdan.cc/sh/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require mvdan.cc-sh-v3-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-google-renameio-v2 \
    nativesdk-github.com-muesli-cancelreader \
    nativesdk-github.com-rogpeppe-go-internal \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-term \
    nativesdk-mvdan.cc-editorconfig \
"
GO_IMPORT = "mvdan.cc/sh/v3"
inherit gosrc
inherit_defer nativesdk
