require cppcheck.inc

PV = "1.82"

SRC_URI = " https://github.com/danmar/cppcheck/archive/${PV}.tar.gz \
            file://0001-makefile.patch \
            file://0002-pkgconfig-instaed-of-pcre-config.patch"
SRC_URI[md5sum] = "80f7b8a0612f39efd18344d84e8a45e0"
SRC_URI[sha256sum] = "524444a678e63dee247fd8d2fe3194317c07f2aa65de31a41aa2eb0553bbdc7f"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"