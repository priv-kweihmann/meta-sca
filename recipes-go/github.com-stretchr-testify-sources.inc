SRC_URI_append = " https://proxy.golang.org/github.com/stretchr/testify/@v/v1.7.0.zip;srcoutput=github.com/stretchr/testify;srcinput=github.com/stretchr/testify@v1.7.0;downloadfilename=github-com-stretchr-testify-1.7.0.zip;name=github-com-stretchr-testify"
SRC_URI[github-com-stretchr-testify.sha256sum] = "5a46ccebeff510df3e2f6d3842ee79d3f68d0e7b1554cd6ee93390d68b6c6b34"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/stretchr/testify/LICENSE;md5=188f01994659f3c0d310612333d2a26f \
"
