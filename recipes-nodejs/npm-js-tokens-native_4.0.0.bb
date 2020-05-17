SUMMARY = "NPM: js-tokens"
DESCRIPTION = "A regex that tokenizes JavaScript."
HOMEPAGE = "https://github.com/lydell/js-tokens#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d63bea73a26ffaf5e964ce74d3b83a5"

SRC_URI = "https://registry.npmjs.org/js-tokens/-/js-tokens-4.0.0.tgz"
SRC_URI[md5sum] = "325b11b965688c69ae45a3cf771fbc5c"
SRC_URI[sha256sum] = "d884c7a2d8adb5568c1272d92b4f9c62707f4226cf9e7b22e7b957c7361e3c53"

NPM_PKGNAME = "js-tokens"

inherit npmhelper
inherit native
