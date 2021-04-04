SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/events/@v/v1.4.1.zip;srcoutput=github.com/gobuffalo/events;srcinput=github.com/gobuffalo/events@v1.4.1;downloadfilename=github-com-gobuffalo-events-1.4.1.zip;name=github-com-gobuffalo-events"
SRC_URI[github-com-gobuffalo-events.sha256sum] = "76075818fc3a5019759fa8c3ae035a03c4347bd678e4c8343cdebbe51364c07c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/events/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-events-sources.inc"

