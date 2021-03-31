SRC_URI_append = " https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.3.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.3;downloadfilename=github-com-yuin-goldmark-1.3.3.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "27989c5045f0ed7ee13f7f74bd274665275b9896ae6b5b55058a37db01f957e3"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"
