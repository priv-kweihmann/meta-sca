SRC_URI += "https://proxy.golang.org/github.com/go-logfmt/logfmt/@v/v0.5.1.zip;srcoutput=github.com/go-logfmt/logfmt;srcinput=github.com/go-logfmt/logfmt@v0.5.1;downloadfilename=github-com-go-logfmt-logfmt-0.5.1.zip;name=github-com-go-logfmt-logfmt"
SRC_URI[github-com-go-logfmt-logfmt.sha256sum] = "9e030cd09b584e59a2f5baaa24cf600520757d732af0f8993cc412dd3086703a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-logfmt/logfmt/LICENSE;md5=98e39517c38127f969de33057067091e \
"

GOSRC_INCLUDEGUARD += "github.com-go-logfmt-logfmt-sources.inc"

