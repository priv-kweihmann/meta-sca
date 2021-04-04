SRC_URI += "https://proxy.golang.org/github.com/mitchellh/reflectwalk/@v/v1.0.1.zip;srcoutput=github.com/mitchellh/reflectwalk;srcinput=github.com/mitchellh/reflectwalk@v1.0.1;downloadfilename=github-com-mitchellh-reflectwalk-1.0.1.zip;name=github-com-mitchellh-reflectwalk"
SRC_URI[github-com-mitchellh-reflectwalk.sha256sum] = "bf1d4540bf05ea244e65fca3e9f859d8129c381adaeebe7f22703959aadc4210"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mitchellh/reflectwalk/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"

GOSRC_INCLUDEGUARD += "github.com-mitchellh-reflectwalk-sources.inc"

