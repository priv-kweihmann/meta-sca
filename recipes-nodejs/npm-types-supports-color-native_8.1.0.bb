SUMMARY = "NPM: @types/supports-color"
DESCRIPTION = "TypeScript definitions for supports-color"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/supports-color/-/supports-color-8.1.0.tgz"
SRC_URI[md5sum] = "0f3f0537239cc6fb27f0b13da4a980b9"
SRC_URI[sha256sum] = "62251e3141f5402aea328e55057d8576222640750dbb36fc315f74b38e615228"

NPM_PKGNAME = "@types/supports-color"

inherit npmhelper
inherit native

S = "${WORKDIR}/supports-color"
