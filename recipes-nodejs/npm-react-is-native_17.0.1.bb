SUMMARY = "NPM: react-is"
DESCRIPTION = "Brand checking of React Elements."
HOMEPAGE = "https://reactjs.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=901f6cd9846257b3a9c69dbd0a49caf1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/react-is/-/react-is-17.0.1.tgz"
SRC_URI[md5sum] = "fb9e339c5c514f29bc84b58dcb59beb0"
SRC_URI[sha256sum] = "3b59c8165232078897ba758ab9e8556acaa6203d9a5da9c7c62e99deb25083fb"

NPM_PKGNAME = "react-is"

inherit npmhelper
inherit native
