SRC_URI += "https://proxy.golang.org/github.com/mitchellh/mapstructure/@v/v1.4.2.zip;srcoutput=github.com/mitchellh/mapstructure;srcinput=github.com/mitchellh/mapstructure@v1.4.2;downloadfilename=github-com-mitchellh-mapstructure-1.4.2.zip;name=github-com-mitchellh-mapstructure"
SRC_URI[github-com-mitchellh-mapstructure.sha256sum] = "b161f31040680c387330916d92d2dd2a29eb94fa317e8741ec5fbc2b712b39fd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/mapstructure/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-mapstructure-sources.inc"

