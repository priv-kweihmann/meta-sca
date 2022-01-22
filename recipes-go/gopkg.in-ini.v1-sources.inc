SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.66.3.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.66.3;downloadfilename=gopkg-in-ini-v1-1.66.3.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "a4a3f632adece28b596b54e5e71f986158188e29e58b4d84b3abd3ed240f5826"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

