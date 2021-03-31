SRC_URI_append = " https://proxy.golang.org/github.com/armon/circbuf/@v/v0.0.0-20190214190532-5111143e8da2.zip;srcoutput=github.com/armon/circbuf;srcinput=github.com/armon/circbuf@v0.0.0-20190214190532-5111143e8da2;downloadfilename=github-com-armon-circbuf-0.0.0-20190214190532-5111143e8da2.zip;name=github-com-armon-circbuf"
SRC_URI[github-com-armon-circbuf.sha256sum] = "c8b7ba977844b5378a2413c123c3e55d0885fb67f64ad6cf06575a791a36b827"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/armon/circbuf/LICENSE;md5=d2d77030c0183e3d1e66d26dc1f243be \
"
