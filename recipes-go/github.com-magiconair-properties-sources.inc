SRC_URI += "https://proxy.golang.org/github.com/magiconair/properties/@v/v1.8.6.zip;srcoutput=github.com/magiconair/properties;srcinput=github.com/magiconair/properties@v1.8.6;downloadfilename=github-com-magiconair-properties-1.8.6.zip;name=github-com-magiconair-properties"
SRC_URI[github-com-magiconair-properties.sha256sum] = "649dd0dac8fa6d7f2d5e6d1e7fe4a57ecb6c05346c8f6f15968dd66ebaf7212a"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/magiconair/properties/LICENSE.md;md5=714beb7325ffa89d5a68d936a3bb04e5 \
"

GOSRC_INCLUDEGUARD += "github.com-magiconair-properties-sources.inc"

