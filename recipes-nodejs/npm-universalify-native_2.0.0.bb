SUMMARY = "NPM: universalify"
DESCRIPTION = "Make a callback- or promise-based function support both promises and callbacks."
HOMEPAGE = "https://github.com/RyanZim/universalify#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a734c6ad6e37a515025ac5e8e90ef786"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/universalify/-/universalify-2.0.0.tgz"
SRC_URI[md5sum] = "d386c5d7655ff29ae78bd929ef268e41"
SRC_URI[sha256sum] = "4714f7a4288d1e673159de14f4781d83972f7d46fd2cdd397b19cd102de64881"

NPM_PKGNAME = "universalify"

inherit npmhelper
inherit native
