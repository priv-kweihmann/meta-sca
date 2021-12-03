SRC_URI += "https://proxy.golang.org/github.com/mitchellh/mapstructure/@v/v1.4.3.zip;srcoutput=github.com/mitchellh/mapstructure;srcinput=github.com/mitchellh/mapstructure@v1.4.3;downloadfilename=github-com-mitchellh-mapstructure-1.4.3.zip;name=github-com-mitchellh-mapstructure"
SRC_URI[github-com-mitchellh-mapstructure.sha256sum] = "87dabbf71bb4e829595cb399e20c1b15b7bac2092aa67ca7b71d1bf0ec3b68b7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/mapstructure/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-mapstructure-sources.inc"

