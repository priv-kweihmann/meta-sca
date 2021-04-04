SRC_URI += "https://proxy.golang.org/github.com/jstemmer/go-junit-report/@v/v0.9.1.zip;srcoutput=github.com/jstemmer/go-junit-report;srcinput=github.com/jstemmer/go-junit-report@v0.9.1;downloadfilename=github-com-jstemmer-go-junit-report-0.9.1.zip;name=github-com-jstemmer-go-junit-report"
SRC_URI[github-com-jstemmer-go-junit-report.sha256sum] = "fbd2196e4a50a88f8c352f76325f4ba72338ecec7b6cb7535317ce9e3aa40284"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jstemmer/go-junit-report/LICENSE;md5=5d54de929d5bc244d21d8d4d91a6ac64 \
"

GOSRC_INCLUDEGUARD += "github.com-jstemmer-go-junit-report-sources.inc"

