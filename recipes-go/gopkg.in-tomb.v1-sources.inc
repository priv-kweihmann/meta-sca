SRC_URI += "https://proxy.golang.org/gopkg.in/tomb.v1/@v/v1.0.0-20141024135613-dd632973f1e7.zip;srcoutput=gopkg.in/tomb.v1;srcinput=gopkg.in/tomb.v1@v1.0.0-20141024135613-dd632973f1e7;downloadfilename=gopkg-in-tomb-v1-1.0.0-20141024135613-dd632973f1e7.zip;name=gopkg-in-tomb-v1"
SRC_URI[gopkg-in-tomb-v1.sha256sum] = "34898dc0e38ba7a792ab74a3e0fa113116313fd9142ffb444b011fd392762186"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/tomb.v1/LICENSE;md5=95d4102f39f26da9b66fee5d05ac597b \
"

GOSRC_INCLUDEGUARD += "gopkg.in-tomb.v1-sources.inc"

