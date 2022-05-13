SRC_URI += "https://proxy.golang.org/github.com/performancecopilot/speed/v4/@v/v4.0.0.zip;srcoutput=github.com/performancecopilot/speed/v4;srcinput=github.com/performancecopilot/speed/v4@v4.0.0;downloadfilename=github-com-performancecopilot-speed-v4-4.0.0.zip;name=github-com-performancecopilot-speed-v4"
SRC_URI[github-com-performancecopilot-speed-v4.sha256sum] = "afa736f6fc2723310cf24ec66ad7c5d9ac1908f1d7d1d25e46ad07052d17b0cc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/performancecopilot/speed/v4/LICENSE;md5=341d2a674724269aad196e93d56192f7 \
"

GOSRC_INCLUDEGUARD += "github.com-performancecopilot-speed-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-edsrzf-mmap-go-sources.inc', '', 'github.com-edsrzf-mmap-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hdrhistogram-hdrhistogram-go-sources.inc', '', 'github.com-hdrhistogram-hdrhistogram-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
