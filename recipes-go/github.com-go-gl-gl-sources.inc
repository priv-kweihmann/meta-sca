SRC_URI += "https://proxy.golang.org/github.com/go-gl/gl/@v/v0.0.0-20211210172815-726fda9656d6.zip;srcoutput=github.com/go-gl/gl;srcinput=github.com/go-gl/gl@v0.0.0-20211210172815-726fda9656d6;downloadfilename=github-com-go-gl-gl-0.0.0-20211210172815-726fda9656d6.zip;name=github-com-go-gl-gl"
SRC_URI[github-com-go-gl-gl.sha256sum] = "25f3f14188565565b95bef7b955e1c6e0d06bccb90b2c598a078e9c73b6f66dd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-gl/gl/LICENSE;md5=e8376916c1650f3f02ac6eec88bf40ab \
"

GOSRC_INCLUDEGUARD += "github.com-go-gl-gl-sources.inc"

