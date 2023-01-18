SRC_URI += "https://proxy.golang.org/github.com/montanaflynn/stats/@v/v0.7.0.zip;srcoutput=github.com/montanaflynn/stats;srcinput=github.com/montanaflynn/stats@v0.7.0;downloadfilename=github-com-montanaflynn-stats-0.7.0.zip;name=github-com-montanaflynn-stats"
SRC_URI[github-com-montanaflynn-stats.sha256sum] = "661546beb7c49f92a2c798709323f5cb175251bc359c061e5933071679f9b2ef"
GOSRC_REMOVEDIRS += "github.com/montanaflynn/stats/examples"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/montanaflynn/stats/LICENSE;md5=56407134d694a1d823cf192a2fe89af0 \
"

GOSRC_INCLUDEGUARD += "github.com-montanaflynn-stats-sources.inc"

