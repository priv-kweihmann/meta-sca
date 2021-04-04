SRC_URI += "https://github.com/Knetic/govaluate/archive/refs/tags/v3.0.0.zip;srcoutput=github.com/Knetic/govaluate;srcinput=govaluate-3.0.0;downloadfilename=github-com-knetic-govaluate-3.0.0+incompatible.zip;name=github-com-knetic-govaluate"
SRC_URI[github-com-knetic-govaluate.sha256sum] = "884038fdad05f64fbc33f4921e9d61f487732bd58238978da146b1987f394a4a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Knetic/govaluate/LICENSE;md5=bf6ae48cca7d6fb204c6aa2c46743baa \
"

GOSRC_INCLUDEGUARD += "github.com-knetic-govaluate-sources.inc"

