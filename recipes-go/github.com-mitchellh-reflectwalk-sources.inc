SRC_URI += "https://proxy.golang.org/github.com/mitchellh/reflectwalk/@v/v1.0.2.zip;srcoutput=github.com/mitchellh/reflectwalk;srcinput=github.com/mitchellh/reflectwalk@v1.0.2;downloadfilename=github-com-mitchellh-reflectwalk-1.0.2.zip;name=github-com-mitchellh-reflectwalk"
SRC_URI[github-com-mitchellh-reflectwalk.sha256sum] = "c96eed6b50f00b1acdc79224e8e55f66ef3e98e3f7c6373afa3e3b8c6ef440d1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/reflectwalk/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-reflectwalk-sources.inc"

