SRC_URI += "git://github.com/HdrHistogram/hdrhistogram-go;nobranch=1;protocol=https;srcinput=github.com/HdrHistogram/hdrhistogram-go;srcoutput=github.com/HdrHistogram/hdrhistogram-go;destsuffix=github.com/HdrHistogram/hdrhistogram-go;name=github-com-hdrhistogram-hdrhistogram-go"
SRCREV_github-com-hdrhistogram-hdrhistogram-go = "494271c4c016b36c8cee88480288f33b419cf7b0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/HdrHistogram/hdrhistogram-go/LICENSE;md5=8f7951af356bbbfcf3d07d3b26219e45 \
"

GOSRC_INCLUDEGUARD += "github.com-hdrhistogram-hdrhistogram-go-sources.inc"

