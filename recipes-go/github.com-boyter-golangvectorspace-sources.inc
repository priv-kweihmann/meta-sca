SRC_URI += "https://proxy.golang.org/github.com/boyter/golangvectorspace/@v/v0.0.0-20190624074443-94451ed344f4.zip;srcoutput=github.com/boyter/golangvectorspace;srcinput=github.com/boyter/golangvectorspace@v0.0.0-20190624074443-94451ed344f4;downloadfilename=github-com-boyter-golangvectorspace-0.0.0-20190624074443-94451ed344f4.zip;name=github-com-boyter-golangvectorspace"
SRC_URI[github-com-boyter-golangvectorspace.sha256sum] = "e451f32dcd00fba659ed6ed1d8d358747244a4cad4b32c71dea0017564facd4d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/boyter/golangvectorspace/LICENCE;md5=2e03a9c45ba188fd78617966f0b4602f \
"

GOSRC_INCLUDEGUARD += "github.com-boyter-golangvectorspace-sources.inc"

