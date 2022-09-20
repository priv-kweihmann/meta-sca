SRC_URI += "https://proxy.golang.org/github.com/coreos/go-systemd/v22/@v/v22.4.0.zip;srcoutput=github.com/coreos/go-systemd/v22;srcinput=github.com/coreos/go-systemd/v22@v22.4.0;downloadfilename=github-com-coreos-go-systemd-v22-22.4.0.zip;name=github-com-coreos-go-systemd-v22"
SRC_URI[github-com-coreos-go-systemd-v22.sha256sum] = "e384d70ff122eff39da242f20832c27e696cd186d27fe39575b4460d7c855fe9"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/coreos/go-systemd/v22/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"

GOSRC_INCLUDEGUARD += "github.com-coreos-go-systemd-v22-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
