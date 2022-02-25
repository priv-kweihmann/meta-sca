SRC_URI += "https://proxy.golang.org/github.com/jstemmer/go-junit-report/@v/v1.0.0.zip;srcoutput=github.com/jstemmer/go-junit-report;srcinput=github.com/jstemmer/go-junit-report@v1.0.0;downloadfilename=github-com-jstemmer-go-junit-report-1.0.0.zip;name=github-com-jstemmer-go-junit-report"
SRC_URI[github-com-jstemmer-go-junit-report.sha256sum] = "eb36a13d8534b246903498e3d71d6f2d6e545c5150296f7a01e8fbf108119b11"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jstemmer/go-junit-report/LICENSE;md5=5d54de929d5bc244d21d8d4d91a6ac64 \
"

GOSRC_INCLUDEGUARD += "github.com-jstemmer-go-junit-report-sources.inc"

