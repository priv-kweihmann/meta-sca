SRC_URI += "https://proxy.golang.org/github.com/mgechev/dots/@v/v0.0.0-20190921121421-c36f7dcfbb81.zip;srcoutput=github.com/mgechev/dots;srcinput=github.com/mgechev/dots@v0.0.0-20190921121421-c36f7dcfbb81;downloadfilename=github-com-mgechev-dots-0.0.0-20190921121421-c36f7dcfbb81.zip;name=github-com-mgechev-dots"
SRC_URI[github-com-mgechev-dots.sha256sum] = "702fe332de9c4c0bc4bd1a2d248250c00c1c2f59e076258c11ae2cb38c103ed3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mgechev/dots/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0 \
"

GOSRC_INCLUDEGUARD += "github.com-mgechev-dots-sources.inc"

