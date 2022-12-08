SRC_URI += "https://proxy.golang.org/github.com/magiconair/properties/@v/v1.8.7.zip;srcoutput=github.com/magiconair/properties;srcinput=github.com/magiconair/properties@v1.8.7;downloadfilename=github-com-magiconair-properties-1.8.7.zip;name=github-com-magiconair-properties"
SRC_URI[github-com-magiconair-properties.sha256sum] = "ae77e5969fe064035fb543004478c3a819f95bb7bc1da084435bb2134532aaa7"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/magiconair/properties/LICENSE.md;md5=714beb7325ffa89d5a68d936a3bb04e5 \
"

GOSRC_INCLUDEGUARD += "github.com-magiconair-properties-sources.inc"

