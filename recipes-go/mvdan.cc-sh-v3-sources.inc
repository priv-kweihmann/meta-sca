SRC_URI_append = " https://proxy.golang.org/mvdan.cc/sh/v3/@v/v3.2.4.zip;srcoutput=mvdan.cc/sh/v3;srcinput=mvdan.cc/sh/v3@v3.2.4;downloadfilename=mvdan-cc-sh-v3-3.2.4.zip;name=mvdan-cc-sh-v3"
SRC_URI[mvdan-cc-sh-v3.sha256sum] = "23f64350c04108b636c75201cb080dac844f2b81703564eaeaf95bd7f643e532"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/mvdan.cc/sh/v3/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
"
