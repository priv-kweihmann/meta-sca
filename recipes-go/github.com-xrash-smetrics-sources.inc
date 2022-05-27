SRC_URI += "https://proxy.golang.org/github.com/xrash/smetrics/@v/v0.0.0-20201216005158-039620a65673.zip;srcoutput=github.com/xrash/smetrics;srcinput=github.com/xrash/smetrics@v0.0.0-20201216005158-039620a65673;downloadfilename=github-com-xrash-smetrics-0.0.0-20201216005158-039620a65673.zip;name=github-com-xrash-smetrics"
SRC_URI[github-com-xrash-smetrics.sha256sum] = "bbebb9a00f44ff3e27bec16111effdcf2706d727821a4833ec8da19aad96e26d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xrash/smetrics/LICENSE;md5=68418a2b5d025376b21bcbd2d9289f22 \
"

GOSRC_INCLUDEGUARD += "github.com-xrash-smetrics-sources.inc"

