SUMMARY = "NPM: buffer-from"
DESCRIPTION = "A [ponyfill](https://ponyfill.com) for `Buffer.from`, uses native implementation if available."
HOMEPAGE = "https://github.com/LinusU/buffer-from#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6"

SRC_URI = "https://registry.npmjs.org/buffer-from/-/buffer-from-1.1.1.tgz"
SRC_URI[md5sum] = "31362580a0ba40b9f49cb366ab813720"
SRC_URI[sha256sum] = "190e58c1e792ad01bd311e630070cc90ef071210201ac2421530fb1b38ffb99d"

NPM_PKGNAME = "buffer-from"

inherit npmhelper
inherit native
