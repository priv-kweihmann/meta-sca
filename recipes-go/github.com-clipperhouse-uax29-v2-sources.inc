SRC_URI += "https://proxy.golang.org/github.com/clipperhouse/uax29/v2/@v/v2.2.0.zip;srcoutput=github.com/clipperhouse/uax29/v2;srcinput=github.com/clipperhouse/uax29/v2@v2.2.0;downloadfilename=github-com-clipperhouse-uax29-v2-2.2.0.zip;name=github-com-clipperhouse-uax29-v2"
SRC_URI[github-com-clipperhouse-uax29-v2.sha256sum] = "0b26d739ddde86a3bd2c0cc4ce8ca711696a523499a9b26732fb25fc8b9531ab"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/clipperhouse/uax29/v2/LICENSE;md5=39b00daa69674119df37aadf8ab34aeb \
"

GOSRC_INCLUDEGUARD += "github.com-clipperhouse-uax29-v2-sources.inc"

