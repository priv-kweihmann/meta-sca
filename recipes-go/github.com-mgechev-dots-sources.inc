SRC_URI += "https://proxy.golang.org/github.com/mgechev/dots/@v/v0.0.0-20210922191527-e955255bf517.zip;srcoutput=github.com/mgechev/dots;srcinput=github.com/mgechev/dots@v0.0.0-20210922191527-e955255bf517;downloadfilename=github-com-mgechev-dots-0.0.0-20210922191527-e955255bf517.zip;name=github-com-mgechev-dots"
SRC_URI[github-com-mgechev-dots.sha256sum] = "4c7dd3e110685eb3e5955032bf2beaa0b062bcebaaa06a1d4a097c3aef83af17"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mgechev/dots/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0 \
"

GOSRC_INCLUDEGUARD += "github.com-mgechev-dots-sources.inc"

