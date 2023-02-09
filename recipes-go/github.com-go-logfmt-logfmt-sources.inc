SRC_URI += "https://proxy.golang.org/github.com/go-logfmt/logfmt/@v/v0.6.0.zip;srcoutput=github.com/go-logfmt/logfmt;srcinput=github.com/go-logfmt/logfmt@v0.6.0;downloadfilename=github-com-go-logfmt-logfmt-0.6.0.zip;name=github-com-go-logfmt-logfmt"
SRC_URI[github-com-go-logfmt-logfmt.sha256sum] = "a49c00cff30c02d9c09a4974ce91215bfe37f528a74f129576697869a1b8c630"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-logfmt/logfmt/LICENSE;md5=98e39517c38127f969de33057067091e \
"

GOSRC_INCLUDEGUARD += "github.com-go-logfmt-logfmt-sources.inc"

