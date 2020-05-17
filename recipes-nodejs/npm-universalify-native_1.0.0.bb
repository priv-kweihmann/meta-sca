SUMMARY = "NPM: universalify"
DESCRIPTION = "Make a callback- or promise-based function support both promises and callbacks."
HOMEPAGE = "https://github.com/RyanZim/universalify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a734c6ad6e37a515025ac5e8e90ef786"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/universalify/-/universalify-1.0.0.tgz"
SRC_URI[md5sum] = "bf5ede79b3b79cb0a8d4916255bc95cd"
SRC_URI[sha256sum] = "03878b944cbdd419b51f1918fcbe561f224107f4b4a0f7a6f285afa482d03faf"

NPM_PKGNAME = "universalify"

inherit npmhelper
inherit native
