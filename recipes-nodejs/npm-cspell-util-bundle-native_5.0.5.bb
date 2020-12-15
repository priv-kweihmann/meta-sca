SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.0.5.tgz"
SRC_URI[md5sum] = "7329661c218ff108631d23b276f3fda1"
SRC_URI[sha256sum] = "c34f1a16917b9af449a4d19e80b3acb48bcc945913bb1998903985d0f70e64b3"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
