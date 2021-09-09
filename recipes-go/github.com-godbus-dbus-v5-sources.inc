SRC_URI += "https://proxy.golang.org/github.com/godbus/dbus/v5/@v/v5.0.5.zip;srcoutput=github.com/godbus/dbus/v5;srcinput=github.com/godbus/dbus/v5@v5.0.5;downloadfilename=github-com-godbus-dbus-v5-5.0.5.zip;name=github-com-godbus-dbus-v5"
SRC_URI[github-com-godbus-dbus-v5.sha256sum] = "b197d56c9fa51536b1f8d3e698d6e0b78595aa6aa9cbea9a8735dc8906addaa0"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/godbus/dbus/v5/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed \
"

GOSRC_INCLUDEGUARD += "github.com-godbus-dbus-v5-sources.inc"

