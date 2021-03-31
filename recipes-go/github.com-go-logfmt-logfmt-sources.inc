SRC_URI_append = " https://proxy.golang.org/github.com/go-logfmt/logfmt/@v/v0.5.0.zip;srcoutput=github.com/go-logfmt/logfmt;srcinput=github.com/go-logfmt/logfmt@v0.5.0;downloadfilename=github-com-go-logfmt-logfmt-0.5.0.zip;name=github-com-go-logfmt-logfmt"
SRC_URI[github-com-go-logfmt-logfmt.sha256sum] = "59a6b59ae3da84f7a58373844ca8d298f5007ce0e173437fc85c26d4fc76ca8b"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/go-logfmt/logfmt/LICENSE;md5=98e39517c38127f969de33057067091e \
"
