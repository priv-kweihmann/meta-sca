SRC_URI += "https://proxy.golang.org/github.com/fyne-io/gl-js/@v/v0.0.0-20220516203408-b35fbccb7063.zip;srcoutput=github.com/fyne-io/gl-js;srcinput=github.com/fyne-io/gl-js@v0.0.0-20220516203408-b35fbccb7063;downloadfilename=github-com-fyne-io-gl-js-0.0.0-20220516203408-b35fbccb7063.zip;name=github-com-fyne-io-gl-js"
SRC_URI[github-com-fyne-io-gl-js.sha256sum] = "9747c4231b594ac742065681a49cfc00e3deb18b7465c5bb01003f53307cb795"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fyne-io/gl-js/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "github.com-fyne-io-gl-js-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-gl-sources.inc', '', 'github.com-go-gl-gl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gopherjs-gopherjs-sources.inc', '', 'github.com-gopherjs-gopherjs-sources.inc', d)}
