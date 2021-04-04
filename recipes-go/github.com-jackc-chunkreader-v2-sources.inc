SRC_URI += "https://proxy.golang.org/github.com/jackc/chunkreader/v2/@v/v2.0.1.zip;srcoutput=github.com/jackc/chunkreader/v2;srcinput=github.com/jackc/chunkreader/v2@v2.0.1;downloadfilename=github-com-jackc-chunkreader-v2-2.0.1.zip;name=github-com-jackc-chunkreader-v2"
SRC_URI[github-com-jackc-chunkreader-v2.sha256sum] = "6e3f4b7d9647f31061f6446ae10de71fc1407e64f84cd0949afac0cd231e8dd2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/chunkreader/v2/LICENSE;md5=ea2961e52eec5b1203f8147a49ef985f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-chunkreader-v2-sources.inc"

