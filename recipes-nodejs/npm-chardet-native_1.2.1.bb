SUMMARY = "NPM: chardet"
DESCRIPTION = "Character detector"
HOMEPAGE = "https://github.com/runk/node-chardet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90c339b6009a31625309f490cd17c9e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chardet/-/chardet-1.2.1.tgz"
SRC_URI[md5sum] = "23968439412ee71ab5d72fc1cad1d098"
SRC_URI[sha256sum] = "ec07c36158a4019916e964e2ed5a25f57f2008bfc5ee0873b077e990f58b15df"

NPM_PKGNAME = "chardet"

inherit npmhelper
inherit native
