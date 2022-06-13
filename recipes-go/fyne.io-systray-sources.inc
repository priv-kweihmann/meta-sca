SRC_URI += "https://proxy.golang.org/fyne.io/systray/@v/v1.10.0.zip;srcoutput=fyne.io/systray;srcinput=fyne.io/systray@v1.10.0;downloadfilename=fyne-io-systray-1.10.0.zip;name=fyne-io-systray"
SRC_URI[fyne-io-systray.sha256sum] = "f719bdd91a220de470cf7dd0114307af2bbf54838de3efbcade856d6ea727035"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/fyne.io/systray/LICENSE;md5=a2be13cb34e811436f5388f0a19cc0b0 \
"

GOSRC_INCLUDEGUARD += "fyne.io-systray-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
