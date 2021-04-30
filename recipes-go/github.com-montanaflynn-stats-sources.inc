SRC_URI += "https://proxy.golang.org/github.com/montanaflynn/stats/@v/v0.6.6.zip;srcoutput=github.com/montanaflynn/stats;srcinput=github.com/montanaflynn/stats@v0.6.6;downloadfilename=github-com-montanaflynn-stats-0.6.6.zip;name=github-com-montanaflynn-stats"
SRC_URI[github-com-montanaflynn-stats.sha256sum] = "fac4308cc66d568256e7aafe694ae58603ddeb9bb39965caa550dbe3fbd77ddc"
GOSRC_REMOVEDIRS += "github.com/montanaflynn/stats/examples"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/montanaflynn/stats/LICENSE;md5=56407134d694a1d823cf192a2fe89af0 \
"

GOSRC_INCLUDEGUARD += "github.com-montanaflynn-stats-sources.inc"

