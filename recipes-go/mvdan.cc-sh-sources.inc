SRC_URI_append = " https://github.com/mvdan/sh/archive/refs/tags/v3.2.4.zip;srcoutput=mvdan.cc/sh;srcinput=sh-3.2.4;downloadfilename=mvdan-cc-sh-3.2.4.zip;name=mvdan-cc-sh"
SRC_URI[mvdan-cc-sh.sha256sum] = "4ad35f48877132b2225343df1c504cd87024f126e2a9499b3d378f8d2c4276ba"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/mvdan.cc/sh/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
    file://src/mvdan.cc/sh/_js/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
"
