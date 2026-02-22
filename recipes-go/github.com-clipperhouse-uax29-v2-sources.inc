SRC_URI += "https://proxy.golang.org/github.com/clipperhouse/uax29/v2/@v/v2.7.0.zip;srcoutput=github.com/clipperhouse/uax29/v2;srcinput=github.com/clipperhouse/uax29/v2@v2.7.0;downloadfilename=github-com-clipperhouse-uax29-v2-2.7.0.zip;name=github-com-clipperhouse-uax29-v2"
SRC_URI[github-com-clipperhouse-uax29-v2.sha256sum] = "67b1278f1ffb4e4d783a390e48fe7396864650138e785d4b4bfca5914333f761"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/clipperhouse/uax29/v2/LICENSE;md5=39b00daa69674119df37aadf8ab34aeb \
"

GOSRC_INCLUDEGUARD += "github.com-clipperhouse-uax29-v2-sources.inc"

