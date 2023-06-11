SRC_URI += "https://proxy.golang.org/fyne.io/fyne/v2/@v/v2.3.5.zip;srcoutput=fyne.io/fyne/v2;srcinput=fyne.io/fyne/v2@v2.3.5;downloadfilename=fyne-io-fyne-v2-2.3.5.zip;name=fyne-io-fyne-v2"
SRC_URI[fyne-io-fyne-v2.sha256sum] = "924ab6160bd3ee49684088fd2a16dd856885c2c139582188c92d91e072a2ef71"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    OFL-1.1 \
"
LIC_FILES_CHKSUM += "\
    file://src/fyne.io/fyne/v2/LICENSE;md5=0f6800fdf0879f3f61ea85e2ed0abcf3 \
    file://src/fyne.io/fyne/v2/theme/font/LICENSE_Inter.txt;md5=42d2b97e905f50c58574fb8149c16635 \
"

GOSRC_INCLUDEGUARD += "fyne.io-fyne-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-systray-sources.inc', '', 'fyne.io-systray-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-burntsushi-toml-sources.inc', '', 'github.com-burntsushi-toml-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fredbi-uri-sources.inc', '', 'github.com-fredbi-uri-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fyne-io-gl-js-sources.inc', '', 'github.com-fyne-io-gl-js-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fyne-io-glfw-js-sources.inc', '', 'github.com-fyne-io-glfw-js-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fyne-io-image-sources.inc', '', 'github.com-fyne-io-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-gl-sources.inc', '', 'github.com-go-gl-gl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', '', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-ole-go-ole-sources.inc', '', 'github.com-go-ole-go-ole-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-text-typesetting-sources.inc', '', 'github.com-go-text-typesetting-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-goki-freetype-sources.inc', '', 'github.com-goki-freetype-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gopherjs-gopherjs-sources.inc', '', 'github.com-gopherjs-gopherjs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jackmordaunt-icns-v2-sources.inc', '', 'github.com-jackmordaunt-icns-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-josephspurrier-goversioninfo-sources.inc', '', 'github.com-josephspurrier-goversioninfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lucor-goinfo-sources.inc', '', 'github.com-lucor-goinfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcuadros-go-version-sources.inc', '', 'github.com-mcuadros-go-version-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-srwiley-oksvg-sources.inc', '', 'github.com-srwiley-oksvg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-srwiley-rasterx-sources.inc', '', 'github.com-srwiley-rasterx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-urfave-cli-v2-sources.inc', '', 'github.com-urfave-cli-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yuin-goldmark-sources.inc', '', 'github.com-yuin-goldmark-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mobile-sources.inc', '', 'golang.org-x-mobile-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'honnef.co-go-js-dom-sources.inc', '', 'honnef.co-go-js-dom-sources.inc', d)}
