SRC_URI += "https://proxy.golang.org/fyne.io/fyne/@v/v1.4.3.zip;srcoutput=fyne.io/fyne;srcinput=fyne.io/fyne@v1.4.3;downloadfilename=fyne-io-fyne-1.4.3.zip;name=fyne-io-fyne"
SRC_URI[fyne-io-fyne.sha256sum] = "66f090020c77655db8e9f0b0a3dbe55ae91813c19380a0b999116fb299bfa7f1"
GOSRC_REMOVEDIRS += "fyne.io/fyne/cmd/fyne_demo/"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/fyne.io/fyne/LICENSE;md5=0f6800fdf0879f3f61ea85e2ed0abcf3 \
"

GOSRC_INCLUDEGUARD += "fyne.io-fyne-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fyne-io-mobile-sources.inc', '', 'github.com-fyne-io-mobile-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-gl-sources.inc', '', 'github.com-go-gl-gl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', '', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-goki-freetype-sources.inc', '', 'github.com-goki-freetype-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackmordaunt-icns-sources.inc', '', 'github.com-jackmordaunt-icns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-josephspurrier-goversioninfo-sources.inc', '', 'github.com-josephspurrier-goversioninfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kodeworks-golang-image-ico-sources.inc', '', 'github.com-kodeworks-golang-image-ico-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lucor-goinfo-sources.inc', '', 'github.com-lucor-goinfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-srwiley-oksvg-sources.inc', '', 'github.com-srwiley-oksvg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-srwiley-rasterx-sources.inc', '', 'github.com-srwiley-rasterx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
