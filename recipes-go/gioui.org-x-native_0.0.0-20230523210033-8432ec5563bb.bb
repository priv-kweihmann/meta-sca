SUMMARY = "go.mod: gioui.org/x"
HOMEPAGE = "https://pkg.go.dev/gioui.org/x"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gioui.org-x-sources.inc

EXTRA_DEPENDS += "\
    gioui.org-native \
    git.sr.ht--jackmordaunt-go-toast-native \
    git.wow.st-gmp-jni-native \
    github.com-andybalholm-stroke-native \
    github.com-esiqveland-notify-native \
    github.com-godbus-dbus-v5-native \
    github.com-yuin-goldmark-native \
    golang.org-x-exp-native \
    golang.org-x-exp-shiny-native \
    golang.org-x-image-native \
    golang.org-x-sys-native \
    golang.org-x-text-native \
"

GO_IMPORT = "gioui.org/x"

# needs cgo
do_compile[noexec] = "1"

inherit gosrc
inherit native
