SUMMARY = "go.mod: git.sr.ht/~sbinet/gg"
HOMEPAGE = "https://pkg.go.dev/git.sr.ht/~sbinet/gg"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require git.sr.ht--sbinet-gg-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-campoy-embedmd \
    nativesdk-github.com-golang-freetype \
    nativesdk-golang.org-x-image \
"
GO_IMPORT = "git.sr.ht/~sbinet/gg"
inherit gosrc
inherit nativesdk
