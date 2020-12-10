SUMMARY = "NPM: ini"
DESCRIPTION = "An ini encoder/decoder for node"
HOMEPAGE = "https://github.com/isaacs/ini#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ini/-/ini-1.3.7.tgz"
SRC_URI[md5sum] = "3134da00258123b1aab96ea196747d6d"
SRC_URI[sha256sum] = "fd42d994f27d46f4b1dd2312946a4dd66cafa53c760c98545696ee62780f61fa"

NPM_PKGNAME = "ini"

inherit npmhelper
inherit native
