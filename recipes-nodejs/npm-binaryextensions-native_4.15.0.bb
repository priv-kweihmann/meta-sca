SUMMARY = "NPM: binaryextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for binary files"
HOMEPAGE = "https://github.com/bevry/binaryextensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=10f8378cf9409df9bd8015af40a24b59"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/binaryextensions/-/binaryextensions-4.15.0.tgz"
SRC_URI[md5sum] = "fb6d212bd9c85634b0ef0ce706aeb5bf"
SRC_URI[sha256sum] = "673fa3c64368bf8b331b4bc928915707d7da61815686b7c22e7844d886ce3c73"

NPM_PKGNAME = "binaryextensions"

inherit npmhelper
inherit native
