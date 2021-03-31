SRC_URI_append = " https://proxy.golang.org/github.com/securego/gosec/@v/v0.0.0-20200401082031-e946c8c39989.zip;srcoutput=github.com/securego/gosec;srcinput=github.com/securego/gosec@v0.0.0-20200401082031-e946c8c39989;downloadfilename=github-com-securego-gosec-0.0.0-20200401082031-e946c8c39989.zip;name=github-com-securego-gosec"
SRC_URI[github-com-securego-gosec.sha256sum] = "0a03c5d19a03b6e2f4d183233f228bfe56a23a216c6bac7b0382f50c85300436"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/securego/gosec/LICENSE.txt;md5=d3999b969cc50f5755737db7ce41ca2e \
"
