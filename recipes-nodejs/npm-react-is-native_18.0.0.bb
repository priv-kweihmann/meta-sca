SUMMARY = "NPM: react-is"
DESCRIPTION = "Brand checking of React Elements."
HOMEPAGE = "https://reactjs.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/react-is/-/react-is-18.0.0.tgz"
SRC_URI[md5sum] = "c224f0261dac46889dcb1dc16bd8fd55"
SRC_URI[sha256sum] = "30b9cef74bba0e1ac659fb3b1003bedcac7a96f212b7eeb1745011c907cc0573"

NPM_PKGNAME = "react-is"

inherit npmhelper
inherit native
