SUMMARY = "go.mod: fyne.io/fyne"
HOMEPAGE = "https://pkg.go.dev/fyne.io/fyne"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require fyne.io-fyne-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-fsnotify-fsnotify \
    nativesdk-github.com-fyne-io-mobile \
    nativesdk-github.com-go-gl-gl \
    nativesdk-github.com-go-gl-glfw-v3.3-glfw \
    nativesdk-github.com-godbus-dbus-v5 \
    nativesdk-github.com-goki-freetype \
    nativesdk-github.com-jackmordaunt-icns \
    nativesdk-github.com-josephspurrier-goversioninfo \
    nativesdk-github.com-kodeworks-golang-image-ico \
    nativesdk-github.com-lucor-goinfo \
    nativesdk-github.com-pkg-errors \
    nativesdk-github.com-srwiley-oksvg \
    nativesdk-github.com-srwiley-rasterx \
    nativesdk-github.com-stretchr-testify \
    nativesdk-golang.org-x-image \
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
"
GO_IMPORT = "fyne.io/fyne"
# needs X11 EGL3 and more
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
