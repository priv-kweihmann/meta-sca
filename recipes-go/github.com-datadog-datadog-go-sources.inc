SRC_URI += "https://github.com/DataDog/datadog-go/archive/refs/tags/v4.5.0.zip;srcoutput=github.com/DataDog/datadog-go;srcinput=datadog-go-4.5.0;downloadfilename=github-com-datadog-datadog-go-4.5.0+incompatible.zip;name=github-com-datadog-datadog-go"
SRC_URI[github-com-datadog-datadog-go.sha256sum] = "2326a87067a7fa843320e455462cbb863d2c09b3af89b6b889300eea10279727"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/DataDog/datadog-go/LICENSE.txt;md5=229fc88a2f846fc676e9edeafb0e4011 \
"

GOSRC_INCLUDEGUARD += "github.com-datadog-datadog-go-sources.inc"

