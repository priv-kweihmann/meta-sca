SRC_URI_append = " https://proxy.golang.org/github.com/iancoleman/strcase/@v/v0.1.3.zip;srcoutput=github.com/iancoleman/strcase;srcinput=github.com/iancoleman/strcase@v0.1.3;downloadfilename=github-com-iancoleman-strcase-0.1.3.zip;name=github-com-iancoleman-strcase"
SRC_URI[github-com-iancoleman-strcase.sha256sum] = "fb3467c6559845254b904335df5092ed402a6a4b6c7983e5a24aad3707c59bc6"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/iancoleman/strcase/LICENSE;md5=809a7bcb6415543e8f857d969bd45c95 \
"
