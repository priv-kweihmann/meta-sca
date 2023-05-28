SUMMARY = "go.mod: gioui.org/x"
HOMEPAGE = "https://pkg.go.dev/gioui.org/x"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gioui.org-x-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-gioui.org \
    nativesdk-git.sr.ht--jackmordaunt-go-toast \
    nativesdk-git.wow.st-gmp-jni \
    nativesdk-github.com-andybalholm-stroke \
    nativesdk-github.com-esiqveland-notify \
    nativesdk-github.com-godbus-dbus-v5 \
    nativesdk-github.com-yuin-goldmark \
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-exp-shiny \
    nativesdk-golang.org-x-image \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-text \
"
GO_IMPORT = "gioui.org/x"
# needs cgo
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
