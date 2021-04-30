SRC_URI += "https://proxy.golang.org/github.com/djherbis/buffer/@v/v1.2.0.zip;srcoutput=github.com/djherbis/buffer;srcinput=github.com/djherbis/buffer@v1.2.0;downloadfilename=github-com-djherbis-buffer-1.2.0.zip;name=github-com-djherbis-buffer"
SRC_URI[github-com-djherbis-buffer.sha256sum] = "86150488adfbf0930c8c1e82d1fb9703d27cc82ccc7d4f1e1fb3a4ba81069ee9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/djherbis/buffer/LICENSE.txt;md5=efa8c11bd5a1db63f3ed7ad375616a19 \
"

GOSRC_INCLUDEGUARD += "github.com-djherbis-buffer-sources.inc"

