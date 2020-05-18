SUMMARY = "NPM: cli-boxes"
DESCRIPTION = "Boxes for use in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/cli-boxes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cli-boxes/-/cli-boxes-2.2.0.tgz"
SRC_URI[md5sum] = "e96fc1fdac3649646b6b64c4ee3840bf"
SRC_URI[sha256sum] = "0b4c1050d907aef2833a5c6350945d174eb93576f81d694f9c00eceeb07220a1"

NPM_PKGNAME = "cli-boxes"

inherit npmhelper
inherit native
