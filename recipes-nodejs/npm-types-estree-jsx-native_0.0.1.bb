SUMMARY = "NPM: @types/estree-jsx"
DESCRIPTION = "TypeScript definitions for JSX extensions to ESTree AST specification"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-estree-native"

SRC_URI = "https://registry.npmjs.org/@types/estree-jsx/-/estree-jsx-0.0.1.tgz"
SRC_URI[md5sum] = "53cf259ea9716378f886a54d7faf52a6"
SRC_URI[sha256sum] = "e5cc42714cb8d3e9788d31718dd5e09a2f2160a11a99818af2a275d5854bf4e2"

NPM_PKGNAME = "@types/estree-jsx"

inherit npmhelper
inherit native

S = "${WORKDIR}/estree-jsx"
