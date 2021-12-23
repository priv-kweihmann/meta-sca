SUMMARY = "NPM: react-is"
DESCRIPTION = "Brand checking of React Elements."
HOMEPAGE = "https://reactjs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/react-is/-/react-is-17.0.2.tgz"
SRC_URI[md5sum] = "abf934c1e99ad1a94b1e81522716c3e6"
SRC_URI[sha256sum] = "9b1850c05b4fc08e9b814a201281a103a7651ac46500dce7b6bedd0865963eb1"

NPM_PKGNAME = "react-is"

inherit npmhelper
inherit native
