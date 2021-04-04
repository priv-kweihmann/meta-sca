SRC_URI += "https://proxy.golang.org/github.com/alecthomas/template/@v/v0.0.0-20190718012654-fb15b899a751.zip;srcoutput=github.com/alecthomas/template;srcinput=github.com/alecthomas/template@v0.0.0-20190718012654-fb15b899a751;downloadfilename=github-com-alecthomas-template-0.0.0-20190718012654-fb15b899a751.zip;name=github-com-alecthomas-template"
SRC_URI[github-com-alecthomas-template.sha256sum] = "25e3be7192932d130d0af31ce5bcddae887647ba4afcfb32009c3b9b79dbbdb3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alecthomas/template/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81 \
"

GOSRC_INCLUDEGUARD += "github.com-alecthomas-template-sources.inc"

