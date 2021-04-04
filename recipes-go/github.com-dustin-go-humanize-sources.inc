SRC_URI += "https://proxy.golang.org/github.com/dustin/go-humanize/@v/v1.0.0.zip;srcoutput=github.com/dustin/go-humanize;srcinput=github.com/dustin/go-humanize@v1.0.0;downloadfilename=github-com-dustin-go-humanize-1.0.0.zip;name=github-com-dustin-go-humanize"
SRC_URI[github-com-dustin-go-humanize.sha256sum] = "e01916e082a6646ea12d7800d77af43045c27284ff2a0a77e3484509989cc107"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/dustin/go-humanize/LICENSE;md5=8c6127b79304a5e0a5756d03c7a58766 \
"

GOSRC_INCLUDEGUARD += "github.com-dustin-go-humanize-sources.inc"

