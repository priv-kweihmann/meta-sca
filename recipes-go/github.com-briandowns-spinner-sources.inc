SRC_URI_append = " https://proxy.golang.org/github.com/briandowns/spinner/@v/v1.12.0.zip;srcoutput=github.com/briandowns/spinner;srcinput=github.com/briandowns/spinner@v1.12.0;downloadfilename=github-com-briandowns-spinner-1.12.0.zip;name=github-com-briandowns-spinner"
SRC_URI[github-com-briandowns-spinner.sha256sum] = "cc46a226c4bffdd7c772ee9536b2a62b31502404f09cff1dbc3010827aba3907"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/briandowns/spinner/LICENSE;md5=5335066555b14d832335aa4660d6c376 \
"
