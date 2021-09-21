SRC_URI += "https://proxy.golang.org/gopkg.in/ini.v1/@v/v1.63.2.zip;srcoutput=gopkg.in/ini.v1;srcinput=gopkg.in/ini.v1@v1.63.2;downloadfilename=gopkg-in-ini-v1-1.63.2.zip;name=gopkg-in-ini-v1"
SRC_URI[gopkg-in-ini-v1.sha256sum] = "b63ce2896ad1a3c993012b3ac8e88e5832f4fbe8288f20b8663e80c6c584b45d"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/ini.v1/LICENSE;md5=4e2a8d8f9935d6a766a5879a77ddc24d \
"

GOSRC_INCLUDEGUARD += "gopkg.in-ini.v1-sources.inc"

