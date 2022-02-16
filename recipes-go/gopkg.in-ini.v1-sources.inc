SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.66.4.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.66.4;downloadfilename=gopkg-in-ini-v1-1.66.4.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "777918d617d5b9a63fa389927115ae77ede197d0370397ae17cffd19224e8581"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

