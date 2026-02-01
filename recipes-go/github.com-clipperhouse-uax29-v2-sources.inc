SRC_URI += "https://proxy.golang.org/github.com/clipperhouse/uax29/v2/@v/v2.4.0.zip;srcoutput=github.com/clipperhouse/uax29/v2;srcinput=github.com/clipperhouse/uax29/v2@v2.4.0;downloadfilename=github-com-clipperhouse-uax29-v2-2.4.0.zip;name=github-com-clipperhouse-uax29-v2"
SRC_URI[github-com-clipperhouse-uax29-v2.sha256sum] = "e362eae46ce1abea3195d4aec481d53cceea8d02d11531d584182a614549732a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/clipperhouse/uax29/v2/LICENSE;md5=39b00daa69674119df37aadf8ab34aeb \
"

GOSRC_INCLUDEGUARD += "github.com-clipperhouse-uax29-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-clipperhouse-stringish-sources.inc', '', 'github.com-clipperhouse-stringish-sources.inc', d)}
