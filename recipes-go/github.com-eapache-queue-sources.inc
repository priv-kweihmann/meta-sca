SRC_URI_append = " https://proxy.golang.org/github.com/eapache/queue/@v/v1.1.0.zip;srcoutput=github.com/eapache/queue;srcinput=github.com/eapache/queue@v1.1.0;downloadfilename=github-com-eapache-queue-1.1.0.zip;name=github-com-eapache-queue"
SRC_URI[github-com-eapache-queue.sha256sum] = "1dc1b4972e8505c4763c65424b19604c65c944911d16c18c5cbd35aae45626fb"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/eapache/queue/LICENSE;md5=1bfd4408d3de090ef6b908b0cc45a316 \
"
