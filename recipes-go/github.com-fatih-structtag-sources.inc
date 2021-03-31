SRC_URI_append = " https://proxy.golang.org/github.com/fatih/structtag/@v/v1.2.0.zip;srcoutput=github.com/fatih/structtag;srcinput=github.com/fatih/structtag@v1.2.0;downloadfilename=github-com-fatih-structtag-1.2.0.zip;name=github-com-fatih-structtag"
SRC_URI[github-com-fatih-structtag.sha256sum] = "9fe0ed2128614a3c35c4149febde484cfae8c5ecb13c128957cfcdf2776dd1eb"

MOD_LICENSE_append = " \
    BSD-3-Clause \
    CC-BY-3.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/fatih/structtag/LICENSE;md5=7cd9e46c722ee0e2532709c7ab80abaf \
"
