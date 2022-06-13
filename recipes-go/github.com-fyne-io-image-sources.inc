SRC_URI += "https://proxy.golang.org/github.com/fyne-io/image/@v/v0.0.0-20220602074514-4956b0afb3d2.zip;srcoutput=github.com/fyne-io/image;srcinput=github.com/fyne-io/image@v0.0.0-20220602074514-4956b0afb3d2;downloadfilename=github-com-fyne-io-image-0.0.0-20220602074514-4956b0afb3d2.zip;name=github-com-fyne-io-image"
SRC_URI[github-com-fyne-io-image.sha256sum] = "d0ecdba4bced0978e1e3d95ef18c15433c54a39b6066cb814c99bd128ea64912"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fyne-io/image/LICENSE;md5=d54240b4ccfbf0b20a67b628b48a67ed \
    file://src/github.com/fyne-io/image/ico/LICENSE-reader;md5=e3fc50a88d0a364313df4b21ef20c29e \
    file://src/github.com/fyne-io/image/ico/LICENSE-writer;md5=591778525c869cdde0ab5a1bf283cd81 \
"

GOSRC_INCLUDEGUARD += "github.com-fyne-io-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jsummers-gobmp-sources.inc', '', 'github.com-jsummers-gobmp-sources.inc', d)}
