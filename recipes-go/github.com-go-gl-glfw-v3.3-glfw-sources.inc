SRC_URI += "https://proxy.golang.org/github.com/go-gl/glfw/v3.3/glfw/@v/v0.0.0-20220320163800-277f93cfa958.zip;srcoutput=github.com/go-gl/glfw/v3.3/glfw;srcinput=github.com/go-gl/glfw/v3.3/glfw@v0.0.0-20220320163800-277f93cfa958;downloadfilename=github-com-go-gl-glfw-v3-3-glfw-0.0.0-20220320163800-277f93cfa958.zip;name=github-com-go-gl-glfw-v3-3-glfw"
SRC_URI[github-com-go-gl-glfw-v3-3-glfw.sha256sum] = "92a4c576548533795e9a41664364ca621ff6a27cff17b4c70e395dda922f05c0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Zlib \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-gl/glfw/v3.3/glfw/LICENSE;md5=5f35eb15e915e972fe5ae1d80d363e73 \
    file://src/github.com/go-gl/glfw/v3.3/glfw/glfw/LICENSE.md;md5=98d93d1ddc537f9b9ea6def64e046b5f \
"

GOSRC_INCLUDEGUARD += "github.com-go-gl-glfw-v3.3-glfw-sources.inc"

