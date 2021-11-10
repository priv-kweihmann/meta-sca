SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/here/@v/v0.6.5.zip;srcoutput=github.com/gobuffalo/here;srcinput=github.com/gobuffalo/here@v0.6.5;downloadfilename=github-com-gobuffalo-here-0.6.5.zip;name=github-com-gobuffalo-here"
SRC_URI[github-com-gobuffalo-here.sha256sum] = "6ed15aa1ce50d835e97e4ac20568bba2822c1772c3716cd633128c206587c547"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/here/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-here-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
