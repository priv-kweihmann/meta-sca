SUMMARY = "go.mod: fyne.io/fyne/v2"
HOMEPAGE = "https://pkg.go.dev/fyne.io/fyne/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require fyne.io-fyne-v2-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-fyne.io-systray \
    nativesdk-github.com-burntsushi-toml \
    nativesdk-github.com-fredbi-uri \
    nativesdk-github.com-fsnotify-fsnotify \
    nativesdk-github.com-fyne-io-gl-js \
    nativesdk-github.com-fyne-io-glfw-js \
    nativesdk-github.com-fyne-io-image \
    nativesdk-github.com-go-gl-gl \
    nativesdk-github.com-go-gl-glfw-v3.3-glfw \
    nativesdk-github.com-go-ole-go-ole \
    nativesdk-github.com-go-text-typesetting \
    nativesdk-github.com-godbus-dbus-v5 \
    nativesdk-github.com-goki-freetype \
    nativesdk-github.com-gopherjs-gopherjs \
    nativesdk-github.com-jackmordaunt-icns-v2 \
    nativesdk-github.com-josephspurrier-goversioninfo \
    nativesdk-github.com-lucor-goinfo \
    nativesdk-github.com-mcuadros-go-version \
    nativesdk-github.com-srwiley-oksvg \
    nativesdk-github.com-srwiley-rasterx \
    nativesdk-github.com-stretchr-testify \
    nativesdk-github.com-urfave-cli-v2 \
    nativesdk-github.com-yuin-goldmark \
    nativesdk-golang.org-x-image \
    nativesdk-golang.org-x-mobile \
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
    nativesdk-honnef.co-go-js-dom \
"
GO_IMPORT = "fyne.io/fyne/v2"
# needs X11 EGL3 and more
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
