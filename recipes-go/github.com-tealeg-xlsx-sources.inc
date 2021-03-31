SRC_URI_append = " https://proxy.golang.org/github.com/tealeg/xlsx/@v/v1.0.5.zip;srcoutput=github.com/tealeg/xlsx;srcinput=github.com/tealeg/xlsx@v1.0.5;downloadfilename=github-com-tealeg-xlsx-1.0.5.zip;name=github-com-tealeg-xlsx"
SRC_URI[github-com-tealeg-xlsx.sha256sum] = "ff32f4336aed03df7c9cb7a4df9f1f42a1c64fe5d17c34566159511943d24bde"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/tealeg/xlsx/LICENSE;md5=f609f72877939978ce194fa2431db040 \
"
