SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.67.0.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.67.0;downloadfilename=gopkg-in-ini-v1-1.67.0.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "bd845dfc762a87a56e5a32a07770dc83e86976db7705d7f89c5dbafdc60b06c6"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

