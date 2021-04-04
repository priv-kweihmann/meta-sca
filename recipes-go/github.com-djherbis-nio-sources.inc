SRC_URI += "https://proxy.golang.org/github.com/djherbis/nio/@v/v2.0.3+incompatible.zip;srcoutput=github.com/djherbis/nio;srcinput=github.com/djherbis/nio@v2.0.3+incompatible;downloadfilename=github-com-djherbis-nio-2.0.3+incompatible.zip;name=github-com-djherbis-nio"
SRC_URI[github-com-djherbis-nio.sha256sum] = "cebf0217e4345bb0b0c1b230a4421627b141441753b612188e1672e19cbf4cf1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/djherbis/nio/LICENSE.txt;md5=efa8c11bd5a1db63f3ed7ad375616a19 \
"

GOSRC_INCLUDEGUARD += "github.com-djherbis-nio-sources.inc"

