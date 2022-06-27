SRC_URI += "https://proxy.golang.org/github.com/go-gl/glfw/v3.3/glfw/@v/v0.0.0-20220622232848-a6c407ee30a0.zip;srcoutput=github.com/go-gl/glfw/v3.3/glfw;srcinput=github.com/go-gl/glfw/v3.3/glfw@v0.0.0-20220622232848-a6c407ee30a0;downloadfilename=github-com-go-gl-glfw-v3-3-glfw-0.0.0-20220622232848-a6c407ee30a0.zip;name=github-com-go-gl-glfw-v3-3-glfw"
SRC_URI[github-com-go-gl-glfw-v3-3-glfw.sha256sum] = "d79c48c7d992638d299ecf0c84f1d59865573fa1e9e6bfd0350c18a6ab288fdb"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    Zlib \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-gl/glfw/v3.3/glfw/LICENSE;md5=5f35eb15e915e972fe5ae1d80d363e73 \
    file://src/github.com/go-gl/glfw/v3.3/glfw/glfw/LICENSE.md;md5=98d93d1ddc537f9b9ea6def64e046b5f \
"

GOSRC_INCLUDEGUARD += "github.com-go-gl-glfw-v3.3-glfw-sources.inc"

