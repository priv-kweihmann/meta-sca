SUMMARY = "NPM: chardet"
DESCRIPTION = "Character detector"
HOMEPAGE = "https://github.com/runk/node-chardet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90c339b6009a31625309f490cd17c9e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chardet/-/chardet-1.1.0.tgz"
SRC_URI[md5sum] = "1a21ba895376441db89a3c823976ad68"
SRC_URI[sha256sum] = "ec422bf284f1001b3990b27c26fe544a5be57e955e16a6cd8a50f28c7f976731"

NPM_PKGNAME = "chardet"

inherit npmhelper
inherit native
