SRC_URI += "https://proxy.golang.org/dmitri.shuralyov.com/gpu/mtl/@v/v0.0.0-20221208032759-85de2813cf6b.zip;srcoutput=dmitri.shuralyov.com/gpu/mtl;srcinput=dmitri.shuralyov.com/gpu/mtl@v0.0.0-20221208032759-85de2813cf6b;downloadfilename=dmitri-shuralyov-com-gpu-mtl-0.0.0-20221208032759-85de2813cf6b.zip;name=dmitri-shuralyov-com-gpu-mtl"
SRC_URI[dmitri-shuralyov-com-gpu-mtl.sha256sum] = "a0b264e88f5a4f4b97e3b6ab8b3d1284a5a14c99a545b734312ce5b32cc8dc65"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/dmitri.shuralyov.com/gpu/mtl/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"

GOSRC_INCLUDEGUARD += "dmitri.shuralyov.com-gpu-mtl-sources.inc"

