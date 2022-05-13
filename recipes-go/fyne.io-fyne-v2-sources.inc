SRC_URI += "https://proxy.golang.org/fyne.io/fyne/v2/@v/v2.1.4.zip;srcoutput=fyne.io/fyne/v2;srcinput=fyne.io/fyne/v2@v2.1.4;downloadfilename=fyne-io-fyne-v2-2.1.4.zip;name=fyne-io-fyne-v2"
SRC_URI[fyne-io-fyne-v2.sha256sum] = "78df31a19d8ddf5859e1b566f447118917b7abe63b20253a518b2290403e5d25"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/fyne.io/fyne/v2/LICENSE;md5=0f6800fdf0879f3f61ea85e2ed0abcf3 \
"

GOSRC_INCLUDEGUARD += "fyne.io-fyne-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fredbi-uri-sources.inc', '', 'github.com-fredbi-uri-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-gl-sources.inc', '', 'github.com-go-gl-gl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', '', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-ole-go-ole-sources.inc', '', 'github.com-go-ole-go-ole-sources.inc', d)}
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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-urfave-cli-v2-sources.inc', '', 'github.com-urfave-cli-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yuin-goldmark-sources.inc', '', 'github.com-yuin-goldmark-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
