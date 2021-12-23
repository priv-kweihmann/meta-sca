SUMMARY = "NPM: inversify"
DESCRIPTION = "A powerful and lightweight inversion of control container for JavaScript and Node.js apps powered by TypeScript."
HOMEPAGE = "http://inversify.io"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=305aec93062e1c124bb52446f4f2eaa1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/inversify/-/inversify-6.0.1.tgz"
SRC_URI[md5sum] = "1e9d616ec5cfe7c6c83f9e0a887238b4"
SRC_URI[sha256sum] = "53f8c32287a16580a53b33d755320390e922af5a534eb4a50409ad910198b9ed"

NPM_PKGNAME = "inversify"

inherit npmhelper
inherit native
