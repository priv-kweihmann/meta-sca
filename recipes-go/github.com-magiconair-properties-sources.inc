SRC_URI += "https://proxy.golang.org/github.com/magiconair/properties/@v/v1.8.5.zip;srcoutput=github.com/magiconair/properties;srcinput=github.com/magiconair/properties@v1.8.5;downloadfilename=github-com-magiconair-properties-1.8.5.zip;name=github-com-magiconair-properties"
SRC_URI[github-com-magiconair-properties.sha256sum] = "fa056b3c72df6a36c991e9f22285818b07e377bf07c7beb441d9a097b2d6263e"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/magiconair/properties/LICENSE.md;md5=714beb7325ffa89d5a68d936a3bb04e5 \
"

GOSRC_INCLUDEGUARD += "github.com-magiconair-properties-sources.inc"

