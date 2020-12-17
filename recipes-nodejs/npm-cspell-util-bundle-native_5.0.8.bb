SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.0.8.tgz"
SRC_URI[md5sum] = "b886ab3d9ad9469720443130bcad2ab5"
SRC_URI[sha256sum] = "10090b144bea2722b9f65df1c0cfd247ccb66099881d32c33101a319789501bc"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
