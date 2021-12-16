SRC_URI += "https://proxy.golang.org/github.com/go-gl/glfw/v3.3/glfw/@v/v0.0.0-20211213063430-748e38ca8aec.zip;srcoutput=github.com/go-gl/glfw/v3.3/glfw;srcinput=github.com/go-gl/glfw/v3.3/glfw@v0.0.0-20211213063430-748e38ca8aec;downloadfilename=github-com-go-gl-glfw-v3-3-glfw-0.0.0-20211213063430-748e38ca8aec.zip;name=github-com-go-gl-glfw-v3-3-glfw"
SRC_URI[github-com-go-gl-glfw-v3-3-glfw.sha256sum] = "79e7759b76209d0e8ab04681510b4f87c411faeca29ea1519394b58fcafdc1f1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Zlib \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-gl/glfw/v3.3/glfw/LICENSE;md5=5f35eb15e915e972fe5ae1d80d363e73 \
    file://src/github.com/go-gl/glfw/v3.3/glfw/glfw/LICENSE.md;md5=98d93d1ddc537f9b9ea6def64e046b5f \
"

GOSRC_INCLUDEGUARD += "github.com-go-gl-glfw-v3.3-glfw-sources.inc"

