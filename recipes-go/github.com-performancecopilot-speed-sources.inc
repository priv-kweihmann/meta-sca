SRC_URI += "https://proxy.golang.org/github.com/performancecopilot/speed/@v/v2.0.0+incompatible.zip;srcoutput=github.com/performancecopilot/speed;srcinput=github.com/performancecopilot/speed@v2.0.0+incompatible;downloadfilename=github-com-performancecopilot-speed-2.0.0+incompatible.zip;name=github-com-performancecopilot-speed"
SRC_URI[github-com-performancecopilot-speed.sha256sum] = "0c6acb3367c360076929d13180c9a2361e1952eae35927bc633c2b6f3ab86947"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/performancecopilot/speed/LICENSE;md5=341d2a674724269aad196e93d56192f7 \
"

GOSRC_INCLUDEGUARD += "github.com-performancecopilot-speed-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-codahale-hdrhistogram-sources.inc', '', 'github.com-codahale-hdrhistogram-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-edsrzf-mmap-go-sources.inc', '', 'github.com-edsrzf-mmap-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.uber.org-zap-sources.inc', '', 'go.uber.org-zap-sources.inc', d)}
