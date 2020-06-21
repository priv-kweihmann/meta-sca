SUMMARY = "NPM: ansi-colors"
DESCRIPTION = "Easily add ANSI colors to your text and symbols in the terminal. A faster drop-in replacement for chalk, kleur and turbocolor (without the dependencies and rendering bugs)."
HOMEPAGE = "https://github.com/doowb/ansi-colors"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=442b5b961878bc805832d1d24572f62d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-colors/-/ansi-colors-3.2.4.tgz"
SRC_URI[md5sum] = "247c9c463bf2697a2fb39d327c7f412a"
SRC_URI[sha256sum] = "583e7530e77c4633b0635a9a6117e60cdda81a86e404a397d70ebca510ecea9e"

NPM_PKGNAME = "ansi-colors"

inherit npmhelper
inherit native
