SUMMARY = "NPM: kleur"
DESCRIPTION = "The fastest Node.js library for formatting terminal text with ANSI colors~!"
HOMEPAGE = "https://github.com/lukeed/kleur#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/kleur/-/kleur-4.1.3.tgz"
SRC_URI[md5sum] = "53689d22c550079d31568d3972cf54f8"
SRC_URI[sha256sum] = "1a778ce5e40190897c12d2f2825a7665f62f92a4d44b8667212dbe3737d9d62c"

NPM_PKGNAME = "kleur"

inherit npmhelper
inherit native
