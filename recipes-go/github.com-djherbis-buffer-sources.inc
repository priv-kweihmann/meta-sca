SRC_URI += "https://proxy.golang.org/github.com/djherbis/buffer/@v/v1.1.0.zip;srcoutput=github.com/djherbis/buffer;srcinput=github.com/djherbis/buffer@v1.1.0;downloadfilename=github-com-djherbis-buffer-1.1.0.zip;name=github-com-djherbis-buffer"
SRC_URI[github-com-djherbis-buffer.sha256sum] = "8dfe1a46aad38bec6f551b99dd6f1fbb6f16b44655382ba9724b30eaa4c83e13"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/djherbis/buffer/LICENSE.txt;md5=efa8c11bd5a1db63f3ed7ad375616a19 \
"

GOSRC_INCLUDEGUARD += "github.com-djherbis-buffer-sources.inc"

