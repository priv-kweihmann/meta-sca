SRC_URI += "https://proxy.golang.org/github.com/markbates/grift/@v/v1.5.0.zip;srcoutput=github.com/markbates/grift;srcinput=github.com/markbates/grift@v1.5.0;downloadfilename=github-com-markbates-grift-1.5.0.zip;name=github-com-markbates-grift"
SRC_URI[github-com-markbates-grift.sha256sum] = "2eb4001196dbc2dbad42cd99ecdb24bcecd1af7f040ad87d182d311671abe243"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/markbates/grift/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-markbates-grift-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-here-sources.inc', '', 'github.com-gobuffalo-here-sources.inc', d)}
