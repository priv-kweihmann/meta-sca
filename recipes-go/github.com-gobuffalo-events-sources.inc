SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/events/@v/v1.4.2.zip;srcoutput=github.com/gobuffalo/events;srcinput=github.com/gobuffalo/events@v1.4.2;downloadfilename=github-com-gobuffalo-events-1.4.2.zip;name=github-com-gobuffalo-events"
SRC_URI[github-com-gobuffalo-events.sha256sum] = "8e816af278dd7a0b7c157614f12e29b7bff6f897aceb20ad87cf5ec5300076e5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/events/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-events-sources.inc"

