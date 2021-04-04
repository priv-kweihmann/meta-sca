SRC_URI += "https://github.com/coreos/go-systemd/archive/refs/tags/v22.3.1.zip;srcoutput=github.com/coreos/go-systemd;srcinput=go-systemd-22.3.1;downloadfilename=github-com-coreos-go-systemd-22.3.1.zip;name=github-com-coreos-go-systemd"
SRC_URI[github-com-coreos-go-systemd.sha256sum] = "c3bf5313cf86678c73a635f8ca29509cb4232b71b3d8179ceb5f4083b67cc22f"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/coreos/go-systemd/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"

GOSRC_INCLUDEGUARD += "github.com-coreos-go-systemd-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
