SUMMARY = "NPM: adverb-where"
DESCRIPTION = "Find adverbs in your writings"
HOMEPAGE = "https://github.com/duereg/adverb-where"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/adverb-where/-/adverb-where-0.2.5.tgz"
SRC_URI[md5sum] = "decd7973016fd6273e6837bea553ecdb"
SRC_URI[sha256sum] = "202e6b8b1d5d37506568ace694b0429fe05083b31c74314802cef80a04168adc"

NPM_PKGNAME = "adverb-where"

inherit npmhelper
inherit native
