SRC_URI += "https://proxy.golang.org/github.com/mcuadros/go-version/@v/v0.0.0-20190830083331-035f6764e8d2.zip;srcoutput=github.com/mcuadros/go-version;srcinput=github.com/mcuadros/go-version@v0.0.0-20190830083331-035f6764e8d2;downloadfilename=github-com-mcuadros-go-version-0.0.0-20190830083331-035f6764e8d2.zip;name=github-com-mcuadros-go-version"
SRC_URI[github-com-mcuadros-go-version.sha256sum] = "ff2364bda8605ad94051c576ffa601e1a9aedabc8a1fda588eb04c3371a845ea"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcuadros/go-version/LICENSE;md5=4de853ec9a1fc47190696d8175bd76cb \
"

GOSRC_INCLUDEGUARD += "github.com-mcuadros-go-version-sources.inc"

