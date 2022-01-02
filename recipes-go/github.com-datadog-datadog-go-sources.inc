SRC_URI += "git://github.com/DataDog/datadog-go;nobranch=1;protocol=https;srcinput=github.com/DataDog/datadog-go;srcoutput=github.com/DataDog/datadog-go;destsuffix=github.com/DataDog/datadog-go;name=github-com-datadog-datadog-go"
SRCREV_github-com-datadog-datadog-go = "7e2137139c897c1327e07dcd1210f72f669fde4c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/DataDog/datadog-go/LICENSE.txt;md5=229fc88a2f846fc676e9edeafb0e4011 \
"

GOSRC_INCLUDEGUARD += "github.com-datadog-datadog-go-sources.inc"

