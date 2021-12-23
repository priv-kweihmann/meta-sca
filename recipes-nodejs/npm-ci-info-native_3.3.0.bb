SUMMARY = "NPM: ci-info"
DESCRIPTION = "Get details about the current Continuous Integration environment"
HOMEPAGE = "https://github.com/watson/ci-info"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69386bc3e18d6a71ce25b9aa39ecf076"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ci-info/-/ci-info-3.3.0.tgz"
SRC_URI[md5sum] = "1bb92aa93fca1d981d821214e7afccfc"
SRC_URI[sha256sum] = "c1b4fcf79844dec44204c5b5863866a99ce93f34347775913443581c6a5e844a"

NPM_PKGNAME = "ci-info"

inherit npmhelper
inherit native
