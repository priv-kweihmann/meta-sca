SUMMARY = "NPM: ci-info"
DESCRIPTION = "Get details about the current Continuous Integration environment"
HOMEPAGE = "https://github.com/watson/ci-info"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69386bc3e18d6a71ce25b9aa39ecf076"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ci-info/-/ci-info-3.1.1.tgz"
SRC_URI[md5sum] = "d2e7fd4e1111005e218481e0e5b11a3a"
SRC_URI[sha256sum] = "1b4553b4ca6b8c1502aef8491bd11cc105078eee7afef1162d89825b32b62fcc"

NPM_PKGNAME = "ci-info"

inherit npmhelper
inherit native
