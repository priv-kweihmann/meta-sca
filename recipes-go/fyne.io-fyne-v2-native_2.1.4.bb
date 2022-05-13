SUMMARY = "go.mod: fyne.io/fyne/v2"
HOMEPAGE = "https://pkg.go.dev/fyne.io/fyne/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require fyne.io-fyne-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-burntsushi-toml-native \
    github.com-fredbi-uri-native \
    github.com-fsnotify-fsnotify-native \
    github.com-go-gl-gl-native \
    github.com-go-gl-glfw-v3.3-glfw-native \
    github.com-go-ole-go-ole-native \
    github.com-godbus-dbus-v5-native \
    github.com-goki-freetype-native \
    github.com-jackmordaunt-icns-native \
    github.com-josephspurrier-goversioninfo-native \
    github.com-kodeworks-golang-image-ico-native \
    github.com-lucor-goinfo-native \
    github.com-pkg-errors-native \
    github.com-srwiley-oksvg-native \
    github.com-srwiley-rasterx-native \
    github.com-stretchr-testify-native \
    github.com-urfave-cli-v2-native \
    github.com-yuin-goldmark-native \
    golang.org-x-image-native \
    golang.org-x-mod-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "fyne.io/fyne/v2"

# needs X11 EGL3 and more
do_compile[noexec] = "1"

inherit gosrc
inherit native
