SRC_URI += "https://proxy.golang.org/github.com/godbus/dbus/v5/@v/v5.0.4.zip;srcoutput=github.com/godbus/dbus/v5;srcinput=github.com/godbus/dbus/v5@v5.0.4;downloadfilename=github-com-godbus-dbus-v5-5.0.4.zip;name=github-com-godbus-dbus-v5"
SRC_URI[github-com-godbus-dbus-v5.sha256sum] = "23a23f08bea48e6e49a46a4015b64adbb1692dc6ddf0d83c2f0c2027cb8e31c8"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/godbus/dbus/v5/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed \
"

GOSRC_INCLUDEGUARD += "github.com-godbus-dbus-v5-sources.inc"

