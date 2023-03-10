SRC_URI += "https://proxy.golang.org/github.com/xhit/go-str2duration/v2/@v/v2.1.0.zip;srcoutput=github.com/xhit/go-str2duration/v2;srcinput=github.com/xhit/go-str2duration/v2@v2.1.0;downloadfilename=github-com-xhit-go-str2duration-v2-2.1.0.zip;name=github-com-xhit-go-str2duration-v2"
SRC_URI[github-com-xhit-go-str2duration-v2.sha256sum] = "907db1bdf362568191e659f82339c21a4031d433bc5ac52f36de23eeceb8cb26"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xhit/go-str2duration/v2/LICENSE;md5=63cf70d490f050a29efd853b9bd0620b \
"

GOSRC_INCLUDEGUARD += "github.com-xhit-go-str2duration-v2-sources.inc"

