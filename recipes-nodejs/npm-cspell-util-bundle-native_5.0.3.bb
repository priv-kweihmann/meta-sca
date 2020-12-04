SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.0.3.tgz"
SRC_URI[md5sum] = "17f4f77c23f6356dccd0683e1b102db0"
SRC_URI[sha256sum] = "b7c1eddafd3349aa13e844f5e3e83eda4ddc188e2af3f2414189f4d8c65bf9a3"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
