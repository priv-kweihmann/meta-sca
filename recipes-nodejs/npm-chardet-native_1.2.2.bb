SUMMARY = "NPM: chardet"
DESCRIPTION = "Character detector"
HOMEPAGE = "https://github.com/runk/node-chardet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90c339b6009a31625309f490cd17c9e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/chardet/-/chardet-1.2.2.tgz"
SRC_URI[md5sum] = "a4538ea22019b7f24145178761243c90"
SRC_URI[sha256sum] = "b898e50ad37feffa786ed6cc4b4416a5cfeabba2442b191b53085869d6f1ac36"

NPM_PKGNAME = "chardet"

inherit npmhelper
inherit native
