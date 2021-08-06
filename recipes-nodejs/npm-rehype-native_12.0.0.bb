SUMMARY = "NPM: rehype"
DESCRIPTION = "HTML processor powered by plugins part of the unified collective"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=131;endline=132;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-rehype-parse-native \
           npm-rehype-stringify-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype/-/rehype-12.0.0.tgz"
SRC_URI[md5sum] = "a94a9ebf232e74a053ce6262de80dcde"
SRC_URI[sha256sum] = "5a0bb12c9e952f2299a361c2b8a0c6a4ce444b654e2153be95ff732c6b18e969"

NPM_PKGNAME = "rehype"

inherit npmhelper
inherit native
