SRC_URI += "https://proxy.golang.org/github.com/clbanning/mxj/@v/v1.8.4.zip;srcoutput=github.com/clbanning/mxj;srcinput=github.com/clbanning/mxj@v1.8.4;downloadfilename=github-com-clbanning-mxj-1.8.4.zip;name=github-com-clbanning-mxj"
SRC_URI[github-com-clbanning-mxj.sha256sum] = "8947cf617bdd9efc62817c8ddb17bafe497f35abdf10a3c60f295e387f633f70"
GOSRC_REMOVEDIRS += "github.com/clbanning/mxj/examples"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/clbanning/mxj/LICENSE;md5=127617e533e917a9d1d8ec34cd2400a6 \
    file://src/github.com/clbanning/mxj/x2j-wrapper/LICENSE;md5=a8b152d121e48e68af12e5e3834792ab \
"

GOSRC_INCLUDEGUARD += "github.com-clbanning-mxj-sources.inc"

