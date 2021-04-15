SRC_URI += "https://proxy.golang.org/github.com/go-gl/glfw/v3.3/glfw/@v/v0.0.0-20210410170116-ea3d685f79fb.zip;srcoutput=github.com/go-gl/glfw/v3.3/glfw;srcinput=github.com/go-gl/glfw/v3.3/glfw@v0.0.0-20210410170116-ea3d685f79fb;downloadfilename=github-com-go-gl-glfw-v3-3-glfw-0.0.0-20210410170116-ea3d685f79fb.zip;name=github-com-go-gl-glfw-v3-3-glfw"
SRC_URI[github-com-go-gl-glfw-v3-3-glfw.sha256sum] = "5a9407bff3f70d9d1e8ba23cd4293296c9910e3256fc31b9f2d90d7c38625e59"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Zlib \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-gl/glfw/v3.3/glfw/LICENSE;md5=5f35eb15e915e972fe5ae1d80d363e73 \
    file://src/github.com/go-gl/glfw/v3.3/glfw/glfw/LICENSE.md;md5=98d93d1ddc537f9b9ea6def64e046b5f \
"

GOSRC_INCLUDEGUARD += "github.com-go-gl-glfw-v3.3-glfw-sources.inc"

