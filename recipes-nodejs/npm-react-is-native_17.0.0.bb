SUMMARY = "NPM: react-is"
DESCRIPTION = "Brand checking of React Elements."
HOMEPAGE = "https://reactjs.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/react-is/-/react-is-17.0.0.tgz"
SRC_URI[md5sum] = "2c415a70863dc8f2f9f5bfa5bec4cf6d"
SRC_URI[sha256sum] = "fd113fc4323df9c46aeb351c26c31d8358fe5975740776e7bcf917750ac7f979"

NPM_PKGNAME = "react-is"

inherit npmhelper
inherit native
