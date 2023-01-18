SRC_URI += "https://proxy.golang.org/github.com/dustin/go-humanize/@v/v1.0.1.zip;srcoutput=github.com/dustin/go-humanize;srcinput=github.com/dustin/go-humanize@v1.0.1;downloadfilename=github-com-dustin-go-humanize-1.0.1.zip;name=github-com-dustin-go-humanize"
SRC_URI[github-com-dustin-go-humanize.sha256sum] = "319404ea84c8a4e2d3d83f30988b006e7dd04976de3e1a1a90484ad94679fa46"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/dustin/go-humanize/LICENSE;md5=8c6127b79304a5e0a5756d03c7a58766 \
"

GOSRC_INCLUDEGUARD += "github.com-dustin-go-humanize-sources.inc"

