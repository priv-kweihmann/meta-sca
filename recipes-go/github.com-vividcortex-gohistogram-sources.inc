SRC_URI += "https://github.com/VividCortex/gohistogram/archive/refs/tags/v1.0.0.zip;srcoutput=github.com/VividCortex/gohistogram;srcinput=gohistogram-1.0.0;downloadfilename=github-com-vividcortex-gohistogram-1.0.0.zip;name=github-com-vividcortex-gohistogram"
SRC_URI[github-com-vividcortex-gohistogram.sha256sum] = "11023d1e01073bcb0a5f3e9d268508d5aa7dc7f22068d89cdde66db8cc493285"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/VividCortex/gohistogram/LICENSE;md5=13880cf5821e7668762c89bb8a6045d3 \
"

GOSRC_INCLUDEGUARD += "github.com-vividcortex-gohistogram-sources.inc"

