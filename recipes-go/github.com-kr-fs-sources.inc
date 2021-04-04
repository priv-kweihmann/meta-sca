SRC_URI += "https://proxy.golang.org/github.com/kr/fs/@v/v0.1.0.zip;srcoutput=github.com/kr/fs;srcinput=github.com/kr/fs@v0.1.0;downloadfilename=github-com-kr-fs-0.1.0.zip;name=github-com-kr-fs"
SRC_URI[github-com-kr-fs.sha256sum] = "d376bd98e81aea34585fc3b04bab76363e9e87cde69383964e57e9779f2af81e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/kr/fs/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81 \
"

GOSRC_INCLUDEGUARD += "github.com-kr-fs-sources.inc"

