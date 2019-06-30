require cppcheck.inc

SRC_URI = "https://github.com/danmar/cppcheck/archive/${PV}.tar.gz \
           file://0001-Makefile-fixes.patch \
           file://cppcheck.sca.description \
           file://cppcheck.sca.score"
SRC_URI[md5sum] = "0fc4c8180cacc07917b752ddd26954ea"
SRC_URI[sha256sum] = "4aace0420d6aaa900b84b3329c5173c2294e251d2e24d8cba6e38254333dde3f"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"