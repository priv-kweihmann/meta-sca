SRC_URI += "https://proxy.golang.org/github.com/godbus/dbus/v5/@v/v5.1.0.zip;srcoutput=github.com/godbus/dbus/v5;srcinput=github.com/godbus/dbus/v5@v5.1.0;downloadfilename=github-com-godbus-dbus-v5-5.1.0.zip;name=github-com-godbus-dbus-v5"
SRC_URI[github-com-godbus-dbus-v5.sha256sum] = "03dfa8e71089a6f477310d15c4d3a036d82d028532881b50fee254358e782ad9"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/godbus/dbus/v5/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed \
"

GOSRC_INCLUDEGUARD += "github.com-godbus-dbus-v5-sources.inc"

