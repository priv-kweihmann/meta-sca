SRC_URI += "https://proxy.golang.org/github.com/fatih/structs/@v/v1.1.0.zip;srcoutput=github.com/fatih/structs;srcinput=github.com/fatih/structs@v1.1.0;downloadfilename=github-com-fatih-structs-1.1.0.zip;name=github-com-fatih-structs"
SRC_URI[github-com-fatih-structs.sha256sum] = "a361ecc95ad12000c66ee143d26b2aa0a4e5de3b045fd5d18a52564622a59148"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fatih/structs/LICENSE;md5=9ee102d4ddee082e91c1fce103a8cfdd \
"

GOSRC_INCLUDEGUARD += "github.com-fatih-structs-sources.inc"

