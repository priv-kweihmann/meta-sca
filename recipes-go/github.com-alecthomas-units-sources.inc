SRC_URI += "https://proxy.golang.org/github.com/alecthomas/units/@v/v0.0.0-20210912230133-d1bdfacee922.zip;srcoutput=github.com/alecthomas/units;srcinput=github.com/alecthomas/units@v0.0.0-20210912230133-d1bdfacee922;downloadfilename=github-com-alecthomas-units-0.0.0-20210912230133-d1bdfacee922.zip;name=github-com-alecthomas-units"
SRC_URI[github-com-alecthomas-units.sha256sum] = "aeb6c47b407726a74839203df7fee1a4ece9de871c8914945d5238a65d0b655a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alecthomas/units/COPYING;md5=c5ef1b09608767a6284a2cffd3b9765f \
"

GOSRC_INCLUDEGUARD += "github.com-alecthomas-units-sources.inc"

