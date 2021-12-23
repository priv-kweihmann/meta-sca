SUMMARY = "NPM: buffer-from"
DESCRIPTION = "A [ponyfill](https://ponyfill.com) for `Buffer.from`, uses native implementation if available."
HOMEPAGE = "https://github.com/LinusU/buffer-from#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/buffer-from/-/buffer-from-1.1.2.tgz"
SRC_URI[md5sum] = "5fe5f473dc3263473041a56654581058"
SRC_URI[sha256sum] = "9c2b03d59eca8f463a1927e07273ddaa87785fe3f61626c42b005540e962e343"

NPM_PKGNAME = "buffer-from"

inherit npmhelper
inherit native
