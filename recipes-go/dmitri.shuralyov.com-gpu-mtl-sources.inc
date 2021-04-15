SRC_URI += "https://proxy.golang.org/dmitri.shuralyov.com/gpu/mtl/@v/v0.0.0-20201218220906-28db891af037.zip;srcoutput=dmitri.shuralyov.com/gpu/mtl;srcinput=dmitri.shuralyov.com/gpu/mtl@v0.0.0-20201218220906-28db891af037;downloadfilename=dmitri-shuralyov-com-gpu-mtl-0.0.0-20201218220906-28db891af037.zip;name=dmitri-shuralyov-com-gpu-mtl"
SRC_URI[dmitri-shuralyov-com-gpu-mtl.sha256sum] = "d9992a60371571861985f191ac38954db2cc1bd36e834058ad50f989ccc8fa06"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/dmitri.shuralyov.com/gpu/mtl/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "dmitri.shuralyov.com-gpu-mtl-sources.inc"

