require cppcheck.inc

SRC_URI = " https://github.com/danmar/cppcheck/archive/${PV}.tar.gz \
            file://0001-makefile.patch \
            file://0002-pkgconfig-instaed-of-pcre-config.patch"
SRC_URI[md5sum] = "9ae557751c758631055a0ba2b8ddfb9c"
SRC_URI[sha256sum] = "86ea85c2ee5ec31a7410bfc7c206b87e600d284089428750d66d1ce1ffa0c9a6"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"