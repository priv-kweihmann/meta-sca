SUMMARY = "go.mod: mvdan.cc/sh"
HOMEPAGE = "https://pkg.go.dev/mvdan.cc/sh"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require mvdan.cc-sh-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-google-renameio-v2 \
    nativesdk-github.com-pkg-diff \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-term \
    nativesdk-mvdan.cc-editorconfig \
"
GO_IMPORT = "mvdan.cc/sh"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)$"
inherit gosrc
inherit nativesdk
