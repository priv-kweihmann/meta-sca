SRC_URI += "https://proxy.golang.org/github.com/martini-contrib/render/@v/v0.0.0-20150707142108-ec18f8345a11.zip;srcoutput=github.com/martini-contrib/render;srcinput=github.com/martini-contrib/render@v0.0.0-20150707142108-ec18f8345a11;downloadfilename=github-com-martini-contrib-render-0.0.0-20150707142108-ec18f8345a11.zip;name=github-com-martini-contrib-render"
SRC_URI[github-com-martini-contrib-render.sha256sum] = "2edd7f64b2f1f053f86a51856cd0f02b1f762af61a458a2e282dab76ad093d70"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/martini-contrib/render/LICENSE;md5=a0cc7235249ae603a14e7092ceb784b0 \
"

GOSRC_INCLUDEGUARD += "github.com-martini-contrib-render-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-martini-martini-sources.inc', '', 'github.com-go-martini-martini-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-oxtoacart-bpool-sources.inc', '', 'github.com-oxtoacart-bpool-sources.inc', d)}
