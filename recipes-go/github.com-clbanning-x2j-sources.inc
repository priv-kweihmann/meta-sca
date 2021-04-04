SRC_URI += "https://proxy.golang.org/github.com/clbanning/x2j/@v/v0.0.0-20191024224557-825249438eec.zip;srcoutput=github.com/clbanning/x2j;srcinput=github.com/clbanning/x2j@v0.0.0-20191024224557-825249438eec;downloadfilename=github-com-clbanning-x2j-0.0.0-20191024224557-825249438eec.zip;name=github-com-clbanning-x2j"
SRC_URI[github-com-clbanning-x2j.sha256sum] = "747daafe80e4ac504626c01a1d28b1a64b785586975a47b50d62853a444b72a0"
GOSRC_REMOVEDIRS += "github.com/clbanning/x2j/examples"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/clbanning/x2j/LICENSE;md5=a8b152d121e48e68af12e5e3834792ab \
"

GOSRC_INCLUDEGUARD += "github.com-clbanning-x2j-sources.inc"

