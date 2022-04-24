SRC_URI += "https://proxy.golang.org/github.com/mitchellh/mapstructure/@v/v1.5.0.zip;srcoutput=github.com/mitchellh/mapstructure;srcinput=github.com/mitchellh/mapstructure@v1.5.0;downloadfilename=github-com-mitchellh-mapstructure-1.5.0.zip;name=github-com-mitchellh-mapstructure"
SRC_URI[github-com-mitchellh-mapstructure.sha256sum] = "118d5b2cb65c50dba967fb6d708f450a9caf93f321f8fc99080675b2ee374199"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/mapstructure/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-mapstructure-sources.inc"

