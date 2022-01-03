SRC_URI += "git://github.com/DataDog/datadog-go;nobranch=1;protocol=https;srcinput=github.com/DataDog/datadog-go;srcoutput=github.com/DataDog/datadog-go;destsuffix=github.com/DataDog/datadog-go;name=github-com-datadog-datadog-go"
SRCREV_github-com-datadog-datadog-go = "58a0c269cb03934385f18c2f68acbcc0a87a2f91"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/DataDog/datadog-go/LICENSE.txt;md5=229fc88a2f846fc676e9edeafb0e4011 \
"

GOSRC_INCLUDEGUARD += "github.com-datadog-datadog-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-microsoft-go-winio-sources.inc', '', 'github.com-microsoft-go-winio-sources.inc', d)}
