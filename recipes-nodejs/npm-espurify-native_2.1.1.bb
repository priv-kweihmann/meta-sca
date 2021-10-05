SUMMARY = "NPM: espurify"
DESCRIPTION = "Clone AST without extra properties"
HOMEPAGE = "https://github.com/estools/espurify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=3f318a9f0852f1123446d4492473d031"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/espurify/-/espurify-2.1.1.tgz"
SRC_URI[md5sum] = "07b0b77d5d370f2e1e0700b7b14c123c"
SRC_URI[sha256sum] = "f03d14f2c7e13b210df439006e4127241d28d7e9bc072ec858d82a52abf3522b"

NPM_PKGNAME = "espurify"

inherit npmhelper
inherit native
