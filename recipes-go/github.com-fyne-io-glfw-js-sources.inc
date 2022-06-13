SRC_URI += "https://proxy.golang.org/github.com/fyne-io/glfw-js/@v/v0.0.0-20220517201726-bebc2019cd33.zip;srcoutput=github.com/fyne-io/glfw-js;srcinput=github.com/fyne-io/glfw-js@v0.0.0-20220517201726-bebc2019cd33;downloadfilename=github-com-fyne-io-glfw-js-0.0.0-20220517201726-bebc2019cd33.zip;name=github-com-fyne-io-glfw-js"
SRC_URI[github-com-fyne-io-glfw-js.sha256sum] = "19d6ad193badaf349e92d84e982dd492d1aee39e2d9d6835c5e615cea6dcafea"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fyne-io/glfw-js/LICENSE;md5=42b23326a1d135abeb3dddf8a8ac00b8 \
"

GOSRC_INCLUDEGUARD += "github.com-fyne-io-glfw-js-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', '', 'github.com-go-gl-glfw-v3.3-glfw-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gopherjs-gopherjs-sources.inc', '', 'github.com-gopherjs-gopherjs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'honnef.co-go-js-dom-sources.inc', '', 'honnef.co-go-js-dom-sources.inc', d)}
