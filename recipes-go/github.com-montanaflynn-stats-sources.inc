SRC_URI += "https://proxy.golang.org/github.com/montanaflynn/stats/@v/v0.7.1.zip;srcoutput=github.com/montanaflynn/stats;srcinput=github.com/montanaflynn/stats@v0.7.1;downloadfilename=github-com-montanaflynn-stats-0.7.1.zip;name=github-com-montanaflynn-stats"
SRC_URI[github-com-montanaflynn-stats.sha256sum] = "858b18e8ee484a2d466504b4d31bbae20e30e95d3f0f269190e9b4e27dc88283"
GOSRC_REMOVEDIRS += "github.com/montanaflynn/stats/examples"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/montanaflynn/stats/LICENSE;md5=7000aae64d94f7bcdcd54c86157863e7 \
"

GOSRC_INCLUDEGUARD += "github.com-montanaflynn-stats-sources.inc"

