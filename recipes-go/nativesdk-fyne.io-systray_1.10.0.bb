SUMMARY = "go.mod: fyne.io/systray"
HOMEPAGE = "https://pkg.go.dev/fyne.io/systray"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require fyne.io-systray-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-godbus-dbus-v5 \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "fyne.io/systray"
inherit gosrc
inherit nativesdk
