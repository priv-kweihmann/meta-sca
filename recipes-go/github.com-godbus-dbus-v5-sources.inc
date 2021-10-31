SRC_URI += "https://proxy.golang.org/github.com/godbus/dbus/v5/@v/v5.0.6.zip;srcoutput=github.com/godbus/dbus/v5;srcinput=github.com/godbus/dbus/v5@v5.0.6;downloadfilename=github-com-godbus-dbus-v5-5.0.6.zip;name=github-com-godbus-dbus-v5"
SRC_URI[github-com-godbus-dbus-v5.sha256sum] = "0097f9b4608dc4bf5ca63cd3a9f3334e5cff6be2cab6170cdef075ef97075d89"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/godbus/dbus/v5/LICENSE;md5=09042bd5c6c96a2b9e45ddf1bc517eed \
"

GOSRC_INCLUDEGUARD += "github.com-godbus-dbus-v5-sources.inc"

