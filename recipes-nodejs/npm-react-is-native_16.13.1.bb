SUMMARY = "NPM: react-is"
DESCRIPTION = "Brand checking of React Elements."
HOMEPAGE = "https://reactjs.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1"

SRC_URI = "https://registry.npmjs.org/react-is/-/react-is-16.13.1.tgz"
SRC_URI[md5sum] = "10acfc8e7668e521027f8d5141bc69a4"
SRC_URI[sha256sum] = "0bdbb5d473ddc13e850987f3937666e261b6a3a8fcaffddd8195953ff0faee8f"

NPM_PKGNAME = "react-is"

inherit npmhelper
inherit native
