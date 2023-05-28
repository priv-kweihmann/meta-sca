SUMMARY = "go.mod: git.sr.ht/~jackmordaunt/go-toast"
HOMEPAGE = "https://pkg.go.dev/git.sr.ht/~jackmordaunt/go-toast"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require git.sr.ht--jackmordaunt-go-toast-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-go-ole-go-ole \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "git.sr.ht/~jackmordaunt/go-toast"
inherit gosrc
inherit nativesdk
