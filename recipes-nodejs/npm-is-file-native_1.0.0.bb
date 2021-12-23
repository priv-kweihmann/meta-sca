SUMMARY = "NPM: is-file"
DESCRIPTION = "Tests if a given path resolves to a file."
HOMEPAGE = "https://github.com/jsdevel/node-is-file"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197e48c8ba984fbb8525e009c2e9085d"

SRC_URI = "https://registry.npmjs.org/is-file/-/is-file-1.0.0.tgz"
SRC_URI[md5sum] = "74c91c01af1296084d6bcc28c91addc4"
SRC_URI[sha256sum] = "d046e1b65c6f6e5bfb176d352253f184ef59209537d52b53b85756cef239324a"

NPM_PKGNAME = "is-file"

inherit npmhelper
inherit native
