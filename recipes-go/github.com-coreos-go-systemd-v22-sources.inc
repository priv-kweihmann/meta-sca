SRC_URI += "https://proxy.golang.org/github.com/coreos/go-systemd/v22/@v/v22.3.2.zip;srcoutput=github.com/coreos/go-systemd/v22;srcinput=github.com/coreos/go-systemd/v22@v22.3.2;downloadfilename=github-com-coreos-go-systemd-v22-22.3.2.zip;name=github-com-coreos-go-systemd-v22"
SRC_URI[github-com-coreos-go-systemd-v22.sha256sum] = "01134ae89bf4a91c17eeb1f8425e1064f9bde64cf3ce0c9cf546a9fa1ee25e64"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/coreos/go-systemd/v22/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"

GOSRC_INCLUDEGUARD += "github.com-coreos-go-systemd-v22-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-godbus-dbus-v5-sources.inc', '', 'github.com-godbus-dbus-v5-sources.inc', d)}
