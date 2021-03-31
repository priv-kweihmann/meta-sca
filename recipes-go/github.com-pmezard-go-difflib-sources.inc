SRC_URI_append = " https://proxy.golang.org/github.com/pmezard/go-difflib/@v/v1.0.0.zip;srcoutput=github.com/pmezard/go-difflib;srcinput=github.com/pmezard/go-difflib@v1.0.0;downloadfilename=github-com-pmezard-go-difflib-1.0.0.zip;name=github-com-pmezard-go-difflib"
SRC_URI[github-com-pmezard-go-difflib.sha256sum] = "de04cecc1a4b8d53e4357051026794bcbc54f2e6a260cfac508ce69d5d6457a0"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/pmezard/go-difflib/LICENSE;md5=e9a2ebb8de779a07500ddecca806145e \
"
