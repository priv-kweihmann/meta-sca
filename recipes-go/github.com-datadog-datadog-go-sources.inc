SRC_URI_append = " https://github.com/DataDog/datadog-go/archive/refs/tags/v4.5.0.zip;srcoutput=github.com/DataDog/datadog-go;srcinput=datadog-go-4.5.0;downloadfilename=github-com-datadog-datadog-go-4.5.0+incompatible.zip;name=github-com-datadog-datadog-go"
SRC_URI[github-com-datadog-datadog-go.sha256sum] = "2326a87067a7fa843320e455462cbb863d2c09b3af89b6b889300eea10279727"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/DataDog/datadog-go/LICENSE.txt;md5=229fc88a2f846fc676e9edeafb0e4011 \
"
