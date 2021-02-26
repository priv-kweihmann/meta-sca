SUMMARY = "NPM: brace-expansion"
DESCRIPTION = "Brace expansion as known from sh/bash"
HOMEPAGE = "https://github.com/juliangruber/brace-expansion"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec"

DEPENDS = "npm-balanced-match-native"

SRC_URI = "https://registry.npmjs.org/brace-expansion/-/brace-expansion-2.0.1.tgz"
SRC_URI[md5sum] = "f448496b6bfd3121800002601295b6e6"
SRC_URI[sha256sum] = "2464127da41da50df97281c4cdbeeb66b353c8eebd09c35507bb649e66d80141"

NPM_PKGNAME = "brace-expansion"

inherit npmhelper
inherit native
