SRC_URI += "https://proxy.golang.org/github.com/fyne-io/gl-js/@v/v0.0.0-20230506162202-1fdaa286a934.zip;srcoutput=github.com/fyne-io/gl-js;srcinput=github.com/fyne-io/gl-js@v0.0.0-20230506162202-1fdaa286a934;downloadfilename=github-com-fyne-io-gl-js-0.0.0-20230506162202-1fdaa286a934.zip;name=github-com-fyne-io-gl-js"
SRC_URI[github-com-fyne-io-gl-js.sha256sum] = "5908d356964c52f437b68f54083885d10bdf4d52892ac39efef23d8ba17fb0ba"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fyne-io/gl-js/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "github.com-fyne-io-gl-js-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-gl-sources.inc', '', 'github.com-go-gl-gl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gopherjs-gopherjs-sources.inc', '', 'github.com-gopherjs-gopherjs-sources.inc', d)}
