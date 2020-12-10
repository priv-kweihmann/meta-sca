SUMMARY = "NPM: inversify"
DESCRIPTION = "A powerful and lightweight inversion of control container for JavaScript and Node.js apps powered by TypeScript."
HOMEPAGE = "http://inversify.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=305aec93062e1c124bb52446f4f2eaa1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/inversify/-/inversify-5.0.5.tgz"
SRC_URI[md5sum] = "68c34c5259cfb6f75d740c1318d9a786"
SRC_URI[sha256sum] = "a9c8ac7a3211ea46e60d2dd89020827e43870208b97fd20529ce4e620a25af12"

NPM_PKGNAME = "inversify"

inherit npmhelper
inherit native
