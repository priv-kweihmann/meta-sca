SRC_URI += "https://proxy.golang.org/github.com/spf13/pflag/@v/v1.0.5.zip;srcoutput=github.com/spf13/pflag;srcinput=github.com/spf13/pflag@v1.0.5;downloadfilename=github-com-spf13-pflag-1.0.5.zip;name=github-com-spf13-pflag"
SRC_URI[github-com-spf13-pflag.sha256sum] = "fc6e704f2f6a84ddcdce6de0404e5340fa20c8676181bf5d381b17888107ba84"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/pflag/LICENSE;md5=1e8b7dc8b906737639131047a590f21d \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-pflag-sources.inc"

