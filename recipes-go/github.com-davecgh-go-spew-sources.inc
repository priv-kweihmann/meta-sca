SRC_URI_append = " https://proxy.golang.org/github.com/davecgh/go-spew/@v/v1.1.1.zip;srcoutput=github.com/davecgh/go-spew;srcinput=github.com/davecgh/go-spew@v1.1.1;downloadfilename=github-com-davecgh-go-spew-1.1.1.zip;name=github-com-davecgh-go-spew"
SRC_URI[github-com-davecgh-go-spew.sha256sum] = "6b44a843951f371b7010c754ecc3cabefe815d5ced1c5b9409fb2d697e8a890d"

MOD_LICENSE_append = " \
    ISC \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/davecgh/go-spew/LICENSE;md5=c06795ed54b2a35ebeeb543cd3a73e56 \
"
