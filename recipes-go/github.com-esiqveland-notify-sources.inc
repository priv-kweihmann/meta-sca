SRC_URI += "https://proxy.golang.org/github.com/esiqveland/notify/@v/v0.11.2.zip;srcoutput=github.com/esiqveland/notify;srcinput=github.com/esiqveland/notify@v0.11.2;downloadfilename=github-com-esiqveland-notify-0.11.2.zip;name=github-com-esiqveland-notify"
SRC_URI[github-com-esiqveland-notify.sha256sum] = "771531970d1528ba139a3778c0acde6f128c9484697be0f14dcd94ffe4611470"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/esiqveland/notify/LICENSE.txt;md5=b28ec7d56c4ab8591c477053f2895291 \
"

GOSRC_INCLUDEGUARD += "github.com-esiqveland-notify-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
