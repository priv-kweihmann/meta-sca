SRC_URI_append = " https://proxy.golang.org/github.com/eapache/go-resiliency/@v/v1.2.0.zip;srcoutput=github.com/eapache/go-resiliency;srcinput=github.com/eapache/go-resiliency@v1.2.0;downloadfilename=github-com-eapache-go-resiliency-1.2.0.zip;name=github-com-eapache-go-resiliency"
SRC_URI[github-com-eapache-go-resiliency.sha256sum] = "39333303f947a85e0c35e9969d56e05776034b1ae91e75cbf9211ead5870d982"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/eapache/go-resiliency/LICENSE;md5=b5d5c42dfd88384315d2340222c139ab \
"
